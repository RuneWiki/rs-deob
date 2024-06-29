import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class267 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4255 = "Connection lost.";

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4256 = 0;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lta;")
    public static class262 field4257 = new class262(30);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4258 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[I")
    public static int[] field4261 = new int[128];

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4259 = 0;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field4262 = 0;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4264 = -1;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4263 = 0;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
    public static void method1818(boolean arg0) {
        field4257 = null;
        field4255 = null;
        field4261 = null;
        if (arg0) {
            field4262 = -97;
        }
        field4258 = null;
    }
}
