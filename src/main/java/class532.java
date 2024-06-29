import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class532 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "J")
    public static long field7342 = 0L;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field7343 = 0;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILoa;Llb;Lmaa;ILek;Z)V")
    public static final void method3018(int arg0, int arg1, class689 arg2, class679 arg3, class588 arg4, int arg5, class540 arg6, boolean arg7) {
        field7344++;
        if (!arg7) {
            return;
        }
        int var8 = arg4.field8077 - arg0 / 2 - 5;
        int var9 = arg5 + 2;
        if (arg3.field9637 != 0) {
            arg2.method3811(var9, arg0 + 10, -var9 + 1 + arg5 + arg1 * arg6.method3041(), var8, arg3.field9637, 106);
        }
        if (arg3.field9636 != 0) {
            arg2.method3819(arg0 + 10, -4, var9, arg3.field9636, var8, arg6.method3041() * arg1 + (arg5 - var9) + 1);
        }
        int var10 = arg3.field9619;
        if (arg4.field8073 && arg3.field9624 != -1) {
            var10 = arg3.field9624;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class411.field5759[var11];
            if ((arg1 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method3042(arg2, var12, arg4.field8077, arg5, var10, true);
            arg5 += arg6.method3041();
        }
    }
}
