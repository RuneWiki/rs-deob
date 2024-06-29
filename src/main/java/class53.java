import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lqf;")
    public static class117 field1086 = class72.method514(111, "lila:");

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lqf;")
    public static class117 field1089 = class72.method514(123, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lqf;")
    private static class117 field1097 = class72.method514(99, "Loading ignore list");

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lqf;")
    public static class117 field1085 = class72.method514(111, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lqf;")
    public static class117 field1105 = class72.method514(114, "@cr1@");

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lqf;")
    private static class117 field1100 = class72.method514(117, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lqf;")
    public static class117 field1107 = field1097;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lqf;")
    public static class117 field1104 = class72.method514(121, "::fpsoff");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lqf;")
    public static class117 field1098 = field1100;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Lr;")
    public static class118 field1108;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Ldf;")
    public static class28 field1101;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Ljb;")
    public static class64 field1095;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[I")
    public static int[] field1093;

    @OriginalMember(owner = "client!hd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1110++;
        if (class8.field131 != null) {
            class115.field2718 = 0;
            class124.field2931 = arg0.getX();
            class110.field2604 = arg0.getY();
            class73.field1598 = class122.method977(false);
            if (arg0.isMetaDown()) {
                class70.field1485 = 2;
                class20.field328 = 2;
            } else {
                class70.field1485 = 1;
                class20.field328 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1106++;
        if (class8.field131 != null) {
            class20.field328 = 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BI)[B")
    public static final byte[] method391(byte[] arg0, int arg1) {
        field1094++;
        class77 var2 = new class77(arg0);
        int var3 = var2.method570((byte) 123);
        int var4 = var2.method554((byte) 98);
        if (~var4 > arg1 || class16.field240 != 0 && var4 > class16.field240) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method575(0, var5, 15162, var4);
            return var5;
        } else {
            int var6 = var2.method554((byte) 114);
            if (var6 < 0 || class16.field240 != 0 && class16.field240 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class6.method34(var7, var6, arg0, var4, 9);
            } else {
                class149.field3684.method886(var2, false, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method392(boolean arg0) {
        class117 var1 = null;
        field1109++;
        for (int var2 = 0; var2 < class27.field531; var2++) {
            if (class82.field1884[var2].method926((byte) -107, class56.field1148) != -1) {
                var1 = class82.field1884[var2].method908(class82.field1884[var2].method926((byte) -104, class56.field1148), (byte) 120);
                break;
            }
        }
        if (var1 == null) {
            class58.method415(-92);
            return;
        }
        int var3 = class55.field1142;
        if (var3 > 190) {
            var3 = 190;
        }
        int var4 = class147.field3595;
        int var5 = class140.field3341;
        if (var4 < 0) {
            var4 = 0;
        }
        int var6 = class87.field1987;
        int var7 = 6116423;
        class49.method360(var4, var5, var3, var6, var7);
        class49.method360(var4 + 1, var5 + 1, var3 - 2, 16, 0);
        class49.method351(var4 + 1, var5 + 18, var3 - 2, var6 - 19, 0);
        class144.field3554.method330(var1, var4 + 3, var5 + 14, var7, -1);
        int var8 = class143.field3504;
        int var9 = class18.field274;
        if (class24.field468 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (arg0) {
            field1107 = null;
        }
        if (class24.field468 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (class24.field468 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < class27.field531; var10++) {
            int var11 = var5 + (class27.field531 - var10 - 1) * 15 + 31;
            int var12 = 16777215;
            class117 var13 = class82.field1884[var10];
            if (var8 > var4 && var4 + var3 > var8 && var11 - 13 < var9 && var11 + 3 > var9) {
                var12 = 16776960;
            }
            if (var13.method927(var1, (byte) -8)) {
                var13 = var13.method943(0, (byte) 123, var13.method915(27) - var1.method915(27));
                if (var13.method927(class102.field2464, (byte) -8)) {
                    var13 = var13.method943(0, (byte) 127, var13.method915(27) - class102.field2464.method915(27));
                }
            }
            class144.field3554.method330(var13, var4 + 3, var11, var12, 0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1084++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method393(int arg0) {
        class113.field2642 = true;
        field1092++;
        if (arg0 >= -102) {
            field1107 = null;
        }
        class20.field334 = true;
    }

    @OriginalMember(owner = "client!hd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1091++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class8.field131 != null) {
            class115.field2718 = 0;
            class20.field328 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1088++;
    }

    @OriginalMember(owner = "client!hd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class8.field131 != null) {
            class115.field2718 = 0;
            class152.field3744 = arg0.getX();
            class124.field2916 = arg0.getY();
        }
        field1090++;
    }

    @OriginalMember(owner = "client!hd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class8.field131 != null) {
            class115.field2718 = 0;
            class152.field3744 = -1;
            class124.field2916 = -1;
        }
        field1102++;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method394(int arg0) {
        field1089 = null;
        field1101 = null;
        field1086 = null;
        field1104 = null;
        field1085 = null;
        field1100 = null;
        field1095 = null;
        field1098 = null;
        field1107 = null;
        field1105 = null;
        field1097 = null;
        field1108 = null;
        int var1 = 61 / ((arg0 - 6) / 55);
        field1093 = null;
    }

    @OriginalMember(owner = "client!hd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class8.field131 != null) {
            class115.field2718 = 0;
            class152.field3744 = arg0.getX();
            class124.field2916 = arg0.getY();
        }
        field1087++;
    }

    @OriginalMember(owner = "client!hd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class8.field131 != null) {
            class115.field2718 = 0;
            class152.field3744 = arg0.getX();
            class124.field2916 = arg0.getY();
        }
        field1103++;
    }
}
