import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Lk;")
    public static class21 field143 = class14.method92((byte) 57, "Requesting ");

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "I")
    public static volatile int field142 = 0;

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lk;")
    public static class21 field144 = class14.method92((byte) 57, "75(U");

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "I")
    public static int field146 = 20;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lk;")
    public static class21 field147 = class14.method92((byte) 57, "(U");

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Lk;")
    public static class21 field149 = class14.method92((byte) 57, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Lia;")
    public static class18 field148;

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "[I")
    public static int[] field145;

    @OriginalMember(owner = "mapview!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 9)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!da", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 28)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class15.field195 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class2.field75.length > var2) {
                var3 = class2.field75[var2];
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
                var4 = class22.method148(arg0, (byte) 124);
            }
            if (class22.field273 >= 0 && var3 >= 0) {
                class17.field206[class22.field273] = var3;
                class22.field273 = class22.field273 + 1 & 0x7F;
                if (class25.field319 == class22.field273) {
                    class22.field273 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class29.field355 + 1 & 0x7F;
                if (class32.field386 != var5) {
                    class28.field342[class29.field355] = var3;
                    class25.field318[class29.field355] = var4;
                    class29.field355 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 113)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class15.field195 != null) {
            class22.field273 = -1;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 171)
    public static void method58(int arg0) {
        field147 = null;
        field149 = null;
        field144 = null;
        field143 = null;
        field145 = null;
        if (arg0 != 127) {
            field148 = null;
        }
        field148 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 195)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class15.field195 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class2.field75.length) {
                var3 = class2.field75[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class22.field273 >= 0 && var3 >= 0) {
                class17.field206[class22.field273] = ~var3;
                class22.field273 = class22.field273 + 1 & 0x7F;
                if (class25.field319 == class22.field273) {
                    class22.field273 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 241)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }
}
