import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class685 extends class60 {

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            return 120;
        } else {
            ++field9361;
            return ~super.field798.method4288(0).method1433(-20366) < -2 ? 4 : 2;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)I")
    public final int method3837(int arg0) {
        if (arg0 != 0) {
            return 83;
        } else {
            ++field9358;
            return super.field799;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        int var3 = 83 / ((arg0 - 28) / 50);
        ++field9356;
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(ILhd;)V")
    public class685(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(CI)Z")
    public static final boolean method3838(char arg0, int arg1) {
        if (arg1 != 17201) {
            return true;
        } else {
            ++field9360;
            return arg0 >= '0' && arg0 <= '9';
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        ++field9359;
        if (super.field799 < 0 && ~super.field799 < -5) {
            super.field799 = this.method405(false);
        }
        if (arg0 > -27) {
            this.method405(false);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            return 111;
        } else {
            ++field9357;
            return 1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lhd;)V")
    public class685(class773 arg0) {
        super(arg0);
    }
}
