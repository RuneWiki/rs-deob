import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 extends Canvas {

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field455;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "[[[[B")
    public static byte[][][][] field454 = new byte[5][][][];

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "Lv;")
    public static class40 field461 = class24.method170("Potters Wheel", (byte) 118);

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Lv;")
    public static class40 field459 = class24.method170("Holiday Event", (byte) -112);

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "[J")
    public static long[] field462 = new long[32];

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lv;")
    public static class40 field456 = class24.method170("Next page", (byte) -100);

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lv;")
    public static class40 field451 = class24.method170("Gem Shop", (byte) -98);

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lg;")
    public static class12 field457;

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "[B")
    public static byte[] field458;

    @OriginalMember(owner = "mapview!s", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 12)
    public final void paint(Graphics arg0) {
        this.field455.paint(arg0);
    }

    @OriginalMember(owner = "mapview!s", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 20)
    public final void update(Graphics arg0) {
        this.field455.update(arg0);
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 78)
    public class34(Component arg0) {
        this.field455 = arg0;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 95)
    public static void method211(int arg0) {
        field462 = null;
        field459 = null;
        field457 = null;
        field456 = null;
        field451 = null;
        if (arg0 != 5) {
            method211(15);
        }
        field454 = null;
        field461 = null;
        field458 = null;
    }
}
