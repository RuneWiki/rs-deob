import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class301 extends class89 {

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lrn;")
    public class176 field3872;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3873 = null;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Z")
    public static boolean field3874 = true;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "[I")
    public static int[] field3875 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lap;")
    public static class335 field3869 = new class335(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Ldq;")
    public static class493 field3870;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "[Z")
    public static boolean[] field3876;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lrn;)V")
    public class301(class176 arg0) {
        this.field3872 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field3869 = null;
        field3870 = null;
        field3873 = null;
        if (arg0 != 2) {
            method1778(112);
        }
        field3876 = null;
        field3875 = null;
    }
}
