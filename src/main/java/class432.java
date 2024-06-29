import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class432 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
    public static boolean field6131 = false;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lwt;")
    public static class330 field6127 = new class330();

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lrda;")
    public static class692 field6132 = new class692("WIP", 2);

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(FZFFIIFFILgv;I)[B", line = 7)
    public static final byte[] method2623(float arg0, boolean arg1, float arg2, float arg3, int arg4, int arg5, float arg6, float arg7, int arg8, class89 arg9, int arg10) {
        if (arg1) {
            field6127 = null;
        }
        field6129++;
        byte[] var11 = new byte[arg5 * arg8 * arg4];
        class208.method1386(arg8, 0, arg2, var11, arg4, arg9, arg0, arg10, arg3, 123, arg5, arg6, arg7);
        return var11;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 33)
    public static void method2624(int arg0) {
        if (arg0 >= -116) {
            field6131 = false;
        }
        field6132 = null;
        field6127 = null;
    }
}
