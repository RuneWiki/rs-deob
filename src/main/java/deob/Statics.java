package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("am.bw")
    public static int field1001;

    @ObfuscatedName("am.gp")
    public static int field1003;

    @ObfuscatedName("am.w")
    public static class168 field1009;

    @ObfuscatedName("aj.h")
    public static int[] field1020;

    @ObfuscatedName("aj.w")
    public static class168 field1025;

    @ObfuscatedName("aj.ip")
    public static class174 field1033;

    @ObfuscatedName("aj.qc")
    public static int field1034;

    @ObfuscatedName("aj.py")
    public static int field1035;

    @ObfuscatedName("aq.w")
    public static class168 field1038;

    @ObfuscatedName("aq.d")
    public static int field1039;

    @ObfuscatedName("aq.a")
    public static class168 field1040;

    @ObfuscatedName("ag.c")
    public static byte[][][] field1054;

    @ObfuscatedName("ag.a")
    public static class168 field1057;

    @ObfuscatedName("ag.aa")
    public static class169 field1058;

    @ObfuscatedName("ap.bb")
    public static class81[] field1067;

    @ObfuscatedName("ap.fc")
    public static int field1070;

    @ObfuscatedName("ap.fi")
    public static int field1071;

    @ObfuscatedName("as.a")
    public static class168 field1089;

    @ObfuscatedName("as.by")
    public static class169 field1090;

    @ObfuscatedName("as.qa")
    public static class134 field1092;

    @ObfuscatedName("as.as")
    public static long field1093;

    @ObfuscatedName("aa.pg")
    public static int field1098;

    @ObfuscatedName("aa.a")
    public static class168 field1102;

    @ObfuscatedName("av.k")
    public static int field1108;

    @ObfuscatedName("aw.k")
    public static boolean field1118;

    @ObfuscatedName("aw.r")
    public static int field1119;

    @ObfuscatedName("aw.e")
    public static class225 field1160;

    @ObfuscatedName("bb.v")
    public static int[] field1169;

    @ObfuscatedName("bb.w")
    public static int field1170;

    @ObfuscatedName("bb.a")
    public static class168 field1174;

    @ObfuscatedName("bg.a")
    public static class54 field1179;

    @ObfuscatedName("bl.k")
    public static class73 field1199;

    @ObfuscatedName("bl.ib")
    public static class174 field1202;

    @ObfuscatedName("bl.av")
    public static class79[] field1205;

    @ObfuscatedName("by.mz")
    public static class25[] field1227;

    @ObfuscatedName("by.fk")
    public static int field1228;

    @ObfuscatedName("by.m")
    public static int field1229;

    @ObfuscatedName("bd.p")
    public static float field1251;

    @ObfuscatedName("bd.q")
    public static int field1252;

    @ObfuscatedName("bt.e")
    public static int[] field1276;

    @ObfuscatedName("bt.m")
    public static int[] field1285;

    @ObfuscatedName("bt.x")
    public static boolean[] field1287;

    @ObfuscatedName("r.me")
    public static byte field129;

    @ObfuscatedName("bq.t")
    public static class69[] field1296;

    @ObfuscatedName("bq.o")
    public static float[] field1301;

    @ObfuscatedName("bq.ay")
    public static int[] field1302;

    @ObfuscatedName("bq.p")
    public static int field1303;

    @ObfuscatedName("bq.q")
    public static int field1304;

    @ObfuscatedName("bq.m")
    public static int field1305;

    @ObfuscatedName("bq.e")
    public static int field1306;

    @ObfuscatedName("bq.x")
    public static class74[] field1307;

    @ObfuscatedName("bq.z")
    public static class68[] field1308;

    @ObfuscatedName("bq.i")
    public static class61[] field1309;

    @ObfuscatedName("bq.r")
    public static byte[] field1310;

    @ObfuscatedName("bq.n")
    public static boolean[] field1311;

    @ObfuscatedName("bq.b")
    public static float[] field1318;

    @ObfuscatedName("bq.l")
    public static float[] field1319;

    @ObfuscatedName("bq.v")
    public static float[] field1321;

    @ObfuscatedName("bq.ar")
    public static float[] field1322;

    @ObfuscatedName("bq.u")
    public static int[] field1323;

    @ObfuscatedName("bq.ah")
    public static float[] field1324;

    @ObfuscatedName("bq.ad")
    public static float[] field1325;

    @ObfuscatedName("bq.af")
    public static int[] field1326;

    @ObfuscatedName("bf.hn")
    public static int field1356;

    @ObfuscatedName("bf.dk")
    public static int[] field1360;

    @ObfuscatedName("bf.t")
    public static int field1362;

    @ObfuscatedName("p.dy")
    public static byte[][] field137;

    @ObfuscatedName("bv.a")
    public static int field1385;

    @ObfuscatedName("bv.w")
    public static int field1386;

    @ObfuscatedName("bv.y")
    public static int[] field1388;

    @ObfuscatedName("bv.q")
    public static byte[][] field1389;

    @ObfuscatedName("bv.c")
    public static int[] field1390;

    @ObfuscatedName("br.r")
    public static int[] field1398;

    @ObfuscatedName("a.ey")
    public static class79[] field14;

    @ObfuscatedName("cu.z")
    public static int[] field1414;

    @ObfuscatedName("cu.t")
    public static int field1415;

    @ObfuscatedName("cu.i")
    public static int field1418;

    @ObfuscatedName("p.ab")
    public static boolean field144;

    @ObfuscatedName("ce.nk")
    public static class75 field1440;

    @ObfuscatedName("cr.t")
    public static int[] field1446;

    @ObfuscatedName("ct.r")
    public static byte[][][] field1464;

    @ObfuscatedName("cp.bu")
    public static int field1467;

    @ObfuscatedName("cp.f")
    public static int field1476;

    @ObfuscatedName("cp.bc")
    public static int field1477;

    @ObfuscatedName("cp.u")
    public static int field1483;

    @ObfuscatedName("cp.g")
    public static int field1484;

    @ObfuscatedName("cp.j")
    public static int field1485;

    @ObfuscatedName("cp.s")
    public static int field1487;

    @ObfuscatedName("cp.l")
    public static int field1490;

    @ObfuscatedName("cp.o")
    public static int field1491;

    @ObfuscatedName("cp.v")
    public static int field1492;

    @ObfuscatedName("cp.ad")
    public static int field1493;

    @ObfuscatedName("cp.ah")
    public static int field1495;

    @ObfuscatedName("cp.h")
    public static int field1496;

    @ObfuscatedName("cp.bi")
    public static int field1499;

    @ObfuscatedName("cp.ay")
    public static int field1513;

    @ObfuscatedName("cp.b")
    public static int field1517;

    @ObfuscatedName("cp.bm")
    public static boolean[][] field1522;

    @ObfuscatedName("cp.bl")
    public static int field1523;

    @ObfuscatedName("cp.bk")
    public static int field1524;

    @ObfuscatedName("cp.by")
    public static int field1526;

    @ObfuscatedName("cp.ar")
    public static int field1528;

    @ObfuscatedName("cs.dz")
    public static int field1539;

    @ObfuscatedName("q.p")
    public static int[] field154;

    @ObfuscatedName("cs.ez")
    public static class79 field1540;

    @ObfuscatedName("cj.i")
    public static class229[] field1559;

    @ObfuscatedName("q.qb")
    public static int field156;

    @ObfuscatedName("cy.e")
    public static boolean field1569;

    @ObfuscatedName("q.bg")
    public static class169 field157;

    @ObfuscatedName("cm.h")
    public static int field1571;

    @ObfuscatedName("cm.s")
    public static int field1572;

    @ObfuscatedName("cm.ar")
    public static class93 field1576;

    @ObfuscatedName("cm.b")
    public static int field1579;

    @ObfuscatedName("cm.e")
    public static int field1581;

    @ObfuscatedName("cm.x")
    public static int field1582;

    @ObfuscatedName("cm.f")
    public static int field1585;

    @ObfuscatedName("cm.o")
    public static int field1586;

    @ObfuscatedName("cm.l")
    public static int field1588;

    @ObfuscatedName("ch.mg")
    public static class79 field1611;

    @ObfuscatedName("cq.nx")
    public static class57 field1628;

    @ObfuscatedName("cq.c")
    public static boolean field1634;

    @ObfuscatedName("ck.qx")
    public static int field1672;

    @ObfuscatedName("cf.qh")
    public static int field1681;

    @ObfuscatedName("cf.av")
    public static class169 field1683;

    @ObfuscatedName("cf.eu")
    public static class81[] field1685;

    @ObfuscatedName("m.dw")
    public static byte[][] field169;

    @ObfuscatedName("m.in")
    public static int field170;

    @ObfuscatedName("e.h")
    public static class120 field172;

    @ObfuscatedName("cl.bk")
    public static class169 field1769;

    @ObfuscatedName("cl.d")
    public static int field1774;

    @ObfuscatedName("di.jr")
    public static int field1783;

    @ObfuscatedName("e.nj")
    public static class56 field179;

    @ObfuscatedName("dr.bh")
    public static int field1810;

    @ObfuscatedName("dr.bb")
    public static int field1846;

    @ObfuscatedName("dr.bg")
    public static int field1848;

    @ObfuscatedName("x.jn")
    public static int field185;

    @ObfuscatedName("dg.do")
    public static int[][] field1860;

    @ObfuscatedName("dg.ql")
    public static Image field1865;

    @ObfuscatedName("dc.ej")
    public static class79[] field1872;

    @ObfuscatedName("dc.pp")
    public static class137 field1875;

    @ObfuscatedName("dc.nd")
    public static int field1876;

    @ObfuscatedName("x.iy")
    public static int field188;

    @ObfuscatedName("x.le")
    public static class131 field190;

    @ObfuscatedName("dm.a")
    public static class168 field1908;

    @ObfuscatedName("z.bq")
    public static String field192;

    @ObfuscatedName("dj.dp")
    public static int[] field1930;

    @ObfuscatedName("z.ng")
    public static int field194;

    @ObfuscatedName("dj.o")
    public static int[] field1948;

    @ObfuscatedName("dh.fx")
    public static int field1959;

    @ObfuscatedName("dk.d")
    public static class168 field1963;

    @ObfuscatedName("dk.k")
    public static class168 field1966;

    @ObfuscatedName("dk.bh")
    public static class169 field1968;

    @ObfuscatedName("dp.w")
    public static long field1971;

    @ObfuscatedName("dp.e")
    public static class81 field1972;

    @ObfuscatedName("dp.a")
    public static long field1973;

    @ObfuscatedName("do.bo")
    public static int field1982;

    @ObfuscatedName("ds.l")
    public static class14 field2009;

    @ObfuscatedName("ds.ri")
    public static boolean field2011;

    @ObfuscatedName("dl.ex")
    public static class79[] field2015;

    @ObfuscatedName("db.a")
    public static class168 field2032;

    @ObfuscatedName("db.i")
    public static class173 field2033;

    @ObfuscatedName("dd.i")
    public static int[] field2036;

    @ObfuscatedName("z.dh")
    public static int[] field204;

    @ObfuscatedName("du.aq")
    public static class147 field2040;

    @ObfuscatedName("du.a")
    public static Applet field2042;

    @ObfuscatedName("du.k")
    public static int[] field2043;

    @ObfuscatedName("dq.eq")
    public static class79[] field2045;

    @ObfuscatedName("dq.cz")
    public static class144 field2048;

    @ObfuscatedName("dt.j")
    public static int field2051;

    @ObfuscatedName("dt.y")
    public static class26[] field2052;

    @ObfuscatedName("dt.c")
    public static class168 field2053;

    @ObfuscatedName("dt.ag")
    public static class144 field2055;

    @ObfuscatedName("dt.a")
    public static class114 field2056;

    @ObfuscatedName("eh.ge")
    public static class174 field2062;

    @ObfuscatedName("eh.o")
    public static int[] field2067;

    @ObfuscatedName("ei.qk")
    public static int field2072;

    @ObfuscatedName("ec.pl")
    public static class135 field2073;

    @ObfuscatedName("ec.e")
    public static int[] field2078;

    @ObfuscatedName("ec.ps")
    public static class9 field2079;

    @ObfuscatedName("eb.bi")
    public static class169 field2083;

    @ObfuscatedName("eb.cx")
    public static class225 field2085;

    @ObfuscatedName("eb.ct")
    public static class147 field2087;

    @ObfuscatedName("eb.w")
    public static File field2091;

    @ObfuscatedName("ek.w")
    public static String field2093;

    @ObfuscatedName("ek.a")
    public static String field2097;

    @ObfuscatedName("i.pf")
    public static int field211;

    @ObfuscatedName("i.x")
    public static class174 field212;

    @ObfuscatedName("er.cs")
    public static char field2129;

    @ObfuscatedName("er.ff")
    public static int field2130;

    @ObfuscatedName("ez.em")
    public static class79[] field2135;

    @ObfuscatedName("eo.ef")
    public static class79[] field2143;

    @ObfuscatedName("eo.mm")
    public static int field2144;

    @ObfuscatedName("ea.gs")
    public static class174 field2151;

    @ObfuscatedName("en.x")
    public static int[] field2171;

    @ObfuscatedName("en.u")
    public static String[] field2174;

    @ObfuscatedName("w.m")
    public static class155 field22;

    @ObfuscatedName("t.ba")
    public static class169 field220;

    @ObfuscatedName("et.di")
    public static int field2205;

    @ObfuscatedName("t.u")
    public static String field221;

    @ObfuscatedName("ef.w")
    public static String field2217;

    @ObfuscatedName("ef.d")
    public static int field2218;

    @ObfuscatedName("t.m")
    public static class81 field222;

    @ObfuscatedName("ef.cf")
    public static class225 field2221;

    @ObfuscatedName("ef.fl")
    public static int field2223;

    @ObfuscatedName("ef.z")
    public static class60 field2224;

    @ObfuscatedName("es.c")
    public static File field2231;

    @ObfuscatedName("es.k")
    public static int field2233;

    @ObfuscatedName("es.y")
    public static File field2234;

    @ObfuscatedName("t.nh")
    public static int field228;

    @ObfuscatedName("ev.am")
    public static int field2288;

    @ObfuscatedName("el.jv")
    public static class174[] field2290;

    @ObfuscatedName("n.ar")
    public static int[] field234;

    @ObfuscatedName("u.nc")
    public static int field237;

    @ObfuscatedName("fi.qo")
    public static Canvas field2586;

    @ObfuscatedName("g.at")
    public static class147 field261;

    @ObfuscatedName("fx.iv")
    public static int field2637;

    @ObfuscatedName("fs.a")
    public static class168 field2640;

    @ObfuscatedName("fs.es")
    public static class81[] field2641;

    @ObfuscatedName("fs.w")
    public static boolean[] field2643;

    @ObfuscatedName("g.r")
    public static short[] field265;

    @ObfuscatedName("fo.y")
    public static class168 field2654;

    @ObfuscatedName("fo.ea")
    public static class81[] field2656;

    @ObfuscatedName("fy.a")
    public static class168 field2659;

    @ObfuscatedName("ft.nu")
    public static int field2666;

    @ObfuscatedName("g.np")
    public static int field267;

    @ObfuscatedName("g.eo")
    public static class79 field269;

    @ObfuscatedName("fg.n")
    public static class120 field2717;

    @ObfuscatedName("fg.a")
    public static class144 field2718;

    @ObfuscatedName("fg.kz")
    public static class20 field2724;

    @ObfuscatedName("fg.z")
    public static boolean field2726;

    @ObfuscatedName("fg.d")
    public static long field2731;

    @ObfuscatedName("fg.cp")
    public static class144 field2736;

    @ObfuscatedName("fw.my")
    public static byte field2745;

    @ObfuscatedName("fa.k")
    public static class168 field2752;

    @ObfuscatedName("j.cn")
    public static int field278;

    @ObfuscatedName("h.bl")
    public static class169 field280;

    @ObfuscatedName("fa.d")
    public static class168 field2803;

    @ObfuscatedName("fa.c")
    public static class168 field2842;

    @ObfuscatedName("fa.a")
    public static class174[][] field2887;

    @ObfuscatedName("fp.et")
    public static class79[] field2896;

    @ObfuscatedName("fz.nt")
    public static int field2904;

    @ObfuscatedName("fz.kh")
    public static int field2905;

    @ObfuscatedName("fh.bp")
    public static class169 field2912;

    @ObfuscatedName("fr.a")
    public static class168 field2919;

    @ObfuscatedName("fq.m")
    public static short[][] field2923;

    @ObfuscatedName("fq.p")
    public static short[][] field2926;

    @ObfuscatedName("fv.bb")
    public static class169 field2944;

    @ObfuscatedName("client.d")
    public static client field295;

    @ObfuscatedName("gg.r")
    public static int field2964;

    @ObfuscatedName("gg.w")
    public static class168 field2965;

    @ObfuscatedName("gg.q")
    public static int field2967;

    @ObfuscatedName("gg.p")
    public static int field2969;

    @ObfuscatedName("gg.a")
    public static class168 field2970;

    @ObfuscatedName("gg.d")
    public static class168 field2971;

    @ObfuscatedName("gg.x")
    public static class181 field2972;

    @ObfuscatedName("gg.ir")
    public static class31 field2973;

    @ObfuscatedName("gg.c")
    public static class185 field2974;

    @ObfuscatedName("client.p")
    public static class154 field299;

    @ObfuscatedName("gq.q")
    public static short[] field3019;

    @ObfuscatedName("gj.y")
    public static class168 field3059;

    @ObfuscatedName("gu.qq")
    public static int field3077;

    @ObfuscatedName("hw.q")
    public static int[][] field3127;

    @ObfuscatedName("hj.s")
    public static String field3136;

    @ObfuscatedName("hh.bu")
    public static class169 field3138;

    @ObfuscatedName("hg.a")
    public static class168 field3169;

    @ObfuscatedName("hl.d")
    public static class168 field3183;

    @ObfuscatedName("hy.m")
    public static class81[] field3194;

    @ObfuscatedName("ht.ia")
    public static int field3213;

    @ObfuscatedName("ht.w")
    public static class168 field3215;

    @ObfuscatedName("hs.y")
    public static int field3218;

    @ObfuscatedName("client.bs")
    public static int field333;

    @ObfuscatedName("client.e")
    public static class213 field552;

    @ObfuscatedName("client.no")
    public static class57 field578;

    @ObfuscatedName("s.pt")
    public static class161 field580;

    @ObfuscatedName("f.n")
    public static String[] field589;

    @ObfuscatedName("f.bd")
    public static class169 field592;

    @ObfuscatedName("d.hs")
    public static int field60;

    @ObfuscatedName("d.kp")
    public static class132 field61;

    @ObfuscatedName("l.g")
    public static int field612;

    @ObfuscatedName("d.nm")
    public static int field62;

    @ObfuscatedName("l.bf")
    public static FontMetrics field626;

    @ObfuscatedName("l.f")
    public static String field627;

    @ObfuscatedName("o.ra")
    public static String field629;

    @ObfuscatedName("o.y")
    public static int field636;

    @ObfuscatedName("v.m")
    public static class19 field646;

    @ObfuscatedName("v.aj")
    public static String field654;

    @ObfuscatedName("v.ph")
    public static class222 field657;

    @ObfuscatedName("c.gf")
    public static class174 field66;

    @ObfuscatedName("ad.fd")
    public static int field674;

    @ObfuscatedName("ad.ad")
    public static int[] field677;

    @ObfuscatedName("c.dr")
    public static int field68;

    @ObfuscatedName("ar.bj")
    public static int field681;

    @ObfuscatedName("ar.px")
    public static GarbageCollectorMXBean field686;

    @ObfuscatedName("ah.aw")
    public static class81[] field689;

    @ObfuscatedName("ah.nl")
    public static int field693;

    @ObfuscatedName("ah.ny")
    public static int field694;

    @ObfuscatedName("ah.dc")
    public static int field695;

    @ObfuscatedName("ah.qu")
    public static class78 field696;

    @ObfuscatedName("c.hq")
    public static int field70;

    @ObfuscatedName("ay.s")
    public static int[] field700;

    @ObfuscatedName("ay.qm")
    public static Font field709;

    @ObfuscatedName("ay.aw")
    public static class169 field710;

    @ObfuscatedName("af.dg")
    public static int field711;

    @ObfuscatedName("af.p")
    public static class81 field716;

    @ObfuscatedName("af.pc")
    public static short[] field717;

    @ObfuscatedName("af.dx")
    public static class87 field718;

    @ObfuscatedName("af.pu")
    public static long field719;

    @ObfuscatedName("af.qv")
    public static int field720;

    @ObfuscatedName("al.c")
    public static class81 field726;

    @ObfuscatedName("al.k")
    public static class79 field728;

    @ObfuscatedName("al.r")
    public static class79 field729;

    @ObfuscatedName("al.q")
    public static class81[] field730;

    @ObfuscatedName("al.f")
    public static int[] field733;

    @ObfuscatedName("al.a")
    public static boolean field737;

    @ObfuscatedName("al.y")
    public static class81[] field742;

    @ObfuscatedName("al.d")
    public static class81 field748;

    @ObfuscatedName("al.bh")
    public static class81[] field755;

    @ObfuscatedName("y.en")
    public static class79[] field76;

    @ObfuscatedName("ai.qs")
    public static Frame field761;

    @ObfuscatedName("y.e")
    public static class174 field77;

    @ObfuscatedName("ai.h")
    public static String field774;

    @ObfuscatedName("an.n")
    public static String field777;

    @ObfuscatedName("y.t")
    public static int[][][] field78;

    @ObfuscatedName("an.cw")
    public static class225 field782;

    @ObfuscatedName("az.db")
    public static int field786;

    @ObfuscatedName("az.j")
    public static int[] field787;

    @ObfuscatedName("ac.pe")
    public static Clipboard field794;

    @ObfuscatedName("ao.d")
    public static int[] field803;

    @ObfuscatedName("ao.c")
    public static String[] field807;

    @ObfuscatedName("ao.bc")
    public static class169 field815;

    @ObfuscatedName("k.y")
    public static byte[][][] field85;

    @ObfuscatedName("k.k")
    public static byte[][][] field86;

    @ObfuscatedName("k.m")
    public static int[] field87;

    @ObfuscatedName("ax.qj")
    public static int field877;

    @ObfuscatedName("at.bm")
    public static class169 field885;

    @ObfuscatedName("ab.a")
    public static class168 field893;

    @ObfuscatedName("ab.w")
    public static class168 field895;

    @ObfuscatedName("ab.bg")
    public static class81 field924;

    @ObfuscatedName("ae.iw")
    public static int field932;

    @ObfuscatedName("k.hw")
    public static class3 field94;

    @ObfuscatedName("k.z")
    public static int[] field96;

    @ObfuscatedName("ae.d")
    public static int field974;

    @ObfuscatedName("au.p")
    public static byte[][][] field986;

    @ObfuscatedName("am.hf")
    public static int field997;

    @ObfuscatedName("ct.a(Ljava/lang/CharSequence;I)Ljava/lang/String;")
    public static String method1870(CharSequence arg0) {
        int var1 = arg0.length();
        StringBuilder var2 = new StringBuilder(var1);
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (!(var4 < 'a' || var4 > 'z') || !(var4 < 'A' || var4 > 'Z') || !(var4 < '0' || var4 > '9') || var4 == '.' || var4 == '-' || var4 == '*' || var4 == '_') {
                var2.append(var4);
            } else if (var4 == ' ') {
                var2.append('+');
            } else {
                byte var5 = class166.method1114(var4);
                var2.append('%');
                int var6 = var5 >> 4 & 0xF;
                if (var6 >= 10) {
                    var2.append((char) (var6 + 55));
                } else {
                    var2.append((char) (var6 + 48));
                }
                int var7 = var5 & 0xF;
                if (var7 >= 10) {
                    var2.append((char) (var7 + 55));
                } else {
                    var2.append((char) (var7 + 48));
                }
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("r.a(Ljava/awt/Component;I)V")
    public static void method123(Component arg0) {
        arg0.addMouseListener(class141.field2146);
        arg0.addMouseMotionListener(class141.field2146);
        arg0.addFocusListener(class141.field2146);
    }

    @ObfuscatedName("client.w(Ljava/lang/Throwable;Ljava/lang/String;)Lef;")
    public static class149 method625(Throwable arg0, String arg1) {
        class149 var2;
        if (arg0 instanceof class149) {
            var2 = (class149) arg0;
            var2.field2226 = var2.field2226 + ' ' + arg1;
        } else {
            var2 = new class149(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("el.a(Ljava/awt/Component;Lft;Lft;ZII)V")
    public static void method3051(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!field737) {
            class32.field727 = arg4;
            class80.method1781();
            byte[] var5 = arg1.method3176("title.jpg", "");
            field728 = new class79(var5, arg0);
            field729 = field728.method1674();
            if ((client.field432 & 0x20000000) == 0) {
                field716 = class77.method131(arg2, "logo", "");
            } else {
                field716 = class77.method131(arg2, "logo_deadman_mode", "");
            }
            field748 = class77.method131(arg2, "titlebox", "");
            field726 = class77.method131(arg2, "titlebutton", "");
            field742 = class77.method1869(arg2, "runes", "");
            field730 = class77.method1869(arg2, "title_mute", "");
            field222 = class77.method131(arg2, "options_radio_buttons,0", "");
            field1972 = class77.method131(arg2, "options_radio_buttons,2", "");
            field1020 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                field1020[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                field1020[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                field1020[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                field1020[var9 + 192] = 16777215;
            }
            field700 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                field700[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                field700[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                field700[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                field700[var13 + 192] = 16777215;
            }
            field733 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                field733[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                field733[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                field733[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                field733[var17 + 192] = 16777215;
            }
            field787 = new int[256];
            field1948 = new int[32768];
            field1169 = new int[32768];
            class32.method762((class81) null);
            field677 = new int[32768];
            field234 = new int[32768];
            if (arg3) {
                class32.field750 = "";
                class32.field741 = "";
            }
            field2288 = 0;
            field654 = "";
            class32.field736 = true;
            class32.field749 = false;
            if (field2079.field155) {
                class184.method3241(2);
            } else {
                class184.method637(2, field885, "scape main", "", 255, false);
            }
            class172.method832(false);
            field737 = true;
            class32.field724 = (field877 - client.field439 * 765) / 2;
            class32.field731 = class32.field724 + 202;
            field728.method1684(class32.field724, 0);
            field729.method1684(class32.field724 + 382, 0);
            field716.method1850(class32.field724 + 382 - field716.field1420 / 2, 18);
        } else if (arg4 == 4) {
            class32.field727 = 4;
        }
    }

    @ObfuscatedName("bw.q(I)Lcg;")
    public static class81 method1599() {
        class81 var0 = new class81();
        var0.field1426 = field1386;
        var0.field1427 = field1774;
        var0.field1422 = field1390[0];
        var0.field1425 = field1388[0];
        var0.field1420 = field2043[0];
        var0.field1421 = field1398[0];
        var0.field1424 = field154;
        var0.field1423 = field1389[0];
        class77.method198();
        return var0;
    }

    @ObfuscatedName("aj.a(Lft;Lft;Lft;Lft;B)V")
    public static void method973(class168 arg0, class168 arg1, class168 arg2, class168 arg3) {
        field2803 = arg0;
        field2842 = arg1;
        field3059 = arg2;
        field2752 = arg3;
        field2887 = new class174[field2803.method3196()][];
        field2643 = new boolean[field2803.method3196()];
    }

    @ObfuscatedName("cy.w(IILdc;Lde;I)Z")
    public static final boolean method2036(int arg0, int arg1, class108 arg2, class109 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        class107.field1861[var6][var7] = 99;
        class107.field1863[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        class107.field1867[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        class107.field1864[var10001] = arg1;
        int[][] var12 = arg3.field1897;
        while (var18 != var11) {
            var4 = class107.field1867[var11];
            var5 = class107.field1864[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1893;
            int var16 = var5 - arg3.field1894;
            if (arg2.method164(1, var4, var5, arg3)) {
                field636 = var4;
                field1108 = var5;
                return true;
            }
            int var17 = class107.field1863[var13][var14] + 1;
            if (var13 > 0 && class107.field1861[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                class107.field1867[var18] = var4 - 1;
                class107.field1864[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13 - 1][var14] = 2;
                class107.field1863[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && class107.field1861[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                class107.field1867[var18] = var4 + 1;
                class107.field1864[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13 + 1][var14] = 8;
                class107.field1863[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && class107.field1861[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class107.field1867[var18] = var4;
                class107.field1864[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13][var14 - 1] = 1;
                class107.field1863[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && class107.field1861[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class107.field1867[var18] = var4;
                class107.field1864[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13][var14 + 1] = 4;
                class107.field1863[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && class107.field1861[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class107.field1867[var18] = var4 - 1;
                class107.field1864[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13 - 1][var14 - 1] = 3;
                class107.field1863[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && class107.field1861[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class107.field1867[var18] = var4 + 1;
                class107.field1864[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13 + 1][var14 - 1] = 9;
                class107.field1863[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && class107.field1861[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class107.field1867[var18] = var4 - 1;
                class107.field1864[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13 - 1][var14 + 1] = 6;
                class107.field1863[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && class107.field1861[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class107.field1867[var18] = var4 + 1;
                class107.field1864[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class107.field1861[var13 + 1][var14 + 1] = 12;
                class107.field1863[var13 + 1][var14 + 1] = var17;
            }
        }
        field636 = var4;
        field1108 = var5;
        return false;
    }

    @ObfuscatedName("fn.s(S)V")
    public static final void method3124() {
        if (client.field314 > 1) {
            client.field314--;
        }
        if (client.field402 > 0) {
            client.field402--;
        }
        if (client.field350) {
            client.field350 = false;
            client.method3573();
            return;
        }
        if (!client.field434) {
            client.field440[0] = class158.field2538;
            client.field441[0] = "";
            client.field438[0] = 1006;
            client.field435 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (field2048 == null) {
                var1 = false;
            } else {
                label2531: {
                    try {
                        int var2 = field2048.method2929();
                        if (var2 == 0) {
                            var1 = false;
                            break label2531;
                        }
                        if (client.field395 == -1) {
                            field2048.method2930(client.field442.field1994, 0, 1);
                            client.field442.field1993 = 0;
                            client.field395 = client.field442.method2714();
                            client.field342 = class189.field3058[client.field395];
                            var2--;
                        }
                        if (client.field342 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2531;
                            }
                            field2048.method2930(client.field442.field1994, 0, 1);
                            client.field342 = client.field442.field1994[0] & 0xFF;
                            var2--;
                        }
                        if (client.field342 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2531;
                            }
                            field2048.method2930(client.field442.field1994, 0, 2);
                            client.field442.field1993 = 0;
                            client.field342 = client.field442.method2464();
                            var2 -= 2;
                        }
                        if (var2 < client.field342) {
                            var1 = false;
                            break label2531;
                        }
                        client.field442.field1993 = 0;
                        field2048.method2930(client.field442.field1994, 0, client.field342);
                        client.field372 = 0;
                        client.field437 = client.field577;
                        client.field577 = client.field472;
                        client.field472 = client.field395;
                        if (client.field395 == 137) {
                            int var3 = client.field442.method2446();
                            int var4 = client.field442.method2505();
                            class174 var5 = class174.method636(var4);
                            if (var5.field2802 != 2 || var5.field2870 != var3) {
                                var5.field2802 = 2;
                                var5.field2870 = var3;
                                client.method652(var5);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 254) {
                            String var6 = client.field442.method2470();
                            int var7 = client.field442.method2467();
                            class174 var8 = class174.method636(var7);
                            if (!var6.equals(var8.field2770)) {
                                var8.field2770 = var6;
                                client.method652(var8);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 47) {
                            client.method849();
                            int var9 = client.field442.method2490();
                            int var10 = client.field442.method2488();
                            int var11 = client.field442.method2506();
                            client.field480[var10] = var11;
                            client.field430[var10] = var9;
                            client.field431[var10] = 1;
                            for (int var12 = 0; var12 < 98; var12++) {
                                if (var11 >= class156.field2291[var12]) {
                                    client.field431[var10] = var12 + 2;
                                }
                            }
                            client.field484[++client.field485 - 1 & 0x1F] = var10;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 255) {
                            client.method140();
                            client.field395 = -1;
                            var1 = false;
                            break label2531;
                        }
                        if (client.field395 == 198) {
                            client.method160(true);
                            client.field442.method2714();
                            int var13 = client.field442.method2464();
                            class123 var14 = client.field442;
                            int var15 = var14.field1993;
                            class33.field770 = 0;
                            class33.method1664(var14);
                            class33.method45(var14);
                            if (var14.field1993 - var15 != var13) {
                                throw new RuntimeException(var14.field1993 - var15 + " " + var13);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 61) {
                            client.method3123(true);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 190) {
                            client.field529 = client.field442.method2462();
                            if (client.field529 == 255) {
                                client.field529 = 0;
                            }
                            client.field348 = client.field442.method2462();
                            if (client.field348 == 255) {
                                client.field348 = 0;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 128) {
                            int var16 = client.field442.method2464();
                            client.field453 = var16;
                            client.method1063(false);
                            client.method1057(var16);
                            class37.method3810(client.field453);
                            for (int var17 = 0; var17 < 100; var17++) {
                                client.field324[var17] = true;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 180) {
                            int var18 = client.field442.method2505();
                            int var19 = client.field442.method2462();
                            int var20 = client.field442.method2464();
                            class4 var21 = (class4) client.field454.method3607((long) var18);
                            if (var21 != null) {
                                client.method766(var21, var21.field71 != var20);
                            }
                            client.method2879(var18, var20, var19);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 22) {
                            int var22 = client.field442.method2462();
                            class131[] var23 = class131.method2143();
                            int var24 = 0;
                            class131 var26;
                            while (true) {
                                if (var24 >= var23.length) {
                                    var26 = null;
                                    break;
                                }
                                class131 var25 = var23[var24];
                                if (var25.field2063 == var22) {
                                    var26 = var25;
                                    break;
                                }
                                var24++;
                            }
                            field190 = var26;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 44) {
                            field786 = client.field442.method2462();
                            field1539 = client.field442.method2488();
                            for (int var27 = field1539; var27 < field1539 + 8; var27++) {
                                for (int var28 = field786; var28 < field786 + 8; var28++) {
                                    if (client.field426[field1003][var27][var28] != null) {
                                        client.field426[field1003][var27][var28] = null;
                                        client.method2789(var27, var28);
                                    }
                                }
                            }
                            for (class17 var29 = (class17) client.field427.method3665(); var29 != null; var29 = (class17) client.field427.method3641()) {
                                if (var29.field239 >= field1539 && var29.field239 < field1539 + 8 && var29.field244 >= field786 && var29.field244 < field786 + 8 && field1003 == var29.field243) {
                                    var29.field248 = 0;
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 110) {
                            client.field314 = client.field442.method2446() * 30;
                            client.field343 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 95) {
                            String var30 = client.field442.method2470();
                            long var31 = client.field442.method2468();
                            long var33 = (long) client.field442.method2464();
                            long var35 = (long) client.field442.method2466();
                            class153[] var37 = new class153[] { class153.field2262, class153.field2269, class153.field2263, class153.field2264, class153.field2266 };
                            class153 var38 = (class153) class110.method2766(var37, client.field442.method2462());
                            long var39 = (var33 << 32) + var35;
                            boolean var41 = false;
                            for (int var42 = 0; var42 < 100; var42++) {
                                if (client.field500[var42] == var39) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (var38.field2260 && client.method789(var30)) {
                                var41 = true;
                            }
                            if (!var41 && client.field367 == 0) {
                                client.field500[client.field516] = var39;
                                client.field516 = (client.field516 + 1) % 100;
                                String var43 = class224.method3854(class164.method15(class223.method2790(client.field442)));
                                if (var38.field2261 == -1) {
                                    class12.method877(9, var30, var43, class163.method3563(var31));
                                } else {
                                    int var44 = var38.field2261;
                                    String var45 = "<img=" + var44 + ">";
                                    class12.method877(9, var45 + var30, var43, class163.method3563(var31));
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 135) {
                            client.field563 = 1;
                            client.field487 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 159) {
                            String var46 = client.field442.method2470();
                            String var47 = class224.method3854(class164.method15(class223.method2790(client.field442)));
                            class12.method2783(6, var46, var47);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 182) {
                            int var48 = client.field442.method2467();
                            class4 var49 = (class4) client.field454.method3607((long) var48);
                            if (var49 != null) {
                                client.method766(var49, true);
                            }
                            if (client.field527 != null) {
                                client.method652(client.field527);
                                client.field527 = null;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 191) {
                            int var50 = client.field442.method2505();
                            int var51 = client.field442.method2467();
                            int var52 = client.field442.method2497();
                            if (var52 == 65535) {
                                var52 = -1;
                            }
                            class174 var53 = class174.method636(var51);
                            if (var53.field2758) {
                                var53.field2879 = var52;
                                var53.field2767 = var50;
                                class52 var55 = class52.method176(var52);
                                var53.field2801 = var55.field1132;
                                var53.field2811 = var55.field1133;
                                var53.field2812 = var55.field1122;
                                var53.field2761 = var55.field1135;
                                var53.field2809 = var55.field1115;
                                var53.field2813 = var55.field1149;
                                if (var55.field1137 == 1) {
                                    var53.field2817 = 1;
                                } else {
                                    var53.field2817 = 2;
                                }
                                if (var53.field2814 > 0) {
                                    var53.field2813 = var53.field2813 * 32 / var53.field2814;
                                } else if (var53.field2828 > 0) {
                                    var53.field2813 = var53.field2813 * 32 / var53.field2828;
                                }
                                client.method652(var53);
                            } else {
                                if (var52 == -1) {
                                    var53.field2802 = 0;
                                    client.field395 = -1;
                                    var1 = true;
                                    break label2531;
                                }
                                class52 var54 = class52.method176(var52);
                                var53.field2802 = 4;
                                var53.field2870 = var52;
                                var53.field2801 = var54.field1132;
                                var53.field2811 = var54.field1133;
                                var53.field2813 = var54.field1149 * 100 / var50;
                                client.method652(var53);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 127) {
                            int var56 = client.field442.method2467();
                            class174 var57 = class174.method636(var56);
                            var57.field2802 = 3;
                            var57.field2870 = field94.field34.method3346();
                            client.method652(var57);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 78) {
                            int var58 = client.field442.method2467();
                            int var59 = client.field442.method2464();
                            if (var58 < -70000) {
                                var59 += 32768;
                            }
                            class174 var60;
                            if (var58 >= 0) {
                                var60 = class174.method636(var58);
                            } else {
                                var60 = null;
                            }
                            if (var60 != null) {
                                for (int var61 = 0; var61 < var60.field2877.length; var61++) {
                                    var60.field2877[var61] = 0;
                                    var60.field2878[var61] = 0;
                                }
                            }
                            class16 var62 = (class16) class16.field231.method3607((long) var59);
                            if (var62 != null) {
                                for (int var63 = 0; var63 < var62.field230.length; var63++) {
                                    var62.field230[var63] = -1;
                                    var62.field235[var63] = 0;
                                }
                            }
                            int var64 = client.field442.method2464();
                            for (int var65 = 0; var65 < var64; var65++) {
                                int var66 = client.field442.method2497();
                                int var67 = client.field442.method2462();
                                if (var67 == 255) {
                                    var67 = client.field442.method2595();
                                }
                                if (var60 != null && var65 < var60.field2877.length) {
                                    var60.field2877[var65] = var66;
                                    var60.field2878[var65] = var67;
                                }
                                class16.method989(var59, var65, var66 - 1, var67);
                            }
                            if (var60 != null) {
                                client.method652(var60);
                            }
                            client.method849();
                            client.field482[++client.field483 - 1 & 0x1F] = var59 & 0x7FFF;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 27) {
                            int var68 = client.field442.method2464();
                            int var69 = client.field442.method2462();
                            int var70 = client.field442.method2464();
                            client.method2328(var68, var69, var70);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 83) {
                            String var71 = client.field442.method2470();
                            int var72 = client.field442.method2464();
                            byte var73 = client.field442.method2548();
                            boolean var74 = false;
                            if (var73 == -128) {
                                var74 = true;
                            }
                            if (var74) {
                                if (field2144 == 0) {
                                    client.field395 = -1;
                                    var1 = true;
                                    break label2531;
                                }
                                boolean var75 = false;
                                int var76;
                                for (var76 = 0; var76 < field2144 && (!field1227[var76].field638.equals(var71) || field1227[var76].field634 != var72); var76++) {
                                }
                                if (var76 < field2144) {
                                    while (var76 < field2144 - 1) {
                                        field1227[var76] = field1227[var76 + 1];
                                        var76++;
                                    }
                                    field2144--;
                                    field1227[field2144] = null;
                                }
                            } else {
                                client.field442.method2470();
                                class25 var77 = new class25();
                                var77.field638 = var71;
                                var77.field631 = class165.method667(var77.field638, field552);
                                var77.field634 = var72;
                                var77.field632 = var73;
                                int var78;
                                for (var78 = field2144 - 1; var78 >= 0; var78--) {
                                    int var79 = field1227[var78].field631.compareTo(var77.field631);
                                    if (var79 == 0) {
                                        field1227[var78].field634 = var72;
                                        field1227[var78].field632 = var73;
                                        if (var71.equals(field94.field59)) {
                                            field129 = var73;
                                        }
                                        client.field488 = client.field478;
                                        client.field395 = -1;
                                        var1 = true;
                                        break label2531;
                                    }
                                    if (var79 < 0) {
                                        break;
                                    }
                                }
                                if (field2144 >= field1227.length) {
                                    client.field395 = -1;
                                    var1 = true;
                                    break label2531;
                                }
                                for (int var80 = field2144 - 1; var80 > var78; var80--) {
                                    field1227[var80 + 1] = field1227[var80];
                                }
                                if (field2144 == 0) {
                                    field1227 = new class25[100];
                                }
                                field1227[var78 + 1] = var77;
                                field2144++;
                                if (var71.equals(field94.field59)) {
                                    field129 = var73;
                                }
                            }
                            client.field488 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 210) {
                            for (int var81 = 0; var81 < field1170; var81++) {
                                class53 var82 = class53.method987(var81);
                                if (var82 != null) {
                                    class177.field2907[var81] = 0;
                                    class177.field2906[var81] = 0;
                                }
                            }
                            client.method849();
                            client.field481 += 32;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 76) {
                            byte var83 = client.field442.method2492();
                            int var84 = client.field442.method2464();
                            class177.field2907[var84] = var83;
                            if (class177.field2906[var84] != var83) {
                                class177.field2906[var84] = var83;
                            }
                            client.method3(var84);
                            client.field490[++client.field481 - 1 & 0x1F] = var84;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 116) {
                            client.field315 = client.field442.method2462();
                            if (client.field315 == 1) {
                                client.field316 = client.field442.method2464();
                            }
                            if (client.field315 >= 2 && client.field315 <= 6) {
                                if (client.field315 == 2) {
                                    client.field321 = 64;
                                    client.field322 = 64;
                                }
                                if (client.field315 == 3) {
                                    client.field321 = 0;
                                    client.field322 = 64;
                                }
                                if (client.field315 == 4) {
                                    client.field321 = 128;
                                    client.field322 = 64;
                                }
                                if (client.field315 == 5) {
                                    client.field321 = 64;
                                    client.field322 = 0;
                                }
                                if (client.field315 == 6) {
                                    client.field321 = 64;
                                    client.field322 = 128;
                                }
                                client.field315 = 2;
                                client.field392 = client.field442.method2464();
                                client.field319 = client.field442.method2464();
                                client.field320 = client.field442.method2462();
                            }
                            if (client.field315 == 10) {
                                client.field317 = client.field442.method2464();
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 11) {
                            int var85 = client.field442.method2499();
                            int var86 = client.field442.method2498();
                            int var87 = client.field442.method2595();
                            class174 var88 = class174.method636(var87);
                            if (var88.field2754 != var85 || var88.field2769 != var86 || var88.field2764 != 0 || var88.field2850 != 0) {
                                var88.field2754 = var85;
                                var88.field2769 = var86;
                                var88.field2764 = 0;
                                var88.field2850 = 0;
                                client.method652(var88);
                                client.method2136(var88);
                                if (var88.field2825 == 0) {
                                    client.method197(field2887[var87 >> 16], var88, false);
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 142) {
                            client.field543 = false;
                            for (int var89 = 0; var89 < 5; var89++) {
                                client.field544[var89] = false;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 211) {
                            class33.field772 = 0;
                            for (int var90 = 0; var90 < 2048; var90++) {
                                class33.field762[var90] = null;
                                class33.field773[var90] = 1;
                            }
                            for (int var91 = 0; var91 < 2048; var91++) {
                                client.field551[var91] = null;
                            }
                            class33.method3304(client.field442);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 9) {
                            String var92 = client.field442.method2470();
                            Object[] var93 = new Object[var92.length() + 1];
                            for (int var94 = var92.length() - 1; var94 >= 0; var94--) {
                                if (var92.charAt(var94) == 's') {
                                    var93[var94 + 1] = client.field442.method2470();
                                } else {
                                    var93[var94 + 1] = Integer.valueOf(client.field442.method2467());
                                }
                            }
                            var93[0] = Integer.valueOf(client.field442.method2467());
                            class1 var95 = new class1();
                            var95.field5 = var93;
                            class37.method3232(var95, 200000);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 109) {
                            int var96 = client.field442.method2505();
                            int var97 = client.field442.method2497();
                            class174 var98 = class174.method636(var96);
                            if (var98.field2802 != 1 || var98.field2870 != var97) {
                                var98.field2802 = 1;
                                var98.field2870 = var97;
                                client.method652(var98);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 52) {
                            class123 var99 = client.field442;
                            int var100 = client.field342;
                            int var101 = var99.field1993;
                            class33.field770 = 0;
                            class33.method1664(var99);
                            class33.method45(var99);
                            if (var99.field1993 - var101 != var100) {
                                throw new RuntimeException(var99.field1993 - var101 + " " + var100);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 57) {
                            int var102 = client.field442.method2446();
                            int var103 = client.field442.method2595();
                            class174 var104 = class174.method636(var103);
                            if (var104 != null && var104.field2825 == 0) {
                                if (var102 > var104.field2766 - var104.field2775) {
                                    var102 = var104.field2766 - var104.field2775;
                                }
                                if (var102 < 0) {
                                    var102 = 0;
                                }
                                if (var104.field2781 != var102) {
                                    var104.field2781 = var102;
                                    client.method652(var104);
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 84) {
                            int var105 = client.field442.method2661();
                            boolean var106 = client.field442.method2462() == 1;
                            String var107 = "";
                            boolean var108 = false;
                            if (var106) {
                                var107 = client.field442.method2470();
                                if (client.method789(var107)) {
                                    var108 = true;
                                }
                            }
                            String var109 = client.field442.method2470();
                            if (!var108) {
                                class12.method2783(var105, var107, var109);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 202 || client.field395 == 73 || client.field395 == 65 || client.field395 == 252 || client.field395 == 214 || client.field395 == 74 || client.field395 == 81 || client.field395 == 228 || client.field395 == 136 || client.field395 == 185) {
                            client.method2750();
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 243) {
                            int var110 = client.field442.method2464();
                            if (var110 == 65535) {
                                var110 = -1;
                            }
                            if (var110 == -1 && !client.field300) {
                                class184.method161();
                            } else if (var110 != -1 && client.field533 != var110 && client.field532 != 0 && !client.field300) {
                                class184.method3315(2, field885, var110, 0, client.field532, false);
                            }
                            client.field533 = var110;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 87) {
                            int var111 = client.field442.method2480();
                            if (var111 == 65535) {
                                var111 = -1;
                            }
                            int var112 = client.field442.method2601();
                            if (client.field532 != 0 && var111 != -1) {
                                class184.method2976(field815, var111, 0, client.field532, false);
                                client.field300 = true;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 43) {
                            client.method849();
                            client.field492 = client.field442.method2462();
                            client.field343 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 195) {
                            int var113 = client.field442.method2467();
                            int var114 = client.field442.method2467();
                            if (field686 == null || !field686.isValid()) {
                                try {
                                    Iterator var115 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var115.hasNext()) {
                                        GarbageCollectorMXBean var116 = (GarbageCollectorMXBean) var115.next();
                                        if (var116.isValid()) {
                                            field686 = var116;
                                            client.field573 = -1L;
                                            client.field491 = -1L;
                                        }
                                    }
                                } catch (Throwable var360) {
                                }
                            }
                            long var118 = class116.method2781();
                            int var120 = -1;
                            if (field686 != null) {
                                long var121 = field686.getCollectionTime();
                                if (client.field491 != -1L) {
                                    long var123 = var121 - client.field491;
                                    long var125 = var118 - client.field573;
                                    if (var125 != 0L) {
                                        var120 = (int) (var123 * 100L / var125);
                                    }
                                }
                                client.field491 = var121;
                                client.field573 = var118;
                            }
                            client.field339.method2722(145);
                            client.field339.method2635(var113);
                            client.field339.method2504(var114);
                            client.field339.method2452(client.field2186);
                            client.field339.method2452(var120);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 200) {
                            int var127 = client.field442.method2595();
                            int var128 = client.field442.method2464();
                            class177.field2907[var128] = var127;
                            if (class177.field2906[var128] != var127) {
                                class177.field2906[var128] = var127;
                            }
                            client.method3(var128);
                            client.field490[++client.field481 - 1 & 0x1F] = var128;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 64) {
                            int var129 = client.field342 + client.field442.field1993;
                            int var130 = client.field442.method2464();
                            int var131 = client.field442.method2464();
                            if (client.field453 != var130) {
                                client.field453 = var130;
                                client.method1063(false);
                                client.method1057(client.field453);
                                class37.method3810(client.field453);
                                for (int var132 = 0; var132 < 100; var132++) {
                                    client.field324[var132] = true;
                                }
                            }
                            while (var131-- > 0) {
                                int var133 = client.field442.method2467();
                                int var134 = client.field442.method2464();
                                int var135 = client.field442.method2462();
                                class4 var136 = (class4) client.field454.method3607((long) var133);
                                if (var136 != null && var136.field71 != var134) {
                                    client.method766(var136, true);
                                    var136 = null;
                                }
                                if (var136 == null) {
                                    var136 = client.method2879(var133, var134, var135);
                                }
                                var136.field67 = true;
                            }
                            for (class4 var137 = (class4) client.field454.method3610(); var137 != null; var137 = (class4) client.field454.method3606()) {
                                if (var137.field67) {
                                    var137.field67 = false;
                                } else {
                                    client.method766(var137, true);
                                }
                            }
                            client.field496 = new class197(512);
                            while (client.field442.field1993 < var129) {
                                int var138 = client.field442.method2467();
                                int var139 = client.field442.method2464();
                                int var140 = client.field442.method2464();
                                int var141 = client.field442.method2467();
                                for (int var142 = var139; var142 <= var140; var142++) {
                                    long var143 = ((long) var138 << 32) + (long) var142;
                                    client.field496.method3614(new class202(var141), var143);
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 141) {
                            int var145 = client.field442.method2464();
                            int var146 = client.field442.method2595();
                            int var147 = client.field442.method2480();
                            class174 var148 = class174.method636(var146);
                            var148.field2780 = (var147 << 16) + var145;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 184) {
                            client.method849();
                            client.field459 = client.field442.method2513();
                            client.field343 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 233) {
                            boolean var149 = client.field442.method2462() == 1;
                            if (var149) {
                                field719 = class116.method2781() - client.field442.method2468();
                                field657 = new class222(client.field442, true);
                            } else {
                                field657 = null;
                            }
                            client.field366 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 85) {
                            while (client.field442.field1993 < client.field342) {
                                boolean var150 = client.field442.method2462() == 1;
                                String var151 = client.field442.method2470();
                                String var152 = client.field442.method2470();
                                int var153 = client.field442.method2464();
                                int var154 = client.field442.method2462();
                                int var155 = client.field442.method2462();
                                boolean var156 = (var155 & 0x2) != 0;
                                boolean var157 = (var155 & 0x1) != 0;
                                if (var153 > 0) {
                                    client.field442.method2470();
                                    client.field442.method2462();
                                    client.field442.method2467();
                                }
                                client.field442.method2470();
                                for (int var158 = 0; var158 < client.field562; var158++) {
                                    class18 var159 = client.field564[var158];
                                    if (var150) {
                                        if (var152.equals(var159.field262)) {
                                            var159.field262 = var151;
                                            var159.field263 = var152;
                                            var151 = null;
                                            break;
                                        }
                                    } else if (var151.equals(var159.field262)) {
                                        if (var159.field257 != var153) {
                                            boolean var160 = true;
                                            for (class39 var161 = (class39) client.field502.method3605(); var161 != null; var161 = (class39) client.field502.method3602()) {
                                                if (var161.field883.equals(var151)) {
                                                    if (var153 != 0 && var161.field880 == 0) {
                                                        var161.method3733();
                                                        var160 = false;
                                                    } else if (var153 == 0 && var161.field880 != 0) {
                                                        var161.method3733();
                                                        var160 = false;
                                                    }
                                                }
                                            }
                                            if (var160) {
                                                client.field502.method3601(new class39(var151, var153));
                                            }
                                            var159.field257 = var153;
                                        }
                                        var159.field263 = var152;
                                        var159.field258 = var154;
                                        var159.field259 = var156;
                                        var159.field264 = var157;
                                        var151 = null;
                                        break;
                                    }
                                }
                                if (var151 != null && client.field562 < 400) {
                                    class18 var162 = new class18();
                                    client.field564[client.field562] = var162;
                                    var162.field262 = var151;
                                    var162.field263 = var152;
                                    var162.field257 = var153;
                                    var162.field258 = var154;
                                    var162.field259 = var156;
                                    var162.field264 = var157;
                                    client.field562++;
                                }
                            }
                            client.field563 = 2;
                            client.field487 = client.field478;
                            boolean var163 = false;
                            int var164 = client.field562;
                            while (var164 > 0) {
                                boolean var165 = true;
                                var164--;
                                for (int var166 = 0; var166 < var164; var166++) {
                                    boolean var167 = false;
                                    class18 var168 = client.field564[var166];
                                    class18 var169 = client.field564[var166 + 1];
                                    if (client.field297 != var168.field257 && client.field297 == var169.field257) {
                                        var167 = true;
                                    }
                                    if (!var167 && var168.field257 == 0 && var169.field257 != 0) {
                                        var167 = true;
                                    }
                                    if (!var167 && !var168.field259 && var169.field259) {
                                        var167 = true;
                                    }
                                    if (!var167 && !var168.field264 && var169.field264) {
                                        var167 = true;
                                    }
                                    if (var167) {
                                        class18 var170 = client.field564[var166];
                                        client.field564[var166] = client.field564[var166 + 1];
                                        client.field564[var166 + 1] = var170;
                                        var165 = false;
                                    }
                                }
                                if (var165) {
                                    break;
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 23) {
                            boolean var171 = client.field442.method2490() == 1;
                            int var172 = client.field442.method2467();
                            class174 var173 = class174.method636(var172);
                            if (var173.field2779 != var171) {
                                var173.field2779 = var171;
                                client.method652(var173);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 239) {
                            int var174 = client.field442.method2595();
                            field261 = field1875.method2848(var174);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 10) {
                            int var175 = client.field442.method2497();
                            int var176 = client.field442.method2506();
                            int var177 = var175 >> 10 & 0x1F;
                            int var178 = var175 >> 5 & 0x1F;
                            int var179 = var175 & 0x1F;
                            int var180 = (var179 << 3) + (var177 << 19) + (var178 << 11);
                            class174 var181 = class174.method636(var176);
                            if (var181.field2784 != var180) {
                                var181.field2784 = var180;
                                client.method652(var181);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 157) {
                            client.field512 = client.field442.method2462();
                            client.field446 = client.field442.method2462();
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 164) {
                            client.method254(client.field442.method2470());
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 50) {
                            int var182 = client.field442.method2462();
                            if (client.field442.method2462() == 0) {
                                client.field571[var182] = new class221();
                                client.field442.field1993 += 18;
                            } else {
                                client.field442.field1993--;
                                client.field571[var182] = new class221(client.field442, false);
                            }
                            client.field406 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 175) {
                            int var183 = client.field442.method2462();
                            int var184 = client.field442.method2462();
                            int var185 = client.field442.method2462();
                            int var186 = client.field442.method2462();
                            client.field544[var183] = true;
                            client.field545[var183] = var184;
                            client.field560[var183] = var185;
                            client.field539[var183] = var186;
                            client.field548[var183] = 0;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 178) {
                            client.method3123(false);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 31) {
                            for (int var187 = 0; var187 < class177.field2906.length; var187++) {
                                if (class177.field2907[var187] != class177.field2906[var187]) {
                                    class177.field2906[var187] = class177.field2907[var187];
                                    client.method3(var187);
                                    client.field490[++client.field481 - 1 & 0x1F] = var187;
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 152) {
                            int var188 = client.field442.method2506();
                            class174 var189 = class174.method636(var188);
                            for (int var190 = 0; var190 < var189.field2877.length; var190++) {
                                var189.field2877[var190] = -1;
                                var189.field2877[var190] = 0;
                            }
                            client.method652(var189);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 219) {
                            client.field488 = client.field478;
                            if (client.field342 == 0) {
                                client.field513 = null;
                                client.field523 = null;
                                field2144 = 0;
                                field1227 = null;
                                client.field395 = -1;
                                var1 = true;
                            } else {
                                client.field523 = client.field442.method2470();
                                long var191 = client.field442.method2468();
                                client.field513 = class163.method1101(var191);
                                field2745 = client.field442.method2548();
                                int var193 = client.field442.method2462();
                                if (var193 == 255) {
                                    client.field395 = -1;
                                    var1 = true;
                                } else {
                                    field2144 = var193;
                                    class25[] var194 = new class25[100];
                                    for (int var195 = 0; var195 < field2144; var195++) {
                                        var194[var195] = new class25();
                                        var194[var195].field638 = client.field442.method2470();
                                        var194[var195].field631 = class165.method667(var194[var195].field638, field552);
                                        var194[var195].field634 = client.field442.method2464();
                                        var194[var195].field632 = client.field442.method2548();
                                        client.field442.method2470();
                                        if (var194[var195].field638.equals(field94.field59)) {
                                            field129 = var194[var195].field632;
                                        }
                                    }
                                    boolean var196 = false;
                                    int var197 = field2144;
                                    while (var197 > 0) {
                                        boolean var198 = true;
                                        var197--;
                                        for (int var199 = 0; var199 < var197; var199++) {
                                            if (var194[var199].field631.compareTo(var194[var199 + 1].field631) > 0) {
                                                class25 var200 = var194[var199];
                                                var194[var199] = var194[var199 + 1];
                                                var194[var199 + 1] = var200;
                                                var198 = false;
                                            }
                                        }
                                        if (var198) {
                                            break;
                                        }
                                    }
                                    field1227 = var194;
                                    client.field395 = -1;
                                    var1 = true;
                                }
                            }
                            break label2531;
                        }
                        if (client.field395 == 96) {
                            class26 var201 = new class26();
                            var201.field656 = client.field442.method2470();
                            var201.field647 = client.field442.method2464();
                            int var202 = client.field442.method2467();
                            var201.field648 = var202;
                            client.method50(45);
                            field2048.method2926();
                            field2048 = null;
                            class32.method803(var201);
                            client.field395 = -1;
                            var1 = false;
                            break label2531;
                        }
                        if (client.field395 == 35) {
                            if (client.field453 != -1) {
                                client.method2753(client.field453, 0);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 33) {
                            client.field543 = true;
                            field62 = client.field442.method2462();
                            field194 = client.field442.method2462();
                            field693 = client.field442.method2464();
                            field1876 = client.field442.method2462();
                            field694 = client.field442.method2462();
                            if (field694 >= 100) {
                                field674 = field62 * 128 + 64;
                                field2130 = field194 * 128 + 64;
                                field1071 = client.method799(field674, field2130, field1003) - field693;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 124) {
                            class212.method3073(client.field442, client.field342);
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 187) {
                            client.field531 = client.field442.method2462();
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 196) {
                            int var203 = client.field442.method2480();
                            if (var203 == 65535) {
                                var203 = -1;
                            }
                            int var204 = client.field442.method2506();
                            int var205 = client.field442.method2464();
                            if (var205 == 65535) {
                                var205 = -1;
                            }
                            int var206 = client.field442.method2505();
                            for (int var207 = var203; var207 <= var205; var207++) {
                                long var208 = ((long) var204 << 32) + (long) var207;
                                class209 var210 = client.field496.method3607(var208);
                                if (var210 != null) {
                                    var210.method3737();
                                }
                                client.field496.method3614(new class202(var206), var208);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 12) {
                            client.method160(false);
                            client.field442.method2714();
                            int var211 = client.field442.method2464();
                            class123 var212 = client.field442;
                            int var213 = var212.field1993;
                            class33.field770 = 0;
                            class33.method1664(var212);
                            class33.method45(var212);
                            if (var212.field1993 - var213 != var211) {
                                throw new RuntimeException(var212.field1993 - var213 + " " + var211);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 167) {
                            client.field442.field1993 += 28;
                            if (client.field442.method2484()) {
                                class150.method206(client.field442, client.field442.field1993 - 28);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 188) {
                            field786 = client.field442.method2490();
                            field1539 = client.field442.method2490();
                            while (client.field442.field1993 < client.field342) {
                                client.field395 = client.field442.method2462();
                                client.method2750();
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 251) {
                            String var214 = client.field442.method2470();
                            long var215 = (long) client.field442.method2464();
                            long var217 = (long) client.field442.method2466();
                            class153[] var219 = new class153[] { class153.field2262, class153.field2269, class153.field2263, class153.field2264, class153.field2266 };
                            class153 var220 = (class153) class110.method2766(var219, client.field442.method2462());
                            long var221 = (var215 << 32) + var217;
                            boolean var223 = false;
                            for (int var224 = 0; var224 < 100; var224++) {
                                if (client.field500[var224] == var221) {
                                    var223 = true;
                                    break;
                                }
                            }
                            if (client.method789(var214)) {
                                var223 = true;
                            }
                            if (!var223 && client.field367 == 0) {
                                client.field500[client.field516] = var221;
                                client.field516 = (client.field516 + 1) % 100;
                                String var225 = class224.method3854(class164.method15(class223.method2790(client.field442)));
                                byte var226;
                                if (var220.field2267) {
                                    var226 = 7;
                                } else {
                                    var226 = 3;
                                }
                                if (var220.field2261 == -1) {
                                    class12.method2783(var226, var214, var225);
                                } else {
                                    class12.method2783(var226, class2.method2761(var220.field2261) + var214, var225);
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 117) {
                            int var227 = client.field442.method2467();
                            int var228 = client.field442.method2464();
                            if (var227 < -70000) {
                                var228 += 32768;
                            }
                            class174 var229;
                            if (var227 >= 0) {
                                var229 = class174.method636(var227);
                            } else {
                                var229 = null;
                            }
                            while (client.field442.field1993 < client.field342) {
                                int var230 = client.field442.method2661();
                                int var231 = client.field442.method2464();
                                int var232 = 0;
                                if (var231 != 0) {
                                    var232 = client.field442.method2462();
                                    if (var232 == 255) {
                                        var232 = client.field442.method2467();
                                    }
                                }
                                if (var229 != null && var230 >= 0 && var230 < var229.field2877.length) {
                                    var229.field2877[var230] = var231;
                                    var229.field2878[var230] = var232;
                                }
                                class16.method989(var228, var230, var231 - 1, var232);
                            }
                            if (var229 != null) {
                                client.method652(var229);
                            }
                            client.method849();
                            client.field482[++client.field483 - 1 & 0x1F] = var228 & 0x7FFF;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 97) {
                            int var233 = client.field442.method2488();
                            int var234 = client.field442.method2490();
                            String var235 = client.field442.method2470();
                            if (var234 >= 1 && var234 <= 8) {
                                if (var235.equalsIgnoreCase("null")) {
                                    var235 = null;
                                }
                                client.field318[var234 - 1] = var235;
                                client.field423[var234 - 1] = var233 == 0;
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 26) {
                            client.field543 = true;
                            field237 = client.field442.method2462();
                            field2904 = client.field442.method2462();
                            field267 = client.field442.method2464();
                            field228 = client.field442.method2462();
                            field2666 = client.field442.method2462();
                            if (field2666 >= 100) {
                                int var236 = field237 * 128 + 64;
                                int var237 = field2904 * 128 + 64;
                                int var238 = client.method799(var236, var237, field1003) - field267;
                                int var239 = var236 - field674;
                                int var240 = var238 - field1071;
                                int var241 = var237 - field2130;
                                int var242 = (int) Math.sqrt((double) (var239 * var239 + var241 * var241));
                                field1228 = (int) (Math.atan2((double) var240, (double) var242) * 325.949D) & 0x7FF;
                                field1959 = (int) (Math.atan2((double) var239, (double) var241) * -325.949D) & 0x7FF;
                                if (field1228 < 128) {
                                    field1228 = 128;
                                }
                                if (field1228 > 383) {
                                    field1228 = 383;
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 25) {
                            field1539 = client.field442.method2488();
                            field786 = client.field442.method2462();
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 119) {
                            int var243 = client.field442.method2506();
                            int var244 = client.field442.method2506();
                            class4 var245 = (class4) client.field454.method3607((long) var243);
                            class4 var246 = (class4) client.field454.method3607((long) var244);
                            if (var246 != null) {
                                client.method766(var246, var245 == null || var245.field71 != var246.field71);
                            }
                            if (var245 != null) {
                                var245.method3737();
                                client.field454.method3614(var245, (long) var244);
                            }
                            class174 var247 = class174.method636(var243);
                            if (var247 != null) {
                                client.method652(var247);
                            }
                            class174 var248 = class174.method636(var244);
                            if (var248 != null) {
                                client.method652(var248);
                                client.method197(field2887[var248.field2843 >>> 16], var248, true);
                            }
                            if (client.field453 != -1) {
                                client.method2753(client.field453, 1);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 138) {
                            while (client.field442.field1993 < client.field342) {
                                int var249 = client.field442.method2462();
                                boolean var250 = (var249 & 0x1) == 1;
                                String var251 = client.field442.method2470();
                                String var252 = client.field442.method2470();
                                client.field442.method2470();
                                for (int var253 = 0; var253 < client.field398; var253++) {
                                    class8 var254 = client.field396[var253];
                                    if (var250) {
                                        if (var252.equals(var254.field141)) {
                                            var254.field141 = var251;
                                            var254.field138 = var252;
                                            var251 = null;
                                            break;
                                        }
                                    } else if (var251.equals(var254.field141)) {
                                        var254.field141 = var251;
                                        var254.field138 = var252;
                                        var251 = null;
                                        break;
                                    }
                                }
                                if (var251 != null && client.field398 < 400) {
                                    class8 var255 = new class8();
                                    client.field396[client.field398] = var255;
                                    var255.field141 = var251;
                                    var255.field138 = var252;
                                    client.field398++;
                                }
                            }
                            client.field487 = client.field478;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 100) {
                            int var256 = client.field442.method2497();
                            class16 var257 = (class16) class16.field231.method3607((long) var256);
                            if (var257 != null) {
                                var257.method3737();
                            }
                            client.field482[++client.field483 - 1 & 0x1F] = var256 & 0x7FFF;
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 250) {
                            int var258 = client.field442.method2513();
                            int var259 = client.field442.method2505();
                            class174 var260 = class174.method636(var259);
                            if (var260.field2806 != var258 || var258 == -1) {
                                var260.field2806 = var258;
                                var260.field2772 = 0;
                                var260.field2857 = 0;
                                client.method652(var260);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 242) {
                            int var261 = client.field442.method2595();
                            int var262 = client.field442.method2497();
                            int var263 = client.field442.method2497();
                            int var264 = client.field442.method2497();
                            class174 var265 = class174.method636(var261);
                            if (var265.field2801 != var263 || var265.field2811 != var262 || var265.field2813 != var264) {
                                var265.field2801 = var263;
                                var265.field2811 = var262;
                                var265.field2813 = var264;
                                client.method652(var265);
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        if (client.field395 == 105) {
                            for (int var266 = 0; var266 < client.field551.length; var266++) {
                                if (client.field551[var266] != null) {
                                    client.field551[var266].field849 = -1;
                                }
                            }
                            for (int var267 = 0; var267 < client.field547.length; var267++) {
                                if (client.field547[var267] != null) {
                                    client.field547[var267].field849 = -1;
                                }
                            }
                            client.field395 = -1;
                            var1 = true;
                            break label2531;
                        }
                        class149.method650("" + client.field395 + class2.field19 + client.field577 + class2.field19 + client.field437 + class2.field19 + client.field342, (Throwable) null);
                        client.method140();
                    } catch (IOException var361) {
                        client.method3573();
                    } catch (Exception var362) {
                        String var270 = "" + client.field395 + class2.field19 + client.field577 + class2.field19 + client.field437 + class2.field19 + client.field342 + class2.field19 + (field2205 + field94.field872[0]) + class2.field19 + (field68 + field94.field836[0]) + class2.field19;
                        for (int var271 = 0; var271 < client.field342 && var271 < 50; var271++) {
                            var270 = var270 + client.field442.field1994[var271] + class2.field19;
                        }
                        class149.method650(var270, var362);
                        client.method140();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (client.field555 != 30) {
            return;
        }
        while (class212.method833()) {
            client.field339.method2722(140);
            client.field339.method2452(0);
            int var272 = client.field339.field1993;
            class212.method2337(client.field339);
            client.field339.method2459(client.field339.field1993 - var272);
        }
        Object var273 = field2009.field207;
        synchronized (field2009.field207) {
            if (!client.field296) {
                field2009.field209 = 0;
            } else if (class141.field2158 != 0 || field2009.field209 >= 40) {
                client.field339.method2722(149);
                client.field339.method2452(0);
                int var274 = client.field339.field1993;
                int var275 = 0;
                for (int var276 = 0; var276 < field2009.field209 && client.field339.field1993 - var274 < 240; var276++) {
                    var275++;
                    int var277 = field2009.field210[var276];
                    if (var277 < 0) {
                        var277 = 0;
                    } else if (var277 > 502) {
                        var277 = 502;
                    }
                    int var278 = field2009.field213[var276];
                    if (var278 < 0) {
                        var278 = 0;
                    } else if (var278 > 764) {
                        var278 = 764;
                    }
                    int var279 = var277 * 765 + var278;
                    if (field2009.field210[var276] == -1 && field2009.field213[var276] == -1) {
                        var278 = -1;
                        var277 = -1;
                        var279 = 524287;
                    }
                    if (client.field309 != var278 || client.field310 != var277) {
                        int var280 = var278 - client.field309;
                        client.field309 = var278;
                        int var281 = var277 - client.field310;
                        client.field310 = var277;
                        if (client.field311 < 8 && var280 >= -32 && var280 <= 31 && var281 >= -32 && var281 <= 31) {
                            var280 += 32;
                            var281 += 32;
                            client.field339.method2448((client.field311 << 12) + (var280 << 6) + var281);
                            client.field311 = 0;
                        } else if (client.field311 < 8) {
                            client.field339.method2524((client.field311 << 19) + 8388608 + var279);
                            client.field311 = 0;
                        } else {
                            client.field339.method2635((client.field311 << 19) + -1073741824 + var279);
                            client.field311 = 0;
                        }
                    } else if (client.field311 < 2047) {
                        client.field311++;
                    }
                }
                client.field339.method2459(client.field339.field1993 - var274);
                if (var275 >= field2009.field209) {
                    field2009.field209 = 0;
                } else {
                    field2009.field209 -= var275;
                    for (int var282 = 0; var282 < field2009.field209; var282++) {
                        field2009.field213[var282] = field2009.field213[var275 + var282];
                        field2009.field210[var282] = field2009.field210[var275 + var282];
                    }
                }
            }
        }
        if (class141.field2158 == 1 || !field144 && class141.field2158 == 4 || class141.field2158 == 2) {
            long var284 = (class141.field2159 - client.field305 * -1L) / 50L;
            if (var284 > 4095L) {
                var284 = 4095L;
            }
            client.field305 = class141.field2159 * -1L;
            int var286 = class141.field2160;
            if (var286 < 0) {
                var286 = 0;
            } else if (var286 > field1672) {
                var286 = field1672;
            }
            int var287 = class141.field2161;
            if (var287 < 0) {
                var287 = 0;
            } else if (var287 > field877) {
                var287 = field877;
            }
            int var288 = (int) var284;
            client.field339.method2722(217);
            client.field339.method2448((class141.field2158 == 2 ? 1 : 0) + (var288 << 1));
            client.field339.method2448(var287);
            client.field339.method2448(var286);
        }
        if (class138.field2124 > 0) {
            client.field339.method2722(212);
            client.field339.method2448(0);
            int var289 = client.field339.field1993;
            long var290 = class116.method2781();
            for (int var292 = 0; var292 < class138.field2124; var292++) {
                long var293 = var290 - client.field352;
                if (var293 > 16777215L) {
                    var293 = 16777215L;
                }
                client.field352 = var290;
                client.field339.method2592(class138.field2123[var292]);
                client.field339.method2500((int) var293);
            }
            client.field339.method2660(client.field339.field1993 - var289);
        }
        if (client.field356 > 0) {
            client.field356--;
        }
        if (class138.field2116[96] || class138.field2116[97] || class138.field2116[98] || class138.field2116[99]) {
            client.field349 = true;
        }
        if (client.field349 && client.field356 <= 0) {
            client.field356 = 20;
            client.field349 = false;
            client.field339.method2722(32);
            client.field339.method2483(client.field380);
            client.field339.method2483(client.field565);
        }
        if (field2011 && !client.field301) {
            client.field301 = true;
            client.field339.method2722(100);
            client.field339.method2452(1);
        }
        if (!field2011 && client.field301) {
            client.field301 = false;
            client.field339.method2722(100);
            client.field339.method2452(0);
        }
        client.method3238();
        if (client.field555 != 30) {
            return;
        }
        for (class17 var295 = (class17) client.field427.method3665(); var295 != null; var295 = (class17) client.field427.method3641()) {
            if (var295.field248 > 0) {
                var295.field248--;
            }
            if (var295.field248 != 0) {
                if (var295.field240 > 0) {
                    var295.field240--;
                }
                if (var295.field240 == 0 && var295.field239 >= 1 && var295.field244 >= 1 && var295.field239 <= 102 && var295.field244 <= 102 && (var295.field242 < 0 || class6.method2033(var295.field242, var295.field251))) {
                    client.method865(var295.field243, var295.field238, var295.field239, var295.field244, var295.field242, var295.field245, var295.field251);
                    var295.field240 = -1;
                    if (var295.field242 == var295.field241 && var295.field241 == -1) {
                        var295.method3737();
                    } else if (var295.field242 == var295.field241 && var295.field246 == var295.field245 && var295.field251 == var295.field250) {
                        var295.method3737();
                    }
                }
            } else if (var295.field241 < 0 || class6.method2033(var295.field241, var295.field250)) {
                client.method865(var295.field243, var295.field238, var295.field239, var295.field244, var295.field241, var295.field246, var295.field250);
                var295.method3737();
            }
        }
        int var10002;
        for (int var296 = 0; var296 < client.field537; var296++) {
            var10002 = client.field540[var296]--;
            if (client.field540[var296] >= -10) {
                class59 var298 = client.field542[var296];
                if (var298 == null) {
                    class59 var363 = (class59) null;
                    var298 = class59.method1301(field1968, client.field538[var296], 0);
                    if (var298 == null) {
                        continue;
                    }
                    client.field540[var296] += var298.method1293();
                    client.field542[var296] = var298;
                }
                if (client.field540[var296] < 0) {
                    int var305;
                    if (client.field541[var296] == 0) {
                        var305 = client.field467;
                    } else {
                        int var299 = (client.field541[var296] & 0xFF) * 128;
                        int var300 = client.field541[var296] >> 16 & 0xFF;
                        int var301 = var300 * 128 + 64 - field94.field845;
                        if (var301 < 0) {
                            var301 = -var301;
                        }
                        int var302 = client.field541[var296] >> 8 & 0xFF;
                        int var303 = var302 * 128 + 64 - field94.field820;
                        if (var303 < 0) {
                            var303 = -var303;
                        }
                        int var304 = var301 + var303 - 128;
                        if (var304 > var299) {
                            client.field540[var296] = -100;
                            continue;
                        }
                        if (var304 < 0) {
                            var304 = 0;
                        }
                        var305 = client.field515 * (var299 - var304) / var299;
                    }
                    if (var305 > 0) {
                        class63 var306 = var298.method1290().method1330(field1440);
                        class65 var307 = class65.method1356(var306, 100, var305);
                        var307.method1359(client.field335[var296] - 1);
                        field179.method1231(var307);
                    }
                    client.field540[var296] = -100;
                }
            } else {
                client.field537--;
                for (int var297 = var296; var297 < client.field537; var297++) {
                    client.field538[var297] = client.field538[var297 + 1];
                    client.field542[var297] = client.field542[var297 + 1];
                    client.field335[var297] = client.field335[var297 + 1];
                    client.field540[var297] = client.field540[var297 + 1];
                    client.field541[var297] = client.field541[var297 + 1];
                }
                var296--;
            }
        }
        if (client.field300 && !class184.method1868()) {
            if (client.field532 != 0 && client.field533 != -1) {
                class184.method2976(field885, client.field533, 0, client.field532, false);
            }
            client.field300 = false;
        }
        client.field372++;
        if (client.field372 > 750) {
            client.method3573();
            return;
        }
        client.method816();
        client.method205();
        client.method2139();
        client.field428++;
        if (client.field468 != 0) {
            client.field405 += 20;
            if (client.field405 >= 400) {
                client.field468 = 0;
            }
        }
        if (field2062 != null) {
            client.field407++;
            if (client.field407 >= 15) {
                client.method652(field2062);
                field2062 = null;
            }
        }
        class174 var308 = field1033;
        class174 var309 = field1202;
        field1033 = null;
        field1202 = null;
        client.field470 = null;
        client.field474 = false;
        client.field499 = false;
        client.field518 = 0;
        while (class138.method2394() && client.field518 < 128) {
            if (client.field346 >= 2 && class138.field2116[82] && field278 == 66) {
                String var310 = "";
                Iterator var311 = class12.field182.iterator();
                while (var311.hasNext()) {
                    class36 var312 = (class36) var311.next();
                    var310 = var310 + var312.field793 + ':' + var312.field796 + '\n';
                }
                field794.setContents(new StringSelection(var310), (ClipboardOwner) null);
            } else {
                client.field520[client.field518] = field278;
                client.field519[client.field518] = field2129;
                client.field518++;
            }
        }
        if (client.field453 != -1) {
            int var315 = client.field453;
            int var316 = field877;
            int var317 = field1672;
            if (class174.method159(var315)) {
                client.method2122(field2887[var315], -1, 0, 0, var316, var317, 0, 0);
            }
        }
        client.field478++;
        while (true) {
            class1 var318;
            class174 var319;
            class174 var320;
            do {
                var318 = (class1) client.field494.method3642();
                if (var318 == null) {
                    while (true) {
                        class1 var321;
                        class174 var322;
                        class174 var323;
                        do {
                            var321 = (class1) client.field495.method3642();
                            if (var321 == null) {
                                while (true) {
                                    class1 var324;
                                    class174 var325;
                                    class174 var326;
                                    do {
                                        var324 = (class1) client.field493.method3642();
                                        if (var324 == null) {
                                            method4();
                                            if (client.field466 != null) {
                                                client.method2814();
                                            }
                                            if (field66 != null) {
                                                client.method652(field66);
                                                client.field414++;
                                                if (class141.field2148 == 0) {
                                                    if (client.field413) {
                                                        if (field66 == field2151 && client.field412 != client.field409) {
                                                            class174 var327 = field66;
                                                            byte var328 = 0;
                                                            if (client.field456 == 1 && var327.field2763 == 206) {
                                                                var328 = 1;
                                                            }
                                                            if (var327.field2877[client.field412] <= 0) {
                                                                var328 = 0;
                                                            }
                                                            int var329 = client.method765(var327);
                                                            boolean var330 = (var329 >> 29 & 0x1) != 0;
                                                            if (var330) {
                                                                int var331 = client.field409;
                                                                int var332 = client.field412;
                                                                var327.field2877[var332] = var327.field2877[var331];
                                                                var327.field2878[var332] = var327.field2878[var331];
                                                                var327.field2877[var331] = -1;
                                                                var327.field2878[var331] = 0;
                                                            } else if (var328 == 1) {
                                                                int var333 = client.field409;
                                                                int var334 = client.field412;
                                                                while (var333 != var334) {
                                                                    if (var333 > var334) {
                                                                        var327.method3272(var333 - 1, var333);
                                                                        var333--;
                                                                    } else if (var333 < var334) {
                                                                        var327.method3272(var333 + 1, var333);
                                                                        var333++;
                                                                    }
                                                                }
                                                            } else {
                                                                var327.method3272(client.field412, client.field409);
                                                            }
                                                            client.field339.method2722(34);
                                                            client.field339.method2483(client.field409);
                                                            client.field339.method2455(field66.field2843);
                                                            client.field339.method2592(var328);
                                                            client.field339.method2483(client.field412);
                                                        }
                                                    } else if ((client.field433 == 1 || client.method215(client.field435 - 1)) && client.field435 > 2) {
                                                        method169(client.field415, client.field378);
                                                    } else if (client.field435 > 0) {
                                                        client.method114(client.field415, client.field378);
                                                    }
                                                    client.field407 = 10;
                                                    class141.field2158 = 0;
                                                    field66 = null;
                                                } else if (client.field414 >= 5 && (class141.field2152 > client.field415 + 5 || class141.field2152 < client.field415 - 5 || class141.field2162 > client.field378 + 5 || class141.field2162 < client.field378 - 5)) {
                                                    client.field413 = true;
                                                }
                                            }
                                            if (class87.field1502 != -1) {
                                                int var335 = class87.field1502;
                                                int var336 = class87.field1479;
                                                client.field339.method2722(220);
                                                client.field339.method2452(5);
                                                client.field339.method2452(class138.field2116[82] ? (class138.field2116[81] ? 2 : 1) : 0);
                                                client.field339.method2594(field2205 + var335);
                                                client.field339.method2594(field68 + var336);
                                                class87.field1502 = -1;
                                                client.field403 = class141.field2161;
                                                client.field404 = class141.field2160;
                                                client.field468 = 1;
                                                client.field405 = 0;
                                                client.field529 = var335;
                                                client.field348 = var336;
                                            }
                                            if (field1033 != var308) {
                                                if (var308 != null) {
                                                    client.method652(var308);
                                                }
                                                if (field1033 != null) {
                                                    client.method652(field1033);
                                                }
                                            }
                                            if (field1202 != var309 && client.field445 == client.field411) {
                                                if (var309 != null) {
                                                    client.method652(var309);
                                                }
                                                if (field1202 != null) {
                                                    client.method652(field1202);
                                                }
                                            }
                                            if (field1202 == null) {
                                                if (client.field411 > 0) {
                                                    client.field411--;
                                                }
                                            } else if (client.field411 < client.field445) {
                                                client.field411++;
                                                if (client.field445 == client.field411) {
                                                    client.method652(field1202);
                                                }
                                            }
                                            int var337 = client.field360 + field94.field845;
                                            int var338 = client.field569 + field94.field820;
                                            if (field2223 - var337 < -500 || field2223 - var337 > 500 || field1070 - var338 < -500 || field1070 - var338 > 500) {
                                                field2223 = var337;
                                                field1070 = var338;
                                            }
                                            if (field2223 != var337) {
                                                field2223 += (var337 - field2223) / 16;
                                            }
                                            if (field1070 != var338) {
                                                field1070 += (var338 - field1070) / 16;
                                            }
                                            if (class141.field2148 == 4 && field144) {
                                                int var339 = class141.field2162 - client.field384;
                                                client.field382 = var339 * 2;
                                                client.field384 = var339 == -1 || var339 == 1 ? class141.field2162 : (client.field384 + class141.field2162) / 2;
                                                int var340 = client.field383 - class141.field2152;
                                                client.field358 = var340 * 2;
                                                client.field383 = var340 == -1 || var340 == 1 ? class141.field2152 : (client.field383 + class141.field2152) / 2;
                                            } else {
                                                if (class138.field2116[96]) {
                                                    client.field358 += (-24 - client.field358) / 2;
                                                } else if (class138.field2116[97]) {
                                                    client.field358 += (24 - client.field358) / 2;
                                                } else {
                                                    client.field358 /= 2;
                                                }
                                                if (class138.field2116[98]) {
                                                    client.field382 += (12 - client.field382) / 2;
                                                } else if (class138.field2116[99]) {
                                                    client.field382 += (-12 - client.field382) / 2;
                                                } else {
                                                    client.field382 /= 2;
                                                }
                                                client.field384 = class141.field2162;
                                                client.field383 = class141.field2152;
                                            }
                                            client.field380 = client.field358 / 2 + client.field380 & 0x7FF;
                                            client.field565 += client.field382 / 2;
                                            if (client.field565 < 128) {
                                                client.field565 = 128;
                                            }
                                            if (client.field565 > 383) {
                                                client.field565 = 383;
                                            }
                                            int var341 = field2223 >> 7;
                                            int var342 = field1070 >> 7;
                                            int var343 = client.method799(field2223, field1070, field1003);
                                            int var344 = 0;
                                            if (var341 > 3 && var342 > 3 && var341 < 100 && var342 < 100) {
                                                for (int var345 = var341 - 4; var345 <= var341 + 4; var345++) {
                                                    for (int var346 = var342 - 4; var346 <= var342 + 4; var346++) {
                                                        int var347 = field1003;
                                                        if (var347 < 3 && (class6.field83[1][var345][var346] & 0x2) == 2) {
                                                            var347++;
                                                        }
                                                        int var348 = var343 - class6.field95[var347][var345][var346];
                                                        if (var348 > var344) {
                                                            var344 = var348;
                                                        }
                                                    }
                                                }
                                            }
                                            int var349 = var344 * 192;
                                            if (var349 > 98048) {
                                                var349 = 98048;
                                            }
                                            if (var349 < 32768) {
                                                var349 = 32768;
                                            }
                                            if (var349 > client.field388) {
                                                client.field388 += (var349 - client.field388) / 24;
                                            } else if (var349 < client.field388) {
                                                client.field388 += (var349 - client.field388) / 80;
                                            }
                                            if (client.field543) {
                                                client.method2782();
                                            }
                                            for (int var350 = 0; var350 < 5; var350++) {
                                                var10002 = client.field548[var350]++;
                                            }
                                            field2724.method233();
                                            int var351 = ++class141.field2147 - 1;
                                            int var353 = class138.method3222();
                                            if (var351 > 15000 && var353 > 15000) {
                                                client.field402 = 250;
                                                class141.method2138(14500);
                                                client.field339.method2722(103);
                                            }
                                            client.field385++;
                                            if (client.field385 > 500) {
                                                client.field385 = 0;
                                                int var354 = (int) (Math.random() * 8.0D);
                                                if ((var354 & 0x1) == 1) {
                                                    client.field360 += client.field361;
                                                }
                                                if ((var354 & 0x2) == 2) {
                                                    client.field569 += client.field363;
                                                }
                                                if ((var354 & 0x4) == 4) {
                                                    client.field364 += client.field365;
                                                }
                                            }
                                            if (client.field360 < -50) {
                                                client.field361 = 2;
                                            }
                                            if (client.field360 > 50) {
                                                client.field361 = -2;
                                            }
                                            if (client.field569 < -55) {
                                                client.field363 = 2;
                                            }
                                            if (client.field569 > 55) {
                                                client.field363 = -2;
                                            }
                                            if (client.field364 < -40) {
                                                client.field365 = 1;
                                            }
                                            if (client.field364 > 40) {
                                                client.field365 = -1;
                                            }
                                            client.field371++;
                                            if (client.field371 > 500) {
                                                client.field371 = 0;
                                                int var355 = (int) (Math.random() * 8.0D);
                                                if ((var355 & 0x1) == 1) {
                                                    client.field444 += client.field368;
                                                }
                                                if ((var355 & 0x2) == 2) {
                                                    client.field369 += client.field370;
                                                }
                                            }
                                            if (client.field444 < -60) {
                                                client.field368 = 2;
                                            }
                                            if (client.field444 > 60) {
                                                client.field368 = -2;
                                            }
                                            if (client.field369 < -20) {
                                                client.field370 = 1;
                                            }
                                            if (client.field369 > 10) {
                                                client.field370 = -1;
                                            }
                                            for (class39 var356 = (class39) client.field502.method3605(); var356 != null; var356 = (class39) client.field502.method3602()) {
                                                if ((long) var356.field881 < class116.method2781() / 1000L - 5L) {
                                                    if (var356.field880 > 0) {
                                                        class12.method2783(5, "", var356.field883 + class158.field2534);
                                                    }
                                                    if (var356.field880 == 0) {
                                                        class12.method2783(5, "", var356.field883 + class158.field2529);
                                                    }
                                                    var356.method3733();
                                                }
                                            }
                                            client.field417++;
                                            if (client.field417 > 50) {
                                                client.field339.method2722(226);
                                            }
                                            try {
                                                if (field2048 != null && client.field339.field1993 > 0) {
                                                    field2048.method2931(client.field339.field1994, 0, client.field339.field1993);
                                                    client.field339.field1993 = 0;
                                                    client.field417 = 0;
                                                }
                                            } catch (IOException var358) {
                                                client.method3573();
                                            }
                                            return;
                                        }
                                        var325 = var324.field3;
                                        if (var325.field2760 < 0) {
                                            break;
                                        }
                                        var326 = class174.method636(var325.field2778);
                                    } while (var326 == null || var326.field2868 == null || var325.field2760 >= var326.field2868.length || var326.field2868[var325.field2760] != var325);
                                    class37.method3232(var324, 200000);
                                }
                            }
                            var322 = var321.field3;
                            if (var322.field2760 < 0) {
                                break;
                            }
                            var323 = class174.method636(var322.field2778);
                        } while (var323 == null || var323.field2868 == null || var322.field2760 >= var323.field2868.length || var323.field2868[var322.field2760] != var322);
                        class37.method3232(var321, 200000);
                    }
                }
                var319 = var318.field3;
                if (var319.field2760 < 0) {
                    break;
                }
                var320 = class174.method636(var319.field2778);
            } while (var320 == null || var320.field2868 == null || var319.field2760 >= var320.field2868.length || var320.field2868[var319.field2760] != var319);
            class37.method3232(var318, 200000);
        }
    }

    @ObfuscatedName("ci.ab(I)V")
    public static void method2121() {
        int var0 = client.field2193;
        int var1 = client.field2192;
        int var2 = field2072 - field877 - var0;
        int var3 = field156 - field1672 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = field295.method2954();
            int var5 = 0;
            int var6 = 0;
            if (field761 == var4) {
                Insets var7 = field761.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, field156);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, field2072, var1);
            }
            if (var2 > 0) {
                var8.fillRect(field2072 + var5 - var2, var6, var2, field156);
            }
            if (var3 > 0) {
                var8.fillRect(var5, field156 + var6 - var3, field2072, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ay.bx(III)V")
    public static final void method733(int arg0, int arg1) {
        if (client.field435 < 2 && client.field449 == 0 && !client.field448) {
            return;
        }
        String var2;
        if (client.field449 == 1 && client.field435 < 2) {
            var2 = class158.field2449 + class158.field2459 + client.field379 + " " + class2.field25;
        } else if (client.field448 && client.field435 < 2) {
            var2 = client.field298 + class158.field2459 + client.field535 + " " + class2.field25;
        } else {
            int var3 = client.field435 - 1;
            String var4;
            if (client.field441[var3].length() > 0) {
                var4 = client.field440[var3] + class158.field2459 + client.field441[var3];
            } else {
                var4 = client.field440[var3];
            }
            var2 = var4;
        }
        if (client.field435 > 2) {
            var2 = var2 + class2.method2886(16777215) + " " + '/' + " " + (client.field435 - 2) + class158.field2365;
        }
        field782.method3889(var2, arg0 + 4, arg1 + 15, 16777215, 0, client.field307 / 1000);
    }

    @ObfuscatedName("a.bf(B)V")
    public static final void method4() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field435 - 1; var1++) {
                if (client.field438[var1] < 1000 && client.field438[var1 + 1] > 1000) {
                    String var2 = client.field441[var1];
                    client.field441[var1] = client.field441[var1 + 1];
                    client.field441[var1 + 1] = var2;
                    String var3 = client.field440[var1];
                    client.field440[var1] = client.field440[var1 + 1];
                    client.field440[var1 + 1] = var3;
                    int var4 = client.field438[var1];
                    client.field438[var1] = client.field438[var1 + 1];
                    client.field438[var1 + 1] = var4;
                    int var5 = client.field436[var1];
                    client.field436[var1] = client.field436[var1 + 1];
                    client.field436[var1 + 1] = var5;
                    int var6 = client.field526[var1];
                    client.field526[var1] = client.field526[var1 + 1];
                    client.field526[var1 + 1] = var6;
                    int var7 = client.field501[var1];
                    client.field501[var1] = client.field501[var1 + 1];
                    client.field501[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (field66 != null || client.field466 != null) {
            return;
        }
        int var20;
        int var21;
        label224: {
            int var8 = class141.field2158;
            if (client.field434) {
                if (var8 != 1 && (field144 || var8 != 4)) {
                    int var9 = class141.field2152;
                    int var10 = class141.field2162;
                    if (var9 < field60 - 10 || var9 > field997 + field60 + 10 || var10 < field1356 - 10 || var10 > field70 + field1356 + 10) {
                        client.field434 = false;
                        client.method745(field60, field1356, field997, field70);
                    }
                }
                if (var8 == 1 || !field144 && var8 == 4) {
                    int var11 = field60;
                    int var12 = field1356;
                    int var13 = field997;
                    int var14 = class141.field2161;
                    int var15 = class141.field2160;
                    int var16 = -1;
                    for (int var17 = 0; var17 < client.field435; var17++) {
                        int var18 = (client.field435 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        client.method3556(var16);
                    }
                    client.field434 = false;
                    client.method745(field60, field1356, field997, field70);
                }
            } else {
                if ((var8 == 1 || !field144 && var8 == 4) && client.field435 > 0) {
                    int var19 = client.field438[client.field435 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = client.field436[client.field435 - 1];
                        var21 = client.field526[client.field435 - 1];
                        class174 var22 = class174.method636(var21);
                        int var23 = client.method765(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label224;
                        }
                        int var25 = client.method765(var22);
                        boolean var26 = (var25 >> 29 & 0x1) != 0;
                        if (var26) {
                            break label224;
                        }
                    }
                }
                if ((var8 == 1 || !field144 && var8 == 4) && (client.field433 == 1 && client.field435 > 2 || client.method215(client.field435 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !field144 && var8 == 4) && client.field435 > 0) {
                    client.method3556(client.field435 - 1);
                }
                if (var8 == 2 && client.field435 > 0) {
                    method169(class141.field2161, class141.field2160);
                }
            }
            return;
        }
        if (field66 != null && !client.field413 && client.field433 != 1 && !client.method215(client.field435 - 1) && client.field435 > 0) {
            client.method114(client.field415, client.field378);
        }
        client.field413 = false;
        client.field414 = 0;
        if (field66 != null) {
            client.method652(field66);
        }
        field66 = class174.method636(var21);
        client.field409 = var20;
        client.field415 = class141.field2161;
        client.field378 = class141.field2160;
        if (client.field435 > 0) {
            client.method209(client.field435 - 1);
        }
        client.method652(field66);
    }

    @ObfuscatedName("e.bs(III)V")
    public static final void method169(int arg0, int arg1) {
        int var2 = field782.method3850(class158.field2452);
        for (int var3 = 0; var3 < client.field435; var3++) {
            class225 var4 = field782;
            String var5;
            if (client.field441[var3].length() > 0) {
                var5 = client.field440[var3] + class158.field2459 + client.field441[var3];
            } else {
                var5 = client.field440[var3];
            }
            int var6 = var4.method3850(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = client.field435 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > field877) {
            var8 = field877 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > field1672) {
            var9 = field1672 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        client.field434 = true;
        field60 = var8;
        field1356 = var9;
        field997 = var2;
        field70 = client.field435 * 15 + 22;
    }
}
