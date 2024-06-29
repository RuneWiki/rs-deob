import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class597 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lmq;")
    private class472 field8623 = new class472(64);

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Ljn;")
    private class668 field8624;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method3455(boolean arg0, int arg1) {
        class385.field5130 = arg1;
        field8621++;
        class472 var2 = class228.field2961;
        synchronized (class228.field2961) {
            class228.field2961.method2776(arg0);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIIILga;BI)Z", line = 21)
    public static final boolean method3456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class370 arg8, byte arg9, int arg10) {
        field8622++;
        int var11 = arg4;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        class674.field9680[var13][var14] = 99;
        int var16 = arg0 - var14;
        class180.field2218[var13][var14] = 0;
        byte var17 = 0;
        class665.field9413[var17] = arg4;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class62.field997[var10001] = arg0;
        int[][] var19 = arg8.field4979;
        if (arg9 != 84) {
            return true;
        }
        while (var26 != var18) {
            var11 = class665.field9413[var18];
            var12 = class62.field997[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg8.field4978;
            int var23 = var12 - arg8.field4975;
            if (arg1 == -4) {
                if (arg3 == var11 && arg2 == var12) {
                    class195.field2365 = var12;
                    class295.field3984 = var11;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class204.method1235(arg7, arg9 - 30587, 2, arg10, 2, var12, arg3, var11, arg2)) {
                    class295.field3984 = var11;
                    class195.field2365 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg8.method2142(2, (byte) 14, arg2, arg7, arg3, 2, var12, var11, arg6, arg10)) {
                    class295.field3984 = var11;
                    class195.field2365 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg8.method2135(arg9 - 84, var12, arg6, 2, arg3, arg2, var11, arg10, arg7)) {
                    class195.field2365 = var12;
                    class295.field3984 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg8.method2132(2, arg2, var11, arg3, arg5, arg1, var12, (byte) 105)) {
                    class195.field2365 = var12;
                    class295.field3984 = var11;
                    return true;
                }
            } else if (arg8.method2139(arg1, -1, arg3, arg2, arg5, var11, 2, var12)) {
                class295.field3984 = var11;
                class195.field2365 = var12;
                return true;
            }
            int var25 = class180.field2218[var21][var20] + 1;
            if (var21 > 0 && class674.field9680[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class665.field9413[var26] = var11 - 1;
                class62.field997[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var21 - 1][var20] = 2;
                class180.field2218[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class674.field9680[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class665.field9413[var26] = var11 + 1;
                class62.field997[var26] = var12;
                class674.field9680[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class180.field2218[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class674.field9680[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class665.field9413[var26] = var11;
                class62.field997[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var21][var20 - 1] = 1;
                class180.field2218[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class674.field9680[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class665.field9413[var26] = var11;
                class62.field997[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var21][var20 + 1] = 4;
                class180.field2218[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class674.field9680[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class665.field9413[var26] = var11 - 1;
                class62.field997[var26] = var12 - 1;
                class674.field9680[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class180.field2218[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class674.field9680[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class665.field9413[var26] = var11 + 1;
                class62.field997[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var21 + 1][var20 - 1] = 9;
                class180.field2218[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class674.field9680[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class665.field9413[var26] = var11 - 1;
                class62.field997[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var21 - 1][var20 + 1] = 6;
                class180.field2218[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class674.field9680[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class665.field9413[var26] = var11 + 1;
                class62.field997[var26] = var12 + 1;
                class674.field9680[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class180.field2218[var21 + 1][var20 + 1] = var25;
            }
        }
        class195.field2365 = var12;
        class295.field3984 = var11;
        return false;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Ldj;", line = 377)
    public final class314 method3457(int arg0, int arg1) {
        field8620++;
        class472 var3 = this.field8623;
        class314 var4;
        synchronized (this.field8623) {
            var4 = (class314) this.field8623.method2766(-126, (long) arg1);
        }
        if (arg0 > -66) {
            this.field8624 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field8624;
        byte[] var6;
        synchronized (this.field8624) {
            var6 = this.field8624.method3800(arg1, 5, (byte) -92);
        }
        class314 var7 = new class314();
        if (var6 != null) {
            var7.method1835((byte) 127, new class389(var6));
        }
        class472 var8 = this.field8623;
        synchronized (this.field8623) {
            this.field8623.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 412)
    public class597(class90 arg0, int arg1, class668 arg2) {
        this.field8624 = arg2;
        this.field8624.method3805(5, false);
    }
}
