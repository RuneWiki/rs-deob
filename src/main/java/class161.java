import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class161 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Llc;")
    public static class143 field2901 = class66.method374("Regarder dans cette direction", -1);

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Llc;")
    public static class143 field2898 = class66.method374("overlay2", -1);

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lmg;")
    public static class134 field2902 = new class134(5000);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
    public static boolean field2910;

    @OriginalMember(owner = "client!db", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class221.field4004 != null) {
            class202.field3679 = 0;
            class277.field4905 = arg0.getX();
            class11.field227 = arg0.getY();
        }
        field2900++;
    }

    @OriginalMember(owner = "client!db", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2896++;
        if (class221.field4004 != null) {
            class202.field3679 = 0;
            class191.field3513 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2901 = null;
        if (arg0 < -83) {
            field2898 = null;
            field2902 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2897++;
        if (class221.field4004 != null) {
            class202.field3679 = 0;
            class277.field4905 = arg0.getX();
            class11.field227 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLfj;III)V")
    public static final void method1067(byte arg0, class209 arg1, int arg2, int arg3, int arg4) {
        field2895++;
        if (arg0 >= -122) {
            method1067((byte) -70, (class209) null, -106, -23, -23);
        }
        for (class124 var5 = (class124) class57.field1103.method1294(false); var5 != null; var5 = (class124) class57.field1103.method1292((byte) 66)) {
            if (var5.field2176 == arg2 && (arg3 * 128) == var5.field2180 && arg4 * 128 == var5.field2162 && var5.field2174.field3879 == arg1.field3879) {
                if (var5.field2171 != null) {
                    class86.field1578.method1000(var5.field2171);
                    var5.field2171 = null;
                }
                if (var5.field2170 != null) {
                    class86.field1578.method1000(var5.field2170);
                    var5.field2170 = null;
                }
                var5.method349(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2906++;
    }

    @OriginalMember(owner = "client!db", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2908++;
    }

    @OriginalMember(owner = "client!db", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2909++;
        if (class221.field4004 != null) {
            class202.field3679 = 0;
            class192.field3533 = arg0.getX();
            class24.field399 = arg0.getY();
            class235.field4293 = class205.method1403(-51);
            if (arg0.isMetaDown()) {
                class175.field3140 = 2;
                class191.field3513 = 2;
            } else {
                class175.field3140 = 1;
                class191.field3513 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLlc;)V")
    public static final void method1068(int arg0, byte arg1, class143 arg2) {
        if (arg1 != 19) {
            field2902 = null;
        }
        class166 var3 = class262.method1746(-108, arg0, 3);
        var3.method1097((byte) -74);
        field2903++;
        var3.field2967 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2904++;
        if (class221.field4004 != null) {
            class202.field3679 = 0;
            class277.field4905 = arg0.getX();
            class11.field227 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!db", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class221.field4004 != null) {
            class202.field3679 = 0;
            class277.field4905 = -1;
            class11.field227 = -1;
        }
        field2907++;
    }

    @OriginalMember(owner = "client!db", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class221.field4004 != null) {
            class191.field3513 = 0;
        }
        field2899++;
    }
}
