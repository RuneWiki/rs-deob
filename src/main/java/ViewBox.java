import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "La;")
    public GameShell field36;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILa;IB)V")
    public ViewBox(int arg0, GameShell arg1, int arg2, byte arg3) {
        this.field36 = arg1;
        if (arg3 != 4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "client!b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field36.update(arg0);
    }

    @OriginalMember(owner = "client!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field36.paint(arg0);
    }
}
