import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class25 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[Z")
    public static boolean[] field335 = new boolean[100];

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Loh;")
    public static class281 field333 = new class281(64);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lbk;")
    public static class21 field334;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method204(byte arg0) {
        field335 = null;
        field333 = null;
        int var1 = -78 % ((-arg0 - 55) / 58);
        field334 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method205(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field336++;
        if (!arg0) {
            return;
        }
        if (arg5 == arg7) {
            class239.method1642(arg5, -123, arg6, arg3, arg1, arg4, arg2);
        } else if (class223.field3423 <= (arg1 - arg5) && arg1 + arg5 <= class148.field2338 && class90.field1568 <= arg4 - arg7 && (arg4 + arg7) <= class266.field4247) {
            class159.method1073(arg7, arg5, arg6, arg1, (byte) -28, arg4, arg3, arg2);
        } else {
            class168.method1131(arg6, arg2, arg1, arg7, arg4, arg5, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([Lrh;IIZIIII[BII)V")
    public static final void method206(class47[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field337++;
        class88 var11 = new class88(arg8);
        int var12 = -1;
        if (arg2 != -6540) {
            return;
        }
        while (true) {
            int var13 = var11.method629(-109);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method666(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method633(arg2 ^ 0xFFFFE635);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg9 == var19 && var17 >= arg6 && (arg6 + 8) > var17 && arg4 <= var16 && var16 < arg4 + 8) {
                    class193 var22 = class69.method501(arg2 + 6540, var12);
                    int var23 = arg5 + class115.method818(var16 & 0x7, var22.field3063, arg2 + 6433, var17 & 0x7, var22.field3028, arg1, var21);
                    int var24 = arg10 + class8.method69(1, var22.field3028, var22.field3063, arg1, var16 & 0x7, var17 & 0x7, var21);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class47 var25 = null;
                        if (!arg3) {
                            int var26 = arg7;
                            if ((class181.field2827[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg0[var26];
                            }
                        }
                        class82.method584(arg3, var12, arg7, var23, arg1 + var21 & 0x3, var24, true, !arg3, arg7, var25, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIBII)V")
    public static final void method207(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field330++;
        class166.method1124(true, class154.field2406[arg1], arg0 + arg3, arg4, arg3 - arg0);
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        if (arg2 > -39) {
            field335 = null;
        }
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class154.field2406[arg1 + var6];
                int var10 = arg3 + var5;
                int[] var11 = class154.field2406[arg1 - var6];
                var7 -= var6 << 1;
                int var12 = arg3 - var5;
                class166.method1124(true, var9, var10, arg4, var12);
                class166.method1124(true, var11, var10, arg4, var12);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class154.field2406[arg1 + var5];
            int[] var16 = class154.field2406[arg1 - var5];
            class166.method1124(true, var15, var13, arg4, var14);
            class166.method1124(true, var16, var13, arg4, var14);
        }
    }
}
