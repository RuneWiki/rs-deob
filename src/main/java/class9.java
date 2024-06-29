import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "[J")
    private static long[] field93 = new long[256];

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Lua;")
    public static class41 field94 = class16.method86("Scimitar Shop", true);

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Lua;")
    public static class41 field96;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "[I")
    public static int[] field95;

    @OriginalMember(owner = "mapview!e", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 3)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!e", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 9)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class19.field156 != null) {
            class19.field163 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class19.field156 != null) {
            class23.field239 = -1;
            class8.field90 = -1;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 67)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 77)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class19.field156 != null) {
            class23.field239 = arg0.getX();
            class8.field90 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 102)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class19.field156 != null) {
            class19.field163 = 0;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field93[var0] = var1;
        }
        field96 = class16.method86("Tannery", true);
    }

    @OriginalMember(owner = "mapview!e", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 121)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class19.field156 != null) {
            class23.field239 = arg0.getX();
            class8.field90 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class19.field156 != null) {
            class41.field500 = arg0.getX();
            class23.field235 = arg0.getY();
            if (arg0.isMetaDown()) {
                class34.field431 = 2;
                class19.field163 = 2;
            } else {
                class34.field431 = 1;
                class19.field163 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(B)Z", line = 193)
    public static final boolean method52(byte arg0) {
        class13 var1 = class17.field145;
        synchronized (class17.field145) {
            if (arg0 >= -21) {
                method53(26);
            }
            if (class32.field415 == class19.field168) {
                return false;
            } else {
                class16.field134 = class41.field505[class32.field415];
                class31.field407 = class36.field447[class32.field415];
                class32.field415 = class32.field415 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 219)
    public static void method53(int arg0) {
        field95 = null;
        if (arg0 == -1) {
            field93 = null;
            field96 = null;
            field94 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 232)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class19.field156 != null) {
            class23.field239 = arg0.getX();
            class8.field90 = arg0.getY();
        }
    }
}
