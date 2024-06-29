import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class204 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2860 = " is already on your ignore list.";

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field2864 = 0;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field2859 = 10;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2869 = "Loaded title screen";

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Lcc;")
    public static class263 field2868;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 17)
    public static final void method1391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2867++;
        class330 var13 = new class330();
        var13.field5054 = arg7;
        var13.field5056 = arg6;
        var13.field5037 = arg8;
        var13.field5041 = arg12;
        var13.field5049 = arg0;
        var13.field5055 = arg4;
        var13.field5051 = arg2;
        var13.field5040 = arg11;
        var13.field5042 = arg1;
        if (arg3 != 18149) {
            method1393(-68);
        }
        var13.field5048 = arg5;
        var13.field5052 = arg9;
        var13.field5047 = arg10;
        class291.field4564.method2325(var13, (byte) 34);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([[BI[[B[[B[Lsj;[[B[[III[[F[[F[[F)V", line = 44)
    public static final void method1392(byte[][] arg0, int arg1, byte[][] arg2, byte[][] arg3, class62[] arg4, byte[][] arg5, int[][] arg6, int arg7, int arg8, float[][] arg9, float[][] arg10, float[][] arg11) {
        if (arg7 != -1) {
            method1393(115);
        }
        field2862++;
        for (int var12 = 0; var12 < arg1; var12++) {
            class62 var13 = arg4[var12];
            if (var13.field773 == arg8) {
                class111 var14 = new class111();
                int var15 = (var13.field759 >> 7) - var13.field777;
                int var16 = (var13.field764 >> 7) - var13.field777;
                int var17 = 0;
                if (var16 < 0) {
                    var17 -= var16;
                    var16 = 0;
                }
                int var18 = (var13.field764 >> 7) + var13.field777;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var16; var19 <= var18; var19++) {
                    short var20 = var13.field775[var17];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg5[var23][var19] & 0xFF;
                        int var25 = arg3[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class300 var27 = class272.method1971(var25 - 1, (byte) 96);
                            if (var27.field4676 == -1) {
                                continue;
                            }
                            if (arg2[var23][var19] != 0) {
                                int[] var28 = class280.field4348[arg2[var23][var19]];
                                var14.field1566 += ((var28.length >> 1) - 2) * 3;
                                var14.field1567 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class300 var29 = class272.method1971(var25 - 1, (byte) 96);
                            if (var29.field4676 == -1) {
                                byte var30 = arg2[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class7.field99[var30];
                                    var14.field1566 += (var31.length >> 1) * 3 - 6;
                                    var14.field1567 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg2[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class80 var33 = class91.method536(arg8, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field1026 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field1026 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = var23 + 1 <= var22;
                                    boolean var46 = var21 <= var23 - 1;
                                    if (!var46 && var19 + 1 <= var18) {
                                        short var47 = var13.field775[var17 + 1];
                                        int var48 = var15 + (var47 >> 8);
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var48 < var23 && var23 < var49;
                                    }
                                    if (!var45 && (var19 - 1) >= var16) {
                                        short var50 = var13.field775[var17 - 1];
                                        int var51 = var15 + (var50 >> 8);
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var23 > var51 && var23 < var52;
                                    }
                                    if (var46 && var45) {
                                        var35 = class280.field4348[0];
                                    } else if (var46) {
                                        var35 = class280.field4348[1];
                                    } else if (var45) {
                                        var35 = class280.field4348[1];
                                    }
                                } else {
                                    boolean var37 = var21 <= var23 - 1;
                                    if (!var37 && var16 <= (var19 - 1)) {
                                        short var38 = var13.field775[var17 - 1];
                                        int var39 = (var38 >> 8) + var15;
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var39 < var23 && var23 < var40;
                                    }
                                    boolean var41 = var23 + 1 <= var22;
                                    if (!var41 && (var19 + 1) <= var18) {
                                        short var42 = var13.field775[var17 + 1];
                                        int var43 = (var42 >> 8) + var15;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var43 < var23 && var44 > var23;
                                    }
                                    if (var37 && var41) {
                                        var35 = class280.field4348[0];
                                    } else if (var37) {
                                        var35 = class280.field4348[1];
                                    } else if (var41) {
                                        var35 = class280.field4348[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field1566 += (var35.length >> 1) * 3 - 6;
                                    var14.field1567 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class280.field4348[arg2[var23][var19]];
                            int[] var55 = class7.field99[arg2[var23][var19]];
                            var14.field1566 += (var54.length >> 1) * 3 - 6;
                            var14.field1566 += (var55.length >> 1) * 3 - 6;
                            var14.field1567 += var54.length >> 1;
                            var14.field1567 += var55.length >> 1;
                        } else {
                            int[] var53 = class280.field4348[0];
                            var14.field1566 += (var53.length >> 1) * 3 - 6;
                            var14.field1567 += var53.length >> 1;
                        }
                    }
                    var17++;
                }
                var14.method763();
                int var56 = 0;
                if (((var13.field764 >> 7) - var13.field777) < 0) {
                    var56 -= (var13.field764 >> 7) - var13.field777;
                }
                for (int var57 = var16; var57 <= var18; var57++) {
                    short var58 = var13.field775[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg0[var61][var57];
                        boolean var63 = false;
                        int var64 = arg5[var61][var57] & 0xFF;
                        int var65 = arg3[var61][var57] & 0xFF;
                        if (var64 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class300 var68 = class272.method1971(var65 - 1, (byte) 96);
                            if (var68.field4676 == -1) {
                                continue;
                            }
                            if (arg2[var61][var57] != 0) {
                                class334.method2305(arg11, arg6, var14, arg0[var61][var57], var13, var61, arg10, (byte) 109, arg9, class280.field4348[arg2[var61][var57]], var57);
                                continue;
                            }
                        } else if (var65 != 0) {
                            class300 var66 = class272.method1971(var65 - 1, (byte) 96);
                            if (var66.field4676 == -1) {
                                class334.method2305(arg11, arg6, var14, arg0[var61][var57], var13, var61, arg10, (byte) 124, arg9, class7.field99[arg2[var61][var57]], var57);
                                continue;
                            }
                            byte var67 = arg2[var61][var57];
                            if (var67 != 0) {
                                var63 = true;
                            }
                        }
                        class80 var69 = class91.method536(arg8, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field1026 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field1026 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = var59 <= (var61 - 1);
                                    boolean var74 = (var61 + 1) <= var60;
                                    if (!var73 && var18 >= (var57 + 1)) {
                                        short var75 = var13.field775[var56 + 1];
                                        int var76 = (var75 >> 8) + var15;
                                        int var77 = var76 + (var75 & 0xFF);
                                        var73 = var76 < var61 && var77 > var61;
                                    }
                                    if (!var74 && var16 <= var57 - 1) {
                                        short var78 = var13.field775[var56 - 1];
                                        int var79 = var15 + (var78 >> 8);
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class280.field4348[0];
                                    } else if (var73) {
                                        var71 = class280.field4348[1];
                                        var62 = 1;
                                    } else if (var74) {
                                        var62 = 3;
                                        var71 = class280.field4348[1];
                                    }
                                } else {
                                    boolean var81 = (var61 - 1) >= var59;
                                    boolean var82 = (var61 + 1) <= var60;
                                    if (!var81 && var16 <= var57 - 1) {
                                        short var83 = var13.field775[var56 - 1];
                                        int var84 = (var83 >> 8) + var15;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var84 < var61 && var85 > var61;
                                    }
                                    if (!var82 && var18 >= (var57 + 1)) {
                                        short var86 = var13.field775[var56 + 1];
                                        int var87 = var15 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var61 < var88;
                                    }
                                    if (var81 && var82) {
                                        var71 = class280.field4348[0];
                                    } else if (var81) {
                                        var62 = 0;
                                        var71 = class280.field4348[1];
                                    } else if (var82) {
                                        var71 = class280.field4348[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class334.method2305(arg11, arg6, var14, var62, var13, var61, arg10, (byte) 112, arg9, var71, var57);
                                }
                                continue;
                            }
                        }
                        if (var63) {
                            class334.method2305(arg11, arg6, var14, arg0[var61][var57], var13, var61, arg10, (byte) 112, arg9, class7.field99[arg2[var61][var57]], var57);
                            class334.method2305(arg11, arg6, var14, arg0[var61][var57], var13, var61, arg10, (byte) 112, arg9, class280.field4348[arg2[var61][var57]], var57);
                        } else {
                            class334.method2305(arg11, arg6, var14, var62, var13, var61, arg10, (byte) 117, arg9, class280.field4348[0], var57);
                        }
                    }
                    var56++;
                }
                if (var14.field1569 > 0 && var14.field1573 > 0) {
                    var14.method759();
                    var13.field783 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 583)
    public static void method1393(int arg0) {
        if (arg0 != 1) {
            method1391(101, -118, -23, -63, 40, 100, -57, 26, -32, 68, 55, -120, -117);
        }
        field2860 = null;
        field2868 = null;
        field2869 = null;
    }
}
