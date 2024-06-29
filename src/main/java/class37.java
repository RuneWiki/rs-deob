import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LKLMGHHW")
public class class37 extends Frame {

    @OriginalMember(owner = "client!LKLMGHHW", name = "a", descriptor = "Z")
    private boolean field1195 = false;

    @OriginalMember(owner = "client!LKLMGHHW", name = "b", descriptor = "LHXUVWQPY;")
    public class25 field1196;

    @OriginalMember(owner = "client!LKLMGHHW", name = "<init>", descriptor = "(LHXUVWQPY;IZI)V")
    public class37(class25 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field1195 = !this.field1195;
        }
        this.field1196 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "client!LKLMGHHW", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!LKLMGHHW", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1196.update(arg0);
    }

    @OriginalMember(owner = "client!LKLMGHHW", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1196.paint(arg0);
    }
}
