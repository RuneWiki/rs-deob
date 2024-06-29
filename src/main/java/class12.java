import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field385 = -1;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Z")
    public static boolean field380 = false;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lud;")
    private static class279 field387 = class130.method1024("Members object", 255);

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lud;")
    public static class279 field390 = field387;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field386 = -1;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lud;")
    public static class279 field382 = class130.method1024(")4j", 255);

    @OriginalMember(owner = "client!se", name = "u", descriptor = "F")
    public static float field399;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!se", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final void mouseClicked(MouseEvent arg0) {
        field398++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!se", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 36)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field381++;
        if (class166.field2993 != null) {
            class7.field142 = 0;
            class262.field4689 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!se", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 78)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class166.field2993 != null) {
            class7.field142 = 0;
            class52.field1090 = arg0.getX();
            class293.field5228 = arg0.getY();
        }
        field395++;
    }

    @OriginalMember(owner = "client!se", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 95)
    public final void focusGained(FocusEvent arg0) {
        field397++;
    }

    @OriginalMember(owner = "client!se", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 124)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field389++;
        if (class166.field2993 != null) {
            class7.field142 = 0;
            class52.field1090 = arg0.getX();
            class293.field5228 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!se", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class166.field2993 != null) {
            class7.field142 = 0;
            class52.field1090 = arg0.getX();
            class293.field5228 = arg0.getY();
        }
        field388++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 161)
    public static void method88(int arg0) {
        field387 = null;
        field390 = null;
        if (arg0 >= -104) {
            field380 = false;
        }
        field382 = null;
    }

    @OriginalMember(owner = "client!se", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 173)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class166.field2993 != null) {
            class262.field4689 = 0;
        }
        field384++;
    }

    @OriginalMember(owner = "client!se", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 184)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field391++;
        if (class166.field2993 != null) {
            class7.field142 = 0;
            class52.field1090 = -1;
            class293.field5228 = -1;
        }
    }

    @OriginalMember(owner = "client!se", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 203)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class166.field2993 != null) {
            class7.field142 = 0;
            class276.field4894 = arg0.getX();
            class176.field3155 = arg0.getY();
            class285.field5089 = class127.method1015(21504);
            if (arg0.isMetaDown()) {
                class8.field189 = 2;
                class262.field4689 = 2;
            } else {
                class8.field189 = 1;
                class262.field4689 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field392++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
