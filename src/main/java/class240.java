import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class240 extends class248 {

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public int field4123 = 0;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field4124 = -1;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Lij;")
    public static class50 field4134 = class78.method578(122, "leuchten1:");

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Lij;")
    private static class50 field4128 = class78.method578(122, " ");

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lij;")
    public static class50 field4126 = field4128;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "[I")
    public static int[] field4127;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "[Z")
    public static boolean[] field4132;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public static final boolean method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class229.field3849[var12][var31] = 0;
                class116.field2023[var12][var31] = 99999999;
            }
        }
        class229.field3849[arg5][arg7] = 99;
        field4129++;
        class116.field2023[arg5][arg7] = 0;
        int var13 = arg5;
        int var14 = arg7;
        if (arg8 <= 103) {
            method1634(27, -10, -94, -113, 79, 80);
        }
        byte var15 = 0;
        class101.field1857[var15] = arg5;
        boolean var16 = false;
        int var17 = 0;
        int var32 = var15 + 1;
        class20.field429[var15] = arg7;
        int[][] var18 = class45.field826[class201.field3312].field814;
        while (var32 != var17) {
            var13 = class101.field1857[var17];
            var14 = class20.field429[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var13 && arg2 == var14) {
                var16 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class45.field826[class201.field3312].method331(2, arg11, arg4, arg2, arg0 - 1, (byte) -117, var13, var14)) {
                    var16 = true;
                    break;
                }
                if (arg0 < 10 && class45.field826[class201.field3312].method326(var13, arg4, 2, arg2, var14, arg11, arg0 - 1, (byte) 40)) {
                    var16 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg3 != 0 && class45.field826[class201.field3312].method334(arg6, var14, 2, arg2, arg3, 17436672, var13, arg11, arg10)) {
                var16 = true;
                break;
            }
            int var30 = class116.field2023[var13][var14] + 1;
            if (var13 > 0 && class229.field3849[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class101.field1857[var32] = var13 - 1;
                class20.field429[var32] = var14;
                class229.field3849[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class116.field2023[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class229.field3849[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class101.field1857[var32] = var13 + 1;
                class20.field429[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var13 + 1][var14] = 8;
                class116.field2023[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class229.field3849[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class101.field1857[var32] = var13;
                class20.field429[var32] = var14 - 1;
                class229.field3849[var13][var14 - 1] = 1;
                class116.field2023[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class229.field3849[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class101.field1857[var32] = var13;
                class20.field429[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var13][var14 + 1] = 4;
                class116.field2023[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class229.field3849[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class101.field1857[var32] = var13 - 1;
                class20.field429[var32] = var14 - 1;
                class229.field3849[var13 - 1][var14 - 1] = 3;
                class116.field2023[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class229.field3849[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class101.field1857[var32] = var13 + 1;
                class20.field429[var32] = var14 - 1;
                class229.field3849[var13 + 1][var14 - 1] = 9;
                class116.field2023[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 102 && class229.field3849[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class101.field1857[var32] = var13 - 1;
                class20.field429[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var13 - 1][var14 + 1] = 6;
                class116.field2023[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class229.field3849[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class101.field1857[var32] = var13 + 1;
                class20.field429[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var13 + 1][var14 + 1] = 12;
                class116.field2023[var13 + 1][var14 + 1] = var30;
            }
        }
        class57.field1026 = 0;
        if (!var16) {
            if (!arg9) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg11 - var21; var22 <= (arg11 + var21); var22++) {
                for (int var23 = arg2 - var21; var23 <= (arg2 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class116.field2023[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg11 > var22) {
                            var24 = arg11 - var22;
                        } else if (var22 > (arg10 + arg11 - 1)) {
                            var24 = var22 + 1 - arg10 - arg11;
                        }
                        int var25 = 0;
                        if (arg2 > var23) {
                            var25 = arg2 - var23;
                        } else if (var23 > arg3 + arg2 - 1) {
                            var25 = 1 - arg3 - (arg2 - var23);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && class116.field2023[var22][var23] < var20) {
                            var13 = var22;
                            var20 = class116.field2023[var22][var23];
                            var19 = var26;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg7 == var14) {
                return false;
            }
            class57.field1026 = 1;
        }
        byte var27 = 0;
        class101.field1857[var27] = var13;
        int var33 = var27 + 1;
        class20.field429[var27] = var14;
        int var28;
        int var29 = var28 = class229.field3849[var13][var14];
        while (arg5 != var13 || arg7 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class101.field1857[var33] = var13;
                class20.field429[var33++] = var14;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class229.field3849[var13][var14];
        }
        if (var33 > 0) {
            class57.method449(arg1, var33, (byte) -114);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 1000) {
            field4134 = null;
        }
        if (arg2 >= class177.field2953 && arg4 <= class224.field3773 && class100.field1855 <= arg5 && class97.field1816 >= arg0) {
            class136.method944(arg4, arg5, arg2, arg0, (byte) 117, arg3);
        } else {
            class97.method728(arg2, arg3, arg0, arg4, arg5, false);
        }
        field4130++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwd;II)V")
    private final void method1635(class217 arg0, int arg1, int arg2) {
        int var4 = -10 / ((-arg1 - 11) / 52);
        field4122++;
        if (arg2 == 2) {
            this.field4123 = arg0.method1441(93);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1636(byte arg0) {
        int var1 = 41 % ((-arg0 - 1) / 63);
        field4128 = null;
        field4127 = null;
        field4134 = null;
        field4126 = null;
        field4132 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIBZI[IIIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg3 != -24) {
            field4132 = null;
        }
        if (arg1 < class158.field2728) {
            arg7 -= class158.field2728 - arg1;
            arg1 = class158.field2728;
        }
        if ((arg1 + arg7) > class158.field2725) {
            arg7 = class158.field2725 - arg1;
        }
        field4125++;
        if (class158.field2727 > arg0) {
            arg9 -= class158.field2727 - arg0;
            arg0 = class158.field2727;
        }
        int var11 = class158.field2724 * arg0 + arg1;
        int var12 = class158.field2724 - arg7;
        if (arg8 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (class158.field2726 < arg0 + arg9) {
            arg9 = class158.field2726 - arg0;
        }
        if (arg8 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg8 = 8;
        }
        if (arg8 == 1) {
            if (arg10 == 0) {
                for (int var13 = 0; var13 < arg9; var13++) {
                    for (int var14 = 0; var14 < arg7; var14++) {
                        if (var14 <= var13) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var15 = arg9 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg7; var16++) {
                        if (var15 >= var16) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var17 = 0; var17 < arg9; var17++) {
                    for (int var18 = 0; var18 < arg7; var18++) {
                        if (var18 >= var17) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var19 = arg9 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg7; var20++) {
                        if (var20 >= var19) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg8 == 2) {
            if (arg10 == 0) {
                for (int var21 = arg9 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg7; var22++) {
                        if (var22 <= var21 >> 1) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var23 = 0; var23 < arg9; var23++) {
                    for (int var24 = 0; var24 < arg7; var24++) {
                        if (var24 >= var23 << 1) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var25 = 0; var25 < arg9; var25++) {
                    for (int var26 = arg7 - 1; var26 >= 0; var26--) {
                        if ((var25 >> 1) >= var26) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var27 = arg9 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg7 - 1; var28 >= 0; var28--) {
                        if (var27 << 1 <= var28) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg8 == 3) {
            if (arg10 == 0) {
                for (int var29 = arg9 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg7 - 1; var30 >= 0; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var31 = arg9 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg7; var32++) {
                        if ((var31 << 1) <= var32) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var33 = 0; var33 < arg9; var33++) {
                    for (int var34 = 0; var34 < arg7; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var35 = 0; var35 < arg9; var35++) {
                    for (int var36 = arg7 - 1; var36 >= 0; var36--) {
                        if (var36 >= (var35 << 1)) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg8 == 4) {
            if (arg10 == 0) {
                for (int var37 = arg9 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg7; var38++) {
                        if (var38 >= var37 >> 1) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var39 = 0; var39 < arg9; var39++) {
                    for (int var40 = 0; var40 < arg7; var40++) {
                        if (var40 <= var39 << 1) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var41 = 0; var41 < arg9; var41++) {
                    for (int var42 = arg7 - 1; var42 >= 0; var42--) {
                        if (var42 >= var41 >> 1) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var43 = arg9 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg7 - 1; var44 >= 0; var44--) {
                        if ((var43 << 1) >= var44) {
                            arg6[var11] = arg5;
                        } else if (arg4) {
                            arg6[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg8 != 5) {
            if (arg8 == 6) {
                if (arg10 == 0) {
                    for (int var53 = 0; var53 < arg9; var53++) {
                        for (int var54 = 0; var54 < arg7; var54++) {
                            if ((arg7 / 2) >= var54) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var55 = 0; var55 < arg9; var55++) {
                        for (int var56 = 0; var56 < arg7; var56++) {
                            if (var55 <= arg9 / 2) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var57 = 0; var57 < arg9; var57++) {
                        for (int var58 = 0; var58 < arg7; var58++) {
                            if (var58 >= arg7 / 2) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var59 = 0; var59 < arg9; var59++) {
                        for (int var60 = 0; var60 < arg7; var60++) {
                            if (var59 >= arg9 / 2) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg8 == 7) {
                if (arg10 == 0) {
                    for (int var61 = 0; var61 < arg9; var61++) {
                        for (int var62 = 0; var62 < arg7; var62++) {
                            if (var62 <= var61 - (arg9 / 2)) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var63 = arg9 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg7; var64++) {
                            if (var64 <= (var63 - (arg9 / 2))) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var65 = arg9 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg7 - 1; var66 >= 0; var66--) {
                            if ((var65 - arg9 / 2) >= var66) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var67 = 0; var67 < arg9; var67++) {
                        for (int var68 = arg7 - 1; var68 >= 0; var68--) {
                            if (var68 <= (var67 - (arg9 / 2))) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg8 == 8) {
                if (arg10 == 0) {
                    for (int var69 = 0; var69 < arg9; var69++) {
                        for (int var70 = 0; var70 < arg7; var70++) {
                            if (var70 >= (var69 - arg9 / 2)) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var71 = arg9 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg7; var72++) {
                            if (var72 >= (var71 - (arg9 / 2))) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var73 = arg9 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg7 - 1; var74 >= 0; var74--) {
                            if ((var73 - (arg9 / 2)) <= var74) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var75 = 0; var75 < arg9; var75++) {
                        for (int var76 = arg7 - 1; var76 >= 0; var76--) {
                            if (var75 - (arg9 / 2) <= var76) {
                                arg6[var11] = arg5;
                            } else if (arg4) {
                                arg6[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
        } else if (arg10 == 0) {
            for (int var45 = arg9 - 1; var45 >= 0; var45--) {
                for (int var46 = arg7 - 1; var46 >= 0; var46--) {
                    if (var45 >> 1 <= var46) {
                        arg6[var11] = arg5;
                    } else if (arg4) {
                        arg6[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg10 == 1) {
            for (int var47 = arg9 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg7; var48++) {
                    if (var48 <= var47 << 1) {
                        arg6[var11] = arg5;
                    } else if (arg4) {
                        arg6[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg10 == 2) {
            for (int var49 = 0; var49 < arg9; var49++) {
                for (int var50 = 0; var50 < arg7; var50++) {
                    if (var50 >= var49 >> 1) {
                        arg6[var11] = arg5;
                    } else if (arg4) {
                        arg6[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg10 == 3) {
            for (int var51 = 0; var51 < arg9; var51++) {
                for (int var52 = arg7 - 1; var52 >= 0; var52--) {
                    if (var51 << 1 >= var52) {
                        arg6[var11] = arg5;
                    } else if (arg4) {
                        arg6[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwd;I)V")
    public final void method1638(class217 arg0, int arg1) {
        field4131++;
        while (true) {
            int var3 = arg0.method1487(arg1 ^ 0x1011);
            if (var3 == 0) {
                if (arg1 == 4334) {
                    return;
                } else {
                    field4132 = null;
                    return;
                }
            }
            this.method1635(arg0, -103, var3);
        }
    }
}
