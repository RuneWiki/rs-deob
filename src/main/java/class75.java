import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class75 extends class34 {

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "[I")
    public int[] field1401 = new int[1];

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "[I")
    public int[] field1403 = new int[] { -1 };

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Lcc;")
    public static class209 field1400 = class95.method669(84, "::fps ");

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lcc;")
    public static class209 field1404 = class95.method669(106, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field1406 = 127;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method528(byte arg0) {
        if (arg0 >= -17) {
            method530(5);
        }
        field1400 = null;
        field1404 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3 - arg10;
        field1407++;
        if (arg3 < class59.field1194) {
            var11++;
        }
        int var12 = arg0 - arg1;
        if (arg0 < class98.field1921) {
            var12++;
        }
        if (arg2 > -87) {
            method530(-42);
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg4 + ((var13 + 1) * arg7) >> 16;
            int var45 = arg7 * var13 + arg4 >> 16;
            int var46 = var44 - var45;
            if (var46 > 0) {
                int var47 = var13 + arg10 >> 6;
                if (var47 >= 0 && var47 <= class187.field3383.length - 1) {
                    int var48 = arg9 + var45;
                    int var49 = arg9 + var44;
                    int[][] var50 = class187.field3383[var47];
                    byte[][] var51 = class191.field3461[var47];
                    byte[][] var52 = class234.field4213[var47];
                    byte[][] var53 = class249.field4496[var47];
                    byte[][] var54 = class87.field1737[var47];
                    byte[][] var55 = class181.field3264[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg6 * var56 + arg8 >> 16;
                        int var58 = (var56 + 1) * arg6 + arg8 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg5 + var58;
                            int var61 = arg1 + var56 >> 6;
                            int var62 = arg5 + var57;
                            int var63 = arg1 + var56 & 0x3F;
                            int var64 = arg10 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var61 < 0 || (var50.length - 1) < var61 || var50[var61] == null) {
                                if (class111.field2244.field4995 != -1) {
                                    var66 = class111.field2244.field4995;
                                } else if ((arg1 + var56 & 0x4) == (arg10 + var13 & 0x4)) {
                                    var66 = class12.field233[class138.field2593 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var61 < 0 || (var50.length - 1) < var61) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class4.method39(var48, var62, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var61][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var53[var61] == null ? 0 : class12.field233[var53[var61][var65] & 0xFF];
                            int var68 = var52[var61] == null ? 0 : class12.field233[var52[var61][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class4.method39(var48, var62, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    byte var69 = var51[var61] == null ? 0 : var51[var61][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class4.method39(var48, var62, var46, var59, var67);
                                    } else {
                                        class138.method963(var67, true, var59, var66, class4.field60, var62, var70 >> 2, var46, var48, var69 & 0x3, 116);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var55[var61][var65];
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class4.method39(var48, var62, var46, var59, var68);
                                    }
                                    class138.method963(var68, var67 == 0, var59, 0, class4.field60, var62, var72 >> 2, var46, var48, var71 & 0x3, -88);
                                }
                            }
                            if (var54[var61] != null) {
                                int var73 = var54[var61][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var48;
                                    } else {
                                        var74 = var49 - 1;
                                    }
                                    int var75 = 13421772;
                                    int var76;
                                    if (var59 == 1) {
                                        var76 = var62;
                                    } else {
                                        var76 = var60 - 1;
                                    }
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var75 = 13369344;
                                        var73 -= 4;
                                    }
                                    if (var73 == 1) {
                                        class4.method24(var48, var62, var59, var75);
                                    } else if (var73 == 2) {
                                        class4.method21(var48, var62, var46, var75);
                                    } else if (var73 == 3) {
                                        class4.method24(var74, var62, var59, var75);
                                    } else if (var73 == 4) {
                                        class4.method21(var48, var76, var46, var75);
                                    } else if (var73 == 9) {
                                        class4.method24(var48, var62, var59, 16777215);
                                        class4.method21(var48, var62, var46, var75);
                                    } else if (var73 == 10) {
                                        class4.method24(var74, var62, var59, 16777215);
                                        class4.method21(var48, var62, var46, var75);
                                    } else if (var73 == 11) {
                                        class4.method24(var74, var62, var59, 16777215);
                                        class4.method21(var48, var76, var46, var75);
                                    } else if (var73 == 12) {
                                        class4.method24(var48, var62, var59, 16777215);
                                        class4.method21(var48, var76, var46, var75);
                                    } else if (var73 == 17) {
                                        class4.method21(var48, var62, 1, var75);
                                    } else if (var73 == 18) {
                                        class4.method21(var74, var62, 1, var75);
                                    } else if (var73 == 19) {
                                        class4.method21(var74, var76, 1, var75);
                                    } else if (var73 == 20) {
                                        class4.method21(var48, var76, 1, var75);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class4.method21(var48 + var77, -var77 + var76, 1, var75);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class4.method21(var48 + var78, var62 - -var78, 1, var75);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var44;
                    int var80 = arg9 + var45;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82;
                        if (class111.field2244.field4995 != -1) {
                            var82 = class111.field2244.field4995;
                        } else if ((arg1 + var81 & 0x4) == (arg10 + var13 & 0x4)) {
                            var82 = class12.field233[class138.field2593 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = (arg8 + (arg6 * var81) >> 16) + arg5;
                        int var84 = ((var81 + 1) * arg6 + arg8 >> 16) + arg5;
                        int var85 = var84 - var83;
                        class4.method39(var80, var83, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg4 + (arg7 * var14) >> 16;
            int var16 = (var14 + 1) * arg7 + arg4 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg9 + var15;
                var10000 = arg9 + var16;
                int var20 = arg10 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class1.field23.length - 1)) {
                    short[][] var21 = class1.field23[var20];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = arg6 * var22 + arg8 >> 16;
                        int var24 = (var22 + 1) * arg6 + arg8 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg5 + var24;
                            int var27 = arg5 + var23;
                            int var28 = arg1 + var22 >> 6;
                            if (var28 >= 0 && var28 <= var21.length - 1) {
                                int var29 = (var22 + arg1 & 0x3F << 6) + (arg10 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 0x3FFF;
                                    int var31 = var21[var28][var29] >> 14 & 0x3;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class165.field2991[var30 - 1].field4081 * var25 / 4;
                                            int var33 = class165.field2991[var30 - 1].field4086 * var17 / 4;
                                            if (var33 != 0 && var32 != 0) {
                                                int var34 = class165.field2991[var30 - 1].field4076 * var25 / 4;
                                                class165.field2991[var30 - 1].method1328(var18, var27 - var34, var33, var32);
                                            }
                                        } else if (var31 == 1) {
                                            int var35 = class1.field1[var30 - 1].field4086 * var17 / 4;
                                            int var36 = class1.field1[var30 - 1].field4081 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class1.field1[var30 - 1].field4076 * var25 / 4;
                                                class1.field1[var30 - 1].method1328(var18, var27 - var37, var35, var36);
                                            }
                                        } else if (var31 == 2) {
                                            int var41 = class134.field2550[var30 - 1].field4086 * var17 / 4;
                                            int var42 = class134.field2550[var30 - 1].field4081 * var25 / 4;
                                            if (var41 != 0 && var42 != 0) {
                                                int var43 = class134.field2550[var30 - 1].field4076 * var25 / 4;
                                                class134.field2550[var30 - 1].method1328(var18, var27 - var43, var41, var42);
                                            }
                                        } else if (var31 == 3) {
                                            int var38 = class190.field3438[var30 - 1].field4086 * var17 / 4;
                                            int var39 = class190.field3438[var30 - 1].field4081 * var25 / 4;
                                            if (var38 != 0 && var39 != 0) {
                                                int var40 = class190.field3438[var30 - 1].field4076 * var25 / 4;
                                                class190.field3438[var30 - 1].method1328(var18, var27 - var40, var38, var39);
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

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
    public static final void method530(int arg0) {
        if (arg0 < 48) {
            return;
        }
        for (int var1 = -1; var1 < class250.field4502; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class82.field1653[var1];
            }
            class108 var3 = class103.field1993[var2];
            if (var3 != null) {
                class118.method835(var3.method577((byte) -37), var3, 8655);
            }
        }
        field1402++;
    }
}
