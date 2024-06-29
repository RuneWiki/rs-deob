import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class287 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[Lsf;")
    public static class115[] field4514 = new class115[14];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4511 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[Lrc;")
    public static class342[] field4507;

    @OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 9)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class184.field2662 != null) {
            class94.field1229 = 0;
        }
        field4510++;
    }

    @OriginalMember(owner = "client!s", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class184.field2662 != null) {
            class35.field413 = 0;
            class115.field1630 = -1;
            class9.field118 = -1;
        }
        field4516++;
    }

    @OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 41)
    public final void focusGained(FocusEvent arg0) {
        field4512++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)V", line = 48)
    public static final void method2049(int arg0, int arg1, byte arg2) {
        field4508++;
        if (arg2 > -105) {
            method2049(-122, -3, (byte) 60);
        }
        class30.field383 = class308.field4766 + class249.field3771 - arg1 - 1;
        class308.field4765 = arg0 - class239.field3595;
    }

    @OriginalMember(owner = "client!s", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 61)
    public final void mouseClicked(MouseEvent arg0) {
        field4509++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 73)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class184.field2662 != null) {
            class35.field413 = 0;
            class115.field1630 = arg0.getX();
            class9.field118 = arg0.getY();
        }
        field4518++;
    }

    @OriginalMember(owner = "client!s", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class184.field2662 != null) {
            class35.field413 = 0;
            class94.field1229 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4515++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 128)
    public static void method2050(int arg0) {
        field4514 = null;
        if (arg0 == -1) {
            field4507 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4506++;
        if (class184.field2662 != null) {
            class35.field413 = 0;
            class115.field1630 = arg0.getX();
            class9.field118 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!s", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 165)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4517++;
        if (class184.field2662 != null) {
            class35.field413 = 0;
            class269.field4247 = arg0.getX();
            class157.field2168 = arg0.getY();
            class343.field5325 = class200.method1375(-16185);
            if (arg0.isMetaDown()) {
                class196.field2811 = 2;
                class94.field1229 = 2;
            } else {
                class196.field2811 = 1;
                class94.field1229 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 216)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4513++;
        if (class184.field2662 != null) {
            class35.field413 = 0;
            class115.field1630 = arg0.getX();
            class9.field118 = arg0.getY();
        }
    }
}
