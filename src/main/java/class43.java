import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class43 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Le;")
    public static class191 field746 = class54.method368(" weitere Optionen", 2047);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Le;")
    public static class191 field747 = class54.method368("Welt", 2047);

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    public static int[] field751 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "D")
    public static double field750 = -1.0D;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Le;")
    public static class191 field753 = class54.method368(" (X", 2047);

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Le;")
    public static class191 field754 = class54.method368("showVideoAd", 2047);

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lng;")
    public static class121 field748;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field755++;
        int var11 = arg8 - arg2;
        int var12 = arg0 - arg5;
        if (class189.field3327 > arg0) {
            var12++;
        }
        if (arg8 < class161.field2728) {
            var11++;
        }
        if (arg7 >= -73) {
            field746 = null;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = arg6 * var13 + arg4 >> 16;
            int var45 = (var13 + 1) * arg6 + arg4 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = var13 + arg5 >> 6;
                if (var47 >= 0 && var47 <= (class147.field2480.length - 1)) {
                    int var48 = arg3 + var45;
                    int[][] var49 = class147.field2480[var47];
                    byte[][] var50 = class179.field3065[var47];
                    byte[][] var51 = class81.field1362[var47];
                    int var52 = arg3 + var44;
                    byte[][] var53 = class213.field3760[var47];
                    byte[][] var54 = class145.field2443[var47];
                    byte[][] var55 = class21.field301[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = (var56 + 1) * arg9 + arg1 >> 16;
                        int var58 = arg9 * var56 + arg1 >> 16;
                        int var59 = var57 - var58;
                        if (var59 > 0) {
                            int var60 = arg10 + var57;
                            int var61 = var56 + arg2 >> 6;
                            int var62 = arg10 + var58;
                            int var63 = arg2 + var56 & 0x3F;
                            int var64 = arg5 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var61 < 0 || var61 > var49.length - 1 || var49[var61] == null) {
                                if (class183.field3151.field896 != -1) {
                                    var66 = class183.field3151.field896;
                                } else if ((var56 + arg2 & 0x4) == (arg5 + var13 & 0x4)) {
                                    var66 = class137.field2296[class101.field1604 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var61 < 0 || var61 > (var49.length - 1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class7.method55(var52, var62, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var49[var61][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var50[var61] == null ? 0 : class137.field2296[var50[var61][var65] & 0xFF];
                            int var68 = var51[var61] == null ? 0 : class137.field2296[var51[var61][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class7.method55(var52, var62, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var53[var61] == null ? 0 : var53[var61][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class7.method55(var52, var62, var46, var59, var67);
                                    } else {
                                        class62.method417(var66, var67, true, var69 & 0x3, var59, var52, -30848, class7.field69, var46, var70 >> 2, var62);
                                    }
                                }
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    byte var71 = var54[var61][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class7.method55(var52, var62, var46, var59, var68);
                                    }
                                    class62.method417(0, var68, var67 == 0, var71 & 0x3, var59, var52, -30848, class7.field69, var46, var72 >> 2, var62);
                                }
                            }
                            if (var55[var61] != null) {
                                int var73 = var55[var61][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var52;
                                    } else {
                                        var74 = var48 - 1;
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
                                        class7.method51(var52, var62, var59, var75);
                                    } else if (var73 == 2) {
                                        class7.method41(var52, var62, var46, var75);
                                    } else if (var73 == 3) {
                                        class7.method51(var74, var62, var59, var75);
                                    } else if (var73 == 4) {
                                        class7.method41(var52, var76, var46, var75);
                                    } else if (var73 == 9) {
                                        class7.method51(var52, var62, var59, 16777215);
                                        class7.method41(var52, var62, var46, var75);
                                    } else if (var73 == 10) {
                                        class7.method51(var74, var62, var59, 16777215);
                                        class7.method41(var52, var62, var46, var75);
                                    } else if (var73 == 11) {
                                        class7.method51(var74, var62, var59, 16777215);
                                        class7.method41(var52, var76, var46, var75);
                                    } else if (var73 == 12) {
                                        class7.method51(var52, var62, var59, 16777215);
                                        class7.method41(var52, var76, var46, var75);
                                    } else if (var73 == 17) {
                                        class7.method41(var52, var62, 1, var75);
                                    } else if (var73 == 18) {
                                        class7.method41(var74, var62, 1, var75);
                                    } else if (var73 == 19) {
                                        class7.method41(var74, var76, 1, var75);
                                    } else if (var73 == 20) {
                                        class7.method41(var52, var76, 1, var75);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class7.method41(var52 + var78, -var78 + var76, 1, var75);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class7.method41(var52 + var77, var62 + var77, 1, var75);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var79 = arg3 + var44;
                    for (int var80 = 0; var80 < var11; var80++) {
                        int var82 = (arg9 * var80 + arg1 >> 16) + arg10;
                        int var83;
                        if (class183.field3151.field896 != -1) {
                            var83 = class183.field3151.field896;
                        } else if ((arg2 + var80 & 0x4) == (arg5 + var13 & 0x4)) {
                            var83 = class137.field2296[class101.field1604 + 1];
                        } else {
                            var83 = 4936552;
                        }
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        int var84 = ((var80 + 1) * arg9 + arg1 >> 16) + arg10;
                        int var85 = var84 - var82;
                        class7.method55(var79, var82, var46, var85, var83);
                    }
                    var10000 = arg3 + var45;
                }
            }
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = (var14 + 1) * arg6 + arg4 >> 16;
            int var16 = arg6 * var14 + arg4 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg3 + var16;
                var10000 = arg3 + var15;
                int var20 = arg5 + var14 >> 6;
                if (var20 >= 0 && class205.field3633.length - 1 >= var20) {
                    short[][] var21 = class205.field3633[var20];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg1 + ((var22 + 1) * arg9) >> 16;
                        int var24 = arg9 * var22 + arg1 >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            int var26 = arg2 + var22 >> 6;
                            var10000 = arg10 + var23;
                            int var28 = arg10 + var24;
                            if (var26 >= 0 && var26 <= (var21.length - 1)) {
                                int var29 = (arg2 + var22 & 0x3F << 6) + (arg5 + var14 & 0x3F);
                                if (var21[var26] != null) {
                                    int var30 = var21[var26][var29] & 0x3FFF;
                                    int var31 = var21[var26][var29] >> 14 & 0x3;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var41 = class242.field4320[var30 - 1].field4140 * var17 / 4;
                                            int var42 = class242.field4320[var30 - 1].field4144 * var25 / 4;
                                            int var43 = class242.field4320[var30 - 1].field4139 * var25 / 4;
                                            class242.field4320[var30 - 1].method406(var18, var28 - var43, var41, var42);
                                        } else if (var31 == 1) {
                                            int var38 = class55.field1017[var30 - 1].field4139 * var25 / 4;
                                            int var39 = class55.field1017[var30 - 1].field4140 * var17 / 4;
                                            int var40 = class55.field1017[var30 - 1].field4144 * var25 / 4;
                                            class55.field1017[var30 - 1].method406(var18, var28 - var38, var39, var40);
                                        } else if (var31 == 2) {
                                            int var35 = class218.field3834[var30 - 1].field4140 * var17 / 4;
                                            int var36 = class218.field3834[var30 - 1].field4144 * var25 / 4;
                                            int var37 = class218.field3834[var30 - 1].field4139 * var25 / 4;
                                            class218.field3834[var30 - 1].method406(var18, var28 - var37, var35, var36);
                                        } else if (var31 == 3) {
                                            int var32 = class22.field313[var30 - 1].field4144 * var25 / 4;
                                            int var33 = class22.field313[var30 - 1].field4140 * var17 / 4;
                                            int var34 = class22.field313[var30 - 1].field4139 * var25 / 4;
                                            class22.field313[var30 - 1].method406(var18, var28 - var34, var33, var32);
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

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static final void method280(int arg0) {
        if (arg0 != -1357453968) {
            method281((byte) 50);
        }
        class91.field1475 = new class97(32);
        field749++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method281(byte arg0) {
        field754 = null;
        field748 = null;
        field747 = null;
        field753 = null;
        int var1 = -66 / ((arg0 + 2) / 53);
        field751 = null;
        field746 = null;
    }
}
