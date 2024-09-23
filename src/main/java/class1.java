import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("APBCEOWT")
public class class1 extends Frame {

    @OriginalMember(owner = "APBCEOWT", name = "a", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "APBCEOWT", name = "b", descriptor = "LTFSZPSRF;")
    public class56 field2;

    @OriginalMember(owner = "APBCEOWT", name = "<init>", descriptor = "(LTFSZPSRF;ZII)V")
    public class1(class56 arg0, boolean arg1, int arg2, int arg3) {
        this.field2 = arg0;
        this.setTitle("Jagex");
        if (!arg1) {
            this.field1 = !this.field1;
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "APBCEOWT", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "APBCEOWT", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2.update(arg0);
    }

    @OriginalMember(owner = "APBCEOWT", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2.paint(arg0);
    }
}
