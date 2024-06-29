import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class420 extends Canvas {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field6047;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "S")
    public static short field6050 = 1;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6051 = 1403;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "Lom;")
    public static class344 field6053;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)Z")
    public static final boolean method2546(byte arg0, int arg1, int arg2) {
        field6049++;
        if (arg0 < 28) {
            return true;
        } else {
            return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static void method2547(int arg0) {
        if (arg0 >= 5) {
            field6053 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field6047.paint(arg0);
        field6052++;
    }

    @OriginalMember(owner = "client!uda", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field6047.update(arg0);
        field6048++;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class420(Component arg0) {
        this.field6047 = arg0;
    }
}
