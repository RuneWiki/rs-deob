import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AMZVDPPJ")
public class class2 extends Frame {

    @OriginalMember(owner = "AMZVDPPJ", name = "a", descriptor = "I")
    private int field34 = 3;

    @OriginalMember(owner = "AMZVDPPJ", name = "b", descriptor = "LAMTYETOI;")
    public class1 field35;

    @OriginalMember(owner = "AMZVDPPJ", name = "<init>", descriptor = "(ZLAMTYETOI;II)V")
    public class2(boolean arg0, class1 arg1, int arg2, int arg3) {
        this.field35 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg0) {
            this.field34 = -291;
        }
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "AMZVDPPJ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "AMZVDPPJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field35.update(arg0);
    }

    @OriginalMember(owner = "AMZVDPPJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field35.paint(arg0);
    }
}
