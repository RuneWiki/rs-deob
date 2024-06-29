import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class40 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field496 = -1;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field502 = 1;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!hl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field497++;
        if (class190.field2937 != null) {
            class312.field5035 = 0;
            class202.field3245 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field504++;
        if (class190.field2937 != null) {
            class312.field5035 = 0;
            class55.field737 = -1;
            class189.field2904 = -1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field498++;
    }

    @OriginalMember(owner = "client!hl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field505++;
        if (class190.field2937 != null) {
            class312.field5035 = 0;
            class55.field737 = arg0.getX();
            class189.field2904 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class190.field2937 != null) {
            class312.field5035 = 0;
            class55.field737 = arg0.getX();
            class189.field2904 = arg0.getY();
        }
        field500++;
    }

    @OriginalMember(owner = "client!hl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field494++;
    }

    @OriginalMember(owner = "client!hl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field506++;
        if (class190.field2937 != null) {
            class312.field5035 = 0;
            class134.field2109 = arg0.getX();
            class287.field4782 = arg0.getY();
            class314.field5070 = class267.method1841((byte) 126);
            if (arg0.isMetaDown()) {
                class42.field572 = 2;
                class202.field3245 = 2;
            } else {
                class42.field572 = 1;
                class202.field3245 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field507++;
        if (class190.field2937 != null) {
            class202.field3245 = 0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field501++;
        if (class190.field2937 != null) {
            class312.field5035 = 0;
            class55.field737 = arg0.getX();
            class189.field2904 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IC)Z")
    public static final boolean method261(int arg0, char arg1) {
        field499++;
        if (arg0 != -1) {
            field502 = 4;
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
