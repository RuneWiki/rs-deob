import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class90 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "[I")
    public static int[] field1081;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIILer;II)Lcea;")
    public static final class197 method807(int arg0, int arg1, int arg2, class92 arg3, int arg4, int arg5) {
        if (arg4 >= -111) {
            return null;
        }
        field1080++;
        if (!arg3.field1376 && (!class416.method2649(arg1, true) || !class416.method2649(arg5, true))) {
            return arg3.field1428 ? new class197(arg3, 34037, arg2, arg0, arg1, arg5, true) : new class197(arg3, arg2, arg0, arg1, arg5, class413.method2636(arg1, 127), class413.method2636(arg5, 127), true);
        } else {
            return new class197(arg3, 3553, arg2, arg0, arg1, arg5, true);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method808(int arg0) {
        if (arg0 > -108) {
            method808(-121);
        }
        field1081 = null;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
    public static final void method809(int arg0) {
        field1082++;
        if (class706.field9988 == 6) {
            int var1 = 111 % ((-arg0 - 51) / 38);
            class706.field9988 = 7;
        }
    }
}
