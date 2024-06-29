import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class22 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    public static int[] field471 = new int[200];

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
    public static int[] field466 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lea;")
    public static class38 field472 = class9.method46((byte) 127, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lea;")
    public static class38 field475 = class9.method46((byte) 101, "Hier wechseln");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!cc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field484++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method132(byte arg0) {
        field475 = null;
        field466 = null;
        field472 = null;
        if (arg0 != 91) {
            field471 = null;
        }
        field471 = null;
    }

    @OriginalMember(owner = "client!cc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field470++;
        if (class155.field3213 != null) {
            class125.field2701 = 0;
            class109.field2446 = arg0.getX();
            class148.field3082 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!cc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class155.field3213 != null) {
            class125.field2701 = 0;
            class125.field2685 = arg0.getX();
            class3.field108 = arg0.getY();
            class200.field3940 = class166.method1184((byte) -80);
            if (arg0.isMetaDown()) {
                class168.field3459 = 2;
                class166.field3426 = 2;
            } else {
                class168.field3459 = 1;
                class166.field3426 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field478++;
    }

    @OriginalMember(owner = "client!cc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class155.field3213 != null) {
            class125.field2701 = 0;
            class109.field2446 = -1;
            class148.field3082 = -1;
        }
        field482++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILc;)V")
    public static final void method133(int arg0, class19 arg1) {
        if (class45.field1098 == arg1.field407 || arg1.field395 == -1 || arg1.field429 != 0 || arg1.field420 + 1 > class139.method997(125, arg1.field395).field2938[arg1.field417]) {
            int var2 = arg1.field407 - arg1.field388;
            int var3 = class45.field1098 - arg1.field388;
            int var4 = arg1.field424 * 128 + arg1.field423 * 64;
            int var5 = arg1.field423 * 64 + arg1.field379 * 128;
            int var6 = arg1.field423 * 64 + arg1.field383 * 128;
            arg1.field382 = ((var2 - var3) * var5 + var3 * var6) / var2;
            int var7 = arg1.field428 * 128 + arg1.field423 * 64;
            arg1.field406 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        if (arg1.field401 == 0) {
            arg1.field421 = 1024;
        }
        field477++;
        arg1.field405 = 0;
        if (arg1.field401 == 1) {
            arg1.field421 = 1536;
        }
        if (arg1.field401 == 2) {
            arg1.field421 = 0;
        }
        if (arg1.field401 == 3) {
            arg1.field421 = 512;
        }
        arg1.field403 = arg1.field421;
        if (arg0 != 128) {
            field472 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class155.field3213 != null) {
            class125.field2701 = 0;
            class109.field2446 = arg0.getX();
            class148.field3082 = arg0.getY();
        }
        field483++;
    }

    @OriginalMember(owner = "client!cc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field465++;
        if (class155.field3213 != null) {
            class125.field2701 = 0;
            class109.field2446 = arg0.getX();
            class148.field3082 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!cc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field476++;
        if (class155.field3213 != null) {
            class125.field2701 = 0;
            class166.field3426 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class155.field3213 != null) {
            class166.field3426 = 0;
        }
        field481++;
    }

    @OriginalMember(owner = "client!cc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field480++;
    }
}
