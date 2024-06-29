import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class85 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1049 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Z")
    public static boolean field1050 = true;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Z")
    public static boolean field1053;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLeh;)V")
    public static final void method464(byte arg0, class137 arg1) {
        field1051++;
        if (arg0 >= -60) {
            field1049 = 51;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method465(int arg0) {
        int var1 = -11 % ((arg0 + 36) / 55);
        field1054++;
        if (class286.field4571 != null && class286.field4571.field3818 - (class286.field4571.method1638(-6377) - 1) * 64 >> 7 == class233.field3856 && class286.field4571.field3820 - ((class286.field4571.method1638(-6377) - 1) * 64) >> 7 == class91.field1135) {
            class233.field3856 = 0;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var7 = 0; var7 < 104; var7++) {
                class239.field3943[var2][var7] = 0;
            }
        }
        for (int var3 = 0; var3 < class77.field970; var3++) {
            class259 var6 = class89.field1113[class27.field385[var3]];
            if (var6 != null) {
                var6.field3788 = false;
            }
        }
        for (int var4 = 0; var4 < class134.field2122; var4++) {
            class200 var5 = class265.field4273[class11.field121[var4]];
            if (var5 != null) {
                var5.field3788 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ltl;Z)V")
    public static final void method466(class246 arg0, boolean arg1) {
        class161.field2570.method1803(arg0, -1);
        while (true) {
            class246 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class246[][] var7;
            class246 var66;
            do {
                class246 var65;
                do {
                    class246 var64;
                    do {
                        class246 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class246) class161.field2570.method1808(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4051);
                                            var3 = var2.field4062;
                                            var4 = var2.field4036;
                                            var5 = var2.field4040;
                                            var6 = var2.field4039;
                                            var7 = class46.field585[var5];
                                            if (!var2.field4048) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class246 var8 = class46.field585[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field4051) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class259.field4198 && var3 > class253.field4125) {
                                                    class246 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field4051 && (var9.field4048 || (var2.field4057 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class259.field4198 && var3 < class17.field207 - 1) {
                                                    class246 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field4051 && (var10.field4048 || (var2.field4057 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class99.field1326 && var4 > class110.field1579) {
                                                    class246 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field4051 && (var11.field4048 || (var2.field4057 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class99.field1326 && var4 < class107.field1438 - 1) {
                                                    class246 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field4051 && (var12.field4048 || (var2.field4057 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4048 = false;
                                            if (var2.field4058 != null) {
                                                class246 var13 = var2.field4058;
                                                if (var13.field4035 == null) {
                                                    if (var13.field4055 != null) {
                                                        if (class222.method1567(0, var3, var4)) {
                                                            class79.method442(var13.field4055, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, true);
                                                        } else {
                                                            class79.method442(var13.field4055, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class222.method1567(0, var3, var4)) {
                                                    class7.method37(var13.field4035, 0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, true);
                                                } else {
                                                    class7.method37(var13.field4035, 0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, false);
                                                }
                                                class187 var14 = var13.field4046;
                                                if (var14 != null) {
                                                    var14.field2983.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var14.field2988 - class230.field3789, var14.field2982 - class57.field735, var14.field2986 - class236.field3909, var14.field2977, var5, (class268) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field4044; var15++) {
                                                    class19 var16 = var13.field4038[var15];
                                                    if (var16 != null) {
                                                        var16.field234.method101(var16.field242, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var16.field228 - class230.field3789, var16.field230 - class57.field735, var16.field241 - class236.field3909, var16.field244, var5, (class268) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field4035 == null) {
                                                if (var2.field4055 != null) {
                                                    if (class222.method1567(var6, var3, var4)) {
                                                        class79.method442(var2.field4055, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class79.method442(var2.field4055, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, false);
                                                    }
                                                }
                                            } else if (class222.method1567(var6, var3, var4)) {
                                                class7.method37(var2.field4035, var6, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field4035.field756 != 12345678 || class101.field1367 && var5 <= class187.field2979) {
                                                    class7.method37(var2.field4035, var6, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class11 var18 = var2.field4056;
                                                if (var18 != null && (var18.field118 & 0x80000000L) != 0L) {
                                                    var18.field127.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var18.field125 - class230.field3789, var18.field124 - class57.field735, var18.field128 - class236.field3909, var18.field118, var5, (class268) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class187 var21 = var2.field4046;
                                            class128 var22 = var2.field4054;
                                            if (var21 != null || var22 != null) {
                                                if (class259.field4198 == var3) {
                                                    var19++;
                                                } else if (class259.field4198 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class99.field1326 == var4) {
                                                    var19 += 3;
                                                } else if (class99.field1326 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class119.field1682[var19];
                                                var2.field4047 = class198.field3137[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2981 & class211.field3381[var19]) == 0) {
                                                    var2.field4041 = 0;
                                                } else if (var21.field2981 == 16) {
                                                    var2.field4041 = 3;
                                                    var2.field4053 = class121.field1709[var19];
                                                    var2.field4052 = 3 - var2.field4053;
                                                } else if (var21.field2981 == 32) {
                                                    var2.field4041 = 6;
                                                    var2.field4053 = class152.field2360[var19];
                                                    var2.field4052 = 6 - var2.field4053;
                                                } else if (var21.field2981 == 64) {
                                                    var2.field4041 = 12;
                                                    var2.field4053 = class83.field1032[var19];
                                                    var2.field4052 = 12 - var2.field4053;
                                                } else {
                                                    var2.field4041 = 9;
                                                    var2.field4053 = class112.field1594[var19];
                                                    var2.field4052 = 9 - var2.field4053;
                                                }
                                                if ((var21.field2981 & var20) != 0 && !class21.method115(var6, var3, var4, var21.field2981)) {
                                                    var21.field2983.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var21.field2988 - class230.field3789, var21.field2982 - class57.field735, var21.field2986 - class236.field3909, var21.field2977, var5, (class268) null);
                                                }
                                                if ((var21.field2987 & var20) != 0 && !class21.method115(var6, var3, var4, var21.field2987)) {
                                                    var21.field2990.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var21.field2988 - class230.field3789, var21.field2982 - class57.field735, var21.field2986 - class236.field3909, var21.field2977, var5, (class268) null);
                                                }
                                            }
                                            if (var22 != null && !class196.method1379(var6, var3, var4, var22.field2043.method102())) {
                                                if ((var22.field2049 & var20) != 0) {
                                                    var22.field2043.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var22.field2058 + var22.field2053 - class230.field3789, var22.field2046 - class57.field735, var22.field2050 + var22.field2047 - class236.field3909, var22.field2051, var5, (class268) null);
                                                } else if (var22.field2049 == 256) {
                                                    int var23 = var22.field2058 - class230.field3789;
                                                    int var24 = var22.field2046 - class57.field735;
                                                    int var25 = var22.field2050 - class236.field3909;
                                                    int var26 = var22.field2056;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2043.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var22.field2053 + var23, var24, var22.field2047 + var25, var22.field2051, var5, (class268) null);
                                                    } else if (var22.field2061 != null) {
                                                        var22.field2061.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var23, var24, var25, var22.field2051, var5, (class268) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class11 var29 = var2.field4056;
                                                if (var29 != null && (var29.field118 & 0x80000000L) == 0L) {
                                                    var29.field127.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var29.field125 - class230.field3789, var29.field124 - class57.field735, var29.field128 - class236.field3909, var29.field118, var5, (class268) null);
                                                }
                                                class185 var30 = var2.field4042;
                                                if (var30 != null && var30.field2952 == 0) {
                                                    if (var30.field2965 != null) {
                                                        var30.field2965.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var30.field2957 - class230.field3789, var30.field2962 - class57.field735, var30.field2959 - class236.field3909, var30.field2961, var5, (class268) null);
                                                    }
                                                    if (var30.field2955 != null) {
                                                        var30.field2955.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var30.field2957 - class230.field3789, var30.field2962 - class57.field735, var30.field2959 - class236.field3909, var30.field2961, var5, (class268) null);
                                                    }
                                                    if (var30.field2954 != null) {
                                                        var30.field2954.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var30.field2957 - class230.field3789, var30.field2962 - class57.field735, var30.field2959 - class236.field3909, var30.field2961, var5, (class268) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field4057;
                                            if (var31 != 0) {
                                                if (var3 < class259.field4198 && (var31 & 0x4) != 0) {
                                                    class246 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field4051) {
                                                        class161.field2570.method1803(var32, -1);
                                                    }
                                                }
                                                if (var4 < class99.field1326 && (var31 & 0x2) != 0) {
                                                    class246 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field4051) {
                                                        class161.field2570.method1803(var33, -1);
                                                    }
                                                }
                                                if (var3 > class259.field4198 && (var31 & 0x1) != 0) {
                                                    class246 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field4051) {
                                                        class161.field2570.method1803(var34, -1);
                                                    }
                                                }
                                                if (var4 > class99.field1326 && (var31 & 0x8) != 0) {
                                                    class246 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field4051) {
                                                        class161.field2570.method1803(var35, -1);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4041 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field4044; var37++) {
                                                if (class35.field452 != var2.field4038[var37].field236 && (var2.field4037[var37] & var2.field4041) == var2.field4053) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class187 var38 = var2.field4046;
                                                if (!class21.method115(var6, var3, var4, var38.field2981)) {
                                                    var38.field2983.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var38.field2988 - class230.field3789, var38.field2982 - class57.field735, var38.field2986 - class236.field3909, var38.field2977, var5, (class268) null);
                                                }
                                                var2.field4041 = 0;
                                            }
                                        }
                                        if (!var2.field4063) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field4044;
                                            var2.field4063 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class19 var42 = var2.field4038[var41];
                                                if (class35.field452 != var42.field236) {
                                                    for (int var43 = var42.field240; var43 <= var42.field239; var43++) {
                                                        for (int var44 = var42.field235; var44 <= var42.field233; var44++) {
                                                            class246 var45 = var7[var43][var44];
                                                            if (var45.field4048) {
                                                                var2.field4063 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field4041 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field240) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field239) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field235) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field233) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field4041) == var2.field4052) {
                                                                    var2.field4063 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class209.field3329[var40++] = var42;
                                                    int var47 = class259.field4198 - var42.field240;
                                                    int var48 = var42.field239 - class259.field4198;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class99.field1326 - var42.field235;
                                                    int var50 = var42.field233 - class99.field1326;
                                                    if (var50 > var49) {
                                                        var42.field248 = var47 + var50;
                                                    } else {
                                                        var42.field248 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class19 var54 = class209.field3329[var53];
                                                    if (class35.field452 != var54.field236) {
                                                        if (var54.field248 > var51) {
                                                            var51 = var54.field248;
                                                            var52 = var53;
                                                        } else if (var54.field248 == var51) {
                                                            int var55 = var54.field228 - class230.field3789;
                                                            int var56 = var54.field241 - class236.field3909;
                                                            int var57 = class209.field3329[var52].field228 - class230.field3789;
                                                            int var58 = class209.field3329[var52].field241 - class236.field3909;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class19 var59 = class209.field3329[var52];
                                                var59.field236 = class35.field452;
                                                if (!class139.method966(var6, var59.field240, var59.field239, var59.field235, var59.field233, var59.field234.method102())) {
                                                    var59.field234.method101(var59.field242, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var59.field228 - class230.field3789, var59.field230 - class57.field735, var59.field241 - class236.field3909, var59.field244, var5, (class268) null);
                                                }
                                                for (int var60 = var59.field240; var60 <= var59.field239; var60++) {
                                                    for (int var61 = var59.field235; var61 <= var59.field233; var61++) {
                                                        class246 var62 = var7[var60][var61];
                                                        if (var62.field4041 != 0) {
                                                            class161.field2570.method1803(var62, -1);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field4051) {
                                                            class161.field2570.method1803(var62, -1);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4063) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field4063 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4051);
                            } while (var2.field4041 != 0);
                            if (var3 > class259.field4198 || var3 <= class253.field4125) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field4051);
                        if (var3 < class259.field4198 || var3 >= class17.field207 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field4051);
                    if (var4 > class99.field1326 || var4 <= class110.field1579) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field4051);
                if (var4 < class99.field1326 || var4 >= class107.field1438 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field4051);
            var2.field4051 = false;
            class130.field2082--;
            class185 var67 = var2.field4042;
            if (var67 != null && var67.field2952 != 0) {
                if (var67.field2965 != null) {
                    var67.field2965.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var67.field2957 - class230.field3789, var67.field2962 - class57.field735 - var67.field2952, var67.field2959 - class236.field3909, var67.field2961, var5, (class268) null);
                }
                if (var67.field2955 != null) {
                    var67.field2955.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var67.field2957 - class230.field3789, var67.field2962 - class57.field735 - var67.field2952, var67.field2959 - class236.field3909, var67.field2961, var5, (class268) null);
                }
                if (var67.field2954 != null) {
                    var67.field2954.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var67.field2957 - class230.field3789, var67.field2962 - class57.field735 - var67.field2952, var67.field2959 - class236.field3909, var67.field2961, var5, (class268) null);
                }
            }
            if (var2.field4047 != 0) {
                class128 var68 = var2.field4054;
                if (var68 != null && !class196.method1379(var6, var3, var4, var68.field2043.method102())) {
                    if ((var68.field2049 & var2.field4047) != 0) {
                        var68.field2043.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var68.field2058 + var68.field2053 - class230.field3789, var68.field2046 - class57.field735, var68.field2050 + var68.field2047 - class236.field3909, var68.field2051, var5, (class268) null);
                    } else if (var68.field2049 == 256) {
                        int var69 = var68.field2058 - class230.field3789;
                        int var70 = var68.field2046 - class57.field735;
                        int var71 = var68.field2050 - class236.field3909;
                        int var72 = var68.field2056;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2043.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var68.field2053 + var69, var70, var68.field2047 + var71, var68.field2051, var5, (class268) null);
                        } else if (var68.field2061 != null) {
                            var68.field2061.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var69, var70, var71, var68.field2051, var5, (class268) null);
                        }
                    }
                }
                class187 var75 = var2.field4046;
                if (var75 != null) {
                    if ((var75.field2987 & var2.field4047) != 0 && !class21.method115(var6, var3, var4, var75.field2987)) {
                        var75.field2990.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var75.field2988 - class230.field3789, var75.field2982 - class57.field735, var75.field2986 - class236.field3909, var75.field2977, var5, (class268) null);
                    }
                    if ((var75.field2981 & var2.field4047) != 0 && !class21.method115(var6, var3, var4, var75.field2981)) {
                        var75.field2983.method101(0, class126.field2019, class247.field4073, class208.field3318, class282.field4472, var75.field2988 - class230.field3789, var75.field2982 - class57.field735, var75.field2986 - class236.field3909, var75.field2977, var5, (class268) null);
                    }
                }
            }
            if (var5 < class34.field444 - 1) {
                class246 var76 = class46.field585[var5 + 1][var3][var4];
                if (var76 != null && var76.field4051) {
                    class161.field2570.method1803(var76, -1);
                }
            }
            if (var3 < class259.field4198) {
                class246 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field4051) {
                    class161.field2570.method1803(var77, -1);
                }
            }
            if (var4 < class99.field1326) {
                class246 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field4051) {
                    class161.field2570.method1803(var78, -1);
                }
            }
            if (var3 > class259.field4198) {
                class246 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field4051) {
                    class161.field2570.method1803(var79, -1);
                }
            }
            if (var4 > class99.field1326) {
                class246 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field4051) {
                    class161.field2570.method1803(var80, -1);
                }
            }
        }
    }
}
