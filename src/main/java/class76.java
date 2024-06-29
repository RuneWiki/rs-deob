import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 extends Canvas {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field1733;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lfc;")
    public static class39 field1736 = class90.method774("", -120);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lfc;")
    public static class39 field1741 = null;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lfc;")
    public static class39 field1739 = class90.method774(")3runescape)3com", -110);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1734 = 0;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[S")
    public static short[] field1737 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lfc;")
    private static class39 field1744 = class90.method774("Loaded sprites", -90);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lfc;")
    public static class39 field1732 = class90.method774("Die Adresse dieses Computers wurde gesperrt)1", -78);

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lfc;")
    public static class39 field1745 = field1744;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lfc;")
    public static class39 field1743 = class90.method774("nicht hergestellt werden)3", -108);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 5)
    public class76(Component arg0) {
        this.field1733 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 15)
    public final void update(Graphics arg0) {
        this.field1733.update(arg0);
        field1742++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 42)
    public static void method673(int arg0) {
        field1741 = null;
        field1736 = null;
        field1732 = null;
        field1745 = null;
        field1737 = null;
        field1744 = null;
        field1743 = null;
        if (arg0 == 16565) {
            field1739 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 74)
    public final void paint(Graphics arg0) {
        this.field1733.paint(arg0);
        field1735++;
    }
}
