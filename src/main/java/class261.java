import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class261 implements class462 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field3496 = 0;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(J[IILgh;)Ljava/lang/String;")
    public final String method1663(long arg0, int[] arg1, int arg2, class54 arg3) {
        field3498++;
        if (class686.field8835 == arg3) {
            class374 var6 = class407.field5416.method3669(arg1[0], false);
            return var6.method2148((byte) -95, (int) arg0);
        } else if (class640.field8170 == arg3 || class583.field7385 == arg3) {
            class48 var7 = class640.field8189.method705((int) arg0, -11467);
            return var7.field624;
        } else if (class41.field474 == arg3 || class409.field5430 == arg3 || class155.field1970 == arg3) {
            return class407.field5416.method3669(arg1[0], false).method2148((byte) -118, (int) arg0);
        } else {
            if (arg2 != 0) {
                field3496 = 84;
            }
            return null;
        }
    }
}
