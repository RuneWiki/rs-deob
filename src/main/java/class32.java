import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Laf;")
    public static class7 field841 = class48.method406(40, "Standort");

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field849 = new CRC32();

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Laf;")
    public static class7 field852 = class48.method406(40, "::noclip");

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Laf;")
    public static class7 field854 = class48.method406(40, " ");

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
    public static boolean field855 = false;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Laf;")
    private static class7 field856 = class48.method406(40, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Laf;")
    public static class7 field853 = field856;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method284(int arg0) {
        field856 = null;
        if (arg0 != -7299) {
            field852 = null;
        }
        field852 = null;
        field854 = null;
        field849 = null;
        field841 = null;
        field853 = null;
    }

    @OriginalMember(owner = "client!ec", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field837++;
        if (class106.field2589 != null) {
            class92.field2141 = 0;
            class77.field1779 = arg0.getX();
            class84.field1986 = arg0.getY();
            class23.field626 = class55.method445(0);
            if (arg0.isMetaDown()) {
                class143.field3394 = 2;
                class20.field521 = 2;
            } else {
                class143.field3394 = 1;
                class20.field521 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class106.field2589 != null) {
            class92.field2141 = 0;
            class87.field2035 = arg0.getX();
            class49.field1189 = arg0.getY();
        }
        field840++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class106.field2589 != null) {
            class92.field2141 = 0;
            class20.field521 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field842++;
    }

    @OriginalMember(owner = "client!ec", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field846++;
        if (class106.field2589 != null) {
            class20.field521 = 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class106.field2589 != null) {
            class92.field2141 = 0;
            class87.field2035 = -1;
            class49.field1189 = -1;
        }
        field847++;
    }

    @OriginalMember(owner = "client!ec", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field839++;
    }

    @OriginalMember(owner = "client!ec", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field851++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
    public static final boolean method285(int arg0, int arg1, int arg2) {
        if (arg0 > -56) {
            field853 = null;
        }
        field845++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ec", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field838++;
        if (class106.field2589 != null) {
            class92.field2141 = 0;
            class87.field2035 = arg0.getX();
            class49.field1189 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILsa;ILr;)V")
    public static final void method286(int arg0, class126 arg1, int arg2, class118 arg3) {
        field850++;
        byte[] var4 = null;
        class94 var5 = class9.field240;
        synchronized (class9.field240) {
            for (class119 var6 = (class119) class9.field240.method758(255); var6 != null; var6 = (class119) class9.field240.method766(-103)) {
                if ((long) arg2 == var6.field3261 && var6.field2823 == arg1 && var6.field2817 == 0) {
                    var4 = var6.field2824;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg3.method914(var4, arg2, true, arg1, (byte) -38);
            return;
        }
        if (arg0 != -1) {
            method286(82, null, 127, null);
        }
        byte[] var7 = arg1.method1042(arg0 - 23814, arg2);
        arg3.method914(var7, arg2, true, arg1, (byte) 119);
    }

    @OriginalMember(owner = "client!ec", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field848++;
        if (class106.field2589 != null) {
            class92.field2141 = 0;
            class87.field2035 = arg0.getX();
            class49.field1189 = arg0.getY();
        }
    }
}
