import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RBKIQEVU")
public class class51 extends Frame {

    @OriginalMember(owner = "RBKIQEVU", name = "a", descriptor = "LPXJVLLTT;")
    public class47 field1309;

    @OriginalMember(owner = "RBKIQEVU", name = "<init>", descriptor = "(BLPXJVLLTT;II)V")
    public class51(byte arg0, class47 arg1, int arg2, int arg3) {
        this.field1309 = arg1;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        this.resize(arg2 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "RBKIQEVU", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "RBKIQEVU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1309.update(arg0);
    }

    @OriginalMember(owner = "RBKIQEVU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1309.paint(arg0);
    }
}
