import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GDXGVBDZ")
public class class22 extends Frame {

    @OriginalMember(owner = "client!GDXGVBDZ", name = "a", descriptor = "I")
    private int field942 = -483;

    @OriginalMember(owner = "client!GDXGVBDZ", name = "b", descriptor = "Z")
    private boolean field943 = true;

    @OriginalMember(owner = "client!GDXGVBDZ", name = "c", descriptor = "LEBSHSFRY;")
    public class13 field944;

    @OriginalMember(owner = "client!GDXGVBDZ", name = "<init>", descriptor = "(IILEBSHSFRY;Z)V")
    public class22(int arg0, int arg1, class13 arg2, boolean arg3) {
        this.field944 = arg2;
        if (!arg3) {
            this.field942 = -96;
        }
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg0 + 8, arg1 + 28);
    }

    @OriginalMember(owner = "client!GDXGVBDZ", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!GDXGVBDZ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field944.update(arg0);
    }

    @OriginalMember(owner = "client!GDXGVBDZ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field944.paint(arg0);
    }
}
