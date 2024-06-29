import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class602 {

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "Lof;")
    public static class477 field8558;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V", line = 6)
    public static void method3497(int arg0) {
        if (arg0 != 34037) {
            field8558 = null;
        }
        field8558 = null;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIILlea;I)Luk;", line = 23)
    public static final class296 method3498(int arg0, int arg1, int arg2, class573 arg3, int arg4) {
        if (arg4 != -552) {
            field8558 = null;
        }
        field8559++;
        if (!arg3.field8186 && (!class362.method2181(arg2, -1) || !class362.method2181(arg1, -1))) {
            return arg3.field8220 ? new class296(arg3, 34037, arg0, arg2, arg1) : new class296(arg3, arg0, arg2, arg1, class661.method3706(arg2, true), class661.method3706(arg1, true));
        } else {
            return new class296(arg3, 3553, arg0, arg2, arg1);
        }
    }
}
