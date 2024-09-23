import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YVSOOFAD")
public class class69 extends Frame {

    @OriginalMember(owner = "YVSOOFAD", name = "a", descriptor = "Z")
    private boolean field1684 = false;

    @OriginalMember(owner = "YVSOOFAD", name = "b", descriptor = "LAYIVJZQQ;")
    public class3 field1685;

    @OriginalMember(owner = "YVSOOFAD", name = "<init>", descriptor = "(IILAYIVJZQQ;Z)V")
    public class69(int arg0, int arg1, class3 arg2, boolean arg3) {
        this.field1685 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg0 + 28);
        if (arg3) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "YVSOOFAD", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "YVSOOFAD", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1685.update(arg0);
    }

    @OriginalMember(owner = "YVSOOFAD", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1685.paint(arg0);
    }
}
