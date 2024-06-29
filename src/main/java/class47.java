import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class47 extends Canvas {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field605;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Luv;")
    public static class2 field603 = new class2(3, -2);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Luv;")
    public static class2 field606 = new class2(81, 1);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!jj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field605.paint(arg0);
        field602++;
    }

    @OriginalMember(owner = "client!jj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field604++;
        this.field605.update(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method355(int arg0) {
        field603 = null;
        field606 = null;
        if (arg0 != 1) {
            method355(-43);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class47(Component arg0) {
        this.field605 = arg0;
    }
}
