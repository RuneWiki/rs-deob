import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class156 extends class240 {

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Lcd;")
    public static class64 field2753 = class44.method335((byte) 71, "scape main");

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Z")
    public static boolean field2761 = false;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Lcd;")
    public static class64 field2763 = class44.method335((byte) 71, "Fertigkeit:");

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "Lod;")
    public static class24 field2756;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 11)
    public static void method1122(int arg0) {
        field2763 = null;
        field2756 = null;
        if (arg0 == 8515) {
            field2753 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V", line = 28)
    private class156(int arg0) {
        super(0, true);
        this.field2758 = 4096;
        this.field2758 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIIII)V", line = 39)
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0 - arg7;
        if (class226.field3845 > arg0) {
            var11++;
        }
        int var12 = arg9 - arg1;
        field2754++;
        if (class233.field3934 > arg9) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = (var13 + 1) * arg3 + arg4 >> 16;
            int var15 = arg4 + (arg3 * var13) >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg7 + var13 >> 6;
                if (var17 >= 0 && class295.field5073.length - 1 >= var17) {
                    int var18 = arg10 + var15;
                    int var19 = arg10 + var14;
                    byte[][] var20 = class159.field2812[var17];
                    int[][] var21 = class295.field5073[var17];
                    byte[][] var22 = class253.field4416[var17];
                    byte[][] var23 = class173.field2988[var17];
                    byte[][] var24 = class134.field2377[var17];
                    byte[][] var25 = class122.field2192[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg8 * var26 + arg2 >> 16;
                        int var28 = (var26 + 1) * arg8 + arg2 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg5 + var27;
                            int var31 = arg5 + var28;
                            int var32 = arg1 + var26 >> 6;
                            int var33 = arg1 + var26 & 0x3F;
                            int var34 = arg7 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var32 > (var21.length - 1) || var21[var32] == null) {
                                if (class165.field2897.field5224 != -1) {
                                    var36 = class165.field2897.field5224;
                                } else if ((arg1 + var26 & 0x4) == (arg7 + var13 & 0x4)) {
                                    var36 = class288.field4920[class141.field2488 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var21.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class210.method1469(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var23[var32] == null ? 0 : class288.field4920[var23[var32][var35] & 0xFF];
                            int var38 = var22[var32] == null ? 0 : class288.field4920[var22[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class210.method1469(var18, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    byte var39 = var20[var32] == null ? 0 : var20[var32][var35];
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class210.method1469(var18, var30, var16, var29, var37);
                                    } else {
                                        class141.method998(var18, true, var29, var30, class210.field3529, var37, var16, var39 & 0x3, -1929, var40 >> 2, var36);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class210.method1469(var18, var30, var16, var29, var38);
                                    }
                                    class141.method998(var18, var37 == 0, var29, var30, class210.field3529, var38, var16, var41 & 0x3, arg6 - 2116, var42 >> 2, 0);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45 = 13421772;
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var30;
                                    } else {
                                        var46 = var31 - 1;
                                    }
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var45 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class210.method1474(var18, var30, var29, var45);
                                    } else if (var43 == 2) {
                                        class210.method1475(var18, var30, var16, var45);
                                    } else if (var43 == 3) {
                                        class210.method1474(var44, var30, var29, var45);
                                    } else if (var43 == 4) {
                                        class210.method1475(var18, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class210.method1474(var18, var30, var29, 16777215);
                                        class210.method1475(var18, var30, var16, var45);
                                    } else if (var43 == 10) {
                                        class210.method1474(var44, var30, var29, 16777215);
                                        class210.method1475(var18, var30, var16, var45);
                                    } else if (var43 == 11) {
                                        class210.method1474(var44, var30, var29, 16777215);
                                        class210.method1475(var18, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class210.method1474(var18, var30, var29, 16777215);
                                        class210.method1475(var18, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class210.method1475(var18, var30, 1, var45);
                                    } else if (var43 == 18) {
                                        class210.method1475(var44, var30, 1, var45);
                                    } else if (var43 == 19) {
                                        class210.method1475(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class210.method1475(var18, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class210.method1475(var18 + var48, -var48 + var46, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class210.method1475(var18 + var47, var30 - -var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg10 + var15;
                    for (int var50 = 0; var50 < var12; var50++) {
                        int var51 = (arg8 * var50 + arg2 >> 16) + arg5;
                        int var52;
                        if (class165.field2897.field5224 != -1) {
                            var52 = class165.field2897.field5224;
                        } else if ((arg1 + var50 & 0x4) == (arg7 + var13 & 0x4)) {
                            var52 = class288.field4920[class141.field2488 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = ((var50 + 1) * arg8 + arg2 >> 16) + arg5;
                        int var54 = var53 - var51;
                        class210.method1469(var49, var51, var16, var54, var52);
                    }
                    var10000 = arg10 + var14;
                }
            }
        }
        if (arg6 != 187) {
            field2751 = 33;
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg3 * var56 + arg4 >> 16;
            int var58 = (var56 + 1) * arg3 + arg4 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg10 + var57;
                var10000 = arg10 + var58;
                int var62 = var56 + arg7 >> 6;
                if (var62 >= 0 && (class270.field4665.length - 1) >= var62) {
                    short[][] var63 = class270.field4665[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg8 * var64 + arg2 >> 16;
                        int var66 = arg2 + ((var64 + 1) * arg8) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg5 + var66;
                            int var69 = arg5 + var65;
                            int var70 = arg1 + var64 >> 6;
                            if (var70 >= 0 && var70 <= var63.length - 1) {
                                int var71 = (arg1 + var64 & 0x3F << 6) + (var56 + arg7 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] >> 14 & 0x3;
                                    int var73 = var63[var70][var71] & 0x3FFF;
                                    if (var73 != 0) {
                                        if (var72 == 0) {
                                            int var83 = class147.field2597[var73 - 1].field3001 * var59 / 4;
                                            int var84 = class147.field2597[var73 - 1].field3003 * var67 / 4;
                                            int var85 = class147.field2597[var73 - 1].field3011 * var67 / 4;
                                            class147.field2597[var73 - 1].method1234(var60, var69 - var85, var83, var84);
                                        } else if (var72 == 1) {
                                            int var74 = class40.field628[var73 - 1].field3001 * var59 / 4;
                                            int var75 = class40.field628[var73 - 1].field3003 * var67 / 4;
                                            int var76 = class40.field628[var73 - 1].field3011 * var67 / 4;
                                            class40.field628[var73 - 1].method1234(var60, var69 - var76, var74, var75);
                                        } else if (var72 == 2) {
                                            int var77 = class75.field1413[var73 - 1].field3001 * var59 / 4;
                                            int var78 = class75.field1413[var73 - 1].field3011 * var67 / 4;
                                            int var79 = class75.field1413[var73 - 1].field3003 * var67 / 4;
                                            class75.field1413[var73 - 1].method1234(var60, var69 - var78, var77, var79);
                                        } else if (var72 == 3) {
                                            int var80 = class10.field207[var73 - 1].field3011 * var67 / 4;
                                            int var81 = class10.field207[var73 - 1].field3003 * var67 / 4;
                                            int var82 = class10.field207[var73 - 1].field3001 * var59 / 4;
                                            class10.field207[var73 - 1].method1234(var60, var69 - var80, var82, var81);
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

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V", line = 467)
    private static final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class115 var5 = (class115) class17.field351.method1151((long) arg4, arg1);
        field2757++;
        if (var5 == null) {
            var5 = new class115();
            class17.field351.method1149(var5, (long) arg4, arg1 ^ 0xFFFFFF8E);
        }
        if (var5.field2109.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field2109.length; var8++) {
                var6[var8] = var5.field2109[var8];
                var7[var8] = var5.field2112[var8];
            }
            for (int var9 = var5.field2109.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2112 = var7;
            var5.field2109 = var6;
        }
        var5.field2109[arg0] = arg2;
        var5.field2112[arg0] = arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILkh;)V", line = 530)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field2758 = (arg2.method152((byte) -112) << 12) / 255;
        }
        if (arg0 != 2) {
            this.method12(32, 70);
        }
        field2752++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V", line = 553)
    public static final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2750++;
        class198.method1389(-13173, arg2);
        int var7 = 0;
        int var8 = arg2;
        int var9 = arg2 - arg4;
        int var10 = -arg2;
        if (arg1 > -1) {
            method1123(123, 56, 80, 89, 125, -40, -61, -22, -73, 14, -73);
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        if (class180.field3098 <= arg0 && arg0 <= class201.field3444) {
            int[] var15 = class124.field2241[arg0];
            int var16 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 - arg2);
            int var17 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg2 + arg3);
            int var18 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 - var9);
            int var19 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 + var9);
            class31.method268(var18, 121, var16, var15, arg6);
            class31.method268(var19, 126, var18, var15, arg5);
            class31.method268(var17, 125, var19, var15, arg6);
        }
        while (var8 > var7) {
            var13 += 2;
            var12 += var13;
            var14 += 2;
            var10 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class89.field1605[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                int var20 = arg0 - var8;
                var10 -= var8 << 1;
                int var21 = arg0 + var8;
                if (var21 >= class180.field3098 && var20 <= class201.field3444) {
                    if (var8 >= var9) {
                        int var22 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 + var7);
                        int var23 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 - var7);
                        if (class201.field3444 >= var21) {
                            class31.method268(var22, 122, var23, class124.field2241[var21], arg6);
                        }
                        if (class180.field3098 <= var20) {
                            class31.method268(var22, 124, var23, class124.field2241[var20], arg6);
                        }
                    } else {
                        int var24 = class89.field1605[var8];
                        int var25 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 + var7);
                        int var26 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 - var7);
                        int var27 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 + var24);
                        int var28 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 - var24);
                        if (var21 <= class201.field3444) {
                            int[] var29 = class124.field2241[var21];
                            class31.method268(var28, 119, var26, var29, arg6);
                            class31.method268(var27, 121, var28, var29, arg5);
                            class31.method268(var25, 124, var27, var29, arg6);
                        }
                        if (class180.field3098 <= var20) {
                            int[] var30 = class124.field2241[var20];
                            class31.method268(var28, 118, var26, var30, arg6);
                            class31.method268(var27, 125, var28, var30, arg5);
                            class31.method268(var25, 127, var27, var30, arg6);
                        }
                    }
                }
            }
            int var31 = arg0 + var7;
            int var32 = arg0 - var7;
            if (var31 >= class180.field3098 && var32 <= class201.field3444) {
                int var33 = arg3 + var8;
                int var34 = arg3 - var8;
                if (class290.field4976 <= var33 && class153.field2714 >= var34) {
                    int var35 = class160.method1155(class153.field2714, class290.field4976, 268435455, var33);
                    int var36 = class160.method1155(class153.field2714, class290.field4976, 268435455, var34);
                    if (var7 < var9) {
                        int var37 = var11 < var7 ? class89.field1605[var7] : var11;
                        int var38 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 + var37);
                        int var39 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg3 - var37);
                        if (class201.field3444 >= var31) {
                            int[] var40 = class124.field2241[var31];
                            class31.method268(var39, 127, var36, var40, arg6);
                            class31.method268(var38, 118, var39, var40, arg5);
                            class31.method268(var35, 120, var38, var40, arg6);
                        }
                        if (var32 >= class180.field3098) {
                            int[] var41 = class124.field2241[var32];
                            class31.method268(var39, 119, var36, var41, arg6);
                            class31.method268(var38, 122, var39, var41, arg5);
                            class31.method268(var35, 120, var38, var41, arg6);
                        }
                    } else {
                        if (var31 <= class201.field3444) {
                            class31.method268(var35, 121, var36, class124.field2241[var31], arg6);
                        }
                        if (class180.field3098 <= var32) {
                            class31.method268(var35, 118, var36, class124.field2241[var32], arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I", line = 752)
    public final int[] method12(int arg0, int arg1) {
        field2764++;
        if (arg0 != 64) {
            return (int[]) null;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            class95.method718(var3, 0, class169.field2936, this.field2758);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)Z", line = 775)
    public static final boolean method1126(int arg0) throws IOException {
        field2760++;
        if (class216.field3626 == null) {
            return false;
        }
        int var1 = class216.field3626.method219(0);
        if (arg0 != 30415) {
            return false;
        } else if (var1 == 0) {
            return false;
        } else {
            if (class274.field4709 == -1) {
                class216.field3626.method221(class108.field1991.field254, 0, -3, 1);
                var1--;
                class108.field1991.field281 = 0;
                class274.field4709 = class108.field1991.method1219((byte) 126);
                class26.field428 = class31.field525[class274.field4709];
            }
            if (class26.field428 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class216.field3626.method221(class108.field1991.field254, 0, -128, 1);
                class26.field428 = class108.field1991.field254[0] & 0xFF;
            }
            if (class26.field428 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class216.field3626.method221(class108.field1991.field254, 0, -128, 2);
                class108.field1991.field281 = 0;
                class26.field428 = class108.field1991.method112((byte) 92);
                var1 -= 2;
            }
            if (var1 < class26.field428) {
                return false;
            }
            class108.field1991.field281 = 0;
            class216.field3626.method221(class108.field1991.field254, 0, 52, class26.field428);
            class299.field5163 = class273.field4685;
            class133.field2361 = 0;
            class273.field4685 = field2765;
            field2765 = class274.field4709;
            if (class274.field4709 == 174) {
                class198.method1386(0);
                int var348 = class108.field1991.method129(2121034712);
                int var349 = class108.field1991.method133(-128);
                int var350 = class108.field1991.method152((byte) -87);
                class77.field1456[var349] = var348;
                class160.field2824[var349] = var350;
                class274.field4708[var349] = 1;
                for (int var351 = 0; var351 < 98; var351++) {
                    if (var348 >= class195.field3314[var351]) {
                        class274.field4708[var349] = var351 + 2;
                    }
                }
                class260.field4479[class224.method1614(31, class206.field3516++)] = var349;
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 67) {
                class89.field1613 = class108.field1991.method101(128);
                class270.field4658 = class108.field1991.method101(arg0 - 30287);
                while (class108.field1991.field281 < class26.field428) {
                    class274.field4709 = class108.field1991.method152((byte) -89);
                    class184.method1296(arg0 ^ 0x764F);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 169) {
                class180.method1282(class108.field1991, arg0 ^ 0x592F);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 131) {
                class198.method1386(0);
                class220.field3724 = class108.field1991.method153(109);
                class274.field4709 = -1;
                class149.field2621 = class238.field4039;
                return true;
            } else if (class274.field4709 == 221) {
                int var344 = class108.field1991.method108((byte) -107);
                int var345 = class108.field1991.method142(arg0 - 30418);
                int var346 = class108.field1991.method118(25);
                int var347 = class108.field1991.method108((byte) 92);
                if (class235.method1686((byte) 125, var347)) {
                    class258.method1832(var345, 4, var346 << 16 | var344, 7);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 199) {
                for (int var342 = 0; var342 < class284.field4888.length; var342++) {
                    if (class284.field4888[var342] != null) {
                        class284.field4888[var342].field1902 = -1;
                    }
                }
                for (int var343 = 0; var343 < class2.field12.length; var343++) {
                    if (class2.field12[var343] != null) {
                        class2.field12[var343].field1902 = -1;
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 120) {
                int var2 = class108.field1991.method105((byte) 124);
                int var3 = class108.field1991.method112((byte) 92);
                class60 var4;
                if (var2 >= 0) {
                    var4 = class125.method907(var2, -99);
                } else {
                    var4 = null;
                }
                if (var2 < -70000) {
                    var3 += 32768;
                }
                while (class26.field428 > class108.field1991.field281) {
                    int var5 = class108.field1991.method163(255);
                    int var6 = 0;
                    int var7 = class108.field1991.method112((byte) 92);
                    if (var7 != 0) {
                        var6 = class108.field1991.method152((byte) -117);
                        if (var6 == 255) {
                            var6 = class108.field1991.method105((byte) 98);
                        }
                    }
                    if (var4 != null && var5 >= 0 && var4.field1117.length > var5) {
                        var4.field1117[var5] = var7;
                        var4.field1110[var5] = var6;
                    }
                    method1124(var5, arg0 - 30415, var7 + -1, var6, var3);
                }
                if (var4 != null) {
                    class190.method1342(var4, 0);
                }
                class198.method1386(0);
                class78.field1463[class224.method1614(class82.field1519++, 31)] = class224.method1614(var3, 32767);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 105) {
                int var339 = class108.field1991.method129(arg0 ^ 0x7E6C1D17);
                class60 var340 = class125.method907(var339, -108);
                for (int var341 = 0; var341 < var340.field1117.length; var341++) {
                    var340.field1117[var341] = -1;
                    var340.field1117[var341] = 0;
                }
                class190.method1342(var340, arg0 - 30415);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 18) {
                int var335 = class108.field1991.method118(63);
                int var336 = class108.field1991.method112((byte) 92);
                int var337 = class108.field1991.method152((byte) -107);
                class232 var338 = class2.field12[var336];
                if (var338 != null) {
                    class76.method603(var337, var338, (byte) -128, var335);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 154) {
                long var8 = class108.field1991.method146((byte) 122);
                class64 var10 = class179.method1254(class96.method724((byte) -71, class108.field1991).method520(true));
                class233.method1670(var10, class99.method734(true, var8).method510(-39), 6, (byte) -128);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 9) {
                class37.method298(24723);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 143) {
                int var11 = class108.field1991.method152((byte) -106);
                int var12 = class108.field1991.method152((byte) -107);
                int var13 = class108.field1991.method152((byte) -123);
                int var14 = class108.field1991.method152((byte) -120);
                int var15 = class108.field1991.method112((byte) 92);
                class315.field5332[var11] = true;
                class173.field2987[var11] = var12;
                class272.field4672[var11] = var13;
                class147.field2594[var11] = var14;
                class315.field5341[var11] = var15;
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 47) {
                class268.field4626 = class238.field4039;
                long var323 = class108.field1991.method146((byte) -39);
                if (var323 == 0L) {
                    class118.field2153 = null;
                    class109.field2012 = 0;
                    class274.field4709 = -1;
                    class54.field908 = null;
                    class238.field4038 = null;
                    return true;
                }
                long var325 = class108.field1991.method146((byte) -119);
                class54.field908 = class99.method734(true, var325);
                class238.field4038 = class99.method734(true, var323);
                class97.field1776 = class108.field1991.method150((byte) 108);
                int var327 = class108.field1991.method152((byte) -98);
                if (var327 == 255) {
                    class274.field4709 = -1;
                    return true;
                }
                class112[] var328 = new class112[100];
                class109.field2012 = var327;
                for (int var329 = 0; var329 < class109.field2012; var329++) {
                    var328[var329] = new class112();
                    var328[var329].field417 = class108.field1991.method146((byte) 124);
                    var328[var329].field2079 = class99.method734(true, var328[var329].field417);
                    var328[var329].field2074 = class108.field1991.method112((byte) 92);
                    var328[var329].field2073 = class108.field1991.method150((byte) 108);
                    var328[var329].field2075 = class108.field1991.method104((byte) 121);
                    if (class15.field323 == var328[var329].field417) {
                        class147.field2598 = var328[var329].field2073;
                    }
                }
                boolean var330 = false;
                int var331 = class109.field2012;
                while (var331 > 0) {
                    var331--;
                    boolean var332 = true;
                    for (int var333 = 0; var333 < var331; var333++) {
                        if (var328[var333].field2079.method492(var328[var333 + 1].field2079, arg0 - 30160) > 0) {
                            class112 var334 = var328[var333];
                            var332 = false;
                            var328[var333] = var328[var333 + 1];
                            var328[var333 + 1] = var334;
                        }
                    }
                    if (var332) {
                        break;
                    }
                }
                class274.field4709 = -1;
                class118.field2153 = var328;
                return true;
            } else if (class274.field4709 == 145) {
                int var315 = class108.field1991.method105((byte) 126);
                int var316 = class108.field1991.method112((byte) 92);
                if (var315 < -70000) {
                    var316 += 32768;
                }
                class60 var317;
                if (var315 < 0) {
                    var317 = null;
                } else {
                    var317 = class125.method907(var315, -119);
                }
                if (var317 != null) {
                    for (int var318 = 0; var318 < var317.field1117.length; var318++) {
                        var317.field1117[var318] = 0;
                        var317.field1110[var318] = 0;
                    }
                }
                class301.method2097(var316, 71);
                int var319 = class108.field1991.method112((byte) 92);
                for (int var320 = 0; var320 < var319; var320++) {
                    int var321 = class108.field1991.method112((byte) 92);
                    int var322 = class108.field1991.method133(-128);
                    if (var322 == 255) {
                        var322 = class108.field1991.method105((byte) 78);
                    }
                    if (var317 != null && var320 < var317.field1117.length) {
                        var317.field1117[var320] = var321;
                        var317.field1110[var320] = var322;
                    }
                    method1124(var320, arg0 - 30415, var321 + -1, var322, var316);
                }
                if (var317 != null) {
                    class190.method1342(var317, 0);
                }
                class198.method1386(0);
                class78.field1463[class224.method1614(31, class82.field1519++)] = class224.method1614(32767, var316);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 160) {
                class40.field631 = 0;
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 65) {
                int var16 = class108.field1991.method152((byte) -82);
                int var17 = class108.field1991.method112((byte) 92);
                int var18 = class108.field1991.method112((byte) 92);
                if (class235.method1686((byte) 117, var17)) {
                    class269.method1886(var16, var18, (byte) -105);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 250) {
                int var314 = class108.field1991.method152((byte) -121);
                if (class108.field1991.method152((byte) -124) == 0) {
                    class158.field2788[var314] = new class108();
                } else {
                    class108.field1991.field281--;
                    class158.field2788[var314] = new class108(class108.field1991);
                }
                class307.field5242 = class238.field4039;
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 61) {
                int var19 = class108.field1991.method112((byte) 92);
                int var20 = class108.field1991.method112((byte) 92);
                class77.field1459 = var20;
                class241.field4157 = var19;
                class299.method2090(98048);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 113) {
                class198.method1386(0);
                class200.field3422 = class108.field1991.method152((byte) -112);
                class274.field4709 = -1;
                class149.field2621 = class238.field4039;
                return true;
            } else if (class274.field4709 == 158) {
                int var309 = class108.field1991.method112((byte) 92);
                class64 var310 = class108.field1991.method104((byte) 102);
                Object[] var311 = new Object[var310.method540(arg0 ^ 0x7FA) + 1];
                for (int var312 = var310.method540(28981) - 1; var312 >= 0; var312--) {
                    if (var310.method495(var312, (byte) 87) == 115) {
                        var311[var312 + 1] = class108.field1991.method104((byte) -89);
                    } else {
                        var311[var312 + 1] = Integer.valueOf(class108.field1991.method105((byte) 82));
                    }
                }
                var311[0] = Integer.valueOf(class108.field1991.method105((byte) 38));
                if (class235.method1686((byte) 101, var309)) {
                    class11 var313 = new class11();
                    var313.field229 = var311;
                    class218.method1562((byte) 113, var313);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 31) {
                int var21 = class108.field1991.method152((byte) -105);
                int var22 = var21 >> 6;
                class65 var23 = new class65();
                var23.field1292 = var21 & 0x3F;
                var23.field1301 = class108.field1991.method152((byte) -82);
                if (var23.field1301 >= 0 && class211.field3546.length > var23.field1301) {
                    if (var23.field1292 == 1 || var23.field1292 == 10) {
                        var23.field1290 = class108.field1991.method112((byte) 92);
                        class108.field1991.field281 += 3;
                    } else if (var23.field1292 >= 2 && var23.field1292 <= 6) {
                        if (var23.field1292 == 2) {
                            var23.field1296 = 64;
                            var23.field1289 = 64;
                        }
                        if (var23.field1292 == 3) {
                            var23.field1296 = 64;
                            var23.field1289 = 0;
                        }
                        if (var23.field1292 == 4) {
                            var23.field1296 = 64;
                            var23.field1289 = 128;
                        }
                        if (var23.field1292 == 5) {
                            var23.field1289 = 64;
                            var23.field1296 = 0;
                        }
                        if (var23.field1292 == 6) {
                            var23.field1289 = 64;
                            var23.field1296 = 128;
                        }
                        var23.field1292 = 2;
                        var23.field1306 = class108.field1991.method112((byte) 92);
                        var23.field1291 = class108.field1991.method112((byte) 92);
                        var23.field1298 = class108.field1991.method152((byte) -73);
                    }
                    var23.field1293 = class108.field1991.method112((byte) 92);
                    if (var23.field1293 == 65535) {
                        var23.field1293 = -1;
                    }
                    class304.field5197[var22] = var23;
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 20) {
                class298.field5144 = class108.field1991.method152((byte) -95);
                class47.field781 = class238.field4039;
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 0) {
                class270.field4658 = class108.field1991.method133(-128);
                class89.field1613 = class108.field1991.method110(12749);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 35) {
                long var24 = class108.field1991.method146((byte) 5);
                class108.field1991.method150((byte) 119);
                long var26 = class108.field1991.method146((byte) -94);
                long var28 = (long) class108.field1991.method112((byte) 92);
                long var30 = (long) class108.field1991.method111(arg0 ^ 0x4B52E647);
                int var32 = class108.field1991.method152((byte) -123);
                long var33 = (var28 << 32) + var30;
                boolean var35 = false;
                int var36 = 0;
                label1145: while (true) {
                    if (var36 < 100) {
                        if (class71.field1362[var36] != var33) {
                            var36++;
                            continue;
                        }
                        var35 = true;
                        break;
                    }
                    if (var32 <= 1) {
                        if (class41.field642 == 1 || class130.field2308 == 1) {
                            var35 = true;
                        } else {
                            for (int var37 = 0; var37 < class61.field1194; var37++) {
                                if (class173.field2981[var37] == var24) {
                                    var35 = true;
                                    break label1145;
                                }
                            }
                        }
                    }
                    break;
                }
                if (!var35 && class101.field1830 == 0) {
                    class71.field1362[class56.field948] = var33;
                    class56.field948 = (class56.field948 + 1) % 100;
                    class64 var38 = class179.method1254(class96.method724((byte) -54, class108.field1991).method520(true));
                    if (var32 == 2 || var32 == 3) {
                        class142.method1008(-1, class104.method768(new class64[] { class163.field2857, class99.method734(true, var24).method510(96) }, false), 9, var38, class99.method734(true, var26).method510(arg0 - 30296));
                    } else if (var32 == 1) {
                        class142.method1008(-1, class104.method768(new class64[] { class111.field2067, class99.method734(true, var24).method510(111) }, false), 9, var38, class99.method734(true, var26).method510(arg0 - 30465));
                    } else {
                        class142.method1008(arg0 ^ 0xFFFF8930, class99.method734(true, var24).method510(103), 9, var38, class99.method734(true, var26).method510(119));
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 123) {
                class137.field2438 = class108.field1991.method118(29) * 30;
                class274.field4709 = -1;
                class149.field2621 = class238.field4039;
                return true;
            } else if (class274.field4709 == 159) {
                int var39 = class108.field1991.method112((byte) 92);
                int var40 = class108.field1991.method143(arg0 - 26021);
                class64 var41 = class108.field1991.method104((byte) 121);
                if (class235.method1686((byte) 108, var39)) {
                    class85.method655(var41, (byte) -94, var40);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 104) {
                int var308 = class108.field1991.method108((byte) -126);
                if (var308 == 65535) {
                    var308 = -1;
                }
                class154.method1111(-122, var308);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 237) {
                int var306 = class108.field1991.method108((byte) -113);
                if (var306 == 65535) {
                    var306 = -1;
                }
                int var307 = class108.field1991.method121(124);
                class155.method1118(var307, true, var306);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 196) {
                int var42 = class108.field1991.method108((byte) -83);
                int var43 = class108.field1991.method120(arg0 - 30413);
                int var44 = class108.field1991.method118(-101);
                int var45 = class108.field1991.method105((byte) 43);
                int var46 = class108.field1991.method108((byte) -121);
                if (class235.method1686((byte) 92, var42)) {
                    class227.method1640(var43, var45, var46, 94, var44);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 194) {
                class53.method399(106);
                class198.method1386(0);
                class274.field4709 = -1;
                class307.field5246 += 32;
                return true;
            } else if (class274.field4709 == 81) {
                int var295 = class108.field1991.method120(2);
                if (var295 == 65535) {
                    var295 = -1;
                }
                int var296 = class108.field1991.method101(arg0 ^ 0x764F);
                int var297 = var296 & 0x3;
                int var298 = var296 >> 2;
                int var299 = class65.field1303[var298];
                int var300 = class108.field1991.method129(2121034712);
                int var301 = var300 >> 28 & 0x3;
                int var302 = (var300 & 0xFFFEDB2) >> 14;
                int var303 = var302 - class190.field3269;
                int var304 = var300 & 0x3FFF;
                int var305 = var304 - class121.field2184;
                class216.method1519(var297, var295, var301, var299, 112, var303, var298, var305);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 56) {
                class64 var292 = class108.field1991.method104((byte) 104);
                int var293 = class108.field1991.method110(12749);
                int var294 = class108.field1991.method101(128);
                if (var294 >= 1 && var294 <= 8) {
                    if (var292.method515(-64, class104.field1927)) {
                        var292 = null;
                    }
                    class84.field1557[var294 - 1] = var292;
                    class262.field4498[var294 - 1] = var293 == 0;
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 44) {
                int var47 = class108.field1991.method143(4394);
                int var48 = class108.field1991.method118(arg0 - 30527);
                int var49 = class108.field1991.method110(12749);
                if (class235.method1686((byte) 108, var48)) {
                    class168.method1199(var49, var47, (byte) -117);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 146) {
                class184.field3157 = class108.field1991.method152((byte) -114);
                class60.field1184 = class108.field1991.method152((byte) -83);
                class163.field2869 = class108.field1991.method152((byte) -80);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 85) {
                int var50 = class108.field1991.method118(57);
                int var51 = class108.field1991.method129(2121034712);
                class218.method1559(var50, var51, -26319);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 72) {
                int var52 = class108.field1991.method143(4394);
                class106.field1956 = class228.field3876.method1963(var52, (byte) -4);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 136) {
                int var53 = class108.field1991.method129(2121034712);
                int var54 = class108.field1991.method120(2);
                if (var54 == 65535) {
                    var54 = -1;
                }
                int var55 = class108.field1991.method112((byte) 92);
                int var56 = class108.field1991.method112((byte) 92);
                int var57 = class108.field1991.method129(arg0 + 2121004297);
                if (var56 == 65535) {
                    var56 = -1;
                }
                if (class235.method1686((byte) 94, var55)) {
                    for (int var58 = var56; var58 <= var54; var58++) {
                        long var59 = ((long) var57 << 32) + (long) var58;
                        class25 var61 = class184.field3146.method1151(var59, 0);
                        if (var61 != null) {
                            var61.method232(128);
                        }
                        class184.field3146.method1149(new class84(var53), var59, -85);
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 96) {
                class89.field1613 = class108.field1991.method152((byte) -102);
                class270.field4658 = class108.field1991.method110(arg0 ^ 0x4702);
                for (int var289 = class270.field4658; var289 < (class270.field4658 + 8); var289++) {
                    for (int var290 = class89.field1613; var290 < (class89.field1613 + 8); var290++) {
                        if (class274.field4712[class20.field364][var289][var290] != null) {
                            class274.field4712[class20.field364][var289][var290] = null;
                            class227.method1642(-17700, var289, var290);
                        }
                    }
                }
                for (class55 var291 = (class55) class313.field5312.method778(arg0 ^ 0x76CF); var291 != null; var291 = (class55) class313.field5312.method775(26517)) {
                    if (class270.field4658 <= var291.field929 && var291.field929 < (class270.field4658 + 8) && var291.field921 >= class89.field1613 && var291.field921 < (class89.field1613 + 8) && class20.field364 == var291.field925) {
                        var291.field923 = 0;
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 128) {
                int var62 = class108.field1991.method142(-3);
                int var63 = class108.field1991.method120(2);
                if (class235.method1686((byte) 114, var63)) {
                    int var64 = 0;
                    if (class139.field2472.field639 != null) {
                        var64 = class139.field2472.field639.method2163(false);
                    }
                    class258.method1832(var62, arg0 - 30411, var64, 3);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 187) {
                byte var287 = class108.field1991.method138((byte) 126);
                int var288 = class108.field1991.method112((byte) 92);
                class218.method1559(var288, var287, -26319);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 129) {
                class64 var246 = class108.field1991.method104((byte) -94);
                if (var246.method531(class36.field580, true)) {
                    class64 var282 = var246.method524(var246.method500(88, class250.field4346), (byte) 114, 0);
                    long var283 = var282.method509(31492);
                    boolean var285 = false;
                    for (int var286 = 0; var286 < class61.field1194; var286++) {
                        if (class173.field2981[var286] == var283) {
                            var285 = true;
                            break;
                        }
                    }
                    if (!var285 && class101.field1830 == 0) {
                        class233.method1670(class304.field5205, var282, 4, (byte) -128);
                    }
                } else if (var246.method531(class304.field5208, true)) {
                    class64 var276 = var246.method524(var246.method500(8, class250.field4346), (byte) 108, 0);
                    long var277 = var276.method509(arg0 + 1077);
                    boolean var279 = false;
                    for (int var280 = 0; var280 < class61.field1194; var280++) {
                        if (class173.field2981[var280] == var277) {
                            var279 = true;
                            break;
                        }
                    }
                    if (!var279 && class101.field1830 == 0) {
                        class64 var281 = var246.method524(var246.method540(arg0 ^ 0x7FA) - 9, (byte) 127, var246.method500(76, class250.field4346) + 1);
                        class233.method1670(var281, var276, 8, (byte) -105);
                    }
                } else if (var246.method531(class44.field718, true)) {
                    class64 var247 = var246.method524(var246.method500(arg0 - 30342, class250.field4346), (byte) 122, 0);
                    long var248 = var247.method509(31492);
                    boolean var250 = false;
                    for (int var251 = 0; var251 < class61.field1194; var251++) {
                        if (class173.field2981[var251] == var248) {
                            var250 = true;
                            break;
                        }
                    }
                    if (!var250 && class101.field1830 == 0) {
                        class233.method1670(class188.field3240, var247, 10, (byte) -104);
                    }
                } else if (var246.method531(class275.field4717, true)) {
                    class64 var275 = var246.method524(var246.method500(-19, class275.field4717), (byte) 122, 0);
                    class233.method1670(var275, class188.field3240, 11, (byte) -111);
                } else if (var246.method531(class278.field4791, true)) {
                    class64 var274 = var246.method524(var246.method500(-127, class278.field4791), (byte) 60, 0);
                    if (class101.field1830 == 0) {
                        class233.method1670(var274, class188.field3240, 12, (byte) -104);
                    }
                } else if (var246.method531(class164.field2885, true)) {
                    class64 var273 = var246.method524(var246.method500(-121, class164.field2885), (byte) 97, 0);
                    if (class101.field1830 == 0) {
                        class233.method1670(var273, class188.field3240, 13, (byte) -126);
                    }
                } else if (var246.method531(class31.field517, true)) {
                    class64 var268 = var246.method524(var246.method500(-126, class250.field4346), (byte) 69, 0);
                    long var269 = var268.method509(31492);
                    boolean var271 = false;
                    for (int var272 = 0; var272 < class61.field1194; var272++) {
                        if (class173.field2981[var272] == var269) {
                            var271 = true;
                            break;
                        }
                    }
                    if (!var271 && class101.field1830 == 0) {
                        class233.method1670(class188.field3240, var268, 14, (byte) -104);
                    }
                } else if (var246.method531(class235.field3974, true)) {
                    boolean var252 = false;
                    class64 var253 = var246.method524(var246.method500(33, class250.field4346), (byte) 56, 0);
                    long var254 = var253.method509(arg0 + 1077);
                    for (int var256 = 0; var256 < class61.field1194; var256++) {
                        if (class173.field2981[var256] == var254) {
                            var252 = true;
                            break;
                        }
                    }
                    if (!var252 && class101.field1830 == 0) {
                        class233.method1670(class188.field3240, var253, 15, (byte) -115);
                    }
                } else if (var246.method531(class133.field2364, true)) {
                    class64 var257 = var246.method524(var246.method500(-1, class250.field4346), (byte) 95, 0);
                    boolean var258 = false;
                    long var259 = var257.method509(31492);
                    for (int var261 = 0; var261 < class61.field1194; var261++) {
                        if (class173.field2981[var261] == var259) {
                            var258 = true;
                            break;
                        }
                    }
                    if (!var258 && class101.field1830 == 0) {
                        class233.method1670(class188.field3240, var257, 16, (byte) -106);
                    }
                } else if (var246.method531(class185.field3167, true)) {
                    boolean var262 = false;
                    class64 var263 = var246.method524(var246.method500(50, class250.field4346), (byte) 116, 0);
                    long var264 = var263.method509(31492);
                    for (int var266 = 0; var266 < class61.field1194; var266++) {
                        if (class173.field2981[var266] == var264) {
                            var262 = true;
                            break;
                        }
                    }
                    if (!var262 && class101.field1830 == 0) {
                        class64 var267 = var246.method524(var246.method540(28981) - 9, (byte) 90, var246.method500(-113, class250.field4346) + 1);
                        class233.method1670(var267, var263, 21, (byte) -103);
                    }
                } else {
                    class233.method1670(var246, class188.field3240, 0, (byte) -118);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 108) {
                class145.method1032(class108.field1991, -30970, class228.field3876, class26.field428);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 151) {
                int var243 = class108.field1991.method112((byte) 92);
                int var244 = class108.field1991.method105((byte) 106);
                if (class235.method1686((byte) 118, var243)) {
                    class172 var245 = (class172) class159.field2805.method1151((long) var244, 0);
                    if (var245 != null) {
                        class140.method994(var245, true, -24721);
                    }
                    if (class106.field1952 != null) {
                        class190.method1342(class106.field1952, arg0 - 30415);
                        class106.field1952 = null;
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 14) {
                class64 var240 = class108.field1991.method104((byte) -51);
                int var241 = class108.field1991.method118(122);
                int var242 = class108.field1991.method120(arg0 - 30413);
                if (class235.method1686((byte) 112, var241)) {
                    class99.method737(var240, var242, (byte) 123);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 33) {
                int var65 = class108.field1991.method112((byte) 92);
                int var66 = class108.field1991.method112((byte) 92);
                int var67 = class108.field1991.method105((byte) 114);
                int var68 = class108.field1991.method112((byte) 92);
                if ((var67 >> 30) != 0) {
                    int var77 = var67 >> 28 & 0x3;
                    int var78 = ((var67 & 0xFFFDE9D) >> 14) - class190.field3269;
                    int var79 = (var67 & 0x3FFF) - class121.field2184;
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        int var80 = var78 * 128 + 64;
                        int var81 = var79 * 128 + 64;
                        class267 var82 = new class267(var68, var77, var80, var81, class15.method169(var81, arg0 - 17158, var77, var80) - var66, var65, class29.field482);
                        class151.field2687.method781(new class227(var82), 10751);
                    }
                } else if (var67 >> 29 != 0) {
                    int var69 = var67 & 0xFFFF;
                    class232 var70 = class2.field12[var69];
                    if (var70 != null) {
                        var70.field1872 = 0;
                        var70.field1851 = class29.field482 + var65;
                        var70.field1916 = 0;
                        if (var70.field1851 > class29.field482) {
                            var70.field1916 = -1;
                        }
                        var70.field1903 = var68;
                        var70.field1866 = var66;
                        if (var70.field1903 == 65535) {
                            var70.field1903 = -1;
                        }
                        if (var70.field1903 != -1 && class29.field482 == var70.field1851) {
                            int var71 = class275.method1908(var70.field1903, 51).field1647;
                            if (var71 != -1) {
                                class199 var72 = class281.method1944(var71, 0);
                                if (var72 != null && var72.field3393 != null) {
                                    class10.method89(var70.field1865, var70.field1859, 0, var72, true, false);
                                }
                            }
                        }
                    }
                } else if ((var67 >> 28) != 0) {
                    int var73 = var67 & 0xFFFF;
                    class41 var74;
                    if (class149.field2632 == var73) {
                        var74 = class139.field2472;
                    } else {
                        var74 = class284.field4888[var73];
                    }
                    if (var74 != null) {
                        var74.field1872 = 0;
                        var74.field1866 = var66;
                        var74.field1903 = var68;
                        var74.field1851 = class29.field482 + var65;
                        var74.field1916 = 0;
                        if (var74.field1903 == 65535) {
                            var74.field1903 = -1;
                        }
                        if (var74.field1851 > class29.field482) {
                            var74.field1916 = -1;
                        }
                        if (var74.field1903 != -1 && class29.field482 == var74.field1851) {
                            int var75 = class275.method1908(var74.field1903, arg0 ^ 0x768A).field1647;
                            if (var75 != -1) {
                                class199 var76 = class281.method1944(var75, 0);
                                if (var76 != null && var76.field3393 != null) {
                                    class10.method89(var74.field1865, var74.field1859, 0, var76, true, class139.field2472 == var74);
                                }
                            }
                        }
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 248) {
                class61.field1194 = class26.field428 / 8;
                for (int var83 = 0; var83 < class61.field1194; var83++) {
                    class173.field2981[var83] = class108.field1991.method146((byte) -40);
                    class267.field4607[var83] = class99.method734(true, class173.field2981[var83]);
                }
                class274.field4709 = -1;
                class47.field781 = class238.field4039;
                return true;
            } else if (class274.field4709 == 53) {
                int var237 = class108.field1991.method112((byte) 92);
                if (var237 == 65535) {
                    var237 = -1;
                }
                int var238 = class108.field1991.method152((byte) -115);
                int var239 = class108.field1991.method112((byte) 92);
                class59.method459(var238, var237, var239, (byte) 124);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 161) {
                boolean var84 = false;
                long var85 = class108.field1991.method146((byte) -28);
                if ((var85 & Long.MIN_VALUE) != 0L) {
                    var84 = true;
                }
                int var87 = class108.field1991.method112((byte) 92);
                byte var88 = class108.field1991.method150((byte) 90);
                if (var84) {
                    if (class109.field2012 == 0) {
                        class274.field4709 = -1;
                        return true;
                    }
                    long var89 = var85 & Long.MAX_VALUE;
                    boolean var91 = false;
                    int var92;
                    for (var92 = 0; var92 < class109.field2012 && (class118.field2153[var92].field417 != var89 || class118.field2153[var92].field2074 != var87); var92++) {
                    }
                    if (class109.field2012 > var92) {
                        while (var92 < (class109.field2012 - 1)) {
                            class118.field2153[var92] = class118.field2153[var92 + 1];
                            var92++;
                        }
                        class109.field2012--;
                        class118.field2153[class109.field2012] = null;
                    }
                } else {
                    class64 var93 = class108.field1991.method104((byte) -67);
                    class112 var94 = new class112();
                    var94.field417 = var85;
                    var94.field2079 = class99.method734(true, var94.field417);
                    var94.field2074 = var87;
                    var94.field2075 = var93;
                    var94.field2073 = var88;
                    int var95;
                    for (var95 = class109.field2012 - 1; var95 >= 0; var95--) {
                        int var96 = class118.field2153[var95].field2079.method492(var94.field2079, 255);
                        if (var96 == 0) {
                            class118.field2153[var95].field2074 = var87;
                            class118.field2153[var95].field2073 = var88;
                            class118.field2153[var95].field2075 = var93;
                            class274.field4709 = -1;
                            class268.field4626 = class238.field4039;
                            if (class15.field323 == var85) {
                                class147.field2598 = var88;
                            }
                            return true;
                        }
                        if (var96 < 0) {
                            break;
                        }
                    }
                    if (class109.field2012 >= class118.field2153.length) {
                        class274.field4709 = -1;
                        return true;
                    }
                    for (int var97 = class109.field2012 - 1; var97 > var95; var97--) {
                        class118.field2153[var97 + 1] = class118.field2153[var97];
                    }
                    if (class109.field2012 == 0) {
                        class118.field2153 = new class112[100];
                    }
                    class118.field2153[var95 + 1] = var94;
                    class109.field2012++;
                    if (class15.field323 == var85) {
                        class147.field2598 = var88;
                    }
                }
                class274.field4709 = -1;
                class268.field4626 = class238.field4039;
                return true;
            } else if (class274.field4709 == 218) {
                int var98 = class108.field1991.method118(arg0 - 30533);
                if (var98 == 65535) {
                    var98 = -1;
                }
                int var99 = class108.field1991.method143(4394);
                int var100 = class108.field1991.method108((byte) 79);
                if (class235.method1686((byte) 127, var100)) {
                    class258.method1832(var99, 4, var98, 2);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 224) {
                long var101 = class108.field1991.method146((byte) -27);
                int var103 = class108.field1991.method112((byte) 92);
                int var104 = class108.field1991.method152((byte) -93);
                boolean var105 = true;
                class64 var106 = class188.field3240;
                if (var103 > 0) {
                    var106 = class108.field1991.method104((byte) -64);
                }
                if (var101 < 0L) {
                    var101 &= Long.MAX_VALUE;
                    var105 = false;
                }
                class64 var107 = class99.method734(true, var101).method510(117);
                for (int var108 = 0; var108 < class202.field3453; var108++) {
                    if (class47.field776[var108] == var101) {
                        if (class154.field2726[var108] != var103) {
                            class154.field2726[var108] = var103;
                            if (var103 > 0) {
                                class233.method1670(class104.method768(new class64[] { var107, class30.field501 }, false), class188.field3240, 5, (byte) -109);
                            }
                            if (var103 == 0) {
                                class233.method1670(class104.method768(new class64[] { var107, class255.field4437 }, false), class188.field3240, 5, (byte) -104);
                            }
                        }
                        class183.field3131[var108] = var106;
                        class255.field4426[var108] = var104;
                        var107 = null;
                        class153.field2707[var108] = var105;
                        break;
                    }
                }
                if (var107 != null && class202.field3453 < 200) {
                    class47.field776[class202.field3453] = var101;
                    class29.field493[class202.field3453] = var107;
                    class154.field2726[class202.field3453] = var103;
                    class183.field3131[class202.field3453] = var106;
                    class255.field4426[class202.field3453] = var104;
                    class153.field2707[class202.field3453] = var105;
                    class202.field3453++;
                }
                class47.field781 = class238.field4039;
                boolean var109 = false;
                int var110 = class202.field3453;
                while (var110 > 0) {
                    boolean var111 = true;
                    var110--;
                    for (int var112 = 0; var112 < var110; var112++) {
                        if (class154.field2726[var112] != class76.field1433 && class154.field2726[var112 + 1] == class76.field1433 || class154.field2726[var112] == 0 && class154.field2726[var112 + 1] != 0) {
                            var111 = false;
                            int var113 = class154.field2726[var112];
                            class154.field2726[var112] = class154.field2726[var112 + 1];
                            class154.field2726[var112 + 1] = var113;
                            class64 var114 = class183.field3131[var112];
                            class183.field3131[var112] = class183.field3131[var112 + 1];
                            class183.field3131[var112 + 1] = var114;
                            class64 var115 = class29.field493[var112];
                            class29.field493[var112] = class29.field493[var112 + 1];
                            class29.field493[var112 + 1] = var115;
                            long var116 = class47.field776[var112];
                            class47.field776[var112] = class47.field776[var112 + 1];
                            class47.field776[var112 + 1] = var116;
                            int var118 = class255.field4426[var112];
                            class255.field4426[var112] = class255.field4426[var112 + 1];
                            class255.field4426[var112 + 1] = var118;
                            boolean var119 = class153.field2707[var112];
                            class153.field2707[var112] = class153.field2707[var112 + 1];
                            class153.field2707[var112 + 1] = var119;
                        }
                    }
                    if (var111) {
                        break;
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 209) {
                int var120 = class108.field1991.method152((byte) -90);
                int var121 = class108.field1991.method152((byte) -121);
                int var122 = class108.field1991.method112((byte) 92);
                int var123 = class108.field1991.method152((byte) -107);
                int var124 = class108.field1991.method152((byte) -72);
                class89.method680(var123, (byte) 47, var120, var121, var124, var122);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 95) {
                int var125 = class108.field1991.method120(arg0 ^ 0x76CD);
                class193.method1357(-126, var125);
                class78.field1463[class224.method1614(class82.field1519++, 31)] = class224.method1614(var125, 32767);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 135) {
                int var126 = class108.field1991.method105((byte) 83);
                int var127 = class108.field1991.method105((byte) 75);
                int var128 = class108.field1991.method112((byte) 92);
                if (class235.method1686((byte) 121, var128)) {
                    class172 var129 = (class172) class159.field2805.method1151((long) var126, 0);
                    class172 var130 = (class172) class159.field2805.method1151((long) var127, 0);
                    if (var130 != null) {
                        class140.method994(var130, var129 == null || var129.field2967 != var130.field2967, arg0 ^ 0xFFFFE9A0);
                    }
                    if (var129 != null) {
                        var129.method232(arg0 ^ 0x764F);
                        class159.field2805.method1149(var129, (long) var127, -60);
                    }
                    class60 var131 = class125.method907(var126, -79);
                    if (var131 != null) {
                        class190.method1342(var131, 0);
                    }
                    class60 var132 = class125.method907(var127, arg0 - 30495);
                    if (var132 != null) {
                        class190.method1342(var132, 0);
                        class240.method1744((byte) -91, true, var132);
                    }
                    if (class83.field1524 != -1) {
                        class151.method1098(false, 1, class83.field1524);
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 124) {
                if (class26.field428 == 0) {
                    class260.field4480 = class89.field1604;
                } else {
                    class260.field4480 = class108.field1991.method104((byte) -63);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 244) {
                int var133 = class108.field1991.method118(-114);
                int var134 = class108.field1991.method118(72);
                int var135 = class108.field1991.method105((byte) 108);
                if (class235.method1686((byte) 92, var133)) {
                    class304.method2124(var134, (byte) 102, var135);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 99) {
                int var136 = class108.field1991.method108((byte) -124);
                class64 var137 = class108.field1991.method104((byte) -1);
                int var138 = class108.field1991.method112((byte) 92);
                if (class235.method1686((byte) 105, var138)) {
                    class99.method737(var137, var136, (byte) 126);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 74) {
                if (class83.field1524 != -1) {
                    class151.method1098(false, 0, class83.field1524);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 173) {
                int var230 = class108.field1991.method120(2);
                if (var230 == 65535) {
                    var230 = -1;
                }
                int var231 = class108.field1991.method105((byte) 70);
                int var232 = class108.field1991.method129(2121034712);
                int var233 = class108.field1991.method120(2);
                if (class235.method1686((byte) 126, var233)) {
                    class60 var234 = class125.method907(var231, -128);
                    if (var234.field1017) {
                        class132.method946((byte) -19, var231, var230, var232);
                        class92 var236 = class132.method949(var230, false);
                        class227.method1640(var236.field1655, var231, var236.field1723, arg0 ^ 0xFFFF891F, var236.field1693);
                        class128.method931(var236.field1705, var231, arg0 ^ 0xFFFF8915, var236.field1680, var236.field1690);
                    } else if (var230 == -1) {
                        class274.field4709 = -1;
                        var234.field1012 = 0;
                        return true;
                    } else {
                        class92 var235 = class132.method949(var230, false);
                        var234.field1067 = var230;
                        var234.field1146 = var235.field1655;
                        var234.field1148 = var235.field1693 * 100 / var232;
                        var234.field1009 = var235.field1723;
                        var234.field1012 = 4;
                        class190.method1342(var234, 0);
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 240) {
                int var139 = class108.field1991.method133(-128);
                int var140 = class108.field1991.method108((byte) -84);
                class153.method1105(var140, (byte) 91, var139);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 54) {
                long var214 = class108.field1991.method146((byte) 118);
                boolean var216 = false;
                class108.field1991.method150((byte) 85);
                long var217 = class108.field1991.method146((byte) -17);
                long var219 = (long) class108.field1991.method112((byte) 92);
                long var221 = (long) class108.field1991.method111(1263702152);
                long var223 = (var219 << 32) + var221;
                int var225 = class108.field1991.method152((byte) -72);
                int var226 = class108.field1991.method112((byte) 92);
                int var227 = 0;
                label1398: while (true) {
                    if (var227 < 100) {
                        if (class71.field1362[var227] != var223) {
                            var227++;
                            continue;
                        }
                        var216 = true;
                        break;
                    }
                    if (var225 <= 1) {
                        for (int var228 = 0; var228 < class61.field1194; var228++) {
                            if (class173.field2981[var228] == var214) {
                                var216 = true;
                                break label1398;
                            }
                        }
                    }
                    break;
                }
                if (!var216 && class101.field1830 == 0) {
                    class71.field1362[class56.field948] = var223;
                    class56.field948 = (class56.field948 + 1) % 100;
                    class64 var229 = class47.method352(var226, 32767).method576(class108.field1991, false);
                    if (var225 == 2 || var225 == 3) {
                        class104.method767(var226, var229, arg0 + 1991, 20, class99.method734(true, var217).method510(-19), class104.method768(new class64[] { class163.field2857, class99.method734(true, var214).method510(77) }, false));
                    } else if (var225 == 1) {
                        class104.method767(var226, var229, 32406, 20, class99.method734(true, var217).method510(-46), class104.method768(new class64[] { class111.field2067, class99.method734(true, var214).method510(80) }, false));
                    } else {
                        class104.method767(var226, var229, arg0 + 1991, 20, class99.method734(true, var217).method510(98), class99.method734(true, var214).method510(-52));
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 166) {
                class2.method4(false, -4121);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 38) {
                int var141 = class108.field1991.method152((byte) -127);
                int var142 = class108.field1991.method118(99);
                int var143 = class108.field1991.method143(4394);
                int var144 = class108.field1991.method112((byte) 92);
                if (class235.method1686((byte) 116, var144)) {
                    class172 var145 = (class172) class159.field2805.method1151((long) var143, 0);
                    if (var145 != null) {
                        class140.method994(var145, var145.field2967 != var142, -24721);
                    }
                    class82.method636(var142, var143, (byte) 15, var141);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 89) {
                if (class263.field4514 != null) {
                    class295.method2063(false, (byte) 76, class304.field5200, -1, -1);
                }
                byte[] var212 = new byte[class26.field428];
                class108.field1991.method1213(var212, 0, class26.field428, arg0 - 30415);
                class64 var213 = class292.method2015(0, var212, 0, class26.field428);
                if (class27.field441 == null && class282.field4846 == 3 || !class282.field4848.startsWith("win") || class151.field2695) {
                    class314.method2173(true, -7704, var213);
                } else {
                    class84.field1555 = true;
                    class124.field2249 = var213;
                    class42.field691 = class228.field3876.method1956((byte) 53, new String(var213.method536(arg0 - 30415), "ISO-8859-1"));
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 176) {
                int var146 = class108.field1991.method105((byte) 102);
                int var147 = class108.field1991.method108((byte) -83);
                class153.method1105(var147, (byte) -47, var146);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 66) {
                long var208 = class108.field1991.method146((byte) 124);
                int var210 = class108.field1991.method112((byte) 92);
                class64 var211 = class47.method352(var210, 32767).method576(class108.field1991, false);
                class104.method767(var210, var211, 32406, 19, (class64) null, class99.method734(true, var208).method510(99));
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 150) {
                int var205 = class108.field1991.method105((byte) 47);
                int var206 = class108.field1991.method108((byte) -121);
                int var207 = class108.field1991.method120(2);
                if (var207 == 65535) {
                    var207 = -1;
                }
                if (class235.method1686((byte) 95, var206)) {
                    class258.method1832(var205, arg0 - 30411, var207, 1);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 102) {
                int var148 = class108.field1991.method101(128);
                int var149 = class108.field1991.method152((byte) -124);
                int var150 = class108.field1991.method133(-128);
                class20.field364 = var148 >> 1;
                class139.field2472.method320(var149, true, (var148 & 0x1) == 1, var150);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 252) {
                for (int var204 = 0; var204 < class289.field4941.length; var204++) {
                    if (class88.field1601[var204] != class289.field4941[var204]) {
                        class289.field4941[var204] = class88.field1601[var204];
                        class65.method546(var204, -10);
                        class290.field4982[class224.method1614(class307.field5246++, 31)] = var204;
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 7) {
                long var191 = class108.field1991.method146((byte) 126);
                long var193 = (long) class108.field1991.method112((byte) 92);
                long var195 = (long) class108.field1991.method111(1263702152);
                long var197 = (var193 << 32) + var195;
                int var199 = class108.field1991.method152((byte) -124);
                boolean var200 = false;
                int var201 = 0;
                label1332: while (true) {
                    if (var201 >= 100) {
                        if (var199 <= 1) {
                            if (class41.field642 == 1 || class130.field2308 == 1) {
                                var200 = true;
                            } else {
                                for (int var202 = 0; var202 < class61.field1194; var202++) {
                                    if (class173.field2981[var202] == var191) {
                                        var200 = true;
                                        break label1332;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class71.field1362[var201] == var197) {
                        var200 = true;
                        break;
                    }
                    var201++;
                }
                if (!var200 && class101.field1830 == 0) {
                    class71.field1362[class56.field948] = var197;
                    class56.field948 = (class56.field948 + 1) % 100;
                    class64 var203 = class179.method1254(class96.method724((byte) -11, class108.field1991).method520(true));
                    if (var199 == 2 || var199 == 3) {
                        class233.method1670(var203, class104.method768(new class64[] { class163.field2857, class99.method734(true, var191).method510(-22) }, false), 7, (byte) -115);
                    } else if (var199 == 1) {
                        class233.method1670(var203, class104.method768(new class64[] { class111.field2067, class99.method734(true, var191).method510(-59) }, false), 7, (byte) -114);
                    } else {
                        class233.method1670(var203, class99.method734(true, var191).method510(arg0 - 30530), 3, (byte) -118);
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 134) {
                class2.method4(true, -4121);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 13) {
                int var151 = class108.field1991.method151((byte) 126);
                int var152 = class108.field1991.method142(-3);
                int var153 = class108.field1991.method120(2);
                if (class235.method1686((byte) 108, var153)) {
                    class264.method1851(var152, -108, var151);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 63 || class274.field4709 == 242 || class274.field4709 == 112 || class274.field4709 == 82 || class274.field4709 == 165 || class274.field4709 == 168 || class274.field4709 == 189 || class274.field4709 == 83 || class274.field4709 == 116 || class274.field4709 == 238 || class274.field4709 == 222 || class274.field4709 == 111) {
                class184.method1296(128);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 171) {
                int var188 = class108.field1991.method120(arg0 ^ 0x76CD);
                int var189 = class108.field1991.method118(120);
                int var190 = class108.field1991.method142(-3);
                if (class235.method1686((byte) 94, var189)) {
                    class126.method910(var188, var190, 27690);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 92) {
                int var185 = class108.field1991.method143(4394);
                int var186 = class108.field1991.method112((byte) 92);
                int var187 = class108.field1991.method118(-111);
                if (class235.method1686((byte) 104, var186)) {
                    class269.method1886(var185, var187, (byte) 96);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 178) {
                int var154 = class108.field1991.method108((byte) 85);
                int var155 = class108.field1991.method151((byte) 126);
                int var156 = class108.field1991.method142(arg0 ^ 0xFFFF8932);
                int var157 = class108.field1991.method151((byte) 126);
                if (class235.method1686((byte) 93, var154)) {
                    class248.method1790((byte) 83, var157, var156, var155);
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 41) {
                long var158 = class108.field1991.method146((byte) -82);
                long var160 = (long) class108.field1991.method112((byte) 92);
                long var162 = (long) class108.field1991.method111(1263702152);
                long var164 = (var160 << 32) + var162;
                int var166 = class108.field1991.method152((byte) -86);
                boolean var167 = false;
                int var168 = class108.field1991.method112((byte) 92);
                int var169 = 0;
                label1260: while (true) {
                    if (var169 < 100) {
                        if (class71.field1362[var169] != var164) {
                            var169++;
                            continue;
                        }
                        var167 = true;
                        break;
                    }
                    if (var166 <= 1) {
                        for (int var170 = 0; var170 < class61.field1194; var170++) {
                            if (class173.field2981[var170] == var158) {
                                var167 = true;
                                break label1260;
                            }
                        }
                    }
                    break;
                }
                if (!var167 && class101.field1830 == 0) {
                    class71.field1362[class56.field948] = var164;
                    class56.field948 = (class56.field948 + 1) % 100;
                    class64 var171 = class47.method352(var168, 32767).method576(class108.field1991, false);
                    if (var166 == 2) {
                        class104.method767(var168, var171, 32406, 18, (class64) null, class104.method768(new class64[] { class163.field2857, class99.method734(true, var158).method510(arg0 - 30313) }, false));
                    } else if (var166 == 1) {
                        class104.method767(var168, var171, 32406, 18, (class64) null, class104.method768(new class64[] { class111.field2067, class99.method734(true, var158).method510(-49) }, false));
                    } else {
                        class104.method767(var168, var171, 32406, 18, (class64) null, class99.method734(true, var158).method510(-65));
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 245) {
                class74.method596((byte) 95);
                class274.field4709 = -1;
                return false;
            } else if (class274.field4709 == 98) {
                class31.method267((byte) 122);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 219) {
                class11.field227 = class108.field1991.method152((byte) -81);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 201) {
                int var172 = class108.field1991.method152((byte) -70);
                int var173 = class108.field1991.method152((byte) -95);
                int var174 = class108.field1991.method112((byte) 92);
                int var175 = class108.field1991.method152((byte) -128);
                int var176 = class108.field1991.method152((byte) -102);
                class312.method2160(var173, true, true, var174, var176, var172, var175);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 27) {
                int var181 = class108.field1991.method108((byte) 79);
                int var182 = class108.field1991.method133(-128);
                int var183 = class108.field1991.method108((byte) -112);
                if (class235.method1686((byte) 118, var181)) {
                    if (var182 == 2) {
                        class84.method646(6949);
                    }
                    class83.field1524 = var183;
                    class35.method290((byte) -114, var183);
                    class267.method1866(false, 49);
                    class58.method450(class83.field1524, (byte) -126);
                    for (int var184 = 0; var184 < 100; var184++) {
                        class249.field4328[var184] = true;
                    }
                }
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 139) {
                class228.method1647(-5164, class108.field1991.method104((byte) -25));
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 25) {
                class269.method1884(true);
                class274.field4709 = -1;
                return true;
            } else if (class274.field4709 == 36) {
                int var177 = class108.field1991.method108((byte) -119);
                int var178 = class108.field1991.method142(-3);
                int var179 = class108.field1991.method120(2);
                int var180 = class108.field1991.method120(2);
                if (class235.method1686((byte) 125, var180)) {
                    class190.method1347(arg0 ^ 0xE193BEB1, var178, (var177 << 16) + var179);
                }
                class274.field4709 = -1;
                return true;
            } else {
                class309.method2146((byte) -108, "T1 - " + class274.field4709 + "," + class273.field4685 + "," + class299.field5163 + " - " + class26.field428, (Throwable) null);
                class74.method596((byte) 35);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V", line = 3403)
    public static final void method1127(int arg0) {
        class77.field1447.method1187(0);
        field2759++;
        if (arg0 != 13306) {
            field2756 = (class24) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Lcd;", line = 3417)
    public static final class64 method1128(int arg0, int arg1) {
        field2749++;
        class64 var2 = new class64();
        if (arg0 == 1) {
            var2.field1252 = new byte[arg1];
            var2.field1274 = 0;
            return var2;
        } else {
            return (class64) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V", line = 3431)
    public static final void method1129(int arg0) {
        field2755++;
        class228.field3870.method1187(0);
        if (arg0 < 28) {
            method1128(-62, 12);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 3452)
    public class156() {
        this(4096);
    }
}
