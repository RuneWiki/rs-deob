import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "La;")
    public GameShell field30;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(ILa;II)V")
    public ViewBox(int arg0, GameShell arg1, int arg2, int arg3) {
        this.field30 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg2 != 22967) {
            throw new NullPointerException();
        }
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field30.update(arg0);
    }

    @OriginalMember(owner = "b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field30.paint(arg0);
    }
}
