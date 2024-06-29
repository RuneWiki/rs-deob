import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class261 extends class95 {

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "Lkh;")
    public class14 field4597;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "[I")
    public static int[] field4594 = new int[2500];

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "Lsf;")
    public static class108 field4595 = class140.method973(255, "floorshadows");

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "Lcd;")
    public static class69 field4598 = new class69(64);

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field4602 = 0;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "Lkn;")
    public static class199 field4601;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IJ)Lsf;", line = 23)
    public static final class108 method1851(int arg0, long arg1) {
        if (arg0 != 1) {
            method1851(43, 11L);
        }
        field4596++;
        return class132.method906(10, 10241, arg1, false);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIILma;Lma;IIJ)V", line = 39)
    public static final void method1852(int arg0, int arg1, int arg2, int arg3, class290 arg4, class290 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class174 var10 = new class174();
        var10.field3184 = arg8;
        var10.field3181 = arg1 * 128 + 64;
        var10.field3187 = arg2 * 128 + 64;
        var10.field3189 = arg3;
        var10.field3183 = arg4;
        var10.field3173 = arg5;
        var10.field3178 = arg6;
        var10.field3175 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class99.field1759[var11][arg1][arg2] == null) {
                class99.field1759[var11][arg1][arg2] = new class74(var11, arg1, arg2);
            }
        }
        class99.field1759[arg0][arg1][arg2].field1117 = var10;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIIIZ)V", line = 71)
    public static final void method1853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        int var11 = arg0 - arg4;
        int var12 = arg7 - arg8;
        if (class74.field1113 > arg0) {
            var11++;
        }
        field4603++;
        if (class152.field2757 > arg7) {
            var12++;
        }
        if (arg10) {
            field4604 = -81;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg6 + ((var13 + 1) * arg3) >> 16;
            int var15 = arg3 * var13 + arg6 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg4 + var13 >> 6;
                if (var17 >= 0 && var17 <= class255.field4439.length - 1) {
                    int var18 = arg9 + var15;
                    int[][] var19 = class255.field4439[var17];
                    int var20 = arg9 + var14;
                    byte[][] var21 = class183.field3360[var17];
                    byte[][] var22 = class5.field69[var17];
                    byte[][] var23 = class190.field3449[var17];
                    byte[][] var24 = class304.field5273[var17];
                    byte[][] var25 = class202.field3650[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg5 + (arg2 * var26) >> 16;
                        int var28 = arg5 + ((var26 + 1) * arg2) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var28;
                            int var31 = arg1 + var27;
                            int var32 = arg8 + var26 >> 6;
                            int var33 = var26 + arg8 & 0x3F;
                            int var34 = arg4 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var19.length - 1 < var32 || var19[var32] == null) {
                                if (class132.field2261.field3156 != -1) {
                                    var36 = class132.field2261.field3156;
                                } else if ((arg4 + var13 & 0x4) == (arg8 + var26 & 0x4)) {
                                    var36 = class159.field2859[class145.field2622 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var19.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class28.method193(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var21[var32] == null ? 0 : class159.field2859[var21[var32][var35] & 0xFF];
                            int var38 = var23[var32] == null ? 0 : class159.field2859[var23[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class28.method193(var18, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var32] == null ? 0 : var22[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class28.method193(var18, var31, var16, var29, var37);
                                    } else {
                                        class86.method595(var29, var39 & 0x3, var18, var37, class28.field427, var36, true, var40 >> 2, true, var31, var16);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class28.method193(var18, var31, var16, var29, var38);
                                    }
                                    class86.method595(var29, var41 & 0x3, var18, var38, class28.field427, 0, var37 == 0, var42 >> 2, true, var31, var16);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var31;
                                    } else {
                                        var44 = var30 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var16 == 1) {
                                        var46 = var18;
                                    } else {
                                        var46 = var20 - 1;
                                    }
                                    if (var43 == 1) {
                                        class28.method188(var18, var31, var29, var45);
                                    } else if (var43 == 2) {
                                        class28.method184(var18, var31, var16, var45);
                                    } else if (var43 == 3) {
                                        class28.method188(var46, var31, var29, var45);
                                    } else if (var43 == 4) {
                                        class28.method184(var18, var44, var16, var45);
                                    } else if (var43 == 9) {
                                        class28.method188(var18, var31, var29, 16777215);
                                        class28.method184(var18, var31, var16, var45);
                                    } else if (var43 == 10) {
                                        class28.method188(var46, var31, var29, 16777215);
                                        class28.method184(var18, var31, var16, var45);
                                    } else if (var43 == 11) {
                                        class28.method188(var46, var31, var29, 16777215);
                                        class28.method184(var18, var44, var16, var45);
                                    } else if (var43 == 12) {
                                        class28.method188(var18, var31, var29, 16777215);
                                        class28.method184(var18, var44, var16, var45);
                                    } else if (var43 == 17) {
                                        class28.method184(var18, var31, 1, var45);
                                    } else if (var43 == 18) {
                                        class28.method184(var46, var31, 1, var45);
                                    } else if (var43 == 19) {
                                        class28.method184(var46, var44, 1, var45);
                                    } else if (var43 == 20) {
                                        class28.method184(var18, var44, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class28.method184(var18 + var48, -var48 + var44, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class28.method184(var18 + var47, var31 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg9 + var15;
                    for (int var50 = 0; var50 < var12; var50++) {
                        int var51 = (arg5 + ((var50 + 1) * arg2) >> 16) + arg1;
                        int var52 = (arg2 * var50 + arg5 >> 16) + arg1;
                        int var53;
                        if (class132.field2261.field3156 != -1) {
                            var53 = class132.field2261.field3156;
                        } else if ((var50 + arg8 & 0x4) == (arg4 + var13 & 0x4)) {
                            var53 = class159.field2859[class145.field2622 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var54 = var51 - var52;
                        class28.method193(var49, var52, var16, var54, var53);
                    }
                    var10000 = arg9 + var14;
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg3 * var56 + arg6 >> 16;
            int var58 = (var56 + 1) * arg3 + arg6 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg9 + var58;
                int var61 = arg4 + var56 >> 6;
                int var62 = arg9 + var57;
                if (var61 >= 0 && var61 <= class143.field2517.length - 1) {
                    short[][] var63 = class143.field2517[var61];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg5 + (arg2 * var64) >> 16;
                        int var66 = (var64 + 1) * arg2 + arg5 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg1 + var66;
                            int var69 = arg1 + var65;
                            int var70 = var64 + arg8 >> 6;
                            if (var70 >= 0 && (var63.length - 1) >= var70) {
                                int var71 = ((var64 + arg8 & 0x3F) << 6) + (var56 + arg4 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = (var63[var70][var71] & 0xEAD8) >> 14;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var83 = class143.field2526[var72 - 1].field888 * var59 / 4;
                                            int var84 = class143.field2526[var72 - 1].field886 * var67 / 4;
                                            if (var83 != 0 && var84 != 0) {
                                                int var85 = class143.field2526[var72 - 1].field884 * var67 / 4;
                                                class143.field2526[var72 - 1].method1830(var62, var69 - var85, var83, var84);
                                            }
                                        } else if (var73 == 1) {
                                            int var74 = class103.field1803[var72 - 1].field888 * var59 / 4;
                                            int var75 = class103.field1803[var72 - 1].field886 * var67 / 4;
                                            if (var74 != 0 && var75 != 0) {
                                                int var76 = class103.field1803[var72 - 1].field884 * var67 / 4;
                                                class103.field1803[var72 - 1].method1830(var62, var69 - var76, var74, var75);
                                            }
                                        } else if (var73 == 2) {
                                            int var80 = class196.field3549[var72 - 1].field888 * var59 / 4;
                                            int var81 = class196.field3549[var72 - 1].field886 * var67 / 4;
                                            if (var80 != 0 && var81 != 0) {
                                                int var82 = class196.field3549[var72 - 1].field884 * var67 / 4;
                                                class196.field3549[var72 - 1].method1830(var62, var69 - var82, var80, var81);
                                            }
                                        } else if (var73 == 3) {
                                            int var77 = class10.field124[var72 - 1].field886 * var67 / 4;
                                            int var78 = class10.field124[var72 - 1].field888 * var59 / 4;
                                            if (var78 != 0 && var77 != 0) {
                                                int var79 = class10.field124[var72 - 1].field884 * var67 / 4;
                                                class10.field124[var72 - 1].method1830(var62, var69 - var79, var78, var77);
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

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lkh;)V", line = 506)
    public class261(class14 arg0) {
        this.field4597 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 515)
    public static void method1854(int arg0) {
        field4595 = null;
        field4594 = null;
        field4601 = null;
        field4598 = null;
        if (arg0 != -1535926992) {
            field4595 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)Z", line = 530)
    public static final boolean method1855(int arg0, int arg1) {
        if (arg1 < 126) {
            method1853(62, 25, -17, 19, 110, 87, 96, -48, 30, 0, true);
        }
        field4600++;
        return arg0 >= 48 && arg0 <= 57;
    }
}
