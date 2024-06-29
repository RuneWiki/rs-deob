import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class219 extends class27 {

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
    public static int[] field4144 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Ldh;")
    public static class42 field4145;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method1481(int arg0) {
        if (arg0 != 2) {
            field4145 = null;
        }
        if (class114.field2058 != null) {
            class114.field2058.method406((byte) -70);
        }
        if (class27.field458 != null) {
            class27.field458.method406((byte) -70);
        }
        field4146++;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static void method1482(byte arg0) {
        field4145 = null;
        if (arg0 > -39) {
            method1481(-30);
        }
        field4144 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIII)Li;")
    public static final class88 method1483(boolean arg0, int arg1, int arg2, int arg3) {
        field4147++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        int var5 = arg1 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = arg3; var8 < var4; var8++) {
            int var10 = arg1 % arg2;
            arg1 /= arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class88 var9 = new class88();
        var9.field1660 = var6;
        var9.field1643 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIIIIIIBI[I)V")
    public static final void method1484(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int[] arg10) {
        if (class72.field1334 > arg4) {
            arg1 -= class72.field1334 - arg4;
            arg4 = class72.field1334;
        }
        field4149++;
        if (class72.field1335 < arg1 + arg4) {
            arg1 = class72.field1335 - arg4;
        }
        if (class72.field1332 > arg7) {
            arg9 -= class72.field1332 - arg7;
            arg7 = class72.field1332;
        }
        int var11 = class72.field1333 * arg4 + arg7;
        if (arg6 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg8 != -66) {
            return;
        }
        if (arg6 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 8;
        }
        if (class72.field1336 < arg7 + arg9) {
            arg9 = class72.field1336 - arg7;
        }
        int var12 = class72.field1333 - arg9;
        if (arg6 == 1) {
            if (arg3 == 0) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < arg9; var14++) {
                        if (var14 <= var13) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 1) {
                for (int var15 = arg1 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg9; var16++) {
                        if (var15 >= var16) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 2) {
                for (int var17 = 0; var17 < arg1; var17++) {
                    for (int var18 = 0; var18 < arg9; var18++) {
                        if (var17 <= var18) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 3) {
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg9; var20++) {
                        if (var19 <= var20) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 == 2) {
            if (arg3 == 0) {
                for (int var21 = arg1 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg9; var22++) {
                        if (var22 <= var21 >> 1) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 1) {
                for (int var23 = 0; var23 < arg1; var23++) {
                    for (int var24 = 0; var24 < arg9; var24++) {
                        if (var24 >= var23 << 1) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 2) {
                for (int var25 = 0; var25 < arg1; var25++) {
                    for (int var26 = arg9 - 1; var26 >= 0; var26--) {
                        if (var25 >> 1 >= var26) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 3) {
                for (int var27 = arg1 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg9 - 1; var28 >= 0; var28--) {
                        if (var28 >= var27 << 1) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 == 3) {
            if (arg3 == 0) {
                for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg9 - 1; var30 >= 0; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 1) {
                for (int var31 = arg1 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg9; var32++) {
                        if (var31 << 1 <= var32) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 2) {
                for (int var33 = 0; var33 < arg1; var33++) {
                    for (int var34 = 0; var34 < arg9; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 3) {
                for (int var35 = 0; var35 < arg1; var35++) {
                    for (int var36 = arg9 - 1; var36 >= 0; var36--) {
                        if (var35 << 1 <= var36) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 == 4) {
            if (arg3 == 0) {
                for (int var37 = arg1 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg9; var38++) {
                        if (var37 >> 1 <= var38) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 1) {
                for (int var39 = 0; var39 < arg1; var39++) {
                    for (int var40 = 0; var40 < arg9; var40++) {
                        if (var39 << 1 >= var40) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 2) {
                for (int var41 = 0; var41 < arg1; var41++) {
                    for (int var42 = arg9 - 1; var42 >= 0; var42--) {
                        if (var41 >> 1 <= var42) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg3 == 3) {
                for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg9 - 1; var44 >= 0; var44--) {
                        if (var44 <= var43 << 1) {
                            arg10[var11] = arg5;
                        } else if (arg0) {
                            arg10[var11] = arg2;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg3 == 0) {
                    for (int var53 = 0; var53 < arg1; var53++) {
                        for (int var54 = 0; var54 < arg9; var54++) {
                            if (var54 <= arg9 / 2) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var55 = 0; var55 < arg1; var55++) {
                        for (int var56 = 0; var56 < arg9; var56++) {
                            if (var55 <= arg1 / 2) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var57 = 0; var57 < arg1; var57++) {
                        for (int var58 = 0; var58 < arg9; var58++) {
                            if (var58 >= arg9 / 2) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var59 = 0; var59 < arg1; var59++) {
                        for (int var60 = 0; var60 < arg9; var60++) {
                            if (arg1 / 2 <= var59) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg3 == 0) {
                    for (int var61 = 0; var61 < arg1; var61++) {
                        for (int var62 = 0; var62 < arg9; var62++) {
                            if (var62 <= var61 - arg1 / 2) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var63 = arg1 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg9; var64++) {
                            if (var63 - arg1 / 2 >= var64) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg9 - 1; var66 >= 0; var66--) {
                            if (var65 - arg1 / 2 >= var66) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var67 = 0; var67 < arg1; var67++) {
                        for (int var68 = arg9 - 1; var68 >= 0; var68--) {
                            if (var68 <= var67 - arg1 / 2) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg3 == 0) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        for (int var70 = 0; var70 < arg9; var70++) {
                            if (var69 - arg1 / 2 <= var70) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var71 = arg1 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg9; var72++) {
                            if (var71 - arg1 / 2 <= var72) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var73 = arg1 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg9 - 1; var74 >= 0; var74--) {
                            if (var73 - arg1 / 2 <= var74) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var75 = 0; var75 < arg1; var75++) {
                        for (int var76 = arg9 - 1; var76 >= 0; var76--) {
                            if (var75 - arg1 / 2 <= var76) {
                                arg10[var11] = arg5;
                            } else if (arg0) {
                                arg10[var11] = arg2;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                for (int var46 = arg9 - 1; var46 >= 0; var46--) {
                    if (var46 >= var45 >> 1) {
                        arg10[var11] = arg5;
                    } else if (arg0) {
                        arg10[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg3 == 1) {
            for (int var47 = arg1 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg9; var48++) {
                    if (var48 <= var47 << 1) {
                        arg10[var11] = arg5;
                    } else if (arg0) {
                        arg10[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg3 == 2) {
            for (int var49 = 0; var49 < arg1; var49++) {
                for (int var50 = 0; var50 < arg9; var50++) {
                    if (var50 >= var49 >> 1) {
                        arg10[var11] = arg5;
                    } else if (arg0) {
                        arg10[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg3 == 3) {
            for (int var51 = 0; var51 < arg1; var51++) {
                for (int var52 = arg9 - 1; var52 >= 0; var52--) {
                    if (var52 <= var51 << 1) {
                        arg10[var11] = arg5;
                    } else if (arg0) {
                        arg10[var11] = arg2;
                    }
                    var11++;
                }
                var11 += var12;
            }
        }
    }
}
