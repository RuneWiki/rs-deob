package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;

public class Statics {

    @ObfuscatedName("q.s")
    public static boolean field10;

    @ObfuscatedName("q.fx")
    public static class171[] field11;

    @ObfuscatedName("h.cr")
    public static class121 field111;

    @ObfuscatedName("bl.al")
    public static class5[] field1114;

    @ObfuscatedName("bl.r")
    public static class87 field1115;

    @ObfuscatedName("bl.nr")
    public static int field1116;

    @ObfuscatedName("bl.oh")
    public static int field1117;

    @ObfuscatedName("bo.de")
    public static class182 field1119;

    @ObfuscatedName("h.oc")
    public static int field112;

    @ObfuscatedName("bo.dn")
    public static class32 field1120;

    @ObfuscatedName("bh.h")
    public static class87 field1125;

    @ObfuscatedName("bh.cx")
    public static String field1126;

    @ObfuscatedName("bh.ix")
    public static int field1127;

    @ObfuscatedName("cr.d")
    public static int field1128;

    @ObfuscatedName("cr.l")
    public static class87 field1129;

    @ObfuscatedName("cr.o")
    public static class149 field1131;

    @ObfuscatedName("cr.s")
    public static class23 field1132;

    @ObfuscatedName("cr.a")
    public static class87 field1133;

    @ObfuscatedName("cr.v")
    public static boolean field1134;

    @ObfuscatedName("cr.q")
    public static class87 field1135;

    @ObfuscatedName("ch.w")
    public static int field1145;

    @ObfuscatedName("cf.en")
    public static int[] field1161;

    @ObfuscatedName("cg.ot")
    public static int field1162;

    @ObfuscatedName("cq.cb")
    public static char field1168;

    @ObfuscatedName("cs.fs")
    public static int[] field1169;

    @ObfuscatedName("r.y")
    public static int[] field118;

    @ObfuscatedName("cb.a")
    public static long field1189;

    @ObfuscatedName("cb.j")
    public static class168 field1199;

    @ObfuscatedName("q.nh")
    public static byte field12;

    @ObfuscatedName("cb.nn")
    public static class171 field1209;

    @ObfuscatedName("cb.om")
    public static int field1210;

    @ObfuscatedName("cw.v")
    public static int[] field1215;

    @ObfuscatedName("cw.r")
    public static class87 field1216;

    @ObfuscatedName("cy.bl")
    public static class121 field1220;

    @ObfuscatedName("cd.bx")
    public static class32 field1221;

    @ObfuscatedName("cp.fm")
    public static class171[] field1226;

    @ObfuscatedName("cp.ge")
    public static int field1227;

    @ObfuscatedName("cp.ja")
    public static class141 field1228;

    @ObfuscatedName("ce.am")
    public static class172[] field1229;

    @ObfuscatedName("d.j")
    public static int field123;

    @ObfuscatedName("ce.in")
    public static class183 field1230;

    @ObfuscatedName("ce.r")
    public static class87 field1231;

    @ObfuscatedName("ct.k")
    public static short[] field1232;

    @ObfuscatedName("ct.y")
    public static String[] field1234;

    @ObfuscatedName("ct.d")
    public static short[][] field1239;

    @ObfuscatedName("d.cn")
    public static int field124;

    @ObfuscatedName("ct.u")
    public static short[][] field1240;

    @ObfuscatedName("ct.co")
    public static int field1244;

    @ObfuscatedName("d.da")
    public static int field125;

    @ObfuscatedName("d.fn")
    public static class172[] field126;

    @ObfuscatedName("d.hg")
    public static class141 field127;

    @ObfuscatedName("d.b")
    public static int field128;

    @ObfuscatedName("cx.br")
    public static class121 field1280;

    @ObfuscatedName("k.l")
    public static class172 field130;

    @ObfuscatedName("k.o")
    public static class172[] field131;

    @ObfuscatedName("k.d")
    public static class172[] field132;

    @ObfuscatedName("k.a")
    public static class172 field134;

    @ObfuscatedName("k.r")
    public static class172 field135;

    @ObfuscatedName("k.c")
    public static class171 field139;

    @ObfuscatedName("cj.cb")
    public static class121 field1469;

    @ObfuscatedName("co.w")
    public static int[] field1480;

    @ObfuscatedName("co.ey")
    public static class45 field1481;

    @ObfuscatedName("ck.cc")
    public static class121 field1491;

    @ObfuscatedName("ck.lh")
    public static int field1492;

    @ObfuscatedName("ck.ow")
    public static class148 field1493;

    @ObfuscatedName("l.fh")
    public static class171[] field15;

    @ObfuscatedName("k.q")
    public static boolean field150;

    @ObfuscatedName("dd.oj")
    public static int field1515;

    @ObfuscatedName("dd.dg")
    public static int field1516;

    @ObfuscatedName("di.h")
    public static int[] field1517;

    @ObfuscatedName("di.r")
    public static int field1519;

    @ObfuscatedName("di.on")
    public static class18 field1520;

    @ObfuscatedName("di.ad")
    public static class74 field1521;

    @ObfuscatedName("dw.q")
    public static class63 field1522;

    @ObfuscatedName("dw.h")
    public static class87 field1523;

    @ObfuscatedName("dz.z")
    public static class41 field1534;

    @ObfuscatedName("dz.t")
    public static int field1547;

    @ObfuscatedName("dz.g")
    public static Font field1548;

    @ObfuscatedName("k.h")
    public static class171 field155;

    @ObfuscatedName("dz.q")
    public static class35 field1551;

    @ObfuscatedName("dz.v")
    public static class30 field1553;

    @ObfuscatedName("dz.aj")
    public static boolean field1555;

    @ObfuscatedName("dy.aa")
    public static class15 field1556;

    @ObfuscatedName("dp.n")
    public static int[] field1569;

    @ObfuscatedName("dp.fb")
    public static int[] field1570;

    @ObfuscatedName("df.d")
    public static class87 field1574;

    @ObfuscatedName("ds.jv")
    public static int field1598;

    @ObfuscatedName("ds.gi")
    public static int[] field1599;

    @ObfuscatedName("l.d")
    public static boolean field16;

    @ObfuscatedName("da.fp")
    public static class171[] field1618;

    @ObfuscatedName("k.av")
    public static class171[] field163;

    @ObfuscatedName("eo.aa")
    public static float[] field1643;

    @ObfuscatedName("eo.at")
    public static float[] field1644;

    @ObfuscatedName("eo.s")
    public static int field1649;

    @ObfuscatedName("k.t")
    public static int[] field165;

    @ObfuscatedName("eo.v")
    public static int field1650;

    @ObfuscatedName("eo.f")
    public static int field1651;

    @ObfuscatedName("eo.j")
    public static int field1653;

    @ObfuscatedName("eo.e")
    public static class25[] field1654;

    @ObfuscatedName("eo.b")
    public static class17[] field1655;

    @ObfuscatedName("eo.y")
    public static class24[] field1656;

    @ObfuscatedName("eo.t")
    public static class16[] field1657;

    @ObfuscatedName("eo.w")
    public static boolean[] field1658;

    @ObfuscatedName("eo.m")
    public static float[] field1665;

    @ObfuscatedName("eo.g")
    public static int[] field1667;

    @ObfuscatedName("eo.af")
    public static float[] field1668;

    @ObfuscatedName("eo.ae")
    public static float[] field1669;

    @ObfuscatedName("eo.ai")
    public static float[] field1670;

    @ObfuscatedName("eo.aj")
    public static float[] field1671;

    @ObfuscatedName("eo.ar")
    public static int[] field1672;

    @ObfuscatedName("eo.au")
    public static int[] field1673;

    @ObfuscatedName("eo.u")
    public static byte[] field1674;

    @ObfuscatedName("eh.b")
    public static int[] field1685;

    @ObfuscatedName("k.jl")
    public static int field172;

    @ObfuscatedName("ew.d")
    public static byte[][][] field1720;

    @ObfuscatedName("ew.k")
    public static class87 field1721;

    @ObfuscatedName("et.cs")
    public static class121 field1727;

    @ObfuscatedName("ed.jo")
    public static class141 field1738;

    @ObfuscatedName("ep.fv")
    public static class171[] field1761;

    @ObfuscatedName("ey.h")
    public static class87 field1768;

    @ObfuscatedName("ey.d")
    public static class87 field1769;

    @ObfuscatedName("u.ew")
    public static int[] field179;

    @ObfuscatedName("ey.o")
    public static class141[][] field1807;

    @ObfuscatedName("ey.c")
    public static boolean[] field1862;

    @ObfuscatedName("v.fj")
    public static class172[] field188;

    @ObfuscatedName("v.k")
    public static int[][] field189;

    @ObfuscatedName("ey.fl")
    public static class171 field1892;

    @ObfuscatedName("f.a")
    public static String[] field190;

    @ObfuscatedName("ej.dm")
    public static class38 field1905;

    @ObfuscatedName("ej.dc")
    public static class182 field1906;

    @ObfuscatedName("ej.os")
    public static int field1907;

    @ObfuscatedName("client.ax")
    public static class111 field1912;

    @ObfuscatedName("client.bb")
    public static long field1940;

    @ObfuscatedName("client.cf")
    public static class121 field1941;

    @ObfuscatedName("client.ci")
    public static class121 field1943;

    @ObfuscatedName("client.cg")
    public static class121 field1953;

    @ObfuscatedName("a.o")
    public static byte[][][] field20;

    @ObfuscatedName("f.or")
    public static int field200;

    @ObfuscatedName("f.v")
    public static class141 field201;

    @ObfuscatedName("client.is")
    public static int field2046;

    @ObfuscatedName("s.u")
    public static class141 field205;

    @ObfuscatedName("s.la")
    public static int field206;

    @ObfuscatedName("s.iz")
    public static int field207;

    @ObfuscatedName("a.c")
    public static byte[][][] field21;

    @ObfuscatedName("client.cq")
    public static class121 field2103;

    @ObfuscatedName("j.g")
    public static class136 field219;

    @ObfuscatedName("a.h")
    public static byte[][][] field22;

    @ObfuscatedName("t.u")
    public static int[] field221;

    @ObfuscatedName("ek.h")
    public static class87 field2276;

    @ObfuscatedName("t.v")
    public static int[] field231;

    @ObfuscatedName("t.f")
    public static boolean[] field232;

    @ObfuscatedName("ez.h")
    public static class87 field2351;

    @ObfuscatedName("eu.d")
    public static class87 field2359;

    @ObfuscatedName("eu.h")
    public static class87 field2360;

    @ObfuscatedName("eu.r")
    public static class87 field2361;

    @ObfuscatedName("b.a")
    public static int field238;

    @ObfuscatedName("ff.r")
    public static class87 field2383;

    @ObfuscatedName("b.o")
    public static class20 field239;

    @ObfuscatedName("fc.r")
    public static class87 field2392;

    @ObfuscatedName("fc.d")
    public static int field2393;

    @ObfuscatedName("fc.h")
    public static class87 field2400;

    @ObfuscatedName("ft.h")
    public static class87 field2405;

    @ObfuscatedName("fo.h")
    public static class87 field2415;

    @ObfuscatedName("fo.fq")
    public static class171[] field2420;

    @ObfuscatedName("fd.h")
    public static class87 field2424;

    @ObfuscatedName("b.l")
    public static boolean field243;

    @ObfuscatedName("fg.r")
    public static class87 field2444;

    @ObfuscatedName("fw.h")
    public static class87 field2477;

    @ObfuscatedName("fa.r")
    public static int field2479;

    @ObfuscatedName("fa.h")
    public static class87 field2481;

    @ObfuscatedName("fk.h")
    public static int[] field2482;

    @ObfuscatedName("fk.r")
    public static int field2483;

    @ObfuscatedName("fk.d")
    public static int field2484;

    @ObfuscatedName("fj.g")
    public static String field2494;

    @ObfuscatedName("fp.q")
    public static Applet field2496;

    @ObfuscatedName("fp.l")
    public static String field2497;

    @ObfuscatedName("fp.a")
    public static int field2498;

    @ObfuscatedName("fv.ai")
    public static int field2523;

    @ObfuscatedName("fv.n")
    public static int field2531;

    @ObfuscatedName("fv.x")
    public static int field2532;

    @ObfuscatedName("fv.i")
    public static int field2533;

    @ObfuscatedName("fv.m")
    public static int field2534;

    @ObfuscatedName("fv.aa")
    public static int field2536;

    @ObfuscatedName("fv.ae")
    public static int field2538;

    @ObfuscatedName("fv.af")
    public static int field2540;

    @ObfuscatedName("fv.ar")
    public static class52 field2541;

    @ObfuscatedName("fq.z")
    public static class172[] field2555;

    @ObfuscatedName("b.q")
    public static class32 field263;

    @ObfuscatedName("fb.bn")
    public static int field2743;

    @ObfuscatedName("fb.bf")
    public static int field2771;

    @ObfuscatedName("fb.bc")
    public static int field2772;

    @ObfuscatedName("a.j")
    public static int[] field29;

    @ObfuscatedName("g.ai")
    public static Image field294;

    @ObfuscatedName("g.fz")
    public static class172 field295;

    @ObfuscatedName("n.pj")
    public static class33 field315;

    @ObfuscatedName("n.t")
    public static class136 field316;

    @ObfuscatedName("m.gk")
    public static int field336;

    @ObfuscatedName("ai.k")
    public static int field345;

    @ObfuscatedName("ai.d")
    public static float field347;

    @ObfuscatedName("aa.ac")
    public static class73 field349;

    @ObfuscatedName("a.dt")
    public static class182 field35;

    @ObfuscatedName("aa.gw")
    public static int field350;

    @ObfuscatedName("aa.hl")
    public static class141 field351;

    @ObfuscatedName("ae.bd")
    public static class38 field352;

    @ObfuscatedName("at.l")
    public static int[] field353;

    @ObfuscatedName("at.q")
    public static int field354;

    @ObfuscatedName("at.cj")
    public static int field355;

    @ObfuscatedName("at.eq")
    public static int field356;

    @ObfuscatedName("a.me")
    public static class78 field36;

    @ObfuscatedName("aj.ay")
    public static class172[] field367;

    @ObfuscatedName("ar.eg")
    public static int field373;

    @ObfuscatedName("ar.fu")
    public static class171[] field374;

    @ObfuscatedName("au.l")
    public static File field376;

    @ObfuscatedName("an.l")
    public static String field379;

    @ObfuscatedName("an.q")
    public static String field387;

    @ObfuscatedName("o.ab")
    public static class172[] field39;

    @ObfuscatedName("an.s")
    public static int[] field390;

    @ObfuscatedName("an.by")
    public static class38 field391;

    @ObfuscatedName("o.u")
    public static int field40;

    @ObfuscatedName("o.f")
    public static class137 field41;

    @ObfuscatedName("o.x")
    public static int[] field42;

    @ObfuscatedName("o.lr")
    public static class141[] field43;

    @ObfuscatedName("az.cw")
    public static class121 field489;

    @ObfuscatedName("az.du")
    public static int field490;

    @ObfuscatedName("az.jh")
    public static int field491;

    @ObfuscatedName("c.aw")
    public static class172 field50;

    @ObfuscatedName("c.bh")
    public static class121 field51;

    @ObfuscatedName("ad.o")
    public static File field520;

    @ObfuscatedName("ad.c")
    public static File field521;

    @ObfuscatedName("ad.h")
    public static int field527;

    @ObfuscatedName("ad.j")
    public static class14[] field528;

    @ObfuscatedName("ad.i")
    public static int[] field533;

    @ObfuscatedName("ax.c")
    public static int[] field534;

    @ObfuscatedName("ax.q")
    public static int field535;

    @ObfuscatedName("ax.l")
    public static int field536;

    @ObfuscatedName("ax.o")
    public static int[] field537;

    @ObfuscatedName("ax.a")
    public static int field538;

    @ObfuscatedName("ax.r")
    public static int[] field539;

    @ObfuscatedName("ax.d")
    public static int[] field540;

    @ObfuscatedName("ax.k")
    public static byte[][] field541;

    @ObfuscatedName("ax.dq")
    public static int field542;

    @ObfuscatedName("ax.jt")
    public static int field543;

    @ObfuscatedName("ax.nl")
    public static class126[] field544;

    @ObfuscatedName("ax.bo")
    public static class121 field545;

    @ObfuscatedName("as.aq")
    public static class7 field550;

    @ObfuscatedName("as.kc")
    public static int field551;

    @ObfuscatedName("ak.e")
    public static int field556;

    @ObfuscatedName("ak.ab")
    public static String field557;

    @ObfuscatedName("ak.i")
    public static Canvas field558;

    @ObfuscatedName("av.p")
    public static String field562;

    @ObfuscatedName("av.r")
    public static int field563;

    @ObfuscatedName("av.oe")
    public static class18 field564;

    @ObfuscatedName("ab.z")
    public static int field593;

    @ObfuscatedName("ab.g")
    public static int field594;

    @ObfuscatedName("ab.bk")
    public static int field598;

    @ObfuscatedName("ab.ai")
    public static int field603;

    @ObfuscatedName("ab.b")
    public static int field604;

    @ObfuscatedName("ab.w")
    public static int field605;

    @ObfuscatedName("ab.p")
    public static int field607;

    @ObfuscatedName("ab.x")
    public static int field610;

    @ObfuscatedName("ab.af")
    public static int field611;

    @ObfuscatedName("ab.aa")
    public static int field614;

    @ObfuscatedName("ab.m")
    public static int field615;

    @ObfuscatedName("ab.at")
    public static int field617;

    @ObfuscatedName("ab.i")
    public static int field625;

    @ObfuscatedName("ab.ae")
    public static int field627;

    @ObfuscatedName("ab.n")
    public static int field637;

    @ObfuscatedName("ab.bw")
    public static boolean[][] field643;

    @ObfuscatedName("ab.bu")
    public static int field644;

    @ObfuscatedName("ab.bf")
    public static int field645;

    @ObfuscatedName("ab.bc")
    public static int field646;

    @ObfuscatedName("ab.bn")
    public static int field647;

    @ObfuscatedName("ab.bz")
    public static int field649;

    @ObfuscatedName("al.ed")
    public static int[][] field692;

    @ObfuscatedName("al.np")
    public static byte field693;

    @ObfuscatedName("al.ov")
    public static int field694;

    @ObfuscatedName("aq.ch")
    public static class121 field702;

    @ObfuscatedName("aq.fy")
    public static int[] field703;

    @ObfuscatedName("aq.e")
    public static int[][][] field704;

    @ObfuscatedName("bg.r")
    public static byte[][][] field711;

    @ObfuscatedName("bg.t")
    public static String[] field712;

    @ObfuscatedName("bg.f")
    public static class182 field713;

    @ObfuscatedName("bg.oq")
    public static int field714;

    @ObfuscatedName("be.f")
    public static int[] field726;

    @ObfuscatedName("be.n")
    public static Frame field727;

    @ObfuscatedName("be.dv")
    public static class32 field728;

    @ObfuscatedName("bi.k")
    public static int field736;

    @ObfuscatedName("bi.cv")
    public static class121 field737;

    @ObfuscatedName("bi.gz")
    public static int field738;

    @ObfuscatedName("bi.lv")
    public static class28 field739;

    @ObfuscatedName("bp.ak")
    public static class11 field758;

    @ObfuscatedName("bp.gu")
    public static int field759;

    @ObfuscatedName("bw.ex")
    public static byte[][] field760;

    @ObfuscatedName("bw.li")
    public static int field761;

    @ObfuscatedName("bu.fe")
    public static class172[] field768;

    @ObfuscatedName("bu.au")
    public static client field769;

    @ObfuscatedName("bf.i")
    public static int[] field794;

    @ObfuscatedName("bf.ep")
    public static byte[][] field809;

    @ObfuscatedName("bf.ok")
    public static class26 field810;

    @ObfuscatedName("bk.z")
    public static String field821;

    @ObfuscatedName("bk.hw")
    public static class141 field822;

    @ObfuscatedName("bz.z")
    public static int[] field826;

    @ObfuscatedName("bz.gg")
    public static int field827;

    @ObfuscatedName("bj.b")
    public static int[] field828;

    @ObfuscatedName("bj.l")
    public static long field829;

    @ObfuscatedName("bj.q")
    public static long field830;

    @ObfuscatedName("bj.fr")
    public static class171 field831;

    @ObfuscatedName("bj.jk")
    public static int field832;

    @ObfuscatedName("bt.r")
    public static short[] field834;

    @ObfuscatedName("bt.u")
    public static int[] field835;

    @ObfuscatedName("bs.je")
    public static int field844;

    @ObfuscatedName("bs.h")
    public static class87 field845;

    @ObfuscatedName("bq.og")
    public static int field846;

    @ObfuscatedName("bm.gb")
    public static int field850;

    @ObfuscatedName("bv.p")
    public static FontMetrics field863;

    @ObfuscatedName("bv.ba")
    public static class121 field864;

    @ObfuscatedName("bv.et")
    public static int[] field865;

    @ObfuscatedName("br.fi")
    public static class171[] field879;

    @ObfuscatedName("q.cw")
    public static int field9;

    @ObfuscatedName("bq.a(B)[Lbr;")
    public static class74[] method855() {
        return new class74[] { class74.field874, class74.field877, class74.field872, class74.field875, class74.field876, class74.field873 };
    }

    @ObfuscatedName("k.q(Ljava/lang/String;S)Ljava/io/File;")
    public static File method90(String arg0) {
        if (!class34.field377) {
            throw new RuntimeException("");
        }
        File var1 = (File) class34.field375.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(field376, arg0);
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
            class34.field375.put(arg0, var2);
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

    @ObfuscatedName("bj.q(II)Lbh;")
    public static class78 method798(int arg0) {
        class78[] var1 = new class78[] { class78.field1121, class78.field1122, class78.field1123 };
        class78[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class78 var4 = var2[var3];
            if (var4.field1124 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("ed.q(Lcv;IIB)[Lfm;")
    public static class172[] method1782(class87 arg0, int arg1, int arg2) {
        if (!class40.method753(arg0, arg1, arg2)) {
            return null;
        }
        class172[] var3 = new class172[field535];
        for (int var4 = 0; var4 < field535; var4++) {
            class172 var5 = var3[var4] = new class172();
            var5.field2519 = field536;
            var5.field2520 = field538;
            var5.field2517 = field537[var4];
            var5.field2515 = field534[var4];
            var5.field2513 = field1517[var4];
            var5.field2516 = field539[var4];
            var5.field2518 = field540;
            var5.field2514 = field541[var4];
        }
        field537 = null;
        field534 = null;
        field1517 = null;
        field539 = null;
        field540 = null;
        field541 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("h.k(II)Lfd;")
    public static class161 method49(int arg0) {
        class161 var1 = (class161) class161.field2422.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2424.method1024(8, arg0);
        class161 var3 = new class161();
        if (var2 != null) {
            var3.method2514(new class136(var2));
        }
        class161.field2422.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ff.k(II)Lft;")
    public static class159 method2467(int arg0) {
        class159 var1 = (class159) class159.field2409.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2405.method1024(4, arg0);
        class159 var3 = new class159();
        if (var2 != null) {
            var3.method2497(new class136(var2), arg0);
        }
        var3.method2495();
        class159.field2409.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bv.k(IIB)I")
    public static int method887(int arg0, int arg1) {
        class127 var2 = (class127) class127.field1624.method1290((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1625.length; var4++) {
                if (var2.field1623[var4] == arg1) {
                    var3 += var2.field1625[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("g.q(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method244(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = class170.method2450(arg1);
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
            if (field2496 == null) {
                return;
            }
            URL var7 = new URL(field2496.getCodeBase(), "clienterror.ws?c=" + field2498 + "&u=" + field2497 + "&v1=" + field387 + "&v2=" + field379 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("bm.l(CIB)I")
    public static int method884(char arg0, int arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var3 = Character.toLowerCase(arg0);
            var2 = (var3 << 4) + 1;
        }
        return var2;
    }

    @ObfuscatedName("aq.l(ILcv;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method693(int arg0, class87 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method1034(arg2);
        int var7 = arg1.method1035(var6, arg3);
        class79.method6(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("az.u(II)V")
    public static void method452(int arg0) {
        class127 var1 = (class127) class127.field1624.method1290((long) arg0);
        if (var1 != null) {
            var1.method1328();
        }
    }

    @ObfuscatedName("cy.a(J)Ljava/lang/String;")
    public static String method1117(long arg0) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var2 = 0;
            for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
                var2++;
            }
            StringBuilder var5 = new StringBuilder(var2);
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                char var8 = class82.field1160[(int) (var6 - arg0 * 37L)];
                if (var8 == '_') {
                    int var9 = var5.length() - 1;
                    var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                    var8 = 160;
                }
                var5.append(var8);
            }
            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
        }
    }

    @ObfuscatedName("g.l(Lcv;III)Lfm;")
    public static class172 method241(class87 arg0, int arg1, int arg2) {
        return class40.method753(arg0, arg1, arg2) ? class40.method394() : null;
    }

    @ObfuscatedName("ak.a(Lfs;Lfs;I)V")
    public static void method536(class182 arg0, class182 arg1) {
        if (class9.field164) {
            class9.method715(arg0, arg1);
            return;
        }
        if (client.field1917 == 0 || client.field1917 == 5) {
            byte var2 = 20;
            arg0.method2879(class75.field1079, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class165.method2594(230, var3, 304, 34, 9179409);
            class165.method2594(231, var3 + 1, 302, 32, 0);
            class165.method2588(232, var3 + 2, class9.field143 * 3, 30, 9179409);
            class165.method2588(class9.field143 * 3 + 232, var3 + 2, 300 - class9.field143 * 3, 30, 0);
            arg0.method2879(class9.field152, 382, 276 - var2, 16777215, -1);
        }
        if (client.field1917 == 20) {
            field130.method2752(382 - field130.field2513 / 2, 271 - field130.field2516 / 2);
            short var4 = 211;
            arg0.method2879(class9.field154, 382, var4, 16776960, 0);
            int var54 = var4 + 15;
            arg0.method2879(class9.field146, 382, var54, 16776960, 0);
            int var55 = var54 + 15;
            arg0.method2879(class9.field156, 382, var55, 16776960, 0);
            int var56 = var55 + 15;
            int var57 = var56 + 10;
            arg0.method2852(class75.field1000, 272, var57, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = class9.field157; arg0.method2822(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method2852(class174.method2826(var6), 312, var57, 16777215, 0);
            var54 = var57 + 15;
            arg0.method2852(class75.field925 + class83.method849(class9.field158), 274, var54, 16777215, 0);
            var54 += 15;
        }
        if (client.field1917 == 10) {
            field130.method2752(202, 171);
            if (class9.field153 == 0) {
                short var7 = 251;
                arg0.method2879(class75.field1088, 382, var7, 16776960, 0);
                int var58 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                field134.method2752(var8 - 73, var9 - 20);
                arg0.method2845(class75.field1089, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                field134.method2752(var10 - 73, var9 - 20);
                arg0.method2845(class75.field1090, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class9.field153 == 2) {
                short var11 = 211;
                arg0.method2879(class9.field154, 382, var11, 16776960, 0);
                int var59 = var11 + 15;
                arg0.method2879(class9.field146, 382, var59, 16776960, 0);
                int var60 = var59 + 15;
                arg0.method2879(class9.field156, 382, var60, 16776960, 0);
                int var61 = var60 + 15;
                int var62 = var61 + 10;
                arg0.method2852(class75.field1000, 272, var62, 16777215, 0);
                short var12 = 200;
                String var13;
                for (var13 = class9.field157; arg0.method2822(var13) > var12; var13 = var13.substring(1)) {
                }
                arg0.method2852(class174.method2826(var13) + (class9.field136 == 0 & client.field1919 % 40 < 20 ? class1.method348(16776960) + class1.field3 : ""), 312, var62, 16777215, 0);
                var59 = var62 + 15;
                arg0.method2852(class75.field925 + class83.method849(class9.field158) + (class9.field136 == 1 & client.field1919 % 40 < 20 ? class1.method348(16776960) + class1.field3 : ""), 274, var59, 16777215, 0);
                var59 += 15;
                short var14 = 302;
                short var15 = 321;
                field134.method2752(var14 - 73, var15 - 20);
                arg0.method2879(class75.field1091, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                field134.method2752(var16 - 73, var15 - 20);
                arg0.method2879(class75.field1092, var16, var15 + 5, 16777215, 0);
            } else if (class9.field153 == 3) {
                arg0.method2879(class75.field880, 382, 211, 16776960, 0);
                short var17 = 236;
                arg0.method2879(class75.field1094, 382, var17, 16777215, 0);
                int var63 = var17 + 15;
                arg0.method2879(class75.field1057, 382, var63, 16777215, 0);
                int var64 = var63 + 15;
                arg0.method2879(class75.field968, 382, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method2879(class75.field1097, 382, var65, 16777215, 0);
                int var66 = var65 + 15;
                short var18 = 382;
                short var19 = 321;
                field134.method2752(var18 - 73, var19 - 20);
                arg0.method2879(class75.field1092, var18, var19 + 5, 16777215, 0);
            }
        }
        if (class9.field162 > 0) {
            class9.method1013(class9.field162);
            class9.field162 = 0;
        }
        short var20 = 256;
        if (class9.field145 > 0) {
            for (int var21 = 0; var21 < 256; var21++) {
                if (class9.field145 > 768) {
                    field165[var21] = class9.method734(field118[var21], field828[var21], 1024 - class9.field145);
                } else if (class9.field145 > 256) {
                    field165[var21] = field828[var21];
                } else {
                    field165[var21] = class9.method734(field828[var21], field118[var21], 256 - class9.field145);
                }
            }
        } else if (class9.field160 > 0) {
            for (int var22 = 0; var22 < 256; var22++) {
                if (class9.field160 > 768) {
                    field165[var22] = class9.method734(field118[var22], field1480[var22], 1024 - class9.field160);
                } else if (class9.field160 > 256) {
                    field165[var22] = field1480[var22];
                } else {
                    field165[var22] = class9.method734(field1480[var22], field118[var22], 256 - class9.field160);
                }
            }
        } else {
            for (int var23 = 0; var23 < 256; var23++) {
                field165[var23] = field118[var23];
            }
        }
        class165.method2586(0, 9, 128, var20 + 7);
        field139.method2674(0, 0);
        class165.method2585();
        int var24 = 0;
        int var25 = 6885;
        for (int var26 = 1; var26 < var20 - 1; var26++) {
            int var27 = (var20 - var26) * class9.field144[var26] / var20;
            int var28 = var27 + 22;
            if (var28 < 0) {
                var28 = 0;
            }
            var24 += var28;
            for (int var29 = var28; var29 < 128; var29++) {
                int var30 = field42[var24++];
                if (var30 == 0) {
                    var25++;
                } else {
                    int var32 = 256 - var30;
                    int var33 = field165[var30];
                    int var34 = field1534.field549[var25];
                    field1534.field549[var25++] = ((var33 & 0xFF00) * var30 + (var34 & 0xFF00) * var32 & 0xFF0000) + ((var33 & 0xFF00FF) * var30 + (var34 & 0xFF00FF) * var32 & 0xFF00FF00) >> 8;
                }
            }
            var25 += var28 + 765 - 128;
        }
        class165.method2586(637, 9, 765, var20 + 7);
        field155.method2674(382, 0);
        class165.method2585();
        int var35 = 0;
        int var36 = 7546;
        for (int var37 = 1; var37 < var20 - 1; var37++) {
            int var38 = (var20 - var37) * class9.field144[var37] / var20;
            int var39 = 103 - var38;
            int var40 = var36 + var38;
            for (int var41 = 0; var41 < var39; var41++) {
                int var42 = field42[var35++];
                if (var42 == 0) {
                    var40++;
                } else {
                    int var44 = 256 - var42;
                    int var45 = field165[var42];
                    int var46 = field1534.field549[var40];
                    field1534.field549[var40++] = ((var45 & 0xFF00) * var42 + (var46 & 0xFF00) * var44 & 0xFF0000) + ((var45 & 0xFF00FF) * var42 + (var46 & 0xFF00FF) * var44 & 0xFF00FF00) >> 8;
                }
            }
            var35 += 128 - var39;
            var36 = 765 - var39 - var38 + var40;
        }
        field132[class9.field137 ? 1 : 0].method2752(725, 463);
        if (client.field1917 > 5 && client.field2048 == 0) {
            if (field50 == null) {
                field50 = class40.method1231(field1941, "sl_button", "");
            } else {
                byte var47 = 5;
                short var48 = 463;
                byte var49 = 100;
                byte var50 = 35;
                field50.method2752(var47, var48);
                arg0.method2879(class75.field1069 + " " + client.field2083, var49 / 2 + var47, var50 / 2 + var48 - 2, 16777215, 0);
                if (field758 == null) {
                    arg1.method2879(class75.field1108, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                } else {
                    arg1.method2879(class75.field1107, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var51 = field558.getGraphics();
            field1534.method531(var51, 0, 0);
        } catch (Exception var53) {
            field558.repaint();
        }
    }

    @ObfuscatedName("dc.c(III)I")
    public static int method1476(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return field1199 != null && field1199.field1513 == var2 ? field316.field1722 * 99 / (field316.field1725.length - field1199.field2493) + 1 : 0;
    }

    @ObfuscatedName("dd.cz(I)V")
    public static final void method1333() {
        for (int var0 = -1; var0 < client.field2041; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = client.field2166[var0];
            }
            class183 var2 = client.field2040[var1];
            if (var2 != null) {
                client.method430(var2, 1);
            }
        }
    }

    @ObfuscatedName("s.di(ZI)V")
    public static final void method121(boolean arg0) {
        for (int var1 = 0; var1 < client.field1999; var1++) {
            class184 var2 = client.field2062[client.field1984[var1]];
            int var3 = (client.field1984[var1] << 14) + 536870912;
            if (var2 != null && var2.method2909() && var2.field2805.field2291 == arg0 && var2.field2805.method2341()) {
                int var4 = var2.field2630 >> 7;
                int var5 = var2.field2615 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field2654 == 1 && (var2.field2630 & 0x7F) == 64 && (var2.field2615 & 0x7F) == 64) {
                        if (client.field2107 == client.field2021[var4][var5]) {
                            continue;
                        }
                        client.field2021[var4][var5] = client.field2107;
                    }
                    if (!var2.field2805.field2299) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    field1481.method600(field2046, var2.field2630, var2.field2615, client.method358(var2.field2630 + (var2.field2654 * 64 - 64), var2.field2615 + (var2.field2654 * 64 - 64), field2046), var2.field2654 * 64 - 64 + 60, var2, var2.field2616, var3, var2.field2617);
                }
            }
        }
    }

    @ObfuscatedName("cv.dy(III)V")
    public static final void method1087(int arg0, int arg1) {
        if (client.field1927 == 2) {
            client.method1334((client.field1930 - field125 << 7) + client.field2190, (client.field2065 - field542 << 7) + client.field2094, client.field2113 * 2);
            if (client.field2070 > -1 && client.field1919 % 20 < 10) {
                field1761[0].method2676(client.field2070 + arg0 - 12, client.field1937 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ba.dj(I)V")
    public static final void method898() {
        client.method40(false);
        client.field2111 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < field809.length; var1++) {
            if (field865[var1] != -1 && field809[var1] == null) {
                field809[var1] = field111.method1024(field865[var1], 0);
                if (field809[var1] == null) {
                    var0 = false;
                    client.field2111++;
                }
            }
            if (field1161[var1] != -1 && field760[var1] == null) {
                field760[var1] = field111.method1021(field1161[var1], 0, field692[var1]);
                if (field760[var1] == null) {
                    var0 = false;
                    client.field2111++;
                }
            }
        }
        if (!var0) {
            client.field1975 = 1;
            return;
        }
        client.field1973 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < field809.length; var3++) {
            byte[] var4 = field760[var3];
            if (var4 != null) {
                int var5 = (field179[var3] >> 8) * 64 - field125;
                int var6 = (field179[var3] & 0xFF) * 64 - field542;
                if (client.field2157) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class136 var9 = new class136(var4);
                int var10 = -1;
                label467: while (true) {
                    int var11 = var9.method1615();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method1615();
                            if (var16 == 0) {
                                continue label467;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method1602() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class154 var22 = class154.method886(var10);
                                if (var19 != 22 || !client.field1914 || var22.field2319 != 0 || var22.field2348 == 1 || var22.field2347) {
                                    if (!var22.method2368()) {
                                        client.field1973++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method1615();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method1602();
                    }
                }
            }
        }
        if (!var2) {
            client.field1975 = 2;
            return;
        }
        if (client.field1975 != 0) {
            client.method908(class75.field977 + class1.field7 + class1.field4 + 100 + "%" + class1.field5, true);
        }
        client.method1785();
        client.method689();
        client.method1785();
        field1481.method544();
        client.method1785();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            client.field1976[var23].method1179();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class3.field18[var24][var25][var26] = 0;
                }
            }
        }
        client.method1785();
        class3.method895();
        int var27 = field809.length;
        class125.method1008();
        client.method40(true);
        if (!client.field2157) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (field179[var28] >> 8) * 64 - field125;
                int var30 = (field179[var28] & 0xFF) * 64 - field542;
                byte[] var31 = field809[var28];
                if (var31 != null) {
                    client.method1785();
                    int var32 = field1516 * 8 - 48;
                    int var33 = field490 * 8 - 48;
                    class95[] var34 = client.field1976;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field1279[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class136 var38 = new class136(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class3.method1011(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (field179[var42] >> 8) * 64 - field125;
                int var44 = (field179[var42] & 0xFF) * 64 - field542;
                byte[] var45 = field809[var42];
                if (var45 == null && field490 < 800) {
                    client.method1785();
                    class3.method691(var43, var44, 64, 64);
                }
            }
            client.method40(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = field760[var46];
                if (var47 != null) {
                    int var48 = (field179[var46] >> 8) * 64 - field125;
                    int var49 = (field179[var46] & 0xFF) * 64 - field542;
                    client.method1785();
                    class3.method93(var47, var48, var49, field1481, client.field1976);
                }
            }
        }
        if (client.field2157) {
            for (int var50 = 0; var50 < 4; var50++) {
                client.method1785();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = client.field2042[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < field179.length; var60++) {
                                if (field179[var60] == var59 && field809[var60] != null) {
                                    class3.method1224(field809[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, client.field1976);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class3.method2047(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = client.field2042[0][var61][var62];
                    if (var63 == -1) {
                        class3.method691(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            client.method40(true);
            for (int var64 = 0; var64 < 4; var64++) {
                client.method1785();
                for (int var65 = 0; var65 < 13; var65++) {
                    label306: for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = client.field2042[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < field179.length; var73++) {
                                if (field179[var73] == var72 && field760[var73] != null) {
                                    byte[] var74 = field760[var73];
                                    int var75 = var65 * 8;
                                    int var76 = var66 * 8;
                                    int var77 = (var70 & 0x7) * 8;
                                    int var78 = (var71 & 0x7) * 8;
                                    class45 var79 = field1481;
                                    class95[] var80 = client.field1976;
                                    class136 var81 = new class136(var74);
                                    int var82 = -1;
                                    while (true) {
                                        int var83 = var81.method1615();
                                        if (var83 == 0) {
                                            continue label306;
                                        }
                                        var82 += var83;
                                        int var84 = 0;
                                        while (true) {
                                            int var85 = var81.method1615();
                                            if (var85 == 0) {
                                                break;
                                            }
                                            var84 += var85 - 1;
                                            int var86 = var84 & 0x3F;
                                            int var87 = var84 >> 6 & 0x3F;
                                            int var88 = var84 >> 12;
                                            int var89 = var81.method1602();
                                            int var90 = var89 >> 2;
                                            int var91 = var89 & 0x3;
                                            if (var68 == var88 && var87 >= var77 && var87 < var77 + 8 && var86 >= var78 && var86 < var78 + 8) {
                                                class154 var92 = class154.method886(var82);
                                                int var93 = var75 + class91.method719(var87 & 0x7, var86 & 0x7, var69, var92.field2315, var92.field2316, var91);
                                                int var94 = var76 + class91.method990(var87 & 0x7, var86 & 0x7, var69, var92.field2315, var92.field2316, var91);
                                                if (var93 > 0 && var94 > 0 && var93 < 103 && var94 < 103) {
                                                    int var95 = var64;
                                                    if ((class3.field18[1][var93][var94] & 0x2) == 2) {
                                                        var95 = var64 - 1;
                                                    }
                                                    class95 var96 = null;
                                                    if (var95 >= 0) {
                                                        var96 = var80[var95];
                                                    }
                                                    class3.method7(var64, var93, var94, var82, var69 + var91 & 0x3, var90, var79, var96);
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
        client.method40(true);
        client.method689();
        client.method1785();
        class3.method303(field1481, client.field1976);
        client.method40(true);
        int var97 = class3.field28;
        if (var97 > field2046) {
            var97 = field2046;
        }
        if (var97 < field2046 - 1) {
            int var98 = field2046 - 1;
        }
        if (client.field1914) {
            field1481.method545(class3.field28);
        } else {
            field1481.method545(0);
        }
        for (int var99 = 0; var99 < 104; var99++) {
            for (int var100 = 0; var100 < 104; var100++) {
                client.method92(var99, var100);
            }
        }
        client.method1785();
        client.method431();
        class154.field2303.method1239();
        if (field727 != null) {
            client.field2162.method2308(107);
            client.field2162.method1592(1057001181);
        }
        if (!client.field2157) {
            int var101 = (field1516 - 6) / 8;
            int var102 = (field1516 + 6) / 8;
            int var103 = (field490 - 6) / 8;
            int var104 = (field490 + 6) / 8;
            for (int var105 = var101 - 1; var105 <= var102 + 1; var105++) {
                for (int var106 = var103 - 1; var106 <= var104 + 1; var106++) {
                    if (var105 < var101 || var105 > var102 || var106 < var103 || var106 > var104) {
                        field111.method1038("m" + var105 + "_" + var106);
                        field111.method1038("l" + var105 + "_" + var106);
                    }
                }
            }
        }
        client.method1009(30);
        client.method1785();
        field20 = (byte[][][]) null;
        field21 = (byte[][][]) null;
        field22 = (byte[][][]) null;
        field711 = (byte[][][]) null;
        field704 = (int[][][]) null;
        field1720 = (byte[][][]) null;
        field189 = (int[][]) null;
        field835 = null;
        field1215 = null;
        field726 = null;
        field390 = null;
        field29 = null;
        client.field2162.method2308(201);
        class112.method847();
    }

    @ObfuscatedName("ct.dx(IIIIZIIIIIIB)Z")
    public static final boolean method1176(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                client.field2100[var11][var12] = 0;
                client.field1982[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        client.field2100[arg0][arg1] = 99;
        client.field1982[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        client.field1983[var15] = arg0;
        int var36 = var15 + 1;
        client.field2052[var15] = arg1;
        boolean var17 = false;
        int var18 = client.field1983.length;
        int[][] var19 = client.field1976[field2046].field1279;
        while (var36 != var16) {
            var13 = client.field1983[var16];
            var14 = client.field2052[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && client.field1976[field2046].method1188(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && client.field1976[field2046].method1189(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && client.field1976[field2046].method1190(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = client.field1982[var13][var14] + 1;
            if (var13 > 0 && client.field2100[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                client.field1983[var36] = var13 - 1;
                client.field2052[var36] = var14;
                var36 = (var36 + 1) % var18;
                client.field2100[var13 - 1][var14] = 2;
                client.field1982[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && client.field2100[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                client.field1983[var36] = var13 + 1;
                client.field2052[var36] = var14;
                var36 = (var36 + 1) % var18;
                client.field2100[var13 + 1][var14] = 8;
                client.field1982[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && client.field2100[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                client.field1983[var36] = var13;
                client.field2052[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                client.field2100[var13][var14 - 1] = 1;
                client.field1982[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && client.field2100[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                client.field1983[var36] = var13;
                client.field2052[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                client.field2100[var13][var14 + 1] = 4;
                client.field1982[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && client.field2100[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                client.field1983[var36] = var13 - 1;
                client.field2052[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                client.field2100[var13 - 1][var14 - 1] = 3;
                client.field1982[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && client.field2100[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                client.field1983[var36] = var13 + 1;
                client.field2052[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                client.field2100[var13 + 1][var14 - 1] = 9;
                client.field1982[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && client.field2100[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                client.field1983[var36] = var13 - 1;
                client.field2052[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                client.field2100[var13 - 1][var14 + 1] = 6;
                client.field1982[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && client.field2100[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                client.field1983[var36] = var13 + 1;
                client.field2052[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                client.field2100[var13 + 1][var14 + 1] = 12;
                client.field1982[var13 + 1][var14 + 1] = var20;
            }
        }
        client.field1980 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && client.field1982[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > arg2 + arg7 - 1) {
                            var26 = var24 - (arg2 + arg7 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > arg3 + arg8 - 1) {
                            var27 = var25 - (arg3 + arg8 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && client.field1982[var24][var25] < var22) {
                            var21 = var28;
                            var22 = client.field1982[var24][var25];
                            var13 = var24;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg1 == var14) {
                return false;
            }
            client.field1980 = 1;
        }
        byte var29 = 0;
        client.field1983[var29] = var13;
        int var37 = var29 + 1;
        client.field2052[var29] = var14;
        int var30;
        int var31 = var30 = client.field2100[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                client.field1983[var37] = var13;
                client.field2052[var37++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = client.field2100[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = client.field1983[var37];
            int var34 = client.field2052[var37];
            if (arg10 == 0) {
                client.field2162.method2308(37);
                client.field2162.method1612(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                client.field2162.method2308(193);
                client.field2162.method1612(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                client.field2162.method2308(194);
                client.field2162.method1612(var32 + var32 + 3);
            }
            client.field2089 = client.field1983[0];
            client.field2161 = client.field2052[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                client.field2162.method1699(client.field1983[var37] - var33);
                client.field2162.method1699(client.field2052[var37] - var34);
            }
            client.field2162.method1631(field542 + var34);
            client.field2162.method1635(field125 + var33);
            client.field2162.method1612(class36.field478[82] ? 1 : 0);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("bt.ex(I)V")
    public static final void method806() {
        int var0 = field35.method2822(class75.field1068);
        for (int var1 = 0; var1 < client.field2066; var1++) {
            class182 var2 = field35;
            String var3;
            if (client.field2072[var1].length() > 0) {
                var3 = client.field2153[var1] + class75.field955 + client.field2072[var1];
            } else {
                var3 = client.field2153[var1];
            }
            int var4 = var2.method2822(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = client.field2066 * 15 + 21;
        int var6 = class37.field505 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class37.field506;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        client.field2064 = true;
        field832 = var6;
        field491 = var7;
        field543 = var0;
        field1598 = client.field2066 * 15 + 22;
    }

    @ObfuscatedName("ba.eb(IIIB)V")
    public static void method899(int arg0, int arg1, int arg2) {
        class141 var3 = class141.method1768(arg0, arg1);
        if (var3 != null && var3.field1853 != null) {
            class123 var4 = new class123();
            var4.field1592 = var3;
            var4.field1590 = var3.field1853;
            class12.method1103(var4);
        }
        client.field2079 = true;
        field844 = arg0;
        client.field1931 = arg1;
        field551 = arg2;
        client.method542(var3);
    }

    @ObfuscatedName("bu.eg(III)V")
    public static void method747(int arg0, int arg1) {
        client.field2162.method2308(74);
        client.field2162.method1635(arg1);
        client.field2162.method1592(arg0);
    }

    @ObfuscatedName("cr.gr(Ley;B)Ley;")
    public static class141 method915(class141 arg0) {
        int var1 = client.method101(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class141.method451(arg0.field1786);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cx.gf(Ley;B)Ljava/lang/String;")
    public static String method1221(class141 arg0) {
        if (class93.method55(client.method101(arg0)) == 0) {
            return null;
        } else if (arg0.field1841 == null || arg0.field1841.trim().length() == 0) {
            return null;
        } else {
            return arg0.field1841;
        }
    }
}
