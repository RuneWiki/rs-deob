package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.RandomAccessFile;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Statics {

    @ObfuscatedName("f.cw")
    public static int field10;

    @ObfuscatedName("r.mm")
    public static class86 field100;

    @ObfuscatedName("aq.f")
    public static class153 field1009;

    @ObfuscatedName("aq.dt")
    public static int field1013;

    @ObfuscatedName("ap.f")
    public static class153 field1015;

    @ObfuscatedName("ap.pk")
    public static boolean field1017;

    @ObfuscatedName("r.aw")
    public static class155 field102;

    @ObfuscatedName("ar.nu")
    public static int field1022;

    @ObfuscatedName("ar.f")
    public static class153 field1025;

    @ObfuscatedName("az.f")
    public static class43 field1029;

    @ObfuscatedName("ae.s")
    public static boolean[] field1055;

    @ObfuscatedName("k.ez")
    public static class87[] field106;

    @ObfuscatedName("ae.o")
    public static int[] field1061;

    @ObfuscatedName("ae.g")
    public static int[] field1065;

    @ObfuscatedName("ak.k")
    public static class55 field1076;

    @ObfuscatedName("ak.l")
    public static int field1089;

    @ObfuscatedName("ak.hf")
    public static int field1092;

    @ObfuscatedName("bg.s")
    public static class60[] field1101;

    @ObfuscatedName("bg.r")
    public static byte[] field1102;

    @ObfuscatedName("bg.a")
    public static int[] field1103;

    @ObfuscatedName("bg.i")
    public static float[] field1107;

    @ObfuscatedName("bg.u")
    public static int field1109;

    @ObfuscatedName("k.oy")
    public static class68 field111;

    @ObfuscatedName("bg.g")
    public static int field1111;

    @ObfuscatedName("bg.o")
    public static int field1112;

    @ObfuscatedName("bg.b")
    public static class49[] field1113;

    @ObfuscatedName("bg.v")
    public static class59[] field1114;

    @ObfuscatedName("bg.ai")
    public static int[] field1115;

    @ObfuscatedName("bg.k")
    public static int field1116;

    @ObfuscatedName("bg.q")
    public static boolean[] field1117;

    @ObfuscatedName("bg.ad")
    public static float[] field1118;

    @ObfuscatedName("bg.j")
    public static class50[] field1123;

    @ObfuscatedName("bg.x")
    public static float[] field1124;

    @ObfuscatedName("bg.p")
    public static float[] field1125;

    @ObfuscatedName("bg.y")
    public static float[] field1126;

    @ObfuscatedName("bg.aa")
    public static float[] field1127;

    @ObfuscatedName("bg.ax")
    public static float[] field1128;

    @ObfuscatedName("bg.af")
    public static int[] field1130;

    @ObfuscatedName("u.r")
    public static byte[][][] field114;

    @ObfuscatedName("bw.pg")
    public static int field1161;

    @ObfuscatedName("bw.py")
    public static int field1169;

    @ObfuscatedName("u.e")
    public static byte[][][] field117;

    @ObfuscatedName("bw.hx")
    public static int field1171;

    @ObfuscatedName("f.w")
    public static String field12;

    @ObfuscatedName("u.s")
    public static int[] field121;

    @ObfuscatedName("ba.n")
    public static int field1210;

    @ObfuscatedName("ba.oh")
    public static class74 field1214;

    @ObfuscatedName("bs.k")
    public static float field1227;

    @ObfuscatedName("u.b")
    public static int[] field123;

    @ObfuscatedName("bs.u")
    public static int field1232;

    @ObfuscatedName("bd.u")
    public static short[] field1236;

    @ObfuscatedName("bd.du")
    public static int[] field1239;

    @ObfuscatedName("bh.ir")
    public static int field1245;

    @ObfuscatedName("bh.nx")
    public static int field1247;

    @ObfuscatedName("bb.mk")
    public static byte field1251;

    @ObfuscatedName("bb.az")
    public static class87[] field1253;

    @ObfuscatedName("bb.is")
    public static int field1257;

    @ObfuscatedName("bv.j")
    public static int[] field1258;

    @ObfuscatedName("bv.dw")
    public static int[] field1264;

    @ObfuscatedName("bv.t")
    public static int field1267;

    @ObfuscatedName("u.j")
    public static int[][][] field128;

    @ObfuscatedName("bz.mq")
    public static class8[] field1280;

    @ObfuscatedName("bz.es")
    public static class86[] field1281;

    @ObfuscatedName("bl.pj")
    public static class85 field1289;

    @ObfuscatedName("bl.d")
    public static class153 field1292;

    @ObfuscatedName("bu.nh")
    public static int field1295;

    @ObfuscatedName("bu.t")
    public static File field1299;

    @ObfuscatedName("u.bg")
    public static class155 field130;

    @ObfuscatedName("bu.cv")
    public static char field1301;

    @ObfuscatedName("bm.d")
    public static class133 field1317;

    @ObfuscatedName("bj.ec")
    public static class86[] field1319;

    @ObfuscatedName("u.o")
    public static int[] field132;

    @ObfuscatedName("bj.t")
    public static String field1328;

    @ObfuscatedName("u.lf")
    public static class138 field133;

    @ObfuscatedName("bj.o")
    public static int field1330;

    @ObfuscatedName("u.k")
    public static byte[][][] field134;

    @ObfuscatedName("be.x")
    public static int[] field1378;

    @ObfuscatedName("be.fu")
    public static int field1389;

    @ObfuscatedName("cj.bi")
    public static class155 field1400;

    @ObfuscatedName("cj.f")
    public static Applet field1401;

    @ObfuscatedName("cj.n")
    public static String field1404;

    @ObfuscatedName("cj.e")
    public static int[] field1406;

    @ObfuscatedName("ca.aj")
    public static class155 field1413;

    @ObfuscatedName("ca.cz")
    public static int field1414;

    @ObfuscatedName("ca.d")
    public static int field1415;

    @ObfuscatedName("ca.a")
    public static String[] field1421;

    @ObfuscatedName("ca.hs")
    public static class3 field1424;

    @ObfuscatedName("ca.l")
    public static File field1427;

    @ObfuscatedName("cp.a")
    public static int[] field1430;

    @ObfuscatedName("cu.f")
    public static int field1436;

    @ObfuscatedName("cu.t")
    public static int field1437;

    @ObfuscatedName("cu.l")
    public static int[] field1438;

    @ObfuscatedName("cu.r")
    public static int[] field1439;

    @ObfuscatedName("cu.d")
    public static int[] field1440;

    @ObfuscatedName("cu.k")
    public static int[] field1441;

    @ObfuscatedName("cu.eh")
    public static class87[] field1443;

    @ObfuscatedName("cc.j")
    public static int field1478;

    @ObfuscatedName("cc.b")
    public static int[] field1479;

    @ObfuscatedName("cc.v")
    public static int field1482;

    @ObfuscatedName("cx.j")
    public static int[] field1499;

    @ObfuscatedName("co.r")
    public static class87 field1503;

    @ObfuscatedName("co.az")
    public static long field1504;

    @ObfuscatedName("co.bf")
    public static FontMetrics field1506;

    @ObfuscatedName("cr.p")
    public static int field1545;

    @ObfuscatedName("cr.y")
    public static int field1547;

    @ObfuscatedName("cr.c")
    public static int field1562;

    @ObfuscatedName("cr.m")
    public static int field1563;

    @ObfuscatedName("cr.w")
    public static int field1565;

    @ObfuscatedName("cr.ba")
    public static int field1566;

    @ObfuscatedName("cr.x")
    public static int field1568;

    @ObfuscatedName("cr.by")
    public static int field1569;

    @ObfuscatedName("cr.i")
    public static int field1570;

    @ObfuscatedName("cr.z")
    public static int field1571;

    @ObfuscatedName("cr.ax")
    public static int field1572;

    @ObfuscatedName("cr.ad")
    public static int field1573;

    @ObfuscatedName("cr.aa")
    public static int field1575;

    @ObfuscatedName("cr.bk")
    public static int field1576;

    @ObfuscatedName("cr.bo")
    public static int field1578;

    @ObfuscatedName("cr.h")
    public static int field1587;

    @ObfuscatedName("cr.ai")
    public static int field1591;

    @ObfuscatedName("cr.bn")
    public static boolean[][] field1601;

    @ObfuscatedName("cr.af")
    public static int field1602;

    @ObfuscatedName("cr.bi")
    public static int field1604;

    @ObfuscatedName("cr.bt")
    public static int field1607;

    @ObfuscatedName("cl.fn")
    public static int field1646;

    @ObfuscatedName("ch.cs")
    public static int field1650;

    @ObfuscatedName("ch.s")
    public static class140 field1657;

    @ObfuscatedName("g.ap")
    public static class70 field169;

    @ObfuscatedName("g.bx")
    public static class70 field172;

    @ObfuscatedName("cm.kw")
    public static class66 field1744;

    @ObfuscatedName("cm.u")
    public static int[][] field1745;

    @ObfuscatedName("cm.jy")
    public static int field1746;

    @ObfuscatedName("cm.e")
    public static int field1747;

    @ObfuscatedName("cm.d")
    public static byte[][][] field1748;

    @ObfuscatedName("cm.eg")
    public static class86[] field1749;

    @ObfuscatedName("ct.s")
    public static int field1755;

    @ObfuscatedName("ct.x")
    public static int field1756;

    @ObfuscatedName("ct.y")
    public static int field1760;

    @ObfuscatedName("ct.z")
    public static int field1763;

    @ObfuscatedName("ct.w")
    public static int field1764;

    @ObfuscatedName("ct.h")
    public static int field1765;

    @ObfuscatedName("ct.p")
    public static int field1768;

    @ObfuscatedName("ct.g")
    public static int field1770;

    @ObfuscatedName("ct.ax")
    public static class106 field1771;

    @ObfuscatedName("dx.d")
    public static boolean field1778;

    @ObfuscatedName("s.q")
    public static String[] field179;

    @ObfuscatedName("t.be")
    public static class79 field18;

    @ObfuscatedName("dc.g")
    public static int[] field1802;

    @ObfuscatedName("dc.eu")
    public static class86[] field1807;

    @ObfuscatedName("dr.cq")
    public static class183 field1818;

    @ObfuscatedName("dr.b")
    public static boolean field1819;

    @ObfuscatedName("dr.v")
    public static class30[] field1820;

    @ObfuscatedName("s.om")
    public static class152 field183;

    @ObfuscatedName("s.ix")
    public static int field186;

    @ObfuscatedName("s.fh")
    public static int field188;

    @ObfuscatedName("s.bw")
    public static class155 field189;

    @ObfuscatedName("dp.bg")
    public static int field1894;

    @ObfuscatedName("dp.br")
    public static int field1895;

    @ObfuscatedName("dp.bw")
    public static int field1896;

    @ObfuscatedName("b.k")
    public static class87[] field190;

    @ObfuscatedName("dl.mp")
    public static class46 field1909;

    @ObfuscatedName("dh.ib")
    public static int field1914;

    @ObfuscatedName("dh.er")
    public static class86[] field1919;

    @ObfuscatedName("dj.fr")
    public static int field1971;

    @ObfuscatedName("b.bn")
    public static class155 field198;

    @ObfuscatedName("dt.el")
    public static class86[] field1982;

    @ObfuscatedName("dt.ex")
    public static class87 field1983;

    @ObfuscatedName("db.c")
    public static int[] field1986;

    @ObfuscatedName("b.dl")
    public static class95 field199;

    @ObfuscatedName("dy.b")
    public static class58 field1998;

    @ObfuscatedName("dy.cf")
    public static class70 field1999;

    @ObfuscatedName("b.og")
    public static int field200;

    @ObfuscatedName("dy.f")
    public static long field2000;

    @ObfuscatedName("dy.t")
    public static long field2003;

    @ObfuscatedName("dd.n")
    public static class153 field2005;

    @ObfuscatedName("dd.av")
    public static class87 field2007;

    @ObfuscatedName("dd.ah")
    public static class79 field2008;

    @ObfuscatedName("de.r")
    public static int field2027;

    @ObfuscatedName("dq.g")
    public static boolean field2029;

    @ObfuscatedName("ee.l")
    public static byte[][][] field2058;

    @ObfuscatedName("ew.nt")
    public static int field2074;

    @ObfuscatedName("em.hp")
    public static int field2086;

    @ObfuscatedName("em.da")
    public static int field2088;

    @ObfuscatedName("em.u")
    public static byte[][] field2089;

    @ObfuscatedName("j.g")
    public static class159 field227;

    @ObfuscatedName("j.eb")
    public static int[] field231;

    @ObfuscatedName("eg.ff")
    public static int field2333;

    @ObfuscatedName("eg.q")
    public static class127 field2335;

    @ObfuscatedName("el.ej")
    public static class86 field2345;

    @ObfuscatedName("ey.e")
    public static class142 field2347;

    @ObfuscatedName("ey.n")
    public static class153 field2348;

    @ObfuscatedName("ey.f")
    public static class153 field2349;

    @ObfuscatedName("j.pf")
    public static Image field235;

    @ObfuscatedName("ey.u")
    public static int field2351;

    @ObfuscatedName("ey.pb")
    public static Font field2355;

    @ObfuscatedName("q.mf")
    public static int field244;

    @ObfuscatedName("en.pr")
    public static int field2449;

    @ObfuscatedName("eb.au")
    public static class155 field2453;

    @ObfuscatedName("eb.h")
    public static String field2455;

    @ObfuscatedName("eb.f")
    public static String field2458;

    @ObfuscatedName("et.ms")
    public static class52 field2466;

    @ObfuscatedName("ed.w")
    public static int[] field2468;

    @ObfuscatedName("ed.nr")
    public static int field2469;

    @ObfuscatedName("ef.u")
    public static class186 field2474;

    @ObfuscatedName("q.ig")
    public static int field248;

    @ObfuscatedName("a.br")
    public static class155 field250;

    @ObfuscatedName("a.ny")
    public static class62 field253;

    @ObfuscatedName("eq.f")
    public static class70 field2534;

    @ObfuscatedName("eq.v")
    public static class156 field2541;

    @ObfuscatedName("eq.n")
    public static long field2550;

    @ObfuscatedName("c.c")
    public static class16 field256;

    @ObfuscatedName("fu.k")
    public static int field2576;

    @ObfuscatedName("fn.t")
    public static boolean[] field2588;

    @ObfuscatedName("fn.e")
    public static class153 field2590;

    @ObfuscatedName("fn.d")
    public static class153 field2592;

    @ObfuscatedName("c.ea")
    public static int field261;

    @ObfuscatedName("c.av")
    public static class155 field262;

    @ObfuscatedName("c.p")
    public static int[] field265;

    @ObfuscatedName("c.bp")
    public static int field266;

    @ObfuscatedName("m.pn")
    public static Canvas field268;

    @ObfuscatedName("fn.l")
    public static class153 field2681;

    @ObfuscatedName("fn.f")
    public static class159[][] field2693;

    @ObfuscatedName("fn.n")
    public static class153 field2711;

    @ObfuscatedName("ff.r")
    public static int field2719;

    @ObfuscatedName("m.pv")
    public static int field272;

    @ObfuscatedName("fi.nz")
    public static int field2725;

    @ObfuscatedName("fe.aj")
    public static class13[] field2731;

    @ObfuscatedName("fe.ow")
    public static class71 field2732;

    @ObfuscatedName("fm.as")
    public static class87[] field2735;

    @ObfuscatedName("fl.o")
    public static short[][] field2747;

    @ObfuscatedName("fl.k")
    public static short[][] field2748;

    @ObfuscatedName("m.jc")
    public static int field275;

    @ObfuscatedName("fl.r")
    public static short[] field2751;

    @ObfuscatedName("m.bb")
    public static int field278;

    @ObfuscatedName("fr.et")
    public static int[] field2789;

    @ObfuscatedName("fc.z")
    public static class127 field2830;

    @ObfuscatedName("gs.f")
    public static class120 field2831;

    @ObfuscatedName("gs.ak")
    public static class155 field2832;

    @ObfuscatedName("gs.z")
    public static String field2833;

    @ObfuscatedName("gf.o")
    public static class87[] field2843;

    @ObfuscatedName("gg.j")
    public static int field2868;

    @ObfuscatedName("gg.ao")
    public static class155 field2871;

    @ObfuscatedName("z.cl")
    public static int field289;

    @ObfuscatedName("z.bh")
    public static String field290;

    @ObfuscatedName("z.gw")
    public static class159 field293;

    @ObfuscatedName("w.d")
    public static class86 field296;

    @ObfuscatedName("w.n")
    public static class87 field298;

    @ObfuscatedName("w.l")
    public static class86 field299;

    @ObfuscatedName("w.f")
    public static boolean field300;

    @ObfuscatedName("w.y")
    public static int[] field307;

    @ObfuscatedName("w.t")
    public static class87 field308;

    @ObfuscatedName("t.lq")
    public static byte field31;

    @ObfuscatedName("w.r")
    public static class183 field316;

    @ObfuscatedName("w.q")
    public static int[] field320;

    @ObfuscatedName("w.e")
    public static File field329;

    @ObfuscatedName("w.ck")
    public static class183 field330;

    @ObfuscatedName("h.bc")
    public static class155 field345;

    @ObfuscatedName("h.cc")
    public static int field346;

    @ObfuscatedName("h.ek")
    public static int[] field347;

    @ObfuscatedName("y.gc")
    public static class159 field354;

    @ObfuscatedName("x.hc")
    public static int field363;

    @ObfuscatedName("p.mb")
    public static class52 field368;

    @ObfuscatedName("p.t")
    public static class153 field370;

    @ObfuscatedName("p.v")
    public static int[] field374;

    @ObfuscatedName("p.id")
    public static class159 field375;

    @ObfuscatedName("i.en")
    public static int[] field383;

    @ObfuscatedName("i.o")
    public static class159 field385;

    @ObfuscatedName("i.n")
    public static String[] field387;

    @ObfuscatedName("i.ay")
    public static class155 field389;

    @ObfuscatedName("i.t")
    public static int[] field391;

    @ObfuscatedName("i.nc")
    public static int field392;

    @ObfuscatedName("aa.gu")
    public static class159 field448;

    @ObfuscatedName("aa.hl")
    public static int field454;

    @ObfuscatedName("client.t")
    public static client field456;

    @ObfuscatedName("client.k")
    public static class134 field461;

    @ObfuscatedName("client.b")
    public static String field465;

    @ObfuscatedName("client.ae")
    public static class155 field488;

    @ObfuscatedName("client.by")
    public static class155 field489;

    @ObfuscatedName("n.jg")
    public static int field49;

    @ObfuscatedName("client.cd")
    public static class183 field510;

    @ObfuscatedName("client.em")
    public static class87[] field533;

    @ObfuscatedName("client.dr")
    public static int[][] field582;

    @ObfuscatedName("e.h")
    public static int[] field61;

    @ObfuscatedName("e.e")
    public static class87[] field62;

    @ObfuscatedName("e.ou")
    public static class12 field65;

    @ObfuscatedName("client.ew")
    public static class86 field669;

    @ObfuscatedName("ad.bv")
    public static int field736;

    @ObfuscatedName("ad.pp")
    public static Frame field740;

    @ObfuscatedName("ad.aw")
    public static class87[] field742;

    @ObfuscatedName("af.dn")
    public static byte[][] field759;

    @ObfuscatedName("d.aq")
    public static class79 field78;

    @ObfuscatedName("ai.np")
    public static int field795;

    @ObfuscatedName("ai.f")
    public static class153 field796;

    @ObfuscatedName("ai.dc")
    public static int[] field799;

    @ObfuscatedName("ai.t")
    public static class153 field800;

    @ObfuscatedName("ag.t")
    public static class153 field837;

    @ObfuscatedName("ag.ey")
    public static class86[] field851;

    @ObfuscatedName("ag.dp")
    public static byte[][] field854;

    @ObfuscatedName("an.fa")
    public static int field860;

    @ObfuscatedName("an.ap")
    public static class24 field862;

    @ObfuscatedName("an.f")
    public static class153 field864;

    @ObfuscatedName("an.na")
    public static int field866;

    @ObfuscatedName("ac.t")
    public static class153 field870;

    @ObfuscatedName("ac.n")
    public static class153 field874;

    @ObfuscatedName("ac.f")
    public static class153 field876;

    @ObfuscatedName("ac.jn")
    public static class159[] field888;

    @ObfuscatedName("ac.bo")
    public static class155 field889;

    @ObfuscatedName("al.t")
    public static class153 field895;

    @ObfuscatedName("al.f")
    public static class153 field910;

    @ObfuscatedName("at.t")
    public static class153 field917;

    @ObfuscatedName("at.f")
    public static class153 field922;

    @ObfuscatedName("at.n")
    public static int field924;

    @ObfuscatedName("at.if")
    public static class159 field928;

    @ObfuscatedName("ah.f")
    public static class153 field931;

    @ObfuscatedName("am.ar")
    public static class86[] field948;

    @ObfuscatedName("am.ev")
    public static class86[] field950;

    @ObfuscatedName("am.f")
    public static class153 field951;

    @ObfuscatedName("ab.f")
    public static class153 field955;

    @ObfuscatedName("aq.n")
    public static boolean field968;

    @ObfuscatedName("r.nm")
    public static int field97;

    @ObfuscatedName("aq.t")
    public static class153 field982;

    @ObfuscatedName("u.f(B)Lbh;")
    public static class66 method59() {
        try {
            return new class78();
        } catch (Throwable var1) {
            return null;
        }
    }

    @ObfuscatedName("ac.f(CI)B")
    public static byte method703(char arg0) {
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

    @ObfuscatedName("ag.t(III)Z")
    public static boolean method661(int arg0, int arg1) {
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @ObfuscatedName("k.t(Ljava/lang/String;I)Ljava/io/File;")
    public static File method57(String arg0) {
        if (!class72.field1297) {
            throw new RuntimeException("");
        }
        File var1 = (File) class72.field1296.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(field1299, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            class72.field1296.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ax.t(Ldj;IB)V")
    public static void method549(class116 arg0, int arg1) {
        while (true) {
            class181 var2 = (class181) class182.field2829.method3362();
            if (var2 == null) {
                return;
            }
            arg0.method2316(arg1);
            arg0.method2536(0);
            int var3 = arg0.field2033;
            arg0.method2447(var2.field2822);
            for (int var4 = 0; var4 < var2.field2818; var4++) {
                if (var2.field2820[var4] == 0) {
                    try {
                        int var5 = var2.field2819[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2821[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2536(0);
                            arg0.method2447(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2821[var4];
                            var8.setInt((Object) null, var2.field2826[var4]);
                            arg0.method2536(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2821[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2536(0);
                            arg0.method2447(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2823[var4];
                            byte[][] var12 = var2.field2824[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2536(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2536(1);
                                arg0.method2448(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2536(2);
                                arg0.method2449((String) var16);
                            } else {
                                arg0.method2536(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2823[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2536(0);
                            arg0.method2447(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2536(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2536(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2536(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2536(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2536(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2536(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2536(-16);
                    } catch (SecurityException var38) {
                        arg0.method2536(-17);
                    } catch (IOException var39) {
                        arg0.method2536(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2536(-19);
                    } catch (Exception var41) {
                        arg0.method2536(-20);
                    } catch (Throwable var42) {
                        arg0.method2536(-21);
                    }
                } else {
                    arg0.method2536(var2.field2820[var4]);
                }
            }
            arg0.method2477(var3);
            arg0.method2571(arg0.field2033 - var3);
            var2.method3374();
        }
    }

    @ObfuscatedName("em.k(I)V")
    public static void method2737() {
        try {
            if (class139.field2350 == 1) {
                int var0 = field2347.method2884();
                if (var0 > 0 && field2347.method2797()) {
                    int var1 = var0 - field1330;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    field2347.method2790(var1);
                    return;
                }
                field2347.method2796();
                field2347.method2794();
                if (field1292 == null) {
                    class139.field2350 = 0;
                } else {
                    class139.field2350 = 2;
                }
                field1657 = null;
                field1998 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            field2347.method2796();
            class139.field2350 = 0;
            field1657 = null;
            field1998 = null;
            field1292 = null;
        }
    }

    @ObfuscatedName("ai.t(III)Lfn;")
    public static class159 method606(int arg0, int arg1) {
        class159 var2 = class159.method2754(arg0);
        if (arg1 == -1) {
            return var2;
        } else if (var2 == null || var2.field2633 == null || arg1 >= var2.field2633.length) {
            return null;
        } else {
            return var2.field2633[arg1];
        }
    }

    @ObfuscatedName("s.g(CII)Ljava/lang/String;")
    public static String method119(char arg0, int arg1) {
        char[] var2 = new char[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            var2[var3] = arg0;
        }
        return new String(var2);
    }

    @ObfuscatedName("a.ow(B)V")
    public static final void method163() {
        field111.method1369();
        for (int var0 = 0; var0 < 32; var0++) {
            class73.field1310[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class73.field1311[var1] = 0L;
        }
        field200 = 0;
    }

    @ObfuscatedName("ai.s(I)V")
    public static void method624() {
        class32.field817.method3271();
        class32.field805.method3271();
        class32.field814.method3271();
        class32.field807.method3271();
    }

    @ObfuscatedName("n.b(IIIII)I")
    public static final int method11(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1775[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bf.at(Laa;I)V")
    public static final void method1543(class27 arg0) {
        if (arg0.field446 == 0) {
            return;
        }
        if (arg0.field419 != -1 && arg0.field419 < 32768) {
            class25 var1 = client.field495[arg0.field419];
            if (var1 != null) {
                int var2 = arg0.field401 - var1.field401;
                int var3 = arg0.field414 - var1.field414;
                if (var2 != 0 || var3 != 0) {
                    arg0.field424 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field419 >= 32768) {
            int var4 = arg0.field419 - 32768;
            if (client.field585 == var4) {
                var4 = 2047;
            }
            class3 var5 = client.field499[var4];
            if (var5 != null) {
                int var6 = arg0.field401 - var5.field401;
                int var7 = arg0.field414 - var5.field414;
                if (var6 != 0 || var7 != 0) {
                    arg0.field424 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field453 != 0 || arg0.field421 != 0) && (arg0.field447 == 0 || arg0.field440 > 0)) {
            int var8 = arg0.field401 - (arg0.field453 * 64 - field10 * 64 - field10 * 64);
            int var9 = arg0.field414 - (arg0.field421 * 64 - field289 * 64 - field289 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field424 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field453 = 0;
            arg0.field421 = 0;
        }
        int var10 = arg0.field424 - arg0.field416 & 0x7FF;
        if (var10 == 0) {
            arg0.field445 = 0;
            return;
        }
        arg0.field445++;
        if (var10 > 1024) {
            arg0.field416 -= arg0.field446;
            boolean var11 = true;
            if (var10 < arg0.field446 || var10 > 2048 - arg0.field446) {
                arg0.field416 = arg0.field424;
                var11 = false;
            }
            if (arg0.field422 == arg0.field417 && (arg0.field445 > 25 || var11)) {
                if (arg0.field407 == -1) {
                    arg0.field422 = arg0.field404;
                } else {
                    arg0.field422 = arg0.field407;
                }
            }
        } else {
            arg0.field416 += arg0.field446;
            boolean var12 = true;
            if (var10 < arg0.field446 || var10 > 2048 - arg0.field446) {
                arg0.field416 = arg0.field424;
                var12 = false;
            }
            if (arg0.field422 == arg0.field417 && (arg0.field445 > 25 || var12)) {
                if (arg0.field403 == -1) {
                    arg0.field422 = arg0.field404;
                } else {
                    arg0.field422 = arg0.field403;
                }
            }
        }
        arg0.field416 &= 0x7FF;
    }

    @ObfuscatedName("bf.bt(ILn;IB)V")
    public static final void method1560(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            arg1.field435 = client.field468.method2647();
            arg1.field437 = client.field468.method2481();
            arg1.field397 = client.field468.method2647();
            arg1.field438 = client.field468.method2481();
            arg1.field439 = client.field468.method2491() + client.field484;
            arg1.field431 = client.field468.method2539() + client.field484;
            arg1.field441 = client.field468.method2590();
            arg1.field447 = 1;
            arg1.field452 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field413 = client.field468.method2492();
            int var3 = client.field468.method2463();
            arg1.field434 = var3 >> 16;
            arg1.field433 = (var3 & 0xFFFF) + client.field484;
            arg1.field398 = 0;
            arg1.field432 = 0;
            if (arg1.field433 > client.field484) {
                arg1.field398 = -1;
            }
            if (arg1.field413 == 65535) {
                arg1.field413 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var4 = client.field468.method2590();
            int var5 = client.field468.method2481();
            arg1.method252(var4, var5, client.field484);
            arg1.field430 = client.field484 + 300;
            arg1.field409 = client.field468.method2590();
            arg1.field418 = client.field468.method2458();
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field419 = client.field468.method2539();
            if (arg1.field419 == 65535) {
                arg1.field419 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field453 = client.field468.method2492();
            arg1.field421 = client.field468.method2492();
        }
        if ((arg2 & 0x100) != 0) {
            int var6 = client.field468.method2481();
            int var7 = client.field468.method2458();
            arg1.method252(var6, var7, client.field484);
            arg1.field430 = client.field484 + 300;
            arg1.field409 = client.field468.method2458();
            arg1.field418 = client.field468.method2647();
        }
        if ((arg2 & 0x20) != 0) {
            int var8 = client.field468.method2481();
            byte[] var9 = new byte[var8];
            class127 var10 = new class127(var9);
            client.field468.method2609(var9, 0, var8);
            client.field555[arg0] = var10;
            arg1.method12(var10);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field410 = client.field468.method2636();
            if (arg1.field410.charAt(0) == '~') {
                arg1.field410 = arg1.field410.substring(1);
                client.method731(2, arg1.field45, arg1.field410);
            } else if (field1424 == arg1) {
                client.method731(2, arg1.field45, arg1.field410);
            }
            arg1.field429 = 0;
            arg1.field412 = 0;
            arg1.field449 = 150;
        }
        if ((arg2 & 0x10) != 0) {
            int var11 = client.field468.method2539();
            int var12 = client.field468.method2481();
            int var13 = client.field468.method2647();
            int var14 = client.field468.field2033;
            if (arg1.field45 != null && arg1.field48 != null) {
                boolean var15 = false;
                if (var12 <= 1 && client.method1401(arg1.field45)) {
                    var15 = true;
                }
                if (!var15 && client.field578 == 0) {
                    client.field707.field2033 = 0;
                    client.field468.method2502(client.field707.field2030, 0, var13);
                    client.field707.field2033 = 0;
                    class127 var16 = client.field707;
                    String var17 = class184.method2382(var16, 32767);
                    String var18 = class185.method3403(class148.method2306(var17));
                    arg1.field410 = var18.trim();
                    arg1.field429 = var11 >> 8;
                    arg1.field412 = var11 & 0xFF;
                    arg1.field449 = 150;
                    if (var12 == 2 || var12 == 3) {
                        client.method731(1, class2.method692(1) + arg1.field45, var18);
                    } else if (var12 == 1) {
                        client.method731(1, class2.method692(0) + arg1.field45, var18);
                    } else {
                        client.method731(2, arg1.field45, var18);
                    }
                }
            }
            client.field468.field2033 = var13 + var14;
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        int var19 = client.field468.method2492();
        if (var19 == 65535) {
            var19 = -1;
        }
        int var20 = client.field468.method2458();
        client.method1873(arg1, var19, var20);
    }

    @ObfuscatedName("v.bm(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method145(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (client.field535 || client.field602 >= 500) {
            return;
        }
        client.field525[client.field602] = arg0;
        client.field608[client.field602] = arg1;
        client.field605[client.field602] = arg2;
        client.field500[client.field602] = arg3;
        client.field603[client.field602] = arg4;
        client.field604[client.field602] = arg5;
        client.field602++;
    }

    @ObfuscatedName("cu.ck(B)V")
    public static final void method1691() {
        client.method640(client.field594);
        field1746++;
        if (client.field547 && client.field635) {
            int var0 = class77.field1376;
            int var1 = class77.field1375;
            int var2 = var0 - client.field632;
            int var3 = var1 - client.field633;
            if (var2 < client.field636) {
                var2 = client.field636;
            }
            if (client.field594.field2607 + var2 > client.field636 + client.field460.field2607) {
                var2 = client.field636 + client.field460.field2607 - client.field594.field2607;
            }
            if (var3 < client.field637) {
                var3 = client.field637;
            }
            if (client.field594.field2608 + var3 > client.field637 + client.field460.field2608) {
                var3 = client.field637 + client.field460.field2608 - client.field594.field2608;
            }
            int var4 = var2 - client.field639;
            int var5 = var3 - client.field640;
            int var6 = client.field594.field2642;
            if (field1746 > client.field594.field2662 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                client.field529 = true;
            }
            int var7 = client.field460.field2611 + (var2 - client.field636);
            int var8 = client.field460.field2612 + (var3 - client.field637);
            if (client.field594.field2674 != null && client.field529) {
                class1 var9 = new class1();
                var9.field9 = client.field594;
                var9.field3 = var7;
                var9.field1 = var8;
                var9.field8 = client.field594.field2674;
                class26.method2441(var9);
            }
            if (class77.field1387 == 0) {
                if (client.field529) {
                    if (client.field594.field2675 != null) {
                        class1 var10 = new class1();
                        var10.field9 = client.field594;
                        var10.field3 = var7;
                        var10.field1 = var8;
                        var10.field6 = client.field634;
                        var10.field8 = client.field594.field2675;
                        class26.method2441(var10);
                    }
                    if (client.field634 != null) {
                        class159 var11 = client.field594;
                        int var12 = client.method544(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class159 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class159.method2754(var11.field2704);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            client.field694.method2316(168);
                            client.field694.method2496(client.field594.field2596);
                            client.field694.method2499(client.field594.field2599);
                            client.field694.method2489(client.field634.field2599);
                            client.field694.method2496(client.field634.field2596);
                        }
                    }
                } else if ((client.field600 == 1 || client.method167(client.field602 - 1)) && client.field602 > 2) {
                    client.method114();
                } else if (client.field602 > 0) {
                    client.method179(client.field602 - 1);
                }
                client.field594 = null;
            }
        } else if (field1746 > 1) {
            client.field594 = null;
        }
    }

    @ObfuscatedName("ck.cm(IIIILci;I)V")
    public static final void method1874(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            client.method165(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = client.field544 + client.field473 & 0x7FF;
        int var7 = class104.field1774[var6];
        int var8 = class104.field1775[var6];
        int var9 = var7 * 256 / (client.field616 + 256);
        int var10 = var8 * 256 / (client.field616 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        field669.method1720(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }
}
