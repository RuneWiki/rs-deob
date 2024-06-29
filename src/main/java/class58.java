import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VCIVYIXH")
public class class58 extends Frame {

    @OriginalMember(owner = "client!VCIVYIXH", name = "a", descriptor = "Z")
    private boolean field1560 = false;

    @OriginalMember(owner = "client!VCIVYIXH", name = "b", descriptor = "LBFZNZUKL;")
    public class2 field1561;

    @OriginalMember(owner = "client!VCIVYIXH", name = "<init>", descriptor = "(ILBFZNZUKL;II)V")
    public class58(int arg0, class2 arg1, int arg2, int arg3) {
        this.field1561 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg3 != 0) {
            this.field1560 = !this.field1560;
        }
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "client!VCIVYIXH", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!VCIVYIXH", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1561.update(arg0);
    }

    @OriginalMember(owner = "client!VCIVYIXH", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1561.paint(arg0);
    }
}
