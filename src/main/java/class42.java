import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MOPGUTIE")
public class class42 extends Frame {

    @OriginalMember(owner = "MOPGUTIE", name = "a", descriptor = "LBTXFPMEV;")
    public class7 field1060;

    @OriginalMember(owner = "MOPGUTIE", name = "<init>", descriptor = "(LBTXFPMEV;III)V")
    public class42(class7 arg0, int arg1, int arg2, int arg3) {
        this.field1060 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg1 != -24362) {
            throw new NullPointerException();
        }
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "MOPGUTIE", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "MOPGUTIE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1060.update(arg0);
    }

    @OriginalMember(owner = "MOPGUTIE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1060.paint(arg0);
    }
}
