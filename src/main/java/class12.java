import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Loc;")
    public static class99 field274 = class48.method402((byte) -104, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Loc;")
    public static class99 field281 = class48.method402((byte) -104, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Loc;")
    private static class99 field269 = class48.method402((byte) -104, "You have only just left another world)3");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Loc;")
    private static class99 field288 = class48.method402((byte) -104, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Loc;")
    public static class99 field277 = field288;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Loc;")
    public static class99 field267 = field269;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "J")
    public static long field283 = 0L;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field290 = 99;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLqe;)V")
    public static final void method126(boolean arg0, class114 arg1) {
        field276++;
        if (arg0) {
            class54.field1306 = arg1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field268++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lw;I)V")
    public static final void method127(class148 arg0, int arg1) {
        field275++;
        int var2 = 0;
        if (arg0.field3677 == 0) {
            var2 = class68.field1757.method85(arg0.field3676, arg0.field3655, arg0.field3668);
        }
        if (arg0.field3677 == 1) {
            var2 = class68.field1757.method71(arg0.field3676, arg0.field3655, arg0.field3668);
        }
        int var3 = 0;
        int var4 = -1;
        if (arg0.field3677 == 2) {
            var2 = class68.field1757.method39(arg0.field3676, arg0.field3655, arg0.field3668);
        }
        int var5 = 0;
        if (~arg0.field3677 == arg1) {
            var2 = class68.field1757.method76(arg0.field3676, arg0.field3655, arg0.field3668);
        }
        if (var2 != 0) {
            var4 = var2 >> 14 & 0x7FFF;
            int var6 = class68.field1757.method50(arg0.field3676, arg0.field3655, arg0.field3668, var2);
            var5 = var6 >> 6 & 0x3;
            var3 = var6 & 0x1F;
        }
        arg0.field3654 = var4;
        arg0.field3672 = var3;
        arg0.field3669 = var5;
    }

    @OriginalMember(owner = "client!bd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field282++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
    public static final int method128(int arg0, int arg1, int arg2) {
        field287++;
        int var3 = arg1;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field284++;
        if (class45.field1070 != null) {
            class138.field3445 = 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method129(int arg0) {
        class45.method381((byte) -70);
        field285++;
        class110.method941(1);
        class34.method290(-127);
        class99.method844((byte) -118);
        class97.method802((byte) -60);
        class31.method268((byte) 23);
        class23.method209(-97);
        class15.method150(true);
        class143.method1166((byte) 45);
        class72.method658(38);
        class42.method363((byte) -128);
        class61.method541(true);
        ((class79) class40.field989).method691(59);
        class73.field1850.method998(true);
        class5.field114.method904((byte) -32);
        class135.field3342.method904((byte) -32);
        class110.field2743.method904((byte) -32);
        if (arg0 != 2388) {
            field267 = null;
        }
        class150.field3726.method904((byte) -32);
        class16.field410.method904((byte) -32);
        class99.field2372.method904((byte) -32);
        class49.field1198.method904((byte) -32);
        class144.field3603.method904((byte) -32);
        class148.field3653.method904((byte) -32);
        class61.field1633.method904((byte) -32);
        class138.field3451.method904((byte) -32);
        class111.field2756.method904((byte) -32);
    }

    @OriginalMember(owner = "client!bd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field289++;
        if (class45.field1070 != null) {
            client.field522 = 0;
            class16.field393 = -1;
            class137.field3437 = -1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class45.field1070 != null) {
            client.field522 = 0;
            class138.field3445 = 0;
        }
        field278++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field286++;
        if (class45.field1070 != null) {
            client.field522 = 0;
            class16.field393 = arg0.getX();
            class137.field3437 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field272++;
        if (class45.field1070 != null) {
            client.field522 = 0;
            class16.field393 = arg0.getX();
            class137.field3437 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method130(int arg0) {
        field281 = null;
        field288 = null;
        if (arg0 != 0) {
            field277 = null;
        }
        field269 = null;
        field274 = null;
        field277 = null;
        field267 = null;
    }

    @OriginalMember(owner = "client!bd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class45.field1070 != null) {
            client.field522 = 0;
            class16.field393 = arg0.getX();
            class137.field3437 = arg0.getY();
        }
        field280++;
    }

    @OriginalMember(owner = "client!bd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field279++;
        if (class45.field1070 != null) {
            client.field522 = 0;
            class45.field1071 = arg0.getX();
            class48.field1172 = arg0.getY();
            class57.field1510 = class60.method535(2);
            if (arg0.isMetaDown()) {
                class58.field1527 = 2;
                class138.field3445 = 2;
            } else {
                class58.field1527 = 1;
                class138.field3445 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
