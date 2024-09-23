import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "I")
    private int field35 = 1;

    @OriginalMember(owner = "b", name = "b", descriptor = "La;")
    public GameShell field36;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(La;IBI)V")
    public ViewBox(GameShell arg0, int arg1, byte arg2, int arg3) {
        this.field36 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg1 + 28);
        if (arg2 == 5) {
            boolean var5 = false;
        } else {
            this.field35 = 468;
        }
    }

    @OriginalMember(owner = "b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field36.update(arg0);
    }

    @OriginalMember(owner = "b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field36.paint(arg0);
    }
}
