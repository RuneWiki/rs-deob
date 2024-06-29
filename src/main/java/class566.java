import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class566 extends Exception {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7571;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[I")
    public static int[] field7573;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I", line = 7)
    public static final int method3164(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class458.field6353 - 1; var2++) {
            if (arg0 < class418.field5999[var2] + class370.field5371[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class458.field6353 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)I", line = 32)
    public static final int method3165(int arg0, int arg1, int arg2) {
        if (arg1 != -1682735553) {
            method3166(-86);
        }
        field7572++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 49)
    public static void method3166(int arg0) {
        if (arg0 == -3917) {
            field7571 = null;
            field7573 = null;
        }
    }
}
