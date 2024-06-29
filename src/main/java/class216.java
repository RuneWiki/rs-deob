import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class216 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lbr;")
    public static class223 field2866 = new class223(8);

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "S")
    public static short field2868 = 320;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "J")
    public static volatile long field2870 = 0L;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lrj;")
    public static class352 field2867;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 4)
    public static final void method1381(int arg0, byte arg1, String arg2, String arg3, String arg4, int arg5) {
        if (arg1 > -123) {
            field2869 = 46;
        }
        class70.method479(-1, arg5, (String) null, arg0, arg3, arg4, -1, arg2);
        field2865++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 24)
    public static void method1382(int arg0) {
        if (arg0 >= 97) {
            field2866 = null;
            field2867 = null;
        }
    }
}
