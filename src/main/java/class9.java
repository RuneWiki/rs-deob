import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class9 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "S")
    public static short field118 = 1;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lad;")
    public static class279 field107;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method70(byte arg0) {
        field107 = null;
        if (arg0 < 120) {
            method70((byte) 36);
        }
    }

    @OriginalMember(owner = "client!oe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field106++;
        if (class42.field738 != null) {
            class169.field2485 = 0;
            class165.field2422 = arg0.getX();
            class157.field2307 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public static final void method71(byte arg0) {
        if (arg0 < -62) {
            field117++;
            class249.field3868.method940(115);
        }
    }

    @OriginalMember(owner = "client!oe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class42.field738 != null) {
            class224.field3483 = 0;
        }
        field111++;
    }

    @OriginalMember(owner = "client!oe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class42.field738 != null) {
            class169.field2485 = 0;
            client.field728 = arg0.getX();
            class222.field3462 = arg0.getY();
            class10.field157 = class257.method1736(14361);
            if (arg0.isMetaDown()) {
                class188.field2806 = 2;
                class224.field3483 = 2;
            } else {
                class188.field2806 = 1;
                class224.field3483 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field112++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lfi;")
    public static final class105 method72(int arg0, int arg1, int arg2) {
        class105 var3 = (class105) class12.field175.method306((long) arg2 | (long) arg0 << 32, 16216);
        field113++;
        if (var3 == null) {
            var3 = new class105(arg0, arg2);
            class12.field175.method309((byte) -8, var3, var3.field2628);
        }
        if (arg1 != -1) {
            method71((byte) 104);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field109++;
    }

    @OriginalMember(owner = "client!oe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field114++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field110++;
        if (class42.field738 != null) {
            class169.field2485 = 0;
            class165.field2422 = arg0.getX();
            class157.field2307 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!oe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field105++;
        if (class42.field738 != null) {
            class169.field2485 = 0;
            class165.field2422 = arg0.getX();
            class157.field2307 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!oe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field115++;
        if (class42.field738 != null) {
            class169.field2485 = 0;
            class224.field3483 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
    public static final void method73(int arg0, int arg1, int arg2) {
        class248.field3852 = true;
        class23.field373 = arg0;
        class122.field1809 = arg1;
        class149.field2156 = arg2;
        class44.field775 = -1;
        class173.field2540 = -1;
    }

    @OriginalMember(owner = "client!oe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field116++;
        if (class42.field738 != null) {
            class169.field2485 = 0;
            class165.field2422 = -1;
            class157.field2307 = -1;
        }
    }
}
