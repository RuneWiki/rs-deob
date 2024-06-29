import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WHTHTILQ")
public class class62 extends Frame {

    @OriginalMember(owner = "client!WHTHTILQ", name = "a", descriptor = "Z")
    private boolean field1650 = true;

    @OriginalMember(owner = "client!WHTHTILQ", name = "b", descriptor = "LNZBGSSTU;")
    public class41 field1651;

    @OriginalMember(owner = "client!WHTHTILQ", name = "<init>", descriptor = "(LNZBGSSTU;III)V")
    public class62(class41 arg0, int arg1, int arg2, int arg3) {
        this.field1651 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg3 != 0) {
            this.field1650 = !this.field1650;
        }
        this.toFront();
        this.resize(arg2 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!WHTHTILQ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!WHTHTILQ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1651.update(arg0);
    }

    @OriginalMember(owner = "client!WHTHTILQ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1651.paint(arg0);
    }
}
