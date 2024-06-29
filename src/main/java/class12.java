import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CVFADBZV")
public class class12 extends Frame {

    @OriginalMember(owner = "client!CVFADBZV", name = "a", descriptor = "I")
    private int field724 = -916;

    @OriginalMember(owner = "client!CVFADBZV", name = "b", descriptor = "LAHZQVBFX;")
    public class3 field725;

    @OriginalMember(owner = "client!CVFADBZV", name = "<init>", descriptor = "(ILAHZQVBFX;II)V")
    public class12(int arg0, class3 arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field725 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "client!CVFADBZV", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!CVFADBZV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field725.update(arg0);
    }

    @OriginalMember(owner = "client!CVFADBZV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field725.paint(arg0);
    }
}
