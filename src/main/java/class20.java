import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!INDYOKOE")
public class class20 extends Frame {

    @OriginalMember(owner = "client!INDYOKOE", name = "a", descriptor = "I")
    private int field738 = -773;

    @OriginalMember(owner = "client!INDYOKOE", name = "b", descriptor = "Z")
    private boolean field739 = false;

    @OriginalMember(owner = "client!INDYOKOE", name = "c", descriptor = "LEPVRYXOV;")
    public class9 field740;

    @OriginalMember(owner = "client!INDYOKOE", name = "<init>", descriptor = "(ILEPVRYXOV;II)V")
    public class20(int arg0, class9 arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field739 = !this.field739;
        }
        this.field740 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "client!INDYOKOE", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!INDYOKOE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field740.update(arg0);
    }

    @OriginalMember(owner = "client!INDYOKOE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field740.paint(arg0);
    }
}
