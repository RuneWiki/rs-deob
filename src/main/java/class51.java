import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SGXZRDZF")
public class class51 extends Frame {

    @OriginalMember(owner = "client!SGXZRDZF", name = "b", descriptor = "LMKNKYTZT;")
    public class36 field1401;

    @OriginalMember(owner = "client!SGXZRDZF", name = "a", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!SGXZRDZF", name = "<init>", descriptor = "(LMKNKYTZT;ZII)V")
    public class51(class36 arg0, boolean arg1, int arg2, int arg3) {
        this.field1401 = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg3 + 28);
        if (!arg1) {
            this.field1400 = -184;
        }
    }

    @OriginalMember(owner = "client!SGXZRDZF", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!SGXZRDZF", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1401.update(arg0);
    }

    @OriginalMember(owner = "client!SGXZRDZF", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1401.paint(arg0);
    }
}
