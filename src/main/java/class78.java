import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class78 extends Canvas {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field1545;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field1547 = 1;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field1549 = new int[8];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!cb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 7)
    public final void update(Graphics arg0) {
        this.field1545.update(arg0);
        field1543++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 18)
    public static void method572(byte arg0) {
        int var1 = 116 / ((-arg0 - 2) / 61);
        field1549 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/StringBuffer;ZC)Ljava/lang/StringBuffer;", line = 30)
    public static final StringBuffer method573(int arg0, StringBuffer arg1, boolean arg2, char arg3) {
        field1544++;
        int var4 = arg1.length();
        arg1.setLength(arg0);
        for (int var5 = var4; var5 < arg0; var5++) {
            arg1.setCharAt(var5, arg3);
        }
        return arg2 ? (StringBuffer) null : arg1;
    }

    @OriginalMember(owner = "client!cb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 51)
    public final void paint(Graphics arg0) {
        field1546++;
        this.field1545.paint(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 66)
    public class78(Component arg0) {
        this.field1545 = arg0;
    }
}
