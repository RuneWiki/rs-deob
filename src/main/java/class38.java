import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PXHNRURM")
public class class38 extends Frame {

    @OriginalMember(owner = "client!PXHNRURM", name = "a", descriptor = "I")
    private int field1130 = -866;

    @OriginalMember(owner = "client!PXHNRURM", name = "b", descriptor = "LEOQQYERM;")
    public class10 field1131;

    @OriginalMember(owner = "client!PXHNRURM", name = "<init>", descriptor = "(IIILEOQQYERM;)V")
    public class38(int arg0, int arg1, int arg2, class10 arg3) {
        this.field1131 = arg3;
        this.setTitle("Jagex");
        if (arg2 <= 0) {
            this.field1130 = -369;
        }
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!PXHNRURM", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!PXHNRURM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1131.update(arg0);
    }

    @OriginalMember(owner = "client!PXHNRURM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1131.paint(arg0);
    }
}
