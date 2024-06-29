import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1563 = 0;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lbf;")
    public static class199 field1566 = new class199(64);

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lqk;")
    public static class207 field1575 = class24.method212(255, "Fallen lassen");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lcj;")
    public static class116 field1565;

    @OriginalMember(owner = "client!jd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1564++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIII)V")
    public static final void method633(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class124.field2158 <= arg5 && class88.field1599 >= arg3 && arg2 >= class204.field3580 && arg4 <= class204.field3602) {
            class24.method200(105, arg0, arg2, arg3, arg4, arg5);
        } else {
            class246.method1731(arg5, (byte) 121, arg2, arg3, arg0, arg4);
        }
        field1572++;
        if (arg1 != -114) {
            method635((class207) null, 47);
        }
    }

    @OriginalMember(owner = "client!jd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1577++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1562++;
        if (class149.field2610 != null) {
            class32.field646 = 0;
            class46.field919 = arg0.getX();
            class156.field2752 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class149.field2610 != null) {
            class32.field646 = 0;
            class158.field2791 = 0;
            int var2 = arg0.getModifiers();
        }
        field1576++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class149.field2610 != null) {
            class32.field646 = 0;
            class228.field4187 = arg0.getX();
            class59.field1082 = arg0.getY();
            class43.field856 = class53.method405(63);
            if (arg0.isMetaDown()) {
                class62.field1136 = 2;
                class158.field2791 = 2;
            } else {
                class62.field1136 = 1;
                class158.field2791 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1571++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIB)V")
    public static final void method634(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field1568++;
        if (arg4 != -121) {
            field1563 = 121;
        }
        if (class98.method697(arg3, 4401)) {
            class141.method980(arg2, arg0, arg1, class227.field4162[arg3], -1, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lqk;I)I")
    public static final int method635(class207 arg0, int arg1) {
        field1567++;
        if (class57.field1052 == null || arg0.method1450((byte) -126) == 0) {
            return -1;
        } else if (arg1 == -21298) {
            for (int var2 = 0; var2 < class57.field1052.field3301; var2++) {
                if (class57.field1052.field3312[var2].method1447((byte) 45, class280.field4930, class208.field3694).method1441((byte) -99, arg0)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!jd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class149.field2610 != null) {
            class32.field646 = 0;
            class46.field919 = arg0.getX();
            class156.field2752 = arg0.getY();
        }
        field1574++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class149.field2610 != null) {
            class32.field646 = 0;
            class46.field919 = -1;
            class156.field2752 = -1;
        }
        field1578++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method636(int arg0) {
        field1566 = null;
        if (arg0 < -61) {
            field1575 = null;
            field1565 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1569++;
        if (class149.field2610 != null) {
            class158.field2791 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1573++;
        if (class149.field2610 != null) {
            class32.field646 = 0;
            class46.field919 = arg0.getX();
            class156.field2752 = arg0.getY();
        }
    }
}
