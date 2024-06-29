import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class73 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
    public static boolean field1655 = false;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1656 = Calendar.getInstance();

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1668 = 0;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lae;")
    public static class6 field1671 = class64.method474(124, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lae;")
    private static class6 field1670 = class64.method474(108, "green:");

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lae;")
    public static class6 field1674 = class64.method474(108, ":chalreq:");

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static volatile int field1673 = 0;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lae;")
    public static class6 field1676 = class64.method474(109, "@gr2@");

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lae;")
    public static class6 field1678 = field1670;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lm;")
    public static class77 field1669;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[Lae;")
    public static class6[] field1679;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ)I", line = 8)
    public static final int method574(int arg0, int arg1, int arg2, boolean arg3) {
        field1667++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        if (!arg3) {
            field1679 = null;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 31)
    public final void focusGained(FocusEvent arg0) {
        field1665++;
    }

    @OriginalMember(owner = "client!le", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 43)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class136.field3309 != null) {
            class129.field3142 = 0;
            class41.field947 = -1;
            class18.field360 = -1;
        }
        field1666++;
    }

    @OriginalMember(owner = "client!le", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 64)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class136.field3309 != null) {
            class129.field3142 = 0;
            class32.field785 = 0;
        }
        field1664++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lae;Lae;ZI)V", line = 84)
    public static final void method575(class6 arg0, class6 arg1, boolean arg2, int arg3) {
        field1662++;
        if (arg3 == 0 && class117.field2776 != -1) {
            class34.field803 = arg1;
            class89.field2140 = 0;
        }
        if (arg2) {
            field1671 = null;
        }
        if (class102.field2410 == -1) {
            class20.field427 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            client.field464[var4] = client.field464[var4 - 1];
            class103.field2431[var4] = class103.field2431[var4 - 1];
            class5.field66[var4] = class5.field66[var4 - 1];
        }
        client.field464[0] = arg3;
        class103.field2431[0] = arg0;
        class5.field66[0] = arg1;
    }

    @OriginalMember(owner = "client!le", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 120)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1663++;
        if (class136.field3309 != null) {
            class129.field3142 = 0;
            field1673 = arg0.getX();
            class70.field1576 = arg0.getY();
            class5.field69 = class5.method22(100);
            if (arg0.isMetaDown()) {
                class37.field847 = 2;
                class32.field785 = 2;
            } else {
                class37.field847 = 1;
                class32.field785 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!le", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 165)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1658++;
        if (class136.field3309 != null) {
            class129.field3142 = 0;
            class41.field947 = arg0.getX();
            class18.field360 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!le", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 182)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class136.field3309 != null) {
            class129.field3142 = 0;
            class41.field947 = arg0.getX();
            class18.field360 = arg0.getY();
        }
        field1661++;
    }

    @OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 198)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1659++;
        if (class136.field3309 != null) {
            class32.field785 = 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 221)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class136.field3309 != null) {
            class129.field3142 = 0;
            class41.field947 = arg0.getX();
            class18.field360 = arg0.getY();
        }
        field1660++;
    }

    @OriginalMember(owner = "client!le", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 240)
    public final void mouseClicked(MouseEvent arg0) {
        field1657++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 251)
    public static void method576(int arg0) {
        if (arg0 != -6088) {
            method574(25, 88, -84, false);
        }
        field1678 = null;
        field1676 = null;
        field1670 = null;
        field1674 = null;
        field1669 = null;
        field1656 = null;
        field1679 = null;
        field1671 = null;
    }
}
