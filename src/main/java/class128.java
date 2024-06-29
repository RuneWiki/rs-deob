import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class128 extends class202 {

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Lkd;")
    public static class204 field2062 = new class204(8);

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "[I")
    public static int[] field2074 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lkd;")
    public static class204 field2076 = new class204(16);

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "Ld;")
    public static class238 field2071;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static final void method908(byte arg0) {
        field2063++;
        if (arg0 != -86) {
            field2074 = null;
        }
        class136.field2250 = new class36[class234.field3819.method1368(1596)][];
        class10.field147 = new boolean[class234.field3819.method1368(1596)];
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public static void method909(byte arg0) {
        field2071 = null;
        if (arg0 > -64) {
            field2062 = null;
        }
        field2074 = null;
        field2076 = null;
        field2062 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BJ)V")
    public static final void method910(byte arg0, long arg1) {
        field2061++;
        if (arg1 == 0L) {
            return;
        }
        if (class185.field2910 >= 100) {
            class226.method1588("", 0, (byte) -60, class106.field1705);
            return;
        }
        String var3 = class118.method862(true, arg1);
        for (int var4 = 0; var4 < class185.field2910; var4++) {
            if (class183.field2884[var4] == arg1) {
                class226.method1588("", 0, (byte) -14, var3 + class136.field2240);
                return;
            }
        }
        int var5 = 0;
        if (arg0 >= -24) {
            return;
        }
        while (class239.field3875 > var5) {
            if (class60.field992[var5] == arg1) {
                class226.method1588("", 0, (byte) -83, class184.field2888 + var3 + class98.field1608);
                return;
            }
            var5++;
        }
        if (var3.equals(class167.field2655.field525)) {
            class226.method1588("", 0, (byte) -50, class158.field2549);
            return;
        }
        class183.field2884[class185.field2910] = arg1;
        class214.field3497[class185.field2910++] = class63.method447(arg1, 124);
        class205.field3286++;
        class99.field1633 = class66.field1094;
        class68.field1113.method534((byte) 17, 73);
        class68.field1113.method1502((byte) 109, arg1);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field2077++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class100.field1647[var12][var31] = 0;
                class45.field814[var12][var31] = 99999999;
            }
        }
        class100.field1647[arg1][arg11] = 99;
        int var13 = arg1;
        int var14 = arg11;
        class45.field814[arg1][arg11] = 0;
        byte var15 = 0;
        class238.field3866[var15] = arg1;
        int var32 = var15 + 1;
        class148.field2387[var15] = arg11;
        boolean var16 = false;
        int var17 = 0;
        int[][] var18 = class167.field2657[class250.field3980].field371;
        while (var32 != var17) {
            var14 = class148.field2387[var17];
            var13 = class238.field3866[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg4 == var13 && arg3 == var14) {
                var16 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class167.field2657[class250.field3980].method209(arg8 - 7592, var13, arg4, arg0, var14, arg3, arg5 - 1, 1)) {
                    var16 = true;
                    break;
                }
                if (arg5 < 10 && class167.field2657[class250.field3980].method213(arg5 - 1, 1, arg4, arg3, var14, var13, (byte) 64, arg0)) {
                    var16 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg2 != 0 && class167.field2657[class250.field3980].method204(arg8, arg6, arg2, arg7, arg3, arg4, var14, 1, var13)) {
                var16 = true;
                break;
            }
            int var30 = class45.field814[var13][var14] + 1;
            if (var13 > 0 && class100.field1647[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class238.field3866[var32] = var13 - 1;
                class148.field2387[var32] = var14;
                class100.field1647[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class45.field814[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class100.field1647[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class238.field3866[var32] = var13 + 1;
                class148.field2387[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class100.field1647[var13 + 1][var14] = 8;
                class45.field814[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class100.field1647[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class238.field3866[var32] = var13;
                class148.field2387[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class100.field1647[var13][var14 - 1] = 1;
                class45.field814[var13][var14 - 1] = var30;
            }
            if (var14 < 103 && class100.field1647[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class238.field3866[var32] = var13;
                class148.field2387[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class100.field1647[var13][var14 + 1] = 4;
                class45.field814[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class100.field1647[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class238.field3866[var32] = var13 - 1;
                class148.field2387[var32] = var14 - 1;
                class100.field1647[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class45.field814[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class100.field1647[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class238.field3866[var32] = var13 + 1;
                class148.field2387[var32] = var14 - 1;
                class100.field1647[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class45.field814[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class100.field1647[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class238.field3866[var32] = var13 - 1;
                class148.field2387[var32] = var14 + 1;
                class100.field1647[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class45.field814[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class100.field1647[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class238.field3866[var32] = var13 + 1;
                class148.field2387[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class100.field1647[var13 + 1][var14 + 1] = 12;
                class45.field814[var13 + 1][var14 + 1] = var30;
            }
        }
        class84.field1317 = 0;
        if (!var16) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= (arg4 + var21); var22++) {
                for (int var23 = arg3 - var21; var23 <= arg3 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class45.field814[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if ((arg6 + arg4 - 1) < var22) {
                            var24 = var22 + 1 - arg4 - arg6;
                        }
                        int var25 = 0;
                        if (var23 < arg3) {
                            var25 = arg3 - var23;
                        } else if ((arg2 + arg3 - 1) < var23) {
                            var25 = 1 - arg2 - (arg3 - var23);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && class45.field814[var22][var23] < var20) {
                            var13 = var22;
                            var19 = var26;
                            var14 = var23;
                            var20 = class45.field814[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg11 == var14) {
                return false;
            }
            class84.field1317 = 1;
        }
        byte var27 = 0;
        class238.field3866[var27] = var13;
        int var33 = var27 + 1;
        class148.field2387[var27] = var14;
        int var28;
        int var29 = var28 = class100.field1647[var13][var14];
        while (arg1 != var13 || arg11 != var14) {
            if (var28 != var29) {
                class238.field3866[var33] = var13;
                class148.field2387[var33++] = var14;
                var28 = var29;
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
            var29 = class100.field1647[var13][var14];
        }
        if (arg8 != -1) {
            method912((byte) 124, (byte) -113);
        }
        if (var33 > 0) {
            class209.method1445(var33, arg9, true);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BB)V")
    public static final void method912(byte arg0, byte arg1) {
        field2064++;
        if (class227.field3766 == null) {
            class227.field3766 = new byte[4][104][104];
        }
        int var2 = 0;
        int var3 = -60 % ((68 - arg0) / 37);
        while (var2 < 4) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class227.field3766[var2][var4][var5] = arg1;
                }
            }
            var2++;
        }
    }
}
