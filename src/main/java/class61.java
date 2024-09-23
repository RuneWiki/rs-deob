import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VZVCZYAB")
public class class61 extends Frame {

    @OriginalMember(owner = "VZVCZYAB", name = "a", descriptor = "LZAMJOSBM;")
    public class71 field1424;

    @OriginalMember(owner = "VZVCZYAB", name = "<init>", descriptor = "(ILZAMJOSBM;II)V")
    public class61(int arg0, class71 arg1, int arg2, int arg3) {
        this.field1424 = arg1;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "VZVCZYAB", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "VZVCZYAB", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1424.update(arg0);
    }

    @OriginalMember(owner = "VZVCZYAB", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1424.paint(arg0);
    }
}
