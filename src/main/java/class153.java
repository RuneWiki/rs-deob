import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class153 extends class297 {

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    private int field2504 = -1;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field2496 = 1;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    private int field2498;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "[I")
    private int[] field2499;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)[[I", line = 4)
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            return null;
        } else {
            ++field2502;
            int[][] var3 = super.field4166.method2180(-94, arg0);
            if (super.field4166.field4849) {
                int var4 = this.field2498 * (~class128.field2169 == ~this.field2503 ? arg0 : this.field2503 * arg0 / class128.field2169);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class525.field7275 != ~this.field2498) {
                    for (int var8 = 0; var8 < class525.field7275; ++var8) {
                        int var9 = this.field2498 * var8 / class525.field7275;
                        int var10 = this.field2499[var4 + var9];
                        var7[var8] = class263.method1762(var10, 255) << 4;
                        var6[var8] = class263.method1762(65280, var10) >> 4;
                        var5[var8] = class263.method1762(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class525.field7275; ++var11) {
                        int var12 = this.field2499[var4++];
                        var7[var11] = class263.method1762(255, var12) << 4;
                        var6[var11] = class263.method1762(var12 >> 4, 4080);
                        var5[var11] = class263.method1762(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V", line = 69)
    public final void method1184(int arg0, int arg1, int arg2) {
        super.method1184(arg0, arg1, arg2);
        ++field2506;
        if (~this.field2504 <= -1 && class700.field9462 != null) {
            int var4 = !class700.field9462.method1180(this.field2504, -6662).field9941 ? 128 : 64;
            this.field2499 = class700.field9462.method1182(false, this.field2504, 1.0F, var4, var4, -123);
            this.field2503 = var4;
            this.field2498 = var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 88)
    public class153() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 91)
    public final void method1170(byte arg0) {
        if (arg0 >= -102) {
            this.field2498 = -104;
        }
        ++field2497;
        super.method1170((byte) -107);
        this.field2499 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)Z", line = 108)
    public static final boolean method1185(int arg0, byte arg1, int arg2) {
        ++field2495;
        if (arg1 > -55) {
            method1185(-76, (byte) -110, -59);
        }
        return (arg2 & 262144) != 0 | class535.method3082(-31735, arg0, arg2) || class582.method3336(arg2, arg0, (byte) -120);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lcea;II)V", line = 119)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 == 31015) {
            if (~arg1 == -1) {
                this.field2504 = arg0.method1478(842397944);
            }
            ++field2500;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBIIII)Z", line = 135)
    public static final boolean method1186(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2501;
        if (arg1 <= 2000 && arg6 <= 2000 && arg9 <= 2000 && arg8 <= 2000 && ~arg2 >= -2001 && ~arg0 >= -2001) {
            if (arg1 >= -2000 && ~arg6 <= 1999 && arg9 >= -2000 && ~arg8 <= 1999 && arg2 >= -2000 && ~arg0 <= 1999) {
                if (~class179.field2740 == -3) {
                    int var10 = class359.field5179 * arg1 + arg8;
                    if (var10 >= 0 && class747.field10344.length > var10 && class747.field10344[var10] > (arg7 << 8) + -38400) {
                        return false;
                    }
                    int var11 = class359.field5179 * arg6 + arg2;
                    if (var11 >= 0 && ~var11 > ~class747.field10344.length && ~class747.field10344[var11] < ~((arg4 << 8) + -38400)) {
                        return false;
                    }
                    int var12 = class359.field5179 * arg9 + arg0;
                    if (var12 >= 0 && class747.field10344.length > var12 && ~((arg3 << 8) - 38400) > ~class747.field10344[var12]) {
                        return false;
                    }
                }
                int var13 = -arg8 + arg2;
                int var14 = arg6 - arg1;
                int var15 = -arg8 + arg0;
                int var16 = -arg1 + arg9;
                int var17 = -arg7 + arg4;
                if (arg1 < arg6 && arg9 > arg9) {
                    --arg1;
                    if (~arg6 < ~arg9) {
                        ++arg6;
                    } else {
                        ++arg9;
                    }
                } else if (~arg9 >= ~arg6) {
                    --arg9;
                    if (arg6 < arg1) {
                        ++arg1;
                    } else {
                        ++arg6;
                    }
                } else {
                    --arg6;
                    if (~arg9 > ~arg1) {
                        ++arg1;
                    } else {
                        ++arg9;
                    }
                }
                int var18 = -arg7 + arg3;
                int var19 = 0;
                if (~arg1 != ~arg6) {
                    var19 = (arg2 - arg8 << 12) / (arg6 - arg1);
                }
                int var20 = 0;
                if (~arg6 != ~arg9) {
                    var20 = (-arg2 + arg0 << 12) / (-arg6 + arg9);
                }
                if (arg5 >= -7) {
                    field2496 = 8;
                }
                int var21 = 0;
                if (arg1 != arg9) {
                    var21 = (-arg0 + arg8 << 12) / (arg1 - arg9);
                }
                int var22 = var13 * var16 + -(var14 * var15);
                if (~var22 == -1) {
                    return false;
                } else {
                    int var23 = (var16 * var17 + -(var14 * var18) << 8) / var22;
                    int var24 = (var13 * var18 + -(var15 * var17) << 8) / var22;
                    if (arg1 <= arg6 && ~arg1 >= ~arg9) {
                        if (arg1 >= class612.field8370) {
                            return true;
                        } else {
                            int var25 = (arg7 << 8) - (arg8 * var23 + -var23);
                            if (~arg9 < ~class612.field8370) {
                                arg9 = class612.field8370;
                            }
                            if (~arg6 < ~class612.field8370) {
                                arg6 = class612.field8370;
                            }
                            if (~arg6 > ~arg9) {
                                int var26;
                                int var27 = var26 = arg8 << 12;
                                if (arg1 < 0) {
                                    var26 -= arg1 * var19;
                                    var25 -= arg1 * var24;
                                    var27 -= arg1 * var21;
                                    arg1 = 0;
                                }
                                int var28 = arg2 << 12;
                                if (~arg6 > -1) {
                                    var28 -= arg6 * var20;
                                    arg6 = 0;
                                }
                                if (arg1 != arg6 && ~var21 > ~var19 || ~arg1 == ~arg6 && var21 > var20) {
                                    int var29 = arg9 - arg6;
                                    int var30 = arg6 - arg1;
                                    int var31 = class359.field5179 * arg1;
                                    while (true) {
                                        --var30;
                                        if (~var30 > -1) {
                                            while (true) {
                                                --var29;
                                                if (var29 < 0) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var25, 0, (var28 >> 12) + 1, (var27 >> 12) + -1, class747.field10344, var31)) {
                                                    return false;
                                                }
                                                var28 += var20;
                                                var27 += var21;
                                                var25 += var24;
                                                var31 += class359.field5179;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var25, 0, (var26 >> 12) + 1, (var27 >> 12) + -1, class747.field10344, var31)) {
                                            return false;
                                        }
                                        var25 += var24;
                                        var31 += class359.field5179;
                                        var26 += var19;
                                        var27 += var21;
                                    }
                                } else {
                                    int var32 = arg9 - arg6;
                                    int var33 = arg6 - arg1;
                                    int var34 = class359.field5179 * arg1;
                                    while (true) {
                                        --var33;
                                        if (var33 < 0) {
                                            while (true) {
                                                --var32;
                                                if (var32 < 0) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var25, 0, (var27 >> 12) - -1, (var28 >> 12) + -1, class747.field10344, var34)) {
                                                    return false;
                                                }
                                                var28 += var20;
                                                var34 += class359.field5179;
                                                var25 += var24;
                                                var27 += var21;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var25, 0, (var27 >> 12) + 1, (var26 >> 12) + -1, class747.field10344, var34)) {
                                            return false;
                                        }
                                        var34 += class359.field5179;
                                        var25 += var24;
                                        var27 += var21;
                                        var26 += var19;
                                    }
                                }
                            } else {
                                int var35;
                                int var36 = var35 = arg8 << 12;
                                if (arg1 < 0) {
                                    var36 -= arg1 * var21;
                                    var25 -= arg1 * var24;
                                    var35 -= arg1 * var19;
                                    arg1 = 0;
                                }
                                int var37 = arg0 << 12;
                                if (~arg9 > -1) {
                                    var37 -= arg9 * var20;
                                    arg9 = 0;
                                }
                                if ((arg1 == arg9 || var19 <= var21) && (~arg1 != ~arg9 || var19 >= var20)) {
                                    int var41 = arg6 - arg9;
                                    int var42 = arg9 - arg1;
                                    int var43 = class359.field5179 * arg1;
                                    while (true) {
                                        --var42;
                                        if (var42 < 0) {
                                            while (true) {
                                                --var41;
                                                if (~var41 > -1) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var25, 0, (var37 >> 12) - -1, (var35 >> 12) + -1, class747.field10344, var43)) {
                                                    return false;
                                                }
                                                var35 += var19;
                                                var25 += var24;
                                                var37 += var20;
                                                var43 += class359.field5179;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var25, 0, (var36 >> 12) + 1, (var35 >> 12) + -1, class747.field10344, var43)) {
                                            return false;
                                        }
                                        var36 += var21;
                                        var35 += var19;
                                        var25 += var24;
                                        var43 += class359.field5179;
                                    }
                                } else {
                                    int var38 = arg6 - arg9;
                                    int var39 = arg9 - arg1;
                                    int var40 = class359.field5179 * arg1;
                                    while (true) {
                                        --var39;
                                        if (~var39 > -1) {
                                            while (true) {
                                                --var38;
                                                if (var38 < 0) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var25, 0, (var35 >> 12) - -1, (var37 >> 12) - 1, class747.field10344, var40)) {
                                                    return false;
                                                }
                                                var40 += class359.field5179;
                                                var37 += var20;
                                                var25 += var24;
                                                var35 += var19;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var25, 0, (var35 >> 12) + 1, (var36 >> 12) + -1, class747.field10344, var40)) {
                                            return false;
                                        }
                                        var40 += class359.field5179;
                                        var35 += var19;
                                        var25 += var24;
                                        var36 += var21;
                                    }
                                }
                            }
                        }
                    } else if (arg9 < arg6) {
                        if (~arg9 <= ~class612.field8370) {
                            return true;
                        } else {
                            int var44 = (arg3 << 8) - -var23 + -(arg0 * var23);
                            if (~arg1 < ~class612.field8370) {
                                arg1 = class612.field8370;
                            }
                            if (class612.field8370 < arg6) {
                                arg6 = class612.field8370;
                            }
                            if (~arg1 > ~arg6) {
                                int var45;
                                int var46 = var45 = arg0 << 12;
                                int var47 = arg8 << 12;
                                if (arg9 < 0) {
                                    var44 -= arg9 * var24;
                                    var45 -= arg9 * var21;
                                    var46 -= arg9 * var20;
                                    arg9 = 0;
                                }
                                if (arg1 < 0) {
                                    var47 -= arg1 * var19;
                                    arg1 = 0;
                                }
                                if (var21 > var20) {
                                    int var48 = arg6 - arg1;
                                    int var49 = arg1 - arg9;
                                    int var50 = class359.field5179 * arg9;
                                    while (true) {
                                        --var49;
                                        if (~var49 > -1) {
                                            while (true) {
                                                --var48;
                                                if (~var48 > -1) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var44, 0, (var47 >> 12) + 1, (var46 >> 12) + -1, class747.field10344, var50)) {
                                                    return false;
                                                }
                                                var50 += class359.field5179;
                                                var47 += var19;
                                                var44 += var24;
                                                var46 += var20;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var44, 0, (var45 >> 12) + 1, (var46 >> 12) - 1, class747.field10344, var50)) {
                                            return false;
                                        }
                                        var50 += class359.field5179;
                                        var45 += var21;
                                        var46 += var20;
                                        var44 += var24;
                                    }
                                } else {
                                    int var51 = arg6 - arg1;
                                    int var52 = arg1 - arg9;
                                    int var53 = class359.field5179 * arg9;
                                    while (true) {
                                        --var52;
                                        if (~var52 > -1) {
                                            while (true) {
                                                --var51;
                                                if (var51 < 0) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var44, 0, (var46 >> 12) - -1, (var47 >> 12) - 1, class747.field10344, var53)) {
                                                    return false;
                                                }
                                                var44 += var24;
                                                var46 += var20;
                                                var53 += class359.field5179;
                                                var47 += var19;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var44, 0, (var46 >> 12) + 1, (var45 >> 12) + -1, class747.field10344, var53)) {
                                            return false;
                                        }
                                        var44 += var24;
                                        var46 += var20;
                                        var53 += class359.field5179;
                                        var45 += var21;
                                    }
                                }
                            } else {
                                int var54;
                                int var55 = var54 = arg0 << 12;
                                if (arg9 < 0) {
                                    var55 -= arg9 * var20;
                                    var54 -= arg9 * var21;
                                    var44 -= arg9 * var24;
                                    arg9 = 0;
                                }
                                int var56 = arg2 << 12;
                                if (arg6 < 0) {
                                    var56 -= arg6 * var19;
                                    arg6 = 0;
                                }
                                if (~var21 >= ~var20) {
                                    int var57 = arg1 - arg6;
                                    int var58 = arg6 - arg9;
                                    int var59 = class359.field5179 * arg9;
                                    while (true) {
                                        --var58;
                                        if (~var58 > -1) {
                                            while (true) {
                                                --var57;
                                                if (~var57 > -1) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var44, 0, (var56 >> 12) - -1, (var54 >> 12) + -1, class747.field10344, var59)) {
                                                    return false;
                                                }
                                                var54 += var21;
                                                var56 += var19;
                                                var44 += var24;
                                                var59 += class359.field5179;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var44, 0, (var55 >> 12) - -1, (var54 >> 12) - 1, class747.field10344, var59)) {
                                            return false;
                                        }
                                        var44 += var24;
                                        var59 += class359.field5179;
                                        var55 += var20;
                                        var54 += var21;
                                    }
                                } else {
                                    int var60 = arg1 - arg6;
                                    int var61 = arg6 - arg9;
                                    int var62 = class359.field5179 * arg9;
                                    while (true) {
                                        --var61;
                                        if (var61 < 0) {
                                            while (true) {
                                                --var60;
                                                if (var60 < 0) {
                                                    return true;
                                                }
                                                if (!class440.method2650(var23, (byte) -25, var44, 0, (var54 >> 12) - -1, (var56 >> 12) + -1, class747.field10344, var62)) {
                                                    return false;
                                                }
                                                var44 += var24;
                                                var56 += var19;
                                                var62 += class359.field5179;
                                                var54 += var21;
                                            }
                                        }
                                        if (!class440.method2650(var23, (byte) -25, var44, 0, (var54 >> 12) + 1, (var55 >> 12) + -1, class747.field10344, var62)) {
                                            return false;
                                        }
                                        var54 += var21;
                                        var62 += class359.field5179;
                                        var55 += var20;
                                        var44 += var24;
                                    }
                                }
                            }
                        }
                    } else if (~arg6 <= ~class612.field8370) {
                        return true;
                    } else {
                        int var63 = (arg4 << 8) + -(arg2 * var23) + var23;
                        if (class612.field8370 < arg9) {
                            arg9 = class612.field8370;
                        }
                        if (class612.field8370 < arg1) {
                            arg1 = class612.field8370;
                        }
                        if (arg9 >= arg1) {
                            int var64;
                            int var65 = var64 = arg2 << 12;
                            int var66 = arg8 << 12;
                            if (~arg6 > -1) {
                                var65 -= arg6 * var19;
                                var63 -= arg6 * var24;
                                var64 -= arg6 * var20;
                                arg6 = 0;
                            }
                            if (arg1 < 0) {
                                var66 -= arg1 * var21;
                                arg1 = 0;
                            }
                            if (var19 >= var20) {
                                int var67 = arg9 - arg1;
                                int var68 = arg1 - arg6;
                                int var69 = class359.field5179 * arg6;
                                while (true) {
                                    --var68;
                                    if (var68 < 0) {
                                        while (true) {
                                            --var67;
                                            if (var67 < 0) {
                                                return true;
                                            }
                                            if (!class440.method2650(var23, (byte) -25, var63, 0, (var66 >> 12) - -1, (var64 >> 12) + -1, class747.field10344, var69)) {
                                                return false;
                                            }
                                            var63 += var24;
                                            var69 += class359.field5179;
                                            var64 += var20;
                                            var66 += var21;
                                        }
                                    }
                                    if (!class440.method2650(var23, (byte) -25, var63, 0, (var65 >> 12) - -1, (var64 >> 12) - 1, class747.field10344, var69)) {
                                        return false;
                                    }
                                    var64 += var20;
                                    var63 += var24;
                                    var69 += class359.field5179;
                                    var65 += var19;
                                }
                            } else {
                                int var70 = arg9 - arg1;
                                int var71 = arg1 - arg6;
                                int var72 = class359.field5179 * arg6;
                                while (true) {
                                    --var71;
                                    if (~var71 > -1) {
                                        while (true) {
                                            --var70;
                                            if (var70 < 0) {
                                                return true;
                                            }
                                            if (!class440.method2650(var23, (byte) -25, var63, 0, (var64 >> 12) + 1, (var66 >> 12) - 1, class747.field10344, var72)) {
                                                return false;
                                            }
                                            var64 += var20;
                                            var66 += var21;
                                            var63 += var24;
                                            var72 += class359.field5179;
                                        }
                                    }
                                    if (!class440.method2650(var23, (byte) -25, var63, 0, (var64 >> 12) + 1, (var65 >> 12) - 1, class747.field10344, var72)) {
                                        return false;
                                    }
                                    var72 += class359.field5179;
                                    var64 += var20;
                                    var63 += var24;
                                    var65 += var19;
                                }
                            }
                        } else {
                            int var73;
                            int var74 = var73 = arg2 << 12;
                            int var75 = arg0 << 12;
                            if (~arg6 > -1) {
                                var74 -= arg6 * var19;
                                var73 -= arg6 * var20;
                                var63 -= arg6 * var24;
                                arg6 = 0;
                            }
                            if (~arg9 > -1) {
                                var75 -= arg9 * var21;
                                arg9 = 0;
                            }
                            if ((~arg6 == ~arg9 || var20 <= var19) && (~arg6 != ~arg9 || var19 <= var21)) {
                                int var79 = arg1 - arg9;
                                int var80 = arg9 - arg6;
                                int var81 = class359.field5179 * arg6;
                                while (true) {
                                    --var80;
                                    if (~var80 > -1) {
                                        while (true) {
                                            --var79;
                                            if (var79 < 0) {
                                                return true;
                                            }
                                            if (!class440.method2650(var23, (byte) -25, var63, 0, (var74 >> 12) - -1, (var75 >> 12) + -1, class747.field10344, var81)) {
                                                return false;
                                            }
                                            var63 += var24;
                                            var81 += class359.field5179;
                                            var74 += var19;
                                            var75 += var21;
                                        }
                                    }
                                    if (!class440.method2650(var23, (byte) -25, var63, 0, (var74 >> 12) - -1, (var73 >> 12) - 1, class747.field10344, var81)) {
                                        return false;
                                    }
                                    var73 += var20;
                                    var74 += var19;
                                    var81 += class359.field5179;
                                    var63 += var24;
                                }
                            } else {
                                int var76 = arg1 - arg9;
                                int var77 = arg9 - arg6;
                                int var78 = class359.field5179 * arg6;
                                while (true) {
                                    --var77;
                                    if (var77 < 0) {
                                        while (true) {
                                            --var76;
                                            if (var76 < 0) {
                                                return true;
                                            }
                                            if (!class440.method2650(var23, (byte) -25, var63, 0, (var75 >> 12) - -1, (var74 >> 12) + -1, class747.field10344, var78)) {
                                                return false;
                                            }
                                            var74 += var19;
                                            var75 += var21;
                                            var63 += var24;
                                            var78 += class359.field5179;
                                        }
                                    }
                                    if (!class440.method2650(var23, (byte) -25, var63, 0, (var73 >> 12) - -1, (var74 >> 12) + -1, class747.field10344, var78)) {
                                        return false;
                                    }
                                    var74 += var19;
                                    var63 += var24;
                                    var78 += class359.field5179;
                                    var73 += var20;
                                }
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I", line = 773)
    public final int method1187(int arg0) {
        if (arg0 != -1) {
            this.field2503 = 10;
        }
        ++field2505;
        return this.field2504;
    }
}
