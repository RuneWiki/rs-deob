import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class198 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "[I")
    public static int[] field2965 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "F")
    public static float field2964;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Lum;", line = 5)
    public static final class129 method1415(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5428;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 15)
    public static void method1416(byte arg0) {
        if (arg0 > -66) {
            field2964 = 0.501448F;
        }
        field2965 = null;
    }
}
