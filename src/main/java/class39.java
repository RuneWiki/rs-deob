import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PNNSUEUM")
public class class39 extends Frame {

    @OriginalMember(owner = "PNNSUEUM", name = "a", descriptor = "I")
    private int field1049 = 38686;

    @OriginalMember(owner = "PNNSUEUM", name = "b", descriptor = "LVZUGTFOW;")
    public class59 field1050;

    @OriginalMember(owner = "PNNSUEUM", name = "<init>", descriptor = "(IILVZUGTFOW;Z)V")
    public class39(int arg0, int arg1, class59 arg2, boolean arg3) {
        this.field1050 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (!arg3) {
            this.field1049 = 200;
        }
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "PNNSUEUM", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "PNNSUEUM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1050.update(arg0);
    }

    @OriginalMember(owner = "PNNSUEUM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1050.paint(arg0);
    }
}
