import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class ViewBox extends Frame {

    @OriginalMember(owner = "b", name = "a", descriptor = "I")
    private int field31 = 8;

    @OriginalMember(owner = "b", name = "b", descriptor = "La;")
    public GameShell field32;

    @OriginalMember(owner = "b", name = "<init>", descriptor = "(IILa;I)V")
    public ViewBox(int arg0, int arg1, GameShell arg2, int arg3) {
        if (arg1 != 35731) {
            this.field31 = -475;
        }
        this.field32 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field32.update(arg0);
    }

    @OriginalMember(owner = "b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field32.paint(arg0);
    }
}
