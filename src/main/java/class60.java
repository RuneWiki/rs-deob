import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UNSEVWCI")
public class class60 extends Frame {

    @OriginalMember(owner = "UNSEVWCI", name = "a", descriptor = "Z")
    private boolean field1512 = true;

    @OriginalMember(owner = "UNSEVWCI", name = "b", descriptor = "LKISFBCOP;")
    public class27 field1513;

    @OriginalMember(owner = "UNSEVWCI", name = "<init>", descriptor = "(LKISFBCOP;III)V")
    public class60(class27 arg0, int arg1, int arg2, int arg3) {
        this.field1513 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg2 < 2 || arg2 > 2) {
            this.field1512 = !this.field1512;
        }
        this.toFront();
        this.resize(arg1 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "UNSEVWCI", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "UNSEVWCI", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1513.update(arg0);
    }

    @OriginalMember(owner = "UNSEVWCI", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1513.paint(arg0);
    }
}
