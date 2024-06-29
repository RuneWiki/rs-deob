import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class248 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3849 = 0;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3853 = new String[100];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Ljk;")
    public static class297 field3854;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public static int[] field3851;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        class235.field3615 = null;
        class150.field2185 = null;
        field3855++;
        if (arg0 <= -95) {
            class134.field1970 = null;
            class81.field1262 = null;
            class227.field3542 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field3851 = null;
        field3854 = null;
        field3853 = null;
        if (arg0 != 15) {
            field3852 = true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)I")
    public static final int method1700(int arg0) {
        field3850++;
        return arg0 == 15 ? 15 : -114;
    }
}
