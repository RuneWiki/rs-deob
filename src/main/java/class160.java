import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class160 extends class76 {

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "Lia;")
    private static class257 field2808 = class28.method234(-46, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
    public static int[] field2805 = new int[256];

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "Lia;")
    public static class257 field2810 = field2808;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "Lia;")
    private static class257 field2812 = class28.method234(125, "wave2:");

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "Lia;")
    public static class257 field2811 = field2812;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "Lia;")
    public static class257 field2809 = field2812;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lmb;")
    public static class178 field2806;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "[Lte;")
    public static class184[] field2803;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        field2808 = null;
        field2805 = null;
        field2811 = null;
        if (arg0 != -50) {
            return;
        }
        field2812 = null;
        field2806 = null;
        field2810 = null;
        field2809 = null;
        field2803 = null;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            field2805 = null;
        }
        field2807++;
        return class137.field2457;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class160() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)V")
    public static final void method1115(int arg0, int arg1) {
        field2813++;
        class250.field4308.method287(new class220(arg1), arg0);
    }
}
