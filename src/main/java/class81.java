import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class81 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1234 = 0;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1233 = "white:";

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1246 = "Take";

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lte;")
    public static class280 field1231;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lvl;")
    public static class73 field1229;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(CI)C")
    public static final char method547(char arg0, int arg1) {
        field1245++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 != 15816) {
                field1234 = 76;
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
    public static final int method548(int arg0, int arg1) {
        if (arg1 != 255) {
            field1233 = null;
        }
        field1232++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lu;B)V")
    public static final void method549(class243 arg0, byte arg1) {
        field1230++;
        int var2 = arg0.field3888 - class311.field4996;
        int var3 = arg0.field3916 * 128 + arg0.method8((byte) -42) * 64;
        if (arg1 <= 0) {
            return;
        }
        int var4 = arg0.field3895 * 128 + arg0.method8((byte) -73) * 64;
        if (arg0.field3929 == 0) {
            arg0.field3924 = 1024;
        }
        arg0.field3920 += (var4 - arg0.field3920) / var2;
        arg0.field3984 = 0;
        arg0.field3915 += (var3 - arg0.field3915) / var2;
        if (arg0.field3929 == 1) {
            arg0.field3924 = 1536;
        }
        if (arg0.field3929 == 2) {
            arg0.field3924 = 0;
        }
        if (arg0.field3929 == 3) {
            arg0.field3924 = 512;
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1242++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lel;")
    public static final class112 method550(Throwable arg0, String arg1) {
        field1237++;
        class112 var2;
        if (arg0 instanceof class112) {
            var2 = (class112) arg0;
            var2.field1620 = var2.field1620 + ' ' + arg1;
        } else {
            var2 = new class112(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1236++;
        if (class108.field1568 != null) {
            class216.field3371 = 0;
            class243.field3910 = -1;
            class129.field1862 = -1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1241++;
        if (class108.field1568 != null) {
            class216.field3371 = 0;
            class223.field3495 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1239++;
        if (class108.field1568 != null) {
            class216.field3371 = 0;
            class243.field3910 = arg0.getX();
            class129.field1862 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1244++;
        if (class108.field1568 != null) {
            class216.field3371 = 0;
            class243.field3910 = arg0.getX();
            class129.field1862 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1240++;
        if (class108.field1568 != null) {
            class216.field3371 = 0;
            class243.field3910 = arg0.getX();
            class129.field1862 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1243++;
    }

    @OriginalMember(owner = "client!jk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1235++;
        if (class108.field1568 != null) {
            class216.field3371 = 0;
            class300.field4794 = arg0.getX();
            class80.field1223 = arg0.getY();
            class18.field252 = class98.method665(true);
            if (arg0.isMetaDown()) {
                class36.field442 = 2;
                class223.field3495 = 2;
            } else {
                class36.field442 = 1;
                class223.field3495 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class108.field1568 != null) {
            class223.field3495 = 0;
        }
        field1238++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public static void method551(boolean arg0) {
        if (arg0) {
            method550((Throwable) null, (String) null);
        }
        field1229 = null;
        field1231 = null;
        field1233 = null;
        field1246 = null;
    }
}
