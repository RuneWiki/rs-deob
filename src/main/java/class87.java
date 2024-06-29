import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class87 extends class262 {

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1363 = "flash1:";

    @OriginalMember(owner = "client!b", name = "H", descriptor = "[I")
    public static int[] field1366 = new int[2];

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field1367 = 0;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Lkc;")
    public static class301 field1368;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public static final void method611(int arg0, boolean arg1) {
        field1364++;
        if (arg1 == class313.field5037) {
            return;
        }
        if (arg0 != 0) {
            field1363 = null;
        }
        class313.field5037 = arg1;
        class50.method323((byte) -112);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method612(boolean arg0) {
        if (arg0) {
            method612(false);
        }
        field1363 = null;
        field1368 = null;
        field1366 = null;
    }
}
