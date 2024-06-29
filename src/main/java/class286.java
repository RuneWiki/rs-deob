import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class286 {

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Z")
    public static boolean field4135 = false;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lkh;B)I")
    public static final int method1791(class13 arg0, byte arg1) {
        field4136++;
        if (arg1 != 78) {
            return 81;
        }
        class148 var2 = arg0.field210;
        if (var2.field2193 != null) {
            var2 = var2.method1059((byte) -51, class526.field7733);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2220;
        class441 var4 = arg0.method192(true);
        if (arg0.field393) {
            var3 = var2.field2212;
        } else if (arg0.field373 == var4.field6434 || arg0.field373 == var4.field6431 || arg0.field373 == var4.field6461 || arg0.field373 == var4.field6444) {
            var3 = var2.field2174;
        } else if (arg0.field373 == var4.field6469 || arg0.field373 == var4.field6432 || arg0.field373 == var4.field6435 || arg0.field373 == var4.field6468) {
            var3 = var2.field2198;
        }
        return var3;
    }
}
