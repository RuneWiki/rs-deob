import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class250 extends class137 {

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public int field4387 = 0;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public int field4401 = -1;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Lmi;")
    public static class128 field4395 = new class128();

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "Loj;")
    public static class17 field4400 = new class17(64);

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field4402 = null;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Lhh;")
    public static class163 field4403 = class137.method1065("compass", 17);

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -101) {
            field4402 = null;
        }
        if (arg1 >= arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class85.field1605[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class85.field1605[var6][arg4] = arg2;
            }
        }
        field4389++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BZ)V")
    public static final void method1708(byte arg0, boolean arg1) {
        field4385++;
        if ((class235.field4203.field3633 >> 7) == class265.field4605 && (class235.field4203.field3615 >> 7) == class213.field3886) {
            class265.field4605 = 0;
        }
        int var2 = class95.field1791;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 <= 40) {
            method1712((class22) null, -48, 18);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class126 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class235.field4203;
            } else {
                var4 = (long) class246.field4340[var3] << 32;
                var6 = class106.field2029[class246.field4340[var3]];
            }
            if (var6 != null && var6.method24((byte) 35)) {
                var6.field2446 = false;
                if ((class210.field3801 && class95.field1791 > 200 || class95.field1791 > 50) && !arg1 && var6.field3670 == var6.field3664) {
                    var6.field2446 = true;
                }
                int var7 = var6.field3633 >> 7;
                int var8 = var6.field3615 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field2436 == null || class227.field4092 < var6.field2454 || class227.field4092 >= var6.field2428) {
                        if ((var6.field3633 & 0x7F) == 64 && (var6.field3615 & 0x7F) == 64) {
                            if (class211.field3821[var7][var8] == class114.field2145) {
                                continue;
                            }
                            class211.field3821[var7][var8] = class114.field2145;
                        }
                        var6.field3619 = class127.method1011(var6.field3615, var6.field3633, class20.field323, 29908);
                        class174.method1287(class20.field323, var6.field3633, var6.field3615, var6.field3619, 60, var6, var6.field3667, var4, var6.field3659);
                    } else {
                        var6.field2446 = false;
                        var6.field3619 = class127.method1011(var6.field3615, var6.field3633, class20.field323, 29908);
                        class28.method177(class20.field323, var6.field3633, var6.field3615, var6.field3619, var6, var6.field3667, var4, var6.field2456, var6.field2423, var6.field2445, var6.field2458);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZIIIIIIIIII)Z")
    public static final boolean method1709(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4386++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var41 = 0; var41 < 104; var41++) {
                class140.field2668[var13][var41] = 0;
                class180.field3256[var13][var41] = 99999999;
            }
        }
        class140.field2668[arg5][arg12] = 99;
        int var14 = arg5;
        int var15 = arg12;
        class180.field3256[arg5][arg12] = 0;
        byte var16 = 0;
        class197.field3552[var16] = arg5;
        boolean var17 = false;
        int var42 = var16 + 1;
        class96.field1816[var16] = arg12;
        int var18 = 0;
        int[][] var19 = class140.field2670[class20.field323].field11;
        label368: while (var42 != var18) {
            var15 = class96.field1816[var18];
            var14 = class197.field3552[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg3 == var14 && arg11 == var15) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class140.field2670[class20.field323].method12(var14, arg3, arg11, arg6, arg9 - 1, true, arg10, var15)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class140.field2670[class20.field323].method10(arg11, arg9 - 1, var14, arg3, arg10, arg6, var15, 0)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg0 != 0 && class140.field2670[class20.field323].method1(arg4, var14, var15, arg0, arg6, arg11, -123, arg7, arg3)) {
                var17 = true;
                break;
            }
            int var32 = class180.field3256[var14][var15] + 1;
            if (var14 > 0 && class140.field2668[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg6 + var15 - 1] & 0x12C0138) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= (arg6 - 1)) {
                        class197.field3552[var42] = var14 - 1;
                        class96.field1816[var42] = var15;
                        var42 = var42 + 1 & 0xFFF;
                        class140.field2668[var14 - 1][var15] = 2;
                        class180.field3256[var14 - 1][var15] = var32;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var33] & 0x12C013E) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var14 < 102 && class140.field2668[var14 + 1][var15] == 0 && (var19[var14 + arg6][var15] & 0x12C0183) == 0 && (var19[var14 + arg6][arg6 + var15 - 1] & 0x12C01E0) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= (arg6 - 1)) {
                        class197.field3552[var42] = var14 + 1;
                        class96.field1816[var42] = var15;
                        class140.field2668[var14 + 1][var15] = 8;
                        class180.field3256[var14 + 1][var15] = var32;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var34] & 0x12C01E3) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 > 0 && class140.field2668[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg6 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg6 - 1) {
                        class197.field3552[var42] = var14;
                        class96.field1816[var42] = var15 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class140.field2668[var14][var15 - 1] = 1;
                        class180.field3256[var14][var15 - 1] = var32;
                        break;
                    }
                    if ((var19[var14 + var35][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var15 < 102 && class140.field2668[var14][var15 + 1] == 0 && (var19[var14][arg6 + var15] & 0x12C0138) == 0 && (var19[var14 + arg6 - 1][arg6 + var15] & 0x12C01E0) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg6 - 1)) {
                        class197.field3552[var42] = var14;
                        class96.field1816[var42] = var15 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class140.field2668[var14][var15 + 1] = 4;
                        class180.field3256[var14][var15 + 1] = var32;
                        break;
                    }
                    if ((var19[var14 + var36][arg6 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 > 0 && var15 > 0 && class140.field2668[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg6 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg6 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg6 - 1 <= var37) {
                        class197.field3552[var42] = var14 - 1;
                        class96.field1816[var42] = var15 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class140.field2668[var14 - 1][var15 - 1] = 3;
                        class180.field3256[var14 - 1][var15 - 1] = var32;
                        break;
                    }
                    if ((var19[var14 - 1][var37 + var15 - 1] & 0x12C013E) != 0 || (var19[var37 + var14 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 < 102 && var15 > 0 && class140.field2668[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg6 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg6 + var14][arg6 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= (arg6 - 1)) {
                        class197.field3552[var42] = var14 + 1;
                        class96.field1816[var42] = var15 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class140.field2668[var14 + 1][var15 - 1] = 9;
                        class180.field3256[var14 + 1][var15 - 1] = var32;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var38 - 1] & 0x12C01E3) != 0 || (var19[var38 + var14 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 > 0 && var15 < 102 && class140.field2668[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg6] & 0x12C0138) == 0 && (var19[var14][var15 + arg6] & 0x12C01E0) == 0) {
                int var39 = 1;
                while (true) {
                    if (var39 >= arg6 - 1) {
                        class197.field3552[var42] = var14 - 1;
                        class96.field1816[var42] = var15 + 1;
                        class140.field2668[var14 - 1][var15 + 1] = 6;
                        var42 = var42 + 1 & 0xFFF;
                        class180.field3256[var14 - 1][var15 + 1] = var32;
                        break;
                    }
                    if ((var19[var14 - 1][var15 - (-var39 - 1)] & 0x12C013E) != 0 || (var19[var14 + var39 - 1][arg6 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var39++;
                }
            }
            if (var14 < 102 && var15 < 102 && class140.field2668[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg6 + var15] & 0x12C0138) == 0 && (var19[var14 + arg6][arg6 + var15] & 0x12C01E0) == 0 && (var19[var14 + arg6][var15 + 1] & 0x12C0183) == 0) {
                for (int var40 = 1; var40 < (arg6 - 1); var40++) {
                    if ((var19[var14 + var40 + 1][arg6 + var15] & 0x12C01F8) != 0 || (var19[arg6 + var14][var15 + var40 + 1] & 0x12C01E3) != 0) {
                        continue label368;
                    }
                }
                class197.field3552[var42] = var14 + 1;
                class96.field1816[var42] = var15 + 1;
                class140.field2668[var14 + 1][var15 + 1] = 12;
                var42 = var42 + 1 & 0xFFF;
                class180.field3256[var14 + 1][var15 + 1] = var32;
            }
        }
        class260.field4551 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg3 - var22; var23 <= arg3 + var22; var23++) {
                for (int var24 = arg11 - var22; var24 <= arg11 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class180.field3256[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg3 > var23) {
                            var25 = arg3 - var23;
                        } else if (var23 > arg4 + arg3 - 1) {
                            var25 = -arg3 - (arg4 - (var23 + 1));
                        }
                        int var26 = 0;
                        if (var24 < arg11) {
                            var26 = arg11 - var24;
                        } else if (var24 > (arg0 + arg11 - 1)) {
                            var26 = -arg11 - arg0 - (-1 - var24);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class180.field3256[var23][var24] < var21) {
                            var20 = var27;
                            var15 = var24;
                            var14 = var23;
                            var21 = class180.field3256[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg5 == var14 && arg12 == var15) {
                return false;
            }
            class260.field4551 = 1;
        }
        int var28 = -39 % ((arg1 + 28) / 57);
        byte var29 = 0;
        class197.field3552[var29] = var14;
        int var43 = var29 + 1;
        class96.field1816[var29] = var15;
        int var30;
        int var31 = var30 = class140.field2668[var14][var15];
        while (arg5 != var14 || arg12 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class197.field3552[var43] = var14;
                class96.field1816[var43++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class140.field2668[var14][var15];
        }
        if (var43 > 0) {
            class248.method1703(var43, arg8, 3);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method1711(int arg0) {
        if (arg0 != 1) {
            method1712((class22) null, 38, -91);
        }
        field4402 = null;
        field4395 = null;
        field4403 = null;
        field4400 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lv;II)V")
    public static final void method1712(class22 arg0, int arg1, int arg2) {
        if (arg1 != 21870) {
            return;
        }
        field4399++;
        if (class175.field3191 == null) {
            class93.method741(true, 255, 45218960, (byte) 0, 255, (class22) null, 0);
            class67.field1140[arg2] = arg0;
        } else {
            class175.field3191.field1541 = arg2 * 8 + 5;
            int var3 = class175.field3191.method620((byte) -82);
            int var4 = class175.field3191.method620((byte) -82);
            arg0.method153(var4, var3, false);
        }
    }
}
