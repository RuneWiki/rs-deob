import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IWUEUKZJ")
public class class20 extends Frame {

    @OriginalMember(owner = "client!IWUEUKZJ", name = "a", descriptor = "LRMDQJLZZ;")
    public class47 field777;

    @OriginalMember(owner = "client!IWUEUKZJ", name = "<init>", descriptor = "(ILRMDQJLZZ;II)V")
    public class20(int arg0, class47 arg1, int arg2, int arg3) {
        this.field777 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg3 + 28);
        if (arg2 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!IWUEUKZJ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!IWUEUKZJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field777.update(arg0);
    }

    @OriginalMember(owner = "client!IWUEUKZJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field777.paint(arg0);
    }
}
