import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends RuntimeException {

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljava/lang/String;")
    public String field2889;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2879;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lqf;")
    public static class117 field2887 = class72.method514(121, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lqf;")
    public static class117 field2886 = class72.method514(103, "Registrierter Benutzer");

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lra;")
    public static class119 field2881 = new class119(5000);

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[[I")
    public static int[][] field2892 = new int[104][104];

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2891 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljb;")
    public static class64 field2880;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lmf;")
    public static class89 field2888;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[[[B")
    public static byte[][][] field2884;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lnc;BZ)V")
    public static final void method967(class93 arg0, byte arg1, boolean arg2) {
        field2882++;
        if (class126.field2977 != null) {
            try {
                class126.field2977.method738(1);
            } catch (Exception var8) {
            }
            class126.field2977 = null;
        }
        class126.field2977 = arg0;
        class138.method1077(arg2, 103);
        class68.field1420 = 0;
        class140.field3336.field1691 = 0;
        class103.field2496 = null;
        class146.field3575 = null;
        while (true) {
            class26 var3 = (class26) class48.field966.method1222(0);
            if (var3 == null) {
                while (true) {
                    class26 var4 = (class26) class35.field726.method1222(arg1 + 94);
                    if (var4 == null) {
                        if (arg1 != -94) {
                            return;
                        }
                        if (class34.field716 != 0) {
                            try {
                                class77 var5 = new class77(4);
                                var5.method571(4, arg1 ^ 0x2B2E);
                                var5.method571(class34.field716, -11124);
                                var5.method556(0, true);
                                class126.field2977.method736((byte) 42, var5.field1748, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    class126.field2977.method738(arg1 ^ 0xFFFFFFA3);
                                } catch (Exception var6) {
                                }
                                class126.field2977 = null;
                                class129.field3072++;
                            }
                        }
                        class126.field2992 = 0;
                        class48.field1013 = class122.method977(false);
                        return;
                    }
                    class150.field3721.method642(arg1 + 207, var4);
                    class78.field1776.method1219(var4, (byte) 103, var4.field1495);
                    class58.field1175++;
                    class58.field1182--;
                }
            }
            class71.field1514.method1219(var3, (byte) -120, var3.field1495);
            class36.field750++;
            class117.field2828--;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method968(byte arg0) {
        field2892 = null;
        field2888 = null;
        field2880 = null;
        field2881 = null;
        field2884 = null;
        field2887 = null;
        field2886 = null;
        if (arg0 <= 36) {
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILu;Lla;I)V")
    public static final void method969(int arg0, class137 arg1, class77 arg2, int arg3) {
        field2890++;
        class116 var4 = new class116();
        var4.field2755 = arg2.method570((byte) 123);
        var4.field2742 = arg2.method554((byte) 45);
        var4.field2744 = new class7[var4.field2755];
        var4.field2750 = new int[var4.field2755];
        var4.field2754 = new int[var4.field2755];
        var4.field2743 = new byte[var4.field2755][][];
        var4.field2741 = new class7[var4.field2755];
        var4.field2739 = new int[var4.field2755];
        for (int var5 = 0; var5 < var4.field2755; var5++) {
            try {
                int var6 = arg2.method570((byte) 123);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method577(-120).method940(125));
                    String var8 = new String(arg2.method577(arg0 - 158).method940(125));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method554((byte) -112);
                    }
                    var4.field2754[var5] = var6;
                    var4.field2739[var5] = var9;
                    var4.field2741[var5] = arg1.method1067(class138.method1074(arg0, 50), var8, class73.method523(var7, (byte) 36));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method577(-110).method940(120));
                    String var11 = new String(arg2.method577(-116).method940(126));
                    int var12 = arg2.method570((byte) 123);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method577(-115).method940(121));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method554((byte) 103);
                            var15[var16] = new byte[var17];
                            arg2.method575(0, var15[var16], 15162, var17);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field2754[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class73.method523(var13[var19], (byte) 123);
                    }
                    var4.field2744[var5] = arg1.method1071(var18, var11, 21417, class73.method523(var10, (byte) 99));
                    var4.field2743[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2750[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2750[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2750[var5] = -3;
            } catch (Exception var23) {
                var4.field2750[var5] = -4;
            } catch (Throwable var24) {
                var4.field2750[var5] = -5;
            }
        }
        if (arg0 != 50) {
            method968((byte) -11);
        }
        class64.field1274.method22(var4, (byte) 44);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method970(int arg0) {
        field2885++;
        if (~class120.field2873 == arg0) {
            class19.field311 = new class113(4, 104, 104, class64.field1306);
            for (int var1 = 0; var1 < 4; var1++) {
                class107.field2550[var1] = new class135(104, 104);
            }
            class18.field285 = new class84(512, 512);
            class120.field2873 = 20;
            class95.field2299 = 5;
            class126.field2980 = class100.field2427;
        } else if (class120.field2873 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class12.field180[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class113.method843(var2, 500, 800, 512, 334);
            class95.field2299 = 10;
            class126.field2980 = class22.field430;
            class120.field2873 = 30;
        } else if (class120.field2873 == 30) {
            class82.field1887 = class114.method890(false, 0, false, true, true);
            class100.field2416 = class114.method890(false, 1, false, true, true);
            class120.field2866 = class114.method890(false, 2, true, false, true);
            class64.field1335 = class114.method890(false, 3, false, true, true);
            class31.field666 = class114.method890(false, 4, false, true, true);
            class133.field3147 = class114.method890(false, 5, true, true, true);
            class50.field1040 = class114.method890(false, 6, true, true, false);
            class68.field1416 = class114.method890(false, 7, false, true, true);
            class134.field3184 = class114.method890(false, 8, false, true, true);
            class29.field575 = class114.method890(false, 9, false, true, true);
            class78.field1774 = class114.method890(false, 10, false, true, true);
            client.field392 = class114.method890(false, 11, false, true, true);
            class138.field3285 = class114.method890(false, 12, false, true, true);
            class120.field2871 = class114.method890(false, 13, true, false, true);
            class80.field1827 = class114.method890(false, 14, false, true, false);
            class117.field2817 = class114.method890(false, 15, false, true, true);
            class95.field2299 = 20;
            class126.field2980 = class23.field449;
            class120.field2873 = 40;
        } else if (class120.field2873 == 40) {
            byte var7 = 0;
            int var8 = var7 + class82.field1887.method372(arg0 - 93) * 4 / 100;
            int var9 = var8 + class100.field2416.method372(-117) * 4 / 100;
            int var10 = var9 + class120.field2866.method372(-101) * 2 / 100;
            int var11 = var10 + class64.field1335.method372(-97) * 2 / 100;
            int var12 = var11 + class31.field666.method372(-69) * 6 / 100;
            int var13 = var12 + class133.field3147.method372(-125) * 4 / 100;
            int var14 = var13 + class50.field1040.method372(-73) * 2 / 100;
            int var15 = var14 + class68.field1416.method372(-91) * 60 / 100;
            int var16 = var15 + class134.field3184.method372(arg0 - 52) * 2 / 100;
            int var17 = var16 + class29.field575.method372(-77) * 2 / 100;
            int var18 = var17 + class78.field1774.method372(arg0 ^ 0x70) * 2 / 100;
            int var19 = var18 + client.field392.method372(arg0 ^ 0x58) * 2 / 100;
            int var20 = var19 + class138.field3285.method372(-89) * 2 / 100;
            int var21 = var20 + class120.field2871.method372(-72) * 2 / 100;
            int var22 = var21 + class80.field1827.method372(-73) * 2 / 100;
            int var23 = var22 + class117.field2817.method372(-89) * 2 / 100;
            if (var23 == 100) {
                class126.field2980 = class45.field890;
                class95.field2299 = 30;
                class120.field2873 = 45;
            } else {
                if (var23 != 0) {
                    class126.field2980 = class73.method530((byte) -83, new class117[] { class41.field812, class79.method614(15591, var23), class44.field874 });
                }
                class95.field2299 = 30;
            }
        } else if (class120.field2873 == 45) {
            class91.method724(22050, -110, 2, !class20.field334);
            class141 var24 = new class141();
            var24.method1105(9, 128, -5574);
            class119.field2853 = class103.method792(0, 22050, class3.field64, class44.field873, arg0 + 89);
            class119.field2853.method1200(var24, false);
            class139.method1082(class80.field1827, class117.field2817, class31.field666, false, var24);
            class90.field2170 = class103.method792(1, 2048, class3.field64, class44.field873, 100);
            class147.field3592 = new class38();
            class90.field2170.method1200(class147.field3592, false);
            class119.field2856 = new class110(22050, class82.field1879);
            class126.field2980 = class20.field316;
            class120.field2873 = 50;
            class95.field2299 = 35;
        } else if (class120.field2873 == 50) {
            int var25 = 0;
            if (class25.field486 == null) {
                class25.field486 = class65.method462(class141.field3351, arg0 + 100, class139.field3313, class134.field3184);
            } else {
                var25++;
            }
            if (class25.field501 == null) {
                class25.field501 = class65.method462(class141.field3351, arg0 ^ 0xFFFFFF9C, class126.field2998, class134.field3184);
            } else {
                var25++;
            }
            if (class144.field3554 == null) {
                class144.field3554 = class65.method462(class141.field3351, arg0 ^ 0xFFFFFF9C, class5.field80, class134.field3184);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class34.field715, class79.method614(15591, var25 * 100 / 3), class44.field874 });
                class95.field2299 = 40;
            } else {
                class126.field2980 = class19.field302;
                class120.field2873 = 60;
                class95.field2299 = 40;
            }
        } else if (class120.field2873 == 60) {
            int var26 = class81.method635(107, class78.field1774, class134.field3184);
            int var27 = class89.method708(true);
            if (var26 < var27) {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class82.field1889, class79.method614(arg0 ^ 0xFFFFC318, var26 * 100 / var27), class44.field874 });
                class95.field2299 = 50;
            } else {
                class95.field2299 = 50;
                class126.field2980 = class60.field1215;
                class62.method430(5, (byte) -47);
                class120.field2873 = 70;
            }
        } else if (class120.field2873 == 70) {
            if (class120.field2866.method443((byte) -126)) {
                class85.method683(class120.field2866, -1089526009);
                class41.method288(~arg0, class120.field2866);
                class133.method1029(class68.field1416, arg0 ^ 0x68, class120.field2866);
                class25.method197(class68.field1416, 2, class120.field2866, class20.field334);
                class96.method751((byte) -108, class68.field1416, class120.field2866);
                class26.method202(class25.field486, (byte) 96, class146.field3569, class68.field1416, class120.field2866);
                class90.method714(class100.field2416, arg0 ^ 0xFFFFFE3A, class82.field1887, class120.field2866);
                class93.method730(class120.field2866, class68.field1416, true);
                class31.method251(1792, class120.field2866);
                class110.method829((byte) -128, class120.field2866);
                class75.method541(class68.field1416, (byte) -59, class134.field3184, class64.field1335);
                class141.method1095(false, class120.field2866);
                class144.method1164(true, class120.field2866);
                class95.field2299 = 60;
                class120.field2873 = 80;
                class126.field2980 = class96.field2336;
            } else {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class90.field2177, class79.method614(15591, class120.field2866.method368(false)), class44.field874 });
                class95.field2299 = 60;
            }
        } else if (class120.field2873 == 80) {
            int var28 = 0;
            if (class79.field1811 == null) {
                class79.field1811 = class96.method761(class72.field1591, class134.field3184, class141.field3351, (byte) 123);
            } else {
                var28++;
            }
            if (class152.field3740 == null) {
                class152.field3740 = class96.method761(class77.field1751, class134.field3184, class141.field3351, (byte) 123);
            } else {
                var28++;
            }
            if (class133.field3146 == null) {
                class133.field3146 = class65.method468(true, class134.field3184, class139.field3316, class141.field3351);
            } else {
                var28++;
            }
            if (class135.field3226 == null) {
                class135.field3226 = class47.method338(-79, class141.field3351, class130.field3107, class134.field3184);
            } else {
                var28++;
            }
            if (class20.field325 == null) {
                class20.field325 = class47.method338(arg0 - 76, class141.field3351, class110.field2608, class134.field3184);
            } else {
                var28++;
            }
            if (class67.field1397 == null) {
                class67.field1397 = class47.method338(-51, class141.field3351, class92.field2245, class134.field3184);
            } else {
                var28++;
            }
            if (class29.field590 == null) {
                class29.field590 = class47.method338(-102, class141.field3351, class134.field3211, class134.field3184);
            } else {
                var28++;
            }
            if (class117.field2810 == null) {
                class117.field2810 = class47.method338(-74, class141.field3351, class148.field3612, class134.field3184);
            } else {
                var28++;
            }
            if (class116.field2761 == null) {
                class116.field2761 = class96.method761(class67.field1406, class134.field3184, class141.field3351, (byte) 123);
            } else {
                var28++;
            }
            if (class144.field3545 == null) {
                class144.field3545 = class47.method338(-126, class141.field3351, class81.field1859, class134.field3184);
            } else {
                var28++;
            }
            if (class124.field2936 == null) {
                class124.field2936 = class47.method338(-106, class141.field3351, class26.field524, class134.field3184);
            } else {
                var28++;
            }
            if (class25.field496 == null) {
                class25.field496 = class47.method338(-125, class141.field3351, class78.field1771, class134.field3184);
            } else {
                var28++;
            }
            if (class105.field2531 == null) {
                class105.field2531 = class65.method468(true, class134.field3184, class117.field2818, class141.field3351);
            } else {
                var28++;
            }
            if (class117.field2825 == null) {
                class117.field2825 = class65.method468(true, class134.field3184, class32.field688, class141.field3351);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class138.field3289, class79.method614(15591, var28 * 100 / 14), class44.field874 });
                class95.field2299 = 70;
            } else {
                class152.field3740.method653();
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 41.0D) - 20;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 21.0D) - 10;
                for (int var33 = 0; var33 < class135.field3226.length; var33++) {
                    class135.field3226[var33].method657(var30 + var32, var29 + var30, var30 + var31);
                }
                class133.field3146[0].method947(var30 + var32, var29 + var30, var31 + var30);
                class120.field2873 = 85;
                class95.field2299 = 70;
                class126.field2980 = class20.field317;
            }
        } else if (class120.field2873 == 85) {
            int var34 = class144.method1165(class134.field3184, 27530);
            int var35 = class140.method1085(480);
            if (var34 < var35) {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class42.field832, class79.method614(15591, var34 * 100 / var35), class44.field874 });
                class95.field2299 = 80;
            } else {
                class95.field2299 = 80;
                class126.field2980 = class147.field3585;
                class120.field2873 = 90;
            }
        } else if (class120.field2873 == 90) {
            if (class29.field575.method443((byte) -127)) {
                class71 var36 = new class71(class29.field575, class134.field3184, 20, 0.8D, class20.field334 ? 64 : 128);
                class12.method104(var36);
                class12.method93(0.8D);
                class120.field2873 = 110;
                class95.field2299 = 90;
                class126.field2980 = class120.field2865;
            } else {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class107.field2549, class79.method614(arg0 ^ 0xFFFFC318, class29.field575.method368(false)), class44.field874 });
                class95.field2299 = 90;
            }
        } else if (class120.field2873 == 110) {
            class26.field525 = new class147();
            class44.field873.method1066(class26.field525, -23553, 10);
            class95.field2299 = 94;
            class120.field2873 = 120;
            class126.field2980 = class62.field1250;
        } else if (class120.field2873 == 120) {
            if (class78.field1774.method452(class141.field3351, arg0 ^ 0x7A0C, class120.field2867)) {
                class40 var37 = new class40(class78.field1774.method442(5, class141.field3351, class120.field2867));
                class79.method613((byte) -38, var37);
                class126.field2980 = class64.field1303;
                class95.field2299 = 96;
                class120.field2873 = 130;
            } else {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class65.field1347, class44.field877 });
                class95.field2299 = 96;
            }
        } else if (class120.field2873 == 130) {
            if (!class64.field1335.method443((byte) -128)) {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class134.field3207, class79.method614(arg0 + 15592, class64.field1335.method368(false) * 4 / 5), class44.field874 });
                class95.field2299 = 100;
            } else if (!class138.field3285.method443((byte) -128)) {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class134.field3207, class79.method614(15591, class138.field3285.method368(false) / 6 + 80), class44.field874 });
                class95.field2299 = 100;
            } else if (class120.field2871.method443((byte) -126)) {
                class126.field2980 = class36.field777;
                class95.field2299 = 100;
                class120.field2873 = 140;
            } else {
                class126.field2980 = class73.method530((byte) -83, new class117[] { class134.field3207, class79.method614(15591, class120.field2871.method368(false) / 20 + 96), class44.field874 });
                class95.field2299 = 100;
            }
        } else if (class120.field2873 == 140) {
            class62.method430(10, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2877++;
        if (arg3 < 50) {
            method969(-74, null, null, 61);
        }
        class23 var10 = null;
        for (class23 var11 = (class23) class97.field2356.method27(18823); var11 != null; var11 = (class23) class97.field2356.method25((byte) -127)) {
            if (var11.field445 == arg7 && var11.field450 == arg8 && var11.field439 == arg6 && var11.field434 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class23();
            var10.field434 = arg5;
            var10.field439 = arg6;
            var10.field445 = arg7;
            var10.field450 = arg8;
            class132.method1026(-1, var10);
            class97.field2356.method22(var10, (byte) 83);
        }
        var10.field460 = arg4;
        var10.field456 = arg9;
        var10.field453 = arg2;
        var10.field438 = arg0;
        var10.field437 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILjb;)Lma;")
    public static final class84 method972(int arg0, int arg1, int arg2, class64 arg3) {
        field2878++;
        if (arg2 != 9) {
            field2888 = null;
        }
        return class68.method478(12127, arg1, arg0, arg3) ? class13.method109((byte) -32) : null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static final void method973(byte arg0) {
        class55.field1138 = null;
        field2883++;
        class45.field880 = null;
        if (arg0 <= 101) {
            field2881 = null;
        }
        class69.field1459 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class121(Throwable arg0, String arg1) {
        this.field2889 = arg1;
        this.field2879 = arg0;
    }
}
