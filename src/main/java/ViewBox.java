import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
    private boolean field36 = true;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "La;")
    public GameShell field37;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIILa;)V")
    public ViewBox(int arg0, int arg1, int arg2, GameShell arg3) {
        this.field37 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg1 >= 0) {
            this.field36 = !this.field36;
        }
        this.toFront();
        this.resize(arg0 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "client!b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field37.update(arg0);
    }

    @OriginalMember(owner = "client!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field37.paint(arg0);
    }
}
