import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class171 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Z")
    public static boolean field2585 = false;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field2582 = 127;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Z")
    public static boolean field2581 = false;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2589 = "Cancel";

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lrb;")
    public static class143 field2584;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public static boolean field2583;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1214(int arg0) {
        if (arg0 != -30467) {
            field2589 = null;
        }
        field2589 = null;
        field2584 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1215(boolean arg0, Component arg1) {
        if (!arg0) {
            field2581 = false;
        }
        field2588++;
        arg1.removeMouseListener(class199.field2924);
        arg1.removeMouseMotionListener(class199.field2924);
        arg1.removeFocusListener(class199.field2924);
        class225.field3312 = 0;
    }
}
