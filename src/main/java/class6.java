import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class6 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Z")
    public static boolean field46 = false;

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "I")
    public static int field49 = 0;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Ll;")
    public static class21 field50 = class28.method185(-20839, "Mini)2Game");

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Ll;")
    public static class21 field51 = class28.method185(-20839, "Guide");

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Ll;")
    public static class21 field45 = class28.method185(-20839, "Water Source");

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "J")
    public static long field47 = 0L;

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "mapview!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 29)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 35)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class5.field38 != null) {
            class10.field69 = -1;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 78)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class5.field38 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && PixMap.field224.length > var2) {
                var3 = PixMap.field224[var2];
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
                var4 = class31.method198(arg0, false);
            }
            if (class10.field69 >= 0 && var3 >= 0) {
                class4.field27[class10.field69] = var3;
                class10.field69 = class10.field69 + 1 & 0x7F;
                if (class10.field79 == class10.field69) {
                    class10.field69 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class4.field30 + 1 & 0x7F;
                if (class28.field329 != var5) {
                    class3.field17[class4.field30] = var3;
                    class16.field149[class4.field30] = var4;
                    class4.field30 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 133)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class5.field38 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && PixMap.field224.length > var2) {
                var3 = PixMap.field224[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class10.field69 >= 0 && var3 >= 0) {
                class4.field27[class10.field69] = ~var3;
                class10.field69 = class10.field69 + 1 & 0x7F;
                if (class10.field79 == class10.field69) {
                    class10.field69 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 194)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 227)
    public static void method15(int arg0) {
        if (arg0 == 1) {
            field45 = null;
            field51 = null;
            field50 = null;
        }
    }
}
