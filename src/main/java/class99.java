import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class99 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lgg;")
    public static class63 field2335 = class116.method911(43, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lgg;")
    public static class63 field2340 = class116.method911(43, "Die Verbindung konnte");

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[J")
    public static long[] field2343 = new long[32];

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!l", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2337++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2332++;
    }

    @OriginalMember(owner = "client!l", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class192.field3900 != null) {
            class112.field2519 = 0;
            class202.field3995 = arg0.getX();
            class75.field1852 = arg0.getY();
            class63.field1629 = class198.method1295((byte) 56);
            if (arg0.isMetaDown()) {
                class84.field1990 = 2;
                class12.field278 = 2;
            } else {
                class84.field1990 = 1;
                class12.field278 = 1;
            }
        }
        field2342++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!l", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class192.field3900 != null) {
            class112.field2519 = 0;
            class13.field314 = -1;
            class154.field3215 = -1;
        }
        field2336++;
    }

    @OriginalMember(owner = "client!l", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class192.field3900 != null) {
            class112.field2519 = 0;
            class13.field314 = arg0.getX();
            class154.field3215 = arg0.getY();
        }
        field2333++;
    }

    @OriginalMember(owner = "client!l", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2334++;
        if (class192.field3900 != null) {
            class112.field2519 = 0;
            class13.field314 = arg0.getX();
            class154.field3215 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!l", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2339++;
        if (class192.field3900 != null) {
            class112.field2519 = 0;
            class12.field278 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!l", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2341++;
        if (class192.field3900 != null) {
            class112.field2519 = 0;
            class13.field314 = arg0.getX();
            class154.field3215 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class192.field3900 != null) {
            class12.field278 = 0;
        }
        field2344++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method837(int arg0) {
        field2343 = null;
        field2340 = null;
        if (arg0 != 2) {
            field2343 = null;
        }
        field2335 = null;
    }
}
