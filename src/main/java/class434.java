import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class434 extends class86 {

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Llq;")
    public class223 field6449;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Lcm;")
    public static class449 field6451 = new class449(77, 3);

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "Lpg;")
    public static class492 field6452 = new class492(63, 2);

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Lpg;")
    public static class492 field6453;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V")
    public static final void method2602() {
        class208.method1441(1, class222.field3107);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V")
    public static void method2603(byte arg0) {
        field6452 = null;
        field6451 = null;
        if (arg0 < 32) {
            field6452 = null;
        }
        field6453 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
    public static final int method2604(int arg0, int arg1, int arg2) {
        field6450++;
        if (arg0 <= 67) {
            method2602();
        }
        return arg2 == 4 || arg2 == 5 ? class396.field6019[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Llq;)V")
    public class434(class223 arg0) {
        this.field6449 = arg0;
    }
}
