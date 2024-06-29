import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class226 extends class149 {

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "[Lli;")
    public static class234[] field3502 = new class234[50];

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "B")
    public byte field3504;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "Laj;")
    public class1 field3499;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 10)
    public static void method1654(byte arg0) {
        if (arg0 > -114) {
            field3502 = (class234[]) null;
        }
        field3502 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILhn;IIIILie;IIIIIZZ)Lie;", line = 24)
    public static final class94 method1655(int arg0, class38 arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        field3496++;
        long var14 = ((long) arg7 << 32) + (long) ((arg10 << 24) + (arg5 << 16) + arg2) + ((long) arg9 << 48);
        class94 var16 = (class94) class332.field5182.method2288(var14, (byte) 125);
        if (var16 == null) {
            byte var17;
            if (arg2 == 1) {
                var17 = 9;
            } else if (arg2 == 2) {
                var17 = 12;
            } else if (arg2 == 3) {
                var17 = 15;
            } else if (arg2 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class7 var20 = new class7((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int var21 = var20.method120(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class40.field612[var27] * var25 + arg0 >> 16;
                    int var29 = class40.field619[var27] * var24 + arg11 >> 16;
                    var22[var23][var26] = var20.method120(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg5 * var32 + arg10 * var31 >> 8);
                short var34 = (short) (((arg7 & 0x7F) * var32 + (arg9 & 0x7F) * var31 & 0x7F00) + ((arg7 & 0xFC00) * var32 + (arg9 & 0xFC00) * var31 & 0xFC0000) + ((arg7 & 0x380) * var32 + (arg9 & 0x380) * var31 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method122(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method122(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method122(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method121(64, 768, -50, -10, -50);
            class332.field5182.method2281(0, var14, var16);
        }
        if (!arg12) {
            method1655(-87, (class38) null, 19, -116, -1, 67, (class94) null, -26, -18, -81, 99, 25, false, false);
        }
        int var36 = arg2 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg6.method755();
        int var41 = var36;
        int var42 = arg6.method754();
        int var43 = arg6.method771();
        if (arg13) {
            if (arg4 > 640 && arg4 < 1408) {
                var41 = var36 + 128;
            }
            if (arg4 > 1664 || arg4 < 384) {
                var39 -= 128;
            }
            if (arg4 > 128 && arg4 < 896) {
                var37 -= 128;
            }
            if (arg4 > 1152 && arg4 < 1920) {
                var38 = var36 + 128;
            }
        }
        if (var38 < var42) {
            var42 = var38;
        }
        if (var39 > var43) {
            var43 = var39;
        }
        if (var37 > var40) {
            var40 = var37;
        }
        int var44 = arg6.method758();
        if (var44 > var41) {
            var44 = var41;
        }
        class64 var45 = null;
        if (arg1 != null) {
            int var46 = arg1.field584[arg8];
            var45 = class66.method533(90, var46 >> 16);
            arg8 = var46 & 0xFFFF;
        }
        class94 var47;
        if (var45 == null) {
            var47 = var16.method764(true, true, true);
            var47.method761((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method757((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method764(!var45.method510(122, arg8), !var45.method514(50, arg8), true);
            var47.method761((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method757((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method768(var45, arg8);
        }
        if (arg4 != 0) {
            var47.method772(arg4);
        }
        if (class162.field2623) {
            class206 var48 = (class206) var47;
            if (arg3 != class170.method1265(arg0 + var40, arg11 - -var43, class75.field1153, 1) || arg3 != class170.method1265(arg0 + var42, arg11 + var44, class75.field1153, 1)) {
                for (int var49 = 0; var49 < var48.field3214; var49++) {
                    var48.field3246[var49] += class170.method1265(var48.field3215[var49] + arg0, var48.field3233[var49] - -arg11, class75.field1153, 1) - arg3;
                }
                var48.field3219.field3668 = false;
                var48.field3209.field1819 = false;
            }
        } else {
            class271 var50 = (class271) var47;
            if (arg3 != class170.method1265(arg0 + var40, arg11 + var43, class75.field1153, 1) || class170.method1265(arg0 + var42, arg11 + var44, class75.field1153, 1) != arg3) {
                for (int var51 = 0; var51 < var50.field4204; var51++) {
                    var50.field4196[var51] += class170.method1265(var50.field4207[var51] + arg0, var50.field4192[var51] + arg11, class75.field1153, 1) - arg3;
                }
                var50.field4202 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)I", line = 257)
    public final int method615(byte arg0) {
        field3497++;
        if (this.field3499 == null) {
            return 0;
        } else if (arg0 > -4) {
            return 55;
        } else {
            return this.field3499.field48 * 100 / (this.field3499.field34.length - this.field3504);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIIIII)V", line = 271)
    public static final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3500++;
        int var11 = arg8 - arg4;
        int var12 = arg9 - arg0;
        if (class286.field4473 > arg9) {
            var12++;
        }
        if (arg8 < class113.field1833) {
            var11++;
        }
        int var13 = 103 / ((arg6 - 74) / 38);
        int var10000;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = arg10 * var14 + arg3 >> 16;
            int var16 = arg3 + ((var14 + 1) * arg10) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = var14 + arg4 >> 6;
                if (var18 >= 0 && var18 <= class52.field794.length - 1) {
                    int var19 = arg2 + var15;
                    int var20 = arg2 + var16;
                    int[][] var21 = class52.field794[var18];
                    byte[][] var22 = class209.field3299[var18];
                    byte[][] var23 = class258.field3828[var18];
                    byte[][] var24 = class303.field4830[var18];
                    byte[][] var25 = class3.field95[var18];
                    byte[][] var26 = class141.field2282[var18];
                    for (int var27 = 0; var27 < var12; var27++) {
                        int var28 = arg7 * var27 + arg5 >> 16;
                        int var29 = (var27 + 1) * arg7 + arg5 >> 16;
                        int var30 = var29 - var28;
                        if (var30 > 0) {
                            int var31 = arg1 + var29;
                            int var32 = var27 + arg0 & 0x3F;
                            int var33 = arg1 + var28;
                            int var34 = arg0 + var27 >> 6;
                            int var35 = arg4 + var14 & 0x3F;
                            int var36 = (var32 << 6) + var35;
                            int var37;
                            if (var34 < 0 || var34 > (var21.length - 1) || var21[var34] == null) {
                                if (class322.field5049.field1460 != -1) {
                                    var37 = class322.field5049.field1460;
                                } else if ((arg0 + var27 & 0x4) == (arg4 + var14 & 0x4)) {
                                    var37 = class107.field1755[class76.field1186 + 1];
                                } else {
                                    var37 = 4936552;
                                }
                                if (var34 < 0 || var21.length - 1 < var34) {
                                    if (var37 == 0) {
                                        var37 = 1;
                                    }
                                    class33.method288(var19, var33, var17, var30, var37);
                                    continue;
                                }
                            } else {
                                var37 = var21[var34][var36];
                            }
                            if (var37 == 0) {
                                var37 = 1;
                            }
                            int var38 = var23[var34] == null ? 0 : class107.field1755[var23[var34][var36] & 0xFF];
                            int var39 = var24[var34] == null ? 0 : class107.field1755[var24[var34][var36] & 0xFF];
                            if (var38 == 0 && var39 == 0) {
                                class33.method288(var19, var33, var17, var30, var37);
                            } else {
                                if (var38 != 0) {
                                    byte var40 = var22[var34] == null ? 0 : var22[var34][var36];
                                    int var41 = var40 & 0xFC;
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    if (var41 == 0 || var17 <= 1 || var30 <= 1) {
                                        class33.method288(var19, var33, var17, var30, var38);
                                    } else {
                                        class229.method1665(var41 >> 2, var40 & 0x3, class33.field503, 3, var17, var37, var19, var38, var33, true, var30);
                                    }
                                }
                                if (var39 != 0) {
                                    if (var39 == -1) {
                                        var39 = var37;
                                    }
                                    byte var42 = var25[var34][var36];
                                    int var43 = var42 & 0xFC;
                                    if (var43 == 0 || var17 <= 1 || var30 <= 1) {
                                        class33.method288(var19, var33, var17, var30, var39);
                                    }
                                    class229.method1665(var43 >> 2, var42 & 0x3, class33.field503, 3, var17, 0, var19, var39, var33, var38 == 0, var30);
                                }
                            }
                            if (var26[var34] != null) {
                                int var44 = var26[var34][var36] & 0xFF;
                                if (var44 != 0) {
                                    int var45;
                                    if (var17 == 1) {
                                        var45 = var19;
                                    } else {
                                        var45 = var20 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                        var44 -= 4;
                                        var46 = 13369344;
                                    }
                                    int var47;
                                    if (var30 == 1) {
                                        var47 = var33;
                                    } else {
                                        var47 = var31 - 1;
                                    }
                                    if (var44 == 1) {
                                        class33.method307(var19, var33, var30, var46);
                                    } else if (var44 == 2) {
                                        class33.method301(var19, var33, var17, var46);
                                    } else if (var44 == 3) {
                                        class33.method307(var45, var33, var30, var46);
                                    } else if (var44 == 4) {
                                        class33.method301(var19, var47, var17, var46);
                                    } else if (var44 == 9) {
                                        class33.method307(var19, var33, var30, 16777215);
                                        class33.method301(var19, var33, var17, var46);
                                    } else if (var44 == 10) {
                                        class33.method307(var45, var33, var30, 16777215);
                                        class33.method301(var19, var33, var17, var46);
                                    } else if (var44 == 11) {
                                        class33.method307(var45, var33, var30, 16777215);
                                        class33.method301(var19, var47, var17, var46);
                                    } else if (var44 == 12) {
                                        class33.method307(var19, var33, var30, 16777215);
                                        class33.method301(var19, var47, var17, var46);
                                    } else if (var44 == 17) {
                                        class33.method301(var19, var33, 1, var46);
                                    } else if (var44 == 18) {
                                        class33.method301(var45, var33, 1, var46);
                                    } else if (var44 == 19) {
                                        class33.method301(var45, var47, 1, var46);
                                    } else if (var44 == 20) {
                                        class33.method301(var19, var47, 1, var46);
                                    } else if (var44 == 25) {
                                        for (int var48 = 0; var48 < var30; var48++) {
                                            class33.method301(var19 + var48, -var48 + var47, 1, var46);
                                        }
                                    } else if (var44 == 26) {
                                        for (int var49 = 0; var49 < var30; var49++) {
                                            class33.method301(var19 + var49, var33 + var49, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg2 + var16;
                    int var51 = arg2 + var15;
                    for (int var52 = 0; var52 < var12; var52++) {
                        int var53 = (arg7 * var52 + arg5 >> 16) + arg1;
                        int var54 = ((var52 + 1) * arg7 + arg5 >> 16) + arg1;
                        int var55;
                        if (class322.field5049.field1460 != -1) {
                            var55 = class322.field5049.field1460;
                        } else if ((var14 + arg4 & 0x4) == (arg0 + var52 & 0x4)) {
                            var55 = class107.field1755[class76.field1186 + 1];
                        } else {
                            var55 = 4936552;
                        }
                        if (var55 == 0) {
                            var55 = 1;
                        }
                        int var56 = var54 - var53;
                        class33.method288(var51, var53, var17, var56, var55);
                    }
                }
            }
        }
        for (int var57 = -2; var57 < (var11 + 2); var57++) {
            int var58 = arg3 + (arg10 * var57) >> 16;
            int var59 = arg3 + ((var57 + 1) * arg10) >> 16;
            int var60 = var59 - var58;
            if (var60 > 0) {
                var10000 = arg2 + var59;
                int var62 = arg2 + var58;
                int var63 = arg4 + var57 >> 6;
                if (var63 >= 0 && var63 <= (class178.field2837.length - 1)) {
                    int[][] var64 = class178.field2837[var63];
                    for (int var65 = -2; var65 < (var12 + 2); var65++) {
                        int var66 = arg7 * var65 + arg5 >> 16;
                        int var67 = (var65 + 1) * arg7 + arg5 >> 16;
                        int var68 = var67 - var66;
                        if (var68 > 0) {
                            int var69 = arg1 + var66;
                            var10000 = arg1 + var67;
                            int var71 = arg0 + var65 >> 6;
                            if (var71 >= 0 && (var64.length - 1) >= var71) {
                                int var72 = (arg0 + var65 & 0x3F << 6) + (arg4 + var57 & 0x3F);
                                if (var64[var71] != null) {
                                    int var73 = var64[var71][var72];
                                    int var74 = var73 & 0x1FFF;
                                    if (var74 != 0) {
                                        int var75 = var73 >> 13 & 0x3;
                                        class65 var76 = class113.method878(var74 - 1, (byte) -62);
                                        boolean var77 = ((var73 & 0xD74A) >> 15) == 1;
                                        class186 var78 = var76.method521(true, var77, var75);
                                        if (var78 != null) {
                                            int var79 = var78.field3065 * var60 / 4;
                                            int var80 = var78.field3064 * var68 / 4;
                                            if (var76.field959) {
                                                int var81 = var73 >> 16 & 0xF;
                                                int var82 = var73 >> 20 & 0xF;
                                                if ((var75 & 0x1) == 1) {
                                                    int var83 = var81;
                                                    var81 = var82;
                                                    var82 = var83;
                                                }
                                                var79 = var60 * var81;
                                                var80 = var68 * var82;
                                            }
                                            if (var79 != 0 && var80 != 0) {
                                                if (var76.field957 == 0) {
                                                    var78.method1357(var62, var69 + var68 - var80, var79, var80);
                                                } else {
                                                    var78.method1348(var62, var68 + var69 - var80, var79, var80, var76.field957);
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

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)[B", line = 697)
    public final byte[] method612(int arg0) {
        if (arg0 <= 34) {
            this.field3498 = -50;
        }
        field3495++;
        if (this.field2433 || this.field3499.field34.length - this.field3504 > this.field3499.field48) {
            throw new RuntimeException();
        }
        return this.field3499.field34;
    }
}
