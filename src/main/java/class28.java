import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class28 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Lt;")
    public static class31 field310 = class11.method64(93, "Anvil");

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lt;")
    public static class31 field313 = class11.method64(-40, "Archery Shop");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Lt;")
    public static class31 field312 = class11.method64(123, "underlay)3dat");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "I")
    public static int field315 = 20;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Lt;")
    public static class31 field316 = class11.method64(-67, "Platelegs Shop");

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Z")
    public static boolean field314 = true;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Lt;")
    public static class31 field318 = class11.method64(122, "37(U");

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Lt;")
    public static class31 field317 = class11.method64(88, "Fishing Spot");

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field311;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "[[B")
    public static byte[][] field309;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 15)
    public static void method155(int arg0) {
        field310 = null;
        field312 = null;
        field317 = null;
        field311 = null;
        field313 = null;
        field318 = null;
        field309 = null;
        if (arg0 == 0) {
            field316 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 39)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class11.field186 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class32.field357.length > var2) {
                var3 = class32.field357[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class2.field89 >= 0 && var3 >= 0) {
                class8.field135[class2.field89] = ~var3;
                class2.field89 = class2.field89 + 1 & 0x7F;
                if (class31.field346 == class2.field89) {
                    class2.field89 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!p", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 105)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class11.field186 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class32.field357.length > var2) {
                var3 = class32.field357[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class2.method37(-1, arg0);
            }
            if (class2.field89 >= 0 && var3 >= 0) {
                class8.field135[class2.field89] = var3;
                class2.field89 = class2.field89 + 1 & 0x7F;
                if (class31.field346 == class2.field89) {
                    class2.field89 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class15.field225 + 1 & 0x7F;
                if (class4.field113 != var5) {
                    class10.field169[class15.field225] = var3;
                    class29.field326[class15.field225] = var4;
                    class15.field225 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 222)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class11.field186 != null) {
            class2.field89 = -1;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 250)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 266)
    public final void focusGained(FocusEvent arg0) {
    }
}
