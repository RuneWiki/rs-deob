import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class26 extends Canvas {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field438;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lmb;")
    private static class96 field439 = class243.method1708("Loading world list data", (byte) 98);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lmb;")
    public static class96 field440 = field439;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Ldf;")
    public static class146 field441 = new class146(512);

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lmb;")
    private static class96 field444 = class243.method1708("Members object", (byte) 124);

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lmb;")
    public static class96 field443 = field444;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
    public static int[] field442;

    @OriginalMember(owner = "client!qh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field437++;
        this.field438.update(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method177(int arg0) {
        field440 = null;
        field439 = null;
        if (arg0 != -11237) {
            field443 = null;
        }
        field441 = null;
        field443 = null;
        field444 = null;
        field442 = null;
    }

    @OriginalMember(owner = "client!qh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field436++;
        this.field438.paint(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class26(Component arg0) {
        this.field438 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method178(int arg0, int arg1, int arg2, int arg3) {
        if (class153.method1123(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class272.method1851(var4 + 1, class173.field3022[arg0][arg1][arg2] + arg3, var5 + 1) && class272.method1851(var4 + 128 - 1, class173.field3022[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class272.method1851(var4 + 128 - 1, class173.field3022[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class272.method1851(var4 + 1, class173.field3022[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
