import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 extends class207 {

    @OriginalMember(owner = "client!bl", name = "mc", descriptor = "I")
    public int field505 = 0;

    @OriginalMember(owner = "client!bl", name = "qc", descriptor = "I")
    public int field509 = 0;

    @OriginalMember(owner = "client!bl", name = "sc", descriptor = "I")
    public int field511 = -1;

    @OriginalMember(owner = "client!bl", name = "zc", descriptor = "I")
    public int field518 = 0;

    @OriginalMember(owner = "client!bl", name = "rc", descriptor = "I")
    public int field510 = 0;

    @OriginalMember(owner = "client!bl", name = "Hc", descriptor = "I")
    public int field526 = -1;

    @OriginalMember(owner = "client!bl", name = "Ac", descriptor = "I")
    public int field519 = 0;

    @OriginalMember(owner = "client!bl", name = "Fc", descriptor = "I")
    public int field524 = -1;

    @OriginalMember(owner = "client!bl", name = "uc", descriptor = "I")
    public int field513 = -1;

    @OriginalMember(owner = "client!bl", name = "Mc", descriptor = "I")
    public int field531 = -1;

    @OriginalMember(owner = "client!bl", name = "lc", descriptor = "I")
    public int field504 = -1;

    @OriginalMember(owner = "client!bl", name = "Kc", descriptor = "I")
    private int field529 = 0;

    @OriginalMember(owner = "client!bl", name = "xc", descriptor = "Z")
    public boolean field516 = false;

    @OriginalMember(owner = "client!bl", name = "yc", descriptor = "I")
    public int field517 = -1;

    @OriginalMember(owner = "client!bl", name = "Dc", descriptor = "[I")
    public static int[] field522 = new int[1000];

    @OriginalMember(owner = "client!bl", name = "wc", descriptor = "I")
    public static int field515 = -2;

    @OriginalMember(owner = "client!bl", name = "Cc", descriptor = "I")
    public static int field521 = 1;

    @OriginalMember(owner = "client!bl", name = "Nc", descriptor = "[I")
    public static int[] field532 = new int[14];

    @OriginalMember(owner = "client!bl", name = "Qc", descriptor = "Ljava/lang/String;")
    public static String field535 = "Loaded config";

    @OriginalMember(owner = "client!bl", name = "jc", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!bl", name = "kc", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!bl", name = "nc", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!bl", name = "oc", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!bl", name = "pc", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!bl", name = "tc", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bl", name = "vc", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bl", name = "Bc", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!bl", name = "Ec", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!bl", name = "Ic", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!bl", name = "Lc", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!bl", name = "Oc", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!bl", name = "Pc", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bl", name = "Jc", descriptor = "Lfi;")
    public class110 field528;

    @OriginalMember(owner = "client!bl", name = "Gc", descriptor = "Ljava/lang/String;")
    public String field525;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        ++field502;
        if (arg0 != 125) {
            field535 = null;
        }
        return this.field528 != null;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
    public final int method278(int arg0) {
        ++field530;
        if (this.field528 != null && ~this.field528.field1820 != 0) {
            return class204.method1402((byte) 77, this.field528.field1820).field1731;
        } else {
            if (arg0 != 0) {
                this.field529 = -98;
            }
            return super.method278(arg0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZZ)V")
    public final void method279(int arg0, int arg1, boolean arg2, boolean arg3) {
        super.method1430(arg1, this.method278(0), arg0, (byte) 86, arg3);
        ++field520;
        if (arg2) {
            method280((byte) -110);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    public static void method280(byte arg0) {
        if (arg0 != -87) {
            method281((byte) -19);
        }
        field532 = null;
        field522 = null;
        field535 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
    public final int method119() {
        ++field506;
        return super.field3388;
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)I")
    public final int method115(int arg0) {
        if (arg0 != 0) {
            this.field504 = 57;
        }
        ++field527;
        return super.field3349;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field514;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
    public static final void method281(byte arg0) {
        ++field512;
        class43.field802 = 0;
        class149.field2394 = 0;
        class285.method1916(1);
        class17.method136(111);
        class81.method587(false);
        if (arg0 != 75) {
            method281((byte) -87);
        }
        for (int var1 = 0; ~class149.field2394 < ~var1; ++var1) {
            int var3 = field522[var1];
            if (class222.field3682 != class137.field2260[var3].field3376) {
                if (class137.field2260[var3].field258.method779(-121)) {
                    class96.method710(29933, class137.field2260[var3]);
                }
                class137.field2260[var3].method114((class107) null, (byte) 109);
                class137.field2260[var3] = null;
            }
        }
        if (~class115.field1912 != ~class67.field1103.field3655) {
            throw new RuntimeException("gnp1 pos:" + class67.field1103.field3655 + " psize:" + class115.field1912);
        } else {
            for (int var2 = 0; var2 < class141.field2287; ++var2) {
                if (class137.field2260[class221.field3648[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class141.field2287);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var32 = 0; ~var32 > -105; ++var32) {
                class100.field1647[var12][var32] = 0;
                class45.field814[var12][var32] = 99999999;
            }
        }
        class100.field1647[arg0][arg9] = 99;
        class45.field814[arg0][arg9] = 0;
        ++field503;
        int var13 = arg0;
        int var14 = arg9;
        byte var15 = 0;
        class238.field3866[var15] = arg0;
        int var33 = var15 + 1;
        class148.field2387[var15] = arg9;
        int var16 = 0;
        boolean var17 = false;
        int var18 = -114 / ((30 - arg10) / 59);
        int[][] var19 = class167.field2657[class250.field3980].field371;
        while (var33 != var16) {
            var13 = class238.field3866[var16];
            var14 = class148.field2387[var16];
            var16 = var16 + 1 & 4095;
            if (arg3 == var13 && arg2 == var14) {
                var17 = true;
                break;
            }
            if (~arg1 != -1) {
                if ((~arg1 > -6 || ~arg1 == -11) && class167.field2657[class250.field3980].method209(-7593, var13, arg3, arg11, var14, arg2, arg1 + -1, 2)) {
                    var17 = true;
                    break;
                }
                if (~arg1 > -11 && class167.field2657[class250.field3980].method213(arg1 + -1, 2, arg3, arg2, var14, var13, (byte) 64, arg11)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg4 != 0 && class167.field2657[class250.field3980].method204(-1, arg8, arg4, arg5, arg2, arg3, var14, 2, var13)) {
                var17 = true;
                break;
            }
            int var31 = class45.field814[var13][var14] + 1;
            if (~var13 < -1 && class100.field1647[var13 + -1][var14] == 0 && (var19[var13 + -1][var14] & 19661070) == 0 && (19661112 & var19[var13 + -1][var14 - -1]) == 0) {
                class238.field3866[var33] = var13 + -1;
                class148.field2387[var33] = var14;
                var33 = 4095 & var33 + 1;
                class100.field1647[var13 + -1][var14] = 2;
                class45.field814[var13 + -1][var14] = var31;
            }
            if (~var13 > -103 && ~class100.field1647[var13 + 1][var14] == -1 && ~(var19[var13 - -2][var14] & 19661187) == -1 && ~(19661280 & var19[var13 + 2][var14 - -1]) == -1) {
                class238.field3866[var33] = var13 + 1;
                class148.field2387[var33] = var14;
                class100.field1647[var13 + 1][var14] = 8;
                class45.field814[var13 + 1][var14] = var31;
                var33 = var33 + 1 & 4095;
            }
            if (~var14 < -1 && class100.field1647[var13][var14 - 1] == 0 && ~(var19[var13][var14 + -1] & 19661070) == -1 && ~(var19[var13 + 1][var14 + -1] & 19661187) == -1) {
                class238.field3866[var33] = var13;
                class148.field2387[var33] = var14 - 1;
                class100.field1647[var13][var14 + -1] = 1;
                class45.field814[var13][var14 + -1] = var31;
                var33 = var33 + 1 & 4095;
            }
            if (~var14 > -103 && ~class100.field1647[var13][var14 + 1] == -1 && (19661112 & var19[var13][var14 - -2]) == 0 && (var19[var13 + 1][var14 - -2] & 19661280) == 0) {
                class238.field3866[var33] = var13;
                class148.field2387[var33] = var14 + 1;
                class100.field1647[var13][var14 + 1] = 4;
                class45.field814[var13][var14 + 1] = var31;
                var33 = var33 + 1 & 4095;
            }
            if (~var13 < -1 && ~var14 < -1 && ~class100.field1647[var13 + -1][var14 + -1] == -1 && (var19[var13 - 1][var14] & 19661112) == 0 && ~(var19[var13 + -1][var14 + -1] & 19661070) == -1 && (19661187 & var19[var13][var14 - 1]) == 0) {
                class238.field3866[var33] = var13 - 1;
                class148.field2387[var33] = var14 + -1;
                var33 = 4095 & var33 - -1;
                class100.field1647[var13 - 1][var14 + -1] = 3;
                class45.field814[var13 - 1][var14 - 1] = var31;
            }
            if (~var13 > -103 && var14 > 0 && ~class100.field1647[var13 - -1][var14 + -1] == -1 && (var19[var13 + 1][var14 + -1] & 19661070) == 0 && (19661187 & var19[var13 + 2][var14 + -1]) == 0 && ~(19661280 & var19[var13 + 2][var14]) == -1) {
                class238.field3866[var33] = var13 + 1;
                class148.field2387[var33] = var14 + -1;
                var33 = 4095 & var33 - -1;
                class100.field1647[var13 + 1][var14 + -1] = 9;
                class45.field814[var13 + 1][var14 + -1] = var31;
            }
            if (var13 > 0 && var14 < 102 && ~class100.field1647[var13 + -1][var14 + 1] == -1 && (var19[var13 + -1][var14 + 1] & 19661070) == 0 && ~(var19[var13 + -1][var14 + 2] & 19661112) == -1 && (var19[var13][var14 + 2] & 19661280) == 0) {
                class238.field3866[var33] = var13 + -1;
                class148.field2387[var33] = var14 + 1;
                var33 = 4095 & var33 - -1;
                class100.field1647[var13 + -1][var14 + 1] = 6;
                class45.field814[var13 + -1][var14 - -1] = var31;
            }
            if (~var13 > -103 && var14 < 102 && ~class100.field1647[var13 + 1][var14 + 1] == -1 && (19661112 & var19[var13 + 1][var14 + 2]) == 0 && ~(var19[var13 + 2][var14 + 2] & 19661280) == -1 && (var19[var13 + 2][var14 + 1] & 19661187) == 0) {
                class238.field3866[var33] = var13 + 1;
                class148.field2387[var33] = var14 + 1;
                var33 = var33 + 1 & 4095;
                class100.field1647[var13 + 1][var14 + 1] = 12;
                class45.field814[var13 + 1][var14 + 1] = var31;
            }
        }
        class84.field1317 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = -var22 + arg3; ~(arg3 - -var22) <= ~var23; ++var23) {
                for (int var24 = arg2 - var22; var24 <= arg2 + var22; ++var24) {
                    if (~var23 <= -1 && var24 >= 0 && var23 < 104 && var24 < 104 && class45.field814[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg3) {
                            var25 = arg3 - var23;
                        } else if (arg3 - -arg8 - 1 < var23) {
                            var25 = -arg8 + 1 + -arg3 + var23;
                        }
                        int var26 = 0;
                        if (~arg2 < ~var24) {
                            var26 = -var24 + arg2;
                        } else if (arg2 - -arg4 + -1 < var24) {
                            var26 = -arg2 + -arg4 + var24 + 1;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (~var27 > ~var20 || var20 == var27 && ~class45.field814[var23][var24] > ~var21) {
                            var20 = var27;
                            var21 = class45.field814[var23][var24];
                            var14 = var24;
                            var13 = var23;
                        }
                    }
                }
            }
            if (~var20 == -1001) {
                return false;
            }
            if (arg0 == var13 && ~arg9 == ~var14) {
                return false;
            }
            class84.field1317 = 1;
        }
        byte var28 = 0;
        class238.field3866[var28] = var13;
        int var34 = var28 + 1;
        class148.field2387[var28] = var14;
        int var29;
        int var30 = var29 = class100.field1647[var13][var14];
        while (arg0 != var13 || ~arg9 != ~var14) {
            if (~var29 != ~var30) {
                class238.field3866[var34] = var13;
                class148.field2387[var34++] = var14;
                var29 = var30;
            }
            if ((1 & var30) != 0) {
                ++var14;
            } else if (~(4 & var30) != -1) {
                --var14;
            }
            if ((var30 & 2) != 0) {
                ++var13;
            } else if ((var30 & 8) != 0) {
                --var13;
            }
            var30 = class100.field1647[var13][var14];
        }
        if (~var34 < -1) {
            class209.method1445(var34, arg7, true);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBIILlb;IIIIILoi;III)V")
    private final void method283(int arg0, int arg1, byte arg2, int arg3, int arg4, class130 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class80 arg11, int arg12, int arg13, int arg14) {
        int var16 = arg4 * arg4 + arg14 * arg14;
        ++field534;
        if (~var16 <= -17 && var16 <= 360000) {
            int var17 = 2047 & (int) (325.949D * Math.atan2((double) arg14, (double) arg4));
            class80 var18 = class54.method407(arg11, -25830, super.field3341, arg7, super.field3389, super.field3350, var17);
            if (arg2 != 75) {
                this.method118((byte) -5);
            }
            if (var18 != null) {
                var18.method117(0, arg8, arg9, arg1, arg10, arg6, arg13, arg0, -1L, arg3, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field533;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10) {
        ++field508;
        if (this.field528 != null) {
            class181 var13 = ~super.field3378 != 0 && ~super.field3406 == -1 ? class49.method384(super.field3378, -117) : null;
            class181 var14 = super.field3338 == -1 || this.field516 || super.field3338 == this.method1435(0).field3988 && var13 != null ? null : class49.method384(super.field3338, 70);
            class80 var15 = this.field528.method801(super.field3318, var13, true, -21172, super.field3363, super.field3387, super.field3386, super.field3331, super.field3334, super.field3354, var14);
            int var16 = class103.method752(8);
            if (~class117.field1934 != -1 && var16 < 50) {
                int var17 = -var16 + 50;
                while (~class126.field2037 > ~var17) {
                    class71.field1161[class126.field2037] = new byte[102400];
                    ++class126.field2037;
                }
                while (class126.field2037 > var17) {
                    --class126.field2037;
                    class71.field1161[class126.field2037] = null;
                }
            }
            if (var15 != null) {
                super.field3388 = var15.method119();
                if (class78.field1254 && (this.field528.field1820 == -1 || class204.method1402((byte) 77, this.field528.field1820).field1712)) {
                    class80 var18 = class98.method723(240, super.field3341, 0, var15, super.field3396, var14 == null ? var13 : var14, super.field3389, 1, arg0, 28, var14 == null ? super.field3386 : super.field3331, super.field3350, 0, 160);
                    var18.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class130) null);
                }
                if (class167.field2655 == this) {
                    for (int var19 = class156.field2539.length - 1; ~var19 <= -1; --var19) {
                        class60 var20 = class156.field2539[var19];
                        if (var20 != null && var20.field982 != -1) {
                            if (var20.field981 == 1 && ~var20.field994 <= -1 && class137.field2260.length > var20.field994) {
                                class15 var21 = class137.field2260[var20.field994];
                                if (var21 != null) {
                                    int var22 = var21.field3389 / 32 + -(class167.field2655.field3389 / 32);
                                    int var23 = var21.field3341 / 32 + -(class167.field2655.field3341 / 32);
                                    this.method283(arg7, arg3, (byte) 75, arg9, var23, (class130) null, arg5, var20.field982, arg1, arg2, arg4, var15, arg0, arg6, var22);
                                }
                            }
                            if (var20.field981 == 2) {
                                int var24 = (-class50.field884 + var20.field996) * 4 + 2 + -(class167.field2655.field3389 / 32);
                                int var25 = (-class214.field3501 + var20.field987) * 4 - (class167.field2655.field3341 / 32 + -2);
                                this.method283(arg7, arg3, (byte) 75, arg9, var25, (class130) null, arg5, var20.field982, arg1, arg2, arg4, var15, arg0, arg6, var24);
                            }
                            if (var20.field981 == 10 && ~var20.field994 <= -1 && var20.field994 < class35.field548.length) {
                                class33 var26 = class35.field548[var20.field994];
                                if (var26 != null) {
                                    int var27 = var26.field3341 / 32 - class167.field2655.field3341 / 32;
                                    int var28 = var26.field3389 / 32 + -(class167.field2655.field3389 / 32);
                                    this.method283(arg7, arg3, (byte) 75, arg9, var27, (class130) null, arg5, var20.field982, arg1, arg2, arg4, var15, arg0, arg6, var28);
                                }
                            }
                        }
                    }
                }
                this.method1434(2, var15);
                class80 var29 = null;
                this.method1436(arg0, false, var15);
                if (!this.field516 && super.field3352 != -1 && ~super.field3366 != 0) {
                    class188 var30 = class277.method1862(super.field3352, 78);
                    var29 = var30.method1283(super.field3347, true, super.field3366, super.field3323);
                    if (var29 != null) {
                        var29.method568(0, -super.field3410, 0);
                        if (var30.field3046) {
                            if (class155.field2512 != 0) {
                                var29.method565(class155.field2512);
                            }
                            if (class87.field1390 != 0) {
                                var29.method577(class87.field1390);
                            }
                            if (~class193.field3093 != -1) {
                                var29.method568(0, class193.field3093, 0);
                            }
                        }
                    }
                }
                class80 var31 = null;
                if (!this.field516 && super.field3391 != null) {
                    if (~super.field3319 >= ~class222.field3682) {
                        super.field3391 = null;
                    }
                    if (~class222.field3682 <= ~super.field3398 && class222.field3682 < super.field3319) {
                        if (!(super.field3391 instanceof class148)) {
                            var31 = (class80) super.field3391;
                        } else {
                            var31 = (class80) ((class148) super.field3391).method1013((byte) -79);
                        }
                        var31.method568(-super.field3389 + super.field3409, -super.field3350 + super.field3336, -super.field3341 + super.field3326);
                        if (~super.field3322 != -513) {
                            if (~super.field3322 == -1025) {
                                var31.method575();
                            } else if (super.field3322 == 1536) {
                                var31.method561();
                            }
                        } else {
                            var31.method581();
                        }
                    }
                }
                if (var29 != null) {
                    var15 = ((class187) var15).method1270(var29);
                }
                if (var31 != null) {
                    var15 = ((class187) var15).method1270(var31);
                }
                var15.field1270 = true;
                var15.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3384);
                if (var31 != null) {
                    if (super.field3322 != 512) {
                        if (~super.field3322 == -1025) {
                            var31.method575();
                        } else if (super.field3322 == 1536) {
                            var31.method581();
                        }
                    } else {
                        var31.method561();
                    }
                    var31.method568(-super.field3409 + super.field3389, super.field3350 - super.field3336, -super.field3326 + super.field3341);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)Ljava/lang/String;")
    public final String method284(int arg0) {
        ++field523;
        String var2 = this.field525;
        if (class241.field3896 != null) {
            var2 = class241.field3896[this.field529] + var2;
        }
        if (arg0 != 0) {
            return null;
        } else {
            if (class108.field1788 != null) {
                var2 = var2 + class108.field1788[this.field529];
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Log;B)V")
    public final void method285(class221 arg0, byte arg1) {
        ++field507;
        arg0.field3655 = 0;
        int var3 = arg0.method1517((byte) -96);
        int var4 = super.method278(0);
        this.method1438((7 & var3 >> 3) + 1, (byte) -119);
        this.field529 = (255 & var3) >> 6;
        int var5 = var3 & 1;
        super.field3389 += 64 * (this.method278(arg1 + 99) - var4);
        boolean var6 = ~(4 & var3) != -1;
        super.field3341 += (-var4 + this.method278(0)) * 64;
        int var7 = -1;
        this.field526 = arg0.method1535((byte) -73);
        this.field531 = arg0.method1535((byte) -62);
        int[] var8 = new int[12];
        this.field505 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method1517((byte) -96);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1517((byte) -96);
                int var12 = (var10 << 8) - -var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method1521((byte) 113);
                    this.field505 = arg0.method1517((byte) -96);
                    break;
                }
                if (var12 >= 32768) {
                    int var24 = class278.field4387[var12 + -32768];
                    var8[var9] = class220.method1495(var24, 1073741824);
                    int var25 = class83.method595(var24, -122).field183;
                    if (~var25 != -1) {
                        this.field505 = var25;
                    }
                } else {
                    var8[var9] = class220.method1495(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var23 = arg0.method1517((byte) -96);
            if (var23 < 0 || var23 >= class149.field2392[var14].length) {
                var23 = 0;
            }
            var13[var14] = var23;
        }
        super.field3349 = arg0.method1521((byte) 113);
        long var15 = arg0.method1507(-119);
        this.field525 = class118.method862(true, var15);
        if (arg1 == -99) {
            this.field519 = arg0.method1517((byte) -96);
            if (!var6) {
                this.field518 = 0;
                this.field509 = arg0.method1517((byte) -96);
                this.field517 = arg0.method1517((byte) -96);
                if (this.field517 == 255) {
                    this.field517 = -1;
                }
            } else {
                this.field518 = arg0.method1521((byte) 113);
                this.field517 = -1;
                this.field509 = this.field519;
            }
            int var17 = this.field510;
            this.field510 = arg0.method1517((byte) -96);
            if (~this.field510 != -1) {
                int var18 = this.field504;
                int var19 = this.field513;
                int var20 = this.field511;
                int var21 = this.field524;
                this.field511 = arg0.method1521((byte) 113);
                this.field524 = arg0.method1521((byte) 113);
                this.field513 = arg0.method1521((byte) 113);
                this.field504 = arg0.method1521((byte) 113);
                if (~this.field510 != ~var17 || ~this.field511 != ~var20 || this.field524 != var21 || this.field513 != var19 || ~this.field504 != ~var18) {
                    class224.method1577((byte) -89, this);
                }
            } else {
                class167.method1148((byte) 88, this);
            }
            if (this.field528 == null) {
                this.field528 = new class110();
            }
            int var22 = this.field528.field1820;
            this.field528.method807(var13, (byte) -125, var7, super.field3349, var8, var5 == 1);
            if (~var7 != ~var22) {
                super.field3389 = super.field3340[0] * 128 + this.method278(0) * 64;
                super.field3341 = super.field3321[0] * 128 - -(64 * this.method278(0));
            }
            if (super.field3384 != null) {
                super.field3384.method923();
            }
        }
    }
}
