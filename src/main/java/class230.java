import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class230 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
    public static boolean field3660 = true;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3664 = "Attack";

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3663 = "Members object";

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public static final void method1529(int arg0, int arg1, int arg2) {
        class23 var3 = class91.method694(arg2, 5, arg0 ^ 0x5467);
        field3662++;
        var3.method190(arg0 + 21518);
        if (arg0 != -21518) {
            method1531(-117);
        }
        var3.field361 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != 0) {
            method1531(-44);
        }
        field3661++;
        if (class32.field540 <= arg5 && arg5 <= class61.field1034 && class32.field540 <= arg7 && class61.field1034 >= arg7 && arg1 >= class32.field540 && class61.field1034 >= arg1 && class32.field540 <= arg6 && class61.field1034 >= arg6 && arg2 >= class108.field1650 && class154.field2509 >= arg2 && class108.field1650 <= arg4 && class154.field2509 >= arg4 && class108.field1650 <= arg3 && arg3 <= class154.field2509 && class108.field1650 <= arg9 && arg9 <= class154.field2509) {
            class80.method642(arg3, arg0, arg7, arg1, 122369068, arg2, arg4, arg9, arg6, arg5);
        } else {
            class10.method60(arg2, arg9, arg4, arg6, arg1, arg8 ^ 0xFFFF858E, arg7, arg3, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3663 = null;
        if (arg0 != -13993) {
            method1529(-7, -57, -66);
        }
        field3664 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method1532(byte arg0) {
        field3665++;
        class242.field3836.method1156(-63);
        if (arg0 > -37) {
            field3666 = 23;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class230() {
        new class140();
    }
}
