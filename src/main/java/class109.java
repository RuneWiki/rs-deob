import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class109 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    public static int[] field1550 = new int[32];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lin;")
    public static class380 field1552;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method872(int arg0) {
        field1550 = null;
        if (arg0 != 9481) {
            field1550 = null;
        }
        field1552 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
    public static final int method873(byte arg0) {
        field1551++;
        return arg0 > -105 ? 0 : class12.field146++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1550[var1] = var0 - 1;
            var0 += var0;
        }
        field1552 = new class380(66, -1);
    }
}
