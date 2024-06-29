import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Ls;")
    public static class34 field137 = class9.method35("Skirt Shop", 220);

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Ls;")
    public static class34 field141 = class9.method35("Altar", 220);

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "Ls;")
    public static class34 field144 = class9.method35("Loading", 220);

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "Ls;")
    public static class34 field145 = class9.method35("Sandpit", 220);

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "Ls;")
    public static class34 field143 = class9.method35("world", 220);

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lia;")
    public static class18 field139;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Z")
    public static boolean field140;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "[B")
    public static byte[] field138;

    @OriginalMember(owner = "mapview!ha", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class31.field414 != null) {
            class12.field115 = arg0.getX();
            class6.field43 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class31.field414 != null) {
            class37.field506 = arg0.getX();
            class28.field381 = arg0.getY();
            if (arg0.isMetaDown()) {
                class19.field174 = 2;
                class9.field85 = 2;
            } else {
                class19.field174 = 1;
                class9.field85 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)[Ls;", line = 91)
    public static final class34[] method70(int arg0) {
        if (arg0 != 0) {
            field137 = null;
        }
        return new class34[] { class18.field159, mapview.field355, class27.field378, class6.field44, class6.field41, class25.field264, class19.field167, class1.field5, class9.field88, class25.field266, class6.field40, class37.field508, class3.field28, class36.field498 };
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 110)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class31.field414 != null) {
            class12.field115 = arg0.getX();
            class6.field43 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 128)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 133)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class31.field414 != null) {
            class12.field115 = -1;
            class6.field43 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class31.field414 != null) {
            class12.field115 = arg0.getX();
            class6.field43 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 181)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class31.field414 != null) {
            class9.field85 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 194)
    public static void method71(byte arg0) {
        field143 = null;
        field145 = null;
        field138 = null;
        if (arg0 > -7) {
            method70(20);
        }
        field137 = null;
        field144 = null;
        field141 = null;
        field139 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[Ls;)Ls;", line = 213)
    public static final class34 method72(int arg0, class34[] arg1) {
        int var2 = 44 / ((81 - arg0) / 37);
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class25.method136(0, arg1.length, arg1, (byte) -108);
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 241)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class31.field414 != null) {
            class9.field85 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
