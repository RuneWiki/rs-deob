import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CYMTUWTR")
public class class8 extends Frame {

    @OriginalMember(owner = "CYMTUWTR", name = "a", descriptor = "LGYSHSTYO;")
    public class23 field563;

    @OriginalMember(owner = "CYMTUWTR", name = "<init>", descriptor = "(IIILGYSHSTYO;)V")
    public class8(int arg0, int arg1, int arg2, class23 arg3) {
        this.field563 = arg3;
        int var5 = 24 / arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "CYMTUWTR", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "CYMTUWTR", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field563.update(arg0);
    }

    @OriginalMember(owner = "CYMTUWTR", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field563.paint(arg0);
    }
}
