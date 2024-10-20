package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;

public class Statics {

    @ObfuscatedName("s.pi")
    public static Frame field101;

    @ObfuscatedName("aa.ej")
    public static class72[] field1013;

    @ObfuscatedName("aa.z")
    public static class146 field1014;

    @ObfuscatedName("aa.a")
    public static boolean field1023;

    @ObfuscatedName("aa.cm")
    public static char field1026;

    @ObfuscatedName("ax.z")
    public static class146 field1033;

    @ObfuscatedName("ab.z")
    public static class47 field1036;

    @ObfuscatedName("ah.be")
    public static class147 field1041;

    @ObfuscatedName("ah.y")
    public static boolean field1042;

    @ObfuscatedName("ah.a")
    public static int field1044;

    @ObfuscatedName("ah.ah")
    public static class147 field1063;

    @ObfuscatedName("ah.by")
    public static class22[] field1064;

    @ObfuscatedName("ah.oq")
    public static class120 field1065;

    @ObfuscatedName("z.bu")
    public static class147 field11;

    @ObfuscatedName("bz.p")
    public static int field1112;

    @ObfuscatedName("bz.q")
    public static float field1115;

    @ObfuscatedName("bu.h")
    public static int[] field1145;

    @ObfuscatedName("bu.r")
    public static int[] field1146;

    @ObfuscatedName("bu.o")
    public static boolean[] field1147;

    @ObfuscatedName("bb.af")
    public static float[] field1157;

    @ObfuscatedName("bb.g")
    public static float[] field1161;

    @ObfuscatedName("bb.q")
    public static int field1163;

    @ObfuscatedName("bb.p")
    public static int field1164;

    @ObfuscatedName("bb.h")
    public static int field1165;

    @ObfuscatedName("bb.r")
    public static int field1166;

    @ObfuscatedName("bb.u")
    public static class54[] field1169;

    @ObfuscatedName("bb.c")
    public static class62[] field1170;

    @ObfuscatedName("bb.l")
    public static boolean[] field1171;

    @ObfuscatedName("bb.n")
    public static float[] field1172;

    @ObfuscatedName("bb.f")
    public static class61[] field1177;

    @ObfuscatedName("bb.d")
    public static float[] field1179;

    @ObfuscatedName("s.am")
    public static class147 field118;

    @ObfuscatedName("bb.m")
    public static float[] field1180;

    @ObfuscatedName("bb.s")
    public static byte[] field1181;

    @ObfuscatedName("bb.aq")
    public static float[] field1182;

    @ObfuscatedName("bb.ao")
    public static float[] field1183;

    @ObfuscatedName("bb.o")
    public static class67[] field1184;

    @ObfuscatedName("bb.ag")
    public static int[] field1185;

    @ObfuscatedName("bb.ad")
    public static int[] field1186;

    @ObfuscatedName("bb.w")
    public static int[] field1187;

    @ObfuscatedName("bc.h")
    public static class188 field1222;

    @ObfuscatedName("bc.nq")
    public static int field1224;

    @ObfuscatedName("bc.b")
    public static int[] field1226;

    @ObfuscatedName("bc.nv")
    public static int field1228;

    @ObfuscatedName("s.ij")
    public static int field123;

    @ObfuscatedName("ba.bd")
    public static int field1235;

    @ObfuscatedName("ba.ds")
    public static int field1242;

    @ObfuscatedName("bd.v")
    public static String field1246;

    @ObfuscatedName("bd.ox")
    public static int field1249;

    @ObfuscatedName("q.nm")
    public static int field125;

    @ObfuscatedName("bd.p")
    public static short[] field1251;

    @ObfuscatedName("bx.j")
    public static int field1255;

    @ObfuscatedName("bx.q")
    public static int[] field1256;

    @ObfuscatedName("bx.s")
    public static int[] field1257;

    @ObfuscatedName("bx.a")
    public static int field1259;

    @ObfuscatedName("bx.i")
    public static int[] field1263;

    @ObfuscatedName("bx.z")
    public static int field1264;

    @ObfuscatedName("q.ic")
    public static class27 field128;

    @ObfuscatedName("q.iz")
    public static int field129;

    @ObfuscatedName("bv.u")
    public static int field1290;

    @ObfuscatedName("bv.c")
    public static int field1291;

    @ObfuscatedName("bv.f")
    public static int[] field1292;

    @ObfuscatedName("q.at")
    public static class147 field130;

    @ObfuscatedName("bt.c")
    public static int[] field1309;

    @ObfuscatedName("br.m")
    public static int[] field1325;

    @ObfuscatedName("bf.dg")
    public static int[] field1327;

    @ObfuscatedName("cc.bh")
    public static int field1341;

    @ObfuscatedName("cc.t")
    public static int field1347;

    @ObfuscatedName("cc.k")
    public static int field1348;

    @ObfuscatedName("cc.e")
    public static int field1349;

    @ObfuscatedName("cc.v")
    public static int field1350;

    @ObfuscatedName("cc.d")
    public static int field1352;

    @ObfuscatedName("cc.m")
    public static int field1353;

    @ObfuscatedName("cc.g")
    public static int field1354;

    @ObfuscatedName("cc.aq")
    public static int field1355;

    @ObfuscatedName("cc.ao")
    public static int field1356;

    @ObfuscatedName("cc.af")
    public static int field1357;

    @ObfuscatedName("cc.ag")
    public static int field1358;

    @ObfuscatedName("cc.ad")
    public static int field1359;

    @ObfuscatedName("p.an")
    public static class130 field136;

    @ObfuscatedName("cc.x")
    public static int field1360;

    @ObfuscatedName("cc.be")
    public static int field1368;

    @ObfuscatedName("cc.n")
    public static int field1374;

    @ObfuscatedName("cc.bz")
    public static boolean[][] field1385;

    @ObfuscatedName("cc.bu")
    public static int field1386;

    @ObfuscatedName("cc.bm")
    public static int field1387;

    @ObfuscatedName("cc.bq")
    public static int field1388;

    @ObfuscatedName("cc.bo")
    public static int field1390;

    @ObfuscatedName("ci.el")
    public static int[] field1402;

    @ObfuscatedName("ck.o")
    public static int[] field1421;

    @ObfuscatedName("cq.cs")
    public static int field1425;

    @ObfuscatedName("cq.gp")
    public static class152 field1426;

    @ObfuscatedName("cq.ps")
    public static int field1429;

    @ObfuscatedName("co.e")
    public static int field1430;

    @ObfuscatedName("co.m")
    public static int field1434;

    @ObfuscatedName("co.v")
    public static int field1436;

    @ObfuscatedName("co.r")
    public static int field1440;

    @ObfuscatedName("co.o")
    public static int field1441;

    @ObfuscatedName("co.k")
    public static int field1442;

    @ObfuscatedName("co.d")
    public static int field1444;

    @ObfuscatedName("co.n")
    public static int field1445;

    @ObfuscatedName("co.ao")
    public static class85 field1450;

    @ObfuscatedName("cz.k")
    public static class107 field1465;

    @ObfuscatedName("cj.nx")
    public static int field1466;

    @ObfuscatedName("h.iy")
    public static int field147;

    @ObfuscatedName("h.os")
    public static class121 field149;

    @ObfuscatedName("cm.dh")
    public static class79 field1490;

    @ObfuscatedName("cs.fu")
    public static int field1497;

    @ObfuscatedName("z.ex")
    public static class72[] field15;

    @ObfuscatedName("r.av")
    public static class147 field153;

    @ObfuscatedName("cx.d")
    public static int[] field1531;

    @ObfuscatedName("cx.fk")
    public static int field1536;

    @ObfuscatedName("cd.cf")
    public static class191 field1550;

    @ObfuscatedName("cd.lu")
    public static class117 field1557;

    @ObfuscatedName("r.no")
    public static int field158;

    @ObfuscatedName("r.u")
    public static String field160;

    @ObfuscatedName("r.eh")
    public static class72[] field163;

    @ObfuscatedName("cf.pb")
    public static class71 field1631;

    @ObfuscatedName("r.mq")
    public static class50 field164;

    @ObfuscatedName("cl.ar")
    public static String field1641;

    @ObfuscatedName("ch.fs")
    public static int field1648;

    @ObfuscatedName("cr.kb")
    public static class152[] field1658;

    @ObfuscatedName("r.t")
    public static int[] field166;

    @ObfuscatedName("cr.ht")
    public static class3 field1669;

    @ObfuscatedName("cr.ci")
    public static class130 field1670;

    @ObfuscatedName("cu.by")
    public static int field1696;

    @ObfuscatedName("cu.bg")
    public static int field1725;

    @ObfuscatedName("cu.bp")
    public static int field1726;

    @ObfuscatedName("o.ok")
    public static Clipboard field174;

    @ObfuscatedName("cg.ba")
    public static String field1742;

    @ObfuscatedName("cg.b")
    public static class66 field1744;

    @ObfuscatedName("ct.cn")
    public static class130 field1786;

    @ObfuscatedName("cp.po")
    public static int field1792;

    @ObfuscatedName("cp.cc")
    public static class133 field1793;

    @ObfuscatedName("ce.q")
    public static byte[][][] field1797;

    @ObfuscatedName("ce.z")
    public static long field1798;

    @ObfuscatedName("ce.j")
    public static long field1799;

    @ObfuscatedName("z.k")
    public static String field18;

    @ObfuscatedName("ca.li")
    public static byte field1802;

    @ObfuscatedName("ca.nh")
    public static int field1803;

    @ObfuscatedName("dq.pr")
    public static boolean field1821;

    @ObfuscatedName("dq.kg")
    public static int field1822;

    @ObfuscatedName("f.p")
    public static byte[][] field183;

    @ObfuscatedName("dk.h")
    public static int field1855;

    @ObfuscatedName("dw.a")
    public static class146 field1861;

    @ObfuscatedName("f.ce")
    public static int field187;

    @ObfuscatedName("do.lm")
    public static byte field1872;

    @ObfuscatedName("df.pv")
    public static String field1874;

    @ObfuscatedName("df.z")
    public static class146 field1877;

    @ObfuscatedName("f.eu")
    public static class74[] field188;

    @ObfuscatedName("dn.ol")
    public static class123 field1881;

    @ObfuscatedName("dn.y")
    public static class162 field1882;

    @ObfuscatedName("dn.b")
    public static class146 field1883;

    @ObfuscatedName("dx.u")
    public static int[] field1901;

    @ObfuscatedName("ds.x")
    public static int[] field1904;

    @ObfuscatedName("dd.j")
    public static File field1916;

    @ObfuscatedName("dd.l")
    public static String[] field1918;

    @ObfuscatedName("de.df")
    public static byte[][] field1920;

    @ObfuscatedName("de.j")
    public static String field1924;

    @ObfuscatedName("de.z")
    public static String field1927;

    @ObfuscatedName("de.c")
    public static int field1929;

    @ObfuscatedName("dt.fa")
    public static int field1939;

    @ObfuscatedName("u.bf")
    public static FontMetrics field194;

    @ObfuscatedName("u.ez")
    public static int[] field195;

    @ObfuscatedName("dt.nd")
    public static class68 field1963;

    @ObfuscatedName("dz.f")
    public static boolean field1971;

    @ObfuscatedName("di.e")
    public static String field1974;

    @ObfuscatedName("di.s")
    public static byte[][][] field1975;

    @ObfuscatedName("dl.ax")
    public static long field1998;

    @ObfuscatedName("dl.hp")
    public static int field1999;

    @ObfuscatedName("z.ep")
    public static class72[] field20;

    @ObfuscatedName("dp.j")
    public static class146 field2012;

    @ObfuscatedName("dp.s")
    public static class146 field2014;

    @ObfuscatedName("dp.aw")
    public static boolean field2015;

    @ObfuscatedName("c.bx")
    public static int field202;

    @ObfuscatedName("ei.a")
    public static int field2065;

    @ObfuscatedName("ei.j")
    public static String field2066;

    @ObfuscatedName("ei.z")
    public static Applet field2068;

    @ObfuscatedName("eu.b")
    public static int field2070;

    @ObfuscatedName("eu.y")
    public static File field2072;

    @ObfuscatedName("eu.i")
    public static File field2073;

    @ObfuscatedName("eu.u")
    public static class194[] field2074;

    @ObfuscatedName("eu.pw")
    public static int field2075;

    @ObfuscatedName("eu.w")
    public static String[] field2076;

    @ObfuscatedName("ej.mn")
    public static class72 field2083;

    @ObfuscatedName("c.hd")
    public static int field209;

    @ObfuscatedName("ej.mu")
    public static class50 field2094;

    @ObfuscatedName("j.ha")
    public static int field21;

    @ObfuscatedName("ef.gn")
    public static class152 field2102;

    @ObfuscatedName("ef.ac")
    public static class147 field2105;

    @ObfuscatedName("ep.q")
    public static short[][] field2128;

    @ObfuscatedName("l.kv")
    public static class118 field214;

    @ObfuscatedName("l.bg")
    public static class147 field220;

    @ObfuscatedName("l.dw")
    public static int[][] field222;

    @ObfuscatedName("l.pl")
    public static Image field223;

    @ObfuscatedName("w.er")
    public static class74[] field234;

    @ObfuscatedName("w.ne")
    public static int field235;

    @ObfuscatedName("w.og")
    public static class145 field236;

    @ObfuscatedName("ek.p")
    public static class139 field2394;

    @ObfuscatedName("w.iw")
    public static class152 field240;

    @ObfuscatedName("ew.dk")
    public static int[] field2419;

    @ObfuscatedName("client.j")
    public static client field243;

    @ObfuscatedName("client.fl")
    public static int field244;

    @ObfuscatedName("client.s")
    public static class138 field247;

    @ObfuscatedName("ee.mi")
    public static class21[] field2474;

    @ObfuscatedName("ez.bq")
    public static class147 field2479;

    @ObfuscatedName("ez.f")
    public static int[] field2482;

    @ObfuscatedName("et.eq")
    public static class74 field2487;

    @ObfuscatedName("et.bl")
    public static int field2489;

    @ObfuscatedName("et.u")
    public static class151 field2495;

    @ObfuscatedName("j.fw")
    public static int field25;

    @ObfuscatedName("et.z")
    public static class130 field2503;

    @ObfuscatedName("el.ah")
    public static class74[] field2509;

    @ObfuscatedName("ed.a")
    public static class146 field2515;

    @ObfuscatedName("ed.b")
    public static class146 field2516;

    @ObfuscatedName("ed.z")
    public static class152[][] field2574;

    @ObfuscatedName("ed.j")
    public static boolean[] field2630;

    @ObfuscatedName("en.h")
    public static short[][] field2656;

    @ObfuscatedName("fg.s")
    public static short[] field2663;

    @ObfuscatedName("fg.p")
    public static int field2664;

    @ObfuscatedName("fg.ix")
    public static int field2667;

    @ObfuscatedName("fs.py")
    public static Canvas field2676;

    @ObfuscatedName("fs.au")
    public static int field2682;

    @ObfuscatedName("fl.j")
    public static class146 field2698;

    @ObfuscatedName("fl.s")
    public static int field2700;

    @ObfuscatedName("fl.z")
    public static class146 field2702;

    @ObfuscatedName("fl.fr")
    public static int field2703;

    @ObfuscatedName("fl.bp")
    public static class147 field2706;

    @ObfuscatedName("client.ap")
    public static class133 field273;

    @ObfuscatedName("gd.a")
    public static long field2859;

    @ObfuscatedName("gv.at")
    public static class72[] field2861;

    @ObfuscatedName("gv.iv")
    public static int field2864;

    @ObfuscatedName("gf.k")
    public static int[] field2872;

    @ObfuscatedName("gr.y")
    public static int[] field2885;

    @ObfuscatedName("gr.z")
    public static class102 field2886;

    @ObfuscatedName("gw.h")
    public static class74[] field2898;

    @ObfuscatedName("j.gy")
    public static class152 field29;

    @ObfuscatedName("gn.e")
    public static class12 field2910;

    @ObfuscatedName("gk.r")
    public static class152 field2917;

    @ObfuscatedName("gl.j")
    public static int field2953;

    @ObfuscatedName("z.f")
    public static class53 field3;

    @ObfuscatedName("client.dy")
    public static int field307;

    @ObfuscatedName("client.h")
    public static int[] field355;

    @ObfuscatedName("client.mj")
    public static class49 field461;

    @ObfuscatedName("client.bo")
    public static class147 field499;

    @ObfuscatedName("x.i")
    public static int field510;

    @ObfuscatedName("x.q")
    public static class74[] field512;

    @ObfuscatedName("a.il")
    public static int field52;

    @ObfuscatedName("t.cp")
    public static int field522;

    @ObfuscatedName("k.kr")
    public static int field534;

    @ObfuscatedName("e.bm")
    public static class147 field549;

    @ObfuscatedName("y.q")
    public static int field55;

    @ObfuscatedName("v.az")
    public static class133 field555;

    @ObfuscatedName("n.bp")
    public static class74 field560;

    @ObfuscatedName("n.ch")
    public static class191 field568;

    @ObfuscatedName("y.oz")
    public static class9 field57;

    @ObfuscatedName("d.y")
    public static String[] field573;

    @ObfuscatedName("d.es")
    public static class72[] field574;

    @ObfuscatedName("m.r")
    public static boolean field578;

    @ObfuscatedName("m.ey")
    public static class72 field580;

    @ObfuscatedName("m.l")
    public static class107 field581;

    @ObfuscatedName("m.bi")
    public static class147 field582;

    @ObfuscatedName("m.i")
    public static class146 field583;

    @ObfuscatedName("m.np")
    public static int field585;

    @ObfuscatedName("y.w")
    public static int[] field59;

    @ObfuscatedName("g.o")
    public static class152 field597;

    @ObfuscatedName("g.pu")
    public static Font field600;

    @ObfuscatedName("ao.j")
    public static class74 field614;

    @ObfuscatedName("ao.y")
    public static class74[] field616;

    @ObfuscatedName("ao.s")
    public static class74 field618;

    @ObfuscatedName("ao.z")
    public static boolean field621;

    @ObfuscatedName("ao.a")
    public static class74 field623;

    @ObfuscatedName("ao.b")
    public static class72 field624;

    @ObfuscatedName("ao.n")
    public static int[] field626;

    @ObfuscatedName("ao.h")
    public static class74 field627;

    @ObfuscatedName("ao.cl")
    public static class191 field630;

    @ObfuscatedName("ao.p")
    public static class74 field639;

    @ObfuscatedName("ao.ab")
    public static class17 field645;

    @ObfuscatedName("ao.io")
    public static int field650;

    @ObfuscatedName("af.pg")
    public static int field658;

    @ObfuscatedName("i.i")
    public static class72 field66;

    @ObfuscatedName("af.ib")
    public static class152 field661;

    @ObfuscatedName("ad.ef")
    public static class72[] field670;

    @ObfuscatedName("ad.dr")
    public static int[] field674;

    @ObfuscatedName("ad.nu")
    public static int field679;

    @ObfuscatedName("ak.a")
    public static int[] field687;

    @ObfuscatedName("z.em")
    public static class72[] field7;

    @ObfuscatedName("i.ee")
    public static int[] field70;

    @ObfuscatedName("b.y")
    public static byte[][][] field75;

    @ObfuscatedName("b.i")
    public static byte[][][] field76;

    @ObfuscatedName("al.z")
    public static class146 field768;

    @ObfuscatedName("b.b")
    public static byte[][][] field77;

    @ObfuscatedName("b.p")
    public static int[][] field78;

    @ObfuscatedName("b.r")
    public static int[] field79;

    @ObfuscatedName("al.j")
    public static class146 field794;

    @ObfuscatedName("b.c")
    public static int[][][] field80;

    @ObfuscatedName("al.ab")
    public static class147 field801;

    @ObfuscatedName("ai.a")
    public static class146 field808;

    @ObfuscatedName("ai.j")
    public static class146 field838;

    @ObfuscatedName("ai.do")
    public static byte[][] field856;

    @ObfuscatedName("b.ew")
    public static class74[] field86;

    @ObfuscatedName("az.z")
    public static class146 field860;

    @ObfuscatedName("az.mz")
    public static int field861;

    @ObfuscatedName("az.kh")
    public static int field864;

    @ObfuscatedName("aw.j")
    public static class146 field868;

    @ObfuscatedName("aw.a")
    public static class146 field874;

    @ObfuscatedName("aw.m")
    public static int[] field879;

    @ObfuscatedName("aw.z")
    public static class146 field889;

    @ObfuscatedName("ay.j")
    public static class146 field898;

    @ObfuscatedName("b.av")
    public static class74[] field90;

    @ObfuscatedName("ay.by")
    public static class147 field906;

    @ObfuscatedName("ay.ei")
    public static class72 field908;

    @ObfuscatedName("au.j")
    public static class146 field913;

    @ObfuscatedName("au.nf")
    public static int field916;

    @ObfuscatedName("au.ct")
    public static int field919;

    @ObfuscatedName("au.a")
    public static int field925;

    @ObfuscatedName("au.ac")
    public static class74[] field926;

    @ObfuscatedName("au.z")
    public static class146 field927;

    @ObfuscatedName("au.cg")
    public static int field928;

    @ObfuscatedName("au.g")
    public static int[] field929;

    @ObfuscatedName("ar.z")
    public static class146 field939;

    @ObfuscatedName("ar.et")
    public static int[] field943;

    @ObfuscatedName("ap.ek")
    public static class72[] field953;

    @ObfuscatedName("ap.z")
    public static class146 field956;

    @ObfuscatedName("an.bz")
    public static class147 field962;

    @ObfuscatedName("an.z")
    public static class146 field967;

    @ObfuscatedName("ae.o")
    public static class158 field973;

    @ObfuscatedName("ae.z")
    public static class146 field975;

    @ObfuscatedName("aa.s")
    public static class191 field998;

    @ObfuscatedName("aw.z([Lcb;II)Lcb;")
    public static class101 method720(class101[] arg0, int arg1) {
        class101[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class101 var4 = var2[var3];
            if (arg1 == var4.method457()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("k.j(Ldr;IB)V")
    public static void method473(class110 arg0, int arg1) {
        while (true) {
            class186 var2 = (class186) class187.field2871.method3232();
            if (var2 == null) {
                return;
            }
            arg0.method2364(arg1);
            arg0.method2108(0);
            int var3 = arg0.field1819;
            arg0.method2111(var2.field2867);
            for (int var4 = 0; var4 < var2.field2862; var4++) {
                if (var2.field2865[var4] == 0) {
                    try {
                        int var5 = var2.field2863[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2870[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2108(0);
                            arg0.method2111(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2870[var4];
                            var8.setInt((Object) null, var2.field2866[var4]);
                            arg0.method2108(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2870[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2108(0);
                            arg0.method2111(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2869[var4];
                            byte[][] var12 = var2.field2868[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2108(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2108(1);
                                arg0.method2112(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2108(2);
                                arg0.method2113((String) var16);
                            } else {
                                arg0.method2108(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2869[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2108(0);
                            arg0.method2111(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2108(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2108(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2108(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2108(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2108(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2108(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2108(-16);
                    } catch (SecurityException var38) {
                        arg0.method2108(-17);
                    } catch (IOException var39) {
                        arg0.method2108(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2108(-19);
                    } catch (Exception var41) {
                        arg0.method2108(-20);
                    } catch (Throwable var42) {
                        arg0.method2108(-21);
                    }
                } else {
                    arg0.method2108(var2.field2865[var4]);
                }
            }
            arg0.method2154(var3);
            arg0.method2119(arg0.field1819 - var3);
            var2.method3311();
        }
    }

    @ObfuscatedName("dg.j(Ljava/awt/Component;I)V")
    public static void method2358(Component arg0) {
        arg0.removeMouseListener(class127.field1990);
        arg0.removeMouseMotionListener(class127.field1990);
        arg0.removeFocusListener(class127.field1990);
        class127.field1983 = 0;
    }

    @ObfuscatedName("ao.z(Lz;I)V")
    public static void method562(class1 arg0) {
        class32.method1856(arg0, 200000);
    }

    @ObfuscatedName("cm.a(Ldq;II)Ljava/lang/String;")
    public static String method1875(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2197();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1819 += field2886.method2065(arg0.field1823, arg0.field1819, var3, 0, var2);
            return class199.method1593(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @ObfuscatedName("ej.y(IIB)V")
    public static void method2684(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) class150.field2491.method3204(var2);
        if (var4 != null) {
            class150.field2490.method3270(var4);
        }
    }

    @ObfuscatedName("u.h(II)Lch;")
    public static class96 method143(int arg0) {
        class96 var1 = (class96) class38.field869.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = field868;
        class146 var3 = field874;
        boolean var4 = true;
        int[] var5 = var2.method2720(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2739(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2739(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class96 var10;
        if (var4) {
            try {
                var10 = new class96(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            class38.field869.method3171(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("cz.a(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1855(File arg0, File arg1) {
        try {
            class193 var2 = new class193(field2072, "rw", 10000L);
            class107 var3 = new class107(500);
            var3.method2108(3);
            var3.method2108(arg1 == null ? 0 : 1);
            var3.method2115(arg0.getPath());
            if (arg1 != null) {
                var3.method2115(arg1.getPath());
            }
            var2.method3436(var3.field1823, 0, var3.field1819);
            var2.method3437();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("cz.i(Ljava/lang/String;Ljava/lang/String;ZB)Lgk;")
    public static class193 method1854(String arg0, String arg1, boolean arg2) {
        File var3 = new File(field2073, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class193(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (field1929 == 33) {
            var6 = "_rc";
        } else if (field1929 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(field1246, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class193(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class193(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("d.p(S)V")
    public static final void method513() {
        short var0 = 256;
        if (class28.field613 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class28.field613 > 768) {
                    field59[var1] = class28.method462(field1904[var1], field166[var1], 1024 - class28.field613);
                } else if (class28.field613 > 256) {
                    field59[var1] = field166[var1];
                } else {
                    field59[var1] = class28.method462(field166[var1], field1904[var1], 256 - class28.field613);
                }
            }
        } else if (class28.field625 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class28.field625 > 768) {
                    field59[var2] = class28.method462(field1904[var2], field2872[var2], 1024 - class28.field625);
                } else if (class28.field625 > 256) {
                    field59[var2] = field2872[var2];
                } else {
                    field59[var2] = class28.method462(field2872[var2], field1904[var2], 256 - class28.field625);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                field59[var3] = field1904[var3];
            }
        }
        class73.method1502(0, 9, 128, var0 + 7);
        field66.method1420(0, 0);
        class73.method1535();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * class28.field631[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = field1325[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = field59[var10];
                    int var14 = field1631.field1271[var5];
                    field1631.field1271[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1502(637, 9, 765, var0 + 7);
        field624.method1420(382, 0);
        class73.method1535();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * class28.field631[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = field1325[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = field59[var22];
                    int var26 = field1631.field1271[var20];
                    field1631.field1271[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("fa.f(III)I")
    public static final int method3052(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ei.o(I)V")
    public static void method2670() {
        try {
            if (field645 == null) {
                field645 = new class17(field1881, new URL(field160));
            } else {
                byte[] var0 = field645.method162();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    class28.field646 = var1.method2239();
                    field1064 = new class22[class28.field646];
                    int var2 = 0;
                    while (var2 < class28.field646) {
                        class22 var3 = field1064[var2] = new class22();
                        var3.field558 = var1.method2239();
                        var3.field557 = var1.method2127();
                        var3.field553 = var1.method2130();
                        var3.field554 = var1.method2130();
                        var3.field550 = var1.method2122();
                        var3.field552 = var1.method2125();
                        var3.field556 = var2++;
                    }
                    class28.method122(field1064, 0, field1064.length - 1, class28.field647, class28.field619);
                    class28.field644 = true;
                    field645 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            field645 = null;
        }
    }

    @ObfuscatedName("do.a(II)V")
    public static void method2418(int arg0) {
        if (arg0 == -1 || !class152.method2525(arg0)) {
            return;
        }
        class152[] var1 = field2574[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2523 != null) {
                class1 var4 = new class1();
                var4.field19 = var3;
                var4.field10 = var3.field2523;
                class32.method1856(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ff.ak(Laj;I)V")
    public static final void method3156(class33 arg0) {
        if (arg0.field748 == 0) {
            return;
        }
        if (arg0.field698 != -1 && arg0.field698 < 32768) {
            class30 var1 = client.field376[arg0.field698];
            if (var1 != null) {
                int var2 = arg0.field700 - var1.field700;
                int var3 = arg0.field726 - var1.field726;
                if (var2 != 0 || var3 != 0) {
                    arg0.field721 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field698 >= 32768) {
            int var4 = arg0.field698 - 32768;
            if (client.field468 == var4) {
                var4 = 2047;
            }
            class3 var5 = client.field364[var4];
            if (var5 != null) {
                int var6 = arg0.field700 - var5.field700;
                int var7 = arg0.field726 - var5.field726;
                if (var6 != 0 || var7 != 0) {
                    arg0.field721 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field746 != 0 || arg0.field723 != 0) && (arg0.field749 == 0 || arg0.field753 > 0)) {
            int var8 = arg0.field700 - (arg0.field746 * 64 - field928 * 64 - field928 * 64);
            int var9 = arg0.field726 - (arg0.field723 * 64 - field919 * 64 - field919 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field721 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field746 = 0;
            arg0.field723 = 0;
        }
        int var10 = arg0.field721 - arg0.field728 & 0x7FF;
        if (var10 == 0) {
            arg0.field747 = 0;
            return;
        }
        arg0.field747++;
        if (var10 > 1024) {
            arg0.field728 -= arg0.field748;
            boolean var11 = true;
            if (var10 < arg0.field748 || var10 > 2048 - arg0.field748) {
                arg0.field728 = arg0.field721;
                var11 = false;
            }
            if (arg0.field733 == arg0.field724 && (arg0.field747 > 25 || var11)) {
                if (arg0.field703 == -1) {
                    arg0.field724 = arg0.field705;
                } else {
                    arg0.field724 = arg0.field703;
                }
            }
        } else {
            arg0.field728 += arg0.field748;
            boolean var12 = true;
            if (var10 < arg0.field748 || var10 > 2048 - arg0.field748) {
                arg0.field728 = arg0.field721;
                var12 = false;
            }
            if (arg0.field733 == arg0.field724 && (arg0.field747 > 25 || var12)) {
                if (arg0.field755 == -1) {
                    arg0.field724 = arg0.field705;
                } else {
                    arg0.field724 = arg0.field755;
                }
            }
        }
        arg0.field728 &= 0x7FF;
    }

    @ObfuscatedName("k.at(IIIIII)V")
    public static final void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1490.method1627(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = field1490.method1631(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = field2083.field1283;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method167(var12);
            if (var13.field836 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class74 var14 = field188[var13.field836];
                if (var14 != null) {
                    int var15 = (var13.field822 * 4 - var14.field1298) / 2;
                    int var16 = (var13.field823 * 4 - var14.field1299) / 2;
                    var14.method1581(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field823) * 4 + 48 + var16);
                }
            }
        }
        int var17 = field1490.method1629(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = field1490.method1631(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method167(var21);
            if (var22.field836 != -1) {
                class74 var23 = field188[var22.field836];
                if (var23 != null) {
                    int var24 = (var22.field822 * 4 - var23.field1298) / 2;
                    int var25 = (var22.field823 * 4 - var23.field1299) / 2;
                    var23.method1581(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field823) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = field2083.field1283;
                int var28 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                } else {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                }
            }
        }
        int var29 = field1490.method1613(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method167(var30);
        if (var31.field836 == -1) {
            return;
        }
        class74 var32 = field188[var31.field836];
        if (var32 != null) {
            int var33 = (var31.field822 * 4 - var32.field1298) / 2;
            int var34 = (var31.field823 * 4 - var32.field1299) / 2;
            var32.method1581(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field823) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cg.br(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2059(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (client.field387 || client.field388 >= 500) {
            return;
        }
        client.field393[client.field388] = arg0;
        client.field503[client.field388] = arg1;
        client.field391[client.field388] = arg2;
        client.field502[client.field388] = arg3;
        client.field389[client.field388] = arg4;
        client.field390[client.field388] = arg5;
        client.field388++;
    }

    @ObfuscatedName("w.cj(Led;I)Z")
    public static final boolean method172(class152 arg0) {
        if (arg0.field2619 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2619.length; var1++) {
            int var2 = client.method2479(arg0, var1);
            int var3 = arg0.field2620[var1];
            if (arg0.field2619[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2619[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2619[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("l.cx([Led;IS)V")
    public static final void method159(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2524 == 0) {
                    if (var3.field2622 != null) {
                        method159(var3.field2622, arg1);
                    }
                    class4 var4 = (class4) client.field362.method3204((long) var3.field2559);
                    if (var4 != null) {
                        client.method28(var4.field58, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2616 != null) {
                    class1 var5 = new class1();
                    var5.field19 = var3;
                    var5.field10 = var3.field2616;
                    method562(var5);
                }
                if (arg1 == 1 && var3.field2638 != null) {
                    if (var3.field2568 >= 0) {
                        class152 var6 = class152.method124(var3.field2559);
                        if (var6 == null || var6.field2622 == null || var3.field2568 >= var6.field2622.length || var6.field2622[var3.field2568] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field19 = var3;
                    var7.field10 = var3.field2638;
                    method562(var7);
                }
            }
        }
    }
}
