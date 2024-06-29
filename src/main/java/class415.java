import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class415 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field5486 = 0;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    public static int[] field5487 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BIFLfc;FFIIZIIFF)V", line = 5)
    public static final void method2397(byte[] arg0, int arg1, float arg2, class762 arg3, float arg4, float arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, float arg11, float arg12) {
        for (int var13 = 0; var13 < arg10; var13++) {
            class77.method475(arg10, arg3, arg7, arg6, arg4, 104, arg9, arg5, var13, arg1, arg11, arg2, arg0, arg12);
            arg7 += arg1 * arg9;
        }
        if (arg8) {
            method2399(-40);
        }
        field5485++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I", line = 33)
    public static final int method2398(int arg0, int arg1) {
        return class490.field6303 == null ? 0 : class490.field6303[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 40)
    public static void method2399(int arg0) {
        if (arg0 == 13) {
            field5487 = null;
        }
    }
}
