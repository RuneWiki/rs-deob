import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class277 extends class601 {

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field4036 = 104;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method1863(int arg0) {
        ++field4041;
        if (arg0 == 0) {
            if (!class61.field875) {
                class61.field875 = true;
                class397.field5710 = true;
                class244.field3622 += (24.0F - class244.field3622) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field4037;
        int var2 = 58 / ((arg0 - 59) / 33);
        if (super.field8137.method2153(-9) == class712.field9955) {
            super.field8131 = 2;
        }
        if (super.field8131 < 0 || super.field8131 > 2) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        ++field4038;
        super.field8131 = arg1;
        int var3 = -3 / ((22 - arg0) / 34);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lqea;)V")
    public class277(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            return -66;
        } else {
            ++field4035;
            return 1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return 43;
        } else {
            ++field4040;
            return 1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(ILqea;)V")
    public class277(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)I")
    public final int method1864(int arg0) {
        ++field4039;
        if (arg0 != 0) {
            this.method36(-25, (byte) -97);
        }
        return super.field8131;
    }
}
