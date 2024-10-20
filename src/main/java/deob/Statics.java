package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
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

public class Statics {

    @ObfuscatedName("ai.ce")
    public static class224 field1006;

    @ObfuscatedName("ai.bu")
    public static class168 field1008;

    @ObfuscatedName("ay.s")
    public static class167 field1012;

    @ObfuscatedName("ay.f")
    public static class167 field1019;

    @ObfuscatedName("ay.nt")
    public static class57 field1022;

    @ObfuscatedName("ay.eu")
    public static class79[] field1027;

    @ObfuscatedName("aw.s")
    public static class167 field1032;

    @ObfuscatedName("aw.f")
    public static class167 field1037;

    @ObfuscatedName("aw.q")
    public static int field1039;

    @ObfuscatedName("aw.mf")
    public static byte field1044;

    @ObfuscatedName("ap.f")
    public static class167 field1047;

    @ObfuscatedName("ap.kt")
    public static class20 field1048;

    @ObfuscatedName("aj.f")
    public static class167 field1054;

    @ObfuscatedName("aj.pe")
    public static Clipboard field1066;

    @ObfuscatedName("ao.f")
    public static class167 field1069;

    @ObfuscatedName("j.br")
    public static class168 field108;

    @ObfuscatedName("ad.f")
    public static class167 field1089;

    @ObfuscatedName("ag.f")
    public static class167 field1091;

    @ObfuscatedName("ag.fz")
    public static int field1095;

    @ObfuscatedName("f.bg")
    public static class168 field11;

    @ObfuscatedName("al.qr")
    public static int field1103;

    @ObfuscatedName("al.f")
    public static class167 field1106;

    @ObfuscatedName("as.g")
    public static class167 field1112;

    @ObfuscatedName("as.j")
    public static int field1114;

    @ObfuscatedName("as.w")
    public static class224 field1118;

    @ObfuscatedName("as.t")
    public static boolean field1148;

    @ObfuscatedName("bi.s")
    public static int field1164;

    @ObfuscatedName("bi.er")
    public static class81[] field1166;

    @ObfuscatedName("bi.cv")
    public static char field1167;

    @ObfuscatedName("bi.f")
    public static class167 field1171;

    @ObfuscatedName("bg.f")
    public static class54 field1173;

    @ObfuscatedName("bk.m")
    public static int field1180;

    @ObfuscatedName("bk.t")
    public static class73 field1181;

    @ObfuscatedName("bk.g")
    public static boolean field1195;

    @ObfuscatedName("bk.bv")
    public static int field1199;

    @ObfuscatedName("j.nb")
    public static int field121;

    @ObfuscatedName("bl.ba")
    public static class168 field1219;

    @ObfuscatedName("bl.l")
    public static byte[][] field1223;

    @ObfuscatedName("bl.v")
    public static class180 field1226;

    @ObfuscatedName("bn.l")
    public static int field1244;

    @ObfuscatedName("bn.n")
    public static float field1248;

    @ObfuscatedName("bw.i")
    public static int[] field1282;

    @ObfuscatedName("bw.w")
    public static int[] field1283;

    @ObfuscatedName("bw.v")
    public static boolean[] field1284;

    @ObfuscatedName("j.bn")
    public static class168 field129;

    @ObfuscatedName("bc.c")
    public static float[] field1293;

    @ObfuscatedName("bc.z")
    public static boolean[] field1296;

    @ObfuscatedName("bc.j")
    public static byte[] field1297;

    @ObfuscatedName("j.hs")
    public static int field130;

    @ObfuscatedName("bc.n")
    public static int field1300;

    @ObfuscatedName("bc.l")
    public static int field1301;

    @ObfuscatedName("bc.i")
    public static int field1302;

    @ObfuscatedName("bc.w")
    public static int field1303;

    @ObfuscatedName("bc.v")
    public static class74[] field1304;

    @ObfuscatedName("bc.af")
    public static float[] field1305;

    @ObfuscatedName("bc.p")
    public static class61[] field1306;

    @ObfuscatedName("bc.b")
    public static class69[] field1307;

    @ObfuscatedName("bc.au")
    public static float[] field1309;

    @ObfuscatedName("bc.o")
    public static class68[] field1310;

    @ObfuscatedName("bc.k")
    public static int[] field1313;

    @ObfuscatedName("bc.y")
    public static float[] field1315;

    @ObfuscatedName("bc.h")
    public static float[] field1317;

    @ObfuscatedName("bc.e")
    public static float[] field1318;

    @ObfuscatedName("bc.ab")
    public static float[] field1319;

    @ObfuscatedName("j.lt")
    public static class130 field132;

    @ObfuscatedName("bc.ae")
    public static int[] field1322;

    @ObfuscatedName("bc.ax")
    public static int[] field1324;

    @ObfuscatedName("n.bt")
    public static class168 field133;

    @ObfuscatedName("bs.ky")
    public static class131 field1358;

    @ObfuscatedName("n.ad")
    public static long field136;

    @ObfuscatedName("bb.el")
    public static class79 field1373;

    @ObfuscatedName("bb.ef")
    public static class79[] field1374;

    @ObfuscatedName("bb.ec")
    public static class79[] field1380;

    @ObfuscatedName("bv.j")
    public static int[] field1384;

    @ObfuscatedName("bj.s")
    public static int field1392;

    @ObfuscatedName("bj.q")
    public static int field1393;

    @ObfuscatedName("bj.m")
    public static int[] field1395;

    @ObfuscatedName("bj.j")
    public static class79 field1396;

    @ObfuscatedName("bj.cs")
    public static class146 field1398;

    @ObfuscatedName("bj.g")
    public static int[] field1399;

    @ObfuscatedName("n.as")
    public static class168 field140;

    @ObfuscatedName("bj.f")
    public static int field1400;

    @ObfuscatedName("by.i")
    public static class81 field1406;

    @ObfuscatedName("cr.b")
    public static int field1423;

    @ObfuscatedName("cr.p")
    public static int field1424;

    @ObfuscatedName("cr.o")
    public static int[] field1426;

    @ObfuscatedName("cd.b")
    public static int[] field1446;

    @ObfuscatedName("cg.n")
    public static int field1457;

    @ObfuscatedName("cl.bx")
    public static int field1466;

    @ObfuscatedName("cl.h")
    public static int field1471;

    @ObfuscatedName("cl.k")
    public static int field1480;

    @ObfuscatedName("cl.d")
    public static int field1481;

    @ObfuscatedName("cl.u")
    public static int field1482;

    @ObfuscatedName("cl.a")
    public static int field1483;

    @ObfuscatedName("cl.x")
    public static int field1484;

    @ObfuscatedName("cl.y")
    public static int field1485;

    @ObfuscatedName("cl.c")
    public static int field1486;

    @ObfuscatedName("cl.e")
    public static int field1488;

    @ObfuscatedName("cl.ab")
    public static int field1489;

    @ObfuscatedName("cl.af")
    public static int field1490;

    @ObfuscatedName("cl.au")
    public static int field1491;

    @ObfuscatedName("cl.ae")
    public static int field1492;

    @ObfuscatedName("cl.bu")
    public static int field1496;

    @ObfuscatedName("cl.bq")
    public static int field1502;

    @ObfuscatedName("cl.r")
    public static int field1512;

    @ObfuscatedName("cl.br")
    public static boolean[][] field1518;

    @ObfuscatedName("cl.bk")
    public static int field1519;

    @ObfuscatedName("l.be")
    public static class168 field152;

    @ObfuscatedName("cl.bp")
    public static int field1520;

    @ObfuscatedName("cl.bl")
    public static int field1522;

    @ObfuscatedName("cy.iq")
    public static class31 field1527;

    @ObfuscatedName("cy.np")
    public static class57 field1536;

    @ObfuscatedName("cy.eq")
    public static class79[] field1539;

    @ObfuscatedName("l.bk")
    public static class168 field155;

    @ObfuscatedName("i.ii")
    public static class173 field156;

    @ObfuscatedName("ck.s")
    public static class167 field1565;

    @ObfuscatedName("ck.dw")
    public static int field1566;

    @ObfuscatedName("cm.w")
    public static int field1577;

    @ObfuscatedName("cm.v")
    public static int field1578;

    @ObfuscatedName("i.qj")
    public static int field158;

    @ObfuscatedName("cm.a")
    public static int field1580;

    @ObfuscatedName("cm.x")
    public static int field1581;

    @ObfuscatedName("cm.y")
    public static int field1582;

    @ObfuscatedName("cm.u")
    public static int field1583;

    @ObfuscatedName("cm.h")
    public static int field1584;

    @ObfuscatedName("cm.af")
    public static class92 field1587;

    @ObfuscatedName("cm.c")
    public static int field1590;

    @ObfuscatedName("i.pn")
    public static class221 field161;

    @ObfuscatedName("ci.d")
    public static int[] field1619;

    @ObfuscatedName("cn.p")
    public static String field1628;

    @ObfuscatedName("cn.bi")
    public static class81[] field1629;

    @ObfuscatedName("i.co")
    public static class224 field166;

    @ObfuscatedName("cf.qt")
    public static Image field1678;

    @ObfuscatedName("w.nh")
    public static int field172;

    @ObfuscatedName("w.nv")
    public static int field174;

    @ObfuscatedName("ce.af")
    public static int[] field1742;

    @ObfuscatedName("ce.bs")
    public static int field1749;

    @ObfuscatedName("w.b")
    public static String field175;

    @ObfuscatedName("ce.bp")
    public static class168 field1751;

    @ObfuscatedName("ce.nz")
    public static int field1755;

    @ObfuscatedName("v.qx")
    public static Canvas field176;

    @ObfuscatedName("co.et")
    public static class79 field1762;

    @ObfuscatedName("co.l")
    public static class81[] field1767;

    @ObfuscatedName("co.gp")
    public static class173 field1768;

    @ObfuscatedName("v.dn")
    public static byte[][] field177;

    @ObfuscatedName("cz.fs")
    public static int field1773;

    @ObfuscatedName("ch.dt")
    public static class86 field1793;

    @ObfuscatedName("ch.iu")
    public static class173 field1794;

    @ObfuscatedName("du.bg")
    public static int field1816;

    @ObfuscatedName("v.eg")
    public static class79[] field184;

    @ObfuscatedName("du.bi")
    public static int field1847;

    @ObfuscatedName("du.be")
    public static int field1848;

    @ObfuscatedName("v.x")
    public static String field185;

    @ObfuscatedName("db.t")
    public static int field1863;

    @ObfuscatedName("dc.i")
    public static int[] field1879;

    @ObfuscatedName("dz.nf")
    public static class56 field1900;

    @ObfuscatedName("df.rf")
    public static String field1905;

    @ObfuscatedName("df.mw")
    public static byte field1906;

    @ObfuscatedName("do.ct")
    public static int field1949;

    @ObfuscatedName("dq.qa")
    public static int field1956;

    @ObfuscatedName("dq.gy")
    public static int field1961;

    @ObfuscatedName("dd.gu")
    public static class173 field1965;

    @ObfuscatedName("dd.bi")
    public static class168 field1968;

    @ObfuscatedName("dd.ry")
    public static boolean field1969;

    @ObfuscatedName("o.aw")
    public static class146 field197;

    @ObfuscatedName("dd.n")
    public static short[][] field1970;

    @ObfuscatedName("dg.n")
    public static class154 field1974;

    @ObfuscatedName("dg.s")
    public static long field1975;

    @ObfuscatedName("dg.f")
    public static long field1979;

    @ObfuscatedName("o.bo")
    public static int field198;

    @ObfuscatedName("o.be")
    public static class81 field201;

    @ObfuscatedName("dr.w")
    public static class81 field2011;

    @ObfuscatedName("o.iy")
    public static int field202;

    @ObfuscatedName("dp.nl")
    public static int field2031;

    @ObfuscatedName("dw.pc")
    public static class160 field2041;

    @ObfuscatedName("dw.il")
    public static int field2044;

    @ObfuscatedName("dl.nd")
    public static int field2047;

    @ObfuscatedName("di.hy")
    public static int field2050;

    @ObfuscatedName("di.bq")
    public static class168 field2052;

    @ObfuscatedName("dh.hx")
    public static class3 field2054;

    @ObfuscatedName("dh.qu")
    public static class78 field2056;

    @ObfuscatedName("dm.pv")
    public static class9 field2060;

    @ObfuscatedName("dm.qn")
    public static class133 field2062;

    @ObfuscatedName("ew.b")
    public static int[][][] field2070;

    @ObfuscatedName("ew.ix")
    public static int field2071;

    @ObfuscatedName("ew.hv")
    public static int field2073;

    @ObfuscatedName("ew.ml")
    public static class25[] field2075;

    @ObfuscatedName("ew.u")
    public static int[] field2077;

    @ObfuscatedName("ey.s")
    public static File field2086;

    @ObfuscatedName("p.dg")
    public static int[] field209;

    @ObfuscatedName("ez.s")
    public static String field2097;

    @ObfuscatedName("p.n")
    public static int[] field210;

    @ObfuscatedName("ez.f")
    public static String field2102;

    @ObfuscatedName("p.k")
    public static String[] field212;

    @ObfuscatedName("eh.qw")
    public static int field2130;

    @ObfuscatedName("eh.db")
    public static int field2133;

    @ObfuscatedName("el.ff")
    public static int field2137;

    @ObfuscatedName("er.aq")
    public static class146 field2160;

    @ObfuscatedName("er.fe")
    public static int field2163;

    @ObfuscatedName("eu.qv")
    public static Font field2165;

    @ObfuscatedName("ef.qf")
    public static Frame field2189;

    @ObfuscatedName("ef.k")
    public static int field2195;

    @ObfuscatedName("em.i")
    public static int field2209;

    @ObfuscatedName("em.s")
    public static String field2210;

    @ObfuscatedName("em.q")
    public static int field2211;

    @ObfuscatedName("em.f")
    public static Applet field2213;

    @ObfuscatedName("em.fr")
    public static int field2214;

    @ObfuscatedName("b.ps")
    public static GarbageCollectorMXBean field222;

    @ObfuscatedName("eq.t")
    public static int field2222;

    @ObfuscatedName("eq.g")
    public static File field2223;

    @ObfuscatedName("eq.p")
    public static class228[] field2229;

    @ObfuscatedName("z.z")
    public static String[] field224;

    @ObfuscatedName("ev.pb")
    public static class136 field2245;

    @ObfuscatedName("ed.ds")
    public static byte[][] field2255;

    @ObfuscatedName("ed.kw")
    public static int field2256;

    @ObfuscatedName("ei.u")
    public static String field2264;

    @ObfuscatedName("z.t")
    public static class79 field227;

    @ObfuscatedName("ei.dx")
    public static int[] field2277;

    @ObfuscatedName("ej.bz")
    public static String field2285;

    @ObfuscatedName("s.pt")
    public static short[] field24;

    @ObfuscatedName("k.ev")
    public static class81[] field244;

    @ObfuscatedName("k.ms")
    public static int field245;

    @ObfuscatedName("r.ng")
    public static int field253;

    @ObfuscatedName("fe.du")
    public static int field2576;

    @ObfuscatedName("fr.im")
    public static int field2584;

    @ObfuscatedName("s.jj")
    public static int field26;

    @ObfuscatedName("fg.m")
    public static class81[] field2622;

    @ObfuscatedName("fp.i")
    public static class19 field2628;

    @ObfuscatedName("fv.p")
    public static class172 field2633;

    @ObfuscatedName("fm.a")
    public static String field2645;

    @ObfuscatedName("fo.h")
    public static int[] field2648;

    @ObfuscatedName("fo.m")
    public static byte[][][] field2650;

    @ObfuscatedName("d.u")
    public static class119 field266;

    @ObfuscatedName("fb.eb")
    public static class79[] field2682;

    @ObfuscatedName("ft.t")
    public static byte[][][] field2688;

    @ObfuscatedName("fz.t")
    public static class153 field2699;

    @ObfuscatedName("fs.q")
    public static long field2704;

    @ObfuscatedName("fs.f")
    public static class143 field2706;

    @ObfuscatedName("d.ja")
    public static int field271;

    @ObfuscatedName("fs.bb")
    public static int field2715;

    @ObfuscatedName("fs.o")
    public static boolean field2718;

    @ObfuscatedName("fq.m")
    public static class26[] field2727;

    @ObfuscatedName("fq.hk")
    public static int field2730;

    @ObfuscatedName("fd.g")
    public static class167 field2736;

    @ObfuscatedName("fd.m")
    public static class167 field2737;

    @ObfuscatedName("fd.s")
    public static boolean[] field2753;

    @ObfuscatedName("d.a")
    public static int[] field277;

    @ObfuscatedName("d.z")
    public static class119 field278;

    @ObfuscatedName("fd.q")
    public static class167 field2783;

    @ObfuscatedName("d.cl")
    public static class143 field280;

    @ObfuscatedName("fd.f")
    public static class173[][] field2803;

    @ObfuscatedName("u.po")
    public static class134 field288;

    @ObfuscatedName("fy.m")
    public static File field2893;

    @ObfuscatedName("fy.cx")
    public static class224 field2896;

    @ObfuscatedName("fy.i")
    public static short[][] field2897;

    @ObfuscatedName("fj.ji")
    public static class173[] field2898;

    @ObfuscatedName("fw.z")
    public static int field2905;

    @ObfuscatedName("fa.l")
    public static short[] field2913;

    @ObfuscatedName("fa.av")
    public static int field2917;

    @ObfuscatedName("u.eo")
    public static class81[] field293;

    @ObfuscatedName("gg.j")
    public static int field2944;

    @ObfuscatedName("gg.f")
    public static class167 field2946;

    @ObfuscatedName("gg.t")
    public static class167 field2947;

    @ObfuscatedName("gg.q")
    public static class167 field2948;

    @ObfuscatedName("gg.o")
    public static class60 field2949;

    @ObfuscatedName("client.s")
    public static client field297;

    @ObfuscatedName("go.cy")
    public static class143 field3057;

    @ObfuscatedName("client.at")
    public static boolean field306;

    @ObfuscatedName("hw.ek")
    public static class79[] field3108;

    @ObfuscatedName("hx.ag")
    public static class79[] field3109;

    @ObfuscatedName("hl.g")
    public static class184 field3134;

    @ObfuscatedName("hl.m")
    public static class167 field3135;

    @ObfuscatedName("ht.t")
    public static class167 field3152;

    @ObfuscatedName("ha.q")
    public static int field3153;

    @ObfuscatedName("hc.l")
    public static int[][] field3161;

    @ObfuscatedName("hf.f")
    public static class113 field3168;

    @ObfuscatedName("hp.i")
    public static class81[] field3178;

    @ObfuscatedName("hz.al")
    public static class168 field3195;

    @ObfuscatedName("hd.g")
    public static byte[][][] field3196;

    @ObfuscatedName("hd.v")
    public static int[] field3197;

    @ObfuscatedName("hd.l")
    public static class212 field3198;

    @ObfuscatedName("client.c")
    public static class14 field364;

    @ObfuscatedName("client.ap")
    public static class143 field405;

    @ObfuscatedName("client.em")
    public static class79[] field536;

    @ObfuscatedName("q.fg")
    public static int field55;

    @ObfuscatedName("a.dc")
    public static int field591;

    @ObfuscatedName("x.bf")
    public static FontMetrics field598;

    @ObfuscatedName("y.bx")
    public static class168 field603;

    @ObfuscatedName("g.l")
    public static int field63;

    @ObfuscatedName("c.ny")
    public static class75 field630;

    @ObfuscatedName("e.nc")
    public static int field654;

    @ObfuscatedName("ab.h")
    public static int[] field657;

    @ObfuscatedName("ab.s")
    public static class167 field664;

    @ObfuscatedName("ab.b")
    public static int field668;

    @ObfuscatedName("af.w")
    public static boolean field673;

    @ObfuscatedName("au.n")
    public static class81 field680;

    @ObfuscatedName("au.dd")
    public static int[] field685;

    @ObfuscatedName("ae.pl")
    public static long field695;

    @ObfuscatedName("ae.p")
    public static int[] field696;

    @ObfuscatedName("ae.dl")
    public static int field700;

    @ObfuscatedName("ax.ie")
    public static int field712;

    @ObfuscatedName("az.q")
    public static class81 field715;

    @ObfuscatedName("az.g")
    public static class81 field716;

    @ObfuscatedName("az.x")
    public static int[] field721;

    @ObfuscatedName("az.f")
    public static boolean field724;

    @ObfuscatedName("az.ab")
    public static int[] field725;

    @ObfuscatedName("az.as")
    public static class81[] field735;

    @ObfuscatedName("az.ai")
    public static String field738;

    @ObfuscatedName("m.pr")
    public static int field74;

    @ObfuscatedName("az.al")
    public static class81[] field745;

    @ObfuscatedName("m.m")
    public static int field75;

    @ObfuscatedName("aa.dk")
    public static int[][] field756;

    @ObfuscatedName("aa.qo")
    public static int field759;

    @ObfuscatedName("m.e")
    public static int[] field76;

    @ObfuscatedName("ak.w")
    public static class173 field777;

    @ObfuscatedName("ak.nu")
    public static int field785;

    @ObfuscatedName("ac.t")
    public static int[] field787;

    @ObfuscatedName("ac.py")
    public static int field788;

    @ObfuscatedName("ac.qm")
    public static int field791;

    @ObfuscatedName("ah.q")
    public static int[] field799;

    @ObfuscatedName("m.j")
    public static short[] field80;

    @ObfuscatedName("ah.g")
    public static String[] field800;

    @ObfuscatedName("ah.dz")
    public static int field805;

    @ObfuscatedName("ah.v")
    public static class173 field809;

    @ObfuscatedName("t.fp")
    public static int field83;

    @ObfuscatedName("t.j")
    public static byte[][][] field84;

    @ObfuscatedName("an.gr")
    public static class173 field842;

    @ObfuscatedName("t.n")
    public static byte[][][] field85;

    @ObfuscatedName("t.w")
    public static int[] field87;

    @ObfuscatedName("aq.qh")
    public static int field882;

    @ObfuscatedName("aq.bl")
    public static class168 field883;

    @ObfuscatedName("at.s")
    public static class167 field885;

    @ObfuscatedName("at.f")
    public static class167 field894;

    @ObfuscatedName("at.mh")
    public static class79 field921;

    @ObfuscatedName("at.nx")
    public static int field923;

    @ObfuscatedName("am.s")
    public static class167 field925;

    @ObfuscatedName("am.q")
    public static class167 field948;

    @ObfuscatedName("t.ag")
    public static class168 field96;

    @ObfuscatedName("t.pg")
    public static int field97;

    @ObfuscatedName("am.qy")
    public static int field976;

    @ObfuscatedName("av.f")
    public static class167 field981;

    @ObfuscatedName("av.o")
    public static int[] field984;

    @ObfuscatedName("ai.q")
    public static class167 field989;

    @ObfuscatedName("ai.f")
    public static class167 field994;

    @ObfuscatedName("dc.f(Ldq;B)V")
    public static void method2236(class113 arg0) {
        field3168 = arg0;
    }

    @ObfuscatedName("v.f(II)Lbi;")
    public static class53 method146(int arg0) {
        class53 var1 = (class53) class53.field1165.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1171.method3038(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1068(new class119(var2));
        }
        class53.field1165.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ew.f(Lfx;I)V")
    public static void method2689(class167 arg0) {
        field1054 = arg0;
    }

    @ObfuscatedName("ak.f(Lfx;Lfx;I)V")
    public static void method707(class167 arg0, class167 arg1) {
        field1037 = arg0;
        field1032 = arg1;
        field1039 = field1037.method3047(3);
    }

    @ObfuscatedName("ax.f(II)Lai;")
    public static class43 method653(int arg0) {
        class43 var1 = (class43) class43.field990.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field994.method3038(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method846(new class119(var2));
        }
        var3.method877();
        class43.field990.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fr.q(Lda;I)V")
    public static void method2936(class122 arg0) {
        class210 var1 = (class210) class211.field3121.method3608();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1994;
        arg0.method2351(var1.field3110);
        for (int var3 = 0; var3 < var1.field3117; var3++) {
            if (var1.field3112[var3] == 0) {
                try {
                    int var4 = var1.field3111[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3113[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2426(0);
                        arg0.method2351(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3113[var3];
                        var7.setInt((Object) null, var1.field3114[var3]);
                        arg0.method2426(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3113[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2426(0);
                        arg0.method2351(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3115[var3];
                        byte[][] var11 = var1.field3116[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2426(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2426(1);
                            arg0.method2442(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2426(2);
                            arg0.method2354((String) var15);
                        } else {
                            arg0.method2426(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3115[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2426(0);
                        arg0.method2351(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2426(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2426(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2426(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2426(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2426(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2426(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2426(-16);
                } catch (SecurityException var37) {
                    arg0.method2426(-17);
                } catch (IOException var38) {
                    arg0.method2426(-18);
                } catch (NullPointerException var39) {
                    arg0.method2426(-19);
                } catch (Exception var40) {
                    arg0.method2426(-20);
                } catch (Throwable var41) {
                    arg0.method2426(-21);
                }
            } else {
                arg0.method2426(var1.field3112[var3]);
            }
        }
        arg0.method2474(var2);
        var1.method3665();
    }

    @ObfuscatedName("ao.f(IB)Las;")
    public static class52 method975(int arg0) {
        class52 var1 = (class52) class52.field1115.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1112.method3038(10, arg0);
        class52 var3 = new class52();
        var3.field1119 = arg0;
        if (var2 != null) {
            var3.method1013(new class119(var2));
        }
        var3.method1048();
        if (var3.field1160 != -1) {
            var3.method1047(method975(var3.field1160), method975(var3.field1151));
        }
        if (var3.field1161 != -1) {
            var3.method1016(method975(var3.field1161), method975(var3.field1147));
        }
        if (!field1148 && var3.field1134) {
            var3.field1117 = class157.field2353;
            var3.field1123 = false;
            var3.field1135 = null;
            var3.field1127 = null;
            var3.field1121 = 0;
        }
        class52.field1115.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fp.q(IIIII)V")
    public static final void method2966(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    field85[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        class6.field81[0][var5][var4] = class6.field81[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class6.field81[0][var5][var4] = class6.field81[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        class6.field81[0][var5][var4] = class6.field81[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        class6.field81[0][var5][var4] = class6.field81[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.g([BIII)Ljava/lang/String;")
    public static String method2934(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = class165.field2641[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }
                    var6 = var7;
                }
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @ObfuscatedName("ek.n(Ljava/lang/CharSequence;I)I")
    public static int method2822(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class165.method176(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("ew.i(Lfx;III)Z")
    public static boolean method2690(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3038(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            class77.method815(var3);
            return true;
        }
    }

    @ObfuscatedName("au.t(Ldn;IIIIIIB)V")
    public static final void method642(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2363();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2363();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2363();
                }
            }
            return;
        }
        class6.field91[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2363();
            if (var7 == 0) {
                if (arg1 == 0) {
                    class6.field81[0][arg2][arg3] = -class6.method2653(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    class6.field81[arg1][arg2][arg3] = class6.field81[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2363();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    class6.field81[0][arg2][arg3] = -var8 * 8;
                } else {
                    class6.field81[arg1][arg2][arg3] = class6.field81[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                field2650[arg1][arg2][arg3] = arg0.method2364();
                field2688[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                field84[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                class6.field91[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                field3196[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cn.j([BIII)Z")
    public static final boolean method2057(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2376();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2376();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2363() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method1009(var5);
                        if (var13 != 22 || !client.field303 || var16.field944 != 0 || var16.field973 == 1 || var16.field963) {
                            if (!var16.method775()) {
                                client.field356++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2376();
                if (var9 == 0) {
                    break;
                }
                var4.method2363();
            }
        }
    }

    @ObfuscatedName("fr.l(B)V")
    public static void method2935() {
        class40.field886.method3499();
        class40.field887.method3499();
    }

    @ObfuscatedName("ao.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method976(String arg0, String arg1, String arg2) {
        class32.field732 = arg0;
        class32.field737 = arg1;
        class32.field734 = arg2;
    }

    @ObfuscatedName("ci.am(IIIIZI)V")
    public static final void method2054(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (client.field307 - client.field551) * var5 / 100 + client.field551;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < client.field557) {
            short var8 = client.field557;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > client.field561) {
                var6 = client.field561;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1748();
                    class80.method1746(arg0, arg1, var10, arg3, -16777216);
                    class80.method1746(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > client.field558) {
            short var11 = client.field558;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < client.field555) {
                var6 = client.field555;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1748();
                    class80.method1746(arg0, arg1, arg2, var13, -16777216);
                    class80.method1746(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (client.field554 - client.field553) * var5 / 100 + client.field553;
        client.field563 = arg3 * var6 * var14 / 85504 << 1;
        if (client.field437 != arg2 || client.field562 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1579[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1823(var15, 500, 800, arg2, arg3);
        }
        client.field559 = arg0;
        client.field560 = arg1;
        client.field437 = arg2;
        client.field562 = arg3;
    }

    @ObfuscatedName("ae.bf(Lk;I)V")
    public static final void method651(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field233 == 0) {
            var1 = field1793.method1814(arg0.field242, arg0.field243, arg0.field249);
        }
        if (arg0.field233 == 1) {
            var1 = field1793.method1815(arg0.field242, arg0.field243, arg0.field249);
        }
        if (arg0.field233 == 2) {
            var1 = field1793.method1816(arg0.field242, arg0.field243, arg0.field249);
        }
        if (arg0.field233 == 3) {
            var1 = field1793.method1817(arg0.field242, arg0.field243, arg0.field249);
        }
        if (var1 != 0) {
            int var5 = field1793.method1853(arg0.field242, arg0.field243, arg0.field249, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field236 = var2;
        arg0.field232 = var3;
        arg0.field237 = var4;
    }

    @ObfuscatedName("p.bb(II)Z")
    public static final boolean method153(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = client.field329[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("eo.ch(III)V")
    public static final void method2920(int arg0, int arg1) {
        if (class173.method584(arg0)) {
            client.method189(field2803[arg0], arg1);
        }
    }

    @ObfuscatedName("cg.df(Lfd;I)V")
    public static void method1777(class173 arg0) {
        if (client.field501 == arg0.field2857) {
            client.field502[arg0.field2771] = true;
        }
    }

    @ObfuscatedName("l.dn(IIIILcp;Lfy;I)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            client.method5(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = client.field489 + client.field347 & 0x7FF;
        int var8 = class91.field1579[var7];
        int var9 = class91.field1591[var7];
        int var10 = var8 * 256 / (client.field372 + 256);
        int var11 = var9 * 256 / (client.field372 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        field1762.method1657(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }
}
