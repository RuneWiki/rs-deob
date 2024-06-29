import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class623 extends class60 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "F")
    public static float field8548;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lhd;)V", line = 3)
    public class623(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I", line = 8)
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            return -69;
        } else {
            ++field8551;
            return 1;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I", line = 19)
    public final int method3543(int arg0) {
        ++field8553;
        return arg0 != 0 ? -122 : super.field799;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V", line = 30)
    public final void method407(byte arg0, int arg1) {
        ++field8552;
        super.field799 = arg1;
        int var3 = -85 / ((28 - arg0) / 50);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 41)
    public final void method409(byte arg0) {
        ++field8550;
        if (arg0 > -27) {
            this.method406(-82, 127);
        }
        if (~super.field799 > -1 || super.field799 > 4) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I", line = 59)
    public final int method405(boolean arg0) {
        if (arg0) {
            field8548 = -0.5010098F;
        }
        ++field8549;
        return 0;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(ILhd;)V", line = 70)
    public class623(int arg0, class773 arg1) {
        super(arg0, arg1);
    }
}
