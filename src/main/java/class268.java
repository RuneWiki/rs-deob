import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class268 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lae;")
    public static class238 field4740 = new class238(128);

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Lli;")
    public static class185 field4743 = class245.method1649("Lade Liste der Welten", -107);

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lli;")
    private static class185 field4748 = class245.method1649(" is already on your friend list)3", 122);

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lli;")
    public static class185 field4746 = field4748;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Lli;")
    private static class185 field4750 = class245.method1649("Allocated memory", 126);

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lli;")
    public static class185 field4749 = field4750;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[[[I")
    public static int[][][] field4747;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljd;I)Ljg;")
    public static final class257 method1818(class118 arg0, int arg1) {
        field4739++;
        if (arg1 != -1) {
            field4749 = null;
        }
        return new class257(arg0.method876(65280), arg0.method876(65280), arg0.method876(65280), arg0.method876(arg1 ^ 0xFFFF00FF), arg0.method876(arg1 ^ 0xFFFF00FF), arg0.method876(65280), arg0.method876(65280), arg0.method876(arg1 + 65281), arg0.method873((byte) -121), arg0.method867(false));
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
    public static final int method1819(int arg0) {
        field4736++;
        if (arg0 != -23130) {
            field4740 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static final void method1820(int arg0) {
        field4735++;
        if (class66.field1146 < 0) {
            class251.field4472 = -1;
            class149.field2824 = -1;
            class66.field1146 = 0;
        }
        if (class66.field1146 > class56.field971) {
            class149.field2824 = -1;
            class66.field1146 = class56.field971;
            class251.field4472 = -1;
        }
        if (class212.field3884 < 0) {
            class149.field2824 = -1;
            class212.field3884 = 0;
            class251.field4472 = -1;
        }
        if (class212.field3884 > class125.field2246) {
            class251.field4472 = -1;
            class149.field2824 = -1;
            class212.field3884 = class125.field2246;
        }
        if (arg0 != -13248) {
            method1820(85);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lhi;B)V")
    public static final void method1821(class250 arg0, byte arg1) {
        class47.field771 = arg0;
        if (arg1 > -40) {
            field4745 = -97;
        }
        field4741++;
        class236.field4227 = class47.field771.method1693(16, 0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public static final void method1822(boolean arg0) {
        if (class196.field3596 != null) {
            class196.field3596.method138(-23083);
        }
        if (class42.field643 != null) {
            class42.field643.method138(-23083);
        }
        field4737++;
        class153.method1084(2, 0, 22050, class140.field2634);
        class196.field3596 = class232.method1587(-30600, class124.field2238, 0, class30.field500, 22050);
        class196.field3596.method141((byte) -56, class163.field3060);
        class42.field643 = class232.method1587(-30600, class124.field2238, 1, class30.field500, 2048);
        class42.field643.method141((byte) -100, class90.field1744);
        if (arg0) {
            field4750 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        field4746 = null;
        field4740 = null;
        if (arg0 != 24) {
            method1818((class118) null, 84);
        }
        field4743 = null;
        field4748 = null;
        field4749 = null;
        field4747 = null;
        field4750 = null;
    }
}
