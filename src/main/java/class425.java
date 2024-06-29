import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class425 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "Luc;")
    public static class51 field6204 = new class51(64);

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6207 = "";

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "Lir;")
    public static class185 field6206;

    @OriginalMember(owner = "client!ar", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class410.field5954 != null) {
            class298.field4499 = 0;
            class185.field2527 = arg0.getX();
            class17.field278 = arg0.getY();
            class264.field3882 = class98.method768((byte) 75);
            if (arg0.isMetaDown()) {
                class211.field2882 = 2;
                class118.field1530 = 2;
            } else {
                class211.field2882 = 1;
                class118.field1530 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field6201++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ar", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field6198++;
        if (class410.field5954 != null) {
            class298.field4499 = 0;
            class194.field2694 = arg0.getX();
            class71.field1014 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ar", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 74)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class410.field5954 != null) {
            class298.field4499 = 0;
            class194.field2694 = -1;
            class71.field1014 = -1;
        }
        field6200++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 92)
    public static final int method2666(String arg0, boolean arg1) {
        field6197++;
        if (!arg1) {
            return 82;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 119)
    public static void method2667(byte arg0) {
        field6207 = null;
        field6206 = null;
        if (arg0 > -108) {
            field6206 = null;
        }
        field6204 = null;
    }

    @OriginalMember(owner = "client!ar", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 131)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class410.field5954 != null) {
            class118.field1530 = 0;
        }
        field6195++;
    }

    @OriginalMember(owner = "client!ar", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class410.field5954 != null) {
            class298.field4499 = 0;
            class194.field2694 = arg0.getX();
            class71.field1014 = arg0.getY();
        }
        field6196++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 165)
    public static final void method2668(int arg0) {
        field6205++;
        class90.field1227.method372(123);
        if (arg0 < 71) {
            field6204 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 178)
    public final void focusGained(FocusEvent arg0) {
        field6199++;
    }

    @OriginalMember(owner = "client!ar", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 185)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field6202++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI)I", line = 196)
    public static final int method2669(int arg0, byte arg1, int arg2) {
        field6194++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            if (arg1 < 31) {
                method2669(95, (byte) 65, -128);
            }
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ar", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 238)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class410.field5954 != null) {
            class298.field4499 = 0;
            class194.field2694 = arg0.getX();
            class71.field1014 = arg0.getY();
        }
        field6203++;
    }

    @OriginalMember(owner = "client!ar", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 257)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class410.field5954 != null) {
            class298.field4499 = 0;
            class118.field1530 = 0;
            int var2 = arg0.getModifiers();
        }
        field6193++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
