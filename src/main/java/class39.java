import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class39 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Z")
    public static boolean field512 = false;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lna;")
    public static class26 field513 = class33.method219("Platelegs Shop", 121);

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Lna;")
    public static class26 field514 = class33.method219("Hair Dressers", 94);

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Lna;")
    public static class26 field518 = class33.method219("Requesting", 112);

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Lna;")
    public static class26 field517 = class33.method219("Brewery", 98);

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Lo;")
    public static class27 field516;

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "[I")
    public static int[] field520;

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "[I")
    public static int[] field521;

    @OriginalMember(owner = "mapview!u", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!u", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 9)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class6.field64 != null) {
            class8.field82 = 0;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class6.field64 != null) {
            class38.field502 = arg0.getX();
            class5.field62 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 40)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class6.field64 != null) {
            class38.field502 = -1;
            class5.field62 = -1;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 79)
    public static void method245(int arg0) {
        field521 = null;
        if (arg0 != -1) {
            field520 = null;
        }
        field520 = null;
        field514 = null;
        field517 = null;
        field516 = null;
        field518 = null;
        field513 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 95)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class6.field64 != null) {
            class8.field82 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 114)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class6.field64 != null) {
            class38.field502 = arg0.getX();
            class5.field62 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 149)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class6.field64 != null) {
            class18.field169 = arg0.getX();
            class12.field126 = arg0.getY();
            if (arg0.isMetaDown()) {
                class21.field227 = 2;
                class8.field82 = 2;
            } else {
                class21.field227 = 1;
                class8.field82 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 213)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class6.field64 != null) {
            class38.field502 = arg0.getX();
            class5.field62 = arg0.getY();
        }
    }
}
