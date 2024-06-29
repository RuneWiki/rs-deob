import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Lf;")
    public static class10 field15 = class23.method139("Staff Shop", (byte) -66);

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "I")
    public static int field16 = 500;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Lf;")
    public static class10 field14 = class23.method139("Herbalist", (byte) -122);

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Lf;")
    public static class10 field11 = class23.method139("mapscene", (byte) -119);

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Lf;")
    public static class10 field17 = class23.method139("100(U", (byte) -67);

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "I")
    public static volatile int field18 = 0;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field13;

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field12;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I", line = 5)
    public static final int method3(boolean arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (arg0) {
            method6(-61);
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 24)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 35)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class7.field65 != null) {
            class27.field381 = arg0.getX();
            class25.field278 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 52)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class7.field65 != null) {
            class19.field177 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 72)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 76)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class7.field65 != null) {
            class27.field381 = arg0.getX();
            class25.field278 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class7.field65 != null) {
            class27.field381 = -1;
            class25.field278 = -1;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 131)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class7.field65 != null) {
            class27.field381 = arg0.getX();
            class25.field278 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)[Lu;", line = 148)
    public static final class39[] method4(int arg0) {
        class39[] var1 = new class39[class21.field239];
        for (int var2 = 0; var2 < class21.field239; var2++) {
            class39 var3 = new class39();
            var3.field530 = class19.field180[var2];
            var3.field532 = class31.field425[var2];
            var3.field529 = class33.field470[var2];
            var3.field528 = class1.field10[var2];
            byte[] var4 = class35.field490[var2];
            int var5 = var3.field529 * var3.field528;
            var3.field531 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field531[var6] = class41.field539[method5(255, var4[var6])];
            }
            var1[var2] = var3;
        }
        if (arg0 != 255) {
            field11 = null;
        }
        class18.method113(-1);
        return var1;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(II)I", line = 194)
    public static int method5(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!aa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 209)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class7.field65 != null) {
            class19.field177 = 0;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(I)V", line = 229)
    public static void method6(int arg0) {
        field15 = null;
        field11 = null;
        field17 = null;
        int var1 = 34 % ((78 - arg0) / 43);
        field13 = null;
        field12 = null;
        field14 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 250)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class7.field65 != null) {
            field18 = arg0.getX();
            class30.field406 = arg0.getY();
            if (arg0.isMetaDown()) {
                class6.field63 = 2;
                class19.field177 = 2;
            } else {
                class6.field63 = 1;
                class19.field177 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
