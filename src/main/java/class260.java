import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class260 extends class259 {

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    public static int field3991 = 0;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "Ljk;")
    public static class297 field3988 = null;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "[I")
    public static int[] field3994 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!nl", name = "cb", descriptor = "[I")
    public static int[] field4000 = new int[500];

    @OriginalMember(owner = "client!nl", name = "eb", descriptor = "C")
    private char field4002;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!nl", name = "bb", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!nl", name = "db", descriptor = "Ljava/lang/String;")
    public String field4001;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIIIIII)V")
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class189.field2858 = 0;
        if (arg3 != 64) {
            return;
        }
        for (int var7 = -1; var7 < class266.field4155 + class207.field3093; var7++) {
            class25 var23;
            if (var7 == -1) {
                var23 = class185.field2687;
            } else if (class266.field4155 > var7) {
                var23 = class166.field2438[class205.field3068[var7]];
            } else {
                var23 = class243.field3762[class285.field4379[var7 - class266.field4155]];
            }
            if (var23 != null && var23.method173((byte) 109)) {
                if (var23 instanceof class87) {
                    class189 var24 = ((class87) var23).field1323;
                    if (var24.field2829 != null) {
                        var24 = var24.method1257(-32207);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class266.field4155 <= var7) {
                    class189 var30 = ((class87) var23).field1323;
                    if (var30.field2829 != null) {
                        var30 = var30.method1257(arg3 - 32271);
                    }
                    if (var30.field2816 >= 0 && class89.field1347.length > var30.field2816) {
                        int var31;
                        if (var30.field2831 == -1) {
                            var31 = var23.method174((byte) 36) + 15;
                        } else {
                            var31 = var30.field2831 + 15;
                        }
                        class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, arg3 ^ 0xFFFF9104, arg4, var31);
                        if (class224.field3479 > -1) {
                            class89.field1347[var30.field2816].method1230(class224.field3479 + arg0 - 12, arg1 + -30 - -class125.field1845);
                        }
                    }
                    class130[] var32 = class234.field3610;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class130 var48 = var32[var33];
                        if (var48 != null && var48.field1913 == 1 && class285.field4379[var7 - class266.field4155] == var48.field1904 && (class120.field1794 % 20) < 10) {
                            int var49;
                            if (var30.field2831 == -1) {
                                var49 = var23.method174((byte) 36) + 15;
                            } else {
                                var49 = var30.field2831 + 15;
                            }
                            class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, -28348, arg4, var49);
                            if (class224.field3479 > -1) {
                                class135.field1974[var48.field1918].method1230(arg0 + class224.field3479 - 12, class125.field1845 + arg1 + -28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class224 var26 = (class224) var23;
                    if (var26.field3493 != -1 || var26.field3509 != -1) {
                        class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, -28348, arg4, var23.method174((byte) 36) + 15);
                        if (class224.field3479 > -1) {
                            if (var26.field3493 != -1) {
                                class15.field224[var26.field3493].method1230(class224.field3479 + arg0 - 12, arg1 - (-class125.field1845 + var25));
                                var25 += 25;
                            }
                            if (var26.field3509 != -1) {
                                class89.field1347[var26.field3509].method1230(class224.field3479 + arg0 - 12, arg1 - -class125.field1845 + -var25);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var27 = 0;
                        class130[] var28 = class234.field3610;
                        while (var27 < var28.length) {
                            class130 var29 = var28[var27];
                            if (var29 != null && var29.field1913 == 10 && class205.field3068[var7] == var29.field1904) {
                                class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, -28348, arg4, var23.method174((byte) 36) + 15);
                                if (class224.field3479 > -1) {
                                    class135.field1974[var29.field1918].method1230(arg0 - (12 - class224.field3479), arg1 - var25 + class125.field1845);
                                }
                            }
                            var27++;
                        }
                    }
                }
                if (var23.field429 != null && (var7 >= class266.field4155 || class208.field3114 == 0 || class208.field3114 == 3 || class208.field3114 == 1 && class280.method1859(((class224) var23).field3488, true))) {
                    class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, -28348, arg4, var23.method174((byte) 36));
                    if (class224.field3479 > -1 && class189.field2858 < class245.field3810) {
                        class245.field3821[class189.field2858] = class105.field1555.method1293(var23.field429) / 2;
                        class245.field3793[class189.field2858] = class105.field1555.field2906;
                        class245.field3799[class189.field2858] = class224.field3479;
                        class245.field3807[class189.field2858] = class125.field1845;
                        class245.field3808[class189.field2858] = var23.field489;
                        class245.field3812[class189.field2858] = var23.field496;
                        class245.field3797[class189.field2858] = var23.field451;
                        class245.field3809[class189.field2858] = var23.field429;
                        class189.field2858++;
                    }
                }
                if (var23.field487 > class120.field1794) {
                    class256 var34 = class146.field2115[0];
                    class256 var35 = class146.field2115[1];
                    int var36;
                    if ((var23 instanceof class87)) {
                        class87 var37 = (class87) var23;
                        class256[] var38 = (class256[]) class166.field2446.method945((long) var37.field1323.field2841, true);
                        if (var38 == null) {
                            var38 = class245.method1669(23971, 0, class36.field637, var37.field1323.field2841);
                            if (var38 != null) {
                                class166.field2446.method941(var38, (long) var37.field1323.field2841, arg3 - 8511);
                            }
                        }
                        class189 var39 = var37.field1323;
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[1];
                            var34 = var38[0];
                        }
                        if (var39.field2831 == -1) {
                            var36 = var23.method174((byte) 36);
                        } else {
                            var36 = var39.field2831;
                        }
                    } else {
                        var36 = var23.method174((byte) 36);
                    }
                    class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, -28348, arg4, var36 + var34.field3936 + 10);
                    if (class224.field3479 > -1) {
                        int var40 = class224.field3479 + arg0 - (var34.field3948 >> 1);
                        int var41 = arg1 + class125.field1845 - 3;
                        var34.method1230(var40, var41);
                        int var42 = var34.field3936;
                        int var43 = var23.field406 * var34.field3948 / 255;
                        class72.method570(var40, var41, var40 + var43, var41 + var42);
                        var35.method1230(var40, var41);
                        class72.method567(arg0, arg1, arg0 + arg6, arg1 - -arg2);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field466[var44] > class120.field1794) {
                        int var47;
                        if (var23 instanceof class87) {
                            class87 var45 = (class87) var23;
                            class189 var46 = var45.field1323;
                            if (var46.field2831 == -1) {
                                var47 = var23.method174((byte) 36) / 2;
                            } else {
                                var47 = var46.field2831 / 2;
                            }
                        } else {
                            var47 = var23.method174((byte) 36) / 2;
                        }
                        class34.method232(var23, arg6 >> 1, arg2 >> 1, arg5, -28348, arg4, var47);
                        if (class224.field3479 > -1) {
                            if (var44 == 1) {
                                class125.field1845 -= 20;
                            }
                            if (var44 == 2) {
                                class125.field1845 -= 10;
                                class224.field3479 -= 15;
                            }
                            if (var44 == 3) {
                                class125.field1845 -= 10;
                                class224.field3479 += 15;
                            }
                            class151.field2216[var23.field482[var44]].method1230(arg0 + class224.field3479 - 12, class125.field1845 + arg1 + -12);
                            class246.field3835.method1303(Integer.toString(var23.field424[var44]), arg0 - (1 - class224.field3479), class125.field1845 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field3992++;
        for (int var8 = 0; var8 < class189.field2858; var8++) {
            int var9 = class245.field3799[var8];
            int var10 = class245.field3807[var8];
            int var11 = class245.field3793[var8];
            int var12 = class245.field3821[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class245.field3807[var22] - class245.field3793[var22] < var10 - -2 && var10 - var11 < class245.field3807[var22] + 2 && class245.field3821[var22] + class245.field3799[var22] > -var12 + var9 && (var9 + var12) > (class245.field3799[var22] - class245.field3821[var22]) && class245.field3807[var22] - class245.field3793[var22] < var10) {
                        var13 = true;
                        var10 = class245.field3807[var22] - class245.field3793[var22];
                    }
                }
            }
            class224.field3479 = class245.field3799[var8];
            class125.field1845 = class245.field3807[var8] = var10;
            String var14 = class245.field3809[var8];
            if (class62.field1033 == 0) {
                int var15 = 16776960;
                if (class245.field3808[var8] < 6) {
                    var15 = class293.field4439[class245.field3808[var8]];
                }
                if (class245.field3808[var8] == 6) {
                    var15 = (class113.field1723 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class245.field3808[var8] == 7) {
                    var15 = class113.field1723 % 20 >= 10 ? 65535 : 255;
                }
                if (class245.field3808[var8] == 8) {
                    var15 = class113.field1723 % 20 < 10 ? 45056 : 8454016;
                }
                if (class245.field3808[var8] == 9) {
                    int var16 = 150 - class245.field3797[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = ((var16 - 100) * 5) + 65280;
                    }
                }
                if (class245.field3808[var8] == 10) {
                    int var17 = 150 - class245.field3797[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 33095935 - var17 * 327680;
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 255 - ((var17 - 100) * 5);
                    }
                }
                if (class245.field3808[var8] == 11) {
                    int var18 = 150 - class245.field3797[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 + 65280 - 16384250;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class245.field3812[var8] == 0) {
                    class105.field1555.method1303(var14, class224.field3479 + arg0, class125.field1845 + arg1, var15, 0);
                }
                if (class245.field3812[var8] == 1) {
                    class105.field1555.method1304(var14, arg0 + class224.field3479, class125.field1845 + arg1, var15, 0, class113.field1723);
                }
                if (class245.field3812[var8] == 2) {
                    class105.field1555.method1296(var14, class224.field3479 + arg0, class125.field1845 + arg1, var15, 0, class113.field1723);
                }
                if (class245.field3812[var8] == 3) {
                    class105.field1555.method1294(var14, arg0 + class224.field3479, arg1 - -class125.field1845, var15, 0, class113.field1723, 150 - class245.field3797[var8]);
                }
                if (class245.field3812[var8] == 4) {
                    int var19 = (150 - class245.field3797[var8]) * (class105.field1555.method1293(var14) + 100) / 150;
                    class72.method570(arg0 + class224.field3479 - 50, arg1, class224.field3479 + arg0 + 50, arg1 + arg2);
                    class105.field1555.method1291(var14, arg0 + class224.field3479 + 50 - var19, class125.field1845 + arg1, var15, 0);
                    class72.method567(arg0, arg1, arg0 + arg6, arg1 - -arg2);
                }
                if (class245.field3812[var8] == 5) {
                    int var20 = 150 - class245.field3797[var8];
                    class72.method570(arg0, class125.field1845 + arg1 - class105.field1555.field2906 - 1, arg0 + arg6, class125.field1845 + arg1 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class105.field1555.method1303(var14, class224.field3479 + arg0, arg1 - (-class125.field1845 + -var21), var15, 0);
                    class72.method567(arg0, arg1, arg0 + arg6, arg1 - -arg2);
                }
            } else {
                class105.field1555.method1303(var14, arg0 + class224.field3479, class125.field1845 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILca;B)V")
    private final void method1749(int arg0, class54 arg1, byte arg2) {
        field3989++;
        if (arg2 != 89) {
            method1753(false, -76, -44, 53, -4, 33, true);
        }
        if (arg0 == 1) {
            this.field4002 = class1.method1((byte) 19, arg1.method459(false));
        } else if (arg0 == 2) {
            this.field3997 = arg1.method420((byte) 122);
            return;
        } else if (arg0 == 5) {
            this.field4001 = arg1.method439((byte) 104);
            return;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)Lwh;")
    public static final class289 method1750(byte arg0) {
        field3998++;
        byte[] var1 = class209.field3125[0];
        if (arg0 != -99) {
            field3994 = null;
        }
        int var2 = class27.field525[0] * class173.field2530[0];
        class289 var5;
        if (class210.field3134[0]) {
            byte[] var6 = class82.field1270[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class186.method1215(class15.field221[class131.method904(255, var1[var8])], class131.method904(255, var6[var8]) << 24);
            }
            var5 = new class187(client.field729, class126.field1857, class135.field1973[0], class5.field69[0], class27.field525[0], class173.field2530[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class15.field221[class131.method904(var1[var4], 255)];
            }
            var5 = new class289(client.field729, class126.field1857, class135.field1973[0], class5.field69[0], class27.field525[0], class173.field2530[0], var3);
        }
        class293.method1936(-62);
        return var5;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZI)V")
    public static final void method1751(int arg0, boolean arg1, boolean arg2, int arg3) {
        int var10002;
        for (int var4 = 0; var4 < class207.field3093; var4++) {
            class87 var21 = class243.field3762[class285.field4379[var4]];
            if (var21 != null && var21.method173((byte) 109) && var21.field1323.method1258((byte) 38)) {
                int var22 = var21.method168(-82);
                if (arg1) {
                    if (!var21.field1323.field2842) {
                        continue;
                    }
                } else if (arg2 != var21.field1323.field2815 || arg3 != 0 && arg3 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field425 & 0x7F) == 64 && (var21.field455 & 0x7F) == 64) {
                        int var23 = var21.field425 >> 7;
                        int var24 = var21.field455 >> 7;
                        if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                            var10002 = class273.field4231[var23][var24]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field425 & 0x7F) == 0 && (var21.field455 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field425 & 0x7F) == 64 && (var21.field455 & 0x7F) == 64)) {
                    int var25 = var21.field425 - (var22 * 64) >> 7;
                    int var26 = var21.field455 - var22 * 64 >> 7;
                    int var27 = var25 + var21.method168(arg0 ^ 0xFFFFFFE7);
                    int var28 = var26 + var21.method168(arg0 ^ 0xFFFFFFC9);
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    for (int var29 = var25; var29 < var27; var29++) {
                        for (int var30 = var26; var30 < var28; var30++) {
                            var10002 = class273.field4231[var29][var30]++;
                        }
                    }
                }
            }
        }
        field3993++;
        if (arg0 != 104) {
            return;
        }
        label210: for (int var5 = 0; var5 < class207.field3093; var5++) {
            class87 var6 = class243.field3762[class285.field4379[var5]];
            long var7 = (long) class285.field4379[var5] << 32 | 0x20000000L;
            if (var6 != null && var6.method173((byte) 109) && var6.field1323.method1258((byte) 38)) {
                int var9 = var6.method168(arg0 - 199);
                if (arg1) {
                    if (!var6.field1323.field2842) {
                        continue;
                    }
                } else if (var6.field1323.field2815 != arg2 || arg3 != 0 && arg3 != var9) {
                    continue;
                }
                var6.field454 = true;
                if (var9 == 1) {
                    if ((var6.field425 & 0x7F) == 64 && (var6.field455 & 0x7F) == 64) {
                        int var19 = var6.field425 >> 7;
                        int var20 = var6.field455 >> 7;
                        if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                            continue;
                        }
                        if (class273.field4231[var19][var20] > 1) {
                            var10002 = class273.field4231[var19][var20]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var6.field425 & 0x7F) == 0 && (var6.field455 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var6.field425 & 0x7F) == 64 && (var6.field455 & 0x7F) == 64) {
                    int var10 = var6.field425 - (var9 * 64) >> 7;
                    int var11 = var9 + var10;
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    int var12 = var6.field455 - var9 * 64 >> 7;
                    int var13 = var9 + var12;
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    boolean var14 = true;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    for (int var15 = var10; var15 < var11; var15++) {
                        for (int var18 = var12; var18 < var13; var18++) {
                            if (class273.field4231[var15][var18] <= 1) {
                                var14 = false;
                                break;
                            }
                        }
                    }
                    if (var14) {
                        int var16 = var10;
                        while (true) {
                            if (var11 <= var16) {
                                continue label210;
                            }
                            for (int var17 = var12; var17 < var13; var17++) {
                                var10002 = class273.field4231[var16][var17]--;
                            }
                            var16++;
                        }
                    }
                }
                if (!var6.field1323.field2849) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field454 = false;
                var6.field411 = class268.method1810(field3986, var6.field425, (byte) 118, var6.field455);
                class232.method1579(field3986, var6.field425, var6.field455, var6.field411, (var9 - 1) * 64 + 60, var6, var6.field471, var7, var6.field398);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V")
    public static void method1752(int arg0) {
        if (arg0 != 3807) {
            method1758(93, (class237) null, true, 19);
        }
        field3988 = null;
        field4000 = null;
        field3994 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIIIIIZ)V")
    public static final void method1753(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3996++;
        if (arg2 == 3) {
            method1753(true, -1, class124.field1840, 2953, -1, arg5, true);
            return;
        }
        if (arg3 != 2953) {
            method1753(false, -65, 48, 8, 76, -92, false);
        }
        Container var7;
        if (class247.field3838 != null) {
            var7 = class247.field3838;
        } else if (class167.field2459 == null) {
            var7 = class217.field3338.field505;
        } else {
            var7 = class167.field2459;
        }
        class145.field2099 = var7.getSize().width;
        class23.field385 = var7.getSize().height;
        if (class167.field2459 == var7) {
            Insets var8 = class167.field2459.getInsets();
            class145.field2099 -= var8.right + var8.left;
            class23.field385 -= var8.top + var8.bottom;
        }
        if (arg2 < 2) {
            class208.field3118 = (class145.field2099 - 765) / 2;
            class199.field2989 = 0;
            class85.field1311 = 503;
            class126.field1854 = 765;
        } else {
            class85.field1311 = class23.field385;
            class199.field2989 = 0;
            class208.field3118 = 0;
            class126.field1854 = class145.field2099;
        }
        if (arg0) {
            class177.method1171(class297.field4569, -1);
            class104.method755(arg3 ^ 0xB76, class297.field4569);
            if (class265.field4141 != null) {
                class265.field4141.method1652((byte) 112, class297.field4569);
            }
            class163.field2378.method1394(118);
            class21.method150(class297.field4569, 70);
            class133.method915(52, class297.field4569);
            if (class265.field4141 != null) {
                class265.field4141.method1653(class297.field4569, -1);
            }
        } else {
            class297.field4569.setSize(class126.field1854, class85.field1311);
            if (class167.field2459 == var7) {
                Insets var9 = class167.field2459.getInsets();
                class297.field4569.setLocation(var9.left + class208.field3118, class199.field2989 + var9.top);
            } else {
                class297.field4569.setLocation(class208.field3118, class199.field2989);
            }
        }
        if (arg2 > 0) {
            method1753(true, -1, 0, 2953, -1, arg5, true);
            return;
        }
        class150.field2187 = !class101.method741(-6425);
        if (class184.field2677 != -1) {
            class178.method1177(false, true);
        }
        if (class22.field369 != null && (class42.field742 == 30 || class42.field742 == 25)) {
            class36.method284(-119);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class17.field315[var10] = true;
        }
        class100.field1456 = true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V")
    public static final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3990++;
        class270 var5 = (class270) class155.field2273.method306((long) arg1, 16216);
        if (var5 == null) {
            var5 = new class270();
            class155.field2273.method309((byte) -8, var5, (long) arg1);
        }
        if (arg2 >= -66) {
            field3994 = null;
        }
        if (arg3 >= var5.field4213.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field4213.length; var8++) {
                var6[var8] = var5.field4213[var8];
                var7[var8] = var5.field4216[var8];
            }
            for (int var9 = var5.field4213.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4216 = var7;
            var5.field4213 = var6;
        }
        var5.field4213[arg3] = arg4;
        var5.field4216[arg3] = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lca;I)V")
    public final void method1755(class54 arg0, int arg1) {
        if (arg1 != -1) {
            method1759(-87, (String) null, -48, (String) null);
        }
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                field3987++;
                return;
            }
            this.method1749(var3, arg0, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)Z")
    public final boolean method1756(int arg0) {
        if (arg0 != 115) {
            this.method1756(17);
        }
        field3999++;
        return this.field4002 == 's';
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(IIIIIII)V")
    public static final void method1757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class30 var7 = new class30();
        var7.field557 = arg1 / 128;
        var7.field541 = arg2 / 128;
        var7.field546 = arg3 / 128;
        var7.field553 = arg4 / 128;
        var7.field562 = arg0;
        var7.field543 = arg1;
        var7.field560 = arg2;
        var7.field549 = arg3;
        var7.field545 = arg4;
        var7.field547 = arg5;
        var7.field563 = arg6;
        class130.field1920[class259.field3971++] = var7;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILpk;ZI)[Ljd;")
    public static final class227[] method1758(int arg0, class237 arg1, boolean arg2, int arg3) {
        field3985++;
        if (!arg2) {
            field3984 = -7;
        }
        return class223.method1526(arg3, arg0, (byte) 112, arg1) ? class73.method586(95) : null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1759(int arg0, String arg1, int arg2, String arg3) {
        class163.method1105(-1, arg2 ^ -2566, arg0, arg1, arg3, (String) null);
        if (arg2 != 128) {
            field3988 = null;
        }
        field3995++;
    }
}
