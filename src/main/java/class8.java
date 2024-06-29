import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BLPTISPL")
public class class8 extends Frame {

    @OriginalMember(owner = "client!BLPTISPL", name = "a", descriptor = "I")
    private int field107 = -38597;

    @OriginalMember(owner = "client!BLPTISPL", name = "b", descriptor = "LNCIKLCII;")
    public class38 field108;

    @OriginalMember(owner = "client!BLPTISPL", name = "<init>", descriptor = "(IILNCIKLCII;I)V")
    public class8(int arg0, int arg1, class38 arg2, int arg3) {
        this.field108 = arg2;
        this.setTitle("Jagex");
        this.setResizable(false);
        if (arg0 >= 0) {
            this.field107 = -345;
        }
        this.show();
        this.toFront();
        this.resize(arg3 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!BLPTISPL", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!BLPTISPL", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field108.update(arg0);
    }

    @OriginalMember(owner = "client!BLPTISPL", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field108.paint(arg0);
    }
}
