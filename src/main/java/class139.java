import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class139 extends Canvas {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1780;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1782 = new String[100];

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lag;")
    public static class301 field1783 = new class301();

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
    public static int[] field1785 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Lam;")
    public static class286 field1787;

    @OriginalMember(owner = "client!eq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1784++;
        this.field1780.update(arg0);
    }

    @OriginalMember(owner = "client!eq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1780.paint(arg0);
        field1786++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1787 = null;
        field1785 = null;
        if (arg0 <= -47) {
            field1783 = null;
            field1782 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class139(Component arg0) {
        this.field1780 = arg0;
    }
}
