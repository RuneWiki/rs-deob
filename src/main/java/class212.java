import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class212 extends class128 {

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Lsk;")
    public static class231 field3070 = new class231(0, 0);

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3071 = 5063219;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIJ)Z", line = 7)
    public static final boolean method1532(int arg0, int arg1, int arg2, long arg3) {
        class167 var5 = class302.field4502[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2387 != null && var5.field2387.field172 == arg3) {
            return true;
        } else if (var5.field2412 != null && var5.field2412.field1311 == arg3) {
            return true;
        } else if (var5.field2390 != null && var5.field2390.field1195 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2407; var6++) {
                if (var5.field2406[var6].field2585 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)V", line = 39)
    public static void method1533(boolean arg0) {
        if (arg0) {
            method1533(true);
        }
        field3070 = null;
    }
}
