import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class424 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5643 = -1;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Llb;")
    public static class495 field5641;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIBI)V", line = 7)
    public static final void method2292(int arg0, int arg1, byte arg2, int arg3) {
        if (arg0 == 0) {
            class480.method2802(class2.field10, 16751);
            class658.field9389++;
        }
        if (arg2 != -59) {
            method2292(-90, -49, (byte) 0, 86);
        }
        field5642++;
        if (arg0 == 1) {
            class480.method2802(class14.field132, 16751);
            class498.field7186++;
        }
        class334.field4314.method2540(class682.field9685 + arg1, arg2 ^ 0x58);
        class334.field4314.method2566(arg3 + class146.field1642, true);
        class334.field4314.method2570(class653.field9339.method1805((byte) -83, 82) ? 1 : 0, (byte) -75);
        class377.field4897 = arg1;
        class607.field8573 = false;
        class319.field4130 = arg3;
        class215.method1284(18);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 41)
    public static void method2293(int arg0) {
        if (arg0 == 1) {
            field5641 = null;
        }
    }
}
