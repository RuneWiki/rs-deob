import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MEWJABWI")
public class class34 extends Frame {

    @OriginalMember(owner = "client!MEWJABWI", name = "a", descriptor = "I")
    private int field980 = -24987;

    @OriginalMember(owner = "client!MEWJABWI", name = "b", descriptor = "LLJUNUWBY;")
    public class31 field981;

    @OriginalMember(owner = "client!MEWJABWI", name = "<init>", descriptor = "(IIILLJUNUWBY;)V")
    public class34(int arg0, int arg1, int arg2, class31 arg3) {
        this.field981 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg1 != 42686) {
            this.field980 = 145;
        }
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "client!MEWJABWI", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!MEWJABWI", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field981.update(arg0);
    }

    @OriginalMember(owner = "client!MEWJABWI", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field981.paint(arg0);
    }
}
