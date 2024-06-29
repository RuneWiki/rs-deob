import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "I")
    public static volatile int field381 = -1;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "I")
    public static int field384 = -1;

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lf;")
    public static class10 field382 = class23.method139("Loom", (byte) -119);

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lf;")
    public static class10 field383 = class23.method139("???", (byte) -62);

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Lf;")
    public static class10 field386 = class23.method139("Gem Shop", (byte) -125);

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Lf;")
    public static class10 field387 = class23.method139("Summoning Store", (byte) -84);

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Z")
    public static boolean field385;

    @OriginalMember(owner = "mapview!na", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 43)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class21.field235 != null) {
            class17.field148 = -1;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 70)
    public final void keyTyped(KeyEvent arg0) {
        if (class21.field235 != null) {
            int var2 = class2.method3(false, arg0);
            if (var2 >= 0) {
                int var3 = class17.field151 + 1 & 0x7F;
                if (class35.field488 != var3) {
                    class37.field511[class17.field151] = -1;
                    class24.field259[class17.field151] = var2;
                    class17.field151 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!na", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 99)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class21.field235 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class18.field166.length > var2) {
                var3 = class18.field166[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class17.field148 >= 0 && var3 >= 0) {
                class35.field492[class17.field148] = ~var3;
                class17.field148 = class17.field148 + 1 & 0x7F;
                if (class25.field273 == class17.field148) {
                    class17.field148 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z)B", line = 136)
    public static final byte method176(boolean arg0) {
        if (arg0) {
            field384 = -74;
        }
        return class11.field118 == null ? 0 : class11.field118[class41.field538];
    }

    @OriginalMember(owner = "mapview!na", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 160)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class21.field235 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class18.field166.length) {
            var3 = class18.field166[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class17.field148 >= 0 && var3 >= 0) {
            class35.field492[class17.field148] = var3;
            class17.field148 = class17.field148 + 1 & 0x7F;
            if (class25.field273 == class17.field148) {
                class17.field148 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class17.field151 + 1 & 0x7F;
            if (class35.field488 != var4) {
                class37.field511[class17.field151] = var3;
                class24.field259[class17.field151] = -1;
                class17.field151 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 239)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 288)
    public static void method177(byte arg0) {
        if (arg0 == 2) {
            field383 = null;
            field382 = null;
            field386 = null;
            field387 = null;
        }
    }
}
