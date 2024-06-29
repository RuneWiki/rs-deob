import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class159 {

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lrf;")
    private class124 field3662 = new class124();

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Z")
    public static boolean field3654 = false;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lr;")
    private static class118 field3666 = class153.method1136(75, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lr;")
    public static class118 field3667 = field3666;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "B")
    public static byte field3668;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "J")
    public static long field3652;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ljf;")
    public static class68 field3658;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Ljf;")
    public static class68 field3664;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lrf;")
    public final class124 method1232(boolean arg0) {
        class124 var2 = this.field3662.field2843;
        field3657++;
        if (this.field3662 == var2) {
            return null;
        } else {
            if (arg0) {
                field3661 = 28;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lrf;")
    public final class124 method1233(int arg0) {
        class124 var2 = this.field3662.field2843;
        field3665++;
        if (this.field3662 == var2) {
            return null;
        } else {
            var2.method962(100);
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method1234(int arg0) {
        field3658 = null;
        field3667 = null;
        field3664 = null;
        if (arg0 != 0) {
            field3661 = 41;
        }
        field3666 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lrf;Z)V")
    public final void method1235(class124 arg0, boolean arg1) {
        if (arg0.field2837 != null) {
            arg0.method962(99);
        }
        arg0.field2843 = this.field3662.field2843;
        arg0.field2837 = this.field3662;
        field3653++;
        if (!arg1) {
            method1234(-56);
        }
        arg0.field2837.field2843 = arg0;
        arg0.field2843.field2837 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Lrf;Z)V")
    public final void method1236(class124 arg0, boolean arg1) {
        if (arg0.field2837 != null) {
            arg0.method962(112);
        }
        arg0.field2843 = this.field3662;
        field3659++;
        arg0.field2837 = this.field3662.field2837;
        arg0.field2837.field2843 = arg0;
        if (!arg1) {
            this.field3662 = null;
        }
        arg0.field2843.field2837 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class159() {
        this.field3662.field2843 = this.field3662;
        this.field3662.field2837 = this.field3662;
    }
}
