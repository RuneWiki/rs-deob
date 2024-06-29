import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class156 {

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Ldf;")
    private static class51 field2575 = class46.method233("Loading )2 please wait)3", 100);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Ldf;")
    public static class51 field2569 = field2575;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[I")
    public static int[] field2579 = new int[500];

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field2584 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Z")
    public static boolean field2578 = false;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lja;")
    public static class55 field2570;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[Ljg;")
    public static class158[] field2567;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[Ltg;")
    public static class171[] field2573;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public abstract void method1110(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field2571++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class76.field1219[var12][var31] = 0;
                class157.field2600[var12][var31] = 99999999;
            }
        }
        class76.field1219[arg3][arg7] = 99;
        class157.field2600[arg3][arg7] = 0;
        int var13 = arg3;
        if (arg10 != 16362) {
            field2567 = null;
        }
        int var14 = arg7;
        int var15 = 0;
        byte var16 = 0;
        class159.field2609[var16] = arg3;
        int var32 = var16 + 1;
        class191.field3200[var16] = arg7;
        boolean var17 = false;
        int[][] var18 = class159.field2605[class257.field4496].field2787;
        while (var15 != var32) {
            var14 = class191.field3200[var15];
            var13 = class159.field2609[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg6 == var13 && arg2 == var14) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class159.field2605[class257.field4496].method1180(arg9 - 1, arg1, (byte) -77, var13, 2, var14, arg2, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class159.field2605[class257.field4496].method1197(var14, 112, 2, arg1, arg2, arg9 - 1, var13, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg5 != 0 && class159.field2605[class257.field4496].method1183(arg6, arg5, var14, arg0, -1, 2, arg2, var13, arg8)) {
                var17 = true;
                break;
            }
            int var30 = class157.field2600[var13][var14] + 1;
            if (var13 > 0 && class76.field1219[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class159.field2609[var32] = var13 - 1;
                class191.field3200[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class76.field1219[var13 - 1][var14] = 2;
                class157.field2600[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class76.field1219[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class159.field2609[var32] = var13 + 1;
                class191.field3200[var32] = var14;
                class76.field1219[var13 + 1][var14] = 8;
                class157.field2600[var13 + 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class76.field1219[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class159.field2609[var32] = var13;
                class191.field3200[var32] = var14 - 1;
                class76.field1219[var13][var14 - 1] = 1;
                class157.field2600[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class76.field1219[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class159.field2609[var32] = var13;
                class191.field3200[var32] = var14 + 1;
                class76.field1219[var13][var14 + 1] = 4;
                class157.field2600[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class76.field1219[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class159.field2609[var32] = var13 - 1;
                class191.field3200[var32] = var14 - 1;
                class76.field1219[var13 - 1][var14 - 1] = 3;
                class157.field2600[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class76.field1219[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class159.field2609[var32] = var13 + 1;
                class191.field3200[var32] = var14 - 1;
                class76.field1219[var13 + 1][var14 - 1] = 9;
                class157.field2600[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 102 && class76.field1219[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class159.field2609[var32] = var13 - 1;
                class191.field3200[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class76.field1219[var13 - 1][var14 + 1] = 6;
                class157.field2600[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class76.field1219[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class159.field2609[var32] = var13 + 1;
                class191.field3200[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class76.field1219[var13 + 1][var14 + 1] = 12;
                class157.field2600[var13 + 1][var14 + 1] = var30;
            }
        }
        class45.field724 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg6 - var21; var22 <= arg6 + var21; var22++) {
                for (int var23 = arg2 - var21; var23 <= (arg2 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class157.field2600[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 < arg2) {
                            var25 = arg2 - var23;
                        } else if ((arg2 + arg5 - 1) < var23) {
                            var25 = var23 - (arg5 - 1) - arg2;
                        }
                        if (var22 < arg6) {
                            var24 = arg6 - var22;
                        } else if (var22 > arg0 + arg6 - 1) {
                            var24 = var22 + 1 - arg0 - arg6;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && class157.field2600[var22][var23] < var20) {
                            var19 = var26;
                            var20 = class157.field2600[var22][var23];
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg7 == var14) {
                return false;
            }
            class45.field724 = 1;
        }
        byte var27 = 0;
        class159.field2609[var27] = var13;
        int var33 = var27 + 1;
        class191.field3200[var27] = var14;
        int var28;
        int var29 = var28 = class76.field1219[var13][var14];
        while (arg3 != var13 || arg7 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class159.field2609[var33] = var13;
                class191.field3200[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class76.field1219[var13][var14];
        }
        if (var33 > 0) {
            class175.method1227(var33, arg4, arg10 + 13661);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Lwc;IIIIIIII)V")
    public static final void method1112(int arg0, class213[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2580++;
        class59.method390(arg3, arg6, arg9, arg5);
        class73.method527();
        if (arg2 != 20569) {
            return;
        }
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class213 var11 = arg1[var10];
            if (var11 != null && (var11.field3689 == arg0 || arg0 == -1412584499 && class136.field2257 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class41.field663[class167.field2713] = var11.field3605 + arg7;
                    class237.field4124[class167.field2713] = var11.field3629 + arg8;
                    class62.field1014[class167.field2713] = var11.field3603;
                    class87.field1460[class167.field2713] = var11.field3608;
                    var12 = class167.field2713++;
                } else {
                    var12 = arg4;
                }
                var11.field3613 = class179.field2960;
                var11.field3680 = var12;
                if (!var11.field3574 || !client.method1052(var11)) {
                    if (var11.field3640 > 0) {
                        class67.method473(-32768, var11);
                    }
                    int var13 = var11.field3629 + arg8;
                    int var14 = var11.field3605 + arg7;
                    int var15 = var11.field3688;
                    if (class79.field1263 && (client.method1061(var11) != 0 || var11.field3623 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class136.field2257 == var11) {
                        if (arg0 != -1412584499 && !var11.field3573) {
                            class242.field4191 = arg8;
                            class82.field1369 = arg1;
                            class41.field641 = arg7;
                            continue;
                        }
                        if (!var11.field3573) {
                            var15 = 128;
                        }
                        if (class43.field690 && class83.field1390) {
                            int var16 = class90.field1504;
                            int var17 = class89.field1482;
                            int var18 = var16 - class193.field3241;
                            int var19 = var17 - class36.field563;
                            if (var19 < class38.field594) {
                                var19 = class38.field594;
                            }
                            if (class38.field594 + class140.field2359.field3603 < var11.field3603 + var19) {
                                var19 = class38.field594 + class140.field2359.field3603 - var11.field3603;
                            }
                            var14 = var19;
                            if (class21.field305 > var18) {
                                var18 = class21.field305;
                            }
                            if (class21.field305 + class140.field2359.field3608 < var11.field3608 + var18) {
                                var18 = class140.field2359.field3608 + class21.field305 - var11.field3608;
                            }
                            var13 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3623 == 2) {
                        var20 = arg5;
                        var21 = arg6;
                        var22 = arg9;
                        var23 = arg3;
                    } else {
                        int var24 = var11.field3608 + var13;
                        var23 = var14 > arg3 ? var14 : arg3;
                        var21 = var13 <= arg6 ? arg6 : var13;
                        int var25 = var11.field3603 + var14;
                        if (var11.field3623 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = arg5 <= var24 ? arg5 : var24;
                        var22 = var25 >= arg9 ? arg9 : var25;
                    }
                    if (!var11.field3574 || var23 < var22 && var21 < var20) {
                        if (var11.field3640 != 0) {
                            if (var11.field3640 == 1337) {
                                class37.field564 = var14;
                                class243.field4207 = var11;
                                class78.field1248 = var13;
                                class34.method169(var11.field3608, true, var14, var11.field3640 == 1403, var13, var11.field3603);
                                class59.method390(arg3, arg6, arg9, arg5);
                                continue;
                            }
                            if (var11.field3640 == 1338) {
                                if (var11.method1465(false)) {
                                    class196.method1385(var12, false, var13, var11, var14);
                                    class59.method390(arg3, arg6, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3640 == 1339) {
                                if (var11.method1465(false)) {
                                    class10.method52(var14, var13, var12, var11, (byte) -112);
                                    class59.method390(arg3, arg6, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3640 == 1400) {
                                class230.method1585(var11.field3603, var13, arg2 - 40739, var11.field3608, var14);
                                class213.field3705[var12] = true;
                                class42.field681[var12] = true;
                                class59.method390(arg3, arg6, arg9, arg5);
                                continue;
                            }
                            if (var11.field3640 == 1401) {
                                class174.method1224(var11.field3608, var13, var11.field3603, -112, var14);
                                class213.field3705[var12] = true;
                                class42.field681[var12] = true;
                                class59.method390(arg3, arg6, arg9, arg5);
                                continue;
                            }
                            if (var11.field3640 == 1402) {
                                class171.method1198(var14, true, var13);
                                class213.field3705[var12] = true;
                                class42.field681[var12] = true;
                                continue;
                            }
                            if (var11.field3640 == 1404) {
                                class85.method658(arg2 - 45474, var11, var11.field3608, var11.field3603, var14, var13, class4.field34, class239.field4161);
                                class213.field3705[var12] = true;
                                class42.field681[var12] = true;
                                continue;
                            }
                            if (var11.field3640 == 1405) {
                                if (class172.field2812) {
                                    int var26 = var13 + 15;
                                    int var27 = var11.field3603 + var14;
                                    int var28 = 16776960;
                                    class177.field2891.method1316(class20.method104(arg2 - 20659, new class51[] { class105.field1733, class51.method311(class135.field2247, 10) }), var27, var26, 16776960, -1);
                                    int var107 = var26 + 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    if (var30 > 65536) {
                                        var28 = 16711680;
                                    }
                                    class177.field2891.method1316(class20.method104(99, new class51[] { class25.field371, class51.method311(var30, 10), class43.field687 }), var27, var107, var28, -1);
                                    class213.field3705[var12] = true;
                                    var26 = var107 + 15;
                                    class42.field681[var12] = true;
                                }
                                continue;
                            }
                        }
                        if (!class90.field1498) {
                            if (var11.field3623 == 0 && var11.field3562 && var23 <= class264.field4616 && var21 <= class191.field3203 && var22 > class264.field4616 && class191.field3203 < var20 && !class79.field1263) {
                                class39.field616 = 1;
                                class129.field2166[0] = class97.field1628;
                                class77.field1235[0] = class43.field696;
                                class67.field1103[0] = 1005;
                            }
                            if (var23 <= class264.field4616 && class191.field3203 >= var21 && var22 > class264.field4616 && class191.field3203 < var20) {
                                class101.method742(class191.field3203 - var13, false, class264.field4616 - var14, var11);
                            }
                        }
                        if (var11.field3623 == 0) {
                            if (!var11.field3574 && client.method1052(var11) && class29.field416 != var11) {
                                continue;
                            }
                            if (!var11.field3574) {
                                if (var11.field3546 - var11.field3608 < var11.field3593) {
                                    var11.field3593 = var11.field3546 - var11.field3608;
                                }
                                if (var11.field3593 < 0) {
                                    var11.field3593 = 0;
                                }
                            }
                            method1112(var11.field3703, arg1, 20569, var23, var12, var20, var21, var14 - var11.field3648, -var11.field3593 + var13, var22);
                            if (var11.field3556 != null) {
                                method1112(var11.field3703, var11.field3556, 20569, var23, var12, var20, var21, var14 - var11.field3648, -var11.field3593 + var13, var22);
                            }
                            class42 var31 = (class42) class79.field1265.method1453((long) var11.field3703, 1);
                            if (var31 != null) {
                                if (var31.field672 == 0 && !class90.field1498 && class264.field4616 >= var23 && class191.field3203 >= var21 && class264.field4616 < var22 && class191.field3203 < var20 && !class79.field1263) {
                                    class67.field1103[0] = 1005;
                                    class39.field616 = 1;
                                    class129.field2166[0] = class97.field1628;
                                    class77.field1235[0] = class43.field696;
                                }
                                class8.method41(var21, var20, (byte) 50, var22, var23, var12, var13, var14, var31.field668);
                            }
                            class59.method390(arg3, arg6, arg9, arg5);
                            class73.method527();
                        }
                        if (class93.field1547[var12] || class90.field1487 > 1) {
                            if (var11.field3623 == 0 && !var11.field3574 && var11.field3546 > var11.field3608) {
                                class92.method697(var13, var11.field3608, var11.field3593, var11.field3603 + var14, -7286, var11.field3546);
                            }
                            if (var11.field3623 != 1) {
                                if (var11.field3623 == 2) {
                                    int var32 = 0;
                                    for (int var33 = 0; var33 < var11.field3694; var33++) {
                                        for (int var34 = 0; var34 < var11.field3540; var34++) {
                                            int var35 = (var11.field3678 + 32) * var34 + var14;
                                            int var36 = (var11.field3670 + 32) * var33 + var13;
                                            if (var32 < 20) {
                                                var35 += var11.field3554[var32];
                                                var36 += var11.field3646[var32];
                                            }
                                            if (var11.field3543[var32] > 0) {
                                                boolean var38 = false;
                                                boolean var39 = false;
                                                int var40 = var11.field3543[var32] - 1;
                                                if ((var35 + 32) > arg3 && arg9 > var35 && arg6 < var36 + 32 && arg5 > var36 || class78.field1246 == var11 && class157.field2595 == var32) {
                                                    class171 var41;
                                                    if (class175.field2871 == 1 && class145.field2418 == var32 && class261.field4559 == var11.field3703) {
                                                        var41 = class57.method366(var11.field3643, 2, var40, var11.field3587[var32], 0, (byte) 125);
                                                    } else {
                                                        var41 = class57.method366(var11.field3643, 1, var40, var11.field3587[var32], 3153952, (byte) 124);
                                                    }
                                                    if (class73.field1156) {
                                                        class213.field3705[var12] = true;
                                                    }
                                                    if (var41 == null) {
                                                        class25.method135(var11, -28014);
                                                    } else if (class78.field1246 == var11 && class157.field2595 == var32) {
                                                        int var42 = class90.field1504 - class132.field2205;
                                                        int var43 = class89.field1482 - class163.field2680;
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (class182.field3007 < 5) {
                                                            var42 = 0;
                                                            var43 = 0;
                                                        }
                                                        var41.method1095(var35 + var43, var36 - -var42, 128);
                                                        if (arg0 != -1) {
                                                            class213 var44 = arg1[arg0 & 0xFFFF];
                                                            int var45 = class59.field961;
                                                            int var46 = class59.field964;
                                                            if (var46 > var36 + var42 && var44.field3593 > 0) {
                                                                int var47 = (var46 - var36 - var42) * class225.field3945 / 3;
                                                                if (var47 > (class225.field3945 * 10)) {
                                                                    var47 = class225.field3945 * 10;
                                                                }
                                                                if (var44.field3593 < var47) {
                                                                    var47 = var44.field3593;
                                                                }
                                                                var44.field3593 -= var47;
                                                                class132.field2205 += var47;
                                                                class25.method135(var44, -28014);
                                                            }
                                                            if (var45 < (var42 + var36 + 32) && (var44.field3546 - var44.field3608) > var44.field3593) {
                                                                int var48 = (var36 + var42 + 32 - var45) * class225.field3945 / 3;
                                                                if (var48 > class225.field3945 * 10) {
                                                                    var48 = class225.field3945 * 10;
                                                                }
                                                                if (var44.field3546 - var44.field3608 - var44.field3593 < var48) {
                                                                    var48 = var44.field3546 - var44.field3608 - var44.field3593;
                                                                }
                                                                class132.field2205 -= var48;
                                                                var44.field3593 += var48;
                                                                class25.method135(var44, -28014);
                                                            }
                                                        }
                                                    } else if (class243.field4205 == var11 && class69.field1109 == var32) {
                                                        var41.method1095(var35, var36, 128);
                                                    } else {
                                                        var41.method1103(var35, var36);
                                                    }
                                                }
                                            } else if (var11.field3686 != null && var32 < 20) {
                                                class171 var37 = var11.method1460(-122, var32);
                                                if (var37 != null) {
                                                    var37.method1103(var35, var36);
                                                } else if (class182.field3001) {
                                                    class25.method135(var11, -28014);
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                } else if (var11.field3623 == 3) {
                                    int var49;
                                    if (class157.method1118(-123, var11)) {
                                        var49 = var11.field3659;
                                        if (class29.field416 == var11 && var11.field3632 != 0) {
                                            var49 = var11.field3632;
                                        }
                                    } else {
                                        var49 = var11.field3550;
                                        if (class29.field416 == var11 && var11.field3654 != 0) {
                                            var49 = var11.field3654;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3596) {
                                            class59.method393(var14, var13, var11.field3603, var11.field3608, var49);
                                        } else {
                                            class59.method375(var14, var13, var11.field3603, var11.field3608, var49);
                                        }
                                    } else if (var11.field3596) {
                                        class59.method387(var14, var13, var11.field3603, var11.field3608, var49, 256 - (var15 & 0xFF));
                                    } else {
                                        class59.method383(var14, var13, var11.field3603, var11.field3608, var49, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3623 == 4) {
                                    class187 var50 = var11.method1457((byte) 125, class93.field1551);
                                    if (var50 != null) {
                                        class51 var51 = var11.field3627;
                                        int var52;
                                        if (class157.method1118(112, var11)) {
                                            var52 = var11.field3659;
                                            if (class29.field416 == var11 && var11.field3632 != 0) {
                                                var52 = var11.field3632;
                                            }
                                            if (var11.field3588.method293(false) > 0) {
                                                var51 = var11.field3588;
                                            }
                                        } else {
                                            var52 = var11.field3550;
                                            if (class29.field416 == var11 && var11.field3654 != 0) {
                                                var52 = var11.field3654;
                                            }
                                        }
                                        if (var11.field3574 && var11.field3571 != -1) {
                                            class222 var53 = class219.method1508(var11.field3571, (byte) -54);
                                            var51 = var53.field3907;
                                            if (var51 == null) {
                                                var51 = class31.field451;
                                            }
                                            if ((var53.field3913 == 1 || var11.field3578 != 1) && var11.field3578 != -1) {
                                                var51 = class20.method104(arg2 ^ 0xFFFFAFDC, new class51[] { class82.field1370, var51, class163.field2671, class159.method1133((byte) -72, var11.field3578) });
                                            }
                                        }
                                        if (class1.field3 == var11) {
                                            var51 = class116.field1966;
                                            var52 = var11.field3550;
                                        }
                                        if (!var11.field3574) {
                                            var51 = class63.method414(-127, var51, var11);
                                        }
                                        var50.method1328(var51, var14, var13, var11.field3603, var11.field3608, var52, var11.field3547 ? 0 : -1, var11.field3580, var11.field3677, var11.field3589);
                                    } else if (class182.field3001) {
                                        class25.method135(var11, -28014);
                                    }
                                } else if (var11.field3623 == 5) {
                                    if (var11.field3574) {
                                        class171 var55;
                                        if (var11.field3571 == -1) {
                                            var55 = var11.method1461(false, (byte) -23);
                                        } else {
                                            var55 = class57.method366(var11.field3643, var11.field3696, var11.field3571, var11.field3578, var11.field3539, (byte) 69);
                                        }
                                        if (var55 != null) {
                                            int var56 = var55.field2805;
                                            int var57 = var55.field2803;
                                            if (var11.field3559) {
                                                int var59 = (var11.field3603 + var56 - 1) / var56;
                                                int var60 = (var57 - (1 - var11.field3608)) / var57;
                                                class59.method371(var14, var13, var11.field3603 + var14, var13 - -var11.field3608);
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var11.field3641 != 0) {
                                                            var55.method1200(10, var11.field3641, var57 / 2 + var57 * var62 + var13, 4096, var56 * var61 + var56 / 2 + var14);
                                                        } else if (var15 == 0) {
                                                            var55.method1103(var14 + (var56 * var61), var57 * var62 + var13);
                                                        } else {
                                                            var55.method1095(var56 * var61 + var14, var13 - -(var57 * var62), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class59.method390(arg3, arg6, arg9, arg5);
                                            } else {
                                                int var58 = var11.field3603 * 4096 / var56;
                                                if (var11.field3641 != 0) {
                                                    var55.method1200(arg2 ^ 0x5053, var11.field3641, var11.field3608 / 2 + var13, var58, var11.field3603 / 2 + var14);
                                                } else if (var15 != 0) {
                                                    var55.method1093(var14, var13, var11.field3603, var11.field3608, 256 - (var15 & 0xFF));
                                                } else if (var11.field3603 == var56 && var11.field3608 == var57) {
                                                    var55.method1103(var14, var13);
                                                } else {
                                                    var55.method1202(var14, var13, var11.field3603, var11.field3608);
                                                }
                                            }
                                        } else if (class182.field3001) {
                                            class25.method135(var11, -28014);
                                        }
                                    } else {
                                        class171 var54 = var11.method1461(class157.method1118(82, var11), (byte) -23);
                                        if (var54 != null) {
                                            var54.method1103(var14, var13);
                                        } else if (class182.field3001) {
                                            class25.method135(var11, arg2 ^ 0xFFFFC2CB);
                                        }
                                    }
                                } else if (var11.field3623 == 6) {
                                    boolean var63 = class157.method1118(-125, var11);
                                    class65 var64 = null;
                                    int var65;
                                    if (var63) {
                                        var65 = var11.field3592;
                                    } else {
                                        var65 = var11.field3633;
                                    }
                                    int var66 = 0;
                                    if (var11.field3571 != -1) {
                                        class222 var71 = class219.method1508(var11.field3571, (byte) -125);
                                        if (var71 != null) {
                                            class222 var72 = var71.method1534(var11.field3578, (byte) 86);
                                            class151 var73 = var65 == -1 ? null : class72.method501(var65, (byte) 30);
                                            var64 = var72.method1535(var11.field3697, 1, 122, var73);
                                            if (var64 == null) {
                                                class25.method135(var11, arg2 ^ 0xFFFFC2CB);
                                            } else {
                                                var66 = -var64.method94() / 2;
                                            }
                                        }
                                    } else if (var11.field3649 == 5) {
                                        if (var11.field3619 == -1) {
                                            var64 = class265.field4631.method1031((byte) -5, (class151) null, -1, (class151) null, -1);
                                        } else {
                                            int var68 = var11.field3619 & 0x7FF;
                                            if (class167.field2719 == var68) {
                                                var68 = 2047;
                                            }
                                            class103 var69 = class66.field1055[var68];
                                            class151 var70 = var65 == -1 ? null : class72.method501(var65, (byte) 97);
                                            if (var69 != null && (int) var69.field1711.method316(107) << 11 == (var11.field3619 & 0xFFFFF800)) {
                                                var64 = var69.field1708.method1031((byte) -5, var70, 0, (class151) null, var11.field3697);
                                            }
                                        }
                                    } else if (var65 == -1) {
                                        var64 = var11.method1456(-1, (class151) null, var63, class44.field706.field1708, 0);
                                        if (var64 == null && class182.field3001) {
                                            class25.method135(var11, -28014);
                                        }
                                    } else {
                                        class151 var67 = class72.method501(var65, (byte) 63);
                                        var64 = var11.method1456(var11.field3697, var67, var63, class44.field706.field1708, 0);
                                        if (var64 == null && class182.field3001) {
                                            class25.method135(var11, -28014);
                                        }
                                    }
                                    if (var64 != null) {
                                        int var74;
                                        if (var11.field3560 > 0) {
                                            var74 = (var11.field3608 << 8) / var11.field3560;
                                        } else {
                                            var74 = 256;
                                        }
                                        int var75 = (var11.field3567 * var74 >> 8) + var11.field3608 / 2 + var13;
                                        int var76;
                                        if (var11.field3582 <= 0) {
                                            var76 = 256;
                                        } else {
                                            var76 = (var11.field3603 << 8) / var11.field3582;
                                        }
                                        int var77 = var11.field3603 / 2 + (var11.field3653 * var76 >> 8) + var14;
                                        class73.method512(var77, var75);
                                        int var78 = class73.field1155[var11.field3586] * var11.field3553 >> 16;
                                        int var79 = class73.field1167[var11.field3586] * var11.field3553 >> 16;
                                        if (!var11.field3574) {
                                            var64.method439(0, var11.field3668, 0, var11.field3586, 0, var78, var79);
                                        } else if (var11.field3655) {
                                            ((class137) var64).method1003(0, var11.field3668, var11.field3598, var11.field3586, var11.field3583, var66 + var78 + var11.field3549, var11.field3549 + var79, var11.field3553);
                                        } else {
                                            var64.method439(0, var11.field3668, var11.field3598, var11.field3586, var11.field3583, var66 + var78 + var11.field3549, var11.field3549 + var79);
                                        }
                                        class73.method524();
                                    }
                                } else {
                                    if (var11.field3623 == 7) {
                                        class187 var80 = var11.method1457((byte) 125, class93.field1551);
                                        if (var80 == null) {
                                            if (class182.field3001) {
                                                class25.method135(var11, arg2 ^ 0xFFFFC2CB);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var11.field3694; var82++) {
                                            for (int var83 = 0; var83 < var11.field3540; var83++) {
                                                if (var11.field3543[var81] > 0) {
                                                    class222 var84 = class219.method1508(var11.field3543[var81] - 1, (byte) 119);
                                                    class51 var85;
                                                    if (var84.field3913 != 1 && var11.field3587[var81] == 1) {
                                                        var85 = class20.method104(94, new class51[] { class82.field1370, var84.field3907, class99.field1654 });
                                                    } else {
                                                        var85 = class20.method104(arg2 ^ 0x503D, new class51[] { class82.field1370, var84.field3907, class163.field2671, class159.method1133((byte) -124, var11.field3587[var81]) });
                                                    }
                                                    int var86 = (var11.field3678 + 115) * var83 + var14;
                                                    int var87 = (var11.field3670 + 12) * var82 + var13;
                                                    if (var11.field3580 == 0) {
                                                        var80.method1335(var85, var86, var87, var11.field3550, var11.field3547 ? 0 : -1);
                                                    } else if (var11.field3580 == 1) {
                                                        var80.method1333(var85, var86 + 57, var87, var11.field3550, var11.field3547 ? 0 : -1);
                                                    } else {
                                                        var80.method1316(var85, var86 + 115 - 1, var87, var11.field3550, var11.field3547 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var11.field3623 == 8 && class225.field3965 == var11 && class258.field4507 == class145.field2423) {
                                        int var88 = 0;
                                        class187 var89 = class177.field2891;
                                        int var90 = 0;
                                        class51 var91 = var11.field3627;
                                        class51 var92 = class63.method414(arg2 - 20560, var91, var11);
                                        while (var92.method293(false) > 0) {
                                            int var100 = var92.method271(class33.field490, -1);
                                            class51 var101;
                                            if (var100 == -1) {
                                                var101 = var92;
                                                var92 = class43.field696;
                                            } else {
                                                var101 = var92.method269((byte) -74, 0, var100);
                                                var92 = var92.method279((byte) -55, var100 + 4);
                                            }
                                            int var102 = var89.method1317(var101);
                                            var88 += var89.field3117 + 1;
                                            if (var90 < var102) {
                                                var90 = var102;
                                            }
                                        }
                                        var88 += 7;
                                        var90 += 6;
                                        int var93 = var14 + var11.field3603 - var90 - 5;
                                        int var94 = var11.field3608 + var13 + 5;
                                        if (var14 + 5 > var93) {
                                            var93 = var14 + 5;
                                        }
                                        if (var88 + var94 > arg5) {
                                            var94 = arg5 - var88;
                                        }
                                        if (arg9 < (var90 + var93)) {
                                            var93 = arg9 - var90;
                                        }
                                        class59.method393(var93, var94, var90, var88, 16777120);
                                        class59.method375(var93, var94, var90, var88, 0);
                                        int var95 = var94 + var89.field3117 + 2;
                                        class51 var96 = var11.field3627;
                                        class51 var97 = class63.method414(-127, var96, var11);
                                        while (var97.method293(false) > 0) {
                                            int var98 = var97.method271(class33.field490, -1);
                                            class51 var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = class43.field696;
                                            } else {
                                                var99 = var97.method269((byte) -74, 0, var98);
                                                var97 = var97.method279((byte) -55, var98 + 4);
                                            }
                                            var89.method1335(var99, var93 + 3, var95, 0, -1);
                                            var95 += var89.field3117 + 1;
                                        }
                                    }
                                    if (var11.field3623 == 9) {
                                        int var103;
                                        int var104;
                                        int var105;
                                        int var106;
                                        if (var11.field3636) {
                                            var103 = var13;
                                            var104 = var13 + var11.field3608;
                                            var105 = var14;
                                            var106 = var11.field3603 + var14;
                                        } else {
                                            var106 = var11.field3603 + var14;
                                            var103 = var11.field3608 + var13;
                                            var105 = var14;
                                            var104 = var13;
                                        }
                                        if (var11.field3620 == 1) {
                                            class59.method389(var105, var104, var106, var103, var11.field3550);
                                        } else {
                                            class59.method372(var105, var104, var106, var103, var11.field3550, var11.field3620);
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

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2569 = null;
        int var1 = 103 / ((-arg0 - 22) / 58);
        field2570 = null;
        field2567 = null;
        field2573 = null;
        field2575 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static final void method1114(int arg0) {
        if (arg0 != -13341) {
            method1111(-100, -39, -65, -117, 87, 24, -104, -28, -23, 50, 24, true);
        }
        class75.field1214.method1350((byte) 124);
        field2581++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Ldf;")
    public static final class51 method1115(int arg0, int arg1) {
        if (arg1 >= -51) {
            field2578 = true;
        }
        field2582++;
        if (arg0 < 100000) {
            return class20.method104(46, new class51[] { class115.field1957, class51.method311(arg0, 10), class169.field2756 });
        } else if (arg0 < 10000000) {
            return class20.method104(95, new class51[] { class210.field3495, class51.method311(arg0 / 1000, 10), class218.field3795, class169.field2756 });
        } else {
            return class20.method104(78, new class51[] { class9.field96, class51.method311(arg0 / 1000000, 10), class188.field3140, class169.field2756 });
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
    public abstract void method1116(int arg0, int arg1, int arg2);
}
