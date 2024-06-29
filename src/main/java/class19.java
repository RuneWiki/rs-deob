import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class19 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field353 = 127;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Ltg;")
    public static class184 field364 = class135.method812("Lade Titelbild )2 ", 3);

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Ltg;")
    public static class184 field363 = class135.method812(" )2> <col=ffffff>", 3);

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field368 = 4;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Ltg;")
    public static class184 field361 = class135.method812("hint_mapmarkers", 3);

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "[I")
    public static int[] field371 = new int[field368];

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "[I")
    public static int[] field374 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[[Luh;")
    public static class194[][] field358 = new class194[field368][500];

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
    public static int[] field354 = new int[5];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lpc;")
    public static class144 field376;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lud;")
    public static class190 field355;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[[[I")
    public static int[][][] field372;

    @OriginalMember(owner = "client!bi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field369++;
        if (class179.field3415 != null) {
            class131.field2382 = 0;
            class45.field854 = arg0.getX();
            class176.field3351 = arg0.getY();
            class55.field988 = class24.method165(128);
            if (arg0.isMetaDown()) {
                class169.field3189 = 2;
                class81.field1441 = 2;
            } else {
                class169.field3189 = 1;
                class81.field1441 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field357++;
        if (class179.field3415 != null) {
            class81.field1441 = 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field365++;
        if (class179.field3415 != null) {
            class131.field2382 = 0;
            class174.field3290 = arg0.getX();
            class109.field1976 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
    public static final int method122(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3) {
            field363 = null;
        }
        field367++;
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        return (arg1 >> 2 << 10) + (arg3 >> 5 << 7) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!bi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field366++;
    }

    @OriginalMember(owner = "client!bi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field370++;
        if (class179.field3415 != null) {
            class131.field2382 = 0;
            class174.field3290 = arg0.getX();
            class109.field1976 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field375++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field356++;
        if (class179.field3415 != null) {
            class131.field2382 = 0;
            class81.field1441 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method123(byte arg0) {
        if (arg0 <= 125) {
            method122(-103, -1, -105, -126);
        }
        class179.field3417 = new class9(32);
        field362++;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public static void method124(byte arg0) {
        field363 = null;
        field374 = null;
        field376 = null;
        field372 = null;
        field358 = null;
        if (arg0 >= -123) {
            field376 = null;
        }
        field361 = null;
        field354 = null;
        field355 = null;
        field371 = null;
        field364 = null;
    }

    @OriginalMember(owner = "client!bi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field373++;
        if (class179.field3415 != null) {
            class131.field2382 = 0;
            class174.field3290 = -1;
            class109.field1976 = -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field360++;
        if (class179.field3415 != null) {
            class131.field2382 = 0;
            class174.field3290 = arg0.getX();
            class109.field1976 = arg0.getY();
        }
    }
}
