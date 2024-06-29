import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BXWMHFQK")
public class class4 extends Frame {

    @OriginalMember(owner = "client!BXWMHFQK", name = "a", descriptor = "LHJHAUOBE;")
    public class26 field97;

    @OriginalMember(owner = "client!BXWMHFQK", name = "<init>", descriptor = "(IIZLHJHAUOBE;)V")
    public class4(int arg0, int arg1, boolean arg2, class26 arg3) {
        this.field97 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        if (arg2) {
            throw new NullPointerException();
        }
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!BXWMHFQK", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!BXWMHFQK", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field97.update(arg0);
    }

    @OriginalMember(owner = "client!BXWMHFQK", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field97.paint(arg0);
    }
}
