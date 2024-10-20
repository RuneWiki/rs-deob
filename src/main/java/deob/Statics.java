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

public class Statics {

    @ObfuscatedName("au.p")
    public static class147 field1000;

    @ObfuscatedName("ag.g")
    public static class147 field1004;

    @ObfuscatedName("ag.r")
    public static class194 field1009;

    @ObfuscatedName("ag.mj")
    public static class21[] field1015;

    @ObfuscatedName("ag.p")
    public static class147 field1036;

    @ObfuscatedName("ag.x")
    public static boolean field1046;

    @ObfuscatedName("r.dz")
    public static int[] field105;

    @ObfuscatedName("ag.bc")
    public static class148 field1052;

    @ObfuscatedName("ar.g")
    public static int field1054;

    @ObfuscatedName("ar.p")
    public static class147 field1055;

    @ObfuscatedName("ar.y")
    public static boolean field1059;

    @ObfuscatedName("ab.p")
    public static class47 field1064;

    @ObfuscatedName("r.ec")
    public static class74[] field107;

    @ObfuscatedName("ah.n")
    public static int field1075;

    @ObfuscatedName("ah.ay")
    public static class148 field1084;

    @ObfuscatedName("bj.cu")
    public static class130 field1109;

    @ObfuscatedName("bc.w")
    public static float field1133;

    @ObfuscatedName("bc.u")
    public static int field1137;

    @ObfuscatedName("bt.d")
    public static int[] field1163;

    @ObfuscatedName("bt.h")
    public static int[] field1168;

    @ObfuscatedName("bt.a")
    public static boolean[] field1169;

    @ObfuscatedName("r.bm")
    public static class148 field117;

    @ObfuscatedName("bo.an")
    public static float[] field1178;

    @ObfuscatedName("bo.m")
    public static float[] field1183;

    @ObfuscatedName("bo.r")
    public static byte[] field1184;

    @ObfuscatedName("bo.w")
    public static int field1185;

    @ObfuscatedName("bo.u")
    public static int field1186;

    @ObfuscatedName("bo.z")
    public static int[] field1187;

    @ObfuscatedName("bo.h")
    public static int field1188;

    @ObfuscatedName("bo.d")
    public static int field1189;

    @ObfuscatedName("bo.y")
    public static class61[] field1190;

    @ObfuscatedName("bo.v")
    public static class54[] field1191;

    @ObfuscatedName("bo.e")
    public static class62[] field1192;

    @ObfuscatedName("bo.b")
    public static boolean[] field1193;

    @ObfuscatedName("bo.as")
    public static int[] field1194;

    @ObfuscatedName("p.f")
    public static int[] field12;

    @ObfuscatedName("bo.i")
    public static float[] field1200;

    @ObfuscatedName("bo.aw")
    public static float[] field1201;

    @ObfuscatedName("bo.k")
    public static float[] field1203;

    @ObfuscatedName("bo.a")
    public static class67[] field1204;

    @ObfuscatedName("bo.al")
    public static int[] field1205;

    @ObfuscatedName("bo.at")
    public static float[] field1206;

    @ObfuscatedName("bo.f")
    public static float[] field1210;

    @ObfuscatedName("bi.en")
    public static class72[] field1243;

    @ObfuscatedName("bi.cy")
    public static int field1245;

    @ObfuscatedName("bi.hw")
    public static class3 field1248;

    @ObfuscatedName("bq.ns")
    public static int field1262;

    @ObfuscatedName("bq.j")
    public static String field1266;

    @ObfuscatedName("bq.or")
    public static int field1268;

    @ObfuscatedName("bq.pf")
    public static Canvas field1272;

    @ObfuscatedName("bq.fe")
    public static int field1274;

    @ObfuscatedName("bv.d")
    public static class74 field1282;

    @ObfuscatedName("bv.g")
    public static int field1283;

    @ObfuscatedName("bv.r")
    public static int[] field1284;

    @ObfuscatedName("bv.s")
    public static int[] field1286;

    @ObfuscatedName("bv.w")
    public static int[] field1288;

    @ObfuscatedName("bv.p")
    public static int field1289;

    @ObfuscatedName("bv.mq")
    public static int field1290;

    @ObfuscatedName("bv.x")
    public static int field1291;

    @ObfuscatedName("bv.n")
    public static int[] field1292;

    @ObfuscatedName("w.ax")
    public static int field131;

    @ObfuscatedName("bw.e")
    public static int field1318;

    @ObfuscatedName("bw.v")
    public static int field1319;

    @ObfuscatedName("bw.y")
    public static int[] field1322;

    @ObfuscatedName("w.fn")
    public static int field134;

    @ObfuscatedName("bl.e")
    public static int[] field1346;

    @ObfuscatedName("be.by")
    public static class22[] field1353;

    @ObfuscatedName("be.fy")
    public static int field1354;

    @ObfuscatedName("cl.t")
    public static int field1359;

    @ObfuscatedName("cl.aw")
    public static int field1366;

    @ObfuscatedName("w.fq")
    public static int field137;

    @ObfuscatedName("cl.bk")
    public static int field1370;

    @ObfuscatedName("cl.bn")
    public static int field1373;

    @ObfuscatedName("cl.q")
    public static int field1378;

    @ObfuscatedName("cl.j")
    public static int field1379;

    @ObfuscatedName("cl.o")
    public static int field1380;

    @ObfuscatedName("cl.m")
    public static int field1382;

    @ObfuscatedName("cl.f")
    public static int field1383;

    @ObfuscatedName("cl.k")
    public static int field1384;

    @ObfuscatedName("cl.an")
    public static int field1385;

    @ObfuscatedName("cl.at")
    public static int field1387;

    @ObfuscatedName("cl.as")
    public static int field1388;

    @ObfuscatedName("cl.bz")
    public static int field1389;

    @ObfuscatedName("cl.al")
    public static int field1406;

    @ObfuscatedName("cl.i")
    public static int field1414;

    @ObfuscatedName("cl.bc")
    public static boolean[][] field1415;

    @ObfuscatedName("cl.bd")
    public static int field1416;

    @ObfuscatedName("cl.bt")
    public static int field1419;

    @ObfuscatedName("cl.l")
    public static int field1420;

    @ObfuscatedName("cl.bh")
    public static int field1421;

    @ObfuscatedName("cu.d")
    public static int field1432;

    @ObfuscatedName("ch.ot")
    public static class121 field1452;

    @ObfuscatedName("cf.u")
    public static byte[][] field1456;

    @ObfuscatedName("cf.fk")
    public static int field1457;

    @ObfuscatedName("u.my")
    public static byte field146;

    @ObfuscatedName("cf.iq")
    public static class27 field1460;

    @ObfuscatedName("cf.ng")
    public static int field1461;

    @ObfuscatedName("cf.w")
    public static short[][] field1463;

    @ObfuscatedName("cs.f")
    public static int field1471;

    @ObfuscatedName("cs.a")
    public static int field1477;

    @ObfuscatedName("cs.q")
    public static int field1478;

    @ObfuscatedName("cs.j")
    public static int field1479;

    @ObfuscatedName("cs.o")
    public static int field1480;

    @ObfuscatedName("cs.i")
    public static int field1481;

    @ObfuscatedName("cs.m")
    public static int field1482;

    @ObfuscatedName("cs.h")
    public static int field1483;

    @ObfuscatedName("cs.aw")
    public static class85 field1486;

    @ObfuscatedName("ct.v")
    public static class197[] field1496;

    @ObfuscatedName("ct.oe")
    public static class146 field1497;

    @ObfuscatedName("ct.ea")
    public static class72 field1498;

    @ObfuscatedName("u.li")
    public static byte field150;

    @ObfuscatedName("cd.ki")
    public static int field1503;

    @ObfuscatedName("cd.pc")
    public static Frame field1514;

    @ObfuscatedName("cd.mn")
    public static class50 field1515;

    @ObfuscatedName("cm.pv")
    public static Image field1521;

    @ObfuscatedName("cm.nk")
    public static int field1525;

    @ObfuscatedName("cb.ew")
    public static int[] field1534;

    @ObfuscatedName("cb.jx")
    public static int field1538;

    @ObfuscatedName("d.r")
    public static byte[][][] field154;

    @ObfuscatedName("d.ga")
    public static class153 field161;

    @ObfuscatedName("h.cp")
    public static int field164;

    @ObfuscatedName("ce.ay")
    public static class74[] field1695;

    @ObfuscatedName("cn.bm")
    public static int field1739;

    @ObfuscatedName("cn.bj")
    public static int field1749;

    @ObfuscatedName("cn.by")
    public static int field1763;

    @ObfuscatedName("cy.v")
    public static class152 field1764;

    @ObfuscatedName("cv.bp")
    public static class148 field1807;

    @ObfuscatedName("cp.nu")
    public static int field1813;

    @ObfuscatedName("cp.p")
    public static long field1816;

    @ObfuscatedName("cr.bj")
    public static class74 field1817;

    @ObfuscatedName("cr.bk")
    public static class148 field1818;

    @ObfuscatedName("cr.kl")
    public static class153[] field1821;

    @ObfuscatedName("cr.pj")
    public static int field1822;

    @ObfuscatedName("cr.il")
    public static int field1824;

    @ObfuscatedName("a.cz")
    public static class194 field183;

    @ObfuscatedName("a.ey")
    public static class72[] field184;

    @ObfuscatedName("du.h")
    public static int[] field1842;

    @ObfuscatedName("du.pi")
    public static int field1848;

    @ObfuscatedName("a.er")
    public static class74 field185;

    @ObfuscatedName("dz.b")
    public static class107 field1857;

    @ObfuscatedName("dc.ek")
    public static int[] field1868;

    @ObfuscatedName("dc.nb")
    public static int field1869;

    @ObfuscatedName("da.h")
    public static boolean field1873;

    @ObfuscatedName("da.eo")
    public static class72 field1876;

    @ObfuscatedName("dx.ba")
    public static int field1884;

    @ObfuscatedName("di.g")
    public static class147 field1888;

    @ObfuscatedName("dj.r")
    public static int field1890;

    @ObfuscatedName("dj.s")
    public static class147 field1897;

    @ObfuscatedName("do.ac")
    public static class148 field1901;

    @ObfuscatedName("dk.r")
    public static class139 field1909;

    @ObfuscatedName("ds.pa")
    public static String field1914;

    @ObfuscatedName("dn.g")
    public static File field1920;

    @ObfuscatedName("dn.u")
    public static int[][] field1922;

    @ObfuscatedName("dn.c")
    public static boolean field1924;

    @ObfuscatedName("dq.g")
    public static String field1931;

    @ObfuscatedName("dq.p")
    public static String field1934;

    @ObfuscatedName("y.bj")
    public static class148 field195;

    @ObfuscatedName("dd.bt")
    public static class148 field1955;

    @ObfuscatedName("df.pq")
    public static Font field1981;

    @ObfuscatedName("dv.ca")
    public static class194 field1984;

    @ObfuscatedName("dv.t")
    public static int[] field1987;

    @ObfuscatedName("v.ii")
    public static int field200;

    @ObfuscatedName("dy.pn")
    public static class71 field2011;

    @ObfuscatedName("db.z")
    public static int[] field2022;

    @ObfuscatedName("db.q")
    public static String field2029;

    @ObfuscatedName("db.ev")
    public static class72[] field2033;

    @ObfuscatedName("v.ac")
    public static class72[] field204;

    @ObfuscatedName("ea.e")
    public static int[][][] field2063;

    @ObfuscatedName("ea.h")
    public static class191 field2064;

    @ObfuscatedName("ea.x")
    public static int field2065;

    @ObfuscatedName("ea.p")
    public static Applet field2066;

    @ObfuscatedName("ea.g")
    public static String field2068;

    @ObfuscatedName("v.dk")
    public static int field207;

    @ObfuscatedName("ej.n")
    public static File field2074;

    @ObfuscatedName("ej.c")
    public static File field2076;

    @ObfuscatedName("ej.s")
    public static int field2078;

    @ObfuscatedName("ej.ae")
    public static boolean field2084;

    @ObfuscatedName("ej.b")
    public static String[] field2085;

    @ObfuscatedName("ep.hj")
    public static int field2104;

    @ObfuscatedName("eu.ah")
    public static class148 field2128;

    @ObfuscatedName("ev.y")
    public static class53 field2134;

    @ObfuscatedName("e.pt")
    public static int field220;

    @ObfuscatedName("e.ij")
    public static class153 field221;

    @ObfuscatedName("en.ka")
    public static int field2227;

    @ObfuscatedName("e.bd")
    public static class148 field223;

    @ObfuscatedName("b.am")
    public static class148 field238;

    @ObfuscatedName("b.nj")
    public static int field239;

    @ObfuscatedName("g.eb")
    public static int[] field24;

    @ObfuscatedName("ed.nr")
    public static int field2403;

    @ObfuscatedName("et.ah")
    public static class74[] field2410;

    @ObfuscatedName("et.ni")
    public static int field2411;

    @ObfuscatedName("et.w")
    public static int field2413;

    @ObfuscatedName("z.hv")
    public static int field243;

    @ObfuscatedName("er.ln")
    public static class117 field2451;

    @ObfuscatedName("er.aq")
    public static class133 field2464;

    @ObfuscatedName("er.mc")
    public static class49 field2468;

    @ObfuscatedName("er.ff")
    public static int field2469;

    @ObfuscatedName("ew.ir")
    public static int field2484;

    @ObfuscatedName("ew.cl")
    public static class133 field2489;

    @ObfuscatedName("ex.cv")
    public static int field2495;

    @ObfuscatedName("ex.cm")
    public static char field2496;

    @ObfuscatedName("eb.q")
    public static class107 field2497;

    @ObfuscatedName("eb.x")
    public static long field2499;

    @ObfuscatedName("eb.p")
    public static class130 field2500;

    @ObfuscatedName("eq.g")
    public static boolean[] field2529;

    @ObfuscatedName("eq.n")
    public static class147 field2531;

    @ObfuscatedName("client.g")
    public static client field254;

    @ObfuscatedName("eq.p")
    public static class153[][] field2572;

    @ObfuscatedName("client.d")
    public static class140 field258;

    @ObfuscatedName("g.eg")
    public static class72[] field26;

    @ObfuscatedName("eq.c")
    public static class147 field2602;

    @ObfuscatedName("eq.r")
    public static class147 field2611;

    @ObfuscatedName("client.j")
    public static class12 field266;

    @ObfuscatedName("ez.kx")
    public static int field2664;

    @ObfuscatedName("ft.x")
    public static int field2674;

    @ObfuscatedName("fk.oo")
    public static class123 field2680;

    @ObfuscatedName("fk.u")
    public static short[] field2682;

    @ObfuscatedName("fk.du")
    public static int[] field2685;

    @ObfuscatedName("fk.dw")
    public static class79 field2687;

    @ObfuscatedName("fi.bf")
    public static FontMetrics field2700;

    @ObfuscatedName("fi.eu")
    public static class72[] field2703;

    @ObfuscatedName("fq.p")
    public static class147 field2718;

    @ObfuscatedName("fq.x")
    public static class147 field2719;

    @ObfuscatedName("fq.a")
    public static class159 field2721;

    @ObfuscatedName("fm.hg")
    public static int field2819;

    @ObfuscatedName("client.fi")
    public static int field283;

    @ObfuscatedName("client.ab")
    public static class148 field286;

    @ObfuscatedName("g.ap")
    public static class148 field29;

    @ObfuscatedName("ga.p")
    public static class102 field2905;

    @ObfuscatedName("gg.d")
    public static class74[] field2918;

    @ObfuscatedName("gu.c")
    public static int[] field2929;

    @ObfuscatedName("gm.c")
    public static String[] field2935;

    @ObfuscatedName("client.cg")
    public static class130 field296;

    @ObfuscatedName("gx.a")
    public static class153 field2966;

    @ObfuscatedName("client.dc")
    public static int[] field341;

    @ObfuscatedName("client.bz")
    public static class148 field368;

    @ObfuscatedName("x.cb")
    public static int field49;

    @ObfuscatedName("client.h")
    public static class153 field517;

    @ObfuscatedName("l.pm")
    public static int field521;

    @ObfuscatedName("c.na")
    public static int field55;

    @ObfuscatedName("q.pu")
    public static boolean field550;

    @ObfuscatedName("c.oj")
    public static Clipboard field56;

    @ObfuscatedName("j.iw")
    public static int field562;

    @ObfuscatedName("j.es")
    public static class72[] field564;

    @ObfuscatedName("j.s")
    public static class66 field566;

    @ObfuscatedName("o.co")
    public static class194 field577;

    @ObfuscatedName("o.f")
    public static int[] field579;

    @ObfuscatedName("c.c")
    public static byte[][][] field58;

    @ObfuscatedName("o.dx")
    public static byte[][] field580;

    @ObfuscatedName("c.bv")
    public static int field59;

    @ObfuscatedName("c.mz")
    public static class72 field60;

    @ObfuscatedName("i.e")
    public static int field602;

    @ObfuscatedName("i.bs")
    public static int field603;

    @ObfuscatedName("c.ou")
    public static class120 field61;

    @ObfuscatedName("m.ai")
    public static String field611;

    @ObfuscatedName("m.bx")
    public static String field612;

    @ObfuscatedName("f.k")
    public static int[] field619;

    @ObfuscatedName("f.s")
    public static class147 field620;

    @ObfuscatedName("f.r")
    public static short[] field621;

    @ObfuscatedName("k.kz")
    public static class118 field628;

    @ObfuscatedName("k.ep")
    public static class72[] field633;

    @ObfuscatedName("an.ap")
    public static class74[] field635;

    @ObfuscatedName("an.ad")
    public static class130 field642;

    @ObfuscatedName("an.m")
    public static int[] field643;

    @ObfuscatedName("aw.g")
    public static class74 field646;

    @ObfuscatedName("aw.x")
    public static class74 field647;

    @ObfuscatedName("aw.c")
    public static class74[] field648;

    @ObfuscatedName("aw.n")
    public static class72 field649;

    @ObfuscatedName("aw.s")
    public static class72 field650;

    @ObfuscatedName("aw.w")
    public static class74[] field652;

    @ObfuscatedName("aw.u")
    public static class74 field653;

    @ObfuscatedName("aw.l")
    public static int[] field656;

    @ObfuscatedName("c.dt")
    public static int field66;

    @ObfuscatedName("aw.r")
    public static class74 field670;

    @ObfuscatedName("aw.p")
    public static boolean field673;

    @ObfuscatedName("aw.ab")
    public static class17 field677;

    @ObfuscatedName("n.ed")
    public static class72[] field68;

    @ObfuscatedName("aw.d")
    public static short[][] field686;

    @ObfuscatedName("at.ms")
    public static class50 field691;

    @ObfuscatedName("at.dg")
    public static byte[][] field693;

    @ObfuscatedName("at.gu")
    public static class153 field694;

    @ObfuscatedName("at.ix")
    public static int field696;

    @ObfuscatedName("al.c")
    public static class163 field697;

    @ObfuscatedName("al.s")
    public static byte[][][] field698;

    @ObfuscatedName("al.et")
    public static class74[] field702;

    @ObfuscatedName("as.by")
    public static class148 field709;

    @ObfuscatedName("n.ck")
    public static int field71;

    @ObfuscatedName("ak.x")
    public static int[] field713;

    @ObfuscatedName("ak.nf")
    public static int field722;

    @ObfuscatedName("ak.g")
    public static long field723;

    @ObfuscatedName("ak.q")
    public static int[] field724;

    @ObfuscatedName("n.u")
    public static int field74;

    @ObfuscatedName("n.i")
    public static int[] field76;

    @ObfuscatedName("n.ar")
    public static long field77;

    @ObfuscatedName("aa.da")
    public static int[][] field787;

    @ObfuscatedName("ao.z")
    public static String[] field793;

    @ObfuscatedName("ao.y")
    public static int[] field795;

    @ObfuscatedName("ao.bn")
    public static class148 field799;

    @ObfuscatedName("p.az")
    public static class133 field8;

    @ObfuscatedName("af.g")
    public static class147 field801;

    @ObfuscatedName("s.a")
    public static int[] field81;

    @ObfuscatedName("af.oa")
    public static class9 field813;

    @ObfuscatedName("s.w")
    public static byte[][][] field82;

    @ObfuscatedName("af.p")
    public static class147 field828;

    @ObfuscatedName("s.d")
    public static int[] field83;

    @ObfuscatedName("af.ex")
    public static int[] field837;

    @ObfuscatedName("aj.g")
    public static class147 field840;

    @ObfuscatedName("aj.x")
    public static class147 field841;

    @ObfuscatedName("s.v")
    public static int[] field85;

    @ObfuscatedName("aj.gm")
    public static class153 field891;

    @ObfuscatedName("az.p")
    public static class147 field898;

    @ObfuscatedName("ae.x")
    public static class147 field902;

    @ObfuscatedName("ae.p")
    public static class147 field904;

    @ObfuscatedName("ae.g")
    public static class147 field915;

    @ObfuscatedName("s.n")
    public static byte[][][] field92;

    @ObfuscatedName("av.g")
    public static class147 field923;

    @ObfuscatedName("av.p")
    public static class147 field924;

    @ObfuscatedName("ax.x")
    public static int field941;

    @ObfuscatedName("ax.g")
    public static class147 field943;

    @ObfuscatedName("ax.p")
    public static class147 field952;

    @ObfuscatedName("ai.p")
    public static class147 field957;

    @ObfuscatedName("ai.is")
    public static class153 field967;

    @ObfuscatedName("aq.p")
    public static class147 field970;

    @ObfuscatedName("aq.o")
    public static String field971;

    @ObfuscatedName("aq.np")
    public static class68 field975;

    @ObfuscatedName("aq.ej")
    public static class74[] field977;

    @ObfuscatedName("ad.b")
    public static String field989;

    @ObfuscatedName("ad.ib")
    public static int field991;

    @ObfuscatedName("ad.p")
    public static class147 field995;

    @ObfuscatedName("j.g(Ldz;I)V")
    public static void method513(class110 arg0) {
        class189 var1 = (class189) class190.field2892.method3330();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1837;
        arg0.method2162(var1.field2882);
        for (int var3 = 0; var3 < var1.field2883; var3++) {
            if (var1.field2886[var3] == 0) {
                try {
                    int var4 = var1.field2884[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2887[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2159(0);
                        arg0.method2162(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2887[var3];
                        var7.setInt((Object) null, var1.field2885[var3]);
                        arg0.method2159(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2887[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2159(0);
                        arg0.method2162(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2888[var3];
                        byte[][] var11 = var1.field2889[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2159(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2159(1);
                            arg0.method2163(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2159(2);
                            arg0.method2199((String) var15);
                        } else {
                            arg0.method2159(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2888[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2159(0);
                        arg0.method2162(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2159(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2159(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2159(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2159(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2159(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2159(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2159(-16);
                } catch (SecurityException var37) {
                    arg0.method2159(-17);
                } catch (IOException var38) {
                    arg0.method2159(-18);
                } catch (NullPointerException var39) {
                    arg0.method2159(-19);
                } catch (Exception var40) {
                    arg0.method2159(-20);
                } catch (Throwable var41) {
                    arg0.method2159(-21);
                }
            } else {
                arg0.method2159(var1.field2886[var3]);
            }
        }
        arg0.method2192(var2);
        var1.method3378();
    }

    @ObfuscatedName("at.p([BIB)I")
    public static int method592(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ class107.field1836[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    @ObfuscatedName("aj.x(IIIII)V")
    public static void method710(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) class14.field198.method3263((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            class14.field198.method3264(var4, (long) arg0);
        }
        if (var4.field202.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field202.length; var7++) {
                var5[var7] = var4.field202[var7];
                var6[var7] = var4.field199[var7];
            }
            for (int var8 = var4.field202.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field202 = var5;
            var4.field199 = var6;
        }
        var4.field202[arg1] = arg2;
        var4.field199[arg1] = arg3;
    }

    @ObfuscatedName("p.x(Ljava/awt/Component;Ler;Ler;ZII)V")
    public static void method1(Component arg0, class147 arg1, class147 arg2, boolean arg3, int arg4) {
        if (!field673) {
            class28.field665 = arg4;
            class73.method1574();
            byte[] var5 = arg1.method2803("title.jpg", "");
            field649 = new class72(var5, arg0);
            field650 = field649.method1467();
            field670 = class70.method1939(arg2, "logo", "");
            field646 = class70.method1939(arg2, "titlebox", "");
            field647 = class70.method1939(arg2, "titlebutton", "");
            field648 = class70.method2023(arg2, "runes", "");
            field652 = class70.method2023(arg2, "title_mute", "");
            field653 = class70.method1939(arg2, "options_radio_buttons,0", "");
            field1282 = class70.method1939(arg2, "options_radio_buttons,2", "");
            field656 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                field656[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                field656[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                field656[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                field656[var9 + 192] = 16777215;
            }
            field1987 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                field1987[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                field1987[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                field1987[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                field1987[var13 + 192] = 16777215;
            }
            field724 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                field724[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                field724[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                field724[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                field724[var17 + 192] = 16777215;
            }
            field2022 = new int[256];
            field76 = new int[32768];
            field643 = new int[32768];
            class28.method1425((class74) null);
            field12 = new int[32768];
            field619 = new int[32768];
            if (arg3) {
                class28.field669 = "";
                class28.field671 = "";
            }
            field131 = 0;
            field611 = "";
            class28.field672 = true;
            class28.field676 = false;
            if (field813.field144) {
                class162.field2720 = 1;
                field1897 = null;
                field1890 = -1;
                field2413 = -1;
                field74 = 0;
                field1873 = false;
                field1432 = 2;
            } else {
                class148 var18 = field195;
                int var19 = var18.method2801("scape main");
                int var20 = var18.method2802(var19, "");
                class162.method2769(2, var18, var19, var20, 255, false);
            }
            class151.method2491(false);
            field673 = true;
            field649.method1476(0, 0);
            field650.method1476(382, 0);
            field670.method1615(382 - field670.field1329 / 2, 18);
        } else if (arg4 == 4) {
            class28.field665 = 4;
        }
    }

    @ObfuscatedName("x.h(III)I")
    public static final int method32(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var2 = (arg0 & 0x7F) * arg1 / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }
            return (arg0 & 0xFF80) + var2;
        }
    }

    @ObfuscatedName("z.i(I)V")
    public static final void method161() {
        if (field691 != null) {
            field691.method1045();
        }
        if (field1515 != null) {
            field1515.method1045();
        }
    }

    @ObfuscatedName("ge.ao(Lx;III)V")
    public static void method3390(class3 arg0, int arg1, int arg2) {
        if (arg0.field759 == arg1 && arg1 != -1) {
            int var3 = class38.method507(arg1).field900;
            if (var3 == 1) {
                arg0.field760 = 0;
                arg0.field761 = 0;
                arg0.field762 = arg2;
                arg0.field763 = 0;
            }
            if (var3 == 2) {
                arg0.field763 = 0;
            }
        } else if (arg1 == -1 || arg0.field759 == -1 || class38.method507(arg1).field912 >= class38.method507(arg0.field759).field912) {
            arg0.field759 = arg1;
            arg0.field760 = 0;
            arg0.field761 = 0;
            arg0.field762 = arg2;
            arg0.field763 = 0;
            arg0.field786 = arg0.field781;
        }
    }

    @ObfuscatedName("c.ah(I)V")
    public static final void method37() {
        client.method160(false);
        client.field466 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < field693.length; var1++) {
            if (field105[var1] != -1 && field693[var1] == null) {
                field693[var1] = field29.method2855(field105[var1], 0);
                if (field693[var1] == null) {
                    var0 = false;
                    client.field466++;
                }
            }
            if (field341[var1] != -1 && field580[var1] == null) {
                field580[var1] = field29.method2794(field341[var1], 0, field787[var1]);
                if (field580[var1] == null) {
                    var0 = false;
                    client.field466++;
                }
            }
        }
        if (!var0) {
            client.field362 = 1;
            return;
        }
        client.field504 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < field693.length; var3++) {
            byte[] var4 = field580[var3];
            if (var4 != null) {
                int var5 = (field2685[var3] >> 8) * 64 - field1245;
                int var6 = (field2685[var3] & 0xFF) * 64 - field2495;
                if (client.field317) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method1463(var4, var5, var6);
            }
        }
        if (!var2) {
            client.field362 = 2;
            return;
        }
        if (client.field362 != 0) {
            client.method48(class143.field2156 + class2.field25 + class2.field21 + 100 + "%" + class2.field22, true);
        }
        method161();
        client.method2();
        method161();
        field2687.method1654();
        method161();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            client.field500[var7].method3547();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field95[var8][var9][var10] = 0;
                }
            }
        }
        method161();
        class6.field80 = 99;
        field58 = new byte[4][104][104];
        field92 = new byte[4][104][104];
        field698 = new byte[4][104][104];
        field154 = new byte[4][104][104];
        field2063 = new int[4][105][105];
        field82 = new byte[4][105][105];
        field1922 = new int[105][105];
        field83 = new int[104];
        field1842 = new int[104];
        field81 = new int[104];
        field795 = new int[104];
        field85 = new int[104];
        int var11 = field693.length;
        for (class20 var12 = (class20) class20.field540.method3303(); var12 != null; var12 = (class20) class20.field540.method3300()) {
            if (var12.field546 != null) {
                field2468.method1037(var12.field546);
                var12.field546 = null;
            }
            if (var12.field553 != null) {
                field2468.method1037(var12.field553);
                var12.field553 = null;
            }
        }
        class20.field540.method3292();
        client.method160(true);
        if (!client.field317) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (field2685[var13] >> 8) * 64 - field1245;
                int var15 = (field2685[var13] & 0xFF) * 64 - field2495;
                byte[] var16 = field693[var13];
                if (var16 != null) {
                    method161();
                    int var17 = field71 * 8 - 48;
                    int var18 = field164 * 8 - 48;
                    class198[] var19 = client.field500;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field2964[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class107 var23 = new class107(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class6.method2508(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (field2685[var27] >> 8) * 64 - field1245;
                int var29 = (field2685[var27] & 0xFF) * 64 - field2495;
                byte[] var30 = field693[var27];
                if (var30 == null && field164 < 800) {
                    method161();
                    class6.method2438(var28, var29, 64, 64);
                }
            }
            client.method160(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = field580[var31];
                if (var32 != null) {
                    int var33 = (field2685[var31] >> 8) * 64 - field1245;
                    int var34 = (field2685[var31] & 0xFF) * 64 - field2495;
                    method161();
                    class79 var35 = field2687;
                    class198[] var36 = client.field500;
                    class107 var37 = new class107(var32);
                    int var38 = -1;
                    while (true) {
                        int var39 = var37.method2186();
                        if (var39 == 0) {
                            break;
                        }
                        var38 += var39;
                        int var40 = 0;
                        while (true) {
                            int var41 = var37.method2186();
                            if (var41 == 0) {
                                break;
                            }
                            var40 += var41 - 1;
                            int var42 = var40 & 0x3F;
                            int var43 = var40 >> 6 & 0x3F;
                            int var44 = var40 >> 12;
                            int var45 = var37.method2173();
                            int var46 = var45 >> 2;
                            int var47 = var45 & 0x3;
                            int var48 = var33 + var43;
                            int var49 = var34 + var42;
                            if (var48 > 0 && var49 > 0 && var48 < 103 && var49 < 103) {
                                int var50 = var44;
                                if ((class6.field95[1][var48][var49] & 0x2) == 2) {
                                    var50 = var44 - 1;
                                }
                                class198 var51 = null;
                                if (var50 >= 0) {
                                    var51 = var36[var50];
                                }
                                class6.method2465(var44, var48, var49, var38, var47, var46, var35, var51);
                            }
                        }
                    }
                }
            }
        }
        if (client.field317) {
            for (int var52 = 0; var52 < 4; var52++) {
                method161();
                for (int var53 = 0; var53 < 13; var53++) {
                    for (int var54 = 0; var54 < 13; var54++) {
                        boolean var55 = false;
                        int var56 = client.field375[var52][var53][var54];
                        if (var56 != -1) {
                            int var57 = var56 >> 24 & 0x3;
                            int var58 = var56 >> 1 & 0x3;
                            int var59 = var56 >> 14 & 0x3FF;
                            int var60 = var56 >> 3 & 0x7FF;
                            int var61 = (var59 / 8 << 8) + var60 / 8;
                            for (int var62 = 0; var62 < field2685.length; var62++) {
                                if (field2685[var62] == var61 && field693[var62] != null) {
                                    class6.method700(field693[var62], var52, var53 * 8, var54 * 8, var57, (var59 & 0x7) * 8, (var60 & 0x7) * 8, var58, client.field500);
                                    var55 = true;
                                    break;
                                }
                            }
                        }
                        if (!var55) {
                            int var63 = var52;
                            int var64 = var53 * 8;
                            int var65 = var54 * 8;
                            for (int var66 = 0; var66 < 8; var66++) {
                                for (int var67 = 0; var67 < 8; var67++) {
                                    class6.field84[var63][var64 + var66][var65 + var67] = 0;
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class6.field84[var63][var64][var65 + var68] = class6.field84[var63][var64 - 1][var65 + var68];
                                }
                            }
                            if (var65 > 0) {
                                for (int var69 = 1; var69 < 8; var69++) {
                                    class6.field84[var63][var64 + var69][var65] = class6.field84[var63][var64 + var69][var65 - 1];
                                }
                            }
                            if (var64 > 0 && class6.field84[var63][var64 - 1][var65] != 0) {
                                class6.field84[var63][var64][var65] = class6.field84[var63][var64 - 1][var65];
                            } else if (var65 > 0 && class6.field84[var63][var64][var65 - 1] != 0) {
                                class6.field84[var63][var64][var65] = class6.field84[var63][var64][var65 - 1];
                            } else if (var64 > 0 && var65 > 0 && class6.field84[var63][var64 - 1][var65 - 1] != 0) {
                                class6.field84[var63][var64][var65] = class6.field84[var63][var64 - 1][var65 - 1];
                            }
                        }
                    }
                }
            }
            for (int var70 = 0; var70 < 13; var70++) {
                for (int var71 = 0; var71 < 13; var71++) {
                    int var72 = client.field375[0][var70][var71];
                    if (var72 == -1) {
                        class6.method2438(var70 * 8, var71 * 8, 8, 8);
                    }
                }
            }
            client.method160(true);
            for (int var73 = 0; var73 < 4; var73++) {
                method161();
                for (int var74 = 0; var74 < 13; var74++) {
                    label959: for (int var75 = 0; var75 < 13; var75++) {
                        int var76 = client.field375[var73][var74][var75];
                        if (var76 != -1) {
                            int var77 = var76 >> 24 & 0x3;
                            int var78 = var76 >> 1 & 0x3;
                            int var79 = var76 >> 14 & 0x3FF;
                            int var80 = var76 >> 3 & 0x7FF;
                            int var81 = (var79 / 8 << 8) + var80 / 8;
                            for (int var82 = 0; var82 < field2685.length; var82++) {
                                if (field2685[var82] == var81 && field580[var82] != null) {
                                    byte[] var83 = field580[var82];
                                    int var84 = var74 * 8;
                                    int var85 = var75 * 8;
                                    int var86 = (var79 & 0x7) * 8;
                                    int var87 = (var80 & 0x7) * 8;
                                    class79 var88 = field2687;
                                    class198[] var89 = client.field500;
                                    class107 var90 = new class107(var83);
                                    int var91 = -1;
                                    while (true) {
                                        int var92 = var90.method2186();
                                        if (var92 == 0) {
                                            continue label959;
                                        }
                                        var91 += var92;
                                        int var93 = 0;
                                        while (true) {
                                            int var94 = var90.method2186();
                                            if (var94 == 0) {
                                                break;
                                            }
                                            var93 += var94 - 1;
                                            int var95 = var93 & 0x3F;
                                            int var96 = var93 >> 6 & 0x3F;
                                            int var97 = var93 >> 12;
                                            int var98 = var90.method2173();
                                            int var99 = var98 >> 2;
                                            int var100 = var98 & 0x3;
                                            if (var77 == var97 && var96 >= var86 && var96 < var86 + 8 && var95 >= var87 && var95 < var87 + 8) {
                                                class36 var101 = class36.method2523(var91);
                                                int var103 = var96 & 0x7;
                                                int var104 = var95 & 0x7;
                                                int var106 = var101.field853;
                                                int var107 = var101.field873;
                                                if ((var100 & 0x1) == 1) {
                                                    int var108 = var106;
                                                    var106 = var107;
                                                    var107 = var108;
                                                }
                                                int var109 = var78 & 0x3;
                                                int var110;
                                                if (var109 == 0) {
                                                    var110 = var103;
                                                } else if (var109 == 1) {
                                                    var110 = var104;
                                                } else if (var109 == 2) {
                                                    var110 = 7 - var103 - (var106 - 1);
                                                } else {
                                                    var110 = 7 - var104 - (var107 - 1);
                                                }
                                                int var111 = var84 + var110;
                                                int var113 = var96 & 0x7;
                                                int var114 = var95 & 0x7;
                                                int var116 = var101.field853;
                                                int var117 = var101.field873;
                                                if ((var100 & 0x1) == 1) {
                                                    int var118 = var116;
                                                    var116 = var117;
                                                    var117 = var118;
                                                }
                                                int var119 = var78 & 0x3;
                                                int var120;
                                                if (var119 == 0) {
                                                    var120 = var114;
                                                } else if (var119 == 1) {
                                                    var120 = 7 - var113 - (var116 - 1);
                                                } else if (var119 == 2) {
                                                    var120 = 7 - var114 - (var117 - 1);
                                                } else {
                                                    var120 = var113;
                                                }
                                                int var121 = var85 + var120;
                                                if (var111 > 0 && var121 > 0 && var111 < 103 && var121 < 103) {
                                                    int var122 = var73;
                                                    if ((class6.field95[1][var111][var121] & 0x2) == 2) {
                                                        var122 = var73 - 1;
                                                    }
                                                    class198 var123 = null;
                                                    if (var122 >= 0) {
                                                        var123 = var89[var122];
                                                    }
                                                    class6.method2465(var73, var111, var121, var91, var78 + var100 & 0x3, var99, var88, var123);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        client.method160(true);
        client.method2();
        method161();
        class79 var124 = field2687;
        class198[] var125 = client.field500;
        for (int var126 = 0; var126 < 4; var126++) {
            for (int var127 = 0; var127 < 104; var127++) {
                for (int var128 = 0; var128 < 104; var128++) {
                    if ((class6.field95[var126][var127][var128] & 0x1) == 1) {
                        int var129 = var126;
                        if ((class6.field95[1][var127][var128] & 0x2) == 2) {
                            var129 = var126 - 1;
                        }
                        if (var129 >= 0) {
                            var125[var129].method3576(var127, var128);
                        }
                    }
                }
            }
        }
        class6.field78 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field78 < -8) {
            class6.field78 = -8;
        }
        if (class6.field78 > 8) {
            class6.field78 = 8;
        }
        class6.field79 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field79 < -16) {
            class6.field79 = -16;
        }
        if (class6.field79 > 16) {
            class6.field79 = 16;
        }
        for (int var130 = 0; var130 < 4; var130++) {
            byte[][] var131 = field82[var130];
            int var132 = (int) Math.sqrt(5100.0D);
            int var133 = var132 * 768 >> 8;
            for (int var134 = 1; var134 < 103; var134++) {
                for (int var135 = 1; var135 < 103; var135++) {
                    int var136 = class6.field84[var130][var135 + 1][var134] - class6.field84[var130][var135 - 1][var134];
                    int var137 = class6.field84[var130][var135][var134 + 1] - class6.field84[var130][var135][var134 - 1];
                    int var138 = (int) Math.sqrt((double) (var137 * var137 + var136 * var136 + 65536));
                    int var139 = (var136 << 8) / var138;
                    int var140 = 65536 / var138;
                    int var141 = (var137 << 8) / var138;
                    int var142 = (var141 * -50 + var139 * -50 + var140 * -10) / var133 + 96;
                    int var143 = (var131[var135][var134] >> 1) + (var131[var135][var134 + 1] >> 3) + (var131[var135][var134 - 1] >> 2) + (var131[var135 - 1][var134] >> 2) + (var131[var135 + 1][var134] >> 3);
                    field1922[var135][var134] = var142 - var143;
                }
            }
            for (int var144 = 0; var144 < 104; var144++) {
                field83[var144] = 0;
                field1842[var144] = 0;
                field81[var144] = 0;
                field795[var144] = 0;
                field85[var144] = 0;
            }
            for (int var145 = -5; var145 < 109; var145++) {
                for (int var146 = 0; var146 < 104; var146++) {
                    int var147 = var145 + 5;
                    int var10002;
                    if (var147 >= 0 && var147 < 104) {
                        int var148 = field58[var130][var147][var146] & 0xFF;
                        if (var148 > 0) {
                            class37 var149 = class37.method18(var148 - 1);
                            field83[var146] += var149.field892;
                            field1842[var146] += var149.field896;
                            field81[var146] += var149.field899;
                            field795[var146] += var149.field897;
                            var10002 = field85[var146]++;
                        }
                    }
                    int var150 = var145 - 5;
                    if (var150 >= 0 && var150 < 104) {
                        int var151 = field58[var130][var150][var146] & 0xFF;
                        if (var151 > 0) {
                            class37 var152 = class37.method18(var151 - 1);
                            field83[var146] -= var152.field892;
                            field1842[var146] -= var152.field896;
                            field81[var146] -= var152.field899;
                            field795[var146] -= var152.field897;
                            var10002 = field85[var146]--;
                        }
                    }
                }
                if (var145 >= 1 && var145 < 103) {
                    int var153 = 0;
                    int var154 = 0;
                    int var155 = 0;
                    int var156 = 0;
                    int var157 = 0;
                    for (int var158 = -5; var158 < 109; var158++) {
                        int var159 = var158 + 5;
                        if (var159 >= 0 && var159 < 104) {
                            var153 += field83[var159];
                            var154 += field1842[var159];
                            var155 += field81[var159];
                            var156 += field795[var159];
                            var157 += field85[var159];
                        }
                        int var160 = var158 - 5;
                        if (var160 >= 0 && var160 < 104) {
                            var153 -= field83[var160];
                            var154 -= field1842[var160];
                            var155 -= field81[var160];
                            var156 -= field795[var160];
                            var157 -= field85[var160];
                        }
                        if (var158 >= 1 && var158 < 103 && (!client.field459 || (class6.field95[0][var145][var158] & 0x2) != 0 || (class6.field95[var130][var145][var158] & 0x10) == 0 && class6.method44(var130, var145, var158) == client.field485)) {
                            if (var130 < class6.field80) {
                                class6.field80 = var130;
                            }
                            int var161 = field58[var130][var145][var158] & 0xFF;
                            int var162 = field92[var130][var145][var158] & 0xFF;
                            if (var161 > 0 || var162 > 0) {
                                int var163 = class6.field84[var130][var145][var158];
                                int var164 = class6.field84[var130][var145 + 1][var158];
                                int var165 = class6.field84[var130][var145 + 1][var158 + 1];
                                int var166 = class6.field84[var130][var145][var158 + 1];
                                int var167 = field1922[var145][var158];
                                int var168 = field1922[var145 + 1][var158];
                                int var169 = field1922[var145 + 1][var158 + 1];
                                int var170 = field1922[var145][var158 + 1];
                                int var171 = -1;
                                int var172 = -1;
                                if (var161 > 0) {
                                    int var173 = var153 * 256 / var156;
                                    int var174 = var154 / var157;
                                    int var175 = var155 / var157;
                                    var171 = class6.method2119(var173, var174, var175);
                                    int var176 = class6.field78 + var173 & 0xFF;
                                    int var177 = class6.field79 + var175;
                                    if (var177 < 0) {
                                        var177 = 0;
                                    } else if (var177 > 255) {
                                        var177 = 255;
                                    }
                                    var172 = class6.method2119(var176, var174, var177);
                                }
                                if (var130 > 0) {
                                    boolean var178 = true;
                                    if (var161 == 0 && field698[var130][var145][var158] != 0) {
                                        var178 = false;
                                    }
                                    if (var162 > 0 && !class41.method1427(var162 - 1).field965) {
                                        var178 = false;
                                    }
                                    if (var178 && var163 == var164 && var163 == var165 && var163 == var166) {
                                        field2063[var130][var145][var158] |= 0x924;
                                    }
                                }
                                int var179 = 0;
                                if (var172 != -1) {
                                    var179 = class84.field1476[class6.method2947(var172, 96)];
                                }
                                if (var162 == 0) {
                                    var124.method1659(var130, var145, var158, 0, 0, -1, var163, var164, var165, var166, class6.method2947(var171, var167), class6.method2947(var171, var168), class6.method2947(var171, var169), class6.method2947(var171, var170), 0, 0, 0, 0, var179, 0);
                                } else {
                                    int var180 = field698[var130][var145][var158] + 1;
                                    byte var181 = field154[var130][var145][var158];
                                    class41 var182 = class41.method1427(var162 - 1);
                                    int var183 = var182.field958;
                                    int var184;
                                    int var185;
                                    if (var183 >= 0) {
                                        var184 = field1486.method1910(var183);
                                        var185 = -1;
                                    } else if (var182.field954 == 16711935) {
                                        var185 = -2;
                                        var183 = -1;
                                        var184 = -2;
                                    } else {
                                        var185 = class6.method2119(var182.field960, var182.field961, var182.field962);
                                        int var186 = class6.field78 + var182.field960 & 0xFF;
                                        int var187 = class6.field79 + var182.field962;
                                        if (var187 < 0) {
                                            var187 = 0;
                                        } else if (var187 > 255) {
                                            var187 = 255;
                                        }
                                        var184 = class6.method2119(var186, var182.field961, var187);
                                    }
                                    int var188 = 0;
                                    if (var184 != -2) {
                                        var188 = class84.field1476[method32(var184, 96)];
                                    }
                                    if (var182.field959 != -1) {
                                        int var189 = class6.field78 + var182.field963 & 0xFF;
                                        int var190 = class6.field79 + var182.field956;
                                        if (var190 < 0) {
                                            var190 = 0;
                                        } else if (var190 > 255) {
                                            var190 = 255;
                                        }
                                        int var191 = class6.method2119(var189, var182.field964, var190);
                                        var188 = class84.field1476[method32(var191, 96)];
                                    }
                                    var124.method1659(var130, var145, var158, var180, var181, var183, var163, var164, var165, var166, class6.method2947(var171, var167), class6.method2947(var171, var168), class6.method2947(var171, var169), class6.method2947(var171, var170), method32(var185, var167), method32(var185, var168), method32(var185, var169), method32(var185, var170), var179, var188);
                                }
                            }
                        }
                    }
                }
            }
            for (int var192 = 1; var192 < 103; var192++) {
                for (int var193 = 1; var193 < 103; var193++) {
                    var124.method1658(var130, var193, var192, class6.method44(var130, var193, var192));
                }
            }
            field58[var130] = (byte[][]) null;
            field92[var130] = (byte[][]) null;
            field698[var130] = (byte[][]) null;
            field154[var130] = (byte[][]) null;
            field82[var130] = (byte[][]) null;
        }
        var124.method1684(-50, -10, -50);
        for (int var194 = 0; var194 < 104; var194++) {
            for (int var195 = 0; var195 < 104; var195++) {
                if ((class6.field95[1][var194][var195] & 0x2) == 2) {
                    var124.method1656(var194, var195);
                }
            }
        }
        int var196 = 1;
        int var197 = 2;
        int var198 = 4;
        for (int var199 = 0; var199 < 4; var199++) {
            if (var199 > 0) {
                var196 <<= 0x3;
                var197 <<= 0x3;
                var198 <<= 0x3;
            }
            for (int var200 = 0; var200 <= var199; var200++) {
                for (int var201 = 0; var201 <= 104; var201++) {
                    for (int var202 = 0; var202 <= 104; var202++) {
                        if ((field2063[var200][var202][var201] & var196) != 0) {
                            int var203 = var201;
                            int var204 = var201;
                            int var205 = var200;
                            int var206 = var200;
                            while (var203 > 0 && (field2063[var200][var202][var203 - 1] & var196) != 0) {
                                var203--;
                            }
                            while (var204 < 104 && (field2063[var200][var202][var204 + 1] & var196) != 0) {
                                var204++;
                            }
                            label692: while (var205 > 0) {
                                for (int var207 = var203; var207 <= var204; var207++) {
                                    if ((field2063[var205 - 1][var202][var207] & var196) == 0) {
                                        break label692;
                                    }
                                }
                                var205--;
                            }
                            label681: while (var206 < var199) {
                                for (int var208 = var203; var208 <= var204; var208++) {
                                    if ((field2063[var206 + 1][var202][var208] & var196) == 0) {
                                        break label681;
                                    }
                                }
                                var206++;
                            }
                            int var209 = (var206 + 1 - var205) * (var204 - var203 + 1);
                            if (var209 >= 8) {
                                short var210 = 240;
                                int var211 = class6.field84[var206][var202][var203] - var210;
                                int var212 = class6.field84[var205][var202][var203];
                                class79.method1756(var199, 1, var202 * 128, var202 * 128, var203 * 128, var204 * 128 + 128, var211, var212);
                                for (int var213 = var205; var213 <= var206; var213++) {
                                    for (int var214 = var203; var214 <= var204; var214++) {
                                        field2063[var213][var202][var214] &= ~var196;
                                    }
                                }
                            }
                        }
                        if ((field2063[var200][var202][var201] & var197) != 0) {
                            int var215 = var202;
                            int var216 = var202;
                            int var217 = var200;
                            int var218 = var200;
                            while (var215 > 0 && (field2063[var200][var215 - 1][var201] & var197) != 0) {
                                var215--;
                            }
                            while (var216 < 104 && (field2063[var200][var216 + 1][var201] & var197) != 0) {
                                var216++;
                            }
                            label745: while (var217 > 0) {
                                for (int var219 = var215; var219 <= var216; var219++) {
                                    if ((field2063[var217 - 1][var219][var201] & var197) == 0) {
                                        break label745;
                                    }
                                }
                                var217--;
                            }
                            label734: while (var218 < var199) {
                                for (int var220 = var215; var220 <= var216; var220++) {
                                    if ((field2063[var218 + 1][var220][var201] & var197) == 0) {
                                        break label734;
                                    }
                                }
                                var218++;
                            }
                            int var221 = (var218 + 1 - var217) * (var216 - var215 + 1);
                            if (var221 >= 8) {
                                short var222 = 240;
                                int var223 = class6.field84[var218][var215][var201] - var222;
                                int var224 = class6.field84[var217][var215][var201];
                                class79.method1756(var199, 2, var215 * 128, var216 * 128 + 128, var201 * 128, var201 * 128, var223, var224);
                                for (int var225 = var217; var225 <= var218; var225++) {
                                    for (int var226 = var215; var226 <= var216; var226++) {
                                        field2063[var225][var226][var201] &= ~var197;
                                    }
                                }
                            }
                        }
                        if ((field2063[var200][var202][var201] & var198) != 0) {
                            int var227 = var202;
                            int var228 = var202;
                            int var229 = var201;
                            int var230 = var201;
                            while (var229 > 0 && (field2063[var200][var202][var229 - 1] & var198) != 0) {
                                var229--;
                            }
                            while (var230 < 104 && (field2063[var200][var202][var230 + 1] & var198) != 0) {
                                var230++;
                            }
                            label798: while (var227 > 0) {
                                for (int var231 = var229; var231 <= var230; var231++) {
                                    if ((field2063[var200][var227 - 1][var231] & var198) == 0) {
                                        break label798;
                                    }
                                }
                                var227--;
                            }
                            label787: while (var228 < 104) {
                                for (int var232 = var229; var232 <= var230; var232++) {
                                    if ((field2063[var200][var228 + 1][var232] & var198) == 0) {
                                        break label787;
                                    }
                                }
                                var228++;
                            }
                            if ((var228 - var227 + 1) * (var230 - var229 + 1) >= 4) {
                                int var233 = class6.field84[var200][var227][var229];
                                class79.method1756(var199, 4, var227 * 128, var228 * 128 + 128, var229 * 128, var230 * 128 + 128, var233, var233);
                                for (int var234 = var227; var234 <= var228; var234++) {
                                    for (int var235 = var229; var235 <= var230; var235++) {
                                        field2063[var200][var234][var235] &= ~var198;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        client.method160(true);
        int var236 = class6.field80;
        if (var236 > field243) {
            var236 = field243;
        }
        if (var236 < field243 - 1) {
            int var237 = field243 - 1;
        }
        if (client.field459) {
            field2687.method1655(class6.field80);
        } else {
            field2687.method1655(0);
        }
        for (int var238 = 0; var238 < 104; var238++) {
            for (int var239 = 0; var239 < 104; var239++) {
                client.method127(var238, var239);
            }
        }
        method161();
        client.method2645();
        class36.field884.method3227();
        if (field1514 != null) {
            client.field297.method2408(55);
            client.field297.method2162(1057001181);
        }
        if (!client.field317) {
            int var240 = (field71 - 6) / 8;
            int var241 = (field71 + 6) / 8;
            int var242 = (field164 - 6) / 8;
            int var243 = (field164 + 6) / 8;
            for (int var244 = var240 - 1; var244 <= var241 + 1; var244++) {
                for (int var245 = var242 - 1; var245 <= var243 + 1; var245++) {
                    if (var244 < var240 || var244 > var241 || var245 < var242 || var245 > var243) {
                        field29.method2806("m" + var244 + "_" + var245);
                        field29.method2806("l" + var244 + "_" + var245);
                    }
                }
            }
        }
        client.method2490(30);
        method161();
        field58 = (byte[][][]) null;
        field92 = (byte[][][]) null;
        field698 = (byte[][][]) null;
        field154 = (byte[][][]) null;
        field2063 = (int[][][]) null;
        field82 = (byte[][][]) null;
        field1922 = (int[][]) null;
        field83 = null;
        field1842 = null;
        field81 = null;
        field795 = null;
        field85 = null;
        client.field297.method2408(216);
        field61.method2502();
        for (int var246 = 0; var246 < 32; var246++) {
            client.field2040[var246] = 0L;
        }
        for (int var247 = 0; var247 < 32; var247++) {
            client.field2045[var247] = 0L;
        }
        field1268 = 0;
    }

    @ObfuscatedName("db.cy(IIB)V")
    public static void method2654(int arg0, int arg1) {
        client.method2756(field1460, arg0, arg1);
        field1460 = null;
    }

    @ObfuscatedName("l.ck(Leq;I)Leq;")
    public static class153 method486(class153 arg0) {
        class153 var1 = client.method596(arg0);
        if (var1 == null) {
            var1 = arg0.field2600;
        }
        return var1;
    }

    @ObfuscatedName("b.dh(II)V")
    public static final void method154(int arg0) {
        if (class153.method487(arg0)) {
            client.method134(field2572[arg0], -1);
        }
    }
}
