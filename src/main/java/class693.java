import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class693 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Lsb;")
    public static class305 field9723 = new class305(67, 2);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lwv;")
    public static class427 field9725;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 13)
    public static void method3815(int arg0) {
        field9723 = null;
        if (arg0 == -10319) {
            field9725 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method3816(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class639.field9075.field6764 * arg1 >> 8;
        field9722++;
        if (arg3 == -1 && !class19.field151) {
            class279.method1629(true);
        } else if (arg3 != -1 && (class331.field4169 != arg3 || !class614.method3415(-37)) && var4 != 0 && !class19.field151) {
            class201.method1202(arg3, 30127, false, class536.field7504, 0, arg2, var4);
        }
        class331.field4169 = arg3;
        if (arg0 >= -108) {
            method3816(-45, 61, 88, 49);
        }
    }
}
