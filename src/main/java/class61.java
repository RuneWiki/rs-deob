import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class61 {

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "[I")
    public static int[] field833 = new int[2];

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
    public static int[] field832 = new int[1024];

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V", line = 5)
    public static void method476(byte arg0) {
        if (arg0 == 35) {
            field833 = null;
            field832 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method477(boolean arg0) {
        field831++;
        class112 var1 = null;
        try {
            var1 = class256.method1547(0, "2");
            class179 var2 = new class179(class288.field3669 * 6 + 3);
            var2.method1141(1, -79);
            var2.method1157(class288.field3669, (byte) 126);
            for (int var3 = 0; var3 < class173.field2267.length; var3++) {
                if (class665.field9111[var3]) {
                    var2.method1157(var3, (byte) 122);
                    var2.method1112(class173.field2267[var3], -118);
                }
            }
            var1.method759(-1, var2.field2325, 0, var2.field2354);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method756(-1);
            }
        } catch (Exception var4) {
        }
        class619.field8676 = class97.method654((byte) 83);
        class125.field1497 = arg0;
    }
}
