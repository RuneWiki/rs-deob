import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class29 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "Lt;")
    public static class36 field423 = class3.method8(13631, "Kebab Seller");

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "Lt;")
    public static class36 field421 = class3.method8(13631, "Loading");

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lt;")
    public static class36 field420 = class3.method8(13631, "map");

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "J")
    public static long field424 = 0L;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "Lt;")
    public static class36 field429 = class3.method8(13631, "Candle Shop");

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "Lt;")
    public static class36 field431 = class3.method8(13631, "Makeover Mage");

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "I")
    public static int field430 = 0;

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lt;")
    public static class36 field422 = class3.method8(13631, "sprites");

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "I")
    public static int field428 = -1;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "Lt;")
    public static class36 field425 = class3.method8(13631, "Platelegs Shop");

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Lt;")
    public static class36 field426;

    @OriginalMember(owner = "mapview!pa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class6.field63 != null) {
            class34.field475 = -1;
            class36.field494 = -1;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 23)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)V", line = 26)
    public static void method169(byte arg0) {
        field423 = null;
        field421 = null;
        field425 = null;
        if (arg0 < 99) {
            field420 = null;
        }
        field426 = null;
        field429 = null;
        field422 = null;
        field431 = null;
        field420 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class6.field63 != null) {
            class27.field403 = arg0.getX();
            class2.field8 = arg0.getY();
            if (arg0.isMetaDown()) {
                class34.field472 = 2;
                class21.field271 = 2;
            } else {
                class34.field472 = 1;
                class21.field271 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 82)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class6.field63 != null) {
            class34.field475 = arg0.getX();
            class36.field494 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 114)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 138)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class6.field63 != null) {
            class34.field475 = arg0.getX();
            class36.field494 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 162)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class6.field63 != null) {
            class21.field271 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([BI)Lm;", line = 182)
    public static final class23 method170(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            method169((byte) -78);
        }
        if (arg0 == null) {
            return null;
        } else {
            class23 var2 = new class23(arg0, class9.field91, class35.field485, class17.field211, class35.field480, class20.field257, class6.field61);
            class17.method90(-2);
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 205)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class6.field63 != null) {
            class34.field475 = arg0.getX();
            class36.field494 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 233)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class6.field63 != null) {
            class21.field271 = 0;
        }
    }
}
