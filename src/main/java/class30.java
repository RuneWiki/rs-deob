import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class30 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static volatile int field437 = 0;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Ld;")
    public static class7 field438 = class38.method251((byte) 89, "Fishing Shop");

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "mapview!p", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 11)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class24.field254 != null) {
            class35.field472 = -1;
            class17.field189 = -1;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 29)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class24.field254 != null) {
            class4.field47 = arg0.getX();
            class35.field475 = arg0.getY();
            if (arg0.isMetaDown()) {
                field437 = 2;
                class4.field38 = 2;
            } else {
                field437 = 1;
                class4.field38 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 63)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class24.field254 != null) {
            class35.field472 = arg0.getX();
            class17.field189 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 81)
    public static final void method213(int arg0) {
        if (++field435 >= 64) {
            class29.field428++;
            field435 = 0;
            if (class4.field50 >> 6 > class29.field428) {
                class21.method152((byte) 123);
            }
        }
        class2.field10 = (field435 << 6) + class36.field476;
        if (arg0 > -12) {
            field435 = 23;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 108)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 117)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)[Ld;", line = 126)
    public static final class7[] method214(boolean arg0) {
        if (arg0) {
            method214(false);
        }
        return new class7[] { class35.field466, class4.field34, class14.field159, class29.field426, class23.field251, class12.field139, class25.field272, class36.field483, class7.field70, class22.field245, class23.field247, class36.field484 };
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(Z)V", line = 136)
    public static void method215(boolean arg0) {
        if (!arg0) {
            method213(-3);
        }
        field438 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 153)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class24.field254 != null) {
            class4.field38 = 0;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 168)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class24.field254 != null) {
            class4.field38 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 188)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class24.field254 != null) {
            class35.field472 = arg0.getX();
            class17.field189 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class24.field254 != null) {
            class35.field472 = arg0.getX();
            class17.field189 = arg0.getY();
        }
    }
}
