import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class class477 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    public static int[] field7119 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lpi;")
    public static class342 field7120 = new class342(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Z")
    public static boolean field7123 = false;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lt;")
    public static class471 field7122;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method2852(byte arg0) {
        field7120 = null;
        if (arg0 <= -88) {
            field7119 = null;
            field7122 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FIFF[FIIIFII)V")
    public abstract void method2503(float arg0, int arg1, float arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10);
}
