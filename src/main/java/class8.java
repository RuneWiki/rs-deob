import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Lt;")
    private static class35 field127 = class3.method28(false, "Mini)2Game");

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lt;")
    public static class35 field132 = class3.method28(false, "");

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Lt;")
    public static class35 field130 = class3.method28(false, "overlay)3dat");

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Lt;")
    private static class35 field131 = class3.method28(false, "Slayer Master");

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lt;")
    private static class35 field129 = class3.method28(false, "Fur Trader");

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Lt;")
    private static class35 field128 = class3.method28(false, "Candle Shop");

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "J")
    public static long field133;

    @OriginalMember(owner = "mapview!da", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 43)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class26.field302 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class17.field195.length) {
                var3 = class17.field195[var2];
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
                var4 = class2.method24(arg0, false);
            }
            if (class27.field312 >= 0 && var3 >= 0) {
                class29.field326[class27.field312] = var3;
                class27.field312 = class27.field312 + 1 & 0x7F;
                if (class29.field324 == class27.field312) {
                    class27.field312 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class34.field427 + 1 & 0x7F;
                if (mapview.field5 != var5) {
                    class17.field197[class34.field427] = var3;
                    class23.field263[class34.field427] = var4;
                    class34.field427 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 113)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class26.field302 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class17.field195.length > var2) {
                var3 = class17.field195[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class27.field312 >= 0 && var3 >= 0) {
                class29.field326[class27.field312] = ~var3;
                class27.field312 = class27.field312 + 1 & 0x7F;
                if (class29.field324 == class27.field312) {
                    class27.field312 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)[Lt;", line = 147)
    public static final class35[] method55(byte arg0) {
        int var1 = 72 / ((-arg0 - 48) / 63);
        return new class35[] { class17.field199, class27.field309, class16.field188, class24.field272, class24.field274, class7.field114, class11.field156, class7.field126, class34.field430, class19.field224, class30.field330, class31.field384, class23.field256, class6.field101, class33.field414, class31.field372, class16.field185, mapview.field37, class31.field391, class5.field90, class29.field327, class29.field319, class13.field170, class11.field157, field128, class31.field386, class32.field399, class15.field180, class17.field201, class17.field200, class6.field110, class26.field304, class36.field443, class24.field268, class23.field260, class23.field257, class2.field64, class21.field241, field127, class13.field168, class34.field429, class18.field210, class5.field100, class24.field273, class17.field194, class21.field245, class16.field193, field129, class13.field175, class6.field106, class3.field80, field131, class26.field301, class5.field98, class19.field218, class30.field355, class31.field394, class23.field261, class29.field323, class5.field92, class23.field264, class5.field96, class23.field254, class23.field254, class23.field254, class23.field254, class23.field254, class6.field108, class2.field66, class23.field254, class18.field207 };
    }

    @OriginalMember(owner = "mapview!da", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 163)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 181)
    public static void method56(int arg0) {
        field129 = null;
        field127 = null;
        field132 = null;
        if (arg0 < 5) {
            field127 = null;
        }
        field128 = null;
        field131 = null;
        field130 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 211)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 215)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class26.field302 != null) {
            class27.field312 = -1;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIZ)B", line = 234)
    public static final byte method57(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return -121;
        }
        int var3 = arg1 >> 6;
        int var4 = arg0 >> 6;
        if (class34.field422[var3][var4] == null) {
            return 0;
        } else if (class34.field422[var3][var4].field102 == null) {
            return class34.field422[var3][var4].field104;
        } else {
            return class34.field422[var3][var4].field102[(arg1 & 0xFC0) + arg0 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(BI[B)I", line = 275)
    public static final int method58(byte arg0, int arg1, byte[] arg2) {
        return arg0 == 17 ? class3.method29(arg1, arg0 - 3, 0, arg2) : -113;
    }
}
