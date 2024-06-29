import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class339 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lfh;")
    public static class223 field5365 = new class223();

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5378 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "[I")
    public static int[] field5374;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[Lhg;")
    public static class194[] field5377;

    @OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 4)
    public final void focusGained(FocusEvent arg0) {
        field5367++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)I", line = 13)
    public static final int method2393(int arg0, byte arg1) {
        if (arg1 <= 34) {
            field5377 = (class194[]) null;
        }
        field5366++;
        if (arg0 <= 0) {
            return arg0 < 0 ? -1 : 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class317.field5164 != null) {
            class220.field3654 = 0;
            class190.field3228 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field5371++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 73)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5364++;
        if (class317.field5164 != null) {
            class220.field3654 = 0;
            class300.field4869 = -1;
            class144.field2420 = -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 89)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field5370++;
        if (class317.field5164 != null) {
            class220.field3654 = 0;
            class300.field4869 = arg0.getX();
            class144.field2420 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 108)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class317.field5164 != null) {
            class190.field3228 = 0;
        }
        field5369++;
    }

    @OriginalMember(owner = "client!ug", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 120)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5373++;
        if (class317.field5164 != null) {
            class220.field3654 = 0;
            class300.field4869 = arg0.getX();
            class144.field2420 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 136)
    public static void method2394(int arg0) {
        if (arg0 >= 8) {
            field5374 = null;
            field5377 = null;
            field5378 = null;
            field5365 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 155)
    public final void mouseClicked(MouseEvent arg0) {
        field5372++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 165)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class317.field5164 != null) {
            class220.field3654 = 0;
            class300.field4869 = arg0.getX();
            class144.field2420 = arg0.getY();
        }
        field5376++;
    }

    @OriginalMember(owner = "client!ug", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 184)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5368++;
        if (class317.field5164 != null) {
            class220.field3654 = 0;
            class197.field3302 = arg0.getX();
            class12.field376 = arg0.getY();
            class269.field4393 = class218.method1520((byte) 111);
            if (arg0.isMetaDown()) {
                class356.field5672 = 2;
                class190.field3228 = 2;
            } else {
                class356.field5672 = 1;
                class190.field3228 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
