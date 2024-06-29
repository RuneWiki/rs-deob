import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class99 extends Canvas {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field1489;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!pj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1488++;
        this.field1489.paint(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class99(Component arg0) {
        this.field1489 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1491++;
        this.field1489.update(arg0);
    }

    static {
        new class466("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }
}
