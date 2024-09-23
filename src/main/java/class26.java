import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HCBLGNPC")
public class class26 extends Frame {

    @OriginalMember(owner = "HCBLGNPC", name = "a", descriptor = "Z")
    private boolean field784 = true;

    @OriginalMember(owner = "HCBLGNPC", name = "b", descriptor = "LXHFSQKPU;")
    public class65 field785;

    @OriginalMember(owner = "HCBLGNPC", name = "<init>", descriptor = "(IILXHFSQKPU;B)V")
    public class26(int arg0, int arg1, class65 arg2, byte arg3) {
        if (arg3 != 26) {
            this.field784 = !this.field784;
        }
        this.field785 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "HCBLGNPC", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "HCBLGNPC", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field785.update(arg0);
    }

    @OriginalMember(owner = "HCBLGNPC", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field785.paint(arg0);
    }
}
