import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GBQVGMFE")
public class class21 extends Frame {

    @OriginalMember(owner = "GBQVGMFE", name = "b", descriptor = "LQNTDRCTM;")
    public class45 field794;

    @OriginalMember(owner = "GBQVGMFE", name = "a", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "GBQVGMFE", name = "<init>", descriptor = "(LQNTDRCTM;III)V")
    public class21(class45 arg0, int arg1, int arg2, int arg3) {
        this.field794 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg3 != 19388) {
            this.field793 = -264;
        }
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "GBQVGMFE", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "GBQVGMFE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field794.update(arg0);
    }

    @OriginalMember(owner = "GBQVGMFE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field794.paint(arg0);
    }
}
