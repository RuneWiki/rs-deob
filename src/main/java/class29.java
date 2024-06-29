import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class29 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Lna;")
    public static class26 field388 = class30.method205((byte) 51, "Fur Trader");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lna;")
    public static class26 field391 = class30.method205((byte) 32, "Spinning Wheel");

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lna;")
    private static class26 field389 = class30.method205((byte) 26, "Loading");

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Z")
    public static boolean field390 = false;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Lna;")
    public static class26 field392 = class30.method205((byte) 120, "(U");

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Lta;")
    public static class37 field393;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Ljava/lang/String;")
    public static String field386;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "[I")
    public static int[] field385;

    @OriginalMember(owner = "mapview!p", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 10)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class25.field342 != null) {
            class31.field414 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 30)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class25.field342 != null) {
            class30.field402 = arg0.getX();
            class30.field399 = arg0.getY();
            if (arg0.isMetaDown()) {
                class36.field465 = 2;
                class31.field414 = 2;
            } else {
                class36.field465 = 1;
                class31.field414 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 69)
    public static void method195(byte arg0) {
        field393 = null;
        field388 = null;
        field392 = null;
        field391 = null;
        if (arg0 > 121) {
            field389 = null;
            field385 = null;
            field386 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 85)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class25.field342 != null) {
            class31.field415 = arg0.getX();
            class32.field424 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 110)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class25.field342 != null) {
            class31.field415 = arg0.getX();
            class32.field424 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)[Lna;", line = 133)
    public static final class26[] method196(boolean arg0) {
        if (!arg0) {
            method196(false);
        }
        return new class26[] { class37.field478, class13.field201, class36.field466, class9.field177, class20.field280, mapview.field84, class20.field273, class33.field442, class39.field491, class34.field450, class18.field229, class32.field426, class3.field123, field389 };
    }

    @OriginalMember(owner = "mapview!p", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 147)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class25.field342 != null) {
            class31.field415 = arg0.getX();
            class32.field424 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class25.field342 != null) {
            class31.field415 = -1;
            class32.field424 = -1;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 186)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class25.field342 != null) {
            class31.field414 = 0;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 218)
    public final void focusGained(FocusEvent arg0) {
    }
}
