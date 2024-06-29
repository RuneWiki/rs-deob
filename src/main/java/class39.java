import java.awt.FontMetrics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "[I")
    public static int[] field509 = new int[256];

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "Lia;")
    public static class15 field511 = class28.method196("Mace Shop", false);

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "Lia;")
    public static class15 field508 = class28.method196("Brewery", false);

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "Lia;")
    public static class15 field513 = class28.method196("50(U", false);

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "mapview!ua", name = "k", descriptor = "Lia;")
    public static class15 field518;

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "Lia;")
    public static class15 field514;

    @OriginalMember(owner = "mapview!ua", name = "i", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field510;

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "[B")
    public static byte[] field515;

    @OriginalMember(owner = "mapview!ua", name = "j", descriptor = "[B")
    public static byte[] field517;

    @OriginalMember(owner = "mapview!ua", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 14)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class27.field384 != null) {
            class4.field33 = -1;
            class15.field140 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 33)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I)V", line = 39)
    public static final void method251(int arg0) {
        class36 var1 = class12.field105;
        synchronized (class12.field105) {
            class17.field164 = class3.field31;
            if (class12.field102 < arg0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    mapview.field301[var2] = false;
                }
                class12.field102 = class26.field367;
            } else {
                while (class26.field367 != class12.field102) {
                    int var3 = class13.field121[class26.field367];
                    class26.field367 = class26.field367 + 1 & 0x7F;
                    if (var3 < 0) {
                        mapview.field301[~var3] = false;
                    } else {
                        mapview.field301[var3] = true;
                    }
                }
            }
            class3.field31 = class9.field73;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 79)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class27.field384 != null) {
            class4.field33 = arg0.getX();
            class15.field140 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 96)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class27.field384 != null) {
            class4.field33 = arg0.getX();
            class15.field140 = arg0.getY();
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field509[var0] = var1;
        }
        field518 = class28.method196("fonts", false);
        field514 = class28.method196("Loading", false);
    }

    @OriginalMember(owner = "mapview!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 121)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class27.field384 != null) {
            class5.field45 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(I)V", line = 132)
    public static final void method252(int arg0) {
        class30.field425 = null;
        class6.field60 = null;
        class10.field79 = null;
        class9.field78 = null;
        class33.field471 = null;
        if (arg0 != 0) {
            field518 = null;
        }
        class25.field358 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 149)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class27.field384 != null) {
            class5.field45 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 168)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class27.field384 != null) {
            class18.field183 = arg0.getX();
            class21.field243 = arg0.getY();
            if (arg0.isMetaDown()) {
                class34.field480 = 2;
                class5.field45 = 2;
            } else {
                class34.field480 = 1;
                class5.field45 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "(I)V", line = 202)
    public static void method253(int arg0) {
        field515 = null;
        field513 = null;
        field508 = null;
        if (arg0 >= -18) {
            field518 = null;
        }
        field518 = null;
        field510 = null;
        field517 = null;
        field511 = null;
        field514 = null;
        field509 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 238)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class27.field384 != null) {
            class4.field33 = arg0.getX();
            class15.field140 = arg0.getY();
        }
    }
}
