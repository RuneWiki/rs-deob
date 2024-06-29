import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class499 extends class712 {

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "[I")
    public static int[] field6976 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        super.field9945.method1506(16, arg0);
        ++field6971;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V")
    public static void method3016(int arg0) {
        if (arg0 == 36067) {
            field6976 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        super.field9945.method1458(arg1 ^ 399403340, arg2);
        ++field6974;
        super.field9945.method1503(arg0, (byte) 115);
        if (arg1 != 0) {
            field6972 = -59;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field6970;
            return true;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lrl;)V")
    public class499(class232 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        if (arg1 <= 44) {
            field6976 = null;
        }
        super.field9945.method1506(16, true);
        ++field6975;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 > 96) {
            ++field6973;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        ++field6977;
        if (arg0 < 39) {
            field6972 = 82;
        }
    }
}
