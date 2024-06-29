import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class243 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lsr;")
    public static class228 field3465 = new class228();

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)V", line = 8)
    public static final void method1509(int arg0, int arg1, byte arg2) {
        field3467++;
        class679 var3 = class669.method3708(5, arg1, 1403048928);
        var3.method3748(true);
        int var4 = 73 / ((32 - arg2) / 49);
        var3.field9574 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 24)
    public static void method1510(int arg0) {
        if (arg0 != 5) {
            field3465 = null;
        }
        field3465 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIBIII)V", line = 35)
    public static final void method1511(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3466++;
        int var7 = arg1 - arg5;
        int var8 = arg5 + arg6;
        for (int var9 = arg6; var9 < var8; var9++) {
            class548.method3012(arg0, (byte) 23, arg2, arg4, class476.field6655[var9]);
        }
        int var10 = arg4 + arg5;
        int var11 = arg0 - arg5;
        if (arg3 != -63) {
            return;
        }
        for (int var12 = arg1; var12 > var7; var12--) {
            class548.method3012(arg0, (byte) 23, arg2, arg4, class476.field6655[var12]);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class476.field6655[var13];
            class548.method3012(var10, (byte) 23, arg2, arg4, var14);
            class548.method3012(arg0, (byte) 23, arg2, var11, var14);
        }
    }
}
