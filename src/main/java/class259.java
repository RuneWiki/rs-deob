import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class259 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4058 = "Close";

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
    public static int[] field4060 = new int[1000];

    @OriginalMember(owner = "client!um", name = "h", descriptor = "F")
    public static float field4063 = 0.0F;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1772(int arg0) {
        class320.field4994.method2176((byte) 117);
        if (arg0 != 16582) {
            method1773(-11L, 31);
        }
        field4059++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(JI)V", line = 41)
    public static final void method1773(long arg0, int arg1) {
        field4056++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 1) {
            method1772(-49);
        }
        for (int var3 = 0; var3 < class225.field3579; var3++) {
            if (class35.field549[var3] == arg0) {
                class132.field2077++;
                class225.field3579--;
                for (int var4 = var3; var4 < class225.field3579; var4++) {
                    class51.field828[var4] = class51.field828[var4 + 1];
                    class148.field2252[var4] = class148.field2252[var4 + 1];
                    class1.field13[var4] = class1.field13[var4 + 1];
                    class35.field549[var4] = class35.field549[var4 + 1];
                    class233.field3702[var4] = class233.field3702[var4 + 1];
                    class220.field3347[var4] = class220.field3347[var4 + 1];
                }
                class161.field2423 = class291.field4524;
                class106.field1642.method753(arg1 - 82, 204);
                class106.field1642.method1125(arg1 + 8472, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 88)
    public static void method1774(int arg0) {
        field4060 = null;
        field4058 = null;
        int var1 = -4 / ((-arg0 - 35) / 54);
    }
}
