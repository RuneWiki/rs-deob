import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class256 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[Ljd;")
    public static class85[] field4560 = new class85[100];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[I")
    public static int[] field4563 = new int[2000];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    public static boolean field4564 = false;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[[I")
    public static int[][] field4561 = new int[104][104];

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[Ljd;")
    public static class85[] field4572 = new class85[100];

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lwe;")
    public static class15 field4571 = new class15();

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Z")
    public static boolean field4568;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[[B")
    public static byte[][] field4570;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public abstract void method202(int arg0);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)I")
    public abstract int method203(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method1774(int arg0) {
        field4560 = null;
        field4572 = null;
        if (arg0 <= 19) {
            method1778(-127, -98, 6);
        }
        field4561 = null;
        field4571 = null;
        field4563 = null;
        field4570 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[Ljd;)[Ljd;")
    public static final class85[] method1775(int arg0, class85[] arg1) {
        if (arg0 != 5) {
            return null;
        }
        class85[] var2 = new class85[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class172.method1150(new class85[] { class68.method451(var3, -12572), class15.field223 }, arg0 - 5);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class172.method1150(new class85[] { var2[var3], arg1[var3] }, arg0 - 5);
            }
        }
        field4566++;
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg9 != -1) {
            return true;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                field4561[var12][var31] = 0;
                class214.field3771[var12][var31] = 99999999;
            }
        }
        int var13 = arg3;
        field4565++;
        int var14 = arg8;
        field4561[arg3][arg8] = 99;
        class214.field3771[arg3][arg8] = 0;
        byte var15 = 0;
        int var16 = 0;
        class24.field349[var15] = arg3;
        boolean var17 = false;
        int var32 = var15 + 1;
        class34.field512[var15] = arg8;
        int[][] var18 = class34.field529[class116.field2066].field4719;
        while (var32 != var16) {
            var13 = class24.field349[var16];
            var14 = class34.field512[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var13 && arg0 == var14) {
                var17 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class34.field529[class116.field2066].method1823(var14, arg2, arg11 - 1, arg9 + 11663, arg0, 1, var13, arg4)) {
                    var17 = true;
                    break;
                }
                if (arg11 < 10 && class34.field529[class116.field2066].method1815(arg11 - 1, arg4, 1, var13, arg2, arg0, (byte) 6, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg1 != 0 && class34.field529[class116.field2066].method1812(arg7, arg4, arg0, 8, arg5, 1, var14, arg1, var13)) {
                var17 = true;
                break;
            }
            int var30 = class214.field3771[var13][var14] + 1;
            if (var13 > 0 && field4561[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class24.field349[var32] = var13 - 1;
                class34.field512[var32] = var14;
                field4561[var13 - 1][var14] = 2;
                class214.field3771[var13 - 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && field4561[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class24.field349[var32] = var13 + 1;
                class34.field512[var32] = var14;
                field4561[var13 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && field4561[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class24.field349[var32] = var13;
                class34.field512[var32] = var14 - 1;
                field4561[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13][var14 - 1] = var30;
            }
            if (var14 < 103 && field4561[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class24.field349[var32] = var13;
                class34.field512[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                field4561[var13][var14 + 1] = 4;
                class214.field3771[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && field4561[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class24.field349[var32] = var13 - 1;
                class34.field512[var32] = var14 - 1;
                field4561[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && field4561[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class24.field349[var32] = var13 + 1;
                class34.field512[var32] = var14 - 1;
                field4561[var13 + 1][var14 - 1] = 9;
                class214.field3771[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 103 && field4561[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class24.field349[var32] = var13 - 1;
                class34.field512[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                field4561[var13 - 1][var14 + 1] = 6;
                class214.field3771[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && field4561[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class24.field349[var32] = var13 + 1;
                class34.field512[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                field4561[var13 + 1][var14 + 1] = 12;
                class214.field3771[var13 + 1][var14 + 1] = var30;
            }
        }
        class193.field3307 = 0;
        if (!var17) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= (arg4 + var21); var22++) {
                for (int var23 = arg0 - var21; var23 <= (arg0 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class214.field3771[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if (arg5 + arg4 - 1 < var22) {
                            var24 = var22 + 1 - arg4 - arg5;
                        }
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (var23 > (arg0 + arg1 - 1)) {
                            var25 = var23 + 1 - arg0 - arg1;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && class214.field3771[var22][var23] < var20) {
                            var14 = var23;
                            var13 = var22;
                            var20 = class214.field3771[var22][var23];
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg8 == var14) {
                return false;
            }
            class193.field3307 = 1;
        }
        byte var27 = 0;
        class24.field349[var27] = var13;
        int var33 = var27 + 1;
        class34.field512[var27] = var14;
        int var28;
        int var29 = var28 = field4561[var13][var14];
        while (arg3 != var13 || arg8 != var14) {
            if (var28 != var29) {
                class24.field349[var33] = var13;
                var28 = var29;
                class34.field512[var33++] = var14;
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
            var29 = field4561[var13][var14];
        }
        if (var33 > 0) {
            class127.method858(93, var33, arg6);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
    public static final void method1777(boolean arg0, int arg1) {
        byte[][] var2 = field4570;
        int var3 = class194.field3314.length;
        field4567++;
        for (int var4 = arg1; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class94.field1719[var4] >> 8) * 64 - class244.field4172;
                int var7 = (class94.field1719[var4] & 0xFF) * 64 - class213.field3742;
                class21.method145(arg1 ^ 0x7894);
                class154.method1013(0, arg0, var7, var6, var5, class34.field529);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public static final void method1778(int arg0, int arg1, int arg2) {
        field4562++;
        class207.field3618.method483(-24260, 239);
        if (arg1 != -1) {
            method1774(-73);
        }
        class207.field3618.method1673(arg2, true);
        class109.field1921++;
        class207.field3618.method1702(arg0, 19);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)V")
    public static final void method1779(int arg0, int arg1, int arg2) {
        field4563[arg1] = arg0;
        field4569++;
        class168 var3 = (class168) class48.field857.method1398(1, (long) arg1);
        if (var3 == null) {
            class168 var4 = new class168(class28.method200(arg2 ^ 0xFFFFD2F4) + 500L);
            class48.field857.method1393(var4, (long) arg1, arg2 ^ 0xFFFFD1B7);
        } else {
            var3.field2889 = class28.method200(-31) + 500L;
        }
        if (arg2 != -11642) {
            field4572 = null;
        }
    }
}
