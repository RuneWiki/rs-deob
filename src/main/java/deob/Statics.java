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
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Statics {

    @ObfuscatedName("au.a")
    public static class151 field1004;

    @ObfuscatedName("w.od")
    public static class9 field101;

    @ObfuscatedName("au.n")
    public static short[] field1010;

    @ObfuscatedName("ak.l")
    public static class151 field1015;

    @ObfuscatedName("ak.b")
    public static class151 field1045;

    @ObfuscatedName("aj.v")
    public static int field1064;

    @ObfuscatedName("aj.cf")
    public static class134 field1065;

    @ObfuscatedName("aj.o")
    public static String field1070;

    @ObfuscatedName("aj.w")
    public static short[] field1071;

    @ObfuscatedName("aj.a")
    public static class151 field1074;

    @ObfuscatedName("ab.a")
    public static class48 field1076;

    @ObfuscatedName("ap.l")
    public static int field1082;

    @ObfuscatedName("ap.b")
    public static boolean field1083;

    @ObfuscatedName("ap.i")
    public static int field1084;

    @ObfuscatedName("ap.m")
    public static class67 field1092;

    @ObfuscatedName("a.ce")
    public static class207 field11;

    @ObfuscatedName("bo.es")
    public static int[] field1124;

    @ObfuscatedName("bo.ap")
    public static class152 field1128;

    @ObfuscatedName("w.ig")
    public static class28 field114;

    @ObfuscatedName("bp.e")
    public static float field1144;

    @ObfuscatedName("bp.n")
    public static int field1151;

    @ObfuscatedName("br.s")
    public static int[] field1184;

    @ObfuscatedName("br.k")
    public static int[] field1186;

    @ObfuscatedName("br.f")
    public static boolean[] field1187;

    @ObfuscatedName("bc.o")
    public static class63[] field1197;

    @ObfuscatedName("bc.f")
    public static class68[] field1200;

    @ObfuscatedName("bc.w")
    public static byte[] field1202;

    @ObfuscatedName("bc.e")
    public static int field1203;

    @ObfuscatedName("bc.n")
    public static int field1204;

    @ObfuscatedName("bc.s")
    public static int field1205;

    @ObfuscatedName("bc.ah")
    public static float[] field1207;

    @ObfuscatedName("bc.d")
    public static class62[] field1208;

    @ObfuscatedName("bc.x")
    public static class55[] field1209;

    @ObfuscatedName("w.ei")
    public static class73 field121;

    @ObfuscatedName("bc.q")
    public static boolean[] field1211;

    @ObfuscatedName("bc.t")
    public static int[] field1212;

    @ObfuscatedName("bc.c")
    public static float[] field1213;

    @ObfuscatedName("bc.r")
    public static float[] field1219;

    @ObfuscatedName("bc.z")
    public static float[] field1220;

    @ObfuscatedName("bc.ar")
    public static int[] field1221;

    @ObfuscatedName("bc.an")
    public static float[] field1222;

    @ObfuscatedName("bc.as")
    public static float[] field1223;

    @ObfuscatedName("bc.k")
    public static int field1225;

    @ObfuscatedName("bc.ae")
    public static int[] field1226;

    @ObfuscatedName("bc.p")
    public static float[] field1229;

    @ObfuscatedName("bf.au")
    public static class137 field1260;

    @ObfuscatedName("bf.j")
    public static class110 field1263;

    @ObfuscatedName("w.pt")
    public static class72 field127;

    @ObfuscatedName("bt.d")
    public static boolean field1274;

    @ObfuscatedName("bt.ay")
    public static class152 field1276;

    @ObfuscatedName("bn.og")
    public static int field1286;

    @ObfuscatedName("bn.w")
    public static int[] field1287;

    @ObfuscatedName("bn.e")
    public static int[] field1288;

    @ObfuscatedName("bn.no")
    public static int field1290;

    @ObfuscatedName("bn.i")
    public static int field1292;

    @ObfuscatedName("bq.pl")
    public static class127 field1300;

    @ObfuscatedName("bq.q")
    public static String[] field1301;

    @ObfuscatedName("bv.d")
    public static int[] field1318;

    @ObfuscatedName("bv.o")
    public static int field1320;

    @ObfuscatedName("bv.x")
    public static int field1322;

    @ObfuscatedName("e.b")
    public static int[] field134;

    @ObfuscatedName("bj.o")
    public static int[] field1348;

    @ObfuscatedName("by.l")
    public static byte[][][] field1352;

    @ObfuscatedName("by.j")
    public static int[] field1353;

    @ObfuscatedName("by.gu")
    public static class157 field1354;

    @ObfuscatedName("cr.hz")
    public static class3 field1358;

    @ObfuscatedName("e.p")
    public static int[] field136;

    @ObfuscatedName("ct.r")
    public static int field1369;

    @ObfuscatedName("ct.an")
    public static int field1371;

    @ObfuscatedName("ct.u")
    public static int field1377;

    @ObfuscatedName("ct.j")
    public static int field1378;

    @ObfuscatedName("ct.g")
    public static int field1379;

    @ObfuscatedName("ct.y")
    public static int field1380;

    @ObfuscatedName("ct.p")
    public static int field1381;

    @ObfuscatedName("ct.z")
    public static int field1382;

    @ObfuscatedName("ct.c")
    public static int field1384;

    @ObfuscatedName("ct.bw")
    public static int field1386;

    @ObfuscatedName("ct.h")
    public static int field1387;

    @ObfuscatedName("ct.ae")
    public static int field1389;

    @ObfuscatedName("v.t")
    public static int[] field14;

    @ObfuscatedName("ct.ah")
    public static int field1407;

    @ObfuscatedName("n.ki")
    public static int field141;

    @ObfuscatedName("ct.as")
    public static int field1414;

    @ObfuscatedName("ct.bl")
    public static boolean[][] field1415;

    @ObfuscatedName("ct.bp")
    public static int field1416;

    @ObfuscatedName("ct.ar")
    public static int field1417;

    @ObfuscatedName("ct.bm")
    public static int field1418;

    @ObfuscatedName("ct.bz")
    public static int field1419;

    @ObfuscatedName("ct.br")
    public static int field1420;

    @ObfuscatedName("ct.be")
    public static int field1421;

    @ObfuscatedName("n.kh")
    public static class157[] field143;

    @ObfuscatedName("n.ff")
    public static int field145;

    @ObfuscatedName("cf.q")
    public static String field1453;

    @ObfuscatedName("co.g")
    public static int field1459;

    @ObfuscatedName("n.nv")
    public static int field146;

    @ObfuscatedName("co.y")
    public static int field1460;

    @ObfuscatedName("co.k")
    public static int field1469;

    @ObfuscatedName("co.f")
    public static int field1470;

    @ObfuscatedName("co.j")
    public static int field1471;

    @ObfuscatedName("co.p")
    public static int field1475;

    @ObfuscatedName("co.r")
    public static int field1476;

    @ObfuscatedName("co.z")
    public static int field1477;

    @ObfuscatedName("co.as")
    public static class86 field1479;

    @ObfuscatedName("n.bl")
    public static class152 field148;

    @ObfuscatedName("cb.or")
    public static class204 field1494;

    @ObfuscatedName("cb.iv")
    public static int field1506;

    @ObfuscatedName("cb.h")
    public static int[] field1508;

    @ObfuscatedName("ch.my")
    public static byte field1516;

    @ObfuscatedName("ch.na")
    public static class69 field1519;

    @ObfuscatedName("cn.e")
    public static byte[][][] field1523;

    @ObfuscatedName("ck.el")
    public static class73[] field1553;

    @ObfuscatedName("s.ji")
    public static int field157;

    @ObfuscatedName("ck.oj")
    public static short[] field1570;

    @ObfuscatedName("s.fc")
    public static int field162;

    @ObfuscatedName("cv.qb")
    public static String field1653;

    @ObfuscatedName("cv.em")
    public static class73[] field1655;

    @ObfuscatedName("cv.at")
    public static int field1659;

    @ObfuscatedName("cx.mw")
    public static int field1672;

    @ObfuscatedName("cx.ol")
    public static class125 field1674;

    @ObfuscatedName("k.ap")
    public static class75[] field168;

    @ObfuscatedName("cl.bu")
    public static int field1696;

    @ObfuscatedName("k.dk")
    public static byte[][] field174;

    @ObfuscatedName("cl.bo")
    public static int field1749;

    @ObfuscatedName("k.bd")
    public static int field175;

    @ObfuscatedName("cl.bi")
    public static int field1750;

    @ObfuscatedName("cz.v")
    public static int field1763;

    @ObfuscatedName("cz.mb")
    public static class73 field1764;

    @ObfuscatedName("cz.t")
    public static String[] field1768;

    @ObfuscatedName("f.op")
    public static int field179;

    @ObfuscatedName("cu.aw")
    public static boolean field1816;

    @ObfuscatedName("cu.ca")
    public static int field1820;

    @ObfuscatedName("cs.ab")
    public static long field1822;

    @ObfuscatedName("cs.af")
    public static class17 field1824;

    @ObfuscatedName("dg.ix")
    public static int field1836;

    @ObfuscatedName("dd.v")
    public static long field1838;

    @ObfuscatedName("dd.a")
    public static long field1841;

    @ObfuscatedName("dd.bb")
    public static class152 field1842;

    @ObfuscatedName("dp.u")
    public static int[] field1844;

    @ObfuscatedName("f.gc")
    public static class157 field185;

    @ObfuscatedName("di.ba")
    public static int field1863;

    @ObfuscatedName("di.o")
    public static int[][][] field1864;

    @ObfuscatedName("dq.eh")
    public static class75[] field1869;

    @ObfuscatedName("dh.ev")
    public static int[] field1880;

    @ObfuscatedName("dw.dn")
    public static int field1895;

    @ObfuscatedName("dk.i")
    public static int field1900;

    @ObfuscatedName("dk.kj")
    public static class122 field1902;

    @ObfuscatedName("dr.fd")
    public static int field1909;

    @ObfuscatedName("dr.x")
    public static class210[] field1910;

    @ObfuscatedName("dl.l")
    public static class73 field1918;

    @ObfuscatedName("dl.t")
    public static int field1919;

    @ObfuscatedName("dc.l")
    public static class151 field1932;

    @ObfuscatedName("dc.mi")
    public static byte field1934;

    @ObfuscatedName("dc.cu")
    public static int field1935;

    @ObfuscatedName("da.k")
    public static class157 field1939;

    @ObfuscatedName("d.qg")
    public static boolean field195;

    @ObfuscatedName("dz.e")
    public static int field1950;

    @ObfuscatedName("dz.pe")
    public static int field1955;

    @ObfuscatedName("dy.v")
    public static File field1958;

    @ObfuscatedName("db.v")
    public static String field1960;

    @ObfuscatedName("db.en")
    public static class75[] field1962;

    @ObfuscatedName("db.a")
    public static String field1969;

    @ObfuscatedName("db.ec")
    public static class73 field1973;

    @ObfuscatedName("dx.nb")
    public static int field2007;

    @ObfuscatedName("de.n")
    public static class75 field2010;

    @ObfuscatedName("de.bp")
    public static class152 field2012;

    @ObfuscatedName("de.pk")
    public static class124 field2014;

    @ObfuscatedName("de.ea")
    public static class73[] field2016;

    @ObfuscatedName("dm.nf")
    public static class51 field2018;

    @ObfuscatedName("x.nt")
    public static int field202;

    @ObfuscatedName("dm.dg")
    public static int field2023;

    @ObfuscatedName("x.x")
    public static int[] field204;

    @ObfuscatedName("et.pu")
    public static Frame field2041;

    @ObfuscatedName("ep.df")
    public static int[] field2046;

    @ObfuscatedName("ep.li")
    public static class121 field2054;

    @ObfuscatedName("ep.n")
    public static byte[][] field2055;

    @ObfuscatedName("ej.ns")
    public static int field2058;

    @ObfuscatedName("x.eu")
    public static class75[] field206;

    @ObfuscatedName("ej.a")
    public static int field2060;

    @ObfuscatedName("x.dr")
    public static byte[][] field207;

    @ObfuscatedName("ee.pz")
    public static int field2070;

    @ObfuscatedName("ee.bm")
    public static class152 field2072;

    @ObfuscatedName("ee.y")
    public static String field2074;

    @ObfuscatedName("x.b")
    public static class75[] field208;

    @ObfuscatedName("x.n")
    public static int field210;

    @ObfuscatedName("eh.v")
    public static String field2103;

    @ObfuscatedName("eh.a")
    public static Applet field2104;

    @ObfuscatedName("el.bq")
    public static String field2111;

    @ObfuscatedName("el.o")
    public static int field2113;

    @ObfuscatedName("el.l")
    public static File field2114;

    @ObfuscatedName("el.bu")
    public static class75 field2122;

    @ObfuscatedName("el.b")
    public static File field2123;

    @ObfuscatedName("el.m")
    public static int field2124;

    @ObfuscatedName("v.is")
    public static int field22;

    @ObfuscatedName("o.mm")
    public static class22[] field225;

    @ObfuscatedName("o.eg")
    public static class73[] field227;

    @ObfuscatedName("o.d")
    public static class54 field228;

    @ObfuscatedName("o.fj")
    public static int field230;

    @ObfuscatedName("ex.nz")
    public static int field2429;

    @ObfuscatedName("ed.nu")
    public static int field2485;

    @ObfuscatedName("t.bs")
    public static class152 field250;

    @ObfuscatedName("ev.bf")
    public static FontMetrics field2522;

    @ObfuscatedName("ev.m")
    public static boolean field2523;

    @ObfuscatedName("ew.i")
    public static long field2535;

    @ObfuscatedName("client.v")
    public static client field254;

    @ObfuscatedName("ew.a")
    public static class134 field2544;

    @ObfuscatedName("ew.q")
    public static class110 field2545;

    @ObfuscatedName("er.h")
    public static int field2556;

    @ObfuscatedName("er.b")
    public static class151 field2560;

    @ObfuscatedName("er.fz")
    public static int field2561;

    @ObfuscatedName("ft.v")
    public static boolean[] field2564;

    @ObfuscatedName("ft.i")
    public static class151 field2565;

    @ObfuscatedName("ft.a")
    public static class157[][] field2599;

    @ObfuscatedName("fv.e")
    public static short[][] field2697;

    @ObfuscatedName("v.ek")
    public static int[] field27;

    @ObfuscatedName("fu.iw")
    public static int field2700;

    @ObfuscatedName("fk.ey")
    public static class73[] field2703;

    @ObfuscatedName("fk.v")
    public static class151 field2704;

    @ObfuscatedName("fk.pi")
    public static Canvas field2706;

    @ObfuscatedName("fe.s")
    public static int field2745;

    @ObfuscatedName("fe.v")
    public static class151 field2746;

    @ObfuscatedName("fe.i")
    public static class151 field2747;

    @ObfuscatedName("fe.m")
    public static class151 field2749;

    @ObfuscatedName("fe.k")
    public static boolean field2751;

    @ObfuscatedName("fe.a")
    public static class151 field2752;

    @ObfuscatedName("fe.f")
    public static class163 field2754;

    @ObfuscatedName("fm.bc")
    public static class152 field2783;

    @ObfuscatedName("v.ia")
    public static int field28;

    @ObfuscatedName("client.n")
    public static class144 field283;

    @ObfuscatedName("fw.ex")
    public static class73[] field2844;

    @ObfuscatedName("client.ac")
    public static class152 field288;

    @ObfuscatedName("client.bu")
    public static class152 field289;

    @ObfuscatedName("client.bz")
    public static class152 field290;

    @ObfuscatedName("client.br")
    public static class152 field291;

    @ObfuscatedName("gy.ng")
    public static int field2913;

    @ObfuscatedName("gy.cq")
    public static class137 field2922;

    @ObfuscatedName("gc.dv")
    public static class80 field2947;

    @ObfuscatedName("gu.m")
    public static int[] field2948;

    @ObfuscatedName("gu.bi")
    public static class23[] field2949;

    @ObfuscatedName("gv.w")
    public static int field2951;

    @ObfuscatedName("gv.l")
    public static int[] field2952;

    @ObfuscatedName("gi.v")
    public static class75 field2973;

    @ObfuscatedName("gi.e")
    public static class75[] field2974;

    @ObfuscatedName("gi.a")
    public static class104 field2975;

    @ObfuscatedName("gs.s")
    public static class75[] field2986;

    @ObfuscatedName("gx.m")
    public static class151 field3002;

    @ObfuscatedName("client.ci")
    public static class134 field303;

    @ObfuscatedName("hm.w")
    public static int field3036;

    @ObfuscatedName("hm.r")
    public static int[] field3037;

    @ObfuscatedName("hv.b")
    public static class167 field3043;

    @ObfuscatedName("i.kq")
    public static int field35;

    @ObfuscatedName("client.nn")
    public static class50 field376;

    @ObfuscatedName("client.r")
    public static class12 field392;

    @ObfuscatedName("client.ii")
    public static class157 field411;

    @ObfuscatedName("client.m")
    public static class143 field438;

    @ObfuscatedName("i.pq")
    public static Image field47;

    @ObfuscatedName("h.bi")
    public static class152 field529;

    @ObfuscatedName("u.ay")
    public static class75[] field538;

    @ObfuscatedName("b.dq")
    public static int[] field54;

    @ObfuscatedName("j.dc")
    public static int field546;

    @ObfuscatedName("j.z")
    public static int[] field547;

    @ObfuscatedName("j.a")
    public static boolean field550;

    @ObfuscatedName("g.ja")
    public static int field568;

    @ObfuscatedName("y.he")
    public static int field572;

    @ObfuscatedName("y.ed")
    public static class75 field578;

    @ObfuscatedName("y.cb")
    public static char field579;

    @ObfuscatedName("y.ez")
    public static int[] field580;

    @ObfuscatedName("y.gn")
    public static class157 field582;

    @ObfuscatedName("p.n")
    public static int[][] field592;

    @ObfuscatedName("r.bo")
    public static class152 field606;

    @ObfuscatedName("r.j")
    public static String field612;

    @ObfuscatedName("z.s")
    public static short[][] field616;

    @ObfuscatedName("z.km")
    public static int field618;

    @ObfuscatedName("c.nr")
    public static int field620;

    @ObfuscatedName("c.pr")
    public static int field621;

    @ObfuscatedName("c.ch")
    public static int field626;

    @ObfuscatedName("an.dd")
    public static int field630;

    @ObfuscatedName("an.fo")
    public static int field635;

    @ObfuscatedName("an.pg")
    public static Font field637;

    @ObfuscatedName("an.g")
    public static String field638;

    @ObfuscatedName("b.ot")
    public static class150 field64;

    @ObfuscatedName("l.x")
    public static class156 field65;

    @ObfuscatedName("as.pc")
    public static int field650;

    @ObfuscatedName("as.cl")
    public static class207 field652;

    @ObfuscatedName("ah.m")
    public static class73 field654;

    @ObfuscatedName("ah.w")
    public static class75 field655;

    @ObfuscatedName("ah.s")
    public static class75 field656;

    @ObfuscatedName("ah.i")
    public static class75 field658;

    @ObfuscatedName("ah.c")
    public static int[] field661;

    @ObfuscatedName("ah.ac")
    public static class75[] field665;

    @ObfuscatedName("l.s")
    public static class195 field67;

    @ObfuscatedName("l.dh")
    public static int[] field68;

    @ObfuscatedName("ah.ab")
    public static class73[] field684;

    @ObfuscatedName("ah.bw")
    public static class152 field690;

    @ObfuscatedName("ar.bv")
    public static int field695;

    @ObfuscatedName("ae.eb")
    public static class73[] field706;

    @ObfuscatedName("ae.nk")
    public static class51 field708;

    @ObfuscatedName("av.nh")
    public static int field709;

    @ObfuscatedName("av.f")
    public static class157 field716;

    @ObfuscatedName("al.b")
    public static String[] field723;

    @ObfuscatedName("al.i")
    public static int[] field727;

    @ObfuscatedName("al.at")
    public static class137 field732;

    @ObfuscatedName("aq.iz")
    public static int field760;

    @ObfuscatedName("m.m")
    public static byte[][][] field79;

    @ObfuscatedName("am.oe")
    public static long field798;

    @ObfuscatedName("m.w")
    public static byte[][][] field80;

    @ObfuscatedName("ax.a")
    public static class151 field808;

    @ObfuscatedName("m.s")
    public static int[] field81;

    @ObfuscatedName("m.k")
    public static int[] field82;

    @ObfuscatedName("m.ak")
    public static class134 field83;

    @ObfuscatedName("m.d")
    public static int[] field84;

    @ObfuscatedName("az.v")
    public static class151 field843;

    @ObfuscatedName("az.i")
    public static class151 field844;

    @ObfuscatedName("az.cx")
    public static class207 field871;

    @ObfuscatedName("az.iu")
    public static class157 field892;

    @ObfuscatedName("ai.a")
    public static class151 field897;

    @ObfuscatedName("ai.aw")
    public static String field901;

    @ObfuscatedName("aa.pb")
    public static int field905;

    @ObfuscatedName("aa.i")
    public static class151 field907;

    @ObfuscatedName("aa.a")
    public static class151 field908;

    @ObfuscatedName("aa.v")
    public static class151 field913;

    @ObfuscatedName("aa.oo")
    public static Clipboard field924;

    @ObfuscatedName("at.v")
    public static class151 field927;

    @ObfuscatedName("m.b")
    public static byte[][][] field93;

    @ObfuscatedName("at.a")
    public static class151 field940;

    @ObfuscatedName("aw.a")
    public static class151 field945;

    @ObfuscatedName("aw.i")
    public static int field946;

    @ObfuscatedName("aw.v")
    public static class151 field948;

    @ObfuscatedName("m.be")
    public static class152 field95;

    @ObfuscatedName("aw.dw")
    public static int[][] field956;

    @ObfuscatedName("m.f")
    public static int[] field96;

    @ObfuscatedName("aw.ef")
    public static class73[] field961;

    @ObfuscatedName("ao.fl")
    public static int field968;

    @ObfuscatedName("ao.a")
    public static class151 field971;

    @ObfuscatedName("ag.a")
    public static class151 field978;

    @ObfuscatedName("ag.z")
    public static int[] field984;

    @ObfuscatedName("ad.a")
    public static class151 field995;

    @ObfuscatedName("ad.k")
    public static class207 field998;

    @ObfuscatedName("ad.if")
    public static int field999;

    @ObfuscatedName("cd.a([Ljava/lang/String;[SIIB)V")
    public static void method1849(String[] arg0, short[] arg1, int arg2, int arg3) {
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
        method1849(arg0, arg1, arg2, var5 - 1);
        method1849(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("w.a(II)Laa;")
    public static class39 method97(int arg0) {
        class39 var1 = (class39) class39.field921.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field908.method2731(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method732(new class110(var2));
        }
        var3.method734();
        class39.field921.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ci.i(ILek;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1767(int arg0, class151 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2745(arg2);
        int var7 = arg1.method2746(var6, arg3);
        class166.method1867(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dc.l(I)Z")
    public static final boolean method2444() {
        class128 var0 = class128.field1992;
        synchronized (class128.field1992) {
            if (class128.field2002 == class128.field2001) {
                return false;
            } else {
                field626 = class128.field1996[class128.field2002];
                field579 = class128.field1995[class128.field2002];
                class128.field2002 = class128.field2002 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("at.s(II)Lcx;")
    public static class97 method766(int arg0) {
        class97 var1 = (class97) class39.field923.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class151 var2 = field913;
        class151 var3 = field907;
        boolean var4 = true;
        int[] var5 = var2.method2739(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2730(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2730(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class97 var10;
        if (var4) {
            try {
                var10 = new class97(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            class39.field923.method3183(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("u.l(Lbd;B)V")
    public static final void method498(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < field136.length; var2++) {
            field136[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            field136[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    field3037[var8] = (field136[var8 - 1] + field136[var8 + 1] + field136[var8 - 128] + field136[var8 + 128]) / 4;
                }
            }
            int[] var9 = field136;
            field136 = field3037;
            field3037 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1327; var11++) {
            for (int var12 = 0; var12 < arg0.field1328; var12++) {
                if (arg0.field1332[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1329;
                    int var14 = var11 + 16 + arg0.field1325;
                    int var15 = (var14 << 7) + var13;
                    field136[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ag.c(I)V")
    public static final void method833() {
        if (client.field262 && field572 != client.field313) {
            client.method1415(field2023, field630, field572, field1358.field795[0], field1358.field743[0]);
        } else if (field572 != client.field400) {
            client.field400 = field572;
            int var0 = field572;
            int[] var1 = field1764.field1314;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class6.field76[var0][var6][var4] & 0x18) == 0) {
                        field2947.method1626(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class6.field76[var0 + 1][var6][var4] & 0x8) != 0) {
                        field2947.method1626(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            field1764.method1474();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class6.field76[var0][var10][var9] & 0x18) == 0) {
                        client.method554(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class6.field76[var0 + 1][var10][var9] & 0x8) != 0) {
                        client.method554(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            client.field416 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = field2947.method1621(field572, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class37.method2964(var14).field855;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = client.field319[field572].field3032;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x1240108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x1240180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x1240102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x1240120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            client.field491[client.field416] = field1553[var15];
                            client.field489[client.field416] = var16;
                            client.field490[client.field416] = var17;
                            client.field416++;
                        }
                    }
                }
            }
            field127.method1410();
        }
    }

    @ObfuscatedName("ch.ab(I)Z")
    public static final boolean method1854() {
        if (field303 == null) {
            return false;
        }
        try {
            int var0 = field303.method2595();
            if (var0 == 0) {
                return false;
            }
            if (client.field305 == -1) {
                field303.method2596(client.field488.field1865, 0, 1);
                client.field488.field1861 = 0;
                client.field305 = client.field488.method2363();
                client.field484 = class171.field2843[client.field305];
                var0--;
            }
            if (client.field484 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                field303.method2596(client.field488.field1865, 0, 1);
                client.field484 = client.field488.field1865[0] & 0xFF;
                var0--;
            }
            if (client.field484 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                field303.method2596(client.field488.field1865, 0, 2);
                client.field488.field1861 = 0;
                client.field484 = client.field488.method2282();
                var0 -= 2;
            }
            if (var0 < client.field484) {
                return false;
            }
            client.field488.field1861 = 0;
            field303.method2596(client.field488.field1865, 0, client.field484);
            client.field306 = 0;
            client.field311 = client.field310;
            client.field310 = client.field309;
            client.field309 = client.field305;
            if (client.field305 == 200) {
                for (int var1 = 0; var1 < client.field378.length; var1++) {
                    if (client.field378[var1] != null) {
                        client.field378[var1].field766 = -1;
                    }
                }
                for (int var2 = 0; var2 < client.field464.length; var2++) {
                    if (client.field464[var2] != null) {
                        client.field464[var2].field766 = -1;
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 238) {
                int var3 = client.field488.method2136();
                int var4 = client.field488.method2166();
                int var5 = client.field488.method2166();
                class157 var6 = class157.method1871(var3);
                int var7 = var6.field2578 + var4;
                int var8 = var6.field2579 + var5;
                if (var6.field2576 != var7 || var6.field2688 != var8) {
                    var6.field2576 = var7;
                    var6.field2688 = var8;
                    client.method1372(var6);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 143) {
                int var9 = client.field488.method2173();
                int var10 = client.field488.method2164();
                class157 var11 = class157.method1871(var9);
                if (var11.field2657 != 2 || var11.field2604 != var10) {
                    var11.field2657 = 2;
                    var11.field2604 = var10;
                    client.method1372(var11);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 25) {
                String var12 = client.field488.method2139();
                int var13 = client.field488.method2282();
                byte var14 = client.field488.method2132();
                boolean var15 = false;
                if (var14 == -128) {
                    var15 = true;
                }
                if (var15) {
                    if (field1672 == 0) {
                        client.field305 = -1;
                        return true;
                    }
                    boolean var16 = false;
                    int var17;
                    for (var17 = 0; var17 < field1672 && (!field225[var17].field576.equals(var12) || field225[var17].field574 != var13); var17++) {
                    }
                    if (var17 < field1672) {
                        while (var17 < field1672 - 1) {
                            field225[var17] = field225[var17 + 1];
                            var17++;
                        }
                        field1672--;
                        field225[field1672] = null;
                    }
                } else {
                    client.field488.method2139();
                    class22 var18 = new class22();
                    var18.field576 = var12;
                    var18.field573 = class214.method2062(var18.field576, field67);
                    var18.field574 = var13;
                    var18.field581 = var14;
                    int var19;
                    for (var19 = field1672 - 1; var19 >= 0; var19--) {
                        int var20 = field225[var19].field573.compareTo(var18.field573);
                        if (var20 == 0) {
                            field225[var19].field574 = var13;
                            field225[var19].field581 = var14;
                            if (var12.equals(field1358.field37)) {
                                field1516 = var14;
                            }
                            client.field259 = client.field414;
                            client.field305 = -1;
                            return true;
                        }
                        if (var20 < 0) {
                            break;
                        }
                    }
                    if (field1672 >= field225.length) {
                        client.field305 = -1;
                        return true;
                    }
                    for (int var21 = field1672 - 1; var21 > var19; var21--) {
                        field225[var21 + 1] = field225[var21];
                    }
                    if (field1672 == 0) {
                        field225 = new class22[100];
                    }
                    field225[var19 + 1] = var18;
                    field1672++;
                    if (var12.equals(field1358.field37)) {
                        field1516 = var14;
                    }
                }
                client.field259 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 161) {
                field546 = client.field488.method2261();
                field1895 = client.field488.method2261();
                for (int var22 = field546; var22 < field546 + 8; var22++) {
                    for (int var23 = field1895; var23 < field1895 + 8; var23++) {
                        if (client.field393[field572][var22][var23] != null) {
                            client.field393[field572][var22][var23] = null;
                            client.method32(var22, var23);
                        }
                    }
                }
                for (class15 var24 = (class15) client.field270.method3251(); var24 != null; var24 = (class15) client.field270.method3261()) {
                    if (var24.field216 >= field546 && var24.field216 < field546 + 8 && var24.field217 >= field1895 && var24.field217 < field1895 + 8 && field572 == var24.field226) {
                        var24.field214 = 0;
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 18) {
                client.field500 = true;
                field202 = client.field488.method2199();
                field2429 = client.field488.method2199();
                field709 = client.field488.method2282();
                field2058 = client.field488.method2199();
                field1290 = client.field488.method2199();
                if (field1290 >= 100) {
                    field635 = field202 * 128 + 64;
                    field2561 = field2429 * 128 + 64;
                    field145 = client.method1875(field635, field2561, field572) - field709;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 192) {
                client.method2416(false);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 2) {
                client.field492 = client.field488.method2199();
                if (client.field492 == 255) {
                    client.field492 = 0;
                }
                client.field325 = client.field488.method2199();
                if (client.field325 == 255) {
                    client.field325 = 0;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 75) {
                client.method664(false);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 117) {
                client.field470 = client.field488.method2199();
                if (client.field470 == 1) {
                    client.field276 = client.field488.method2282();
                }
                if (client.field470 >= 2 && client.field470 <= 6) {
                    if (client.field470 == 2) {
                        client.field375 = 64;
                        client.field350 = 64;
                    }
                    if (client.field470 == 3) {
                        client.field375 = 0;
                        client.field350 = 64;
                    }
                    if (client.field470 == 4) {
                        client.field375 = 128;
                        client.field350 = 64;
                    }
                    if (client.field470 == 5) {
                        client.field375 = 64;
                        client.field350 = 0;
                    }
                    if (client.field470 == 6) {
                        client.field375 = 64;
                        client.field350 = 128;
                    }
                    client.field470 = 2;
                    client.field278 = client.field488.method2282();
                    client.field279 = client.field488.method2282();
                    client.field280 = client.field488.method2199();
                }
                if (client.field470 == 10) {
                    client.field326 = client.field488.method2282();
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 9) {
                client.field494 = client.field488.method2199();
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 208) {
                int var25 = client.field488.method2199();
                if (client.field488.method2199() == 0) {
                    client.field522[var25] = new class203();
                    client.field488.field1861 += 18;
                } else {
                    client.field488.field1861--;
                    client.field522[var25] = new class203(client.field488, false);
                }
                client.field501 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 125) {
                for (int var26 = 0; var26 < field1064; var26++) {
                    class47 var27 = class47.method2357(var26);
                    if (var27 != null) {
                        class159.field2699[var26] = 0;
                        class159.field2701[var26] = 0;
                    }
                }
                client.method1868();
                client.field447 += 32;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 14) {
                client.method2588();
                client.field305 = -1;
                return false;
            }
            if (client.field305 == 205) {
                int var28 = client.field488.method2164();
                if (var28 == 65535) {
                    var28 = -1;
                }
                client.method599(var28);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 118) {
                int var29 = client.field488.method2208();
                int var30 = client.field488.method2282();
                if (var30 == 65535) {
                    var30 = -1;
                }
                if (client.field495 != 0 && var30 != -1) {
                    class166.method130(field290, var30, 0, client.field495, false);
                    client.field408 = true;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 37) {
                String var31 = client.field488.method2139();
                Object[] var32 = new Object[var31.length() + 1];
                for (int var33 = var31.length() - 1; var33 >= 0; var33--) {
                    if (var31.charAt(var33) == 's') {
                        var32[var33 + 1] = client.field488.method2139();
                    } else {
                        var32[var33 + 1] = Integer.valueOf(client.field488.method2136());
                    }
                }
                var32[0] = Integer.valueOf(client.field488.method2136());
                class1 var34 = new class1();
                var34.field6 = var32;
                class33.method182(var34);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 154) {
                client.field259 = client.field414;
                if (client.field484 == 0) {
                    client.field485 = null;
                    client.field341 = null;
                    field1672 = 0;
                    field225 = null;
                    client.field305 = -1;
                    return true;
                }
                client.field341 = client.field488.method2139();
                long var35 = client.field488.method2137();
                long var37 = var35;
                String var39;
                if (var35 <= 0L || var35 >= 6582952005840035281L) {
                    var39 = null;
                } else if (var35 % 37L == 0L) {
                    var39 = null;
                } else {
                    int var40 = 0;
                    for (long var41 = var35; var41 != 0L; var41 /= 37L) {
                        var40++;
                    }
                    StringBuilder var43 = new StringBuilder(var40);
                    while (var37 != 0L) {
                        long var44 = var37;
                        var37 /= 37L;
                        var43.append(class212.field3034[(int) (var44 - var37 * 37L)]);
                    }
                    var39 = var43.reverse().toString();
                }
                client.field485 = var39;
                field1934 = client.field488.method2132();
                int var46 = client.field488.method2199();
                if (var46 == 255) {
                    client.field305 = -1;
                    return true;
                }
                field1672 = var46;
                class22[] var47 = new class22[100];
                for (int var48 = 0; var48 < field1672; var48++) {
                    var47[var48] = new class22();
                    var47[var48].field576 = client.field488.method2139();
                    var47[var48].field573 = class214.method2062(var47[var48].field576, field67);
                    var47[var48].field574 = client.field488.method2282();
                    var47[var48].field581 = client.field488.method2132();
                    client.field488.method2139();
                    if (var47[var48].field576.equals(field1358.field37)) {
                        field1516 = var47[var48].field581;
                    }
                }
                boolean var49 = false;
                int var50 = field1672;
                while (var50 > 0) {
                    boolean var51 = true;
                    var50--;
                    for (int var52 = 0; var52 < var50; var52++) {
                        if (var47[var52].field573.compareTo(var47[var52 + 1].field573) > 0) {
                            class22 var53 = var47[var52];
                            var47[var52] = var47[var52 + 1];
                            var47[var52 + 1] = var53;
                            var51 = false;
                        }
                    }
                    if (var51) {
                        break;
                    }
                }
                field225 = var47;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 79) {
                int var54 = client.field488.method2311();
                int var55 = client.field488.method2134();
                class157 var56 = class157.method1871(var54);
                if (var56.field2607 != var55 || var55 == -1) {
                    var56.field2607 = var55;
                    var56.field2662 = 0;
                    var56.field2654 = 0;
                    client.method1372(var56);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 133) {
                client.method2416(true);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 247) {
                int var57 = client.field488.method2136();
                int var58 = client.field488.method2282();
                if (var57 < -70000) {
                    var58 += 32768;
                }
                class157 var59;
                if (var57 >= 0) {
                    var59 = class157.method1871(var57);
                } else {
                    var59 = null;
                }
                if (var59 != null) {
                    for (int var60 = 0; var60 < var59.field2676.length; var60++) {
                        var59.field2676[var60] = 0;
                        var59.field2612[var60] = 0;
                    }
                }
                class14.method2537(var58);
                int var61 = client.field488.method2282();
                for (int var62 = 0; var62 < var61; var62++) {
                    int var63 = client.field488.method2163();
                    int var64 = client.field488.method2199();
                    if (var64 == 255) {
                        var64 = client.field488.method2171();
                    }
                    if (var59 != null && var62 < var59.field2676.length) {
                        var59.field2676[var62] = var63;
                        var59.field2612[var62] = var64;
                    }
                    class14.method2587(var58, var62, var63 - 1, var64);
                }
                if (var59 != null) {
                    client.method1372(var59);
                }
                client.method1868();
                client.field448[++client.field449 - 1 & 0x1F] = var58 & 0x7FFF;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 182) {
                client.field488.field1861 += 28;
                if (client.field488.method2151()) {
                    class140.method2462(client.field488, client.field488.field1861 - 28);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 253) {
                int var65 = client.field488.method2282();
                int var66 = client.field488.method2199();
                int var67 = client.field488.method2282();
                if (client.field498 != 0 && var66 != 0 && client.field397 < 50) {
                    client.field285[client.field397] = var65;
                    client.field503[client.field397] = var66;
                    client.field268[client.field397] = var67;
                    client.field506[client.field397] = null;
                    client.field505[client.field397] = 0;
                    client.field397++;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 155) {
                int var71 = client.field488.method2199();
                class121[] var72 = new class121[] { class121.field1927, class121.field1928, class121.field1922 };
                class121[] var73 = var72;
                int var74 = 0;
                class121 var76;
                while (true) {
                    if (var74 >= var73.length) {
                        var76 = null;
                        break;
                    }
                    class121 var75 = var73[var74];
                    if (var75.field1923 == var71) {
                        var76 = var75;
                        break;
                    }
                    var74++;
                }
                field2054 = var76;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 36) {
                int var77 = client.field488.method2136();
                boolean var78 = client.field488.method2157() == 1;
                class157 var79 = class157.method1871(var77);
                if (var79.field2583 != var78) {
                    var79.field2583 = var78;
                    client.method1372(var79);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 166) {
                int var80 = client.field488.method2261();
                int var81 = client.field488.method2199();
                int var82 = client.field488.method2156();
                field572 = var80 >> 1;
                field1358.method613(var81, var82, (var80 & 0x1) == 1);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 210) {
                int var83 = client.field488.method2282();
                client.field421 = var83;
                client.method62(var83);
                class33.method1396(client.field421);
                for (int var84 = 0; var84 < 100; var84++) {
                    client.field467[var84] = true;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 22) {
                int var85 = client.field488.method2136();
                class157 var86 = class157.method1871(var85);
                var86.field2657 = 3;
                var86.field2604 = field1358.field42.method2937();
                client.method1372(var86);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 46) {
                for (int var87 = 0; var87 < class159.field2701.length; var87++) {
                    if (class159.field2701[var87] != class159.field2699[var87]) {
                        class159.field2701[var87] = class159.field2699[var87];
                        client.method99(var87);
                        client.field373[++client.field447 - 1 & 0x1F] = var87;
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 147) {
                int var88 = client.field488.method2298();
                int var89 = client.field488.method2136();
                class157 var90 = class157.method1871(var89);
                if (var90.field2657 != 1 || var90.field2604 != var88) {
                    var90.field2657 = 1;
                    var90.field2604 = var88;
                    client.method1372(var90);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 244) {
                client.field386 = 0;
                client.field320 = 0;
                client.field488.method2362();
                int var91 = client.field488.method2365(1);
                if (var91 != 0) {
                    int var92 = client.field488.method2365(2);
                    if (var92 == 0) {
                        client.field333[++client.field320 - 1] = 2047;
                    } else if (var92 == 1) {
                        int var93 = client.field488.method2365(3);
                        field1358.method616(var93, false);
                        int var94 = client.field488.method2365(1);
                        if (var94 == 1) {
                            client.field333[++client.field320 - 1] = 2047;
                        }
                    } else if (var92 == 2) {
                        int var95 = client.field488.method2365(3);
                        field1358.method616(var95, true);
                        int var96 = client.field488.method2365(3);
                        field1358.method616(var96, true);
                        int var97 = client.field488.method2365(1);
                        if (var97 == 1) {
                            client.field333[++client.field320 - 1] = 2047;
                        }
                    } else if (var92 == 3) {
                        int var98 = client.field488.method2365(1);
                        if (var98 == 1) {
                            client.field333[++client.field320 - 1] = 2047;
                        }
                        int var99 = client.field488.method2365(1);
                        field572 = client.field488.method2365(2);
                        int var100 = client.field488.method2365(7);
                        int var101 = client.field488.method2365(7);
                        field1358.method613(var100, var101, var99 == 1);
                    }
                }
                client.method2855();
                while (client.field488.method2367(client.field484) >= 11) {
                    int var102 = client.field488.method2365(11);
                    if (var102 == 2047) {
                        break;
                    }
                    boolean var103 = false;
                    if (client.field378[var102] == null) {
                        client.field378[var102] = new class3();
                        if (client.field383[var102] != null) {
                            client.field378[var102].method13(client.field383[var102]);
                        }
                        var103 = true;
                    }
                    client.field380[++client.field379 - 1] = var102;
                    class3 var104 = client.field378[var102];
                    var104.field771 = client.field266;
                    int var105 = client.field488.method2365(1);
                    int var106 = client.field488.method2365(1);
                    if (var106 == 1) {
                        client.field333[++client.field320 - 1] = var102;
                    }
                    int var107 = client.field488.method2365(5);
                    if (var107 > 15) {
                        var107 -= 32;
                    }
                    int var108 = client.field483[client.field488.method2365(3)];
                    if (var103) {
                        var104.field785 = var104.field777 = var108;
                    }
                    int var109 = client.field488.method2365(5);
                    if (var109 > 15) {
                        var109 -= 32;
                    }
                    var104.method613(field1358.field795[0] + var109, field1358.field743[0] + var107, var105 == 1);
                }
                client.field488.method2380();
                client.method2965();
                for (int var110 = 0; var110 < client.field386; var110++) {
                    int var111 = client.field387[var110];
                    if (client.field266 != client.field378[var111].field771) {
                        client.field378[var111] = null;
                    }
                }
                if (client.field484 != client.field488.field1861) {
                    throw new RuntimeException(client.field488.field1861 + class2.field23 + client.field484);
                }
                for (int var112 = 0; var112 < client.field379; var112++) {
                    if (client.field378[client.field380[var112]] == null) {
                        throw new RuntimeException(var112 + class2.field23 + client.field379);
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 49) {
                client.method1868();
                client.field437 = client.field488.method2199();
                client.field457 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 227) {
                if (client.field421 != -1) {
                    int var113 = client.field421;
                    if (class157.method764(var113)) {
                        client.method138(field2599[var113], 0);
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 189) {
                int var114 = client.field488.method2157();
                int var115 = client.field488.method2171();
                int var116 = client.field488.method2282();
                class4 var117 = (class4) client.field422.method3231((long) var115);
                if (var117 != null) {
                    client.method2712(var117, var117.field63 != var116);
                }
                class4 var118 = new class4();
                var118.field63 = var116;
                var118.field55 = var114;
                client.field422.method3211(var118, (long) var115);
                client.method62(var116);
                class33.method1396(var116);
                class157 var119 = class157.method1871(var115);
                if (var119 != null) {
                    client.method1372(var119);
                }
                if (client.field425 != null) {
                    client.method1372(client.field425);
                    client.field425 = null;
                }
                client.method851();
                if (client.field421 != -1) {
                    int var120 = client.field421;
                    if (class157.method764(var120)) {
                        client.method138(field2599[var120], 1);
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 173) {
                client.field500 = false;
                for (int var121 = 0; var121 < 5; var121++) {
                    client.field508[var121] = false;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 103) {
                int var122 = client.field488.method2136();
                class4 var123 = (class4) client.field422.method3231((long) var122);
                if (var123 != null) {
                    client.method2712(var123, true);
                }
                if (client.field425 != null) {
                    client.method1372(client.field425);
                    client.field425 = null;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 56) {
                client.field258 = client.field488.method2163() * 30;
                client.field457 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 226) {
                class113 var124 = client.field488;
                int var125 = client.field484;
                class193 var126 = new class193();
                var126.field2914 = var124.method2199();
                var126.field2920 = var124.method2136();
                var126.field2915 = new int[var126.field2914];
                var126.field2916 = new int[var126.field2914];
                var126.field2917 = new Field[var126.field2914];
                var126.field2921 = new int[var126.field2914];
                var126.field2919 = new Method[var126.field2914];
                var126.field2918 = new byte[var126.field2914][][];
                for (int var127 = 0; var127 < var126.field2914; var127++) {
                    try {
                        int var128 = var124.method2199();
                        if (var128 == 0 || var128 == 1 || var128 == 2) {
                            String var129 = var124.method2139();
                            String var130 = var124.method2139();
                            int var131 = 0;
                            if (var128 == 1) {
                                var131 = var124.method2136();
                            }
                            var126.field2915[var127] = var128;
                            var126.field2921[var127] = var131;
                            if (class194.method2966(var129).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var126.field2917[var127] = class194.method2966(var129).getDeclaredField(var130);
                        } else if (var128 == 3 || var128 == 4) {
                            String var132 = var124.method2139();
                            String var133 = var124.method2139();
                            int var134 = var124.method2199();
                            String[] var135 = new String[var134];
                            for (int var136 = 0; var136 < var134; var136++) {
                                var135[var136] = var124.method2139();
                            }
                            String var137 = var124.method2139();
                            byte[][] var138 = new byte[var134][];
                            if (var128 == 3) {
                                for (int var139 = 0; var139 < var134; var139++) {
                                    int var140 = var124.method2136();
                                    var138[var139] = new byte[var140];
                                    var124.method2142(var138[var139], 0, var140);
                                }
                            }
                            var126.field2915[var127] = var128;
                            Class[] var141 = new Class[var134];
                            for (int var142 = 0; var142 < var134; var142++) {
                                var141[var142] = class194.method2966(var135[var142]);
                            }
                            Class var143 = class194.method2966(var137);
                            if (class194.method2966(var132).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var144 = class194.method2966(var132).getDeclaredMethods();
                            Method[] var145 = var144;
                            for (int var146 = 0; var146 < var145.length; var146++) {
                                Method var147 = var145[var146];
                                if (var147.getName().equals(var133)) {
                                    Class[] var148 = var147.getParameterTypes();
                                    if (var141.length == var148.length) {
                                        boolean var149 = true;
                                        for (int var150 = 0; var150 < var141.length; var150++) {
                                            if (var141[var150] != var148[var150]) {
                                                var149 = false;
                                                break;
                                            }
                                        }
                                        if (var149 && var143 == var147.getReturnType()) {
                                            var126.field2919[var127] = var147;
                                        }
                                    }
                                }
                            }
                            var126.field2918[var127] = var138;
                        }
                    } catch (ClassNotFoundException var332) {
                        var126.field2916[var127] = -1;
                    } catch (SecurityException var333) {
                        var126.field2916[var127] = -2;
                    } catch (NullPointerException var334) {
                        var126.field2916[var127] = -3;
                    } catch (Exception var335) {
                        var126.field2916[var127] = -4;
                    } catch (Throwable var336) {
                        var126.field2916[var127] = -5;
                    }
                }
                class194.field2925.method3298(var126);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 160) {
                String var156 = client.field488.method2139();
                String var157 = class206.method3447(class213.method3407(class205.method686(client.field488)));
                class10.method2599(6, var156, var157);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 26) {
                String var158 = client.field488.method2139();
                field1453 = var158;
                try {
                    String var159 = field254.getParameter(class173.field2861.field2864);
                    String var160 = field254.getParameter(class173.field2853.field2864);
                    String var161 = var159 + "settings=" + var158 + "; version=1; path=/; domain=" + var160;
                    String var162;
                    if (var158.length() == 0) {
                        var162 = var161 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var162 = var161 + "; Expires=" + class102.method662(class106.method2471() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class123.method2446(field254, "document.cookie=\"" + var162 + "\"");
                } catch (Throwable var331) {
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 170) {
                field546 = client.field488.method2157();
                field1895 = client.field488.method2261();
                while (client.field488.field1861 < client.field484) {
                    client.field305 = client.field488.method2199();
                    client.method169();
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 104) {
                String var164 = client.field488.method2139();
                long var165 = client.field488.method2137();
                long var167 = (long) client.field488.method2282();
                long var169 = (long) client.field488.method2208();
                class142 var171 = (class142) class100.method111(class142.method488(), client.field488.method2199());
                long var172 = (var167 << 32) + var169;
                boolean var174 = false;
                for (int var175 = 0; var175 < 100; var175++) {
                    if (client.field479[var175] == var172) {
                        var174 = true;
                        break;
                    }
                }
                if (var171.field2144 && client.method1408(var164)) {
                    var174 = true;
                }
                if (!var174 && client.field377 == 0) {
                    client.field479[client.field480] = var172;
                    client.field480 = (client.field480 + 1) % 100;
                    String var176 = class206.method3447(class213.method3407(class205.method686(client.field488)));
                    if (var171.field2142 == -1) {
                        class10.method3354(9, var164, var176, class212.method2699(var165));
                    } else {
                        int var177 = var171.field2142;
                        String var178 = "<img=" + var177 + ">";
                        class10.method3354(9, var178 + var164, var176, class212.method2699(var165));
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 44) {
                String var179 = client.field488.method2139();
                int var180 = client.field488.method2199();
                int var181 = client.field488.method2199();
                if (var181 >= 1 && var181 <= 8) {
                    if (var179.equalsIgnoreCase("null")) {
                        var179 = null;
                    }
                    client.field389[var181 - 1] = var179;
                    client.field277[var181 - 1] = var180 == 0;
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 139) {
                int var182 = client.field488.method2282();
                int var183 = client.field488.method2311();
                int var184 = var182 >> 10 & 0x1F;
                int var185 = var182 >> 5 & 0x1F;
                int var186 = var182 & 0x1F;
                int var187 = (var186 << 3) + (var184 << 19) + (var185 << 11);
                class157 var188 = class157.method1871(var183);
                if (var188.field2588 != var187) {
                    var188.field2588 = var187;
                    client.method1372(var188);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 185) {
                int var189 = client.field488.method2136();
                field732 = field1300.method2482(var189);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 248) {
                class23 var190 = new class23();
                var190.field587 = client.field488.method2139();
                var190.field590 = client.field488.method2282();
                int var191 = client.field488.method2136();
                var190.field585 = var191;
                client.method590(45);
                field303.method2593();
                field303 = null;
                class29.method3365(var190);
                client.field305 = -1;
                return false;
            }
            if (client.field305 == 252) {
                int var192 = client.field488.method2298();
                class14.method2060(var192);
                client.field448[++client.field449 - 1 & 0x1F] = var192 & 0x7FFF;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 214) {
                int var193 = client.field488.method2136();
                int var194 = client.field488.method2282();
                if (var193 < -70000) {
                    var194 += 32768;
                }
                class157 var195;
                if (var193 >= 0) {
                    var195 = class157.method1871(var193);
                } else {
                    var195 = null;
                }
                while (client.field488.field1861 < client.field484) {
                    int var196 = client.field488.method2144();
                    int var197 = client.field488.method2282();
                    int var198 = 0;
                    if (var197 != 0) {
                        var198 = client.field488.method2199();
                        if (var198 == 255) {
                            var198 = client.field488.method2136();
                        }
                    }
                    if (var195 != null && var196 >= 0 && var196 < var195.field2676.length) {
                        var195.field2676[var196] = var197;
                        var195.field2612[var196] = var198;
                    }
                    class14.method2587(var194, var196, var197 - 1, var198);
                }
                if (var195 != null) {
                    client.method1372(var195);
                }
                client.method1868();
                client.field448[++client.field449 - 1 & 0x1F] = var194 & 0x7FFF;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 187) {
                int var199 = client.field488.method2171();
                int var200 = client.field488.method2282();
                if (var200 == 65535) {
                    var200 = -1;
                }
                int var201 = client.field488.method2298();
                if (var201 == 65535) {
                    var201 = -1;
                }
                int var202 = client.field488.method2311();
                for (int var203 = var201; var203 <= var200; var203++) {
                    long var204 = ((long) var199 << 32) + (long) var203;
                    class191 var206 = client.field346.method3231(var204);
                    if (var206 != null) {
                        var206.method3343();
                    }
                    client.field346.method3211(new class184(var202), var204);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 28) {
                int var207 = client.field488.method2199();
                int var208 = client.field488.method2199();
                int var209 = client.field488.method2199();
                int var210 = client.field488.method2199();
                client.field508[var207] = true;
                client.field509[var207] = var208;
                client.field510[var207] = var209;
                client.field511[var207] = var210;
                client.field445[var207] = 0;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 169) {
                int var211 = client.field488.method2164();
                int var212 = client.field488.method2164();
                int var213 = client.field488.method2311();
                class157 var214 = class157.method1871(var213);
                var214.field2615 = (var211 << 16) + var212;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 134 || client.field305 == 150 || client.field305 == 67 || client.field305 == 32 || client.field305 == 180 || client.field305 == 17 || client.field305 == 218 || client.field305 == 186 || client.field305 == 206 || client.field305 == 148) {
                client.method169();
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 62) {
                client.method664(true);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 82) {
                int var215 = client.field488.method2144();
                boolean var216 = client.field488.method2199() == 1;
                String var217 = "";
                boolean var218 = false;
                if (var216) {
                    var217 = client.field488.method2139();
                    if (client.method1408(var217)) {
                        var218 = true;
                    }
                }
                String var219 = client.field488.method2139();
                if (!var218) {
                    class10.method2599(var215, var217, var219);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 41) {
                client.field500 = true;
                field2485 = client.field488.method2199();
                field2913 = client.field488.method2199();
                field2007 = client.field488.method2282();
                field620 = client.field488.method2199();
                field146 = client.field488.method2199();
                if (field146 >= 100) {
                    int var220 = field2485 * 128 + 64;
                    int var221 = field2913 * 128 + 64;
                    int var222 = client.method1875(var220, var221, field572) - field2007;
                    int var223 = var220 - field635;
                    int var224 = var222 - field145;
                    int var225 = var221 - field2561;
                    int var226 = (int) Math.sqrt((double) (var223 * var223 + var225 * var225));
                    field968 = (int) (Math.atan2((double) var224, (double) var226) * 325.949D) & 0x7FF;
                    field1909 = (int) (Math.atan2((double) var223, (double) var225) * -325.949D) & 0x7FF;
                    if (field968 < 128) {
                        field968 = 128;
                    }
                    if (field968 > 383) {
                        field968 = 383;
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 71) {
                int var227 = client.field488.method2171();
                int var228 = client.field488.method2282();
                class157 var229 = class157.method1871(var227);
                if (var229 != null && var229.field2573 == 0) {
                    if (var228 > var229.field2577 - var229.field2581) {
                        var228 = var229.field2577 - var229.field2581;
                    }
                    if (var228 < 0) {
                        var228 = 0;
                    }
                    if (var229.field2585 != var228) {
                        var229.field2585 = var228;
                        client.method1372(var229);
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 95) {
                field1895 = client.field488.method2199();
                field546 = client.field488.method2261();
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 249) {
                int var230 = client.field488.method2298();
                int var231 = client.field488.method2173();
                int var232 = client.field488.method2164();
                int var233 = client.field488.method2164();
                class157 var234 = class157.method1871(var231);
                if (var234.field2611 != var230 || var234.field2680 != var232 || var234.field2614 != var233) {
                    var234.field2611 = var230;
                    var234.field2680 = var232;
                    var234.field2614 = var233;
                    client.method1372(var234);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 8) {
                int var235 = client.field488.method2164();
                byte var236 = client.field488.method2132();
                class159.field2699[var235] = var236;
                if (class159.field2701[var235] != var236) {
                    class159.field2701[var235] = var236;
                    client.method99(var235);
                }
                client.field373[++client.field447 - 1 & 0x1F] = var235;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 191) {
                int var237 = client.field488.method2136();
                int var238 = client.field488.method2298();
                class159.field2699[var238] = var237;
                if (class159.field2701[var238] != var237) {
                    class159.field2701[var238] = var237;
                    client.method99(var238);
                }
                client.field373[++client.field447 - 1 & 0x1F] = var238;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 156) {
                client.method1868();
                int var239 = client.field488.method2199();
                int var240 = client.field488.method2311();
                int var241 = client.field488.method2199();
                client.field399[var239] = var240;
                client.field394[var239] = var241;
                client.field398[var239] = 1;
                for (int var242 = 0; var242 < 98; var242++) {
                    if (var240 >= class145.field2168[var242]) {
                        client.field398[var239] = var242 + 2;
                    }
                }
                client.field487[++client.field274 - 1 & 0x1F] = var239;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 135) {
                int var243 = client.field488.method2171();
                class157 var244 = class157.method1871(var243);
                for (int var245 = 0; var245 < var244.field2676.length; var245++) {
                    var244.field2676[var245] = -1;
                    var244.field2676[var245] = 0;
                }
                client.method1372(var244);
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 116) {
                String var246 = client.field488.method2139();
                long var247 = (long) client.field488.method2282();
                long var249 = (long) client.field488.method2208();
                class142 var251 = (class142) class100.method111(class142.method488(), client.field488.method2199());
                long var252 = (var247 << 32) + var249;
                boolean var254 = false;
                for (int var255 = 0; var255 < 100; var255++) {
                    if (client.field479[var255] == var252) {
                        var254 = true;
                        break;
                    }
                }
                if (client.method1408(var246)) {
                    var254 = true;
                }
                if (!var254 && client.field377 == 0) {
                    client.field479[client.field480] = var252;
                    client.field480 = (client.field480 + 1) % 100;
                    class113 var256 = client.field488;
                    String var260;
                    try {
                        int var257 = var256.method2144();
                        if (var257 > 32767) {
                            var257 = 32767;
                        }
                        byte[] var258 = new byte[var257];
                        var256.field1861 += field2975.method2065(var256.field1865, var256.field1861, var258, 0, var257);
                        String var259 = class215.method3385(var258, 0, var257);
                        var260 = var259;
                    } catch (Exception var330) {
                        var260 = "Cabbage";
                    }
                    String var263 = class206.method3447(class213.method3407(var260));
                    byte var264;
                    if (var251.field2143) {
                        var264 = 7;
                    } else {
                        var264 = 3;
                    }
                    if (var251.field2142 == -1) {
                        class10.method2599(var264, var246, var263);
                    } else {
                        int var266 = var251.field2142;
                        String var267 = "<img=" + var266 + ">";
                        class10.method2599(var264, var267 + var246, var263);
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 240) {
                while (client.field488.field1861 < client.field484) {
                    boolean var268 = client.field488.method2199() == 1;
                    String var269 = client.field488.method2139();
                    String var270 = client.field488.method2139();
                    int var271 = client.field488.method2282();
                    int var272 = client.field488.method2199();
                    int var273 = client.field488.method2199();
                    boolean var274 = (var273 & 0x2) != 0;
                    boolean var275 = (var273 & 0x1) != 0;
                    if (var271 > 0) {
                        client.field488.method2139();
                        client.field488.method2199();
                        client.field488.method2136();
                    }
                    client.field488.method2139();
                    for (int var276 = 0; var276 < client.field513; var276++) {
                        class16 var277 = client.field515[var276];
                        if (var268) {
                            if (var270.equals(var277.field233)) {
                                var277.field233 = var269;
                                var277.field232 = var270;
                                var269 = null;
                                break;
                            }
                        } else if (var269.equals(var277.field233)) {
                            if (var277.field235 != var271) {
                                boolean var278 = true;
                                for (class35 var279 = (class35) client.field364.method3200(); var279 != null; var279 = (class35) client.field364.method3203()) {
                                    if (var279.field797.equals(var269)) {
                                        if (var271 != 0 && var279.field799 == 0) {
                                            var279.method3340();
                                            var278 = false;
                                        } else if (var271 == 0 && var279.field799 != 0) {
                                            var279.method3340();
                                            var278 = false;
                                        }
                                    }
                                }
                                if (var278) {
                                    client.field364.method3201(new class35(var269, var271));
                                }
                                var277.field235 = var271;
                            }
                            var277.field232 = var270;
                            var277.field234 = var272;
                            var277.field240 = var274;
                            var277.field238 = var275;
                            var269 = null;
                            break;
                        }
                    }
                    if (var269 != null && client.field513 < 400) {
                        class16 var280 = new class16();
                        client.field515[client.field513] = var280;
                        var280.field233 = var269;
                        var280.field232 = var270;
                        var280.field235 = var271;
                        var280.field234 = var272;
                        var280.field240 = var274;
                        var280.field238 = var275;
                        client.field513++;
                    }
                }
                client.field327 = 2;
                client.field486 = client.field414;
                boolean var281 = false;
                int var282 = client.field513;
                while (var282 > 0) {
                    boolean var283 = true;
                    var282--;
                    for (int var284 = 0; var284 < var282; var284++) {
                        boolean var285 = false;
                        class16 var286 = client.field515[var284];
                        class16 var287 = client.field515[var284 + 1];
                        if (client.field256 != var286.field235 && client.field256 == var287.field235) {
                            var285 = true;
                        }
                        if (!var285 && var286.field235 == 0 && var287.field235 != 0) {
                            var285 = true;
                        }
                        if (!var285 && !var286.field240 && var287.field240) {
                            var285 = true;
                        }
                        if (!var285 && !var286.field238 && var287.field238) {
                            var285 = true;
                        }
                        if (var285) {
                            class16 var288 = client.field515[var284];
                            client.field515[var284] = client.field515[var284 + 1];
                            client.field515[var284 + 1] = var288;
                            var283 = false;
                        }
                    }
                    if (var283) {
                        break;
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 122) {
                boolean var289 = client.field488.method2199() == 1;
                if (var289) {
                    field798 = class106.method2471() - client.field488.method2137();
                    field1494 = new class204(client.field488, true);
                } else {
                    field1494 = null;
                }
                client.field455 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 198) {
                client.field327 = 1;
                client.field486 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 101) {
                int var290 = client.field488.method2311();
                String var291 = client.field488.method2139();
                class157 var292 = class157.method1871(var290);
                if (!var291.equals(var292.field2619)) {
                    var292.field2619 = var291;
                    client.method1372(var292);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 94) {
                client.method1868();
                client.field427 = client.field488.method2134();
                client.field457 = client.field414;
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 115) {
                int var293 = client.field488.method2311();
                int var294 = client.field488.method2311();
                int var295 = client.field488.method2164();
                if (var295 == 65535) {
                    var295 = -1;
                }
                class157 var296 = class157.method1871(var293);
                if (var296.field2595) {
                    var296.field2678 = var295;
                    var296.field2679 = var294;
                    class46 var298 = class46.method740(var295);
                    var296.field2611 = var298.field1027;
                    var296.field2680 = var298.field1028;
                    var296.field2613 = var298.field1033;
                    var296.field2609 = var298.field1030;
                    var296.field2610 = var298.field1011;
                    var296.field2614 = var298.field1026;
                    if (var298.field1032 == 1) {
                        var296.field2681 = 1;
                    } else {
                        var296.field2681 = 2;
                    }
                    if (var296.field2580 > 0) {
                        var296.field2614 = var296.field2614 * 32 / var296.field2580;
                    }
                    client.method1372(var296);
                } else if (var295 == -1) {
                    var296.field2657 = 0;
                    client.field305 = -1;
                    return true;
                } else {
                    class46 var297 = class46.method740(var295);
                    var296.field2657 = 4;
                    var296.field2604 = var295;
                    var296.field2611 = var297.field1027;
                    var296.field2680 = var297.field1028;
                    var296.field2614 = var297.field1026 * 100 / var294;
                    client.method1372(var296);
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 221) {
                int var299 = client.field484 + client.field488.field1861;
                int var300 = client.field488.method2282();
                int var301 = client.field488.method2282();
                if (client.field421 != var300) {
                    client.field421 = var300;
                    client.method62(client.field421);
                    class33.method1396(client.field421);
                    for (int var302 = 0; var302 < 100; var302++) {
                        client.field467[var302] = true;
                    }
                }
                while (var301-- > 0) {
                    int var303 = client.field488.method2136();
                    int var304 = client.field488.method2282();
                    int var305 = client.field488.method2199();
                    class4 var306 = (class4) client.field422.method3231((long) var303);
                    if (var306 != null && var306.field63 != var304) {
                        client.method2712(var306, true);
                        var306 = null;
                    }
                    if (var306 == null) {
                        class4 var307 = new class4();
                        var307.field63 = var304;
                        var307.field55 = var305;
                        client.field422.method3211(var307, (long) var303);
                        client.method62(var304);
                        class33.method1396(var304);
                        class157 var308 = class157.method1871(var303);
                        if (var308 != null) {
                            client.method1372(var308);
                        }
                        if (client.field425 != null) {
                            client.method1372(client.field425);
                            client.field425 = null;
                        }
                        client.method851();
                        if (client.field421 != -1) {
                            int var309 = client.field421;
                            if (class157.method764(var309)) {
                                client.method138(field2599[var309], 1);
                            }
                        }
                        var306 = var307;
                    }
                    var306.field56 = true;
                }
                for (class4 var311 = (class4) client.field422.method3210(); var311 != null; var311 = (class4) client.field422.method3214()) {
                    if (var311.field56) {
                        var311.field56 = false;
                    } else {
                        client.method2712(var311, true);
                    }
                }
                client.field346 = new class179(512);
                while (client.field488.field1861 < var299) {
                    int var312 = client.field488.method2136();
                    int var313 = client.field488.method2282();
                    int var314 = client.field488.method2282();
                    int var315 = client.field488.method2136();
                    for (int var316 = var313; var316 <= var314; var316++) {
                        long var317 = ((long) var312 << 32) + (long) var316;
                        client.field346.method3211(new class184(var315), var317);
                    }
                }
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 91) {
                client.field476 = client.field488.method2199();
                client.field477 = client.field488.method2199();
                client.field305 = -1;
                return true;
            }
            if (client.field305 == 203) {
                while (client.field488.field1861 < client.field484) {
                    int var319 = client.field488.method2199();
                    boolean var320 = (var319 & 0x1) == 1;
                    String var321 = client.field488.method2139();
                    String var322 = client.field488.method2139();
                    client.field488.method2139();
                    for (int var323 = 0; var323 < client.field434; var323++) {
                        class8 var324 = client.field518[var323];
                        if (var320) {
                            if (var322.equals(var324.field137)) {
                                var324.field137 = var321;
                                var324.field138 = var322;
                                var321 = null;
                                break;
                            }
                        } else if (var321.equals(var324.field137)) {
                            var324.field137 = var321;
                            var324.field138 = var322;
                            var321 = null;
                            break;
                        }
                    }
                    if (var321 != null && client.field434 < 400) {
                        class8 var325 = new class8();
                        client.field518[client.field434] = var325;
                        var325.field137 = var321;
                        var325.field138 = var322;
                        client.field434++;
                    }
                }
                client.field486 = client.field414;
                client.field305 = -1;
                return true;
            }
            class139.method2550("" + client.field305 + class2.field23 + client.field310 + class2.field23 + client.field311 + class2.field23 + client.field484, (Throwable) null);
            client.method2588();
        } catch (IOException var337) {
            if (client.field308 > 0) {
                client.method2588();
            } else {
                client.method590(40);
                field1065 = field303;
                field303 = null;
            }
        } catch (Exception var338) {
            String var328 = "" + client.field305 + class2.field23 + client.field310 + class2.field23 + client.field311 + class2.field23 + client.field484 + class2.field23 + (field1935 + field1358.field795[0]) + class2.field23 + (field1820 + field1358.field743[0]) + class2.field23;
            for (int var329 = 0; var329 < client.field484 && var329 < 50; var329++) {
                var328 = var328 + client.field488.field1865[var329] + class2.field23;
            }
            class139.method2550(var328, var338);
            client.method2588();
        }
        return true;
    }

    @ObfuscatedName("w.ap(IIIIIIIIIB)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) client.field270.method3251(); var10 != null; var10 = (class15) client.field270.method3261()) {
            if (var10.field226 == arg0 && var10.field216 == arg1 && var10.field217 == arg2 && var10.field215 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field226 = arg0;
            var9.field215 = arg3;
            var9.field216 = arg1;
            var9.field217 = arg2;
            client.method1965(var9);
            client.field270.method3274(var9);
        }
        var9.field221 = arg4;
        var9.field218 = arg5;
        var9.field222 = arg6;
        var9.field224 = arg7;
        var9.field214 = arg8;
    }

    @ObfuscatedName("k.bw(ILi;II)V")
    public static final void method131(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x10) != 0) {
            int var3 = client.field488.method2157();
            byte[] var4 = new byte[var3];
            class110 var5 = new class110(var4);
            client.field488.method2174(var4, 0, var3);
            client.field383[arg0] = var5;
            arg1.method13(var5);
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field764 = client.field488.method2164();
            if (arg1.field764 == 65535) {
                arg1.field764 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field761 = client.field488.method2298();
            arg1.field762 = client.field488.method2282();
        }
        if ((arg2 & 0x4) != 0) {
            int var6 = client.field488.method2282();
            int var7 = client.field488.method2156();
            arg1.method620(var6, var7, client.field266);
            arg1.field776 = client.field266 + 300;
            arg1.field758 = client.field488.method2199();
            arg1.field759 = client.field488.method2157();
        }
        if ((arg2 & 0x200) != 0) {
            int var8 = client.field488.method2298();
            int var9 = client.field488.method2261();
            arg1.method620(var8, var9, client.field266);
            arg1.field776 = client.field266 + 300;
            arg1.field758 = client.field488.method2156();
            arg1.field759 = client.field488.method2261();
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field748 = client.field488.method2139();
            if (arg1.field748.charAt(0) == '~') {
                arg1.field748 = arg1.field748.substring(1);
                class10.method2599(2, arg1.field37, arg1.field748);
            } else if (field1358 == arg1) {
                class10.method2599(2, arg1.field37, arg1.field748);
            }
            arg1.field755 = false;
            arg1.field752 = 0;
            arg1.field780 = 0;
            arg1.field751 = 150;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field756 = client.field488.method2156();
            arg1.field778 = client.field488.method2156();
            arg1.field746 = client.field488.method2261();
            arg1.field779 = client.field488.method2156();
            arg1.field735 = client.field488.method2282() + client.field266;
            arg1.field781 = client.field488.method2282() + client.field266;
            arg1.field782 = client.field488.method2199();
            arg1.field788 = 1;
            arg1.field749 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field794 = client.field488.method2163();
            int var10 = client.field488.method2171();
            arg1.field775 = var10 >> 16;
            arg1.field774 = (var10 & 0xFFFF) + client.field266;
            arg1.field772 = 0;
            arg1.field773 = 0;
            if (arg1.field774 > client.field266) {
                arg1.field772 = -1;
            }
            if (arg1.field794 == 65535) {
                arg1.field794 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var11 = client.field488.method2164();
            class142 var12 = (class142) class100.method111(class142.method488(), client.field488.method2156());
            boolean var13 = client.field488.method2261() == 1;
            int var14 = client.field488.method2199();
            int var15 = client.field488.field1861;
            if (arg1.field37 != null && arg1.field42 != null) {
                boolean var16 = false;
                if (var12.field2144 && client.method1408(arg1.field37)) {
                    var16 = true;
                }
                if (!var16 && client.field377 == 0 && !arg1.field31) {
                    client.field302.field1861 = 0;
                    client.field488.method2174(client.field302.field1865, 0, var14);
                    client.field302.field1861 = 0;
                    String var17 = class206.method3447(class213.method3407(class205.method686(client.field302)));
                    arg1.field748 = var17.trim();
                    arg1.field752 = var11 >> 8;
                    arg1.field780 = var11 & 0xFF;
                    arg1.field751 = 150;
                    arg1.field755 = var13;
                    arg1.field738 = field1358 != arg1 && var12.field2144 && client.field478 != "" && var17.toLowerCase().indexOf(client.field478) == -1;
                    int var18;
                    if (var12.field2143) {
                        var18 = var13 ? 91 : 1;
                    } else {
                        var18 = var13 ? 90 : 2;
                    }
                    if (var12.field2142 == -1) {
                        class10.method2599(var18, arg1.field37, var17);
                    } else {
                        int var20 = var12.field2142;
                        String var21 = "<img=" + var20 + ">";
                        class10.method2599(var18, var21 + arg1.field37, var17);
                    }
                }
            }
            client.field488.field1861 = var14 + var15;
        }
        if ((arg2 & 0x2) == 0) {
            return;
        }
        int var22 = client.field488.method2164();
        if (var22 == 65535) {
            var22 = -1;
        }
        int var23 = client.field488.method2199();
        client.method165(arg1, var22, var23);
    }
}
