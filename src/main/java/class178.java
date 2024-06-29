import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class178 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Z")
    public static boolean field2730 = true;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2733 = 0;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2735 = "cyan:";

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "[I")
    public static int[] field2738 = new int[1000];

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    public static final void method1262(int arg0, int arg1) {
        if (arg0 != 1) {
            field2738 = null;
        }
        class152.field2249.method1166((byte) 23, arg1);
        field2732++;
        class134.field2003.method1166((byte) 23, arg1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1263(byte arg0) {
        field2738 = null;
        field2735 = null;
        int var1 = 62 % ((-arg0 - 69) / 55);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1264(byte arg0) {
        if (arg0 != 40) {
            method1262(27, -6);
        }
        String var1;
        if (class173.field2658 == 1 && class14.field174 < 2) {
            var1 = class196.field3067 + class50.field812 + class202.field3120 + " ->";
        } else if (class162.field2438 && class14.field174 < 2) {
            var1 = class201.field3104 + class50.field812 + class202.field3119 + " ->";
        } else if (class101.field1582 && class292.field4537[81] && class14.field174 > 2) {
            var1 = class151.method1097(true, class14.field174 - 2);
        } else {
            var1 = class151.method1097(true, class14.field174 - 1);
        }
        field2729++;
        if (class14.field174 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class14.field174 - 2) + class295.field4654;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method1265(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class137.field2066[var1] = false;
        }
        class263.field4169 = -1;
        class218.field3333 = 0;
        class91.field1421 = -1;
        class175.field2704 = arg0;
        class269.field4261 = 0;
        field2728++;
    }
}
