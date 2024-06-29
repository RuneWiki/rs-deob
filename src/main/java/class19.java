import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lu;")
    public static class38 field175 = class9.method45(-41, "details)3dat");

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "Lu;")
    public static class38 field182 = class9.method45(-41, "Staff Shop");

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "Lu;")
    public static class38 field176 = class9.method45(-41, "floorcol)3dat");

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Lu;")
    public static class38 field183 = class9.method45(-41, "sprites");

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Lu;")
    public static class38 field174 = class9.method45(-41, "Candle Shop");

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "Lu;")
    public static class38 field179 = class9.method45(-41, "Sword Shop");

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "I")
    public static volatile int field185 = 0;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lu;")
    public static class38 field177 = class9.method45(-41, "Key");

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lu;")
    public static class38 field184 = class9.method45(-41, "Axe Shop");

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "J")
    public static long field180;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Le;")
    public static class9 field178;

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "[B")
    public static byte[] field181;

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "[B")
    public static byte[] field186;

    @OriginalMember(owner = "mapview!j", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class18.field164 != null) {
            class22.field202 = arg0.getX();
            class40.field506 = arg0.getY();
            if (arg0.isMetaDown()) {
                field185 = 2;
                class26.field324 = 2;
            } else {
                field185 = 1;
                class26.field324 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 37)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class18.field164 != null) {
            class41.field521 = -1;
            class39.field496 = -1;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class18.field164 != null) {
            class41.field521 = arg0.getX();
            class39.field496 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 84)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 99)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class18.field164 != null) {
            class26.field324 = 0;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 109)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class18.field164 != null) {
            class41.field521 = arg0.getX();
            class39.field496 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)I", line = 130)
    public static final int method94(byte arg0) {
        if (arg0 <= 95) {
            method95((byte) 1);
        }
        return class5.field36 == null ? 0 : class5.field36[class14.field139];
    }

    @OriginalMember(owner = "mapview!j", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 145)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class18.field164 != null) {
            class26.field324 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 172)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 207)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class18.field164 != null) {
            class41.field521 = arg0.getX();
            class39.field496 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(B)V", line = 224)
    public static void method95(byte arg0) {
        field175 = null;
        int var1 = -101 % ((20 - arg0) / 53);
        field186 = null;
        field181 = null;
        field174 = null;
        field176 = null;
        field179 = null;
        field183 = null;
        field184 = null;
        field182 = null;
        field178 = null;
        field177 = null;
    }
}
