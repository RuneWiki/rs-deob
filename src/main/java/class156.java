import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class156 extends class148 {

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lqd;")
    public static class173 field2439 = new class173(64);

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lle;")
    public static class197 field2440;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Ldk;")
    public static class251 field2441;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method1064(boolean arg0) {
        if (arg0) {
            method1064(false);
        }
        field2439 = null;
        field2440 = null;
        field2441 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Z")
    public static final boolean method1065(boolean arg0) {
        if (!arg0) {
            method1064(true);
        }
        field2437++;
        if (class281.field4493) {
            try {
                if ((Boolean) class297.method1967(false, "showingVideoAd", class268.field4323.field751)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
    public static final void method1066(byte arg0, int arg1) {
        field2438++;
        int var2 = 22 / ((arg0 - 33) / 62);
        class47.field796.method1262(arg1, 2736);
    }
}
