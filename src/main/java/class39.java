import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Ldd;")
    public static class26 field812 = new class26(128);

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field825 = 255;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field822 = -1;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lrd;")
    public static class114 field823 = class84.method656("scrollbar", (byte) 115);

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lrd;")
    private static class114 field828 = class84.method656("No matching objects found)1 please shorten search", (byte) 126);

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lrd;")
    public static class114 field827 = field828;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lrd;")
    public static class114 field829 = class84.method656("Entfernen", (byte) 122);

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lrd;")
    private static class114 field824 = class84.method656("Bad session id)3", (byte) 123);

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "[[I")
    public static int[][] field832 = new int[104][104];

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lrd;")
    public static class114 field817 = field824;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lrd;")
    public static class114 field820 = class84.method656("Hidden)2", (byte) 127);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Loa;")
    public static class93 field826;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[Loa;")
    public static class93[] field819;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[[B")
    public static byte[][] field821;

    @OriginalMember(owner = "client!fc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class63.field1340 != null) {
            class61.field1306 = 0;
            class28.field573 = arg0.getX();
            class107.field2452 = arg0.getY();
        }
        field809++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method277(boolean arg0) {
        field824 = null;
        field827 = null;
        field832 = null;
        field817 = null;
        field820 = null;
        field829 = null;
        field812 = null;
        field826 = null;
        field823 = null;
        field821 = null;
        field828 = null;
        if (!arg0) {
            method278(null, -17);
        }
        field819 = null;
    }

    @OriginalMember(owner = "client!fc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class63.field1340 != null) {
            class61.field1306 = 0;
            class28.field573 = arg0.getX();
            class107.field2452 = arg0.getY();
        }
        field813++;
    }

    @OriginalMember(owner = "client!fc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field814++;
        if (class63.field1340 != null) {
            class8.field117 = 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field807++;
        if (class63.field1340 != null) {
            class61.field1306 = 0;
            class28.field573 = -1;
            class107.field2452 = -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field810++;
        if (class63.field1340 != null) {
            class61.field1306 = 0;
            class8.field117 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field811++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lnd;I)I")
    public static final int method278(class90 arg0, int arg1) {
        field830++;
        class130 var2 = (class130) class12.field248.method783(-1, ((long) arg0.field2060 << arg1) + ((long) arg0.field2107));
        return var2 == null ? arg0.field2118 : var2.field3147;
    }

    @OriginalMember(owner = "client!fc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field806++;
        if (class63.field1340 != null) {
            class61.field1306 = 0;
            class28.field573 = arg0.getX();
            class107.field2452 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field816++;
    }

    @OriginalMember(owner = "client!fc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class63.field1340 != null) {
            class61.field1306 = 0;
            class126.field3008 = arg0.getX();
            class28.field562 = arg0.getY();
            class90.field2061 = class99.method747(0);
            if (arg0.isMetaDown()) {
                class73.field1634 = 2;
                class8.field117 = 2;
            } else {
                class73.field1634 = 1;
                class8.field117 = 1;
            }
        }
        field808++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
