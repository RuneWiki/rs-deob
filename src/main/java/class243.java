import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class243 extends Canvas {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field3539;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field3537 = -60;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Z")
    public static boolean field3542 = false;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field3541 = -1;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field3543 = 500;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Ldp;")
    public static class174 field3544;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public class243(Component arg0) {
        this.field3539 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 32)
    public static void method1775(int arg0) {
        field3544 = null;
        if (arg0 != 22858) {
            method1775(20);
        }
    }

    @OriginalMember(owner = "client!mh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 44)
    public final void paint(Graphics arg0) {
        this.field3539.paint(arg0);
        field3545++;
    }

    @OriginalMember(owner = "client!mh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 55)
    public final void update(Graphics arg0) {
        this.field3539.update(arg0);
        field3546++;
    }
}
