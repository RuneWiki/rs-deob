import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "La;")
    public GameShell field38;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(ZILa;I)V")
    public ViewBox(boolean arg0, int arg1, GameShell arg2, int arg3) {
        this.field38 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg1 + 28);
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
