import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class295 extends class110 implements class666 {

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lbt;")
    private class117 field3646;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I", line = 13)
    public final int method330(byte arg0) {
        if (arg0 < 11) {
            this.field3646 = null;
        }
        ++field3649;
        return super.method330((byte) 90);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 24)
    public final Buffer method1486(byte arg0, boolean arg1) {
        ++field3647;
        if (arg0 != -88) {
            this.method1486((byte) -113, true);
        }
        return super.method616(arg1, (byte) 51, super.field1448.field4361);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lbt;", line = 37)
    public final class117 method1484(int arg0) {
        if (arg0 != -17318) {
            this.field3646 = null;
        }
        ++field3653;
        return this.field3646;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V", line = 51)
    public static final void method1651(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 != arg0) {
            if (arg1 == 1007) {
                class197.method1201(class307.field3918, arg3, arg2);
            } else if (~arg1 != -1011) {
                if (arg1 != 1002) {
                    if (~arg1 == -1007) {
                        class197.method1201(class450.field5756, arg3, arg2);
                    }
                } else {
                    class197.method1201(class509.field6910, arg3, arg2);
                }
            } else {
                class197.method1201(class693.field9832, arg3, arg2);
            }
        } else {
            class197.method1201(class497.field6555, arg3, arg2);
        }
        ++field3651;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Llm;Lbt;Z)V", line = 78)
    public class295(class337 arg0, class117 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field3646 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z", line = 86)
    public final boolean method1485(byte arg0) {
        if (arg0 < 10) {
            this.field3646 = null;
        }
        ++field3654;
        return super.method621(super.field1448.field4361, 35040);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 100)
    public final void method323(int arg0) {
        ++field3648;
        super.method323(arg0);
        if (arg0 != -21271) {
            this.method619(107, -114);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 111)
    public final void method619(int arg0, int arg1) {
        ++field3652;
        super.method619(arg0, this.field3646.field1505 * arg1);
    }
}
