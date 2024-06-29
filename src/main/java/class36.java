import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class36 extends Canvas {

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field451;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "Lh;")
    public static class15 field453 = class26.method190(true, "Loom");

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "Lh;")
    public static class15 field456 = class26.method190(true, "Farming shop");

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "Lh;")
    public static class15 field452 = class26.method190(true, "Farming patch");

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "Lh;")
    public static class15 field455 = class26.method190(true, "floorcol)3dat");

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "Lh;")
    public static class15 field461 = class26.method190(true, "Dungeon");

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "La;")
    public static class1 field454;

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "Lca;")
    public static class6 field457;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 13)
    public static void method238(int arg0) {
        field454 = null;
        field453 = null;
        field455 = null;
        field456 = null;
        field461 = null;
        if (arg0 != 10) {
            field458 = -97;
        }
        field452 = null;
        field457 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IJ)V", line = 33)
    public static final void method239(int arg0, long arg1) {
        if (arg0 > -108) {
            field459 = -58;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class2.method44(arg1 - 1L, (byte) 125);
            class2.method44(1L, (byte) 101);
        } else {
            class2.method44(arg1, (byte) 35);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 64)
    public final void update(Graphics arg0) {
        this.field451.update(arg0);
    }

    @OriginalMember(owner = "mapview!w", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 78)
    public final void paint(Graphics arg0) {
        this.field451.paint(arg0);
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 85)
    public class36(Component arg0) {
        this.field451 = arg0;
    }
}
