import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class263 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Z")
    public static boolean field4672 = true;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4675 = 0;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[Leb;")
    public static class230[] field4669 = new class230[1000];

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Leb;")
    public static class230 field4677 = class68.method589(0, "l");

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Leb;")
    public static class230 field4673 = class68.method589(0, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Leb;")
    private static class230 field4678 = class68.method589(0, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Leb;")
    public static class230 field4680 = class68.method589(0, "unzap");

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Leb;")
    public static class230 field4670 = field4678;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4679 = -1;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Laj;")
    public static class46 field4671;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[I")
    public static int[] field4676;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        field4674++;
        if (arg0 == 1) {
            class27.field503.method1124(0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lqf;Z)V")
    public static final void method1825(class233 arg0, boolean arg1) {
        class12.field235.method843(-5, arg0);
        while (true) {
            class233 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class233[][] var7;
            class233 var66;
            do {
                class233 var65;
                do {
                    class233 var64;
                    do {
                        class233 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class233) class12.field235.method835(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4059);
                                            var3 = var2.field4047;
                                            var4 = var2.field4048;
                                            var5 = var2.field4049;
                                            var6 = var2.field4053;
                                            var7 = class53.field916[var5];
                                            if (!var2.field4068) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class233 var8 = class53.field916[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field4059) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class158.field2821 && var3 > class237.field4093) {
                                                    class233 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field4059 && (var9.field4068 || (var2.field4062 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class158.field2821 && var3 < class266.field4722 - 1) {
                                                    class233 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field4059 && (var10.field4068 || (var2.field4062 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class145.field2611 && var4 > class167.field2951) {
                                                    class233 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field4059 && (var11.field4068 || (var2.field4062 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class145.field2611 && var4 < class68.field1273 - 1) {
                                                    class233 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field4059 && (var12.field4068 || (var2.field4062 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4068 = false;
                                            if (var2.field4060 != null) {
                                                class233 var13 = var2.field4060;
                                                if (var13.field4051 == null) {
                                                    if (var13.field4066 != null) {
                                                        if (class35.method318(0, var3, var4)) {
                                                            class261.method1815(var13.field4066, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, true);
                                                        } else {
                                                            class261.method1815(var13.field4066, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class35.method318(0, var3, var4)) {
                                                    class91.method769(var13.field4051, 0, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, true);
                                                } else {
                                                    class91.method769(var13.field4051, 0, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, false);
                                                }
                                                class108 var14 = var13.field4056;
                                                if (var14 != null) {
                                                    var14.field1951.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var14.field1939 - class274.field4817, var14.field1946 - class72.field1317, var14.field1949 - class79.field1439, var14.field1942);
                                                }
                                                for (int var15 = 0; var15 < var13.field4058; var15++) {
                                                    class111 var16 = var13.field4050[var15];
                                                    if (var16 != null) {
                                                        var16.field1993.method500(var16.field1996, class47.field831, class15.field354, class21.field427, class261.field4642, var16.field2003 - class274.field4817, var16.field1999 - class72.field1317, var16.field1992 - class79.field1439, var16.field2001);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field4051 == null) {
                                                if (var2.field4066 != null) {
                                                    if (class35.method318(var6, var3, var4)) {
                                                        class261.method1815(var2.field4066, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class261.method1815(var2.field4066, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, false);
                                                    }
                                                }
                                            } else if (class35.method318(var6, var3, var4)) {
                                                class91.method769(var2.field4051, var6, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field4051.field672 != 12345678 || class267.field4748 && var5 <= class89.field1572) {
                                                    class91.method769(var2.field4051, var6, class47.field831, class15.field354, class21.field427, class261.field4642, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class56 var18 = var2.field4052;
                                                if (var18 != null && (var18.field1031 & 0x80000000L) != 0L) {
                                                    var18.field1026.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var18.field1029 - class274.field4817, var18.field1028 - class72.field1317, var18.field1024 - class79.field1439, var18.field1031);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class108 var21 = var2.field4056;
                                            class265 var22 = var2.field4065;
                                            if (var21 != null || var22 != null) {
                                                if (class158.field2821 == var3) {
                                                    var19++;
                                                } else if (class158.field2821 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class145.field2611 == var4) {
                                                    var19 += 3;
                                                } else if (class145.field2611 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class164.field2927[var19];
                                                var2.field4057 = class221.field3785[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1941 & class132.field2381[var19]) == 0) {
                                                    var2.field4055 = 0;
                                                } else if (var21.field1941 == 16) {
                                                    var2.field4055 = 3;
                                                    var2.field4045 = class110.field1980[var19];
                                                    var2.field4054 = 3 - var2.field4045;
                                                } else if (var21.field1941 == 32) {
                                                    var2.field4055 = 6;
                                                    var2.field4045 = class155.field2768[var19];
                                                    var2.field4054 = 6 - var2.field4045;
                                                } else if (var21.field1941 == 64) {
                                                    var2.field4055 = 12;
                                                    var2.field4045 = class210.field3669[var19];
                                                    var2.field4054 = 12 - var2.field4045;
                                                } else {
                                                    var2.field4055 = 9;
                                                    var2.field4045 = class68.field1280[var19];
                                                    var2.field4054 = 9 - var2.field4045;
                                                }
                                                if ((var21.field1941 & var20) != 0 && !class24.method252(var6, var3, var4, var21.field1941)) {
                                                    var21.field1951.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var21.field1939 - class274.field4817, var21.field1946 - class72.field1317, var21.field1949 - class79.field1439, var21.field1942);
                                                }
                                                if ((var21.field1940 & var20) != 0 && !class24.method252(var6, var3, var4, var21.field1940)) {
                                                    var21.field1950.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var21.field1939 - class274.field4817, var21.field1946 - class72.field1317, var21.field1949 - class79.field1439, var21.field1942);
                                                }
                                            }
                                            if (var22 != null && !class156.method1188(var6, var3, var4, var22.field4718.method496())) {
                                                if ((var22.field4716 & var20) != 0) {
                                                    var22.field4718.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var22.field4704 + var22.field4710 - class274.field4817, var22.field4703 - class72.field1317, var22.field4714 + var22.field4707 - class79.field1439, var22.field4720);
                                                } else if (var22.field4716 == 256) {
                                                    int var23 = var22.field4704 - class274.field4817;
                                                    int var24 = var22.field4703 - class72.field1317;
                                                    int var25 = var22.field4714 - class79.field1439;
                                                    int var26 = var22.field4715;
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
                                                        var22.field4718.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var22.field4710 + var23, var24, var22.field4707 + var25, var22.field4720);
                                                    } else if (var22.field4719 != null) {
                                                        var22.field4719.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var23, var24, var25, var22.field4720);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class56 var29 = var2.field4052;
                                                if (var29 != null && (var29.field1031 & 0x80000000L) == 0L) {
                                                    var29.field1026.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var29.field1029 - class274.field4817, var29.field1028 - class72.field1317, var29.field1024 - class79.field1439, var29.field1031);
                                                }
                                                class176 var30 = var2.field4063;
                                                if (var30 != null && var30.field3091 == 0) {
                                                    if (var30.field3086 != null) {
                                                        var30.field3086.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var30.field3089 - class274.field4817, var30.field3088 - class72.field1317, var30.field3095 - class79.field1439, var30.field3097);
                                                    }
                                                    if (var30.field3096 != null) {
                                                        var30.field3096.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var30.field3089 - class274.field4817, var30.field3088 - class72.field1317, var30.field3095 - class79.field1439, var30.field3097);
                                                    }
                                                    if (var30.field3087 != null) {
                                                        var30.field3087.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var30.field3089 - class274.field4817, var30.field3088 - class72.field1317, var30.field3095 - class79.field1439, var30.field3097);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field4062;
                                            if (var31 != 0) {
                                                if (var3 < class158.field2821 && (var31 & 0x4) != 0) {
                                                    class233 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field4059) {
                                                        class12.field235.method843(-5, var32);
                                                    }
                                                }
                                                if (var4 < class145.field2611 && (var31 & 0x2) != 0) {
                                                    class233 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field4059) {
                                                        class12.field235.method843(-5, var33);
                                                    }
                                                }
                                                if (var3 > class158.field2821 && (var31 & 0x1) != 0) {
                                                    class233 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field4059) {
                                                        class12.field235.method843(-5, var34);
                                                    }
                                                }
                                                if (var4 > class145.field2611 && (var31 & 0x8) != 0) {
                                                    class233 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field4059) {
                                                        class12.field235.method843(-5, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4055 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field4058; var37++) {
                                                if (class168.field2968 != var2.field4050[var37].field1995 && (var2.field4064[var37] & var2.field4055) == var2.field4045) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class108 var38 = var2.field4056;
                                                if (!class24.method252(var6, var3, var4, var38.field1941)) {
                                                    var38.field1951.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var38.field1939 - class274.field4817, var38.field1946 - class72.field1317, var38.field1949 - class79.field1439, var38.field1942);
                                                }
                                                var2.field4055 = 0;
                                            }
                                        }
                                        if (!var2.field4067) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field4058;
                                            var2.field4067 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class111 var42 = var2.field4050[var41];
                                                if (class168.field2968 != var42.field1995) {
                                                    for (int var43 = var42.field1988; var43 <= var42.field1989; var43++) {
                                                        for (int var44 = var42.field1994; var44 <= var42.field2002; var44++) {
                                                            class233 var45 = var7[var43][var44];
                                                            if (var45.field4068) {
                                                                var2.field4067 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field4055 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1988) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1989) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1994) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2002) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field4055) == var2.field4054) {
                                                                    var2.field4067 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class270.field4774[var40++] = var42;
                                                    int var47 = class158.field2821 - var42.field1988;
                                                    int var48 = var42.field1989 - class158.field2821;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class145.field2611 - var42.field1994;
                                                    int var50 = var42.field2002 - class145.field2611;
                                                    if (var50 > var49) {
                                                        var42.field1997 = var47 + var50;
                                                    } else {
                                                        var42.field1997 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class111 var54 = class270.field4774[var53];
                                                    if (class168.field2968 != var54.field1995) {
                                                        if (var54.field1997 > var51) {
                                                            var51 = var54.field1997;
                                                            var52 = var53;
                                                        } else if (var54.field1997 == var51) {
                                                            int var55 = var54.field2003 - class274.field4817;
                                                            int var56 = var54.field1992 - class79.field1439;
                                                            int var57 = class270.field4774[var52].field2003 - class274.field4817;
                                                            int var58 = class270.field4774[var52].field1992 - class79.field1439;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class111 var59 = class270.field4774[var52];
                                                var59.field1995 = class168.field2968;
                                                if (!class130.method1030(var6, var59.field1988, var59.field1989, var59.field1994, var59.field2002, var59.field1993.method496())) {
                                                    var59.field1993.method500(var59.field1996, class47.field831, class15.field354, class21.field427, class261.field4642, var59.field2003 - class274.field4817, var59.field1999 - class72.field1317, var59.field1992 - class79.field1439, var59.field2001);
                                                }
                                                for (int var60 = var59.field1988; var60 <= var59.field1989; var60++) {
                                                    for (int var61 = var59.field1994; var61 <= var59.field2002; var61++) {
                                                        class233 var62 = var7[var60][var61];
                                                        if (var62.field4055 != 0) {
                                                            class12.field235.method843(-5, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field4059) {
                                                            class12.field235.method843(-5, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4067) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field4067 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4059);
                            } while (var2.field4055 != 0);
                            if (var3 > class158.field2821 || var3 <= class237.field4093) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field4059);
                        if (var3 < class158.field2821 || var3 >= class266.field4722 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field4059);
                    if (var4 > class145.field2611 || var4 <= class167.field2951) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field4059);
                if (var4 < class145.field2611 || var4 >= class68.field1273 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field4059);
            var2.field4059 = false;
            class268.field4760--;
            class176 var67 = var2.field4063;
            if (var67 != null && var67.field3091 != 0) {
                if (var67.field3086 != null) {
                    var67.field3086.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var67.field3089 - class274.field4817, var67.field3088 - class72.field1317 - var67.field3091, var67.field3095 - class79.field1439, var67.field3097);
                }
                if (var67.field3096 != null) {
                    var67.field3096.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var67.field3089 - class274.field4817, var67.field3088 - class72.field1317 - var67.field3091, var67.field3095 - class79.field1439, var67.field3097);
                }
                if (var67.field3087 != null) {
                    var67.field3087.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var67.field3089 - class274.field4817, var67.field3088 - class72.field1317 - var67.field3091, var67.field3095 - class79.field1439, var67.field3097);
                }
            }
            if (var2.field4057 != 0) {
                class265 var68 = var2.field4065;
                if (var68 != null && !class156.method1188(var6, var3, var4, var68.field4718.method496())) {
                    if ((var68.field4716 & var2.field4057) != 0) {
                        var68.field4718.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var68.field4704 + var68.field4710 - class274.field4817, var68.field4703 - class72.field1317, var68.field4714 + var68.field4707 - class79.field1439, var68.field4720);
                    } else if (var68.field4716 == 256) {
                        int var69 = var68.field4704 - class274.field4817;
                        int var70 = var68.field4703 - class72.field1317;
                        int var71 = var68.field4714 - class79.field1439;
                        int var72 = var68.field4715;
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
                            var68.field4718.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var68.field4710 + var69, var70, var68.field4707 + var71, var68.field4720);
                        } else if (var68.field4719 != null) {
                            var68.field4719.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var69, var70, var71, var68.field4720);
                        }
                    }
                }
                class108 var75 = var2.field4056;
                if (var75 != null) {
                    if ((var75.field1940 & var2.field4057) != 0 && !class24.method252(var6, var3, var4, var75.field1940)) {
                        var75.field1950.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var75.field1939 - class274.field4817, var75.field1946 - class72.field1317, var75.field1949 - class79.field1439, var75.field1942);
                    }
                    if ((var75.field1941 & var2.field4057) != 0 && !class24.method252(var6, var3, var4, var75.field1941)) {
                        var75.field1951.method500(0, class47.field831, class15.field354, class21.field427, class261.field4642, var75.field1939 - class274.field4817, var75.field1946 - class72.field1317, var75.field1949 - class79.field1439, var75.field1942);
                    }
                }
            }
            if (var5 < class225.field3892 - 1) {
                class233 var76 = class53.field916[var5 + 1][var3][var4];
                if (var76 != null && var76.field4059) {
                    class12.field235.method843(-5, var76);
                }
            }
            if (var3 < class158.field2821) {
                class233 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field4059) {
                    class12.field235.method843(-5, var77);
                }
            }
            if (var4 < class145.field2611) {
                class233 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field4059) {
                    class12.field235.method843(-5, var78);
                }
            }
            if (var3 > class158.field2821) {
                class233 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field4059) {
                    class12.field235.method843(-5, var79);
                }
            }
            if (var4 > class145.field2611) {
                class233 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field4059) {
                    class12.field235.method843(-5, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1826(byte arg0) {
        field4673 = null;
        field4669 = null;
        field4670 = null;
        field4680 = null;
        field4671 = null;
        field4676 = null;
        if (arg0 == -55) {
            field4678 = null;
            field4677 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4668++;
        if (arg6 >= class78.field1404 && arg3 <= class42.field769 && arg2 >= class15.field345 && class259.field4587 >= arg4) {
            if (arg0 == 1) {
                class116.method921(true, arg5, arg4, arg2, arg6, arg3);
            } else {
                class268.method1845(arg0, arg4, arg2, arg5, (byte) 74, arg6, arg3);
            }
        } else if (arg0 == 1) {
            class60.method508(arg6, arg2, (byte) 104, arg3, arg4, arg5);
        } else {
            class82.method663(arg6, arg2, arg3, false, arg5, arg4, arg0);
        }
        if (arg1 != -2) {
            method1824(-77);
        }
    }
}
