import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LQFUVOUC")
public class class31 extends Frame {

    @OriginalMember(owner = "LQFUVOUC", name = "a", descriptor = "I")
    private int field1020 = -965;

    @OriginalMember(owner = "LQFUVOUC", name = "b", descriptor = "LUNXTKTRJ;")
    public class61 field1021;

    @OriginalMember(owner = "LQFUVOUC", name = "<init>", descriptor = "(BIILUNXTKTRJ;)V")
    public class31(byte arg0, int arg1, int arg2, class61 arg3) {
        this.field1021 = arg3;
        this.setTitle("Jagex");
        if (arg0 == 2) {
            boolean var5 = false;
        } else {
            this.field1020 = -104;
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "LQFUVOUC", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "LQFUVOUC", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1021.update(arg0);
    }

    @OriginalMember(owner = "LQFUVOUC", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1021.paint(arg0);
    }
}
