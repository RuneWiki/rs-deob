import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Lh;")
    public static class15 field147 = class26.method190(true, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "I")
    public static int field149 = -1;

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Lh;")
    public static class15 field150 = class26.method190(true, "underlay)3dat");

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "Lh;")
    public static class15 field153 = class26.method190(true, "Saw Mill");

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "I")
    public static int field154 = -1;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "Lv;")
    public static class35 field151;

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field155;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "[B")
    public static byte[] field152;

    @OriginalMember(owner = "mapview!e", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 11)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class15.field251 != null) {
            class7.field137 = -1;
            class25.field342 = -1;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)B", line = 28)
    public static final byte method77(int arg0) {
        if (arg0 != 0) {
            field154 = 58;
        }
        return mapview.field54 == null ? 0 : mapview.field54[class35.field442];
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(I)V", line = 49)
    public static void method78(int arg0) {
        if (arg0 != 0) {
            field154 = 70;
        }
        field152 = null;
        field153 = null;
        field147 = null;
        field151 = null;
        field150 = null;
        field155 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class15.field251 != null) {
            class26.field357 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class15.field251 != null) {
            class2.field97 = arg0.getX();
            mapview.field29 = arg0.getY();
            if (arg0.isMetaDown()) {
                class18.field285 = 2;
                class26.field357 = 2;
            } else {
                class18.field285 = 1;
                class26.field357 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 138)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class15.field251 != null) {
            class7.field137 = arg0.getX();
            class25.field342 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I[BB)I", line = 161)
    public static final int method79(int arg0, byte[] arg1, byte arg2) {
        if (arg2 <= 49) {
            field155 = null;
        }
        return class2.method39(0, -24337880, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!e", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 175)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class15.field251 != null) {
            class7.field137 = arg0.getX();
            class25.field342 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 189)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!e", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 195)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 204)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class15.field251 != null) {
            class7.field137 = arg0.getX();
            class25.field342 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 221)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class15.field251 != null) {
            class26.field357 = 0;
        }
    }
}
