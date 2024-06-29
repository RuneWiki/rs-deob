import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class701 {

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "Llja;")
    public static class744 field9879 = new class744(16, 6);

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field9881 = 0;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)V")
    public static void method3971(boolean arg0) {
        if (arg0) {
            field9879 = null;
        }
        field9879 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIB)V")
    public static final void method3972(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var9 = arg3 + 1;
        class455.method2755(arg4, class4.field49[arg3], (byte) 53, arg1, arg2);
        if (arg5 < 101) {
            field9879 = null;
        }
        field9882++;
        int var8 = arg0 - 1;
        class455.method2755(arg4, class4.field49[arg0], (byte) 90, arg1, arg2);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class4.field49[var6];
            var7[arg2] = var7[arg1] = arg4;
        }
    }
}
