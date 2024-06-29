import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class279 {

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public int field4333 = -1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lrj;")
    public static class269 field4329;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[Lrj;")
    public static class269[] field4335;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 7)
    public static void method1931(int arg0) {
        field4335 = null;
        field4329 = null;
        if (arg0 > -11) {
            method1932(127, 63, 40, 8, 19);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4330++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -1;
        int var8 = class335.method2343(-1, class234.field3569, arg1 + arg3, class322.field4965);
        if (arg0 <= 116) {
            field4340 = 99;
        }
        int var9 = -arg1;
        int var10 = class335.method2343(-1, class234.field3569, arg3 - arg1, class322.field4965);
        class7.method72(var8, -7, var10, class79.field1178[arg2], arg4);
        while (var5 < var6) {
            var7 += 2;
            var9 += var7;
            if (var9 > 0) {
                var6--;
                var9 -= var6 << 1;
                int var11 = arg2 + var6;
                int var12 = arg2 - var6;
                if (class212.field3261 <= var11 && class182.field2888 >= var12) {
                    int var13 = class335.method2343(-1, class234.field3569, arg3 + var5, class322.field4965);
                    int var14 = class335.method2343(-1, class234.field3569, arg3 - var5, class322.field4965);
                    if (var11 <= class182.field2888) {
                        class7.method72(var13, -7, var14, class79.field1178[var11], arg4);
                    }
                    if (class212.field3261 <= var12) {
                        class7.method72(var13, -7, var14, class79.field1178[var12], arg4);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class212.field3261 && class182.field2888 >= var15) {
                int var17 = class335.method2343(-1, class234.field3569, arg3 + var6, class322.field4965);
                int var18 = class335.method2343(-1, class234.field3569, arg3 - var6, class322.field4965);
                if (var16 <= class182.field2888) {
                    class7.method72(var17, -7, var18, class79.field1178[var16], arg4);
                }
                if (var15 >= class212.field3261) {
                    class7.method72(var17, -7, var18, class79.field1178[var15], arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([[B[[BI[[F[[B[[F[[II[Lk;I[[F[[B)V", line = 98)
    public static final void method1933(byte[][] arg0, byte[][] arg1, int arg2, float[][] arg3, byte[][] arg4, float[][] arg5, int[][] arg6, int arg7, class255[] arg8, int arg9, float[][] arg10, byte[][] arg11) {
        for (int var12 = 0; var12 < arg7; var12++) {
            class255 var13 = arg8[var12];
            if (var13.field3911 == arg2) {
                class70 var14 = new class70();
                int var15 = (var13.field3882 >> 7) - var13.field3908;
                int var16 = 0;
                int var17 = (var13.field3902 >> 7) + var13.field3908;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = (var13.field3902 >> 7) - var13.field3908;
                if (var18 < 0) {
                    var16 -= var18;
                    var18 = 0;
                }
                for (int var19 = var18; var19 <= var17; var19++) {
                    short var20 = var13.field3904[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg4[var23][var19] & 0xFF;
                        int var25 = arg11[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class299 var31 = class106.method792(var25 - 1, 0);
                            if (var31.field4611 == -1) {
                                continue;
                            }
                            if (arg1[var23][var19] != 0) {
                                int[] var55 = class258.field3981[arg1[var23][var19]];
                                var14.field1004 += ((var55.length >> 1) - 2) * 3;
                                var14.field1000 += var55.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class299 var27 = class106.method792(var25 - 1, 0);
                            if (var27.field4611 == -1) {
                                byte var28 = arg1[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class180.field2852[var28];
                                    var14.field1004 += (var29.length >> 1) * 3 - 6;
                                    var14.field1000 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg1[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class228 var32 = class294.method2035(arg2, var23, var19);
                        if (var32 != null) {
                            int var33 = (int) (var32.field3482 >> 14) & 0x3F;
                            if (var33 == 9) {
                                int[] var34 = null;
                                int var35 = (int) (var32.field3482 >> 20) & 0x3;
                                if ((var35 & 0x1) == 0) {
                                    boolean var44 = var21 <= (var23 - 1);
                                    boolean var45 = var22 >= (var23 + 1);
                                    if (!var44 && var19 + 1 <= var17) {
                                        short var46 = var13.field3904[var16 + 1];
                                        int var47 = (var46 >> 8) + var15;
                                        int var48 = var47 + (var46 & 0xFF);
                                        var44 = var47 < var23 && var23 < var48;
                                    }
                                    if (!var45 && var19 - 1 >= var18) {
                                        short var49 = var13.field3904[var16 - 1];
                                        int var50 = (var49 >> 8) + var15;
                                        int var51 = var50 + (var49 & 0xFF);
                                        var45 = var23 > var50 && var23 < var51;
                                    }
                                    if (var44 && var45) {
                                        var34 = class258.field3981[0];
                                    } else if (var44) {
                                        var34 = class258.field3981[1];
                                    } else if (var45) {
                                        var34 = class258.field3981[1];
                                    }
                                } else {
                                    boolean var36 = (var23 - 1) >= var21;
                                    boolean var37 = var22 >= (var23 + 1);
                                    if (!var36 && var18 <= var19 - 1) {
                                        short var38 = var13.field3904[var16 - 1];
                                        int var39 = (var38 >> 8) + var15;
                                        int var40 = var39 + (var38 & 0xFF);
                                        var36 = var23 > var39 && var40 > var23;
                                    }
                                    if (!var37 && var17 >= (var19 + 1)) {
                                        short var41 = var13.field3904[var16 + 1];
                                        int var42 = (var41 >> 8) + var15;
                                        int var43 = var42 + (var41 & 0xFF);
                                        var37 = var42 < var23 && var23 < var43;
                                    }
                                    if (var36 && var37) {
                                        var34 = class258.field3981[0];
                                    } else if (var36) {
                                        var34 = class258.field3981[1];
                                    } else if (var37) {
                                        var34 = class258.field3981[1];
                                    }
                                }
                                if (var34 != null) {
                                    var14.field1004 += ((var34.length >> 1) - 2) * 3;
                                    var14.field1000 += var34.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var52 = class180.field2852[arg1[var23][var19]];
                            int[] var53 = class258.field3981[arg1[var23][var19]];
                            var14.field1004 += ((var53.length >> 1) - 2) * 3;
                            var14.field1004 += (var52.length >> 1) * 3 - 6;
                            var14.field1000 += var53.length >> 1;
                            var14.field1000 += var52.length >> 1;
                        } else {
                            int[] var54 = class258.field3981[0];
                            var14.field1004 += ((var54.length >> 1) - 2) * 3;
                            var14.field1000 += var54.length >> 1;
                        }
                    }
                    var16++;
                }
                var14.method497();
                int var56 = 0;
                if (((var13.field3902 >> 7) - var13.field3908) < 0) {
                    var56 -= (var13.field3902 >> 7) - var13.field3908;
                }
                for (int var57 = var18; var57 <= var17; var57++) {
                    short var58 = var13.field3904[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = var59 + (var58 & 0xFF) - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg0[var61][var57];
                        int var63 = arg4[var61][var57] & 0xFF;
                        boolean var64 = false;
                        int var65 = arg11[var61][var57] & 0xFF;
                        if (var63 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class299 var68 = class106.method792(var65 - 1, 0);
                            if (var68.field4611 == -1) {
                                continue;
                            }
                            if (arg1[var61][var57] != 0) {
                                class35.method271(var61, arg6, var14, arg0[var61][var57], var57, arg5, arg10, class258.field3981[arg1[var61][var57]], arg3, -116, var13);
                                continue;
                            }
                        } else if (var65 != 0) {
                            class299 var66 = class106.method792(var65 - 1, 0);
                            if (var66.field4611 == -1) {
                                class35.method271(var61, arg6, var14, arg0[var61][var57], var57, arg5, arg10, class180.field2852[arg1[var61][var57]], arg3, -85, var13);
                                continue;
                            }
                            byte var67 = arg1[var61][var57];
                            if (var67 != 0) {
                                var64 = true;
                            }
                        }
                        class228 var69 = class294.method2035(arg2, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field3482 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field3482 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var59 <= (var61 - 1);
                                    if (!var81 && (var57 + 1) <= var17) {
                                        short var82 = var13.field3904[var56 + 1];
                                        int var83 = (var82 >> 8) + var15;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var61 > var83 && var84 > var61;
                                    }
                                    boolean var85 = (var61 + 1) <= var60;
                                    if (!var85 && var18 <= (var57 - 1)) {
                                        short var86 = var13.field3904[var56 - 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = var87 + (var86 & 0xFF);
                                        var85 = var87 < var61 && var61 < var88;
                                    }
                                    if (var81 && var85) {
                                        var71 = class258.field3981[0];
                                    } else if (var81) {
                                        var71 = class258.field3981[1];
                                        var62 = 1;
                                    } else if (var85) {
                                        var62 = 3;
                                        var71 = class258.field3981[1];
                                    }
                                } else {
                                    boolean var73 = var59 <= var61 - 1;
                                    if (!var73 && var18 <= var57 - 1) {
                                        short var74 = var13.field3904[var56 - 1];
                                        int var75 = (var74 >> 8) + var15;
                                        int var76 = var75 + (var74 & 0xFF);
                                        var73 = var75 < var61 && var76 > var61;
                                    }
                                    boolean var77 = var60 >= (var61 + 1);
                                    if (!var77 && (var57 + 1) <= var17) {
                                        short var78 = var13.field3904[var56 + 1];
                                        int var79 = (var78 >> 8) + var15;
                                        int var80 = var79 + (var78 & 0xFF);
                                        var77 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var71 = class258.field3981[0];
                                    } else if (var73) {
                                        var62 = 0;
                                        var71 = class258.field3981[1];
                                    } else if (var77) {
                                        var71 = class258.field3981[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class35.method271(var61, arg6, var14, var62, var57, arg5, arg10, var71, arg3, -97, var13);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class35.method271(var61, arg6, var14, arg0[var61][var57], var57, arg5, arg10, class180.field2852[arg1[var61][var57]], arg3, -91, var13);
                            class35.method271(var61, arg6, var14, arg0[var61][var57], var57, arg5, arg10, class258.field3981[arg1[var61][var57]], arg3, -102, var13);
                        } else {
                            class35.method271(var61, arg6, var14, var62, var57, arg5, arg10, class258.field3981[0], arg3, -99, var13);
                        }
                    }
                    var56++;
                }
                if (var14.field993 > 0 && var14.field1003 > 0) {
                    var14.method499();
                    var13.field3885 = var14;
                }
            }
        }
        if (arg9 < 74) {
            method1933((byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -21, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 10, (class255[]) null, 8, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null));
        }
        field4327++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIILfc;IZJ)Z", line = 623)
    public static final boolean method1934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class110 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class71.field1024 == class203.field3111;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class75.field1091 || var16 >= class115.field1818) {
                    return false;
                }
                class79 var17 = class213.field3262[arg0][var15][var16];
                if (var17 != null && var17.field1169 >= 5) {
                    return false;
                }
            }
        }
        class228 var18 = new class228();
        var18.field3482 = arg11;
        var18.field3486 = arg0;
        var18.field3483 = arg5;
        var18.field3477 = arg6;
        var18.field3485 = arg7;
        var18.field3480 = arg8;
        var18.field3476 = arg9;
        var18.field3472 = arg1;
        var18.field3475 = arg2;
        var18.field3474 = arg1 + arg3 - 1;
        var18.field3484 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class213.field3262[var22][var19][var20] == null) {
                        class213.field3262[var22][var19][var20] = new class79(var22, var19, var20);
                    }
                }
                class79 var23 = class213.field3262[arg0][var19][var20];
                var23.field1157[var23.field1169] = var18;
                var23.field1180[var23.field1169] = var21;
                var23.field1162 |= var21;
                var23.field1169++;
                if (var13 && class78.field1137[var19][var20] != 0) {
                    var14 = class78.field1137[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class78.field1137[var24][var25] == 0) {
                        class78.field1137[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class192.field2994[class31.field370++] = var18;
        }
        return true;
    }
}
