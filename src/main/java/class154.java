import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class154 extends class92 {

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field2317 = -1;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2307 = 0;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field2310 = -1;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Lpf;")
    public static class294 field2312;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)[Ldi;")
    public static final class179[] method934(boolean arg0) {
        ++field2320;
        class179[] var1 = new class179[class215.field3224];
        for (int var2 = 0; ~var2 > ~class215.field3224; ++var2) {
            var1[var2] = new class179(class162.field2494, class256.field3915, class10.field139[var2], class273.field4104[var2], class220.field3315[var2], class82.field1312[var2], class10.field129[var2], class183.field2775);
        }
        class82.method537(0);
        if (!arg0) {
            field2317 = -73;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)V")
    public final void method49(int arg0, int arg1, boolean arg2) {
        int var4 = this.field2324 * arg1 >> 12;
        int var5 = this.field2322 * arg1 >> 12;
        int var6 = this.field2319 * arg0 >> 12;
        ++field2314;
        int var7 = this.field2306 * arg0 >> 12;
        class146.method891(var6, var5, var7, -1, super.field1454, var4);
        if (!arg2) {
            field2312 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
    public static final void method935(int arg0, int arg1) {
        class139.field2039.method1780(arg1, true);
        if (arg0 != -9566) {
            method934(false);
        }
        ++field2321;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V")
    public final void method45(int arg0, byte arg1, int arg2) {
        if (arg1 == 124) {
            ++field2313;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Ljava/lang/Object;I[IZ)V")
    public static final void method936(int arg0, Object[] arg1, int arg2, int[] arg3, boolean arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; ++var9) {
                if (~((var9 & 1) + var7) < ~arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method936(arg0, arg1, var6 + -1, arg3, true);
            method936(var6 - -1, arg1, arg2, arg3, arg4);
        }
        if (!arg4) {
            field2311 = 20;
        }
        ++field2308;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        ++field2315;
        if (arg2 != -7368) {
            method937(-78);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIII)V")
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2306 = arg3;
        this.field2324 = arg0;
        this.field2322 = arg2;
        this.field2319 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public static void method937(int arg0) {
        if (arg0 != 73820720) {
            field2325 = 33;
        }
        field2312 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = -arg0 + arg9;
        ++field2323;
        int var12 = arg5 - arg7;
        if (arg3 == 5334) {
            if (~arg9 > ~class106.field1616) {
                ++var11;
            }
            if (class99.field1564 > arg5) {
                ++var12;
            }
            int var10000;
            for (int var13 = 0; var13 < var11; ++var13) {
                int var41 = arg6 - -((var13 + 1) * arg2) >> 16;
                int var42 = arg6 - -(arg2 * var13) >> 16;
                int var43 = -var42 + var41;
                if (~var43 < -1) {
                    int var44 = arg0 + var13 >> 6;
                    if (~var44 <= -1 && var44 <= class296.field4687.length - 1) {
                        int var45 = arg1 + var41;
                        byte[][] var46 = class100.field1584[var44];
                        int var47 = arg1 + var42;
                        int[][] var48 = class296.field4687[var44];
                        byte[][] var49 = class97.field1532[var44];
                        byte[][] var50 = class187.field2838[var44];
                        byte[][] var51 = class239.field3600[var44];
                        byte[][] var52 = class171.field2593[var44];
                        for (int var53 = 0; var53 < var12; ++var53) {
                            int var54 = arg4 * var53 + arg8 >> 16;
                            int var55 = arg8 - -((var53 + 1) * arg4) >> 16;
                            int var56 = var55 - var54;
                            if (var56 > 0) {
                                int var57 = arg10 + var55;
                                int var58 = arg10 + var54;
                                int var59 = var13 - -arg0 & 63;
                                int var60 = var53 - -arg7 >> 6;
                                int var61 = 63 & arg7 + var53;
                                int var62 = (var61 << 6) + var59;
                                int var63;
                                if (~var60 <= -1 && var60 <= var48.length + -1 && var48[var60] != null) {
                                    var63 = var48[var60][var62];
                                } else {
                                    if (~class39.field524.field2674 != 0) {
                                        var63 = class39.field524.field2674;
                                    } else if (~(4 & var13 - -arg0) == ~(arg7 + var53 & 4)) {
                                        var63 = class290.field4579[class256.field3899 + 1];
                                    } else {
                                        var63 = 4936552;
                                    }
                                    if (var60 < 0 || var48.length + -1 < var60) {
                                        if (var63 == 0) {
                                            var63 = 1;
                                        }
                                        class111.method702(var47, var58, var43, var56, var63);
                                        continue;
                                    }
                                }
                                if (~var63 == -1) {
                                    var63 = 1;
                                }
                                int var64 = var46[var60] != null ? class290.field4579[var46[var60][var62] & 255] : 0;
                                int var65 = var51[var60] != null ? class290.field4579[255 & var51[var60][var62]] : 0;
                                if (~var64 == -1 && var65 == 0) {
                                    class111.method702(var47, var58, var43, var56, var63);
                                } else {
                                    if (~var64 != -1) {
                                        if (var64 == -1) {
                                            var64 = 1;
                                        }
                                        byte var66 = var50[var60] != null ? var50[var60][var62] : 0;
                                        int var67 = var66 & 252;
                                        if (var67 != 0 && var43 > 1 && ~var56 < -2) {
                                            class194.method1214(var47, true, var43, var64, var56, 3 & var66, var67 >> 2, var58, arg3 + -5459, class111.field1716, var63);
                                        } else {
                                            class111.method702(var47, var58, var43, var56, var64);
                                        }
                                    }
                                    if (~var65 != -1) {
                                        if (var65 == -1) {
                                            var65 = var63;
                                        }
                                        byte var68 = var49[var60][var62];
                                        int var69 = var68 & 252;
                                        if (var69 == 0 || ~var43 >= -2 || ~var56 >= -2) {
                                            class111.method702(var47, var58, var43, var56, var65);
                                        }
                                        class194.method1214(var47, ~var64 == -1, var43, var65, var56, 3 & var68, var69 >> 2, var58, -127, class111.field1716, 0);
                                    }
                                }
                                if (var52[var60] != null) {
                                    int var70 = var52[var60][var62] & 255;
                                    if (~var70 != -1) {
                                        int var71;
                                        if (var43 == 1) {
                                            var71 = var47;
                                        } else {
                                            var71 = var45 + -1;
                                        }
                                        int var72;
                                        if (~var56 != -2) {
                                            var72 = var57 + -1;
                                        } else {
                                            var72 = var58;
                                        }
                                        int var73 = 13421772;
                                        if (~var70 <= -6 && ~var70 >= -9 || ~var70 <= -14 && var70 <= 16 || ~var70 <= -22 && ~var70 >= -25 || var70 == 27 || var70 == 28) {
                                            var73 = 13369344;
                                            var70 -= 4;
                                        }
                                        if (~var70 == -2) {
                                            class111.method704(var47, var58, var56, var73);
                                        } else if (~var70 != -3) {
                                            if (~var70 == -4) {
                                                class111.method704(var71, var58, var56, var73);
                                            } else if (var70 == 4) {
                                                class111.method713(var47, var72, var43, var73);
                                            } else if (var70 == 9) {
                                                class111.method704(var47, var58, var56, 16777215);
                                                class111.method713(var47, var58, var43, var73);
                                            } else if (~var70 != -11) {
                                                if (~var70 != -12) {
                                                    if (var70 != 12) {
                                                        if (var70 == 17) {
                                                            class111.method713(var47, var58, 1, var73);
                                                        } else if (var70 != 18) {
                                                            if (var70 == 19) {
                                                                class111.method713(var71, var72, 1, var73);
                                                            } else if (var70 != 20) {
                                                                if (~var70 != -26) {
                                                                    if (var70 == 26) {
                                                                        for (int var74 = 0; var74 < var56; ++var74) {
                                                                            class111.method713(var47 + var74, var58 + var74, 1, var73);
                                                                        }
                                                                    }
                                                                } else {
                                                                    for (int var75 = 0; ~var56 < ~var75; ++var75) {
                                                                        class111.method713(var47 - -var75, -var75 + var72, 1, var73);
                                                                    }
                                                                }
                                                            } else {
                                                                class111.method713(var47, var72, 1, var73);
                                                            }
                                                        } else {
                                                            class111.method713(var71, var58, 1, var73);
                                                        }
                                                    } else {
                                                        class111.method704(var47, var58, var56, 16777215);
                                                        class111.method713(var47, var72, var43, var73);
                                                    }
                                                } else {
                                                    class111.method704(var71, var58, var56, 16777215);
                                                    class111.method713(var47, var72, var43, var73);
                                                }
                                            } else {
                                                class111.method704(var71, var58, var56, 16777215);
                                                class111.method713(var47, var58, var43, var73);
                                            }
                                        } else {
                                            class111.method713(var47, var58, var43, var73);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var76 = arg1 + var42;
                        var10000 = arg1 + var41;
                        for (int var78 = 0; var78 < var12; ++var78) {
                            int var79;
                            if (class39.field524.field2674 != -1) {
                                var79 = class39.field524.field2674;
                            } else if (~(arg0 + var13 & 4) == ~(4 & arg7 + var78)) {
                                var79 = class290.field4579[class256.field3899 + 1];
                            } else {
                                var79 = 4936552;
                            }
                            int var80 = ((var78 + 1) * arg4 + arg8 >> 16) + arg10;
                            if (var79 == 0) {
                                var79 = 1;
                            }
                            int var81 = (arg8 - -(arg4 * var78) >> 16) + arg10;
                            int var82 = var80 - var81;
                            class111.method702(var76, var81, var43, var82, var79);
                        }
                    }
                }
            }
            for (int var14 = -2; ~var14 > ~(var11 - -2); ++var14) {
                int var15 = (var14 + 1) * arg2 + arg6 >> 16;
                int var16 = arg2 * var14 + arg6 >> 16;
                int var17 = -var16 + var15;
                if (var17 > 0) {
                    int var18 = arg1 + var16;
                    var10000 = arg1 + var15;
                    int var20 = arg0 + var14 >> 6;
                    if (var20 >= 0 && class76.field1223.length + -1 >= var20) {
                        int[][] var21 = class76.field1223[var20];
                        for (int var22 = -2; ~var22 > ~(var12 - -2); ++var22) {
                            int var23 = arg4 * var22 + arg8 >> 16;
                            int var24 = (var22 + 1) * arg4 + arg8 >> 16;
                            int var25 = -var23 + var24;
                            if (~var25 < -1) {
                                var10000 = arg10 + var24;
                                int var27 = arg7 + var22 >> 6;
                                int var28 = arg10 + var23;
                                if (~var27 <= -1 && ~var27 >= ~(var21.length - 1)) {
                                    int var29 = ((arg7 + var22 & 63) << 6) + (arg0 + var14 & 63);
                                    if (var21[var27] != null) {
                                        int var30 = var21[var27][var29];
                                        int var31 = 8191 & var30;
                                        if (~var31 != -1) {
                                            class140 var32 = class285.method1876(-10076, var31 + -1);
                                            int var33 = var30 >> 13 & 3;
                                            boolean var34 = ~((64627 & var30) >> 15) == -2;
                                            class179 var35 = var32.method861(var34, var33, (byte) -42);
                                            if (var35 != null) {
                                                int var36 = var35.field3887 * var17 / 4;
                                                int var37 = var35.field3876 * var25 / 4;
                                                if (var32.field2052) {
                                                    int var38 = (1033757 & var30) >> 16;
                                                    int var39 = (16090941 & var30) >> 20;
                                                    if (~(1 & var33) == -2) {
                                                        int var40 = var38;
                                                        var38 = var39;
                                                        var39 = var40;
                                                    }
                                                    var36 = var17 * var38;
                                                    var37 = var25 * var39;
                                                }
                                                if (~var36 != -1 && var37 != 0) {
                                                    if (~var32.field2049 != -1) {
                                                        var35.method1114(var18, -var37 + var28 + var25, var36, var37, var32.field2049);
                                                    } else {
                                                        var35.method1122(var18, -var37 + var28 - -var25, var36, var37);
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
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)J")
    public static final long method939(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        return var3 != null && var3.field4084 != null ? var3.field4084.field2496 : 0L;
    }
}
