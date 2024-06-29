import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class519 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lu;")
    public static class341[] field7676;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method3086(byte arg0) {
        field7676 = null;
        if (arg0 != 16) {
            field7676 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILea;IBILeo;ILf;)V")
    public static final void method3087(int arg0, class113 arg1, int arg2, byte arg3, int arg4, class423 arg5, int arg6, class404 arg7) {
        field7677++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class396.field5271 == 4) {
            var8 = (int) class244.field3138 & 0x3FFF;
        } else {
            var8 = (int) class244.field3138 + class446.field6192 & 0x3FFF;
        }
        int var9 = Math.max(arg5.field5735 / 2, arg5.field5726 / 2) + 10;
        int var10 = arg2 * arg2 + arg4 * arg4;
        if ((var9 * var9) < var10 || arg3 > -110) {
            return;
        }
        int var11 = class21.field385[var8];
        int var12 = class21.field397[var8];
        if (class396.field5271 != 4) {
            var12 = var12 * 256 / (class364.field4694 + 256);
            var11 = var11 * 256 / (class364.field4694 + 256);
        }
        int var13 = arg2 * var11 + (arg4 * var12) >> 15;
        int var14 = arg2 * var12 - (arg4 * var11) >> 15;
        arg7.method351(arg5.field5735 / 2 + arg0 + var13 - arg7.method370() / 2, arg6 + arg5.field5726 / 2 + -var14 + -(arg7.method369() / 2), arg1, arg0, arg6);
    }
}
