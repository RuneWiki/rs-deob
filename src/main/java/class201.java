import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class201 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lr;")
    private static class66 field3457 = class93.method641(43, "Drop");

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static volatile int field3462 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3461 = 2301979;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lr;")
    public static class66 field3458 = field3457;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[J")
    public static long[] field3459 = new long[32];

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lr;")
    public static class66 field3464 = class93.method641(43, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1304(int arg0) {
        field3458 = null;
        field3459 = null;
        field3457 = null;
        if (arg0 > -100) {
            method1306(53, -1, -71);
        }
        field3464 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIILa;IJIIII)Z")
    public static final boolean method1305(int arg0, int arg1, int arg2, int arg3, class20 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class176.method1186(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
    public static final boolean method1306(int arg0, int arg1, int arg2) {
        if (arg2 != 28446) {
            return false;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        field3463++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class231 var3 = class52.method359(88, arg0);
        return var3.method1509(124, arg1);
    }
}
