import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends Canvas {

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field52;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Ls;")
    public static class34 field49 = class9.method35("Staff Shop", 220);

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Ls;")
    public static class34 field50 = class9.method35("Legende", 220);

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Ls;")
    public static class34 field48 = class9.method35("Slayer Master", 220);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "[I")
    public static int[] field53 = new int[128];

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Ls;")
    public static class34 field51 = class9.method35("Dairy Churn", 220);

    @OriginalMember(owner = "mapview!d", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void paint(Graphics arg0) {
        this.field52.paint(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 21)
    public static void method19(int arg0) {
        field50 = null;
        field53 = null;
        field51 = null;
        if (arg0 != 8438) {
            field48 = null;
        }
        field49 = null;
        field48 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZI)I", line = 59)
    public static final int method20(boolean arg0, int arg1) {
        if (!arg0) {
            method20(true, -57);
        }
        if (arg1 >= 65 && arg1 <= 90) {
            arg1 += 32;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!d", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 80)
    public final void update(Graphics arg0) {
        this.field52.update(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 85)
    public class7(Component arg0) {
        this.field52 = arg0;
    }
}
