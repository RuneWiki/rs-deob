package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Statics {

    @ObfuscatedName("c.ek")
    public static class79[] field1;

    @ObfuscatedName("ar.v")
    public static int[] field1004;

    @ObfuscatedName("as.h")
    public static class167 field1006;

    @ObfuscatedName("as.c")
    public static class167 field1010;

    @ObfuscatedName("as.n")
    public static int[] field1012;

    @ObfuscatedName("ap.c")
    public static class167 field1029;

    @ObfuscatedName("ap.h")
    public static class167 field1031;

    @ObfuscatedName("ap.k")
    public static int field1033;

    @ObfuscatedName("ap.ix")
    public static int field1035;

    @ObfuscatedName("ag.c")
    public static class167 field1042;

    @ObfuscatedName("ag.qe")
    public static Font field1043;

    @ObfuscatedName("ab.c")
    public static class167 field1051;

    @ObfuscatedName("ab.pp")
    public static Clipboard field1060;

    @ObfuscatedName("al.c")
    public static class167 field1067;

    @ObfuscatedName("al.r")
    public static int[] field1069;

    @ObfuscatedName("al.fa")
    public static int field1071;

    @ObfuscatedName("al.ea")
    public static class79[] field1072;

    @ObfuscatedName("ae.ns")
    public static int field1083;

    @ObfuscatedName("ae.f")
    public static int[] field1085;

    @ObfuscatedName("ay.c")
    public static class167 field1089;

    @ObfuscatedName("ay.ni")
    public static int field1090;

    @ObfuscatedName("an.c")
    public static class167 field1093;

    @ObfuscatedName("an.ar")
    public static String field1095;

    @ObfuscatedName("an.gz")
    public static class173 field1096;

    @ObfuscatedName("an.dz")
    public static byte[][] field1097;

    @ObfuscatedName("an.i")
    public static int[] field1099;

    @ObfuscatedName("ah.g")
    public static class167 field1105;

    @ObfuscatedName("ah.o")
    public static boolean field1106;

    @ObfuscatedName("ah.y")
    public static class224 field1110;

    @ObfuscatedName("ah.h")
    public static int field1154;

    @ObfuscatedName("be.h")
    public static int field1156;

    @ObfuscatedName("be.em")
    public static class79 field1160;

    @ObfuscatedName("be.r")
    public static int field1162;

    @ObfuscatedName("be.c")
    public static class167 field1163;

    @ObfuscatedName("be.g")
    public static class81[] field1164;

    @ObfuscatedName("bx.c")
    public static class54 field1167;

    @ObfuscatedName("bo.k")
    public static int field1191;

    @ObfuscatedName("by.w")
    public static float field1230;

    @ObfuscatedName("by.m")
    public static int field1237;

    @ObfuscatedName("w.nd")
    public static int field126;

    @ObfuscatedName("bd.y")
    public static int[] field1263;

    @ObfuscatedName("bd.r")
    public static int[] field1270;

    @ObfuscatedName("bd.q")
    public static boolean[] field1272;

    @ObfuscatedName("w.bm")
    public static class168 field128;

    @ObfuscatedName("bh.m")
    public static int field1281;

    @ObfuscatedName("bh.f")
    public static class68[] field1282;

    @ObfuscatedName("bh.x")
    public static class61[] field1283;

    @ObfuscatedName("bh.q")
    public static class74[] field1285;

    @ObfuscatedName("bh.i")
    public static byte[] field1287;

    @ObfuscatedName("bh.z")
    public static float[] field1288;

    @ObfuscatedName("bh.d")
    public static class69[] field1289;

    @ObfuscatedName("bh.y")
    public static int field1291;

    @ObfuscatedName("bh.r")
    public static int field1294;

    @ObfuscatedName("bh.e")
    public static boolean[] field1296;

    @ObfuscatedName("bh.l")
    public static int[] field1297;

    @ObfuscatedName("c.s")
    public static int[] field13;

    @ObfuscatedName("bh.w")
    public static int field1300;

    @ObfuscatedName("bh.j")
    public static float[] field1303;

    @ObfuscatedName("bh.n")
    public static float[] field1305;

    @ObfuscatedName("bh.p")
    public static float[] field1306;

    @ObfuscatedName("bh.aj")
    public static float[] field1307;

    @ObfuscatedName("bh.aq")
    public static float[] field1308;

    @ObfuscatedName("bh.aw")
    public static float[] field1309;

    @ObfuscatedName("m.ph")
    public static class134 field131;

    @ObfuscatedName("bh.az")
    public static int[] field1310;

    @ObfuscatedName("bh.at")
    public static int[] field1311;

    @ObfuscatedName("bg.fd")
    public static int field1366;

    @ObfuscatedName("bf.o")
    public static int[] field1369;

    @ObfuscatedName("m.jb")
    public static int field137;

    @ObfuscatedName("bf.k")
    public static int field1370;

    @ObfuscatedName("bf.t")
    public static int[] field1371;

    @ObfuscatedName("bf.w")
    public static int[] field1372;

    @ObfuscatedName("bf.m")
    public static byte[][] field1373;

    @ObfuscatedName("bf.c")
    public static int field1375;

    @ObfuscatedName("bu.ec")
    public static class81[] field1380;

    @ObfuscatedName("co.x")
    public static int field1397;

    @ObfuscatedName("co.d")
    public static int field1398;

    @ObfuscatedName("co.f")
    public static int[] field1399;

    @ObfuscatedName("c.cy")
    public static int field14;

    @ObfuscatedName("cm.d")
    public static int[] field1418;

    @ObfuscatedName("cj.dt")
    public static int field1436;

    @ObfuscatedName("cn.b")
    public static int field1452;

    @ObfuscatedName("cn.l")
    public static int field1454;

    @ObfuscatedName("cn.u")
    public static int field1455;

    @ObfuscatedName("cn.a")
    public static int field1456;

    @ObfuscatedName("cn.s")
    public static int field1458;

    @ObfuscatedName("cn.j")
    public static int field1460;

    @ObfuscatedName("cn.v")
    public static int field1462;

    @ObfuscatedName("cn.aj")
    public static int field1464;

    @ObfuscatedName("cn.aq")
    public static int field1465;

    @ObfuscatedName("cn.az")
    public static int field1467;

    @ObfuscatedName("cn.n")
    public static int field1469;

    @ObfuscatedName("cn.bc")
    public static int field1472;

    @ObfuscatedName("cn.aw")
    public static int field1480;

    @ObfuscatedName("cn.z")
    public static int field1492;

    @ObfuscatedName("cn.bk")
    public static boolean[][] field1493;

    @ObfuscatedName("cn.bo")
    public static int field1494;

    @ObfuscatedName("cn.bi")
    public static int field1495;

    @ObfuscatedName("cn.p")
    public static int field1496;

    @ObfuscatedName("cn.bj")
    public static int field1497;

    @ObfuscatedName("cn.bt")
    public static int field1498;

    @ObfuscatedName("cn.bm")
    public static int field1499;

    @ObfuscatedName("cr.ie")
    public static int field1505;

    @ObfuscatedName("cl.ay")
    public static class79[] field1532;

    @ObfuscatedName("cs.hj")
    public static int field1541;

    @ObfuscatedName("cs.x")
    public static class172 field1542;

    @ObfuscatedName("cg.b")
    public static int field1545;

    @ObfuscatedName("cg.n")
    public static int field1552;

    @ObfuscatedName("cg.y")
    public static int field1553;

    @ObfuscatedName("cg.z")
    public static int field1555;

    @ObfuscatedName("cg.s")
    public static int field1556;

    @ObfuscatedName("cg.v")
    public static int field1557;

    @ObfuscatedName("cg.j")
    public static int field1558;

    @ObfuscatedName("cg.aq")
    public static class92 field1563;

    @ObfuscatedName("cg.q")
    public static int field1565;

    @ObfuscatedName("cu.pt")
    public static int field1574;

    @ObfuscatedName("y.l")
    public static String field158;

    @ObfuscatedName("cb.e")
    public static class119 field1589;

    @ObfuscatedName("q.me")
    public static byte field159;

    @ObfuscatedName("cz.dv")
    public static int[][] field1601;

    @ObfuscatedName("cc.qf")
    public static int field1604;

    @ObfuscatedName("q.ah")
    public static class81[] field164;

    @ObfuscatedName("cv.ay")
    public static class168 field1644;

    @ObfuscatedName("cv.ct")
    public static class224 field1645;

    @ObfuscatedName("q.iu")
    public static class173 field165;

    @ObfuscatedName("q.cq")
    public static char field167;

    @ObfuscatedName("q.bb")
    public static class168 field169;

    @ObfuscatedName("ct.nx")
    public static int field1729;

    @ObfuscatedName("cf.dp")
    public static int[] field1734;

    @ObfuscatedName("cf.ft")
    public static int field1735;

    @ObfuscatedName("ca.r")
    public static class212 field1742;

    @ObfuscatedName("ca.bk")
    public static class168 field1743;

    @ObfuscatedName("ca.bt")
    public static class168 field1746;

    @ObfuscatedName("cy.pr")
    public static int field1762;

    @ObfuscatedName("cy.s")
    public static String field1766;

    @ObfuscatedName("dt.be")
    public static int field1821;

    @ObfuscatedName("dt.bb")
    public static int field1822;

    @ObfuscatedName("dt.bx")
    public static int field1823;

    @ObfuscatedName("du.g")
    public static int field1838;

    @ObfuscatedName("du.qu")
    public static Canvas field1839;

    @ObfuscatedName("du.ii")
    public static class173 field1841;

    @ObfuscatedName("ds.nh")
    public static int field1844;

    @ObfuscatedName("ds.qx")
    public static int field1848;

    @ObfuscatedName("x.ey")
    public static class81[] field186;

    @ObfuscatedName("dj.fr")
    public static int field1868;

    @ObfuscatedName("x.nk")
    public static int field191;

    @ObfuscatedName("x.db")
    public static int field192;

    @ObfuscatedName("di.z")
    public static class14 field1929;

    @ObfuscatedName("di.mm")
    public static byte field1930;

    @ObfuscatedName("di.r")
    public static short[][] field1931;

    @ObfuscatedName("di.nb")
    public static class57 field1936;

    @ObfuscatedName("da.h")
    public static long field1938;

    @ObfuscatedName("da.c")
    public static long field1940;

    @ObfuscatedName("dq.pd")
    public static int field1964;

    @ObfuscatedName("dg.df")
    public static class86 field1976;

    @ObfuscatedName("dg.be")
    public static class168 field1977;

    @ObfuscatedName("x.nc")
    public static class56 field198;

    @ObfuscatedName("dk.ic")
    public static int field1981;

    @ObfuscatedName("dk.q")
    public static int[] field1988;

    @ObfuscatedName("db.pz")
    public static class136 field1993;

    @ObfuscatedName("db.i")
    public static int field1995;

    @ObfuscatedName("h.ba")
    public static int field20;

    @ObfuscatedName("d.pi")
    public static long field200;

    @ObfuscatedName("de.w")
    public static int field2004;

    @ObfuscatedName("do.l")
    public static String[] field2005;

    @ObfuscatedName("dx.qy")
    public static Frame field2011;

    @ObfuscatedName("dd.es")
    public static class81[] field2024;

    @ObfuscatedName("d.bb")
    public static class81 field203;

    @ObfuscatedName("eo.i")
    public static int field2032;

    @ObfuscatedName("eg.m")
    public static short[] field2037;

    @ObfuscatedName("el.pc")
    public static class9 field2046;

    @ObfuscatedName("el.qt")
    public static int field2050;

    @ObfuscatedName("ef.h")
    public static File field2053;

    @ObfuscatedName("ef.w")
    public static byte[][][] field2057;

    @ObfuscatedName("d.du")
    public static int field206;

    @ObfuscatedName("ex.c")
    public static String field2066;

    @ObfuscatedName("ex.h")
    public static String field2068;

    @ObfuscatedName("d.aa")
    public static boolean field208;

    @ObfuscatedName("e.mq")
    public static class25[] field209;

    @ObfuscatedName("eq.jh")
    public static class173[] field2109;

    @ObfuscatedName("e.qq")
    public static class78 field211;

    @ObfuscatedName("ey.fh")
    public static int field2126;

    @ObfuscatedName("e.bn")
    public static class168 field213;

    @ObfuscatedName("e.y")
    public static int[] field214;

    @ObfuscatedName("er.cw")
    public static class224 field2143;

    @ObfuscatedName("ed.bo")
    public static class168 field2154;

    @ObfuscatedName("ed.qz")
    public static int field2155;

    @ObfuscatedName("ed.pf")
    public static GarbageCollectorMXBean field2157;

    @ObfuscatedName("ek.io")
    public static int field2178;

    @ObfuscatedName("ee.h")
    public static String field2191;

    @ObfuscatedName("ee.c")
    public static Applet field2192;

    @ObfuscatedName("ee.k")
    public static class167 field2195;

    @ObfuscatedName("es.g")
    public static File field2198;

    @ObfuscatedName("es.b")
    public static String field2202;

    @ObfuscatedName("es.x")
    public static class228[] field2206;

    @ObfuscatedName("es.t")
    public static File field2207;

    @ObfuscatedName("ec.av")
    public static int field2220;

    @ObfuscatedName("ei.cl")
    public static int field2230;

    @ObfuscatedName("eh.d")
    public static int[][][] field2243;

    @ObfuscatedName("eu.ck")
    public static class146 field2245;

    @ObfuscatedName("ew.be")
    public static class81[] field2255;

    @ObfuscatedName("ew.nw")
    public static int field2264;

    @ObfuscatedName("en.np")
    public static class75 field2273;

    @ObfuscatedName("ep.g")
    public static int field2284;

    @ObfuscatedName("l.gv")
    public static class173 field230;

    @ObfuscatedName("h.bx")
    public static class168 field24;

    @ObfuscatedName("u.qm")
    public static int field242;

    @ObfuscatedName("a.m")
    public static int[][] field250;

    @ObfuscatedName("a.cj")
    public static class143 field254;

    @ObfuscatedName("fa.ah")
    public static class168 field2560;

    @ObfuscatedName("fh.b")
    public static class119 field2578;

    @ObfuscatedName("b.bc")
    public static class168 field259;

    @ObfuscatedName("fy.ib")
    public static int field2616;

    @ObfuscatedName("fw.hi")
    public static int field2623;

    @ObfuscatedName("fe.k")
    public static int[] field2630;

    @ObfuscatedName("fb.dk")
    public static int field2634;

    @ObfuscatedName("fu.as")
    public static class146 field2642;

    @ObfuscatedName("fu.e")
    public static String[] field2643;

    @ObfuscatedName("fn.ho")
    public static class3 field2644;

    @ObfuscatedName("fn.pj")
    public static class221 field2645;

    @ObfuscatedName("fj.kb")
    public static class20 field2670;

    @ObfuscatedName("fm.nn")
    public static class57 field2677;

    @ObfuscatedName("ft.rz")
    public static boolean field2691;

    @ObfuscatedName("fr.p")
    public static int[] field2697;

    @ObfuscatedName("fr.m")
    public static int field2698;

    @ObfuscatedName("ff.k")
    public static long field2701;

    @ObfuscatedName("ff.c")
    public static class143 field2706;

    @ObfuscatedName("ff.f")
    public static boolean field2711;

    @ObfuscatedName("ff.an")
    public static class168 field2719;

    @ObfuscatedName("fc.b")
    public static int[] field2725;

    @ObfuscatedName("fc.q")
    public static class173 field2727;

    @ObfuscatedName("fc.t")
    public static class167 field2729;

    @ObfuscatedName("fo.h")
    public static boolean[] field2733;

    @ObfuscatedName("fo.o")
    public static class167 field2734;

    @ObfuscatedName("client.o")
    public static class153 field275;

    @ObfuscatedName("h.fy")
    public static int field28;

    @ObfuscatedName("fo.c")
    public static class173[][] field2827;

    @ObfuscatedName("fv.o")
    public static class73 field2876;

    @ObfuscatedName("fi.f")
    public static class60 field2888;

    @ObfuscatedName("fg.bz")
    public static int field2896;

    @ObfuscatedName("fg.c")
    public static class167 field2897;

    @ObfuscatedName("h.kr")
    public static class131 field29;

    @ObfuscatedName("fp.i")
    public static short[] field2904;

    @ObfuscatedName("fp.w")
    public static short[][] field2905;

    @ObfuscatedName("gx.t")
    public static class184 field2936;

    @ObfuscatedName("gx.y")
    public static boolean field2937;

    @ObfuscatedName("gx.h")
    public static class167 field2938;

    @ObfuscatedName("gx.o")
    public static class167 field2941;

    @ObfuscatedName("gx.c")
    public static class167 field2942;

    @ObfuscatedName("gx.q")
    public static class180 field2943;

    @ObfuscatedName("gx.k")
    public static class167 field2944;

    @ObfuscatedName("ga.gw")
    public static int field2983;

    @ObfuscatedName("ga.ds")
    public static int field2984;

    @ObfuscatedName("go.m")
    public static class81[] field2988;

    @ObfuscatedName("client.by")
    public static class168 field305;

    @ObfuscatedName("ho.h")
    public static client field3099;

    @ObfuscatedName("ho.o")
    public static int field3100;

    @ObfuscatedName("hd.k")
    public static int field3134;

    @ObfuscatedName("hd.g")
    public static int[] field3135;

    @ObfuscatedName("hz.au")
    public static class146 field3139;

    @ObfuscatedName("hx.hw")
    public static int field3140;

    @ObfuscatedName("hn.y")
    public static class173 field3148;

    @ObfuscatedName("hq.c")
    public static class113 field3157;

    @ObfuscatedName("hg.r")
    public static class81[] field3168;

    @ObfuscatedName("hu.t")
    public static class167 field3187;

    @ObfuscatedName("hv.ed")
    public static class79[] field3191;

    @ObfuscatedName("hv.o")
    public static int field3192;

    @ObfuscatedName("k.dm")
    public static byte[][] field34;

    @ObfuscatedName("client.ez")
    public static class79[] field352;

    @ObfuscatedName("client.ev")
    public static class79[] field353;

    @ObfuscatedName("client.ee")
    public static class79[] field354;

    @ObfuscatedName("client.ap")
    public static class143 field361;

    @ObfuscatedName("client.e")
    public static String field383;

    @ObfuscatedName("client.bw")
    public static int field387;

    @ObfuscatedName("client.a")
    public static int field443;

    @ObfuscatedName("client.et")
    public static class79[] field491;

    @ObfuscatedName("client.u")
    public static int field509;

    @ObfuscatedName("client.ny")
    public static int field558;

    @ObfuscatedName("client.qd")
    public static int field559;

    @ObfuscatedName("client.mv")
    public static class79 field560;

    @ObfuscatedName("client.al")
    public static long field561;

    @ObfuscatedName("s.eq")
    public static class79 field573;

    @ObfuscatedName("v.bj")
    public static class168 field579;

    @ObfuscatedName("j.an")
    public static class81[] field580;

    @ObfuscatedName("j.nq")
    public static int field589;

    @ObfuscatedName("j.m")
    public static class154 field591;

    @ObfuscatedName("z.er")
    public static class79[] field602;

    @ObfuscatedName("t.gm")
    public static class173 field62;

    @ObfuscatedName("n.no")
    public static int field622;

    @ObfuscatedName("n.lh")
    public static class130 field624;

    @ObfuscatedName("p.fw")
    public static int field633;

    @ObfuscatedName("p.t")
    public static boolean field642;

    @ObfuscatedName("p.g")
    public static class26[] field645;

    @ObfuscatedName("aj.bq")
    public static String field660;

    @ObfuscatedName("aj.hv")
    public static int field661;

    @ObfuscatedName("aq.t")
    public static String[] field667;

    @ObfuscatedName("aq.g")
    public static class167 field669;

    @ObfuscatedName("aw.iq")
    public static class31 field671;

    @ObfuscatedName("aw.jy")
    public static int field673;

    @ObfuscatedName("az.pn")
    public static class160 field692;

    @ObfuscatedName("at.n")
    public static int[] field706;

    @ObfuscatedName("af.a")
    public static int[] field707;

    @ObfuscatedName("af.di")
    public static int[] field709;

    @ObfuscatedName("af.t")
    public static class81 field710;

    @ObfuscatedName("af.o")
    public static class79 field711;

    @ObfuscatedName("af.i")
    public static class79 field712;

    @ObfuscatedName("af.y")
    public static class81 field715;

    @ObfuscatedName("g.ae")
    public static class168 field72;

    @ObfuscatedName("af.aj")
    public static int[] field724;

    @ObfuscatedName("af.aq")
    public static int[] field725;

    @ObfuscatedName("af.k")
    public static class81 field726;

    @ObfuscatedName("o.o")
    public static byte[][][] field73;

    @ObfuscatedName("af.rv")
    public static String field733;

    @ObfuscatedName("af.r")
    public static class81 field739;

    @ObfuscatedName("af.c")
    public static boolean field740;

    @ObfuscatedName("af.w")
    public static class81 field750;

    @ObfuscatedName("o.t")
    public static byte[][][] field76;

    @ObfuscatedName("ax.ch")
    public static class224 field766;

    @ObfuscatedName("o.g")
    public static byte[][][] field77;

    @ObfuscatedName("ac.qr")
    public static int field776;

    @ObfuscatedName("ac.d")
    public static int field779;

    @ObfuscatedName("am.x")
    public static int[] field782;

    @ObfuscatedName("ao.qc")
    public static int field784;

    @ObfuscatedName("ao.bh")
    public static int field787;

    @ObfuscatedName("ao.r")
    public static class19 field789;

    @ObfuscatedName("o.i")
    public static byte[][][] field79;

    @ObfuscatedName("ao.da")
    public static int[] field791;

    @ObfuscatedName("ad.bi")
    public static class168 field801;

    @ObfuscatedName("au.cn")
    public static class143 field875;

    @ObfuscatedName("au.v")
    public static String field878;

    @ObfuscatedName("au.bf")
    public static FontMetrics field881;

    @ObfuscatedName("aa.po")
    public static short[] field883;

    @ObfuscatedName("aa.h")
    public static class167 field892;

    @ObfuscatedName("aa.c")
    public static class167 field908;

    @ObfuscatedName("o.mj")
    public static int field91;

    @ObfuscatedName("aa.jj")
    public static int field920;

    @ObfuscatedName("ai.h")
    public static class167 field923;

    @ObfuscatedName("ai.k")
    public static class167 field924;

    @ObfuscatedName("i.qp")
    public static Image field95;

    @ObfuscatedName("ai.ql")
    public static class133 field973;

    @ObfuscatedName("av.c")
    public static class167 field977;

    @ObfuscatedName("ar.h")
    public static class167 field985;

    @ObfuscatedName("ar.k")
    public static class167 field986;

    @ObfuscatedName("ar.c")
    public static class167 field992;

    @ObfuscatedName("aj.h(II)Lbe;")
    public static class53 method619(int arg0) {
        class53 var1 = (class53) class53.field1157.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1163.method2994(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1039(new class119(var2));
        }
        class53.field1157.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.h(Ljava/lang/CharSequence;Lhp;I)Ljava/lang/String;")
    public static String method716(CharSequence arg0, class212 arg1) {
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
        if (var8 < 1 || var8 > class164.method46(arg1)) {
            return null;
        }
        StringBuilder var9 = new StringBuilder(var8);
        for (int var10 = var2; var10 < var3; var10++) {
            char var11 = arg0.charAt(var10);
            boolean var12;
            if (Character.isISOControl(var11)) {
                var12 = false;
            } else {
                boolean var13 = var11 >= '0' && var11 <= '9' || var11 >= 'A' && var11 <= 'Z' || var11 >= 'a' && var11 <= 'z';
                if (var13) {
                    var12 = true;
                } else {
                    char[] var14 = class164.field2641;
                    int var15 = 0;
                    label84: while (true) {
                        if (var15 >= var14.length) {
                            char[] var17 = class164.field2639;
                            for (int var18 = 0; var18 < var17.length; var18++) {
                                char var19 = var17[var18];
                                if (var11 == var19) {
                                    var12 = true;
                                    break label84;
                                }
                            }
                            var12 = false;
                            break;
                        }
                        char var16 = var14[var15];
                        if (var11 == var16) {
                            var12 = true;
                            break;
                        }
                        var15++;
                    }
                }
            }
            if (var12) {
                char var20 = class164.method559(var11);
                if (var20 != 0) {
                    var9.append(var20);
                }
            }
        }
        if (var9.length() == 0) {
            return null;
        } else {
            return var9.toString();
        }
    }

    @ObfuscatedName("ap.h(Lfj;Lfj;III)Lhf;")
    public static class224 method903(class167 arg0, class167 arg1, int arg2, int arg3) {
        return class77.method1217(arg0, arg2, arg3) ? class77.method2970(arg1.method2994(arg2, arg3)) : null;
    }

    @ObfuscatedName("aj.h(II)Laa;")
    public static class40 method618(int arg0) {
        class40 var1 = (class40) class40.field885.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field908.method2994(9, arg0);
        class40 var3 = new class40();
        var3.field919 = arg0;
        if (var2 != null) {
            var3.method724(new class119(var2));
        }
        var3.method743();
        class40.field885.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("d.k(IIIIB)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3) {
        for (class24 var4 = (class24) class24.field607.method3558(); var4 != null; var4 = (class24) class24.field607.method3554()) {
            if (var4.field603 != -1 || var4.field615 != null) {
                int var5 = 0;
                if (arg1 > var4.field596) {
                    var5 += arg1 - var4.field596;
                } else if (arg1 < var4.field598) {
                    var5 += var4.field598 - arg1;
                }
                if (arg2 > var4.field601) {
                    var5 += arg2 - var4.field601;
                } else if (arg2 < var4.field599) {
                    var5 += var4.field599 - arg2;
                }
                if (var5 - 64 > var4.field616 || client.field516 == 0 || var4.field597 != arg0) {
                    if (var4.field604 != null) {
                        field198.method1093(var4.field604);
                        var4.field604 = null;
                    }
                    if (var4.field611 != null) {
                        field198.method1093(var4.field611);
                        var4.field611 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field516 * (var4.field616 - var5) / var4.field616;
                    if (var4.field604 != null) {
                        var4.field604.method1258(var6);
                    } else if (var4.field603 >= 0) {
                        class59 var7 = class59.method1199(field1977, var4.field603, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1194().method1229(field2273);
                            class65 var9 = class65.method1333(var8, 100, var6);
                            var9.method1257(-1);
                            field198.method1092(var9);
                            var4.field604 = var9;
                        }
                    }
                    if (var4.field611 != null) {
                        var4.field611.method1258(var6);
                        if (!var4.field611.method3647()) {
                            var4.field611 = null;
                        }
                    } else if (var4.field615 != null && (var4.field609 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field615.length);
                        class59 var11 = class59.method1199(field1977, var4.field615[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1194().method1229(field2273);
                            class65 var13 = class65.method1333(var12, 100, var6);
                            var13.method1257(0);
                            field198.method1092(var13);
                            var4.field611 = var13;
                            var4.field609 = var4.field605 + (int) (Math.random() * (double) (var4.field606 - var4.field605));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bl.h(Ljava/awt/Component;Lfj;Lfj;ZIB)V")
    public static void method1472(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!field740) {
            class32.field732 = arg4;
            class80.method1659();
            byte[] var5 = arg1.method3054("title.jpg", "");
            field711 = new class79(var5, arg0);
            field712 = field711.method1610();
            field750 = class77.method871(arg2, "logo", "");
            field726 = class77.method871(arg2, "titlebox", "");
            field710 = class77.method871(arg2, "titlebutton", "");
            field1164 = class77.method706(arg2, "runes", "");
            field2988 = class77.method706(arg2, "title_mute", "");
            field739 = class77.method871(arg2, "options_radio_buttons,0", "");
            field715 = class77.method871(arg2, "options_radio_buttons,2", "");
            field2725 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                field2725[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                field2725[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                field2725[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                field2725[var9 + 192] = 16777215;
            }
            field13 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                field13[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                field13[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                field13[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                field13[var13 + 192] = 16777215;
            }
            field1004 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                field1004[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                field1004[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                field1004[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                field1004[var17 + 192] = 16777215;
            }
            field707 = new int[256];
            field706 = new int[32768];
            field2697 = new int[32768];
            class32.method2206((class81) null);
            field724 = new int[32768];
            field725 = new int[32768];
            if (arg3) {
                class32.field736 = "";
                class32.field737 = "";
            }
            field2220 = 0;
            field1095 = "";
            class32.field721 = true;
            class32.field741 = false;
            if (field2046.field134) {
                class183.method3690(2);
            } else {
                class183.method2592(2, field24, "scape main", "", 255, false);
            }
            class171.method2578(false);
            field740 = true;
            class32.field708 = (field1604 - client.field448 * 765) / 2;
            class32.field718 = class32.field708 + 202;
            field711.method1615(class32.field708, 0);
            field712.method1615(class32.field708 + 382, 0);
            field750.method1706(class32.field708 + 382 - field750.field1410 / 2, 18);
        } else if (arg4 == 4) {
            class32.field732 = 4;
        }
    }

    @ObfuscatedName("et.h(B)Z")
    public static final boolean method2752() {
        class137 var0 = class137.field2087;
        synchronized (class137.field2087) {
            if (class137.field2093 == class137.field2091) {
                return false;
            } else {
                field2230 = class137.field2088[class137.field2091];
                field167 = class137.field2077[class137.field2091];
                class137.field2091 = class137.field2091 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("v.t(Ldf;II)V")
    public static void method567(class119 arg0, int arg1) {
        class210 var2 = new class210();
        var2.field3102 = arg0.method2291();
        var2.field3106 = arg0.method2296();
        var2.field3105 = new int[var2.field3102];
        var2.field3104 = new int[var2.field3102];
        var2.field3108 = new Field[var2.field3102];
        var2.field3103 = new int[var2.field3102];
        var2.field3101 = new Method[var2.field3102];
        var2.field3107 = new byte[var2.field3102][][];
        for (int var3 = 0; var3 < var2.field3102; var3++) {
            try {
                int var4 = arg0.method2291();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.method2299();
                    String var6 = arg0.method2299();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2296();
                    }
                    var2.field3105[var3] = var4;
                    var2.field3103[var3] = var7;
                    if (class211.method2881(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3108[var3] = class211.method2881(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.method2299();
                    String var9 = arg0.method2299();
                    int var10 = arg0.method2291();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2299();
                    }
                    String var13 = arg0.method2299();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.method2296();
                            var14[var15] = new byte[var16];
                            arg0.method2302(var14[var15], 0, var16);
                        }
                    }
                    var2.field3105[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = class211.method2881(var11[var18]);
                    }
                    Class var19 = class211.method2881(var13);
                    if (class211.method2881(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = class211.method2881(var8).getDeclaredMethods();
                    Method[] var21 = var20;
                    for (int var22 = 0; var22 < var21.length; var22++) {
                        Method var23 = var21[var22];
                        if (var23.getName().equals(var9)) {
                            Class[] var24 = var23.getParameterTypes();
                            if (var17.length == var24.length) {
                                boolean var25 = true;
                                for (int var26 = 0; var26 < var17.length; var26++) {
                                    if (var17[var26] != var24[var26]) {
                                        var25 = false;
                                        break;
                                    }
                                }
                                if (var25 && var19 == var23.getReturnType()) {
                                    var2.field3101[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field3107[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field3104[var3] = -1;
            } catch (SecurityException var33) {
                var2.field3104[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field3104[var3] = -3;
            } catch (Exception var35) {
                var2.field3104[var3] = -4;
            } catch (Throwable var36) {
                var2.field3104[var3] = -5;
            }
        }
        class211.field3109.method3597(var2);
    }

    @ObfuscatedName("as.g(IIIZIZI)V")
    public static void method882(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = field645[var6];
        field645[var6] = field645[arg1];
        field645[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = field645[var9];
            int var11 = class26.method579(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = class26.method579(var10, var8, arg4, arg5);
                    if (arg5) {
                        var12 = -var13;
                    } else {
                        var12 = var13;
                    }
                }
            } else if (arg3) {
                var12 = -var11;
            } else {
                var12 = var11;
            }
            if (var12 <= 0) {
                class26 var14 = field645[var9];
                field645[var9] = field645[var7];
                field645[var7++] = var14;
            }
        }
        field645[arg1] = field645[var7];
        field645[var7] = var8;
        method882(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method882(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("et.g(Ldg;IB)Z")
    public static boolean method2753(class122 arg0, int arg1) {
        int var2 = arg0.method2530(2);
        if (var2 == 0) {
            if (arg0.method2530(1) != 0) {
                method2753(arg0, arg1);
            }
            int var3 = arg0.method2530(6);
            int var4 = arg0.method2530(6);
            boolean var5 = arg0.method2530(1) == 1;
            if (var5) {
                class33.field764[++class33.field755 - 1] = arg1;
            }
            if (client.field404[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field404[arg1] = new class3();
            var6.field53 = arg1;
            if (class33.field770[arg1] != null) {
                var6.method25(class33.field770[arg1]);
            }
            var6.field825 = class33.field752[arg1];
            var6.field837 = class33.field762[arg1];
            int var7 = class33.field760[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field868[0] = class33.field756[arg1];
            var6.field52 = (byte) var8;
            var6.method15((var9 << 6) + var3 - field14, (var10 << 6) + var4 - field1436);
            var6.field58 = -1;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2530(2);
            int var12 = class33.field760[arg1];
            class33.field760[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2530(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = class33.field760[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            class33.field760[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2530(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = class33.field760[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            class33.field760[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("gx.w(II)V")
    public static final void method3358(int arg0) {
        short var1 = 256;
        class32.field714 += arg0 * 128;
        if (class32.field714 > field706.length) {
            class32.field714 -= field706.length;
            int var2 = (int) (Math.random() * 12.0D);
            class32.method2206(field1164[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = field724[var3 + var4] - field706[class32.field714 + var3 & field706.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            field724[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    field724[var9 + var10] = 255;
                } else {
                    field724[var9 + var10] = 0;
                }
            }
        }
        if (class32.field722 > 0) {
            class32.field722 -= arg0 * 4;
        }
        if (class32.field723 > 0) {
            class32.field723 -= arg0 * 4;
        }
        if (class32.field722 == 0 && class32.field723 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                class32.field722 = 1024;
            }
            if (var12 == 1) {
                class32.field723 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            class32.field720[var13] = class32.field720[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            class32.field720[var14] = (int) (Math.sin((double) class32.field713 / 14.0D) * 16.0D + Math.sin((double) class32.field713 / 15.0D) * 14.0D + Math.sin((double) class32.field713 / 16.0D) * 12.0D);
            class32.field713++;
        }
        class32.field727 += arg0 * 337541737;
        int var15 = ((client.field285 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class32.field727 * -1119942460; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            field724[(var18 << 7) + var17] = 192;
        }
        class32.field727 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += field724[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= field724[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    field725[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += field725[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= field725[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    field724[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dj.r(I)V")
    public static final void method2201() {
        short var0 = 256;
        if (class32.field722 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class32.field722 > 768) {
                    field707[var1] = class32.method152(field2725[var1], field13[var1], 1024 - class32.field722);
                } else if (class32.field722 > 256) {
                    field707[var1] = field13[var1];
                } else {
                    field707[var1] = class32.method152(field13[var1], field2725[var1], 256 - class32.field722);
                }
            }
        } else if (class32.field723 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class32.field723 > 768) {
                    field707[var2] = class32.method152(field2725[var2], field1004[var2], 1024 - class32.field723);
                } else if (class32.field723 > 256) {
                    field707[var2] = field1004[var2];
                } else {
                    field707[var2] = class32.method152(field1004[var2], field2725[var2], 256 - class32.field723);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                field707[var3] = field2725[var3];
            }
        }
        class80.method1655(class32.field708, 9, class32.field708 + 128, var0 + 7);
        field711.method1615(class32.field708, 0);
        class80.method1654();
        int var4 = 0;
        int var5 = class32.field708 + field211.field1382 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * class32.field720[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = field724[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = field707[var10];
                    int var14 = field211.field1377[var5];
                    field211.field1377[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += field211.field1382 + var8 - 128;
        }
        class80.method1655(class32.field708 + 765 - 128, 9, class32.field708 + 765, var0 + 7);
        field712.method1615(class32.field708 + 382, 0);
        class80.method1654();
        int var15 = 0;
        int var16 = class32.field708 + field211.field1382 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * class32.field720[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = field724[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = field707[var22];
                    int var26 = field211.field1377[var20];
                    field211.field1377[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = field211.field1382 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bg.ar(Lac;I)V")
    public static final void method1521(class34 arg0) {
        if (field2644.field859 >> 7 == client.field523 && field2644.field839 >> 7 == client.field492) {
            client.field523 = 0;
        }
        int var1 = class33.field754;
        int[] var2 = class33.field757;
        int var3 = var1;
        if (class34.field777 == arg0 || class34.field774 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field777 == arg0) {
                var5 = field2644;
                var6 = field2644.field53 << 14;
            } else if (class34.field774 == arg0) {
                var5 = client.field404[client.field548];
                var6 = client.field548 << 14;
            } else {
                var5 = client.field404[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field772 == arg0 && client.field548 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method17() && !var5.field51) {
                var5.field33 = false;
                if ((client.field278 && var1 > 50 || var1 > 200) && class34.field777 != arg0 && var5.field850 == var5.field817) {
                    var5.field33 = true;
                }
                int var7 = var5.field859 >> 7;
                int var8 = var5.field839 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field48 == null || client.field285 < var5.field49 || client.field285 >= var5.field40) {
                        if ((var5.field859 & 0x7F) == 64 && (var5.field839 & 0x7F) == 64) {
                            if (client.field481 == client.field381[var7][var8]) {
                                continue;
                            }
                            client.field381[var7][var8] = client.field481;
                        }
                        var5.field38 = client.method2209(var5.field859, var5.field839, field2983);
                        field1976.method1832(field2983, var5.field859, var5.field839, var5.field38, 60, var5, var5.field814, var6, var5.field815);
                    } else {
                        var5.field33 = false;
                        var5.field38 = client.method2209(var5.field859, var5.field839, field2983);
                        field1976.method1758(field2983, var5.field859, var5.field839, var5.field38, 60, var5, var5.field814, var6, var5.field45, var5.field46, var5.field47, var5.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ap(I)V")
    public static final void method715() {
        for (class30 var0 = (class30) client.field411.method3558(); var0 != null; var0 = (class30) client.field411.method3554()) {
            if (field2983 != var0.field683 || var0.field693) {
                var0.method3646();
            } else if (client.field285 >= var0.field690) {
                var0.method636(client.field397);
                if (var0.field693) {
                    var0.method3646();
                } else {
                    field1976.method1832(var0.field683, var0.field684, var0.field685, var0.field681, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bf.ae(IIIII)V")
    public static final void method1553(int arg0, int arg1, int arg2, int arg3) {
        if (client.field521 == 1) {
            field353[client.field277 / 100].method1574(client.field385 - 8, client.field386 - 8);
        }
        if (client.field521 == 2) {
            field353[client.field277 / 100 + 4].method1574(client.field385 - 8, client.field386 - 8);
        }
        client.method686();
    }

    @ObfuscatedName("av.bj(B)V")
    public static final void method815() {
        if (client.field321 == 211) {
            int var0 = client.field319.method2293();
            int var1 = client.field319.method2423();
            int var2 = (var1 >> 4 & 0x7) + field2634;
            int var3 = (var1 & 0x7) + field192;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class199 var4 = client.field408[field2983][var2][var3];
                if (var4 != null) {
                    for (class29 var5 = (class29) var4.method3558(); var5 != null; var5 = (class29) var4.method3554()) {
                        if ((var0 & 0x7FFF) == var5.field679) {
                            var5.method3646();
                            break;
                        }
                    }
                    if (var4.method3558() == null) {
                        client.field408[field2983][var2][var3] = null;
                    }
                    method3129(var2, var3);
                }
            }
        } else if (client.field321 == 160) {
            int var6 = client.field319.method2291();
            int var7 = (var6 >> 4 & 0x7) + field2634;
            int var8 = (var6 & 0x7) + field192;
            int var9 = client.field319.method2293();
            int var10 = client.field319.method2291();
            int var11 = client.field319.method2293();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var12 = var7 * 128 + 64;
                int var13 = var8 * 128 + 64;
                class30 var14 = new class30(var9, field2983, var12, var13, client.method2209(var12, var13, field2983) - var10, var11, client.field285);
                client.field411.method3585(var14);
            }
        } else if (client.field321 == 162) {
            int var15 = client.field319.method2291();
            int var16 = (var15 >> 4 & 0x7) + field2634;
            int var17 = (var15 & 0x7) + field192;
            int var18 = client.field319.method2293();
            int var19 = client.field319.method2293();
            int var20 = client.field319.method2293();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class199 var21 = client.field408[field2983][var16][var17];
                if (var21 != null) {
                    for (class29 var22 = (class29) var21.method3558(); var22 != null; var22 = (class29) var21.method3554()) {
                        if ((var18 & 0x7FFF) == var22.field679 && var22.field672 == var19) {
                            var22.field672 = var20;
                            break;
                        }
                    }
                    method3129(var16, var17);
                }
            }
        } else if (client.field321 == 231) {
            int var23 = client.field319.method2350();
            int var24 = (var23 >> 4 & 0x7) + field2634;
            int var25 = (var23 & 0x7) + field192;
            int var26 = client.field319.method2319();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = client.field445[var27];
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                client.method42(field2983, var24, var25, var29, -1, var27, var28, 0, -1);
            }
        } else {
            if (client.field321 == 69) {
                int var30 = client.field319.method2291();
                int var31 = (var30 >> 4 & 0x7) + field2634;
                int var32 = (var30 & 0x7) + field192;
                int var33 = client.field319.method2293();
                int var34 = client.field319.method2291();
                int var35 = var34 >> 4 & 0xF;
                int var36 = var34 & 0x7;
                int var37 = client.field319.method2291();
                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                    int var38 = var35 + 1;
                    if (field2644.field866[0] >= var31 - var38 && field2644.field866[0] <= var31 + var38 && field2644.field867[0] >= var32 - var38 && field2644.field867[0] <= var32 + var38 && client.field516 != 0 && var36 > 0 && client.field517 < 50) {
                        client.field518[client.field517] = var33;
                        client.field519[client.field517] = var36;
                        client.field520[client.field517] = var37;
                        client.field522[client.field517] = null;
                        client.field282[client.field517] = (var31 << 16) + (var32 << 8) + var35;
                        client.field517++;
                    }
                }
            }
            if (client.field321 == 224) {
                byte var39 = client.field319.method2320();
                int var40 = client.field319.method2327();
                int var41 = client.field319.method2350();
                int var42 = (var41 >> 4 & 0x7) + field2634;
                int var43 = (var41 & 0x7) + field192;
                byte var44 = client.field319.method2321();
                int var45 = client.field319.method2427();
                int var46 = client.field319.method2319();
                int var47 = var46 >> 2;
                int var48 = var46 & 0x3;
                int var49 = client.field445[var47];
                int var50 = client.field319.method2327();
                int var51 = client.field319.method2327();
                byte var52 = client.field319.method2381();
                byte var53 = client.field319.method2292();
                class3 var54;
                if (client.field399 == var50) {
                    var54 = field2644;
                } else {
                    var54 = client.field404[var50];
                }
                if (var54 != null) {
                    class41 var55 = class41.method2760(var40);
                    int var56;
                    int var57;
                    if (var48 == 1 || var48 == 3) {
                        var56 = var55.field939;
                        var57 = var55.field958;
                    } else {
                        var56 = var55.field958;
                        var57 = var55.field939;
                    }
                    int var58 = (var56 >> 1) + var42;
                    int var59 = (var56 + 1 >> 1) + var42;
                    int var60 = (var57 >> 1) + var43;
                    int var61 = (var57 + 1 >> 1) + var43;
                    int[][] var62 = class6.field85[field2983];
                    int var63 = var62[var58][var60] + var62[var59][var60] + var62[var58][var61] + var62[var59][var61] >> 2;
                    int var64 = (var42 << 7) + (var56 << 6);
                    int var65 = (var43 << 7) + (var57 << 6);
                    class105 var66 = var55.method764(var47, var48, var62, var64, var63, var65);
                    if (var66 != null) {
                        client.method42(field2983, var42, var43, var49, -1, 0, 0, var45 + 1, var51 + 1);
                        var54.field49 = client.field285 + var45;
                        var54.field40 = client.field285 + var51;
                        var54.field48 = var66;
                        var54.field41 = var42 * 128 + var56 * 64;
                        var54.field36 = var43 * 128 + var57 * 64;
                        var54.field42 = var63;
                        if (var53 > var39) {
                            byte var67 = var53;
                            var53 = var39;
                            var39 = var67;
                        }
                        if (var52 > var44) {
                            byte var68 = var52;
                            var52 = var44;
                            var44 = var68;
                        }
                        var54.field45 = var42 + var53;
                        var54.field47 = var39 + var42;
                        var54.field46 = var43 + var52;
                        var54.field44 = var43 + var44;
                    }
                }
            }
            if (client.field321 == 248) {
                int var69 = client.field319.method2291();
                int var70 = (var69 >> 4 & 0x7) + field2634;
                int var71 = (var69 & 0x7) + field192;
                int var72 = var70 + client.field319.method2292();
                int var73 = var71 + client.field319.method2292();
                int var74 = client.field319.method2439();
                int var75 = client.field319.method2293();
                int var76 = client.field319.method2291() * 4;
                int var77 = client.field319.method2291() * 4;
                int var78 = client.field319.method2293();
                int var79 = client.field319.method2293();
                int var80 = client.field319.method2291();
                int var81 = client.field319.method2291();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var75 != 65535) {
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    int var84 = var72 * 128 + 64;
                    int var85 = var73 * 128 + 64;
                    class7 var86 = new class7(var75, field2983, var82, var83, client.method2209(var82, var83, field2983) - var76, client.field285 + var78, client.field285 + var79, var80, var81, var74, var77);
                    var86.method94(var84, var85, client.method2209(var84, var85, field2983) - var77, client.field285 + var78);
                    client.field423.method3585(var86);
                }
            } else if (client.field321 == 149) {
                int var87 = client.field319.method2350();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = client.field445[var88];
                int var91 = client.field319.method2427();
                int var92 = client.field319.method2291();
                int var93 = (var92 >> 4 & 0x7) + field2634;
                int var94 = (var92 & 0x7) + field192;
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    client.method42(field2983, var93, var94, var90, var91, var88, var89, 0, -1);
                }
            } else if (client.field321 == 139) {
                int var95 = client.field319.method2293();
                int var96 = client.field319.method2291();
                int var97 = (var96 >> 4 & 0x7) + field2634;
                int var98 = (var96 & 0x7) + field192;
                int var99 = client.field319.method2326();
                if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                    class29 var100 = new class29();
                    var100.field679 = var95;
                    var100.field672 = var99;
                    if (client.field408[field2983][var97][var98] == null) {
                        client.field408[field2983][var97][var98] = new class199();
                    }
                    client.field408[field2983][var97][var98].method3585(var100);
                    method3129(var97, var98);
                }
            } else if (client.field321 == 174) {
                int var101 = client.field319.method2427();
                int var102 = client.field319.method2291();
                int var103 = (var102 >> 4 & 0x7) + field2634;
                int var104 = (var102 & 0x7) + field192;
                int var105 = client.field319.method2319();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = client.field445[var106];
                if (var103 >= 0 && var104 >= 0 && var103 < 103 && var104 < 103) {
                    if (var108 == 0) {
                        class87 var109 = field1976.method1834(field2983, var103, var104);
                        if (var109 != null) {
                            int var110 = var109.field1507 >> 14 & 0x7FFF;
                            if (var106 == 2) {
                                var109.field1509 = new class13(var110, 2, var107 + 4, field2983, var103, var104, var101, false, var109.field1509);
                                var109.field1506 = new class13(var110, 2, var107 + 1 & 0x3, field2983, var103, var104, var101, false, var109.field1506);
                            } else {
                                var109.field1509 = new class13(var110, var106, var107, field2983, var103, var104, var101, false, var109.field1509);
                            }
                        }
                    }
                    if (var108 == 1) {
                        class94 var111 = field1976.method1848(field2983, var103, var104);
                        if (var111 != null) {
                            int var112 = var111.field1587 >> 14 & 0x7FFF;
                            if (var106 == 4 || var106 == 5) {
                                var111.field1585 = new class13(var112, 4, var107, field2983, var103, var104, var101, false, var111.field1585);
                            } else if (var106 == 6) {
                                var111.field1585 = new class13(var112, 4, var107 + 4, field2983, var103, var104, var101, false, var111.field1585);
                            } else if (var106 == 7) {
                                var111.field1585 = new class13(var112, 4, (var107 + 2 & 0x3) + 4, field2983, var103, var104, var101, false, var111.field1585);
                            } else if (var106 == 8) {
                                var111.field1585 = new class13(var112, 4, var107 + 4, field2983, var103, var104, var101, false, var111.field1585);
                                var111.field1581 = new class13(var112, 4, (var107 + 2 & 0x3) + 4, field2983, var103, var104, var101, false, var111.field1581);
                            }
                        }
                    }
                    if (var108 == 2) {
                        class98 var113 = field1976.method1759(field2983, var103, var104);
                        if (var106 == 11) {
                            var106 = 10;
                        }
                        if (var113 != null) {
                            var113.field1635 = new class13(var113.field1643 >> 14 & 0x7FFF, var106, var107, field2983, var103, var104, var101, false, var113.field1635);
                        }
                    }
                    if (var108 == 3) {
                        class93 var114 = field1976.method1760(field2983, var103, var104);
                        if (var114 != null) {
                            var114.field1568 = new class13(var114.field1572 >> 14 & 0x7FFF, 22, var107, field2983, var103, var104, var101, false, var114.field1568);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ff.br(III)V")
    public static final void method3129(int arg0, int arg1) {
        class199 var2 = client.field408[field2983][arg0][arg1];
        if (var2 == null) {
            field1976.method1804(field2983, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3558(); var6 != null; var6 = (class29) var2.method3554()) {
            class52 var7 = class52.method971(var6.field679);
            long var8 = (long) var7.field1125;
            if (var7.field1121 == 1) {
                var8 = (long) (var6.field672 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            field1976.method1804(field2983, arg0, arg1);
            return;
        }
        var2.method3577(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3558(); var12 != null; var12 = (class29) var2.method3554()) {
            if (var5.field679 != var12.field679) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field679 != var12.field679 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        field1976.method1742(field2983, arg0, arg1, client.method2209(arg0 * 128 + 64, arg1 * 128 + 64, field2983), var5, var13, var10, var11);
    }

    @ObfuscatedName("do.bl(IS)V")
    public static final void method2583(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = client.field418[arg0];
        int var2 = client.field419[arg0];
        int var3 = client.field420[arg0];
        int var4 = client.field344[arg0];
        String var5 = client.field396[arg0];
        String var6 = client.field281[arg0];
        client.method1978(var1, var2, var3, var4, var5, var6, class140.field2123, class140.field2117);
    }

    @ObfuscatedName("ao.dp(Lfo;I)V")
    public static final void method699(class173 arg0) {
        int var1 = arg0.field2834;
        if (var1 == 324) {
            if (client.field283 == -1) {
                client.field283 = arg0.field2774;
                client.field539 = arg0.field2775;
            }
            if (client.field402.field2900) {
                arg0.field2774 = client.field283;
            } else {
                arg0.field2774 = client.field539;
            }
        } else if (var1 == 325) {
            if (client.field283 == -1) {
                client.field283 = arg0.field2774;
                client.field539 = arg0.field2775;
            }
            if (client.field402.field2900) {
                arg0.field2774 = client.field539;
            } else {
                arg0.field2774 = client.field283;
            }
        } else if (var1 == 327) {
            arg0.field2840 = 150;
            arg0.field2791 = (int) (Math.sin((double) client.field285 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2821 = 5;
            arg0.field2835 = 0;
        } else if (var1 == 328) {
            arg0.field2840 = 150;
            arg0.field2791 = (int) (Math.sin((double) client.field285 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2821 = 5;
            arg0.field2835 = 1;
        }
    }

    @ObfuscatedName("am.dv(Lt;ZI)V")
    public static final void method691(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field3096;
        arg0.method3646();
        if (arg1) {
            class173.method104(var2);
        }
        for (class201 var4 = (class201) client.field477.method3520(); var4 != null; var4 = (class201) client.field477.method3533()) {
            if ((long) var2 == (var4.field3096 >> 48 & 0xFFFFL)) {
                var4.method3646();
            }
        }
        class173 var5 = class173.method708(var3);
        if (var5 != null) {
            client.method643(var5);
        }
        client.method2717();
        if (client.field284 != -1) {
            client.method2084(client.field284, 1);
        }
    }
}
