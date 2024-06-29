import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class106 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[I")
    public static int[] field1631 = new int[128];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Luf;")
    public static class168 field1633 = class148.method1019(-1720, "settings=");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1634 = 0;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 27)
    public static void method790(int arg0) {
        field1631 = null;
        if (arg0 == 0) {
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lse;)V", line = 137)
    public static final void method791(class91 arg0) {
        for (int var1 = arg0.field1410; var1 <= arg0.field1406; var1++) {
            for (int var2 = arg0.field1412; var2 <= arg0.field1400; var2++) {
                class127 var3 = class92.field1424[arg0.field1396][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1970; var4++) {
                        if (var3.field1971[var4] == arg0) {
                            var3.field1970--;
                            for (int var5 = var4; var5 < var3.field1970; var5++) {
                                var3.field1971[var5] = var3.field1971[var5 + 1];
                                var3.field1977[var5] = var3.field1977[var5 + 1];
                            }
                            var3.field1971[var3.field1970] = null;
                            break;
                        }
                    }
                    var3.field1987 = 0;
                    for (int var6 = 0; var6 < var3.field1970; var6++) {
                        var3.field1987 |= var3.field1977[var6];
                    }
                }
            }
        }
    }
}
