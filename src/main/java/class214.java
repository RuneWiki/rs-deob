import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class214 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "J")
    public static long field3612;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Laj;")
    public static class151 field3600;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method1517(int arg0) {
        field3600 = null;
        if (arg0 != -1) {
            field3612 = 82L;
        }
    }

    @OriginalMember(owner = "client!hk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3608++;
        if (class109.field1791 != null) {
            class35.field554 = 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class109.field1791 != null) {
            class76.field1299 = 0;
            class199.field3215 = arg0.getX();
            class248.field4151 = arg0.getY();
        }
        field3605++;
    }

    @OriginalMember(owner = "client!hk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class109.field1791 != null) {
            class76.field1299 = 0;
            class35.field554 = 0;
            int var2 = arg0.getModifiers();
        }
        field3609++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3602++;
    }

    @OriginalMember(owner = "client!hk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3611++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method1518(byte arg0) {
        field3601++;
        if (class275.field4605) {
            return;
        }
        if (class46.field814) {
            class187.field2993 = (float) ((int) class187.field2993 - 17 & 0xFFFFFFF0);
        } else {
            class43.field658 += (-class43.field658 - 12.0F) / 2.0F;
        }
        class271.field4520 = true;
        if (arg0 == 125) {
            class275.field4605 = true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class109.field1791 != null) {
            class76.field1299 = 0;
            class199.field3215 = arg0.getX();
            class248.field4151 = arg0.getY();
        }
        field3610++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static final void method1519(byte arg0) {
        field3607++;
        int var1 = 4 / ((-arg0 - 77) / 40);
        if (class42.field635) {
            class42.field635 = false;
            class55.field974 = null;
            class110.field1827 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3606++;
        if (class109.field1791 != null) {
            class76.field1299 = 0;
            class199.field3215 = arg0.getX();
            class248.field4151 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3603++;
        if (class109.field1791 != null) {
            class76.field1299 = 0;
            class199.field3215 = -1;
            class248.field4151 = -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class109.field1791 != null) {
            class76.field1299 = 0;
            class187.field2996 = arg0.getX();
            class149.field2472 = arg0.getY();
            class46.field816 = class188.method1355(112);
            if (arg0.isMetaDown()) {
                client.field1617 = 2;
                class35.field554 = 2;
            } else {
                client.field1617 = 1;
                class35.field554 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3604++;
    }
}
