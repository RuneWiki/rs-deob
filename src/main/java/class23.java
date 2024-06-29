import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Z")
    public static boolean field303 = false;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "I")
    public static volatile int field302 = 0;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Lj;")
    public static class17 field307 = class30.method190(-97, "Cookery Shop");

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "Z")
    public static boolean field308 = false;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lb;")
    public static class3 field301;

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "[B")
    public static byte[] field309;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)B", line = 12)
    public static final byte method155(int arg0) {
        if (arg0 == -4333) {
            return class35.field447 == null ? 0 : class35.field447[class13.field234];
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I[Lj;)Lj;", line = 73)
    public static final class17 method156(int arg0, class17[] arg1) {
        if (arg0 != -2969) {
            method156(-65, null);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class35.method240(-122, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "mapview!m", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 99)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!m", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 119)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class28.field364 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class13.field239.length) {
                var3 = class13.field239[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class26.field335 >= 0 && var3 >= 0) {
                class18.field273[class26.field335] = ~var3;
                class26.field335 = class26.field335 + 1 & 0x7F;
                if (class26.field335 == class12.field228) {
                    class26.field335 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!m", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 166)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z)V", line = 174)
    public static void method157(boolean arg0) {
        field301 = null;
        field307 = null;
        if (!arg0) {
            field301 = null;
        }
        field309 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 197)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class28.field364 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class13.field239.length > var2) {
                var3 = class13.field239[var2];
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
                var4 = class20.method148(-119, arg0);
            }
            if (class26.field335 >= 0 && var3 >= 0) {
                class18.field273[class26.field335] = var3;
                class26.field335 = class26.field335 + 1 & 0x7F;
                if (class26.field335 == class12.field228) {
                    class26.field335 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class24.field319 + 1 & 0x7F;
                if (class11.field219 != var5) {
                    class18.field278[class24.field319] = var3;
                    class1.field74[class24.field319] = var4;
                    class24.field319 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(Z)Lb;", line = 272)
    public static final class3 method158(boolean arg0) {
        if (arg0) {
            field309 = null;
        }
        try {
            return (class3) Class.forName("f").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class26();
        }
    }

    @OriginalMember(owner = "mapview!m", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 299)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class28.field364 != null) {
            class26.field335 = -1;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILt;II)[Lla;", line = 317)
    public static final class22[] method159(int arg0, class34 arg1, int arg2, int arg3) {
        if (class8.method76(arg2, arg3, arg1, (byte) 123)) {
            if (arg0 != 127) {
                method157(true);
            }
            return class33.method223(255);
        } else {
            return null;
        }
    }
}
