import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JYOWNEXJ")
public class class25 extends Frame {

    @OriginalMember(owner = "JYOWNEXJ", name = "a", descriptor = "LOFXQYNOM;")
    public class39 field923;

    @OriginalMember(owner = "JYOWNEXJ", name = "<init>", descriptor = "(ILOFXQYNOM;II)V")
    public class25(int arg0, class39 arg1, int arg2, int arg3) {
        this.field923 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        if (arg3 < 9 || arg3 > 9) {
            throw new NullPointerException();
        }
        this.resize(arg0 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "JYOWNEXJ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "JYOWNEXJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field923.update(arg0);
    }

    @OriginalMember(owner = "JYOWNEXJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field923.paint(arg0);
    }
}
