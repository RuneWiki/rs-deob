import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class31 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "Lv;")
    public static class40 field432 = class24.method170("Dairy Churn", (byte) -124);

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "Lv;")
    public static class40 field433 = class24.method170("Next page", (byte) -121);

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "Lv;")
    public static class40 field434 = class24.method170("details)3dat", (byte) 18);

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "Lv;")
    public static class40 field436 = class24.method170("(U", (byte) -78);

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Z")
    public static volatile boolean field435 = false;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I)V", line = 5)
    public static void method199(int arg0) {
        if (arg0 != 1) {
            field436 = null;
        }
        field433 = null;
        field436 = null;
        field434 = null;
        field432 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 26)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class23.field261 != null) {
            class37.field485 = -1;
            class8.field100 = -1;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 46)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 55)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class23.field261 != null) {
            class37.field485 = arg0.getX();
            class8.field100 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(Lv;Lv;BLo;)[Lu;", line = 82)
    public static final class38[] method200(class40 arg0, class40 arg1, byte arg2, class26 arg3) {
        int var4 = arg3.method184(arg1, -20310);
        int var5 = -121 / ((-arg2 - 47) / 44);
        int var6 = arg3.method185(var4, (byte) 98, arg0);
        return mapview.method163(27, var4, arg3, var6);
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 113)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class23.field261 != null) {
            class8.field102 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 141)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class23.field261 != null) {
            class6.field85 = arg0.getX();
            class8.field101 = arg0.getY();
            if (arg0.isMetaDown()) {
                class14.field140 = 2;
                class8.field102 = 2;
            } else {
                class14.field140 = 1;
                class8.field102 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 174)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 186)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class23.field261 != null) {
            class37.field485 = arg0.getX();
            class8.field100 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 204)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class23.field261 != null) {
            class37.field485 = arg0.getX();
            class8.field100 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 220)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class23.field261 != null) {
            class8.field102 = 0;
        }
    }
}
