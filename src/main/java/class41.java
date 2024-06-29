import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class41 extends class266 {

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "[I")
    public static int[] field523;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(IZ)V", line = 3)
    public final void method144(int arg0, boolean arg1) {
        if (arg0 == 1) {
            ++field525;
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)Z", line = 17)
    public final boolean method154(int arg0) {
        if (arg0 < 101) {
            return false;
        } else {
            ++field522;
            return true;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lek;IB)V", line = 30)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        super.field3785.method3232(false, arg0);
        if (arg2 >= -56) {
            field523 = null;
        }
        ++field528;
        super.field3785.method3229(arg1, 12);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V", line = 43)
    public static void method183(boolean arg0) {
        if (!arg0) {
            field523 = null;
        }
        field523 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 54)
    public final void method155(boolean arg0) {
        super.field3785.method3194(arg0, 0);
        ++field524;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lgj;)V", line = 62)
    public class41(class580 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)V", line = 66)
    public final void method156(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field527;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZ)V", line = 77)
    public final void method148(int arg0, boolean arg1) {
        super.field3785.method3194(true, arg0);
        ++field526;
    }
}
