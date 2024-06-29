import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "Lu;")
    public static class38 field103 = class28.method177("Herbalist", (byte) -84);

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Lu;")
    public static class38 field99 = class28.method177("world", (byte) -84);

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "Lu;")
    public static class38 field104 = class28.method177("Hair Dressers", (byte) -84);

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "Lu;")
    public static class38 field107 = class28.method177("Fishing Spot", (byte) -84);

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "Lu;")
    public static class38 field105 = class28.method177("Silk Trader", (byte) -84);

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "I")
    public static int field98 = -1;

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "J")
    public static volatile long field101 = 0L;

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "Lu;")
    public static class38 field106 = class28.method177("Enter place name to find", (byte) -84);

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "mapview!f", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 32)
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class34.method204(arg0, 28579);
        if (var2 >= 0) {
            int var3 = class10.field93 + 1 & 0x7F;
            if (field102 != var3) {
                class29.field369[class10.field93] = -1;
                class28.field351[class10.field93] = var2;
                class10.field93 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!f", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 65)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class29.field364 != null) {
            class31.field389 = -1;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)V", line = 79)
    public static void method51(int arg0) {
        field99 = null;
        field107 = null;
        if (arg0 != 0) {
            method52(false);
        }
        field104 = null;
        field106 = null;
        field105 = null;
        field103 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 102)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class29.field364 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class34.field423.length > var2) {
                var3 = class34.field423[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class31.field389 >= 0 && var3 >= 0) {
                class30.field378[class31.field389] = ~var3;
                class31.field389 = class31.field389 + 1 & 0x7F;
                if (class31.field389 == class29.field373) {
                    class31.field389 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Z)V", line = 142)
    public static final void method52(boolean arg0) {
        if (arg0) {
            method52(true);
        }
        class11 var1 = class29.field364;
        synchronized (class29.field364) {
            field102 = class19.field191;
            if (class31.field389 >= 0) {
                while (class31.field389 != class29.field373) {
                    int var2 = class30.field378[class29.field373];
                    class29.field373 = class29.field373 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class7.field65[var2] = true;
                    } else {
                        class7.field65[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class7.field65[var3] = false;
                }
                class31.field389 = class29.field373;
            }
            class19.field191 = class10.field93;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IJ)V", line = 214)
    public static final void method53(int arg0, long arg1) {
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class3.method17(arg1 - 1L, -42);
            class3.method17(1L, 125);
        } else {
            class3.method17(arg1, arg0 + 117);
        }
        if (arg0 != 0) {
            field100 = 58;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 305)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class29.field364 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class34.field423.length) {
            var3 = class34.field423[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class31.field389 >= 0 && var3 >= 0) {
            class30.field378[class31.field389] = var3;
            class31.field389 = class31.field389 + 1 & 0x7F;
            if (class31.field389 == class29.field373) {
                class31.field389 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class10.field93 + 1 & 0x7F;
            if (field102 != var4) {
                class29.field369[class10.field93] = var3;
                class28.field351[class10.field93] = -1;
                class10.field93 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!f", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 363)
    public final void focusGained(FocusEvent arg0) {
    }
}
