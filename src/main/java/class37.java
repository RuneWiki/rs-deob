import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class37 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "Lw;")
    public static class38 field497 = class35.method219("Prev page", true);

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Lw;")
    public static class38 field499 = class35.method219("Overview", true);

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Lw;")
    public static class38 field496 = class35.method219("Spinning Wheel", true);

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "I")
    public static int field500 = 0;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "mapview!v", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 19)
    public static void method227(int arg0) {
        field499 = null;
        if (arg0 == -12414) {
            field496 = null;
            field497 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 34)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class9.field67 != null) {
            class34.field451 = arg0.getX();
            class3.field19 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 50)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class9.field67 != null) {
            class34.field451 = -1;
            class3.field19 = -1;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)I", line = 67)
    public static final int method228(byte arg0) {
        if (arg0 != 98) {
            return -120;
        } else if (class10.field78 == null) {
            return 0;
        } else if (class10.field78.field486 == null) {
            return class8.field65[class10.field78.field488 & 0xFF];
        } else {
            return class8.field65[class10.field78.field486[mapview.field257] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 86)
    public static final int method229(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (~var2 >= arg0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 98)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class9.field67 != null) {
            class34.field451 = arg0.getX();
            class3.field19 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)[Ll;", line = 124)
    public static final class20[] method230(int arg0) {
        if (arg0 != 0) {
            method230(-1);
        }
        class20[] var1 = new class20[class19.field187];
        for (int var2 = 0; var2 < class19.field187; var2++) {
            class20 var3 = var1[var2] = new class20();
            var3.field208 = class10.field87;
            var3.field207 = class31.field409;
            var3.field209 = class35.field480[var2];
            var3.field210 = class23.field242[var2];
            var3.field212 = class38.field505[var2];
            var3.field206 = class31.field401[var2];
            var3.field213 = class1.field6;
            var3.field211 = class32.field418[var2];
        }
        class27.method168((byte) 84);
        return var1;
    }

    @OriginalMember(owner = "mapview!v", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class9.field67 != null) {
            class34.field451 = arg0.getX();
            class3.field19 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 178)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!v", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 185)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class9.field67 != null) {
            class3.field20 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 211)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class9.field67 != null) {
            class26.field366 = arg0.getX();
            class8.field58 = arg0.getY();
            if (arg0.isMetaDown()) {
                class4.field21 = 2;
                class3.field20 = 2;
            } else {
                class4.field21 = 1;
                class3.field20 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 255)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class9.field67 != null) {
            class3.field20 = 0;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 265)
    public static final void method231(Component arg0, int arg1) {
        arg0.removeMouseListener(class9.field67);
        arg0.removeMouseMotionListener(class9.field67);
        arg0.removeFocusListener(class9.field67);
        if (arg1 != 8255) {
            method228((byte) -50);
        }
    }
}
