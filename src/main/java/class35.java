import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class35 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "Lta;")
    public static class37 field482 = null;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "Ls;")
    public static class34 field484 = class9.method35("Cookery Shop", 220);

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "I")
    public static int field485 = 0;

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "Ls;")
    public static class34 field483 = class9.method35("Overview", 220);

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "Ls;")
    public static class34 field486 = class9.method35("Farming patch", 220);

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "Ls;")
    public static class34 field489 = class9.method35("Vegetable Store", 220);

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "Ls;")
    public static class34 field488 = class9.method35("Makeover Mage", 220);

    @OriginalMember(owner = "mapview!sa", name = "i", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field490;

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "[Lf;")
    public static class11[] field487;

    @OriginalMember(owner = "mapview!sa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 5)
    public final void keyTyped(KeyEvent arg0) {
        if (class6.field39 != null) {
            int var2 = class26.method171(arg0, -210313695);
            if (var2 >= 0) {
                int var3 = class19.field164 + 1 & 0x7F;
                if (class8.field78 != var3) {
                    class28.field386[class19.field164] = -1;
                    class12.field119[class19.field164] = var2;
                    class19.field164 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!sa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 53)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class6.field39 != null) {
            class3.field26 = -1;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 113)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class6.field39 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class8.field79.length) {
            var3 = class8.field79[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class3.field26 >= 0 && var3 >= 0) {
            class7.field53[class3.field26] = var3;
            class3.field26 = class3.field26 + 1 & 0x7F;
            if (class34.field467 == class3.field26) {
                class3.field26 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class19.field164 + 1 & 0x7F;
            if (class8.field78 != var4) {
                class28.field386[class19.field164] = var3;
                class12.field119[class19.field164] = -1;
                class19.field164 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 172)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 214)
    public static final Object method245(byte[] arg0, int arg1, boolean arg2) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class38.field512) {
            try {
                class30 var3 = (class30) Class.forName("ra").getDeclaredConstructor().newInstance();
                var3.method204(arg0, 114);
                return var3;
            } catch (Throwable var6) {
                class38.field512 = true;
            }
        }
        int var5 = -113 / ((arg1 + 76) / 50);
        return arg2 ? class38.method266(75, arg0) : arg0;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 254)
    public static void method246(int arg0) {
        field483 = null;
        if (arg0 != -1) {
            field486 = null;
        }
        field484 = null;
        field490 = null;
        field487 = null;
        field488 = null;
        field489 = null;
        field486 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 303)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class6.field39 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class8.field79.length) {
                var3 = class8.field79[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class3.field26 >= 0 && var3 >= 0) {
                class7.field53[class3.field26] = ~var3;
                class3.field26 = class3.field26 + 1 & 0x7F;
                if (class34.field467 == class3.field26) {
                    class3.field26 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 336)
    public static final void method247(int arg0, Component arg1) {
        Method var2 = class32.field455;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class6.field39);
        arg1.addFocusListener(class6.field39);
        if (arg0 != 0) {
            method246(-71);
        }
    }
}
