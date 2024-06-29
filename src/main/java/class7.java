import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Lv;")
    public static class40 field88 = class24.method170("_", (byte) 50);

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lv;")
    public static class40 field86 = class24.method170("Grand Exchange", (byte) -98);

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Lv;")
    public static class40 field90 = class24.method170("Candle Shop", (byte) 99);

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "J")
    public static volatile long field89 = 0L;

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Lv;")
    public static class40 field92 = class24.method170("Brewery", (byte) -85);

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lv;")
    public static class40 field93 = class24.method170("u_pass", (byte) -73);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Ljava/lang/String;")
    public static String field87;

    @OriginalMember(owner = "mapview!d", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 47)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class1.field8 != null) {
            class15.field150 = -1;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 81)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class1.field8 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class25.field373.length > var2) {
            var3 = class25.field373[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class15.field150 >= 0 && var3 >= 0) {
            class8.field108[class15.field150] = var3;
            class15.field150 = class15.field150 + 1 & 0x7F;
            if (class15.field150 == class14.field144) {
                class15.field150 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class14.field139 + 1 & 0x7F;
            if (class34.field453 != var4) {
                class5.field62[class14.field139] = var3;
                class29.field423[class14.field139] = -1;
                class14.field139 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([Lv;B)V", line = 155)
    public static final void method55(class40[] arg0, byte arg1) {
        class16.method86(arg0.length, 0, arg0, 17);
        if (arg1 > -99) {
            field86 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 166)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!d", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 169)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class1.field8 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class25.field373.length > var2) {
                var3 = class25.field373[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class15.field150 >= 0 && var3 >= 0) {
                class8.field108[class15.field150] = ~var3;
                class15.field150 = class15.field150 + 1 & 0x7F;
                if (class15.field150 == class14.field144) {
                    class15.field150 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!d", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 200)
    public final void keyTyped(KeyEvent arg0) {
        if (class1.field8 != null) {
            int var2 = class20.method117(-257, arg0);
            if (var2 >= 0) {
                int var3 = class14.field139 + 1 & 0x7F;
                if (class34.field453 != var3) {
                    class5.field62[class14.field139] = -1;
                    class29.field423[class14.field139] = var2;
                    class14.field139 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 288)
    public static void method56(byte arg0) {
        field92 = null;
        field93 = null;
        if (arg0 != 47) {
            field88 = null;
        }
        field86 = null;
        field87 = null;
        field88 = null;
        field90 = null;
    }
}
