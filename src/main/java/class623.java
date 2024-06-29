import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class623 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field8966 = null;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    public static int[] field8967 = new int[6];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Leq;")
    public static class209 field8965;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 5)
    public static final void method3605(byte arg0) {
        class166.field2454.method3048(false);
        field8964++;
        class467.field6734.method3048(false);
        class309.field4361.method3048(false);
        if (arg0 != 100) {
            field8966 = null;
        }
        class157.field2355.method3048(false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 20)
    public static void method3606(boolean arg0) {
        field8965 = null;
        if (!arg0) {
            method3607(true);
        }
        field8967 = null;
        field8966 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V", line = 35)
    public static final void method3607(boolean arg0) {
        class532.field7530.method606(class478.field6821, class118.field1858, class174.field2527);
        if (arg0) {
            field8965 = null;
        }
        field8968++;
    }
}
