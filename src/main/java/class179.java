import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class179 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lrd;")
    private static class173 field3518 = class133.method843("Tue", -71);

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3523 = 5063219;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lrd;")
    private static class173 field3524 = class133.method843("Thu", -78);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[S")
    public static short[] field3526 = new short[500];

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lrd;")
    private static class173 field3530 = class133.method843("Mon", 110);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lrd;")
    private static class173 field3519 = class133.method843("Wed", -108);

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lrd;")
    private static class173 field3531 = class133.method843("Sat", -119);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lrd;")
    private static class173 field3521 = class133.method843("Sun", -96);

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lrd;")
    public static class173 field3535 = class133.method843("Einloggen", -121);

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Lrd;")
    private static class173 field3539 = class133.method843("Fri", 96);

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[Lrd;")
    public static class173[] field3536 = new class173[] { field3521, field3530, field3518, field3519, field3524, field3539, field3531 };

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public static int[] field3520 = new int[100];

    @OriginalMember(owner = "client!s", name = "x", descriptor = "[Lrd;")
    public static class173[] field3540 = new class173[100];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "La;")
    public static class1 field3522;

    @OriginalMember(owner = "client!s", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class205.field4011 != null) {
            class134.field2542 = 0;
            class202.field3911 = arg0.getX();
            class23.field511 = arg0.getY();
        }
        field3537++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field3524 = null;
        field3521 = null;
        field3519 = null;
        field3530 = null;
        field3535 = null;
        field3522 = null;
        field3539 = null;
        if (arg0 != 1) {
            field3531 = null;
        }
        field3536 = null;
        field3518 = null;
        field3531 = null;
        field3526 = null;
        field3520 = null;
        field3540 = null;
    }

    @OriginalMember(owner = "client!s", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class205.field4011 != null) {
            class134.field2542 = 0;
            class202.field3911 = -1;
            class23.field511 = -1;
        }
        field3525++;
    }

    @OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3532++;
        if (class205.field4011 != null) {
            class93.field1745 = 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3527++;
    }

    @OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3538++;
    }

    @OriginalMember(owner = "client!s", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3517++;
        if (class205.field4011 != null) {
            class134.field2542 = 0;
            class202.field3911 = arg0.getX();
            class23.field511 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!s", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3541++;
        if (class205.field4011 != null) {
            class134.field2542 = 0;
            class74.field1450 = arg0.getX();
            class40.field816 = arg0.getY();
            class46.field966 = class97.method599(5);
            if (arg0.isMetaDown()) {
                class23.field499 = 2;
                class93.field1745 = 2;
            } else {
                class23.field499 = 1;
                class93.field1745 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1205(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3534++;
        if (arg1 != -30) {
            field3518 = null;
        }
        if (class194.field3778 <= arg2 && arg5 <= class96.field1766 && arg0 >= class37.field790 && class20.field445 >= arg6) {
            if (arg3 == 1) {
                class9.method66(358345732, arg0, arg5, arg6, arg4, arg2);
            } else {
                class82.method509(arg4, arg3, (byte) -54, arg6, arg5, arg2, arg0);
            }
        } else if (arg3 == 1) {
            class78.method476(arg4, arg5, arg0, arg2, arg6, -99);
        } else {
            class184.method1245(arg4, (byte) 111, arg2, arg0, arg3, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
    public static final int method1206(int arg0, byte arg1, int arg2) {
        field3533++;
        if (arg1 >= -79) {
            return -119;
        }
        class37 var3 = (class37) class8.field150.method677(-2755, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field784.length) {
            return var3.field784[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class205.field4011 != null) {
            class134.field2542 = 0;
            class93.field1745 = 0;
        }
        field3528++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class205.field4011 != null) {
            class134.field2542 = 0;
            class202.field3911 = arg0.getX();
            class23.field511 = arg0.getY();
        }
        field3529++;
    }
}
