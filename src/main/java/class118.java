import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class118 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lgd;")
    public static class40 field2790 = class14.method90(false, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lgd;")
    public static class40 field2792 = class14.method90(false, "T");

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lgd;")
    public static class40 field2787 = class14.method90(false, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lgd;")
    public static class40 field2798 = class14.method90(false, "cross");

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Loc;")
    public static class86 field2802;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 13)
    public static final void method903(int arg0) {
        field2800++;
        class98.field2323 = new class89();
        if (arg0 != 2) {
            field2792 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 24)
    public static void method904(byte arg0) {
        field2798 = null;
        field2787 = null;
        field2792 = null;
        field2802 = null;
        field2790 = null;
        if (arg0 > -49) {
            field2792 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class65.field1590 != null) {
            class112.field2704 = 0;
            class53.field1357 = arg0.getX();
            class12.field316 = arg0.getY();
        }
        field2795++;
    }

    @OriginalMember(owner = "client!td", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 59)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2796++;
        if (class65.field1590 != null) {
            class112.field2704 = 0;
            class53.field1357 = arg0.getX();
            class12.field316 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 93)
    public static final void method905(byte arg0) {
        field2799++;
        for (class101 var1 = (class101) class136.field3314.method593(0); var1 != null; var1 = (class101) class136.field3314.method582(false)) {
            if (var1.field2387 != null) {
                var1.method710((byte) 114);
            }
        }
        int var2 = -21 / ((arg0 - 50) / 59);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 117)
    public static final void method906(Component arg0, byte arg1) {
        field2805++;
        arg0.removeMouseListener(class65.field1590);
        arg0.removeMouseMotionListener(class65.field1590);
        int var2 = -117 / ((-arg1 - 21) / 39);
        arg0.removeFocusListener(class65.field1590);
    }

    @OriginalMember(owner = "client!td", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 134)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class65.field1590 != null) {
            class112.field2704 = 0;
            class13.field324 = arg0.getX();
            class41.field1023 = arg0.getY();
            class22.field509 = class98.method683(0);
            if (arg0.isMetaDown()) {
                class55.field1428 = 2;
                class126.field3012 = 2;
            } else {
                class55.field1428 = 1;
                class126.field3012 = 1;
            }
        }
        field2793++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 165)
    public final void focusGained(FocusEvent arg0) {
        field2801++;
    }

    @OriginalMember(owner = "client!td", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 179)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class65.field1590 != null) {
            class112.field2704 = 0;
            class53.field1357 = arg0.getX();
            class12.field316 = arg0.getY();
        }
        field2789++;
    }

    @OriginalMember(owner = "client!td", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 200)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class65.field1590 != null) {
            class112.field2704 = 0;
            class53.field1357 = -1;
            class12.field316 = -1;
        }
        field2803++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V", line = 217)
    public static final void method907(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 126) {
            return;
        }
        if (class114.field2746 != 0 && arg1 != 0 && class132.field3210 < 50) {
            class87.field1954[class132.field3210] = arg0;
            class52.field1329[class132.field3210] = arg1;
            class10.field258[class132.field3210] = arg2;
            class65.field1576[class132.field3210] = null;
            class131.field3177[class132.field3210] = 0;
            class132.field3210++;
        }
        field2794++;
    }

    @OriginalMember(owner = "client!td", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 242)
    public final void mouseClicked(MouseEvent arg0) {
        field2797++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 257)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class65.field1590 != null) {
            class112.field2704 = 0;
            class126.field3012 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2804++;
    }

    @OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 276)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2806++;
        if (class65.field1590 != null) {
            class126.field3012 = 0;
        }
    }
}
