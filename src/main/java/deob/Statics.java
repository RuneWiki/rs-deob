package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.util.Date;

public class Statics {

    @ObfuscatedName("ak.mf")
    public static int field1006;

    @ObfuscatedName("ay.s")
    public static int field1008;

    @ObfuscatedName("ay.n")
    public static class167 field1009;

    @ObfuscatedName("ay.d")
    public static class167 field1010;

    @ObfuscatedName("ay.iq")
    public static int field1019;

    @ObfuscatedName("i.ey")
    public static class81[] field102;

    @ObfuscatedName("ay.aq")
    public static int[] field1020;

    @ObfuscatedName("ai.mi")
    public static byte field1025;

    @ObfuscatedName("am.n")
    public static class167 field1029;

    @ObfuscatedName("am.ba")
    public static class168 field1044;

    @ObfuscatedName("ao.bs")
    public static class168 field1048;

    @ObfuscatedName("ao.qt")
    public static int field1052;

    @ObfuscatedName("ao.n")
    public static class167 field1054;

    @ObfuscatedName("as.n")
    public static class167 field1062;

    @ObfuscatedName("as.ek")
    public static class79[] field1069;

    @ObfuscatedName("aa.h")
    public static class81 field1071;

    @ObfuscatedName("aa.n")
    public static class167 field1075;

    @ObfuscatedName("aa.dy")
    public static int[] field1076;

    @ObfuscatedName("ae.by")
    public static class168 field1084;

    @ObfuscatedName("ae.n")
    public static class167 field1087;

    @ObfuscatedName("ae.du")
    public static int[] field1090;

    @ObfuscatedName("ae.lf")
    public static class130 field1091;

    @ObfuscatedName("an.q")
    public static class167 field1095;

    @ObfuscatedName("an.j")
    public static class167 field1097;

    @ObfuscatedName("an.e")
    public static class224 field1102;

    @ObfuscatedName("an.k")
    public static boolean field1124;

    @ObfuscatedName("bd.t")
    public static String[] field1147;

    @ObfuscatedName("bd.d")
    public static int field1148;

    @ObfuscatedName("bd.n")
    public static class167 field1149;

    @ObfuscatedName("bd.z")
    public static class119 field1154;

    @ObfuscatedName("bm.n")
    public static class54 field1157;

    @ObfuscatedName("bn.px")
    public static int field1166;

    @ObfuscatedName("bn.j")
    public static int field1171;

    @ObfuscatedName("bn.s")
    public static int field1173;

    @ObfuscatedName("i.hu")
    public static class3 field119;

    @ObfuscatedName("n.fd")
    public static int field12;

    @ObfuscatedName("m.s")
    public static int[] field121;

    @ObfuscatedName("bu.m")
    public static float field1229;

    @ObfuscatedName("m.nm")
    public static class75 field123;

    @ObfuscatedName("bu.p")
    public static int field1230;

    @ObfuscatedName("m.i")
    public static int field125;

    @ObfuscatedName("bh.g")
    public static boolean[] field1259;

    @ObfuscatedName("bh.h")
    public static int[] field1261;

    @ObfuscatedName("bh.e")
    public static int[] field1264;

    @ObfuscatedName("bx.az")
    public static float[] field1275;

    @ObfuscatedName("bx.ac")
    public static int[] field1279;

    @ObfuscatedName("bx.i")
    public static byte[] field1280;

    @ObfuscatedName("bx.x")
    public static float[] field1281;

    @ObfuscatedName("bx.p")
    public static int field1282;

    @ObfuscatedName("bx.ab")
    public static float[] field1283;

    @ObfuscatedName("bx.e")
    public static int field1284;

    @ObfuscatedName("bx.g")
    public static class74[] field1285;

    @ObfuscatedName("bx.ad")
    public static int[] field1286;

    @ObfuscatedName("bx.m")
    public static int field1287;

    @ObfuscatedName("bx.y")
    public static class69[] field1288;

    @ObfuscatedName("bx.h")
    public static int field1289;

    @ObfuscatedName("bx.b")
    public static class68[] field1290;

    @ObfuscatedName("bx.c")
    public static float[] field1296;

    @ObfuscatedName("bx.l")
    public static float[] field1297;

    @ObfuscatedName("bx.t")
    public static int[] field1298;

    @ObfuscatedName("bx.w")
    public static float[] field1299;

    @ObfuscatedName("m.at")
    public static String field130;

    @ObfuscatedName("bx.aq")
    public static float[] field1300;

    @ObfuscatedName("bx.z")
    public static boolean[] field1302;

    @ObfuscatedName("bx.f")
    public static class61[] field1307;

    @ObfuscatedName("bv.ii")
    public static class173 field1334;

    @ObfuscatedName("bv.j")
    public static int field1338;

    @ObfuscatedName("bv.i")
    public static class79 field1340;

    @ObfuscatedName("bv.p")
    public static short[] field1342;

    @ObfuscatedName("bv.a")
    public static class14 field1344;

    @ObfuscatedName("bb.bv")
    public static int field1362;

    @ObfuscatedName("bc.d")
    public static int field1368;

    @ObfuscatedName("bc.s")
    public static int field1369;

    @ObfuscatedName("p.fl")
    public static int field137;

    @ObfuscatedName("bc.n")
    public static int field1370;

    @ObfuscatedName("bc.q")
    public static int[] field1371;

    @ObfuscatedName("bc.m")
    public static int[] field1372;

    @ObfuscatedName("bc.fu")
    public static int field1374;

    @ObfuscatedName("bl.bq")
    public static class168 field1376;

    @ObfuscatedName("bl.f")
    public static int[] field1378;

    @ObfuscatedName("bl.ho")
    public static int field1380;

    @ObfuscatedName("bl.an")
    public static class81[] field1385;

    @ObfuscatedName("bl.h")
    public static int field1386;

    @ObfuscatedName("n.af")
    public static boolean field14;

    @ObfuscatedName("ce.f")
    public static int field1402;

    @ObfuscatedName("ce.y")
    public static int field1404;

    @ObfuscatedName("ce.b")
    public static int[] field1407;

    @ObfuscatedName("p.ah")
    public static int field141;

    @ObfuscatedName("cx.y")
    public static int[] field1432;

    @ObfuscatedName("ci.f")
    public static class228[] field1433;

    @ObfuscatedName("ci.k")
    public static class167 field1440;

    @ObfuscatedName("cg.aq")
    public static int field1444;

    @ObfuscatedName("cg.bq")
    public static boolean[][] field1453;

    @ObfuscatedName("cg.t")
    public static int field1459;

    @ObfuscatedName("cg.r")
    public static int field1461;

    @ObfuscatedName("cg.bo")
    public static int field1462;

    @ObfuscatedName("cg.o")
    public static int field1463;

    @ObfuscatedName("cg.a")
    public static int field1464;

    @ObfuscatedName("cg.c")
    public static int field1465;

    @ObfuscatedName("cg.l")
    public static int field1466;

    @ObfuscatedName("cg.x")
    public static int field1467;

    @ObfuscatedName("cg.w")
    public static int field1468;

    @ObfuscatedName("cg.ab")
    public static int field1471;

    @ObfuscatedName("cg.ac")
    public static int field1472;

    @ObfuscatedName("cg.v")
    public static int field1476;

    @ObfuscatedName("cg.bp")
    public static int field1484;

    @ObfuscatedName("cg.bf")
    public static int field1485;

    @ObfuscatedName("cg.ba")
    public static int field1491;

    @ObfuscatedName("cg.u")
    public static int field1498;

    @ObfuscatedName("cg.bn")
    public static int field1499;

    @ObfuscatedName("cg.bs")
    public static int field1501;

    @ObfuscatedName("cg.az")
    public static int field1502;

    @ObfuscatedName("cm.qr")
    public static int field1505;

    @ObfuscatedName("cm.cs")
    public static char field1516;

    @ObfuscatedName("h.nn")
    public static int field153;

    @ObfuscatedName("cw.nb")
    public static int field1540;

    @ObfuscatedName("cn.v")
    public static int field1546;

    @ObfuscatedName("cn.x")
    public static int field1550;

    @ObfuscatedName("cn.u")
    public static int field1551;

    @ObfuscatedName("cn.e")
    public static int field1553;

    @ObfuscatedName("cn.g")
    public static int field1554;

    @ObfuscatedName("cn.a")
    public static int field1557;

    @ObfuscatedName("cn.l")
    public static int field1559;

    @ObfuscatedName("cn.az")
    public static class92 field1560;

    @ObfuscatedName("cn.c")
    public static int field1563;

    @ObfuscatedName("e.gg")
    public static int field157;

    @ObfuscatedName("ct.np")
    public static int field1578;

    @ObfuscatedName("cz.cw")
    public static int field1581;

    @ObfuscatedName("e.qv")
    public static Font field159;

    @ObfuscatedName("cz.a")
    public static String field1591;

    @ObfuscatedName("cz.ae")
    public static class168 field1594;

    @ObfuscatedName("ca.ak")
    public static class146 field1604;

    @ObfuscatedName("ca.pr")
    public static short[] field1608;

    @ObfuscatedName("ca.cb")
    public static class224 field1611;

    @ObfuscatedName("cj.nk")
    public static int field1617;

    @ObfuscatedName("cj.k")
    public static class73 field1618;

    @ObfuscatedName("e.fc")
    public static int field164;

    @ObfuscatedName("ck.bn")
    public static class168 field1647;

    @ObfuscatedName("e.kb")
    public static class131 field165;

    @ObfuscatedName("g.cr")
    public static int field166;

    @ObfuscatedName("g.kv")
    public static class20 field170;

    @ObfuscatedName("cq.nw")
    public static int field1734;

    @ObfuscatedName("cq.qp")
    public static int field1744;

    @ObfuscatedName("ch.et")
    public static class81[] field1751;

    @ObfuscatedName("co.x")
    public static int[] field1755;

    @ObfuscatedName("cr.rv")
    public static boolean field1767;

    @ObfuscatedName("cr.qc")
    public static int field1778;

    @ObfuscatedName("db.bm")
    public static int field1809;

    @ObfuscatedName("b.dc")
    public static byte[][] field182;

    @ObfuscatedName("db.by")
    public static int field1832;

    @ObfuscatedName("db.bd")
    public static int field1835;

    @ObfuscatedName("dp.qg")
    public static int field1857;

    @ObfuscatedName("dk.bm")
    public static class168 field1859;

    @ObfuscatedName("dk.je")
    public static int field1863;

    @ObfuscatedName("dk.dp")
    public static int field1864;

    @ObfuscatedName("dt.pl")
    public static class134 field1885;

    @ObfuscatedName("f.e")
    public static class173 field192;

    @ObfuscatedName("dd.a")
    public static int[] field1931;

    @ObfuscatedName("dd.bk")
    public static int field1933;

    @ObfuscatedName("dv.v")
    public static String field1937;

    @ObfuscatedName("dy.pt")
    public static int field1944;

    @ObfuscatedName("dy.ao")
    public static long field1946;

    @ObfuscatedName("du.d")
    public static long field1952;

    @ObfuscatedName("du.u")
    public static String field1954;

    @ObfuscatedName("du.n")
    public static long field1955;

    @ObfuscatedName("dl.ix")
    public static int field1958;

    @ObfuscatedName("dl.ee")
    public static class79 field1959;

    @ObfuscatedName("dl.k")
    public static class153 field1960;

    @ObfuscatedName("dl.qz")
    public static Canvas field1961;

    @ObfuscatedName("dl.gw")
    public static class173 field1962;

    @ObfuscatedName("dl.q")
    public static class184 field1965;

    @ObfuscatedName("dq.hm")
    public static int field1984;

    @ObfuscatedName("y.nx")
    public static class56 field199;

    @ObfuscatedName("dw.w")
    public static int[] field2008;

    @ObfuscatedName("dw.qk")
    public static Frame field2009;

    @ObfuscatedName("dw.pa")
    public static class221 field2011;

    @ObfuscatedName("df.pk")
    public static class136 field2013;

    @ObfuscatedName("df.ej")
    public static class79[] field2014;

    @ObfuscatedName("y.cl")
    public static class224 field202;

    @ObfuscatedName("ds.gs")
    public static class173 field2021;

    @ObfuscatedName("y.y")
    public static int[][][] field203;

    @ObfuscatedName("dz.z")
    public static int field2030;

    @ObfuscatedName("do.jv")
    public static int field2036;

    @ObfuscatedName("dn.ng")
    public static class57 field2046;

    @ObfuscatedName("y.bp")
    public static class168 field205;

    @ObfuscatedName("eb.ay")
    public static class143 field2050;

    @ObfuscatedName("eh.k")
    public static int[] field2064;

    @ObfuscatedName("er.u")
    public static class119 field2065;

    @ObfuscatedName("er.d")
    public static File field2066;

    @ObfuscatedName("ex.dx")
    public static byte[][] field2072;

    @ObfuscatedName("ex.n")
    public static String field2078;

    @ObfuscatedName("z.pj")
    public static long field210;

    @ObfuscatedName("ed.qh")
    public static int field2111;

    @ObfuscatedName("ee.s")
    public static class167 field2116;

    @ObfuscatedName("ef.qu")
    public static int field2119;

    @ObfuscatedName("ef.dk")
    public static int field2125;

    @ObfuscatedName("ef.ei")
    public static class79[] field2126;

    @ObfuscatedName("ef.d")
    public static String field2128;

    @ObfuscatedName("en.fi")
    public static int field2133;

    @ObfuscatedName("eo.p")
    public static int[][] field2149;

    @ObfuscatedName("ep.z")
    public static String[] field2157;

    @ObfuscatedName("ea.ni")
    public static int field2166;

    @ObfuscatedName("ea.qw")
    public static class133 field2171;

    @ObfuscatedName("ek.by")
    public static class81 field2193;

    @ObfuscatedName("ej.n")
    public static Applet field2208;

    @ObfuscatedName("ej.s")
    public static int field2210;

    @ObfuscatedName("ey.q")
    public static File field2213;

    @ObfuscatedName("ey.j")
    public static File field2215;

    @ObfuscatedName("ey.k")
    public static int field2216;

    @ObfuscatedName("ey.cd")
    public static class143 field2220;

    @ObfuscatedName("et.jm")
    public static class173[] field2232;

    @ObfuscatedName("et.no")
    public static int field2233;

    @ObfuscatedName("ez.mt")
    public static class25[] field2235;

    @ObfuscatedName("eg.v")
    public static int[] field2250;

    @ObfuscatedName("eg.br")
    public static int field2254;

    @ObfuscatedName("es.hq")
    public static int field2262;

    @ObfuscatedName("em.ns")
    public static int field2267;

    @ObfuscatedName("ec.dv")
    public static int[] field2290;

    @ObfuscatedName("t.be")
    public static class168 field233;

    @ObfuscatedName("r.ef")
    public static class79 field246;

    @ObfuscatedName("d.ij")
    public static class173 field25;

    @ObfuscatedName("r.bf")
    public static FontMetrics field256;

    @ObfuscatedName("fl.qe")
    public static int field2574;

    @ObfuscatedName("fl.aa")
    public static class79[] field2577;

    @ObfuscatedName("fv.ci")
    public static class146 field2587;

    @ObfuscatedName("r.eu")
    public static class79[] field259;

    @ObfuscatedName("fu.y")
    public static int field2625;

    @ObfuscatedName("fy.hz")
    public static int field2632;

    @ObfuscatedName("fw.i")
    public static short[] field2634;

    @ObfuscatedName("ft.en")
    public static class81[] field2644;

    @ObfuscatedName("fm.pc")
    public static GarbageCollectorMXBean field2669;

    @ObfuscatedName("u.u")
    public static int[] field269;

    @ObfuscatedName("fs.s")
    public static long field2700;

    @ObfuscatedName("client.d")
    public static client field271;

    @ObfuscatedName("fs.f")
    public static class172 field2710;

    @ObfuscatedName("fs.n")
    public static class143 field2713;

    @ObfuscatedName("fo.k")
    public static int field2720;

    @ObfuscatedName("fp.q")
    public static class167 field2726;

    @ObfuscatedName("fp.k")
    public static class167 field2728;

    @ObfuscatedName("client.m")
    public static class154 field276;

    @ObfuscatedName("client.p")
    public static class212 field277;

    @ObfuscatedName("client.b")
    public static String field281;

    @ObfuscatedName("fp.d")
    public static boolean[] field2817;

    @ObfuscatedName("client.f")
    public static String field282;

    @ObfuscatedName("client.mz")
    public static byte field283;

    @ObfuscatedName("fp.n")
    public static class173[][] field2840;

    @ObfuscatedName("fp.j")
    public static class167 field2860;

    @ObfuscatedName("fx.mh")
    public static class79 field2878;

    @ObfuscatedName("fx.an")
    public static class168 field2883;

    @ObfuscatedName("fn.pf")
    public static Clipboard field2891;

    @ObfuscatedName("fb.d")
    public static String field2897;

    @ObfuscatedName("fb.ic")
    public static int field2898;

    @ObfuscatedName("fq.m")
    public static short[][] field2905;

    @ObfuscatedName("fq.h")
    public static short[][] field2908;

    @ObfuscatedName("gl.s")
    public static class167 field2938;

    @ObfuscatedName("gl.i")
    public static int field2939;

    @ObfuscatedName("gl.d")
    public static class167 field2940;

    @ObfuscatedName("gl.m")
    public static int field2941;

    @ObfuscatedName("gl.p")
    public static int field2942;

    @ObfuscatedName("gl.g")
    public static class180 field2943;

    @ObfuscatedName("gl.n")
    public static class167 field2945;

    @ObfuscatedName("client.t")
    public static int field295;

    @ObfuscatedName("gc.ps")
    public static class9 field2984;

    @ObfuscatedName("gi.eo")
    public static class79[] field2990;

    @ObfuscatedName("client.ap")
    public static class146 field302;

    @ObfuscatedName("gy.dq")
    public static class86 field3046;

    @ObfuscatedName("gn.ph")
    public static int field3057;

    @ObfuscatedName("hh.j")
    public static byte[][][] field3113;

    @ObfuscatedName("hh.d")
    public static class167 field3115;

    @ObfuscatedName("hw.n")
    public static class167 field3141;

    @ObfuscatedName("hw.k")
    public static class79 field3142;

    @ObfuscatedName("hv.n")
    public static class113 field3158;

    @ObfuscatedName("he.h")
    public static class81[] field3159;

    @ObfuscatedName("hz.b")
    public static boolean field3190;

    @ObfuscatedName("client.cg")
    public static class143 field338;

    @ObfuscatedName("client.ew")
    public static class79[] field353;

    @ObfuscatedName("client.cq")
    public static class224 field427;

    @ObfuscatedName("client.bd")
    public static class168 field441;

    @ObfuscatedName("q.g")
    public static class173 field57;

    @ObfuscatedName("c.p")
    public static byte[][] field579;

    @ObfuscatedName("c.df")
    public static int field580;

    @ObfuscatedName("q.q")
    public static boolean field59;

    @ObfuscatedName("q.ie")
    public static int field61;

    @ObfuscatedName("w.h")
    public static class19 field614;

    @ObfuscatedName("w.j")
    public static class26[] field616;

    @ObfuscatedName("w.rf")
    public static String field621;

    @ObfuscatedName("w.nq")
    public static int field622;

    @ObfuscatedName("w.pb")
    public static class160 field623;

    @ObfuscatedName("az.bg")
    public static class168 field646;

    @ObfuscatedName("j.fv")
    public static int field65;

    @ObfuscatedName("az.qs")
    public static class78 field650;

    @ObfuscatedName("ab.jp")
    public static int field653;

    @ObfuscatedName("j.nu")
    public static int field66;

    @ObfuscatedName("ad.nv")
    public static class57 field674;

    @ObfuscatedName("ad.bx")
    public static String field679;

    @ObfuscatedName("j.bw")
    public static int field68;

    @ObfuscatedName("ad.qf")
    public static Image field680;

    @ObfuscatedName("av.s")
    public static class81 field686;

    @ObfuscatedName("av.q")
    public static class81 field687;

    @ObfuscatedName("av.ae")
    public static class81[] field688;

    @ObfuscatedName("av.m")
    public static class81 field689;

    @ObfuscatedName("av.p")
    public static class81[] field696;

    @ObfuscatedName("av.dl")
    public static int[][] field712;

    @ObfuscatedName("av.j")
    public static class81[] field716;

    @ObfuscatedName("av.n")
    public static boolean field717;

    @ObfuscatedName("av.bu")
    public static class168 field718;

    @ObfuscatedName("k.q")
    public static byte[][][] field72;

    @ObfuscatedName("k.b")
    public static int[] field73;

    @ObfuscatedName("k.i")
    public static byte[][][] field74;

    @ObfuscatedName("k.h")
    public static int[] field75;

    @ObfuscatedName("aj.i")
    public static int[] field753;

    @ObfuscatedName("aj.j")
    public static int[] field755;

    @ObfuscatedName("aj.iz")
    public static int field756;

    @ObfuscatedName("aj.db")
    public static int field757;

    @ObfuscatedName("k.e")
    public static int[] field76;

    @ObfuscatedName("au.ea")
    public static class79[] field767;

    @ObfuscatedName("au.e")
    public static boolean field768;

    @ObfuscatedName("aw.q")
    public static String[] field774;

    @ObfuscatedName("aw.dw")
    public static int field776;

    @ObfuscatedName("aw.bd")
    public static class81[] field777;

    @ObfuscatedName("k.k")
    public static byte[][][] field85;

    @ObfuscatedName("ap.g")
    public static int[] field850;

    @ObfuscatedName("ap.m")
    public static byte[][][] field854;

    @ObfuscatedName("ap.b")
    public static class60 field855;

    @ObfuscatedName("ap.io")
    public static class31 field856;

    @ObfuscatedName("ap.aa")
    public static class168 field857;

    @ObfuscatedName("ap.as")
    public static class168 field858;

    @ObfuscatedName("ap.az")
    public static int[] field859;

    @ObfuscatedName("af.n")
    public static class167 field860;

    @ObfuscatedName("af.d")
    public static class167 field861;

    @ObfuscatedName("ag.d")
    public static class167 field899;

    @ObfuscatedName("k.ga")
    public static class173 field91;

    @ObfuscatedName("ag.s")
    public static class167 field942;

    @ObfuscatedName("ag.bo")
    public static class168 field948;

    @ObfuscatedName("ah.n")
    public static class167 field955;

    @ObfuscatedName("ah.r")
    public static int[] field959;

    @ObfuscatedName("ah.ff")
    public static int field960;

    @ObfuscatedName("ah.e")
    public static class81 field961;

    @ObfuscatedName("ah.ep")
    public static class79[] field964;

    @ObfuscatedName("at.s")
    public static class167 field968;

    @ObfuscatedName("at.n")
    public static class167 field971;

    @ObfuscatedName("at.d")
    public static class167 field982;

    @ObfuscatedName("ak.x")
    public static int[] field992;

    @ObfuscatedName("ak.n")
    public static class167 field994;

    @ObfuscatedName("a.n(CB)Z")
    public static final boolean method562(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        }
        boolean var1 = arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        if (var1) {
            return true;
        }
        char[] var2 = class164.field2640;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var4 = var2[var3];
            if (arg0 == var4) {
                return true;
            }
        }
        char[] var5 = class164.field2638;
        for (int var6 = 0; var6 < var5.length; var6++) {
            char var7 = var5[var6];
            if (arg0 == var7) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.d([Ljava/lang/String;[SIII)V")
    public static void method148(String[] arg0, short[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        String var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        short var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        for (int var8 = arg2; var8 < arg3; var8++) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
                String var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5] = var9;
                short var10 = arg1[var8];
                arg1[var8] = arg1[var5];
                arg1[var5++] = var10;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method148(arg0, arg1, arg2, var5 - 1);
        method148(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("ez.d(IS)I")
    public static int method2929(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("eo.n(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method2798(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = class148.method2262(arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var3 = var2.replace(':', '.');
            String var4 = var3.replace('@', '_');
            String var5 = var4.replace('&', '_');
            String var6 = var5.replace('#', '_');
            if (field2208 == null) {
                return;
            }
            URL var7 = new URL(field2208.getCodeBase(), "clienterror.ws?c=" + field2210 + "&u=" + field2128 + "&v1=" + field2078 + "&v2=" + field2897 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("v.d(Ljava/lang/CharSequence;Lhy;I)Ljava/lang/String;")
    public static String method547(CharSequence arg0, class212 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3) {
            char var4 = arg0.charAt(var2);
            boolean var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
            var2++;
        }
        while (var3 > var2) {
            char var6 = arg0.charAt(var3 - 1);
            boolean var7 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var7) {
                break;
            }
            var3--;
        }
        int var8 = var3 - var2;
        if (var8 >= 1) {
            byte var10;
            if (arg1 == null) {
                var10 = 12;
            } else {
                switch(arg1.field3125) {
                    case 4:
                        var10 = 20;
                        break;
                    default:
                        var10 = 12;
                }
            }
            if (var8 <= var10) {
                StringBuilder var11 = new StringBuilder(var8);
                for (int var12 = var2; var12 < var3; var12++) {
                    char var13 = arg0.charAt(var12);
                    if (method562(var13)) {
                        char var14 = class164.method2796(var13);
                        if (var14 != 0) {
                            var11.append(var14);
                        }
                    }
                }
                if (var11.length() == 0) {
                    return null;
                }
                return var11.toString();
            }
        }
        return null;
    }

    @ObfuscatedName("es.n(IIIII)V")
    public static final void method2937(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    field854[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        class6.field80[0][var5][var4] = class6.field80[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class6.field80[0][var5][var4] = class6.field80[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        class6.field80[0][var5][var4] = class6.field80[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        class6.field80[0][var5][var4] = class6.field80[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.s(I)I")
    public static int method735() {
        return ++class140.field2130 - 1;
    }

    @ObfuscatedName("ek.d(Ln;II)V")
    public static void method2902(class1 arg0, int arg1) {
        Object[] var2 = arg0.field2;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method1997(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field571;
        int[] var9 = var4.field572;
        byte var10 = -1;
        class37.field779 = 0;
        try {
            field121 = new int[var4.field574];
            int var11 = 0;
            field774 = new String[var4.field575];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2735;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2736;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2735;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2736;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    field121[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    field774[var12++] = var15;
                }
            }
            int var16 = 0;
            class37.field786 = arg0.field11;
            label3475: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var528 = var8[var7];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class37.field785[var5++] = var9[var7];
                        continue;
                    }
                    if (var528 == 1) {
                        int var17 = var9[var7];
                        class37.field785[var5++] = class176.field2886[var17];
                        continue;
                    }
                    if (var528 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2886[var18] = class37.field785[var5];
                        client.method75(var18);
                        continue;
                    }
                    if (var528 == 3) {
                        class37.field778[var6++] = var4.field578[var7];
                        continue;
                    }
                    if (var528 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var528 == 7) {
                        var5 -= 2;
                        if (class37.field785[var5 + 1] != class37.field785[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var5 -= 2;
                        if (class37.field785[var5 + 1] == class37.field785[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var5 -= 2;
                        if (class37.field785[var5] < class37.field785[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var5 -= 2;
                        if (class37.field785[var5] > class37.field785[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class37.field779 == 0) {
                            return;
                        }
                        class15 var19 = class37.field780[--class37.field779];
                        var4 = var19.field200;
                        var8 = var4.field571;
                        var9 = var4.field572;
                        var7 = var19.field201;
                        field121 = var19.field197;
                        field774 = var19.field198;
                        continue;
                    }
                    if (var528 == 25) {
                        int var20 = var9[var7];
                        class37.field785[var5++] = class176.method3086(var20);
                        continue;
                    }
                    if (var528 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = class37.field785[var5];
                        class48 var23 = (class48) class48.field1047.method3478((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = field1054.method3010(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method934(new class119(var25));
                            }
                            class48.field1047.method3481(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1053;
                        int var29 = var24.field1049;
                        int var30 = var24.field1050;
                        int var31 = class176.field2887[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class176.field2886[var28] = class176.field2886[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var528 == 31) {
                        var5 -= 2;
                        if (class37.field785[var5] <= class37.field785[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var5 -= 2;
                        if (class37.field785[var5] >= class37.field785[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class37.field785[var5++] = field121[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        field121[var10001] = class37.field785[var5];
                        continue;
                    }
                    if (var528 == 35) {
                        class37.field778[var6++] = field774[var9[var7]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        field774[var10001] = class37.field778[var6];
                        continue;
                    }
                    if (var528 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = class37.field778;
                        String var35;
                        if (var33 == 0) {
                            var35 = "";
                        } else if (var33 == 1) {
                            String var36 = var34[var6];
                            if (var36 == null) {
                                var35 = "null";
                            } else {
                                var35 = var36.toString();
                            }
                        } else {
                            int var37 = var6 + var33;
                            int var38 = 0;
                            for (int var39 = var6; var39 < var37; var39++) {
                                String var40 = var34[var39];
                                if (var40 == null) {
                                    var38 += 4;
                                } else {
                                    var38 += var40.length();
                                }
                            }
                            StringBuilder var41 = new StringBuilder(var38);
                            for (int var42 = var6; var42 < var37; var42++) {
                                String var43 = var34[var42];
                                if (var43 == null) {
                                    var41.append("null");
                                } else {
                                    var41.append(var43);
                                }
                            }
                            var35 = var41.toString();
                        }
                        class37.field778[var6++] = var35;
                        continue;
                    }
                    if (var528 == 38) {
                        var5--;
                        continue;
                    }
                    if (var528 == 39) {
                        var6--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var45 = var9[var7];
                        class23 var46 = class23.method1997(var45);
                        int[] var47 = new int[var46.field574];
                        String[] var48 = new String[var46.field575];
                        for (int var49 = 0; var49 < var46.field577; var49++) {
                            var47[var49] = class37.field785[var5 - var46.field577 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field573; var50++) {
                            var48[var50] = class37.field778[var6 - var46.field573 + var50];
                        }
                        var5 -= var46.field577;
                        var6 -= var46.field573;
                        class15 var51 = new class15();
                        var51.field200 = var4;
                        var51.field201 = var7;
                        var51.field197 = field121;
                        var51.field198 = field774;
                        class37.field780[++class37.field779 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field571;
                        var9 = var46.field572;
                        var7 = -1;
                        field121 = var47;
                        field774 = var48;
                        continue;
                    }
                    if (var528 == 42) {
                        class37.field785[var5++] = field170.method179(var9[var7]);
                        continue;
                    }
                    if (var528 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        field170.method178(var10001, class37.field785[var5]);
                        continue;
                    }
                    if (var528 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = class37.field785[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            class37.field784[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label3475;
                                }
                                class37.field787[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = class37.field785[var5];
                        if (var58 >= 0 && var58 < class37.field784[var57]) {
                            class37.field785[var5++] = class37.field787[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = class37.field785[var5];
                        if (var60 >= 0 && var60 < class37.field784[var59]) {
                            class37.field787[var59][var60] = class37.field785[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var61 = field170.method181(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        class37.field778[var6++] = var61;
                        continue;
                    }
                    if (var528 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        field170.method180(var10001, class37.field778[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var528 < 1000) {
                    if (var528 == 100) {
                        var5 -= 3;
                        int var63 = class37.field785[var5];
                        int var64 = class37.field785[var5 + 1];
                        int var65 = class37.field785[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var66 = class173.method1446(var63);
                        if (var66.field2857 == null) {
                            var66.field2857 = new class173[var65 + 1];
                        }
                        if (var66.field2857.length <= var65) {
                            class173[] var67 = new class173[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2857.length; var68++) {
                                var67[var68] = var66.field2857[var68];
                            }
                            var66.field2857 = var67;
                        }
                        if (var65 > 0 && var66.field2857[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class173 var69 = new class173();
                        var69.field2820 = var64;
                        var69.field2754 = var69.field2735 = var66.field2735;
                        var69.field2736 = var65;
                        var69.field2734 = true;
                        var66.field2857[var65] = var69;
                        if (var62) {
                            field57 = var69;
                        } else {
                            field192 = var69;
                        }
                        client.method3122(var66);
                        continue;
                    }
                    if (var528 == 101) {
                        class173 var70 = var62 ? field57 : field192;
                        class173 var71 = class173.method1446(var70.field2735);
                        var71.field2857[var70.field2736] = null;
                        client.method3122(var71);
                        continue;
                    }
                    if (var528 == 102) {
                        var5--;
                        class173 var72 = class173.method1446(class37.field785[var5]);
                        var72.field2857 = null;
                        client.method3122(var72);
                        continue;
                    }
                    if (var528 == 200) {
                        var5 -= 2;
                        int var73 = class37.field785[var5];
                        int var74 = class37.field785[var5 + 1];
                        class173 var75 = class173.method42(var73, var74);
                        if (var75 != null && var74 != -1) {
                            class37.field785[var5++] = 1;
                            if (var62) {
                                field57 = var75;
                            } else {
                                field192 = var75;
                            }
                            continue;
                        }
                        class37.field785[var5++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var5--;
                        class173 var76 = class173.method1446(class37.field785[var5]);
                        if (var76 == null) {
                            class37.field785[var5++] = 0;
                        } else {
                            class37.field785[var5++] = 1;
                            if (var62) {
                                field57 = var76;
                            } else {
                                field192 = var76;
                            }
                        }
                        continue;
                    }
                } else if (!(var528 < 1000 || var528 >= 1100) || !(var528 < 2000 || var528 >= 2100)) {
                    int var77 = -1;
                    class173 var78;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var5--;
                        var77 = class37.field785[var5];
                        var78 = class173.method1446(var77);
                    } else {
                        var78 = var62 ? field57 : field192;
                    }
                    if (var528 == 1000) {
                        var5 -= 4;
                        var78.field2744 = class37.field785[var5];
                        var78.field2745 = class37.field785[var5 + 1];
                        var78.field2740 = class37.field785[var5 + 2];
                        var78.field2731 = class37.field785[var5 + 3];
                        client.method3122(var78);
                        client.method571(var78);
                        if (var77 != -1 && var78.field2820 == 0) {
                            client.method172(field2840[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var5 -= 4;
                        var78.field2746 = class37.field785[var5];
                        var78.field2851 = class37.field785[var5 + 1];
                        var78.field2836 = class37.field785[var5 + 2];
                        var78.field2743 = class37.field785[var5 + 3];
                        client.method3122(var78);
                        client.method571(var78);
                        if (var77 != -1 && var78.field2820 == 0) {
                            client.method172(field2840[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var5--;
                        boolean var79 = class37.field785[var5] == 1;
                        if (var78.field2846 != var79) {
                            var78.field2846 = var79;
                            client.method3122(var78);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var5--;
                        var78.field2866 = class37.field785[var5] == 1;
                        continue;
                    }
                    if (var528 == 1006) {
                        var5--;
                        var78.field2818 = class37.field785[var5] == 1;
                        continue;
                    }
                } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                    int var80 = -1;
                    class173 var81;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var5--;
                        var80 = class37.field785[var5];
                        var81 = class173.method1446(var80);
                    } else {
                        var81 = var62 ? field57 : field192;
                    }
                    if (var528 == 1100) {
                        var5 -= 2;
                        var81.field2827 = class37.field785[var5];
                        if (var81.field2827 > var81.field2758 - var81.field2750) {
                            var81.field2827 = var81.field2758 - var81.field2750;
                        }
                        if (var81.field2827 < 0) {
                            var81.field2827 = 0;
                        }
                        var81.field2757 = class37.field785[var5 + 1];
                        if (var81.field2757 > var81.field2759 - var81.field2804) {
                            var81.field2757 = var81.field2759 - var81.field2804;
                        }
                        if (var81.field2757 < 0) {
                            var81.field2757 = 0;
                        }
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1101) {
                        var5--;
                        var81.field2760 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1102) {
                        var5--;
                        var81.field2859 = class37.field785[var5] == 1;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1103) {
                        var5--;
                        var81.field2751 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1104) {
                        var5--;
                        var81.field2773 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1105) {
                        var5--;
                        var81.field2768 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1106) {
                        var5--;
                        var81.field2806 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1107) {
                        var5--;
                        var81.field2771 = class37.field785[var5] == 1;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1108) {
                        var81.field2776 = 1;
                        var5--;
                        var81.field2816 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1109) {
                        var5 -= 6;
                        var81.field2782 = class37.field785[var5];
                        var81.field2777 = class37.field785[var5 + 1];
                        var81.field2784 = class37.field785[var5 + 2];
                        var81.field2785 = class37.field785[var5 + 3];
                        var81.field2786 = class37.field785[var5 + 4];
                        var81.field2770 = class37.field785[var5 + 5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1110) {
                        var5--;
                        int var82 = class37.field785[var5];
                        if (var81.field2780 != var82) {
                            var81.field2780 = var82;
                            var81.field2741 = 0;
                            var81.field2742 = 0;
                            client.method3122(var81);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var5--;
                        var81.field2790 = class37.field785[var5] == 1;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1112) {
                        var6--;
                        String var83 = class37.field778[var6];
                        if (!var83.equals(var81.field2793)) {
                            var81.field2793 = var83;
                            client.method3122(var81);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var5--;
                        var81.field2792 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1114) {
                        var5 -= 3;
                        var81.field2796 = class37.field785[var5];
                        var81.field2797 = class37.field785[var5 + 1];
                        var81.field2795 = class37.field785[var5 + 2];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1115) {
                        var5--;
                        var81.field2798 = class37.field785[var5] == 1;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1116) {
                        var5--;
                        var81.field2772 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1117) {
                        var5--;
                        var81.field2739 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1118) {
                        var5--;
                        var81.field2774 = class37.field785[var5] == 1;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1119) {
                        var5--;
                        var81.field2775 = class37.field785[var5] == 1;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1120) {
                        var5 -= 2;
                        var81.field2758 = class37.field785[var5];
                        var81.field2759 = class37.field785[var5 + 1];
                        client.method3122(var81);
                        if (var80 != -1 && var81.field2820 == 0) {
                            client.method172(field2840[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        client.method2667(var81.field2735, var81.field2736);
                        client.field438 = var81;
                        client.method3122(var81);
                        continue;
                    }
                    if (var528 == 1122) {
                        var5--;
                        var81.field2769 = class37.field785[var5];
                        client.method3122(var81);
                        continue;
                    }
                } else if (var528 >= 1200 && var528 < 1300 || var528 >= 2200 && var528 < 2300) {
                    class173 var84;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var5--;
                        var84 = class173.method1446(class37.field785[var5]);
                    } else {
                        var84 = var62 ? field57 : field192;
                    }
                    client.method3122(var84);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1212) {
                        var5 -= 2;
                        int var85 = class37.field785[var5];
                        int var86 = class37.field785[var5 + 1];
                        var84.field2829 = var85;
                        var84.field2788 = var86;
                        class52 var87 = class52.method2651(var85);
                        var84.field2784 = var87.field1104;
                        var84.field2785 = var87.field1134;
                        var84.field2786 = var87.field1117;
                        var84.field2782 = var87.field1114;
                        var84.field2777 = var87.field1111;
                        var84.field2770 = var87.field1093;
                        if (var528 == 1205) {
                            var84.field2791 = 0;
                        } else if (var528 == 1212 | var87.field1116 == 1) {
                            var84.field2791 = 1;
                        } else {
                            var84.field2791 = 2;
                        }
                        if (var84.field2747 > 0) {
                            var84.field2770 = var84.field2770 * 32 / var84.field2747;
                        } else if (var84.field2746 > 0) {
                            var84.field2770 = var84.field2770 * 32 / var84.field2746;
                        }
                        continue;
                    }
                    if (var528 == 1201) {
                        var84.field2776 = 2;
                        var5--;
                        var84.field2816 = class37.field785[var5];
                        continue;
                    }
                    if (var528 == 1202) {
                        var84.field2776 = 3;
                        var84.field2816 = field119.field30.method3250();
                        continue;
                    }
                } else if (var528 >= 1300 && var528 < 1400 || var528 >= 2300 && var528 < 2400) {
                    class173 var88;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var5--;
                        var88 = class173.method1446(class37.field785[var5]);
                    } else {
                        var88 = var62 ? field57 : field192;
                    }
                    if (var528 == 1300) {
                        var5--;
                        int var89 = class37.field785[var5] - 1;
                        if (var89 >= 0 && var89 <= 9) {
                            var6--;
                            var88.method3151(var89, class37.field778[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var5 -= 2;
                        int var90 = class37.field785[var5];
                        int var91 = class37.field785[var5 + 1];
                        var88.field2808 = class173.method42(var90, var91);
                        continue;
                    }
                    if (var528 == 1302) {
                        var5--;
                        var88.field2811 = class37.field785[var5] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var5--;
                        var88.field2809 = class37.field785[var5];
                        continue;
                    }
                    if (var528 == 1304) {
                        var5--;
                        var88.field2810 = class37.field785[var5];
                        continue;
                    }
                    if (var528 == 1305) {
                        var6--;
                        var88.field2765 = class37.field778[var6];
                        continue;
                    }
                    if (var528 == 1306) {
                        var6--;
                        var88.field2861 = class37.field778[var6];
                        continue;
                    }
                    if (var528 == 1307) {
                        var88.field2807 = null;
                        continue;
                    }
                } else {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        class173 var92;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var5--;
                            var92 = class173.method1446(class37.field785[var5]);
                        } else {
                            var92 = var62 ? field57 : field192;
                        }
                        var6--;
                        String var93 = class37.field778[var6];
                        int[] var94 = null;
                        if (var93.length() > 0 && var93.charAt(var93.length() - 1) == 'Y') {
                            var5--;
                            int var95 = class37.field785[var5];
                            if (var95 > 0) {
                                var94 = new int[var95];
                                while (var95-- > 0) {
                                    var5--;
                                    var94[var95] = class37.field785[var5];
                                }
                            }
                            var93 = var93.substring(0, var93.length() - 1);
                        }
                        Object[] var96 = new Object[var93.length() + 1];
                        for (int var97 = var96.length - 1; var97 >= 1; var97--) {
                            if (var93.charAt(var97 - 1) == 's') {
                                var6--;
                                var96[var97] = class37.field778[var6];
                            } else {
                                var5--;
                                var96[var97] = Integer.valueOf(class37.field785[var5]);
                            }
                        }
                        var5--;
                        int var98 = class37.field785[var5];
                        if (var98 == -1) {
                            var96 = null;
                        } else {
                            var96[0] = Integer.valueOf(var98);
                        }
                        if (var528 == 1400) {
                            var92.field2815 = var96;
                        }
                        if (var528 == 1401) {
                            var92.field2853 = var96;
                        }
                        if (var528 == 1402) {
                            var92.field2831 = var96;
                        }
                        if (var528 == 1403) {
                            var92.field2756 = var96;
                        }
                        if (var528 == 1404) {
                            var92.field2821 = var96;
                        }
                        if (var528 == 1405) {
                            var92.field2753 = var96;
                        }
                        if (var528 == 1406) {
                            var92.field2825 = var96;
                        }
                        if (var528 == 1407) {
                            var92.field2826 = var96;
                            var92.field2856 = var94;
                        }
                        if (var528 == 1408) {
                            var92.field2803 = var96;
                        }
                        if (var528 == 1409) {
                            var92.field2833 = var96;
                        }
                        if (var528 == 1410) {
                            var92.field2823 = var96;
                        }
                        if (var528 == 1411) {
                            var92.field2844 = var96;
                        }
                        if (var528 == 1412) {
                            var92.field2832 = var96;
                        }
                        if (var528 == 1414) {
                            var92.field2828 = var96;
                            var92.field2864 = var94;
                        }
                        if (var528 == 1415) {
                            var92.field2830 = var96;
                            var92.field2783 = var94;
                        }
                        if (var528 == 1416) {
                            var92.field2824 = var96;
                        }
                        if (var528 == 1417) {
                            var92.field2834 = var96;
                        }
                        if (var528 == 1418) {
                            var92.field2835 = var96;
                        }
                        if (var528 == 1419) {
                            var92.field2822 = var96;
                        }
                        if (var528 == 1420) {
                            var92.field2837 = var96;
                        }
                        if (var528 == 1421) {
                            var92.field2838 = var96;
                        }
                        if (var528 == 1422) {
                            var92.field2839 = var96;
                        }
                        if (var528 == 1423) {
                            var92.field2867 = var96;
                        }
                        if (var528 == 1424) {
                            var92.field2841 = var96;
                        }
                        if (var528 == 1425) {
                            var92.field2843 = var96;
                        }
                        if (var528 == 1426) {
                            var92.field2764 = var96;
                        }
                        if (var528 == 1427) {
                            var92.field2842 = var96;
                        }
                        var92.field2813 = true;
                        continue;
                    }
                    if (var528 < 1600) {
                        class173 var99 = var62 ? field57 : field192;
                        if (var528 == 1500) {
                            class37.field785[var5++] = var99.field2748;
                            continue;
                        }
                        if (var528 == 1501) {
                            class37.field785[var5++] = var99.field2749;
                            continue;
                        }
                        if (var528 == 1502) {
                            class37.field785[var5++] = var99.field2750;
                            continue;
                        }
                        if (var528 == 1503) {
                            class37.field785[var5++] = var99.field2804;
                            continue;
                        }
                        if (var528 == 1504) {
                            class37.field785[var5++] = var99.field2846 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class37.field785[var5++] = var99.field2754;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class173 var100 = var62 ? field57 : field192;
                        if (var528 == 1600) {
                            class37.field785[var5++] = var100.field2827;
                            continue;
                        }
                        if (var528 == 1601) {
                            class37.field785[var5++] = var100.field2757;
                            continue;
                        }
                        if (var528 == 1602) {
                            class37.field778[var6++] = var100.field2793;
                            continue;
                        }
                        if (var528 == 1603) {
                            class37.field785[var5++] = var100.field2758;
                            continue;
                        }
                        if (var528 == 1604) {
                            class37.field785[var5++] = var100.field2759;
                            continue;
                        }
                        if (var528 == 1605) {
                            class37.field785[var5++] = var100.field2770;
                            continue;
                        }
                        if (var528 == 1606) {
                            class37.field785[var5++] = var100.field2784;
                            continue;
                        }
                        if (var528 == 1607) {
                            class37.field785[var5++] = var100.field2786;
                            continue;
                        }
                        if (var528 == 1608) {
                            class37.field785[var5++] = var100.field2785;
                            continue;
                        }
                        if (var528 == 1609) {
                            class37.field785[var5++] = var100.field2751;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class173 var101 = var62 ? field57 : field192;
                        if (var528 == 1700) {
                            class37.field785[var5++] = var101.field2829;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var101.field2829 == -1) {
                                class37.field785[var5++] = 0;
                            } else {
                                class37.field785[var5++] = var101.field2788;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class37.field785[var5++] = var101.field2736;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class173 var102 = var62 ? field57 : field192;
                        if (var528 == 1800) {
                            class37.field785[var5++] = class178.method2941(client.method912(var102));
                            continue;
                        }
                        if (var528 == 1801) {
                            var5--;
                            int var103 = class37.field785[var5];
                            int var529 = var103 - 1;
                            if (var102.field2807 != null && var529 < var102.field2807.length && var102.field2807[var529] != null) {
                                class37.field778[var6++] = var102.field2807[var529];
                                continue;
                            }
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var102.field2765 == null) {
                                class37.field778[var6++] = "";
                            } else {
                                class37.field778[var6++] = var102.field2765;
                            }
                            continue;
                        }
                    } else if (var528 >= 1900 && var528 < 2000 || var528 >= 2900 && var528 < 3000) {
                        class173 var104;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var5--;
                            var104 = class173.method1446(class37.field785[var5]);
                        } else {
                            var104 = var62 ? field57 : field192;
                        }
                        if (var528 == 1927) {
                            if (class37.field786 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var104.field2842 == null) {
                                return;
                            }
                            class1 var105 = new class1();
                            var105.field3 = var104;
                            var105.field2 = var104.field2842;
                            var105.field11 = class37.field786 + 1;
                            client.field531.method3579(arg0);
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var5--;
                        class173 var106 = class173.method1446(class37.field785[var5]);
                        if (var528 == 2500) {
                            class37.field785[var5++] = var106.field2748;
                            continue;
                        }
                        if (var528 == 2501) {
                            class37.field785[var5++] = var106.field2749;
                            continue;
                        }
                        if (var528 == 2502) {
                            class37.field785[var5++] = var106.field2750;
                            continue;
                        }
                        if (var528 == 2503) {
                            class37.field785[var5++] = var106.field2804;
                            continue;
                        }
                        if (var528 == 2504) {
                            class37.field785[var5++] = var106.field2846 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class37.field785[var5++] = var106.field2754;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var5--;
                        class173 var107 = class173.method1446(class37.field785[var5]);
                        if (var528 == 2600) {
                            class37.field785[var5++] = var107.field2827;
                            continue;
                        }
                        if (var528 == 2601) {
                            class37.field785[var5++] = var107.field2757;
                            continue;
                        }
                        if (var528 == 2602) {
                            class37.field778[var6++] = var107.field2793;
                            continue;
                        }
                        if (var528 == 2603) {
                            class37.field785[var5++] = var107.field2758;
                            continue;
                        }
                        if (var528 == 2604) {
                            class37.field785[var5++] = var107.field2759;
                            continue;
                        }
                        if (var528 == 2605) {
                            class37.field785[var5++] = var107.field2770;
                            continue;
                        }
                        if (var528 == 2606) {
                            class37.field785[var5++] = var107.field2784;
                            continue;
                        }
                        if (var528 == 2607) {
                            class37.field785[var5++] = var107.field2786;
                            continue;
                        }
                        if (var528 == 2608) {
                            class37.field785[var5++] = var107.field2785;
                            continue;
                        }
                        if (var528 == 2609) {
                            class37.field785[var5++] = var107.field2751;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var5--;
                            class173 var108 = class173.method1446(class37.field785[var5]);
                            class37.field785[var5++] = var108.field2829;
                            continue;
                        }
                        if (var528 == 2701) {
                            var5--;
                            class173 var109 = class173.method1446(class37.field785[var5]);
                            if (var109.field2829 == -1) {
                                class37.field785[var5++] = 0;
                            } else {
                                class37.field785[var5++] = var109.field2788;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var5--;
                            int var110 = class37.field785[var5];
                            class4 var111 = (class4) client.field518.method3519((long) var110);
                            if (var111 == null) {
                                class37.field785[var5++] = 0;
                            } else {
                                class37.field785[var5++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2706) {
                            class37.field785[var5++] = client.field554;
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var5--;
                        class173 var112 = class173.method1446(class37.field785[var5]);
                        if (var528 == 2800) {
                            class37.field785[var5++] = class178.method2941(client.method912(var112));
                            continue;
                        }
                        if (var528 == 2801) {
                            var5--;
                            int var113 = class37.field785[var5];
                            int var530 = var113 - 1;
                            if (var112.field2807 != null && var530 < var112.field2807.length && var112.field2807[var530] != null) {
                                class37.field778[var6++] = var112.field2807[var530];
                                continue;
                            }
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var112.field2765 == null) {
                                class37.field778[var6++] = "";
                            } else {
                                class37.field778[var6++] = var112.field2765;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var6--;
                            String var114 = class37.field778[var6];
                            class12.method2001(0, "", var114);
                            continue;
                        }
                        if (var528 == 3101) {
                            var5 -= 2;
                            client.method136(field119, class37.field785[var5], class37.field785[var5 + 1]);
                            continue;
                        }
                        if (var528 == 3103) {
                            client.field317.method2575(76);
                            for (class4 var115 = (class4) client.field518.method3522(); var115 != null; var115 = (class4) client.field518.method3523()) {
                                if (var115.field54 == 0 || var115.field54 == 3) {
                                    client.method2997(var115, true);
                                }
                            }
                            if (client.field438 != null) {
                                client.method3122(client.field438);
                                client.field438 = null;
                            }
                            continue;
                        }
                        if (var528 == 3104) {
                            var6--;
                            String var116 = class37.field778[var6];
                            int var117 = 0;
                            boolean var118 = false;
                            boolean var119 = false;
                            int var120 = 0;
                            int var121 = var116.length();
                            int var122 = 0;
                            boolean var124;
                            while (true) {
                                if (var122 >= var121) {
                                    var124 = var119;
                                    break;
                                }
                                label3767: {
                                    char var123 = var116.charAt(var122);
                                    if (var122 == 0) {
                                        if (var123 == '-') {
                                            var118 = true;
                                            break label3767;
                                        }
                                        if (var123 == '+') {
                                            break label3767;
                                        }
                                    }
                                    int var531;
                                    if (var123 >= '0' && var123 <= '9') {
                                        var531 = var123 - '0';
                                    } else if (var123 >= 'A' && var123 <= 'Z') {
                                        var531 = var123 - '7';
                                    } else {
                                        if (var123 < 'a' || var123 > 'z') {
                                            var124 = false;
                                            break;
                                        }
                                        var531 = var123 - 'W';
                                    }
                                    if (var531 >= 10) {
                                        var124 = false;
                                        break;
                                    }
                                    if (var118) {
                                        var531 = -var531;
                                    }
                                    int var125 = var120 * 10 + var531;
                                    if (var125 / 10 != var120) {
                                        var124 = false;
                                        break;
                                    }
                                    var120 = var125;
                                    var119 = true;
                                }
                                var122++;
                            }
                            if (var124) {
                                int var127 = class163.method37(var116, 10, true);
                                var117 = var127;
                            }
                            client.field317.method2575(217);
                            client.field317.method2326(var117);
                            continue;
                        }
                        if (var528 == 3105) {
                            var6--;
                            String var128 = class37.field778[var6];
                            client.field317.method2575(49);
                            client.field317.method2323(var128.length() + 1);
                            client.field317.method2329(var128);
                            continue;
                        }
                        if (var528 == 3106) {
                            var6--;
                            String var129 = class37.field778[var6];
                            client.field317.method2575(11);
                            client.field317.method2323(var129.length() + 1);
                            client.field317.method2329(var129);
                            continue;
                        }
                        if (var528 == 3107) {
                            var5--;
                            int var130 = class37.field785[var5];
                            var6--;
                            String var131 = class37.field778[var6];
                            client.method1047(var130, var131);
                            continue;
                        }
                        if (var528 == 3108) {
                            var5 -= 3;
                            int var132 = class37.field785[var5];
                            int var133 = class37.field785[var5 + 1];
                            int var134 = class37.field785[var5 + 2];
                            class173 var135 = class173.method1446(var134);
                            client.method2016(var135, var132, var133);
                            continue;
                        }
                        if (var528 == 3109) {
                            var5 -= 2;
                            int var136 = class37.field785[var5];
                            int var137 = class37.field785[var5 + 1];
                            class173 var138 = var62 ? field57 : field192;
                            client.method2016(var138, var136, var137);
                            continue;
                        }
                        if (var528 == 3110) {
                            var5--;
                            field14 = class37.field785[var5] == 1;
                            continue;
                        }
                        if (var528 == 3111) {
                            class37.field785[var5++] = field2984.field139 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3112) {
                            var5--;
                            field2984.field139 = class37.field785[var5] == 1;
                            class9.method706();
                            continue;
                        }
                        if (var528 == 3113) {
                            var6--;
                            String var139 = class37.field778[var6];
                            var5--;
                            boolean var140 = class37.field785[var5] == 1;
                            class138.method932(var139, var140, false);
                            continue;
                        }
                        if (var528 == 3115) {
                            var5--;
                            int var141 = class37.field785[var5];
                            client.field317.method2575(248);
                            client.field317.method2324(var141);
                            continue;
                        }
                        if (var528 == 3116) {
                            var5--;
                            int var142 = class37.field785[var5];
                            var6 -= 2;
                            String var143 = class37.field778[var6];
                            String var144 = class37.field778[var6 + 1];
                            if (var143.length() <= 500 && var144.length() <= 500) {
                                client.field317.method2575(152);
                                client.field317.method2324(1 + class119.method2648(var143) + class119.method2648(var144));
                                client.field317.method2329(var144);
                                client.field317.method2329(var143);
                                client.field317.method2397(var142);
                            }
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var5 -= 3;
                            client.method92(class37.field785[var5], class37.field785[var5 + 1], class37.field785[var5 + 2]);
                            continue;
                        }
                        if (var528 == 3201) {
                            var5--;
                            int var145 = class37.field785[var5];
                            if (var145 == -1 && !client.field514) {
                                field1965.method3360();
                                class183.field2936 = 1;
                                field1440 = null;
                            } else if (var145 != -1 && client.field513 != var145 && client.field440 != 0 && !client.field514) {
                                class183.method2275(2, field1859, var145, 0, client.field440, false);
                            }
                            client.field513 = var145;
                            continue;
                        }
                        if (var528 == 3202) {
                            var5 -= 2;
                            client.method140(class37.field785[var5], class37.field785[var5 + 1]);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class37.field785[var5++] = client.field347;
                            continue;
                        }
                        if (var528 == 3301) {
                            var5 -= 2;
                            int var146 = class37.field785[var5];
                            int var147 = class37.field785[var5 + 1];
                            int[] var148 = class37.field785;
                            int var149 = var5++;
                            class16 var150 = (class16) class16.field213.method3519((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = -1;
                            } else if (var147 >= 0 && var147 < var150.field207.length) {
                                var151 = var150.field207[var147];
                            } else {
                                var151 = -1;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var528 == 3302) {
                            var5 -= 2;
                            int var152 = class37.field785[var5];
                            int var153 = class37.field785[var5 + 1];
                            int[] var154 = class37.field785;
                            int var155 = var5++;
                            class16 var156 = (class16) class16.field213.method3519((long) var152);
                            int var157;
                            if (var156 == null) {
                                var157 = 0;
                            } else if (var153 >= 0 && var153 < var156.field209.length) {
                                var157 = var156.field209[var153];
                            } else {
                                var157 = 0;
                            }
                            var154[var155] = var157;
                            continue;
                        }
                        if (var528 == 3303) {
                            var5 -= 2;
                            int var158 = class37.field785[var5];
                            int var159 = class37.field785[var5 + 1];
                            int[] var160 = class37.field785;
                            int var161 = var5++;
                            class16 var162 = (class16) class16.field213.method3519((long) var158);
                            int var163;
                            if (var162 == null) {
                                var163 = 0;
                            } else if (var159 == -1) {
                                var163 = 0;
                            } else {
                                int var164 = 0;
                                for (int var165 = 0; var165 < var162.field209.length; var165++) {
                                    if (var162.field207[var165] == var159) {
                                        var164 += var162.field209[var165];
                                    }
                                }
                                var163 = var164;
                            }
                            var160[var161] = var163;
                            continue;
                        }
                        if (var528 == 3304) {
                            var5--;
                            int var166 = class37.field785[var5];
                            int[] var167 = class37.field785;
                            int var168 = var5++;
                            class51 var169 = (class51) class51.field1088.method3478((long) var166);
                            class51 var170;
                            if (var169 == null) {
                                byte[] var171 = field1087.method3010(5, var166);
                                class51 var172 = new class51();
                                if (var171 != null) {
                                    var172.method962(new class119(var171));
                                }
                                class51.field1088.method3481(var172, (long) var166);
                                var170 = var172;
                            } else {
                                var170 = var169;
                            }
                            var167[var168] = var170.field1086;
                            continue;
                        }
                        if (var528 == 3305) {
                            var5--;
                            int var173 = class37.field785[var5];
                            class37.field785[var5++] = client.field524[var173];
                            continue;
                        }
                        if (var528 == 3306) {
                            var5--;
                            int var174 = class37.field785[var5];
                            class37.field785[var5++] = client.field412[var174];
                            continue;
                        }
                        if (var528 == 3307) {
                            var5--;
                            int var175 = class37.field785[var5];
                            class37.field785[var5++] = client.field413[var175];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var176 = field157;
                            int var177 = (field119.field816 >> 7) + field166;
                            int var178 = (field119.field815 >> 7) + field757;
                            class37.field785[var5++] = (var176 << 28) + (var177 << 14) + var178;
                            continue;
                        }
                        if (var528 == 3309) {
                            var5--;
                            int var179 = class37.field785[var5];
                            class37.field785[var5++] = var179 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var528 == 3310) {
                            var5--;
                            int var180 = class37.field785[var5];
                            class37.field785[var5++] = var180 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var5--;
                            int var181 = class37.field785[var5];
                            class37.field785[var5++] = var181 & 0x3FFF;
                            continue;
                        }
                        if (var528 == 3312) {
                            class37.field785[var5++] = client.field278 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var5 -= 2;
                            int var182 = class37.field785[var5] + 32768;
                            int var183 = class37.field785[var5 + 1];
                            int[] var184 = class37.field785;
                            int var185 = var5++;
                            class16 var186 = (class16) class16.field213.method3519((long) var182);
                            int var187;
                            if (var186 == null) {
                                var187 = -1;
                            } else if (var183 >= 0 && var183 < var186.field207.length) {
                                var187 = var186.field207[var183];
                            } else {
                                var187 = -1;
                            }
                            var184[var185] = var187;
                            continue;
                        }
                        if (var528 == 3314) {
                            var5 -= 2;
                            int var188 = class37.field785[var5] + 32768;
                            int var189 = class37.field785[var5 + 1];
                            int[] var190 = class37.field785;
                            int var191 = var5++;
                            class16 var192 = (class16) class16.field213.method3519((long) var188);
                            int var193;
                            if (var192 == null) {
                                var193 = 0;
                            } else if (var189 >= 0 && var189 < var192.field209.length) {
                                var193 = var192.field209[var189];
                            } else {
                                var193 = 0;
                            }
                            var190[var191] = var193;
                            continue;
                        }
                        if (var528 == 3315) {
                            var5 -= 2;
                            int var194 = class37.field785[var5] + 32768;
                            int var195 = class37.field785[var5 + 1];
                            int[] var196 = class37.field785;
                            int var197 = var5++;
                            class16 var198 = (class16) class16.field213.method3519((long) var194);
                            int var199;
                            if (var198 == null) {
                                var199 = 0;
                            } else if (var195 == -1) {
                                var199 = 0;
                            } else {
                                int var200 = 0;
                                for (int var201 = 0; var201 < var198.field209.length; var201++) {
                                    if (var198.field207[var201] == var195) {
                                        var200 += var198.field209[var201];
                                    }
                                }
                                var199 = var200;
                            }
                            var196[var197] = var199;
                            continue;
                        }
                        if (var528 == 3316) {
                            if (client.field536 >= 2) {
                                class37.field785[var5++] = client.field536;
                            } else {
                                class37.field785[var5++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class37.field785[var5++] = client.field454;
                            continue;
                        }
                        if (var528 == 3318) {
                            class37.field785[var5++] = client.field273;
                            continue;
                        }
                        if (var528 == 3321) {
                            class37.field785[var5++] = client.field439;
                            continue;
                        }
                        if (var528 == 3322) {
                            class37.field785[var5++] = client.field378;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (client.field443) {
                                class37.field785[var5++] = 1;
                            } else {
                                class37.field785[var5++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 3324) {
                            class37.field785[var5++] = client.field274;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var5 -= 2;
                            int var202 = class37.field785[var5];
                            int var203 = class37.field785[var5 + 1];
                            class49 var204 = (class49) class49.field1056.method3478((long) var202);
                            class49 var205;
                            if (var204 == null) {
                                byte[] var206 = field1062.method3010(8, var202);
                                class49 var207 = new class49();
                                if (var206 != null) {
                                    var207.method947(new class119(var206));
                                }
                                class49.field1056.method3481(var207, (long) var202);
                                var205 = var207;
                            } else {
                                var205 = var204;
                            }
                            class49 var208 = var205;
                            if (var205.field1058 != 's') {
                            }
                            for (int var209 = 0; var209 < var208.field1061; var209++) {
                                if (var208.field1065[var209] == var203) {
                                    class37.field778[var6++] = var208.field1064[var209];
                                    var208 = null;
                                    break;
                                }
                            }
                            if (var208 != null) {
                                class37.field778[var6++] = var208.field1066;
                            }
                            continue;
                        }
                        if (var528 == 3408) {
                            var5 -= 4;
                            int var210 = class37.field785[var5];
                            int var211 = class37.field785[var5 + 1];
                            int var212 = class37.field785[var5 + 2];
                            int var213 = class37.field785[var5 + 3];
                            class49 var214 = (class49) class49.field1056.method3478((long) var212);
                            class49 var215;
                            if (var214 == null) {
                                byte[] var216 = field1062.method3010(8, var212);
                                class49 var217 = new class49();
                                if (var216 != null) {
                                    var217.method947(new class119(var216));
                                }
                                class49.field1056.method3481(var217, (long) var212);
                                var215 = var217;
                            } else {
                                var215 = var214;
                            }
                            class49 var218 = var215;
                            if (var215.field1055 == var210 && var215.field1058 == var211) {
                                for (int var219 = 0; var219 < var218.field1061; var219++) {
                                    if (var218.field1065[var219] == var213) {
                                        if (var211 == 115) {
                                            class37.field778[var6++] = var218.field1064[var219];
                                        } else {
                                            class37.field785[var5++] = var218.field1063[var219];
                                        }
                                        var218 = null;
                                        break;
                                    }
                                }
                                if (var218 != null) {
                                    if (var211 == 115) {
                                        class37.field778[var6++] = var218.field1066;
                                    } else {
                                        class37.field785[var5++] = var218.field1068;
                                    }
                                }
                                continue;
                            }
                            if (var211 == 115) {
                                class37.field778[var6++] = "null";
                            } else {
                                class37.field785[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (client.field329 == 0) {
                                class37.field785[var5++] = -2;
                            } else if (client.field329 == 1) {
                                class37.field785[var5++] = -1;
                            } else {
                                class37.field785[var5++] = client.field533;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var5--;
                            int var220 = class37.field785[var5];
                            if (client.field329 == 2 && var220 < client.field533) {
                                class37.field778[var6++] = client.field543[var220].field235;
                                class37.field778[var6++] = client.field543[var220].field237;
                                continue;
                            }
                            class37.field778[var6++] = "";
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var5--;
                            int var221 = class37.field785[var5];
                            if (client.field329 == 2 && var221 < client.field533) {
                                class37.field785[var5++] = client.field543[var221].field236;
                                continue;
                            }
                            class37.field785[var5++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var5--;
                            int var222 = class37.field785[var5];
                            if (client.field329 == 2 && var222 < client.field533) {
                                class37.field785[var5++] = client.field543[var222].field234;
                                continue;
                            }
                            class37.field785[var5++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var6--;
                            String var223 = class37.field778[var6];
                            var5--;
                            int var224 = class37.field785[var5];
                            method2219(var223, var224);
                            continue;
                        }
                        if (var528 == 3605) {
                            var6--;
                            String var225 = class37.field778[var6];
                            client.method625(var225);
                            continue;
                        }
                        if (var528 == 3606) {
                            var6--;
                            String var226 = class37.field778[var6];
                            if (var226 == null) {
                                continue;
                            }
                            String var227 = method547(var226, field277);
                            if (var227 == null) {
                                continue;
                            }
                            int var228 = 0;
                            while (true) {
                                if (var228 >= client.field533) {
                                    continue label3475;
                                }
                                class18 var229 = client.field543[var228];
                                String var230 = var229.field235;
                                String var231 = method547(var230, field277);
                                boolean var232;
                                if (var226 == null || var230 == null) {
                                    var232 = false;
                                } else if (var226.startsWith("#") || var230.startsWith("#")) {
                                    var232 = var226.equals(var230);
                                } else {
                                    var232 = var227.equals(var231);
                                }
                                if (var232) {
                                    client.field533--;
                                    for (int var233 = var228; var233 < client.field533; var233++) {
                                        client.field543[var233] = client.field543[var233 + 1];
                                    }
                                    client.field325 = client.field459;
                                    client.field317.method2575(147);
                                    client.field317.method2323(class119.method2648(var226));
                                    client.field317.method2329(var226);
                                    continue label3475;
                                }
                                var228++;
                            }
                        }
                        if (var528 == 3607) {
                            var6--;
                            String var234 = class37.field778[var6];
                            if (var234 == null) {
                                continue;
                            }
                            if ((client.field546 < 100 || client.field399 == 1) && client.field546 < 400) {
                                String var235 = method547(var234, field277);
                                if (var235 == null) {
                                    continue;
                                }
                                for (int var236 = 0; var236 < client.field546; var236++) {
                                    class8 var237 = client.field547[var236];
                                    String var238 = method547(var237.field122, field277);
                                    if (var238 != null && var238.equals(var235)) {
                                        class12.method2001(31, "", var234 + class157.field2464);
                                        continue label3475;
                                    }
                                    if (var237.field124 != null) {
                                        String var239 = method547(var237.field124, field277);
                                        if (var239 != null && var239.equals(var235)) {
                                            class12.method2001(31, "", var234 + class157.field2464);
                                            continue label3475;
                                        }
                                    }
                                }
                                for (int var240 = 0; var240 < client.field533; var240++) {
                                    class18 var241 = client.field543[var240];
                                    String var242 = method547(var241.field235, field277);
                                    if (var242 != null && var242.equals(var235)) {
                                        class12.method2001(31, "", class157.field2422 + var234 + class157.field2470);
                                        continue label3475;
                                    }
                                    if (var241.field237 != null) {
                                        String var243 = method547(var241.field237, field277);
                                        if (var243 != null && var243.equals(var235)) {
                                            class12.method2001(31, "", class157.field2422 + var234 + class157.field2470);
                                            continue label3475;
                                        }
                                    }
                                }
                                if (method547(field119.field38, field277).equals(var235)) {
                                    class12.method2001(31, "", class157.field2466);
                                } else {
                                    client.field317.method2575(5);
                                    client.field317.method2323(class119.method2648(var234));
                                    client.field317.method2329(var234);
                                }
                                continue;
                            }
                            class12.method2001(31, "", class157.field2305);
                            continue;
                        }
                        if (var528 == 3608) {
                            var6--;
                            String var244 = class37.field778[var6];
                            if (var244 == null) {
                                continue;
                            }
                            String var245 = method547(var244, field277);
                            if (var245 == null) {
                                continue;
                            }
                            int var246 = 0;
                            while (true) {
                                if (var246 >= client.field546) {
                                    continue label3475;
                                }
                                class8 var247 = client.field547[var246];
                                String var248 = var247.field122;
                                String var249 = method547(var248, field277);
                                boolean var250;
                                if (var244 == null || var248 == null) {
                                    var250 = false;
                                } else if (var244.startsWith("#") || var248.startsWith("#")) {
                                    var250 = var244.equals(var248);
                                } else {
                                    var250 = var245.equals(var249);
                                }
                                if (var250) {
                                    client.field546--;
                                    for (int var251 = var246; var251 < client.field546; var251++) {
                                        client.field547[var251] = client.field547[var251 + 1];
                                    }
                                    client.field325 = client.field459;
                                    client.field317.method2575(230);
                                    client.field317.method2323(class119.method2648(var244));
                                    client.field317.method2329(var244);
                                    continue label3475;
                                }
                                var246++;
                            }
                        }
                        if (var528 == 3609) {
                            var6--;
                            String var252 = class37.field778[var6];
                            class152[] var253 = class152.method1476();
                            for (int var254 = 0; var254 < var253.length; var254++) {
                                class152 var255 = var253[var254];
                                if (var255.field2246 != -1 && var252.startsWith(class2.method2220(var255.field2246))) {
                                    var252 = var252.substring(6 + Integer.toString(var255.field2246).length());
                                    break;
                                }
                            }
                            class37.field785[var5++] = client.method2240(var252, false) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3611) {
                            if (client.field501 == null) {
                                class37.field778[var6++] = "";
                            } else {
                                class37.field778[var6++] = class162.method2276(client.field501);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (client.field501 == null) {
                                class37.field785[var5++] = 0;
                            } else {
                                class37.field785[var5++] = field1006;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var5--;
                            int var256 = class37.field785[var5];
                            if (client.field501 != null && var256 < field1006) {
                                class37.field778[var6++] = field2235[var256].field604;
                                continue;
                            }
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var5--;
                            int var257 = class37.field785[var5];
                            if (client.field501 != null && var257 < field1006) {
                                class37.field785[var5++] = field2235[var257].field602;
                                continue;
                            }
                            class37.field785[var5++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var5--;
                            int var258 = class37.field785[var5];
                            if (client.field501 != null && var258 < field1006) {
                                class37.field785[var5++] = field2235[var258].field600;
                                continue;
                            }
                            class37.field785[var5++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class37.field785[var5++] = field283;
                            continue;
                        }
                        if (var528 == 3617) {
                            var6--;
                            String var259 = class37.field778[var6];
                            client.method975(var259);
                            continue;
                        }
                        if (var528 == 3618) {
                            class37.field785[var5++] = field1025;
                            continue;
                        }
                        if (var528 == 3619) {
                            var6--;
                            String var260 = class37.field778[var6];
                            if (!var260.equals("")) {
                                client.field317.method2575(185);
                                client.field317.method2323(class119.method2648(var260));
                                client.field317.method2329(var260);
                            }
                            continue;
                        }
                        if (var528 == 3620) {
                            client.method3207();
                            continue;
                        }
                        if (var528 == 3621) {
                            if (client.field329 == 0) {
                                class37.field785[var5++] = -1;
                            } else {
                                class37.field785[var5++] = client.field546;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var5--;
                            int var261 = class37.field785[var5];
                            if (client.field329 != 0 && var261 < client.field546) {
                                class37.field778[var6++] = client.field547[var261].field122;
                                class37.field778[var6++] = client.field547[var261].field124;
                                continue;
                            }
                            class37.field778[var6++] = "";
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var6--;
                            String var262 = class37.field778[var6];
                            if (var262.startsWith(class2.method2220(0)) || var262.startsWith(class2.method2220(1))) {
                                var262 = var262.substring(7);
                            }
                            class37.field785[var5++] = client.method713(var262) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var5--;
                            int var263 = class37.field785[var5];
                            if (field2235 != null && var263 < field1006 && field2235[var263].field604.equalsIgnoreCase(field119.field38)) {
                                class37.field785[var5++] = 1;
                                continue;
                            }
                            class37.field785[var5++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (client.field502 == null) {
                                class37.field778[var6++] = "";
                            } else {
                                class37.field778[var6++] = class162.method2276(client.field502);
                            }
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var5--;
                            int var264 = class37.field785[var5];
                            class37.field785[var5++] = client.field551[var264].method3738();
                            continue;
                        }
                        if (var528 == 3904) {
                            var5--;
                            int var265 = class37.field785[var5];
                            class37.field785[var5++] = client.field551[var265].field3146;
                            continue;
                        }
                        if (var528 == 3905) {
                            var5--;
                            int var266 = class37.field785[var5];
                            class37.field785[var5++] = client.field551[var266].field3147;
                            continue;
                        }
                        if (var528 == 3906) {
                            var5--;
                            int var267 = class37.field785[var5];
                            class37.field785[var5++] = client.field551[var267].field3149;
                            continue;
                        }
                        if (var528 == 3907) {
                            var5--;
                            int var268 = class37.field785[var5];
                            class37.field785[var5++] = client.field551[var268].field3150;
                            continue;
                        }
                        if (var528 == 3908) {
                            var5--;
                            int var269 = class37.field785[var5];
                            class37.field785[var5++] = client.field551[var269].field3151;
                            continue;
                        }
                        if (var528 == 3910) {
                            var5--;
                            int var270 = class37.field785[var5];
                            int var271 = client.field551[var270].method3746();
                            class37.field785[var5++] = var271 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var5--;
                            int var272 = class37.field785[var5];
                            int var273 = client.field551[var272].method3746();
                            class37.field785[var5++] = var273 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var5--;
                            int var274 = class37.field785[var5];
                            int var275 = client.field551[var274].method3746();
                            class37.field785[var5++] = var275 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var5--;
                            int var276 = class37.field785[var5];
                            int var277 = client.field551[var276].method3746();
                            class37.field785[var5++] = var277 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3914) {
                            var5--;
                            boolean var278 = class37.field785[var5] == 1;
                            if (field2011 != null) {
                                field2011.method3750(class221.field3155, var278);
                            }
                            continue;
                        }
                        if (var528 == 3915) {
                            var5--;
                            boolean var279 = class37.field785[var5] == 1;
                            if (field2011 != null) {
                                field2011.method3750(class221.field3152, var279);
                            }
                            continue;
                        }
                        if (var528 == 3916) {
                            var5 -= 2;
                            boolean var280 = class37.field785[var5] == 1;
                            boolean var281 = class37.field785[var5 + 1] == 1;
                            if (field2011 != null) {
                                field2011.method3750(new class22(var281), var280);
                            }
                            continue;
                        }
                        if (var528 == 3917) {
                            var5--;
                            boolean var282 = class37.field785[var5] == 1;
                            if (field2011 != null) {
                                field2011.method3750(class221.field3153, var282);
                            }
                            continue;
                        }
                        if (var528 == 3918) {
                            var5--;
                            boolean var283 = class37.field785[var5] == 1;
                            if (field2011 != null) {
                                field2011.method3750(class221.field3156, var283);
                            }
                            continue;
                        }
                        if (var528 == 3919) {
                            class37.field785[var5++] = field2011 == null ? 0 : field2011.field3154.size();
                            continue;
                        }
                        if (var528 == 3920) {
                            var5--;
                            int var284 = class37.field785[var5];
                            class214 var285 = (class214) field2011.field3154.get(var284);
                            class37.field785[var5++] = var285.field3135;
                            continue;
                        }
                        if (var528 == 3921) {
                            var5--;
                            int var286 = class37.field785[var5];
                            class214 var287 = (class214) field2011.field3154.get(var286);
                            class37.field778[var6++] = var287.method3686();
                            continue;
                        }
                        if (var528 == 3922) {
                            var5--;
                            int var288 = class37.field785[var5];
                            class214 var289 = (class214) field2011.field3154.get(var288);
                            class37.field778[var6++] = var289.method3687();
                            continue;
                        }
                        if (var528 == 3923) {
                            var5--;
                            int var290 = class37.field785[var5];
                            class214 var291 = (class214) field2011.field3154.get(var290);
                            long var292 = class115.method1998() - field210 - var291.field3131;
                            int var294 = (int) (var292 / 3600000L);
                            int var295 = (int) ((var292 - (long) (var294 * 3600000)) / 60000L);
                            int var296 = (int) ((var292 - (long) (var294 * 3600000) - (long) (var295 * 60000)) / 1000L);
                            String var297 = var294 + ":" + var295 / 10 + var295 % 10 + ":" + var296 / 10 + var296 % 10;
                            class37.field778[var6++] = var297;
                            continue;
                        }
                        if (var528 == 3924) {
                            var5--;
                            int var298 = class37.field785[var5];
                            class214 var299 = (class214) field2011.field3154.get(var298);
                            class37.field785[var5++] = var299.field3132.field3149;
                            continue;
                        }
                        if (var528 == 3925) {
                            var5--;
                            int var300 = class37.field785[var5];
                            class214 var301 = (class214) field2011.field3154.get(var300);
                            class37.field785[var5++] = var301.field3132.field3147;
                            continue;
                        }
                        if (var528 == 3926) {
                            var5--;
                            int var302 = class37.field785[var5];
                            class214 var303 = (class214) field2011.field3154.get(var302);
                            class37.field785[var5++] = var303.field3132.field3146;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var5 -= 2;
                            int var304 = class37.field785[var5];
                            int var305 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var304 + var305;
                            continue;
                        }
                        if (var528 == 4001) {
                            var5 -= 2;
                            int var306 = class37.field785[var5];
                            int var307 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var306 - var307;
                            continue;
                        }
                        if (var528 == 4002) {
                            var5 -= 2;
                            int var308 = class37.field785[var5];
                            int var309 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var308 * var309;
                            continue;
                        }
                        if (var528 == 4003) {
                            var5 -= 2;
                            int var310 = class37.field785[var5];
                            int var311 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var310 / var311;
                            continue;
                        }
                        if (var528 == 4004) {
                            var5--;
                            int var312 = class37.field785[var5];
                            class37.field785[var5++] = (int) (Math.random() * (double) var312);
                            continue;
                        }
                        if (var528 == 4005) {
                            var5--;
                            int var313 = class37.field785[var5];
                            class37.field785[var5++] = (int) (Math.random() * (double) (var313 + 1));
                            continue;
                        }
                        if (var528 == 4006) {
                            var5 -= 5;
                            int var314 = class37.field785[var5];
                            int var315 = class37.field785[var5 + 1];
                            int var316 = class37.field785[var5 + 2];
                            int var317 = class37.field785[var5 + 3];
                            int var318 = class37.field785[var5 + 4];
                            class37.field785[var5++] = (var315 - var314) * (var318 - var316) / (var317 - var316) + var314;
                            continue;
                        }
                        if (var528 == 4007) {
                            var5 -= 2;
                            int var319 = class37.field785[var5];
                            int var320 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var319 * var320 / 100 + var319;
                            continue;
                        }
                        if (var528 == 4008) {
                            var5 -= 2;
                            int var321 = class37.field785[var5];
                            int var322 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var321 | 0x1 << var322;
                            continue;
                        }
                        if (var528 == 4009) {
                            var5 -= 2;
                            int var323 = class37.field785[var5];
                            int var324 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var323 & -1 - (0x1 << var324);
                            continue;
                        }
                        if (var528 == 4010) {
                            var5 -= 2;
                            int var325 = class37.field785[var5];
                            int var326 = class37.field785[var5 + 1];
                            class37.field785[var5++] = (var325 & 0x1 << var326) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var5 -= 2;
                            int var327 = class37.field785[var5];
                            int var328 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var327 % var328;
                            continue;
                        }
                        if (var528 == 4012) {
                            var5 -= 2;
                            int var329 = class37.field785[var5];
                            int var330 = class37.field785[var5 + 1];
                            if (var329 == 0) {
                                class37.field785[var5++] = 0;
                            } else {
                                class37.field785[var5++] = (int) Math.pow((double) var329, (double) var330);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var5 -= 2;
                            int var331 = class37.field785[var5];
                            int var332 = class37.field785[var5 + 1];
                            if (var331 == 0) {
                                class37.field785[var5++] = 0;
                            } else if (var332 == 0) {
                                class37.field785[var5++] = Integer.MAX_VALUE;
                            } else {
                                class37.field785[var5++] = (int) Math.pow((double) var331, 1.0D / (double) var332);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var5 -= 2;
                            int var333 = class37.field785[var5];
                            int var334 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var333 & var334;
                            continue;
                        }
                        if (var528 == 4015) {
                            var5 -= 2;
                            int var335 = class37.field785[var5];
                            int var336 = class37.field785[var5 + 1];
                            class37.field785[var5++] = var335 | var336;
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var6--;
                            String var337 = class37.field778[var6];
                            var5--;
                            int var338 = class37.field785[var5];
                            class37.field778[var6++] = var337 + var338;
                            continue;
                        }
                        if (var528 == 4101) {
                            var6 -= 2;
                            String var339 = class37.field778[var6];
                            String var340 = class37.field778[var6 + 1];
                            class37.field778[var6++] = var339 + var340;
                            continue;
                        }
                        if (var528 == 4102) {
                            var6--;
                            String var341 = class37.field778[var6];
                            var5--;
                            int var342 = class37.field785[var5];
                            class37.field778[var6++] = var341 + class163.method2000(var342, true);
                            continue;
                        }
                        if (var528 == 4103) {
                            var6--;
                            String var343 = class37.field778[var6];
                            class37.field778[var6++] = var343.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var5--;
                            int var344 = class37.field785[var5];
                            long var345 = ((long) var344 + 11745L) * 86400000L;
                            class37.field781.setTime(new Date(var345));
                            int var347 = class37.field781.get(5);
                            int var348 = class37.field781.get(2);
                            int var349 = class37.field781.get(1);
                            class37.field778[var6++] = var347 + "-" + class37.field782[var348] + "-" + var349;
                            continue;
                        }
                        if (var528 == 4105) {
                            var6 -= 2;
                            String var350 = class37.field778[var6];
                            String var351 = class37.field778[var6 + 1];
                            if (field119.field30 != null && field119.field30.field2901) {
                                class37.field778[var6++] = var351;
                                continue;
                            }
                            class37.field778[var6++] = var350;
                            continue;
                        }
                        if (var528 == 4106) {
                            var5--;
                            int var352 = class37.field785[var5];
                            class37.field778[var6++] = Integer.toString(var352);
                            continue;
                        }
                        if (var528 == 4107) {
                            var6 -= 2;
                            int[] var353 = class37.field785;
                            int var354 = var5++;
                            String var355 = class37.field778[var6];
                            String var356 = class37.field778[var6 + 1];
                            int var357 = client.field280;
                            int var358 = var355.length();
                            int var359 = var356.length();
                            int var360 = 0;
                            int var361 = 0;
                            char var362 = 0;
                            char var363 = 0;
                            int var364;
                            label3174: while (true) {
                                if (var360 - var362 >= var358 && var361 - var363 >= var359) {
                                    int var373 = Math.min(var358, var359);
                                    for (int var374 = 0; var374 < var373; var374++) {
                                        char var377 = var355.charAt(var374);
                                        char var378 = var356.charAt(var374);
                                        if (var377 != var378 && Character.toUpperCase(var377) != Character.toUpperCase(var378)) {
                                            char var379 = Character.toLowerCase(var377);
                                            char var380 = Character.toLowerCase(var378);
                                            if (var379 != var380) {
                                                var364 = class166.method142(var379, var357) - class166.method142(var380, var357);
                                                break label3174;
                                            }
                                        }
                                    }
                                    int var381 = var358 - var359;
                                    if (var381 == 0) {
                                        for (int var382 = 0; var382 < var373; var382++) {
                                            char var383 = var355.charAt(var382);
                                            char var384 = var356.charAt(var382);
                                            if (var383 != var384) {
                                                var364 = class166.method142(var383, var357) - class166.method142(var384, var357);
                                                break label3174;
                                            }
                                        }
                                        var364 = 0;
                                    } else {
                                        var364 = var381;
                                    }
                                    break;
                                }
                                if (var360 - var362 >= var358) {
                                    var364 = -1;
                                    break;
                                }
                                if (var361 - var363 >= var359) {
                                    var364 = 1;
                                    break;
                                }
                                char var365;
                                if (var362 == 0) {
                                    var365 = var355.charAt(var360++);
                                } else {
                                    var365 = var362;
                                    boolean var366 = false;
                                }
                                char var367;
                                if (var363 == 0) {
                                    var367 = var356.charAt(var361++);
                                } else {
                                    var367 = var363;
                                    boolean var368 = false;
                                }
                                var362 = class166.method2702(var365);
                                var363 = class166.method2702(var367);
                                char var369 = class166.method2261(var365, var357);
                                char var370 = class166.method2261(var367, var357);
                                if (var369 != var370 && Character.toUpperCase(var369) != Character.toUpperCase(var370)) {
                                    char var371 = Character.toLowerCase(var369);
                                    char var372 = Character.toLowerCase(var370);
                                    if (var371 != var372) {
                                        var364 = class166.method142(var371, var357) - class166.method142(var372, var357);
                                        break;
                                    }
                                }
                            }
                            byte var386;
                            if (var364 > 0) {
                                var386 = 1;
                            } else if (var364 < 0) {
                                var386 = -1;
                            } else {
                                var386 = 0;
                            }
                            var353[var354] = var386;
                            continue;
                        }
                        if (var528 == 4108) {
                            var6--;
                            String var387 = class37.field778[var6];
                            var5 -= 2;
                            int var388 = class37.field785[var5];
                            int var389 = class37.field785[var5 + 1];
                            byte[] var390 = field233.method3010(var389, 0);
                            class224 var391 = new class224(var390);
                            class37.field785[var5++] = var391.method3778(var387, var388);
                            continue;
                        }
                        if (var528 == 4109) {
                            var6--;
                            String var392 = class37.field778[var6];
                            var5 -= 2;
                            int var393 = class37.field785[var5];
                            int var394 = class37.field785[var5 + 1];
                            byte[] var395 = field233.method3010(var394, 0);
                            class224 var396 = new class224(var395);
                            class37.field785[var5++] = var396.method3760(var392, var393);
                            continue;
                        }
                        if (var528 == 4110) {
                            var6 -= 2;
                            String var397 = class37.field778[var6];
                            String var398 = class37.field778[var6 + 1];
                            var5--;
                            if (class37.field785[var5] == 1) {
                                class37.field778[var6++] = var397;
                            } else {
                                class37.field778[var6++] = var398;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var6--;
                            String var399 = class37.field778[var6];
                            class37.field778[var6++] = class223.method3792(var399);
                            continue;
                        }
                        if (var528 == 4112) {
                            var6--;
                            String var400 = class37.field778[var6];
                            var5--;
                            int var401 = class37.field785[var5];
                            class37.field778[var6++] = var400 + (char) var401;
                            continue;
                        }
                        if (var528 == 4113) {
                            var5--;
                            int var402 = class37.field785[var5];
                            int[] var403 = class37.field785;
                            int var404 = var5++;
                            char var405 = (char) var402;
                            boolean var406;
                            if (var405 >= ' ' && var405 <= '~') {
                                var406 = true;
                            } else if (var405 >= 160 && var405 <= 255) {
                                var406 = true;
                            } else if (var405 == 8364 || var405 == 338 || var405 == 8212 || var405 == 339 || var405 == 376) {
                                var406 = true;
                            } else {
                                var406 = false;
                            }
                            var403[var404] = var406 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var5--;
                            int var407 = class37.field785[var5];
                            int[] var408 = class37.field785;
                            int var409 = var5++;
                            char var410 = (char) var407;
                            boolean var411 = var410 >= '0' && var410 <= '9' || var410 >= 'A' && var410 <= 'Z' || var410 >= 'a' && var410 <= 'z';
                            var408[var409] = var411 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var5--;
                            int var412 = class37.field785[var5];
                            int[] var413 = class37.field785;
                            int var414 = var5++;
                            char var415 = (char) var412;
                            boolean var416 = var415 >= 'A' && var415 <= 'Z' || var415 >= 'a' && var415 <= 'z';
                            var413[var414] = var416 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var5--;
                            int var417 = class37.field785[var5];
                            class37.field785[var5++] = class163.method1926((char) var417) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var6--;
                            String var418 = class37.field778[var6];
                            if (var418 == null) {
                                class37.field785[var5++] = 0;
                            } else {
                                class37.field785[var5++] = var418.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var6--;
                            String var419 = class37.field778[var6];
                            var5 -= 2;
                            int var420 = class37.field785[var5];
                            int var421 = class37.field785[var5 + 1];
                            class37.field778[var6++] = var419.substring(var420, var421);
                            continue;
                        }
                        if (var528 == 4119) {
                            var6--;
                            String var422 = class37.field778[var6];
                            StringBuilder var423 = new StringBuilder(var422.length());
                            boolean var424 = false;
                            for (int var425 = 0; var425 < var422.length(); var425++) {
                                char var426 = var422.charAt(var425);
                                if (var426 == '<') {
                                    var424 = true;
                                } else if (var426 == '>') {
                                    var424 = false;
                                } else if (!var424) {
                                    var423.append(var426);
                                }
                            }
                            class37.field778[var6++] = var423.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6--;
                            String var427 = class37.field778[var6];
                            var5--;
                            int var428 = class37.field785[var5];
                            class37.field785[var5++] = var427.indexOf(var428);
                            continue;
                        }
                        if (var528 == 4121) {
                            var6 -= 2;
                            String var429 = class37.field778[var6];
                            String var430 = class37.field778[var6 + 1];
                            var5--;
                            int var431 = class37.field785[var5];
                            class37.field785[var5++] = var429.indexOf(var430, var431);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var5--;
                            int var432 = class37.field785[var5];
                            class37.field778[var6++] = class52.method2651(var432).field1105;
                            continue;
                        }
                        if (var528 == 4201) {
                            var5 -= 2;
                            int var433 = class37.field785[var5];
                            int var434 = class37.field785[var5 + 1];
                            class52 var435 = class52.method2651(var433);
                            if (var434 >= 1 && var434 <= 5 && var435.field1110[var434 - 1] != null) {
                                class37.field778[var6++] = var435.field1110[var434 - 1];
                                continue;
                            }
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var5 -= 2;
                            int var436 = class37.field785[var5];
                            int var437 = class37.field785[var5 + 1];
                            class52 var438 = class52.method2651(var436);
                            if (var437 >= 1 && var437 <= 5 && var438.field1098[var437 - 1] != null) {
                                class37.field778[var6++] = var438.field1098[var437 - 1];
                                continue;
                            }
                            class37.field778[var6++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var5--;
                            int var439 = class37.field785[var5];
                            class37.field785[var5++] = class52.method2651(var439).field1113;
                            continue;
                        }
                        if (var528 == 4204) {
                            var5--;
                            int var440 = class37.field785[var5];
                            class37.field785[var5++] = class52.method2651(var440).field1116 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var5--;
                            int var441 = class37.field785[var5];
                            class52 var442 = class52.method2651(var441);
                            if (var442.field1136 == -1 && var442.field1135 >= 0) {
                                class37.field785[var5++] = var442.field1135;
                                continue;
                            }
                            class37.field785[var5++] = var441;
                            continue;
                        }
                        if (var528 == 4206) {
                            var5--;
                            int var443 = class37.field785[var5];
                            class52 var444 = class52.method2651(var443);
                            if (var444.field1136 >= 0 && var444.field1135 >= 0) {
                                class37.field785[var5++] = var444.field1135;
                                continue;
                            }
                            class37.field785[var5++] = var443;
                            continue;
                        }
                        if (var528 == 4207) {
                            var5--;
                            int var445 = class37.field785[var5];
                            class37.field785[var5++] = class52.method2651(var445).field1118 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4210) {
                            var6--;
                            String var446 = class37.field778[var6];
                            var5--;
                            int var447 = class37.field785[var5];
                            boolean var449 = var447 == 1;
                            String var450 = var446.toLowerCase();
                            short[] var451 = new short[16];
                            int var452 = 0;
                            int var453 = 0;
                            while (true) {
                                if (var453 >= field125) {
                                    field1608 = var451;
                                    field1166 = 0;
                                    field3057 = var452;
                                    String[] var457 = new String[field3057];
                                    for (int var458 = 0; var458 < field3057; var458++) {
                                        var457[var458] = class52.method2651(var451[var458]).field1105;
                                    }
                                    class124.method718(var457, field1608);
                                    break;
                                }
                                class52 var454 = class52.method2651(var453);
                                if ((!var449 || var454.field1112) && var454.field1136 == -1 && var454.field1105.toLowerCase().indexOf(var450) != -1) {
                                    if (var452 >= 250) {
                                        field3057 = -1;
                                        field1608 = null;
                                        break;
                                    }
                                    if (var452 >= var451.length) {
                                        short[] var455 = new short[var451.length * 2];
                                        for (int var456 = 0; var456 < var452; var456++) {
                                            var455[var456] = var451[var456];
                                        }
                                        var451 = var455;
                                    }
                                    var451[var452++] = (short) var453;
                                }
                                var453++;
                            }
                            class37.field785[var5++] = field3057;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (field1608 != null && field1166 < field3057) {
                                class37.field785[var5++] = field1608[++field1166 - 1] & 0xFFFF;
                                continue;
                            }
                            class37.field785[var5++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            field1166 = 0;
                            continue;
                        }
                    } else if (var528 < 5100) {
                        if (var528 == 5000) {
                            class37.field785[var5++] = client.field309;
                            continue;
                        }
                        if (var528 == 5001) {
                            var5 -= 3;
                            client.field309 = class37.field785[var5];
                            int var459 = class37.field785[var5 + 1];
                            class130[] var460 = class130.method723();
                            int var461 = 0;
                            class130 var463;
                            while (true) {
                                if (var461 >= var460.length) {
                                    var463 = null;
                                    break;
                                }
                                class130 var462 = var460[var461];
                                if (var462.field2044 == var459) {
                                    var463 = var462;
                                    break;
                                }
                                var461++;
                            }
                            field1091 = var463;
                            if (field1091 == null) {
                                field1091 = class130.field2045;
                            }
                            client.field500 = class37.field785[var5 + 2];
                            client.field317.method2575(42);
                            client.field317.method2323(client.field309);
                            client.field317.method2323(field1091.field2044);
                            client.field317.method2323(client.field500);
                            continue;
                        }
                        if (var528 == 5002) {
                            var6--;
                            String var464 = class37.field778[var6];
                            var5 -= 2;
                            int var465 = class37.field785[var5];
                            int var466 = class37.field785[var5 + 1];
                            client.field317.method2575(95);
                            client.field317.method2323(class119.method2648(var464) + 2);
                            client.field317.method2329(var464);
                            client.field317.method2323(var465 - 1);
                            client.field317.method2323(var466);
                            continue;
                        }
                        if (var528 == 5003) {
                            var5 -= 2;
                            int var467 = class37.field785[var5];
                            int var468 = class37.field785[var5 + 1];
                            class36 var469 = class12.method121(var467, var468);
                            if (var469 == null) {
                                class37.field785[var5++] = -1;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                                class37.field778[var6++] = "";
                                class37.field778[var6++] = "";
                            } else {
                                class37.field785[var5++] = var469.field770;
                                class37.field785[var5++] = var469.field760;
                                class37.field778[var6++] = var469.field762 == null ? "" : var469.field762;
                                class37.field778[var6++] = var469.field763 == null ? "" : var469.field763;
                                class37.field778[var6++] = var469.field759 == null ? "" : var469.field759;
                            }
                            continue;
                        }
                        if (var528 == 5004) {
                            var5--;
                            int var470 = class37.field785[var5];
                            class36 var471 = (class36) class12.field167.method3541((long) var470);
                            if (var471 == null) {
                                class37.field785[var5++] = -1;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                                class37.field778[var6++] = "";
                                class37.field778[var6++] = "";
                            } else {
                                class37.field785[var5++] = var471.field761;
                                class37.field785[var5++] = var471.field760;
                                class37.field778[var6++] = var471.field762 == null ? "" : var471.field762;
                                class37.field778[var6++] = var471.field763 == null ? "" : var471.field763;
                                class37.field778[var6++] = var471.field759 == null ? "" : var471.field759;
                            }
                            continue;
                        }
                        if (var528 == 5005) {
                            if (field1091 == null) {
                                class37.field785[var5++] = -1;
                            } else {
                                class37.field785[var5++] = field1091.field2044;
                            }
                            continue;
                        }
                        if (var528 == 5008) {
                            var6--;
                            String var473 = class37.field778[var6];
                            var5--;
                            int var474 = class37.field785[var5];
                            String var475 = var473.toLowerCase();
                            byte var476 = 0;
                            if (var475.startsWith(class157.field2471)) {
                                var476 = 0;
                                var473 = var473.substring(class157.field2471.length());
                            } else if (var475.startsWith(class157.field2535)) {
                                var476 = 1;
                                var473 = var473.substring(class157.field2535.length());
                            } else if (var475.startsWith(class157.field2475)) {
                                var476 = 2;
                                var473 = var473.substring(class157.field2475.length());
                            } else if (var475.startsWith(class157.field2477)) {
                                var476 = 3;
                                var473 = var473.substring(class157.field2477.length());
                            } else if (var475.startsWith(class157.field2294)) {
                                var476 = 4;
                                var473 = var473.substring(class157.field2294.length());
                            } else if (var475.startsWith(class157.field2481)) {
                                var476 = 5;
                                var473 = var473.substring(class157.field2481.length());
                            } else if (var475.startsWith(class157.field2483)) {
                                var476 = 6;
                                var473 = var473.substring(class157.field2483.length());
                            } else if (var475.startsWith(class157.field2485)) {
                                var476 = 7;
                                var473 = var473.substring(class157.field2485.length());
                            } else if (var475.startsWith(class157.field2541)) {
                                var476 = 8;
                                var473 = var473.substring(class157.field2541.length());
                            } else if (var475.startsWith(class157.field2489)) {
                                var476 = 9;
                                var473 = var473.substring(class157.field2489.length());
                            } else if (var475.startsWith(class157.field2491)) {
                                var476 = 10;
                                var473 = var473.substring(class157.field2491.length());
                            } else if (var475.startsWith(class157.field2493)) {
                                var476 = 11;
                                var473 = var473.substring(class157.field2493.length());
                            } else if (client.field280 != 0) {
                                if (var475.startsWith(class157.field2472)) {
                                    var476 = 0;
                                    var473 = var473.substring(class157.field2472.length());
                                } else if (var475.startsWith(class157.field2428)) {
                                    var476 = 1;
                                    var473 = var473.substring(class157.field2428.length());
                                } else if (var475.startsWith(class157.field2476)) {
                                    var476 = 2;
                                    var473 = var473.substring(class157.field2476.length());
                                } else if (var475.startsWith(class157.field2478)) {
                                    var476 = 3;
                                    var473 = var473.substring(class157.field2478.length());
                                } else if (var475.startsWith(class157.field2328)) {
                                    var476 = 4;
                                    var473 = var473.substring(class157.field2328.length());
                                } else if (var475.startsWith(class157.field2482)) {
                                    var476 = 5;
                                    var473 = var473.substring(class157.field2482.length());
                                } else if (var475.startsWith(class157.field2412)) {
                                    var476 = 6;
                                    var473 = var473.substring(class157.field2412.length());
                                } else if (var475.startsWith(class157.field2486)) {
                                    var476 = 7;
                                    var473 = var473.substring(class157.field2486.length());
                                } else if (var475.startsWith(class157.field2488)) {
                                    var476 = 8;
                                    var473 = var473.substring(class157.field2488.length());
                                } else if (var475.startsWith(class157.field2307)) {
                                    var476 = 9;
                                    var473 = var473.substring(class157.field2307.length());
                                } else if (var475.startsWith(class157.field2492)) {
                                    var476 = 10;
                                    var473 = var473.substring(class157.field2492.length());
                                } else if (var475.startsWith(class157.field2494)) {
                                    var476 = 11;
                                    var473 = var473.substring(class157.field2494.length());
                                }
                            }
                            String var477 = var473.toLowerCase();
                            byte var478 = 0;
                            if (var477.startsWith(class157.field2554)) {
                                var478 = 1;
                                var473 = var473.substring(class157.field2554.length());
                            } else if (var477.startsWith(class157.field2497)) {
                                var478 = 2;
                                var473 = var473.substring(class157.field2497.length());
                            } else if (var477.startsWith(class157.field2499)) {
                                var478 = 3;
                                var473 = var473.substring(class157.field2499.length());
                            } else if (var477.startsWith(class157.field2501)) {
                                var478 = 4;
                                var473 = var473.substring(class157.field2501.length());
                            } else if (var477.startsWith(class157.field2548)) {
                                var478 = 5;
                                var473 = var473.substring(class157.field2548.length());
                            } else if (client.field280 != 0) {
                                if (var477.startsWith(class157.field2496)) {
                                    var478 = 1;
                                    var473 = var473.substring(class157.field2496.length());
                                } else if (var477.startsWith(class157.field2498)) {
                                    var478 = 2;
                                    var473 = var473.substring(class157.field2498.length());
                                } else if (var477.startsWith(class157.field2500)) {
                                    var478 = 3;
                                    var473 = var473.substring(class157.field2500.length());
                                } else if (var477.startsWith(class157.field2502)) {
                                    var478 = 4;
                                    var473 = var473.substring(class157.field2502.length());
                                } else if (var477.startsWith(class157.field2504)) {
                                    var478 = 5;
                                    var473 = var473.substring(class157.field2504.length());
                                }
                            }
                            client.field317.method2575(108);
                            client.field317.method2323(0);
                            int var479 = client.field317.field1977;
                            client.field317.method2323(var474);
                            client.field317.method2323(var476);
                            client.field317.method2323(var478);
                            class122 var480 = client.field317;
                            int var481 = var480.field1977;
                            int var482 = var473.length();
                            byte[] var483 = new byte[var482];
                            for (int var484 = 0; var484 < var482; var484++) {
                                char var485 = var473.charAt(var484);
                                if (var485 > 0 && var485 < 128 || var485 >= 160 && var485 <= 255) {
                                    var483[var484] = (byte) var485;
                                } else if (var485 == 8364) {
                                    var483[var484] = -128;
                                } else if (var485 == 8218) {
                                    var483[var484] = -126;
                                } else if (var485 == 402) {
                                    var483[var484] = -125;
                                } else if (var485 == 8222) {
                                    var483[var484] = -124;
                                } else if (var485 == 8230) {
                                    var483[var484] = -123;
                                } else if (var485 == 8224) {
                                    var483[var484] = -122;
                                } else if (var485 == 8225) {
                                    var483[var484] = -121;
                                } else if (var485 == 710) {
                                    var483[var484] = -120;
                                } else if (var485 == 8240) {
                                    var483[var484] = -119;
                                } else if (var485 == 352) {
                                    var483[var484] = -118;
                                } else if (var485 == 8249) {
                                    var483[var484] = -117;
                                } else if (var485 == 338) {
                                    var483[var484] = -116;
                                } else if (var485 == 381) {
                                    var483[var484] = -114;
                                } else if (var485 == 8216) {
                                    var483[var484] = -111;
                                } else if (var485 == 8217) {
                                    var483[var484] = -110;
                                } else if (var485 == 8220) {
                                    var483[var484] = -109;
                                } else if (var485 == 8221) {
                                    var483[var484] = -108;
                                } else if (var485 == 8226) {
                                    var483[var484] = -107;
                                } else if (var485 == 8211) {
                                    var483[var484] = -106;
                                } else if (var485 == 8212) {
                                    var483[var484] = -105;
                                } else if (var485 == 732) {
                                    var483[var484] = -104;
                                } else if (var485 == 8482) {
                                    var483[var484] = -103;
                                } else if (var485 == 353) {
                                    var483[var484] = -102;
                                } else if (var485 == 8250) {
                                    var483[var484] = -101;
                                } else if (var485 == 339) {
                                    var483[var484] = -100;
                                } else if (var485 == 382) {
                                    var483[var484] = -98;
                                } else if (var485 == 376) {
                                    var483[var484] = -97;
                                } else {
                                    var483[var484] = 63;
                                }
                            }
                            var480.method2336(var483.length);
                            var480.field1977 += field3158.method2268(var483, 0, var483.length, var480.field1981, var480.field1977);
                            client.field317.method2506(client.field317.field1977 - var479);
                            continue;
                        }
                        if (var528 == 5009) {
                            var6 -= 2;
                            String var488 = class37.field778[var6];
                            String var489 = class37.field778[var6 + 1];
                            client.field317.method2575(221);
                            client.field317.method2324(0);
                            int var490 = client.field317.field1977;
                            client.field317.method2329(var488);
                            class122 var491 = client.field317;
                            int var492 = var491.field1977;
                            int var493 = var489.length();
                            byte[] var494 = new byte[var493];
                            for (int var495 = 0; var495 < var493; var495++) {
                                char var496 = var489.charAt(var495);
                                if (!(var496 <= 0 || var496 >= 128) || !(var496 < 160 || var496 > 255)) {
                                    var494[var495] = (byte) var496;
                                } else if (var496 == 8364) {
                                    var494[var495] = -128;
                                } else if (var496 == 8218) {
                                    var494[var495] = -126;
                                } else if (var496 == 402) {
                                    var494[var495] = -125;
                                } else if (var496 == 8222) {
                                    var494[var495] = -124;
                                } else if (var496 == 8230) {
                                    var494[var495] = -123;
                                } else if (var496 == 8224) {
                                    var494[var495] = -122;
                                } else if (var496 == 8225) {
                                    var494[var495] = -121;
                                } else if (var496 == 710) {
                                    var494[var495] = -120;
                                } else if (var496 == 8240) {
                                    var494[var495] = -119;
                                } else if (var496 == 352) {
                                    var494[var495] = -118;
                                } else if (var496 == 8249) {
                                    var494[var495] = -117;
                                } else if (var496 == 338) {
                                    var494[var495] = -116;
                                } else if (var496 == 381) {
                                    var494[var495] = -114;
                                } else if (var496 == 8216) {
                                    var494[var495] = -111;
                                } else if (var496 == 8217) {
                                    var494[var495] = -110;
                                } else if (var496 == 8220) {
                                    var494[var495] = -109;
                                } else if (var496 == 8221) {
                                    var494[var495] = -108;
                                } else if (var496 == 8226) {
                                    var494[var495] = -107;
                                } else if (var496 == 8211) {
                                    var494[var495] = -106;
                                } else if (var496 == 8212) {
                                    var494[var495] = -105;
                                } else if (var496 == 732) {
                                    var494[var495] = -104;
                                } else if (var496 == 8482) {
                                    var494[var495] = -103;
                                } else if (var496 == 353) {
                                    var494[var495] = -102;
                                } else if (var496 == 8250) {
                                    var494[var495] = -101;
                                } else if (var496 == 339) {
                                    var494[var495] = -100;
                                } else if (var496 == 382) {
                                    var494[var495] = -98;
                                } else if (var496 == 376) {
                                    var494[var495] = -97;
                                } else {
                                    var494[var495] = 63;
                                }
                            }
                            var491.method2336(var494.length);
                            var491.field1977 += field3158.method2268(var494, 0, var494.length, var491.field1981, var491.field1977);
                            client.field317.method2454(client.field317.field1977 - var490);
                            continue;
                        }
                        if (var528 == 5015) {
                            String var499;
                            if (field119 == null || field119.field38 == null) {
                                var499 = "";
                            } else {
                                var499 = field119.field38;
                            }
                            class37.field778[var6++] = var499;
                            continue;
                        }
                        if (var528 == 5016) {
                            class37.field785[var5++] = client.field500;
                            continue;
                        }
                        if (var528 == 5017) {
                            var5--;
                            int var500 = class37.field785[var5];
                            class37.field785[var5++] = class12.method2595(var500);
                            continue;
                        }
                        if (var528 == 5018) {
                            var5--;
                            int var501 = class37.field785[var5];
                            class37.field785[var5++] = class12.method944(var501);
                            continue;
                        }
                        if (var528 == 5019) {
                            var5--;
                            int var502 = class37.field785[var5];
                            int[] var503 = class37.field785;
                            int var504 = var5++;
                            class36 var505 = (class36) class12.field167.method3541((long) var502);
                            int var506;
                            if (var505 == null) {
                                var506 = -1;
                            } else if (class12.field168.field3082 == var505.field3086) {
                                var506 = -1;
                            } else {
                                var506 = ((class36) var505.field3086).field770;
                            }
                            var503[var504] = var506;
                            continue;
                        }
                        if (var528 == 5020) {
                            var6--;
                            String var507 = class37.field778[var6];
                            if (var507.equalsIgnoreCase("toggleroof")) {
                                field2984.field139 = !field2984.field139;
                                class9.method706();
                                if (field2984.field139) {
                                    class12.method2001(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2001(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var507.equalsIgnoreCase("displayfps")) {
                                client.field292 = !client.field292;
                            }
                            if (client.field536 >= 2) {
                                if (var507.equalsIgnoreCase("fpson")) {
                                    client.field292 = true;
                                }
                                if (var507.equalsIgnoreCase("fpsoff")) {
                                    client.field292 = false;
                                }
                                if (var507.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var507.equalsIgnoreCase("clientdrop")) {
                                    client.method12();
                                }
                                if (var507.equalsIgnoreCase("errortest") && client.field275 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field317.method2575(137);
                            client.field317.method2323(var507.length() + 1);
                            client.field317.method2329(var507);
                            continue;
                        }
                        if (var528 == 5021) {
                            var6--;
                            client.field494 = class37.field778[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var528 == 5022) {
                            class37.field778[var6++] = client.field494;
                            continue;
                        }
                    }
                }
                if (var528 < 5400) {
                    if (var528 == 5306) {
                        class37.field785[var5++] = client.method810();
                        continue;
                    }
                    if (var528 == 5307) {
                        var5--;
                        int var508 = class37.field785[var5];
                        if (var508 != 1 && var508 != 2) {
                            continue;
                        }
                        client.field423 = 0L;
                        if (var508 >= 2) {
                            client.field560 = true;
                        } else {
                            client.field560 = false;
                        }
                        client.method2222();
                        if (client.field284 >= 25) {
                            client.field317.method2575(66);
                            client.field317.method2323(client.method810());
                            client.field317.method2324(field1778);
                            client.field317.method2324(field2119);
                        }
                        class144.field2187 = true;
                        continue;
                    }
                    if (var528 == 5308) {
                        class37.field785[var5++] = field2984.field135;
                        continue;
                    }
                    if (var528 == 5309) {
                        var5--;
                        int var509 = class37.field785[var5];
                        if (var509 == 1 || var509 == 2) {
                            field2984.field135 = var509;
                            class9.method706();
                        }
                        continue;
                    }
                }
                if (var528 < 5600) {
                    if (var528 == 5504) {
                        var5 -= 2;
                        int var510 = class37.field785[var5];
                        int var511 = class37.field785[var5 + 1];
                        if (!client.field523) {
                            client.field360 = var510;
                            client.field361 = var511;
                        }
                        continue;
                    }
                    if (var528 == 5505) {
                        class37.field785[var5++] = client.field360;
                        continue;
                    }
                    if (var528 == 5506) {
                        class37.field785[var5++] = client.field361;
                        continue;
                    }
                    if (var528 == 5530) {
                        var5--;
                        int var512 = class37.field785[var5];
                        if (var512 < 0) {
                            var512 = 0;
                        }
                        client.field366 = var512;
                        continue;
                    }
                    if (var528 == 5531) {
                        class37.field785[var5++] = client.field366;
                        continue;
                    }
                }
                if (var528 >= 5700 || var528 != 5630) {
                    if (var528 < 6300) {
                        if (var528 == 6200) {
                            var5 -= 2;
                            client.field529 = (short) class37.field785[var5];
                            if (client.field529 <= 0) {
                                client.field529 = 256;
                            }
                            client.field530 = (short) class37.field785[var5 + 1];
                            if (client.field530 <= 0) {
                                client.field530 = 205;
                            }
                            continue;
                        }
                        if (var528 == 6201) {
                            var5 -= 2;
                            client.field401 = (short) class37.field785[var5];
                            if (client.field401 <= 0) {
                                client.field401 = 256;
                            }
                            client.field532 = (short) class37.field785[var5 + 1];
                            if (client.field532 <= 0) {
                                client.field532 = 320;
                            }
                            continue;
                        }
                        if (var528 == 6202) {
                            var5 -= 4;
                            client.field521 = (short) class37.field785[var5];
                            if (client.field521 <= 0) {
                                client.field521 = 1;
                            }
                            client.field463 = (short) class37.field785[var5 + 1];
                            if (client.field463 <= 0) {
                                client.field463 = 32767;
                            } else if (client.field463 < client.field521) {
                                client.field463 = client.field521;
                            }
                            client.field535 = (short) class37.field785[var5 + 2];
                            if (client.field535 <= 0) {
                                client.field535 = 1;
                            }
                            client.field424 = (short) class37.field785[var5 + 3];
                            if (client.field424 <= 0) {
                                client.field424 = 32767;
                            } else if (client.field424 < client.field535) {
                                client.field424 = client.field535;
                            }
                            continue;
                        }
                        if (var528 == 6203) {
                            if (client.field446 == null) {
                                class37.field785[var5++] = -1;
                                class37.field785[var5++] = -1;
                            } else {
                                client.method141(0, 0, client.field446.field2750, client.field446.field2804, false);
                                class37.field785[var5++] = client.field475;
                                class37.field785[var5++] = client.field540;
                            }
                            continue;
                        }
                        if (var528 == 6204) {
                            class37.field785[var5++] = client.field401;
                            class37.field785[var5++] = client.field532;
                            continue;
                        }
                        if (var528 == 6205) {
                            class37.field785[var5++] = client.field529;
                            class37.field785[var5++] = client.field530;
                            continue;
                        }
                    }
                    if (var528 < 6600) {
                        if (var528 == 6500) {
                            class37.field785[var5++] = class26.method700() ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6501) {
                            class26 var513 = class26.method2756();
                            if (var513 == null) {
                                class37.field785[var5++] = -1;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                                class37.field785[var5++] = 0;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                            } else {
                                class37.field785[var5++] = var513.field618;
                                class37.field785[var5++] = var513.field610;
                                class37.field778[var6++] = var513.field619;
                                class37.field785[var5++] = var513.field620;
                                class37.field785[var5++] = var513.field617;
                                class37.field778[var6++] = var513.field613;
                            }
                            continue;
                        }
                        if (var528 == 6502) {
                            class26 var514 = class26.method2111();
                            if (var514 == null) {
                                class37.field785[var5++] = -1;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                                class37.field785[var5++] = 0;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                            } else {
                                class37.field785[var5++] = var514.field618;
                                class37.field785[var5++] = var514.field610;
                                class37.field778[var6++] = var514.field619;
                                class37.field785[var5++] = var514.field620;
                                class37.field785[var5++] = var514.field617;
                                class37.field778[var6++] = var514.field613;
                            }
                            continue;
                        }
                        if (var528 == 6506) {
                            var5--;
                            int var515 = class37.field785[var5];
                            class26 var516 = null;
                            for (int var517 = 0; var517 < class26.field611; var517++) {
                                if (field616[var517].field618 == var515) {
                                    var516 = field616[var517];
                                    break;
                                }
                            }
                            if (var516 == null) {
                                class37.field785[var5++] = -1;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                                class37.field785[var5++] = 0;
                                class37.field785[var5++] = 0;
                                class37.field778[var6++] = "";
                            } else {
                                class37.field785[var5++] = var516.field618;
                                class37.field785[var5++] = var516.field610;
                                class37.field778[var6++] = var516.field619;
                                class37.field785[var5++] = var516.field620;
                                class37.field785[var5++] = var516.field617;
                                class37.field778[var6++] = var516.field613;
                            }
                            continue;
                        }
                        if (var528 == 6507) {
                            var5 -= 4;
                            int var518 = class37.field785[var5];
                            boolean var519 = class37.field785[var5 + 1] == 1;
                            int var520 = class37.field785[var5 + 2];
                            boolean var521 = class37.field785[var5 + 3] == 1;
                            if (field616 != null) {
                                class26.method153(0, field616.length - 1, var518, var519, var520, var521);
                            }
                            continue;
                        }
                        if (var528 == 6511) {
                            var5--;
                            int var522 = class37.field785[var5];
                            if (var522 >= 0 && var522 < class26.field611) {
                                class26 var523 = field616[var522];
                                class37.field785[var5++] = var523.field618;
                                class37.field785[var5++] = var523.field610;
                                class37.field778[var6++] = var523.field619;
                                class37.field785[var5++] = var523.field620;
                                class37.field785[var5++] = var523.field617;
                                class37.field778[var6++] = var523.field613;
                                continue;
                            }
                            class37.field785[var5++] = -1;
                            class37.field785[var5++] = 0;
                            class37.field778[var6++] = "";
                            class37.field785[var5++] = 0;
                            class37.field785[var5++] = 0;
                            class37.field778[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field332 = 250;
            }
        } catch (Exception var527) {
            StringBuilder var525 = new StringBuilder(30);
            var525.append("").append(var4.field3096).append(" ");
            for (int var526 = class37.field779 - 1; var526 >= 0; var526--) {
                var525.append("").append(class37.field780[var526].field200.field3096).append(" ");
            }
            var525.append("").append(var10);
            method2798(var525.toString(), var527);
        }
    }

    @ObfuscatedName("fc.i(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2946(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class165.method900(var5);
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

    @ObfuscatedName("el.q(Ldi;B)I")
    public static int method2683(class122 arg0) {
        int var1 = arg0.method2586(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2586(5);
        } else if (var1 == 2) {
            var2 = arg0.method2586(8);
        } else {
            var2 = arg0.method2586(11);
        }
        return var2;
    }

    @ObfuscatedName("dz.d(ZI)V")
    public static void method2640(boolean arg0) {
        if (field2713 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2323(arg0 ? 2 : 3);
            var1.method2409(0);
            field2713.method2807(var1.field1981, 0, 4);
        } catch (IOException var5) {
            try {
                field2713.method2810();
            } catch (Exception var4) {
            }
            class171.field2716++;
            field2713 = null;
        }
    }

    @ObfuscatedName("ey.p(IIB)I")
    public static final int method2913(int arg0, int arg1) {
        int var2 = class6.method2698(arg0 + 45365, arg1 + 91923, 4) - 128 + (class6.method2698(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (class6.method2698(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("f.ae(III)V")
    public static final void method147(int arg0, int arg1) {
        if (client.field294 == 2) {
            client.method197((client.field297 - field166 << 7) + client.field300, (client.field298 - field757 << 7) + client.field466, client.field371 * 2);
            if (client.field382 > -1 && client.field347 % 20 < 10) {
                field353[0].method1572(client.field382 + arg0 - 12, client.field383 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("y.cb(Lfp;III)V")
    public static void method155(class173 arg0, int arg1, int arg2) {
        if (arg0.field2740 == 0) {
            arg0.field2748 = arg0.field2744;
        } else if (arg0.field2740 == 1) {
            arg0.field2748 = (arg1 - arg0.field2750) / 2 + arg0.field2744;
        } else if (arg0.field2740 == 2) {
            arg0.field2748 = arg1 - arg0.field2750 - arg0.field2744;
        } else if (arg0.field2740 == 3) {
            arg0.field2748 = arg0.field2744 * arg1 >> 14;
        } else if (arg0.field2740 == 4) {
            arg0.field2748 = (arg0.field2744 * arg1 >> 14) + (arg1 - arg0.field2750) / 2;
        } else {
            arg0.field2748 = arg1 - arg0.field2750 - (arg0.field2744 * arg1 >> 14);
        }
        if (arg0.field2731 == 0) {
            arg0.field2749 = arg0.field2745;
        } else if (arg0.field2731 == 1) {
            arg0.field2749 = (arg2 - arg0.field2804) / 2 + arg0.field2745;
        } else if (arg0.field2731 == 2) {
            arg0.field2749 = arg2 - arg0.field2804 - arg0.field2745;
        } else if (arg0.field2731 == 3) {
            arg0.field2749 = arg0.field2745 * arg2 >> 14;
        } else if (arg0.field2731 == 4) {
            arg0.field2749 = (arg0.field2745 * arg2 >> 14) + (arg2 - arg0.field2804) / 2;
        } else {
            arg0.field2749 = arg2 - arg0.field2804 - (arg0.field2745 * arg2 >> 14);
        }
        if (!client.field444 || arg0.field2820 != 0) {
            return;
        }
        if (arg0.field2748 < 0) {
            arg0.field2748 = 0;
        } else if (arg0.field2750 + arg0.field2748 > arg1) {
            arg0.field2748 = arg1 - arg0.field2750;
        }
        if (arg0.field2749 < 0) {
            arg0.field2749 = 0;
        } else if (arg0.field2804 + arg0.field2749 > arg2) {
            arg0.field2749 = arg2 - arg0.field2804;
        }
    }

    @ObfuscatedName("n.co([Lfp;IIIIIIII)V")
    public static final void method1(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2734 || var9.field2820 == 0 || var9.field2813 || client.method912(var9) != 0 || client.field537 == var9 || var9.field2725 == 1338) && var9.field2754 == arg1 && (!var9.field2734 || !client.method165(var9))) {
                int var10 = var9.field2748 + arg6;
                int var11 = var9.field2749 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2820 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2820 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2750 + var10;
                    int var19 = var9.field2804 + var11;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    var18++;
                    var19++;
                    var12 = var16 > arg2 ? var16 : arg2;
                    var13 = var17 > arg3 ? var17 : arg3;
                    var14 = var18 < arg4 ? var18 : arg4;
                    var15 = var19 < arg5 ? var19 : arg5;
                } else {
                    int var22 = var9.field2750 + var10;
                    int var23 = var9.field2804 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (client.field447 == var9) {
                    client.field455 = true;
                    client.field456 = var10;
                    client.field457 = var11;
                }
                if (!var9.field2734 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2131;
                    int var25 = class140.field2142;
                    if (class140.field2141 != 0) {
                        var24 = class140.field2144;
                        var25 = class140.field2135;
                    }
                    if (var9.field2725 == 1337) {
                        if (!client.field285 && !client.field415 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            client.method2906(var24, var25, var12, var13);
                        }
                    } else if (var9.field2725 == 1338) {
                        client.method712(var9, var10, var11);
                    } else {
                        if (!client.field415 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2738 == 1) {
                                client.method583(var9.field2850, "", 24, 0, 0, var9.field2735);
                            }
                            if (var9.field2738 == 2 && !client.field293) {
                                String var28;
                                if (class178.method2941(client.method912(var9)) == 0) {
                                    var28 = null;
                                } else if (var9.field2861 == null || var9.field2861.trim().length() == 0) {
                                    var28 = null;
                                } else {
                                    var28 = var9.field2861;
                                }
                                if (var28 != null) {
                                    client.method583(var28, class2.method624(65280) + var9.field2849, 25, 0, -1, var9.field2735);
                                }
                            }
                            if (var9.field2738 == 3) {
                                client.method583(class157.field2362, "", 26, 0, 0, var9.field2735);
                            }
                            if (var9.field2738 == 4) {
                                client.method583(var9.field2850, "", 28, 0, 0, var9.field2735);
                            }
                            if (var9.field2738 == 5) {
                                client.method583(var9.field2850, "", 29, 0, 0, var9.field2735);
                            }
                            if (var9.field2738 == 6 && client.field438 == null) {
                                client.method583(var9.field2850, "", 30, 0, -1, var9.field2735);
                            }
                            if (var9.field2820 == 2) {
                                int var30 = 0;
                                for (int var31 = 0; var31 < var9.field2804; var31++) {
                                    for (int var32 = 0; var32 < var9.field2750; var32++) {
                                        int var33 = (var9.field2799 + 32) * var32;
                                        int var34 = (var9.field2800 + 32) * var31;
                                        if (var30 < 20) {
                                            var33 += var9.field2854[var30];
                                            var34 += var9.field2802[var30];
                                        }
                                        if (var26 >= var33 && var27 >= var34 && var26 < var33 + 32 && var27 < var34 + 32) {
                                            client.field379 = var30;
                                            field1962 = var9;
                                            if (var9.field2724[var30] > 0) {
                                                class52 var35 = class52.method2651(var9.field2724[var30] - 1);
                                                if (client.field304 == 1 && class178.method2020(client.method912(var9))) {
                                                    if (field1958 != var9.field2735 || field1019 != var30) {
                                                        client.method583(class157.field2445, client.field428 + " " + class2.field19 + " " + class2.method624(16748608) + var35.field1105, 31, var35.field1103, var30, var9.field2735);
                                                    }
                                                } else if (!client.field293 || !class178.method2020(client.method912(var9))) {
                                                    String[] var36 = var35.field1098;
                                                    if (client.field558) {
                                                        var36 = client.method2635(var36);
                                                    }
                                                    if (class178.method2020(client.method912(var9))) {
                                                        for (int var37 = 4; var37 >= 3; var37--) {
                                                            if (var36 != null && var36[var37] != null) {
                                                                byte var38;
                                                                if (var37 == 3) {
                                                                    var38 = 36;
                                                                } else {
                                                                    var38 = 37;
                                                                }
                                                                client.method583(var36[var37], class2.method624(16748608) + var35.field1105, var38, var35.field1103, var30, var9.field2735);
                                                            } else if (var37 == 4) {
                                                                client.method583(class157.field2296, class2.method624(16748608) + var35.field1105, 37, var35.field1103, var30, var9.field2735);
                                                            }
                                                        }
                                                    }
                                                    if (class178.method633(client.method912(var9))) {
                                                        client.method583(class157.field2445, class2.method624(16748608) + var35.field1105, 38, var35.field1103, var30, var9.field2735);
                                                    }
                                                    if (class178.method2020(client.method912(var9)) && var36 != null) {
                                                        for (int var39 = 2; var39 >= 0; var39--) {
                                                            if (var36[var39] != null) {
                                                                byte var40 = 0;
                                                                if (var39 == 0) {
                                                                    var40 = 33;
                                                                }
                                                                if (var39 == 1) {
                                                                    var40 = 34;
                                                                }
                                                                if (var39 == 2) {
                                                                    var40 = 35;
                                                                }
                                                                client.method583(var36[var39], class2.method624(16748608) + var35.field1105, var40, var35.field1103, var30, var9.field2735);
                                                            }
                                                        }
                                                    }
                                                    String[] var41 = var9.field2737;
                                                    if (client.field558) {
                                                        var41 = client.method2635(var41);
                                                    }
                                                    if (var41 != null) {
                                                        for (int var42 = 4; var42 >= 0; var42--) {
                                                            if (var41[var42] != null) {
                                                                byte var43 = 0;
                                                                if (var42 == 0) {
                                                                    var43 = 39;
                                                                }
                                                                if (var42 == 1) {
                                                                    var43 = 40;
                                                                }
                                                                if (var42 == 2) {
                                                                    var43 = 41;
                                                                }
                                                                if (var42 == 3) {
                                                                    var43 = 42;
                                                                }
                                                                if (var42 == 4) {
                                                                    var43 = 43;
                                                                }
                                                                client.method583(var41[var42], class2.method624(16748608) + var35.field1105, var43, var35.field1103, var30, var9.field2735);
                                                            }
                                                        }
                                                    }
                                                    client.method583(class157.field2366, class2.method624(16748608) + var35.field1105, 1005, var35.field1103, var30, var9.field2735);
                                                } else if ((field61 & 0x10) == 16) {
                                                    client.method583(client.field480, client.field433 + " " + class2.field19 + " " + class2.method624(16748608) + var35.field1105, 32, var35.field1103, var30, var9.field2735);
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            if (var9.field2734) {
                                if (!client.field293) {
                                    for (int var44 = 9; var44 >= 5; var44--) {
                                        String var45 = client.method556(var9, var44);
                                        if (var45 != null) {
                                            client.method583(var45, var9.field2765, 1007, var44 + 1, var9.field2736, var9.field2735);
                                        }
                                    }
                                    String var46;
                                    if (class178.method2941(client.method912(var9)) == 0) {
                                        var46 = null;
                                    } else if (var9.field2861 == null || var9.field2861.trim().length() == 0) {
                                        var46 = null;
                                    } else {
                                        var46 = var9.field2861;
                                    }
                                    if (var46 != null) {
                                        client.method583(var46, var9.field2765, 25, 0, var9.field2736, var9.field2735);
                                    }
                                    for (int var48 = 4; var48 >= 0; var48--) {
                                        String var49 = client.method556(var9, var48);
                                        if (var49 != null) {
                                            client.method583(var49, var9.field2765, 57, var48 + 1, var9.field2736, var9.field2735);
                                        }
                                    }
                                    if (class178.method1738(client.method912(var9))) {
                                        client.method583(class157.field2418, "", 30, 0, var9.field2736, var9.field2735);
                                    }
                                } else if (class178.method2266(client.method912(var9)) && (field61 & 0x20) == 32) {
                                    client.method583(client.field480, client.field433 + " " + class2.field19 + " " + var9.field2765, 58, 0, var9.field2736, var9.field2735);
                                }
                            }
                        }
                        if (var9.field2820 == 0) {
                            if (!var9.field2734 && client.method165(var9) && field1334 != var9) {
                                continue;
                            }
                            method1(arg0, var9.field2735, var12, var13, var14, var15, var10 - var9.field2827, var11 - var9.field2757);
                            if (var9.field2857 != null) {
                                method1(var9.field2857, var9.field2735, var12, var13, var14, var15, var10 - var9.field2827, var11 - var9.field2757);
                            }
                            class4 var50 = (class4) client.field518.method3519((long) var9.field2735);
                            if (var50 != null) {
                                if (var50.field54 == 0 && class140.field2131 >= var12 && class140.field2142 >= var13 && class140.field2131 < var14 && class140.field2142 < var15 && !client.field415 && !client.field444) {
                                    for (class1 var51 = (class1) client.field531.method3574(); var51 != null; var51 = (class1) client.field531.method3568()) {
                                        if (var51.field15) {
                                            var51.method3651();
                                            var51.field3.field2858 = false;
                                        }
                                    }
                                    if (field2036 == 0) {
                                        client.field447 = null;
                                        client.field537 = null;
                                    }
                                    if (!client.field415) {
                                        client.field492[0] = class157.field2531;
                                        client.field422[0] = "";
                                        client.field435[0] = 1006;
                                        client.field416 = 1;
                                    }
                                }
                                client.method89(var50.field58, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2734) {
                            if (var9.field2866) {
                                if (class140.field2131 >= var12 && class140.field2142 >= var13 && class140.field2131 < var14 && class140.field2142 < var15) {
                                    for (class1 var52 = (class1) client.field531.method3574(); var52 != null; var52 = (class1) client.field531.method3568()) {
                                        if (var52.field15) {
                                            var52.method3651();
                                            var52.field3.field2858 = false;
                                        }
                                    }
                                    if (field2036 == 0) {
                                        client.field447 = null;
                                        client.field537 = null;
                                    }
                                    if (!client.field415) {
                                        client.field492[0] = class157.field2531;
                                        client.field422[0] = "";
                                        client.field435[0] = 1006;
                                        client.field416 = 1;
                                    }
                                }
                            } else if (var9.field2818 && class140.field2131 >= var12 && class140.field2142 >= var13 && class140.field2131 < var14 && class140.field2142 < var15) {
                                for (class1 var53 = (class1) client.field531.method3574(); var53 != null; var53 = (class1) client.field531.method3568()) {
                                    if (var53.field15 && var53.field3.field2834 == var53.field2) {
                                        var53.method3651();
                                    }
                                }
                            }
                            boolean var54;
                            if (class140.field2131 >= var12 && class140.field2142 >= var13 && class140.field2131 < var14 && class140.field2142 < var15) {
                                var54 = true;
                            } else {
                                var54 = false;
                            }
                            boolean var55 = false;
                            if ((class140.field2145 == 1 || !field14 && class140.field2145 == 4) && var54) {
                                var55 = true;
                            }
                            boolean var56 = false;
                            if ((class140.field2141 == 1 || !field14 && class140.field2141 == 4) && class140.field2144 >= var12 && class140.field2135 >= var13 && class140.field2144 < var14 && class140.field2135 < var15) {
                                var56 = true;
                            }
                            if (var56) {
                                client.method2016(var9, class140.field2144 - var10, class140.field2135 - var11);
                            }
                            if (client.field447 != null && client.field447 != var9 && var54) {
                                int var57 = client.method912(var9);
                                boolean var58 = (var57 >> 20 & 0x1) != 0;
                                if (var58) {
                                    client.field506 = var9;
                                }
                            }
                            if (client.field537 == var9) {
                                client.field323 = true;
                                client.field453 = var10;
                                client.field351 = var11;
                            }
                            if (var9.field2813) {
                                if (var54 && client.field472 != 0 && var9.field2834 != null) {
                                    class1 var59 = new class1();
                                    var59.field15 = true;
                                    var59.field3 = var9;
                                    var59.field5 = client.field472;
                                    var59.field2 = var9.field2834;
                                    client.field531.method3579(var59);
                                }
                                if (client.field447 != null || field91 != null || client.field415) {
                                    var56 = false;
                                    var55 = false;
                                    var54 = false;
                                }
                                if (!var9.field2855 && var56) {
                                    var9.field2855 = true;
                                    if (var9.field2815 != null) {
                                        class1 var60 = new class1();
                                        var60.field15 = true;
                                        var60.field3 = var9;
                                        var60.field4 = class140.field2144 - var10;
                                        var60.field5 = class140.field2135 - var11;
                                        var60.field2 = var9.field2815;
                                        client.field531.method3579(var60);
                                    }
                                }
                                if (var9.field2855 && var55 && var9.field2844 != null) {
                                    class1 var61 = new class1();
                                    var61.field15 = true;
                                    var61.field3 = var9;
                                    var61.field4 = class140.field2131 - var10;
                                    var61.field5 = class140.field2142 - var11;
                                    var61.field2 = var9.field2844;
                                    client.field531.method3579(var61);
                                }
                                if (var9.field2855 && !var55) {
                                    var9.field2855 = false;
                                    if (var9.field2831 != null) {
                                        class1 var62 = new class1();
                                        var62.field15 = true;
                                        var62.field3 = var9;
                                        var62.field4 = class140.field2131 - var10;
                                        var62.field5 = class140.field2142 - var11;
                                        var62.field2 = var9.field2831;
                                        client.field469.method3579(var62);
                                    }
                                }
                                if (var55 && var9.field2853 != null) {
                                    class1 var63 = new class1();
                                    var63.field15 = true;
                                    var63.field3 = var9;
                                    var63.field4 = class140.field2131 - var10;
                                    var63.field5 = class140.field2142 - var11;
                                    var63.field2 = var9.field2853;
                                    client.field531.method3579(var63);
                                }
                                if (!var9.field2858 && var54) {
                                    var9.field2858 = true;
                                    if (var9.field2756 != null) {
                                        class1 var64 = new class1();
                                        var64.field15 = true;
                                        var64.field3 = var9;
                                        var64.field4 = class140.field2131 - var10;
                                        var64.field5 = class140.field2142 - var11;
                                        var64.field2 = var9.field2756;
                                        client.field531.method3579(var64);
                                    }
                                }
                                if (var9.field2858 && var54 && var9.field2832 != null) {
                                    class1 var65 = new class1();
                                    var65.field15 = true;
                                    var65.field3 = var9;
                                    var65.field4 = class140.field2131 - var10;
                                    var65.field5 = class140.field2142 - var11;
                                    var65.field2 = var9.field2832;
                                    client.field531.method3579(var65);
                                }
                                if (var9.field2858 && !var54) {
                                    var9.field2858 = false;
                                    if (var9.field2821 != null) {
                                        class1 var66 = new class1();
                                        var66.field15 = true;
                                        var66.field3 = var9;
                                        var66.field4 = class140.field2131 - var10;
                                        var66.field5 = class140.field2142 - var11;
                                        var66.field2 = var9.field2821;
                                        client.field469.method3579(var66);
                                    }
                                }
                                if (var9.field2803 != null) {
                                    class1 var67 = new class1();
                                    var67.field3 = var9;
                                    var67.field2 = var9.field2803;
                                    client.field426.method3579(var67);
                                }
                                if (var9.field2826 != null && client.field461 > var9.field2779) {
                                    if (var9.field2856 == null || client.field461 - var9.field2779 > 32) {
                                        class1 var72 = new class1();
                                        var72.field3 = var9;
                                        var72.field2 = var9.field2826;
                                        client.field531.method3579(var72);
                                    } else {
                                        label715: for (int var68 = var9.field2779; var68 < client.field461; var68++) {
                                            int var69 = client.field460[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var9.field2856.length; var70++) {
                                                if (var9.field2856[var70] == var69) {
                                                    class1 var71 = new class1();
                                                    var71.field3 = var9;
                                                    var71.field2 = var9.field2826;
                                                    client.field531.method3579(var71);
                                                    break label715;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2779 = client.field461;
                                }
                                if (var9.field2828 != null && client.field327 > var9.field2862) {
                                    if (var9.field2864 == null || client.field327 - var9.field2862 > 32) {
                                        class1 var77 = new class1();
                                        var77.field3 = var9;
                                        var77.field2 = var9.field2828;
                                        client.field531.method3579(var77);
                                    } else {
                                        label691: for (int var73 = var9.field2862; var73 < client.field327; var73++) {
                                            int var74 = client.field301[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var9.field2864.length; var75++) {
                                                if (var9.field2864[var75] == var74) {
                                                    class1 var76 = new class1();
                                                    var76.field3 = var9;
                                                    var76.field2 = var9.field2828;
                                                    client.field531.method3579(var76);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2862 = client.field327;
                                }
                                if (var9.field2830 != null && client.field465 > var9.field2863) {
                                    if (var9.field2783 == null || client.field465 - var9.field2863 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field2 = var9.field2830;
                                        client.field531.method3579(var82);
                                    } else {
                                        label667: for (int var78 = var9.field2863; var78 < client.field465; var78++) {
                                            int var79 = client.field464[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2783.length; var80++) {
                                                if (var9.field2783[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field2 = var9.field2830;
                                                    client.field531.method3579(var81);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2863 = client.field465;
                                }
                                if (client.field493 > var9.field2812 && var9.field2835 != null) {
                                    class1 var83 = new class1();
                                    var83.field3 = var9;
                                    var83.field2 = var9.field2835;
                                    client.field531.method3579(var83);
                                }
                                if (client.field325 > var9.field2812 && var9.field2837 != null) {
                                    class1 var84 = new class1();
                                    var84.field3 = var9;
                                    var84.field2 = var9.field2837;
                                    client.field531.method3579(var84);
                                }
                                if (client.field468 > var9.field2812 && var9.field2838 != null) {
                                    class1 var85 = new class1();
                                    var85.field3 = var9;
                                    var85.field2 = var9.field2838;
                                    client.field531.method3579(var85);
                                }
                                if (client.field541 > var9.field2812 && var9.field2843 != null) {
                                    class1 var86 = new class1();
                                    var86.field3 = var9;
                                    var86.field2 = var9.field2843;
                                    client.field531.method3579(var86);
                                }
                                if (client.field470 > var9.field2812 && var9.field2764 != null) {
                                    class1 var87 = new class1();
                                    var87.field3 = var9;
                                    var87.field2 = var9.field2764;
                                    client.field531.method3579(var87);
                                }
                                if (client.field556 > var9.field2812 && var9.field2839 != null) {
                                    class1 var88 = new class1();
                                    var88.field3 = var9;
                                    var88.field2 = var9.field2839;
                                    client.field531.method3579(var88);
                                }
                                var9.field2812 = client.field459;
                                if (var9.field2822 != null) {
                                    for (int var89 = 0; var89 < client.field497; var89++) {
                                        class1 var90 = new class1();
                                        var90.field3 = var9;
                                        var90.field8 = client.field499[var89];
                                        var90.field9 = client.field498[var89];
                                        var90.field2 = var9.field2822;
                                        client.field531.method3579(var90);
                                    }
                                }
                            }
                        }
                        if (!var9.field2734 && client.field447 == null && field91 == null && !client.field415) {
                            if ((var9.field2848 >= 0 || var9.field2762 != 0) && class140.field2131 >= var12 && class140.field2142 >= var13 && class140.field2131 < var14 && class140.field2142 < var15) {
                                if (var9.field2848 >= 0) {
                                    field1334 = arg0[var9.field2848];
                                } else {
                                    field1334 = var9;
                                }
                            }
                            if (var9.field2820 == 8 && class140.field2131 >= var12 && class140.field2142 >= var13 && class140.field2131 < var14 && class140.field2142 < var15) {
                                field25 = var9;
                            }
                            if (var9.field2759 > var9.field2804) {
                                int var91 = var9.field2750 + var10;
                                int var92 = var9.field2804;
                                int var93 = var9.field2759;
                                int var94 = class140.field2131;
                                int var95 = class140.field2142;
                                if (client.field358) {
                                    client.field306 = 32;
                                } else {
                                    client.field306 = 0;
                                }
                                client.field358 = false;
                                if (class140.field2145 == 1 || !field14 && class140.field2145 == 4) {
                                    if (var94 >= var91 && var94 < var91 + 16 && var95 >= var11 && var95 < var11 + 16) {
                                        var9.field2757 -= 4;
                                        client.method3122(var9);
                                    } else if (var94 >= var91 && var94 < var91 + 16 && var95 >= var11 + var92 - 16 && var95 < var11 + var92) {
                                        var9.field2757 += 4;
                                        client.method3122(var9);
                                    } else if (var94 >= var91 - client.field306 && var94 < client.field306 + var91 + 16 && var95 >= var11 + 16 && var95 < var11 + var92 - 16) {
                                        int var96 = (var92 - 32) * var92 / var93;
                                        if (var96 < 8) {
                                            var96 = 8;
                                        }
                                        int var97 = var95 - var11 - 16 - var96 / 2;
                                        int var98 = var92 - 32 - var96;
                                        var9.field2757 = (var93 - var92) * var97 / var98;
                                        client.method3122(var9);
                                        client.field358 = true;
                                    }
                                }
                                if (client.field472 != 0) {
                                    int var99 = var9.field2750;
                                    if (var94 >= var91 - var99 && var95 >= var11 && var94 < var91 + 16 && var95 <= var11 + var92) {
                                        var9.field2757 += client.field472 * 45;
                                        client.method3122(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bf.dg(IIIILcy;Lfx;I)V")
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = client.field361 + client.field318 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1566[var6];
        int var9 = class91.field1567[var6];
        int var10 = var8 * 256 / (client.field349 + 256);
        int var11 = var9 * 256 / (client.field349 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1582(arg5.field2880 / 2 + var12 - arg4.field1400 / 2, arg5.field2879 / 2 - var13 - arg4.field1396 / 2, arg0, arg1, arg5.field2880, arg5.field2879, arg5.field2875, arg5.field2877);
        } else {
            arg4.method1572(arg5.field2880 / 2 + arg0 + var12 - arg4.field1400 / 2, arg5.field2879 / 2 + arg1 - var13 - arg4.field1396 / 2);
        }
    }

    @ObfuscatedName("dp.ds(Ljava/lang/String;IB)V")
    public static final void method2219(String arg0, int arg1) {
        client.field317.method2575(134);
        client.field317.method2323(class119.method2648(arg0) + 1);
        client.field317.method2323(arg1);
        client.field317.method2329(arg0);
    }
}
