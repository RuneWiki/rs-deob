import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class405 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field5676 = new int[25];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lwn;")
    public static class674 field5678;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method2359(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2) {
            field5678 = null;
        }
        field5677++;
        class255.method1573(arg1, arg6, arg3, arg4, arg0, 0, arg5, 0, arg8, arg7);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method2360(int arg0) {
        field5678 = null;
        if (arg0 != 10) {
            method2360(-105);
        }
        field5676 = null;
    }
}
