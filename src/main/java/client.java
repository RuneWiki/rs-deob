import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class248 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lvi;")
    public static class240[] field1989 = new class240[6];

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[[B")
    public static byte[][] field1987 = new byte[1000][];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field1994;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 4)
    private final void method994(int arg0, int arg1) {
        class340.field5285.field1504 = arg1;
        class43.field607 = null;
        class265.field4122 = null;
        class340.field5285.field1503++;
        field1974++;
        class343.field5317 = 0;
        if (arg0 != -3194) {
            this.method1004(125);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 22)
    public static void method995(int arg0) {
        field1989 = null;
        field1987 = (byte[][]) null;
        if (arg0 != 0) {
            method1002((class161) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 37)
    public final void init() {
        field1985++;
        if (!this.method1699((byte) 126)) {
            return;
        }
        class261.field4020 = Integer.parseInt(this.getParameter("worldid"));
        class312.field4837 = Integer.parseInt(this.getParameter("modewhere"));
        if (class312.field4837 < 0 || class312.field4837 > 1) {
            class312.field4837 = 0;
        }
        class120.field1855 = Integer.parseInt(this.getParameter("modewhat"));
        if (class120.field1855 < 0 || class120.field1855 > 2) {
            class120.field1855 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class174.field2794 = true;
        } else {
            class174.field2794 = false;
        }
        try {
            class81.field1197 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class81.field1197 = 0;
        }
        class336.method2347(class81.field1197, 17839);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class209.field3202 = true;
        } else {
            class209.field3202 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class99.field1427 = true;
        } else {
            class99.field1427 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class248.field3754 = 1;
        } else {
            class248.field3754 = 0;
        }
        try {
            class76.field1109 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class76.field1109 = 0;
        }
        class160.field2420 = this.getParameter("settings");
        if (class160.field2420 == null) {
            class160.field2420 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class25.field288 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class25.field288 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class237.field3595 = true;
        } else {
            class237.field3595 = false;
        }
        class304.field4654 = this;
        this.method1690(765, 503, 1543, 3, class120.field1855 + 32);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 122)
    public final void method996(boolean arg0) {
        class298.method2053((byte) -50);
        class154.field2333 = new class144();
        field1977++;
        class340.field5285 = new class102();
        if (class120.field1855 != 0) {
            class59.field785 = new byte[50][];
        }
        class184.method1365(arg0, class330.field5074);
        if (class312.field4837 == 0) {
            class203.field3114 = this.getCodeBase().getHost();
            class320.field4954 = 443;
            class280.field4347 = 43594;
        } else if (class312.field4837 == 1) {
            class203.field3114 = this.getCodeBase().getHost();
            class280.field4347 = class261.field4020 + 40000;
            class320.field4954 = class261.field4020 + 50000;
        } else if (class312.field4837 == 2) {
            class320.field4954 = class261.field4020 + 50000;
            class203.field3114 = "127.0.0.1";
            class280.field4347 = class261.field4020 + 40000;
        }
        class216.field3318 = class320.field4954;
        if (class248.field3754 == 1) {
            class122.field1870 = class300.field4620;
            class230.field3501 = class318.field4923;
            class207.field3168 = class255.field3910;
            class179.field2840 = 16777215;
            class179.field2839 = 0;
            class1.field1 = true;
            class202.field3107 = class131.field2009;
        } else {
            class207.field3168 = class48.field659;
            class230.field3501 = class290.field4467;
            class122.field1870 = class129.field1973;
            class202.field3107 = class290.field4469;
        }
        class273.field4263 = class170.field2758 = class323.field4983 = class12.field152 = new short[256];
        class75.field1092 = class280.field4347;
        if (class6.field87 == 3 && class312.field4837 != 2) {
            class224.field3424 = class261.field4020;
        }
        class340.field5286 = class280.field4347;
        class62.field829 = class75.field1092;
        class224.field3427 = class203.field3114;
        class268.method1879(27784);
        class162.method1218(class102.field1480, (byte) -115);
        class170.method1284(class102.field1480, 10151);
        class38.field542 = class293.method2026(25);
        if (class38.field542 != null) {
            class38.field542.method1539((byte) -115, class102.field1480);
        }
        class343.field5318 = class6.field87;
        try {
            if (class330.field5074.field100 != null) {
                class205.field3140 = new class277(class330.field5074.field100, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class177.field2829[var2] = new class277(class330.field5074.field94[var2], 6000, 0);
                }
                class8.field129 = new class277(class330.field5074.field96, 6000, 0);
                class251.field3801 = new class48(255, class205.field3140, class8.field129, 500000);
                class27.field301 = new class277(class330.field5074.field86, 24, 0);
                class330.field5074.field94 = null;
                class330.field5074.field100 = null;
                class330.field5074.field86 = null;
                class330.field5074.field96 = null;
            }
        } catch (IOException var4) {
            class205.field3140 = null;
            class8.field129 = null;
            class251.field3801 = null;
            class27.field301 = null;
        }
        class214.field3294 = class43.field613;
        if (class312.field4837 != 0) {
            class262.field4045 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 233)
    private final void method997(byte[] arg0, int arg1) {
        field1980++;
        class254 var3 = new class254(arg0);
        while (true) {
            int var4 = var3.method1774((byte) 10);
            if (var4 == 0) {
                if (arg1 != 14252) {
                    method995(-16);
                }
                return;
            }
            if (var4 == 1) {
                int[] var5 = class149.field2261 = new int[6];
                var5[0] = var3.method1755(false);
                var5[1] = var3.method1755(false);
                var5[2] = var3.method1755(false);
                var5[3] = var3.method1755(false);
                var5[4] = var3.method1755(false);
                var5[5] = var3.method1755(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 273)
    private final void method998(byte arg0) {
        field1993++;
        if (!class7.field112) {
            label249: while (true) {
                do {
                    if (!class251.method1722((byte) 107)) {
                        break label249;
                    }
                } while (class280.field4356 != 's' && class280.field4356 != 'S');
                class7.field112 = true;
            }
        }
        if (class170.field2753 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class105.method789((byte) 55);
            if (class231.field3526 == 0L) {
                class231.field3526 = var28;
            }
            if (var27 > 16384 && var28 - class231.field3526 < 5000L) {
                if ((var28 - class83.field1224) > 1000L) {
                    System.gc();
                    class83.field1224 = var28;
                }
                class327.field5056 = class62.field825;
                class167.field2710 = 5;
            } else {
                class327.field5056 = class331.field5105;
                class170.field2753 = 10;
                class167.field2710 = 5;
            }
        } else if (class170.field2753 == 10) {
            class315.method2161(4, 104, 104);
            for (int var25 = 0; var25 < 4; var25++) {
                class91.field1323[var25] = new class345(104, 104);
            }
            class327.field5056 = class83.field1216;
            class170.field2753 = 30;
            class167.field2710 = 10;
        } else if (class170.field2753 == 30) {
            if (class78.field1139 == null) {
                class78.field1139 = new class212(class340.field5285, class154.field2333);
            }
            if (class78.field1139.method1518(-126)) {
                class210.field3224 = class332.method2323(false, true, (byte) 53, true, 0);
                class267.field4155 = class332.method2323(false, true, (byte) 53, true, 1);
                class251.field3799 = class332.method2323(true, true, (byte) 53, false, 2);
                class273.field4264 = class332.method2323(false, true, (byte) 53, true, 3);
                class196.field3022 = class332.method2323(false, true, (byte) 53, true, 4);
                class153.field2329 = class332.method2323(true, true, (byte) 53, true, 5);
                class222.field3389 = class332.method2323(true, false, (byte) 53, true, 6);
                class122.field1867 = class332.method2323(false, true, (byte) 53, true, 7);
                class264.field4087 = class332.method2323(false, true, (byte) 53, true, 8);
                class292.field4506 = class332.method2323(false, true, (byte) 53, true, 9);
                class1.field19 = class332.method2323(false, true, (byte) 53, true, 10);
                class122.field1872 = class332.method2323(false, true, (byte) 53, true, 11);
                class245.field3711 = class332.method2323(false, true, (byte) 53, true, 12);
                class250.field3766 = class332.method2323(false, true, (byte) 53, true, 13);
                class139.field2090 = class332.method2323(false, false, (byte) 53, true, 14);
                class299.field4596 = class332.method2323(false, true, (byte) 53, true, 15);
                class56.field739 = class332.method2323(false, true, (byte) 53, true, 16);
                class268.field4174 = class332.method2323(false, true, (byte) 53, true, 17);
                class1.field7 = class332.method2323(false, true, (byte) 53, true, 18);
                class163.field2645 = class332.method2323(false, true, (byte) 53, true, 19);
                class149.field2256 = class332.method2323(false, true, (byte) 53, true, 20);
                class10.field143 = class332.method2323(false, true, (byte) 53, true, 21);
                class138.field2075 = class332.method2323(false, true, (byte) 53, true, 22);
                class172.field2773 = class332.method2323(true, true, (byte) 53, true, 23);
                class213.field3269 = class332.method2323(false, true, (byte) 53, true, 24);
                class232.field3536 = class332.method2323(false, true, (byte) 53, true, 25);
                class171.field2760 = class332.method2323(true, true, (byte) 53, true, 26);
                class76.field1115 = class332.method2323(false, true, (byte) 53, true, 27);
                class64.field877 = class332.method2323(true, true, (byte) 53, true, 28);
                class170.field2753 = 40;
                class327.field5056 = class205.field3151;
                class167.field2710 = 15;
            } else {
                class327.field5056 = class60.field797;
                class167.field2710 = 12;
            }
        } else if (class170.field2753 == 40) {
            int var23 = 0;
            for (int var24 = 0; var24 < 29; var24++) {
                var23 += class138.field2078[var24].method2014(-4213) * class15.field197[var24] / 100;
            }
            if (var23 == 100) {
                class167.field2710 = 20;
                class327.field5056 = class32.field408;
                class2.method12(class264.field4087, true);
                class313.method2138(class264.field4087, (byte) 57);
                class129.method991(class264.field4087, -119);
                class170.field2753 = 41;
            } else {
                class167.field2710 = 20;
                if (var23 != 0) {
                    class327.field5056 = class273.field4256 + var23 + "%";
                }
            }
        } else if (class170.field2753 == 41) {
            if (class64.field877.method706((byte) 74)) {
                this.method997(class64.field877.method715((byte) 45, 1), 14252);
                class167.field2710 = 25;
                class327.field5056 = class153.field2326;
                class170.field2753 = 45;
            } else {
                class327.field5056 = class206.field3165 + class64.field877.method717(true) + "%";
                class167.field2710 = 25;
            }
        } else if (class170.field2753 == 45) {
            class47.method358(class318.field4915, 22050, 48000, 2);
            class263.field4054 = new class64();
            class263.field4054.method457(128, (byte) -60, 9);
            class250.field3778 = class132.method1026((byte) -92, 0, class330.field5074, class102.field1480, 22050);
            class250.field3778.method2297((byte) -103, class263.field4054);
            class52.method387(class263.field4054, class196.field3022, true, class139.field2090, class299.field4596);
            class234.field3567 = class132.method1026((byte) -92, 1, class330.field5074, class102.field1480, 2048);
            class322.field4961 = new class19();
            class234.field3567.method2297((byte) 94, class322.field4961);
            class245.field3712 = new class153(22050, class260.field4009);
            class302.field4630 = class222.field3389.method690((byte) -126, "scape main");
            class167.field2710 = 30;
            class170.field2753 = 50;
            class327.field5056 = class102.field1473;
        } else if (class170.field2753 == 50) {
            int var21 = class3.method16(class264.field4087, class250.field3766, -27834);
            int var22 = class227.method1613(6);
            if (var21 >= var22) {
                class167.field2710 = 35;
                class327.field5056 = class307.field4790;
                class170.field2753 = 60;
            } else {
                class167.field2710 = 35;
                class327.field5056 = class276.field4287 + var21 * 100 / var22 + "%";
            }
        } else if (class170.field2753 == 60) {
            int var19 = class184.method1366(2, class264.field4087);
            int var20 = class47.method359(-103);
            if (var19 >= var20) {
                class170.field2753 = 65;
                class167.field2710 = 40;
                class327.field5056 = class61.field808;
            } else {
                class167.field2710 = 40;
                class327.field5056 = class62.field830 + var19 * 100 / var20 + "%";
            }
        } else if (arg0 >= 84) {
            if (class170.field2753 == 65) {
                class96.method722(class264.field4087, class250.field3766, (byte) -125);
                class327.field5056 = class320.field4959;
                class167.field2710 = 45;
                class101.method758(126, 5);
                class170.field2753 = 70;
            } else if (class170.field2753 == 70) {
                class251.field3799.method706((byte) 75);
                byte var2 = 0;
                int var3 = var2 + class251.field3799.method717(true);
                class56.field739.method706((byte) 76);
                int var4 = var3 + class56.field739.method717(true);
                class268.field4174.method706((byte) 93);
                int var5 = var4 + class268.field4174.method717(true);
                class1.field7.method706((byte) 54);
                int var6 = var5 + class1.field7.method717(true);
                class163.field2645.method706((byte) 61);
                int var7 = var6 + class163.field2645.method717(true);
                class149.field2256.method706((byte) 88);
                int var8 = var7 + class149.field2256.method717(true);
                class10.field143.method706((byte) 80);
                int var9 = var8 + class10.field143.method717(true);
                class138.field2075.method706((byte) 57);
                int var10 = var9 + class138.field2075.method717(true);
                class213.field3269.method706((byte) 88);
                int var11 = var10 + class213.field3269.method717(true);
                class232.field3536.method706((byte) 120);
                int var12 = var11 + class232.field3536.method717(true);
                class76.field1115.method706((byte) 88);
                int var13 = var12 + class76.field1115.method717(true);
                if (var13 < 1100) {
                    class327.field5056 = class63.field853 + var13 / 11 + "%";
                    class167.field2710 = 50;
                } else {
                    class65.method471((byte) -89, class251.field3799);
                    class36.method278((byte) -47, class251.field3799);
                    class320.method2219((byte) -128, class251.field3799);
                    class41.method313((byte) 91, class122.field1867, class251.field3799);
                    class292.method2018(true, 0, class122.field1867, class56.field739);
                    class78.method611((byte) -110, class122.field1867, class1.field7);
                    class136.method1037(true, class84.field1230, class163.field2645, -43, class122.field1867);
                    class85.method639((byte) 50, class251.field3799);
                    class56.method399(class210.field3224, -1, class267.field4155, class149.field2256);
                    class165.method1254((byte) -84, class251.field3799);
                    class174.method1307(class10.field143, 16383, class122.field1867);
                    class130.method1015(class138.field2075, 0);
                    class263.method1848(true, class251.field3799);
                    class72.method509((byte) 118, class250.field3766, class273.field4264, class122.field1867, class264.field4087);
                    class255.method1796((byte) 69, class251.field3799);
                    class270.method1896((byte) -112, class268.field4174);
                    class8.method82(new class198(), class232.field3536, (byte) -95, class213.field3269);
                    class345.method2393(class232.field3536, (byte) -128, class213.field3269);
                    class242.method1675(class251.field3799, 2);
                    class324.method2248(class251.field3799, 0);
                    class211.method1507(9, class251.field3799);
                    class231.method1626(class251.field3799, class264.field4087, 8);
                    class160.method1195(class251.field3799, class264.field4087, true);
                    class167.field2710 = 50;
                    class327.field5056 = class144.field2207;
                    class67.method480(-107);
                    class170.field2753 = 80;
                }
            } else if (class170.field2753 == 80) {
                int var17 = class30.method231(class264.field4087, -5225);
                int var18 = class210.method1505((byte) -19);
                if (var17 < var18) {
                    class167.field2710 = 60;
                    class327.field5056 = class323.field4996 + var17 * 100 / var18 + "%";
                } else {
                    class148.method1115(0, class264.field4087);
                    class327.field5056 = class278.field4319;
                    class170.field2753 = 90;
                    class167.field2710 = 60;
                }
            } else if (class170.field2753 == 90) {
                if (class171.field2760.method706((byte) 63)) {
                    class265 var16 = new class265(class292.field4506, class171.field2760, class264.field4087, 20, !class255.field3884);
                    class164.method1243(var16);
                    if (class102.field1482 == 1) {
                        class164.method1246(0.9F);
                    }
                    if (class102.field1482 == 2) {
                        class164.method1246(0.8F);
                    }
                    if (class102.field1482 == 3) {
                        class164.method1246(0.7F);
                    }
                    if (class102.field1482 == 4) {
                        class164.method1246(0.6F);
                    }
                    class170.field2753 = 100;
                    class167.field2710 = 70;
                    class327.field5056 = class51.field690;
                } else {
                    class327.field5056 = class16.field204 + class171.field2760.method717(true) + "%";
                    class167.field2710 = 70;
                }
            } else if (class170.field2753 == 100) {
                if (class162.method1221(class264.field4087, 29243)) {
                    class170.field2753 = 110;
                }
            } else if (class170.field2753 == 110) {
                class120.field1851 = new class259();
                class330.field5074.method57(class120.field1851, (byte) 9, 10);
                class167.field2710 = 75;
                class327.field5056 = class300.field4624;
                class170.field2753 = 120;
            } else if (class170.field2753 == 120) {
                if (class1.field19.method702("", "huffman", -10602)) {
                    class82 var15 = new class82(class1.field19.method711("huffman", 8, ""));
                    class341.method2368(var15, (byte) -62);
                    class327.field5056 = class191.field2987;
                    class167.field2710 = 80;
                    class170.field2753 = 130;
                } else {
                    class327.field5056 = class228.field3471 + "0%";
                    class167.field2710 = 80;
                }
            } else if (class170.field2753 == 130) {
                if (!class273.field4264.method706((byte) 51)) {
                    class327.field5056 = class21.field243 + class273.field4264.method717(true) * 3 / 4 + "%";
                    class167.field2710 = 85;
                } else if (!class245.field3711.method706((byte) 100)) {
                    class327.field5056 = class21.field243 + (class245.field3711.method717(true) / 10 + 75) + "%";
                    class167.field2710 = 85;
                } else if (!class250.field3766.method706((byte) 109)) {
                    class327.field5056 = class21.field243 + (class250.field3766.method717(true) / 20 + 85) + "%";
                    class167.field2710 = 85;
                } else if (class172.field2773.method686("details", (byte) 26)) {
                    class318.method2211(class172.field2773, 0, class43.field618);
                    class221.method1571(class122.field1867);
                    class170.field2753 = 135;
                    class327.field5056 = class169.field2737;
                    class167.field2710 = 95;
                } else {
                    class327.field5056 = class21.field243 + (class172.field2773.method704("details", (byte) 98) / 10 + 90) + "%";
                    class167.field2710 = 85;
                }
            } else if (class170.field2753 == 135) {
                int var14 = class109.method829(-126);
                if (var14 == -1) {
                    class167.field2710 = 95;
                    class327.field5056 = class243.field3692;
                } else if (var14 == 7 || var14 == 9) {
                    this.method1698(-10083, "worldlistfull");
                    class101.method758(127, 1000);
                } else if (class132.field2012) {
                    class327.field5056 = class28.field317;
                    class167.field2710 = 96;
                    class170.field2753 = 140;
                } else {
                    this.method1698(-10083, "worldlistio_" + var14);
                    class101.method758(123, 1000);
                }
            } else if (class170.field2753 == 140) {
                class217.field3323 = class273.field4264.method690((byte) -126, "loginscreen");
                class153.field2329.method700((byte) 83, false, true);
                class222.field3389.method700((byte) 96, true, true);
                class264.field4087.method700((byte) -93, true, true);
                class250.field3766.method700((byte) 120, true, true);
                class1.field19.method700((byte) -25, true, true);
                class273.field4264.method700((byte) -113, true, true);
                class298.field4584 = true;
                class170.field2753 = 150;
                class167.field2710 = 97;
                class327.field5056 = class16.field206;
            } else if (class170.field2753 == 150) {
                class117.method893();
                if (class7.field112) {
                    class245.field3705 = 0;
                    class248.field3745 = 0;
                    class142.field2190 = 0;
                    class216.field3321 = 0;
                }
                class7.field112 = true;
                class110.method840(-95, class330.field5074);
                class181.method1356(-1, class216.field3321, -88, false, -1);
                class167.field2710 = 100;
                class170.field2753 = 160;
                class327.field5056 = class153.field2328;
            } else if (class170.field2753 == 160) {
                class270.method1889(-1206115993, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 805)
    public static final void method999(boolean arg0) {
        field1992++;
        if (!arg0) {
            method1010(103, (byte) 110);
        }
        if (class59.field787 == 5) {
            class59.field787 = 6;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 821)
    private final void method1000(int arg0) {
        field1990++;
        boolean var2 = class340.field5285.method771(-126);
        if (!var2) {
            this.method1005((byte) 124);
        }
        if (arg0 >= -119) {
            this.method997((byte[]) null, 119);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 837)
    public static final void method1001(int arg0) {
        field1976++;
        class222.method1582(false);
        class1.method4(74);
        class159.method1192((byte) 94);
        class278.method1929(-17);
        class283.method1956((byte) 109);
        class251.method1720(-66);
        class129.method987((byte) 47);
        int var1 = -30 % ((-arg0 - 76) / 41);
        class204.method1473(true);
        class69.method489(-1);
        class214.method1535((byte) 113);
        class308.method2111((byte) -77);
        class191.method1406(93);
        class240.method1666((byte) -61);
        class292.method2015((byte) 48);
        class82.method633(-1);
        class341.method2370(2047);
        class177.method1332(2133);
        class283.method1955(false);
        class103.method782((byte) -4);
        class118.method903(false);
        class299.field4604.method752(false);
        class235.field3587.method752(false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmn;)Z", line = 871)
    public static final boolean method1002(class161 arg0) {
        if (class335.field5216) {
            if (method1012(arg0).field54 != 0) {
                return false;
            }
            if (arg0.field2590 == 0) {
                return false;
            }
        }
        return arg0.field2557;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lal;", line = 887)
    public static final class41 method1003(int arg0, int arg1) {
        class41 var2 = (class41) class201.field3058.method730((long) arg1, (byte) 90);
        field1975++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == -3) {
            byte[] var3 = class214.field3297.method696(arg1, (byte) 96, 26);
            class41 var4 = new class41();
            if (var3 != null) {
                var4.method311(new class254(var3), -1);
            }
            class201.field3058.method734((byte) -14, (long) arg1, var4);
            return var4;
        } else {
            return (class41) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 910)
    public final void method1004(int arg0) {
        field1984++;
        method995(0);
        class34.method264(-7059);
        class262.method1845((byte) -101);
        class25.method195((byte) 92);
        class222.method1579(33);
        class298.method2052(true);
        class162.method1217(false);
        class331.method2313(false);
        class248.method1694(-96);
        class73.method527();
        class333.method2333(65535);
        class218.method1556((byte) 127);
        class259.method1827(true);
        class279.method1931(-36);
        class254.method1789((byte) -119);
        class237.method1652(0);
        class102.method765(108);
        class144.method1097(2003246702);
        class212.method1519(true);
        class292.method2010(false);
        class95.method705((byte) 123);
        class277.method1920(true);
        class48.method367((byte) -21);
        class99.method746(true);
        class76.method596((byte) -95);
        class151.method1142(7);
        class345.method2387((byte) 41);
        class161.method1200((byte) 53);
        class134.method1033((byte) -74);
        class270.method1894(28215);
        class281.method1953(arg0 ^ 0x4C);
        class250.method1712(false);
        class220.method1566(127);
        class240.method1669((byte) 107);
        class64.method464(2);
        class330.method2296(-28);
        class153.method1152(116);
        class295.method2047((byte) 29);
        class28.method209(true);
        class305.method2097((byte) -48);
        class79.method613(true);
        class32.method244(true);
        class160.method1194((byte) -123);
        class332.method2322(-1674879984);
        class242.method1677(true);
        class4.method30((byte) -127);
        class5.method42(32);
        class257.method1806((byte) -86);
        class137.method1039(-777972670);
        class10.method91(-83);
        class318.method2209((byte) 68);
        class133.method1030(false);
        class54.method392((byte) -36);
        class15.method117(arg0 ^ 0x4);
        class16.method120(arg0 ^ 0x0);
        class132.method1023(arg0 + 126);
        class3.method21((byte) 50);
        class12.method95(-126);
        class328.method2290(false);
        class20.method160();
        class191.method1407(127);
        class231.method1627(arg0 ^ 0x4C1D);
        class243.method1679(-1344);
        class302.method2077((byte) 60);
        class178.method1334(7);
        class179.method1338();
        class120.method910((byte) 70);
        class128.method961();
        class214.method1530(0);
        class140.method1072();
        class108.method825(arg0 + 28845);
        class113.method859();
        class168.method1276(89);
        class204.method1471((byte) -111);
        class323.method2246((byte) -86);
        class80.method618();
        class124.method921();
        class314.method2147((byte) -68);
        class202.method1465((byte) -109);
        class327.method2287((byte) -97);
        class326.method2272();
        class238.method1662(4794);
        class210.method1504((byte) -3);
        class22.method174();
        class193.method1414((byte) -44);
        class303.method2080(true);
        class136.method1036((byte) 41);
        class310.method2126();
        class315.method2149();
        class255.method1792(0);
        class273.method1905(0);
        class283.method1961(6);
        class205.method1479((byte) -32);
        class307.method2106((byte) 100);
        class287.method1982();
        class229.method1617(true);
        class51.method380(arg0 ^ 0x1B58);
        class21.method172((byte) 98);
        class98.method740(-15168);
        class299.method2059(-109);
        class177.method1331((byte) 116);
        class129.method985((byte) -20);
        class41.method315((byte) -120);
        class159.method1191(arg0 + 106);
        class122.method916(false);
        class258.method1825((byte) 107);
        class38.method289(false);
        class207.method1494(arg0 ^ 0x4);
        class211.method1509((byte) 120);
        class221.method1574();
        class39.method297(-14665);
        class320.method2224(arg0 - 28097);
        class223.method1590(-76);
        class198.method1442(arg0);
        class1.method2(102);
        class189.method1398(false);
        class107.method801();
        class322.method2233(-2731);
        class206.method1486(false);
        class209.method1498(29233);
        class219.method1563(true);
        class265.method1865(1);
        class181.method1353(-3748);
        class67.method478((byte) 100);
        class308.method2109((byte) -119);
        class344.method2380();
        class294.method2034((byte) -92);
        class164.method1233();
        class82.method631((byte) -20);
        class84.method637(85);
        class276.method1916(-1);
        class163.method1222(arg0 ^ 0xFFFFCA3A);
        class309.method2119(0);
        class117.method894();
        class61.method425(1);
        class256.method1804();
        class203.method1467((byte) 12);
        class224.method1596(122);
        class336.method2346(0);
        class296.method2049(arg0 - 8483);
        class110.method836(true);
        class58.method410();
        class228.method1615(arg0 ^ 0xFFFFFE53);
        class339.method2360(false);
        class35.method270(31009);
        class158.method1185(-22433);
        class341.method2369(-86);
        class91.method661(91);
        class135.method1034(false);
        class271.method1900();
        class234.method1639(true);
        class312.method2136((byte) 35);
        class40.method308(-121);
        class104.method788();
        class125.method924();
        class116.method890();
        class171.method1289(59);
        class233.method1633(-8250);
        class186.method1382();
        class175.method1310();
        class150.method1128();
        class14.method104(112);
        class311.method2132(125);
        class182.method1357(128);
        class300.method2064(true);
        class188.method1387(-117);
        class130.method1016(arg0 ^ 0xFFFFFFA0);
        class239.method1663((byte) 123);
        class176.method1327((byte) 45);
        class172.method1298((byte) 99);
        class185.method1370();
        class272.method1901((byte) -118);
        class2.method14(0);
        class201.method1457(arg0 ^ 0x0);
        class141.method1081(1);
        class75.method594(-15553);
        class174.method1301((byte) -121);
        class65.method474((byte) 111);
        class264.method1856(arg0 ^ 0x2);
        class71.method505(false);
        class293.method2024(arg0 + 128);
        class280.method1940(-29);
        class152.method1149(-93);
        class225.method1600(0);
        class187.method1385(false);
        class319.method2218(4992);
        class324.method2249((byte) 59);
        class197.method1438(-1648280255);
        class166.method1263(arg0 - 93);
        class156.method1176();
        class90.method657(0);
        class286.method1970(arg0 + 32);
        class97.method725((byte) -115);
        class217.method1551(-48);
        class338.method2358(-124);
        class200.method1448((byte) 78);
        class306.method2101();
        class9.method84();
        class78.method609((byte) -97);
        class173.method1300(0);
        class121.method915(16);
        class36.method274(0);
        class127.method950();
        class88.method648();
        class96.method721((byte) -46);
        class63.method432((byte) 92);
        class252.method1725();
        class138.method1044(1);
        class155.method1172();
        class337.method2351();
        class304.method2081((byte) -127);
        class115.method883((byte) -126);
        class335.method2338((byte) -106);
        class148.method1116((byte) 55);
        class8.method76((byte) -36);
        class72.method508(-1);
        class216.method1548(0);
        class165.method1255((byte) -28);
        class169.method1278((byte) 92);
        class37.method282(arg0 ^ 0x0);
        class85.method640(-26498);
        class111.method848((byte) -58);
        class267.method1871((byte) 119);
        class291.method2009(96);
        class263.method1846(-110);
        class62.method428(true);
        class60.method418(0);
        class13.method101((byte) 36);
        class149.method1120(89);
        class192.method1412(arg0 - 83);
        class27.method204((byte) -74);
        class230.method1621(11853);
        class183.method1361((byte) 114);
        class29.method225(arg0 - 70);
        class139.method1047(2);
        class226.method1606(113);
        class260.method1831(11860737);
        class190.method1404(arg0 + 585);
        class167.method1270(0);
        class180.method1348(-19357);
        class31.method234(-1);
        class142.method1085(arg0 + 3659);
        class103.method785(false);
        class100.method757((byte) 110);
        class7.method70(-121);
        class170.method1287(2);
        class245.method1683(arg0 + 120);
        class196.method1435(false);
        class213.method1526(26551);
        class101.method763(false);
        class235.method1641(arg0);
        class43.method335(true);
        class154.method1158(128);
        class146.method1104((byte) 94);
        class81.method628(-8512);
        class23.method189(arg0 ^ 0x60E1);
        class261.method1833(10);
        class77.method607((byte) 49);
        class251.method1717((byte) 40);
        class275.method1914(16777215);
        class112.method857(1);
        class131.method1017(0);
        class94.method682(110);
        class340.method2365(9916);
        class49.method375((byte) -120);
        class147.method1110(-125);
        class232.method1631(8160);
        class59.method416((byte) -81);
        class83.method634(1027);
        class278.method1926((byte) 43);
        class30.method226(arg0 - 15217);
        class118.method900(true);
        class241.method1674(29836);
        class290.method2006((byte) 67);
        class268.method1878((byte) -91);
        class56.method403(-233256472);
        class157.method1183(34);
        class284.method1969((byte) 107);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1198)
    private final void method1005(byte arg0) {
        field1982++;
        if (class184.field2909 < class340.field5285.field1503) {
            class201.field3087 = (class340.field5285.field1503 * 50 - 50) * 5;
            if (class201.field3087 > 3000) {
                class201.field3087 = 3000;
            }
            if (class62.field829 == class340.field5286) {
                class62.field829 = class216.field3318;
            } else {
                class62.field829 = class340.field5286;
            }
            if (class340.field5285.field1503 >= 2 && class340.field5285.field1504 == 6) {
                this.method1698(-10083, "js5connect_outofdate");
                class152.field2308 = 1000;
                return;
            }
            if (class340.field5285.field1503 >= 4 && class340.field5285.field1504 == -1) {
                this.method1698(-10083, "js5crc");
                class152.field2308 = 1000;
                return;
            }
            if (class340.field5285.field1503 >= 4 && (class152.field2308 == 0 || class152.field2308 == 5)) {
                if (class340.field5285.field1504 == 7 || class340.field5285.field1504 == 9) {
                    this.method1698(-10083, "js5connect_full");
                } else if (class340.field5285.field1504 > 0) {
                    this.method1698(-10083, "js5connect");
                } else {
                    this.method1698(-10083, "js5io");
                }
                class152.field2308 = 1000;
                return;
            }
        }
        class184.field2909 = class340.field5285.field1503;
        if (class201.field3087 > 0) {
            class201.field3087--;
            return;
        }
        try {
            if (arg0 < 23) {
                field1991 = -105;
            }
            if (class343.field5317 == 0) {
                class43.field607 = class330.field5074.method65((byte) -31, class62.field829, class224.field3427);
                class343.field5317++;
            }
            if (class343.field5317 == 1) {
                if (class43.field607.field3185 == 2) {
                    this.method994(-3194, 1000);
                    return;
                }
                if (class43.field607.field3185 == 1) {
                    class343.field5317++;
                }
            }
            if (class343.field5317 == 2) {
                class265.field4122 = new class237((Socket) class43.field607.field3186, class330.field5074);
                class254 var2 = new class254(5);
                var2.method1752(15, -99);
                var2.method1773(543, false);
                class265.field4122.method1651(0, 5, var2.field3840, (byte) -40);
                class343.field5317++;
                class167.field2696 = class105.method789((byte) 55);
            }
            if (class343.field5317 == 3) {
                if (class152.field2308 == 0 || class152.field2308 == 5 || class265.field4122.method1648(0) > 0) {
                    int var3 = class265.field4122.method1655(0);
                    if (var3 != 0) {
                        this.method994(-3194, var3);
                        return;
                    }
                    class343.field5317++;
                } else if (class105.method789((byte) 55) - class167.field2696 > 30000L) {
                    this.method994(-3194, 1001);
                    return;
                }
            }
            if (class343.field5317 == 4) {
                boolean var4 = class152.field2308 == 5 || class152.field2308 == 10 || class152.field2308 == 28;
                class340.field5285.method781(class265.field4122, !var4, (byte) -34);
                class43.field607 = null;
                class265.field4122 = null;
                class343.field5317 = 0;
            }
        } catch (IOException var6) {
            this.method994(-3194, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmn;IIIIIII)V", line = 1345)
    public static final void method1006(class161[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class161 var9 = arg0[var8];
            if (var9 != null && var9.field2566 == arg1 && (!var9.field2550 || var9.field2590 == 0 || var9.field2606 || method1012(var9).field54 != 0 || class153.field2324 == var9 || var9.field2598 == 1338) && (!var9.field2550 || !method1002(var9))) {
                int var10 = var9.field2621 + arg6;
                int var11 = var9.field2587 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2590 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2619 + var10;
                    int var17 = var9.field2490 + var11;
                    if (var9.field2590 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class296.field4572 == var9) {
                    class136.field2056 = true;
                    class51.field689 = var10;
                    class132.field2013 = var11;
                }
                if (!var9.field2550 || var12 < var14 && var13 < var15) {
                    if (var9.field2590 == 0) {
                        if (!var9.field2550 && method1002(var9) && class3.field40 != var9) {
                            continue;
                        }
                        if (var9.field2601 && class290.field4468 >= var12 && class108.field1622 >= var13 && class290.field4468 < var14 && class108.field1622 < var15) {
                            for (class296 var18 = (class296) class146.field2231.method1954(-66); var18 != null; var18 = (class296) class146.field2231.method1950((byte) 91)) {
                                if (var18.field4571) {
                                    var18.method39(10717);
                                    var18.field4574.field2482 = false;
                                }
                            }
                            if (class82.field1208 == 0) {
                                class296.field4572 = null;
                                class153.field2324 = null;
                            }
                            class60.field792 = 0;
                        }
                    }
                    if (var9.field2550) {
                        boolean var19;
                        if (class290.field4468 >= var12 && class108.field1622 >= var13 && class290.field4468 < var14 && class108.field1622 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class240.field3670 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class305.field4751 == 1 && class109.field1643 >= var12 && class47.field640 >= var13 && class109.field1643 < var14 && class47.field640 < var15) {
                            var21 = true;
                        }
                        if (var9.field2467 != null) {
                            for (int var22 = 0; var22 < var9.field2467.length; var22++) {
                                if (class180.field2860[var9.field2467[var22]]) {
                                    if (var9.field2526 == null || class233.field3542 >= var9.field2526[var22]) {
                                        byte var23 = var9.field2531[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class180.field2860[86] && !class180.field2860[82] && !class180.field2860[81]) && ((var23 & 0x2) == 0 || class180.field2860[86]) && ((var23 & 0x1) == 0 || class180.field2860[82]) && ((var23 & 0x4) == 0 || class180.field2860[81])) {
                                            class183.method1360(-1, var9.field2615, -98, "", var22 + 1);
                                            int var24 = var9.field2507[var22];
                                            if (var9.field2526 == null) {
                                                var9.field2526 = new int[var9.field2467.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2526[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2526[var22] = class233.field3542 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2526 != null) {
                                    var9.field2526[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class229.method1616((byte) -39, class47.field640 - var11, class109.field1643 - var10, var9);
                        }
                        if (class296.field4572 != null && class296.field4572 != var9 && var19 && method1012(var9).method32(126)) {
                            class295.field4547 = var9;
                        }
                        if (class153.field2324 == var9) {
                            class163.field2646 = true;
                            class183.field2894 = var10;
                            class34.field495 = var11;
                        }
                        if (var9.field2606 || var9.field2598 != 0) {
                            if (var19 && class62.field826 != 0 && var9.field2492 != null) {
                                class296 var25 = new class296();
                                var25.field4571 = true;
                                var25.field4574 = var9;
                                var25.field4573 = class62.field826;
                                var25.field4575 = var9.field2492;
                                class146.field2231.method1952(var25, 34);
                            }
                            if (class296.field4572 != null || class192.field2995 != null || class330.field5089 || var9.field2598 != 1400 && class60.field792 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2598 != 0) {
                                if (var9.field2598 == 1337) {
                                    class302.field4628 = var9;
                                    continue;
                                }
                                if (var9.field2598 == 1338) {
                                    if (var21) {
                                        class134.field2038 = class109.field1643 - var10;
                                        class190.field2978 = class47.field640 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2598 == 1400) {
                                    class261.field4011 = var9;
                                    if (var21) {
                                        if (class180.field2860[82] && class295.field4546 > 0) {
                                            int var26 = (int) ((double) (class109.field1643 - var10 - var9.field2619 / 2) * 2.0D / (double) class198.field3035);
                                            int var27 = (int) ((double) (class47.field640 - var11 - var9.field2490 / 2) * 2.0D / (double) class198.field3035);
                                            int var28 = class8.field119 + var26;
                                            int var29 = class49.field680 + var27;
                                            int var30 = class196.field3024 + var28;
                                            int var31 = class229.field3494 + class176.field2822 - var29 - 1;
                                            class262 var32 = class85.method641(8);
                                            int[] var33 = var32.method1843(var31, var30, -9030);
                                            if (var33 != null) {
                                                class106.method790(var33[0], var33[2], (byte) -82, var33[1]);
                                                class214.method1529(190);
                                            }
                                            continue;
                                        }
                                        class60.field792 = 1;
                                        class204.field3120 = class290.field4468;
                                        class331.field5106 = class108.field1622;
                                        continue;
                                    }
                                    if (var20 && class60.field792 > 0) {
                                        if (class60.field792 == 1 && (class290.field4468 != class204.field3120 || class331.field5106 != class108.field1622)) {
                                            class111.field1685 = class8.field119;
                                            class217.field3326 = class49.field680;
                                            class60.field792 = 2;
                                        }
                                        if (class60.field792 == 2) {
                                            class267.method1872(32, (int) ((double) (class204.field3120 - class290.field4468) * 2.0D / (double) class341.field5303) + class111.field1685);
                                            class98.method731(-1, (int) ((double) (class331.field5106 - class108.field1622) * 2.0D / (double) class341.field5303) + class217.field3326);
                                        }
                                        continue;
                                    }
                                    class60.field792 = 0;
                                    continue;
                                }
                                if (var9.field2598 == 1401) {
                                    if (var20) {
                                        class322.method2236(var9.field2490, var9.field2619, (byte) -46, class290.field4468 - var10, class108.field1622 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field2598 == 1402) {
                                    if (!class73.field1058) {
                                        class254.method1776(4, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field2522 && var21) {
                                var9.field2522 = true;
                                if (var9.field2520 != null) {
                                    class296 var34 = new class296();
                                    var34.field4571 = true;
                                    var34.field4574 = var9;
                                    var34.field4567 = class109.field1643 - var10;
                                    var34.field4573 = class47.field640 - var11;
                                    var34.field4575 = var9.field2520;
                                    class146.field2231.method1952(var34, 114);
                                }
                            }
                            if (var9.field2522 && var20 && var9.field2575 != null) {
                                class296 var35 = new class296();
                                var35.field4571 = true;
                                var35.field4574 = var9;
                                var35.field4567 = class290.field4468 - var10;
                                var35.field4573 = class108.field1622 - var11;
                                var35.field4575 = var9.field2575;
                                class146.field2231.method1952(var35, 36);
                            }
                            if (var9.field2522 && !var20) {
                                var9.field2522 = false;
                                if (var9.field2516 != null) {
                                    class296 var36 = new class296();
                                    var36.field4571 = true;
                                    var36.field4574 = var9;
                                    var36.field4567 = class290.field4468 - var10;
                                    var36.field4573 = class108.field1622 - var11;
                                    var36.field4575 = var9.field2516;
                                    class8.field127.method1952(var36, -100);
                                }
                            }
                            if (var20 && var9.field2610 != null) {
                                class296 var37 = new class296();
                                var37.field4571 = true;
                                var37.field4574 = var9;
                                var37.field4567 = class290.field4468 - var10;
                                var37.field4573 = class108.field1622 - var11;
                                var37.field4575 = var9.field2610;
                                class146.field2231.method1952(var37, 117);
                            }
                            if (!var9.field2482 && var19) {
                                var9.field2482 = true;
                                if (var9.field2608 != null) {
                                    class296 var38 = new class296();
                                    var38.field4571 = true;
                                    var38.field4574 = var9;
                                    var38.field4567 = class290.field4468 - var10;
                                    var38.field4573 = class108.field1622 - var11;
                                    var38.field4575 = var9.field2608;
                                    class146.field2231.method1952(var38, 123);
                                }
                            }
                            if (var9.field2482 && var19 && var9.field2519 != null) {
                                class296 var39 = new class296();
                                var39.field4571 = true;
                                var39.field4574 = var9;
                                var39.field4567 = class290.field4468 - var10;
                                var39.field4573 = class108.field1622 - var11;
                                var39.field4575 = var9.field2519;
                                class146.field2231.method1952(var39, -93);
                            }
                            if (var9.field2482 && !var19) {
                                var9.field2482 = false;
                                if (var9.field2517 != null) {
                                    class296 var40 = new class296();
                                    var40.field4571 = true;
                                    var40.field4574 = var9;
                                    var40.field4567 = class290.field4468 - var10;
                                    var40.field4573 = class108.field1622 - var11;
                                    var40.field4575 = var9.field2517;
                                    class8.field127.method1952(var40, -47);
                                }
                            }
                            if (var9.field2485 != null) {
                                class296 var41 = new class296();
                                var41.field4574 = var9;
                                var41.field4575 = var9.field2485;
                                class61.field820.method1952(var41, 113);
                            }
                            if (var9.field2538 != null && class209.field3203 > var9.field2593) {
                                if (var9.field2618 == null || class209.field3203 - var9.field2593 > 32) {
                                    class296 var46 = new class296();
                                    var46.field4574 = var9;
                                    var46.field4575 = var9.field2538;
                                    class146.field2231.method1952(var46, -101);
                                } else {
                                    label575: for (int var42 = var9.field2593; var42 < class209.field3203; var42++) {
                                        int var43 = class25.field292[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2618.length; var44++) {
                                            if (var9.field2618[var44] == var43) {
                                                class296 var45 = new class296();
                                                var45.field4574 = var9;
                                                var45.field4575 = var9.field2538;
                                                class146.field2231.method1952(var45, -18);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field2593 = class209.field3203;
                            }
                            if (var9.field2486 != null && class142.field2184 > var9.field2549) {
                                if (var9.field2476 == null || class142.field2184 - var9.field2549 > 32) {
                                    class296 var51 = new class296();
                                    var51.field4574 = var9;
                                    var51.field4575 = var9.field2486;
                                    class146.field2231.method1952(var51, 115);
                                } else {
                                    label551: for (int var47 = var9.field2549; var47 < class142.field2184; var47++) {
                                        int var48 = class232.field3537[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2476.length; var49++) {
                                            if (var9.field2476[var49] == var48) {
                                                class296 var50 = new class296();
                                                var50.field4574 = var9;
                                                var50.field4575 = var9.field2486;
                                                class146.field2231.method1952(var50, 125);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field2549 = class142.field2184;
                            }
                            if (var9.field2548 != null && class35.field515 > var9.field2524) {
                                if (var9.field2612 == null || class35.field515 - var9.field2524 > 32) {
                                    class296 var56 = new class296();
                                    var56.field4574 = var9;
                                    var56.field4575 = var9.field2548;
                                    class146.field2231.method1952(var56, -61);
                                } else {
                                    label527: for (int var52 = var9.field2524; var52 < class35.field515; var52++) {
                                        int var53 = class205.field3147[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2612.length; var54++) {
                                            if (var9.field2612[var54] == var53) {
                                                class296 var55 = new class296();
                                                var55.field4574 = var9;
                                                var55.field4575 = var9.field2548;
                                                class146.field2231.method1952(var55, 12);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field2524 = class35.field515;
                            }
                            if (var9.field2536 != null && class309.field4822 > var9.field2562) {
                                if (var9.field2472 == null || class309.field4822 - var9.field2562 > 32) {
                                    class296 var61 = new class296();
                                    var61.field4574 = var9;
                                    var61.field4575 = var9.field2536;
                                    class146.field2231.method1952(var61, -87);
                                } else {
                                    label503: for (int var57 = var9.field2562; var57 < class309.field4822; var57++) {
                                        int var58 = class286.field4444[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2472.length; var59++) {
                                            if (var9.field2472[var59] == var58) {
                                                class296 var60 = new class296();
                                                var60.field4574 = var9;
                                                var60.field4575 = var9.field2536;
                                                class146.field2231.method1952(var60, 117);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field2562 = class309.field4822;
                            }
                            if (var9.field2603 != null && class324.field5001 > var9.field2624) {
                                if (var9.field2499 == null || class324.field5001 - var9.field2624 > 32) {
                                    class296 var66 = new class296();
                                    var66.field4574 = var9;
                                    var66.field4575 = var9.field2603;
                                    class146.field2231.method1952(var66, 114);
                                } else {
                                    label479: for (int var62 = var9.field2624; var62 < class324.field5001; var62++) {
                                        int var63 = class189.field2966[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2499.length; var64++) {
                                            if (var9.field2499[var64] == var63) {
                                                class296 var65 = new class296();
                                                var65.field4574 = var9;
                                                var65.field4575 = var9.field2603;
                                                class146.field2231.method1952(var65, 126);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field2624 = class324.field5001;
                            }
                            if (class184.field2908 > var9.field2599 && var9.field2537 != null) {
                                class296 var67 = new class296();
                                var67.field4574 = var9;
                                var67.field4575 = var9.field2537;
                                class146.field2231.method1952(var67, -68);
                            }
                            if (class338.field5255 > var9.field2599 && var9.field2495 != null) {
                                class296 var68 = new class296();
                                var68.field4574 = var9;
                                var68.field4575 = var9.field2495;
                                class146.field2231.method1952(var68, 121);
                            }
                            if (class110.field1656 > var9.field2599 && var9.field2506 != null) {
                                class296 var69 = new class296();
                                var69.field4574 = var9;
                                var69.field4575 = var9.field2506;
                                class146.field2231.method1952(var69, 114);
                            }
                            if (class225.field3438 > var9.field2599 && var9.field2530 != null) {
                                class296 var70 = new class296();
                                var70.field4574 = var9;
                                var70.field4575 = var9.field2530;
                                class146.field2231.method1952(var70, 19);
                            }
                            if (class204.field3128 > var9.field2599 && var9.field2585 != null) {
                                class296 var71 = new class296();
                                var71.field4574 = var9;
                                var71.field4575 = var9.field2585;
                                class146.field2231.method1952(var71, -26);
                            }
                            var9.field2599 = class12.field155;
                            if (var9.field2450 != null) {
                                for (int var72 = 0; var72 < class14.field196; var72++) {
                                    class296 var73 = new class296();
                                    var73.field4574 = var9;
                                    var73.field4576 = class90.field1279[var72];
                                    var73.field4577 = class182.field2883[var72];
                                    var73.field4575 = var9.field2450;
                                    class146.field2231.method1952(var73, -53);
                                }
                            }
                            if (class109.field1646 && var9.field2451 != null) {
                                class296 var74 = new class296();
                                var74.field4574 = var9;
                                var74.field4575 = var9.field2451;
                                class146.field2231.method1952(var74, 116);
                            }
                        }
                    }
                    if (!var9.field2550 && class296.field4572 == null && class192.field2995 == null && !class330.field5089) {
                        if ((var9.field2594 >= 0 || var9.field2559 != 0) && class290.field4468 >= var12 && class108.field1622 >= var13 && class290.field4468 < var14 && class108.field1622 < var15) {
                            if (var9.field2594 >= 0) {
                                class3.field40 = arg0[var9.field2594];
                            } else {
                                class3.field40 = var9;
                            }
                        }
                        if (var9.field2590 == 8 && class290.field4468 >= var12 && class108.field1622 >= var13 && class290.field4468 < var14 && class108.field1622 < var15) {
                            class108.field1584 = var9;
                        }
                        if (var9.field2441 > var9.field2490) {
                            class147.method1107(class290.field4468, var9.field2490, var9.field2619 + var10, var11, var9, 16, class108.field1622, var9.field2441);
                        }
                    }
                    if (var9.field2590 == 0) {
                        method1006(arg0, var9.field2615, var12, var13, var14, var15, var10 - var9.field2573, var11 - var9.field2546);
                        if (var9.field2509 != null) {
                            method1006(var9.field2509, var9.field2615, var12, var13, var14, var15, var10 - var9.field2573, var11 - var9.field2546);
                        }
                        class242 var75 = (class242) class222.field3383.method1716(-1, (long) var9.field2615);
                        if (var75 != null) {
                            class205.method1480(var75.field3689, var13, var12, -1, var15, var10, var14, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2116)
    public final void method1007(boolean arg0) {
        field1981++;
        if (class152.field2308 == 1000) {
            return;
        }
        if (!arg0) {
            this.init();
        }
        class233.field3542++;
        if (class233.field3542 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class231.field3522 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class130.field1999.setSeed((long) class231.field3522);
        }
        this.method1000(-124);
        if (class78.field1139 != null) {
            class78.field1139.method1515((byte) 45);
        }
        class5.method46((byte) 94);
        class293.method2025((byte) 105);
        class77.method606((byte) -104);
        class167.method1271((byte) -106);
        if (class73.field1058) {
            class80.method624();
        }
        if (class38.field542 != null) {
            int var3 = class38.field542.method1542(79);
            class62.field826 = var3;
        }
        if (class152.field2308 == 0) {
            this.method998((byte) 124);
            class168.method1272(101);
        } else if (class152.field2308 == 5) {
            this.method998((byte) 89);
            class168.method1272(99);
        } else if (class152.field2308 == 25 || class152.field2308 == 28) {
            class238.method1659(-105);
        }
        if (class152.field2308 == 10) {
            this.method1008(0);
            class231.method1625(-21322);
            class218.method1552((byte) -107);
            class269.method1885(!arg0);
        } else if (class152.field2308 == 30) {
            class120.method911(!arg0);
        } else if (class152.field2308 == 40) {
            class269.method1885(!arg0);
            if (class184.field2907 != -3) {
                if (class184.field2907 == 15) {
                    class35.method272((byte) 106);
                } else if (class184.field2907 != 2) {
                    class37.method284(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2208)
    public static final void main(String[] arg0) {
        field1983++;
        try {
            if (arg0.length != 4) {
                class161.method1198(1, "argument count");
            }
            class261.field4020 = Integer.parseInt(arg0[0]);
            class312.field4837 = 2;
            if (arg0[1].equals("live")) {
                class120.field1855 = 0;
            } else if (arg0[1].equals("rc")) {
                class120.field1855 = 1;
            } else if (arg0[1].equals("wip")) {
                class120.field1855 = 2;
            } else {
                class161.method1198(1, "modewhat");
            }
            class174.field2794 = false;
            class81.field1197 = class25.method199(arg0[2], 0);
            if (class81.field1197 == -1) {
                if (arg0[2].equals("english")) {
                    class81.field1197 = 0;
                } else if (arg0[2].equals("german")) {
                    class81.field1197 = 1;
                } else {
                    class161.method1198(1, "language");
                }
            }
            class336.method2347(class81.field1197, 17839);
            class99.field1427 = false;
            class209.field3202 = false;
            if (arg0[3].equals("game0")) {
                class248.field3754 = 0;
            } else if (arg0[3].equals("game1")) {
                class248.field3754 = 1;
            } else {
                class161.method1198(1, "game");
            }
            class160.field2420 = "";
            class25.field288 = 0;
            class76.field1109 = 0;
            class237.field3595 = false;
            client var1 = new client();
            class304.field4654 = var1;
            var1.method1696("runescape", 1024, class120.field1855 + 32, false, 543, 768, 29, (byte) -101);
            class254.field3878.setLocation(40, 40);
        } catch (Exception var3) {
            class189.method1401(true, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2277)
    private final void method1008(int arg0) {
        class14.field196 = arg0;
        field1988++;
        while (class251.method1722((byte) 102) && class14.field196 < 128) {
            class90.field1279[class14.field196] = class211.field3245;
            class182.field2883[class14.field196] = class280.field4356;
            class14.field196++;
        }
        class228.field3488++;
        if (class28.field334 != -1) {
            class205.method1480(class28.field334, 0, 0, -1, class215.field3300, 0, class151.field2281, 0);
        }
        class12.field155++;
        if (class73.field1058) {
            int var2 = 2359807;
            label192: for (int var3 = 0; var3 < 32768; var3++) {
                class76 var4 = class264.field4064[var3];
                if (var4 != null) {
                    byte var5 = var4.field1104.field5141;
                    if ((var5 & 0x2) > 0 && var4.field4716 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4741[0] = 1;
                            var4.field4676[0] = (var4.field4713 >> 7) + var6;
                            var4.field4744[0] = (var4.field4731 >> 7) + var7;
                            class91.field1323[class265.field4112].method2391(false, var4.field4713 >> 7, var4.field4731 >> 7, 0, 65536, var4.method1897(8), var4.method1897(8), false);
                            if (var4.field4676[0] >= 0 && var4.field4676[0] <= (104 - var4.method1897(8)) && var4.field4744[0] >= 0 && var4.field4744[0] <= (104 - var4.method1897(8)) && class91.field1323[class265.field4112].method2390(var4.field4731 >> 7, 28329, var4.field4713 >> 7, var4.field4676[0], var4.field4744[0])) {
                                if (var4.method1897(8) > 1) {
                                    for (int var8 = var4.field4676[0]; var8 < (var4.field4676[0] + var4.method1897(arg0 + 8)); var8++) {
                                        for (int var9 = var4.field4744[0]; var4.field4744[0] + var4.method1897(arg0 + 8) > var9; var9++) {
                                            if ((class91.field1323[class265.field4112].field5357[var8][var9] & var2) != 0) {
                                                continue label192;
                                            }
                                        }
                                    }
                                }
                                var4.field4716 = 1;
                            }
                        }
                    }
                    class76.method595(false, var4);
                    class201.method1455((byte) -80, var4);
                    class99.method748(19, var4);
                    class91.field1323[class265.field4112].method2396(false, var4.method1897(8), -16161, var4.field4713 >> 7, var4.field4731 >> 7, var4.method1897(8), false);
                }
            }
        }
        if (!class73.field1058) {
            class294.method2030(false);
        } else if (class59.field787 == 0 && class38.field564 == 0) {
            if (class268.field4168 == 2) {
                class341.method2371((byte) 126);
            } else {
                class209.method1500(2);
            }
            if ((class190.field2976 >> 7) < 14 || class190.field2976 >> 7 >= 90 || (class197.field3028 >> 7) < 14 || class197.field3028 >> 7 >= 90) {
                class109.method832((byte) 101);
            }
        }
        while (true) {
            class296 var10;
            class161 var11;
            class161 var12;
            do {
                var10 = (class296) class61.field820.method1944(113);
                if (var10 == null) {
                    while (true) {
                        class296 var13;
                        class161 var17;
                        class161 var18;
                        do {
                            var13 = (class296) class8.field127.method1944(arg0 ^ 0x7B);
                            if (var13 == null) {
                                while (true) {
                                    class296 var14;
                                    class161 var15;
                                    class161 var16;
                                    do {
                                        var14 = (class296) class146.field2231.method1944(120);
                                        if (var14 == null) {
                                            if (class296.field4572 != null) {
                                                class267.method1877(-1);
                                            }
                                            if (class336.field5228 != null && class336.field5228.field3185 == 1) {
                                                if (class336.field5228.field3186 != null) {
                                                    class87.method646(class237.field3607, class168.field2728, (byte) 99);
                                                }
                                                class168.field2728 = null;
                                                class336.field5228 = null;
                                                class237.field3607 = false;
                                            }
                                            if ((class233.field3542 % 1500) == 0) {
                                                class43.method334(true);
                                            }
                                            return;
                                        }
                                        var15 = var14.field4574;
                                        if (var15.field2510 < 0) {
                                            break;
                                        }
                                        var16 = class331.method2308((byte) 47, var15.field2566);
                                    } while (var16 == null || var16.field2509 == null || var15.field2510 >= var16.field2509.length || var16.field2509[var15.field2510] != var15);
                                    class251.method1719(-31, var14);
                                }
                            }
                            var17 = var13.field4574;
                            if (var17.field2510 < 0) {
                                break;
                            }
                            var18 = class331.method2308((byte) -128, var17.field2566);
                        } while (var18 == null || var18.field2509 == null || var17.field2510 >= var18.field2509.length || var18.field2509[var17.field2510] != var17);
                        class251.method1719(-31, var13);
                    }
                }
                var11 = var10.field4574;
                if (var11.field2510 < 0) {
                    break;
                }
                var12 = class331.method2308((byte) -124, var11.field2566);
            } while (var12 == null || var12.field2509 == null || var11.field2510 >= var12.field2509.length || var12.field2509[var11.field2510] != var11);
            class251.method1719(arg0 - 31, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2489)
    public final void method1009(boolean arg0) {
        field1979++;
        if (class73.field1058) {
            class73.method542();
        }
        if (class170.field2747 != null) {
            class1.method10(class170.field2747, (byte) 5, class330.field5074);
            class170.field2747 = null;
        }
        if (class330.field5074 != null) {
            class330.field5074.method60((byte) 127, this.getClass());
        }
        if (class120.field1851 != null) {
            class120.field1851.field3992 = false;
        }
        if (!arg0) {
            return;
        }
        class120.field1851 = null;
        if (class1.field20 != null) {
            class1.field20.method1653(-19746);
            class1.field20 = null;
        }
        class330.method2301(16128, class102.field1480);
        class245.method1685(-2136, class102.field1480);
        if (class38.field542 != null) {
            class38.field542.method1536(class102.field1480, true);
        }
        class132.method1025(1);
        class29.method222((byte) 89);
        class38.field542 = null;
        if (class250.field3778 != null) {
            class250.field3778.method2295((byte) -122);
        }
        if (class234.field3567 != null) {
            class234.field3567.method2295((byte) -37);
        }
        class340.field5285.method777((byte) 94);
        class154.field2333.method1099(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lbd;", line = 2547)
    public static final class28 method1010(int arg0, byte arg1) {
        field1986++;
        class28 var2 = (class28) class173.field2790.method747((long) arg0, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class338.field5254.method696(class235.method1640(arg0, 57), (byte) 105, class257.method1815(128, arg0));
        class28 var4 = new class28();
        var4.field323 = arg0;
        if (var3 != null) {
            var4.method219(new class254(var3), -2286);
        }
        if (arg1 < 103) {
            field1991 = -51;
        }
        var4.method210(false);
        class173.field2790.method744(var4, -15692, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmn;)Lmn;", line = 2580)
    public static final class161 method1011(class161 arg0) {
        int var1 = method1012(arg0).method31(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class331.method2308((byte) 72, arg0.field2566);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmn;)Lff;", line = 2600)
    public static final class4 method1012(class161 arg0) {
        class4 var1 = (class4) class63.field841.method1716(-1, ((long) arg0.field2615 << 32) + (long) arg0.field2510);
        return var1 == null ? arg0.field2463 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 2605)
    public final void method1013(int arg0) {
        field1978++;
        if (class152.field2308 == 1000) {
            return;
        }
        long var2 = class170.method1286((byte) -26) / 1000000L - class121.field1863;
        class121.field1863 = class170.method1286((byte) -26) / 1000000L;
        boolean var4 = class258.method1820(arg0);
        if (var4 && class132.field2016 && class250.field3778 != null) {
            class250.field3778.method2304((byte) 82);
        }
        if ((class152.field2308 == 30 || class152.field2308 == 10) && (class229.field3496 || class303.field4636 != 0L && class303.field4636 < class105.method789((byte) 55))) {
            class181.method1356(class25.field272, class63.method431(1), arg0 - 73, class229.field3496, class169.field2735);
        }
        if (class170.field2747 == null) {
            Container var5;
            if (class170.field2747 != null) {
                var5 = class170.field2747;
            } else if (class254.field3878 == null) {
                var5 = class330.field5074.field95;
            } else {
                var5 = class254.field3878;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class254.field3878 == var5) {
                Insets var8 = class254.field3878.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class312.field4843 != var6 || class242.field3687 != var7) {
                if (class6.field101.startsWith("mac")) {
                    class242.field3687 = var7;
                    class312.field4843 = var6;
                } else {
                    class298.method2053((byte) -50);
                }
                class303.field4636 = class105.method789((byte) 55) + 500L;
            }
        }
        if (class170.field2747 != null && !class313.field4857 && (class152.field2308 == 30 || class152.field2308 == 10)) {
            class181.method1356(-1, class216.field3321, arg0 ^ 0xFFFFFFBE, false, -1);
        }
        boolean var9 = false;
        if (class177.field2828) {
            class177.field2828 = false;
            var9 = true;
        }
        if (var9) {
            class206.method1489(arg0 + 25834);
        }
        if (class73.field1058) {
            for (int var10 = 0; var10 < 100; var10++) {
                class121.field1861[var10] = true;
            }
        }
        if (class152.field2308 == 0) {
            class159.method1193((byte) -97, class167.field2710, (Color) null, var9, class327.field5056);
        } else if (class152.field2308 == 5) {
            class184.method1363(arg0 ^ 0xFFFFB711, false, class167.field2703);
        } else if (class152.field2308 == 10) {
            class233.method1634((byte) 36);
        } else if (class152.field2308 == 25 || class152.field2308 == 28) {
            if (class178.field2837 == 1) {
                if (class162.field2633 < class111.field1673) {
                    class162.field2633 = class111.field1673;
                }
                int var11 = (class162.field2633 - class111.field1673) * 50 / class162.field2633;
                class97.method729(arg0 + 29912, false, class286.field4447 + "<br>(" + var11 + "%)");
            } else if (class178.field2837 == 2) {
                if (class233.field3541 > class114.field1794) {
                    class114.field1794 = class233.field3541;
                }
                int var12 = (class114.field1794 - class233.field3541) * 50 / class114.field1794 + 50;
                class97.method729(arg0 + 29912, false, class286.field4447 + "<br>(" + var12 + "%)");
            } else {
                class97.method729(arg0 + 29912, false, class286.field4447);
            }
        } else if (class152.field2308 == 30) {
            class31.method239((byte) 122, var2);
        } else if (class152.field2308 == 40) {
            class97.method729(29912, false, class305.field4691 + "<br>" + class257.field3938);
        }
        if (class73.field1058 && class152.field2308 != 0) {
            class73.method545();
            for (int var19 = 0; var19 < class184.field2913; var19++) {
                class331.field5117[var19] = false;
            }
        } else if ((class152.field2308 == 30 || class152.field2308 == 10) && class8.field122 == 0 && !var9) {
            try {
                Graphics var16 = class102.field1480.getGraphics();
                for (int var17 = 0; var17 < class184.field2913; var17++) {
                    if (class331.field5117[var17]) {
                        class13.field186.method1089(class120.field1850[var17], (byte) 108, class174.field2803[var17], class97.field1400[var17], var16, class41.field602[var17]);
                        class331.field5117[var17] = false;
                    }
                }
            } catch (Exception var20) {
                class102.field1480.repaint();
            }
        } else if (class152.field2308 != 0) {
            try {
                Graphics var13 = class102.field1480.getGraphics();
                class13.field186.method1091(-24418, var13, 0, 0);
                for (int var14 = 0; var14 < class184.field2913; var14++) {
                    class331.field5117[var14] = false;
                }
            } catch (Exception var21) {
                class102.field1480.repaint();
            }
        }
        if (class298.field4584) {
            class166.method1261(-42);
        }
        if (class7.field112 && class152.field2308 == 10 && class28.field334 != -1) {
            class7.field112 = false;
            class110.method840(-53, class330.field5074);
        }
    }
}
