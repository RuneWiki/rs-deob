import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Z")
    public static boolean field66 = true;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Lba;")
    public static class4 field70 = class14.method105((byte) -65, "75(U");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Lba;")
    public static class4 field69 = class14.method105((byte) -86, "Fur Trader");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lba;")
    public static class4 field71 = class14.method105((byte) -109, "underlay)3dat");

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "Lba;")
    public static class4 field72 = class14.method105((byte) -99, "Combat Training");

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 17)
    public static void method21(byte arg0) {
        if (arg0 >= 69) {
            field71 = null;
            field70 = null;
            field72 = null;
            field69 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 34)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 87)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class17.field212 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class20.field225.length > var2) {
                var3 = class20.field225[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class27.field312 >= 0 && var3 >= 0) {
                class35.field437[class27.field312] = ~var3;
                class27.field312 = class27.field312 + 1 & 0x7F;
                if (class9.field147 == class27.field312) {
                    class27.field312 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZI)Lba;", line = 123)
    public static final class4 method22(boolean arg0, int arg1) {
        if (arg0) {
            field71 = null;
        }
        return class9.method85(false, arg1, -114, 10);
    }

    @OriginalMember(owner = "mapview!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class17.field212 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class20.field225.length > var2) {
                var3 = class20.field225[var2];
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
                var4 = class31.method189(arg0, (byte) 124);
            }
            if (class27.field312 >= 0 && var3 >= 0) {
                class35.field437[class27.field312] = var3;
                class27.field312 = class27.field312 + 1 & 0x7F;
                if (class9.field147 == class27.field312) {
                    class27.field312 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = field65 + 1 & 0x7F;
                if (class26.field308 != var5) {
                    class24.field295[field65] = var3;
                    class5.field114[field65] = var4;
                    field65 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 214)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Lc;III)[Lf;", line = 256)
    public static final class11[] method23(class5 arg0, int arg1, int arg2, int arg3) {
        int var4 = -39 % ((77 - arg1) / 39);
        return class14.method106((byte) 33, arg2, arg0, arg3) ? class13.method101(-27085) : null;
    }

    @OriginalMember(owner = "mapview!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 281)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class17.field212 != null) {
            class27.field312 = -1;
        }
    }
}
