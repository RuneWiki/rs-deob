import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class83 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1128 = "";

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
    public static int[] field1127 = new int[2];

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lft;")
    public static class285 field1129 = new class285(8, 7);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1128 = null;
        field1127 = null;
        if (arg0 == 2) {
            field1129 = null;
        }
    }
}
