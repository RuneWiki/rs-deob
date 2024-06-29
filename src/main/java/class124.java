import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class124 extends class12 {

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lkh;")
    private static class117 field2317 = class224.method1450((byte) -58, ")4slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Lkh;")
    private static class117 field2320 = class224.method1450((byte) -122, "Error loading your profile)3");

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Lkh;")
    private static class117 field2331 = class224.method1450((byte) 106, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lkh;")
    public static class117 field2329 = field2331;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "S")
    public static short field2318 = 205;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lkh;")
    public static class117 field2330 = field2320;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Ltc;")
    public class211 field2312;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lwf;")
    public class245 field2308;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lwf;")
    public class245 field2322;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "[I")
    public int[] field2323;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method859(int arg0) {
        field2320 = null;
        field2330 = null;
        field2331 = null;
        field2317 = null;
        if (arg0 != 28315) {
            method859(-115);
        }
        field2329 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILah;IIIIZ)V")
    public static final void method860(int arg0, int arg1, class9 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2307++;
        if (class127.field2346) {
            class202.field3657 = 32;
        } else {
            class202.field3657 = 0;
        }
        class127.field2346 = arg7;
        if (class30.field719 != 0) {
            if (arg4 >= arg5 && arg5 + 16 > arg4 && arg3 <= arg0 && arg3 + 16 > arg0) {
                arg2.field247 -= 4;
                class62.method457(arg2, 0);
            } else if (arg4 >= arg5 && arg5 + 16 > arg4 && arg0 >= arg3 + arg6 - 16 && arg3 + arg6 > arg0) {
                arg2.field247 += 4;
                class62.method457(arg2, 0);
            } else if (arg4 >= arg5 - class202.field3657 && class202.field3657 + arg5 + 16 > arg4 && arg3 + 16 <= arg0 && arg0 < arg3 + arg6 - 16) {
                int var8 = (arg6 - 32) * arg6 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - arg3 - var8 / 2 - 16;
                int var10 = arg6 - var8 - 32;
                arg2.field247 = (arg1 - arg6) * var9 / var10;
                class62.method457(arg2, 0);
                class127.field2346 = true;
            }
        }
        if (class195.field3485 == 0) {
            return;
        }
        int var11 = arg2.field256;
        if (arg4 >= arg5 - var11 && arg3 <= arg0 && arg4 < arg5 + 16 && arg3 + arg6 >= arg0) {
            arg2.field247 += class195.field3485 * 45;
            class62.method457(arg2, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static final void method861(int arg0) {
        if (arg0 == -1) {
            if (class229.field4122 != null) {
                class229.field4122.method748((byte) -84);
            }
            field2309++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZII[IBIIII)V")
    public static final void method862(int arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg0 = 1;
        }
        if (class83.field1562 > arg7) {
            arg4 -= class83.field1562 - arg7;
            arg7 = class83.field1562;
        }
        if (class83.field1566 > arg10) {
            arg3 -= class83.field1566 - arg10;
            arg10 = class83.field1566;
        }
        if (arg10 + arg3 > class83.field1563) {
            arg3 = class83.field1563 - arg10;
        }
        if (arg0 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg0 = 1;
        }
        if (arg0 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg0 = 8;
        }
        field2310++;
        int var11 = class83.field1565 * arg10 + arg7;
        if (arg6 != 61) {
            method861(-41);
        }
        if (class83.field1564 < arg4 + arg7) {
            arg4 = class83.field1564 - arg7;
        }
        int var12 = class83.field1565 - arg4;
        if (arg0 == 1) {
            if (arg8 == 0) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < arg4; var14++) {
                        if (var14 <= var13) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 1) {
                for (int var15 = arg3 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg4; var16++) {
                        if (var16 <= var15) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 2) {
                for (int var17 = 0; var17 < arg3; var17++) {
                    for (int var18 = 0; var18 < arg4; var18++) {
                        if (var18 >= var17) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 3) {
                for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg4; var20++) {
                        if (var19 <= var20) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg0 == 2) {
            if (arg8 == 0) {
                for (int var21 = arg3 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg4; var22++) {
                        if (var22 <= var21 >> 1) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 1) {
                for (int var23 = 0; var23 < arg3; var23++) {
                    for (int var24 = 0; var24 < arg4; var24++) {
                        if (var24 >= var23 << 1) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 2) {
                for (int var25 = 0; var25 < arg3; var25++) {
                    for (int var26 = arg4 - 1; var26 >= 0; var26--) {
                        if (var25 >> 1 >= var26) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 3) {
                for (int var27 = arg3 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg4 - 1; var28 >= 0; var28--) {
                        if (var27 << 1 <= var28) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg0 == 3) {
            if (arg8 == 0) {
                for (int var29 = arg3 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg4 - 1; var30 >= 0; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 1) {
                for (int var31 = arg3 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg4; var32++) {
                        if (var32 >= var31 << 1) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 2) {
                for (int var33 = 0; var33 < arg3; var33++) {
                    for (int var34 = 0; var34 < arg4; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 3) {
                for (int var35 = 0; var35 < arg3; var35++) {
                    for (int var36 = arg4 - 1; var36 >= 0; var36--) {
                        if (var36 >= var35 << 1) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg0 == 4) {
            if (arg8 == 0) {
                for (int var37 = arg3 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg4; var38++) {
                        if (var37 >> 1 <= var38) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 1) {
                for (int var39 = 0; var39 < arg3; var39++) {
                    for (int var40 = 0; var40 < arg4; var40++) {
                        if (var39 << 1 >= var40) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 2) {
                for (int var41 = 0; var41 < arg3; var41++) {
                    for (int var42 = arg4 - 1; var42 >= 0; var42--) {
                        if (var41 >> 1 <= var42) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg8 == 3) {
                for (int var43 = arg3 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg4 - 1; var44 >= 0; var44--) {
                        if (var44 <= var43 << 1) {
                            arg5[var11] = arg9;
                        } else if (arg2) {
                            arg5[var11] = arg1;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg8 == 0) {
                    for (int var53 = 0; var53 < arg3; var53++) {
                        for (int var54 = 0; var54 < arg4; var54++) {
                            if (var54 <= arg4 / 2) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var55 = 0; var55 < arg3; var55++) {
                        for (int var56 = 0; var56 < arg4; var56++) {
                            if (var55 <= arg3 / 2) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var57 = 0; var57 < arg3; var57++) {
                        for (int var58 = 0; var58 < arg4; var58++) {
                            if (arg4 / 2 <= var58) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var59 = 0; var59 < arg3; var59++) {
                        for (int var60 = 0; var60 < arg4; var60++) {
                            if (var59 >= arg3 / 2) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg8 == 0) {
                    for (int var61 = 0; var61 < arg3; var61++) {
                        for (int var62 = 0; var62 < arg4; var62++) {
                            if (var61 - arg3 / 2 >= var62) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var63 = arg3 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg4; var64++) {
                            if (var64 <= var63 - arg3 / 2) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var65 = arg3 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg4 - 1; var66 >= 0; var66--) {
                            if (var66 <= var65 - arg3 / 2) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var67 = 0; var67 < arg3; var67++) {
                        for (int var68 = arg4 - 1; var68 >= 0; var68--) {
                            if (var67 - arg3 / 2 >= var68) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg8 == 0) {
                    for (int var69 = 0; var69 < arg3; var69++) {
                        for (int var70 = 0; var70 < arg4; var70++) {
                            if (var69 - arg3 / 2 <= var70) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var71 = arg3 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg4; var72++) {
                            if (var71 - arg3 / 2 <= var72) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var73 = arg3 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg4 - 1; var74 >= 0; var74--) {
                            if (var73 - arg3 / 2 <= var74) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var75 = 0; var75 < arg3; var75++) {
                        for (int var76 = arg4 - 1; var76 >= 0; var76--) {
                            if (var75 - arg3 / 2 <= var76) {
                                arg5[var11] = arg9;
                            } else if (arg2) {
                                arg5[var11] = arg1;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var45 = arg3 - 1; var45 >= 0; var45--) {
                for (int var46 = arg4 - 1; var46 >= 0; var46--) {
                    if (var45 >> 1 <= var46) {
                        arg5[var11] = arg9;
                    } else if (arg2) {
                        arg5[var11] = arg1;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg8 == 1) {
            for (int var47 = arg3 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg4; var48++) {
                    if (var47 << 1 >= var48) {
                        arg5[var11] = arg9;
                    } else if (arg2) {
                        arg5[var11] = arg1;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg8 == 2) {
            for (int var49 = 0; var49 < arg3; var49++) {
                for (int var50 = 0; var50 < arg4; var50++) {
                    if (var50 >= var49 >> 1) {
                        arg5[var11] = arg9;
                    } else if (arg2) {
                        arg5[var11] = arg1;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg8 == 3) {
            for (int var51 = 0; var51 < arg3; var51++) {
                for (int var52 = arg4 - 1; var52 >= 0; var52--) {
                    if (var52 <= var51 << 1) {
                        arg5[var11] = arg9;
                    } else if (arg2) {
                        arg5[var11] = arg1;
                    }
                    var11++;
                }
                var11 += var12;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public final void method863(int arg0) {
        field2311++;
        int var2 = this.field2333;
        class211 var3 = this.field2312.method1378((byte) 91);
        if (var3 == null) {
            this.field2328 = 0;
            this.field2323 = null;
            this.field2319 = 0;
            this.field2325 = 0;
            this.field2333 = -1;
        } else {
            this.field2325 = var3.field3777;
            this.field2328 = var3.field3780;
            this.field2333 = var3.field3796;
            this.field2323 = var3.field3786;
            this.field2319 = var3.field3831 * 128;
        }
        if (this.field2333 != var2 && this.field2308 != null) {
            class187.field3351.method1528(this.field2308);
            this.field2308 = null;
        }
        if (arg0 != 0) {
            this.method863(63);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILkh;)Z")
    public static final boolean method864(int arg0, class117 arg1) {
        field2316++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 8 / ((arg0 + 55) / 54);
        for (int var3 = 0; var3 < class85.field1613; var3++) {
            if (arg1.method789(class9.field230[var3], -91)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    public static final void method865(int arg0) {
        field2313++;
        try {
            if (arg0 == 1875) {
                if (class66.field1277 == null) {
                    class66.field1277 = new class37(class130.field2397, class36.method316((byte) -34, new class117[] { class17.field504, class42.method358(class233.field4193, (byte) 34), field2317 }).method823(-2));
                } else {
                    byte[] var1 = class66.field1277.method330((byte) -118);
                    if (var1 != null) {
                        class145 var2 = new class145(var1);
                        class98.field1804 = var2.method1049((byte) 111);
                        class202.field3655 = new class128[class98.field1804];
                        for (int var3 = 0; var3 < class98.field1804; var3++) {
                            class128 var4 = class202.field3655[var3] = new class128();
                            int var5 = var2.method1049((byte) 113);
                            var4.field2363 = (var5 & 0x8000) != 0;
                            var4.field2378 = var5 & 0x7FFF;
                            var4.field2377 = var2.method1038(60);
                            var4.field2364 = var2.method1035(arg0 ^ 0xFFFFF8DE);
                            var4.field2366 = var3;
                            var4.field2370 = class45.method371(var2.method1049((byte) 116), (byte) 107);
                        }
                        class57.method437(class202.field3655, class202.field3655.length - 1, 0, (byte) 40);
                        class66.field1277 = null;
                        class45.field987 = true;
                    }
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class66.field1277 = null;
        }
    }
}
