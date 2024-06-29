import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class151 extends class80 {

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "J")
    public long field2708;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[Lr;")
    public static class66[] field2709 = new class66[1000];

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lcj;")
    public static class28 field2714;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)I")
    public static final int method1023(int arg0, int arg1) {
        if (arg0 != 28443) {
            method1025((class28) null, -10);
        }
        field2711++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIIIIIBIIIII)Z")
    public static final boolean method1024(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class132.field2463[var13][var40] = 0;
                class231.field4049[var13][var40] = 99999999;
            }
        }
        field2705++;
        int var14 = arg1;
        int var15 = arg9;
        class132.field2463[arg1][arg9] = 99;
        byte var16 = 0;
        class231.field4049[arg1][arg9] = 0;
        class188.field3263[var16] = arg1;
        int var41 = var16 + 1;
        class176.field3099[var16] = arg9;
        int var17 = 0;
        if (arg7 < 108) {
            field2714 = null;
        }
        int[][] var18 = class193.field3346[class196.field3401].field2976;
        boolean var19 = false;
        label372: while (var41 != var17) {
            var14 = class188.field3263[var17];
            var15 = class176.field3099[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg8 == var14 && arg2 == var15) {
                var19 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class193.field3346[class196.field3401].method1125(arg5, arg8, (byte) 108, var14, arg12, arg2, var15, arg10 - 1)) {
                    var19 = true;
                    break;
                }
                if (arg10 < 10 && class193.field3346[class196.field3401].method1128(arg8, var14, arg5, (byte) 118, arg12, arg2, var15, arg10 - 1)) {
                    var19 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg4 != 0 && class193.field3346[class196.field3401].method1114(15856, arg2, arg12, var15, arg4, var14, arg11, arg6, arg8)) {
                var19 = true;
                break;
            }
            int var31 = class231.field4049[var14][var15] + 1;
            if (var14 > 0 && class132.field2463[var14 - 1][var15] == 0 && (var18[var14 - 1][var15] & 0x12C010E) == 0 && (var18[var14 - 1][var15 + arg12 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= (arg12 - 1)) {
                        class188.field3263[var41] = var14 - 1;
                        class176.field3099[var41] = var15;
                        class132.field2463[var14 - 1][var15] = 2;
                        class231.field4049[var14 - 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class132.field2463[var14 + 1][var15] == 0 && (var18[arg12 + var14][var15] & 0x12C0183) == 0 && (var18[var14 + arg12][arg12 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg12 - 1 <= var33) {
                        class188.field3263[var41] = var14 + 1;
                        class176.field3099[var41] = var15;
                        class132.field2463[var14 + 1][var15] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class231.field4049[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var18[arg12 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class132.field2463[var14][var15 - 1] == 0 && (var18[var14][var15 - 1] & 0x12C010E) == 0 && (var18[arg12 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if ((arg12 - 1) <= var34) {
                        class188.field3263[var41] = var14;
                        class176.field3099[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class132.field2463[var14][var15 - 1] = 1;
                        class231.field4049[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var18[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class132.field2463[var14][var15 + 1] == 0 && (var18[var14][arg12 + var15] & 0x12C0138) == 0 && (var18[arg12 + var14 - 1][arg12 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if ((arg12 - 1) <= var35) {
                        class188.field3263[var41] = var14;
                        class176.field3099[var41] = var15 + 1;
                        class132.field2463[var14][var15 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class231.field4049[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var18[var14 + var35][var15 + arg12] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class132.field2463[var14 - 1][var15 - 1] == 0 && (var18[var14 - 1][arg12 + var15 - 1 - 1] & 0x12C0138) == 0 && (var18[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[arg12 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg12 - 1)) {
                        class188.field3263[var41] = var14 - 1;
                        class176.field3099[var41] = var15 - 1;
                        class132.field2463[var14 - 1][var15 - 1] = 3;
                        class231.field4049[var14 - 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var18[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class132.field2463[var14 + 1][var15 - 1] == 0 && (var18[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[var14 + arg12][var15 - 1] & 0x12C0183) == 0 && (var18[arg12 + var14][var15 + arg12 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg12 - 1 <= var37) {
                        class188.field3263[var41] = var14 + 1;
                        class176.field3099[var41] = var15 - 1;
                        class132.field2463[var14 + 1][var15 - 1] = 9;
                        class231.field4049[var14 + 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[arg12 + var14][var37 + var15 - 1] & 0x12C01E3) != 0 || (var18[var37 + var14 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class132.field2463[var14 - 1][var15 + 1] == 0 && (var18[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][arg12 + var15] & 0x12C0138) == 0 && (var18[var14][arg12 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg12 - 1) {
                        class188.field3263[var41] = var14 - 1;
                        class176.field3099[var41] = var15 + 1;
                        class132.field2463[var14 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class231.field4049[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var18[var14 - 1][var38 + var15 + 1] & 0x12C013E) != 0 || (var18[var14 + var38 - 1][arg12 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class132.field2463[var14 + 1][var15 + 1] == 0 && (var18[var14 + 1][arg12 + var15] & 0x12C0138) == 0 && (var18[var14 + arg12][arg12 + var15] & 0x12C01E0) == 0 && (var18[arg12 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg12 - 1); var39++) {
                    if ((var18[var14 + var39 + 1][arg12 + var15] & 0x12C01F8) != 0 || (var18[arg12 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class188.field3263[var41] = var14 + 1;
                class176.field3099[var41] = var15 + 1;
                class132.field2463[var14 + 1][var15 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class231.field4049[var14 + 1][var15 + 1] = var31;
            }
        }
        class173.field3050 = 0;
        if (!var19) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg8 - var22; var23 <= arg8 + var22; var23++) {
                for (int var24 = arg2 - var22; var24 <= arg2 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class231.field4049[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg8 > var23) {
                            var26 = arg8 - var23;
                        } else if (var23 > arg6 + arg8 - 1) {
                            var26 = var23 + 1 - arg8 - arg6;
                        }
                        if (arg2 > var24) {
                            var25 = arg2 - var24;
                        } else if ((arg2 + arg4 - 1) < var24) {
                            var25 = 1 - (arg2 - (var24 - arg4));
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class231.field4049[var23][var24]) {
                            var14 = var23;
                            var21 = class231.field4049[var23][var24];
                            var15 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg9 == var15) {
                return false;
            }
            class173.field3050 = 1;
        }
        byte var28 = 0;
        class188.field3263[var28] = var14;
        int var42 = var28 + 1;
        class176.field3099[var28] = var15;
        int var29;
        int var30 = var29 = class132.field2463[var14][var15];
        while (arg1 != var14 || arg9 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class188.field3263[var42] = var14;
                class176.field3099[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class132.field2463[var14][var15];
        }
        if (var42 > 0) {
            class183.method1219(var42, arg3, (byte) 124);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lcj;I)V")
    public static final void method1025(class28 arg0, int arg1) {
        class54.field947 = arg0.method132(class203.field3487, (byte) -104);
        field2713++;
        if (arg1 != 1) {
            field2707 = 52;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
    public static final void method1026(int arg0) {
        field2712++;
        class255.field4476.method1614(123);
        int var1 = -52 % ((-arg0 - 32) / 44);
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2714 = null;
        if (arg0 == 1) {
            field2709 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class151() {
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIBI)V")
    public static final void method1028(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -7) {
            method1028(-61, 57, -65, (byte) 13, 35);
        }
        field2710++;
        if (class165.field2972 <= arg2 && arg2 <= class215.field3706) {
            int var5 = class54.method368(arg4, class222.field3788, (byte) 114, class241.field4186);
            int var6 = class54.method368(arg1, class222.field3788, (byte) 114, class241.field4186);
            class196.method1278(-6, arg2, var6, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(J)V")
    public class151(long arg0) {
        this.field2708 = arg0;
    }
}
