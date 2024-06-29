import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VZJCTUDQ")
public class class65 extends Frame {

    @OriginalMember(owner = "client!VZJCTUDQ", name = "a", descriptor = "LNHAOTYHM;")
    public class38 field1665;

    @OriginalMember(owner = "client!VZJCTUDQ", name = "<init>", descriptor = "(ILNHAOTYHM;II)V")
    public class65(int arg0, class38 arg1, int arg2, int arg3) {
        this.field1665 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.toFront();
        this.resize(arg3 + 8, arg2 + 28);
    }

    @OriginalMember(owner = "client!VZJCTUDQ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!VZJCTUDQ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1665.update(arg0);
    }

    @OriginalMember(owner = "client!VZJCTUDQ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1665.paint(arg0);
    }
}
