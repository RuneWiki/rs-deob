import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class506 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lrn;")
    public static class633 field6469 = new class633(16, 8);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6471 = "";

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6470 = new String[200];

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Ldj;")
    public static class735 field6473;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIB)V", line = 8)
    public static final void method2802(int arg0, int arg1, byte arg2) {
        field6472++;
        if (class201.field2799 == class186.field2600) {
            if (class11.method48(-71, arg1, 0, arg0, 1, -2, 0, 1, false)) {
                return;
            }
            class11.method48(-107, arg1, 0, arg0, 1, -3, 0, 1, false);
        } else if (class11.method48(-69, arg1, 0, arg0, 1, -3, 0, 1, false)) {
            return;
        } else {
            class11.method48(41, arg1, 0, arg0, 1, -2, 0, 1, false);
        }
        int var3 = -97 / ((arg2 - 33) / 33);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 40)
    public static void method2803(boolean arg0) {
        if (arg0) {
            field6473 = null;
            field6470 = null;
            field6471 = null;
            field6469 = null;
        }
    }
}
