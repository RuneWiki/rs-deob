import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class290 extends Canvas {

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field3700;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "Lk;")
    public static class66 field3701 = new class66("LIVE", "", "", 0);

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "Ltha;")
    public static class390 field3704 = class582.method3116(8587);

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!tca", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3700.update(arg0);
        field3699++;
    }

    @OriginalMember(owner = "client!tca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3700.paint(arg0);
        field3703++;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public static void method1756(int arg0) {
        field3701 = null;
        field3704 = null;
        if (arg0 >= -69) {
            field3704 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class290(Component arg0) {
        this.field3700 = arg0;
    }
}
