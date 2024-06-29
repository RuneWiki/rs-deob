import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IEJCKZCR")
public class ViewBox extends Frame {

    @OriginalMember(owner = "client!IEJCKZCR", name = "a", descriptor = "LJWWAIQPI;")
    public GameShell field876;

    @OriginalMember(owner = "client!IEJCKZCR", name = "<init>", descriptor = "(IILJWWAIQPI;I)V")
    public ViewBox(int arg0, int arg1, GameShell arg2, int arg3) {
        this.field876 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        this.toFront();
        this.resize(arg3 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!IEJCKZCR", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!IEJCKZCR", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field876.update(arg0);
    }

    @OriginalMember(owner = "client!IEJCKZCR", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field876.paint(arg0);
    }
}
