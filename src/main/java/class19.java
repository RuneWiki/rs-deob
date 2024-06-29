import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GLDYLWRM")
public class class19 extends Frame {

    @OriginalMember(owner = "client!GLDYLWRM", name = "a", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!GLDYLWRM", name = "b", descriptor = "LMKANHSMC;")
    public class37 field745;

    @OriginalMember(owner = "client!GLDYLWRM", name = "<init>", descriptor = "(ZLMKANHSMC;II)V")
    public class19(boolean arg0, class37 arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field744 = 17;
        }
        this.field745 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "client!GLDYLWRM", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!GLDYLWRM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field745.update(arg0);
    }

    @OriginalMember(owner = "client!GLDYLWRM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field745.paint(arg0);
    }
}
