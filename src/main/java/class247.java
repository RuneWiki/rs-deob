import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class247 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "Ldk;")
    public static class421 field3364;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1478(boolean arg0) {
        if (!arg0) {
            method1479(11, -83, -47, -2, false, 31, -66, 3, 44);
        }
        field3364 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIZIIII)Z", line = 18)
    public static final boolean method1479(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg4) {
            field3363 = -23;
        }
        field3366++;
        if (arg3 < arg6 + arg7 && (arg0 + arg3) > arg6) {
            return (arg1 + arg2) > arg8 && arg1 < arg5 + arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 45)
    public static final void method1480(int arg0) {
        if (arg0 > -110) {
            method1479(70, -72, -50, 66, false, -34, -119, 13, -117);
        }
        field3365++;
        class49.field693++;
        class274.method1602(14, class467.field6760);
        class17.field275.method1857(561746448, class123.field1903);
    }
}
