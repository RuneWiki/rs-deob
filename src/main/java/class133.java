import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class133 implements class292 {

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Lad;")
    public static class426 field2238 = new class426(6, 1);

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2241 = null;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2242 = null;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Z")
    public static boolean field2243 = false;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Lmu;")
    public static class303 field2239 = new class303(59, 3);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IJLoaa;[I)Ljava/lang/String;")
    public final String method1093(int arg0, long arg1, class290 arg2, int[] arg3) {
        field2237++;
        if (class470.field6592 == arg2) {
            class544 var6 = class54.field1112.method3056(true, arg3[0]);
            return var6.method3147((int) arg1, 91);
        } else if (class3.field24 == arg2 || class415.field6006 == arg2) {
            class352 var7 = class721.field9801.method162(arg0 - 99, (int) arg1);
            return var7.field4938;
        } else {
            if (arg0 != 1) {
                this.method1093(85, -41L, null, null);
            }
            return class749.field10377 == arg2 || class548.field7550 == arg2 || class545.field7516 == arg2 ? class54.field1112.method3056(true, arg3[0]).method3147((int) arg1, arg0 ^ 0x48) : null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static void method1094(int arg0) {
        field2242 = null;
        field2241 = null;
        int var1 = 74 / ((arg0 - 58) / 49);
        field2238 = null;
        field2239 = null;
    }
}
