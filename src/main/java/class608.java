import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class608 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
    public static int[] field8282 = new int[25];

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field8289 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Lpfa;")
    public static class275 field8288;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lrr;IIILoa;IILfa;I)V")
    public static final void method3378(class337 arg0, int arg1, int arg2, int arg3, class650 arg4, int arg5, int arg6, class219 arg7, int arg8) {
        field8283++;
        if (arg2 != 16805) {
            return;
        }
        class663 var9 = class530.field6699.method93(arg1, (byte) 83);
        if (var9 == null || !var9.field9001 || !var9.method3688((byte) 125, class327.field4084)) {
            return;
        }
        if (var9.field9003 != null) {
            int[] var10 = new int[var9.field9003.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class385.field4946 == 4) {
                    var13 = (int) class689.field9561 & 0x3FFF;
                } else {
                    var13 = (int) class689.field9561 + class290.field3661 & 0x3FFF;
                }
                int var14 = class243.field3129[var13];
                int var15 = class243.field3128[var13];
                if (class385.field4946 != 4) {
                    var15 = var15 * 256 / (class352.field4559 + 256);
                    var14 = var14 * 256 / (class352.field4559 + 256);
                }
                var10[var11 * 2] = ((var9.field9003[var11 * 2] * 4 + arg6) * var15 + (var9.field9003[var11 * 2 + 1] * 4 + arg3) * var14 >> 14) + arg0.field4309 / 2 + arg8;
                var10[var11 * 2 + 1] = arg0.field4211 / 2 + arg5 - ((var9.field9003[var11 * 2 + 1] * 4 + arg3) * var15 + -((var9.field9003[var11 * 2] * 4 + arg6) * var14) >> 14);
            }
            class271.method1613(arg4, var10, var9.field8984, arg0.field4283, arg0.field4261);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg4.method447(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 3], var9.field9005, 1, arg7, arg8, arg5);
            }
            arg4.method447(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field9005, 1, arg7, arg8, arg5);
        }
        class468 var16 = null;
        if (var9.field8978 != -1) {
            var16 = var9.method3689(false, 18471, arg4);
            if (var16 != null) {
                class376.method2169(arg6, var16, (byte) 17, arg3, arg5, arg8, arg7, arg0);
            }
        }
        if (var9.field8993 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1544();
        }
        class201 var18 = class711.field9937;
        class20 var19 = class595.field7985;
        if (var9.field8982 == 1) {
            var18 = class616.field8348;
            var19 = class321.field3994;
        }
        if (var9.field8982 == 2) {
            var19 = class36.field540;
            var18 = class336.field4143;
        }
        class384.method2206(arg5, var9.field8999, var18, arg0, arg8, var19, var9.field8993, var17, arg6, arg3, arg7, (byte) -105);
        return;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lfc;")
    public static final class243 method3379(int arg0) {
        field8285++;
        if (arg0 != 2) {
            field8282 = null;
        }
        class243 var1 = (class243) class214.field2512.method2502(false);
        if (var1 != null) {
            var1.method1566(arg0 - 114);
            var1.method2110(110);
            return var1;
        }
        class243 var2;
        do {
            var2 = (class243) class124.field1520.method2502(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method1456((byte) -126) > class321.method1854(-124)) {
                return null;
            }
            var2.method1566(arg0 - 90);
            var2.method2110(94);
        } while ((Long.MIN_VALUE & var2.field4648) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([II[J)V")
    public static final void method3380(int[] arg0, int arg1, long[] arg2) {
        class215.method1250(-113, arg0, 0, arg2, arg2.length + arg1);
        field8286++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method3381(boolean arg0) {
        field8282 = null;
        if (!arg0) {
            field8288 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII[BII)Z")
    public static final boolean method3382(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field8287++;
        int var7 = arg2 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg6 + arg5 - 1) / arg5);
        int var10 = -((arg2 + arg5 - 1) / arg5);
        int var11 = var9;
        if (arg0 != 4) {
            return false;
        }
        while (var11 < 0) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg5;
            }
            int var13 = arg1 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg3 + var13;
            var11++;
        }
        return false;
    }
}
