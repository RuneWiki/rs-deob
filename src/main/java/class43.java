import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class43 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[J")
    public static long[] field521 = new long[32];

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lid;")
    public static class255 field520 = new class255();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method283(int arg0) {
        field530++;
        if (class54.field682 == 0) {
            if (arg0 != 2) {
                method284((byte) 74, -24);
            }
            return class54.field673.method2007(-82);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 20)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class186.field2779 != null) {
            class230.field3475 = 0;
            class329.field4938 = -1;
            class76.field992 = -1;
        }
        field522++;
    }

    @OriginalMember(owner = "client!ri", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 36)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field519++;
        if (class186.field2779 != null) {
            class230.field3475 = 0;
            class329.field4938 = arg0.getX();
            class76.field992 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ri", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field517++;
        if (class186.field2779 != null) {
            class230.field3475 = 0;
            class132.field2035 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V", line = 96)
    public static final void method284(byte arg0, int arg1) {
        field525++;
        if (arg0 != -73) {
            method284((byte) -113, -68);
        }
        class192.field2875.method2174(-12634, arg1);
    }

    @OriginalMember(owner = "client!ri", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 114)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class186.field2779 != null) {
            class230.field3475 = 0;
            class329.field4938 = arg0.getX();
            class76.field992 = arg0.getY();
        }
        field532++;
    }

    @OriginalMember(owner = "client!ri", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 136)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class186.field2779 != null) {
            class230.field3475 = 0;
            class300.field4593 = arg0.getX();
            class197.field2957 = arg0.getY();
            class189.field2821 = class231.method1594(-20375);
            if (arg0.isMetaDown()) {
                class177.field2617 = 2;
                class132.field2035 = 2;
            } else {
                class177.field2617 = 1;
                class132.field2035 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field529++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ri", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 184)
    public final void focusGained(FocusEvent arg0) {
        field531++;
    }

    @OriginalMember(owner = "client!ri", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 191)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field524++;
        if (class186.field2779 != null) {
            class230.field3475 = 0;
            class329.field4938 = arg0.getX();
            class76.field992 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ri", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field523++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 223)
    public static void method285(int arg0) {
        field520 = null;
        field521 = null;
        if (arg0 != 2) {
            field527 = 6;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lf;I)Lf;", line = 235)
    public static final class329 method286(class329 arg0, int arg1) {
        field526++;
        if (arg1 != -24046) {
            field521 = (long[]) null;
        }
        class329 var2 = client.method898(arg0);
        if (var2 == null) {
            var2 = arg0.field5027;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ri", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 262)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class186.field2779 != null) {
            class132.field2035 = 0;
        }
        field518++;
    }
}
