import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class414 extends Canvas {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field6085;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field6086 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[I")
    public static int[] field6089 = new int[14];

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ca", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field6085.update(arg0);
        field6088++;
    }

    @OriginalMember(owner = "client!ca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field6085.paint(arg0);
        field6087++;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class414(Component arg0) {
        this.field6085 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method2639(int arg0) {
        field6089 = null;
        if (arg0 != 14) {
            method2639(-67);
        }
    }
}
