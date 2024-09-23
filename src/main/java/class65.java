import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WLLHZSAS")
public class class65 extends Frame {

    @OriginalMember(owner = "WLLHZSAS", name = "a", descriptor = "LOGVKVTJB;")
    public class38 field1624;

    @OriginalMember(owner = "WLLHZSAS", name = "<init>", descriptor = "(LOGVKVTJB;IIZ)V")
    public class65(class38 arg0, int arg1, int arg2, boolean arg3) {
        this.field1624 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
        if (arg3) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "WLLHZSAS", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "WLLHZSAS", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1624.update(arg0);
    }

    @OriginalMember(owner = "WLLHZSAS", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1624.paint(arg0);
    }
}
