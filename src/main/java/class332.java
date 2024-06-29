import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class332 extends class65 {

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field4880;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lpl;")
    public static class616 field4881 = new class616(64);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "F")
    public static float field4882;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIFIFLifa;FIIFF)[B", line = 5)
    public static final byte[] method2133(int arg0, int arg1, float arg2, int arg3, float arg4, class411 arg5, float arg6, int arg7, int arg8, float arg9, float arg10) {
        field4879++;
        byte[] var11 = new byte[arg1 * arg8 * arg7];
        class467.method2859(arg1, 118, arg2, arg4, var11, arg6, arg3, arg0, arg7, arg8, arg5, arg9, arg10);
        return var11;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 16)
    public static void method2134(int arg0) {
        if (arg0 == -25777) {
            field4881 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 29)
    public class332() {
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 33)
    public class332(int arg0) {
        this.field4880 = arg0;
    }
}
