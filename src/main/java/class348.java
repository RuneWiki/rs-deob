import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class348 extends class322 {

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)I", line = 3)
    public final int method17(byte arg0) {
        ++field4916;
        int var2 = 9 % ((arg0 - 70) / 51);
        return super.field4450.method2751(-18373) ? 1 : 0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method2248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class200.field2636 != null) {
            class200.field2636[arg0][arg1] = -16777216 | arg2;
        }
        if (class130.field1565 != null) {
            class130.field1565[arg0][arg1] = (short) arg3;
        }
        if (class414.field5823 != null) {
            class414.field5823[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(ILch;)V", line = 28)
    public class348(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lch;)V", line = 32)
    public class348(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)I", line = 35)
    public final int method2249(boolean arg0) {
        ++field4921;
        if (arg0) {
            this.method17((byte) -124);
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I", line = 51)
    public final int method19(int arg0, int arg1) {
        ++field4919;
        if (arg1 <= 10) {
            field4918 = 52;
        }
        return 3;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)V", line = 64)
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field4917;
        if (arg0 != 0) {
            field4922 = 7;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V", line = 77)
    public final void method23(boolean arg0) {
        super.field4451 = this.method17((byte) 127);
        if (arg0) {
            field4922 = 1;
        }
        ++field4920;
    }
}
