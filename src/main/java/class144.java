import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pe")
public class class144 extends Canvas {

    @OriginalMember(owner = "pe", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field2784;

    @OriginalMember(owner = "pe", name = "d", descriptor = "Llf;")
    public static class109 field2774 = class35.method275(": ", 2);

    @OriginalMember(owner = "pe", name = "c", descriptor = "Lbe;")
    public static class16 field2773 = new class16();

    @OriginalMember(owner = "pe", name = "k", descriptor = "Llf;")
    private static class109 field2781 = class35.method275(" has logged out)3", 2);

    @OriginalMember(owner = "pe", name = "i", descriptor = "Llf;")
    public static class109 field2779 = class35.method275("nav", 2);

    @OriginalMember(owner = "pe", name = "p", descriptor = "Llf;")
    public static class109 field2786 = field2781;

    @OriginalMember(owner = "pe", name = "m", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "pe", name = "j", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "pe", name = "a", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "pe", name = "e", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "pe", name = "f", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "pe", name = "g", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "pe", name = "l", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "pe", name = "o", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "pe", name = "b", descriptor = "Lt;")
    public static class175 field2772;

    @OriginalMember(owner = "pe", name = "h", descriptor = "Luf;")
    public static class190 field2778;

    @OriginalMember(owner = "pe", name = "a", descriptor = "(ILuc;I)V")
    public static final void method1015(int arg0, class187 arg1, int arg2) {
        field2785++;
        class44.method311(arg1.field3549, arg1.field3609, (byte) 24, arg2);
        if (arg0 != -25993) {
            field2780 = -28;
        }
    }

    @OriginalMember(owner = "pe", name = "a", descriptor = "(Z)V")
    public static void method1016(boolean arg0) {
        field2773 = null;
        field2781 = null;
        field2772 = null;
        field2786 = null;
        field2779 = null;
        field2778 = null;
        field2774 = null;
        if (!arg0) {
            field2778 = null;
        }
    }

    @OriginalMember(owner = "pe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2776++;
        this.field2784.paint(arg0);
    }

    @OriginalMember(owner = "pe", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2771++;
        this.field2784.update(arg0);
    }

    @OriginalMember(owner = "pe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class144(Component arg0) {
        this.field2784 = arg0;
    }
}
