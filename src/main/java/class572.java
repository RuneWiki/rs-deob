import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class572 extends Canvas {

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field7845;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!kga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field7845.paint(arg0);
        field7843++;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class572(Component arg0) {
        this.field7845 = arg0;
    }

    @OriginalMember(owner = "client!kga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field7845.update(arg0);
        field7846++;
    }
}
