import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 extends class226 {

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "S")
    public static short field572 = 32767;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Z")
    public static boolean field578 = true;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Lwk;")
    public static class273 field575 = new class273(64);

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "[[[Lng;")
    public static class76[][][] field579 = new class76[4][104][104];

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIZZIIII)Z")
    public static final boolean method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class11.field85[var12][var31] = 0;
                class232.field4001[var12][var31] = 99999999;
            }
        }
        field570++;
        int var13 = arg11;
        int var14 = arg9;
        int var15 = 0;
        class11.field85[arg11][arg9] = 99;
        class232.field4001[arg11][arg9] = 0;
        if (!arg6) {
            field578 = false;
        }
        boolean var16 = false;
        byte var17 = 0;
        class222.field3860[var17] = arg11;
        int var32 = var17 + 1;
        class33.field598[var17] = arg9;
        int[][] var18 = class177.field3091[class255.field4407].field2272;
        while (var15 != var32) {
            var13 = class222.field3860[var15];
            var14 = class33.field598[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg0 == var13 && arg5 == var14) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class177.field3091[class255.field4407].method862(1, var13, arg10, arg4 - 1, arg5, 1, arg0, var14)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class177.field3091[class255.field4407].method877(arg10, arg4 - 1, var14, arg0, 0, 1, arg5, var13)) {
                    var16 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg8 != 0 && class177.field3091[class255.field4407].method867(arg1, (byte) -12, arg5, arg2, arg8, 1, var13, arg0, var14)) {
                var16 = true;
                break;
            }
            int var30 = class232.field4001[var13][var14] + 1;
            if (var13 > 0 && class11.field85[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class222.field3860[var32] = var13 - 1;
                class33.field598[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class11.field85[var13 - 1][var14] = 2;
                class232.field4001[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class11.field85[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class222.field3860[var32] = var13 + 1;
                class33.field598[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class11.field85[var13 + 1][var14] = 8;
                class232.field4001[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class11.field85[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class222.field3860[var32] = var13;
                class33.field598[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class11.field85[var13][var14 - 1] = 1;
                class232.field4001[var13][var14 - 1] = var30;
            }
            if (var14 < 103 && class11.field85[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class222.field3860[var32] = var13;
                class33.field598[var32] = var14 + 1;
                class11.field85[var13][var14 + 1] = 4;
                class232.field4001[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class11.field85[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class222.field3860[var32] = var13 - 1;
                class33.field598[var32] = var14 - 1;
                class11.field85[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class232.field4001[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class11.field85[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class222.field3860[var32] = var13 + 1;
                class33.field598[var32] = var14 - 1;
                class11.field85[var13 + 1][var14 - 1] = 9;
                class232.field4001[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 103 && class11.field85[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class222.field3860[var32] = var13 - 1;
                class33.field598[var32] = var14 + 1;
                class11.field85[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class232.field4001[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class11.field85[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class222.field3860[var32] = var13 + 1;
                class33.field598[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class11.field85[var13 + 1][var14 + 1] = 12;
                class232.field4001[var13 + 1][var14 + 1] = var30;
            }
        }
        class186.field3291 = 0;
        if (!var16) {
            if (!arg7) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg0 - var21; var22 <= arg0 + var21; var22++) {
                for (int var23 = arg5 - var21; var23 <= arg5 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class232.field4001[var22][var23] < 100) {
                        int var24 = 0;
                        if (var23 < arg5) {
                            var24 = arg5 - var23;
                        } else if (arg5 + arg8 - 1 < var23) {
                            var24 = var23 + 1 - (arg5 + arg8);
                        }
                        int var25 = 0;
                        if (arg0 > var22) {
                            var25 = arg0 - var22;
                        } else if (var22 > (arg0 + arg2 - 1)) {
                            var25 = 1 - (arg0 - (var22 - arg2));
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class232.field4001[var22][var23]) {
                            var20 = class232.field4001[var22][var23];
                            var19 = var26;
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg11 == var13 && arg9 == var14) {
                return false;
            }
            class186.field3291 = 1;
        }
        byte var27 = 0;
        class222.field3860[var27] = var13;
        int var33 = var27 + 1;
        class33.field598[var27] = var14;
        int var28;
        int var29 = var28 = class11.field85[var13][var14];
        while (arg11 != var13 || arg9 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class222.field3860[var33] = var13;
                class33.field598[var33++] = var14;
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
            var29 = class11.field85[var13][var14];
        }
        if (var33 > 0) {
            class262.method1755(false, var33, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)I")
    public static final int method263(int arg0, int arg1, int arg2, int arg3) {
        field568++;
        int var4 = arg0 - 1 & arg1;
        int var5 = arg2 / arg0;
        int var6 = arg0 - 1 & arg2;
        int var7 = arg1 / arg0;
        int var8 = class89.method607(var5, true, var7);
        int var9 = class89.method607(var5, true, var7 + 1);
        int var10 = class89.method607(var5 + 1, true, var7);
        if (arg3 > -5) {
            return 25;
        } else {
            int var11 = class89.method607(var5 + 1, true, var7 + 1);
            int var12 = class205.method1378(var8, arg0, -4585, var4, var9);
            int var13 = class205.method1378(var10, arg0, -4585, var4, var11);
            return class205.method1378(var12, arg0, -4585, var6, var13);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
    public static final void method264(int arg0, int arg1, int arg2) {
        field576++;
        class159 var3 = class77.method539(arg0, arg1 - 67);
        int var4 = var3.field2829;
        int var5 = var3.field2832;
        if (arg1 != 0) {
            method264(116, 120, 50);
        }
        int var6 = var3.field2831;
        int var7 = class170.field3027[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class130.method858(var4, ~var8 & class209.field3613[var4] | arg2 << var5 & var8, -37);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)Loa;")
    public static final class99 method265(byte arg0, String arg1) {
        field574++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class99 var3 = new class99();
        var3.field1697 = var2;
        var3.field1682 = 0;
        int var4 = 0;
        if (arg0 >= -55) {
            field572 = 45;
        }
        while (var2.length > var4) {
            if (var2[var4] != 0) {
                var2[var3.field1682++] = var2[var4];
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static void method266(int arg0) {
        if (arg0 == -11) {
            field579 = null;
            field575 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    public static final void method267(int arg0, byte arg1) {
        if (arg1 <= -100) {
            class262.field4629.method1809(arg0, (byte) 93);
            class267.field4707.method1809(arg0, (byte) 92);
            field571++;
        }
    }
}
