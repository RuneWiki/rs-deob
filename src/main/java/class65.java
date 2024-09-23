import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VIXZTSSP")
public class class65 extends Frame {

    @OriginalMember(owner = "VIXZTSSP", name = "a", descriptor = "B")
    private byte field1651 = 4;

    @OriginalMember(owner = "VIXZTSSP", name = "b", descriptor = "LIVVPRVRY;")
    public class33 field1652;

    @OriginalMember(owner = "VIXZTSSP", name = "<init>", descriptor = "(BLIVVPRVRY;II)V")
    public class65(byte arg0, class33 arg1, int arg2, int arg3) {
        if (this.field1651 != arg0) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        this.field1652 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(arg2 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "VIXZTSSP", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "VIXZTSSP", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1652.update(arg0);
    }

    @OriginalMember(owner = "VIXZTSSP", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1652.paint(arg0);
    }
}
