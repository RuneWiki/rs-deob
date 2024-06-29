import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class107 {

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "F")
    public static float field1432 = 0.0F;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "[I")
    public static int[] field1428 = new int[13];

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Lss;")
    public class283 field1436;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "Lva;")
    public class327 field1435;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method638(int arg0) {
        field1428 = null;
        if (arg0 != 14809) {
            method638(-106);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lhe;I)I")
    public static final int method639(class239 arg0, int arg1) {
        field1433++;
        if (arg1 != -26432) {
            method639(null, -81);
        }
        int var2 = 0;
        if (arg0.method1442(class46.field695, (byte) -111)) {
            var2++;
        }
        if (arg0.method1442(class122.field1598, (byte) -122)) {
            var2++;
        }
        return var2;
    }
}
