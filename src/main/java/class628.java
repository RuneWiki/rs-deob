import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class628 extends class322 {

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V", line = 4)
    public final void method23(boolean arg0) {
        if (!arg0) {
            if (super.field4450.field6556.method2649((byte) -114) && super.field4451 == 2) {
                super.field4451 = 1;
            }
            ++field8712;
            if (~super.field4451 > -1 || ~super.field4451 < -3) {
                super.field4451 = this.method17((byte) -90);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lch;)V", line = 20)
    public class628(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILch;)V", line = 24)
    public class628(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I", line = 28)
    public final int method19(int arg0, int arg1) {
        if (arg1 <= 10) {
            this.method17((byte) -128);
        }
        ++field8711;
        return 1;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V", line = 39)
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        if (arg0 == 0) {
            ++field8713;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)I", line = 52)
    public final int method17(byte arg0) {
        ++field8714;
        int var2 = 98 / ((70 - arg0) / 51);
        return 2;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)I", line = 65)
    public final int method3516(boolean arg0) {
        ++field8715;
        return arg0 ? -120 : super.field4451;
    }
}
