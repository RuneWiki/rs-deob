import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class205 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lp;")
    public static class280 field3557 = class18.method140((byte) -124, "showVideoAd");

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3563 = 0;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lp;")
    private static class280 field3562 = class18.method140((byte) -118, "Loaded title screen");

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lp;")
    public static class280 field3564 = class18.method140((byte) -118, "ondulation:");

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lp;")
    public static class280 field3568 = class18.method140((byte) -117, "::fpsoff");

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lp;")
    public static class280 field3560 = field3562;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3554 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lde;")
    public static class108 field3561;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lua;III)V")
    public static final void method1394(class113 arg0, int arg1, int arg2, int arg3) {
        if (~arg0.field1937 == arg3) {
            arg0.field1897 = arg0.field1881;
        } else if (arg0.field1937 == 1) {
            arg0.field1897 = (arg1 - arg0.field1995) / 2 + arg0.field1881;
        } else if (arg0.field1937 == 2) {
            arg0.field1897 = arg1 - arg0.field1881 - arg0.field1995;
        } else if (arg0.field1937 == 3) {
            arg0.field1897 = arg0.field1881 * arg1 >> 14;
        } else if (arg0.field1937 == 4) {
            arg0.field1897 = (arg0.field1881 * arg1 >> 14) + (arg1 - arg0.field1995) / 2;
        } else {
            arg0.field1897 = arg1 - arg0.field1995 - (arg0.field1881 * arg1 >> 14);
        }
        if (arg0.field2000 == 0) {
            arg0.field1900 = arg0.field2022;
        } else if (arg0.field2000 == 1) {
            arg0.field1900 = (arg2 - arg0.field1869) / 2 + arg0.field2022;
        } else if (arg0.field2000 == 2) {
            arg0.field1900 = arg2 - arg0.field2022 - arg0.field1869;
        } else if (arg0.field2000 == 3) {
            arg0.field1900 = arg0.field2022 * arg2 >> 14;
        } else if (arg0.field2000 == 4) {
            arg0.field1900 = (arg0.field2022 * arg2 >> 14) + (arg2 - arg0.field1869) / 2;
        } else {
            arg0.field1900 = arg2 - (arg0.field2022 * arg2 >> 14) - arg0.field1869;
        }
        if (class250.field4377 && (client.method1099(arg0) != 0 || arg0.field1879 == 0)) {
            if (arg0.field1897 < 0) {
                arg0.field1897 = 0;
            } else if ((arg0.field1897 + arg0.field1995) > arg1) {
                arg0.field1897 = arg1 - arg0.field1995;
            }
            if (arg0.field1900 < 0) {
                arg0.field1900 = 0;
            } else if (arg2 < (arg0.field1900 + arg0.field1869)) {
                arg0.field1900 = arg2 - arg0.field1869;
            }
        }
        field3556++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        field3561 = null;
        field3568 = null;
        field3557 = null;
        field3560 = null;
        field3564 = null;
        if (arg0 < 107) {
            method1394((class113) null, 57, 74, 111);
        }
        field3562 = null;
    }

    @OriginalMember(owner = "client!nb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3571++;
    }

    @OriginalMember(owner = "client!nb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3558++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class45.field750 != null) {
            class134.field2377 = 0;
            class282.field4961 = arg0.getX();
            class12.field242 = arg0.getY();
        }
        field3566++;
    }

    @OriginalMember(owner = "client!nb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class45.field750 != null) {
            class134.field2377 = 0;
            class167.field2930 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3555++;
    }

    @OriginalMember(owner = "client!nb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class45.field750 != null) {
            class134.field2377 = 0;
            class245.field4310 = arg0.getX();
            class53.field874 = arg0.getY();
            class206.field3573 = class77.method569((byte) 13);
            if (arg0.isMetaDown()) {
                class13.field261 = 2;
                class167.field2930 = 2;
            } else {
                class13.field261 = 1;
                class167.field2930 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3565++;
    }

    @OriginalMember(owner = "client!nb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3553++;
        if (class45.field750 != null) {
            class134.field2377 = 0;
            class282.field4961 = arg0.getX();
            class12.field242 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!nb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3569++;
        if (class45.field750 != null) {
            class134.field2377 = 0;
            class282.field4961 = -1;
            class12.field242 = -1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public static final int method1396(int arg0) {
        field3570++;
        if (arg0 != 0) {
            field3557 = null;
        }
        return class193.field3413.method1489((byte) -110);
    }

    @OriginalMember(owner = "client!nb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3559++;
        if (class45.field750 != null) {
            class167.field2930 = 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class45.field750 != null) {
            class134.field2377 = 0;
            class282.field4961 = arg0.getX();
            class12.field242 = arg0.getY();
        }
        field3567++;
    }
}
