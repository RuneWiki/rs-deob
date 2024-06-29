import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class374 implements class160 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Loi;")
    private class226 field4963;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lf;")
    public static class532 field4965;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZZ)V")
    public static final void method2146(boolean arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class366.field4829--;
            if (class366.field4829 == 0) {
                class104.field1240 = null;
            }
        }
        if (arg2) {
            field4962 = 88;
        }
        if (arg0) {
            class402.field5325--;
            if (class402.field5325 == 0) {
                class310.field4189 = null;
            }
        }
        field4961++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V")
    public final void method374(boolean arg0, byte arg1) {
        field4966++;
        if (arg1 > -85) {
            this.method404(false);
        }
        if (arg0) {
            class146.field1963.method1113(0, 0, class399.field5301, class60.field750, this.field4963.field2940, 0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public final void method402(int arg0) {
        field4960++;
        if (arg0 < 119) {
            this.method404(true);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Loi;)V")
    public class374(class226 arg0) {
        this.field4963 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method2147(int arg0) {
        if (arg0 != -3498) {
            field4965 = null;
        }
        field4965 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z")
    public final boolean method404(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field4964++;
            return true;
        }
    }
}
