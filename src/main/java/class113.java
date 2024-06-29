import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class113 extends class42 {

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    private final int field2023;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    private final int field2031;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    private final int field2032;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    private final int field2029;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "Leb;")
    public static class230 field2030 = class68.method589(0, "hint_mapmarkers");

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "Leb;")
    public static class230 field2027 = class68.method589(0, "rot:");

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "Leb;")
    public static class230 field2033 = class68.method589(0, "um");

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lpk;")
    public static class98 field2026 = new class98();

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "[I")
    public static int[] field2034;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JB)Leb;")
    public static final class230 method906(long arg0, byte arg1) {
        ++field2021;
        if (arg1 >= -83) {
            return null;
        } else if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                long var3 = arg0;
                int var5 = 0;
                while (var3 != 0L) {
                    ++var5;
                    var3 /= 37L;
                }
                byte[] var6 = new byte[var5];
                while (arg0 != 0L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    --var5;
                    var6[var5] = class34.field638[(int) (-(arg0 * 37L) + var8)];
                }
                class230 var7 = new class230();
                var7.field3988 = var6;
                var7.field3990 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method907(int arg0) {
        field2030 = null;
        field2026 = null;
        if (arg0 != -7759) {
            method906(-99L, (byte) 31);
        }
        field2027 = null;
        field2034 = null;
        field2033 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIZIIIBIII)Z")
    public static final boolean method908(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12) {
        ++field2022;
        for (int var13 = 0; ~var13 > -105; ++var13) {
            for (int var40 = 0; ~var40 > -105; ++var40) {
                class41.field750[var13][var40] = 0;
                class218.field3761[var13][var40] = 99999999;
            }
        }
        class41.field750[arg1][arg12] = 99;
        int var14 = arg1;
        byte var15 = 0;
        class218.field3761[arg1][arg12] = 0;
        int var16 = 0;
        class41.field757[var15] = arg1;
        int var17 = arg12;
        boolean var18 = false;
        int var41 = var15 + 1;
        class117.field2105[var15] = arg12;
        int[][] var19 = class112.field2007[class124.field2174].field2085;
        label372: while (var41 != var16) {
            var17 = class117.field2105[var16];
            var14 = class41.field757[var16];
            var16 = 4095 & var16 + 1;
            if (~arg10 == ~var14 && arg4 == var17) {
                var18 = true;
                break;
            }
            if (arg6 != 0) {
                if ((~arg6 > -6 || arg6 == 10) && class112.field2007[class124.field2174].method926(arg4, var17, arg8, var14, arg11, arg6 - 1, arg9 + 19660967, arg10)) {
                    var18 = true;
                    break;
                }
                if (arg6 < 10 && class112.field2007[class124.field2174].method920(var17, var14, (byte) -103, arg11, arg10, arg8, arg6 + -1, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg2 != -1 && arg7 != 0 && class112.field2007[class124.field2174].method928((byte) 49, arg2, arg4, var14, var17, arg11, arg0, arg7, arg10)) {
                var18 = true;
                break;
            }
            int var31 = class218.field3761[var14][var17] + 1;
            if (~var14 < -1 && ~class41.field750[var14 + -1][var17] == -1 && (19661070 & var19[var14 + -1][var17]) == 0 && (19661112 & var19[var14 + -1][arg11 + var17 + -1]) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg11 + -1 <= var32) {
                        class41.field757[var41] = var14 + -1;
                        class117.field2105[var41] = var17;
                        var41 = var41 + 1 & 4095;
                        class41.field750[var14 + -1][var17] = 2;
                        class218.field3761[var14 + -1][var17] = var31;
                        break;
                    }
                    if ((19661118 & var19[var14 + -1][var17 + var32]) != 0) {
                        break;
                    }
                    ++var32;
                }
            }
            if (~var14 > -103 && class41.field750[var14 + 1][var17] == 0 && ~(19661187 & var19[var14 - -arg11][var17]) == -1 && (var19[arg11 + var14][var17 + -1 - -arg11] & 19661280) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg11 - 1) {
                        class41.field757[var41] = var14 + 1;
                        class117.field2105[var41] = var17;
                        class41.field750[var14 + 1][var17] = 8;
                        var41 = 4095 & var41 + 1;
                        class218.field3761[var14 + 1][var17] = var31;
                        break;
                    }
                    if (~(19661283 & var19[arg11 + var14][var17 + var33]) != -1) {
                        break;
                    }
                    ++var33;
                }
            }
            if (~var17 < -1 && class41.field750[var14][var17 + -1] == 0 && ~(19661070 & var19[var14][var17 - 1]) == -1 && ~(var19[var14 - -arg11 - 1][var17 - 1] & 19661187) == -1) {
                int var34 = 1;
                while (true) {
                    if (arg11 - 1 <= var34) {
                        class41.field757[var41] = var14;
                        class117.field2105[var41] = var17 + -1;
                        class41.field750[var14][var17 - 1] = 1;
                        var41 = 4095 & var41 + 1;
                        class218.field3761[var14][var17 + -1] = var31;
                        break;
                    }
                    if (~(var19[var14 + var34][var17 - 1] & 19661199) != -1) {
                        break;
                    }
                    ++var34;
                }
            }
            if (var17 < 102 && class41.field750[var14][var17 + 1] == 0 && (var19[var14][arg11 + var17] & 19661112) == 0 && (var19[var14 + -1 - -arg11][var17 - -arg11] & 19661280) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg11 - 1) {
                        class41.field757[var41] = var14;
                        class117.field2105[var41] = var17 + 1;
                        class41.field750[var14][var17 + 1] = 4;
                        var41 = 4095 & var41 - -1;
                        class218.field3761[var14][var17 + 1] = var31;
                        break;
                    }
                    if ((19661304 & var19[var14 + var35][arg11 + var17]) != 0) {
                        break;
                    }
                    ++var35;
                }
            }
            if (~var14 < -1 && var17 > 0 && ~class41.field750[var14 + -1][var17 + -1] == -1 && (19661112 & var19[var14 + -1][var17 + -1 + arg11 + -1]) == 0 && (19661070 & var19[var14 + -1][var17 + -1]) == 0 && ~(19661187 & var19[arg11 + -1 + -1 + var14][var17 + -1]) == -1) {
                int var36 = 1;
                while (true) {
                    if (~(arg11 + -1) >= ~var36) {
                        class41.field757[var41] = var14 - 1;
                        class117.field2105[var41] = var17 + -1;
                        var41 = 4095 & var41 + 1;
                        class41.field750[var14 + -1][var17 + -1] = 3;
                        class218.field3761[var14 + -1][var17 + -1] = var31;
                        break;
                    }
                    if (~(var19[var14 - 1][var17 + -1 + var36] & 19661118) != -1 || ~(var19[var14 + -1 + var36][var17 + -1] & 19661199) != -1) {
                        break;
                    }
                    ++var36;
                }
            }
            if (~var14 > -103 && var17 > 0 && ~class41.field750[var14 + 1][var17 + -1] == -1 && (var19[var14 + 1][var17 - 1] & 19661070) == 0 && (19661187 & var19[arg11 + var14][var17 + -1]) == 0 && ~(var19[arg11 + var14][var17 + -1 + -1 - -arg11] & 19661280) == -1) {
                int var37 = 1;
                while (true) {
                    if (~var37 <= ~(arg11 + -1)) {
                        class41.field757[var41] = var14 + 1;
                        class117.field2105[var41] = var17 + -1;
                        class41.field750[var14 + 1][var17 - 1] = 9;
                        var41 = var41 + 1 & 4095;
                        class218.field3761[var14 + 1][var17 + -1] = var31;
                        break;
                    }
                    if (~(var19[arg11 + var14][-1 - -var37 + var17] & 19661283) != -1 || ~(19661199 & var19[var14 + var37 + 1][var17 + -1]) != -1) {
                        break;
                    }
                    ++var37;
                }
            }
            if (~var14 < -1 && ~var17 > -103 && class41.field750[var14 + -1][var17 - -1] == 0 && (19661070 & var19[var14 + -1][var17 + 1]) == 0 && ~(19661112 & var19[var14 + -1][arg11 + var17]) == -1 && (19661280 & var19[var14][arg11 + var17]) == 0) {
                int var38 = 1;
                while (true) {
                    if (~(arg11 + -1) >= ~var38) {
                        class41.field757[var41] = var14 + -1;
                        class117.field2105[var41] = var17 + 1;
                        var41 = var41 + 1 & 4095;
                        class41.field750[var14 + -1][var17 + 1] = 6;
                        class218.field3761[var14 - 1][var17 - -1] = var31;
                        break;
                    }
                    if (~(19661118 & var19[var14 - 1][var17 - -1 - -var38]) != -1 || (19661304 & var19[var14 + -1 + var38][var17 - -arg11]) != 0) {
                        break;
                    }
                    ++var38;
                }
            }
            if (~var14 > -103 && var17 < 102 && ~class41.field750[var14 - -1][var17 + 1] == -1 && ~(19661112 & var19[var14 - -1][arg11 + var17]) == -1 && (var19[arg11 + var14][arg11 + var17] & 19661280) == 0 && ~(19661187 & var19[arg11 + var14][var17 + 1]) == -1) {
                for (int var39 = 1; arg11 + -1 > var39; ++var39) {
                    if ((19661304 & var19[var14 + var39 - -1][arg11 + var17]) != 0 || (var19[var14 - -arg11][var17 - -var39 + 1] & 19661283) != 0) {
                        continue label372;
                    }
                }
                class41.field757[var41] = var14 - -1;
                class117.field2105[var41] = var17 - -1;
                class41.field750[var14 + 1][var17 + 1] = 12;
                class218.field3761[var14 + 1][var17 - -1] = var31;
                var41 = var41 + 1 & 4095;
            }
        }
        if (arg9 != 97) {
            method906(108L, (byte) 16);
        }
        class238.field4115 = 0;
        if (!var18) {
            if (!arg5) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = -var22 + arg10; arg10 + var22 >= var23; ++var23) {
                for (int var24 = -var22 + arg4; var24 <= arg4 - -var22; ++var24) {
                    if (~var23 <= -1 && ~var24 <= -1 && var23 < 104 && ~var24 > -105 && class218.field3761[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg10 > var23) {
                            var25 = arg10 - var23;
                        } else if (var23 > arg2 + arg10 + -1) {
                            var25 = var23 - -1 - arg2 - arg10;
                        }
                        int var26 = 0;
                        if (~var24 > ~arg4) {
                            var26 = arg4 - var24;
                        } else if (arg7 + -1 + arg4 < var24) {
                            var26 = -arg7 + 1 + -arg4 + var24;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (~var20 < ~var27 || var20 == var27 && ~class218.field3761[var23][var24] > ~var21) {
                            var20 = var27;
                            var21 = class218.field3761[var23][var24];
                            var17 = var24;
                            var14 = var23;
                        }
                    }
                }
            }
            if (~var20 == -1001) {
                return false;
            }
            if (~arg1 == ~var14 && arg12 == var17) {
                return false;
            }
            class238.field4115 = 1;
        }
        byte var28 = 0;
        class41.field757[var28] = var14;
        int var42 = var28 + 1;
        class117.field2105[var28] = var17;
        int var29;
        int var30 = var29 = class41.field750[var14][var17];
        while (~arg1 != ~var14 || ~arg12 != ~var17) {
            if (var29 != var30) {
                var29 = var30;
                class41.field757[var42] = var14;
                class117.field2105[var42++] = var17;
            }
            if ((2 & var30) == 0) {
                if ((8 & var30) != 0) {
                    --var14;
                }
            } else {
                ++var14;
            }
            if ((1 & var30) == 0) {
                if (~(4 & var30) != -1) {
                    --var17;
                }
            } else {
                ++var17;
            }
            var30 = class41.field750[var14][var17];
        }
        if (~var42 < -1) {
            class264.method1833(arg3, var42, (byte) -127);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Lfk;")
    public static final class14 method909(byte arg0) {
        ++field2019;
        class14 var1 = new class14(30);
        var1.method170((byte) 125, 7);
        var1.method170((byte) 125, class196.field3510);
        var1.method170((byte) 126, !class251.field4506 ? 0 : 1);
        var1.method170((byte) 118, class42.field774 ? 1 : 0);
        var1.method170((byte) 124, !class123.field2163 ? 0 : 1);
        if (arg0 <= 82) {
            return null;
        } else {
            var1.method170((byte) 125, !class191.field3372 ? 0 : 1);
            var1.method170((byte) 113, !class154.field2748 ? 0 : 1);
            var1.method170((byte) 125, class249.field4425 ? 1 : 0);
            var1.method170((byte) 123, !class99.field1833 ? 0 : 1);
            var1.method170((byte) 122, !class263.field4672 ? 0 : 1);
            var1.method170((byte) 117, class206.field3633);
            var1.method170((byte) 126, class8.field126 ? 1 : 0);
            var1.method170((byte) 123, !class47.field837 ? 0 : 1);
            var1.method170((byte) 114, class246.field4377 ? 1 : 0);
            var1.method170((byte) 112, class23.field437);
            var1.method170((byte) 115, class127.field2228 ? 1 : 0);
            var1.method170((byte) 122, class97.field1790);
            var1.method170((byte) 114, class16.field365);
            var1.method170((byte) 123, class231.field4020);
            var1.method181(-20053, class154.field2749);
            var1.method181(-20053, class16.field371);
            var1.method170((byte) 117, 2);
            var1.method165(class8.field129, 1380186760);
            var1.method170((byte) 112, class190.field3354);
            var1.method170((byte) 116, !class18.field404 ? 0 : 1);
            return var1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
    public static final void method910(boolean arg0, int arg1) {
        class135.field2433.method1121(0, arg1);
        ++field2025;
        if (arg0) {
            class70.field1285.method1121(0, arg1);
            class245.field4259.method1121(0, arg1);
            class60.field1132.method1121(0, arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
    public final void method368(int arg0, int arg1, int arg2) {
        int var4 = this.field2032 * arg1 >> 12;
        int var5 = this.field2031 * arg1 >> 12;
        int var6 = this.field2023 * arg0 >> 12;
        ++field2035;
        int var7 = this.field2029 * arg0 >> 12;
        if (arg2 == -8259) {
            class75.method629(var5, super.field773, arg2 + 8259, var6, var7, var4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
    public final void method367(int arg0, int arg1, int arg2) {
        int var4 = this.field2032 * arg1 >> 12;
        ++field2024;
        int var5 = this.field2031 * arg1 >> 12;
        int var6 = this.field2023 * arg2 >> 12;
        int var7 = this.field2029 * arg2 >> 12;
        class89.method722(var4, var6, super.field771, var5, super.field773, super.field768, (byte) -29, var7);
        if (arg0 != 1) {
            method906(68L, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIII)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2023 = arg1;
        this.field2031 = arg2;
        this.field2032 = arg0;
        this.field2029 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)V")
    public final void method371(int arg0, int arg1, byte arg2) {
        ++field2020;
        if (arg2 > -34) {
            field2030 = null;
        }
    }
}
