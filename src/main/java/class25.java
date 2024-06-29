import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class25 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lh;")
    public static class15 field332 = class18.method153("Farming patch", 1);

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lh;")
    public static class15 field334 = class18.method153("overlay)3dat", 1);

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lh;")
    public static class15 field333 = class18.method153("Switch to ", 1);

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "I")
    public static int field337 = 0;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "I")
    public static int field339 = -1;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lla;")
    public static class24 field336;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field340;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[B")
    public static byte[] field338;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "[[Lv;")
    public static class36[][] field335;

    @OriginalMember(owner = "mapview!m", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 18)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class21.field288 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class5.field89.length > var2) {
                var3 = class5.field89[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class19.field265 >= 0 && var3 >= 0) {
                class12.field176[class19.field265] = ~var3;
                class19.field265 = class19.field265 + 1 & 0x7F;
                if (class9.field129 == class19.field265) {
                    class19.field265 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)I", line = 61)
    public static final int method187(int arg0) {
        if (arg0 != 0) {
            field336 = null;
        }
        if (class21.field297 == null) {
            return 0;
        } else if (class21.field297.field452 == null) {
            return class24.field324[class21.field297.field446 & 0xFF];
        } else {
            return class24.field324[class21.field297.field452[class15.field220] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!m", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 88)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class21.field288 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class5.field89.length) {
                var3 = class5.field89[var2];
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
                var4 = class11.method92(26138, arg0);
            }
            if (class19.field265 >= 0 && var3 >= 0) {
                class12.field176[class19.field265] = var3;
                class19.field265 = class19.field265 + 1 & 0x7F;
                if (class9.field129 == class19.field265) {
                    class19.field265 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class9.field115 + 1 & 0x7F;
                if (class21.field301 != var5) {
                    class6.field102[class9.field115] = var3;
                    class11.field144[class9.field115] = var4;
                    class9.field115 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!m", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 154)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)V", line = 194)
    public static void method188(int arg0) {
        field332 = null;
        field335 = null;
        field333 = null;
        field336 = null;
        field338 = null;
        int var1 = 108 % ((20 - arg0) / 47);
        field334 = null;
        field340 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 235)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class21.field288 != null) {
            class19.field265 = -1;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)B", line = 251)
    public static final byte method189(byte arg0) {
        if (arg0 > -88) {
            field332 = null;
        }
        return field338 == null ? 0 : field338[class15.field220];
    }

    @OriginalMember(owner = "mapview!m", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 280)
    public final void focusGained(FocusEvent arg0) {
    }
}
