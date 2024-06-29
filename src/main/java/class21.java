import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class21 extends Canvas {

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field290;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Lh;")
    public static class15 field289 = class18.method153("Bank", 1);

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "I")
    public static int field292 = 0;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "I")
    public static volatile int field291 = 0;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "Lh;")
    public static class15 field293 = class18.method153("Scimitar Shop", 1);

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "Lm;")
    public static class25 field288 = new class25();

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "[Z")
    public static boolean[] field295 = new boolean[112];

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Z")
    public static boolean field296 = false;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "Lh;")
    public static class15 field298 = class18.method153(" )2 ", 1);

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "Lh;")
    public static class15 field300 = class18.method153("Fishing Spot", 1);

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "Lv;")
    public static class36 field297;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "[I")
    public static int[] field294;

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "[[Lv;")
    public static class36[][] field299;

    @OriginalMember(owner = "mapview!k", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 7)
    public final void paint(Graphics arg0) {
        this.field290.paint(arg0);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z)V", line = 32)
    public static void method178(boolean arg0) {
        field293 = null;
        field298 = null;
        field294 = null;
        field300 = null;
        field295 = null;
        field288 = null;
        if (!arg0) {
            method178(true);
        }
        field289 = null;
        field299 = null;
        field297 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z[Lh;)Lh;", line = 55)
    public static final class15 method179(boolean arg0, class15[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg0) {
            return class18.method155((byte) 42, arg1.length, 0, arg1);
        } else {
            return (class15) null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 80)
    public final void update(Graphics arg0) {
        this.field290.update(arg0);
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 116)
    public class21(Component arg0) {
        this.field290 = arg0;
    }
}
