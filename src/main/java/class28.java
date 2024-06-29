import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class28 {

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[Z")
    public static boolean[] field571 = new boolean[8];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static final void method189(byte arg0) {
        field570++;
        if (arg0 != -42) {
            method192(-54);
        }
        class163.field3132.method1205(true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLqf;II)V")
    public static final void method190(byte arg0, class150 arg1, int arg2, int arg3) {
        field572++;
        if (arg1.field2873 == 1) {
            field566++;
            class167.method1092(class45.field838, arg1.field2878, 0, arg1.field2889, -1, 44, 0);
        }
        int var4 = -40 / ((arg0 + 54) / 38);
        if (arg1.field2873 == 2 && !class17.field380) {
            class169 var5 = class148.method963(255, arg1);
            if (var5 != null) {
                class131.field2442++;
                class167.method1092(class165.method1058(0, new class169[] { class115.field2125, arg1.field2774 }), arg1.field2878, -1, var5, -1, 18, 0);
            }
        }
        if (arg1.field2873 == 3) {
            class167.method1092(class45.field838, arg1.field2878, 0, class51.field925, -1, 17, 0);
            client.field590++;
        }
        if (arg1.field2873 == 4) {
            class15.field326++;
            class167.method1092(class45.field838, arg1.field2878, 0, arg1.field2889, -1, 22, 0);
        }
        if (arg1.field2873 == 5) {
            class167.method1092(class45.field838, arg1.field2878, 0, arg1.field2889, -1, 37, 0);
            class94.field1752++;
        }
        if (arg1.field2873 == 6 && class55.field999 == null) {
            class167.method1092(class45.field838, arg1.field2878, -1, arg1.field2889, -1, 11, 0);
            class69.field1303++;
        }
        if (arg1.field2882 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field2770; var7++) {
                for (int var8 = 0; var8 < arg1.field2875; var8++) {
                    int var9 = (arg1.field2892 + 32) * var8;
                    int var10 = (arg1.field2781 + 32) * var7;
                    if (var6 < 20) {
                        var9 += arg1.field2802[var6];
                        var10 += arg1.field2768[var6];
                    }
                    if (arg3 >= var9 && var10 <= arg2 && arg3 < var9 + 32 && arg2 < var10 + 32) {
                        class65.field1211 = var6;
                        class158.field3019 = arg1;
                        if (arg1.field2782[var6] > 0) {
                            class73 var11 = class180.method1196(arg1.field2782[var6] - 1, 0);
                            if (class141.field2630 == 1 && class150.method983(-98, class70.method436(arg1, 23))) {
                                if (class176.field3454 != arg1.field2878 || class91.field1679 != var6) {
                                    class80.field1477++;
                                    class167.method1092(class165.method1058(0, new class169[] { class16.field341, class73.field1362, var11.field1383 }), arg1.field2878, var6, class73.field1368, -1, 13, var11.field1345);
                                }
                            } else if (!class17.field380 || !class150.method983(39, class70.method436(arg1, 32))) {
                                class169[] var12 = var11.field1367;
                                if (class89.field1623) {
                                    var12 = class136.method921(-7884, var12);
                                }
                                if (class150.method983(121, class70.method436(arg1, 36))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class125.field2296++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 9;
                                            } else {
                                                var14 = 43;
                                            }
                                            class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var11.field1383 }), arg1.field2878, var6, var12[var13], -1, var14, var11.field1345);
                                        } else if (var13 == 4) {
                                            class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var11.field1383 }), arg1.field2878, var6, class135.field2524, -1, 43, var11.field1345);
                                            class120.field2210++;
                                        }
                                    }
                                }
                                if (class41.method264(class70.method436(arg1, 26), true)) {
                                    class179.field3485++;
                                    class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var11.field1383 }), arg1.field2878, var6, class73.field1368, -1, 19, var11.field1345);
                                }
                                if (class150.method983(-93, class70.method436(arg1, -106)) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class13.field305++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 41;
                                            }
                                            if (var15 == 1) {
                                                var16 = 23;
                                            }
                                            if (var15 == 2) {
                                                var16 = 39;
                                            }
                                            class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var11.field1383 }), arg1.field2878, var6, var12[var15], -1, var16, var11.field1345);
                                        }
                                    }
                                }
                                class169[] var17 = arg1.field2879;
                                class137.field2549++;
                                if (class89.field1623) {
                                    var17 = class136.method921(-7884, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class160.field3047++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 36;
                                            }
                                            if (var18 == 1) {
                                                var19 = 12;
                                            }
                                            if (var18 == 2) {
                                                var19 = 48;
                                            }
                                            if (var18 == 3) {
                                                var19 = 29;
                                            }
                                            if (var18 == 4) {
                                                var19 = 30;
                                            }
                                            class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var11.field1383 }), arg1.field2878, var6, var17[var18], -1, var19, var11.field1345);
                                        }
                                    }
                                }
                                class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var11.field1383 }), arg1.field2878, var6, class151.field2920, -1, 1002, var11.field1345);
                            } else if ((class11.field269 & 0x10) == 16) {
                                class145.field2692++;
                                class167.method1092(class165.method1058(0, new class169[] { class21.field455, class73.field1362, var11.field1383 }), arg1.field2878, var6, class137.field2551, -1, 2, var11.field1345);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg1.field2778) {
            return;
        }
        if (class17.field380) {
            if (class5.method33(class70.method436(arg1, 58), 114) && (class11.field269 & 0x20) == 32) {
                class167.method1092(class165.method1058(0, new class169[] { class21.field455, class51.field892, arg1.field2891 }), arg1.field2878, arg1.field2850, class137.field2551, -1, 57, 0);
                class187.field3642++;
                return;
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            class169 var24 = class95.method573(arg1, -69, var20);
            if (var24 != null) {
                class137.field2546++;
                class167.method1092(arg1.field2891, arg1.field2878, arg1.field2850, var24, -1, 1004, var20 + 1);
            }
        }
        class169 var21 = class148.method963(255, arg1);
        if (var21 != null) {
            class167.method1092(arg1.field2891, arg1.field2878, arg1.field2850, var21, -1, 18, 0);
            class131.field2442++;
        }
        for (int var22 = 4; var22 >= 0; var22--) {
            class169 var23 = class95.method573(arg1, -94, var22);
            if (var23 != null) {
                class137.field2546++;
                class167.method1092(arg1.field2891, arg1.field2878, arg1.field2850, var23, -1, 26, var22 + 1);
            }
        }
        if (class76.method469(class70.method436(arg1, 82), (byte) 121)) {
            class167.method1092(class45.field838, arg1.field2878, arg1.field2850, class4.field85, -1, 11, 0);
            class69.field1303++;
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static final void method191(boolean arg0) {
        if (class165.field3158[96]) {
            class175.field3426 += (-class175.field3426 - 24) / 2;
        } else if (class165.field3158[97]) {
            class175.field3426 += (24 - class175.field3426) / 2;
        } else {
            class175.field3426 /= 2;
        }
        if (class165.field3158[98]) {
            class81.field1499 += (12 - class81.field1499) / 2;
        } else if (class165.field3158[99]) {
            class81.field1499 += (-class81.field1499 - 12) / 2;
        } else {
            class81.field1499 /= 2;
        }
        class165.field3157 += class81.field1499 / 2;
        field568++;
        class29.field600 = class175.field3426 / 2 + class29.field600 & 0x7FF;
        if (class165.field3157 < 128) {
            class165.field3157 = 128;
        }
        int var1 = class4.field89 + class4.field79.field3698;
        if (class165.field3157 > 383) {
            class165.field3157 = 383;
        }
        int var2 = class6.field115 + class4.field79.field3679;
        if (class110.field2024 - var1 < -500 || class110.field2024 - var1 > 500 || class115.field2088 - var2 < -500 || class115.field2088 - var2 > 500) {
            class110.field2024 = var1;
            class115.field2088 = var2;
        }
        if (class110.field2024 != var1) {
            class110.field2024 += (var1 - class110.field2024) / 16;
        }
        if (class115.field2088 != var2) {
            class115.field2088 += (var2 - class115.field2088) / 16;
        }
        int var3 = class110.field2024 >> 7;
        int var4 = class115.field2088 >> 7;
        int var5 = class183.method1215(class110.field2024, class61.field1132, class115.field2088, 0);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class61.field1132;
                    if (var9 < 3 && (class159.field3040[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var5 - class139.field2588[var9][var7][var8];
                    if (var6 < var10) {
                        var6 = var10;
                    }
                }
            }
        }
        int var11 = var6 * 192;
        if (arg0) {
            return;
        }
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class35.field704 < var11) {
            class35.field704 += (var11 - class35.field704) / 24;
        } else if (var11 < class35.field704) {
            class35.field704 += (var11 - class35.field704) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method192(int arg0) {
        int var1 = -32 / ((59 - arg0) / 39);
        field571 = null;
    }
}
