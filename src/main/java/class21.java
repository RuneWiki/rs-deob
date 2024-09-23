import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IOEGEBWF")
public class class21 extends Frame {

    @OriginalMember(owner = "IOEGEBWF", name = "a", descriptor = "Z")
    private boolean field940 = false;

    @OriginalMember(owner = "IOEGEBWF", name = "b", descriptor = "LDZXWUJSL;")
    public class12 field941;

    @OriginalMember(owner = "IOEGEBWF", name = "<init>", descriptor = "(IIILDZXWUJSL;)V")
    public class21(int arg0, int arg1, int arg2, class12 arg3) {
        this.field941 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg0 + 28);
        if (arg2 != 12702) {
            this.field940 = !this.field940;
        }
    }

    @OriginalMember(owner = "IOEGEBWF", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "IOEGEBWF", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field941.update(arg0);
    }

    @OriginalMember(owner = "IOEGEBWF", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field941.paint(arg0);
    }
}
