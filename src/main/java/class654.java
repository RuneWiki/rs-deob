import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class654 extends class263 {

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljava/lang/String;")
    public String field8913;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
    public static int[] field8908 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Z")
    public static boolean field8910 = true;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZI)V")
    public static final void method3657(int arg0, boolean arg1, int arg2) {
        field8909++;
        if (class409.method2299((byte) -75, arg0)) {
            class357.method2037(arg1, class325.field4062[arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method3658(int arg0) {
        if (arg0 == -8422) {
            field8908 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I")
    public static final int method3659(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -7690) {
            method3659(-115, -60, -127, 13);
        }
        field8912++;
        if (arg1 >= arg3) {
            return arg1 <= arg2 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class654() {
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class654(String arg0) {
        this.field8913 = arg0;
    }
}
