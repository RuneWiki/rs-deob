import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NYZFOQAO")
public class class46 extends Frame {

    @OriginalMember(owner = "NYZFOQAO", name = "a", descriptor = "LFDVCDUHZ;")
    public class19 field1302;

    @OriginalMember(owner = "NYZFOQAO", name = "<init>", descriptor = "(IILFDVCDUHZ;I)V")
    public class46(int arg0, int arg1, class19 arg2, int arg3) {
        this.field1302 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg3 != -14612) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "NYZFOQAO", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "NYZFOQAO", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1302.update(arg0);
    }

    @OriginalMember(owner = "NYZFOQAO", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1302.paint(arg0);
    }
}
