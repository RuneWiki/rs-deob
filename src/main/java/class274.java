import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class274 extends Canvas {

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field3817;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3812 = -1;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field3815 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lui;")
    public static class375 field3816 = new class375(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lns;")
    public static class438 field3819;

    @OriginalMember(owner = "client!ki", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void paint(Graphics arg0) {
        field3813++;
        this.field3817.paint(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 13)
    public static void method1743(int arg0) {
        field3816 = null;
        if (arg0 != 0) {
            field3815 = 61;
        }
        field3819 = null;
    }

    @OriginalMember(owner = "client!ki", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 33)
    public final void update(Graphics arg0) {
        this.field3817.update(arg0);
        field3814++;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 40)
    public class274(Component arg0) {
        this.field3817 = arg0;
    }
}
