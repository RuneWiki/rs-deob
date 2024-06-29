import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class26 extends Canvas {

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field389;

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "I")
    public static int field391 = 20;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "[I")
    public static int[] field397 = new int[128];

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lt;")
    public static class36 field390 = class3.method8(13631, "Archery Shop");

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "Lt;")
    public static class36 field399 = class3.method8(13631, "u_pass");

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "Lt;")
    public static class36 field400 = class3.method8(13631, "floorcol)3dat");

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Lt;")
    public static class36 field392 = class3.method8(13631, "Quest Start");

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Lt;")
    public static class36 field395 = class3.method8(13631, "details)3dat");

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "Lt;")
    public static class36 field398 = class3.method8(13631, "b12_full");

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Lt;")
    private static class36 field394 = class3.method8(13631, "Overview");

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Lt;")
    public static class36 field396 = class3.method8(13631, "Woodcutting stump");

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lt;")
    private static class36 field393 = class3.method8(13631, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!na", name = "n", descriptor = "Lt;")
    public static class36 field402 = class3.method8(13631, "Hunter Training");

    @OriginalMember(owner = "mapview!na", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void paint(Graphics arg0) {
        this.field389.paint(arg0);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 28)
    public static void method157(int arg0) {
        field392 = null;
        field400 = null;
        field393 = null;
        field402 = null;
        field395 = null;
        if (arg0 != -588) {
            method157(-111);
        }
        field397 = null;
        field394 = null;
        field396 = null;
        field398 = null;
        field399 = null;
        field390 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BBIII)V", line = 50)
    public static final void method158(byte arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 >> 6;
        int var6 = arg4 >> 6;
        if (class8.field88[arg3][var6][var5] == null) {
            class8.field88[arg3][var6][var5] = new byte[4096];
        }
        if (arg0 != -4) {
            field390 = null;
        }
        class8.field88[arg3][var6][var5][class19.method97(4032, arg4 << 6) + class19.method97(63, arg2)] = arg1;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)[Lt;", line = 67)
    public static final class36[] method159(int arg0) {
        return arg0 < 108 ? (class36[]) null : new class36[] { field394, class35.field484, class6.field70, mapview.field371, class8.field80, field393, class24.field280, class27.field411, class8.field84, class33.field467, class40.field527, class41.field538, class8.field86, class14.field173 };
    }

    @OriginalMember(owner = "mapview!na", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 81)
    public class26(Component arg0) {
        this.field389 = arg0;
    }

    @OriginalMember(owner = "mapview!na", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 115)
    public final void update(Graphics arg0) {
        this.field389.update(arg0);
    }
}
