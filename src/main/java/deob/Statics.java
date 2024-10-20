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

    @ObfuscatedName("af.w")
    public static boolean field1015;

    @ObfuscatedName("af.j")
    public static class151 field1016;

    @ObfuscatedName("af.ho")
    public static int field1022;

    @ObfuscatedName("ap.p")
    public static class151 field1024;

    @ObfuscatedName("ap.na")
    public static class61 field1025;

    @ObfuscatedName("ap.ar")
    public static class153 field1026;

    @ObfuscatedName("ap.t")
    public static int[] field1027;

    @ObfuscatedName("ap.ah")
    public static long field1030;

    @ObfuscatedName("as.k")
    public static boolean field1031;

    @ObfuscatedName("as.p")
    public static class151 field1032;

    @ObfuscatedName("as.j")
    public static int field1035;

    @ObfuscatedName("as.nw")
    public static int field1036;

    @ObfuscatedName("ay.p")
    public static class42 field1039;

    @ObfuscatedName("aw.z")
    public static boolean[] field1066;

    @ObfuscatedName("aw.o")
    public static int[] field1073;

    @ObfuscatedName("aw.u")
    public static int[] field1074;

    @ObfuscatedName("ak.n")
    public static class54 field1093;

    @ObfuscatedName("ak.iz")
    public static int field1104;

    @ObfuscatedName("ax.l")
    public static class58[] field1108;

    @ObfuscatedName("g.dp")
    public static int field111;

    @ObfuscatedName("ax.n")
    public static int field1110;

    @ObfuscatedName("ax.g")
    public static byte[] field1114;

    @ObfuscatedName("ax.c")
    public static int field1116;

    @ObfuscatedName("ax.r")
    public static float[] field1117;

    @ObfuscatedName("ax.u")
    public static int field1118;

    @ObfuscatedName("ax.m")
    public static class49[] field1122;

    @ObfuscatedName("ax.s")
    public static boolean[] field1123;

    @ObfuscatedName("ax.i")
    public static int[] field1124;

    @ObfuscatedName("ax.ae")
    public static float[] field1126;

    @ObfuscatedName("ax.e")
    public static class48[] field1129;

    @ObfuscatedName("ax.t")
    public static float[] field1131;

    @ObfuscatedName("ax.b")
    public static float[] field1132;

    @ObfuscatedName("ax.q")
    public static float[] field1133;

    @ObfuscatedName("ax.at")
    public static float[] field1134;

    @ObfuscatedName("ax.z")
    public static class59[] field1135;

    @ObfuscatedName("ax.aj")
    public static float[] field1136;

    @ObfuscatedName("ax.aq")
    public static int[] field1137;

    @ObfuscatedName("ax.ac")
    public static int[] field1138;

    @ObfuscatedName("ax.o")
    public static int field1139;

    @ObfuscatedName("g.cu")
    public static int field115;

    @ObfuscatedName("g.b")
    public static int[] field116;

    @ObfuscatedName("bf.ep")
    public static class86[] field1172;

    @ObfuscatedName("bf.ed")
    public static class85[] field1173;

    @ObfuscatedName("bf.on")
    public static class73 field1175;

    @ObfuscatedName("ba.a")
    public static String field1200;

    @ObfuscatedName("ba.n")
    public static int field1201;

    @ObfuscatedName("bu.n")
    public static float field1239;

    @ObfuscatedName("bu.c")
    public static int field1240;

    @ObfuscatedName("n.e")
    public static class57 field125;

    @ObfuscatedName("bb.do")
    public static int field1253;

    @ObfuscatedName("bb.pf")
    public static int field1254;

    @ObfuscatedName("bb.l")
    public static class154 field1256;

    @ObfuscatedName("bm.pz")
    public static Image field1264;

    @ObfuscatedName("bp.v")
    public static int field1265;

    @ObfuscatedName("n.bs")
    public static class153 field127;

    @ObfuscatedName("bv.et")
    public static int[] field1276;

    @ObfuscatedName("bv.pi")
    public static int field1278;

    @ObfuscatedName("n.bc")
    public static class78 field129;

    @ObfuscatedName("bx.nq")
    public static class45 field1291;

    @ObfuscatedName("be.j")
    public static File field1299;

    @ObfuscatedName("be.bw")
    public static class69 field1300;

    @ObfuscatedName("be.f")
    public static class126 field1303;

    @ObfuscatedName("n.eb")
    public static class85[] field132;

    @ObfuscatedName("bh.bd")
    public static class153 field1320;

    @ObfuscatedName("bt.j")
    public static String field1322;

    @ObfuscatedName("bt.p")
    public static String field1331;

    @ObfuscatedName("bt.kc")
    public static class65 field1332;

    @ObfuscatedName("c.my")
    public static class85 field135;

    @ObfuscatedName("by.nf")
    public static int field1364;

    @ObfuscatedName("bk.v")
    public static class85 field1378;

    @ObfuscatedName("c.h")
    public static byte[][][] field138;

    @ObfuscatedName("bk.av")
    public static class23 field1382;

    @ObfuscatedName("bk.e")
    public static int[] field1383;

    @ObfuscatedName("c.k")
    public static byte[][][] field140;

    @ObfuscatedName("cj.w")
    public static int field1415;

    @ObfuscatedName("cj.j")
    public static String field1416;

    @ObfuscatedName("c.v")
    public static byte[][][] field142;

    @ObfuscatedName("cj.k")
    public static class151 field1420;

    @ObfuscatedName("cj.p")
    public static Applet field1422;

    @ObfuscatedName("cj.ns")
    public static int field1423;

    @ObfuscatedName("cq.v")
    public static File field1429;

    @ObfuscatedName("cq.l")
    public static class29[] field1432;

    @ObfuscatedName("cq.f")
    public static String field1437;

    @ObfuscatedName("cq.h")
    public static File field1439;

    @ObfuscatedName("c.z")
    public static int[] field144;

    @ObfuscatedName("cx.ik")
    public static int field1448;

    @ObfuscatedName("cx.ic")
    public static int field1449;

    @ObfuscatedName("cx.au")
    public static class153 field1450;

    @ObfuscatedName("ck.w")
    public static int field1453;

    @ObfuscatedName("ck.j")
    public static int field1454;

    @ObfuscatedName("ck.v")
    public static int[] field1455;

    @ObfuscatedName("ck.k")
    public static int[] field1457;

    @ObfuscatedName("ck.c")
    public static byte[][] field1459;

    @ObfuscatedName("ck.p")
    public static int field1461;

    @ObfuscatedName("c.o")
    public static int[] field148;

    @ObfuscatedName("cc.e")
    public static int[] field1493;

    @ObfuscatedName("cc.m")
    public static int field1494;

    @ObfuscatedName("cc.l")
    public static int field1497;

    @ObfuscatedName("cw.m")
    public static int[] field1499;

    @ObfuscatedName("c.c")
    public static int[][] field151;

    @ObfuscatedName("co.s")
    public static String[] field1528;

    @ObfuscatedName("co.ee")
    public static class85[] field1529;

    @ObfuscatedName("c.u")
    public static int[] field153;

    @ObfuscatedName("co.cj")
    public static class69 field1530;

    @ObfuscatedName("co.cm")
    public static int field1531;

    @ObfuscatedName("c.em")
    public static class85[] field155;

    @ObfuscatedName("cp.y")
    public static int field1559;

    @ObfuscatedName("cp.r")
    public static int field1563;

    @ObfuscatedName("cp.bn")
    public static int field1568;

    @ObfuscatedName("cp.ac")
    public static int field1572;

    @ObfuscatedName("cp.d")
    public static int field1577;

    @ObfuscatedName("cp.f")
    public static int field1578;

    @ObfuscatedName("cp.a")
    public static int field1579;

    @ObfuscatedName("cp.t")
    public static int field1582;

    @ObfuscatedName("cp.b")
    public static int field1583;

    @ObfuscatedName("cp.q")
    public static int field1584;

    @ObfuscatedName("cp.at")
    public static int field1586;

    @ObfuscatedName("cp.aj")
    public static int field1587;

    @ObfuscatedName("cp.aq")
    public static int field1588;

    @ObfuscatedName("p.pc")
    public static int field16;

    @ObfuscatedName("cp.x")
    public static int field1611;

    @ObfuscatedName("cp.ba")
    public static boolean[][] field1614;

    @ObfuscatedName("cp.ae")
    public static int field1615;

    @ObfuscatedName("cp.bo")
    public static int field1617;

    @ObfuscatedName("cp.bq")
    public static int field1618;

    @ObfuscatedName("cp.bd")
    public static int field1619;

    @ObfuscatedName("cp.bl")
    public static int field1620;

    @ObfuscatedName("cp.bu")
    public static int field1621;

    @ObfuscatedName("cn.cg")
    public static int field1631;

    @ObfuscatedName("o.bn")
    public static class153 field166;

    @ObfuscatedName("cg.ds")
    public static int[] field1661;

    @ObfuscatedName("ce.ii")
    public static int field1676;

    @ObfuscatedName("ch.jj")
    public static int field1684;

    @ObfuscatedName("o.es")
    public static class85 field171;

    @ObfuscatedName("cm.ny")
    public static int field1761;

    @ObfuscatedName("cf.nj")
    public static int field1763;

    @ObfuscatedName("cf.g")
    public static int field1764;

    @ObfuscatedName("cv.f")
    public static int field1771;

    @ObfuscatedName("cv.u")
    public static int field1779;

    @ObfuscatedName("cv.a")
    public static int field1780;

    @ObfuscatedName("cv.x")
    public static int field1781;

    @ObfuscatedName("cv.r")
    public static int field1782;

    @ObfuscatedName("cv.t")
    public static int field1783;

    @ObfuscatedName("cv.b")
    public static int field1784;

    @ObfuscatedName("cv.at")
    public static class105 field1789;

    @ObfuscatedName("cv.z")
    public static int field1791;

    @ObfuscatedName("dy.ca")
    public static class182 field1797;

    @ObfuscatedName("dy.n")
    public static class132 field1804;

    @ObfuscatedName("dt.fo")
    public static int field1813;

    @ObfuscatedName("dt.l")
    public static int[] field1819;

    @ObfuscatedName("dt.pe")
    public static Font field1821;

    @ObfuscatedName("dt.br")
    public static class153 field1824;

    @ObfuscatedName("df.d")
    public static int[] field1827;

    @ObfuscatedName("ds.er")
    public static int[] field1833;

    @ObfuscatedName("ds.c")
    public static class185 field1836;

    @ObfuscatedName("o.ci")
    public static class182 field184;

    @ObfuscatedName("dm.bf")
    public static int field1887;

    @ObfuscatedName("u.hb")
    public static int field189;

    @ObfuscatedName("dm.bs")
    public static int field1917;

    @ObfuscatedName("dm.bz")
    public static int field1919;

    @ObfuscatedName("u.g")
    public static int[] field192;

    @ObfuscatedName("de.au")
    public static class86 field1934;

    @ObfuscatedName("u.ex")
    public static class85[] field194;

    @ObfuscatedName("u.de")
    public static byte[][] field196;

    @ObfuscatedName("z.nl")
    public static int field199;

    @ObfuscatedName("dl.bv")
    public static int field1995;

    @ObfuscatedName("p.ag")
    public static class153 field20;

    @ObfuscatedName("dp.ar")
    public static class12[] field2001;

    @ObfuscatedName("dp.s")
    public static class126 field2005;

    @ObfuscatedName("dz.p")
    public static long field2014;

    @ObfuscatedName("dz.j")
    public static long field2015;

    @ObfuscatedName("du.aa")
    public static class153 field2019;

    @ObfuscatedName("du.h")
    public static class140 field2021;

    @ObfuscatedName("dx.hv")
    public static int field2032;

    @ObfuscatedName("dx.hn")
    public static class3 field2035;

    @ObfuscatedName("z.iy")
    public static class157 field204;

    @ObfuscatedName("da.u")
    public static class157 field2053;

    @ObfuscatedName("da.fd")
    public static int field2055;

    @ObfuscatedName("da.k")
    public static int field2057;

    @ObfuscatedName("z.of")
    public static int field206;

    @ObfuscatedName("ea.df")
    public static int[] field2078;

    @ObfuscatedName("el.nu")
    public static int field2083;

    @ObfuscatedName("e.b")
    public static int[] field218;

    @ObfuscatedName("p.js")
    public static class157[] field22;

    @ObfuscatedName("p.r")
    public static int[] field23;

    @ObfuscatedName("l.oi")
    public static class150 field230;

    @ObfuscatedName("eo.z")
    public static class138 field2329;

    @ObfuscatedName("es.p")
    public static class151 field2346;

    @ObfuscatedName("es.j")
    public static class151 field2347;

    @ObfuscatedName("es.w")
    public static class151 field2348;

    @ObfuscatedName("l.ba")
    public static class153 field235;

    @ObfuscatedName("es.g")
    public static int field2351;

    @ObfuscatedName("es.u")
    public static boolean field2352;

    @ObfuscatedName("es.k")
    public static class151 field2354;

    @ObfuscatedName("es.i")
    public static String[] field2356;

    @ObfuscatedName("es.e")
    public static boolean field2359;

    @ObfuscatedName("l.fm")
    public static int field237;

    @ObfuscatedName("p.cp")
    public static class182 field24;

    @ObfuscatedName("ee.c")
    public static int field2452;

    @ObfuscatedName("ee.ev")
    public static class85[] field2456;

    @ObfuscatedName("m.o")
    public static int field246;

    @ObfuscatedName("ey.p")
    public static class151 field2462;

    @ObfuscatedName("ei.w")
    public static long field2517;

    @ObfuscatedName("s.ek")
    public static class86[] field252;

    @ObfuscatedName("ei.p")
    public static class69 field2524;

    @ObfuscatedName("s.ap")
    public static class78 field253;

    @ObfuscatedName("ei.ig")
    public static int field2539;

    @ObfuscatedName("s.pt")
    public static int field254;

    @ObfuscatedName("en.n")
    public static class86[] field2558;

    @ObfuscatedName("en.eg")
    public static class86 field2561;

    @ObfuscatedName("fn.j")
    public static boolean[] field2570;

    @ObfuscatedName("fn.w")
    public static class151 field2571;

    @ObfuscatedName("fn.h")
    public static class151 field2572;

    @ObfuscatedName("fn.v")
    public static class151 field2573;

    @ObfuscatedName("j.fq")
    public static int field26;

    @ObfuscatedName("i.ah")
    public static class86[] field265;

    @ObfuscatedName("i.f")
    public static class15 field267;

    @ObfuscatedName("fn.p")
    public static class157[][] field2687;

    @ObfuscatedName("i.pq")
    public static class84 field269;

    @ObfuscatedName("fd.c")
    public static short[] field2713;

    @ObfuscatedName("fd.n")
    public static short[][] field2720;

    @ObfuscatedName("fd.g")
    public static short[] field2721;

    @ObfuscatedName("fd.o")
    public static short[][] field2722;

    @ObfuscatedName("y.mp")
    public static int field276;

    @ObfuscatedName("fw.nc")
    public static int field2765;

    @ObfuscatedName("fy.x")
    public static String field2777;

    @ObfuscatedName("fp.x")
    public static int[] field2814;

    @ObfuscatedName("fr.s")
    public static int[] field2823;

    @ObfuscatedName("gw.p")
    public static class119 field2825;

    @ObfuscatedName("gu.o")
    public static class86[] field2828;

    @ObfuscatedName("d.ey")
    public static class86[] field292;

    @ObfuscatedName("d.gy")
    public static class157 field293;

    @ObfuscatedName("d.gs")
    public static class157 field298;

    @ObfuscatedName("f.id")
    public static int field299;

    @ObfuscatedName("f.j")
    public static class86 field300;

    @ObfuscatedName("f.h")
    public static class86[] field302;

    @ObfuscatedName("f.g")
    public static class86 field304;

    @ObfuscatedName("f.w")
    public static class86 field306;

    @ObfuscatedName("f.i")
    public static int[] field308;

    @ObfuscatedName("f.y")
    public static int[] field309;

    @ObfuscatedName("f.k")
    public static class85 field312;

    @ObfuscatedName("f.bo")
    public static class153 field314;

    @ObfuscatedName("f.ay")
    public static class85[] field327;

    @ObfuscatedName("f.p")
    public static boolean field329;

    @ObfuscatedName("a.dw")
    public static class94 field335;

    @ObfuscatedName("j.m")
    public static int[][][] field34;

    @ObfuscatedName("a.ih")
    public static class157 field345;

    @ObfuscatedName("a.bm")
    public static String field347;

    @ObfuscatedName("a.ps")
    public static Frame field349;

    @ObfuscatedName("a.bp")
    public static int field351;

    @ObfuscatedName("x.g")
    public static byte[][][] field361;

    @ObfuscatedName("x.bq")
    public static class153 field362;

    @ObfuscatedName("x.n")
    public static byte[][][] field364;

    @ObfuscatedName("x.ou")
    public static class67 field366;

    @ObfuscatedName("x.mu")
    public static byte field369;

    @ObfuscatedName("r.aw")
    public static class153 field380;

    @ObfuscatedName("t.ew")
    public static int[] field386;

    @ObfuscatedName("t.h")
    public static int[] field389;

    @ObfuscatedName("t.ok")
    public static class70 field391;

    @ObfuscatedName("b.nx")
    public static int field392;

    @ObfuscatedName("b.w")
    public static String[] field394;

    @ObfuscatedName("b.o")
    public static class157 field401;

    @ObfuscatedName("b.dt")
    public static int[] field404;

    @ObfuscatedName("b.j")
    public static int[] field405;

    @ObfuscatedName("b.le")
    public static class136 field406;

    @ObfuscatedName("q.ce")
    public static int field456;

    @ObfuscatedName("q.ma")
    public static byte field468;

    @ObfuscatedName("q.cc")
    public static char field469;

    @ObfuscatedName("w.kh")
    public static int field50;

    @ObfuscatedName("client.as")
    public static class69 field503;

    @ObfuscatedName("client.ak")
    public static class153 field506;

    @ObfuscatedName("client.j")
    public static client field570;

    @ObfuscatedName("w.gk")
    public static class157 field62;

    @ObfuscatedName("client.bx")
    public static int field630;

    @ObfuscatedName("client.l")
    public static String field635;

    @ObfuscatedName("w.mj")
    public static class8[] field66;

    @ObfuscatedName("client.ax")
    public static class153 field679;

    @ObfuscatedName("client.k")
    public static class131 field705;

    @ObfuscatedName("client.di")
    public static int[][] field711;

    @ObfuscatedName("client.pl")
    public static Canvas field740;

    @ObfuscatedName("ae.n")
    public static int[] field741;

    @ObfuscatedName("ae.bf")
    public static FontMetrics field747;

    @ObfuscatedName("at.bz")
    public static class153 field755;

    @ObfuscatedName("at.dm")
    public static byte[][] field756;

    @ObfuscatedName("at.aa")
    public static class86[] field758;

    @ObfuscatedName("aj.fe")
    public static int field771;

    @ObfuscatedName("aj.m")
    public static int field774;

    @ObfuscatedName("aq.p")
    public static class151 field782;

    @ObfuscatedName("aq.al")
    public static class78 field797;

    @ObfuscatedName("aq.j")
    public static class151 field800;

    @ObfuscatedName("aq.cw")
    public static int field811;

    @ObfuscatedName("ac.j")
    public static class151 field815;

    @ObfuscatedName("ac.w")
    public static class151 field816;

    @ObfuscatedName("v.ne")
    public static class51 field84;

    @ObfuscatedName("ac.eh")
    public static class85[] field865;

    @ObfuscatedName("az.p")
    public static class151 field869;

    @ObfuscatedName("v.eq")
    public static class85 field87;

    @ObfuscatedName("az.ag")
    public static class86[] field873;

    @ObfuscatedName("az.ky")
    public static int field874;

    @ObfuscatedName("ao.p")
    public static class151 field877;

    @ObfuscatedName("ao.w")
    public static class151 field878;

    @ObfuscatedName("ao.j")
    public static class151 field882;

    @ObfuscatedName("ao.ai")
    public static class153 field897;

    @ObfuscatedName("am.nt")
    public static int field898;

    @ObfuscatedName("am.j")
    public static class151 field899;

    @ObfuscatedName("am.p")
    public static class151 field908;

    @ObfuscatedName("ad.j")
    public static class151 field920;

    @ObfuscatedName("ad.w")
    public static int field927;

    @ObfuscatedName("k.pd")
    public static boolean field93;

    @ObfuscatedName("ad.p")
    public static class151 field932;

    @ObfuscatedName("k.ei")
    public static int[] field94;

    @ObfuscatedName("an.p")
    public static class151 field941;

    @ObfuscatedName("k.np")
    public static class51 field95;

    @ObfuscatedName("al.p")
    public static class151 field952;

    @ObfuscatedName("al.iq")
    public static int field955;

    @ObfuscatedName("al.ec")
    public static class85[] field956;

    @ObfuscatedName("ab.p")
    public static class151 field967;

    @ObfuscatedName("ab.fc")
    public static int field975;

    @ObfuscatedName("af.g")
    public static class182 field977;

    @ObfuscatedName("g.fw")
    public static int field99;

    @ObfuscatedName("dg.h(I[BLbx;S)V")
    public static void method2618(int arg0, byte[] arg1, class70 arg2) {
        class155 var3 = new class155();
        var3.field2560 = 0;
        var3.field2809 = (long) arg0;
        var3.field2555 = arg1;
        var3.field2554 = arg2;
        class176 var4 = class156.field2562;
        synchronized (class156.field2562) {
            class156.field2562.method3305(var3);
        }
        Object var6 = class156.field2563;
        synchronized (class156.field2563) {
            if (class156.field2564 == 0) {
                field1175.method1458(new class156(), 5);
            }
            class156.field2564 = 600;
        }
    }

    @ObfuscatedName("k.p(II)Lan;")
    public static class36 method47(int arg0) {
        class36 var1 = (class36) class36.field934.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field941.method2973(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method756(new class126(var2), arg0);
        }
        var3.method770();
        class36.field934.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bx.j(Ldk;II)V")
    public static void method1374(class115 arg0, int arg1) {
        while (true) {
            class180 var2 = (class180) class181.field2824.method3285();
            if (var2 == null) {
                return;
            }
            arg0.method2258(arg1);
            arg0.method2362(0);
            int var3 = arg0.field2043;
            arg0.method2365(var2.field2815);
            for (int var4 = 0; var4 < var2.field2816; var4++) {
                if (var2.field2818[var4] == 0) {
                    try {
                        int var5 = var2.field2817[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2819[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2362(0);
                            arg0.method2365(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2819[var4];
                            var8.setInt((Object) null, var2.field2820[var4]);
                            arg0.method2362(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2819[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2362(0);
                            arg0.method2365(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2821[var4];
                            byte[][] var12 = var2.field2822[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2362(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2362(1);
                                arg0.method2459(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2362(2);
                                arg0.method2366((String) var16);
                            } else {
                                arg0.method2362(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2821[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2362(0);
                            arg0.method2365(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2362(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2362(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2362(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2362(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2362(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2362(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2362(-16);
                    } catch (SecurityException var38) {
                        arg0.method2362(-17);
                    } catch (IOException var39) {
                        arg0.method2362(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2362(-19);
                    } catch (Exception var41) {
                        arg0.method2362(-20);
                    } catch (Throwable var42) {
                        arg0.method2362(-21);
                    }
                } else {
                    arg0.method2362(var2.field2818[var4]);
                }
            }
            arg0.method2394(var3);
            arg0.method2470(arg0.field2043 - var3);
            var2.method3327();
        }
    }

    @ObfuscatedName("al.p(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method785(String arg0, String arg1, int arg2, int arg3) throws IOException {
        field2057 = arg3;
        field774 = arg2;
        try {
            field1200 = System.getProperty("os.name");
        } catch (Exception var27) {
            field1200 = "Unknown";
        }
        field1437 = field1200.toLowerCase();
        try {
            field2777 = System.getProperty("user.home");
            if (field2777 != null) {
                field2777 = field2777 + "/";
            }
        } catch (Exception var26) {
        }
        try {
            if (field1437.startsWith("win")) {
                if (field2777 == null) {
                    field2777 = System.getenv("USERPROFILE");
                }
            } else if (field2777 == null) {
                field2777 = System.getenv("HOME");
            }
            if (field2777 != null) {
                field2777 = field2777 + "/";
            }
        } catch (Exception var25) {
        }
        if (field2777 == null) {
            field2777 = "~/";
        }
        field1528 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2777, "/tmp/", "" };
        field2356 = new String[] { ".jagex_cache_" + field774, ".file_store_" + field774 };
        int var7 = 0;
        label123: while (var7 < 4) {
            field1429 = class81.method2996(arg0, arg1, var7);
            if (!field1429.exists()) {
                field1429.mkdirs();
            }
            File[] var8 = field1429.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label123;
                }
                File var11 = var9[var10];
                boolean var14;
                try {
                    RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
                    int var13 = var12.read();
                    var12.seek(0L);
                    var12.write(var13);
                    var12.seek(0L);
                    var12.close();
                    var14 = true;
                } catch (Exception var24) {
                    var14 = false;
                }
                if (!var14) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class71.method1198(field1429);
        try {
            File var16 = new File(field2777, "random.dat");
            if (var16.exists()) {
                class81.field1433 = new class29(new class28(var16, "rw", 25L), 24, 0);
            } else {
                label104: for (int var17 = 0; var17 < field2356.length; var17++) {
                    for (int var18 = 0; var18 < field1528.length; var18++) {
                        File var19 = new File(field1528[var18] + field2356[var17] + File.separatorChar + "random.dat");
                        if (var19.exists()) {
                            class81.field1433 = new class29(new class28(var19, "rw", 25L), 24, 0);
                            break label104;
                        }
                    }
                }
            }
            if (class81.field1433 == null) {
                RandomAccessFile var20 = new RandomAccessFile(var16, "rw");
                int var21 = var20.read();
                var20.seek(0L);
                var20.write(var21);
                var20.seek(0L);
                var20.close();
                class81.field1433 = new class29(new class28(var16, "rw", 25L), 24, 0);
            }
        } catch (IOException var28) {
        }
        class81.field1434 = new class29(new class28(class71.method31("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        class81.field1435 = new class29(new class28(class71.method31("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        field1432 = new class29[field2057];
        for (int var23 = 0; var23 < field2057; var23++) {
            field1432[var23] = new class29(new class28(class71.method31("main_file_cache.idx" + var23), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("q.w(Ljava/lang/CharSequence;B)[B")
    public static byte[] method244(CharSequence arg0) {
        int var1 = arg0.length();
        byte[] var2 = new byte[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (!(var4 <= 0 || var4 >= 128) || !(var4 < 160 || var4 > 255)) {
                var2[var3] = (byte) var4;
            } else if (var4 == 8364) {
                var2[var3] = -128;
            } else if (var4 == 8218) {
                var2[var3] = -126;
            } else if (var4 == 402) {
                var2[var3] = -125;
            } else if (var4 == 8222) {
                var2[var3] = -124;
            } else if (var4 == 8230) {
                var2[var3] = -123;
            } else if (var4 == 8224) {
                var2[var3] = -122;
            } else if (var4 == 8225) {
                var2[var3] = -121;
            } else if (var4 == 710) {
                var2[var3] = -120;
            } else if (var4 == 8240) {
                var2[var3] = -119;
            } else if (var4 == 352) {
                var2[var3] = -118;
            } else if (var4 == 8249) {
                var2[var3] = -117;
            } else if (var4 == 338) {
                var2[var3] = -116;
            } else if (var4 == 381) {
                var2[var3] = -114;
            } else if (var4 == 8216) {
                var2[var3] = -111;
            } else if (var4 == 8217) {
                var2[var3] = -110;
            } else if (var4 == 8220) {
                var2[var3] = -109;
            } else if (var4 == 8221) {
                var2[var3] = -108;
            } else if (var4 == 8226) {
                var2[var3] = -107;
            } else if (var4 == 8211) {
                var2[var3] = -106;
            } else if (var4 == 8212) {
                var2[var3] = -105;
            } else if (var4 == 732) {
                var2[var3] = -104;
            } else if (var4 == 8482) {
                var2[var3] = -103;
            } else if (var4 == 353) {
                var2[var3] = -102;
            } else if (var4 == 8250) {
                var2[var3] = -101;
            } else if (var4 == 339) {
                var2[var3] = -100;
            } else if (var4 == 382) {
                var2[var3] = -98;
            } else if (var4 == 376) {
                var2[var3] = -97;
            } else {
                var2[var3] = 63;
            }
        }
        return var2;
    }

    @ObfuscatedName("ep.j(III)V")
    public static void method2659(int arg0, int arg1) {
        class37 var2 = (class37) class37.field951.method3214((long) arg0);
        class37 var3;
        if (var2 == null) {
            byte[] var4 = field952.method2973(14, arg0);
            class37 var5 = new class37();
            if (var4 != null) {
                var5.method784(new class126(var4));
            }
            class37.field951.method3223(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field957;
        int var8 = var3.field953;
        int var9 = var3.field954;
        int var10 = class158.field2698[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        class158.field2700[var7] = class158.field2700[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("dp.h(II)V")
    public static void method2297(int arg0) {
        class76.field1389 = arg0;
    }

    @ObfuscatedName("al.j(S)V")
    public static void method780() {
        if (class74.field1336 != null) {
            class74 var0 = class74.field1336;
            synchronized (class74.field1336) {
                class74.field1336 = null;
            }
        }
    }

    @ObfuscatedName("ex.c(I)V")
    public static void method2840() {
        class35.field921.method3217();
    }

    @ObfuscatedName("bv.r([BS)[B")
    public static final byte[] method1357(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2544();
        int var3 = var1.method2380();
        if (var3 < 0 || !(class151.field2509 == 0 || var3 <= class151.field2509)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2576(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2380();
            if (var5 < 0 || class151.field2509 != 0 && var5 > class151.field2509) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2339(var6, var5, arg0, var3, 9);
            } else {
                class151.field2503.method2318(var1, var6);
            }
            return var6;
        }
    }

    @ObfuscatedName("d.nr(I)V")
    public static final void method171() {
        field1264 = null;
        field1821 = null;
        field747 = null;
    }

    @ObfuscatedName("dx.s(IIIB)I")
    public static final int method2356(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("bp.q(II)V")
    public static void method1333(int arg0) {
        if (arg0 == -1 && !client.field716) {
            field2021.method2752();
            class137.field2349 = 1;
            field2354 = null;
        } else if (arg0 != -1 && client.field564 != arg0 && client.field714 != 0 && !client.field716) {
            class153 var1 = field506;
            int var2 = client.field714;
            class137.field2349 = 1;
            field2354 = var1;
            field2351 = arg0;
            field1201 = 0;
            field2452 = var2;
            field2352 = false;
            field246 = 2;
        }
        client.field564 = arg0;
    }

    @ObfuscatedName("e.cs([Lfn;IIIIIIIII)V")
    public static final void method133(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1759(arg2, arg3, arg4, arg5);
        class103.method2130();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2600 == arg1 || arg1 == -1412584499 && client.field650 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field660[client.field680] = var10.field2584 + arg6;
                    client.field686[client.field680] = var10.field2697 + arg7;
                    client.field670[client.field680] = var10.field2588;
                    client.field553[client.field680] = var10.field2589;
                    var11 = ++client.field680 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2694 = var11;
                var10.field2695 = client.field568;
                if (!var10.field2639 || !client.method42(var10)) {
                    if (var10.field2583 > 0) {
                        int var12 = var10.field2583;
                        if (var12 == 324) {
                            if (client.field738 == -1) {
                                client.field738 = var10.field2603;
                                client.field517 = var10.field2604;
                            }
                            if (client.field737.field2715) {
                                var10.field2603 = client.field738;
                            } else {
                                var10.field2603 = client.field517;
                            }
                        } else if (var12 == 325) {
                            if (client.field738 == -1) {
                                client.field738 = var10.field2603;
                                client.field517 = var10.field2604;
                            }
                            if (client.field737.field2715) {
                                var10.field2603 = client.field517;
                            } else {
                                var10.field2603 = client.field738;
                            }
                        } else if (var12 == 327) {
                            var10.field2620 = 150;
                            var10.field2585 = (int) (Math.sin((double) client.field568 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2663 = 5;
                            var10.field2671 = 0;
                        } else if (var12 == 328) {
                            var10.field2620 = 150;
                            var10.field2585 = (int) (Math.sin((double) client.field568 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2663 = 5;
                            var10.field2671 = 1;
                        }
                    }
                    int var13 = var10.field2584 + arg6;
                    int var14 = var10.field2697 + arg7;
                    int var15 = var10.field2587;
                    if (client.field650 == var10) {
                        if (arg1 != -1412584499 && !var10.field2644) {
                            field22 = arg0;
                            field50 = arg6;
                            field874 = arg7;
                            continue;
                        }
                        if (client.field661 && client.field655) {
                            int var16 = class76.field1399;
                            int var17 = class76.field1388;
                            int var18 = var16 - client.field688;
                            int var19 = var17 - client.field653;
                            if (var18 < client.field656) {
                                var18 = client.field656;
                            }
                            if (var10.field2588 + var18 > client.field656 + client.field485.field2588) {
                                var18 = client.field656 + client.field485.field2588 - var10.field2588;
                            }
                            if (var19 < client.field657) {
                                var19 = client.field657;
                            }
                            if (var10.field2589 + var19 > client.field657 + client.field485.field2589) {
                                var19 = client.field657 + client.field485.field2589 - var10.field2589;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2644) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2581 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2581 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2588 + var13;
                        int var27 = var10.field2589 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2588 + var13;
                        int var31 = var10.field2589 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2639 || var20 < var22 && var21 < var23) {
                        if (var10.field2583 != 0) {
                            if (var10.field2583 == 1337) {
                                client.field629 = var13;
                                client.field527 = var14;
                                int var32 = var10.field2588;
                                int var33 = var10.field2589;
                                class88.method1759(var13, var14, var13 + var32, var14 + var33);
                                class103.method2130();
                                client.field583++;
                                client.method219(true);
                                client.method1995(true);
                                client.method219(false);
                                client.method1995(false);
                                client.method2779();
                                for (class19 var34 = (class19) client.field636.method3285(); var34 != null; var34 = (class19) client.field636.method3299()) {
                                    if (field189 != var34.field282 || var34.field289) {
                                        var34.method3327();
                                    } else if (client.field568 >= var34.field281) {
                                        var34.method168(client.field558);
                                        if (var34.field289) {
                                            var34.method3327();
                                        } else {
                                            field335.method1844(var34.field282, var34.field283, var34.field284, var34.field290, 60, var34, 0, -1, false);
                                        }
                                    }
                                }
                                if (!client.field591) {
                                    int var35 = client.field565;
                                    if (client.field571 / 256 > var35) {
                                        var35 = client.field571 / 256;
                                    }
                                    if (client.field726[4] && client.field728[4] + 128 > var35) {
                                        var35 = client.field728[4] + 128;
                                    }
                                    int var36 = client.field671 + client.field550 & 0x7FF;
                                    int var37 = field26;
                                    int var38 = client.method143(field2035.field427, field2035.field411, field189) - 50;
                                    int var39 = field1813;
                                    int var40 = var35 * 3 + 600;
                                    int var41 = 2048 - var35 & 0x7FF;
                                    int var42 = 2048 - var36 & 0x7FF;
                                    int var43 = 0;
                                    int var44 = 0;
                                    int var45 = var40;
                                    if (var41 != 0) {
                                        int var46 = class103.field1790[var41];
                                        int var47 = class103.field1787[var41];
                                        int var48 = var44 * var47 - var40 * var46 >> 16;
                                        var45 = var44 * var46 + var40 * var47 >> 16;
                                        var44 = var48;
                                    }
                                    if (var42 != 0) {
                                        int var49 = class103.field1790[var42];
                                        int var50 = class103.field1787[var42];
                                        int var51 = var43 * var50 + var45 * var49 >> 16;
                                        var45 = var45 * var50 - var43 * var49 >> 16;
                                        var43 = var51;
                                    }
                                    field237 = var37 - var43;
                                    field2055 = var38 - var44;
                                    field771 = var39 - var45;
                                    field975 = var35;
                                    field99 = var36;
                                }
                                int var64;
                                if (client.field591) {
                                    var64 = client.method233();
                                } else {
                                    int var52 = 3;
                                    if (field975 < 310) {
                                        int var53 = field237 >> 7;
                                        int var54 = field771 >> 7;
                                        int var55 = field2035.field427 >> 7;
                                        int var56 = field2035.field411 >> 7;
                                        if ((class9.field136[field189][var53][var54] & 0x4) != 0) {
                                            var52 = field189;
                                        }
                                        int var57;
                                        if (var55 > var53) {
                                            var57 = var55 - var53;
                                        } else {
                                            var57 = var53 - var55;
                                        }
                                        int var58;
                                        if (var56 > var54) {
                                            var58 = var56 - var54;
                                        } else {
                                            var58 = var54 - var56;
                                        }
                                        if (var57 > var58) {
                                            int var59 = var58 * 65536 / var57;
                                            int var60 = 32768;
                                            while (var53 != var55) {
                                                if (var53 < var55) {
                                                    var53++;
                                                } else if (var53 > var55) {
                                                    var53--;
                                                }
                                                if ((class9.field136[field189][var53][var54] & 0x4) != 0) {
                                                    var52 = field189;
                                                }
                                                var60 += var59;
                                                if (var60 >= 65536) {
                                                    var60 -= 65536;
                                                    if (var54 < var56) {
                                                        var54++;
                                                    } else if (var54 > var56) {
                                                        var54--;
                                                    }
                                                    if ((class9.field136[field189][var53][var54] & 0x4) != 0) {
                                                        var52 = field189;
                                                    }
                                                }
                                            }
                                        } else {
                                            int var61 = var57 * 65536 / var58;
                                            int var62 = 32768;
                                            while (var54 != var56) {
                                                if (var54 < var56) {
                                                    var54++;
                                                } else if (var54 > var56) {
                                                    var54--;
                                                }
                                                if ((class9.field136[field189][var53][var54] & 0x4) != 0) {
                                                    var52 = field189;
                                                }
                                                var62 += var61;
                                                if (var62 >= 65536) {
                                                    var62 -= 65536;
                                                    if (var53 < var55) {
                                                        var53++;
                                                    } else if (var53 > var55) {
                                                        var53--;
                                                    }
                                                    if ((class9.field136[field189][var53][var54] & 0x4) != 0) {
                                                        var52 = field189;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if ((class9.field136[field189][field2035.field427 >> 7][field2035.field411 >> 7] & 0x4) != 0) {
                                        var52 = field189;
                                    }
                                    var64 = var52;
                                }
                                int var65 = field237;
                                int var66 = field2055;
                                int var67 = field771;
                                int var68 = field975;
                                int var69 = field99;
                                for (int var70 = 0; var70 < 5; var70++) {
                                    if (client.field726[var70]) {
                                        int var71 = (int) (Math.random() * (double) (client.field667[var70] * 2 + 1) - (double) client.field667[var70] + Math.sin((double) client.field715[var70] / 100.0D * (double) client.field730[var70]) * (double) client.field728[var70]);
                                        if (var70 == 0) {
                                            field237 += var71;
                                        }
                                        if (var70 == 1) {
                                            field2055 += var71;
                                        }
                                        if (var70 == 2) {
                                            field771 += var71;
                                        }
                                        if (var70 == 3) {
                                            field99 = field99 + var71 & 0x7FF;
                                        }
                                        if (var70 == 4) {
                                            field975 += var71;
                                            if (field975 < 128) {
                                                field975 = 128;
                                            }
                                            if (field975 > 383) {
                                                field975 = 383;
                                            }
                                        }
                                    }
                                }
                                int var72 = class76.field1399;
                                int var73 = class76.field1388;
                                if (var72 >= var13 && var72 < var13 + var32 && var73 >= var14 && var73 < var14 + var33) {
                                    class111.field1915 = true;
                                    class111.field1923 = 0;
                                    class111.field1921 = class76.field1399 - var13;
                                    class111.field1922 = class76.field1388 - var14;
                                } else {
                                    class111.field1915 = false;
                                    class111.field1923 = 0;
                                }
                                client.method68();
                                class88.method1761(var13, var14, var32, var33, 0);
                                client.method68();
                                field335.method1933(field237, field2055, field771, field975, field99, var64);
                                client.method68();
                                field335.method1987();
                                client.method11(var13, var14, var32, var33);
                                if (client.field538 == 2) {
                                    client.method704((client.field608 - field1631 << 7) + client.field499, (client.field621 - field456 << 7) + client.field500, client.field498 * 2);
                                    if (client.field584 > -1 && client.field568 % 20 < 10) {
                                        field194[0].method1660(client.field584 + var13 - 12, client.field476 + var14 - 28);
                                    }
                                }
                                ((class109) field1789).method2171(client.field558);
                                client.method69(var13, var14, var32, var33);
                                field237 = var65;
                                field2055 = var66;
                                field771 = var67;
                                field975 = var68;
                                field99 = var69;
                                if (client.field484) {
                                    byte var74 = 0;
                                    int var75 = class152.field2535 + class152.field2522 + var74;
                                    if (var75 == 0) {
                                        client.field484 = false;
                                    }
                                }
                                if (client.field484) {
                                    class88.method1761(var13, var14, var32, var33, 0);
                                    client.method151(class133.field2158, false);
                                }
                                if (!client.field484 && !client.field473 && var72 >= var13 && var72 < var13 + var32 && var73 >= var14 && var73 < var14 + var33) {
                                    client.method667(var72, var73, var13, var14);
                                }
                                class88.method1759(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2583 == 1338) {
                                client.method1313(var13, var14, var11);
                                class88.method1759(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var77 = class76.field1399;
                        int var78 = class76.field1388;
                        if (!client.field473 && var77 >= var20 && var78 >= var21 && var77 < var22 && var78 < var23) {
                            int var79 = var77 - var13;
                            int var80 = var78 - var14;
                            if (var10.field2655 == 1) {
                                client.method1548(var10.field2680, "", 24, 0, 0, var10.field2579);
                            }
                            if (var10.field2655 == 2 && !client.field562) {
                                String var81;
                                if (class161.method1989(client.method2167(var10)) == 0) {
                                    var81 = null;
                                } else if (var10.field2645 == null || var10.field2645.trim().length() == 0) {
                                    var81 = null;
                                } else {
                                    var81 = var10.field2645;
                                }
                                if (var81 != null) {
                                    client.method1548(var81, class2.method217(65280) + var10.field2679, 25, 0, -1, var10.field2579);
                                }
                            }
                            if (var10.field2655 == 3) {
                                client.method1548(class133.field2240, "", 26, 0, 0, var10.field2579);
                            }
                            if (var10.field2655 == 4) {
                                client.method1548(var10.field2680, "", 28, 0, 0, var10.field2579);
                            }
                            if (var10.field2655 == 5) {
                                client.method1548(var10.field2680, "", 29, 0, 0, var10.field2579);
                            }
                            if (var10.field2655 == 6 && client.field643 == null) {
                                client.method1548(var10.field2680, "", 30, 0, -1, var10.field2579);
                            }
                            if (var10.field2581 == 2) {
                                int var83 = 0;
                                for (int var84 = 0; var84 < var10.field2589; var84++) {
                                    for (int var85 = 0; var85 < var10.field2588; var85++) {
                                        int var86 = (var10.field2632 + 32) * var85;
                                        int var87 = (var10.field2593 + 32) * var84;
                                        if (var83 < 20) {
                                            var86 += var10.field2634[var83];
                                            var87 += var10.field2654[var83];
                                        }
                                        if (var79 >= var86 && var80 >= var87 && var79 < var86 + 32 && var80 < var87 + 32) {
                                            client.field595 = var83;
                                            field62 = var10;
                                            if (var10.field2652[var83] > 0) {
                                                class39 var88 = class39.method1244(var10.field2652[var83] - 1);
                                                if (client.field687 == 1 && class161.method3034(client.method2167(var10))) {
                                                    if (field1676 != var10.field2579 || field1448 != var83) {
                                                        client.method1548(class133.field2231, client.field672 + " " + class2.field28 + " " + class2.method217(16748608) + var88.field984, 31, var88.field981, var83, var10.field2579);
                                                    }
                                                } else if (!client.field562 || !class161.method3034(client.method2167(var10))) {
                                                    String[] var89 = var88.field992;
                                                    if (client.field649) {
                                                        var89 = client.method108(var89);
                                                    }
                                                    if (class161.method3034(client.method2167(var10))) {
                                                        for (int var90 = 4; var90 >= 3; var90--) {
                                                            if (var89 != null && var89[var90] != null) {
                                                                byte var91;
                                                                if (var90 == 3) {
                                                                    var91 = 36;
                                                                } else {
                                                                    var91 = 37;
                                                                }
                                                                client.method1548(var89[var90], class2.method217(16748608) + var88.field984, var91, var88.field981, var83, var10.field2579);
                                                            } else if (var90 == 4) {
                                                                client.method1548(class133.field2092, class2.method217(16748608) + var88.field984, 37, var88.field981, var83, var10.field2579);
                                                            }
                                                        }
                                                    }
                                                    int var92 = client.method2167(var10);
                                                    boolean var93 = (var92 >> 31 & 0x1) != 0;
                                                    if (var93) {
                                                        client.method1548(class133.field2231, class2.method217(16748608) + var88.field984, 38, var88.field981, var83, var10.field2579);
                                                    }
                                                    class161 var10000 = (class161) null;
                                                    if (class161.method3034(client.method2167(var10)) && var89 != null) {
                                                        for (int var94 = 2; var94 >= 0; var94--) {
                                                            if (var89[var94] != null) {
                                                                byte var95 = 0;
                                                                if (var94 == 0) {
                                                                    var95 = 33;
                                                                }
                                                                if (var94 == 1) {
                                                                    var95 = 34;
                                                                }
                                                                if (var94 == 2) {
                                                                    var95 = 35;
                                                                }
                                                                client.method1548(var89[var94], class2.method217(16748608) + var88.field984, var95, var88.field981, var83, var10.field2579);
                                                            }
                                                        }
                                                    }
                                                    String[] var96 = var10.field2637;
                                                    if (client.field649) {
                                                        var96 = client.method108(var96);
                                                    }
                                                    if (var96 != null) {
                                                        for (int var97 = 4; var97 >= 0; var97--) {
                                                            if (var96[var97] != null) {
                                                                byte var98 = 0;
                                                                if (var97 == 0) {
                                                                    var98 = 39;
                                                                }
                                                                if (var97 == 1) {
                                                                    var98 = 40;
                                                                }
                                                                if (var97 == 2) {
                                                                    var98 = 41;
                                                                }
                                                                if (var97 == 3) {
                                                                    var98 = 42;
                                                                }
                                                                if (var97 == 4) {
                                                                    var98 = 43;
                                                                }
                                                                client.method1548(var96[var97], class2.method217(16748608) + var88.field984, var98, var88.field981, var83, var10.field2579);
                                                            }
                                                        }
                                                    }
                                                    client.method1548(class133.field2184, class2.method217(16748608) + var88.field984, 1005, var88.field981, var83, var10.field2579);
                                                } else if ((field955 & 0x10) == 16) {
                                                    client.method1548(client.field534, client.field638 + " " + class2.field28 + " " + class2.method217(16748608) + var88.field984, 32, var88.field981, var83, var10.field2579);
                                                }
                                            }
                                        }
                                        var83++;
                                    }
                                }
                            }
                            if (var10.field2639) {
                                if (!client.field562) {
                                    for (int var99 = 9; var99 >= 5; var99--) {
                                        String var100 = client.method2782(var10, var99);
                                        if (var100 != null) {
                                            client.method1548(var100, var10.field2612, 1007, var99 + 1, var10.field2580, var10.field2579);
                                        }
                                    }
                                    String var101;
                                    if (class161.method1989(client.method2167(var10)) == 0) {
                                        var101 = null;
                                    } else if (var10.field2645 == null || var10.field2645.trim().length() == 0) {
                                        var101 = null;
                                    } else {
                                        var101 = var10.field2645;
                                    }
                                    if (var101 != null) {
                                        client.method1548(var101, var10.field2612, 25, 0, var10.field2580, var10.field2579);
                                    }
                                    for (int var103 = 4; var103 >= 0; var103--) {
                                        String var104 = client.method2782(var10, var103);
                                        if (var104 != null) {
                                            client.method1548(var104, var10.field2612, 57, var103 + 1, var10.field2580, var10.field2579);
                                        }
                                    }
                                    int var105 = client.method2167(var10);
                                    boolean var106 = (var105 & 0x1) != 0;
                                    if (var106) {
                                        client.method1548(class133.field2096, "", 30, 0, var10.field2580, var10.field2579);
                                    }
                                } else if (class161.method1437(client.method2167(var10)) && (field955 & 0x20) == 32) {
                                    client.method1548(client.field534, client.field638 + " " + class2.field28 + " " + var10.field2612, 58, 0, var10.field2580, var10.field2579);
                                }
                            }
                        }
                        if (var10.field2581 == 0) {
                            if (!var10.field2639 && client.method42(var10) && field204 != var10) {
                                continue;
                            }
                            if (!var10.field2639) {
                                if (var10.field2611 > var10.field2595 - var10.field2589) {
                                    var10.field2611 = var10.field2595 - var10.field2589;
                                }
                                if (var10.field2611 < 0) {
                                    var10.field2611 = 0;
                                }
                            }
                            method133(arg0, var10.field2579, var20, var21, var22, var23, var13 - var10.field2592, var14 - var10.field2611, var11);
                            if (var10.field2664 != null) {
                                method133(var10.field2664, var10.field2579, var20, var21, var22, var23, var13 - var10.field2592, var14 - var10.field2611, var11);
                            }
                            class4 var107 = (class4) client.field640.method3261((long) var10.field2579);
                            if (var107 != null) {
                                if (var107.field67 == 0 && class76.field1399 >= var20 && class76.field1388 >= var21 && class76.field1399 < var22 && class76.field1388 < var23 && !client.field473 && !client.field648) {
                                    client.field627[0] = class133.field2304;
                                    client.field539[0] = "";
                                    client.field625[0] = 1006;
                                    client.field547 = 1;
                                }
                                client.method666(var107.field69, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class88.method1759(arg2, arg3, arg4, arg5);
                            class103.method2130();
                        }
                        if (client.field541[var11] || client.field581 > 1) {
                            if (var10.field2581 == 0 && !var10.field2639 && var10.field2595 > var10.field2589) {
                                int var108 = var10.field2588 + var13;
                                int var109 = var10.field2611;
                                int var110 = var10.field2589;
                                int var111 = var10.field2595;
                                field252[0].method1744(var108, var14);
                                field252[1].method1744(var108, var14 + var110 - 16);
                                class88.method1761(var108, var14 + 16, 16, var110 - 32, client.field479);
                                int var112 = (var110 - 32) * var110 / var111;
                                if (var112 < 8) {
                                    var112 = 8;
                                }
                                int var113 = (var110 - 32 - var112) * var109 / (var111 - var110);
                                class88.method1761(var108, var14 + 16 + var113, 16, var112, client.field560);
                                class88.method1767(var108, var14 + 16 + var113, var112, client.field692);
                                class88.method1767(var108 + 1, var14 + 16 + var113, var112, client.field692);
                                class88.method1765(var108, var14 + 16 + var113, 16, client.field692);
                                class88.method1765(var108, var14 + 17 + var113, 16, client.field692);
                                class88.method1767(var108 + 15, var14 + 16 + var113, var112, client.field561);
                                class88.method1767(var108 + 14, var14 + 17 + var113, var112 - 1, client.field561);
                                class88.method1765(var108, var14 + 15 + var113 + var112, 16, client.field561);
                                class88.method1765(var108 + 1, var14 + 14 + var113 + var112, 15, client.field561);
                            }
                            if (var10.field2581 != 1) {
                                if (var10.field2581 == 2) {
                                    int var114 = 0;
                                    for (int var115 = 0; var115 < var10.field2589; var115++) {
                                        for (int var116 = 0; var116 < var10.field2588; var116++) {
                                            int var117 = (var10.field2632 + 32) * var116 + var13;
                                            int var118 = (var10.field2593 + 32) * var115 + var14;
                                            if (var114 < 20) {
                                                var117 += var10.field2634[var114];
                                                var118 += var10.field2654[var114];
                                            }
                                            if (var10.field2652[var114] > 0) {
                                                boolean var119 = false;
                                                boolean var120 = false;
                                                int var121 = var10.field2652[var114] - 1;
                                                if (var117 + 32 > arg2 && var117 < arg4 && var118 + 32 > arg3 && var118 < arg5 || field298 == var10 && client.field592 == var114) {
                                                    class85 var122;
                                                    if (client.field687 == 1 && field1448 == var114 && field1676 == var10.field2579) {
                                                        var122 = class39.method137(var121, var10.field2682[var114], 2, 0, false);
                                                    } else {
                                                        var122 = class39.method137(var121, var10.field2682[var114], 1, 3153952, false);
                                                    }
                                                    if (var122 == null) {
                                                        method1546(var10);
                                                    } else if (field298 == var10 && client.field592 == var114) {
                                                        int var123 = class76.field1399 - client.field614;
                                                        int var124 = class76.field1388 - client.field606;
                                                        if (var123 < 5 && var123 > -5) {
                                                            var123 = 0;
                                                        }
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (client.field597 < 5) {
                                                            var123 = 0;
                                                            var124 = 0;
                                                        }
                                                        var122.method1666(var117 + var123, var118 + var124, 128);
                                                        if (arg1 != -1) {
                                                            class157 var125 = arg0[arg1 & 0xFFFF];
                                                            if (var118 + var124 < class88.field1492 && var125.field2611 > 0) {
                                                                int var126 = client.field558 * (class88.field1492 - var118 - var124) / 3;
                                                                if (var126 > client.field558 * 10) {
                                                                    var126 = client.field558 * 10;
                                                                }
                                                                if (var126 > var125.field2611) {
                                                                    var126 = var125.field2611;
                                                                }
                                                                var125.field2611 -= var126;
                                                                client.field606 += var126;
                                                                method1546(var125);
                                                            }
                                                            if (var118 + var124 + 32 > class88.field1496 && var125.field2611 < var125.field2595 - var125.field2589) {
                                                                int var127 = client.field558 * (var118 + var124 + 32 - class88.field1496) / 3;
                                                                if (var127 > client.field558 * 10) {
                                                                    var127 = client.field558 * 10;
                                                                }
                                                                if (var127 > var125.field2595 - var125.field2589 - var125.field2611) {
                                                                    var127 = var125.field2595 - var125.field2589 - var125.field2611;
                                                                }
                                                                var125.field2611 += var127;
                                                                client.field606 -= var127;
                                                                method1546(var125);
                                                            }
                                                        }
                                                    } else if (field293 == var10 && client.field593 == var114) {
                                                        var122.method1666(var117, var118, 128);
                                                    } else {
                                                        var122.method1660(var117, var118);
                                                    }
                                                }
                                            } else if (var10.field2678 != null && var114 < 20) {
                                                class85 var128 = var10.method3043(var114);
                                                if (var128 != null) {
                                                    var128.method1660(var117, var118);
                                                } else if (class157.field2609) {
                                                    method1546(var10);
                                                }
                                            }
                                            var114++;
                                        }
                                    }
                                } else if (var10.field2581 == 3) {
                                    int var129;
                                    if (client.method2619(var10)) {
                                        var129 = var10.field2597;
                                        if (field204 == var10 && var10.field2599 != 0) {
                                            var129 = var10.field2599;
                                        }
                                    } else {
                                        var129 = var10.field2596;
                                        if (field204 == var10 && var10.field2598 != 0) {
                                            var129 = var10.field2598;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2643) {
                                            class88.method1761(var13, var14, var10.field2588, var10.field2589, var129);
                                        } else {
                                            class88.method1763(var13, var14, var10.field2588, var10.field2589, var129);
                                        }
                                    } else if (var10.field2643) {
                                        class88.method1760(var13, var14, var10.field2588, var10.field2589, var129, 256 - (var15 & 0xFF));
                                    } else {
                                        class88.method1764(var13, var14, var10.field2588, var10.field2589, var129, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2581 == 4) {
                                    class182 var130 = var10.method3042();
                                    if (var130 != null) {
                                        String var131 = var10.field2673;
                                        int var132;
                                        if (client.method2619(var10)) {
                                            var132 = var10.field2597;
                                            if (field204 == var10 && var10.field2599 != 0) {
                                                var132 = var10.field2599;
                                            }
                                            if (var10.field2681.length() > 0) {
                                                var131 = var10.field2681;
                                            }
                                        } else {
                                            var132 = var10.field2596;
                                            if (field204 == var10 && var10.field2598 != 0) {
                                                var132 = var10.field2598;
                                            }
                                        }
                                        if (var10.field2639 && var10.field2683 != -1) {
                                            class39 var133 = class39.method1244(var10.field2683);
                                            var131 = var133.field984;
                                            if (var131 == null) {
                                                var131 = "null";
                                            }
                                            if ((var133.field995 == 1 || var10.field2590 != 1) && var10.field2590 != -1) {
                                                var131 = class2.method217(16748608) + var131 + class2.field35 + " " + 'x' + client.method37(var10.field2590);
                                            }
                                        }
                                        if (client.field643 == var10) {
                                            class133 var192 = (class133) null;
                                            var131 = class133.field2239;
                                            var132 = var10.field2596;
                                        }
                                        if (!var10.field2639) {
                                            var131 = client.method3091(var131, var10);
                                        }
                                        var130.method3365(var131, var13, var14, var10.field2588, var10.field2589, var132, var10.field2631 ? 0 : -1, var10.field2629, var10.field2630, var10.field2628);
                                    } else if (class157.field2609) {
                                        method1546(var10);
                                    }
                                } else if (var10.field2581 == 5) {
                                    if (var10.field2639) {
                                        class85 var135;
                                        if (var10.field2683 == -1) {
                                            var135 = var10.method3047(false);
                                        } else {
                                            var135 = class39.method137(var10.field2683, var10.field2590, var10.field2607, var10.field2608, false);
                                        }
                                        if (var135 != null) {
                                            int var136 = var135.field1476;
                                            int var137 = var135.field1477;
                                            if (var10.field2606) {
                                                class88.method1756(var13, var14, var10.field2588 + var13, var10.field2589 + var14);
                                                int var138 = (var10.field2588 + (var136 - 1)) / var136;
                                                int var139 = (var10.field2589 + (var137 - 1)) / var137;
                                                for (int var140 = 0; var140 < var138; var140++) {
                                                    for (int var141 = 0; var141 < var139; var141++) {
                                                        if (var10.field2665 != 0) {
                                                            var135.method1672(var136 / 2 + var136 * var140 + var13, var137 / 2 + var137 * var141 + var14, var10.field2665, 4096);
                                                        } else if (var15 == 0) {
                                                            var135.method1660(var136 * var140 + var13, var137 * var141 + var14);
                                                        } else {
                                                            var135.method1666(var136 * var140 + var13, var137 * var141 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1759(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var142 = var10.field2588 * 4096 / var136;
                                                if (var10.field2665 != 0) {
                                                    var135.method1672(var10.field2588 / 2 + var13, var10.field2589 / 2 + var14, var10.field2665, var142);
                                                } else if (var15 != 0) {
                                                    var135.method1654(var13, var14, var10.field2588, var10.field2589, 256 - (var15 & 0xFF));
                                                } else if (var10.field2588 == var136 && var10.field2589 == var137) {
                                                    var135.method1660(var13, var14);
                                                } else {
                                                    var135.method1732(var13, var14, var10.field2588, var10.field2589);
                                                }
                                            }
                                        } else if (class157.field2609) {
                                            method1546(var10);
                                        }
                                    } else {
                                        class85 var134 = var10.method3047(client.method2619(var10));
                                        if (var134 != null) {
                                            var134.method1660(var13, var14);
                                        } else if (class157.field2609) {
                                            method1546(var10);
                                        }
                                    }
                                } else if (var10.field2581 == 6) {
                                    boolean var143 = client.method2619(var10);
                                    int var144;
                                    if (var143) {
                                        var144 = var10.field2616;
                                    } else {
                                        var144 = var10.field2615;
                                    }
                                    class111 var145 = null;
                                    int var146 = 0;
                                    if (var10.field2683 != -1) {
                                        class39 var147 = class39.method1244(var10.field2683);
                                        if (var147 != null) {
                                            class39 var148 = var147.method806(var10.field2590);
                                            var145 = var148.method827(1);
                                            if (var145 == null) {
                                                method1546(var10);
                                            } else {
                                                var145.method2184();
                                                var146 = var145.field1558 / 2;
                                            }
                                        }
                                    } else if (var10.field2663 == 5) {
                                        if (var10.field2671 == 0) {
                                            var145 = client.field737.method3132((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var145 = field2035.method19();
                                        }
                                    } else if (var144 == -1) {
                                        var145 = var10.method3044((class33) null, -1, var143, field2035.field52);
                                        if (var145 == null && class157.field2609) {
                                            method1546(var10);
                                        }
                                    } else {
                                        class33 var149 = class33.method751(var144);
                                        var145 = var10.method3044(var149, var10.field2685, var143, field2035.field52);
                                        if (var145 == null && class157.field2609) {
                                            method1546(var10);
                                        }
                                    }
                                    class103.method2086(var10.field2588 / 2 + var13, var10.field2589 / 2 + var14);
                                    int var150 = var10.field2622 * class103.field1790[var10.field2620] >> 16;
                                    int var151 = var10.field2622 * class103.field1787[var10.field2620] >> 16;
                                    if (var145 != null) {
                                        if (var10.field2639) {
                                            var145.method2184();
                                            if (var10.field2624) {
                                                var145.method2195(0, var10.field2585, var10.field2621, var10.field2620, var10.field2651, var10.field2618 + var146 + var150, var10.field2618 + var151, var10.field2622);
                                            } else {
                                                var145.method2210(0, var10.field2585, var10.field2621, var10.field2620, var10.field2651, var10.field2618 + var146 + var150, var10.field2618 + var151);
                                            }
                                        } else {
                                            var145.method2210(0, var10.field2585, 0, var10.field2620, 0, var150, var151);
                                        }
                                    }
                                    class103.method2117();
                                } else {
                                    if (var10.field2581 == 7) {
                                        class182 var152 = var10.method3042();
                                        if (var152 == null) {
                                            if (class157.field2609) {
                                                method1546(var10);
                                            }
                                            continue;
                                        }
                                        int var153 = 0;
                                        for (int var154 = 0; var154 < var10.field2589; var154++) {
                                            for (int var155 = 0; var155 < var10.field2588; var155++) {
                                                if (var10.field2652[var153] > 0) {
                                                    class39 var156 = class39.method1244(var10.field2652[var153] - 1);
                                                    String var157;
                                                    if (var156.field995 != 1 && var10.field2682[var153] == 1) {
                                                        var157 = class2.method217(16748608) + var156.field984 + class2.field35;
                                                    } else {
                                                        var157 = class2.method217(16748608) + var156.field984 + class2.field35 + " " + 'x' + client.method37(var10.field2682[var153]);
                                                    }
                                                    int var158 = (var10.field2632 + 115) * var155 + var13;
                                                    int var159 = (var10.field2593 + 12) * var154 + var14;
                                                    if (var10.field2629 == 0) {
                                                        var152.method3411(var157, var158, var159, var10.field2596, var10.field2631 ? 0 : -1);
                                                    } else if (var10.field2629 == 1) {
                                                        var152.method3436(var157, var10.field2588 / 2 + var158, var159, var10.field2596, var10.field2631 ? 0 : -1);
                                                    } else {
                                                        var152.method3363(var157, var10.field2588 + var158 - 1, var159, var10.field2596, var10.field2631 ? 0 : -1);
                                                    }
                                                }
                                                var153++;
                                            }
                                        }
                                    }
                                    if (var10.field2581 == 8 && field345 == var10 && client.field632 == client.field631) {
                                        int var160 = 0;
                                        int var161 = 0;
                                        class182 var162 = field1797;
                                        String var163 = var10.field2673;
                                        String var164 = client.method3091(var163, var10);
                                        while (var164.length() > 0) {
                                            int var165 = var164.indexOf(class2.field32);
                                            String var166;
                                            if (var165 == -1) {
                                                var166 = var164;
                                                var164 = "";
                                            } else {
                                                var166 = var164.substring(0, var165);
                                                var164 = var164.substring(var165 + 4);
                                            }
                                            int var167 = var162.method3357(var166);
                                            if (var167 > var160) {
                                                var160 = var167;
                                            }
                                            var161 += var162.field2835 + 1;
                                        }
                                        var160 += 6;
                                        var161 += 7;
                                        int var168 = var10.field2588 + var13 - 5 - var160;
                                        int var169 = var10.field2589 + var14 + 5;
                                        if (var168 < var13 + 5) {
                                            var168 = var13 + 5;
                                        }
                                        if (var160 + var168 > arg4) {
                                            var168 = arg4 - var160;
                                        }
                                        if (var161 + var169 > arg5) {
                                            var169 = arg5 - var161;
                                        }
                                        class88.method1761(var168, var169, var160, var161, 16777120);
                                        class88.method1763(var168, var169, var160, var161, 0);
                                        String var170 = var10.field2673;
                                        int var171 = var162.field2835 + var169 + 2;
                                        String var172 = client.method3091(var170, var10);
                                        while (var172.length() > 0) {
                                            int var173 = var172.indexOf(class2.field32);
                                            String var174;
                                            if (var173 == -1) {
                                                var174 = var172;
                                                var172 = "";
                                            } else {
                                                var174 = var172.substring(0, var173);
                                                var172 = var172.substring(var173 + 4);
                                            }
                                            var162.method3411(var174, var168 + 3, var171, 0, -1);
                                            var171 += var162.field2835 + 1;
                                        }
                                    }
                                    if (var10.field2581 == 9) {
                                        if (var10.field2602 == 1) {
                                            class88.method1769(var13, var14, var10.field2588 + var13, var10.field2589 + var14, var10.field2596);
                                        } else {
                                            int var175 = var10.field2588 >= 0 ? var10.field2588 : -var10.field2588;
                                            int var176 = var10.field2589 >= 0 ? var10.field2589 : -var10.field2589;
                                            int var177 = var175;
                                            if (var175 < var176) {
                                                var177 = var176;
                                            }
                                            if (var177 != 0) {
                                                int var178 = (var10.field2588 << 16) / var177;
                                                int var179 = (var10.field2589 << 16) / var177;
                                                if (var179 <= var178) {
                                                    var178 = -var178;
                                                } else {
                                                    var179 = -var179;
                                                }
                                                int var180 = var10.field2602 * var179 >> 17;
                                                int var181 = var10.field2602 * var179 + 1 >> 17;
                                                int var182 = var10.field2602 * var178 >> 17;
                                                int var183 = var10.field2602 * var178 + 1 >> 17;
                                                int var184 = var13 + var180;
                                                int var185 = var13 - var181;
                                                int var186 = var10.field2588 + var13 - var181;
                                                int var187 = var10.field2588 + var13 + var180;
                                                int var188 = var14 + var182;
                                                int var189 = var14 - var183;
                                                int var190 = var10.field2589 + var14 - var183;
                                                int var191 = var10.field2589 + var14 + var182;
                                                class103.method2091(var184, var185, var186);
                                                class103.method2108(var188, var189, var190, var184, var185, var186, var10.field2596);
                                                class103.method2091(var184, var186, var187);
                                                class103.method2108(var188, var190, var191, var184, var186, var187, var10.field2596);
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

    @ObfuscatedName("bi.cw(Lfn;B)V")
    public static void method1546(class157 arg0) {
        if (client.field651 == arg0.field2695) {
            client.field617[arg0.field2694] = true;
        }
    }

    @ObfuscatedName("p.cf(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method3(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            client.field690[var4] = client.field690[var4 - 1];
            client.field497[var4] = client.field497[var4 - 1];
            client.field693[var4] = client.field693[var4 - 1];
            client.field719[var4] = client.field719[var4 - 1];
        }
        client.field690[0] = arg0;
        client.field497[0] = arg1;
        client.field693[0] = arg2;
        client.field719[0] = arg3;
        client.field694++;
        client.field669 = client.field729;
    }
}
