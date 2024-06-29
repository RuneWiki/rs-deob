import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class65 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1319 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Loe;")
    public static class139 field1330 = new class139(100);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ge", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1323++;
    }

    @OriginalMember(owner = "client!ge", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1321++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method388(int arg0) {
        if (arg0 == -1) {
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class66.field1340 != null) {
            class101.field2074 = 0;
            class107.field2160 = -1;
            class116.field2354 = -1;
        }
        field1329++;
    }

    @OriginalMember(owner = "client!ge", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1327++;
        if (class66.field1340 != null) {
            class101.field2074 = 0;
            class107.field2160 = arg0.getX();
            class116.field2354 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(La;IIB)V")
    public static final void method389(class1 arg0, int arg1, int arg2, byte arg3) {
        field1326++;
        if (class6.field298 != null || class72.field1524 || (arg3 < 122 || (arg0 == null || class166.method1080(false, arg0) == null))) {
            return;
        }
        class6.field298 = arg0;
        client.field687 = class166.method1080(false, arg0);
        class35.field804 = false;
        class157.field3118 = arg2;
        class197.field3842 = 0;
        class143.field2853 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILnh;Lnh;I)Lei;")
    public static final class50 method390(int arg0, int arg1, class133 arg2, class133 arg3, int arg4) {
        int var5 = -15 % ((arg0 - 10) / 52);
        field1318++;
        return class157.method1016(arg3, arg4, -53, arg1) ? class51.method308(arg2.method899((byte) 87, arg1, arg4), (byte) -114) : null;
    }

    @OriginalMember(owner = "client!ge", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1325++;
        if (class66.field1340 != null) {
            class162.field3174 = 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1320++;
        if (class66.field1340 != null) {
            class101.field2074 = 0;
            class48.field1039 = arg0.getX();
            class116.field2355 = arg0.getY();
            class188.field3566 = class168.method1118(1);
            if (arg0.isMetaDown()) {
                class162.field3182 = 2;
                class162.field3174 = 2;
            } else {
                class162.field3182 = 1;
                class162.field3174 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1328++;
        if (class66.field1340 != null) {
            class101.field2074 = 0;
            class107.field2160 = arg0.getX();
            class116.field2354 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1331++;
        if (class66.field1340 != null) {
            class101.field2074 = 0;
            class162.field3174 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class66.field1340 != null) {
            class101.field2074 = 0;
            class107.field2160 = arg0.getX();
            class116.field2354 = arg0.getY();
        }
        field1322++;
    }
}
