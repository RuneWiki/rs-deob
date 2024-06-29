import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class137 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2109 = "Use";

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2111 = "Loaded title screen";

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lg;")
    public static final class284 method930(byte arg0) {
        field2112++;
        class52.field750 = 0;
        return arg0 == -3 ? class218.method1468(0) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method931(int arg0) {
        field2109 = null;
        field2111 = null;
        if (arg0 != 17732) {
            method930((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2108++;
        int var11 = arg8 - arg3;
        if (arg8 < class85.field1431) {
            var11++;
        }
        int var12 = arg1 - arg6;
        if (class191.field2970 > arg1) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = arg2 + (arg7 * var13) >> 16;
            int var42 = (var13 + 1) * arg7 + arg2 >> 16;
            int var43 = var42 - var41;
            if (var43 > 0) {
                int var44 = arg3 + var13 >> 6;
                if (var44 >= 0 && (class56.field923.length - 1) >= var44) {
                    int var45 = arg5 + var42;
                    int[][] var46 = class56.field923[var44];
                    byte[][] var47 = class48.field690[var44];
                    int var48 = arg5 + var41;
                    byte[][] var49 = class30.field454[var44];
                    byte[][] var50 = class106.field1755[var44];
                    byte[][] var51 = class272.field4364[var44];
                    byte[][] var52 = class267.field4267[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg4 + (arg0 * var53) >> 16;
                        int var55 = arg4 + ((var53 + 1) * arg0) >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg9 + var55;
                            int var58 = arg6 + var53 >> 6;
                            int var59 = arg6 + var53 & 0x3F;
                            int var60 = arg9 + var54;
                            int var61 = var13 + arg3 & 0x3F;
                            int var62 = (var59 << 6) + var61;
                            int var63;
                            if (var58 < 0 || (var46.length - 1) < var58 || var46[var58] == null) {
                                if (class230.field3654.field4142 != -1) {
                                    var63 = class230.field3654.field4142;
                                } else if ((var13 + arg3 & 0x4) == (arg6 + var53 & 0x4)) {
                                    var63 = class271.field4358[class162.field2541 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var58 < 0 || var58 > var46.length - 1) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class211.method1424(var48, var60, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var46[var58][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var50[var58] == null ? 0 : class271.field4358[var50[var58][var62] & 0xFF];
                            int var65 = var49[var58] == null ? 0 : class271.field4358[var49[var58][var62] & 0xFF];
                            if (var65 == 0 && var64 == 0) {
                                class211.method1424(var48, var60, var43, var56, var63);
                            } else {
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = 1;
                                    }
                                    byte var66 = var47[var58] == null ? 0 : var47[var58][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class211.method1424(var48, var60, var43, var56, var65);
                                    } else {
                                        class114.method805(var65, var67 >> 2, var66 & 0x3, 124, true, var56, var48, var63, var60, class211.field3275, var43);
                                    }
                                }
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = var63;
                                    }
                                    byte var68 = var51[var58][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class211.method1424(var48, var60, var43, var56, var64);
                                    }
                                    class114.method805(var64, var69 >> 2, var68 & 0x3, 118, var65 == 0, var56, var48, 0, var60, class211.field3275, var43);
                                }
                            }
                            if (var52[var58] != null) {
                                int var70 = var52[var58][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var48;
                                    } else {
                                        var71 = var45 - 1;
                                    }
                                    int var72;
                                    if (var56 == 1) {
                                        var72 = var60;
                                    } else {
                                        var72 = var57 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class211.method1426(var48, var60, var56, var73);
                                    } else if (var70 == 2) {
                                        class211.method1412(var48, var60, var43, var73);
                                    } else if (var70 == 3) {
                                        class211.method1426(var71, var60, var56, var73);
                                    } else if (var70 == 4) {
                                        class211.method1412(var48, var72, var43, var73);
                                    } else if (var70 == 9) {
                                        class211.method1426(var48, var60, var56, 16777215);
                                        class211.method1412(var48, var60, var43, var73);
                                    } else if (var70 == 10) {
                                        class211.method1426(var71, var60, var56, 16777215);
                                        class211.method1412(var48, var60, var43, var73);
                                    } else if (var70 == 11) {
                                        class211.method1426(var71, var60, var56, 16777215);
                                        class211.method1412(var48, var72, var43, var73);
                                    } else if (var70 == 12) {
                                        class211.method1426(var48, var60, var56, 16777215);
                                        class211.method1412(var48, var72, var43, var73);
                                    } else if (var70 == 17) {
                                        class211.method1412(var48, var60, 1, var73);
                                    } else if (var70 == 18) {
                                        class211.method1412(var71, var60, 1, var73);
                                    } else if (var70 == 19) {
                                        class211.method1412(var71, var72, 1, var73);
                                    } else if (var70 == 20) {
                                        class211.method1412(var48, var72, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class211.method1412(var48 + var74, -var74 + var72, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class211.method1412(var48 + var75, var60 + var75, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg5 + var42;
                    int var77 = arg5 + var41;
                    for (int var78 = 0; var78 < var12; var78++) {
                        int var79 = (arg4 + (arg0 * var78) >> 16) + arg9;
                        int var80 = ((var78 + 1) * arg0 + arg4 >> 16) + arg9;
                        int var81;
                        if (class230.field3654.field4142 != -1) {
                            var81 = class230.field3654.field4142;
                        } else if ((var13 + arg3 & 0x4) == (var78 + arg6 & 0x4)) {
                            var81 = class271.field4358[class162.field2541 + 1];
                        } else {
                            var81 = 4936552;
                        }
                        int var82 = var80 - var79;
                        if (var81 == 0) {
                            var81 = 1;
                        }
                        class211.method1424(var77, var79, var43, var82, var81);
                    }
                }
            }
        }
        if (arg10 < 101) {
            method932(-117, 25, 45, 21, -79, -1, -51, -10, -19, 102, -63);
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg7 * var14 + arg2 >> 16;
            int var16 = (var14 + 1) * arg7 + arg2 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg5 + var16;
                int var19 = arg3 + var14 >> 6;
                int var20 = arg5 + var15;
                if (var19 >= 0 && class90.field1569.length - 1 >= var19) {
                    int[][] var21 = class90.field1569[var19];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg0 * var22 + arg4 >> 16;
                        int var24 = (var22 + 1) * arg0 + arg4 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg9 + var24;
                            int var27 = arg9 + var23;
                            int var28 = arg6 + var22 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = ((arg6 + var22 & 0x3F) << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        int var32 = var30 >> 13 & 0x3;
                                        class203 var33 = class277.method1872(true, var31 - 1);
                                        boolean var34 = (var30 >> 15 & 0x1) == 1;
                                        class290 var35 = var33.method1367(var32, var34, false);
                                        if (var35 != null) {
                                            int var36 = var35.field2985 * var17 / 4;
                                            int var37 = var35.field2976 * var25 / 4;
                                            if (var33.field3175) {
                                                int var38 = (var30 & 0xFBF67B) >> 20;
                                                int var39 = (var30 & 0xF253E) >> 16;
                                                if ((var32 & 0x1) == 1) {
                                                    int var40 = var39;
                                                    var39 = var38;
                                                    var38 = var40;
                                                }
                                                var37 = var25 * var38;
                                                var36 = var17 * var39;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var33.field3174 == 0) {
                                                    var35.method1942(var20, var25 + var27 - var37, var36, var37);
                                                } else {
                                                    var35.method1939(var20, var27 + var25 - var37, var36, var37, var33.field3174);
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

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
    public abstract int method353(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIIII)V")
    public static final void method933(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class6 var6 = class269.field4298[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class22 var7 = var6.field129;
        if (var7 != null) {
            int var8 = var7.field315;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class225 var10 = var6.field148;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3432;
        int var12 = var10.field3428;
        int var13 = var10.field3441;
        int var14 = var10.field3427;
        int[] var15 = class170.field2655[var11];
        int[] var16 = class179.field2782[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public abstract void method352(boolean arg0);
}
