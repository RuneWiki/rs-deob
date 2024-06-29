import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class683 extends class262 {

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "J")
    public static long field9763 = 0L;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "F")
    public static float field9764;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Lclient;")
    public static client field9762;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[Lte;")
    public static class568[] field9755;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZI)V")
    public final void method373(int arg0, boolean arg1, int arg2) {
        ++field9757;
        if (!arg1) {
            this.method374(115);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
    public final void method377(int arg0, boolean arg1) {
        ++field9758;
        if (arg0 <= 37) {
            this.method377(12, false);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public final boolean method375(int arg0) {
        if (arg0 != -18095) {
            return false;
        } else {
            ++field9759;
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
    public final void method372(boolean arg0, int arg1) {
        ++field9756;
        if (arg1 != 0) {
            field9762 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public final void method374(int arg0) {
        if (arg0 < 42) {
            this.method374(70);
        }
        ++field9760;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILoa;B)V")
    public final void method371(int arg0, class644 arg1, byte arg2) {
        ++field9761;
        super.field3601.method2316((byte) 87, arg1);
        super.field3601.method2362(arg0, false);
        if (arg2 <= 80) {
            field9763 = -112L;
        }
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)V")
    public static void method3865(int arg0) {
        if (arg0 != 0) {
            method3865(19);
        }
        field9755 = null;
        field9762 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lifa;)V")
    public class683(class393 arg0) {
        super(arg0);
    }
}
