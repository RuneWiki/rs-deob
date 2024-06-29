import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class467 {

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field6804 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Z")
    public static boolean field6801 = false;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[C")
    public static char[] field6806 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "F")
    public static float field6802;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "J")
    public static long field6803;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 4)
    public static void method2858(byte arg0) {
        if (arg0 != -55) {
            field6802 = 1.0280256F;
        }
        field6806 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIFF[BFIIIILifa;FF)V", line = 33)
    public static final void method2859(int arg0, int arg1, float arg2, float arg3, byte[] arg4, float arg5, int arg6, int arg7, int arg8, int arg9, class411 arg10, float arg11, float arg12) {
        field6805++;
        if (arg1 != 118) {
            method2858((byte) 88);
        }
        for (int var13 = 0; var13 < arg8; var13++) {
            class416.method2558((byte) 113, arg6, arg3, arg0, arg7, arg4, arg2, arg9, arg12, arg5, var13, arg8, arg11, arg10);
            arg7 += arg0 * arg9;
        }
    }
}
