import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class695 extends class649 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Leda;")
    public static class14 field9855 = new class14(20);

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field9864 = -1;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lla;")
    public static class422 field9862;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I", line = 3)
    public final int method3878(int arg0) {
        ++field9856;
        return arg0 != 3 ? 42 : super.field9223;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lhs;)V", line = 19)
    public class695(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I", line = 22)
    public final int method135(int arg0) {
        ++field9857;
        int var2 = 42 % ((arg0 - -18) / 50);
        return super.field9224.method2291(-11) == class565.field8012 && super.field9224.method2294((byte) -118) ? 0 : 1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lei;I)I", line = 36)
    public static final int method3879(class180 arg0, int arg1) {
        ++field9858;
        if (arg1 > -107) {
            method3881(22, -81);
        }
        String var2 = class652.method3667(-116, arg0);
        return class632.field8881.method508(class625.field8753, var2, 173);
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 50)
    public static void method3880(int arg0) {
        if (arg0 != -1) {
            field9864 = -41;
        }
        field9855 = null;
        field9862 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V", line = 63)
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        ++field9860;
        if (arg1 > -120) {
            this.method3878(85);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 74)
    public final void method134(int arg0) {
        if (arg0 != 1) {
            method3879((class180) null, -109);
        }
        super.field9223 = this.method135(-92);
        ++field9861;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I", line = 85)
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            method3881(-9, 73);
        }
        ++field9859;
        return 3;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Z", line = 98)
    public static final boolean method3881(int arg0, int arg1) {
        ++field9863;
        if (arg1 != 2) {
            field9864 = -2;
        }
        return ~arg0 == -1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(ILhs;)V", line = 110)
    public class695(int arg0, class358 arg1) {
        super(arg0, arg1);
    }
}
