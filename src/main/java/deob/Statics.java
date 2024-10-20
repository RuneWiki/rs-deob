package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Statics {

    @ObfuscatedName("ai.l")
    public static class149 field1000;

    @ObfuscatedName("ay.x")
    public static int field1005;

    @ObfuscatedName("ay.c")
    public static boolean field1011;

    @ObfuscatedName("ay.j")
    public static class149 field1037;

    @ObfuscatedName("ay.my")
    public static int field1050;

    @ObfuscatedName("ab.t")
    public static class141 field1054;

    @ObfuscatedName("ab.l")
    public static class149 field1055;

    @ObfuscatedName("ab.ed")
    public static class73[] field1057;

    @ObfuscatedName("ab.pb")
    public static Frame field1058;

    @ObfuscatedName("ab.y")
    public static int field1060;

    @ObfuscatedName("as.l")
    public static class48 field1064;

    @ObfuscatedName("ac.w")
    public static int field1070;

    @ObfuscatedName("ac.g")
    public static int field1086;

    @ObfuscatedName("ac.cw")
    public static int field1092;

    @ObfuscatedName("bl.pj")
    public static int field1114;

    @ObfuscatedName("bd.f")
    public static float field1138;

    @ObfuscatedName("bd.t")
    public static int field1139;

    @ObfuscatedName("bk.n")
    public static int[] field1163;

    @ObfuscatedName("bk.p")
    public static int[] field1166;

    @ObfuscatedName("f.z")
    public static String field117;

    @ObfuscatedName("bk.a")
    public static boolean[] field1173;

    @ObfuscatedName("f.cg")
    public static class132 field118;

    @ObfuscatedName("bo.v")
    public static float[] field1183;

    @ObfuscatedName("bo.x")
    public static byte[] field1189;

    @ObfuscatedName("f.fm")
    public static int field119;

    @ObfuscatedName("bo.n")
    public static int field1192;

    @ObfuscatedName("bo.z")
    public static boolean[] field1193;

    @ObfuscatedName("bo.a")
    public static class68[] field1194;

    @ObfuscatedName("bo.o")
    public static class62[] field1195;

    @ObfuscatedName("bo.b")
    public static class55[] field1196;

    @ObfuscatedName("bo.r")
    public static class63[] field1197;

    @ObfuscatedName("bo.u")
    public static int[] field1199;

    @ObfuscatedName("bo.f")
    public static int field1200;

    @ObfuscatedName("bo.q")
    public static float[] field1202;

    @ObfuscatedName("bo.p")
    public static int field1203;

    @ObfuscatedName("bo.m")
    public static float[] field1206;

    @ObfuscatedName("bo.d")
    public static float[] field1207;

    @ObfuscatedName("bo.ak")
    public static float[] field1209;

    @ObfuscatedName("bo.ah")
    public static float[] field1210;

    @ObfuscatedName("bo.an")
    public static float[] field1211;

    @ObfuscatedName("bo.aw")
    public static int[] field1212;

    @ObfuscatedName("bo.az")
    public static int[] field1213;

    @ObfuscatedName("bo.t")
    public static int field1215;

    @ObfuscatedName("bi.w")
    public static File field1246;

    @ObfuscatedName("bs.a")
    public static int[] field1261;

    @ObfuscatedName("bu.bu")
    public static int field1265;

    @ObfuscatedName("bj.x")
    public static int[] field1267;

    @ObfuscatedName("bj.y")
    public static int field1268;

    @ObfuscatedName("bj.j")
    public static int[] field1269;

    @ObfuscatedName("bj.l")
    public static int field1270;

    @ObfuscatedName("bj.w")
    public static int[] field1271;

    @ObfuscatedName("bj.c")
    public static int[] field1272;

    @ObfuscatedName("bj.f")
    public static int[] field1273;

    @ObfuscatedName("bj.nu")
    public static class50 field1275;

    @ObfuscatedName("bj.oh")
    public static short[] field1279;

    @ObfuscatedName("f.nq")
    public static int field129;

    @ObfuscatedName("bp.b")
    public static int field1299;

    @ObfuscatedName("l.ei")
    public static int[] field13;

    @ObfuscatedName("bp.o")
    public static int[] field1300;

    @ObfuscatedName("bp.r")
    public static int field1303;

    @ObfuscatedName("t.ek")
    public static class73[] field131;

    @ObfuscatedName("by.r")
    public static int[] field1328;

    @ObfuscatedName("bz.bf")
    public static FontMetrics field1334;

    @ObfuscatedName("bz.fk")
    public static int field1335;

    @ObfuscatedName("cc.nx")
    public static int field1339;

    @ObfuscatedName("t.pe")
    public static int field134;

    @ObfuscatedName("cd.ak")
    public static int field1349;

    @ObfuscatedName("t.nr")
    public static int field135;

    @ObfuscatedName("cd.s")
    public static int field1353;

    @ObfuscatedName("cd.q")
    public static int field1355;

    @ObfuscatedName("cd.e")
    public static int field1361;

    @ObfuscatedName("cd.h")
    public static int field1362;

    @ObfuscatedName("cd.an")
    public static int field1363;

    @ObfuscatedName("cd.d")
    public static int field1366;

    @ObfuscatedName("cd.ah")
    public static int field1369;

    @ObfuscatedName("cd.aw")
    public static int field1371;

    @ObfuscatedName("cd.az")
    public static int field1372;

    @ObfuscatedName("cd.i")
    public static int field1380;

    @ObfuscatedName("cd.k")
    public static int field1383;

    @ObfuscatedName("cd.v")
    public static int field1390;

    @ObfuscatedName("cd.m")
    public static int field1391;

    @ObfuscatedName("cd.be")
    public static boolean[][] field1398;

    @ObfuscatedName("cd.bd")
    public static int field1399;

    @ObfuscatedName("l.h")
    public static String field14;

    @ObfuscatedName("cd.ba")
    public static int field1400;

    @ObfuscatedName("cd.bn")
    public static int field1401;

    @ObfuscatedName("cd.bc")
    public static int field1402;

    @ObfuscatedName("cd.bk")
    public static int field1403;

    @ObfuscatedName("cd.bf")
    public static int field1404;

    @ObfuscatedName("cp.pp")
    public static int field1435;

    @ObfuscatedName("cs.l")
    public static class132 field1441;

    @ObfuscatedName("cu.h")
    public static int field1445;

    @ObfuscatedName("cu.p")
    public static int field1449;

    @ObfuscatedName("cu.a")
    public static int field1456;

    @ObfuscatedName("cu.k")
    public static int field1459;

    @ObfuscatedName("cu.v")
    public static int field1460;

    @ObfuscatedName("cu.m")
    public static int field1461;

    @ObfuscatedName("cu.d")
    public static int field1462;

    @ObfuscatedName("cu.e")
    public static int field1464;

    @ObfuscatedName("cu.ah")
    public static class86 field1465;

    @ObfuscatedName("cv.mm")
    public static byte field1471;

    @ObfuscatedName("cv.db")
    public static int[] field1478;

    @ObfuscatedName("n.kt")
    public static class155[] field149;

    @ObfuscatedName("cn.eq")
    public static class75[] field1502;

    @ObfuscatedName("ch.d")
    public static int[] field1508;

    @ObfuscatedName("ch.f")
    public static class149 field1511;

    @ObfuscatedName("ct.eb")
    public static class73[] field1552;

    @ObfuscatedName("ct.ba")
    public static class150 field1553;

    @ObfuscatedName("ct.dj")
    public static byte[][] field1556;

    @ObfuscatedName("co.e")
    public static String field1565;

    @ObfuscatedName("p.be")
    public static class150 field161;

    @ObfuscatedName("cr.cr")
    public static class205 field1649;

    @ObfuscatedName("cx.dw")
    public static int[][] field1676;

    @ObfuscatedName("l.fo")
    public static int field17;

    @ObfuscatedName("a.pc")
    public static Canvas field171;

    @ObfuscatedName("ck.bm")
    public static int field1714;

    @ObfuscatedName("a.gs")
    public static class155 field172;

    @ObfuscatedName("ck.bl")
    public static int field1730;

    @ObfuscatedName("ck.bh")
    public static int field1731;

    @ObfuscatedName("ca.w")
    public static class149 field1745;

    @ObfuscatedName("o.bl")
    public static class150 field177;

    @ObfuscatedName("cl.op")
    public static class9 field1773;

    @ObfuscatedName("cw.cd")
    public static class132 field1794;

    @ObfuscatedName("cw.t")
    public static int field1795;

    @ObfuscatedName("cj.y")
    public static long field1798;

    @ObfuscatedName("cj.c")
    public static class149 field1800;

    @ObfuscatedName("cj.l")
    public static long field1801;

    @ObfuscatedName("cj.ng")
    public static class69 field1803;

    @ObfuscatedName("cj.qv")
    public static boolean field1804;

    @ObfuscatedName("dk.ap")
    public static class75[] field1824;

    @ObfuscatedName("b.ck")
    public static int field183;

    @ObfuscatedName("dx.pw")
    public static class72 field1830;

    @ObfuscatedName("dx.kl")
    public static int field1836;

    @ObfuscatedName("dx.iw")
    public static int field1839;

    @ObfuscatedName("dn.al")
    public static class135 field1864;

    @ObfuscatedName("dn.g")
    public static int field1867;

    @ObfuscatedName("dn.x")
    public static byte[][][] field1871;

    @ObfuscatedName("df.y")
    public static class149 field1873;

    @ObfuscatedName("df.z")
    public static class108 field1877;

    @ObfuscatedName("b.ap")
    public static class150 field188;

    @ObfuscatedName("de.bd")
    public static class150 field1881;

    @ObfuscatedName("de.dn")
    public static byte[][] field1883;

    @ObfuscatedName("dr.f")
    public static byte[][][] field1885;

    @ObfuscatedName("dr.ns")
    public static int field1889;

    @ObfuscatedName("dm.ea")
    public static class73[] field1903;

    @ObfuscatedName("dm.hw")
    public static int field1904;

    @ObfuscatedName("dm.t")
    public static byte[][] field1905;

    @ObfuscatedName("dm.ay")
    public static long field1907;

    @ObfuscatedName("dc.po")
    public static int field1915;

    @ObfuscatedName("dc.o")
    public static boolean field1917;

    @ObfuscatedName("dd.p")
    public static class205 field1930;

    @ObfuscatedName("du.eg")
    public static class73[] field1931;

    @ObfuscatedName("du.y")
    public static String field1932;

    @ObfuscatedName("du.ar")
    public static class17 field1941;

    @ObfuscatedName("du.am")
    public static class135 field1942;

    @ObfuscatedName("du.l")
    public static String field1944;

    @ObfuscatedName("du.ix")
    public static int field1945;

    @ObfuscatedName("r.ip")
    public static class155 field196;

    @ObfuscatedName("da.g")
    public static boolean[] field1971;

    @ObfuscatedName("dh.b")
    public static class208[] field1973;

    @ObfuscatedName("dh.ej")
    public static class73 field1979;

    @ObfuscatedName("r.at")
    public static class75[] field198;

    @ObfuscatedName("dh.k")
    public static String field1981;

    @ObfuscatedName("dh.bk")
    public static class150 field1982;

    @ObfuscatedName("dh.bc")
    public static class150 field1983;

    @ObfuscatedName("di.ax")
    public static boolean field1985;

    @ObfuscatedName("di.ar")
    public static class150 field1986;

    @ObfuscatedName("ds.nz")
    public static int field2006;

    @ObfuscatedName("do.ao")
    public static String field2014;

    @ObfuscatedName("ev.p")
    public static class142 field2015;

    @ObfuscatedName("ev.cb")
    public static int field2016;

    @ObfuscatedName("ev.j")
    public static class149 field2018;

    @ObfuscatedName("r.em")
    public static class73[] field202;

    @ObfuscatedName("en.ex")
    public static int[] field2031;

    @ObfuscatedName("r.od")
    public static int field205;

    @ObfuscatedName("em.l")
    public static Applet field2059;

    @ObfuscatedName("em.g")
    public static int field2061;

    @ObfuscatedName("em.nb")
    public static int field2064;

    @ObfuscatedName("em.mf")
    public static class22[] field2065;

    @ObfuscatedName("em.d")
    public static int[] field2066;

    @ObfuscatedName("em.y")
    public static String field2068;

    @ObfuscatedName("r.bv")
    public static class150 field207;

    @ObfuscatedName("eg.j")
    public static File field2071;

    @ObfuscatedName("eg.c")
    public static int field2072;

    @ObfuscatedName("eg.z")
    public static String[] field2077;

    @ObfuscatedName("ec.cn")
    public static int field2083;

    @ObfuscatedName("ec.ec")
    public static class73[] field2087;

    @ObfuscatedName("ec.nn")
    public static int field2088;

    @ObfuscatedName("ea.os")
    public static class148 field2099;

    @ObfuscatedName("z.dx")
    public static int[] field210;

    @ObfuscatedName("ea.nc")
    public static class51 field2101;

    @ObfuscatedName("ek.t")
    public static short[] field2111;

    @ObfuscatedName("ek.ol")
    public static int field2113;

    @ObfuscatedName("eb.cc")
    public static class135 field2124;

    @ObfuscatedName("ez.a")
    public static class155 field2136;

    @ObfuscatedName("z.hg")
    public static class3 field216;

    @ObfuscatedName("z.bs")
    public static String field218;

    @ObfuscatedName("z.iz")
    public static int field221;

    @ObfuscatedName("client.a")
    public static class193 field237;

    @ObfuscatedName("et.u")
    public static String[] field2394;

    @ObfuscatedName("et.x")
    public static class75 field2401;

    @ObfuscatedName("eh.hy")
    public static int field2484;

    @ObfuscatedName("el.g")
    public static long field2486;

    @ObfuscatedName("er.io")
    public static int field2510;

    @ObfuscatedName("er.oc")
    public static class202 field2513;

    @ObfuscatedName("er.df")
    public static class80 field2514;

    @ObfuscatedName("eu.w")
    public static class149 field2518;

    @ObfuscatedName("eu.l")
    public static class155[][] field2552;

    @ObfuscatedName("eu.gr")
    public static class155 field2614;

    @ObfuscatedName("ep.fv")
    public static int field2652;

    @ObfuscatedName("fm.w")
    public static class73 field2661;

    @ObfuscatedName("fv.x")
    public static short[] field2670;

    @ObfuscatedName("fv.n")
    public static short[][] field2671;

    @ObfuscatedName("fo.hd")
    public static int field2678;

    @ObfuscatedName("y.kn")
    public static int field27;

    @ObfuscatedName("ft.f")
    public static int field2702;

    @ObfuscatedName("ft.g")
    public static class149 field2703;

    @ObfuscatedName("ft.j")
    public static class165 field2704;

    @ObfuscatedName("ft.o")
    public static int[] field2705;

    @ObfuscatedName("ft.c")
    public static class149 field2706;

    @ObfuscatedName("ft.p")
    public static boolean field2707;

    @ObfuscatedName("ft.n")
    public static int field2708;

    @ObfuscatedName("ft.l")
    public static class149 field2709;

    @ObfuscatedName("ft.a")
    public static class161 field2710;

    @ObfuscatedName("ft.aj")
    public static class132 field2711;

    @ObfuscatedName("ft.y")
    public static class149 field2713;

    @ObfuscatedName("ft.ab")
    public static class150 field2714;

    @ObfuscatedName("client.bj")
    public static int field272;

    @ObfuscatedName("fu.q")
    public static int[] field2761;

    @ObfuscatedName("fz.as")
    public static class150 field2783;

    @ObfuscatedName("fz.h")
    public static class12 field2788;

    @ObfuscatedName("fy.oy")
    public static long field2801;

    @ObfuscatedName("fy.dl")
    public static int[] field2807;

    @ObfuscatedName("fy.ie")
    public static int field2815;

    @ObfuscatedName("fj.g")
    public static class75 field2818;

    @ObfuscatedName("fj.t")
    public static int[][] field2820;

    @ObfuscatedName("fb.at")
    public static class150 field2836;

    @ObfuscatedName("fs.ew")
    public static int[] field2842;

    @ObfuscatedName("gf.c")
    public static class67 field2890;

    @ObfuscatedName("ge.e")
    public static class108 field2899;

    @ObfuscatedName("y.jc")
    public static int field29;

    @ObfuscatedName("gs.j")
    public static boolean field2900;

    @ObfuscatedName("gs.t")
    public static class75 field2902;

    @ObfuscatedName("gq.g")
    public static client field2913;

    @ObfuscatedName("gr.ko")
    public static int field2923;

    @ObfuscatedName("gr.i")
    public static int[] field2929;

    @ObfuscatedName("gn.pi")
    public static int field2932;

    @ObfuscatedName("gd.y")
    public static File field2934;

    @ObfuscatedName("gz.bb")
    public static int field2945;

    @ObfuscatedName("gz.f")
    public static short[][] field2950;

    @ObfuscatedName("gw.l")
    public static class103 field2951;

    @ObfuscatedName("gu.n")
    public static class75[] field2972;

    @ObfuscatedName("gh.fy")
    public static int field2981;

    @ObfuscatedName("hv.e")
    public static int[] field3013;

    @ObfuscatedName("client.ey")
    public static class73 field312;

    @ObfuscatedName("client.kx")
    public static class120 field436;

    @ObfuscatedName("client.cq")
    public static class205 field499;

    @ObfuscatedName("s.es")
    public static class75[] field508;

    @ObfuscatedName("i.m")
    public static int[] field521;

    @ObfuscatedName("i.ox")
    public static class123 field525;

    @ObfuscatedName("e.fj")
    public static int field534;

    @ObfuscatedName("g.id")
    public static class155 field54;

    @ObfuscatedName("k.r")
    public static int field561;

    @ObfuscatedName("k.b")
    public static class154 field564;

    @ObfuscatedName("k.bm")
    public static class150 field565;

    @ObfuscatedName("v.no")
    public static int field576;

    @ObfuscatedName("j.cm")
    public static class205 field58;

    @ObfuscatedName("m.o")
    public static class54 field582;

    @ObfuscatedName("m.mw")
    public static byte field596;

    @ObfuscatedName("d.av")
    public static int field600;

    @ObfuscatedName("d.f")
    public static class75[] field601;

    @ObfuscatedName("d.p")
    public static int[] field602;

    @ObfuscatedName("q.ac")
    public static class150 field608;

    @ObfuscatedName("j.bn")
    public static class150 field61;

    @ObfuscatedName("ak.eo")
    public static int[] field618;

    @ObfuscatedName("ak.iy")
    public static int field624;

    @ObfuscatedName("ah.n")
    public static class75 field627;

    @ObfuscatedName("an.s")
    public static int[] field636;

    @ObfuscatedName("an.y")
    public static class75 field637;

    @ObfuscatedName("w.bm")
    public static class75 field64;

    @ObfuscatedName("an.j")
    public static class75[] field658;

    @ObfuscatedName("an.l")
    public static boolean field659;

    @ObfuscatedName("an.c")
    public static class73 field663;

    @ObfuscatedName("an.u")
    public static int[] field667;

    @ObfuscatedName("an.as")
    public static class73[] field672;

    @ObfuscatedName("aw.fq")
    public static int field677;

    @ObfuscatedName("aw.mb")
    public static class73 field679;

    @ObfuscatedName("aw.ef")
    public static class75[] field683;

    @ObfuscatedName("az.x")
    public static int field688;

    @ObfuscatedName("w.ne")
    public static class51 field69;

    @ObfuscatedName("ad.pz")
    public static class122 field697;

    @ObfuscatedName("ad.nj")
    public static int field698;

    @ObfuscatedName("ag.g")
    public static int[] field701;

    @ObfuscatedName("ag.p")
    public static class155 field705;

    @ObfuscatedName("ag.v")
    public static int[] field711;

    @ObfuscatedName("ag.j")
    public static String[] field714;

    @ObfuscatedName("ag.bh")
    public static class150 field717;

    @ObfuscatedName("c.j")
    public static byte[][][] field73;

    @ObfuscatedName("c.w")
    public static byte[][][] field74;

    @ObfuscatedName("c.c")
    public static byte[][][] field75;

    @ObfuscatedName("aa.if")
    public static class28 field764;

    @ObfuscatedName("c.n")
    public static int[] field77;

    @ObfuscatedName("aa.ca")
    public static int field780;

    @ObfuscatedName("aq.y")
    public static class149 field789;

    @ObfuscatedName("aq.l")
    public static class149 field796;

    @ObfuscatedName("aq.dm")
    public static int field824;

    @ObfuscatedName("aq.ly")
    public static class119 field826;

    @ObfuscatedName("am.y")
    public static class149 field830;

    @ObfuscatedName("am.g")
    public static class149 field849;

    @ObfuscatedName("c.pk")
    public static Image field86;

    @ObfuscatedName("c.et")
    public static class75 field87;

    @ObfuscatedName("ax.ez")
    public static class73[] field890;

    @ObfuscatedName("ax.l")
    public static class149 field896;

    @ObfuscatedName("af.g")
    public static class149 field899;

    @ObfuscatedName("l.r")
    public static int[][][] field9;

    @ObfuscatedName("af.ac")
    public static class75[] field901;

    @ObfuscatedName("af.y")
    public static class149 field910;

    @ObfuscatedName("af.l")
    public static class149 field918;

    @ObfuscatedName("av.l")
    public static class149 field919;

    @ObfuscatedName("av.ga")
    public static class155 field926;

    @ObfuscatedName("av.dg")
    public static int field934;

    @ObfuscatedName("av.oj")
    public static Clipboard field935;

    @ObfuscatedName("av.ot")
    public static class125 field938;

    @ObfuscatedName("ao.y")
    public static class149 field942;

    @ObfuscatedName("ao.l")
    public static class149 field949;

    @ObfuscatedName("ao.g")
    public static int field951;

    @ObfuscatedName("al.l")
    public static class149 field971;

    @ObfuscatedName("aj.ph")
    public static String field975;

    @ObfuscatedName("aj.l")
    public static class149 field977;

    @ObfuscatedName("aj.nt")
    public static int field980;

    @ObfuscatedName("ae.pu")
    public static Font field983;

    @ObfuscatedName("ae.l")
    public static class149 field992;

    @ObfuscatedName("ae.b")
    public static int[] field994;

    @ObfuscatedName("ai.bh")
    public static class23[] field996;

    @ObfuscatedName("ai.cf")
    public static char field999;

    @ObfuscatedName("da.l(Leo;IB)Lfo;")
    public static class162 method2524(class149 arg0, int arg1) {
        byte[] var2 = arg0.method2781(arg1);
        return var2 == null ? null : new class162(var2);
    }

    @ObfuscatedName("fm.g(Ldb;I)V")
    public static void method2968(class111 arg0) {
        class191 var1 = (class191) class192.field2901.method3331();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1823;
        arg0.method2150(var1.field2892);
        for (int var3 = 0; var3 < var1.field2891; var3++) {
            if (var1.field2894[var3] == 0) {
                try {
                    int var4 = var1.field2893[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2896[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2226(0);
                        arg0.method2150(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2896[var3];
                        var7.setInt((Object) null, var1.field2895[var3]);
                        arg0.method2226(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2896[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2226(0);
                        arg0.method2150(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2897[var3];
                        byte[][] var11 = var1.field2898[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2226(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2226(1);
                            arg0.method2151(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2226(2);
                            arg0.method2152((String) var15);
                        } else {
                            arg0.method2226(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2897[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2226(0);
                        arg0.method2150(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2226(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2226(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2226(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2226(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2226(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2226(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2226(-16);
                } catch (SecurityException var37) {
                    arg0.method2226(-17);
                } catch (IOException var38) {
                    arg0.method2226(-18);
                } catch (NullPointerException var39) {
                    arg0.method2226(-19);
                } catch (Exception var40) {
                    arg0.method2226(-20);
                } catch (Throwable var41) {
                    arg0.method2226(-21);
                }
            } else {
                arg0.method2226(var1.field2894[var3]);
            }
        }
        arg0.method2178(var2);
        var1.method3375();
    }

    @ObfuscatedName("v.y(II)Lav;")
    public static class40 method503(int arg0) {
        class40 var1 = (class40) class40.field925.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field919.method2752(13, arg0);
        class40 var3 = new class40();
        var3.field922 = arg0;
        if (var2 != null) {
            var3.method761(new class108(var2));
        }
        class40.field925.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("cw.y(CS)C")
    public static char method2091(char arg0) {
        return arg0 == 181 || arg0 == 402 ? arg0 : Character.toTitleCase(arg0);
    }

    @ObfuscatedName("dv.y(Len;ZI)V")
    public static void method2103(class132 arg0, boolean arg1) {
        if (field1441 != null) {
            try {
                field1441.method2599();
            } catch (Exception var10) {
            }
            field1441 = null;
        }
        field1441 = arg0;
        class153.method795(arg1);
        class153.field2496.field1823 = 0;
        field564 = null;
        field1877 = null;
        class153.field2495 = 0;
        while (true) {
            class154 var3 = (class154) class153.field2489.method3257();
            if (var3 == null) {
                while (true) {
                    class154 var4 = (class154) class153.field2494.method3257();
                    if (var4 == null) {
                        if (class153.field2487 != 0) {
                            try {
                                class108 var5 = new class108(4);
                                var5.method2226(4);
                                var5.method2226(class153.field2487);
                                var5.method2148(0);
                                field1441.method2593(var5.field1828, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    field1441.method2599();
                                } catch (Exception var8) {
                                }
                                class153.field2500++;
                                field1441 = null;
                            }
                        }
                        class153.field2497 = 0;
                        field2486 = class104.method2616();
                        return;
                    }
                    class153.field2491.method3336(var4);
                    class153.field2488.method3260(var4, var4.field2886);
                    class153.field2493++;
                    class153.field2502--;
                }
            }
            class153.field2485.method3260(var3, var3.field2886);
            class153.field2492++;
            class153.field2490--;
        }
    }

    @ObfuscatedName("ak.x(Leo;Leo;Ljava/lang/String;Ljava/lang/String;I)Lgx;")
    public static class205 method532(class149 arg0, class149 arg1, String arg2, String arg3) {
        int var4 = arg0.method2764(arg2);
        int var5 = arg0.method2765(var4, arg3);
        return class71.method1610(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("dw.t(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2406(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = method2091(var5);
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

    @ObfuscatedName("e.t(I)V")
    public static void method475() {
        class41.field943.method3214();
    }

    @ObfuscatedName("client.j(Lee;I)V")
    public static void method169(class133 arg0) {
        if (class29.field639) {
            class29.method144(arg0);
            return;
        }
        if ((class129.field2002 == 1 || !field1985 && class129.field2002 == 4) && class129.field1996 >= 715 && class129.field2004 >= 453) {
            field1773.field133 = !field1773.field133;
            class9.method690();
            if (field1773.field133) {
                class164.method1385();
            } else {
                class150 var1 = field565;
                int var2 = var1.method2764("scape main");
                int var3 = var1.method2765(var2, "");
                class164.method2101(var1, var2, var3, 255, false);
            }
        }
        if (client.field483 == 5) {
            return;
        }
        class29.field648++;
        if (client.field483 != 10 && client.field483 != 11) {
            return;
        }
        if (client.field497 == 0) {
            if (class129.field2002 == 1 || !field1985 && class129.field2002 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class129.field1996 >= var4 && class129.field1996 <= var4 + var6 && class129.field2004 >= var5 && class129.field2004 <= var5 + var7) {
                    class29.method2520();
                    return;
                }
            }
            if (field1941 != null) {
                class29.method2520();
            }
        }
        int var8 = class129.field2002;
        int var9 = class129.field1996;
        int var10 = class129.field2004;
        if (!field1985 && var8 == 4) {
            var8 = 1;
        }
        if (class29.field660 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class127.method2444(client.method4("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field461 & 0x4) != 0) {
                    if ((client.field461 & 0x400) == 0) {
                        class29.field653 = class145.field2269;
                        class29.field654 = class145.field2353;
                        class29.field655 = class145.field2150;
                    } else {
                        class29.field653 = class145.field2358;
                        class29.field654 = class145.field2350;
                        class29.field655 = class145.field2176;
                    }
                    class29.field660 = 1;
                    class29.field649 = 0;
                } else if ((client.field461 & 0x400) == 0) {
                    class29.field653 = class145.field2223;
                    class29.field654 = class145.field2349;
                    class29.field655 = class145.field2137;
                    class29.field660 = 2;
                    class29.field649 = 0;
                } else {
                    class29.field653 = class145.field2376;
                    class29.field654 = class145.field2356;
                    class29.field655 = class145.field2357;
                    class29.field660 = 1;
                    class29.field649 = 0;
                }
            }
        } else if (class29.field660 == 1) {
            while (class126.method619()) {
                if (field2083 == 84) {
                    class29.field653 = class145.field2223;
                    class29.field654 = class145.field2349;
                    class29.field655 = class145.field2137;
                    class29.field660 = 2;
                    class29.field649 = 0;
                } else if (field2083 == 13) {
                    class29.field660 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                class29.field653 = class145.field2223;
                class29.field654 = class145.field2349;
                class29.field655 = class145.field2137;
                class29.field660 = 2;
                class29.field649 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                class29.field660 = 0;
            }
        } else if (class29.field660 == 2) {
            short var17 = 231;
            int var28 = var17 + 30;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                class29.field649 = 0;
            }
            var28 += 15;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                class29.field649 = 1;
            }
            var28 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                class29.field656 = class29.field656.trim();
                if (class29.field656.length() == 0) {
                    class29.method599(class145.field2230, class145.field2255, class145.field2188);
                    return;
                }
                if (class29.field671.length() == 0) {
                    class29.method599(class145.field2186, class145.field2258, class145.field2259);
                    return;
                }
                class29.method599(class145.field2363, class145.field2364, class145.field2365);
                class29.field638 = field1773.field138.containsKey(class211.method709(class29.field656)) ? class147.field2395 : class147.field2396;
                method2388(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                class29.field660 = 0;
                class29.field656 = "";
                class29.field671 = "";
                field600 = 0;
                field2014 = "";
                class29.field641 = true;
            }
            while (true) {
                while (class126.method619()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < class29.field661.length(); var22++) {
                        if (field999 == class29.field661.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (field2083 == 13) {
                        class29.field660 = 0;
                        class29.field656 = "";
                        class29.field671 = "";
                        field600 = 0;
                        field2014 = "";
                        class29.field641 = true;
                    } else if (class29.field649 == 0) {
                        if (field2083 == 85 && class29.field656.length() > 0) {
                            class29.field656 = class29.field656.substring(0, class29.field656.length() - 1);
                        }
                        if (field2083 == 84 || field2083 == 80) {
                            class29.field649 = 1;
                        }
                        if (var21 && class29.field656.length() < 320) {
                            class29.field656 = class29.field656 + field999;
                        }
                    } else if (class29.field649 == 1) {
                        if (field2083 == 85 && class29.field671.length() > 0) {
                            class29.field671 = class29.field671.substring(0, class29.field671.length() - 1);
                        }
                        if (field2083 == 84 || field2083 == 80) {
                            class29.field649 = 0;
                        }
                        if (field2083 == 84) {
                            class29.field656 = class29.field656.trim();
                            if (class29.field656.length() == 0) {
                                class29.method599(class145.field2230, class145.field2255, class145.field2188);
                                return;
                            }
                            if (class29.field671.length() == 0) {
                                class29.method599(class145.field2186, class145.field2258, class145.field2259);
                                return;
                            }
                            class29.method599(class145.field2363, class145.field2364, class145.field2365);
                            class29.field638 = field1773.field138.containsKey(class211.method709(class29.field656)) ? class147.field2395 : class147.field2396;
                            method2388(20);
                            return;
                        }
                        if (var21 && class29.field671.length() < 20) {
                            class29.field671 = class29.field671 + field999;
                        }
                    }
                }
                return;
            }
        } else if (class29.field660 == 4) {
            short var23 = 302;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field2014.trim();
                if (field2014.length() != 6) {
                    class29.method599(class145.field2170, class145.field2348, class145.field2172);
                    return;
                }
                field600 = Integer.parseInt(field2014);
                field2014 = "";
                class29.field638 = class29.field641 ? class147.field2400 : class147.field2397;
                class29.method599(class145.field2363, class145.field2364, class145.field2365);
                method2388(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                class29.field641 = !class29.field641;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                class127.method2444(client.method4("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var25 = 462;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                class29.field660 = 0;
                class29.field656 = "";
                class29.field671 = "";
                field600 = 0;
                field2014 = "";
            }
            while (class126.method619()) {
                boolean var26 = false;
                for (int var27 = 0; var27 < class29.field662.length(); var27++) {
                    if (field999 == class29.field662.charAt(var27)) {
                        var26 = true;
                        break;
                    }
                }
                if (field2083 == 13) {
                    class29.field660 = 0;
                    class29.field656 = "";
                    class29.field671 = "";
                    field600 = 0;
                    field2014 = "";
                } else {
                    if (field2083 == 85 && field2014.length() > 0) {
                        field2014 = field2014.substring(0, field2014.length() - 1);
                    }
                    if (field2083 == 84) {
                        field2014.trim();
                        if (field2014.length() != 6) {
                            class29.method599(class145.field2170, class145.field2348, class145.field2172);
                            return;
                        }
                        field600 = Integer.parseInt(field2014);
                        field2014 = "";
                        class29.field638 = class29.field641 ? class147.field2400 : class147.field2397;
                        class29.method599(class145.field2363, class145.field2364, class145.field2365);
                        method2388(20);
                        return;
                    }
                    if (var26 && field2014.length() < 6) {
                        field2014 = field2014 + field999;
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.w(Lgx;Lgx;B)V")
    public static void method621(class205 arg0, class205 arg1) {
        if (class29.field639) {
            if (field672 == null) {
                field672 = class71.method817(field717, "sl_back", "");
            }
            if (field198 == null) {
                field198 = class71.method836(field717, "sl_flags", "");
            }
            if (field901 == null) {
                field901 = class71.method836(field717, "sl_arrows", "");
            }
            if (field1824 == null) {
                field1824 = class71.method836(field717, "sl_stars", "");
            }
            class74.method1546(0, 23, 765, 480, 0);
            class74.method1536(0, 0, 125, 23, 12425273, 9135624);
            class74.method1536(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3507(class145.field2374, 62, 15, 0, -1);
            if (field1824 != null) {
                field1824[1].method1588(140, 1);
                arg1.method3505(class145.field2346, 152, 10, 16777215, -1);
                field1824[0].method1588(140, 12);
                arg1.method3505(class145.field2292, 152, 21, 16777215, -1);
            }
            if (field901 != null) {
                short var2 = 280;
                if (class29.field665[0] == 0 && class29.field666[0] == 0) {
                    field901[2].method1588(var2, 4);
                } else {
                    field901[0].method1588(var2, 4);
                }
                if (class29.field665[0] == 0 && class29.field666[0] == 1) {
                    field901[3].method1588(var2 + 15, 4);
                } else {
                    field901[1].method1588(var2 + 15, 4);
                }
                arg0.method3505(class145.field2377, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (class29.field665[0] == 1 && class29.field666[0] == 0) {
                    field901[2].method1588(var3, 4);
                } else {
                    field901[0].method1588(var3, 4);
                }
                if (class29.field665[0] == 1 && class29.field666[0] == 1) {
                    field901[3].method1588(var3 + 15, 4);
                } else {
                    field901[1].method1588(var3 + 15, 4);
                }
                arg0.method3505(class145.field2378, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (class29.field665[0] == 2 && class29.field666[0] == 0) {
                    field901[2].method1588(var4, 4);
                } else {
                    field901[0].method1588(var4, 4);
                }
                if (class29.field665[0] == 2 && class29.field666[0] == 1) {
                    field901[3].method1588(var4 + 15, 4);
                } else {
                    field901[1].method1588(var4 + 15, 4);
                }
                arg0.method3505(class145.field2379, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (class29.field665[0] == 3 && class29.field666[0] == 0) {
                    field901[2].method1588(var5, 4);
                } else {
                    field901[0].method1588(var5, 4);
                }
                if (class29.field665[0] == 3 && class29.field666[0] == 1) {
                    field901[3].method1588(var5 + 15, 4);
                } else {
                    field901[1].method1588(var5 + 15, 4);
                }
                arg0.method3505(class145.field2344, var5 + 32, 17, 16777215, -1);
            }
            class74.method1546(708, 4, 50, 16, 0);
            arg1.method3507(class145.field2261, 733, 16, 16777215, -1);
            class29.field643 = -1;
            if (field672 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= class29.field652) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= class29.field652) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= class29.field652) {
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
                for (int var20 = 0; var20 < class29.field652; var20++) {
                    class23 var21 = field996[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field569);
                    if (var21.field569 == -1) {
                        var23 = class145.field2263;
                        var22 = false;
                    } else if (var21.field569 > 1980) {
                        var23 = class145.field2372;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method500()) {
                        if (var21.method499()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method499()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class129.field1990 >= var17 && class129.field1997 >= var16 && class129.field1990 < var6 + var17 && class129.field1997 < var7 + var16 && var22) {
                        class29.field643 = var20;
                        field672[var24].method1446(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        field672[var24].method1512(var17, var16);
                    }
                    if (field198 != null) {
                        field198[(var21.method499() ? 8 : 0) + var21.field572].method1588(var17 + 29, var16);
                    }
                    arg0.method3507(Integer.toString(var21.field581), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3507(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3500(field996[class29.field643].field571) + 6;
                    int var26 = arg1.field2952 + 8;
                    class74.method1546(class129.field1990 - var25 / 2, class129.field1997 + 20 + 5, var25, var26, 16777120);
                    class74.method1537(class129.field1990 - var25 / 2, class129.field1997 + 20 + 5, var25, var26, 0);
                    arg1.method3507(field996[class29.field643].field571, class129.field1990, class129.field1997 + 20 + 5 + arg1.field2952 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = field171.getGraphics();
                field1830.method1379(var27, 0, 0);
            } catch (Exception var88) {
                field171.repaint();
            }
            return;
        }
        if (client.field483 == 0 || client.field483 == 5) {
            byte var29 = 20;
            arg0.method3507(class145.field2347, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class74.method1537(230, var30, 304, 34, 9179409);
            class74.method1537(231, var30 + 1, 302, 32, 0);
            class74.method1546(232, var30 + 2, class29.field650 * 3, 30, 9179409);
            class74.method1546(class29.field650 * 3 + 232, var30 + 2, 300 - class29.field650 * 3, 30, 0);
            arg0.method3507(class29.field651, 382, 276 - var29, 16777215, -1);
        }
        if (client.field483 == 20) {
            field637.method1588(382 - field637.field1308 / 2, 271 - field637.field1307 / 2);
            short var31 = 211;
            arg0.method3507(class29.field653, 382, var31, 16776960, 0);
            int var90 = var31 + 15;
            arg0.method3507(class29.field654, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            arg0.method3507(class29.field655, 382, var91, 16776960, 0);
            int var92 = var91 + 15;
            int var93 = var92 + 10;
            if (class29.field660 != 4) {
                arg0.method3505(class145.field2366, 272, var93, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = class29.field656; arg0.method3500(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3505(class204.method3578(var33), 312, var93, 16777215, 0);
                var90 = var93 + 15;
                arg0.method3505(class145.field2367 + class211.method97(class29.field671), 274, var90, 16777215, 0);
                var90 += 15;
            }
        }
        if (client.field483 == 10 || client.field483 == 11) {
            field637.method1588(202, 171);
            if (class29.field660 == 0) {
                short var34 = 251;
                arg0.method3507(class145.field2204, 382, var34, 16776960, 0);
                int var94 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                field2818.method1588(var35 - 73, var36 - 20);
                arg0.method3510(class145.field2299, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                field2818.method1588(var37 - 73, var36 - 20);
                arg0.method3510(class145.field2371, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class29.field660 == 1) {
                arg0.method3507(class145.field2247, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3507(class29.field653, 382, var38, 16777215, 0);
                int var95 = var38 + 15;
                arg0.method3507(class29.field654, 382, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3507(class29.field655, 382, var96, 16777215, 0);
                int var97 = var96 + 15;
                short var39 = 302;
                short var40 = 321;
                field2818.method1588(var39 - 73, var40 - 20);
                arg0.method3507(class145.field2143, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                field2818.method1588(var41 - 73, var40 - 20);
                arg0.method3507(class145.field2261, var41, var40 + 5, 16777215, 0);
            } else if (class29.field660 == 2) {
                short var42 = 211;
                arg0.method3507(class29.field653, 382, var42, 16776960, 0);
                int var98 = var42 + 15;
                arg0.method3507(class29.field654, 382, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg0.method3507(class29.field655, 382, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var101 = var100 + 10;
                arg0.method3505(class145.field2366, 272, var101, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = class29.field656; arg0.method3500(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3505(class204.method3578(var44) + (class29.field649 == 0 & client.field246 % 40 < 20 ? class2.method460(16776960) + class2.field22 : ""), 312, var101, 16777215, 0);
                var98 = var101 + 15;
                arg0.method3505(class145.field2367 + class211.method97(class29.field671) + (class29.field649 == 1 & client.field246 % 40 < 20 ? class2.method460(16776960) + class2.field22 : ""), 274, var98, 16777215, 0);
                var98 += 15;
                short var45 = 302;
                short var46 = 321;
                field2818.method1588(var45 - 73, var46 - 20);
                arg0.method3507(class145.field2300, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                field2818.method1588(var47 - 73, var46 - 20);
                arg0.method3507(class145.field2261, var47, var46 + 5, 16777215, 0);
            } else if (class29.field660 == 4) {
                arg0.method3507(class145.field2361, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3507(class29.field653, 382, var48, 16777215, 0);
                int var102 = var48 + 15;
                arg0.method3507(class29.field654, 382, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method3507(class29.field655, 382, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3505(class145.field2368 + class211.method97(field2014) + (client.field246 % 40 < 20 ? class2.method460(16776960) + class2.field22 : ""), 274, var104, 16777215, 0);
                int var105 = var104 - 8;
                arg0.method3505(class145.field2144, 373, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method3505(class145.field2145, 373, var106, 16776960, 0);
                int var49 = 373 + arg0.method3500(class145.field2145) + 15;
                int var50 = var106 - arg0.field2952;
                class75 var51;
                if (class29.field641) {
                    var51 = field627;
                } else {
                    var51 = field2902;
                }
                var51.method1588(var49, var50);
                var102 = var106 + 15;
                short var52 = 302;
                short var53 = 321;
                field2818.method1588(var52 - 73, var53 - 20);
                arg0.method3507(class145.field2143, var52, var53 + 5, 16777215, 0);
                short var54 = 462;
                field2818.method1588(var54 - 73, var53 - 20);
                arg0.method3507(class145.field2261, var54, var53 + 5, 16777215, 0);
                arg1.method3507(class145.field2362, 382, var53 + 36, 255, 0);
            }
        }
        if (class29.field648 > 0) {
            class29.method138(class29.field648);
            class29.field648 = 0;
        }
        short var55 = 256;
        if (class29.field644 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (class29.field644 > 768) {
                    field667[var56] = class29.method139(field636[var56], field2929[var56], 1024 - class29.field644);
                } else if (class29.field644 > 256) {
                    field667[var56] = field2929[var56];
                } else {
                    field667[var56] = class29.method139(field2929[var56], field636[var56], 256 - class29.field644);
                }
            }
        } else if (class29.field645 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (class29.field645 > 768) {
                    field667[var57] = class29.method139(field636[var57], field3013[var57], 1024 - class29.field645);
                } else if (class29.field645 > 256) {
                    field667[var57] = field3013[var57];
                } else {
                    field667[var57] = class29.method139(field3013[var57], field636[var57], 256 - class29.field645);
                }
            }
        } else {
            for (int var58 = 0; var58 < 256; var58++) {
                field667[var58] = field636[var58];
            }
        }
        class74.method1529(0, 9, 128, var55 + 7);
        field2661.method1512(0, 0);
        class74.method1528();
        int var59 = 0;
        int var60 = 6885;
        for (int var61 = 1; var61 < var55 - 1; var61++) {
            int var62 = (var55 - var61) * class29.field642[var61] / var55;
            int var63 = var62 + 22;
            if (var63 < 0) {
                var63 = 0;
            }
            var59 += var63;
            for (int var64 = var63; var64 < 128; var64++) {
                int var65 = field2066[var59++];
                if (var65 == 0) {
                    var60++;
                } else {
                    int var67 = 256 - var65;
                    int var68 = field667[var65];
                    int var69 = field1830.field1281[var60];
                    field1830.field1281[var60++] = ((var68 & 0xFF00FF) * var65 + (var69 & 0xFF00FF) * var67 & 0xFF00FF00) + ((var68 & 0xFF00) * var65 + (var69 & 0xFF00) * var67 & 0xFF0000) >> 8;
                }
            }
            var60 += var63 + 765 - 128;
        }
        class74.method1529(637, 9, 765, var55 + 7);
        field663.method1512(382, 0);
        class74.method1528();
        int var70 = 0;
        int var71 = 7546;
        for (int var72 = 1; var72 < var55 - 1; var72++) {
            int var73 = (var55 - var72) * class29.field642[var72] / var55;
            int var74 = 103 - var73;
            int var75 = var71 + var73;
            for (int var76 = 0; var76 < var74; var76++) {
                int var77 = field2066[var70++];
                if (var77 == 0) {
                    var75++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = field667[var77];
                    int var81 = field1830.field1281[var75];
                    field1830.field1281[var75++] = ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) + ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) >> 8;
                }
            }
            var70 += 128 - var74;
            var71 = 765 - var74 - var73 + var75;
        }
        field601[field1773.field133 ? 1 : 0].method1588(725, 463);
        if (client.field483 > 5 && client.field497 == 0) {
            if (field64 == null) {
                field64 = class71.method2082(field717, "sl_button", "");
            } else {
                byte var82 = 5;
                short var83 = 463;
                byte var84 = 100;
                byte var85 = 35;
                field64.method1588(var82, var83);
                arg0.method3507(class145.field2210 + " " + client.field480, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
                if (field1941 == null) {
                    arg1.method3507(class145.field2381, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                } else {
                    arg1.method3507(class145.field2383, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var86 = field171.getGraphics();
            field1830.method1379(var86, 0, 0);
        } catch (Exception var89) {
            field171.repaint();
        }
    }

    @ObfuscatedName("db.n(IS)V")
    public static void method2388(int arg0) {
        if (client.field483 == arg0) {
            return;
        }
        if (client.field483 == 0) {
            field86 = null;
            field983 = null;
            field1334 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            client.field248 = 0;
            client.field402 = 0;
            client.field374 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && field118 != null) {
            field118.method2599();
            field118 = null;
        }
        if (client.field483 == 25) {
            client.field268 = 0;
            client.field470 = 0;
            client.field397 = 1;
            client.field282 = 0;
            client.field293 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method96(field171, field161, field717, true, 0);
        } else if (arg0 == 20) {
            class29.method96(field171, field161, field717, true, client.field483 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method96(field171, field161, field717, false, 4);
        } else {
            class29.method1890();
        }
        client.field483 = arg0;
    }

    @ObfuscatedName("em.s(I)V")
    public static void method2696() {
        client.field261.field1823 = 0;
        client.field278.field1823 = 0;
        client.field410 = -1;
        client.field301 = -1;
        client.field285 = -1;
        client.field286 = -1;
        client.field279 = 0;
        client.field281 = 0;
        client.field253 = 0;
        client.field379 = 0;
        client.field378 = false;
        client.field471 = 0;
        client.field469 = 0;
        for (int var0 = 0; var0 < client.field355.length; var0++) {
            if (client.field355[var0] != null) {
                client.field355[var0].field744 = -1;
            }
        }
        for (int var1 = 0; var1 < client.field273.length; var1++) {
            if (client.field273[var1] != null) {
                client.field273[var1].field744 = -1;
            }
        }
        class14.field180 = new class177(32);
        method2388(30);
        for (int var2 = 0; var2 < 100; var2++) {
            client.field444[var2] = true;
        }
    }

    @ObfuscatedName("cj.e(I)V")
    public static final void method2100() {
        if (field1794 != null) {
            field1794.method2599();
            field1794 = null;
        }
        client.method900();
        field2514.method1616();
        for (int var0 = 0; var0 < 4; var0++) {
            client.field329[var0].method3634();
        }
        System.gc();
        class164.method1868(2);
        client.field276 = -1;
        client.field314 = false;
        for (class21 var1 = (class21) class21.field554.method3304(); var1 != null; var1 = (class21) class21.field554.method3297()) {
            if (var1.field543 != null) {
                field1275.method949(var1.field543);
                var1.field543 = null;
            }
            if (var1.field536 != null) {
                field1275.method949(var1.field536);
                var1.field536 = null;
            }
        }
        class21.field554.method3276();
        method2388(10);
    }

    @ObfuscatedName("bi.al(I)V")
    public static final void method1311() {
        client.field354 = 0;
        int var0 = (field216.field732 >> 7) + field183;
        int var1 = (field216.field777 >> 7) + field780;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            client.field354 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            client.field354 = 1;
        }
        if (client.field354 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            client.field354 = 0;
        }
    }

    @ObfuscatedName("n.ba(IIB)V")
    public static final void method134(int arg0, int arg1) {
        class180 var2 = client.field370[field2678][arg0][arg1];
        if (var2 == null) {
            field2514.method1744(field2678, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3304(); var6 != null; var6 = (class26) var2.method3297()) {
            class46 var7 = class46.method137(var6.field606);
            long var8 = (long) var7.field1023;
            if (var7.field1022 == 1) {
                var8 = (long) (var6.field609 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            field2514.method1744(field2678, arg0, arg1);
            return;
        }
        var2.method3290(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3304(); var12 != null; var12 = (class26) var2.method3297()) {
            if (var5.field606 != var12.field606) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field606 != var12.field606 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        field2514.method1743(field2678, arg0, arg1, client.method324(arg0 * 128 + 64, arg1 * 128 + 64, field2678), var5, var13, var10, var11);
    }

    @ObfuscatedName("dw.cs(IB)Ljava/lang/String;")
    public static final String method2414(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field26 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method460(65408) + var1.substring(0, var1.length() - 8) + class145.field2360 + " " + class2.field18 + var1 + class2.field31 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method460(16777215) + var1.substring(0, var1.length() - 4) + class145.field2293 + " " + class2.field18 + var1 + class2.field31 + class2.field25;
        } else {
            return " " + class2.method460(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("n.db(Ljava/lang/String;I)V")
    public static final void method133(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method3386(arg0, field237);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < client.field358; var2++) {
            class8 var3 = client.field333[var2];
            String var4 = var3.field125;
            String var5 = class212.method3386(var4, field237);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                client.field358--;
                for (int var7 = var2; var7 < client.field358; var7++) {
                    client.field333[var7] = client.field333[var7 + 1];
                }
                client.field473 = client.field421;
                client.field261.method2391(64);
                class111 var8 = client.field261;
                int var9 = arg0.length() + 1;
                var8.method2226(var9);
                client.field261.method2152(arg0);
                break;
            }
        }
    }
}
