import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "La;")
    public GameShell field39;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(La;III)V")
    public ViewBox(GameShell arg0, int arg1, int arg2, int arg3) {
        this.field39 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        if (arg3 != 12861) {
            throw new NullPointerException();
        }
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field39.update(arg0);
    }

    @OriginalMember(owner = "b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field39.paint(arg0);
    }
}
