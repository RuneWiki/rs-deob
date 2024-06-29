import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class128 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    public boolean field2748 = true;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lea;")
    public static class38 field2738 = class9.method46((byte) 123, "(U(Y");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lea;")
    public static class38 field2742 = class9.method46((byte) 101, "headicons_pk");

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lea;")
    public static class38 field2740 = class9.method46((byte) 111, "logo");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lea;")
    public static class38 field2747 = class9.method46((byte) 120, "::fpson");

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lea;")
    public static class38 field2749 = class9.method46((byte) 115, "me");

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lea;")
    public static class38 field2741 = class9.method46((byte) 114, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lea;")
    public static class38 field2750 = class9.method46((byte) 111, ":");

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lea;")
    public static class38 field2754 = class9.method46((byte) 124, "Freie Welt");

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method948(boolean arg0) {
        field2749 = null;
        field2742 = null;
        field2750 = null;
        field2747 = null;
        field2738 = null;
        field2741 = null;
        field2754 = null;
        field2740 = null;
        if (arg0) {
            field2749 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V")
    public static final void method949(int arg0, int arg1, byte arg2) {
        field2746++;
        if (class94.field2121 < 2 && class114.field2529 == 0 && !class23.field489) {
            return;
        }
        class38 var3;
        if (class114.field2529 == 1 && class94.field2121 < 2) {
            var3 = class163.method1168(-98, new class38[] { class163.field3384, class101.field2248, class154.field3210, class75.field1830 });
        } else if (class23.field489 && class94.field2121 < 2) {
            var3 = class163.method1168(108, new class38[] { class10.field220, class101.field2248, class146.field3040, class75.field1830 });
        } else {
            var3 = class144.method1039(class94.field2121 - 1, 93);
        }
        if (class94.field2121 > 2) {
            var3 = class163.method1168(125, new class38[] { var3, class183.field3662, class151.method1059(class94.field2121 - 2, (byte) -114), class18.field370 });
        }
        if (arg2 > 39) {
            int var4 = class33.field686.method649(var3, arg0 + 4, arg1 + 15, 16777215, 0, class87.field2016, class103.field2324);
            class45.method326(class33.field686.method656(var3) + var4, arg0 - -4, arg1, 15, 16711680);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2756 = arg5;
        this.field2745 = arg2;
        this.field2744 = arg3;
        this.field2752 = arg0;
        this.field2739 = arg4;
        this.field2748 = arg6;
        this.field2753 = arg1;
    }
}
