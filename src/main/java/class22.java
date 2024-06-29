import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Ld;")
    public static class7 field216 = class37.method242("null", 1333943984);

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Ld;")
    public static class7 field217 = class37.method242("Next page", 1333943984);

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "mapview!l", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 7)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class36.field494 != null) {
            class25.field245 = arg0.getX();
            class21.field211 = arg0.getY();
            if (arg0.isMetaDown()) {
                class20.field193 = 2;
                class31.field454 = 2;
            } else {
                class20.field193 = 1;
                class31.field454 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)[Ld;", line = 54)
    public static final class7[] method149(byte arg0) {
        int var1 = -18 / ((arg0 + 58) / 47);
        return new class7[] { class11.field116, class2.field17, class35.field487, class30.field449, class25.field241, class21.field209, class25.field246, class3.field24, class29.field438, class1.field1, class14.field145, class21.field202 };
    }

    @OriginalMember(owner = "mapview!l", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 63)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class36.field494 != null) {
            class20.field195 = arg0.getX();
            class16.field172 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 81)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class36.field494 != null) {
            class20.field195 = arg0.getX();
            class16.field172 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class36.field494 != null) {
            class20.field195 = -1;
            class16.field172 = -1;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 119)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class36.field494 != null) {
            class20.field195 = arg0.getX();
            class16.field172 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 140)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 145)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class36.field494 != null) {
            class31.field454 = 0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(B)V", line = 178)
    public static void method150(byte arg0) {
        if (arg0 > -65) {
            field214 = -78;
        }
        field217 = null;
        field216 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 193)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class36.field494 != null) {
            class31.field454 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
