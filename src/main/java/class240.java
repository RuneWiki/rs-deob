import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class240 extends Canvas {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field3936;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lwm;")
    public static class152 field3931 = class157.method1048("Schrifts-=tze geladen)3", 95);

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
    public static boolean field3937 = false;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lcg;")
    public static class42 field3933;

    @OriginalMember(owner = "client!td", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void update(Graphics arg0) {
        this.field3936.update(arg0);
        field3935++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 13)
    public static void method1640(int arg0) {
        if (arg0 == 15544) {
            field3933 = null;
            field3931 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 27)
    public final void paint(Graphics arg0) {
        field3934++;
        this.field3936.paint(arg0);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 47)
    public class240(Component arg0) {
        this.field3936 = arg0;
    }
}
