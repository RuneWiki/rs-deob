import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SZXWXMTH")
public class class53 extends Frame {

    @OriginalMember(owner = "client!SZXWXMTH", name = "a", descriptor = "Z")
    private boolean field1456 = true;

    @OriginalMember(owner = "client!SZXWXMTH", name = "b", descriptor = "LSXKUAOFD;")
    public class52 field1457;

    @OriginalMember(owner = "client!SZXWXMTH", name = "<init>", descriptor = "(IIILSXKUAOFD;)V")
    public class53(int arg0, int arg1, int arg2, class52 arg3) {
        this.field1457 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg1 != 0) {
            this.field1456 = !this.field1456;
        }
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "client!SZXWXMTH", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!SZXWXMTH", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1457.update(arg0);
    }

    @OriginalMember(owner = "client!SZXWXMTH", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1457.paint(arg0);
    }
}
