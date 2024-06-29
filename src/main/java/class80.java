import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class80 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1382;

    @OriginalMember(owner = "client!fl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1378++;
        if (class253.field4140 != null) {
            class206.field3424 = 0;
            class157.field2625 = arg0.getX();
            class37.field532 = arg0.getY();
            class114.field2053 = class232.method1544((byte) -69);
            if (arg0.isMetaDown()) {
                class165.field2704 = 2;
                class272.field4374 = 2;
            } else {
                class165.field2704 = 1;
                class272.field4374 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZILvh;)Loh;")
    public static final class248 method517(boolean arg0, int arg1, class108 arg2) {
        if (!arg0) {
            field1382 = null;
        }
        byte[] var3 = arg2.method755((byte) -74, arg1);
        field1371++;
        return var3 == null ? null : new class248(var3);
    }

    @OriginalMember(owner = "client!fl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1379++;
        if (class253.field4140 != null) {
            class206.field3424 = 0;
            class17.field207 = arg0.getX();
            class134.field2316 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1375++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Llh;")
    public static final class55 method518(byte arg0) {
        field1372++;
        int var1 = 1 / ((arg0 + 43) / 35);
        class55 var2 = (class55) class105.field1860.method1499(-16216);
        if (var2 != null) {
            var2.method547(10026);
            var2.method887((byte) -51);
            return var2;
        }
        class55 var3;
        do {
            var3 = (class55) class194.field3132.method1499(-16216);
            if (var3 == null) {
                return null;
            }
            if (var3.method342(84) > class232.method1544((byte) -127)) {
                return null;
            }
            var3.method547(10026);
            var3.method887((byte) -51);
        } while ((var3.field2267 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1369++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1368++;
        if (class253.field4140 != null) {
            class206.field3424 = 0;
            class17.field207 = -1;
            class134.field2316 = -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZIILwg;II)Lcj;")
    public static final class74 method519(int arg0, boolean arg1, int arg2, int arg3, class23 arg4, int arg5, int arg6) {
        field1376++;
        int var7 = 26 / ((44 - arg6) / 61);
        int var9 = arg0 + (arg1 ? 65536 : 0) + (arg3 << 17) + (arg2 << 19);
        long var10 = (long) arg5 * 3147483667L + ((long) var9 * 3849834839L);
        class74 var12 = (class74) class201.field3302.method57(var10, -111);
        if (var12 != null) {
            return var12;
        }
        class287.field4565 = false;
        class74 var13 = class149.method1031(arg3, false, arg0, arg4, arg1, false, arg5, arg2, (byte) -45);
        if (var13 != null && !class287.field4565) {
            class201.field3302.method62(0, var13, var10);
        }
        return var13;
    }

    @OriginalMember(owner = "client!fl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1374++;
        if (class253.field4140 != null) {
            class206.field3424 = 0;
            class272.field4374 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1380++;
        if (class253.field4140 != null) {
            class272.field4374 = 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public static void method520(byte arg0) {
        int var1 = -120 % ((-arg0 - 8) / 43);
        field1382 = null;
    }

    @OriginalMember(owner = "client!fl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1377++;
        if (class253.field4140 != null) {
            class206.field3424 = 0;
            class17.field207 = arg0.getX();
            class134.field2316 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class253.field4140 != null) {
            class206.field3424 = 0;
            class17.field207 = arg0.getX();
            class134.field2316 = arg0.getY();
        }
        field1381++;
    }
}
