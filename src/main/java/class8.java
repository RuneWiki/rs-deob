import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DQQGYYJG")
public class class8 extends Frame {

    @OriginalMember(owner = "client!DQQGYYJG", name = "a", descriptor = "Z")
    private boolean field617 = false;

    @OriginalMember(owner = "client!DQQGYYJG", name = "b", descriptor = "LHXQNMAEJ;")
    public class29 field618;

    @OriginalMember(owner = "client!DQQGYYJG", name = "<init>", descriptor = "(IIILHXQNMAEJ;)V")
    public class8(int arg0, int arg1, int arg2, class29 arg3) {
        this.field618 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
        if (arg1 != 0) {
            this.field617 = !this.field617;
        }
    }

    @OriginalMember(owner = "client!DQQGYYJG", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!DQQGYYJG", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field618.update(arg0);
    }

    @OriginalMember(owner = "client!DQQGYYJG", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field618.paint(arg0);
    }
}
