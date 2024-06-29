import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class164 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "J")
    public static long field2671 = 0L;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2666 = "Loading fonts - ";

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2661 = "flash1:";

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Llc;")
    public static class86 field2658;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Llc;")
    public static class86 field2662;

    @OriginalMember(owner = "client!rl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class276.field4431 != null) {
            class293.field4650 = 0;
            class77.field1100 = arg0.getX();
            class290.field4601 = arg0.getY();
        }
        field2668++;
    }

    @OriginalMember(owner = "client!rl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2652++;
        if (class276.field4431 != null) {
            class293.field4650 = 0;
            class77.field1100 = -1;
            class290.field4601 = -1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2665++;
        if (class276.field4431 != null) {
            class293.field4650 = 0;
            class283.field4496 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2651++;
        if (class276.field4431 != null) {
            class293.field4650 = 0;
            class257.field4234 = arg0.getX();
            class52.field749 = arg0.getY();
            class266.field4306 = class197.method1454((byte) -104);
            if (arg0.isMetaDown()) {
                class23.field274 = 2;
                class283.field4496 = 2;
            } else {
                class23.field274 = 1;
                class283.field4496 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2660++;
        if (class276.field4431 != null) {
            class283.field4496 = 0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
    public static final void method1211(int arg0, int arg1, int arg2) {
        field2655++;
        class201 var3 = class94.method738(-74, arg1, arg0);
        var3.method1477(0);
        var3.field3226 = arg2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public static final void method1212(boolean arg0) {
        field2657++;
        if (arg0) {
            method1215(7);
        }
        for (class274 var1 = (class274) class105.field1528.method1384(2); var1 != null; var1 = (class274) class105.field1528.method1388((byte) 106)) {
            if (var1.field4396 == -1) {
                var1.field4393 = 0;
                class180.method1341(var1, (byte) -72);
            } else {
                var1.method1922(-1);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2656++;
    }

    @OriginalMember(owner = "client!rl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2659++;
        if (class276.field4431 != null) {
            class293.field4650 = 0;
            class77.field1100 = arg0.getX();
            class290.field4601 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2664++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    public static final void method1213(int arg0, int arg1) {
        if (arg1 > -89) {
            method1215(72);
        }
        class83 var2 = (class83) class67.field991.method1034((long) arg0, (byte) 21);
        field2669++;
        if (var2 != null) {
            var2.method1922(-1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z")
    public static final boolean method1214(int arg0) {
        if (arg0 != 0) {
            method1211(117, -51, -32);
        }
        field2667++;
        if (class8.field81) {
            try {
                if ((Boolean) class54.method405((byte) 70, class138.field2241.field63, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2654++;
        if (class276.field4431 != null) {
            class293.field4650 = 0;
            class77.field1100 = arg0.getX();
            class290.field4601 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static void method1215(int arg0) {
        if (arg0 > 88) {
            field2662 = null;
            field2661 = null;
            field2658 = null;
            field2666 = null;
        }
    }
}
