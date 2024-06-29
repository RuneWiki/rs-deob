import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class274 extends Canvas {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field4456;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
    public static int[] field4450 = new int[25];

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
    public static boolean field4452 = true;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lhl;")
    public static class61 field4453 = new class61();

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljf;")
    public static class216 field4457 = new class216(64);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1902(int arg0) {
        if (arg0 >= -125) {
            field4450 = null;
        }
        field4453 = null;
        field4450 = null;
        field4457 = null;
    }

    @OriginalMember(owner = "client!sh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4451++;
        this.field4456.update(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class274(Component arg0) {
        this.field4456 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4456.paint(arg0);
        field4455++;
    }
}
