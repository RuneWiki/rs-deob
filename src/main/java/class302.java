import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class302 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[[I")
    public static int[][] field5121 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 16)
    public static void method2053(int arg0) {
        if (arg0 == 1) {
            field5121 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZIIIIII)V", line = 26)
    public static final void method2054(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4) {
            field5121 = (int[][]) ((int[][]) null);
        }
        int var11 = arg7 - arg2;
        field5122++;
        if (arg7 < class5.field110) {
            var11++;
        }
        int var12 = arg6 - arg10;
        if (class155.field2671 > arg6) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = (var13 + 1) * arg8 + arg3 >> 16;
            int var15 = arg8 * var13 + arg3 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = var13 + arg2 >> 6;
                if (var17 >= 0 && var17 <= (class107.field1825.length - 1)) {
                    int var18 = arg1 + var15;
                    int[][] var19 = class107.field1825[var17];
                    int var20 = arg1 + var14;
                    byte[][] var21 = class36.field740[var17];
                    byte[][] var22 = class183.field3213[var17];
                    byte[][] var23 = class20.field536[var17];
                    byte[][] var24 = class273.field4739[var17];
                    byte[][] var25 = class217.field3818[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg5 * var26 + arg9 >> 16;
                        int var28 = (var26 + 1) * arg5 + arg9 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg0 + var27;
                            int var31 = arg0 + var28;
                            int var32 = arg10 + var26 >> 6;
                            int var33 = arg2 + var13 & 0x3F;
                            int var34 = arg10 + var26 & 0x3F;
                            int var35 = (var34 << 6) + var33;
                            int var36;
                            if (var32 < 0 || var32 > (var19.length - 1) || var19[var32] == null) {
                                if (class139.field2384.field4119 != -1) {
                                    var36 = class139.field2384.field4119;
                                } else if ((var13 + arg2 & 0x4) == (arg10 + var26 & 0x4)) {
                                    var36 = class45.field909[class259.field4478 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var19.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class213.method1464(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var21[var32] == null ? 0 : class45.field909[var21[var32][var35] & 0xFF];
                            int var38 = var24[var32] == null ? 0 : class45.field909[var24[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class213.method1464(var18, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    byte var39 = var25[var32] == null ? 0 : var25[var32][var35];
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class213.method1464(var18, var30, var16, var29, var37);
                                    } else {
                                        class167.method1096(class213.field3769, var30, var40 >> 2, 19453, true, var36, var29, var37, var16, var18, var39 & 0x3);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var23[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class213.method1464(var18, var30, var16, var29, var38);
                                    }
                                    class167.method1096(class213.field3769, var30, var42 >> 2, 19453, var37 == 0, 0, var29, var38, var16, var18, var41 & 0x3);
                                }
                            }
                            if (var22[var32] != null) {
                                int var43 = var22[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var20 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var30;
                                    } else {
                                        var46 = var31 - 1;
                                    }
                                    if (var43 == 1) {
                                        class213.method1474(var18, var30, var29, var45);
                                    } else if (var43 == 2) {
                                        class213.method1481(var18, var30, var16, var45);
                                    } else if (var43 == 3) {
                                        class213.method1474(var44, var30, var29, var45);
                                    } else if (var43 == 4) {
                                        class213.method1481(var18, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class213.method1474(var18, var30, var29, 16777215);
                                        class213.method1481(var18, var30, var16, var45);
                                    } else if (var43 == 10) {
                                        class213.method1474(var44, var30, var29, 16777215);
                                        class213.method1481(var18, var30, var16, var45);
                                    } else if (var43 == 11) {
                                        class213.method1474(var44, var30, var29, 16777215);
                                        class213.method1481(var18, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class213.method1474(var18, var30, var29, 16777215);
                                        class213.method1481(var18, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class213.method1481(var18, var30, 1, var45);
                                    } else if (var43 == 18) {
                                        class213.method1481(var44, var30, 1, var45);
                                    } else if (var43 == 19) {
                                        class213.method1481(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class213.method1481(var18, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class213.method1481(var18 + var47, var46 - var47, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class213.method1481(var18 + var48, var30 + var48, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var14;
                    int var50 = arg1 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class139.field2384.field4119 != -1) {
                            var52 = class139.field2384.field4119;
                        } else if ((var13 + arg2 & 0x4) == (var51 + arg10 & 0x4)) {
                            var52 = class45.field909[class259.field4478 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg9 + (arg5 * var51) >> 16) + arg0;
                        int var54 = ((var51 + 1) * arg5 + arg9 >> 16) + arg0;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var55 = var54 - var53;
                        class213.method1464(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = (var56 + 1) * arg8 + arg3 >> 16;
            int var58 = arg8 * var56 + arg3 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                var10000 = arg1 + var57;
                int var61 = arg2 + var56 >> 6;
                int var62 = arg1 + var58;
                if (var61 >= 0 && var61 <= class206.field3626.length - 1) {
                    short[][] var63 = class206.field3626[var61];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg9 + (arg5 * var64) >> 16;
                        int var66 = (var64 + 1) * arg5 + arg9 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg0 + var66;
                            int var69 = var64 + arg10 >> 6;
                            int var70 = arg0 + var65;
                            if (var69 >= 0 && var69 <= (var63.length - 1)) {
                                int var71 = ((arg10 + var64 & 0x3F) << 6) + (arg2 + var56 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71] & 0x3FFF;
                                    int var73 = var63[var69][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class254.field4377[var72 - 1].field2619 * var59 / 4;
                                            int var75 = class254.field4377[var72 - 1].field2610 * var67 / 4;
                                            int var76 = class254.field4377[var72 - 1].field2611 * var67 / 4;
                                            class254.field4377[var72 - 1].method809(var62, var70 - var75, var74, var76);
                                        } else if (var73 == 1) {
                                            int var83 = class278.field4795[var72 - 1].field2619 * var59 / 4;
                                            int var84 = class278.field4795[var72 - 1].field2611 * var67 / 4;
                                            int var85 = class278.field4795[var72 - 1].field2610 * var67 / 4;
                                            class278.field4795[var72 - 1].method809(var62, var70 - var85, var83, var84);
                                        } else if (var73 == 2) {
                                            int var77 = class242.field4139[var72 - 1].field2611 * var67 / 4;
                                            int var78 = class242.field4139[var72 - 1].field2619 * var59 / 4;
                                            int var79 = class242.field4139[var72 - 1].field2610 * var67 / 4;
                                            class242.field4139[var72 - 1].method809(var62, var70 - var79, var78, var77);
                                        } else if (var73 == 3) {
                                            int var80 = class204.field3602[var72 - 1].field2619 * var59 / 4;
                                            int var81 = class204.field3602[var72 - 1].field2611 * var67 / 4;
                                            int var82 = class204.field3602[var72 - 1].field2610 * var67 / 4;
                                            class204.field3602[var72 - 1].method809(var62, var70 - var82, var80, var81);
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

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lld;I)V", line = 460)
    public static final void method2055(class115 arg0, int arg1) {
        field5123++;
        if (arg1 != -1) {
            method2056(125, 63, 49, -78, -60);
        }
        for (class3 var2 = (class3) class63.field1195.method2024(0); var2 != null; var2 = (class3) class63.field1195.method2027(1211754408)) {
            if (var2.field51 == arg0) {
                if (var2.field52 != null) {
                    class188.field3260.method393(var2.field52);
                    var2.field52 = null;
                }
                var2.method1978((byte) 100);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 513)
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5120++;
        class181.field3173 = arg4;
        class43.field875 = arg0;
        if (arg3 != 1) {
            method2055((class115) null, 89);
        }
        class193.field3335 = arg1;
        class70.field1315 = arg2;
    }
}
