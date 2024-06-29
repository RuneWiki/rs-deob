import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WSQCMTWN")
public class class65 extends Frame {

    @OriginalMember(owner = "client!WSQCMTWN", name = "a", descriptor = "LVTYHSWDE;")
    public class59 field1660;

    @OriginalMember(owner = "client!WSQCMTWN", name = "<init>", descriptor = "(BILVTYHSWDE;I)V")
    public class65(byte arg0, int arg1, class59 arg2, int arg3) {
        this.field1660 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg0 != 39) {
            throw new NullPointerException();
        }
        this.toFront();
        this.resize(arg3 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!WSQCMTWN", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!WSQCMTWN", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1660.update(arg0);
    }

    @OriginalMember(owner = "client!WSQCMTWN", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1660.paint(arg0);
    }
}
