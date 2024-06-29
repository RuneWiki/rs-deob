import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class324 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[[B")
    public static byte[][] field5564 = new byte[1000][];

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field5572 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field5563;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field5565;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field5573;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "Lvm;")
    public static class302 field5571;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIZJ)Lhi;", line = 6)
    public static final class82 method2234(int arg0, int arg1, boolean arg2, long arg3) {
        field5568++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg1 != -1) {
            method2234(58, 14, false, 66L);
        }
        int var5 = 1;
        for (long var6 = arg3 / (long) arg0; var6 != 0L; var6 /= (long) arg0) {
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg3 % (long) arg0);
            arg3 /= (long) arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class82 var12 = new class82();
        var12.field1419 = var9;
        var12.field1468 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 74)
    public static final boolean method2235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class163.field2852[var12][var13] = 0;
                class202.field3485[var12][var13] = 99999999;
            }
        }
        class163.field2852[arg0][arg1] = 99;
        class202.field3485[arg0][arg1] = 0;
        int var14 = 12 % ((arg10 - 8) / 49);
        byte var15 = 0;
        int var16 = arg1;
        int var17 = arg0;
        field5569++;
        class286.field4809[var15] = arg0;
        int var33 = var15 + 1;
        class79.field1342[var15] = arg1;
        int var18 = 0;
        boolean var19 = false;
        int[][] var20 = class180.field3071[class297.field5058].field3159;
        while (var33 != var18) {
            var16 = class79.field1342[var18];
            var17 = class286.field4809[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg11 == var17 && arg9 == var16) {
                var19 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class180.field3071[class297.field5058].method1311(arg4 - 1, var16, arg11, arg5, 2, var17, (byte) 28, arg9)) {
                    var19 = true;
                    break;
                }
                if (arg4 < 10 && class180.field3071[class297.field5058].method1316(2, var17, var16, arg4 - 1, arg11, arg5, -1, arg9)) {
                    var19 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg3 != 0 && class180.field3071[class297.field5058].method1302(arg3, 0, arg11, var17, var16, arg8, arg9, 2, arg6)) {
                var19 = true;
                break;
            }
            int var21 = class202.field3485[var17][var16] + 1;
            if (var17 > 0 && class163.field2852[var17 - 1][var16] == 0 && (var20[var17 - 1][var16] & 0x12C010E) == 0 && (var20[var17 - 1][var16 + 1] & 0x12C0138) == 0) {
                class286.field4809[var33] = var17 - 1;
                class79.field1342[var33] = var16;
                class163.field2852[var17 - 1][var16] = 2;
                var33 = var33 + 1 & 0xFFF;
                class202.field3485[var17 - 1][var16] = var21;
            }
            if (var17 < 102 && class163.field2852[var17 + 1][var16] == 0 && (var20[var17 + 2][var16] & 0x12C0183) == 0 && (var20[var17 + 2][var16 + 1] & 0x12C01E0) == 0) {
                class286.field4809[var33] = var17 + 1;
                class79.field1342[var33] = var16;
                var33 = var33 + 1 & 0xFFF;
                class163.field2852[var17 + 1][var16] = 8;
                class202.field3485[var17 + 1][var16] = var21;
            }
            if (var16 > 0 && class163.field2852[var17][var16 - 1] == 0 && (var20[var17][var16 - 1] & 0x12C010E) == 0 && (var20[var17 + 1][var16 - 1] & 0x12C0183) == 0) {
                class286.field4809[var33] = var17;
                class79.field1342[var33] = var16 - 1;
                class163.field2852[var17][var16 - 1] = 1;
                var33 = var33 + 1 & 0xFFF;
                class202.field3485[var17][var16 - 1] = var21;
            }
            if (var16 < 102 && class163.field2852[var17][var16 + 1] == 0 && (var20[var17][var16 + 2] & 0x12C0138) == 0 && (var20[var17 + 1][var16 + 2] & 0x12C01E0) == 0) {
                class286.field4809[var33] = var17;
                class79.field1342[var33] = var16 + 1;
                class163.field2852[var17][var16 + 1] = 4;
                class202.field3485[var17][var16 + 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var17 > 0 && var16 > 0 && class163.field2852[var17 - 1][var16 - 1] == 0 && (var20[var17 - 1][var16] & 0x12C0138) == 0 && (var20[var17 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var17][var16 - 1] & 0x12C0183) == 0) {
                class286.field4809[var33] = var17 - 1;
                class79.field1342[var33] = var16 - 1;
                class163.field2852[var17 - 1][var16 - 1] = 3;
                var33 = var33 + 1 & 0xFFF;
                class202.field3485[var17 - 1][var16 - 1] = var21;
            }
            if (var17 < 102 && var16 > 0 && class163.field2852[var17 + 1][var16 - 1] == 0 && (var20[var17 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[var17 + 2][var16 - 1] & 0x12C0183) == 0 && (var20[var17 + 2][var16] & 0x12C01E0) == 0) {
                class286.field4809[var33] = var17 + 1;
                class79.field1342[var33] = var16 - 1;
                var33 = var33 + 1 & 0xFFF;
                class163.field2852[var17 + 1][var16 - 1] = 9;
                class202.field3485[var17 + 1][var16 - 1] = var21;
            }
            if (var17 > 0 && var16 < 102 && class163.field2852[var17 - 1][var16 + 1] == 0 && (var20[var17 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var17 - 1][var16 + 2] & 0x12C0138) == 0 && (var20[var17][var16 + 2] & 0x12C01E0) == 0) {
                class286.field4809[var33] = var17 - 1;
                class79.field1342[var33] = var16 + 1;
                class163.field2852[var17 - 1][var16 + 1] = 6;
                class202.field3485[var17 - 1][var16 + 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var17 < 102 && var16 < 102 && class163.field2852[var17 + 1][var16 + 1] == 0 && (var20[var17 + 1][var16 + 2] & 0x12C0138) == 0 && (var20[var17 + 2][var16 + 2] & 0x12C01E0) == 0 && (var20[var17 + 2][var16 + 1] & 0x12C0183) == 0) {
                class286.field4809[var33] = var17 + 1;
                class79.field1342[var33] = var16 + 1;
                class163.field2852[var17 + 1][var16 + 1] = 12;
                class202.field3485[var17 + 1][var16 + 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
        }
        class166.field2907 = 0;
        if (!var19) {
            if (!arg7) {
                return false;
            }
            int var22 = 1000;
            byte var23 = 10;
            int var24 = 100;
            for (int var25 = arg11 - var23; var25 <= (arg11 + var23); var25++) {
                for (int var26 = arg9 - var23; var26 <= (arg9 + var23); var26++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && class202.field3485[var25][var26] < 100) {
                        int var27 = 0;
                        if (var25 < arg11) {
                            var27 = arg11 - var25;
                        } else if (var25 > (arg11 + arg8 - 1)) {
                            var27 = -arg8 - (arg11 - var25 - 1);
                        }
                        int var28 = 0;
                        if (var26 < arg9) {
                            var28 = arg9 - var26;
                        } else if (var26 > (arg3 + arg9 - 1)) {
                            var28 = var26 + 1 - arg9 - arg3;
                        }
                        int var29 = var27 * var27 + var28 * var28;
                        if (var29 < var22 || var22 == var29 && var24 > class202.field3485[var25][var26]) {
                            var16 = var26;
                            var22 = var29;
                            var24 = class202.field3485[var25][var26];
                            var17 = var25;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg0 == var17 && arg1 == var16) {
                return false;
            }
            class166.field2907 = 1;
        }
        byte var30 = 0;
        class286.field4809[var30] = var17;
        int var34 = var30 + 1;
        class79.field1342[var30] = var16;
        int var31;
        int var32 = var31 = class163.field2852[var17][var16];
        while (arg0 != var17 || arg1 != var16) {
            if (var31 != var32) {
                var31 = var32;
                class286.field4809[var34] = var17;
                class79.field1342[var34++] = var16;
            }
            if ((var32 & 0x1) != 0) {
                var16++;
            } else if ((var32 & 0x4) != 0) {
                var16--;
            }
            if ((var32 & 0x2) != 0) {
                var17++;
            } else if ((var32 & 0x8) != 0) {
                var17--;
            }
            var32 = class163.field2852[var17][var16];
        }
        if (var34 > 0) {
            class193.method1342(var34, arg2, -31);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 476)
    public static void method2236(byte arg0) {
        field5564 = (byte[][]) null;
        if (arg0 <= -27) {
            field5571 = null;
        }
    }
}
