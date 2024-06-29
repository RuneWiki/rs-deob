import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "La;")
    public GameShell field34;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IBILa;)V")
    public ViewBox(int arg0, byte arg1, int arg2, GameShell arg3) {
        this.field34 = arg3;
        this.setTitle("Jagex");
        if (arg1 != 81) {
            throw new NullPointerException();
        }
        this.setResizable(false);
        this.show();
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
        this.field34.update(arg0);
    }

    @OriginalMember(owner = "client!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field34.paint(arg0);
    }
}
