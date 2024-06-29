import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public abstract class class715 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field10078 = -2;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Lga;")
    public static class420 field10079 = new class420();

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field10081;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "([II[Ljava/lang/String;)V", line = 4)
    public static final void method4042(int[] arg0, int arg1, String[] arg2) {
        class776.method4257(arg2, arg0, arg2.length - 1, (byte) -120, 0);
        field10080++;
        if (arg1 >= -110) {
            field10078 = 45;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(FBIFLbn;IFIFIF)[B", line = 17)
    public static final byte[] method4043(float arg0, byte arg1, int arg2, float arg3, class465 arg4, int arg5, float arg6, int arg7, float arg8, int arg9, float arg10) {
        field10081++;
        byte[] var11 = new byte[arg2 * arg7 * arg9];
        class286.method1918(arg5, arg9, arg2, var11, arg7, arg0, arg4, arg10, arg8, 0, 0, arg6, arg3);
        return arg1 == -46 ? var11 : null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V", line = 41)
    public static void method4044(boolean arg0) {
        if (arg0) {
            field10079 = null;
        }
        field10079 = null;
    }
}
