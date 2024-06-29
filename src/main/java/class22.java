import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ln;")
    public static class26 field309 = class9.method82(255, "100(U");

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Ln;")
    public static class26 field311 = class9.method82(255, "Silver Shop");

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "Ln;")
    public static class26 field310;

    @OriginalMember(owner = "mapview!l", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class15.field233 != null) {
            class5.field132 = -1;
            class28.field363 = -1;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class15.field233 != null) {
            class26.field355 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class15.field233 != null) {
            class18.field261 = arg0.getX();
            class15.field239 = arg0.getY();
            if (arg0.isMetaDown()) {
                class29.field371 = 2;
                class26.field355 = 2;
            } else {
                class29.field371 = 1;
                class26.field355 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 77)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)Ln;", line = 84)
    public static final class26 method156(int arg0, int arg1) {
        class26 var2 = new class26();
        var2.field354 = new byte[arg0];
        var2.field347 = arg1;
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 97)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class15.field233 != null) {
            class5.field132 = arg0.getX();
            class28.field363 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 122)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Z)V", line = 132)
    public static void method157(boolean arg0) {
        if (!arg0) {
            method156(92, 50);
        }
        field310 = null;
        field311 = null;
        field309 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 149)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class15.field233 != null) {
            class26.field355 = 0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 161)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class15.field233 != null) {
            class5.field132 = arg0.getX();
            class28.field363 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 175)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class15.field233 != null) {
            class5.field132 = arg0.getX();
            class28.field363 = arg0.getY();
        }
    }
}
