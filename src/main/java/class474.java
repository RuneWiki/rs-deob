import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class474 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field6984 = 0;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6987 = new String[100];

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "F")
    public static float field6986;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6989;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 13)
    public static void method2864(byte arg0) {
        field6987 = null;
        if (arg0 == -122) {
            field6989 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V", line = 26)
    public static final void method2865(int arg0, int arg1, int arg2) {
        field6985++;
        int var3 = 121 / ((arg0 - 3) / 46);
        if (class353.field4926 == 1) {
            class264.method1699(arg2, class188.field2725, arg1, true);
        } else if (class353.field4926 == 2) {
            class420.method2583(-104, arg2, arg1);
        }
        class353.field4926 = 0;
        class188.field2725 = null;
    }
}
