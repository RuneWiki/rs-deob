import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class321 extends class213 {

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field4722 = 100;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lcc;")
    public static class327 field4713 = new class327(64);

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Z")
    public static boolean field4723 = false;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "C")
    private char field4718;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "Lwf;")
    public static class333 field4710;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Ljava/lang/String;")
    public String field4708;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Lgb;", line = 5)
    public static final class196 method2216(int arg0) {
        class27.field310 = 0;
        field4721++;
        int var1 = 85 % ((arg0 - 38) / 32);
        return class251.method1765(6);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lfd;I)V", line = 19)
    public final void method2217(class299 arg0, int arg1) {
        if (arg1 <= 107) {
            return;
        }
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                field4711++;
                return;
            }
            this.method2224(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 40)
    public static void method2218(int arg0) {
        if (arg0 == -1) {
            field4713 = null;
            field4710 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 55)
    public static final void method2219(int arg0, int arg1) {
        class42 var2 = class166.method1242(arg0, arg1, arg0 ^ 0xB58CAEE8);
        field4719++;
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)Z", line = 70)
    public final boolean method2220(int arg0) {
        int var2 = -93 / ((arg0 - 15) / 45);
        field4709++;
        return this.field4718 == 's';
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(CZ)Z", line = 82)
    public static final boolean method2221(char arg0, boolean arg1) {
        field4720++;
        if (!arg1) {
            method2221('G', true);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I", line = 96)
    public static final int method2222(byte arg0) {
        field4712++;
        if ((double) class38.field465 == 3.0D) {
            return 37;
        }
        if (arg0 > -118) {
            method2225((byte) 41);
        }
        if ((double) class38.field465 == 4.0D) {
            return 50;
        } else if ((double) class38.field465 == 6.0D) {
            return 75;
        } else if ((double) class38.field465 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIIIIZ)V", line = 125)
    public static final void method2223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field4706++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class277.field3967[var12][var13] = 0;
                class323.field4735[var12][var13] = 99999999;
            }
        }
        if (arg5 != 26109) {
            return;
        }
        class277.field3967[arg2][arg4] = 99;
        class323.field4735[arg2][arg4] = 0;
        int var14 = arg2;
        int var15 = arg4;
        byte var16 = 0;
        class274.field3926[var16] = arg2;
        int var37 = var16 + 1;
        class199.field2805[var16] = arg4;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class231.field3312[class56.field724].field89;
        label330: while (var37 != var17) {
            var15 = class199.field2805[var17];
            var14 = class274.field3926[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg1 == var14 && arg7 == var15) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class231.field3312[class56.field724].method51(arg7, arg10, var15, var14, (byte) -43, arg1, arg9, arg0 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class231.field3312[class56.field724].method54(arg1, var14, arg7, arg5 ^ 0x61FD, var15, arg0 - 1, arg10, arg9)) {
                    var18 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg6 != 0 && class231.field3312[class56.field724].method47(var15, arg5 ^ 0xFFFF9A02, arg8, arg9, arg7, arg1, arg6, arg3, var14)) {
                var18 = true;
                break;
            }
            int var20 = class323.field4735[var14][var15] + 1;
            if (var14 > 0 && class277.field3967[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x2C010E) == 0 && (var19[var14 - 1][arg9 + var15 - 1] & 0x2C0138) == 0) {
                int var21 = 1;
                while (true) {
                    if (arg9 - 1 <= var21) {
                        class274.field3926[var37] = var14 - 1;
                        class199.field2805[var37] = var15;
                        class277.field3967[var14 - 1][var15] = 2;
                        class323.field4735[var14 - 1][var15] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var21] & 0x2C013E) != 0) {
                        break;
                    }
                    var21++;
                }
            }
            if (var14 < 102 && class277.field3967[var14 + 1][var15] == 0 && (var19[arg9 + var14][var15] & 0x2C0183) == 0 && (var19[var14 + arg9][var15 - (1 - arg9)] & 0x2C01E0) == 0) {
                int var22 = 1;
                while (true) {
                    if (arg9 - 1 <= var22) {
                        class274.field3926[var37] = var14 + 1;
                        class199.field2805[var37] = var15;
                        var37 = var37 + 1 & 0xFFF;
                        class277.field3967[var14 + 1][var15] = 8;
                        class323.field4735[var14 + 1][var15] = var20;
                        break;
                    }
                    if ((var19[arg9 + var14][var15 + var22] & 0x2C01E3) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 > 0 && class277.field3967[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x2C010E) == 0 && (var19[var14 + arg9 - 1][var15 - 1] & 0x2C0183) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg9 - 1) {
                        class274.field3926[var37] = var14;
                        class199.field2805[var37] = var15 - 1;
                        class277.field3967[var14][var15 - 1] = 1;
                        var37 = var37 + 1 & 0xFFF;
                        class323.field4735[var14][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 + var23][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 < 102 && class277.field3967[var14][var15 + 1] == 0 && (var19[var14][var15 + arg9] & 0x2C0138) == 0 && (var19[var14 + arg9 - 1][arg9 + var15] & 0x2C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg9 - 1) {
                        class274.field3926[var37] = var14;
                        class199.field2805[var37] = var15 + 1;
                        class277.field3967[var14][var15 + 1] = 4;
                        class323.field4735[var14][var15 + 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var24][arg9 + var15] & 0x2C01F8) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var14 > 0 && var15 > 0 && class277.field3967[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x2C010E) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg9 <= var25) {
                        class274.field3926[var37] = var14 - 1;
                        class199.field2805[var37] = var15 - 1;
                        class277.field3967[var14 - 1][var15 - 1] = 3;
                        var37 = var37 + 1 & 0xFFF;
                        class323.field4735[var14 - 1][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var25 - 1] & 0x2C013E) != 0 || (var19[var25 + var14 - 1][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var14 < 102 && var15 > 0 && class277.field3967[var14 + 1][var15 - 1] == 0 && (var19[var14 + arg9][var15 - 1] & 0x2C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg9 <= var26) {
                        class274.field3926[var37] = var14 + 1;
                        class199.field2805[var37] = var15 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class277.field3967[var14 + 1][var15 - 1] = 9;
                        class323.field4735[var14 + 1][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[arg9 + var14][var26 + var15 - 1] & 0x2C01E3) != 0 || (var19[var14 + var26][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var14 > 0 && var15 < 102 && class277.field3967[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][arg9 + var15] & 0x2C0138) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg9 <= var27) {
                        class274.field3926[var37] = var14 - 1;
                        class199.field2805[var37] = var15 + 1;
                        class277.field3967[var14 - 1][var15 + 1] = 6;
                        var37 = var37 + 1 & 0xFFF;
                        class323.field4735[var14 - 1][var15 + 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var27] & 0x2C013E) != 0 || (var19[var14 + var27 - 1][var15 + arg9] & 0x2C01F8) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var14 < 102 && var15 < 102 && class277.field3967[var14 + 1][var15 + 1] == 0 && (var19[arg9 + var14][arg9 + var15] & 0x2C01E0) == 0) {
                for (int var28 = 1; var28 < arg9; var28++) {
                    if ((var19[var14 + var28][arg9 + var15] & 0x2C01F8) != 0 || (var19[arg9 + var14][var15 + var28] & 0x2C01E3) != 0) {
                        continue label330;
                    }
                }
                class274.field3926[var37] = var14 + 1;
                class199.field2805[var37] = var15 + 1;
                class277.field3967[var14 + 1][var15 + 1] = 12;
                var37 = var37 + 1 & 0xFFF;
                class323.field4735[var14 + 1][var15 + 1] = var20;
            }
        }
        if (!var18) {
            if (!arg11) {
                return;
            }
            int var29 = 1000;
            int var30 = 100;
            byte var31 = 10;
            for (int var32 = arg1 - var31; var32 <= arg1 + var31; var32++) {
                for (int var33 = arg7 - var31; var33 <= arg7 + var31; var33++) {
                    if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && class323.field4735[var32][var33] < 100) {
                        int var34 = 0;
                        if (arg1 > var32) {
                            var34 = arg1 - var32;
                        } else if ((arg1 + arg3 - 1) < var32) {
                            var34 = 1 - arg1 - (arg3 - var32);
                        }
                        int var35 = 0;
                        if (var33 < arg7) {
                            var35 = arg7 - var33;
                        } else if (var33 > (arg7 + arg6 - 1)) {
                            var35 = var33 + 1 - arg7 - arg6;
                        }
                        int var36 = var34 * var34 + var35 * var35;
                        if (var36 < var29 || var29 == var36 && var30 > class323.field4735[var32][var33]) {
                            var14 = var32;
                            var29 = var36;
                            var15 = var33;
                            var30 = class323.field4735[var32][var33];
                        }
                    }
                }
            }
            if (var29 == 1000) {
                return;
            }
            if (arg2 == var14 && arg4 == var15) {
                return;
            }
        }
        class133.field1818 = false;
        class5.field53 = var15;
        class116.field1499 = var14;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lfd;IZ)V", line = 556)
    private final void method2224(class299 arg0, int arg1, boolean arg2) {
        field4717++;
        if (arg1 == 1) {
            this.field4718 = class114.method841(false, arg0.method2104(121));
        } else if (arg1 == 2) {
            this.field4714 = arg0.method2062(-25795);
        } else if (arg1 == 5) {
            this.field4708 = arg0.method2060(-12482);
        }
        if (arg2) {
            field4710 = (class333) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)[Luj;", line = 582)
    public static final class158[] method2225(byte arg0) {
        class158[] var1 = new class158[class171.field2369];
        field4705++;
        int var2 = -115 % ((arg0 - 34) / 54);
        for (int var3 = 0; var3 < class171.field2369; var3++) {
            byte[] var4 = class338.field5276[var3];
            int var5 = class251.field3673[var3] * class184.field2508[var3];
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var6[var7] = class292.field4253[class335.method2339(255, var4[var7])];
            }
            if (class47.field623) {
                var1[var3] = new class361(class16.field201, class133.field1805, class348.field5418[var3], class119.field1578[var3], class251.field3673[var3], class184.field2508[var3], var6);
            } else {
                var1[var3] = new class11(class16.field201, class133.field1805, class348.field5418[var3], class119.field1578[var3], class251.field3673[var3], class184.field2508[var3], var6);
            }
        }
        class236.method1685(false);
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 620)
    public static final void method2226(boolean arg0) {
        class251.field3681.method1309(23, 86);
        field4716++;
        if (arg0) {
            return;
        }
        class251.field3681.method2048(class33.method213(-127), 65);
        class251.field3681.method2098(-13, class163.field2314);
        class251.field3681.method2098(-122, class192.field2660);
        class251.field3681.method2048(class24.field266, 90);
        class339.field5310++;
    }
}
