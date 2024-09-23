import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "Z")
    private boolean field30 = false;

    @OriginalMember(owner = "b", name = "b", descriptor = "La;")
    public GameShell field31;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(IILa;Z)V")
    public ViewBox(int arg0, int arg1, GameShell arg2, boolean arg3) {
        this.field31 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (!arg3) {
            this.field30 = !this.field30;
        }
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field31.update(arg0);
    }

    @OriginalMember(owner = "b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field31.paint(arg0);
    }
}
