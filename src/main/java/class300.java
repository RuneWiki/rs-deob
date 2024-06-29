import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class300 {

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public int field3686 = 443;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "Z")
    private boolean field3687 = false;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public int field3688 = 43594;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "Z")
    private boolean field3689 = false;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "[I")
    public static int[] field3690 = new int[5];

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "F")
    public static float field3681;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "Ljava/lang/String;")
    public String field3680;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 5)
    public static final int method1663(String arg0, int arg1) {
        field3691++;
        if (arg1 != -13319) {
            method1665((byte) -83);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class598.method3286((byte) 99, arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILrj;)Lvfa;", line = 28)
    public final class264 method1664(int arg0, class648 arg1) {
        field3682++;
        if (arg0 != 0) {
            method1663(null, 72);
        }
        return arg1.method3636(this.field3689 ? this.field3686 : this.field3688, (byte) -73, this.field3687, this.field3680);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 41)
    public static void method1665(byte arg0) {
        field3690 = null;
        if (arg0 != -79) {
            method1663(null, 61);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljda;B)Z", line = 51)
    public final boolean method1666(class300 arg0, byte arg1) {
        if (arg1 != 28) {
            this.method1666(null, (byte) 120);
        }
        field3684++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field3685 == arg0.field3685 && this.field3680.equals(arg0.field3680);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 69)
    public final void method1667(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (!this.field3689) {
            this.field3687 = true;
            this.field3689 = true;
        } else if (this.field3687) {
            this.field3687 = false;
        } else {
            this.field3689 = false;
        }
        field3683++;
    }
}
