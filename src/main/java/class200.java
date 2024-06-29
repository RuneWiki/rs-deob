import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class200 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lcd;")
    public static class23 field3948 = class54.method414("event_opbase", -1);

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lcd;")
    public static class23 field3957 = class54.method414("<col=ffff00>", -1);

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lcd;")
    public static class23 field3965 = class54.method414("::qa_op_test", -1);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field3949 = new Random();

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lsa;")
    public static class162 field3967 = new class162(200);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lfa;")
    public static class47 field3966;

    @OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3963++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILva;)Lcd;")
    public static final class23 method1322(int arg0, int arg1, class189 arg2) {
        field3951++;
        try {
            class23 var3 = new class23();
            var3.field473 = arg2.method1210(false);
            if (arg0 != -24994) {
                field3964 = 22;
            }
            if (var3.field473 > arg1) {
                var3.field473 = arg1;
            }
            var3.field480 = new byte[var3.field473];
            arg2.field3752 += class4.field48.method518(var3.field480, arg0 + 24993, arg2.field3752, 0, arg2.field3753, var3.field473);
            return var3;
        } catch (Exception var4) {
            return class3.field35;
        }
    }

    @OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class160.field3194 != null) {
            class145.field2966 = 0;
        }
        field3960++;
    }

    @OriginalMember(owner = "client!wc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3962++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        field3948 = null;
        field3949 = null;
        field3965 = null;
        field3967 = null;
        field3966 = null;
        if (arg0 >= -35) {
            field3954 = 42;
        }
        field3957 = null;
    }

    @OriginalMember(owner = "client!wc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class160.field3194 != null) {
            class59.field1375 = 0;
            class178.field3538 = -1;
            class136.field2811 = -1;
        }
        field3959++;
    }

    @OriginalMember(owner = "client!wc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3956++;
        if (class160.field3194 != null) {
            class59.field1375 = 0;
            class68.field1592 = arg0.getX();
            class16.field344 = arg0.getY();
            class63.field1492 = class30.method224((byte) 95);
            if (arg0.isMetaDown()) {
                class157.field3137 = 2;
                class145.field2966 = 2;
            } else {
                class157.field3137 = 1;
                class145.field2966 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class160.field3194 != null) {
            class59.field1375 = 0;
            class178.field3538 = arg0.getX();
            class136.field2811 = arg0.getY();
        }
        field3961++;
    }

    @OriginalMember(owner = "client!wc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3952++;
        if (class160.field3194 != null) {
            class59.field1375 = 0;
            class178.field3538 = arg0.getX();
            class136.field2811 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!wc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class160.field3194 != null) {
            class59.field1375 = 0;
            class178.field3538 = arg0.getX();
            class136.field2811 = arg0.getY();
        }
        field3953++;
    }

    @OriginalMember(owner = "client!wc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3950++;
        if (class160.field3194 != null) {
            class59.field1375 = 0;
            class145.field2966 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
