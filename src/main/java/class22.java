import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class22 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lu;")
    public static class38 field210 = class28.method177("Sandpit", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Lu;")
    public static class38 field211 = class28.method177("Jewellery", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lu;")
    public static class38 field209 = class28.method177("Prev page", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lu;")
    public static class38 field215 = class28.method177("Agility Training", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Lu;")
    public static class38 field212 = class28.method177("Archery Shop", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Lu;")
    public static class38 field218 = class28.method177("Apothecary", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lu;")
    public static class38 field214 = class28.method177("Prev page", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "mapview!ka", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class9.field87 != null) {
            class9.field91 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 26)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 29)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class9.field87 != null) {
            class9.field91 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 52)
    public static void method126(byte arg0) {
        field210 = null;
        field218 = null;
        field212 = null;
        field211 = null;
        field214 = null;
        field209 = null;
        if (arg0 != -111) {
            method127(62);
        }
        field215 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 76)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class9.field87 != null) {
            class18.field176 = arg0.getX();
            class26.field250 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 99)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class9.field87 != null) {
            class18.field176 = arg0.getX();
            class26.field250 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 125)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class9.field87 != null) {
            class18.field176 = -1;
            class26.field250 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 145)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class9.field87 != null) {
            class18.field176 = arg0.getX();
            class26.field250 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 169)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class9.field87 != null) {
            class25.field238 = arg0.getX();
            class20.field204 = arg0.getY();
            if (arg0.isMetaDown()) {
                class7.field71 = 2;
                class9.field91 = 2;
            } else {
                class7.field71 = 1;
                class9.field91 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 203)
    public static final void method127(int arg0) {
        if (arg0 != 0) {
            method127(111);
        }
        if (class29.field364 != null) {
            class11 var1 = class29.field364;
            synchronized (class29.field364) {
                class29.field364 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 233)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
