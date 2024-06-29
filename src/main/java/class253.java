import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class253 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4224 = 0;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lri;")
    public static class301 field4234;

    @OriginalMember(owner = "client!tm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 12)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4228++;
        if (class326.field5571 != null) {
            class119.field1998 = 0;
            class70.field1133 = arg0.getX();
            class58.field818 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!tm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4231++;
    }

    @OriginalMember(owner = "client!tm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 50)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4235++;
        if (class326.field5571 != null) {
            class170.field2804 = 0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 62)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4230++;
        if (class326.field5571 != null) {
            class119.field1998 = 0;
            class78.field1296 = arg0.getX();
            class82.field1331 = arg0.getY();
            class259.field4316 = class130.method935(false);
            if (arg0.isMetaDown()) {
                class148.field2397 = 2;
                class170.field2804 = 2;
            } else {
                class148.field2397 = 1;
                class170.field2804 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 115)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4226++;
        if (class326.field5571 != null) {
            class119.field1998 = 0;
            class70.field1133 = -1;
            class58.field818 = -1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 133)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class326.field5571 != null) {
            class119.field1998 = 0;
            class70.field1133 = arg0.getX();
            class58.field818 = arg0.getY();
        }
        field4232++;
    }

    @OriginalMember(owner = "client!tm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 152)
    public final void focusGained(FocusEvent arg0) {
        field4237++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 160)
    public static void method1771(int arg0) {
        if (arg0 <= -100) {
            field4234 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 175)
    public static final void method1772(int arg0, int arg1, int arg2) {
        field4236++;
        if (class69.method542(arg2, ~arg1)) {
            class328.method2249(arg0, class37.field604[arg2], arg1 + 1);
            if (arg1 != 0) {
                method1771(-128);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 191)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class326.field5571 != null) {
            class119.field1998 = 0;
            class70.field1133 = arg0.getX();
            class58.field818 = arg0.getY();
        }
        field4227++;
    }

    @OriginalMember(owner = "client!tm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 209)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4225++;
        if (class326.field5571 != null) {
            class119.field1998 = 0;
            class170.field2804 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
