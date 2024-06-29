import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class128 extends class115 {

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field1878 = 0;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    private int field1875 = 0;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    private int field1880 = 20;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    private int field1879 = 1365;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Lh;")
    public static class190 field1874 = new class190(8);

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "[I")
    public static int[] field1882 = new int[2];

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Lve;")
    public static class233 field1884;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[I")
    public static int[] field1883;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class128() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1872;
        if (arg0 != 242152972) {
            field1884 = null;
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            for (int var4 = 0; ~var4 > ~class77.field1178; ++var4) {
                int var5 = (class169.field2444[var4] << 12) / this.field1879 - -this.field1875;
                int var6 = (class187.field2664[arg1] << 12) / this.field1879 + this.field1878;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                for (int var13 = var5 * var5 >> 12; var11 + var13 < 16384 && var12 < this.field1880; var13 = var9 * var9 >> 12) {
                    ++var12;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var13 - var11 + var7;
                    var11 = var10 * var10 >> 12;
                }
                var3[var4] = var12 >= this.field1880 + -1 ? 0 : (var12 << 12) / this.field1880;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIIIZIII[II)V")
    public static final void method889(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        ++field1881;
        int var11 = arg3;
        if (~class144.field2064 < ~arg3) {
            if (~class144.field2066 < ~arg3) {
                var11 = class144.field2066;
            }
            int var12 = arg3 + arg6;
            if (~var12 < ~class144.field2066) {
                if (~var12 < ~class144.field2064) {
                    var12 = class144.field2064;
                }
                int var13 = arg2;
                if (~class144.field2067 < ~arg2) {
                    int var14 = arg2 - -arg8;
                    if (~class144.field2069 < ~arg2) {
                        var13 = class144.field2069;
                    }
                    if (var14 > class144.field2069) {
                        if (arg1 != 32) {
                            method889(53, (byte) 92, -36, -12, 43, true, 115, -121, 48, (int[]) null, -128);
                        }
                        if (~var14 < ~class144.field2067) {
                            var14 = class144.field2067;
                        }
                        int var15 = class144.field2068 * var13 + var11;
                        int var16 = var14 - arg2;
                        int var17 = var13 - arg2;
                        if (~arg10 == -10) {
                            arg10 = 1;
                            arg0 = 3 & arg0 + 1;
                        }
                        if (~arg10 == -11) {
                            arg0 = 3 & arg0 + 3;
                            arg10 = 1;
                        }
                        int var18 = -var12 + class144.field2068 - -var11;
                        if (~arg10 == -12) {
                            arg10 = 8;
                            arg0 = 3 & arg0 - -3;
                        }
                        int var19 = var11 - arg3;
                        int var20 = var12 - arg3;
                        int var21 = -var19 + arg6;
                        int var22 = -var16 + arg8;
                        int var23 = -var20 + arg6;
                        int var24 = -var17 + arg8;
                        if (arg10 == 1) {
                            if (~arg0 == -1) {
                                for (int var25 = var17; ~var16 < ~var25; ++var25) {
                                    for (int var26 = var19; var26 < var20; ++var26) {
                                        if (var25 >= var26) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 1) {
                                for (int var27 = var24 + -1; ~var22 >= ~var27; --var27) {
                                    for (int var28 = var19; ~var20 < ~var28; ++var28) {
                                        if (var27 >= var28) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -3) {
                                for (int var29 = var17; ~var29 > ~var16; ++var29) {
                                    for (int var30 = var19; var30 < var20; ++var30) {
                                        if (var29 > var30) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -4) {
                                for (int var31 = var24 + -1; var22 <= var31; --var31) {
                                    for (int var32 = var19; ~var20 < ~var32; ++var32) {
                                        if (var32 < var31) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (~arg10 == -3) {
                            if (arg0 == 0) {
                                for (int var33 = var24 + -1; var22 <= var33; --var33) {
                                    for (int var34 = var19; ~var20 < ~var34; ++var34) {
                                        if (var34 > var33 >> 1) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -2) {
                                for (int var35 = var17; ~var35 > ~var16; ++var35) {
                                    for (int var36 = var19; var36 < var20; ++var36) {
                                        if (var15 >= 0 && arg9.length > var15) {
                                            if (var35 << 1 > var36) {
                                                if (arg5) {
                                                    arg9[var15] = arg7;
                                                }
                                            } else {
                                                arg9[var15] = arg4;
                                            }
                                            ++var15;
                                        } else {
                                            ++var15;
                                        }
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 2) {
                                for (int var37 = var17; ~var37 > ~var16; ++var37) {
                                    for (int var38 = var21 + -1; ~var23 >= ~var38; --var38) {
                                        if (~var38 < ~(var37 >> 1)) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 3) {
                                for (int var39 = var24 + -1; ~var22 >= ~var39; --var39) {
                                    for (int var40 = var21 - 1; var23 <= var40; --var40) {
                                        if (~(var39 << 1) < ~var40) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (~arg10 == -4) {
                            if (arg0 == 0) {
                                for (int var41 = var24 - 1; ~var22 >= ~var41; --var41) {
                                    for (int var42 = var21 - 1; ~var23 >= ~var42; --var42) {
                                        if (var41 >> 1 < var42) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 1) {
                                for (int var43 = var24 + -1; var22 <= var43; --var43) {
                                    for (int var44 = var19; var20 > var44; ++var44) {
                                        if (var44 >= var43 << 1) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -3) {
                                for (int var45 = var17; ~var45 > ~var16; ++var45) {
                                    for (int var46 = var19; ~var20 < ~var46; ++var46) {
                                        if (~var46 >= ~(var45 >> 1)) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -4) {
                                for (int var47 = var17; var47 < var16; ++var47) {
                                    for (int var48 = var21 + -1; ~var23 >= ~var48; --var48) {
                                        if (var47 << 1 > var48) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (~arg10 == -5) {
                            if (~arg0 == -1) {
                                for (int var49 = var24 + -1; var49 >= var22; --var49) {
                                    for (int var50 = var19; ~var50 > ~var20; ++var50) {
                                        if (var50 < var49 >> 1) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 1) {
                                for (int var51 = var17; var16 > var51; ++var51) {
                                    for (int var52 = var19; var20 > var52; ++var52) {
                                        if (~(var51 << 1) <= ~var52) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 2) {
                                for (int var53 = var17; ~var16 < ~var53; ++var53) {
                                    for (int var54 = var21 + -1; var54 >= var23; --var54) {
                                        if (var53 >> 1 > var54) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 3) {
                                for (int var55 = var24 + -1; var22 <= var55; --var55) {
                                    for (int var56 = var21 + -1; var23 <= var56; --var56) {
                                        if (var55 << 1 >= var56) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (arg10 == 5) {
                            if (arg0 == 0) {
                                for (int var57 = var24 + -1; ~var57 <= ~var22; --var57) {
                                    for (int var58 = var21 + -1; var23 <= var58; --var58) {
                                        if (~(var57 >> 1) >= ~var58) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -2) {
                                for (int var59 = var24 + -1; ~var59 <= ~var22; --var59) {
                                    for (int var60 = var19; ~var60 > ~var20; ++var60) {
                                        if (~var60 >= ~(var59 << 1)) {
                                            arg9[var15] = arg4;
                                        } else if (arg5) {
                                            arg9[var15] = arg7;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg0 == -3) {
                                for (int var61 = var17; var61 < var16; ++var61) {
                                    for (int var62 = var19; var62 < var20; ++var62) {
                                        if (~(var61 >> 1) < ~var62) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg0 == 3) {
                                for (int var63 = var17; ~var16 < ~var63; ++var63) {
                                    for (int var64 = var21 + -1; var23 <= var64; --var64) {
                                        if (var64 > var63 << 1) {
                                            if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                        } else {
                                            arg9[var15] = arg4;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else {
                            if (arg10 == 6) {
                                if (~arg0 == -1) {
                                    for (int var65 = var17; var65 < var16; ++var65) {
                                        for (int var66 = var19; var20 > var66; ++var66) {
                                            if (~var66 >= ~(arg6 / 2)) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -2) {
                                    for (int var67 = var17; var67 < var16; ++var67) {
                                        for (int var68 = var19; ~var20 < ~var68; ++var68) {
                                            if (~(arg8 / 2) <= ~var67) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg0 == 2) {
                                    for (int var69 = var17; var69 < var16; ++var69) {
                                        for (int var70 = var19; var20 > var70; ++var70) {
                                            if (~(arg6 / 2) >= ~var70) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg0 == 3) {
                                    for (int var71 = var17; ~var71 > ~var16; ++var71) {
                                        for (int var72 = var19; var20 > var72; ++var72) {
                                            if (arg8 / 2 <= var71) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                            }
                            if (arg10 == 7) {
                                if (arg0 == 0) {
                                    for (int var73 = var17; var16 > var73; ++var73) {
                                        for (int var74 = var19; ~var20 < ~var74; ++var74) {
                                            if (var74 > var73 - arg8 / 2) {
                                                if (arg5) {
                                                    arg9[var15] = arg7;
                                                }
                                            } else {
                                                arg9[var15] = arg4;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -2) {
                                    for (int var75 = var24 + -1; ~var75 <= ~var22; --var75) {
                                        for (int var76 = var19; var20 > var76; ++var76) {
                                            if (var75 - arg8 / 2 < var76) {
                                                if (arg5) {
                                                    arg9[var15] = arg7;
                                                }
                                            } else {
                                                arg9[var15] = arg4;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -3) {
                                    for (int var77 = var24 + -1; var77 >= var22; --var77) {
                                        for (int var78 = var21 - 1; var23 <= var78; --var78) {
                                            if (var78 > var77 - arg8 / 2) {
                                                if (arg5) {
                                                    arg9[var15] = arg7;
                                                }
                                            } else {
                                                arg9[var15] = arg4;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -4) {
                                    for (int var79 = var17; ~var16 < ~var79; ++var79) {
                                        for (int var80 = var21 + -1; ~var23 >= ~var80; --var80) {
                                            if (var79 - arg8 / 2 >= var80) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                            }
                            if (~arg10 == -9) {
                                if (arg0 == 0) {
                                    for (int var81 = var17; var16 > var81; ++var81) {
                                        for (int var82 = var19; ~var82 > ~var20; ++var82) {
                                            if (var82 >= -(arg8 / 2) + var81) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -2) {
                                    for (int var83 = var24 + -1; var22 <= var83; --var83) {
                                        for (int var84 = var19; ~var20 < ~var84; ++var84) {
                                            if (var84 >= -(arg8 / 2) + var83) {
                                                arg9[var15] = arg4;
                                            } else if (arg5) {
                                                arg9[var15] = arg7;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -3) {
                                    for (int var85 = var24 - 1; var85 >= var22; --var85) {
                                        for (int var86 = var21 + -1; var23 <= var86; --var86) {
                                            if (~var86 > ~(-(arg8 / 2) + var85)) {
                                                if (arg5) {
                                                    arg9[var15] = arg7;
                                                }
                                            } else {
                                                arg9[var15] = arg4;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg0 == -4) {
                                    for (int var87 = var17; ~var87 > ~var16; ++var87) {
                                        for (int var88 = var21 + -1; var88 >= var23; --var88) {
                                            if (-(arg8 / 2) + var87 > var88) {
                                                if (arg5) {
                                                    arg9[var15] = arg7;
                                                }
                                            } else {
                                                arg9[var15] = arg4;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
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

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBILj;III)Z")
    public static final boolean method890(int arg0, byte arg1, int arg2, class250 arg3, int arg4, int arg5, int arg6) {
        ++field1876;
        class185 var7 = class269.method1797(arg3.field3771, -30718);
        if (~var7.field2642 == 0) {
            return true;
        } else {
            int var9;
            if (arg3.field3757) {
                int var8 = arg3.field3799 + arg6;
                var9 = var8 & 3;
            } else {
                var9 = 0;
            }
            class117 var10 = var7.method1195((byte) -66, var9);
            if (var10 == null) {
                return false;
            } else {
                int var11 = arg3.field3808;
                int var12 = arg3.field3821;
                int var13 = var10.field2497;
                int var14 = var10.field2501;
                if ((1 & var9) == 1) {
                    var11 = arg3.field3821;
                    var12 = arg3.field3808;
                }
                if (arg1 != -41) {
                    method890(97, (byte) 67, -127, (class250) null, -31, -40, 106);
                }
                if (var7.field2643) {
                    var14 = var12 * 4;
                    var13 = var11 * 4;
                }
                if (var7.field2639 == 0) {
                    var10.method803(arg2 * 4 + 48, (-arg4 + -var11 + 104) * 4 + 48, var14, var13);
                } else {
                    var10.method804(48 - -(arg2 * 4), (-arg4 + 104 - var11) * 4 + 48, var14, var13, var7.field2639);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
    public static void method891(byte arg0) {
        field1874 = null;
        field1882 = null;
        field1883 = null;
        if (arg0 < 49) {
            field1874 = null;
        }
        field1884 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 == -1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field1878 = arg1.method756(arg0 + -29900);
                        }
                    } else {
                        this.field1875 = arg1.method756(arg0 ^ 29900);
                    }
                } else {
                    this.field1880 = arg1.method756(arg0 + -29900);
                }
            } else {
                this.field1879 = arg1.method756(-29901);
            }
            ++field1877;
        }
    }
}
