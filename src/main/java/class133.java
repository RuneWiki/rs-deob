import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class133 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Z")
    public static boolean field2295 = true;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "[I")
    public static int[] field2309 = new int[5];

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Z")
    public static boolean field2303 = true;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Lhi;")
    private static class82 field2306 = class95.method664((byte) -36, " is already on your friend list)3");

    @OriginalMember(owner = "client!en", name = "u", descriptor = "Lme;")
    public static class75 field2311 = null;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Lhi;")
    public static class82 field2292 = field2306;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Lhi;")
    private static class82 field2313 = class95.method664((byte) -126, "cyan:");

    @OriginalMember(owner = "client!en", name = "o", descriptor = "Lhi;")
    public static class82 field2305 = field2313;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "[I")
    public static int[] field2312 = new int[256];

    @OriginalMember(owner = "client!en", name = "l", descriptor = "Lhi;")
    public static class82 field2302 = field2313;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Lag;")
    public static class301 field2297;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "[I")
    public static int[] field2296;

    @OriginalMember(owner = "client!en", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 11)
    public final void focusGained(FocusEvent arg0) {
        field2301++;
    }

    @OriginalMember(owner = "client!en", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 19)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class254.field4368 != null) {
            class80.field1367 = 0;
        }
        field2291++;
    }

    @OriginalMember(owner = "client!en", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 29)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class254.field4368 != null) {
            class112.field2035 = 0;
            class80.field1367 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field2298++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method913(boolean arg0, int arg1) {
        field2293++;
        if (!class113.method777((byte) 98, arg1)) {
            return;
        }
        class75[] var2 = class277.field4660[arg1];
        if (arg0) {
            method913(false, 38);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class75 var4 = var2[var3];
            if (var4 != null) {
                var4.field1202 = 0;
                var4.field1139 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 110)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class254.field4368 != null) {
            class112.field2035 = 0;
            class276.field4645 = arg0.getX();
            class330.field5622 = arg0.getY();
        }
        field2300++;
    }

    @OriginalMember(owner = "client!en", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 128)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2314++;
        if (class254.field4368 != null) {
            class112.field2035 = 0;
            class135.field2335 = arg0.getX();
            class168.field2925 = arg0.getY();
            class212.field3712 = class57.method391(19211);
            if (arg0.isMetaDown()) {
                class244.field4244 = 2;
                class80.field1367 = 2;
            } else {
                class244.field4244 = 1;
                class80.field1367 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!en", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 178)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2299++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V", line = 188)
    public static void method914(boolean arg0) {
        field2312 = null;
        field2302 = null;
        field2297 = null;
        field2306 = null;
        field2309 = null;
        field2296 = null;
        field2305 = null;
        field2313 = null;
        if (!arg0) {
            method914(false);
        }
        field2292 = null;
        field2311 = null;
    }

    @OriginalMember(owner = "client!en", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 209)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2304++;
        if (class254.field4368 != null) {
            class112.field2035 = 0;
            class276.field4645 = -1;
            class330.field5622 = -1;
        }
    }

    @OriginalMember(owner = "client!en", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 249)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2308++;
        if (class254.field4368 != null) {
            class112.field2035 = 0;
            class276.field4645 = arg0.getX();
            class330.field5622 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!en", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 287)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2307++;
        if (class254.field4368 != null) {
            class112.field2035 = 0;
            class276.field4645 = arg0.getX();
            class330.field5622 = arg0.getY();
        }
    }
}
