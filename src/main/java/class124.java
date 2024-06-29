import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class124 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lou;")
    public static class261 field1818 = new class261(8);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z", line = 8)
    public static final boolean method895(byte arg0) {
        field1819++;
        class201 var1 = (class201) class250.field3284.method1904(false);
        if (arg0 != -37) {
            method895((byte) -37);
        }
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field2729; var2++) {
            if (var1.field2735[var2] != null && var1.field2735[var2].field3311 == 0) {
                return false;
            }
            if (var1.field2726[var2] != null && var1.field2726[var2].field3311 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V", line = 51)
    public static void method896(boolean arg0) {
        if (!arg0) {
            field1818 = null;
        }
        field1818 = null;
    }
}
