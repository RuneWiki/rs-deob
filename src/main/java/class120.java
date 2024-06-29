import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class120 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Leb;")
    public static class230 field2115 = class68.method589(0, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Leb;")
    public static class230 field2118 = class68.method589(0, "welle2:");

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Leb;")
    public static class230 field2116 = class68.method589(0, "blaugr-Un:");

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lha;")
    public static class30 field2114 = new class30(16);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIZ)Leh;")
    public static final class80 method945(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var6 = (arg1 << 17) + (arg5 ? 65536 : 0) + (arg2 - -(arg4 << 19));
        field2113++;
        long var8 = (long) arg0 * 3147483667L + ((long) var6 * 3849834839L);
        if (arg3 != 250) {
            method947(false, (class245) null);
        }
        class80 var10 = (class80) class213.field3686.method1125(var8, true);
        if (var10 != null) {
            return var10;
        }
        class3.field22 = false;
        class80 var11 = class225.method1555(arg4, arg2, arg5, arg1, arg0, false, -98, false);
        if (var11 != null && !class3.field22) {
            class213.field3686.method1129(var8, true, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2116 = null;
        field2114 = null;
        field2118 = null;
        field2115 = null;
        if (arg0 != 411326771) {
            method947(false, (class245) null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLka;)Z")
    public static final boolean method947(boolean arg0, class245 arg1) {
        field2117++;
        if (arg0) {
            method945(-63, -91, 62, 126, 4, true);
        }
        if (arg1.field4226 == 205) {
            class260.field4630 = 250;
            return true;
        } else {
            return false;
        }
    }
}
