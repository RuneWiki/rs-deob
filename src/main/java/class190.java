import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class190 {

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2855 = " is already on your friend list.";

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Ll;")
    public static class133 field2847;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2856;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 5)
    public static void method1358(int arg0) {
        field2847 = null;
        if (arg0 == -25177) {
            field2856 = null;
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lkh;II)V", line = 22)
    private final void method1359(class166 arg0, int arg1, int arg2) {
        field2853++;
        if (arg1 == arg2) {
            this.field2848 = arg0.method1151(arg2 ^ 0xFFFFFF9A);
            this.field2850 = arg0.method1178(0);
            this.field2852 = arg0.method1178(0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lkh;B)V", line = 41)
    public final void method1360(class166 arg0, byte arg1) {
        int var3 = 79 / ((-arg1 - 3) / 40);
        while (true) {
            int var4 = arg0.method1178(0);
            if (var4 == 0) {
                field2849++;
                return;
            }
            this.method1359(arg0, var4, 1);
        }
    }
}
