import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class264 extends class600 {

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
    public static boolean field3791 = true;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Ljda;")
    public static class77 field3792 = new class77("", 17);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
    public static int[] field3795 = new int[500];

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lsd;")
    public class264 field3793;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lsd;")
    public class264 field3794;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1678(boolean arg0) {
        field3790++;
        if (!arg0 && this.field3794 != null) {
            this.field3794.field3793 = this.field3793;
            this.field3793.field3794 = this.field3794;
            this.field3793 = null;
            this.field3794 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 27)
    public static void method1679(int arg0) {
        if (arg0 < 65) {
            field3795 = null;
        }
        field3795 = null;
        field3792 = null;
    }
}
