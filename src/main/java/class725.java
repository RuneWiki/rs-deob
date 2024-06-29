import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class725 extends class601 {

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILgn;)V", line = 3)
    public class725(int arg0, class699 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)V", line = 10)
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field10144;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V", line = 21)
    public final void method35(byte arg0) {
        if (arg0 < -37) {
            if (super.field8565 != 1 && ~super.field8565 != -1) {
                super.field8565 = this.method39((byte) -17);
            }
            ++field10146;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I", line = 37)
    public final int method4034(int arg0) {
        int var2 = 112 / ((-59 - arg0) / 61);
        ++field10142;
        return super.field8565;
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)I", line = 48)
    public final int method39(byte arg0) {
        ++field10141;
        return arg0 != -17 ? -65 : 1;
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(II)I", line = 59)
    public final int method34(int arg0, int arg1) {
        ++field10143;
        return arg1 != 15706 ? 91 : 1;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBI)Z", line = 72)
    public static final boolean method4035(int arg0, byte arg1, int arg2) {
        ++field10145;
        if (arg1 < 124) {
            method4035(65, (byte) 116, 70);
        }
        return ~(arg0 & 458752) != -1 | class756.method4200((byte) -46, arg0, arg2) || class713.method3987(arg0, 48, arg2);
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lgn;)V", line = 83)
    public class725(class699 arg0) {
        super(arg0);
    }
}
