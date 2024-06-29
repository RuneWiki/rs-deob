import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class134 {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lvj;")
    private class90[] field1951;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lnj;")
    public static class198 field1948;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1948 = null;
        if (arg0 != 1) {
            method908(-64);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method909(int arg0) {
        field1950++;
        class39.field582.method257(false);
        if (arg0 < 27) {
            field1948 = null;
        }
        class166.field2421.method257(false);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lpg;")
    public static final class175 method910(int arg0) {
        if (arg0 != 4) {
            field1948 = null;
        }
        field1952++;
        class117 var1 = new class117(class68.field1056, class141.field2041, class91.field1386[0], class211.field3035[0], class246.field3682[0], class282.field4500[0], class263.field3965[0], class128.field1883);
        class290.method1935(0);
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method911(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1949++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class263.field3962[var12][var31] = 0;
                class188.field2670[var12][var31] = 99999999;
            }
        }
        class263.field3962[arg3][arg5] = 99;
        int var13 = arg3;
        int var14 = arg5;
        class188.field2670[arg3][arg5] = 0;
        int var15 = 0;
        byte var16 = 0;
        if (arg10 != 2) {
            return false;
        }
        boolean var17 = false;
        class51.field755[var16] = arg3;
        int var32 = var16 + 1;
        class1.field19[var16] = arg5;
        int[][] var18 = class246.field3681[class163.field2364].field1319;
        while (var15 != var32) {
            var14 = class1.field19[var15];
            var13 = class51.field755[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg9 == var13 && arg6 == var14) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class246.field3681[class163.field2364].method574(arg7, arg9, 1, arg6, 19661088, arg4 - 1, var13, var14)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class246.field3681[class163.field2364].method586(var13, 1, arg7, arg6, var14, arg4 - 1, 7956, arg9)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg8 != 0 && class246.field3681[class163.field2364].method591(var14, arg9, arg10 ^ 0x2, var13, arg11, arg6, arg8, arg1, 1)) {
                var17 = true;
                break;
            }
            int var30 = class188.field2670[var13][var14] + 1;
            if (var13 > 0 && class263.field3962[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class51.field755[var32] = var13 - 1;
                class1.field19[var32] = var14;
                class263.field3962[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class188.field2670[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class263.field3962[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class51.field755[var32] = var13 + 1;
                class1.field19[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class263.field3962[var13 + 1][var14] = 8;
                class188.field2670[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class263.field3962[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class51.field755[var32] = var13;
                class1.field19[var32] = var14 - 1;
                class263.field3962[var13][var14 - 1] = 1;
                class188.field2670[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class263.field3962[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class51.field755[var32] = var13;
                class1.field19[var32] = var14 + 1;
                class263.field3962[var13][var14 + 1] = 4;
                class188.field2670[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class263.field3962[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class51.field755[var32] = var13 - 1;
                class1.field19[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class263.field3962[var13 - 1][var14 - 1] = 3;
                class188.field2670[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class263.field3962[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class51.field755[var32] = var13 + 1;
                class1.field19[var32] = var14 - 1;
                class263.field3962[var13 + 1][var14 - 1] = 9;
                class188.field2670[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 103 && class263.field3962[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class51.field755[var32] = var13 - 1;
                class1.field19[var32] = var14 + 1;
                class263.field3962[var13 - 1][var14 + 1] = 6;
                class188.field2670[var13 - 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && var14 < 103 && class263.field3962[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class51.field755[var32] = var13 + 1;
                class1.field19[var32] = var14 + 1;
                class263.field3962[var13 + 1][var14 + 1] = 12;
                class188.field2670[var13 + 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class231.field3455 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg9 - var20; var22 <= (arg9 + var20); var22++) {
                for (int var23 = arg6 - var20; var23 <= arg6 + var20; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class188.field2670[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg9) {
                            var24 = arg9 - var22;
                        } else if (var22 > (arg9 + arg11 - 1)) {
                            var24 = var22 - arg11 - (arg9 - 1);
                        }
                        int var25 = 0;
                        if (arg6 > var23) {
                            var25 = arg6 - var23;
                        } else if (arg6 + arg8 - 1 < var23) {
                            var25 = var23 + 1 - arg6 - arg8;
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && class188.field2670[var22][var23] < var21) {
                            var13 = var22;
                            var19 = var26;
                            var21 = class188.field2670[var22][var23];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg5 == var14) {
                return false;
            }
            class231.field3455 = 1;
        }
        byte var27 = 0;
        class51.field755[var27] = var13;
        int var33 = var27 + 1;
        class1.field19[var27] = var14;
        int var28;
        int var29 = var28 = class263.field3962[var13][var14];
        while (arg3 != var13 || arg5 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class51.field755[var33] = var13;
                class1.field19[var33++] = var14;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class263.field3962[var13][var14];
        }
        if (var33 > 0) {
            class194.method1242(arg0, 25, var33);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLnj;Z)V")
    public static final void method912(byte arg0, class198 arg1, boolean arg2) {
        if (arg2) {
            int var3 = class250.field3813;
            int var4 = var3 * 956 / 503;
            class211.field3034.method477((class214.field3080 - var4) / 2, 0, var4, var3);
            class104.field1543.method812(class214.field3080 / 2 - (class104.field1543.field2499 / 2), 18);
        }
        field1954++;
        arg1.method1289(class181.field2598, class214.field3080 / 2, class250.field3813 / 2 - 26, 16777215, -1);
        int var5 = class250.field3813 / 2 - 18;
        if (arg0 >= -34) {
            field1948 = null;
        }
        class144.method951(class214.field3080 / 2 - 152, var5, 304, 34, 9179409);
        class144.method951(class214.field3080 / 2 - 151, var5 + 1, 302, 32, 0);
        class144.method955(class214.field3080 / 2 - 150, var5 + 2, class48.field704 * 3, 30, 9179409);
        class144.method955(class214.field3080 / 2 + (class48.field704 * 3) - 150, var5 - -2, 300 - (class48.field704 * 3), 30, 0);
        arg1.method1289(class33.field482, class214.field3080 / 2, class250.field3813 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    public class134(int arg0) {
        this.field1951 = new class90[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class90 var3 = this.field1951[var2] = new class90();
            var3.field1367 = var3;
            var3.field1370 = var3;
        }
    }
}
