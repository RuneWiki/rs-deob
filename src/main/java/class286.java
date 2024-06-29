import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class286 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lla;")
    public static class95 field5040 = new class95(64);

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Lla;")
    public static class95 field5047 = new class95(500);

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Lcc;")
    public static class209 field5048 = class95.method669(84, "Lade Liste der Welten");

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[Lcc;")
    public static class209[] field5049 = new class209[200];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!pl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class71.field1349 != null) {
            class10.field199 = 0;
            class175.field3189 = arg0.getX();
            class5.field72 = arg0.getY();
        }
        field5041++;
    }

    @OriginalMember(owner = "client!pl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class71.field1349 != null) {
            class132.field2535 = 0;
        }
        field5044++;
    }

    @OriginalMember(owner = "client!pl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5036++;
        if (class71.field1349 != null) {
            class10.field199 = 0;
            class175.field3189 = arg0.getX();
            class5.field72 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static final void method1926(byte arg0) {
        if (arg0 == -64) {
            class238.field4308.method664(120);
            field5043++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5038++;
        if (class71.field1349 != null) {
            class10.field199 = 0;
            class141.field2604 = arg0.getX();
            class136.field2557 = arg0.getY();
            class214.field3860 = class180.method1236(101);
            if (arg0.isMetaDown()) {
                class170.field3102 = 2;
                class132.field2535 = 2;
            } else {
                class170.field3102 = 1;
                class132.field2535 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class71.field1349 != null) {
            class10.field199 = 0;
            class175.field3189 = -1;
            class5.field72 = -1;
        }
        field5045++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field5047 = null;
        if (arg0 != -1) {
            field5048 = null;
        }
        field5048 = null;
        field5040 = null;
        field5049 = null;
    }

    @OriginalMember(owner = "client!pl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5046++;
        if (class71.field1349 != null) {
            class10.field199 = 0;
            class132.field2535 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5042++;
    }

    @OriginalMember(owner = "client!pl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field5037++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class71.field1349 != null) {
            class10.field199 = 0;
            class175.field3189 = arg0.getX();
            class5.field72 = arg0.getY();
        }
        field5039++;
    }
}
