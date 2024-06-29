import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class200 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2814 = 1338;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lej;")
    public static class104 field2815 = new class104(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "J")
    public static long field2816 = 0L;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "F")
    public static float field2813;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILqa;)V")
    public static final void method1221(int arg0, class207 arg1) {
        if (arg0 < 2) {
            field2813 = 0.8627093F;
        }
        if (class379.field5098) {
            class555.method3148((byte) -116, arg1);
        } else {
            class146.method974(0, arg1);
        }
        field2811++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1222(int arg0) {
        field2815 = null;
        if (arg0 != 14528) {
            method1222(104);
        }
    }

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2812++;
        throw new IllegalStateException();
    }
}
