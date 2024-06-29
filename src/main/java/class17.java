import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 extends class262 {

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lcf;")
    public static class235 field238;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Leg;")
    public class37 field239;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Leg;")
    public class37 field240;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Lc;")
    public final class64 method118(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field237;
            return class78.field1209[super.field4610];
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static void method119(int arg0) {
        int var1 = 1 % ((arg0 - -30) / 34);
        field238 = null;
    }
}
