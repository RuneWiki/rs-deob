import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class17 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field372 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lw;")
    public static class82 field370 = new class82(64);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
    public static int[] field374 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lia;")
    public static class257 field378 = class28.method234(103, "");

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lia;")
    public static class257 field377 = field378;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lia;")
    public static class257 field376 = field378;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lsd;")
    public static class169 field375 = new class169();

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lja;")
    public static class89 field379 = new class89(0, 0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lmb;")
    public static class178 field373;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lba;")
    public static class211 field380;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[S")
    public static short[] field361;

    @OriginalMember(owner = "client!i", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field368++;
        if (class152.field2635 != null) {
            class54.field1161 = 0;
            class24.field470 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!i", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class152.field2635 != null) {
            class54.field1161 = 0;
            class201.field3441 = arg0.getX();
            class152.field2617 = arg0.getY();
        }
        field367++;
    }

    @OriginalMember(owner = "client!i", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class152.field2635 != null) {
            class54.field1161 = 0;
            class201.field3441 = arg0.getX();
            class152.field2617 = arg0.getY();
        }
        field360++;
    }

    @OriginalMember(owner = "client!i", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class152.field2635 != null) {
            class54.field1161 = 0;
            class228.field3829 = arg0.getX();
            class195.field3309 = arg0.getY();
            class1.field11 = class80.method600(-89);
            if (arg0.isMetaDown()) {
                class203.field3497 = 2;
                class24.field470 = 2;
            } else {
                class203.field3497 = 1;
                class24.field470 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field362++;
    }

    @OriginalMember(owner = "client!i", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field366++;
        if (class152.field2635 != null) {
            class54.field1161 = 0;
            class201.field3441 = -1;
            class152.field2617 = -1;
        }
    }

    @OriginalMember(owner = "client!i", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field363++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method167(int arg0) {
        field375 = null;
        field378 = null;
        field370 = null;
        field377 = null;
        field361 = null;
        field380 = null;
        field379 = null;
        field376 = null;
        field372 = null;
        if (arg0 != 16873) {
            method167(-18);
        }
        field373 = null;
        field374 = null;
    }

    @OriginalMember(owner = "client!i", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class152.field2635 != null) {
            class54.field1161 = 0;
            class201.field3441 = arg0.getX();
            class152.field2617 = arg0.getY();
        }
        field365++;
    }

    @OriginalMember(owner = "client!i", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field371++;
        if (class152.field2635 != null) {
            class24.field470 = 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field364++;
    }
}
