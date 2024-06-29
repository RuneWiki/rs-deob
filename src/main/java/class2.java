import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class2 extends Frame {

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "La;")
    public class1 field32;

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(La;II)V")
    public class2(class1 arg0, int arg1, int arg2) {
        this.field32 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg1 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "mapview!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field32.paint(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field32.update(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }
}
