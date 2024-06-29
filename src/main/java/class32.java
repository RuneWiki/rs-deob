import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class32 {

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "Z")
    public static boolean field539 = false;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field540 = 1339;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BZ)V", line = 5)
    public static final void method200(byte arg0, boolean arg1) {
        field541++;
        if (arg0 != -53) {
            method200((byte) -61, false);
        }
        for (class65 var2 = (class65) class111.field1644.method1904(false); var2 != null; var2 = (class65) class111.field1644.method1901(97)) {
            if (var2.field1034 != null) {
                class556.field8166.method2205(var2.field1034);
                var2.field1034 = null;
            }
            if (var2.field1036 != null) {
                class556.field8166.method2205(var2.field1036);
                var2.field1036 = null;
            }
            var2.method2360((byte) 66);
        }
        if (!arg1) {
            return;
        }
        for (class65 var3 = (class65) class232.field3072.method1904(false); var3 != null; var3 = (class65) class232.field3072.method1901(arg0 ^ 0xFFFFFFA7)) {
            if (var3.field1034 != null) {
                class556.field8166.method2205(var3.field1034);
                var3.field1034 = null;
            }
            var3.method2360((byte) 66);
        }
        for (class65 var4 = (class65) class587.field8519.method1993(arg0 - 71); var4 != null; var4 = (class65) class587.field8519.method1997(arg0 + 9884)) {
            if (var4.field1034 != null) {
                class556.field8166.method2205(var4.field1034);
                var4.field1034 = null;
            }
            var4.method2360((byte) 66);
        }
    }
}
