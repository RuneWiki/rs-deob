import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class149 extends Canvas {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field2620;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[[[I")
    public static int[][][] field2614 = new int[2][][];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
    public static boolean field2618 = true;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field2617 = 0;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Ltf;")
    public static class107 field2616 = null;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Loa;")
    public static class99 field2621 = class221.method1463(2844, "Nehmen");

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lmc;")
    public static class197 field2623 = new class197();

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Loa;")
    public static class99 field2628 = class221.method1463(2844, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    public static int[] field2625 = new int[25];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Loa;")
    private static class99 field2626 = class221.method1463(2844, "Opened title screen");

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Loa;")
    public static class99 field2627 = field2626;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2614 = null;
        field2623 = null;
        field2628 = null;
        if (arg0 != -14662) {
            return;
        }
        field2625 = null;
        field2626 = null;
        field2621 = null;
        field2616 = null;
        field2627 = null;
    }

    @OriginalMember(owner = "client!id", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2620.paint(arg0);
        field2619++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLtg;)Laa;")
    public static final class170 method1001(int arg0, byte arg1, class182 arg2) {
        field2622++;
        if (arg1 != -80) {
            field2616 = null;
        }
        return class65.method434(-78, arg0, arg2) ? class1.method1(true) : null;
    }

    @OriginalMember(owner = "client!id", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2615++;
        this.field2620.update(arg0);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class149(Component arg0) {
        this.field2620 = arg0;
    }
}
