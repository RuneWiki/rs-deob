import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class712 extends Canvas {

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field9722;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field9724 = 0;

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "[[[I")
    public static int[][][] field9720;

    @OriginalMember(owner = "client!vha", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field9722.update(arg0);
        field9723++;
    }

    @OriginalMember(owner = "client!vha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field9722.paint(arg0);
        field9721++;
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class712(Component arg0) {
        this.field9722 = arg0;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
    public static void method3948(int arg0) {
        if (arg0 == 0) {
            field9720 = null;
        }
    }
}
