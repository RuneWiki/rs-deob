import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class29 extends class89 {

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    private int field563 = 1;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    private int field576 = 1;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "Z")
    public static boolean field572 = false;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "[J")
    public static long[] field562 = new long[100];

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "[I")
    public static int[] field568 = new int[2000];

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "Lwf;")
    public static class16 field575 = new class16(4);

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "Lpi;")
    public static class181 field561;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
    public static final void method200(int arg0) {
        ++field571;
        class146.field2638.method84(arg0 ^ -32380);
        class184.field3293.method84(-32377);
        class217.field3837.method84(-32377);
        if (arg0 != 3) {
            method200(-61);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1683 = arg0.method558(1) == 1;
                }
            } else {
                this.field576 = arg0.method558(1);
            }
        } else {
            this.field563 = arg0.method558(1);
        }
        ++field569;
        if (arg1 != -641641492) {
            field568 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static void method201(int arg0) {
        field562 = null;
        if (arg0 == 1442470928) {
            field561 = null;
            field568 = null;
            field575 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)I")
    public static final int method202(int arg0) {
        ++field566;
        if ((double) class83.field1602 == 3.0D) {
            return 37;
        } else if ((double) class83.field1602 == 4.0D) {
            return 50;
        } else {
            if (arg0 != -894161872) {
                method203(47, 125, 97, (int[]) null, false, 86, -75, -52, 60, -114, -60);
            }
            return (double) class83.field1602 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class29() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III[IZIIIIII)V")
    public static final void method203(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field573;
        int var11 = arg8;
        if (~class262.field4563 < ~arg8) {
            int var12 = 91 / ((66 - arg10) / 60);
            if (~arg8 > ~class262.field4559) {
                var11 = class262.field4559;
            }
            int var13 = arg6 + arg8;
            if (class262.field4559 < var13) {
                if (class262.field4563 < var13) {
                    var13 = class262.field4563;
                }
                int var14 = arg5;
                if (~arg5 > ~class262.field4565) {
                    if (arg5 < class262.field4562) {
                        var14 = class262.field4562;
                    }
                    int var15 = arg5 - -arg7;
                    if (var15 > class262.field4562) {
                        if (var15 > class262.field4565) {
                            var15 = class262.field4565;
                        }
                        if (~arg9 == -10) {
                            arg9 = 1;
                            arg0 = arg0 + 1 & 3;
                        }
                        if (~arg9 == -11) {
                            arg0 = 3 & arg0 + 3;
                            arg9 = 1;
                        }
                        int var16 = class262.field4561 * var14 + var11;
                        int var17 = var15 - arg5;
                        if (arg9 == 11) {
                            arg0 = arg0 - -3 & 3;
                            arg9 = 8;
                        }
                        int var18 = var14 - arg5;
                        int var19 = class262.field4561 + var11 + -var13;
                        int var20 = var11 - arg8;
                        int var21 = var13 - arg8;
                        int var22 = -var21 + arg6;
                        int var23 = -var20 + arg6;
                        int var24 = -var18 + arg7;
                        int var25 = -var17 + arg7;
                        if (arg9 == 1) {
                            if (~arg0 == -1) {
                                for (int var26 = var18; var26 < var17; ++var26) {
                                    for (int var27 = var20; var27 < var21; ++var27) {
                                        if (~var26 > ~var27) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -2) {
                                for (int var28 = var24 + -1; ~var28 <= ~var25; --var28) {
                                    for (int var29 = var20; var29 < var21; ++var29) {
                                        if (~var28 > ~var29) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 2) {
                                for (int var30 = var18; ~var30 > ~var17; ++var30) {
                                    for (int var31 = var20; ~var21 < ~var31; ++var31) {
                                        if (~var30 >= ~var31) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 3) {
                                for (int var32 = var24 + -1; var25 <= var32; --var32) {
                                    for (int var33 = var20; ~var33 > ~var21; ++var33) {
                                        if (var32 <= var33) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            }
                        } else if (~arg9 == -3) {
                            if (arg0 == 0) {
                                for (int var34 = var24 + -1; var25 <= var34; --var34) {
                                    for (int var35 = var20; ~var35 > ~var21; ++var35) {
                                        if (~(var34 >> 1) > ~var35) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -2) {
                                for (int var36 = var18; ~var17 < ~var36; ++var36) {
                                    for (int var37 = var20; var37 < var21; ++var37) {
                                        if (var16 >= 0 && var16 < arg3.length) {
                                            if (~(var36 << 1) >= ~var37) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        } else {
                                            ++var16;
                                        }
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -3) {
                                for (int var38 = var18; ~var38 > ~var17; ++var38) {
                                    for (int var39 = var23 + -1; var22 <= var39; --var39) {
                                        if (~var39 < ~(var38 >> 1)) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 3) {
                                for (int var40 = var24 + -1; ~var40 <= ~var25; --var40) {
                                    for (int var41 = var23 + -1; var22 <= var41; --var41) {
                                        if (~var41 <= ~(var40 << 1)) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            }
                        } else if (arg9 == 3) {
                            if (arg0 == 0) {
                                for (int var42 = var24 + -1; var25 <= var42; --var42) {
                                    for (int var43 = var23 + -1; var43 >= var22; --var43) {
                                        if (var43 <= var42 >> 1) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 1) {
                                for (int var44 = var24 + -1; ~var25 >= ~var44; --var44) {
                                    for (int var45 = var20; ~var21 < ~var45; ++var45) {
                                        if (~var45 <= ~(var44 << 1)) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -3) {
                                for (int var46 = var18; ~var46 > ~var17; ++var46) {
                                    for (int var47 = var20; ~var47 > ~var21; ++var47) {
                                        if (~var47 < ~(var46 >> 1)) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -4) {
                                for (int var48 = var18; var48 < var17; ++var48) {
                                    for (int var49 = var23 - 1; ~var49 <= ~var22; --var49) {
                                        if (var49 < var48 << 1) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            }
                        } else if (~arg9 == -5) {
                            if (~arg0 == -1) {
                                for (int var50 = var24 + -1; ~var25 >= ~var50; --var50) {
                                    for (int var51 = var20; ~var51 > ~var21; ++var51) {
                                        if (~(var50 >> 1) < ~var51) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -2) {
                                for (int var52 = var18; ~var17 < ~var52; ++var52) {
                                    for (int var53 = var20; var53 < var21; ++var53) {
                                        if (var52 << 1 >= var53) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 2) {
                                for (int var54 = var18; ~var17 < ~var54; ++var54) {
                                    for (int var55 = var23 + -1; var55 >= var22; --var55) {
                                        if (var55 >= var54 >> 1) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 3) {
                                for (int var56 = var24 + -1; ~var56 <= ~var25; --var56) {
                                    for (int var57 = var23 - 1; ~var57 <= ~var22; --var57) {
                                        if (var56 << 1 < var57) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            }
                        } else if (arg9 == 5) {
                            if (arg0 == 0) {
                                for (int var58 = var24 - 1; var58 >= var25; --var58) {
                                    for (int var59 = var23 + -1; var22 <= var59; --var59) {
                                        if (~(var58 >> 1) >= ~var59) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (~arg0 == -2) {
                                for (int var60 = var24 + -1; ~var25 >= ~var60; --var60) {
                                    for (int var61 = var20; ~var61 > ~var21; ++var61) {
                                        if (~var61 >= ~(var60 << 1)) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 2) {
                                for (int var62 = var18; var62 < var17; ++var62) {
                                    for (int var63 = var20; ~var63 > ~var21; ++var63) {
                                        if (~var63 > ~(var62 >> 1)) {
                                            if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                        } else {
                                            arg3[var16] = arg1;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            } else if (arg0 == 3) {
                                for (int var64 = var18; ~var64 > ~var17; ++var64) {
                                    for (int var65 = var23 - 1; ~var22 >= ~var65; --var65) {
                                        if (var65 <= var64 << 1) {
                                            arg3[var16] = arg1;
                                        } else if (arg4) {
                                            arg3[var16] = arg2;
                                        }
                                        ++var16;
                                    }
                                    var16 += var19;
                                }
                            }
                        } else {
                            if (arg9 == 6) {
                                if (~arg0 == -1) {
                                    for (int var66 = var18; var17 > var66; ++var66) {
                                        for (int var67 = var20; ~var21 < ~var67; ++var67) {
                                            if (arg6 / 2 < var67) {
                                                if (arg4) {
                                                    arg3[var16] = arg2;
                                                }
                                            } else {
                                                arg3[var16] = arg1;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (~arg0 == -2) {
                                    for (int var68 = var18; ~var68 > ~var17; ++var68) {
                                        for (int var69 = var20; var21 > var69; ++var69) {
                                            if (~var68 >= ~(arg7 / 2)) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (~arg0 == -3) {
                                    for (int var70 = var18; var70 < var17; ++var70) {
                                        for (int var71 = var20; ~var71 > ~var21; ++var71) {
                                            if (~var71 <= ~(arg6 / 2)) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (arg0 == 3) {
                                    for (int var72 = var18; ~var72 > ~var17; ++var72) {
                                        for (int var73 = var20; var73 < var21; ++var73) {
                                            if (~var72 > ~(arg7 / 2)) {
                                                if (arg4) {
                                                    arg3[var16] = arg2;
                                                }
                                            } else {
                                                arg3[var16] = arg1;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                            }
                            if (~arg9 == -8) {
                                if (~arg0 == -1) {
                                    for (int var74 = var18; var17 > var74; ++var74) {
                                        for (int var75 = var20; var21 > var75; ++var75) {
                                            if (~(-(arg7 / 2) + var74) > ~var75) {
                                                if (arg4) {
                                                    arg3[var16] = arg2;
                                                }
                                            } else {
                                                arg3[var16] = arg1;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (arg0 == 1) {
                                    for (int var76 = var24 + -1; var76 >= var25; --var76) {
                                        for (int var77 = var20; var21 > var77; ++var77) {
                                            if (var76 - arg7 / 2 >= var77) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (arg0 == 2) {
                                    for (int var78 = var24 - 1; ~var78 <= ~var25; --var78) {
                                        for (int var79 = var23 + -1; ~var22 >= ~var79; --var79) {
                                            if (-(arg7 / 2) + var78 >= var79) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (~arg0 == -4) {
                                    for (int var80 = var18; ~var80 > ~var17; ++var80) {
                                        for (int var81 = var23 + -1; ~var22 >= ~var81; --var81) {
                                            if (var81 > -(arg7 / 2) + var80) {
                                                if (arg4) {
                                                    arg3[var16] = arg2;
                                                }
                                            } else {
                                                arg3[var16] = arg1;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                            }
                            if (arg9 == 8) {
                                if (arg0 == 0) {
                                    for (int var82 = var18; ~var17 < ~var82; ++var82) {
                                        for (int var83 = var20; var83 < var21; ++var83) {
                                            if (var82 - arg7 / 2 > var83) {
                                                if (arg4) {
                                                    arg3[var16] = arg2;
                                                }
                                            } else {
                                                arg3[var16] = arg1;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (~arg0 == -2) {
                                    for (int var84 = var24 + -1; ~var25 >= ~var84; --var84) {
                                        for (int var85 = var20; ~var21 < ~var85; ++var85) {
                                            if (var85 < -(arg7 / 2) + var84) {
                                                if (arg4) {
                                                    arg3[var16] = arg2;
                                                }
                                            } else {
                                                arg3[var16] = arg1;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (arg0 == 2) {
                                    for (int var86 = var24 + -1; ~var25 >= ~var86; --var86) {
                                        for (int var87 = var23 + -1; var87 >= var22; --var87) {
                                            if (var87 >= var86 - arg7 / 2) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                                if (arg0 == 3) {
                                    for (int var88 = var18; var17 > var88; ++var88) {
                                        for (int var89 = var23 + -1; var22 <= var89; --var89) {
                                            if (~(var88 - arg7 / 2) >= ~var89) {
                                                arg3[var16] = arg1;
                                            } else if (arg4) {
                                                arg3[var16] = arg2;
                                            }
                                            ++var16;
                                        }
                                        var16 += var19;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = 49 / ((arg1 - 51) / 44);
        ++field564;
        if (super.field1688.field2200) {
            int var5 = this.field576 - -this.field576 - -1;
            int var6 = this.field563 - -this.field563 + 1;
            int var7 = 65536 / var5;
            int var8 = 65536 / var6;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field576; this.field576 + arg0 >= var10; ++var10) {
                int var14 = 0;
                int[] var15 = this.method685(-78, class231.field4015 & var10, 0);
                int[] var16 = new int[class241.field4284];
                for (int var17 = -this.field563; ~this.field563 <= ~var17; ++var17) {
                    var14 += var15[var17 & class115.field2177];
                }
                int var18 = 0;
                while (class241.field4284 > var18) {
                    var16[var18] = var8 * var14 >> 16;
                    int var19 = var14 - var15[-this.field563 + var18 & class115.field2177];
                    ++var18;
                    var14 = var15[class115.field2177 & this.field563 + var18] + var19;
                }
                var9[this.field576 - arg0 + var10] = var16;
            }
            for (int var11 = 0; var11 < class241.field4284; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var5 > var13; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var7 * var12 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field570;
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int var4 = this.field576 + this.field576 - -1;
            int var5 = this.field563 - -this.field563 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field576 + arg0; ~(this.field576 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method689((byte) 95, 0, var9 & class231.field4015);
                int[][] var20 = new int[3][class241.field4284];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[0];
                int[] var24 = var19[1];
                int[] var25 = var19[2];
                int var26 = 0;
                for (int var27 = -this.field563; ~var27 >= ~this.field563; ++var27) {
                    int var37 = class115.field2177 & var27;
                    var21 += var25[var37];
                    var26 += var24[var37];
                    var22 += var23[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class241.field4284) {
                    var28[var31] = var7 * var22 >> 16;
                    var29[var31] = var7 * var26 >> 16;
                    var30[var31] = var7 * var21 >> 16;
                    int var32 = -this.field563 + var31 & class115.field2177;
                    ++var31;
                    int var33 = var26 - var24[var32];
                    int var34 = var21 - var25[var32];
                    int var35 = var22 - var23[var32];
                    int var36 = this.field563 + var31 & class115.field2177;
                    var26 = var24[var36] + var33;
                    var21 = var25[var36] + var34;
                    var22 = var23[var36] + var35;
                }
                var8[-arg0 + var9 + this.field576] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class241.field4284; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var15 >> 16;
                var12[var13] = var6 * var16 >> 16;
            }
        }
        if (arg1 != 25) {
            method201(22);
        }
        return var3;
    }
}
