import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class122 {

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1925 = -1;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1922 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 10)
    public static final void method936(int arg0) {
        class37 var1 = class126.field1994;
        synchronized (class126.field1994) {
            int var2 = 109 / ((-arg0 - 24) / 52);
            class41.field619 = class161.field2395;
            class124.field1959++;
            if (class255.field3805 >= 0) {
                while (class65.field965 != class255.field3805) {
                    int var4 = class183.field2734[class65.field965];
                    class65.field965 = class65.field965 + 1 & 0x7F;
                    if (var4 >= 0) {
                        class50.field768[var4] = true;
                    } else {
                        class50.field768[~var4] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class50.field768[var3] = false;
                }
                class255.field3805 = class65.field965;
            }
            class161.field2395 = class20.field223;
        }
        field1921++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIIIB)V", line = 58)
    public static final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field1924++;
        if (arg10 < 89) {
            field1922 = -31;
        }
        int var11 = arg1 - arg0;
        int var12 = arg9 - arg2;
        if (arg1 < class193.field3089) {
            var11++;
        }
        if (arg9 < class87.field1280) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg3 * var13 + arg5 >> 16;
            int var15 = arg5 + ((var13 + 1) * arg3) >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg2 + var13 >> 6;
                if (var17 >= 0 && var17 <= (class152.field2294.length - 1)) {
                    int var18 = arg6 + var15;
                    int var19 = arg6 + var14;
                    int[][] var20 = class152.field2294[var17];
                    byte[][] var21 = class207.field3268[var17];
                    byte[][] var22 = class176.field2612[var17];
                    byte[][] var23 = class62.field944[var17];
                    byte[][] var24 = class64.field959[var17];
                    byte[][] var25 = class159.field2374[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = (var26 + 1) * arg4 + arg7 >> 16;
                        int var28 = arg4 * var26 + arg7 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg8 + var27;
                            int var31 = arg8 + var28;
                            int var32 = var26 + arg0 & 0x3F;
                            int var33 = var13 + arg2 & 0x3F;
                            int var34 = arg0 + var26 >> 6;
                            int var35 = (var32 << 6) + var33;
                            int var36;
                            if (var34 < 0 || var20.length - 1 < var34 || var20[var34] == null) {
                                if (class154.field2332.field3028 != -1) {
                                    var36 = class154.field2332.field3028;
                                } else if ((var26 + arg0 & 0x4) == (arg2 + var13 & 0x4)) {
                                    var36 = class279.field4294[class208.field3286 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var34 < 0 || (var20.length - 1) < var34) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class168.method1224(var19, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var34][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var21[var34] == null ? 0 : class279.field4294[var21[var34][var35] & 0xFF];
                            int var38 = var23[var34] == null ? 0 : class279.field4294[var23[var34][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class168.method1224(var19, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var34] == null ? 0 : var22[var34][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class168.method1224(var19, var31, var16, var29, var37);
                                    } else {
                                        class207.method1478(var31, var36, 2, var16, true, class168.field2525, var19, var40 >> 2, var29, var39 & 0x3, var37);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var34][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class168.method1224(var19, var31, var16, var29, var38);
                                    }
                                    class207.method1478(var31, 0, 2, var16, var37 == 0, class168.field2525, var19, var42 >> 2, var29, var41 & 0x3, var38);
                                }
                            }
                            if (var25[var34] != null) {
                                int var43 = var25[var34][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var18 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class168.method1222(var19, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class168.method1242(var19, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class168.method1222(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class168.method1242(var19, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class168.method1222(var19, var31, var29, 16777215);
                                        class168.method1242(var19, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class168.method1222(var44, var31, var29, 16777215);
                                        class168.method1242(var19, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class168.method1222(var44, var31, var29, 16777215);
                                        class168.method1242(var19, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class168.method1222(var19, var31, var29, 16777215);
                                        class168.method1242(var19, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class168.method1242(var19, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class168.method1242(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class168.method1242(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class168.method1242(var19, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class168.method1242(var19 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class168.method1242(var19 + var48, var31 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg6 + var15;
                    int var50 = arg6 + var14;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52;
                        if (class154.field2332.field3028 != -1) {
                            var52 = class154.field2332.field3028;
                        } else if ((arg0 + var51 & 0x4) == (arg2 + var13 & 0x4)) {
                            var52 = class279.field4294[class208.field3286 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = (arg4 * var51 + arg7 >> 16) + arg8;
                        int var54 = ((var51 + 1) * arg4 + arg7 >> 16) + arg8;
                        int var55 = var54 - var53;
                        class168.method1224(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var12 + 2; var56++) {
            int var57 = arg3 * var56 + arg5 >> 16;
            int var58 = (var56 + 1) * arg3 + arg5 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg6 + var58;
                int var61 = arg6 + var57;
                int var62 = arg2 + var56 >> 6;
                if (var62 >= 0 && var62 <= (class30.field383.length - 1)) {
                    int[][] var63 = class30.field383[var62];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = arg7 + (arg4 * var64) >> 16;
                        int var66 = (var64 + 1) * arg4 + arg7 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg0 + var64 >> 6;
                            int var69 = arg8 + var65;
                            var10000 = arg8 + var66;
                            if (var68 >= 0 && var68 <= var63.length - 1) {
                                int var71 = ((var64 + arg0 & 0x3F) << 6) + (arg2 + var56 & 0x3F);
                                if (var63[var68] != null) {
                                    int var72 = var63[var68][var71];
                                    int var73 = var72 & 0x3FFF;
                                    if (var73 != 0) {
                                        class73 var74 = class32.method226(3724, var73 - 1);
                                        int var75 = (var72 & 0xFB6B) >> 14;
                                        class70 var76 = var74.method607(var75, -21279);
                                        if (var76 != null) {
                                            int var77 = var76.field4579 * var59 / 4;
                                            int var78 = var76.field4595 * var67 / 4;
                                            if (var74.field1057) {
                                                int var79 = var72 >> 20 & 0xF;
                                                int var80 = (var72 & 0xFE913) >> 16;
                                                if ((var75 & 0x1) == 1) {
                                                    int var81 = var80;
                                                    var80 = var79;
                                                    var79 = var81;
                                                }
                                                var78 = var67 * var79;
                                                var77 = var59 * var80;
                                            }
                                            if (var77 != 0 && var78 != 0) {
                                                if (var74.field1049 == 0) {
                                                    var76.method592(var61, var69 + var67 - var78, var77, var78);
                                                } else {
                                                    var76.method585(var61, var67 + var69 - var78, var77, var78, var74.field1049);
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
    }
}
