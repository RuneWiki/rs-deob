import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class182 extends Canvas {

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field3369;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Z")
    public static boolean field3358 = false;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    public static int[] field3365 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lqe;")
    private static class179 field3359 = class206.method1380("Loaded fonts", (byte) -128);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3361 = -1;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lqe;")
    public static class179 field3368 = field3359;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field3363;

    @OriginalMember(owner = "client!qh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3360++;
        this.field3369.update(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3368 = null;
        field3359 = null;
        field3365 = null;
        field3363 = null;
        int var1 = 63 / ((-arg0 - 75) / 43);
    }

    @OriginalMember(owner = "client!qh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3367++;
        this.field3369.paint(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class182(Component arg0) {
        this.field3369 = arg0;
    }
}
