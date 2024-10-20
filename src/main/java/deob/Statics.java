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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Statics {

    @ObfuscatedName("q.ds")
    public static int field100;

    @ObfuscatedName("az.ao")
    public static class13[] field1022;

    @ObfuscatedName("ab.s")
    public static int[] field1028;

    @ObfuscatedName("q.dl")
    public static int[] field103;

    @ObfuscatedName("ab.b")
    public static class153 field1032;

    @ObfuscatedName("ab.nt")
    public static int field1033;

    @ObfuscatedName("am.c")
    public static int field1036;

    @ObfuscatedName("am.b")
    public static class153 field1040;

    @ObfuscatedName("am.h")
    public static int[] field1041;

    @ObfuscatedName("am.bz")
    public static class155 field1043;

    @ObfuscatedName("am.ik")
    public static class159 field1044;

    @ObfuscatedName("am.al")
    public static class155 field1045;

    @ObfuscatedName("aa.b")
    public static class43 field1049;

    @ObfuscatedName("ar.s")
    public static boolean[] field1074;

    @ObfuscatedName("ar.g")
    public static int[] field1075;

    @ObfuscatedName("ar.w")
    public static int[] field1083;

    @ObfuscatedName("ak.v")
    public static class55 field1095;

    @ObfuscatedName("ak.q")
    public static boolean field1109;

    @ObfuscatedName("ak.k")
    public static int field1117;

    @ObfuscatedName("ak.jp")
    public static class159[] field1118;

    @ObfuscatedName("ak.pg")
    public static int field1121;

    @ObfuscatedName("bj.t")
    public static byte[] field1131;

    @ObfuscatedName("bj.au")
    public static int[] field1134;

    @ObfuscatedName("bj.g")
    public static int field1135;

    @ObfuscatedName("bj.s")
    public static class60[] field1136;

    @ObfuscatedName("bj.n")
    public static class49[] field1137;

    @ObfuscatedName("bj.x")
    public static class59[] field1138;

    @ObfuscatedName("bj.v")
    public static int field1139;

    @ObfuscatedName("bj.l")
    public static boolean[] field1140;

    @ObfuscatedName("bj.h")
    public static float[] field1141;

    @ObfuscatedName("bj.u")
    public static int[] field1146;

    @ObfuscatedName("bj.w")
    public static int field1147;

    @ObfuscatedName("bj.an")
    public static float[] field1148;

    @ObfuscatedName("bj.p")
    public static float[] field1149;

    @ObfuscatedName("bj.r")
    public static float[] field1150;

    @ObfuscatedName("bj.av")
    public static float[] field1151;

    @ObfuscatedName("bj.ae")
    public static float[] field1152;

    @ObfuscatedName("bj.y")
    public static int field1153;

    @ObfuscatedName("bj.e")
    public static float[] field1154;

    @ObfuscatedName("bj.ag")
    public static int[] field1155;

    @ObfuscatedName("bj.o")
    public static class50[] field1158;

    @ObfuscatedName("bm.on")
    public static class152 field1188;

    @ObfuscatedName("bm.aj")
    public static class155 field1193;

    @ObfuscatedName("b.id")
    public static int field12;

    @ObfuscatedName("bo.cc")
    public static class70 field1209;

    @ObfuscatedName("bo.hx")
    public static int field1214;

    @ObfuscatedName("bo.ep")
    public static class87 field1215;

    @ObfuscatedName("bo.mj")
    public static class46 field1216;

    @ObfuscatedName("bo.v")
    public static class134 field1217;

    @ObfuscatedName("bo.cj")
    public static class70 field1218;

    @ObfuscatedName("bb.pu")
    public static Frame field1236;

    @ObfuscatedName("bb.dx")
    public static class95 field1245;

    @ObfuscatedName("bf.v")
    public static float field1256;

    @ObfuscatedName("t.bf")
    public static FontMetrics field126;

    @ObfuscatedName("bf.y")
    public static int field1264;

    @ObfuscatedName("ba.aa")
    public static class87[] field1268;

    @ObfuscatedName("ba.ax")
    public static class87 field1281;

    @ObfuscatedName("bd.n")
    public static boolean field1286;

    @ObfuscatedName("bd.ey")
    public static int[] field1288;

    @ObfuscatedName("bd.eq")
    public static class86 field1290;

    @ObfuscatedName("bd.nq")
    public static int field1291;

    @ObfuscatedName("bd.bh")
    public static class155 field1292;

    @ObfuscatedName("bu.ea")
    public static int[] field1295;

    @ObfuscatedName("bu.g")
    public static class159 field1296;

    @ObfuscatedName("bu.b")
    public static int field1297;

    @ObfuscatedName("bu.df")
    public static int[] field1298;

    @ObfuscatedName("bu.j")
    public static long field1299;

    @ObfuscatedName("b.hw")
    public static int field13;

    @ObfuscatedName("v.aq")
    public static class155 field131;

    @ObfuscatedName("bi.ha")
    public static int field1314;

    @ObfuscatedName("bi.ni")
    public static class62 field1317;

    @ObfuscatedName("bv.ne")
    public static int field1325;

    @ObfuscatedName("bv.f")
    public static int[] field1328;

    @ObfuscatedName("bp.t")
    public static byte[][][] field1330;

    @ObfuscatedName("bp.c")
    public static File field1331;

    @ObfuscatedName("bp.gt")
    public static class159 field1333;

    @ObfuscatedName("bt.fh")
    public static int field1356;

    @ObfuscatedName("bg.c")
    public static String field1358;

    @ObfuscatedName("bg.cu")
    public static int field1360;

    @ObfuscatedName("bg.b")
    public static String field1365;

    @ObfuscatedName("bg.fv")
    public static int field1370;

    @ObfuscatedName("bg.ph")
    public static int field1373;

    @ObfuscatedName("bn.l")
    public static String field1403;

    @ObfuscatedName("y.i")
    public static byte[][][] field141;

    @ObfuscatedName("cj.b")
    public static Applet field1439;

    @ObfuscatedName("y.g")
    public static int[] field144;

    @ObfuscatedName("cj.j")
    public static int field1442;

    @ObfuscatedName("cb.i")
    public static File field1447;

    @ObfuscatedName("cb.q")
    public static int field1448;

    @ObfuscatedName("y.v")
    public static byte[][][] field145;

    @ObfuscatedName("cb.f")
    public static String field1451;

    @ObfuscatedName("cb.l")
    public static String[] field1453;

    @ObfuscatedName("cb.af")
    public static class87[] field1457;

    @ObfuscatedName("cb.a")
    public static String field1458;

    @ObfuscatedName("y.x")
    public static int[] field146;

    @ObfuscatedName("cy.n")
    public static int[] field1464;

    @ObfuscatedName("cy.u")
    public static int[] field1468;

    @ObfuscatedName("ca.i")
    public static int[] field1473;

    @ObfuscatedName("ca.k")
    public static int[] field1474;

    @ObfuscatedName("ca.q")
    public static int[] field1475;

    @ObfuscatedName("ca.t")
    public static int[] field1476;

    @ObfuscatedName("ca.v")
    public static int[] field1477;

    @ObfuscatedName("ca.c")
    public static int field1479;

    @ObfuscatedName("ce.y")
    public static byte[][] field1484;

    @ObfuscatedName("ce.mt")
    public static byte field1487;

    @ObfuscatedName("cr.x")
    public static int field1513;

    @ObfuscatedName("cr.o")
    public static int field1514;

    @ObfuscatedName("cr.n")
    public static int[] field1518;

    @ObfuscatedName("cw.o")
    public static int[] field1533;

    @ObfuscatedName("y.q")
    public static byte[][][] field154;

    @ObfuscatedName("cz.pl")
    public static class85 field1541;

    @ObfuscatedName("cz.g")
    public static boolean field1543;

    @ObfuscatedName("ch.y")
    public static short[] field1548;

    @ObfuscatedName("y.gg")
    public static class159 field156;

    @ObfuscatedName("y.bj")
    public static class155 field157;

    @ObfuscatedName("cm.mk")
    public static class86 field1573;

    @ObfuscatedName("ck.z")
    public static int field1577;

    @ObfuscatedName("ck.a")
    public static int field1580;

    @ObfuscatedName("ck.p")
    public static int field1587;

    @ObfuscatedName("ck.au")
    public static int field1588;

    @ObfuscatedName("ck.f")
    public static int field1591;

    @ObfuscatedName("ck.ae")
    public static int field1593;

    @ObfuscatedName("ck.d")
    public static int field1594;

    @ObfuscatedName("ck.m")
    public static int field1595;

    @ObfuscatedName("ck.e")
    public static int field1600;

    @ObfuscatedName("ck.r")
    public static int field1601;

    @ObfuscatedName("ck.av")
    public static int field1602;

    @ObfuscatedName("ck.an")
    public static int field1603;

    @ObfuscatedName("ck.ag")
    public static int field1606;

    @ObfuscatedName("ck.h")
    public static int field1622;

    @ObfuscatedName("y.eg")
    public static class87[] field163;

    @ObfuscatedName("ck.bh")
    public static boolean[][] field1632;

    @ObfuscatedName("ck.bo")
    public static int field1633;

    @ObfuscatedName("ck.bx")
    public static int field1634;

    @ObfuscatedName("ck.bw")
    public static int field1635;

    @ObfuscatedName("ck.bz")
    public static int field1636;

    @ObfuscatedName("ck.bb")
    public static int field1637;

    @ObfuscatedName("ck.bl")
    public static int field1638;

    @ObfuscatedName("cd.jb")
    public static int field1648;

    @ObfuscatedName("cg.am")
    public static class70 field1747;

    @ObfuscatedName("cg.da")
    public static int field1771;

    @ObfuscatedName("cg.gn")
    public static class159 field1775;

    @ObfuscatedName("cx.c")
    public static String field1776;

    @ObfuscatedName("ct.p")
    public static int field1777;

    @ObfuscatedName("ct.g")
    public static int field1787;

    @ObfuscatedName("ct.s")
    public static int field1788;

    @ObfuscatedName("ct.m")
    public static int field1789;

    @ObfuscatedName("ct.f")
    public static int field1790;

    @ObfuscatedName("ct.h")
    public static int field1791;

    @ObfuscatedName("ct.e")
    public static int field1793;

    @ObfuscatedName("ct.a")
    public static int field1796;

    @ObfuscatedName("ct.an")
    public static class106 field1797;

    @ObfuscatedName("b.dn")
    public static int[][] field18;

    @ObfuscatedName("dk.nr")
    public static int field1807;

    @ObfuscatedName("dk.z")
    public static int[] field1809;

    @ObfuscatedName("dw.ec")
    public static int[] field1816;

    @ObfuscatedName("dw.bq")
    public static class155 field1817;

    @ObfuscatedName("dp.bd")
    public static String field1835;

    @ObfuscatedName("df.jy")
    public static int field1837;

    @ObfuscatedName("dl.x")
    public static class30[] field1841;

    @ObfuscatedName("dn.fj")
    public static int field1858;

    @ObfuscatedName("g.x")
    public static class156 field192;

    @ObfuscatedName("dr.bj")
    public static int field1921;

    @ObfuscatedName("dr.bk")
    public static int field1922;

    @ObfuscatedName("dr.bm")
    public static int field1923;

    @ObfuscatedName("dh.he")
    public static int field1936;

    @ObfuscatedName("dh.er")
    public static class86[] field1937;

    @ObfuscatedName("dh.cr")
    public static int field1938;

    @ObfuscatedName("dh.k")
    public static File field1939;

    @ObfuscatedName("g.hb")
    public static int field195;

    @ObfuscatedName("g.i")
    public static class153 field197;

    @ObfuscatedName("g.w")
    public static int[] field198;

    @ObfuscatedName("dd.ia")
    public static class159 field1997;

    @ObfuscatedName("ds.as")
    public static class87[] field2010;

    @ObfuscatedName("ds.j")
    public static class153 field2013;

    @ObfuscatedName("do.n")
    public static class58 field2021;

    @ObfuscatedName("dc.b")
    public static long field2025;

    @ObfuscatedName("dc.c")
    public static long field2026;

    @ObfuscatedName("s.t")
    public static class183 field205;

    @ObfuscatedName("dv.l")
    public static class127 field2052;

    @ObfuscatedName("s.bi")
    public static int field207;

    @ObfuscatedName("dz.dp")
    public static int[] field2077;

    @ObfuscatedName("s.kb")
    public static class66 field208;

    @ObfuscatedName("en.ok")
    public static Clipboard field2083;

    @ObfuscatedName("s.g")
    public static class186 field210;

    @ObfuscatedName("s.ck")
    public static class183 field211;

    @ObfuscatedName("s.ei")
    public static class86[] field212;

    @ObfuscatedName("ev.y")
    public static int[][] field2120;

    @ObfuscatedName("s.ew")
    public static int[] field213;

    @ObfuscatedName("s.cm")
    public static class183 field215;

    @ObfuscatedName("n.jr")
    public static int field218;

    @ObfuscatedName("ei.ax")
    public static class155 field2365;

    @ObfuscatedName("ei.am")
    public static class86[] field2368;

    @ObfuscatedName("em.em")
    public static class86[] field2374;

    @ObfuscatedName("es.b")
    public static class153 field2377;

    @ObfuscatedName("es.c")
    public static class153 field2378;

    @ObfuscatedName("es.q")
    public static class153 field2380;

    @ObfuscatedName("es.t")
    public static int field2381;

    @ObfuscatedName("es.w")
    public static int field2382;

    @ObfuscatedName("es.v")
    public static int field2383;

    @ObfuscatedName("ee.ao")
    public static class155 field2395;

    @ObfuscatedName("ek.ol")
    public static int field2425;

    @ObfuscatedName("et.t")
    public static short[] field2438;

    @ObfuscatedName("x.ej")
    public static class87[] field244;

    @ObfuscatedName("x.ot")
    public static class68 field245;

    @ObfuscatedName("ey.ap")
    public static class79 field2482;

    @ObfuscatedName("x.s")
    public static class140 field249;

    @ObfuscatedName("ec.k")
    public static byte[][][] field2490;

    @ObfuscatedName("ea.o")
    public static int[][][] field2496;

    @ObfuscatedName("ew.pp")
    public static Image field2501;

    @ObfuscatedName("ew.v")
    public static class87[] field2502;

    @ObfuscatedName("ef.w")
    public static short[][] field2506;

    @ObfuscatedName("ed.m")
    public static class127 field2572;

    @ObfuscatedName("ed.b")
    public static class70 field2577;

    @ObfuscatedName("ed.mn")
    public static class52 field2579;

    @ObfuscatedName("eh.ab")
    public static class24 field2593;

    @ObfuscatedName("eh.bw")
    public static class155 field2594;

    @ObfuscatedName("o.t")
    public static int field260;

    @ObfuscatedName("fd.fq")
    public static int field2602;

    @ObfuscatedName("fd.k")
    public static class153 field2605;

    @ObfuscatedName("fh.j")
    public static class153 field2611;

    @ObfuscatedName("fh.q")
    public static class153 field2612;

    @ObfuscatedName("o.fs")
    public static int field262;

    @ObfuscatedName("fh.nk")
    public static int field2629;

    @ObfuscatedName("o.el")
    public static class86[] field264;

    @ObfuscatedName("o.o")
    public static int field267;

    @ObfuscatedName("c.be")
    public static class79 field27;

    @ObfuscatedName("fh.ms")
    public static int field2700;

    @ObfuscatedName("fh.c")
    public static boolean[] field2723;

    @ObfuscatedName("fg.nu")
    public static int field2750;

    @ObfuscatedName("fz.v")
    public static short[][] field2757;

    @ObfuscatedName("u.cv")
    public static class183 field277;

    @ObfuscatedName("u.ar")
    public static class155 field278;

    @ObfuscatedName("u.j")
    public static int field279;

    @ObfuscatedName("fa.o")
    public static int[] field2792;

    @ObfuscatedName("ff.c")
    public static class153 field2828;

    @ObfuscatedName("ff.b")
    public static class159[][] field2830;

    @ObfuscatedName("gb.b")
    public static class120 field2842;

    @ObfuscatedName("gy.w")
    public static class87[] field2853;

    @ObfuscatedName("z.nc")
    public static class52 field287;

    @ObfuscatedName("z.et")
    public static class87[] field288;

    @ObfuscatedName("c.og")
    public static class12 field29;

    @ObfuscatedName("d.f")
    public static class16 field294;

    @ObfuscatedName("b.if")
    public static int field3;

    @ObfuscatedName("m.s")
    public static class159 field312;

    @ObfuscatedName("m.nj")
    public static int field313;

    @ObfuscatedName("m.pt")
    public static Font field314;

    @ObfuscatedName("f.c")
    public static class87 field316;

    @ObfuscatedName("f.j")
    public static class87 field317;

    @ObfuscatedName("f.i")
    public static class87[] field318;

    @ObfuscatedName("f.k")
    public static class86 field319;

    @ObfuscatedName("f.b")
    public static boolean field320;

    @ObfuscatedName("f.t")
    public static class87 field321;

    @ObfuscatedName("f.q")
    public static class86 field322;

    @ObfuscatedName("f.p")
    public static int[] field338;

    @ObfuscatedName("c.mv")
    public static class8[] field34;

    @ObfuscatedName("f.l")
    public static int[] field348;

    @ObfuscatedName("a.oq")
    public static class74 field362;

    @ObfuscatedName("h.hv")
    public static class3 field368;

    @ObfuscatedName("h.ee")
    public static class86[] field376;

    @ObfuscatedName("h.ad")
    public static boolean field377;

    @ObfuscatedName("p.bo")
    public static class155 field386;

    @ObfuscatedName("j.na")
    public static int field39;

    @ObfuscatedName("e.iz")
    public static int field397;

    @ObfuscatedName("e.cl")
    public static char field398;

    @ObfuscatedName("e.fd")
    public static int field399;

    @ObfuscatedName("r.i")
    public static String[] field402;

    @ObfuscatedName("r.j")
    public static int[] field408;

    @ObfuscatedName("r.bv")
    public static int field411;

    @ObfuscatedName("r.lp")
    public static class138 field412;

    @ObfuscatedName("r.c")
    public static class153 field413;

    @ObfuscatedName("r.pb")
    public static int field416;

    @ObfuscatedName("av.dr")
    public static byte[][] field476;

    @ObfuscatedName("client.c")
    public static client field478;

    @ObfuscatedName("client.ak")
    public static class155 field509;

    @ObfuscatedName("i.nw")
    public static int field58;

    @ObfuscatedName("i.bu")
    public static int field59;

    @ObfuscatedName("i.e")
    public static int[] field60;

    @ObfuscatedName("client.q")
    public static class133 field629;

    @ObfuscatedName("i.eb")
    public static class86[] field64;

    @ObfuscatedName("i.u")
    public static String[] field67;

    @ObfuscatedName("i.i")
    public static class142 field68;

    @ObfuscatedName("client.fx")
    public static int field707;

    @ObfuscatedName("client.bm")
    public static class155 field739;

    @ObfuscatedName("client.iw")
    public static int field742;

    @ObfuscatedName("an.ns")
    public static int field746;

    @ObfuscatedName("ae.es")
    public static class86[] field751;

    @ObfuscatedName("au.bx")
    public static class155 field764;

    @ObfuscatedName("ag.c")
    public static class153 field775;

    @ObfuscatedName("ag.b")
    public static class153 field778;

    @ObfuscatedName("at.c")
    public static class153 field810;

    @ObfuscatedName("at.j")
    public static class153 field857;

    @ObfuscatedName("ac.ix")
    public static int field865;

    @ObfuscatedName("ac.pm")
    public static Canvas field869;

    @ObfuscatedName("ac.a")
    public static int[] field872;

    @ObfuscatedName("ac.ab")
    public static class79 field873;

    @ObfuscatedName("ac.b")
    public static class153 field877;

    @ObfuscatedName("ac.m")
    public static String field880;

    @ObfuscatedName("aw.ev")
    public static class86 field881;

    @ObfuscatedName("aw.j")
    public static class153 field883;

    @ObfuscatedName("aw.b")
    public static class153 field886;

    @ObfuscatedName("k.y")
    public static int field89;

    @ObfuscatedName("aw.c")
    public static class153 field894;

    @ObfuscatedName("aw.pf")
    public static boolean field900;

    @ObfuscatedName("ah.b")
    public static class153 field907;

    @ObfuscatedName("k.co")
    public static int field92;

    @ObfuscatedName("ai.dh")
    public static byte[][] field923;

    @ObfuscatedName("ai.c")
    public static class153 field924;

    @ObfuscatedName("ai.j")
    public static int field929;

    @ObfuscatedName("q.ov")
    public static class71 field93;

    @ObfuscatedName("ai.pd")
    public static int field933;

    @ObfuscatedName("ai.b")
    public static class153 field935;

    @ObfuscatedName("ap.b")
    public static class153 field941;

    @ObfuscatedName("ap.bk")
    public static class155 field950;

    @ObfuscatedName("ad.b")
    public static class153 field957;

    @ObfuscatedName("q.cf")
    public static int field96;

    @ObfuscatedName("ay.b")
    public static class153 field967;

    @ObfuscatedName("ay.cg")
    public static int field976;

    @ObfuscatedName("az.j")
    public static boolean field978;

    @ObfuscatedName("q.ek")
    public static class86[] field98;

    @ObfuscatedName("q.af")
    public static long field99;

    @ObfuscatedName("az.b")
    public static class153 field991;

    @ObfuscatedName("az.mi")
    public static byte field993;

    @ObfuscatedName("av.b(II)Lai;")
    public static class36 method260(int arg0) {
        class36 var1 = (class36) class36.field930.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field935.method2964(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method760(new class127(var2));
        }
        class36.field930.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("p.c(Ldd;IS)V")
    public static void method230(class116 arg0, int arg1) {
        while (true) {
            class181 var2 = (class181) class182.field2841.method3246();
            if (var2 == null) {
                return;
            }
            arg0.method2273(arg1);
            arg0.method2590(0);
            int var3 = arg0.field2051;
            arg0.method2385(var2.field2837);
            for (int var4 = 0; var4 < var2.field2836; var4++) {
                if (var2.field2834[var4] == 0) {
                    try {
                        int var5 = var2.field2833[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2835[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2590(0);
                            arg0.method2385(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2835[var4];
                            var8.setInt((Object) null, var2.field2831[var4]);
                            arg0.method2590(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2835[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2590(0);
                            arg0.method2385(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2832[var4];
                            byte[][] var12 = var2.field2838[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2590(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2590(1);
                                arg0.method2398(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2590(2);
                                arg0.method2520((String) var16);
                            } else {
                                arg0.method2590(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2832[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2590(0);
                            arg0.method2385(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2590(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2590(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2590(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2590(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2590(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2590(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2590(-16);
                    } catch (SecurityException var38) {
                        arg0.method2590(-17);
                    } catch (IOException var39) {
                        arg0.method2590(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2590(-19);
                    } catch (Exception var41) {
                        arg0.method2590(-20);
                    } catch (Throwable var42) {
                        arg0.method2590(-21);
                    }
                } else {
                    arg0.method2590(var2.field2834[var4]);
                }
            }
            arg0.method2382(var3);
            arg0.method2547(arg0.field2051 - var3);
            var2.method3282();
        }
    }

    @ObfuscatedName("t.c(II)Law;")
    public static class34 method61(int arg0) {
        class34 var1 = (class34) class34.field884.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field886.method2964(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method693(new class127(var2));
        }
        var3.method695();
        class34.field884.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.j(CIB)I")
    public static int method620(char arg0, int arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var3 = Character.toLowerCase(arg0);
            var2 = (var3 << 4) + 1;
        }
        return var2;
    }

    @ObfuscatedName("h.t(Leo;Ljava/lang/String;Ljava/lang/String;I)Lcs;")
    public static class86 method226(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2978(arg1);
        int var4 = arg0.method2979(var3, arg2);
        return class84.method40(arg0, var3, var4);
    }

    @ObfuscatedName("dd.v([BIILck;[Ldz;B)V")
    public static final void method2296(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2409();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2409();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2416();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class9.field139[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    class9.method3086(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("k.w(III)I")
    public static final int method37(int arg0, int arg1) {
        int var2 = class9.method1404(arg0 + 45365, arg1 + 91923, 4) - 128 + (class9.method1404(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (class9.method1404(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("s.r(III)V")
    public static void method138(int arg0, int arg1) {
        if (client.field517 != 0 && arg0 != -1) {
            class139.method2683(field1292, arg0, 0, client.field517, false);
            client.field714 = true;
        }
    }

    @ObfuscatedName("ae.bo(III)V")
    public static final void method553(int arg0, int arg1) {
        if (client.field620 < 2 && client.field631 == 0 && !client.field633) {
            return;
        }
        String var2;
        if (client.field631 == 1 && client.field620 < 2) {
            var2 = class135.field2262 + class135.field2272 + client.field580 + " " + class2.field24;
        } else if (client.field633 && client.field620 < 2) {
            var2 = client.field656 + class135.field2272 + client.field690 + " " + class2.field24;
        } else {
            int var3 = client.field620 - 1;
            String var4;
            if (client.field694[var3].length() > 0) {
                var4 = client.field625[var3] + class135.field2272 + client.field694[var3];
            } else {
                var4 = client.field625[var3];
            }
            var2 = var4;
        }
        if (client.field620 > 2) {
            var2 = var2 + class2.method1344(16777215) + " " + '/' + " " + (client.field620 - 2) + class135.field2197;
        }
        field211.method3342(var2, arg0 + 4, arg1 + 15, 16777215, 0, client.field489 / 1000);
    }

    @ObfuscatedName("e.bz(B)V")
    public static final void method234() {
        int var0 = field211.method3321(class135.field2265);
        for (int var1 = 0; var1 < client.field620; var1++) {
            class183 var2 = field211;
            String var3;
            if (client.field694[var1].length() > 0) {
                var3 = client.field625[var1] + class135.field2272 + client.field694[var1];
            } else {
                var3 = client.field625[var1];
            }
            int var4 = var2.method3321(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = client.field620 * 15 + 21;
        int var6 = class77.field1421 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1416;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        client.field619 = true;
        field1214 = var6;
        field195 = var7;
        field1936 = var0;
        field1314 = client.field620 * 15 + 22;
    }

    @ObfuscatedName("at.bb(II)Z")
    public static final boolean method663(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = client.field672[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("v.bd(I)V")
    public static final void method64() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field620 - 1; var1++) {
                if (client.field672[var1] < 1000 && client.field672[var1 + 1] > 1000) {
                    String var2 = client.field694[var1];
                    client.field694[var1] = client.field694[var1 + 1];
                    client.field694[var1 + 1] = var2;
                    String var3 = client.field625[var1];
                    client.field625[var1] = client.field625[var1 + 1];
                    client.field625[var1 + 1] = var3;
                    int var4 = client.field672[var1];
                    client.field672[var1] = client.field672[var1 + 1];
                    client.field672[var1 + 1] = var4;
                    int var5 = client.field621[var1];
                    client.field621[var1] = client.field621[var1 + 1];
                    client.field621[var1 + 1] = var5;
                    int var6 = client.field622[var1];
                    client.field622[var1] = client.field622[var1 + 1];
                    client.field622[var1 + 1] = var6;
                    int var7 = client.field603[var1];
                    client.field603[var1] = client.field603[var1 + 1];
                    client.field603[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }
}
