import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class109 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "[I")
    public static int[] field1340 = new int[5];

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "J")
    public static long field1337 = 0L;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1339 = 16777215;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lhr;")
    public static class122 field1342;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Lam;")
    public static class286 field1341;

    @OriginalMember(owner = "client!dm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1336++;
        if (class110.field1351 != null) {
            class318.field4232 = 0;
            class68.field718 = arg0.getX();
            class398.field5742 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!dm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class110.field1351 != null) {
            class318.field4232 = 0;
            class68.field718 = -1;
            class398.field5742 = -1;
        }
        field1331++;
    }

    @OriginalMember(owner = "client!dm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class110.field1351 != null) {
            class318.field4232 = 0;
            class68.field718 = arg0.getX();
            class398.field5742 = arg0.getY();
        }
        field1346++;
    }

    @OriginalMember(owner = "client!dm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class110.field1351 != null) {
            class67.field687 = 0;
        }
        field1344++;
    }

    @OriginalMember(owner = "client!dm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1334++;
        if (class110.field1351 != null) {
            class318.field4232 = 0;
            class68.field718 = arg0.getX();
            class398.field5742 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method576(byte arg0) {
        if (arg0 != -121) {
            method577(true, -18);
        }
        field1342 = null;
        field1341 = null;
        field1340 = null;
    }

    @OriginalMember(owner = "client!dm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class110.field1351 != null) {
            class318.field4232 = 0;
            class208.field2809 = arg0.getX();
            class299.field4080 = arg0.getY();
            class401.field5858 = class442.method2730(25207);
            if (arg0.isMetaDown()) {
                class234.field3221 = 2;
                class67.field687 = 2;
            } else {
                class234.field3221 = 1;
                class67.field687 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field1347++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class110.field1351 != null) {
            class318.field4232 = 0;
            class67.field687 = 0;
            int var2 = arg0.getModifiers();
        }
        field1332++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1345++;
    }

    @OriginalMember(owner = "client!dm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1343++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V")
    public static final void method577(boolean arg0, int arg1) {
        field1338++;
        class449.method2771(-32);
        if (class129.field1664 != 30 && class129.field1664 != 25 || arg1 < 57) {
            return;
        }
        class299.field4077++;
        if (class299.field4077 < 50 && !arg0) {
            return;
        }
        class299.field4077 = 0;
        if (!class368.field5151 && class264.field3605 != null) {
            class281.field3857.method295(20579, 99);
            class402.field5873++;
            try {
                class264.field3605.method1537(class281.field3857.field3406, false, class281.field3857.field3389, 0);
                class281.field3857.field3389 = 0;
            } catch (IOException var2) {
                class368.field5151 = true;
            }
        }
        class449.method2771(-32);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lfd;IBI)V")
    public static final void method578(class194 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 20) {
            method576((byte) 87);
        }
        class168.field2128 = arg3;
        class56.field562 = arg0;
        class63.field659 = arg1;
        field1335++;
    }
}
