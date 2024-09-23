import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IUROYOHP")
public class class26 extends Frame {

    @OriginalMember(owner = "IUROYOHP", name = "a", descriptor = "LEUDZGBGU;")
    public class18 field914;

    @OriginalMember(owner = "IUROYOHP", name = "<init>", descriptor = "(IZILEUDZGBGU;)V")
    public class26(int arg0, boolean arg1, int arg2, class18 arg3) {
        this.field914 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (!arg1) {
            throw new NullPointerException();
        }
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "IUROYOHP", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "IUROYOHP", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field914.update(arg0);
    }

    @OriginalMember(owner = "IUROYOHP", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field914.paint(arg0);
    }
}
