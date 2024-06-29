import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class108 {

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "J")
    public long field1950 = 0L;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
    public static int[] field1946 = new int[1000];

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Li;")
    public static class88 field1949 = class208.method1425(105, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Li;")
    public static class88 field1944 = class208.method1425(105, "blinken1:");

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Lob;")
    public static class154 field1953 = new class154(4096);

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Lid;")
    public static class92 field1957 = new class92(64);

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Lca;")
    public static class24 field1958 = new class24(4);

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Li;")
    public static class88 field1959 = class208.method1425(105, "b12_full");

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Z")
    public static boolean field1960 = false;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lnc;")
    public class145 field1945;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method738(byte arg0) {
        field1946 = null;
        field1949 = null;
        if (arg0 != 9) {
            method739(false, 97, 88, 102, 48, -41, 60, 19, 101, 50, 123, 101);
        }
        field1944 = null;
        field1957 = null;
        field1953 = null;
        field1958 = null;
        field1959 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method739(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1943++;
        if (arg2 != -1) {
            return true;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class190.field3675[var12][var31] = 0;
                class228.field4269[var12][var31] = 99999999;
            }
        }
        class190.field3675[arg5][arg1] = 99;
        class228.field4269[arg5][arg1] = 0;
        int var13 = arg5;
        int var14 = arg1;
        byte var15 = 0;
        class120.field2205[var15] = arg5;
        int var32 = var15 + 1;
        class97.field1783[var15] = arg1;
        boolean var16 = false;
        int var17 = 0;
        int[][] var18 = class166.field3202[class149.field2909].field1668;
        while (var32 != var17) {
            var13 = class120.field2205[var17];
            var14 = class97.field1783[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg8 == var13 && arg11 == var14) {
                var16 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class166.field3202[class149.field2909].method641(var14, arg6 - 1, arg8, arg11, 2, arg7, var13, -74)) {
                    var16 = true;
                    break;
                }
                if (arg6 < 10 && class166.field3202[class149.field2909].method649(arg7, var13, arg6 - 1, (byte) 121, arg11, 2, var14, arg8)) {
                    var16 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg4 != 0 && class166.field3202[class149.field2909].method651(2, arg11, arg3, 1, var14, arg4, var13, arg8, arg9)) {
                var16 = true;
                break;
            }
            int var30 = class228.field4269[var13][var14] + 1;
            if (var13 > 0 && class190.field3675[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class120.field2205[var32] = var13 - 1;
                class97.field1783[var32] = var14;
                class190.field3675[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class228.field4269[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class190.field3675[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class120.field2205[var32] = var13 + 1;
                class97.field1783[var32] = var14;
                class190.field3675[var13 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class228.field4269[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class190.field3675[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class120.field2205[var32] = var13;
                class97.field1783[var32] = var14 - 1;
                class190.field3675[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class228.field4269[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class190.field3675[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class120.field2205[var32] = var13;
                class97.field1783[var32] = var14 + 1;
                class190.field3675[var13][var14 + 1] = 4;
                class228.field4269[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class190.field3675[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class120.field2205[var32] = var13 - 1;
                class97.field1783[var32] = var14 - 1;
                class190.field3675[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class228.field4269[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class190.field3675[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class120.field2205[var32] = var13 + 1;
                class97.field1783[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 + 1][var14 - 1] = 9;
                class228.field4269[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class190.field3675[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class120.field2205[var32] = var13 - 1;
                class97.field1783[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 - 1][var14 + 1] = 6;
                class228.field4269[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class190.field3675[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class120.field2205[var32] = var13 + 1;
                class97.field1783[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 + 1][var14 + 1] = 12;
                class228.field4269[var13 + 1][var14 + 1] = var30;
            }
        }
        class120.field2188 = 0;
        if (!var16) {
            if (!arg0) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg8 - var21; var22 <= arg8 + var21; var22++) {
                for (int var23 = arg11 - var21; var23 <= arg11 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class228.field4269[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg4 + arg11 - 1) {
                            var25 = var23 + 1 - arg4 - arg11;
                        }
                        if (var22 < arg8) {
                            var24 = arg8 - var22;
                        } else if (arg3 + arg8 - 1 < var22) {
                            var24 = var22 + 1 - arg3 - arg8;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class228.field4269[var22][var23]) {
                            var20 = class228.field4269[var22][var23];
                            var13 = var22;
                            var14 = var23;
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg1 == var14) {
                return false;
            }
            class120.field2188 = 1;
        }
        byte var27 = 0;
        class120.field2205[var27] = var13;
        int var33 = var27 + 1;
        class97.field1783[var27] = var14;
        int var28;
        int var29 = var28 = class190.field3675[var13][var14];
        while (arg5 != var13 || arg1 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class120.field2205[var33] = var13;
                class97.field1783[var33++] = var14;
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
            var29 = class190.field3675[var13][var14];
        }
        if (var33 > 0) {
            class248.method1613(arg10, class120.field2205, class97.field1783, var33, 35);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public static final void method740(boolean arg0) {
        field1948++;
        class143.field2656.method205((byte) 126);
        for (int var1 = 0; var1 < 32; var1++) {
            class89.field1697[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class48.field903[var2] = 0L;
        }
        if (arg0) {
            field1959 = null;
        }
        class153.field2962 = 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != 2) {
            method741(-83, -43, 20, 50, 102, 105, 10, -98, -19, 85);
        }
        if (arg2 >= class67.field1207 && class12.field183 >= arg2 && class67.field1207 <= arg3 && class12.field183 >= arg3 && arg9 >= class67.field1207 && class12.field183 >= arg9 && arg5 >= class67.field1207 && arg5 <= class12.field183 && arg1 >= class49.field919 && arg1 <= class18.field279 && arg0 >= class49.field919 && class18.field279 >= arg0 && class49.field919 <= arg4 && arg4 <= class18.field279 && class49.field919 <= arg7 && arg7 <= class18.field279) {
            class153.method1044(arg3, arg8, (byte) -118, arg5, arg0, arg1, arg7, arg4, arg2, arg9);
        } else {
            class147.method984(arg2, arg3, arg5, arg8, true, arg7, arg0, arg1, arg4, arg9);
        }
        field1955++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method742(int arg0) {
        if (class92.field1735 == null || class150.field2922 == null) {
            class92.field1735 = new int[256];
            class150.field2922 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class92.field1735[var1] = (int) (Math.sin(var2) * 4096.0D);
                class150.field2922[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1939++;
        if (arg0 != -10798) {
            method739(true, 40, -69, 86, -23, 115, 110, 37, -50, 27, 63, 91);
        }
    }
}
