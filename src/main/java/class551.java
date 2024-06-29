import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class551 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field7656;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method3251(int arg0) {
        field7656 = null;
        if (arg0 < 96) {
            field7656 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(FI[FIIBFFIIF)V")
    public abstract void method2911(float arg0, int arg1, float[] arg2, int arg3, int arg4, byte arg5, float arg6, float arg7, int arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)V")
    public static final void method3252(int arg0, int arg1, byte arg2) {
        int var3 = -101 % (-arg2 / 50);
        field7657++;
        class373.method2319(arg1, arg0, 14351);
    }
}
