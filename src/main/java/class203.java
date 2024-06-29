import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class203 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZIII)V", line = 9)
    public static final void method1320(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2640++;
        long var6 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg5);
        if (arg3 != 30768) {
            method1320(-85, -51, false, -5, 41, -66);
        }
        class263 var8 = (class263) class349.field4467.method39(var6, arg3 ^ 0x436);
        if (var8 == null) {
            var8 = new class263();
            class349.field4467.method38(var8, arg3 ^ 0x781B, var6);
        }
        if (arg4 >= var8.field3523.length) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field3523.length; var11++) {
                var9[var11] = var8.field3523[var11];
                var10[var11] = var8.field3525[var11];
            }
            for (int var12 = var8.field3523.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field3525 = var10;
            var8.field3523 = var9;
        }
        var8.field3523[arg4] = arg1;
        var8.field3525[arg4] = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIIB)V", line = 66)
    public static final void method1321(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 > -11) {
            return;
        }
        class67.field909 = arg5;
        class608.field8220 = arg2;
        field2641++;
        class691.field9445 = arg1;
        class435.field5643 = arg3;
        class49.field690 = arg4;
        if (arg0 && class608.field8220 >= 100) {
            class499.field6555 = class435.field5643 * 512 + 256;
            class549.field7132 = class67.field909 * 512 + 256;
            class655.field9120 = class332.method1916(1218445319, class549.field7132, class390.field4991, class499.field6555) - class691.field9445;
        }
        class704.field9810 = 2;
    }
}
