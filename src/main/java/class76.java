import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class76 extends Canvas {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field1396;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Ltg;")
    public static class184 field1392 = class135.method812("Bitte geben Sie Ihren Benutzernamen ein)3", 3);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Ltg;")
    private static class184 field1393 = class135.method812("wave:", 3);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[Ltg;")
    public static class184[] field1397 = new class184[100];

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Ltg;")
    public static class184 field1401 = field1393;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[I")
    public static int[] field1399 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Ltg;")
    public static class184 field1400 = class135.method812("<col=ff7000>", 3);

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Ltg;")
    public static class184 field1402 = field1393;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lvb;")
    public static class197 field1403;

    @OriginalMember(owner = "client!hg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1404++;
        this.field1396.update(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1396.paint(arg0);
        field1398++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method443(int arg0) {
        field1392 = null;
        field1397 = null;
        field1393 = null;
        field1403 = null;
        field1401 = null;
        field1400 = null;
        field1402 = null;
        field1399 = null;
        if (arg0 != 1) {
            field1399 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class76(Component arg0) {
        this.field1396 = arg0;
    }
}
