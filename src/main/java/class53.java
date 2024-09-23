import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UUMODXDR")
public class class53 extends Frame {

    @OriginalMember(owner = "UUMODXDR", name = "a", descriptor = "LAMZQHNGA;")
    public class1 field1519;

    @OriginalMember(owner = "UUMODXDR", name = "<init>", descriptor = "(IBLAMZQHNGA;I)V")
    public class53(int arg0, byte arg1, class1 arg2, int arg3) {
        this.field1519 = arg2;
        this.setTitle("Jagex");
        if (arg1 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "UUMODXDR", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "UUMODXDR", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1519.update(arg0);
    }

    @OriginalMember(owner = "UUMODXDR", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1519.paint(arg0);
    }
}
