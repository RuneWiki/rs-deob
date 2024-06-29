import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class276 extends class609 {

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field3920 = 0;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "Lhl;")
    public static class530 field3915;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1750(int arg0, String arg1) {
        class25.method125(arg0, "", 0, arg1, 0, "", "");
        ++field3921;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIIIF)V")
    public class276(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V")
    public static void method1751(int arg0) {
        field3915 = null;
        if (arg0 <= 40) {
            field3920 = 64;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIZ)V")
    public final void method881(int arg0, int arg1, int arg2, boolean arg3) {
        super.field8614 = arg2;
        if (!arg3) {
            field3920 = -124;
        }
        super.field8615 = arg1;
        super.field8611 = arg0;
        ++field3919;
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "(I)V")
    public static final void method1752(int arg0) {
        ++field3918;
        if (arg0 >= -38) {
            field3915 = null;
        }
        class391.field5887.method2289(1393);
        class382.field5761.method2289(1393);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(FI)V")
    public final void method879(float arg0, int arg1) {
        int var3 = -80 / ((-47 - arg1) / 39);
        super.field8617 = arg0;
        ++field3917;
    }

    @OriginalMember(owner = "client!up", name = "h", descriptor = "(I)[Lcda;")
    public static final class172[] method1753(int arg0) {
        ++field3916;
        if (arg0 >= -9) {
            field3915 = null;
        }
        return new class172[] { class324.field4617, class637.field8947, class686.field9488 };
    }
}
