import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class468 extends Canvas {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field6495;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6500 = null;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lst;")
    public static class335 field6496 = new class335(85, -1);

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field6501 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!ng", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        this.field6495.paint(arg0);
        field6497++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V", line = 12)
    public static final void method2855(int arg0, byte arg1) {
        class718.field10001 = arg0;
        class329.field4660 = -1;
        field6498++;
        class329.field4660 = -1;
        class558.method3284(-1);
        if (arg1 < 55) {
            field6496 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 28)
    public static void method2856(int arg0) {
        if (arg0 > -71) {
            field6500 = null;
        }
        field6500 = null;
        field6496 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I", line = 39)
    public static final int method2857(int arg0) {
        int var1 = 105 / ((arg0 - 13) / 50);
        field6494++;
        return class392.field5630;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 50)
    public class468(Component arg0) {
        this.field6495 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 60)
    public final void update(Graphics arg0) {
        field6499++;
        this.field6495.update(arg0);
    }
}
