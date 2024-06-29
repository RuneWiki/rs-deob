import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class37 extends Canvas {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field505;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static volatile int field508 = 0;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!f", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field505.paint(arg0);
        field509++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
    public static final void method225(int arg0, byte arg1) {
        class187 var2 = class120.method762((byte) 107, 4, arg0);
        field507++;
        var2.method1162(1);
        if (arg1 >= -96) {
            field510 = -96;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class37(Component arg0) {
        this.field505 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field505.update(arg0);
        field506++;
    }
}
