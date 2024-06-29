import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class217 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lsg;")
    public static class201 field4008 = new class201(500);

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lqe;")
    public static class179 field4022 = class206.method1380("; Max)2Age=", (byte) 21);

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lqe;")
    private static class179 field4024 = class206.method1380("RuneScape has been updated(Q", (byte) -126);

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lqe;")
    public static class179 field4025 = field4024;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field4026 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "La;")
    public static class1 field4017;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lgh;")
    public static class73 field4010;

    @OriginalMember(owner = "client!uc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4020++;
        if (class232.field4266 != null) {
            class196.field3635 = 0;
            class190.field3532 = arg0.getX();
            class52.field1133 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!uc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4016++;
        if (class232.field4266 != null) {
            class196.field3635 = 0;
            class222.field4099 = arg0.getX();
            class167.field3009 = arg0.getY();
            class199.field3703 = class80.method504(-1);
            if (arg0.isMetaDown()) {
                class201.field3721 = 2;
                class6.field85 = 2;
            } else {
                class201.field3721 = 1;
                class6.field85 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4021++;
        if (class232.field4266 != null) {
            class196.field3635 = 0;
            class190.field3532 = -1;
            class52.field1133 = -1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4015++;
        if (class232.field4266 != null) {
            class196.field3635 = 0;
            class6.field85 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field4022 = null;
        field4008 = null;
        field4017 = null;
        if (arg0 == -28706) {
            field4025 = null;
            field4024 = null;
            field4010 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class232.field4266 != null) {
            class196.field3635 = 0;
            class190.field3532 = arg0.getX();
            class52.field1133 = arg0.getY();
        }
        field4007++;
    }

    @OriginalMember(owner = "client!uc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4018++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILqe;ILjava/awt/Color;)V")
    public static final void method1420(boolean arg0, int arg1, class179 arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class81.field1571.getGraphics();
            if (class182.field3363 == null) {
                class182.field3363 = new Font("Helvetica", 1, 13);
                class236.field4352 = class81.field1571.getFontMetrics(class182.field3363);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class102.field1962, class216.field4001);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class108.field2010 == null) {
                    class108.field2010 = class81.field1571.createImage(304, 34);
                }
                Graphics var6 = class108.field2010.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class182.field3363);
                var6.setColor(Color.white);
                arg2.method1169(22, (304 - arg2.method1129(class236.field4352, 0)) / 2, var6, false);
                if (arg3 <= 109) {
                    field4024 = null;
                }
                var5.drawImage(class108.field2010, class102.field1962 / 2 - 152, class216.field4001 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class102.field1962 / 2 - 152;
                int var8 = class216.field4001 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var5.setFont(class182.field3363);
                var5.setColor(Color.white);
                arg2.method1169(var8 + 22, var7 - -((304 - arg2.method1129(class236.field4352, 0)) / 2), var5, false);
            }
            if (class187.field3485 != null) {
                var5.setFont(class182.field3363);
                var5.setColor(Color.white);
                class187.field3485.method1169(class216.field4001 / 2 - 26, class102.field1962 / 2 + -(class187.field3485.method1129(class236.field4352, 0) / 2), var5, false);
            }
        } catch (Exception var10) {
            class81.field1571.repaint();
        }
        field4009++;
    }

    @OriginalMember(owner = "client!uc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class232.field4266 != null) {
            class196.field3635 = 0;
            class190.field3532 = arg0.getX();
            class52.field1133 = arg0.getY();
        }
        field4014++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
    public static final int method1421(int arg0, int arg1) {
        if (arg1 <= 73) {
            field4022 = null;
        }
        field4011++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!uc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4012++;
        if (class232.field4266 != null) {
            class6.field85 = 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field4019++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
