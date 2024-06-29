import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class204 extends class123 {

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    private int field3587 = 4096;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "I")
    private int field3592 = 2048;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    private int field3594 = 12288;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    private int field3585 = 0;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
    private int field3601 = 8192;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "I")
    private int field3606 = 0;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "I")
    private int field3605 = 2048;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "Leb;")
    public static class230 field3600 = class68.method589(0, "<col=ffb000>");

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Leb;")
    private static class230 field3599 = class68.method589(0, "Take");

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "Leb;")
    public static class230 field3598 = class68.method589(0, "(Y<)4col>");

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "Leb;")
    public static class230 field3589 = field3599;

    @OriginalMember(owner = "client!pa", name = "vb", descriptor = "[Leb;")
    public static class230[] field3608 = new class230[100];

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!pa", name = "ub", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lpf;")
    public static class273 field3604;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "[Leh;")
    public static class80[] field3597;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public static void method1427(int arg0) {
        field3604 = null;
        field3608 = null;
        field3600 = null;
        field3599 = null;
        if (arg0 == 500) {
            field3589 = null;
            field3598 = null;
            field3597 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1428(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class30.field553 = arg1;
        class117.field2102 = arg2;
        class108.field1945 = arg3;
        class176.field3090 = new class233[arg0][class30.field553][class117.field2102];
        class237.field4098 = new int[arg0][class30.field553 + 1][class117.field2102 + 1];
        if (arg4) {
            class228.field3938 = new class233[1][class30.field553][class117.field2102];
            class247.field4392 = new int[class30.field553][class117.field2102];
            class168.field2976 = new int[1][class30.field553 + 1][class117.field2102 + 1];
        } else {
            class228.field3938 = null;
            class247.field4392 = null;
            class168.field2976 = null;
        }
        class182.method1313(false);
        class80.field1456 = new class221[500];
        class120.field2119 = 0;
        class116.field2093 = new class221[500];
        class27.field506 = 0;
        class16.field359 = new int[arg0][class30.field553 + 1][class117.field2102 + 1];
        class61.field1175 = new class111[5000];
        class166.field2933 = 0;
        class270.field4774 = new class111[100];
        class13.field255 = new boolean[class108.field1945 + class108.field1945 + 1][class108.field1945 + class108.field1945 + 1];
        class245.field4320 = new boolean[class108.field1945 + class108.field1945 + 2][class108.field1945 + class108.field1945 + 2];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            this.field3594 = -126;
        }
        ++field3602;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3601 = arg1.method161(4);
                                }
                            } else {
                                this.field3587 = arg1.method161(4);
                            }
                        } else {
                            this.field3594 = arg1.method161(4);
                        }
                    } else {
                        this.field3605 = arg1.method161(4);
                    }
                } else {
                    this.field3606 = arg1.method161(4);
                }
            } else {
                this.field3585 = arg1.method161(4);
            }
        } else {
            this.field3592 = arg1.method161(4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1429(int arg0, int arg1, boolean arg2) {
        ++field3596;
        int var4 = (-arg0 + arg1) * this.field3594 >> 12;
        int var5 = class72.field1320[(1048026 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3594;
        int var7 = (var6 << 12) / this.field3601;
        int var8 = this.field3587 * var7 >> 12;
        if (arg2) {
            this.method4(-16, (byte) -66);
        }
        return ~(arg0 + arg1) > ~var8 && -var8 < arg0 - -arg1;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        ++field3586;
        if (arg0 == 0) {
            class210.method1466(true);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var31 = 0; ~var31 > -105; ++var31) {
                class41.field750[var12][var31] = 0;
                class218.field3761[var12][var31] = 99999999;
            }
        }
        ++field3590;
        class41.field750[arg2][arg9] = 99;
        class218.field3761[arg2][arg9] = 0;
        int var13 = arg2;
        if (arg6 != -19886) {
            return true;
        } else {
            int var14 = arg9;
            byte var15 = 0;
            int var16 = 0;
            class41.field757[var15] = arg2;
            boolean var17 = false;
            int var32 = var15 + 1;
            class117.field2105[var15] = arg9;
            int[][] var18 = class112.field2007[class124.field2174].field2085;
            while (~var32 != ~var16) {
                var14 = class117.field2105[var16];
                var13 = class41.field757[var16];
                var16 = var16 + 1 & 4095;
                if (~arg1 == ~var13 && arg10 == var14) {
                    var17 = true;
                    break;
                }
                if (arg7 != 0) {
                    if ((~arg7 > -6 || ~arg7 == -11) && class112.field2007[class124.field2174].method926(arg10, var14, arg5, var13, 2, arg7 + -1, 19661064, arg1)) {
                        var17 = true;
                        break;
                    }
                    if (~arg7 > -11 && class112.field2007[class124.field2174].method920(var14, var13, (byte) -103, 2, arg1, arg5, arg7 + -1, arg10)) {
                        var17 = true;
                        break;
                    }
                }
                if (arg4 != 0 && ~arg3 != -1 && class112.field2007[class124.field2174].method928((byte) 74, arg4, arg10, var13, var14, 2, arg8, arg3, arg1)) {
                    var17 = true;
                    break;
                }
                int var30 = class218.field3761[var13][var14] + 1;
                if (~var13 < -1 && ~class41.field750[var13 + -1][var14] == -1 && (var18[var13 + -1][var14] & 19661070) == 0 && ~(var18[var13 + -1][var14 + 1] & 19661112) == -1) {
                    class41.field757[var32] = var13 + -1;
                    class117.field2105[var32] = var14;
                    var32 = var32 + 1 & 4095;
                    class41.field750[var13 + -1][var14] = 2;
                    class218.field3761[var13 - 1][var14] = var30;
                }
                if (~var13 > -103 && ~class41.field750[var13 + 1][var14] == -1 && (var18[var13 - -2][var14] & 19661187) == 0 && (var18[var13 + 2][var14 + 1] & 19661280) == 0) {
                    class41.field757[var32] = var13 + 1;
                    class117.field2105[var32] = var14;
                    var32 = var32 + 1 & 4095;
                    class41.field750[var13 + 1][var14] = 8;
                    class218.field3761[var13 + 1][var14] = var30;
                }
                if (~var14 < -1 && class41.field750[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 19661070) == 0 && (var18[var13 + 1][var14 + -1] & 19661187) == 0) {
                    class41.field757[var32] = var13;
                    class117.field2105[var32] = var14 - 1;
                    var32 = var32 - -1 & 4095;
                    class41.field750[var13][var14 + -1] = 1;
                    class218.field3761[var13][var14 - 1] = var30;
                }
                if (var14 < 102 && ~class41.field750[var13][var14 - -1] == -1 && (var18[var13][var14 + 2] & 19661112) == 0 && ~(19661280 & var18[var13 + 1][var14 + 2]) == -1) {
                    class41.field757[var32] = var13;
                    class117.field2105[var32] = var14 + 1;
                    class41.field750[var13][var14 - -1] = 4;
                    class218.field3761[var13][var14 + 1] = var30;
                    var32 = var32 + 1 & 4095;
                }
                if (var13 > 0 && var14 > 0 && ~class41.field750[var13 - 1][var14 + -1] == -1 && ~(19661112 & var18[var13 + -1][var14]) == -1 && ~(var18[var13 - 1][var14 + -1] & 19661070) == -1 && ~(var18[var13][var14 - 1] & 19661187) == -1) {
                    class41.field757[var32] = var13 + -1;
                    class117.field2105[var32] = var14 + -1;
                    var32 = var32 + 1 & 4095;
                    class41.field750[var13 - 1][var14 + -1] = 3;
                    class218.field3761[var13 + -1][var14 + -1] = var30;
                }
                if (var13 < 102 && var14 > 0 && ~class41.field750[var13 + 1][var14 + -1] == -1 && (var18[var13 + 1][var14 + -1] & 19661070) == 0 && ~(var18[var13 + 2][var14 + -1] & 19661187) == -1 && ~(19661280 & var18[var13 + 2][var14]) == -1) {
                    class41.field757[var32] = var13 + 1;
                    class117.field2105[var32] = var14 - 1;
                    class41.field750[var13 + 1][var14 + -1] = 9;
                    class218.field3761[var13 + 1][var14 + -1] = var30;
                    var32 = var32 + 1 & 4095;
                }
                if (~var13 < -1 && ~var14 > -103 && ~class41.field750[var13 + -1][var14 + 1] == -1 && ~(var18[var13 + -1][var14 + 1] & 19661070) == -1 && ~(19661112 & var18[var13 + -1][var14 + 2]) == -1 && ~(var18[var13][var14 - -2] & 19661280) == -1) {
                    class41.field757[var32] = var13 - 1;
                    class117.field2105[var32] = var14 - -1;
                    var32 = 4095 & var32 + 1;
                    class41.field750[var13 - 1][var14 + 1] = 6;
                    class218.field3761[var13 + -1][var14 - -1] = var30;
                }
                if (~var13 > -103 && var14 < 102 && class41.field750[var13 + 1][var14 + 1] == 0 && ~(var18[var13 + 1][var14 + 2] & 19661112) == -1 && (var18[var13 - -2][var14 + 2] & 19661280) == 0 && ~(19661187 & var18[var13 - -2][var14 + 1]) == -1) {
                    class41.field757[var32] = var13 + 1;
                    class117.field2105[var32] = var14 + 1;
                    class41.field750[var13 + 1][var14 + 1] = 12;
                    var32 = 4095 & var32 + 1;
                    class218.field3761[var13 + 1][var14 + 1] = var30;
                }
            }
            class238.field4115 = 0;
            if (!var17) {
                if (!arg11) {
                    return false;
                }
                int var19 = 1000;
                int var20 = 100;
                byte var21 = 10;
                for (int var22 = -var21 + arg1; arg1 + var21 >= var22; ++var22) {
                    for (int var23 = -var21 + arg10; arg10 - -var21 >= var23; ++var23) {
                        if (~var22 <= -1 && var23 >= 0 && var22 < 104 && var23 < 104 && ~class218.field3761[var22][var23] > -101) {
                            int var24 = 0;
                            if (var22 < arg1) {
                                var24 = -var22 + arg1;
                            } else if (~var22 < ~(arg4 + -1 + arg1)) {
                                var24 = -arg1 + -arg4 + var22 + 1;
                            }
                            int var25 = 0;
                            if (~var23 <= ~arg10) {
                                if (~var23 < ~(arg3 + -1 + arg10)) {
                                    var25 = -arg10 - arg3 + var23 + 1;
                                }
                            } else {
                                var25 = -var23 + arg10;
                            }
                            int var26 = var24 * var24 + var25 * var25;
                            if (~var26 > ~var19 || var19 == var26 && ~var20 < ~class218.field3761[var22][var23]) {
                                var14 = var23;
                                var20 = class218.field3761[var22][var23];
                                var19 = var26;
                                var13 = var22;
                            }
                        }
                    }
                }
                if (var19 == 1000) {
                    return false;
                }
                if (arg2 == var13 && ~arg9 == ~var14) {
                    return false;
                }
                class238.field4115 = 1;
            }
            byte var27 = 0;
            class41.field757[var27] = var13;
            int var33 = var27 + 1;
            class117.field2105[var27] = var14;
            int var28;
            int var29 = var28 = class41.field750[var13][var14];
            while (arg2 != var13 || arg9 != var14) {
                if (var28 != var29) {
                    var28 = var29;
                    class41.field757[var33] = var13;
                    class117.field2105[var33++] = var14;
                }
                if (~(2 & var29) != -1) {
                    ++var13;
                } else if ((var29 & 8) != 0) {
                    --var13;
                }
                if (~(1 & var29) == -1) {
                    if (~(var29 & 4) != -1) {
                        --var14;
                    }
                } else {
                    ++var14;
                }
                var29 = class41.field750[var13][var14];
            }
            if (var33 > 0) {
                class264.method1833(arg0, var33, (byte) 65);
                return true;
            } else if (~arg0 == -2) {
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZII)Z")
    private final boolean method1431(boolean arg0, int arg1, int arg2) {
        ++field3595;
        int var4 = (arg1 + arg2) * this.field3594 >> 12;
        int var5 = class72.field1320[(var4 * 255 & 1046810) >> 12];
        int var6 = (var5 << 12) / this.field3594;
        int var7 = (var6 << 12) / this.field3601;
        int var8 = this.field3587 * var7 >> 12;
        if (!arg0) {
            return true;
        } else {
            return arg2 - arg1 < var8 && -var8 < -arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class191 var10 = null;
        ++field3588;
        for (class191 var11 = (class191) class222.field3806.method839(arg5 + 10039); var11 != null; var11 = (class191) class222.field3806.method834((byte) 82)) {
            if (~var11.field3382 == ~arg8 && var11.field3381 == arg1 && ~var11.field3377 == ~arg7 && var11.field3380 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class191();
            var10.field3380 = arg4;
            var10.field3377 = arg7;
            var10.field3382 = arg8;
            var10.field3381 = arg1;
            class48.method400(1261384544, var10);
            class222.field3806.method843(-5, var10);
        }
        var10.field3375 = arg3;
        var10.field3368 = arg6;
        if (arg5 == -9911) {
            var10.field3366 = arg0;
            var10.field3367 = arg9;
            var10.field3363 = arg2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)Z")
    public static final boolean method1433(int arg0, int arg1, int arg2) {
        if (arg1 != -3537) {
            method1428(55, 13, -128, -13, true);
        }
        ++field3591;
        return (1 & arg2 >> arg0 - -1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int[] var3 = super.field2160.method1323((byte) 62, arg0);
        if (super.field2160.field3243) {
            int var4 = class154.field2753[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class140.field2505; ++var5) {
                int var6 = class214.field3705[var5] + -2048;
                int var7 = var4 - -this.field3605;
                int var8 = this.field3606 + var6;
                int var9 = var6 - -this.field3592;
                int var10 = ~var9 > 2047 ? var9 + 4096 : var9;
                int var11 = ~var10 >= -2049 ? var10 : var10 + -4096;
                int var12 = this.field3585 + var4;
                int var13 = var12 < -2048 ? var12 + 4096 : var12;
                int var14 = var8 < -2048 ? var8 - -4096 : var8;
                int var15 = var7 >= -2048 ? var7 : var7 + 4096;
                int var16 = var14 > 2048 ? var14 + -4096 : var14;
                int var17 = ~var15 >= -2049 ? var15 : var15 + -4096;
                int var18 = ~var13 < -2049 ? var13 + -4096 : var13;
                var3[var5] = !this.method1429(var11, var18, false) && !this.method1431(true, var16, var17) ? 0 : 4096;
            }
        }
        ++field3584;
        int var19 = -43 % ((-24 - arg1) / 57);
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIBIZLkk;)V")
    public static final void method1434(int arg0, int arg1, byte arg2, int arg3, boolean arg4, class223 arg5) {
        class61.field1179 = arg3;
        class168.field2975 = arg0;
        class141.field2533 = arg5;
        class144.field2587 = arg1;
        class266.field4730 = 10000;
        class210.field3666 = arg4;
        if (arg2 <= 23) {
            method1427(57);
        }
        class173.field3058 = 1;
        ++field3593;
    }
}
