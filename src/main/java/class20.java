import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class20 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Lh;")
    public static class15 field281 = class18.method153("Next page", 1);

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lh;")
    public static class15 field283 = class18.method153("???", 1);

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "Lh;")
    public static class15 field282 = class18.method153("???", 1);

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "J")
    public static volatile long field280 = 0L;

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "Lh;")
    public static class15 field284 = class18.method153("Mining Shop", 1);

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Lh;")
    public static class15 field286 = class18.method153("Short)2cut", 1);

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)Lo;", line = 5)
    public static final class29 method172(byte arg0) {
        class29 var1 = new class29(class14.field215, class9.field118, class10.field136, class21.field294, class13.field192);
        if (arg0 == -111) {
            class12.method96(-83);
            return var1;
        } else {
            return (class29) null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lg;ILh;Lh;)[Li;", line = 38)
    public static final class17[] method173(class13 arg0, int arg1, class15 arg2, class15 arg3) {
        if (arg1 != 458251974) {
            method175(51);
        }
        int var4 = arg0.method104(-121, arg2);
        int var5 = arg0.method110(var4, arg3, 0);
        return mapview.method22(var5, arg1 ^ 0xE4AFA15F, var4, arg0);
    }

    @OriginalMember(owner = "mapview!ja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 55)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class19.field262 != null) {
            class21.field291 = arg0.getX();
            class15.field232 = arg0.getY();
            if (arg0.isMetaDown()) {
                class19.field274 = 2;
                class23.field315 = 2;
            } else {
                class19.field274 = 1;
                class23.field315 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 87)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class19.field262 != null) {
            class19.field270 = -1;
            class36.field445 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 102)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class19.field262 != null) {
            class19.field270 = arg0.getX();
            class36.field445 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)[Lma;", line = 123)
    public static final class26[] method174(int arg0) {
        class26[] var1 = new class26[mapview.field15];
        for (int var2 = 0; var2 < mapview.field15; var2++) {
            class26 var3 = var1[var2] = new class26();
            var3.field344 = class19.field269;
            var3.field346 = class35.field436;
            var3.field343 = class14.field208[var2];
            var3.field342 = class14.field215[var2];
            var3.field345 = class9.field118[var2];
            var3.field341 = class10.field136[var2];
            var3.field347 = class21.field294;
            var3.field348 = class13.field192[var2];
        }
        class12.method96(-93);
        if (arg0 != 4096) {
            method174(71);
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)V", line = 154)
    public static void method175(int arg0) {
        field282 = null;
        field284 = null;
        field283 = null;
        if (arg0 != -30329) {
            method177(-27, -100, (byte) 15, (byte) 57, -61);
        }
        field286 = null;
        field281 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 177)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 187)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class19.field262 != null) {
            class19.field270 = arg0.getX();
            class36.field445 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 204)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class19.field262 != null) {
            class19.field270 = arg0.getX();
            class36.field445 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 223)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class19.field262 != null) {
            class23.field315 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(BLh;Lg;Lh;)[Lma;", line = 242)
    public static final class26[] method176(byte arg0, class15 arg1, class13 arg2, class15 arg3) {
        int var4 = arg2.method104(-98, arg3);
        if (arg0 != 21) {
            field285 = 41;
        }
        int var5 = arg2.method110(var4, arg1, arg0 ^ 0x15);
        return class6.method53(var4, arg2, var5, 1000);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIBBI)V", line = 259)
    public static final void method177(int arg0, int arg1, byte arg2, byte arg3, int arg4) {
        int var5 = arg4 >> 6;
        if (arg2 != 121) {
            return;
        }
        int var6 = arg1 >> 6;
        if (class24.field327[arg0][var6][var5] == null) {
            class24.field327[arg0][var6][var5] = new byte[4096];
        }
        class24.field327[arg0][var6][var5][mapview.method14(arg4, 63) + (mapview.method14(63, arg1) << 6)] = arg3;
    }

    @OriginalMember(owner = "mapview!ja", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 274)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class19.field262 != null) {
            class23.field315 = 0;
        }
    }
}
