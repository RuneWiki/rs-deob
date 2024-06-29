import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class142 extends Canvas {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field1592;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lqv;")
    public static class444 field1593;

    @OriginalMember(owner = "client!wk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void paint(Graphics arg0) {
        field1591++;
        this.field1592.paint(arg0);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public class142(Component arg0) {
        this.field1592 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 23)
    public static void method889(int arg0) {
        field1593 = null;
        if (arg0 < 46) {
            field1593 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 33)
    public final void update(Graphics arg0) {
        this.field1592.update(arg0);
        field1594++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)I", line = 42)
    public static final int method890(int arg0, int arg1, byte arg2, int arg3) {
        field1595++;
        int var4 = ((arg3 & 0xFF00) * arg1 & 0xFF0000 | (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        if (arg2 != -34) {
            method889(68);
        }
        int var5 = 255 - arg1;
        return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }
}
