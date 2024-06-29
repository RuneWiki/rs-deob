import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class267 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "J")
    public static long field3719 = 0L;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lcm;")
    public static class449 field3715 = new class449(30, 4);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Z", line = 6)
    public static final boolean method1708(byte arg0) {
        field3717++;
        if (class197.field2784) {
            try {
                class131.method841(class419.field6254.field6861, -14144, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 < 0) {
            field3719 = -26L;
        }
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 27)
    public static void method1709(byte arg0) {
        field3715 = null;
        if (arg0 <= 37) {
            field3719 = -49L;
        }
    }
}
