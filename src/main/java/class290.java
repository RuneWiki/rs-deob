import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class290 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lcc;")
    private static class209 field5108 = class95.method669(99, "Tue");

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5107 = 0;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lcc;")
    private static class209 field5112 = class95.method669(112, "Sun");

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field5109 = new int[1000];

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lcc;")
    private static class209 field5111 = class95.method669(92, "Sat");

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lcc;")
    private static class209 field5115 = class95.method669(100, "Wed");

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lcc;")
    private static class209 field5114 = class95.method669(88, "Mon");

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lcc;")
    private static class209 field5116 = class95.method669(113, "Fri");

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Lcc;")
    private static class209 field5117 = class95.method669(81, "Thu");

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[Lcc;")
    public static class209[] field5110 = new class209[] { field5112, field5114, field5108, field5115, field5117, field5116, field5111 };

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lca;")
    public static final class264 method1944(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2203; var4++) {
            class264 var5 = var3.field2189[var4];
            if ((var5.field4733 >> 29 & 0x3L) == 2L && var5.field4746 == arg1 && var5.field4741 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method1945(boolean arg0) {
        field5115 = null;
        field5108 = null;
        if (arg0) {
            return;
        }
        field5116 = null;
        field5114 = null;
        field5117 = null;
        field5110 = null;
        field5109 = null;
        field5112 = null;
        field5111 = null;
    }
}
