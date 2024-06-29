import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class406 extends class569 {

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field5429 = 0;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lf;")
    private class534 field5423;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
    public static final int method2274(int arg0) {
        if (arg0 != 0) {
            field5429 = -66;
        }
        ++field5425;
        return class189.field2171;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZ)V")
    public final void method449(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5430;
        int var5 = this.method3223((byte) 110) * super.field8096.field1972 / 10000;
        int[] var6 = new int[4];
        class701.field9813.method963(var6);
        class701.field9813.method982(arg2, arg0 + arg1, arg2 + var5, super.field8096.field1971 + arg1);
        this.field5423.method3003(arg2, arg1 - -2, super.field8096.field1972, super.field8096.field1971);
        class701.field9813.method982(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILwp;IB)V")
    public static final void method2275(int arg0, class452 arg1, int arg2, byte arg3) {
        ++field5427;
        if (class497.field7199 == null && !class188.field2148) {
            if (arg1 != null && class50.method262(arg1, -81) != null) {
                class497.field7199 = arg1;
                class480.field6918 = class50.method262(arg1, 120);
                class323.field3980 = false;
                class338.field4254 = 0;
                if (arg3 != 101) {
                    field5429 = 99;
                }
                class102.field1109 = arg0;
                class471.field6758 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
    public final boolean method157(boolean arg0) {
        ++field5428;
        return !super.method157(arg0) ? false : super.field8086.method3849(((class291) super.field8096).field3643, false);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ltf;Ltf;Lmd;)V")
    public class406(class701 arg0, class701 arg1, class291 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ltf;I[ILtf;)V")
    public static final void method2276(class701 arg0, int arg1, int[] arg2, class701 arg3) {
        class157.field1759 = arg3;
        class489.field7119 = arg0;
        if (arg2 != null) {
            class274.field3434 = arg2;
        }
        if (arg1 != 4) {
            field5429 = -69;
        }
        ++field5424;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZIZ)V")
    public final void method452(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field5431;
        class701.field9813.method999(arg2 + -2, arg0, super.field8096.field1972 + 4, super.field8096.field1971 + 2, ((class291) super.field8096).field3637, 0);
        if (!arg1) {
            field5429 = -102;
        }
        class701.field9813.method999(arg2 + -1, arg0 + 1, super.field8096.field1972 + 2, super.field8096.field1971, 0, 0);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method156(int arg0) {
        ++field5426;
        super.method156(arg0);
        this.field5423 = class316.method1814(((class291) super.field8096).field3643, (byte) 113, super.field8086);
    }
}
