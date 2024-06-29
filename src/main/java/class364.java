import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class364 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Lrl;")
    public static class672 field5736 = new class672(49, 6);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Lqe;")
    public static class433 field5737;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method2419(byte arg0) {
        field5736 = null;
        int var1 = -32 / ((arg0 - 45) / 40);
        field5737 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V")
    public static final void method2420(int arg0, boolean arg1) {
        if (class204.field3327 == null) {
            class591.method3450(0);
        }
        field5735++;
        if (arg0 < 103) {
            field5737 = null;
        }
        if (arg1) {
            class204.field3327.method2933(27);
        }
    }
}
