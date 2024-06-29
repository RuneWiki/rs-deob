import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class645 implements class762 {

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "Lmo;")
    public class780 field8954;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "Laj;")
    private class333 field8957;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "[I")
    public static int[] field8958 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "Z")
    public static boolean field8963 = false;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "Lvr;")
    public class147 field8964;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        field8953++;
        if (arg0 > 36) {
            this.field8964 = class454.method2694(47, this.field8957, this.field8954.field10693);
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)V")
    public static void method3580(boolean arg0) {
        if (arg0) {
            field8958 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(I)V")
    public static final void method3581(int arg0) {
        field8959++;
        if (class558.field7520 != null) {
            class558.field7520.method1265(-23318);
        }
        if (arg0 != 0) {
            method3580(true);
        }
        if (class268.field3953 != null) {
            class268.field3953.method1265(-23318);
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        if (arg0 != 20662) {
            method3580(true);
        }
        field8955++;
        return this.field8957.method2104(46, this.field8954.field10693);
    }

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "(I)V")
    public static final void method3582(int arg0) {
        class200.field2655.method2549(-104);
        field8962++;
        if (arg0 != 1) {
            method3582(39);
        }
        class718.field10015 = 0;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZ)V")
    public void method1500(int arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field8954.field10691.method3160(this.field8964.method1096(), class124.field1786, (byte) -91) + this.field8954.field10695;
            int var4 = this.field8954.field10697.method3543(0, class710.field9945, this.field8964.method1106()) + this.field8954.field10696;
            this.field8964.method1102(var3, var4);
        }
        field8961++;
        if (arg0 >= -93) {
            method3582(6);
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Laj;Lmo;)V")
    public class645(class333 arg0, class780 arg1) {
        this.field8954 = arg1;
        this.field8957 = arg0;
    }
}
