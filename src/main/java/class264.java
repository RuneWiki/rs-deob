import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class264 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lgj;")
    public static class226 field4628 = new class226(64);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lmi;")
    public static class171 field4624;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method1797(byte arg0) {
        field4628 = null;
        if (arg0 < 117) {
            field4628 = null;
        }
        field4624 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method1798(boolean arg0) {
        class232.field3992 = class189.field3279;
        field4625++;
        class49.method386((byte) 60, arg0);
        class156.method1130(126);
        class60.method437(class232.field3992, (byte) -36);
        class163.field2943 = new class192();
        class163.field2943.field4492 = 3000;
        class163.field2943.field4466 = 3000;
        class129.method981(-111, class31.field549);
        class220.method1521(10, 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ltd;I)Ltd;")
    public abstract class158 method457(class158 arg0, int arg1);
}
