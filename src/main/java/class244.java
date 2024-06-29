import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class244 extends class308 {

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lfn;")
    public class61 field3844;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "Z")
    public static volatile boolean field3848 = true;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Lg;")
    public static class72 field3845;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 4)
    public static void method1701(byte arg0) {
        if (arg0 == 81) {
            field3845 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 19)
    public static final void method1702(Component arg0, int arg1) {
        arg0.addMouseListener(class275.field4544);
        arg0.addMouseMotionListener(class275.field4544);
        field3850++;
        arg0.addFocusListener(class275.field4544);
        if (arg1 != 17084) {
            field3848 = true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lfn;)V", line = 30)
    public class244(class61 arg0) {
        this.field3844 = arg0;
    }
}
