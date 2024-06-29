import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FRBOSPAH")
public class class16 extends Frame {

    @OriginalMember(owner = "client!FRBOSPAH", name = "a", descriptor = "Z")
    private boolean field680 = false;

    @OriginalMember(owner = "client!FRBOSPAH", name = "b", descriptor = "LPKBEYUWN;")
    public class41 field681;

    @OriginalMember(owner = "client!FRBOSPAH", name = "<init>", descriptor = "(IIILPKBEYUWN;)V")
    public class16(int arg0, int arg1, int arg2, class41 arg3) {
        this.field681 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
        if (arg2 != 0) {
            this.field680 = !this.field680;
        }
    }

    @OriginalMember(owner = "client!FRBOSPAH", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!FRBOSPAH", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field681.update(arg0);
    }

    @OriginalMember(owner = "client!FRBOSPAH", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field681.paint(arg0);
    }
}
