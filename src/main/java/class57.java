import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class57 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    public static int[] field674 = new int[5];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method354(boolean arg0) {
        field674 = null;
        if (!arg0) {
            method354(false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field678++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method355(int arg0) {
        class88.field1202 = arg0;
        for (int var1 = 0; var1 < class268.field3922; var1++) {
            for (int var2 = 0; var2 < class97.field1292; var2++) {
                if (class6.field94[arg0][var1][var2] == null) {
                    class6.field94[arg0][var1][var2] = new class133(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class75.field899 != null) {
            class79.field942 = 0;
        }
        field676++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class75.field899 != null) {
            class26.field310 = 0;
            class60.field722 = -1;
            class66.field789 = -1;
        }
        field680++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field681++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ec", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class75.field899 != null) {
            class26.field310 = 0;
            class46.field541 = arg0.getX();
            class238.field3430 = arg0.getY();
            class74.field893 = class86.method509(false);
            if (arg0.isMetaDown()) {
                class53.field613 = 2;
                class79.field942 = 2;
            } else {
                class53.field613 = 1;
                class79.field942 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field682++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILbc;II)[Lck;")
    public static final class1[] method356(int arg0, class282 arg1, int arg2, int arg3) {
        field677++;
        return class282.method1875(arg1, arg2, arg0, arg3) ? class226.method1467((byte) -7) : null;
    }

    @OriginalMember(owner = "client!ec", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class75.field899 != null) {
            class26.field310 = 0;
            class60.field722 = arg0.getX();
            class66.field789 = arg0.getY();
        }
        field683++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class75.field899 != null) {
            class26.field310 = 0;
            class79.field942 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field679++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class75.field899 != null) {
            class26.field310 = 0;
            class60.field722 = arg0.getX();
            class66.field789 = arg0.getY();
        }
        field675++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class75.field899 != null) {
            class26.field310 = 0;
            class60.field722 = arg0.getX();
            class66.field789 = arg0.getY();
        }
        field684++;
    }
}
