import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class5 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Lna;")
    public static class26 field142 = class30.method205((byte) 57, "Silk Trader");

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lna;")
    public static class26 field141 = class30.method205((byte) 85, "u_pass");

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lna;")
    public static class26 field144 = class30.method205((byte) 55, "Dungeon");

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "mapview!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 18)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class15.field204 != null) {
            class4.field131 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 58)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class15.field204 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && mapview.field25.length > var2) {
            var3 = mapview.field25[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class4.field131 >= 0 && var3 >= 0) {
            class41.field525[class4.field131] = var3;
            class4.field131 = class4.field131 + 1 & 0x7F;
            if (class4.field131 == class30.field401) {
                class4.field131 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class15.field208 + 1 & 0x7F;
            if (class29.field387 != var4) {
                class25.field346[class15.field208] = var3;
                class26.field361[class15.field208] = -1;
                class15.field208 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 143)
    public static void method52(boolean arg0) {
        field141 = null;
        if (arg0) {
            field144 = null;
        }
        field144 = null;
        field142 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 170)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 187)
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class17.method112(arg0, 128);
        if (var2 >= 0) {
            int var3 = class15.field208 + 1 & 0x7F;
            if (class29.field387 != var3) {
                class25.field346[class15.field208] = -1;
                class26.field361[class15.field208] = var2;
                class15.field208 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 215)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class15.field204 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && mapview.field25.length > var2) {
                var3 = mapview.field25[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class4.field131 >= 0 && var3 >= 0) {
                class41.field525[class4.field131] = ~var3;
                class4.field131 = class4.field131 + 1 & 0x7F;
                if (class4.field131 == class30.field401) {
                    class4.field131 = -1;
                }
            }
        }
        arg0.consume();
    }
}
