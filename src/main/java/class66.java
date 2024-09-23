import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YNCFRRRI")
public class class66 extends Frame {

    @OriginalMember(owner = "YNCFRRRI", name = "a", descriptor = "LMUZNSFEY;")
    public class35 field1534;

    @OriginalMember(owner = "YNCFRRRI", name = "<init>", descriptor = "(LMUZNSFEY;IIB)V")
    public class66(class35 arg0, int arg1, int arg2, byte arg3) {
        this.field1534 = arg0;
        this.setTitle("Jagex");
        if (arg3 != 26) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "YNCFRRRI", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "YNCFRRRI", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1534.update(arg0);
    }

    @OriginalMember(owner = "YNCFRRRI", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1534.paint(arg0);
    }
}
