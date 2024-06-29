import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class211 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
    public static int[] field3874 = new int[2048];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lbg;")
    public static class19 field3872 = new class19();

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lmb;")
    private static class132 field3877 = class166.method1092("Could not complete login)3", 125);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lmb;")
    public static class132 field3875 = field3877;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[Lgi;")
    public static class75[] field3870;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[S")
    public static short[] field3876;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1311(int arg0) {
        if (arg0 < 87) {
            method1311(-93);
        }
        field3874 = null;
        field3877 = null;
        field3870 = null;
        field3872 = null;
        field3875 = null;
        field3876 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1312(Component arg0, int arg1) {
        field3873++;
        arg0.removeKeyListener(class57.field964);
        arg0.removeFocusListener(class57.field964);
        class216.field3951 = arg1;
    }
}
