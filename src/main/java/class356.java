import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class356 extends Canvas {

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field5619;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static volatile int field5616 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[S")
    public static short[] field5618 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lnn;")
    public static class45 field5613;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[Z")
    public static boolean[] field5615;

    @OriginalMember(owner = "client!bf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 14)
    public final void paint(Graphics arg0) {
        this.field5619.paint(arg0);
        field5614++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I", line = 29)
    public static final int method2469(int arg0, int arg1, int arg2) {
        field5612++;
        int var3 = class209.method1552(arg0 - 1, 123, arg2 - 1) + class209.method1552(arg0 + 1, arg1 ^ 0xFFFFFFA7, arg2 - 1) + class209.method1552(arg0 + -1, 105, arg2 + 1) + class209.method1552(arg0 + 1, 113, arg2 - arg1);
        int var4 = class209.method1552(arg0 - 1, 76, arg2) + (class209.method1552(arg0 + 1, 92, arg2) - (-class209.method1552(arg0, 113, arg2 - 1) - class209.method1552(arg0, 97, arg2 + 1)));
        int var5 = class209.method1552(arg0, arg1 ^ 0xFFFFFF92, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 42)
    public class356(Component arg0) {
        this.field5619 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 51)
    public final void update(Graphics arg0) {
        this.field5619.update(arg0);
        field5617++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 60)
    public static void method2470(byte arg0) {
        field5615 = null;
        if (arg0 != 65) {
            field5615 = (boolean[]) null;
        }
        field5618 = null;
        field5613 = null;
    }
}
