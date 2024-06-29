import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class564 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
    public static boolean field7164 = false;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lrn;")
    public static class633 field7162 = new class633(63, -1);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
    public static void method3050(boolean arg0) {
        if (!arg0) {
            method3050(true);
        }
        field7162 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
    public static final void method3051(int arg0, int arg1) {
        field7165++;
        class614 var2 = class497.method2759(10, 5977, (long) arg0);
        if (arg1 != -2029241008) {
            method3052(null, true, 23);
        }
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Luaa;ZI)V")
    public static final void method3052(class391 arg0, boolean arg1, int arg2) {
        field7163++;
        int var3 = arg0.field4991 == 0 ? arg0.field5117 : arg0.field4991;
        int var4 = ~arg0.field5010 == arg2 ? arg0.field5031 : arg0.field5010;
        class783.method4297(arg0.field5151, arg1, var4, 0, class647.field8259[arg0.field5151 >> 16], var3);
        if (arg0.field5145 != null) {
            class783.method4297(arg0.field5151, arg1, var4, 0, arg0.field5145, var3);
        }
        class278 var5 = (class278) class149.field1895.method2616((long) arg0.field5151, (byte) -103);
        if (var5 != null) {
            class552.method2995(arg1, var4, var3, -1, var5.field3617);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIII[BI[BI)V")
    public static final void method3053(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field7161++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg5[var10001] = (byte) (arg5[var10001] - arg7[arg6++]);
                int var14 = arg8++;
                arg5[var14] = (byte) (arg5[var14] - arg7[arg6++]);
                int var15 = arg8++;
                arg5[var15] = (byte) (arg5[var15] - arg7[arg6++]);
                int var16 = arg8++;
                arg5[var16] = (byte) (arg5[var16] - arg7[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg5[var10001] = (byte) (arg5[var10001] - arg7[arg6++]);
            }
            arg6 += arg0;
            arg8 += arg1;
        }
        if (arg2 != 16182) {
            field7160 = 22;
        }
    }
}
