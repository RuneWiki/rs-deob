import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ALUUBUWO")
public class class2 extends Frame {

    @OriginalMember(owner = "ALUUBUWO", name = "a", descriptor = "LAUOBNYCU;")
    public class4 field13;

    @OriginalMember(owner = "ALUUBUWO", name = "<init>", descriptor = "(ILAUOBNYCU;II)V")
    public class2(int arg0, class4 arg1, int arg2, int arg3) {
        this.field13 = arg1;
        this.setTitle("Jagex");
        if (arg3 <= 0) {
            throw new NullPointerException();
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "ALUUBUWO", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "ALUUBUWO", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field13.update(arg0);
    }

    @OriginalMember(owner = "ALUUBUWO", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field13.paint(arg0);
    }
}
