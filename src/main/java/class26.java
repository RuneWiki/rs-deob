import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HAQQOONQ")
public class class26 extends Frame {

    @OriginalMember(owner = "HAQQOONQ", name = "a", descriptor = "LKWRIFYWM;")
    public class38 field816;

    @OriginalMember(owner = "HAQQOONQ", name = "<init>", descriptor = "(ILKWRIFYWM;ZI)V")
    public class26(int arg0, class38 arg1, boolean arg2, int arg3) {
        this.field816 = arg1;
        if (!arg2) {
            throw new NullPointerException();
        }
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "HAQQOONQ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "HAQQOONQ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field816.update(arg0);
    }

    @OriginalMember(owner = "HAQQOONQ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field816.paint(arg0);
    }
}
