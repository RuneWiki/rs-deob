import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FLFIRZAJ")
public class class10 extends Frame {

    @OriginalMember(owner = "FLFIRZAJ", name = "a", descriptor = "Z")
    private boolean field694 = true;

    @OriginalMember(owner = "FLFIRZAJ", name = "b", descriptor = "LCMOCHGYM;")
    public class3 field695;

    @OriginalMember(owner = "FLFIRZAJ", name = "<init>", descriptor = "(LCMOCHGYM;III)V")
    public class10(class3 arg0, int arg1, int arg2, int arg3) {
        this.field695 = arg0;
        this.setTitle("Jagex");
        if (arg3 != 0) {
            this.field694 = !this.field694;
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "FLFIRZAJ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "FLFIRZAJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field695.update(arg0);
    }

    @OriginalMember(owner = "FLFIRZAJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field695.paint(arg0);
    }
}
