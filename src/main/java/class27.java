import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class43 {

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Lkg;")
    public static class115 field432 = new class115(100);

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "Lmb;")
    public static class132 field440 = class166.method1092(")1", 123);

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "[I")
    public static int[] field441 = new int[1000];

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lmb;")
    public static class132 field443 = class166.method1092("Zu viele Anmelde)2Versuche von Ihrer Adresse", 113);

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field446 = -1;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lmb;")
    private static class132 field447 = class166.method1092(" more options", 122);

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lmb;")
    public static class132 field445 = field447;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static void method198(byte arg0) {
        field447 = null;
        field440 = null;
        field441 = null;
        if (arg0 < 122) {
            method198((byte) -68);
        }
        field443 = null;
        field445 = null;
        field432 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZ[IIIIIBI)V")
    public static final void method199(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        if (~arg5 > ~class239.field4312) {
            arg7 -= -arg5 + class239.field4312;
            arg5 = class239.field4312;
        }
        if (arg6 == 9) {
            arg1 = 3 & arg1 + 1;
            arg6 = 1;
        }
        if (~class239.field4310 > ~(arg5 - -arg7)) {
            arg7 = -arg5 + class239.field4310;
        }
        if (~class239.field4309 < ~arg10) {
            arg2 -= -arg10 + class239.field4309;
            arg10 = class239.field4309;
        }
        int var11 = -arg7 + class239.field4313;
        ++field437;
        int var12 = class239.field4313 * arg10 + arg5;
        if (arg9 > 45) {
            if (~(arg10 - -arg2) < ~class239.field4311) {
                arg2 = -arg10 + class239.field4311;
            }
            if (arg6 == 10) {
                arg1 = arg1 + 3 & 3;
                arg6 = 1;
            }
            if (arg6 == 11) {
                arg1 = 3 & arg1 + 3;
                arg6 = 8;
            }
            if (~arg6 == -2) {
                if (arg1 == 0) {
                    for (int var13 = 0; ~var13 > ~arg2; ++var13) {
                        for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                            if (~var14 < ~var13) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 1) {
                    for (int var15 = arg2 + -1; ~var15 <= -1; --var15) {
                        for (int var16 = 0; arg7 > var16; ++var16) {
                            if (var15 >= var16) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -3) {
                    for (int var17 = 0; var17 < arg2; ++var17) {
                        for (int var18 = 0; ~arg7 < ~var18; ++var18) {
                            if (~var17 >= ~var18) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -4) {
                    for (int var19 = arg2 + -1; ~var19 <= -1; --var19) {
                        for (int var20 = 0; ~var20 > ~arg7; ++var20) {
                            if (var20 < var19) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                }
            } else if (~arg6 == -3) {
                if (arg1 == 0) {
                    for (int var21 = arg2 + -1; ~var21 <= -1; --var21) {
                        for (int var22 = 0; var22 < arg7; ++var22) {
                            if (~(var21 >> 1) <= ~var22) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 1) {
                    for (int var23 = 0; ~var23 > ~arg2; ++var23) {
                        for (int var24 = 0; arg7 > var24; ++var24) {
                            if (var24 < var23 << 1) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 2) {
                    for (int var25 = 0; arg2 > var25; ++var25) {
                        for (int var26 = arg7 + -1; ~var26 <= -1; --var26) {
                            if (var25 >> 1 >= var26) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 3) {
                    for (int var27 = arg2 - 1; var27 >= 0; --var27) {
                        for (int var28 = arg7 + -1; var28 >= 0; --var28) {
                            if (var27 << 1 > var28) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                }
            } else if (~arg6 == -4) {
                if (arg1 == 0) {
                    for (int var29 = arg2 - 1; ~var29 <= -1; --var29) {
                        for (int var30 = arg7 - 1; var30 >= 0; --var30) {
                            if (var29 >> 1 >= var30) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -2) {
                    for (int var31 = arg2 + -1; ~var31 <= -1; --var31) {
                        for (int var32 = 0; arg7 > var32; ++var32) {
                            if (~var32 > ~(var31 << 1)) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -3) {
                    for (int var33 = 0; ~arg2 < ~var33; ++var33) {
                        for (int var34 = 0; arg7 > var34; ++var34) {
                            if (var33 >> 1 >= var34) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -4) {
                    for (int var35 = 0; ~var35 > ~arg2; ++var35) {
                        for (int var36 = arg7 + -1; ~var36 <= -1; --var36) {
                            if (var35 << 1 > var36) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                }
            } else if (arg6 == 4) {
                if (arg1 == 0) {
                    for (int var37 = arg2 + -1; ~var37 <= -1; --var37) {
                        for (int var38 = 0; arg7 > var38; ++var38) {
                            if (var37 >> 1 > var38) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -2) {
                    for (int var39 = 0; var39 < arg2; ++var39) {
                        for (int var40 = 0; var40 < arg7; ++var40) {
                            if (~var40 >= ~(var39 << 1)) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 2) {
                    for (int var41 = 0; arg2 > var41; ++var41) {
                        for (int var42 = arg7 + -1; ~var42 <= -1; --var42) {
                            if (~var42 <= ~(var41 >> 1)) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 3) {
                    for (int var43 = arg2 + -1; var43 >= 0; --var43) {
                        for (int var44 = arg7 + -1; var44 >= 0; --var44) {
                            if (var43 << 1 >= var44) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                }
            } else if (~arg6 == -6) {
                if (~arg1 == -1) {
                    for (int var45 = arg2 - 1; ~var45 <= -1; --var45) {
                        for (int var46 = arg7 + -1; var46 >= 0; --var46) {
                            if (~var46 > ~(var45 >> 1)) {
                                if (arg3) {
                                    arg4[var12] = arg0;
                                }
                            } else {
                                arg4[var12] = arg8;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 1) {
                    for (int var47 = arg2 - 1; ~var47 <= -1; --var47) {
                        for (int var48 = 0; ~var48 > ~arg7; ++var48) {
                            if (var47 << 1 >= var48) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (~arg1 == -3) {
                    for (int var49 = 0; arg2 > var49; ++var49) {
                        for (int var50 = 0; var50 < arg7; ++var50) {
                            if (var49 >> 1 <= var50) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 3) {
                    for (int var51 = 0; var51 < arg2; ++var51) {
                        for (int var52 = arg7 - 1; ~var52 <= -1; --var52) {
                            if (~var52 >= ~(var51 << 1)) {
                                arg4[var12] = arg8;
                            } else if (arg3) {
                                arg4[var12] = arg0;
                            }
                            ++var12;
                        }
                        var12 += var11;
                    }
                }
            } else {
                if (arg6 == 6) {
                    if (~arg1 == -1) {
                        for (int var53 = 0; var53 < arg2; ++var53) {
                            for (int var54 = 0; ~var54 > ~arg7; ++var54) {
                                if (arg7 / 2 >= var54) {
                                    arg4[var12] = arg8;
                                } else if (arg3) {
                                    arg4[var12] = arg0;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var55 = 0; ~var55 > ~arg2; ++var55) {
                            for (int var56 = 0; ~var56 > ~arg7; ++var56) {
                                if (~(arg2 / 2) <= ~var55) {
                                    arg4[var12] = arg8;
                                } else if (arg3) {
                                    arg4[var12] = arg0;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var57 = 0; var57 < arg2; ++var57) {
                            for (int var58 = 0; var58 < arg7; ++var58) {
                                if (arg7 / 2 <= var58) {
                                    arg4[var12] = arg8;
                                } else if (arg3) {
                                    arg4[var12] = arg0;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (~arg1 == -4) {
                        for (int var59 = 0; arg2 > var59; ++var59) {
                            for (int var60 = 0; ~var60 > ~arg7; ++var60) {
                                if (~(arg2 / 2) < ~var59) {
                                    if (arg3) {
                                        arg4[var12] = arg0;
                                    }
                                } else {
                                    arg4[var12] = arg8;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                }
                if (arg6 == 7) {
                    if (arg1 == 0) {
                        for (int var61 = 0; var61 < arg2; ++var61) {
                            for (int var62 = 0; var62 < arg7; ++var62) {
                                if (~var62 < ~(var61 - arg2 / 2)) {
                                    if (arg3) {
                                        arg4[var12] = arg0;
                                    }
                                } else {
                                    arg4[var12] = arg8;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var63 = arg2 + -1; ~var63 <= -1; --var63) {
                            for (int var64 = 0; ~arg7 < ~var64; ++var64) {
                                if (-(arg2 / 2) + var63 < var64) {
                                    if (arg3) {
                                        arg4[var12] = arg0;
                                    }
                                } else {
                                    arg4[var12] = arg8;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var65 = arg2 + -1; var65 >= 0; --var65) {
                            for (int var66 = arg7 + -1; ~var66 <= -1; --var66) {
                                if (-(arg2 / 2) + var65 < var66) {
                                    if (arg3) {
                                        arg4[var12] = arg0;
                                    }
                                } else {
                                    arg4[var12] = arg8;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var67 = 0; arg2 > var67; ++var67) {
                            for (int var68 = arg7 + -1; var68 >= 0; --var68) {
                                if (var67 - arg2 / 2 >= var68) {
                                    arg4[var12] = arg8;
                                } else if (arg3) {
                                    arg4[var12] = arg0;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                }
                if (~arg6 == -9) {
                    if (~arg1 == -1) {
                        for (int var69 = 0; var69 < arg2; ++var69) {
                            for (int var70 = 0; var70 < arg7; ++var70) {
                                if (var70 < -(arg2 / 2) + var69) {
                                    if (arg3) {
                                        arg4[var12] = arg0;
                                    }
                                } else {
                                    arg4[var12] = arg8;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (~arg1 == -2) {
                        for (int var71 = arg2 + -1; var71 >= 0; --var71) {
                            for (int var72 = 0; arg7 > var72; ++var72) {
                                if (~(var71 - arg2 / 2) >= ~var72) {
                                    arg4[var12] = arg8;
                                } else if (arg3) {
                                    arg4[var12] = arg0;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (~arg1 == -3) {
                        for (int var73 = arg2 - 1; ~var73 <= -1; --var73) {
                            for (int var74 = arg7 + -1; ~var74 <= -1; --var74) {
                                if (var73 - arg2 / 2 > var74) {
                                    if (arg3) {
                                        arg4[var12] = arg0;
                                    }
                                } else {
                                    arg4[var12] = arg8;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (~arg1 == -4) {
                        for (int var75 = 0; ~var75 > ~arg2; ++var75) {
                            for (int var76 = arg7 + -1; var76 >= 0; --var76) {
                                if (var76 >= -(arg2 / 2) + var75) {
                                    arg4[var12] = arg8;
                                } else if (arg3) {
                                    arg4[var12] = arg0;
                                }
                                ++var12;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
    private class27(int arg0) {
        super(0, false);
        this.method201(arg0, 2);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field438;
        if (arg1 == -73) {
            if (arg0 == 0) {
                this.method201(arg2.method718(false), 2);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V")
    private final void method201(int arg0, int arg1) {
        if (arg1 != 2) {
            this.field439 = 14;
        }
        this.field430 = (255 & arg0) << 4;
        this.field439 = (16711680 & arg0) >> 12;
        ++field442;
        this.field433 = 4080 & arg0 >> 4;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
        this(0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIIIZI)Lvi;")
    public static final class233 method202(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        long var6 = ((long) arg2 << 38) + (arg4 ? 137438953472L : 0L) + (long) arg3 - (-((long) arg1 << 40) + -((long) arg5 << 16));
        ++field435;
        if (!arg0) {
            return null;
        } else {
            class233 var8 = (class233) class89.field1566.method777(-1, var6);
            if (var8 != null) {
                return var8;
            } else {
                class233 var9 = class26.method194(arg2, arg5, arg3, arg4, false, 0, arg1, false);
                if (var9 != null) {
                    class89.field1566.method774(var6, var9, 0);
                }
                return var9;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            field440 = null;
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        ++field434;
        if (super.field764.field3960) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class131.field2427 > var7; ++var7) {
                var4[var7] = this.field439;
                var5[var7] = this.field433;
                var6[var7] = this.field430;
            }
        }
        return var3;
    }
}
