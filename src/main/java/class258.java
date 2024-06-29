import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class258 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Leh;")
    public static class246 field3832 = new class246(22, 2);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3833 = 500;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field3835;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method1662(boolean arg0) {
        if (!arg0) {
            field3833 = -38;
        }
        field3832 = null;
        field3835 = null;
    }
}
