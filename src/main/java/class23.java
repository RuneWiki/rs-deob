import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class23 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!lh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 10)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field251++;
        if (class252.field3767 != null) {
            class318.field4959 = 0;
            class255.field3815 = arg0.getX();
            class206.field3259 = arg0.getY();
            class149.field2250 = class234.method1650((byte) -118);
            if (arg0.isMetaDown()) {
                class111.field1752 = 2;
                class262.field3882 = 2;
            } else {
                class111.field1752 = 1;
                class262.field3882 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 57)
    public final synchronized void focusLost(FocusEvent arg0) {
        field248++;
        if (class252.field3767 != null) {
            class262.field3882 = 0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 67)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class252.field3767 != null) {
            class318.field4959 = 0;
            class47.field722 = arg0.getX();
            class113.field1776 = arg0.getY();
        }
        field246++;
    }

    @OriginalMember(owner = "client!lh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 90)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field253++;
        if (class252.field3767 != null) {
            class318.field4959 = 0;
            class47.field722 = -1;
            class113.field1776 = -1;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZZI)V", line = 106)
    public static final void method152(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class252.method1748(arg4, arg1, class246.field3709.length - 1, 0, arg2, arg3, (byte) 62);
        field252++;
        if (arg0 >= -63) {
            method152(-57, 12, false, true, 110);
        }
    }

    @OriginalMember(owner = "client!lh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 117)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class252.field3767 != null) {
            class318.field4959 = 0;
            class47.field722 = arg0.getX();
            class113.field1776 = arg0.getY();
        }
        field244++;
    }

    @OriginalMember(owner = "client!lh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 136)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field247++;
        if (class252.field3767 != null) {
            class318.field4959 = 0;
            class262.field3882 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 170)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class252.field3767 != null) {
            class318.field4959 = 0;
            class47.field722 = arg0.getX();
            class113.field1776 = arg0.getY();
        }
        field245++;
    }

    @OriginalMember(owner = "client!lh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 187)
    public final void focusGained(FocusEvent arg0) {
        field250++;
    }

    @OriginalMember(owner = "client!lh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 196)
    public final void mouseClicked(MouseEvent arg0) {
        field249++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
