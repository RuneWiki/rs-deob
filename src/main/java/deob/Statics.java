package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("az.j")
    public static class146 field1000;

    @ObfuscatedName("az.bz")
    public static int field1001;

    @ObfuscatedName("az.e")
    public static class146 field1004;

    @ObfuscatedName("au.z")
    public static class146 field1010;

    @ObfuscatedName("au.y")
    public static boolean field1011;

    @ObfuscatedName("au.k")
    public static class191 field1023;

    @ObfuscatedName("au.j")
    public static class146 field1052;

    @ObfuscatedName("au.bf")
    public static FontMetrics field1056;

    @ObfuscatedName("au.in")
    public static int field1057;

    @ObfuscatedName("ac.oq")
    public static int field1060;

    @ObfuscatedName("ac.z")
    public static int field1061;

    @ObfuscatedName("ac.cn")
    public static int field1063;

    @ObfuscatedName("ac.nw")
    public static int field1069;

    @ObfuscatedName("ao.j")
    public static class47 field1073;

    @ObfuscatedName("ap.r")
    public static int field1080;

    @ObfuscatedName("ap.h")
    public static boolean field1086;

    @ObfuscatedName("ap.y")
    public static int field1090;

    @ObfuscatedName("j.g")
    public static int[] field11;

    @ObfuscatedName("bg.at")
    public static int field1122;

    @ObfuscatedName("bg.o")
    public static int[] field1124;

    @ObfuscatedName("bg.ex")
    public static class72[] field1125;

    @ObfuscatedName("bh.b")
    public static float field1148;

    @ObfuscatedName("bh.n")
    public static int field1149;

    @ObfuscatedName("bk.q")
    public static int[] field1175;

    @ObfuscatedName("bk.a")
    public static int[] field1178;

    @ObfuscatedName("bk.i")
    public static boolean[] field1184;

    @ObfuscatedName("bx.a")
    public static int field1193;

    @ObfuscatedName("bx.k")
    public static byte[] field1199;

    @ObfuscatedName("bx.b")
    public static int field1200;

    @ObfuscatedName("bx.n")
    public static int field1201;

    @ObfuscatedName("bx.w")
    public static float[] field1202;

    @ObfuscatedName("bx.q")
    public static int field1203;

    @ObfuscatedName("bx.i")
    public static class67[] field1204;

    @ObfuscatedName("bx.al")
    public static float[] field1205;

    @ObfuscatedName("bx.o")
    public static class54[] field1206;

    @ObfuscatedName("bx.t")
    public static class62[] field1207;

    @ObfuscatedName("bx.f")
    public static class61[] field1208;

    @ObfuscatedName("bx.af")
    public static float[] field1209;

    @ObfuscatedName("bx.p")
    public static float[] field1215;

    @ObfuscatedName("bx.l")
    public static float[] field1216;

    @ObfuscatedName("bx.c")
    public static boolean[] field1217;

    @ObfuscatedName("bx.x")
    public static float[] field1218;

    @ObfuscatedName("bx.aj")
    public static float[] field1219;

    @ObfuscatedName("k.ao")
    public static class17 field122;

    @ObfuscatedName("bx.d")
    public static int[] field1221;

    @ObfuscatedName("bx.ai")
    public static int[] field1222;

    @ObfuscatedName("bx.ak")
    public static int[] field1223;

    @ObfuscatedName("b.ez")
    public static class72[] field125;

    @ObfuscatedName("bb.dr")
    public static class79 field1257;

    @ObfuscatedName("b.w")
    public static int[] field126;

    @ObfuscatedName("bo.bs")
    public static class147 field1271;

    @ObfuscatedName("bo.pl")
    public static Font field1272;

    @ObfuscatedName("bl.ph")
    public static Frame field1278;

    @ObfuscatedName("bl.pf")
    public static int field1281;

    @ObfuscatedName("bl.fl")
    public static int field1282;

    @ObfuscatedName("bl.ew")
    public static class74[] field1284;

    @ObfuscatedName("bl.k")
    public static int field1285;

    @ObfuscatedName("ba.y")
    public static int field1287;

    @ObfuscatedName("ba.z")
    public static int field1288;

    @ObfuscatedName("ba.r")
    public static int[] field1289;

    @ObfuscatedName("ba.j")
    public static int field1290;

    @ObfuscatedName("bu.t")
    public static int field1317;

    @ObfuscatedName("bu.f")
    public static int[] field1318;

    @ObfuscatedName("bu.o")
    public static int field1321;

    @ObfuscatedName("b.k")
    public static int[] field134;

    @ObfuscatedName("bc.t")
    public static int[] field1341;

    @ObfuscatedName("n.am")
    public static class130 field135;

    @ObfuscatedName("bj.q")
    public static int[] field1351;

    @ObfuscatedName("bj.mc")
    public static class50 field1352;

    @ObfuscatedName("bv.dd")
    public static int[][] field1356;

    @ObfuscatedName("bv.mp")
    public static int field1357;

    @ObfuscatedName("cc.bf")
    public static int field1358;

    @ObfuscatedName("cc.g")
    public static int field1375;

    @ObfuscatedName("cc.m")
    public static int field1376;

    @ObfuscatedName("cc.be")
    public static int field1377;

    @ObfuscatedName("cc.v")
    public static int field1378;

    @ObfuscatedName("cc.u")
    public static int field1379;

    @ObfuscatedName("n.t")
    public static int[][][] field138;

    @ObfuscatedName("cc.p")
    public static int field1380;

    @ObfuscatedName("cc.w")
    public static int field1382;

    @ObfuscatedName("cc.x")
    public static int field1383;

    @ObfuscatedName("cc.l")
    public static int field1384;

    @ObfuscatedName("cc.al")
    public static int field1385;

    @ObfuscatedName("cc.af")
    public static int field1386;

    @ObfuscatedName("cc.ai")
    public static int field1387;

    @ObfuscatedName("cc.ak")
    public static int field1388;

    @ObfuscatedName("cc.s")
    public static int field1389;

    @ObfuscatedName("cc.aj")
    public static int field1399;

    @ObfuscatedName("cc.bs")
    public static int field1403;

    @ObfuscatedName("cc.bh")
    public static boolean[][] field1408;

    @ObfuscatedName("n.oa")
    public static class121 field141;

    @ObfuscatedName("cc.bt")
    public static int field1416;

    @ObfuscatedName("cc.bk")
    public static int field1418;

    @ObfuscatedName("cc.bi")
    public static int field1420;

    @ObfuscatedName("n.iw")
    public static int field143;

    @ObfuscatedName("n.mt")
    public static class49 field144;

    @ObfuscatedName("n.pj")
    public static int field145;

    @ObfuscatedName("cy.aw")
    public static class133 field1457;

    @ObfuscatedName("cr.v")
    public static int field1459;

    @ObfuscatedName("n.ns")
    public static int field146;

    @ObfuscatedName("cr.al")
    public static class85 field1465;

    @ObfuscatedName("cr.q")
    public static int field1468;

    @ObfuscatedName("cr.i")
    public static int field1469;

    @ObfuscatedName("cr.m")
    public static int field1470;

    @ObfuscatedName("cr.u")
    public static int field1472;

    @ObfuscatedName("cr.p")
    public static int field1473;

    @ObfuscatedName("cr.l")
    public static int field1474;

    @ObfuscatedName("cr.w")
    public static int field1475;

    @ObfuscatedName("n.lh")
    public static byte field148;

    @ObfuscatedName("n.fd")
    public static int field149;

    @ObfuscatedName("co.hs")
    public static int field1490;

    @ObfuscatedName("co.eu")
    public static int[] field1491;

    @ObfuscatedName("cb.hi")
    public static int field1494;

    @ObfuscatedName("cb.nu")
    public static int field1504;

    @ObfuscatedName("cb.dm")
    public static int field1507;

    @ObfuscatedName("cp.pz")
    public static Canvas field1521;

    @ObfuscatedName("cp.on")
    public static class120 field1523;

    @ObfuscatedName("cm.ee")
    public static class72 field1525;

    @ObfuscatedName("cm.kj")
    public static class118 field1529;

    @ObfuscatedName("cz.m")
    public static String field1567;

    @ObfuscatedName("ct.u")
    public static String field1578;

    @ObfuscatedName("q.eo")
    public static class72[] field166;

    @ObfuscatedName("ca.ft")
    public static int field1661;

    @ObfuscatedName("ci.n")
    public static byte[][] field1670;

    @ObfuscatedName("ck.z")
    public static class146 field1676;

    @ObfuscatedName("ck.q")
    public static boolean field1677;

    @ObfuscatedName("cw.fi")
    public static int field1687;

    @ObfuscatedName("cw.io")
    public static class152 field1701;

    @ObfuscatedName("i.s")
    public static class12 field174;

    @ObfuscatedName("cl.bg")
    public static int field1754;

    @ObfuscatedName("cl.bd")
    public static int field1755;

    @ObfuscatedName("cl.bp")
    public static int field1756;

    @ObfuscatedName("ce.k")
    public static class138 field1769;

    @ObfuscatedName("i.np")
    public static int field177;

    @ObfuscatedName("i.kh")
    public static class152[] field178;

    @ObfuscatedName("cv.bk")
    public static class147 field1820;

    @ObfuscatedName("cv.b")
    public static short[][] field1822;

    @ObfuscatedName("cv.bp")
    public static class147 field1827;

    @ObfuscatedName("cn.z")
    public static long field1829;

    @ObfuscatedName("cn.j")
    public static long field1831;

    @ObfuscatedName("f.nx")
    public static int field185;

    @ObfuscatedName("de.h")
    public static File field1850;

    @ObfuscatedName("de.as")
    public static class74[] field1851;

    @ObfuscatedName("dw.cd")
    public static class130 field1860;

    @ObfuscatedName("dw.ba")
    public static int field1862;

    @ObfuscatedName("dn.eh")
    public static class72[] field1869;

    @ObfuscatedName("dq.ob")
    public static class123 field1884;

    @ObfuscatedName("dq.nc")
    public static int field1885;

    @ObfuscatedName("dd.mg")
    public static class21[] field1887;

    @ObfuscatedName("f.iz")
    public static int field189;

    @ObfuscatedName("dz.z")
    public static String field1892;

    @ObfuscatedName("dc.e")
    public static int[] field1900;

    @ObfuscatedName("dc.q")
    public static class152 field1901;

    @ObfuscatedName("dc.h")
    public static int[] field1905;

    @ObfuscatedName("da.ii")
    public static class152 field1912;

    @ObfuscatedName("da.c")
    public static class107 field1914;

    @ObfuscatedName("dy.y")
    public static int field1918;

    @ObfuscatedName("dy.oe")
    public static class9 field1921;

    @ObfuscatedName("dv.nr")
    public static int field1931;

    @ObfuscatedName("dv.k")
    public static short[] field1933;

    @ObfuscatedName("dx.t")
    public static int field1940;

    @ObfuscatedName("dx.db")
    public static int field1941;

    @ObfuscatedName("dg.j")
    public static String field1947;

    @ObfuscatedName("o.dz")
    public static byte[][] field195;

    @ObfuscatedName("dg.ix")
    public static int field1953;

    @ObfuscatedName("dg.fs")
    public static int field1956;

    @ObfuscatedName("du.p")
    public static int[] field1976;

    @ObfuscatedName("o.cp")
    public static char field198;

    @ObfuscatedName("o.bh")
    public static class147 field199;

    @ObfuscatedName("do.ie")
    public static int field1997;

    @ObfuscatedName("o.pu")
    public static class71 field200;

    @ObfuscatedName("ds.k")
    public static byte[][][] field2001;

    @ObfuscatedName("o.kw")
    public static int field201;

    @ObfuscatedName("dj.nk")
    public static class68 field2027;

    @ObfuscatedName("di.o")
    public static class194[] field2037;

    @ObfuscatedName("di.b")
    public static int[] field2038;

    @ObfuscatedName("di.lq")
    public static class117 field2039;

    @ObfuscatedName("df.bt")
    public static class147 field2051;

    @ObfuscatedName("ef.es")
    public static int[] field2053;

    @ObfuscatedName("ef.ps")
    public static boolean field2055;

    @ObfuscatedName("ee.z")
    public static String field2082;

    @ObfuscatedName("ee.j")
    public static Applet field2084;

    @ObfuscatedName("er.r")
    public static File field2093;

    @ObfuscatedName("er.e")
    public static int field2094;

    @ObfuscatedName("er.dq")
    public static int[] field2095;

    @ObfuscatedName("er.c")
    public static String[] field2100;

    @ObfuscatedName("er.v")
    public static String field2101;

    @ObfuscatedName("er.my")
    public static class50 field2102;

    @ObfuscatedName("er.o")
    public static class151 field2103;

    @ObfuscatedName("ek.bi")
    public static class147 field2114;

    @ObfuscatedName("ec.n")
    public static int field2121;

    @ObfuscatedName("t.bl")
    public static String field220;

    @ObfuscatedName("t.dl")
    public static byte[][] field226;

    @ObfuscatedName("t.et")
    public static int[] field227;

    @ObfuscatedName("c.ci")
    public static class191 field229;

    @ObfuscatedName("c.ap")
    public static class74[] field236;

    @ObfuscatedName("c.eg")
    public static class74[] field237;

    @ObfuscatedName("c.eq")
    public static class72[] field239;

    @ObfuscatedName("c.pr")
    public static int field240;

    @ObfuscatedName("c.ek")
    public static class72[] field241;

    @ObfuscatedName("c.ny")
    public static int field244;

    @ObfuscatedName("d.ah")
    public static class72[] field248;

    @ObfuscatedName("eu.n")
    public static int[][] field2496;

    @ObfuscatedName("eu.ay")
    public static class133 field2497;

    @ObfuscatedName("et.y")
    public static long field2505;

    @ObfuscatedName("et.f")
    public static boolean field2513;

    @ObfuscatedName("et.j")
    public static class130 field2515;

    @ObfuscatedName("em.z")
    public static boolean[] field2528;

    @ObfuscatedName("em.r")
    public static class146 field2529;

    @ObfuscatedName("em.k")
    public static class146 field2531;

    @ObfuscatedName("em.e")
    public static class146 field2562;

    @ObfuscatedName("em.j")
    public static class152[][] field2633;

    @ObfuscatedName("em.er")
    public static class74[] field2655;

    @ObfuscatedName("el.n")
    public static short[] field2668;

    @ObfuscatedName("client.o")
    public static String field267;

    @ObfuscatedName("ev.ax")
    public static class74[] field2671;

    @ObfuscatedName("fz.iv")
    public static int field2695;

    @ObfuscatedName("fz.a")
    public static class188 field2697;

    @ObfuscatedName("fi.z")
    public static class146 field2713;

    @ObfuscatedName("fi.h")
    public static class162 field2714;

    @ObfuscatedName("fi.y")
    public static class146 field2715;

    @ObfuscatedName("fi.j")
    public static class146 field2718;

    @ObfuscatedName("z.ed")
    public static int[] field28;

    @ObfuscatedName("gx.x")
    public static int[] field2869;

    @ObfuscatedName("gx.be")
    public static class147 field2873;

    @ObfuscatedName("gm.bm")
    public static class147 field2874;

    @ObfuscatedName("gt.a")
    public static int field2886;

    @ObfuscatedName("gt.h")
    public static byte[][][] field2888;

    @ObfuscatedName("gt.j")
    public static class102 field2889;

    @ObfuscatedName("gh.a")
    public static class74[] field2894;

    @ObfuscatedName("ge.dw")
    public static int[] field2912;

    @ObfuscatedName("client.ab")
    public static class147 field292;

    @ObfuscatedName("gi.a")
    public static class74 field2920;

    @ObfuscatedName("client.ah")
    public static class147 field293;

    @ObfuscatedName("gu.f")
    public static int[] field2955;

    @ObfuscatedName("gc.d")
    public static String[] field2958;

    @ObfuscatedName("gp.j")
    public static class146 field2960;

    @ObfuscatedName("client.cu")
    public static int field316;

    @ObfuscatedName("client.ch")
    public static class130 field329;

    @ObfuscatedName("client.hj")
    public static class3 field391;

    @ObfuscatedName("client.ax")
    public static class147 field436;

    @ObfuscatedName("client.kb")
    public static int field449;

    @ObfuscatedName("client.dn")
    public static int[] field451;

    @ObfuscatedName("client.z")
    public static client field475;

    @ObfuscatedName("h.ep")
    public static class72[] field49;

    @ObfuscatedName("client.ac")
    public static long field493;

    @ObfuscatedName("g.e")
    public static class66 field526;

    @ObfuscatedName("h.kn")
    public static int field53;

    @ObfuscatedName("g.cm")
    public static int field530;

    @ObfuscatedName("g.fz")
    public static int field531;

    @ObfuscatedName("g.cv")
    public static int field534;

    @ObfuscatedName("s.pg")
    public static int field547;

    @ObfuscatedName("h.nf")
    public static int field55;

    @ObfuscatedName("m.d")
    public static int[] field559;

    @ObfuscatedName("m.m")
    public static class107 field566;

    @ObfuscatedName("h.gn")
    public static class152 field57;

    @ObfuscatedName("v.ma")
    public static class72 field571;

    @ObfuscatedName("v.pa")
    public static String field574;

    @ObfuscatedName("h.aq")
    public static boolean field58;

    @ObfuscatedName("u.of")
    public static Clipboard field586;

    @ObfuscatedName("u.ec")
    public static class72[] field589;

    @ObfuscatedName("h.ib")
    public static class27 field59;

    @ObfuscatedName("u.nq")
    public static int field590;

    @ObfuscatedName("u.ap")
    public static class147 field591;

    @ObfuscatedName("u.oh")
    public static class145 field595;

    @ObfuscatedName("l.ge")
    public static class152 field618;

    @ObfuscatedName("w.a")
    public static short[][] field619;

    @ObfuscatedName("w.ei")
    public static class74 field622;

    @ObfuscatedName("w.gk")
    public static class152 field623;

    @ObfuscatedName("w.bq")
    public static int field627;

    @ObfuscatedName("w.w")
    public static int[] field628;

    @ObfuscatedName("al.k")
    public static class74 field647;

    @ObfuscatedName("al.z")
    public static class74 field648;

    @ObfuscatedName("al.y")
    public static class74 field649;

    @ObfuscatedName("al.m")
    public static int[] field650;

    @ObfuscatedName("al.r")
    public static class72 field651;

    @ObfuscatedName("al.j")
    public static boolean field653;

    @ObfuscatedName("al.b")
    public static class74[] field654;

    @ObfuscatedName("al.n")
    public static class74 field655;

    @ObfuscatedName("al.aa")
    public static String field656;

    @ObfuscatedName("al.e")
    public static class72 field659;

    @ObfuscatedName("r.ao")
    public static class147 field67;

    @ObfuscatedName("al.l")
    public static int[] field671;

    @ObfuscatedName("al.h")
    public static class74[] field673;

    @ObfuscatedName("al.bg")
    public static class74 field682;

    @ObfuscatedName("af.ir")
    public static int field690;

    @ObfuscatedName("r.h")
    public static class146 field70;

    @ObfuscatedName("ai.s")
    public static int[] field701;

    @ObfuscatedName("ai.i")
    public static class158 field702;

    @ObfuscatedName("r.as")
    public static class147 field71;

    @ObfuscatedName("ak.ey")
    public static class72 field710;

    @ObfuscatedName("ak.f")
    public static class53 field711;

    @ObfuscatedName("ae.z")
    public static File field717;

    @ObfuscatedName("ae.i")
    public static class152 field725;

    @ObfuscatedName("ae.bp")
    public static class22[] field728;

    @ObfuscatedName("ae.h")
    public static String[] field732;

    @ObfuscatedName("ae.y")
    public static int[] field733;

    @ObfuscatedName("e.e")
    public static byte[][][] field77;

    @ObfuscatedName("e.b")
    public static byte[][][] field78;

    @ObfuscatedName("e.a")
    public static int[] field79;

    @ObfuscatedName("ag.ca")
    public static class191 field792;

    @ObfuscatedName("ar.n")
    public static class139 field800;

    @ObfuscatedName("an.j")
    public static class146 field829;

    @ObfuscatedName("av.y")
    public static class146 field840;

    @ObfuscatedName("av.hg")
    public static int field868;

    @ObfuscatedName("av.z")
    public static class146 field876;

    @ObfuscatedName("e.ce")
    public static int field88;

    @ObfuscatedName("av.ld")
    public static byte field888;

    @ObfuscatedName("aw.j")
    public static class146 field891;

    @ObfuscatedName("aq.z")
    public static class146 field901;

    @ObfuscatedName("e.ck")
    public static class191 field91;

    @ObfuscatedName("aq.y")
    public static class146 field916;

    @ObfuscatedName("aq.j")
    public static class146 field921;

    @ObfuscatedName("ad.z")
    public static class146 field924;

    @ObfuscatedName("ad.j")
    public static class146 field926;

    @ObfuscatedName("e.r")
    public static byte[][][] field93;

    @ObfuscatedName("ad.bg")
    public static class147 field940;

    @ObfuscatedName("at.z")
    public static class146 field944;

    @ObfuscatedName("at.y")
    public static int field945;

    @ObfuscatedName("k.pc")
    public static Image field95;

    @ObfuscatedName("at.j")
    public static class146 field954;

    @ObfuscatedName("at.cc")
    public static class133 field955;

    @ObfuscatedName("aa.j")
    public static class146 field957;

    @ObfuscatedName("aa.bd")
    public static class147 field958;

    @ObfuscatedName("ay.i")
    public static int[] field975;

    @ObfuscatedName("ay.j")
    public static class146 field978;

    @ObfuscatedName("ay.b")
    public static int field979;

    @ObfuscatedName("am.fv")
    public static int field986;

    @ObfuscatedName("am.j")
    public static class146 field989;

    @ObfuscatedName("er.j(Leg;II)Lfz;")
    public static class159 method2707(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2744(arg1);
        return var2 == null ? null : new class159(var2);
    }

    @ObfuscatedName("bb.z(Lde;I)Ljava/lang/String;")
    public static String method1313(class107 arg0) {
        String var4;
        try {
            int var1 = arg0.method2197();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1847 += field2889.method2066(arg0.field1849, arg0.field1847, var2, 0, var1);
            String var3 = class199.method3323(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }

    @ObfuscatedName("ed.z(CI)C")
    public static char method2852(char arg0) {
        if (arg0 == 198) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (arg0 == 338) {
            return 'E';
        } else {
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @ObfuscatedName("cb.h(I)V")
    public static void method1872() {
        class14.field203 = new class174(32);
    }

    @ObfuscatedName("h.j(Leg;Leg;I)V")
    public static void method32(class146 arg0, class146 arg1) {
        field829 = arg0;
        field1676 = arg1;
    }

    @ObfuscatedName("v.j(Leg;Leg;ZLgq;I)V")
    public static void method453(class146 arg0, class146 arg1, boolean arg2, class191 arg3) {
        field1052 = arg0;
        field1010 = arg1;
        field1011 = arg2;
        field1052.method2749(10);
        field1023 = arg3;
    }

    @ObfuscatedName("x.r(Lde;IIIIIIB)V")
    public static final void method493(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2130();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2130();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2130();
                }
            }
            return;
        }
        class6.field87[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2130();
            if (var7 == 0) {
                if (arg1 == 0) {
                    class6.field92[0][arg2][arg3] = -class6.method781(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    class6.field92[arg1][arg2][arg3] = class6.field92[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2130();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    class6.field92[0][arg2][arg3] = -var8 * 8;
                } else {
                    class6.field92[arg1][arg2][arg3] = class6.field92[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                field93[arg1][arg2][arg3] = arg0.method2131();
                field77[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                field2001[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                class6.field87[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                field2888[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fi.z(Lde;IB)V")
    public static void method3046(class107 arg0, int arg1) {
        class186 var2 = new class186();
        var2.field2868 = arg0.method2130();
        var2.field2872 = arg0.method2135();
        var2.field2866 = new int[var2.field2868];
        var2.field2867 = new int[var2.field2868];
        var2.field2864 = new Field[var2.field2868];
        var2.field2865 = new int[var2.field2868];
        var2.field2870 = new Method[var2.field2868];
        var2.field2871 = new byte[var2.field2868][][];
        for (int var3 = 0; var3 < var2.field2868; var3++) {
            try {
                int var4 = arg0.method2130();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = new String(arg0.method2138());
                    String var6 = new String(arg0.method2138());
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2135();
                    }
                    var2.field2866[var3] = var4;
                    var2.field2865[var3] = var7;
                    var2.field2864[var3] = class187.method2710(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = new String(arg0.method2138());
                    String var9 = new String(arg0.method2138());
                    int var10 = arg0.method2130();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg0.method2138());
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2135();
                            var13[var14] = new byte[var15];
                            arg0.method2141(var13[var14], 0, var15);
                        }
                    }
                    var2.field2866[var3] = var4;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class187.method2710(var11[var17]);
                    }
                    var2.field2870[var3] = class187.method2710(var8).getDeclaredMethod(var9, var16);
                    var2.field2871[var3] = var13;
                }
            } catch (ClassNotFoundException var23) {
                var2.field2867[var3] = -1;
            } catch (SecurityException var24) {
                var2.field2867[var3] = -2;
            } catch (NullPointerException var25) {
                var2.field2867[var3] = -3;
            } catch (Exception var26) {
                var2.field2867[var3] = -4;
            } catch (Throwable var27) {
                var2.field2867[var3] = -5;
            }
        }
        class187.field2875.method3253(var2);
    }

    @ObfuscatedName("eh.z(III)Lem;")
    public static class152 method2714(int arg0, int arg1) {
        class152 var2 = class152.method2559(arg0);
        if (arg1 == -1) {
            return var2;
        } else if (var2 == null || var2.field2541 == null || arg1 >= var2.field2541.length) {
            return null;
        } else {
            return var2.field2541[arg1];
        }
    }

    @ObfuscatedName("ei.a(II)Lck;")
    public static class96 method2851(int arg0) {
        class96 var1 = (class96) class38.field904.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = field901;
        class146 var3 = field916;
        boolean var4 = true;
        int[] var5 = var2.method2748(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2745(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2745(var8, 0);
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
            class38.field904.method3173(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("o.h(IS)V")
    public static void method154(int arg0) {
        if (arg0 == -1 || !field2528[arg0]) {
            return;
        }
        field70.method2764(arg0);
        if (field2633[arg0] == null) {
            return;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < field2633[arg0].length; var2++) {
            if (field2633[arg0][var2] != null) {
                if (field2633[arg0][var2].field2539 == 2) {
                    var1 = false;
                } else {
                    field2633[arg0][var2] = null;
                }
            }
        }
        if (var1) {
            field2633[arg0] = null;
        }
        field2528[arg0] = false;
    }

    @ObfuscatedName("h.h(B)V")
    public static void method35() {
        try {
            File var0 = new File(field1578, "random.dat");
            if (var0.exists()) {
                class136.field2097 = new class194(new class193(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field2958.length; var1++) {
                    for (int var2 = 0; var2 < field2100.length; var2++) {
                        File var3 = new File(field2100[var2] + field2958[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class136.field2097 = new class194(new class193(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class136.field2097 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class136.field2097 = new class194(new class193(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("z.o(IIB)I")
    public static final int method12(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bj.c(III)I")
    public static final int method1599(int arg0, int arg1) {
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

    @ObfuscatedName("cb.v(I)V")
    public static final void method1876() {
        if (client.field277 > 1) {
            client.field277--;
        }
        if (client.field438 > 0) {
            client.field438--;
        }
        if (client.field315) {
            client.field315 = false;
            client.method27();
            return;
        }
        if (!client.field410) {
            client.field378[0] = class142.field2276;
            client.field414[0] = "";
            client.field375[0] = 1006;
            client.field408 = 1;
        }
        for (int var0 = 0; var0 < 100 && client.method1600(); var0++) {
        }
        if (client.field268 != 30) {
            return;
        }
        class187.method1887(client.field304, 156);
        Object var1 = field174.field172;
        synchronized (field174.field172) {
            if (!client.field260) {
                field174.field173 = 0;
            } else if (class127.field2019 != 0 || field174.field173 >= 40) {
                client.field304.method2369(236);
                client.field304.method2116(0);
                int var2 = client.field304.field1847;
                int var3 = 0;
                for (int var4 = 0; var4 < field174.field173 && client.field304.field1847 - var2 < 240; var4++) {
                    var3++;
                    int var5 = field174.field175[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = field174.field176[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (field174.field175[var4] == -1 && field174.field176[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (client.field390 != var6 || client.field273 != var5) {
                        int var8 = var6 - client.field390;
                        client.field390 = var6;
                        int var9 = var5 - client.field273;
                        client.field273 = var5;
                        if (client.field274 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            client.field304.method2270((client.field274 << 12) + (var8 << 6) + var9);
                            client.field274 = 0;
                        } else if (client.field274 < 8) {
                            client.field304.method2118((client.field274 << 19) + 8388608 + var7);
                            client.field274 = 0;
                        } else {
                            client.field304.method2119((client.field274 << 19) + -1073741824 + var7);
                            client.field274 = 0;
                        }
                    } else if (client.field274 < 2047) {
                        client.field274++;
                    }
                }
                client.field304.method2276(client.field304.field1847 - var2);
                if (var3 >= field174.field173) {
                    field174.field173 = 0;
                } else {
                    field174.field173 -= var3;
                    for (int var10 = 0; var10 < field174.field173; var10++) {
                        field174.field176[var10] = field174.field176[var3 + var10];
                        field174.field175[var10] = field174.field175[var3 + var10];
                    }
                }
            }
        }
        if (class127.field2019 == 1 || !field58 && class127.field2019 == 4 || class127.field2019 == 2) {
            long var12 = (class127.field2007 - client.field411) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            client.field411 = class127.field2007;
            int var14 = class127.field2021;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class127.field2020;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class127.field2019 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            client.field304.method2369(155);
            client.field304.method2119((var17 << 19) + (var18 << 20) + var16);
        }
        if (class124.field1984 > 0) {
            client.field304.method2369(57);
            client.field304.method2270(0);
            int var19 = client.field304.field1847;
            long var20 = class103.method553();
            for (int var22 = 0; var22 < class124.field1984; var22++) {
                long var23 = var20 - client.field516;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                client.field516 = var20;
                client.field304.method2118((int) var23);
                client.field304.method2256(class124.field1979[var22]);
            }
            client.field304.method2150(client.field304.field1847 - var19);
        }
        if (client.field353 > 0) {
            client.field353--;
        }
        if (class124.field1977[96] || class124.field1977[97] || class124.field1977[98] || class124.field1977[99]) {
            client.field258 = true;
        }
        if (client.field258 && client.field353 <= 0) {
            client.field353 = 20;
            client.field258 = false;
            client.field304.method2369(166);
            client.field304.method2160(client.field347);
            client.field304.method2159(client.field447);
        }
        if (field2055 && !client.field275) {
            client.field275 = true;
            client.field304.method2369(39);
            client.field304.method2116(1);
        }
        if (!field2055 && client.field275) {
            client.field275 = false;
            client.field304.method2369(39);
            client.field304.method2116(0);
        }
        if (client.field407 && field1494 != client.field400) {
            client.method1002(field534, field1063, field1494, field391.field787[0], field391.field779[0]);
        } else if (field1494 != client.field489) {
            client.field489 = field1494;
            client.method435(field1494);
        }
        if (client.field268 != 30) {
            return;
        }
        client.method1789();
        client.method5();
        client.field309++;
        if (client.field309 > 750) {
            client.method27();
            return;
        }
        client.method431();
        client.method113();
        for (int var25 = -1; var25 < client.field384; var25++) {
            int var26;
            if (var25 == -1) {
                var26 = 2047;
            } else {
                var26 = client.field385[var25];
            }
            class3 var27 = client.field383[var26];
            if (var27 != null && var27.field745 > 0) {
                var27.field745--;
                if (var27.field745 == 0) {
                    var27.field749 = null;
                }
            }
        }
        for (int var28 = 0; var28 < client.field301; var28++) {
            int var29 = client.field348[var28];
            class30 var30 = client.field300[var29];
            if (var30 != null && var30.field745 > 0) {
                var30.field745--;
                if (var30.field745 == 0) {
                    var30.field749 = null;
                }
            }
        }
        client.field340++;
        if (client.field433 != 0) {
            client.field325 += 20;
            if (client.field325 >= 400) {
                client.field433 = 0;
            }
        }
        if (field618 != null) {
            client.field490++;
            if (client.field490 >= 15) {
                client.method130(field618);
                field618 = null;
            }
        }
        class152 var31 = field1912;
        class152 var32 = field1701;
        field1912 = null;
        field1701 = null;
        client.field441 = null;
        client.field445 = false;
        client.field442 = false;
        client.field290 = 0;
        while (class124.method299() && client.field290 < 128) {
            if (client.field432 >= 2 && class124.field1977[82] && field530 == 66) {
                String var33 = "";
                Iterator var34 = class10.field151.iterator();
                while (var34.hasNext()) {
                    class31 var35 = (class31) var34.next();
                    var33 = var33 + var35.field706 + ':' + var35.field709 + '\n';
                }
                field586.setContents(new StringSelection(var33), (ClipboardOwner) null);
            } else {
                client.field485[client.field290] = field530;
                client.field426[client.field290] = field198;
                client.field290++;
            }
        }
        method1422(client.field425, 0, 0, 765, 503, 0, 0);
        client.field416++;
        while (true) {
            class1 var38;
            class152 var39;
            class152 var40;
            do {
                var38 = (class1) client.field465.method3239();
                if (var38 == null) {
                    while (true) {
                        class1 var41;
                        class152 var42;
                        class152 var43;
                        do {
                            var41 = (class1) client.field466.method3239();
                            if (var41 == null) {
                                while (true) {
                                    class1 var44;
                                    class152 var45;
                                    class152 var46;
                                    do {
                                        var44 = (class1) client.field464.method3239();
                                        if (var44 == null) {
                                            method2726();
                                            if (field57 == null && client.field437 == null) {
                                                int var47 = class127.field2019;
                                                if (client.field410) {
                                                    if (var47 != 1 && (field58 || var47 != 4)) {
                                                        int var48 = class127.field2016;
                                                        int var49 = class127.field2011 * 1253894097;
                                                        if (var48 < field1490 - 10 || var48 > field690 + field1490 + 10 || var49 < field868 - 10 || var49 > field868 + field2695 + 10) {
                                                            client.field410 = false;
                                                            client.method2734(field1490, field868, field690, field2695);
                                                        }
                                                    }
                                                    if (var47 == 1 || !field58 && var47 == 4) {
                                                        int var50 = field1490;
                                                        int var51 = field868;
                                                        int var52 = field690;
                                                        int var53 = class127.field2020;
                                                        int var54 = class127.field2021;
                                                        int var55 = -1;
                                                        for (int var56 = 0; var56 < client.field408; var56++) {
                                                            int var57 = (client.field408 - 1 - var56) * 15 + var51 + 31;
                                                            if (var53 > var50 && var53 < var50 + var52 && var54 > var57 - 13 && var54 < var57 + 3) {
                                                                var55 = var56;
                                                            }
                                                        }
                                                        if (var55 != -1 && var55 >= 0) {
                                                            int var58 = client.field272[var55];
                                                            int var59 = client.field380[var55];
                                                            int var60 = client.field375[var55];
                                                            int var61 = client.field412[var55];
                                                            String var62 = client.field378[var55];
                                                            String var63 = client.field414[var55];
                                                            client.method2420(var58, var59, var60, var61, var62, var63, class127.field2020, class127.field2021);
                                                        }
                                                        client.field410 = false;
                                                        client.method2734(field1490, field868, field690, field2695);
                                                    }
                                                } else {
                                                    label1218: {
                                                        if ((var47 == 1 || !field58 && var47 == 4) && client.field408 > 0) {
                                                            int var64 = client.field375[client.field408 - 1];
                                                            if (var64 == 39 || var64 == 40 || var64 == 41 || var64 == 42 || var64 == 43 || var64 == 33 || var64 == 34 || var64 == 35 || var64 == 36 || var64 == 37 || var64 == 38 || var64 == 1005) {
                                                                label1196: {
                                                                    int var65 = client.field272[client.field408 - 1];
                                                                    int var66 = client.field380[client.field408 - 1];
                                                                    class152 var67 = class152.method2559(var66);
                                                                    int var68 = client.method94(var67);
                                                                    boolean var69 = (var68 >> 28 & 0x1) != 0;
                                                                    if (!var69) {
                                                                        int var70 = client.method94(var67);
                                                                        boolean var71 = (var70 >> 29 & 0x1) != 0;
                                                                        if (!var71) {
                                                                            break label1196;
                                                                        }
                                                                    }
                                                                    if (field57 != null && !client.field453 && client.field409 != 1 && !client.method2055(client.field408 - 1) && client.field408 > 0) {
                                                                        method2441(client.field337, client.field478);
                                                                    }
                                                                    client.field453 = false;
                                                                    client.field381 = 0;
                                                                    if (field57 != null) {
                                                                        client.method130(field57);
                                                                    }
                                                                    field57 = class152.method2559(var66);
                                                                    client.field351 = var65;
                                                                    client.field337 = class127.field2020;
                                                                    client.field478 = class127.field2021;
                                                                    if (client.field408 > 0) {
                                                                        int var72 = client.field408 - 1;
                                                                        field59 = new class27();
                                                                        field59.field644 = client.field272[var72];
                                                                        field59.field642 = client.field380[var72];
                                                                        field59.field643 = client.field375[var72];
                                                                        field59.field641 = client.field412[var72];
                                                                        field59.field645 = client.field378[var72];
                                                                    }
                                                                    client.method130(field57);
                                                                    break label1218;
                                                                }
                                                            }
                                                        }
                                                        if ((var47 == 1 || !field58 && var47 == 4) && (client.field409 == 1 && client.field408 > 2 || client.method2055(client.field408 - 1))) {
                                                            var47 = 2;
                                                        }
                                                        if ((var47 == 1 || !field58 && var47 == 4) && client.field408 > 0) {
                                                            int var73 = client.field408 - 1;
                                                            if (var73 >= 0) {
                                                                int var74 = client.field272[var73];
                                                                int var75 = client.field380[var73];
                                                                int var76 = client.field375[var73];
                                                                int var77 = client.field412[var73];
                                                                String var78 = client.field378[var73];
                                                                String var79 = client.field414[var73];
                                                                client.method2420(var74, var75, var76, var77, var78, var79, class127.field2020, class127.field2021);
                                                            }
                                                        }
                                                        if (var47 == 2 && client.field408 > 0) {
                                                            client.method2(class127.field2020, class127.field2021);
                                                        }
                                                    }
                                                }
                                            }
                                            if (client.field437 != null) {
                                                client.method130(client.field437);
                                                field201++;
                                                if (client.field445 && client.field442) {
                                                    int var80 = class127.field2016;
                                                    int var81 = class127.field2011 * 1253894097;
                                                    int var82 = var80 - client.field439;
                                                    int var83 = var81 - client.field440;
                                                    if (var82 < client.field443) {
                                                        var82 = client.field443;
                                                    }
                                                    if (client.field437.field2546 + var82 > client.field443 + client.field346.field2546) {
                                                        var82 = client.field443 + client.field346.field2546 - client.field437.field2546;
                                                    }
                                                    if (var83 < client.field444) {
                                                        var83 = client.field444;
                                                    }
                                                    if (client.field437.field2547 + var83 > client.field444 + client.field346.field2547) {
                                                        var83 = client.field444 + client.field346.field2547 - client.field437.field2547;
                                                    }
                                                    int var84 = var82 - client.field446;
                                                    int var85 = var83 - client.field259;
                                                    int var86 = client.field437.field2600;
                                                    if (field201 > client.field437.field2570 && (var84 > var86 || var84 < -var86 || var85 > var86 || var85 < -var86)) {
                                                        client.field387 = true;
                                                    }
                                                    int var87 = client.field346.field2550 + (var82 - client.field443);
                                                    int var88 = client.field346.field2551 + (var83 - client.field444);
                                                    if (client.field437.field2603 != null && client.field387) {
                                                        class1 var89 = new class1();
                                                        var89.field3 = client.field437;
                                                        var89.field1 = var87;
                                                        var89.field5 = var88;
                                                        var89.field9 = client.field437.field2603;
                                                        class32.method451(var89);
                                                    }
                                                    if (class127.field2012 == 0) {
                                                        if (client.field387) {
                                                            if (client.field437.field2527 != null) {
                                                                class1 var90 = new class1();
                                                                var90.field3 = client.field437;
                                                                var90.field1 = var87;
                                                                var90.field5 = var88;
                                                                var90.field15 = client.field441;
                                                                var90.field9 = client.field437.field2527;
                                                                class32.method451(var90);
                                                            }
                                                            if (client.field441 != null) {
                                                                class152 var91 = client.field437;
                                                                int var92 = client.method94(var91);
                                                                int var93 = var92 >> 17 & 0x7;
                                                                int var94 = var93;
                                                                class152 var95;
                                                                if (var93 == 0) {
                                                                    var95 = null;
                                                                } else {
                                                                    int var96 = 0;
                                                                    while (true) {
                                                                        if (var96 >= var94) {
                                                                            var95 = var91;
                                                                            break;
                                                                        }
                                                                        var91 = class152.method2559(var91.field2573);
                                                                        if (var91 == null) {
                                                                            var95 = null;
                                                                            break;
                                                                        }
                                                                        var96++;
                                                                    }
                                                                }
                                                                if (var95 != null) {
                                                                    client.field304.method2369(178);
                                                                    client.field304.method2231(client.field437.field2645);
                                                                    client.field304.method2160(client.field437.field2538);
                                                                    client.field304.method2169(client.field441.field2645);
                                                                    client.field304.method2160(client.field441.field2538);
                                                                }
                                                            }
                                                        } else if ((client.field409 == 1 || client.method2055(client.field408 - 1)) && client.field408 > 2) {
                                                            client.method2(client.field446 + client.field439, client.field440 + client.field259);
                                                        } else if (client.field408 > 0) {
                                                            method2441(client.field446 + client.field439, client.field440 + client.field259);
                                                        }
                                                        client.field437 = null;
                                                    }
                                                } else if (field201 > 1) {
                                                    client.field437 = null;
                                                }
                                            }
                                            if (field57 != null) {
                                                client.method130(field57);
                                                client.field381++;
                                                if (class127.field2012 == 0) {
                                                    if (client.field453) {
                                                        if (field623 == field57 && client.field406 != client.field351) {
                                                            class152 var97 = field57;
                                                            byte var98 = 0;
                                                            if (client.field428 == 1 && var97.field2530 == 206) {
                                                                var98 = 1;
                                                            }
                                                            if (var97.field2639[client.field406] <= 0) {
                                                                var98 = 0;
                                                            }
                                                            if (class156.method554(client.method94(var97))) {
                                                                int var99 = client.field351;
                                                                int var100 = client.field406;
                                                                var97.field2639[var100] = var97.field2639[var99];
                                                                var97.field2640[var100] = var97.field2640[var99];
                                                                var97.field2639[var99] = -1;
                                                                var97.field2640[var99] = 0;
                                                            } else if (var98 == 1) {
                                                                int var101 = client.field351;
                                                                int var102 = client.field406;
                                                                while (var101 != var102) {
                                                                    if (var101 > var102) {
                                                                        var97.method2895(var101 - 1, var101);
                                                                        var101--;
                                                                    } else if (var101 < var102) {
                                                                        var97.method2895(var101 + 1, var101);
                                                                        var101++;
                                                                    }
                                                                }
                                                            } else {
                                                                var97.method2895(client.field406, client.field351);
                                                            }
                                                            client.field304.method2369(99);
                                                            client.field304.method2151(var98);
                                                            client.field304.method2158(client.field351);
                                                            client.field304.method2159(client.field406);
                                                            client.field304.method2231(field57.field2645);
                                                        }
                                                    } else if ((client.field409 == 1 || client.method2055(client.field408 - 1)) && client.field408 > 2) {
                                                        client.method2(client.field337, client.field478);
                                                    } else if (client.field408 > 0) {
                                                        method2441(client.field337, client.field478);
                                                    }
                                                    client.field490 = 10;
                                                    class127.field2019 = 0;
                                                    field57 = null;
                                                } else if (client.field381 >= 5 && (class127.field2016 > client.field337 + 5 || class127.field2016 < client.field337 - 5 || class127.field2011 * 1253894097 > client.field478 + 5 || class127.field2011 * 1253894097 < client.field478 - 5)) {
                                                    client.field453 = true;
                                                }
                                            }
                                            if (class79.field1394 != -1) {
                                                int var103 = class79.field1394;
                                                int var104 = class79.field1395;
                                                client.field304.method2369(143);
                                                client.field304.method2116(5);
                                                client.field304.method2158(field316 + var104);
                                                client.field304.method2256(class124.field1977[82] ? (class124.field1977[81] ? 2 : 1) : 0);
                                                client.field304.method2160(field88 + var103);
                                                class79.field1394 = -1;
                                                client.field370 = class127.field2020;
                                                client.field371 = class127.field2021;
                                                client.field433 = 1;
                                                client.field325 = 0;
                                                client.field494 = var103;
                                                client.field495 = var104;
                                            }
                                            if (field1912 != var31) {
                                                if (var31 != null) {
                                                    client.method130(var31);
                                                }
                                                if (field1912 != null) {
                                                    client.method130(field1912);
                                                }
                                            }
                                            if (field1701 != var32 && client.field418 == client.field417) {
                                                if (var32 != null) {
                                                    client.method130(var32);
                                                }
                                                if (field1701 != null) {
                                                    client.method130(field1701);
                                                }
                                            }
                                            if (field1701 == null) {
                                                if (client.field417 > 0) {
                                                    client.field417--;
                                                }
                                            } else if (client.field417 < client.field418) {
                                                client.field417++;
                                                if (client.field418 == client.field417) {
                                                    client.method130(field1701);
                                                }
                                            }
                                            int var105 = client.field328 + field391.field747;
                                            int var106 = client.field330 + field391.field735;
                                            if (field986 - var105 < -500 || field986 - var105 > 500 || field1282 - var106 < -500 || field1282 - var106 > 500) {
                                                field986 = var105;
                                                field1282 = var106;
                                            }
                                            if (field986 != var105) {
                                                field986 += (var105 - field986) / 16;
                                            }
                                            if (field1282 != var106) {
                                                field1282 += (var106 - field1282) / 16;
                                            }
                                            if (class127.field2012 == 4 && field58) {
                                                int var107 = class127.field2011 * 1253894097 - client.field352;
                                                client.field450 = var107 * 2;
                                                client.field352 = var107 == -1 || var107 == 1 ? class127.field2011 * 1253894097 : (client.field352 + class127.field2011 * 1253894097) / 2;
                                                int var108 = client.field373 - class127.field2016;
                                                client.field349 = var108 * 2;
                                                client.field373 = var108 == -1 || var108 == 1 ? class127.field2016 : (client.field373 + class127.field2016) / 2;
                                            } else {
                                                if (class124.field1977[96]) {
                                                    client.field349 += (-24 - client.field349) / 2;
                                                } else if (class124.field1977[97]) {
                                                    client.field349 += (24 - client.field349) / 2;
                                                } else {
                                                    client.field349 /= 2;
                                                }
                                                if (class124.field1977[98]) {
                                                    client.field450 += (12 - client.field450) / 2;
                                                } else if (class124.field1977[99]) {
                                                    client.field450 += (-12 - client.field450) / 2;
                                                } else {
                                                    client.field450 /= 2;
                                                }
                                                client.field352 = class127.field2011 * 1253894097;
                                                client.field373 = class127.field2016;
                                            }
                                            client.field447 = client.field349 / 2 + client.field447 & 0x7FF;
                                            client.field347 += client.field450 / 2;
                                            if (client.field347 < 128) {
                                                client.field347 = 128;
                                            }
                                            if (client.field347 > 383) {
                                                client.field347 = 383;
                                            }
                                            int var109 = field986 >> 7;
                                            int var110 = field1282 >> 7;
                                            int var111 = client.method107(field986, field1282, field1494);
                                            int var112 = 0;
                                            if (var109 > 3 && var110 > 3 && var109 < 100 && var110 < 100) {
                                                for (int var113 = var109 - 4; var113 <= var109 + 4; var113++) {
                                                    for (int var114 = var110 - 4; var114 <= var110 + 4; var114++) {
                                                        int var115 = field1494;
                                                        if (var115 < 3 && (class6.field87[1][var113][var114] & 0x2) == 2) {
                                                            var115++;
                                                        }
                                                        int var116 = var111 - class6.field92[var115][var113][var114];
                                                        if (var116 > var112) {
                                                            var112 = var116;
                                                        }
                                                    }
                                                }
                                            }
                                            int var117 = var112 * 192;
                                            if (var117 > 98048) {
                                                var117 = 98048;
                                            }
                                            if (var117 < 32768) {
                                                var117 = 32768;
                                            }
                                            if (var117 > client.field326) {
                                                client.field326 += (var117 - client.field326) / 24;
                                            } else if (var117 < client.field326) {
                                                client.field326 += (var117 - client.field326) / 80;
                                            }
                                            if (client.field508) {
                                                int var118 = field244 * 128 + 64;
                                                int var119 = field185 * 128 + 64;
                                                int var120 = client.method107(var118, var119, field1494) - field55;
                                                if (field1956 < var118) {
                                                    field1956 += field146 * (var118 - field1956) / 1000 + field590;
                                                    if (field1956 > var118) {
                                                        field1956 = var118;
                                                    }
                                                }
                                                if (field1956 > var118) {
                                                    field1956 -= field146 * (field1956 - var118) / 1000 + field590;
                                                    if (field1956 < var118) {
                                                        field1956 = var118;
                                                    }
                                                }
                                                if (field531 < var120) {
                                                    field531 += field146 * (var120 - field531) / 1000 + field590;
                                                    if (field531 > var120) {
                                                        field531 = var120;
                                                    }
                                                }
                                                if (field531 > var120) {
                                                    field531 -= field146 * (field531 - var120) / 1000 + field590;
                                                    if (field531 < var120) {
                                                        field531 = var120;
                                                    }
                                                }
                                                if (field1661 < var119) {
                                                    field1661 += field146 * (var119 - field1661) / 1000 + field590;
                                                    if (field1661 > var119) {
                                                        field1661 = var119;
                                                    }
                                                }
                                                if (field1661 > var119) {
                                                    field1661 -= field146 * (field1661 - var119) / 1000 + field590;
                                                    if (field1661 < var119) {
                                                        field1661 = var119;
                                                    }
                                                }
                                                int var121 = field1504 * 128 + 64;
                                                int var122 = field1069 * 128 + 64;
                                                int var123 = client.method107(var121, var122, field1494) - field177;
                                                int var124 = var121 - field1956;
                                                int var125 = var123 - field531;
                                                int var126 = var122 - field1661;
                                                int var127 = (int) Math.sqrt((double) (var124 * var124 + var126 * var126));
                                                int var128 = (int) (Math.atan2((double) var125, (double) var127) * 325.949D) & 0x7FF;
                                                int var129 = (int) (Math.atan2((double) var124, (double) var126) * -325.949D) & 0x7FF;
                                                if (var128 < 128) {
                                                    var128 = 128;
                                                }
                                                if (var128 > 383) {
                                                    var128 = 383;
                                                }
                                                if (field1687 < var128) {
                                                    field1687 += field1931 * (var128 - field1687) / 1000 + field1885;
                                                    if (field1687 > var128) {
                                                        field1687 = var128;
                                                    }
                                                }
                                                if (field1687 > var128) {
                                                    field1687 -= field1931 * (field1687 - var128) / 1000 + field1885;
                                                    if (field1687 < var128) {
                                                        field1687 = var128;
                                                    }
                                                }
                                                int var130 = var129 - field149;
                                                if (var130 > 1024) {
                                                    var130 -= 2048;
                                                }
                                                if (var130 < -1024) {
                                                    var130 += 2048;
                                                }
                                                if (var130 > 0) {
                                                    field149 += field1931 * var130 / 1000 + field1885;
                                                    field149 &= 0x7FF;
                                                }
                                                if (var130 < 0) {
                                                    field149 -= field1931 * -var130 / 1000 + field1885;
                                                    field149 &= 0x7FF;
                                                }
                                                int var131 = var129 - field149;
                                                if (var131 > 1024) {
                                                    var131 -= 2048;
                                                }
                                                if (var131 < -1024) {
                                                    var131 += 2048;
                                                }
                                                if (var131 < 0 && var130 > 0 || var131 > 0 && var130 < 0) {
                                                    field149 = var129;
                                                }
                                            }
                                            for (int var132 = 0; var132 < 5; var132++) {
                                                int var10002 = client.field513[var132]++;
                                            }
                                            int var133 = class127.method2073();
                                            int var134 = class124.field1971;
                                            if (var133 > 15000 && var134 > 15000) {
                                                client.field438 = 250;
                                                class127.field2017 = 14500;
                                                client.field304.method2369(161);
                                            }
                                            client.field334++;
                                            if (client.field334 > 500) {
                                                client.field334 = 0;
                                                int var136 = (int) (Math.random() * 8.0D);
                                                if ((var136 & 0x1) == 1) {
                                                    client.field328 += client.field522;
                                                }
                                                if ((var136 & 0x2) == 2) {
                                                    client.field330 += client.field331;
                                                }
                                                if ((var136 & 0x4) == 4) {
                                                    client.field332 += client.field333;
                                                }
                                            }
                                            if (client.field328 < -50) {
                                                client.field522 = 2;
                                            }
                                            if (client.field328 > 50) {
                                                client.field522 = -2;
                                            }
                                            if (client.field330 < -55) {
                                                client.field331 = 2;
                                            }
                                            if (client.field330 > 55) {
                                                client.field331 = -2;
                                            }
                                            if (client.field332 < -40) {
                                                client.field333 = 1;
                                            }
                                            if (client.field332 > 40) {
                                                client.field333 = -1;
                                            }
                                            client.field339++;
                                            if (client.field339 > 500) {
                                                client.field339 = 0;
                                                int var137 = (int) (Math.random() * 8.0D);
                                                if ((var137 & 0x1) == 1) {
                                                    client.field335 += client.field379;
                                                }
                                                if ((var137 & 0x2) == 2) {
                                                    client.field345 += client.field338;
                                                }
                                            }
                                            if (client.field335 < -60) {
                                                client.field379 = 2;
                                            }
                                            if (client.field335 > 60) {
                                                client.field379 = -2;
                                            }
                                            if (client.field345 < -20) {
                                                client.field338 = 1;
                                            }
                                            if (client.field345 > 10) {
                                                client.field338 = -1;
                                            }
                                            for (class34 var138 = (class34) client.field517.method3194(); var138 != null; var138 = (class34) client.field517.method3197()) {
                                                if ((long) var138.field799 < class103.method553() / 1000L - 5L) {
                                                    if (var138.field798 > 0) {
                                                        class10.method545(5, "", var138.field797 + class142.field2302);
                                                    }
                                                    if (var138.field798 == 0) {
                                                        class10.method545(5, "", var138.field797 + class142.field2303);
                                                    }
                                                    var138.method3306();
                                                }
                                            }
                                            client.field310++;
                                            if (client.field310 > 50) {
                                                client.field304.method2369(112);
                                            }
                                            try {
                                                if (field329 != null && client.field304.field1847 > 0) {
                                                    field329.method2613(client.field304.field1849, 0, client.field304.field1847);
                                                    client.field304.field1847 = 0;
                                                    client.field310 = 0;
                                                }
                                            } catch (IOException var140) {
                                                client.method27();
                                            }
                                            return;
                                        }
                                        var45 = var44.field3;
                                        if (var45.field2538 < 0) {
                                            break;
                                        }
                                        var46 = class152.method2559(var45.field2573);
                                    } while (var46 == null || var46.field2541 == null || var45.field2538 >= var46.field2541.length || var46.field2541[var45.field2538] != var45);
                                    class32.method451(var44);
                                }
                            }
                            var42 = var41.field3;
                            if (var42.field2538 < 0) {
                                break;
                            }
                            var43 = class152.method2559(var42.field2573);
                        } while (var43 == null || var43.field2541 == null || var42.field2538 >= var43.field2541.length || var43.field2541[var42.field2538] != var42);
                        class32.method451(var41);
                    }
                }
                var39 = var38.field3;
                if (var39.field2538 < 0) {
                    break;
                }
                var40 = class152.method2559(var39.field2573);
            } while (var40 == null || var40.field2541 == null || var39.field2538 >= var40.field2541.length || var40.field2541[var39.field2538] != var39);
            class32.method451(var38);
        }
    }

    @ObfuscatedName("eg.bk(ILy;IB)V")
    public static final void method2827(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x400) != 0) {
            arg1.field776 = client.field306.method2156();
            arg1.field736 = client.field306.method2130();
            arg1.field775 = client.field306.method2156();
            arg1.field777 = client.field306.method2130();
            arg1.field778 = client.field306.method2132() + client.field280;
            arg1.field744 = client.field306.method2228() + client.field280;
            arg1.field780 = client.field306.method2155();
            arg1.field786 = 1;
            arg1.field769 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field759 = client.field306.method2132();
            arg1.field760 = client.field306.method2161();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field774 = client.field306.method2228();
            int var3 = client.field306.method2135();
            arg1.field764 = var3 >> 16;
            arg1.field772 = (var3 & 0xFFFF) + client.field280;
            arg1.field770 = 0;
            arg1.field788 = 0;
            if (arg1.field772 > client.field280) {
                arg1.field770 = -1;
            }
            if (arg1.field774 == 65535) {
                arg1.field774 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var4 = client.field306.method2132();
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = client.field306.method2155();
            client.method560(arg1, var4, var5);
        }
        if ((arg2 & 0x10) != 0) {
            int var6 = client.field306.method2130();
            int var7 = client.field306.method2154();
            arg1.method572(var6, var7, client.field280);
            arg1.field755 = client.field280 + 300;
            arg1.field756 = client.field306.method2154();
            arg1.field771 = client.field306.method2155();
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field757 = client.field306.method2163();
            if (arg1.field757 == 65535) {
                arg1.field757 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field749 = client.field306.method2138();
            if (arg1.field749.charAt(0) == '~') {
                arg1.field749 = arg1.field749.substring(1);
                class10.method545(2, arg1.field32, arg1.field749);
            } else if (field391 == arg1) {
                class10.method545(2, arg1.field32, arg1.field749);
            }
            arg1.field773 = false;
            arg1.field750 = 0;
            arg1.field751 = 0;
            arg1.field745 = 150;
        }
        if ((arg2 & 0x100) != 0) {
            int var8 = client.field306.method2156();
            int var9 = client.field306.method2154();
            arg1.method572(var8, var9, client.field280);
            arg1.field755 = client.field280 + 300;
            arg1.field756 = client.field306.method2130();
            arg1.field771 = client.field306.method2154();
        }
        if ((arg2 & 0x20) != 0) {
            int var10 = client.field306.method2161();
            int var11 = client.field306.method2154();
            boolean var12 = client.field306.method2156() == 1;
            int var13 = client.field306.method2156();
            int var14 = client.field306.field1847;
            if (arg1.field32 != null && arg1.field38 != null) {
                boolean var15 = false;
                if (var11 <= 1 && client.method129(arg1.field32)) {
                    var15 = true;
                }
                if (!var15 && client.field382 == 0) {
                    client.field286.field1847 = 0;
                    client.field306.method2141(client.field286.field1849, 0, var13);
                    client.field286.field1847 = 0;
                    String var16 = class190.method3343(class197.method3147(method1313(client.field286)));
                    arg1.field749 = var16.trim();
                    arg1.field750 = var10 >> 8;
                    arg1.field751 = var10 & 0xFF;
                    arg1.field745 = 150;
                    arg1.field773 = var12;
                    if (var11 == 2 || var11 == 3) {
                        class10.method545(var12 ? 91 : 1, class2.method1971(1) + arg1.field32, var16);
                    } else if (var11 == 1) {
                        class10.method545(var12 ? 91 : 1, class2.method1971(0) + arg1.field32, var16);
                    } else {
                        class10.method545(var12 ? 90 : 2, arg1.field32, var16);
                    }
                }
            }
            client.field306.field1847 = var13 + var14;
        }
        if ((arg2 & 0x40) == 0) {
            return;
        }
        int var17 = client.field306.method2130();
        byte[] var18 = new byte[var17];
        class107 var19 = new class107(var18);
        client.field306.method2141(var18, 0, var17);
        client.field388[arg0] = var19;
        arg1.method19(var19);
    }

    @ObfuscatedName("ew.bz(I)V")
    public static final void method2726() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field408 - 1; var1++) {
                if (client.field375[var1] < 1000 && client.field375[var1 + 1] > 1000) {
                    String var2 = client.field414[var1];
                    client.field414[var1] = client.field414[var1 + 1];
                    client.field414[var1 + 1] = var2;
                    String var3 = client.field378[var1];
                    client.field378[var1] = client.field378[var1 + 1];
                    client.field378[var1 + 1] = var3;
                    int var4 = client.field375[var1];
                    client.field375[var1] = client.field375[var1 + 1];
                    client.field375[var1 + 1] = var4;
                    int var5 = client.field272[var1];
                    client.field272[var1] = client.field272[var1 + 1];
                    client.field272[var1 + 1] = var5;
                    int var6 = client.field380[var1];
                    client.field380[var1] = client.field380[var1 + 1];
                    client.field380[var1 + 1] = var6;
                    int var7 = client.field412[var1];
                    client.field412[var1] = client.field412[var1 + 1];
                    client.field412[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ba.by(IB)Ljava/lang/String;")
    public static String method1414(int arg0) {
        return client.field414[arg0].length() > 0 ? client.field378[arg0] + class142.field2285 + client.field414[arg0] : client.field378[arg0];
    }

    @ObfuscatedName("h.cd(Ljava/lang/String;Lem;I)Ljava/lang/String;")
    public static String method31(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = client.method8(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (field1457 != null) {
                    int var9 = field1457.field2078;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (field1457.field2075 != null) {
                        var8 = (String) field1457.field2075;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bz.cb(IIIIIIII)V")
    public static final void method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class152.method487(arg0)) {
            method2941(field2633[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ev.cp([Lem;IIIIIIII)V")
    public static final void method2941(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2536 || var9.field2539 == 0 || var9.field2604 || client.method94(var9) != 0 || client.field346 == var9) && var9.field2573 == arg1 && (!var9.field2536 || !client.method158(var9))) {
                int var10 = var9.field2542 + arg6;
                int var11 = var9.field2543 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2539 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2539 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2546 + var10;
                    int var19 = var9.field2547 + var11;
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
                    int var22 = var9.field2546 + var10;
                    int var23 = var9.field2547 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (client.field437 == var9) {
                    client.field445 = true;
                    client.field446 = var10;
                    client.field259 = var11;
                }
                if (!var9.field2536 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2016;
                    int var25 = class127.field2011 * 1253894097;
                    if (class127.field2019 != 0) {
                        var24 = class127.field2020;
                        var25 = class127.field2021;
                    }
                    if (var9.field2530 == 1337) {
                        client.method130(var9);
                        if (!client.field269 && !client.field410 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            client.method30(var24, var25, var12, var13);
                        }
                    } else if (var9.field2530 == 1338) {
                        client.method2692(var10, var11);
                    } else {
                        if (!client.field410 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            client.method138(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2539 == 0) {
                            if (!var9.field2536 && client.method158(var9) && field1912 != var9) {
                                continue;
                            }
                            method2941(arg0, var9.field2645, var12, var13, var14, var15, var10 - var9.field2550, var11 - var9.field2551);
                            if (var9.field2541 != null) {
                                method2941(var9.field2541, var9.field2645, var12, var13, var14, var15, var10 - var9.field2550, var11 - var9.field2551);
                            }
                            class4 var26 = (class4) client.field297.method3214((long) var9.field2645);
                            if (var26 != null) {
                                if (var26.field54 == 0 && class127.field2016 >= var12 && class127.field2011 * 1253894097 >= var13 && class127.field2016 < var14 && class127.field2011 * 1253894097 < var15 && !client.field410 && !client.field448) {
                                    client.field378[0] = class142.field2276;
                                    client.field414[0] = "";
                                    client.field375[0] = 1006;
                                    client.field408 = 1;
                                }
                                method1422(var26.field62, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2536) {
                            if (var9.field2582 && class127.field2016 >= var12 && class127.field2011 * 1253894097 >= var13 && class127.field2016 < var14 && class127.field2011 * 1253894097 < var15) {
                                for (class1 var27 = (class1) client.field464.method3236(); var27 != null; var27 = (class1) client.field464.method3243()) {
                                    if (var27.field14) {
                                        var27.method3309();
                                        var27.field3.field2636 = false;
                                    }
                                }
                                if (field201 == 0) {
                                    client.field437 = null;
                                    client.field346 = null;
                                }
                                if (!client.field410) {
                                    client.field378[0] = class142.field2276;
                                    client.field414[0] = "";
                                    client.field375[0] = 1006;
                                    client.field408 = 1;
                                }
                            }
                            boolean var28;
                            if (class127.field2016 >= var12 && class127.field2011 * 1253894097 >= var13 && class127.field2016 < var14 && class127.field2011 * 1253894097 < var15) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            boolean var29 = false;
                            if ((class127.field2012 == 1 || !field58 && class127.field2012 == 4) && var28) {
                                var29 = true;
                            }
                            boolean var30 = false;
                            if ((class127.field2019 == 1 || !field58 && class127.field2019 == 4) && class127.field2020 >= var12 && class127.field2021 >= var13 && class127.field2020 < var14 && class127.field2021 < var15) {
                                var30 = true;
                            }
                            if (var30) {
                                client.method2506(var9, class127.field2020 - var10, class127.field2021 - var11);
                            }
                            if (client.field437 != null && client.field437 != var9 && var28) {
                                int var31 = client.method94(var9);
                                boolean var32 = (var31 >> 20 & 0x1) != 0;
                                if (var32) {
                                    client.field441 = var9;
                                }
                            }
                            if (client.field346 == var9) {
                                client.field442 = true;
                                client.field443 = var10;
                                client.field444 = var11;
                            }
                            if (var9.field2604) {
                                if (var28 && client.field463 != 0 && var9.field2626 != null) {
                                    class1 var33 = new class1();
                                    var33.field14 = true;
                                    var33.field3 = var9;
                                    var33.field5 = client.field463;
                                    var33.field9 = var9.field2626;
                                    client.field464.method3253(var33);
                                }
                                if (client.field437 != null || field57 != null || client.field410) {
                                    var30 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var9.field2647 && var30) {
                                    var9.field2647 = true;
                                    if (var9.field2606 != null) {
                                        class1 var34 = new class1();
                                        var34.field14 = true;
                                        var34.field3 = var9;
                                        var34.field1 = class127.field2020 - var10;
                                        var34.field5 = class127.field2021 - var11;
                                        var34.field9 = var9.field2606;
                                        client.field464.method3253(var34);
                                    }
                                }
                                if (var9.field2647 && var29 && var9.field2607 != null) {
                                    class1 var35 = new class1();
                                    var35.field14 = true;
                                    var35.field3 = var9;
                                    var35.field1 = class127.field2016 - var10;
                                    var35.field5 = class127.field2011 * 1253894097 - var11;
                                    var35.field9 = var9.field2607;
                                    client.field464.method3253(var35);
                                }
                                if (var9.field2647 && !var29) {
                                    var9.field2647 = false;
                                    if (var9.field2608 != null) {
                                        class1 var36 = new class1();
                                        var36.field14 = true;
                                        var36.field3 = var9;
                                        var36.field1 = class127.field2016 - var10;
                                        var36.field5 = class127.field2011 * 1253894097 - var11;
                                        var36.field9 = var9.field2608;
                                        client.field466.method3253(var36);
                                    }
                                }
                                if (var29 && var9.field2620 != null) {
                                    class1 var37 = new class1();
                                    var37.field14 = true;
                                    var37.field3 = var9;
                                    var37.field1 = class127.field2016 - var10;
                                    var37.field5 = class127.field2011 * 1253894097 - var11;
                                    var37.field9 = var9.field2620;
                                    client.field464.method3253(var37);
                                }
                                if (!var9.field2636 && var28) {
                                    var9.field2636 = true;
                                    if (var9.field2610 != null) {
                                        class1 var38 = new class1();
                                        var38.field14 = true;
                                        var38.field3 = var9;
                                        var38.field1 = class127.field2016 - var10;
                                        var38.field5 = class127.field2011 * 1253894097 - var11;
                                        var38.field9 = var9.field2610;
                                        client.field464.method3253(var38);
                                    }
                                }
                                if (var9.field2636 && var28 && var9.field2611 != null) {
                                    class1 var39 = new class1();
                                    var39.field14 = true;
                                    var39.field3 = var9;
                                    var39.field1 = class127.field2016 - var10;
                                    var39.field5 = class127.field2011 * 1253894097 - var11;
                                    var39.field9 = var9.field2611;
                                    client.field464.method3253(var39);
                                }
                                if (var9.field2636 && !var28) {
                                    var9.field2636 = false;
                                    if (var9.field2632 != null) {
                                        class1 var40 = new class1();
                                        var40.field14 = true;
                                        var40.field3 = var9;
                                        var40.field1 = class127.field2016 - var10;
                                        var40.field5 = class127.field2011 * 1253894097 - var11;
                                        var40.field9 = var9.field2632;
                                        client.field466.method3253(var40);
                                    }
                                }
                                if (var9.field2623 != null) {
                                    class1 var41 = new class1();
                                    var41.field3 = var9;
                                    var41.field9 = var9.field2623;
                                    client.field465.method3253(var41);
                                }
                                if (var9.field2617 != null && client.field452 > var9.field2649) {
                                    if (var9.field2654 == null || client.field452 - var9.field2649 > 32) {
                                        class1 var46 = new class1();
                                        var46.field3 = var9;
                                        var46.field9 = var9.field2617;
                                        client.field464.method3253(var46);
                                    } else {
                                        label534: for (int var42 = var9.field2649; var42 < client.field452; var42++) {
                                            int var43 = client.field302[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2654.length; var44++) {
                                                if (var9.field2654[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field3 = var9;
                                                    var45.field9 = var9.field2617;
                                                    client.field464.method3253(var45);
                                                    break label534;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2649 = client.field452;
                                }
                                if (var9.field2596 != null && client.field454 > var9.field2650) {
                                    if (var9.field2635 == null || client.field454 - var9.field2650 > 32) {
                                        class1 var51 = new class1();
                                        var51.field3 = var9;
                                        var51.field9 = var9.field2596;
                                        client.field464.method3253(var51);
                                    } else {
                                        label510: for (int var47 = var9.field2650; var47 < client.field454; var47++) {
                                            int var48 = client.field462[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2635.length; var49++) {
                                                if (var9.field2635[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field3 = var9;
                                                    var50.field9 = var9.field2596;
                                                    client.field464.method3253(var50);
                                                    break label510;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2650 = client.field454;
                                }
                                if (var9.field2621 != null && client.field510 > var9.field2651) {
                                    if (var9.field2622 == null || client.field510 - var9.field2651 > 32) {
                                        class1 var56 = new class1();
                                        var56.field3 = var9;
                                        var56.field9 = var9.field2621;
                                        client.field464.method3253(var56);
                                    } else {
                                        label486: for (int var52 = var9.field2651; var52 < client.field510; var52++) {
                                            int var53 = client.field455[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2622.length; var54++) {
                                                if (var9.field2622[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field3 = var9;
                                                    var55.field9 = var9.field2621;
                                                    client.field464.method3253(var55);
                                                    break label486;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2651 = client.field510;
                                }
                                if (client.field457 > var9.field2648 && var9.field2556 != null) {
                                    class1 var57 = new class1();
                                    var57.field3 = var9;
                                    var57.field9 = var9.field2556;
                                    client.field464.method3253(var57);
                                }
                                if (client.field458 > var9.field2648 && var9.field2619 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field9 = var9.field2619;
                                    client.field464.method3253(var58);
                                }
                                if (client.field311 > var9.field2648 && var9.field2625 != null) {
                                    class1 var59 = new class1();
                                    var59.field3 = var9;
                                    var59.field9 = var9.field2625;
                                    client.field464.method3253(var59);
                                }
                                if (client.field460 > var9.field2648 && var9.field2591 != null) {
                                    class1 var60 = new class1();
                                    var60.field3 = var9;
                                    var60.field9 = var9.field2591;
                                    client.field464.method3253(var60);
                                }
                                var9.field2648 = client.field416;
                                if (var9.field2627 != null) {
                                    for (int var61 = 0; var61 < client.field290; var61++) {
                                        class1 var62 = new class1();
                                        var62.field3 = var9;
                                        var62.field7 = client.field485[var61];
                                        var62.field2 = client.field426[var61];
                                        var62.field9 = var9.field2627;
                                        client.field464.method3253(var62);
                                    }
                                }
                            }
                        }
                        if (!var9.field2536 && client.field437 == null && field57 == null && !client.field410) {
                            if ((var9.field2583 >= 0 || var9.field2571 != 0) && class127.field2016 >= var12 && class127.field2011 * 1253894097 >= var13 && class127.field2016 < var14 && class127.field2011 * 1253894097 < var15) {
                                if (var9.field2583 >= 0) {
                                    field1912 = arg0[var9.field2583];
                                } else {
                                    field1912 = var9;
                                }
                            }
                            if (var9.field2539 == 8 && class127.field2016 >= var12 && class127.field2011 * 1253894097 >= var13 && class127.field2016 < var14 && class127.field2011 * 1253894097 < var15) {
                                field1701 = var9;
                            }
                            if (var9.field2553 > var9.field2547) {
                                int var63 = var9.field2546 + var10;
                                int var64 = var9.field2547;
                                int var65 = var9.field2553;
                                int var66 = class127.field2016;
                                int var67 = class127.field2011 * 1253894097;
                                if (client.field404) {
                                    client.field523 = 32;
                                } else {
                                    client.field523 = 0;
                                }
                                client.field404 = false;
                                if (class127.field2012 == 1 || !field58 && class127.field2012 == 4) {
                                    if (var66 >= var63 && var66 < var63 + 16 && var67 >= var11 && var67 < var11 + 16) {
                                        var9.field2551 -= 4;
                                        client.method130(var9);
                                    } else if (var66 >= var63 && var66 < var63 + 16 && var67 >= var11 + var64 - 16 && var67 < var11 + var64) {
                                        var9.field2551 += 4;
                                        client.method130(var9);
                                    } else if (var66 >= var63 - client.field523 && var66 < client.field523 + var63 + 16 && var67 >= var11 + 16 && var67 < var11 + var64 - 16) {
                                        int var68 = (var64 - 32) * var64 / var65;
                                        if (var68 < 8) {
                                            var68 = 8;
                                        }
                                        int var69 = var67 - var11 - 16 - var68 / 2;
                                        int var70 = var64 - 32 - var68;
                                        var9.field2551 = (var65 - var64) * var69 / var70;
                                        client.method130(var9);
                                        client.field404 = true;
                                    }
                                }
                                if (client.field463 != 0) {
                                    int var71 = var9.field2546;
                                    if (var66 >= var63 - var71 && var67 >= var11 && var66 < var63 + 16 && var67 <= var11 + var64) {
                                        var9.field2551 += client.field463 * 45;
                                        client.method130(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.ct(IIB)V")
    public static void method2441(int arg0, int arg1) {
        class27 var2 = field59;
        client.method2420(var2.field644, var2.field642, var2.field643, var2.field641, var2.field645, var2.field645, arg0, arg1);
        field59 = null;
    }

    @ObfuscatedName("g.cw([Lem;II)V")
    public static final void method436(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2573 == arg1 && (!var3.field2536 || !client.method158(var3))) {
                if (var3.field2539 == 0) {
                    if (!var3.field2536 && client.method158(var3) && field1912 != var3) {
                        continue;
                    }
                    method436(arg0, var3.field2645);
                    if (var3.field2541 != null) {
                        method436(var3.field2541, var3.field2645);
                    }
                    class4 var4 = (class4) client.field297.method3214((long) var3.field2645);
                    if (var4 != null) {
                        int var5 = var4.field62;
                        if (class152.method487(var5)) {
                            method436(field2633[var5], -1);
                        }
                    }
                }
                if (var3.field2539 == 6) {
                    if (var3.field2644 != -1 || var3.field2609 != -1) {
                        boolean var6 = client.method132(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2609;
                        } else {
                            var7 = var3.field2644;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method38(var7);
                            var3.field2568 += client.field340;
                            while (var3.field2568 > var8.field907[var3.field2643]) {
                                var3.field2568 -= var8.field907[var3.field2643];
                                var3.field2643++;
                                if (var3.field2643 >= var8.field908.length) {
                                    var3.field2643 -= var8.field909;
                                    if (var3.field2643 < 0 || var3.field2643 >= var8.field908.length) {
                                        var3.field2643 = 0;
                                    }
                                }
                                client.method130(var3);
                            }
                        }
                    }
                    if (var3.field2581 != 0 && !var3.field2536) {
                        int var9 = var3.field2581 >> 16;
                        int var10 = var3.field2581 << 16 >> 16;
                        int var11 = client.field340 * var9;
                        int var12 = client.field340 * var10;
                        var3.field2577 = var3.field2577 + var11 & 0x7FF;
                        var3.field2578 = var3.field2578 + var12 & 0x7FF;
                        client.method130(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.dk(Ljava/lang/String;I)V")
    public static final void method2722(String arg0) {
        if (field1887 != null) {
            client.field304.method2369(140);
            client.field304.method2116(class107.method1004(arg0));
            client.field304.method2121(arg0);
        }
    }
}
