import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class138 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lbe;")
    public static class283 field2300 = class153.method941(126, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lbe;")
    public static class283 field2307 = class153.method941(127, "gelb:");

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lbe;")
    public static class283 field2308 = class153.method941(126, "(U1");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ab", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2292++;
        if (class121.field2017 != null) {
            class237.field3963 = 0;
            class18.field215 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ab", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class121.field2017 != null) {
            class237.field3963 = 0;
            class30.field464 = -1;
            class226.field3807 = -1;
        }
        field2298++;
    }

    @OriginalMember(owner = "client!ab", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 55)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class121.field2017 != null) {
            class18.field215 = 0;
        }
        field2302++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V", line = 69)
    public static final void method856(int arg0, int arg1) {
        field2306++;
        class74 var2 = (class74) class170.field2860.method1612((long) arg1, 94);
        if (var2 != null) {
            for (int var3 = arg0; var3 < var2.field1290.length; var3++) {
                var2.field1290[var3] = -1;
                var2.field1288[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 91)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class121.field2017 != null) {
            class237.field3963 = 0;
            class30.field464 = arg0.getX();
            class226.field3807 = arg0.getY();
        }
        field2296++;
    }

    @OriginalMember(owner = "client!ab", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 115)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2295++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V", line = 129)
    public static final void method857(int arg0, int arg1, int arg2) {
        field2294++;
        int var3 = -50 / ((arg2 + 27) / 63);
        if (class27.field410 != arg0) {
            class174.field2978 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class174.field2978[var4] = (var4 << 12) / arg0;
            }
            class192.field3294 = arg0 == 64 ? 2048 : 4096;
            class27.field410 = arg0;
            class284.field4857 = arg0 - 1;
        }
        if (class13.field124 == arg1) {
            return;
        }
        if (class27.field410 == arg1) {
            class153.field2509 = class174.field2978;
        } else {
            class153.field2509 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class153.field2509[var5] = (var5 << 12) / arg1;
            }
        }
        class13.field124 = arg1;
        class126.field2100 = arg1 - 1;
    }

    @OriginalMember(owner = "client!ab", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 173)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2293++;
        if (class121.field2017 != null) {
            class237.field3963 = 0;
            class30.field464 = arg0.getX();
            class226.field3807 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ab", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 194)
    public final void focusGained(FocusEvent arg0) {
        field2303++;
    }

    @OriginalMember(owner = "client!ab", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 202)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2297++;
        if (class121.field2017 != null) {
            class237.field3963 = 0;
            class30.field464 = arg0.getX();
            class226.field3807 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ab", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 230)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class121.field2017 != null) {
            class237.field3963 = 0;
            class192.field3292 = arg0.getX();
            class7.field78 = arg0.getY();
            class154.field2531 = class216.method1426(255);
            if (arg0.isMetaDown()) {
                class92.field1558 = 2;
                class18.field215 = 2;
            } else {
                class92.field1558 = 1;
                class18.field215 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field2305++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 282)
    public static void method858(int arg0) {
        field2307 = null;
        if (arg0 != -31529) {
            method857(9, -84, -107);
        }
        field2300 = null;
        field2308 = null;
    }
}
