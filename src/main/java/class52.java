import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class52 extends class150 {

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field738 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public static boolean field737 = false;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Log;")
    public static class157 field740 = null;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field735 = 0;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Log;")
    public static class157 field742;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 4)
    public static void method337(int arg0) {
        field742 = null;
        field740 = null;
        int var1 = 53 % ((82 - arg0) / 38);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 23)
    public static final void method338(int arg0) {
        if (arg0 < -77) {
            class76.field1064 = new class69(32);
            field741++;
        }
    }
}
