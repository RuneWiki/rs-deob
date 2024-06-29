import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class237 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lhh;")
    public static class163 field4219 = class137.method1065("Lade Konfiguration )2 ", 17);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lhh;")
    public static class163 field4221 = class137.method1065(" )2> <col=00ffff>", 17);

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Loj;")
    public static class17 field4217 = new class17(64);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!df", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class57.field940 != null) {
            class39.field646 = 0;
        }
        field4232++;
    }

    @OriginalMember(owner = "client!df", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4231++;
        if (class57.field940 != null) {
            class69.field1176 = 0;
            class163.field3001 = -1;
            class90.field1648 = -1;
        }
    }

    @OriginalMember(owner = "client!df", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4225++;
        if (class57.field940 != null) {
            class69.field1176 = 0;
            class58.field957 = arg0.getX();
            class99.field1878 = arg0.getY();
            class191.field3502 = class7.method55(0);
            if (arg0.isMetaDown()) {
                class229.field4126 = 2;
                class39.field646 = 2;
            } else {
                class229.field4126 = 1;
                class39.field646 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!df", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4229++;
        if (class57.field940 != null) {
            class69.field1176 = 0;
            class39.field646 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!df", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4226++;
    }

    @OriginalMember(owner = "client!df", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class57.field940 != null) {
            class69.field1176 = 0;
            class163.field3001 = arg0.getX();
            class90.field1648 = arg0.getY();
        }
        field4223++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method1642(int arg0) {
        field4219 = null;
        field4217 = null;
        field4221 = null;
        if (arg0 != 16) {
            field4219 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class57.field940 != null) {
            class69.field1176 = 0;
            class163.field3001 = arg0.getX();
            class90.field1648 = arg0.getY();
        }
        field4224++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lqh;I)Z")
    public static final boolean method1643(class69 arg0, int arg1) {
        if (arg1 != 0) {
            method1644(-31);
        }
        field4230++;
        if (arg0.field1217 == 205) {
            class226.field4088 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method1644(int arg0) {
        class29.field466.method120((byte) -106);
        if (arg0 == 0) {
            field4228++;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)V")
    public static final void method1645(byte arg0, int arg1) {
        class190.field3458 = 1000 / arg1;
        field4218++;
        if (arg0 != 58) {
            field4217 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4222++;
    }

    @OriginalMember(owner = "client!df", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4227++;
        if (class57.field940 != null) {
            class69.field1176 = 0;
            class163.field3001 = arg0.getX();
            class90.field1648 = arg0.getY();
        }
    }
}
