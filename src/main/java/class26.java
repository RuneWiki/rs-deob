import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 extends Exception {

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "[I")
    public static int[] field435 = new int[120];

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "Ldb;")
    public static class298 field436;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "Lxa;")
    public static class468 field433;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field435[var1] = var0 / 4;
        }
        field436 = new class298(30, -1);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIFIIFF[BFILfq;F)V", line = 5)
    public static final void method224(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7, byte[] arg8, float arg9, int arg10, class189 arg11, float arg12) {
        if (arg2 != -2364) {
            return;
        }
        for (int var13 = 0; var13 < arg10; var13++) {
            class693.method3845(arg7, arg5, arg3, arg8, arg1, arg0, 2, var13, arg12, arg4, arg10, arg9, arg6, arg11);
            arg0 += arg4 * arg5;
        }
        field430++;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)V", line = 27)
    public static void method225(boolean arg0) {
        field436 = null;
        field435 = null;
        field433 = null;
        if (!arg0) {
            field435 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIII[B[B)V", line = 39)
    public static final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
        field431++;
        if (arg2 != 0) {
            return;
        }
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg7[arg3++];
                int var14 = arg0++;
                arg8[var14] += arg7[arg3++];
                int var15 = arg0++;
                arg8[var15] += arg7[arg3++];
                int var16 = arg0++;
                arg8[var16] += arg7[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg7[arg3++];
            }
            arg0 += arg1;
            arg3 += arg4;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLoa;)V", line = 84)
    public static final void method227(boolean arg0, class651 arg1) {
        field432++;
        class700.field9851 = class407.method2337(true, class688.field9680, -115, arg1);
        class664.field9424 = class30.method249(class688.field9680, arg1, 0);
        class188.field2788 = class407.method2337(true, class389.field5148, -122, arg1);
        class665.field9437 = class30.method249(class389.field5148, arg1, 0);
        if (!arg0) {
            class450.field6177 = class407.method2337(true, class326.field4505, -99, arg1);
            class193.field2823 = class30.method249(class326.field4505, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIII)Z", line = 106)
    public static final boolean method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field434++;
        if (arg0 >= -87) {
            field435 = null;
        }
        for (int var6 = arg4; var6 <= arg1; var6++) {
            for (int var7 = arg2; var7 <= arg3; var7++) {
                if (class572.field7595[var6][var7] == arg5 && class223.field3136[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
