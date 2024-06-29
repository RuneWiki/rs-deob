import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JWHKCZBF")
public class class28 extends Frame {

    @OriginalMember(owner = "client!JWHKCZBF", name = "a", descriptor = "Z")
    private boolean field927 = true;

    @OriginalMember(owner = "client!JWHKCZBF", name = "b", descriptor = "LGRXJFORE;")
    public class15 field928;

    @OriginalMember(owner = "client!JWHKCZBF", name = "<init>", descriptor = "(LGRXJFORE;III)V")
    public class28(class15 arg0, int arg1, int arg2, int arg3) {
        this.field928 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg1 + 28);
        if (arg2 != -45071) {
            this.field927 = !this.field927;
        }
    }

    @OriginalMember(owner = "client!JWHKCZBF", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!JWHKCZBF", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field928.update(arg0);
    }

    @OriginalMember(owner = "client!JWHKCZBF", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field928.paint(arg0);
    }
}
