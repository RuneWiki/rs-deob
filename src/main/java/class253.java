import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class253 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field4423 = 2301979;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!tk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class301.field5117 != null) {
            class293.field5020 = 0;
            class78.field1426 = arg0.getX();
            class148.field2557 = arg0.getY();
        }
        field4416++;
    }

    @OriginalMember(owner = "client!tk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 27)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class301.field5117 != null) {
            class293.field5020 = 0;
            class78.field1426 = -1;
            class148.field2557 = -1;
        }
        field4412++;
    }

    @OriginalMember(owner = "client!tk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final void mouseClicked(MouseEvent arg0) {
        field4420++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 60)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class301.field5117 != null) {
            class293.field5020 = 0;
            class90.field1655 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4419++;
    }

    @OriginalMember(owner = "client!tk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class301.field5117 != null) {
            class293.field5020 = 0;
            class78.field1426 = arg0.getX();
            class148.field2557 = arg0.getY();
        }
        field4414++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[IJI)Ljf;", line = 113)
    public static final class229 method1802(byte arg0, int[] arg1, long arg2, int arg3) {
        field4418++;
        if (class257.field4480 != null) {
            class229 var5 = class257.field4480.method448(arg3, arg1, arg2, -1229221144);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 == 5) {
            return class252.method1800(false, arg2).method1606((byte) 111);
        } else {
            if (arg0 <= 115) {
                method1802((byte) -49, (int[]) null, 87L, 38);
            }
            return class205.method1434(1, arg2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 147)
    public final void focusGained(FocusEvent arg0) {
        field4413++;
    }

    @OriginalMember(owner = "client!tk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 154)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class301.field5117 != null) {
            class90.field1655 = 0;
        }
        field4417++;
    }

    @OriginalMember(owner = "client!tk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 171)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4421++;
        if (class301.field5117 != null) {
            class293.field5020 = 0;
            class269.field4615 = arg0.getX();
            class90.field1654 = arg0.getY();
            class83.field1590 = class153.method1032(104);
            if (arg0.isMetaDown()) {
                class323.field5445 = 2;
                class90.field1655 = 2;
            } else {
                class323.field5445 = 1;
                class90.field1655 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 220)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class301.field5117 != null) {
            class293.field5020 = 0;
            class78.field1426 = arg0.getX();
            class148.field2557 = arg0.getY();
        }
        field4415++;
    }
}
