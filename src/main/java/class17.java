import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class17 extends class642 {

    @OriginalMember(owner = "client!lga", name = "B", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!lga", name = "C", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!lga", name = "D", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V", line = 6)
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(FFIIIIFLbt;FIF[BI)V", line = 9)
    public static final void method123(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float arg6, class466 arg7, float arg8, int arg9, float arg10, byte[] arg11, int arg12) {
        field350++;
        if (arg4 >= 0) {
            method123(-0.7032253F, -0.12932822F, 36, -9, -2, -50, 0.43807504F, null, 2.0229352F, 126, -0.005757475F, null, 16);
        }
        for (int var13 = 0; var13 < arg3; var13++) {
            class49.method292(arg8, arg11, -127, arg2, arg0, arg7, arg6, arg1, arg10, arg3, var13, arg5, arg9, arg12);
            arg9 += arg5 * arg12;
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)[I", line = 30)
    public final int[] method3(int arg0, int arg1) {
        if (arg1 == -9) {
            field351++;
            return class542.field8026;
        } else {
            return null;
        }
    }
}
