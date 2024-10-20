package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class Statics {

    @ObfuscatedName("aq.n")
    public static class147 field1000;

    @ObfuscatedName("aq.m")
    public static int field1001;

    @ObfuscatedName("aq.cz")
    public static int field1002;

    @ObfuscatedName("an.x")
    public static class147 field1007;

    @ObfuscatedName("an.k")
    public static boolean field1016;

    @ObfuscatedName("an.n")
    public static class147 field1042;

    @ObfuscatedName("m.fg")
    public static int field105;

    @ObfuscatedName("ax.x")
    public static int field1055;

    @ObfuscatedName("ax.n")
    public static class147 field1056;

    @ObfuscatedName("ax.if")
    public static int field1059;

    @ObfuscatedName("ac.n")
    public static class47 field1064;

    @ObfuscatedName("m.bb")
    public static class148 field107;

    @ObfuscatedName("am.i")
    public static boolean field1071;

    @ObfuscatedName("am.k")
    public static int field1082;

    @ObfuscatedName("am.ej")
    public static class74 field1090;

    @ObfuscatedName("n.ma")
    public static byte field11;

    @ObfuscatedName("bf.is")
    public static int field1115;

    @ObfuscatedName("bi.a")
    public static float field1138;

    @ObfuscatedName("bi.w")
    public static int field1139;

    @ObfuscatedName("bo.e")
    public static int[] field1163;

    @ObfuscatedName("bo.v")
    public static boolean[] field1165;

    @ObfuscatedName("bo.o")
    public static int[] field1173;

    @ObfuscatedName("bs.ay")
    public static int[] field1184;

    @ObfuscatedName("bs.p")
    public static float[] field1188;

    @ObfuscatedName("bs.ar")
    public static float[] field1189;

    @ObfuscatedName("bs.y")
    public static float[] field1190;

    @ObfuscatedName("bs.a")
    public static int field1191;

    @ObfuscatedName("bs.e")
    public static int field1192;

    @ObfuscatedName("bs.v")
    public static class67[] field1194;

    @ObfuscatedName("bs.z")
    public static class61[] field1195;

    @ObfuscatedName("bs.j")
    public static class54[] field1196;

    @ObfuscatedName("bs.r")
    public static class62[] field1197;

    @ObfuscatedName("bs.c")
    public static boolean[] field1198;

    @ObfuscatedName("bs.u")
    public static int[] field1199;

    @ObfuscatedName("bs.w")
    public static int field1200;

    @ObfuscatedName("bs.o")
    public static int field1205;

    @ObfuscatedName("bs.ak")
    public static int[] field1206;

    @ObfuscatedName("bs.b")
    public static float[] field1207;

    @ObfuscatedName("bs.l")
    public static float[] field1208;

    @ObfuscatedName("bs.al")
    public static float[] field1209;

    @ObfuscatedName("bs.aa")
    public static float[] field1210;

    @ObfuscatedName("bs.m")
    public static byte[] field1212;

    @ObfuscatedName("bt.fz")
    public static int field1247;

    @ObfuscatedName("bt.id")
    public static class153 field1252;

    @ObfuscatedName("bw.k")
    public static int field1272;

    @ObfuscatedName("bw.n")
    public static int field1273;

    @ObfuscatedName("bw.q")
    public static int[] field1275;

    @ObfuscatedName("bw.m")
    public static int[] field1276;

    @ObfuscatedName("bw.x")
    public static int field1277;

    @ObfuscatedName("bw.i")
    public static class163 field1278;

    @ObfuscatedName("bj.ac")
    public static class148 field1287;

    @ObfuscatedName("bk.j")
    public static int field1300;

    @ObfuscatedName("bk.z")
    public static int[] field1302;

    @ObfuscatedName("bk.r")
    public static int field1303;

    @ObfuscatedName("m.pp")
    public static Canvas field131;

    @ObfuscatedName("bp.r")
    public static int[] field1330;

    @ObfuscatedName("bz.ev")
    public static class74[] field1335;

    @ObfuscatedName("bz.kp")
    public static int field1336;

    @ObfuscatedName("bz.ah")
    public static class148 field1337;

    @ObfuscatedName("bm.dc")
    public static int[] field1340;

    @ObfuscatedName("cr.s")
    public static int field1355;

    @ObfuscatedName("cr.br")
    public static int field1358;

    @ObfuscatedName("cr.t")
    public static int field1359;

    @ObfuscatedName("cr.g")
    public static int field1361;

    @ObfuscatedName("cr.ay")
    public static int field1362;

    @ObfuscatedName("cr.y")
    public static int field1363;

    @ObfuscatedName("cr.b")
    public static int field1365;

    @ObfuscatedName("cr.l")
    public static int field1366;

    @ObfuscatedName("cr.bg")
    public static int field1367;

    @ObfuscatedName("cr.aa")
    public static int field1368;

    @ObfuscatedName("cr.p")
    public static int field1369;

    @ObfuscatedName("cr.ak")
    public static int field1370;

    @ObfuscatedName("cr.bd")
    public static int field1371;

    @ObfuscatedName("cr.bi")
    public static boolean[][] field1379;

    @ObfuscatedName("cr.f")
    public static int field1385;

    @ObfuscatedName("cr.ar")
    public static int field1394;

    @ObfuscatedName("cr.h")
    public static int field1398;

    @ObfuscatedName("cr.bn")
    public static int field1400;

    @ObfuscatedName("cr.bo")
    public static int field1401;

    @ObfuscatedName("cr.al")
    public static int field1402;

    @ObfuscatedName("cr.bh")
    public static int field1403;

    @ObfuscatedName("w.ii")
    public static int field141;

    @ObfuscatedName("cg.np")
    public static int field1415;

    @ObfuscatedName("w.au")
    public static int field144;

    @ObfuscatedName("cc.b")
    public static int field1451;

    @ObfuscatedName("cc.v")
    public static int field1454;

    @ObfuscatedName("cc.f")
    public static int field1455;

    @ObfuscatedName("cc.g")
    public static int field1456;

    @ObfuscatedName("cc.s")
    public static int field1457;

    @ObfuscatedName("cc.y")
    public static int field1458;

    @ObfuscatedName("cc.p")
    public static int field1459;

    @ObfuscatedName("w.w")
    public static byte[][] field146;

    @ObfuscatedName("cc.o")
    public static int field1461;

    @ObfuscatedName("cc.aa")
    public static class85 field1463;

    @ObfuscatedName("ch.dm")
    public static int[] field1475;

    @ObfuscatedName("cw.nj")
    public static int field1477;

    @ObfuscatedName("cw.ds")
    public static int field1484;

    @ObfuscatedName("cn.ca")
    public static int field1495;

    @ObfuscatedName("n.ac")
    public static class17 field15;

    @ObfuscatedName("cn.cm")
    public static class130 field1500;

    @ObfuscatedName("cu.v")
    public static int[] field1503;

    @ObfuscatedName("cu.e")
    public static int[] field1507;

    @ObfuscatedName("cu.o")
    public static int[] field1508;

    @ObfuscatedName("cu.pq")
    public static Font field1510;

    @ObfuscatedName("e.o")
    public static class191 field153;

    @ObfuscatedName("e.bx")
    public static class148 field154;

    @ObfuscatedName("e.ec")
    public static int[] field155;

    @ObfuscatedName("e.hy")
    public static int field156;

    @ObfuscatedName("n.pg")
    public static boolean field16;

    @ObfuscatedName("e.ea")
    public static class72[] field160;

    @ObfuscatedName("co.ew")
    public static class72[] field1635;

    @ObfuscatedName("ci.a")
    public static class74[] field1646;

    @ObfuscatedName("ci.po")
    public static String field1647;

    @ObfuscatedName("cv.pz")
    public static class71 field1668;

    @ObfuscatedName("cv.bg")
    public static class148 field1669;

    @ObfuscatedName("cv.l")
    public static int[] field1676;

    @ObfuscatedName("cv.bb")
    public static class22[] field1678;

    @ObfuscatedName("n.bd")
    public static class148 field17;

    @ObfuscatedName("cy.bf")
    public static int field1731;

    @ObfuscatedName("cy.bx")
    public static int field1732;

    @ObfuscatedName("cy.bb")
    public static int field1733;

    @ObfuscatedName("o.bq")
    public static int field174;

    @ObfuscatedName("cp.n")
    public static Applet field1747;

    @ObfuscatedName("cp.z")
    public static class53 field1748;

    @ObfuscatedName("cp.ht")
    public static class3 field1751;

    @ObfuscatedName("o.ns")
    public static int field177;

    @ObfuscatedName("o.g")
    public static String field178;

    @ObfuscatedName("cz.no")
    public static int field1790;

    @ObfuscatedName("cz.cp")
    public static int field1791;

    @ObfuscatedName("cz.mj")
    public static class21[] field1794;

    @ObfuscatedName("cf.bf")
    public static FontMetrics field1798;

    @ObfuscatedName("cf.d")
    public static int field1799;

    @ObfuscatedName("n.nf")
    public static int field18;

    @ObfuscatedName("ca.x")
    public static long field1800;

    @ObfuscatedName("ca.d")
    public static int[] field1801;

    @ObfuscatedName("ca.b")
    public static int[] field1803;

    @ObfuscatedName("ca.n")
    public static long field1804;

    @ObfuscatedName("ct.i")
    public static int[] field1813;

    @ObfuscatedName("o.ex")
    public static class74[] field183;

    @ObfuscatedName("dw.ad")
    public static class148 field1831;

    @ObfuscatedName("dw.ik")
    public static int field1836;

    @ObfuscatedName("dc.mx")
    public static class72 field1843;

    @ObfuscatedName("dm.j")
    public static class197[] field1853;

    @ObfuscatedName("dv.hp")
    public static int field1865;

    @ObfuscatedName("dl.fp")
    public static int field1867;

    @ObfuscatedName("do.le")
    public static class117 field1874;

    @ObfuscatedName("do.z")
    public static int[] field1877;

    @ObfuscatedName("do.fy")
    public static int field1878;

    @ObfuscatedName("dp.i")
    public static class74[] field1883;

    @ObfuscatedName("dp.ag")
    public static class130 field1885;

    @ObfuscatedName("dp.pj")
    public static int field1886;

    @ObfuscatedName("dp.iv")
    public static int field1887;

    @ObfuscatedName("dx.m")
    public static class139 field1889;

    @ObfuscatedName("v.mg")
    public static class50 field189;

    @ObfuscatedName("dx.pi")
    public static Image field1891;

    @ObfuscatedName("dr.do")
    public static byte[][] field1896;

    @ObfuscatedName("dr.m")
    public static class194 field1899;

    @ObfuscatedName("v.m")
    public static class74 field190;

    @ObfuscatedName("da.cu")
    public static int field1903;

    @ObfuscatedName("da.ab")
    public static class148 field1904;

    @ObfuscatedName("dk.e")
    public static short[][] field1914;

    @ObfuscatedName("db.x")
    public static File field1916;

    @ObfuscatedName("dt.x")
    public static String field1923;

    @ObfuscatedName("dt.iz")
    public static int field1930;

    @ObfuscatedName("dt.ob")
    public static class123 field1932;

    @ObfuscatedName("dt.n")
    public static String field1936;

    @ObfuscatedName("v.dp")
    public static byte[][] field195;

    @ObfuscatedName("dj.oh")
    public static int field1971;

    @ObfuscatedName("dg.mb")
    public static byte field1976;

    @ObfuscatedName("dg.oa")
    public static class121 field1979;

    @ObfuscatedName("dy.px")
    public static int field1984;

    @ObfuscatedName("x.ed")
    public static class72[] field20;

    @ObfuscatedName("dz.og")
    public static Clipboard field2002;

    @ObfuscatedName("dz.a")
    public static int[] field2008;

    @ObfuscatedName("z.nt")
    public static int field203;

    @ObfuscatedName("eq.x")
    public static String field2051;

    @ObfuscatedName("eq.k")
    public static int field2052;

    @ObfuscatedName("ei.f")
    public static class107 field2065;

    @ObfuscatedName("ei.d")
    public static File field2066;

    @ObfuscatedName("ei.q")
    public static int field2067;

    @ObfuscatedName("ei.c")
    public static String[] field2074;

    @ObfuscatedName("ei.i")
    public static File field2076;

    @ObfuscatedName("ed.eo")
    public static class72[] field2087;

    @ObfuscatedName("ed.me")
    public static int field2090;

    @ObfuscatedName("ea.kn")
    public static class153[] field2102;

    @ObfuscatedName("j.da")
    public static int field211;

    @ObfuscatedName("es.ce")
    public static class194 field2111;

    @ObfuscatedName("el.u")
    public static String[] field2114;

    @ObfuscatedName("ey.q")
    public static byte[][][] field2128;

    @ObfuscatedName("j.eq")
    public static class72 field213;

    @ObfuscatedName("j.q")
    public static class66 field216;

    @ObfuscatedName("r.kq")
    public static int field219;

    @ObfuscatedName("r.el")
    public static class72[] field229;

    @ObfuscatedName("c.bi")
    public static class148 field237;

    @ObfuscatedName("et.nq")
    public static class50 field2389;

    @ObfuscatedName("ev.bv")
    public static class148 field2403;

    @ObfuscatedName("u.ml")
    public static class49 field243;

    @ObfuscatedName("ex.ot")
    public static class9 field2430;

    @ObfuscatedName("ex.bo")
    public static class148 field2438;

    @ObfuscatedName("u.eh")
    public static int[] field245;

    @ObfuscatedName("ej.pr")
    public static int field2462;

    @ObfuscatedName("ej.ab")
    public static class72[] field2464;

    @ObfuscatedName("ez.d")
    public static byte[][][] field2477;

    @ObfuscatedName("ez.ad")
    public static class74[] field2482;

    @ObfuscatedName("ee.n")
    public static class130 field2496;

    @ObfuscatedName("ee.k")
    public static long field2503;

    @ObfuscatedName("u.nh")
    public static int field251;

    @ObfuscatedName("ee.z")
    public static boolean field2511;

    @ObfuscatedName("eb.ax")
    public static long field2521;

    @ObfuscatedName("ep.i")
    public static class147 field2524;

    @ObfuscatedName("u.ci")
    public static class194 field253;

    @ObfuscatedName("ep.n")
    public static class153[][] field2545;

    @ObfuscatedName("ep.k")
    public static boolean[] field2567;

    @ObfuscatedName("ep.m")
    public static class147 field2589;

    @ObfuscatedName("ep.d")
    public static class147 field2593;

    @ObfuscatedName("client.e")
    public static class140 field260;

    @ObfuscatedName("ek.a")
    public static short[][] field2653;

    @ObfuscatedName("ek.ei")
    public static class74[] field2654;

    @ObfuscatedName("ek.cg")
    public static class130 field2655;

    @ObfuscatedName("er.et")
    public static class72[] field2668;

    @ObfuscatedName("ef.r")
    public static int field2669;

    @ObfuscatedName("fm.x")
    public static class147 field2675;

    @ObfuscatedName("fm.gt")
    public static class153 field2677;

    @ObfuscatedName("fm.kg")
    public static class118 field2678;

    @ObfuscatedName("fy.w")
    public static short[] field2683;

    @ObfuscatedName("fy.m")
    public static short[] field2685;

    @ObfuscatedName("fg.e")
    public static int field2716;

    @ObfuscatedName("fg.n")
    public static class147 field2717;

    @ObfuscatedName("fg.k")
    public static class147 field2718;

    @ObfuscatedName("fg.q")
    public static class147 field2720;

    @ObfuscatedName("fg.f")
    public static int[] field2721;

    @ObfuscatedName("fg.x")
    public static class147 field2722;

    @ObfuscatedName("fg.ee")
    public static int[] field2724;

    @ObfuscatedName("fg.a")
    public static int field2726;

    @ObfuscatedName("fw.br")
    public static class148 field2761;

    @ObfuscatedName("fn.j")
    public static class152 field2776;

    @ObfuscatedName("client.ai")
    public static class133 field278;

    @ObfuscatedName("fp.nd")
    public static int field2845;

    @ObfuscatedName("fp.ib")
    public static class153 field2847;

    @ObfuscatedName("client.as")
    public static boolean field285;

    @ObfuscatedName("gn.ey")
    public static class72[] field2897;

    @ObfuscatedName("client.am")
    public static class148 field290;

    @ObfuscatedName("gt.n")
    public static class102 field2909;

    @ObfuscatedName("gl.e")
    public static class74[] field2919;

    @ObfuscatedName("gg.dl")
    public static int[][] field2932;

    @ObfuscatedName("gg.ao")
    public static class133 field2934;

    @ObfuscatedName("gv.bf")
    public static class74 field2939;

    @ObfuscatedName("client.bw")
    public static int field296;

    @ObfuscatedName("gj.m")
    public static byte[][][] field2969;

    @ObfuscatedName("gk.q")
    public static class147 field2978;

    @ObfuscatedName("client.r")
    public static String field310;

    @ObfuscatedName("x.kf")
    public static int field34;

    @ObfuscatedName("x.bn")
    public static class148 field35;

    @ObfuscatedName("client.k")
    public static client field401;

    @ObfuscatedName("client.co")
    public static class194 field507;

    @ObfuscatedName("client.cf")
    public static int field519;

    @ObfuscatedName("h.na")
    public static int field530;

    @ObfuscatedName("h.ba")
    public static String field531;

    @ObfuscatedName("h.bj")
    public static int field533;

    @ObfuscatedName("t.ah")
    public static class74[] field546;

    @ObfuscatedName("f.jw")
    public static int field565;

    @ObfuscatedName("f.gg")
    public static class153 field572;

    @ObfuscatedName("g.en")
    public static class72 field573;

    @ObfuscatedName("s.bh")
    public static class148 field583;

    @ObfuscatedName("k.ov")
    public static class146 field59;

    @ObfuscatedName("s.t")
    public static int[] field591;

    @ObfuscatedName("n.o")
    public static boolean field6;

    @ObfuscatedName("y.oj")
    public static class120 field608;

    @ObfuscatedName("i.w")
    public static int field62;

    @ObfuscatedName("b.f")
    public static class12 field622;

    @ObfuscatedName("l.cr")
    public static class133 field625;

    @ObfuscatedName("l.o")
    public static class153 field637;

    @ObfuscatedName("al.pv")
    public static Frame field648;

    @ObfuscatedName("i.i")
    public static String[] field65;

    @ObfuscatedName("aa.x")
    public static class74 field650;

    @ObfuscatedName("aa.k")
    public static class74 field651;

    @ObfuscatedName("aa.d")
    public static class72 field652;

    @ObfuscatedName("aa.w")
    public static class74 field654;

    @ObfuscatedName("aa.e")
    public static class74 field655;

    @ObfuscatedName("aa.p")
    public static int[] field661;

    @ObfuscatedName("aa.n")
    public static boolean field674;

    @ObfuscatedName("aa.u")
    public static int[] field675;

    @ObfuscatedName("aa.q")
    public static class72 field680;

    @ObfuscatedName("aa.az")
    public static String field686;

    @ObfuscatedName("ar.s")
    public static String field693;

    @ObfuscatedName("ar.v")
    public static class159 field694;

    @ObfuscatedName("ak.gv")
    public static class153 field699;

    @ObfuscatedName("ak.f")
    public static String field701;

    @ObfuscatedName("ak.fu")
    public static int field703;

    @ObfuscatedName("i.y")
    public static int[] field71;

    @ObfuscatedName("ay.h")
    public static int[] field713;

    @ObfuscatedName("aw.k")
    public static int[] field716;

    @ObfuscatedName("aw.v")
    public static class153 field722;

    @ObfuscatedName("aw.r")
    public static int[][][] field725;

    @ObfuscatedName("aw.c")
    public static class107 field730;

    @ObfuscatedName("d.nk")
    public static int field75;

    @ObfuscatedName("av.fl")
    public static int field758;

    @ObfuscatedName("d.ez")
    public static int[] field78;

    @ObfuscatedName("d.ic")
    public static class27 field79;

    @ObfuscatedName("at.es")
    public static class72[] field794;

    @ObfuscatedName("d.nr")
    public static class68 field80;

    @ObfuscatedName("af.n")
    public static class147 field818;

    @ObfuscatedName("d.hj")
    public static int field83;

    @ObfuscatedName("af.x")
    public static class147 field838;

    @ObfuscatedName("ae.x")
    public static class147 field840;

    @ObfuscatedName("ae.k")
    public static class147 field841;

    @ObfuscatedName("q.i")
    public static byte[][][] field87;

    @ObfuscatedName("ai.n")
    public static class147 field898;

    @ObfuscatedName("as.k")
    public static class147 field910;

    @ObfuscatedName("as.am")
    public static class74[] field912;

    @ObfuscatedName("as.x")
    public static class147 field917;

    @ObfuscatedName("as.n")
    public static class147 field918;

    @ObfuscatedName("as.b")
    public static int[] field921;

    @ObfuscatedName("aj.n")
    public static class147 field933;

    @ObfuscatedName("aj.pw")
    public static int field938;

    @ObfuscatedName("au.x")
    public static class147 field941;

    @ObfuscatedName("au.k")
    public static int field942;

    @ObfuscatedName("au.n")
    public static class147 field943;

    @ObfuscatedName("az.fs")
    public static int field965;

    @ObfuscatedName("az.n")
    public static class147 field972;

    @ObfuscatedName("ao.n")
    public static class147 field975;

    @ObfuscatedName("ao.w")
    public static int[][] field978;

    @ObfuscatedName("ao.ap")
    public static class148 field979;

    @ObfuscatedName("ao.cn")
    public static char field980;

    @ObfuscatedName("q.a")
    public static byte[][][] field99;

    @ObfuscatedName("ag.n")
    public static class147 field991;

    @ObfuscatedName("ag.j")
    public static int[] field994;

    @ObfuscatedName("aq.dv")
    public static int[] field996;

    @ObfuscatedName("aq.dh")
    public static class79 field997;

    @ObfuscatedName("aw.x(Ljava/lang/CharSequence;IZB)Z")
    public static boolean method601(CharSequence arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("");
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = arg0.length();
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(var7);
            if (var7 == 0) {
                if (var8 == '-') {
                    var3 = true;
                    continue;
                }
                if (var8 == '+' && arg2) {
                    continue;
                }
            }
            int var10;
            if (var8 >= '0' && var8 <= '9') {
                var10 = var8 - '0';
            } else if (var8 >= 'A' && var8 <= 'Z') {
                var10 = var8 - '7';
            } else if (var8 >= 'a' && var8 <= 'z') {
                var10 = var8 - 'W';
            } else {
                return false;
            }
            if (var10 >= arg1) {
                return false;
            }
            if (var3) {
                var10 = -var10;
            }
            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
                return false;
            }
            var5 = var9;
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("dr.i(ILdk;Leh;I)V")
    public static void method2405(int arg0, class121 arg1, class148 arg2) {
        byte[] var3 = null;
        class178 var4 = class150.field2488;
        synchronized (class150.field2488) {
            for (class149 var5 = (class149) class150.field2488.method3179(); var5 != null; var5 = (class149) class150.field2488.method3199()) {
                if ((long) arg0 == var5.field2888 && var5.field2479 == arg1 && var5.field2481 == 0) {
                    var3 = var5.field2478;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2434(arg0);
            arg2.method2756(arg1, arg0, var7, true);
        } else {
            arg2.method2756(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("dx.x(IIIIIII)I")
    public static int method2400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((arg5 & 0x1) == 1) {
            int var6 = arg3;
            arg3 = arg4;
            arg4 = var6;
        }
        int var7 = arg2 & 0x3;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 - arg0 - (arg3 - 1);
        } else {
            return 7 - arg1 - (arg4 - 1);
        }
    }

    @ObfuscatedName("q.n(II)Lt;")
    public static class19 method83(int arg0) {
        class19 var1 = (class19) class19.field550.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field35.method2738(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1826 = var4.field1829.length - 12;
        int var5 = var4.method2183();
        var3.field544 = var4.method2140();
        var3.field542 = var4.method2140();
        var3.field551 = var4.method2140();
        var3.field545 = var4.method2140();
        var4.field1826 = 0;
        var4.method2146();
        var3.field539 = new int[var5];
        var3.field540 = new int[var5];
        var3.field538 = new String[var5];
        int var6 = 0;
        while (var4.field1826 < var4.field1829.length - 12) {
            int var7 = var4.method2140();
            if (var7 == 3) {
                var3.field538[var6] = var4.method2182();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field540[var6] = var4.method2148();
            } else {
                var3.field540[var6] = var4.method2183();
            }
            var3.field539[var6++] = var7;
        }
        class19.field550.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method590(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) class10.field159.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            class10.field159.put(arg0, var4);
        }
        class31 var5 = var4.method524(arg0, arg1, arg2, arg3);
        class10.field163.method3164(var5, (long) var5.field704);
        class10.field149.method3214(var5);
        client.field441 = client.field444;
    }

    @ObfuscatedName("h.k(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lby;")
    public static class74[] method488(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2729(arg1);
        int var4 = arg0.method2690(var3, arg2);
        return class70.method82(arg0, var3, var4);
    }

    @ObfuscatedName("fo.n(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method3084(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class135) {
                    class135 var4 = (class135) arg1;
                    var5 = var4.field2053 + " | ";
                    var3 = var4.field2054;
                } else {
                    var5 = "";
                }
                StringWriter var6 = new StringWriter();
                PrintWriter var7 = new PrintWriter(var6);
                var3.printStackTrace(var7);
                var7.close();
                String var8 = var6.toString();
                BufferedReader var9 = new BufferedReader(new StringReader(var8));
                String var10 = var9.readLine();
                while (true) {
                    String var11 = var9.readLine();
                    if (var11 == null) {
                        String var20 = var5 + "| " + var10;
                        var2 = var20;
                        break;
                    }
                    int var12 = var11.indexOf(40);
                    int var13 = var11.indexOf(41, var12 + 1);
                    if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                            String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                            var5 = var5 + var16 + ' ';
                            continue;
                        }
                        var11 = var11.substring(0, var12);
                    }
                    String var17 = var11.trim();
                    String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                    String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                    var5 = var5 + var19 + ' ';
                }
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var22 = var2.replace(':', '.');
            String var23 = var22.replace('@', '_');
            String var24 = var23.replace('&', '_');
            String var25 = var24.replace('#', '_');
            if (field1747 == null) {
                return;
            }
            URL var26 = new URL(field1747.getCodeBase(), "clienterror.ws?c=" + field2052 + "&u=" + field2051 + "&v1=" + field1936 + "&v2=" + field1923 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("cj.q(B)V")
    public static void method1885() {
        class37.field890.method3124();
    }

    @ObfuscatedName("ax.i(I)V")
    public static void method910() {
        class196 var0 = null;
        try {
            var0 = class136.method549("", field260.field2121, true);
            class107 var1 = field2430.method108();
            var0.method3382(var1.field1829, 0, var1.field1826);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3385();
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dp.d([BIII)Ljava/lang/String;")
    public static String method2397(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = class202.field2975[var6 - 128];
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

    @ObfuscatedName("b.m(I)V")
    public static void method535() {
        if (field2496 != null) {
            field2496.method2548();
        }
    }

    @ObfuscatedName("ar.p([BI)[B")
    public static final byte[] method581(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2148();
        int var3 = var1.method2183();
        if (var3 < 0 || !(class147.field2460 == 0 || var3 <= class147.field2460)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2280(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2183();
            if (var5 < 0 || class147.field2460 != 0 && var5 > class147.field2460) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2107(var6, var5, arg0, var3, 9);
            } else {
                class147.field2456.method2086(var1, var6);
            }
            return var6;
        }
    }

    @ObfuscatedName("dr.o(IIIII)I")
    public static final int method2402(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1467[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("i.e(II)V")
    public static void method26(int arg0) {
        if (client.field265 == arg0) {
            return;
        }
        if (client.field265 == 0) {
            field1891 = null;
            field1510 = null;
            field1798 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            client.field292 = 0;
            client.field293 = 0;
            client.field294 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && field1500 != null) {
            field1500.method2548();
            field1500 = null;
        }
        if (client.field265 == 25) {
            client.field318 = 0;
            client.field487 = 0;
            client.field317 = 1;
            client.field378 = 0;
            client.field465 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method748(field131, field17, field2403, true, 0);
        } else if (arg0 == 20) {
            class28.method748(field131, field17, field2403, true, client.field265 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method748(field131, field17, field2403, false, 4);
        } else if (field674) {
            field650 = null;
            field651 = null;
            field1883 = null;
            field652 = null;
            field680 = null;
            field190 = null;
            field1646 = null;
            field654 = null;
            field655 = null;
            field2464 = null;
            field912 = null;
            field2482 = null;
            field546 = null;
            field2939 = null;
            field713 = null;
            field591 = null;
            field2721 = null;
            field675 = null;
            field71 = null;
            field661 = null;
            field921 = null;
            field1676 = null;
            class162.method546(2);
            class151.method695(true);
            field674 = false;
        }
        client.field265 = arg0;
    }

    @ObfuscatedName("es.ag(IIIB)V")
    public static final void method2651(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            client.field363 = -1;
            client.field472 = -1;
            return;
        }
        int var3 = client.method1782(arg0, arg1, field83) - arg2;
        int var4 = arg0 - field1878;
        int var5 = var3 - field1247;
        int var6 = arg1 - field758;
        int var7 = class84.field1466[field703];
        int var8 = class84.field1467[field703];
        int var9 = class84.field1466[field105];
        int var10 = class84.field1467[field105];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            client.field363 = (var11 << 9) / var15 + 256;
            client.field472 = (var14 << 9) / var15 + 167;
        } else {
            client.field363 = -1;
            client.field472 = -1;
        }
    }

    @ObfuscatedName("j.cq(Lep;II)I")
    public static final int method157(class153 arg0, int arg1) {
        if (arg0.field2628 == null || arg1 >= arg0.field2628.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2628[arg1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            while (true) {
                int var6 = var2[var4++];
                int var7 = 0;
                byte var8 = 0;
                if (var6 == 0) {
                    return var3;
                }
                if (var6 == 1) {
                    var7 = client.field397[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = client.field398[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = client.field443[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class153 var11 = class153.method1974(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method1982(var12).field1010 || client.field261)) {
                        for (int var13 = 0; var13 < var11.field2565.length; var13++) {
                            if (var12 + 1 == var11.field2565[var13]) {
                                var7 += var11.field2635[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class155.field2663[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class141.field2129[client.field398[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class155.field2663[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = field1751.field44;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class141.field2126[var14]) {
                            var7 += client.field398[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class153 var17 = class153.method1974(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method1982(var18).field1010 || client.field261)) {
                        for (int var19 = 0; var19 < var17.field2565.length; var19++) {
                            if (var18 + 1 == var17.field2565[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = client.field425;
                }
                if (var6 == 12) {
                    var7 = client.field436;
                }
                if (var6 == 13) {
                    int var20 = class155.field2663[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class155.method2650(var22);
                }
                if (var6 == 15) {
                    var8 = 1;
                }
                if (var6 == 16) {
                    var8 = 2;
                }
                if (var6 == 17) {
                    var8 = 3;
                }
                if (var6 == 18) {
                    var7 = (field1751.field772 >> 7) + field1791;
                }
                if (var6 == 19) {
                    var7 = (field1751.field732 >> 7) + field1002;
                }
                if (var6 == 20) {
                    var7 = var2[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @ObfuscatedName("m.co([Lep;II)V")
    public static final void method96(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2534 == 0) {
                    if (var3.field2640 != null) {
                        method96(var3.field2640, arg1);
                    }
                    class4 var4 = (class4) client.field351.method3149((long) var3.field2641);
                    if (var4 != null) {
                        int var5 = var4.field68;
                        if (class153.method2384(var5)) {
                            method96(field2545[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2626 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field12 = var3.field2626;
                    class32.method2843(var6, 200000);
                }
                if (arg1 == 1 && var3.field2574 != null) {
                    if (var3.field2584 >= 0) {
                        class153 var7 = class153.method1974(var3.field2641);
                        if (var7 == null || var7.field2640 == null || var3.field2584 >= var7.field2640.length || var7.field2640[var3.field2584] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field12 = var3.field2574;
                    class32.method2843(var8, 200000);
                }
            }
        }
    }
}
