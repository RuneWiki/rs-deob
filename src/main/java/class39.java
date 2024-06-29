import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class39 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field520 = -1;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 <= 5) {
            method320(123, -88, 18, 96, 121, 6, 13, 59, -104);
        }
        field521++;
        if (class250.method1495(true, arg6)) {
            if (class376.field5673[arg6] == null) {
                class407.method2450(arg7, -1, arg3, false, arg1, arg5, arg0, class174.field2549[arg6], arg2, arg4);
            } else {
                class407.method2450(arg7, -1, arg3, false, arg1, arg5, arg0, class376.field5673[arg6], arg2, arg4);
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class147.field2223[var9] = true;
            }
        } else {
            class147.field2223[arg2] = true;
        }
    }
}
