import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class200 extends class125 {

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "J")
    public long field3476;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "Lug;")
    public class200 field3472;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "Lug;")
    public class200 field3478;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Z")
    public static boolean field3473;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "[I")
    public static int[] field3479;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "[I")
    public static int[] field3480;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBII)I")
    public static final int method1342(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = 54 % ((54 - arg1) / 63);
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        field3475++;
        return (arg0 >> 1) + (arg2 >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIBIIIIIIII)V")
    public static final void method1343(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3470++;
        if (arg2 >= -113) {
            method1343(101, -1, (byte) 31, 36, 122, -123, 46, 46, 42, -29, 87);
        }
        int var11 = arg10 - arg8;
        if (arg10 < class230.field3983) {
            var11++;
        }
        int var12 = arg0 - arg1;
        if (arg0 < class218.field3794) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = (var13 + 1) * arg9 + arg5 >> 16;
            int var45 = arg9 * var13 + arg5 >> 16;
            int var46 = var44 - var45;
            if (var46 > 0) {
                int var47 = arg1 + var13 >> 6;
                if (var47 >= 0 && (class291.field5100.length - 1) >= var47) {
                    int var48 = arg4 + var45;
                    int var49 = arg4 + var44;
                    int[][] var50 = class291.field5100[var47];
                    byte[][] var51 = class55.field902[var47];
                    byte[][] var52 = class190.field3353[var47];
                    byte[][] var53 = class13.field126[var47];
                    byte[][] var54 = class273.field4825[var47];
                    byte[][] var55 = class182.field3204[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = arg6 + (arg7 * var56) >> 16;
                        int var58 = (var56 + 1) * arg7 + arg6 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg3 + var57;
                            int var61 = arg8 + var56 >> 6;
                            int var62 = arg3 + var58;
                            int var63 = arg8 + var56 & 0x3F;
                            int var64 = var13 + arg1 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var61 < 0 || var61 > var50.length - 1 || var50[var61] == null) {
                                if (class261.field4557.field3964 != -1) {
                                    var66 = class261.field4557.field3964;
                                } else if ((arg1 + var13 & 0x4) == (arg8 + var56 & 0x4)) {
                                    var66 = class139.field2471[class58.field976 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var61 < 0 || (var50.length - 1) < var61) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class68.method465(var48, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var61][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var51[var61] == null ? 0 : class139.field2471[var51[var61][var65] & 0xFF];
                            int var68 = var53[var61] == null ? 0 : class139.field2471[var53[var61][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class68.method465(var48, var60, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var61] == null ? 0 : var52[var61][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class68.method465(var48, var60, var46, var59, var67);
                                    } else {
                                        class19.method117(var67, var69 & 0x3, var59, var48, var60, (byte) 57, var66, var46, class68.field1141, var70 >> 2, true);
                                    }
                                }
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    byte var71 = var54[var61][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class68.method465(var48, var60, var46, var59, var68);
                                    }
                                    class19.method117(var68, var71 & 0x3, var59, var48, var60, (byte) 64, 0, var46, class68.field1141, var72 >> 2, var67 == 0);
                                }
                            }
                            if (var55[var61] != null) {
                                int var73 = var55[var61][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var48;
                                    } else {
                                        var74 = var49 - 1;
                                    }
                                    int var75 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var75 = 13369344;
                                        var73 -= 4;
                                    }
                                    int var76;
                                    if (var59 == 1) {
                                        var76 = var60;
                                    } else {
                                        var76 = var62 - 1;
                                    }
                                    if (var73 == 1) {
                                        class68.method457(var48, var60, var59, var75);
                                    } else if (var73 == 2) {
                                        class68.method459(var48, var60, var46, var75);
                                    } else if (var73 == 3) {
                                        class68.method457(var74, var60, var59, var75);
                                    } else if (var73 == 4) {
                                        class68.method459(var48, var76, var46, var75);
                                    } else if (var73 == 9) {
                                        class68.method457(var48, var60, var59, 16777215);
                                        class68.method459(var48, var60, var46, var75);
                                    } else if (var73 == 10) {
                                        class68.method457(var74, var60, var59, 16777215);
                                        class68.method459(var48, var60, var46, var75);
                                    } else if (var73 == 11) {
                                        class68.method457(var74, var60, var59, 16777215);
                                        class68.method459(var48, var76, var46, var75);
                                    } else if (var73 == 12) {
                                        class68.method457(var48, var60, var59, 16777215);
                                        class68.method459(var48, var76, var46, var75);
                                    } else if (var73 == 17) {
                                        class68.method459(var48, var60, 1, var75);
                                    } else if (var73 == 18) {
                                        class68.method459(var74, var60, 1, var75);
                                    } else if (var73 == 19) {
                                        class68.method459(var74, var76, 1, var75);
                                    } else if (var73 == 20) {
                                        class68.method459(var48, var76, 1, var75);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class68.method459(var48 + var77, -var77 + var76, 1, var75);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class68.method459(var48 + var78, var60 - -var78, 1, var75);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg4 + var44;
                    int var80 = arg4 + var45;
                    for (int var81 = 0; var81 < var11; var81++) {
                        int var82;
                        if (class261.field4557.field3964 != -1) {
                            var82 = class261.field4557.field3964;
                        } else if ((arg1 + var13 & 0x4) == (arg8 + var81 & 0x4)) {
                            var82 = class139.field2471[class58.field976 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = ((var81 + 1) * arg7 + arg6 >> 16) + arg3;
                        int var84 = (arg7 * var81 + arg6 >> 16) + arg3;
                        int var85 = var83 - var84;
                        class68.method465(var80, var84, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = arg9 * var14 + arg5 >> 16;
            int var16 = arg5 + ((var14 + 1) * arg9) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg4 + var16;
                int var19 = arg4 + var15;
                int var20 = arg1 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class22.field256.length - 1)) {
                    short[][] var21 = class22.field256[var20];
                    for (int var22 = -2; var22 < (var11 + 2); var22++) {
                        int var23 = arg7 * var22 + arg6 >> 16;
                        int var24 = (var22 + 1) * arg7 + arg6 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg3 + var23;
                            int var27 = arg8 + var22 >> 6;
                            var10000 = arg3 + var24;
                            if (var27 >= 0 && var27 <= (var21.length - 1)) {
                                int var29 = (arg8 + var22 & 0x3F << 6) + (arg1 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29] & 0x3FFF;
                                    int var31 = (var21[var27][var29] & 0xC441) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class88.field1528[var30 - 1].field3024 * var25 / 4;
                                            int var33 = class88.field1528[var30 - 1].field3029 * var17 / 4;
                                            if (var33 != 0 && var32 != 0) {
                                                int var34 = class88.field1528[var30 - 1].field3030 * var25 / 4;
                                                class88.field1528[var30 - 1].method755(var19, var26 - var34, var33, var32);
                                            }
                                        } else if (var31 == 1) {
                                            int var41 = class194.field3406[var30 - 1].field3029 * var17 / 4;
                                            int var42 = class194.field3406[var30 - 1].field3024 * var25 / 4;
                                            if (var41 != 0 && var42 != 0) {
                                                int var43 = class194.field3406[var30 - 1].field3030 * var25 / 4;
                                                class194.field3406[var30 - 1].method755(var19, var26 - var43, var41, var42);
                                            }
                                        } else if (var31 == 2) {
                                            int var35 = class164.field2880[var30 - 1].field3029 * var17 / 4;
                                            int var36 = class164.field2880[var30 - 1].field3024 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class164.field2880[var30 - 1].field3030 * var25 / 4;
                                                class164.field2880[var30 - 1].method755(var19, var26 - var37, var35, var36);
                                            }
                                        } else if (var31 == 3) {
                                            int var38 = class237.field4094[var30 - 1].field3029 * var17 / 4;
                                            int var39 = class237.field4094[var30 - 1].field3024 * var25 / 4;
                                            if (var38 != 0 && var39 != 0) {
                                                int var40 = class237.field4094[var30 - 1].field3030 * var25 / 4;
                                                class237.field4094[var30 - 1].method755(var19, var26 - var40, var38, var39);
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

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
    public final boolean method1344(int arg0) {
        int var2 = -12 % ((arg0 - 31) / 63);
        field3477++;
        return this.field3478 != null;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3479 = null;
        if (arg0 >= -70) {
            method1345(-65);
        }
        field3480 = null;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public final void method1346(int arg0) {
        int var2 = -20 / ((arg0 - 73) / 45);
        field3471++;
        if (this.field3478 != null) {
            this.field3478.field3472 = this.field3472;
            this.field3472.field3478 = this.field3478;
            this.field3472 = null;
            this.field3478 = null;
        }
    }
}
