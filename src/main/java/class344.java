import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class344 extends Canvas {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field4522;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lwo;")
    public static class690 field4526 = new class690(77, -1);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lwo;")
    public static class690 field4527 = new class690(26, -2);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1973(int arg0) {
        field4526 = null;
        if (arg0 == 19823) {
            field4527 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 14)
    public final void paint(Graphics arg0) {
        field4523++;
        this.field4522.paint(arg0);
    }

    @OriginalMember(owner = "client!bk", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 23)
    public final void update(Graphics arg0) {
        this.field4522.update(arg0);
        field4524++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([FII)[F", line = 31)
    public static final float[] method1974(float[] arg0, int arg1, int arg2) {
        field4525++;
        float[] var3 = new float[arg1];
        if (arg2 != 2364) {
            field4526 = null;
        }
        class252.method1541(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 52)
    public class344(Component arg0) {
        this.field4522 = arg0;
    }
}
