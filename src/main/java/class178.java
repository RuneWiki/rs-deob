import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class178 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public static int[] field2593 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lsm;")
    public static class249 field2594 = new class249();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1163(int arg0, boolean arg1) {
        if (arg1) {
            field2591++;
            class265 var2 = class440.method2554(arg0, 2, 9);
            var2.method1677(21748);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 20)
    public static void method1164(int arg0) {
        if (arg0 == 55) {
            field2594 = null;
            field2593 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 45)
    public static final void method1165(String arg0, byte arg1) {
        field2592++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class33.method257(arg1 - 90, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class205.field2934; var3++) {
            String var4 = class321.field4403[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class33.method257(arg1 - 122, var4);
            if (var5 != null && var5.equals(var2)) {
                class205.field2934--;
                for (int var6 = var3; var6 < class205.field2934; var6++) {
                    class321.field4403[var6] = class321.field4403[var6 + 1];
                    class160.field2301[var6] = class160.field2301[var6 + 1];
                    class439.field6023[var6] = class439.field6023[var6 + 1];
                    class396.field5559[var6] = class396.field5559[var6 + 1];
                    class135.field1887[var6] = class135.field1887[var6 + 1];
                    class356.field4978[var6] = class356.field4978[var6 + 1];
                }
                class145.field2047 = class122.field1700;
                class274.field3793++;
                class131.method793(class47.field755, 103);
                class366.field5214.method2470((byte) -74, class42.method349(arg0, arg1 - 36));
                class366.field5214.method2493((byte) -123, arg0);
                break;
            }
        }
        if (arg1 != 37) {
            method1164(-26);
        }
    }
}
