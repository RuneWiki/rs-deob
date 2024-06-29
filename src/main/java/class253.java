import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3888 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3892 = 0;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3896 = 127;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Llf;")
    public static final class217 method1689(int arg0, int arg1) {
        field3884++;
        class217 var2 = (class217) class33.field532.method1780((long) arg0, (byte) -113);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field1973.method1163(class228.method1511(arg0, 698681927), class204.method1366(arg0, (byte) -87), 48);
        class217 var4 = new class217();
        var4.field3366 = arg0;
        if (var3 != null) {
            var4.method1453(new class37(var3), 23807);
        }
        var4.method1451(-129);
        if (arg1 == -22396) {
            class33.field532.method1784(var4, false, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3895++;
        if (class276.field4349 != null) {
            class217.field3396 = 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3887++;
    }

    @OriginalMember(owner = "client!jl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3891++;
        if (class276.field4349 != null) {
            class187.field2820 = 0;
            class163.field2484 = arg0.getX();
            class276.field4331 = arg0.getY();
            class16.field267 = class269.method1823(-110);
            if (arg0.isMetaDown()) {
                class241.field3728 = 2;
                class217.field3396 = 2;
            } else {
                class241.field3728 = 1;
                class217.field3396 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3894++;
    }

    @OriginalMember(owner = "client!jl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3886++;
        if (class276.field4349 != null) {
            class187.field2820 = 0;
            class144.field2251 = arg0.getX();
            class209.field3241 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1690(int arg0) {
        int var1 = 47 % ((-arg0 - 35) / 57);
        field3888 = null;
    }

    @OriginalMember(owner = "client!jl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3889++;
        if (class276.field4349 != null) {
            class187.field2820 = 0;
            class144.field2251 = -1;
            class209.field3241 = -1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class276.field4349 != null) {
            class187.field2820 = 0;
            class144.field2251 = arg0.getX();
            class209.field3241 = arg0.getY();
        }
        field3885++;
    }

    @OriginalMember(owner = "client!jl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class276.field4349 != null) {
            class187.field2820 = 0;
            class217.field3396 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3893++;
    }

    @OriginalMember(owner = "client!jl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class276.field4349 != null) {
            class187.field2820 = 0;
            class144.field2251 = arg0.getX();
            class209.field3241 = arg0.getY();
        }
        field3890++;
    }
}
