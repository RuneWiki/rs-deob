import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RFAAYJYN")
public class class49 extends Frame {

    @OriginalMember(owner = "RFAAYJYN", name = "a", descriptor = "Z")
    private boolean field1299 = true;

    @OriginalMember(owner = "RFAAYJYN", name = "b", descriptor = "I")
    private int field1300 = -835;

    @OriginalMember(owner = "RFAAYJYN", name = "c", descriptor = "LDKKOWNCZ;")
    public class7 field1301;

    @OriginalMember(owner = "RFAAYJYN", name = "<init>", descriptor = "(IIILDKKOWNCZ;)V")
    public class49(int arg0, int arg1, int arg2, class7 arg3) {
        this.field1301 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg0 >= 0) {
            this.field1299 = !this.field1299;
        }
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "RFAAYJYN", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "RFAAYJYN", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1301.update(arg0);
    }

    @OriginalMember(owner = "RFAAYJYN", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1301.paint(arg0);
    }
}
