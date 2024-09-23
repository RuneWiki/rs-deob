import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CGMKGPCO")
public class class5 extends Frame {

    @OriginalMember(owner = "CGMKGPCO", name = "a", descriptor = "B")
    private byte field100 = -103;

    @OriginalMember(owner = "CGMKGPCO", name = "b", descriptor = "LITJBTECW;")
    public class22 field101;

    @OriginalMember(owner = "CGMKGPCO", name = "<init>", descriptor = "(IIBLITJBTECW;)V")
    public class5(int arg0, int arg1, byte arg2, class22 arg3) {
        this.field101 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (this.field100 != arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "CGMKGPCO", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "CGMKGPCO", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field101.update(arg0);
    }

    @OriginalMember(owner = "CGMKGPCO", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field101.paint(arg0);
    }
}
