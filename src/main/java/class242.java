import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class242 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lsl;")
    public static class318 field3577 = new class318(59, 18);

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field3581 = 0;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Llq;")
    public static class385 field3582;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lfs;")
    public static class387 field3579;

    @OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field3576++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIIII)V", line = 16)
    public static final void method1597(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3578++;
        if (arg0 >= -95) {
            return;
        }
        if (arg2 == arg5) {
            class386.method2351(arg1, arg3, 26941, arg2, arg4);
        } else if (class72.field992 <= arg4 - arg2 && class126.field1842 >= arg2 + arg4 && class471.field6963 <= arg1 - arg5 && class401.field5947 >= (arg1 + arg5)) {
            class37.method288(arg1, arg2, -484166047, arg3, arg5, arg4);
        } else {
            class232.method1554(arg5, arg4, arg3, arg2, arg1, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 40)
    public static void method1598(int arg0) {
        field3582 = null;
        field3577 = null;
        if (arg0 != 10) {
            method1598(-105);
        }
        field3579 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 52)
    public static final boolean method1599(String arg0, int arg1) {
        if (arg1 != 59) {
            field3579 = null;
        }
        field3580++;
        return class488.method2938(arg0, 124, 10, true);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V", line = 75)
    public class242(int arg0, int arg1) {
        this.field3575 = arg0;
    }
}
