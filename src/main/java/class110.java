import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class110 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljd;")
    private static class92 field2241 = class202.method1325((byte) 90, "Connecting to update server");

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljd;")
    public static class92 field2243 = class202.method1325((byte) 90, "<col=ffff00>");

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljd;")
    public static class92 field2247 = field2241;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljd;")
    public static class92 field2250 = class202.method1325((byte) 90, " loggt sich aus)3");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljd;")
    public static class92 field2248 = class202.method1325((byte) 90, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Ljd;")
    public static class92 field2249 = class202.method1325((byte) 90, "Registrierter Benutzer");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    public static int[] field2246 = new int[5];

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public static final int method749(int arg0) {
        field2244++;
        if (arg0 != 0) {
            method751(-29);
        }
        return class5.field278++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ)Ljd;")
    public static final class92 method750(int arg0, int arg1, boolean arg2) {
        field2242++;
        if (arg0 != 10) {
            field2245 = 27;
        }
        return class4.method30(arg1, 10, arg2, false);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method751(int arg0) {
        field2241 = null;
        field2248 = null;
        field2243 = null;
        field2249 = null;
        field2250 = null;
        int var1 = -116 % ((arg0 + 78) / 36);
        field2246 = null;
        field2247 = null;
    }
}
