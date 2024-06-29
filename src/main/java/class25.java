import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "I")
    public static volatile int field266 = 0;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Lr;")
    public static class33 field268 = class29.method192("Key", (byte) 126);

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "Lr;")
    private static class33 field269 = class29.method192("Cookery Shop", (byte) 126);

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Lr;")
    private static class33 field271 = class29.method192("Archery Shop", (byte) 126);

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "Lr;")
    public static class33 field274 = class29.method192("details)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "Lr;")
    public static class33 field275 = class29.method192(" map", (byte) 126);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Ls;")
    public static class35 field267;

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field270;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "[I")
    public static int[] field272;

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "[I")
    public static int[] field273;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 8)
    public static void method162(int arg0) {
        field268 = null;
        field274 = null;
        field272 = null;
        field271 = null;
        field270 = null;
        if (arg0 != -1) {
            field268 = null;
        }
        field267 = null;
        field269 = null;
        field275 = null;
        field273 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)[Lr;", line = 37)
    public static final class33[] method163(int arg0) {
        int var1 = -106 / ((34 - arg0) / 55);
        class33[] var10000 = new class33[] { class4.field39, class36.field488, class36.field498, class22.field240, class2.field13, class8.field114, class31.field442, class29.field428, class11.field144, class5.field57, class29.field426, class23.field254, class21.field223, class32.field449, class38.field508, mapview.field363, class12.field161, field271, class35.field479, class2.field10, class20.field212, class29.field416, class21.field220, mapview.field343, class8.field115, class10.field127, class32.field455, class38.field510, class26.field381, class30.field432, mapview.field329, class31.field444, class24.field256, class13.field166, class10.field131, class12.field155, class31.field446, field269, class14.field169, class22.field244, class14.field173, class31.field440, class24.field258, class11.field139, mapview.field336, class26.field407, class20.field203, class12.field153, class8.field111, class23.field248, class12.field158, class33.field460, class23.field251, class4.field32, class33.field459, class32.field456, class17.field189, class24.field259, class2.field11, mapview.field341, class8.field105, class13.field168, mapview.field310, class31.field438, mapview.field310, class8.field109, mapview.field310, class38.field507, class29.field425, mapview.field310, class2.field9, class8.field108, mapview.field310, class35.field485, mapview.field310, mapview.field310 };
        if (class12.field163) {
        }
        return var10000;
    }

    @OriginalMember(owner = "mapview!ma", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 50)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class35.field483 != null) {
            class31.field447 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 95)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class35.field483 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class12.field151.length > var2) {
                var3 = class12.field151[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class31.field447 >= 0 && var3 >= 0) {
                class6.field70[class31.field447] = ~var3;
                class31.field447 = class31.field447 + 1 & 0x7F;
                if (class5.field42 == class31.field447) {
                    class31.field447 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(II)I", line = 132)
    public static final int method164(int arg0, int arg1) {
        if (arg1 > -9) {
            return -86;
        } else {
            if (arg0 >= 65 && arg0 <= 90) {
                arg0 += 32;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 151)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 158)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ma", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 178)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class35.field483 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class12.field151.length) {
                var3 = class12.field151[var2];
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
                var4 = class35.method239(arg0, (byte) 41);
            }
            if (class31.field447 >= 0 && var3 >= 0) {
                class6.field70[class31.field447] = var3;
                class31.field447 = class31.field447 + 1 & 0x7F;
                if (class5.field42 == class31.field447) {
                    class31.field447 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class10.field132 + 1 & 0x7F;
                if (class35.field476 != var5) {
                    class17.field186[class10.field132] = var3;
                    class33.field466[class10.field132] = var4;
                    class10.field132 = var5;
                }
            }
        }
        arg0.consume();
    }
}
