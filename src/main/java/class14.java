import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class14 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Lr;")
    public static class33 field169 = class29.method192("Mini)2Game", (byte) 126);

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "[I")
    private static int[] field170 = new int[256];

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Lfa;")
    public static class12 field171 = null;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Lr;")
    public static class33 field173;

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "Lr;")
    public static class33 field174;

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "J")
    public static long field172;

    @OriginalMember(owner = "mapview!ga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 17)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class29.field417 != null) {
            class32.field457 = arg0.getX();
            class22.field231 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I[BII)I", line = 36)
    public static final int method95(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        if (arg3 != 1) {
            field171 = null;
        }
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ field170[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 61)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class29.field417 != null) {
            class32.field457 = -1;
            class22.field231 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 77)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V", line = 86)
    public static void method96(byte arg0) {
        if (arg0 != 12) {
            field176 = -105;
        }
        field173 = null;
        field170 = null;
        field169 = null;
        field174 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)[Lr;", line = 99)
    public static final class33[] method97(int arg0) {
        if (arg0 > -29) {
            method99(-45L, 74);
        }
        return new class33[] { class20.field213, class6.field71, class33.field474, class5.field56, class2.field12, class32.field453, class8.field119, class37.field504, class10.field137, class30.field435, class20.field210, class13.field164, class11.field149 };
    }

    @OriginalMember(owner = "mapview!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 111)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class29.field417 != null) {
            class25.field266 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 122)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class29.field417 != null) {
            class32.field457 = arg0.getX();
            class22.field231 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 138)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class29.field417 != null) {
            class32.field457 = arg0.getX();
            class22.field231 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 153)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 161)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class29.field417 != null) {
            class25.field266 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
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
            field170[var0] = var1;
        }
        field173 = class29.method192("Cooking Range", (byte) 126);
        field174 = class29.method192("Requesting", (byte) 126);
    }

    @OriginalMember(owner = "mapview!ga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 197)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class29.field417 != null) {
            class35.field484 = arg0.getX();
            class38.field511 = arg0.getY();
            if (arg0.isMetaDown()) {
                class24.field264 = 2;
                class25.field266 = 2;
            } else {
                class24.field264 = 1;
                class25.field266 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IILc;B)[Le;", line = 232)
    public static final class9[] method98(int arg0, int arg1, class5 arg2, byte arg3) {
        if (arg3 < 20) {
            method96((byte) 99);
        }
        return class37.method252(arg0, -2, arg2, arg1) ? class13.method92(0) : null;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(JI)V", line = 254)
    public static final void method99(long arg0, int arg1) {
        try {
            if (arg1 != 1) {
                method97(32);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }
}
