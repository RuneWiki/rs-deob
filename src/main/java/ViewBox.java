import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "I")
    private int field37 = 8;

    @OriginalMember(owner = "b", name = "b", descriptor = "La;")
    public GameShell field38;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(IIZLa;)V")
    public ViewBox(int arg0, int arg1, boolean arg2, GameShell arg3) {
        this.field38 = arg3;
        if (arg2) {
            this.field37 = 451;
        }
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field38.update(arg0);
    }

    @OriginalMember(owner = "b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field38.paint(arg0);
    }
}
