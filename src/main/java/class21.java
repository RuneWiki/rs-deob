import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends Canvas {

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field218;

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lr;")
    public static class33 field221 = class29.method192("???", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lr;")
    public static class33 field220 = class29.method192("Gem Shop", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lr;")
    public static class33 field217 = class29.method192("floorcol)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lr;")
    public static class33 field222 = class29.method192("Enter place name to find", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Lr;")
    public static class33 field223 = class29.method192("Dungeon", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Lr;")
    public static class33 field225 = class29.method192("(U", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lr;")
    public static class33 field226 = class29.method192("Next page", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "Lr;")
    public static class33 field227 = class29.method192("Please wait)3)3)3 Rendering Map", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lr;")
    public static class33 field224 = class29.method192("world", (byte) 126);

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "[I")
    public static int[] field219;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 4)
    public static void method136(byte arg0) {
        field225 = null;
        if (arg0 < 48) {
            return;
        }
        field224 = null;
        field219 = null;
        field221 = null;
        field223 = null;
        field227 = null;
        field220 = null;
        field217 = null;
        field222 = null;
        field226 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public class21(Component arg0) {
        this.field218 = arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 36)
    public static final void method137(Component arg0, byte arg1) {
        arg0.removeMouseListener(class29.field417);
        arg0.removeMouseMotionListener(class29.field417);
        if (arg1 == -1) {
            arg0.removeFocusListener(class29.field417);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(B)V", line = 51)
    public static final void method138(byte arg0) {
        class14 var1 = class29.field417;
        synchronized (class29.field417) {
            if (arg0 <= 113) {
                method138((byte) -41);
            }
            class8.field117 = class25.field266;
            class23.field247 = class32.field457;
            class2.field8 = class22.field231;
            class36.field490 = class24.field264;
            class17.field190 = class35.field484;
            class8.field107 = class38.field511;
            class24.field264 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 77)
    public final void update(Graphics arg0) {
        this.field218.update(arg0);
    }

    @OriginalMember(owner = "mapview!ka", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 115)
    public final void paint(Graphics arg0) {
        this.field218.paint(arg0);
    }
}
