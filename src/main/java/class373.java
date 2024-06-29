import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class373 {

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Luw;")
    public static class208 field4560 = new class208(36, 4);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "[Lrh;")
    public class660[] field4561;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lmc;B)V", line = 4)
    public final void method2136(class234 arg0, byte arg1) {
        this.field4559 = arg0.method1500((byte) -110);
        field4557++;
        this.field4558 = arg0.method1553((byte) -124);
        this.field4561 = new class660[arg0.method1509(true)];
        class576[] var3 = class512.method2829((byte) -49);
        if (arg1 != -94) {
            method2138(-41);
        }
        for (int var4 = 0; var4 < this.field4561.length; var4++) {
            this.field4561[var4] = this.method2137((byte) 109, var3[arg0.method1509(true)], arg0);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLgp;Lmc;)Lrh;", line = 28)
    private final class660 method2137(byte arg0, class576 arg1, class234 arg2) {
        field4562++;
        if (class604.field7675 == arg1) {
            return class788.method4312(arg2, 10);
        } else if (class730.field9570 == arg1) {
            return class80.method496(0, arg2);
        } else {
            if (arg0 != 109) {
                field4560 = null;
            }
            if (class316.field3940 == arg1) {
                return class286.method1740(arg2, (byte) -13);
            } else if (class682.field8797 == arg1) {
                return class102.method585((byte) -128, arg2);
            } else if (class448.field5845 == arg1) {
                return class439.method2513(arg2, -113);
            } else if (class170.field2261 == arg1) {
                return class534.method2913(-53, arg2);
            } else if (class278.field3612 == arg1) {
                return class169.method1071(1, arg2);
            } else if (class598.field7611 == arg1) {
                return class695.method3707(arg2, arg0 - 107);
            } else if (class169.field2250 == arg1) {
                return class383.method2198(arg2, 0);
            } else if (class406.field5386 == arg1) {
                return class429.method2478(arg2, (byte) -57);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 78)
    public static void method2138(int arg0) {
        int var1 = -2 % ((arg0 - 55) / 34);
        field4560 = null;
    }
}
