import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class283 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lns;")
    public static class55 field4316 = new class55(2, 5);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)[Lns;")
    public static final class55[] method1740(boolean arg0) {
        if (arg0) {
            field4316 = null;
        }
        field4315++;
        return new class55[] { class189.field2830, class429.field6306, field4316, class219.field3337, class140.field1880, class380.field5553, class327.field4922, class47.field580, class282.field4312, class333.field4970, class466.field6863, class137.field1859, class380.field5547, class180.field2712, class378.field5508 };
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method1741(int arg0) {
        if (arg0 != 5) {
            method1740(false);
        }
        field4316 = null;
    }
}
