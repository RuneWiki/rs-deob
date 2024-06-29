import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class153 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lmb;")
    private static class132 field2787 = class166.method1092("Create a free account", 116);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lmb;")
    public static class132 field2790 = class166.method1092("", 123);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lmb;")
    public static class132 field2791 = class166.method1092("sl_back", 124);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lmb;")
    public static class132 field2786 = field2787;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lnb;")
    public static class143 field2796;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lah;")
    public static class9 field2795;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public static int[] field2793;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method1001(byte arg0) {
        field2787 = null;
        field2791 = null;
        field2786 = null;
        field2796 = null;
        field2795 = null;
        if (arg0 == -122) {
            field2793 = null;
            field2790 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1002(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class135.field2542 <= arg4 && class168.field3083 >= arg4 && class135.field2542 <= arg6 && class168.field3083 >= arg6 && class135.field2542 <= arg7 && arg7 <= class168.field3083 && class135.field2542 <= arg1 && class168.field3083 >= arg1 && arg8 >= class169.field3161 && arg8 <= class17.field254 && arg9 >= class169.field3161 && arg9 <= class17.field254 && arg2 >= class169.field3161 && arg2 <= class17.field254 && arg5 >= class169.field3161 && class17.field254 >= arg5) {
            class59.method392(arg0, arg5, arg8, (byte) 83, arg2, arg9, arg7, arg1, arg4, arg6);
        } else {
            class122.method809(-107, arg9, arg8, arg1, arg2, arg7, arg6, arg4, arg0, arg5);
        }
        if (arg3 >= -6) {
            field2787 = null;
        }
        field2794++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lmb;")
    public static final class132 method1003(int arg0, int arg1) {
        field2788++;
        if (arg0 != -82) {
            method1001((byte) 90);
        }
        return arg1 < 999999999 ? class132.method889(arg1, (byte) 125) : class16.field242;
    }
}
