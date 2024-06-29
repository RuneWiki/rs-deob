import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class17 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lpm;")
    public static class111 field225 = new class111(128);

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/lang/String;")
    public static String field226 = "Face here";

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field227 = 2;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lqg;")
    public static class256 field229 = new class256();

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[I")
    public static int[] field232 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
    public static int[] field235 = new int[2500];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lkb;")
    public static class39 field234;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    public static int[] field228;

    @OriginalMember(owner = "client!ue", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class334.field5188 != null) {
            class101.field1551 = 0;
            class62.field819 = arg0.getX();
            class114.field1721 = arg0.getY();
        }
        field217++;
    }

    @OriginalMember(owner = "client!ue", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 27)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class334.field5188 != null) {
            class101.field1551 = 0;
            class62.field819 = arg0.getX();
            class114.field1721 = arg0.getY();
        }
        field219++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 44)
    public static void method114(int arg0) {
        field235 = null;
        field232 = null;
        field226 = null;
        field234 = null;
        field225 = null;
        field229 = null;
        field228 = null;
        if (arg0 != 0) {
            field234 = (class39) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 60)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class334.field5188 != null) {
            class101.field1551 = 0;
            class78.field1181 = arg0.getX();
            class324.field5067 = arg0.getY();
            class288.field4550 = class304.method2128((byte) -75);
            if (arg0.isMetaDown()) {
                class239.field3780 = 2;
                class118.field1762 = 2;
            } else {
                class239.field3780 = 1;
                class118.field1762 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field218++;
    }

    @OriginalMember(owner = "client!ue", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 107)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class334.field5188 != null) {
            class101.field1551 = 0;
            class62.field819 = arg0.getX();
            class114.field1721 = arg0.getY();
        }
        field223++;
    }

    @OriginalMember(owner = "client!ue", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 123)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field221++;
        if (class334.field5188 != null) {
            class101.field1551 = 0;
            class62.field819 = -1;
            class114.field1721 = -1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 139)
    public final void focusGained(FocusEvent arg0) {
        field215++;
    }

    @OriginalMember(owner = "client!ue", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 149)
    public final void mouseClicked(MouseEvent arg0) {
        field216++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ue", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 160)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class334.field5188 != null) {
            class101.field1551 = 0;
            class118.field1762 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field220++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 198)
    public static final void method115(byte arg0) {
        class305.field4754 = null;
        class21.field316 = null;
        class163.field2657 = null;
        int var1 = 119 % ((13 - arg0) / 56);
        class162.field2647 = null;
        class3.field20 = (byte[][]) null;
        class244.field3885 = null;
        field224++;
    }

    @OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 217)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class334.field5188 != null) {
            class118.field1762 = 0;
        }
        field222++;
    }
}
