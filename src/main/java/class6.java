import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lna;")
    public static class26 field72 = method40("Suchen", 48);

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Lna;")
    public static class26 field76 = method40("mapscene", 48);

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "I")
    private static volatile int field71 = -1;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Lna;")
    public static class26 field77 = method40("Tannery", 48);

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "Lna;")
    public static class26 field80 = method40("loc)3dat", 48);

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Lna;")
    public static class26 field78 = method40("Amulet Shop", 48);

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Z")
    public static boolean field75 = false;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "Lna;")
    public static class26 field81 = method40("Sandpit", 48);

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lna;")
    public static class26 field79 = method40("_", 48);

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "Lba;")
    public static class4 field82;

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "mapview!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 8)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 16)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class11.field132 != null) {
            field71 = arg0.getX();
            class22.field225 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class11.field132 != null) {
            class34.field438 = arg0.getX();
            class20.field212 = arg0.getY();
            if (arg0.isMetaDown()) {
                class38.field466 = 2;
                class23.field239 = 2;
            } else {
                class38.field466 = 1;
                class23.field239 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 73)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class11.field132 != null) {
            field71 = arg0.getX();
            class22.field225 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/String;I)Lna;", line = 93)
    public static final class26 method40(String arg0, int arg1) {
        if (arg1 != 48) {
            return (class26) null;
        }
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class26 var5 = new class26();
        var5.field371 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field371[var5.field375++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field371[var5.field375++] = (byte) var6;
            }
        }
        var5.method192(true);
        return var5.method177((byte) 102);
    }

    @OriginalMember(owner = "mapview!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 133)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class11.field132 != null) {
            class23.field239 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IILa;B)[Lo;", line = 145)
    public static final class27[] method41(int arg0, int arg1, class1 arg2, byte arg3) {
        if (class23.method134(arg1, (byte) 61, arg0, arg2)) {
            if (arg3 <= 114) {
                method42(116);
            }
            return class32.method230(-25318);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 158)
    public static void method42(int arg0) {
        field81 = null;
        field78 = null;
        field82 = null;
        field73 = null;
        field76 = null;
        field72 = null;
        field79 = null;
        field80 = null;
        if (arg0 != 255) {
            method41(9, 6, null, (byte) -10);
        }
        field77 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class11.field132 != null) {
            field71 = arg0.getX();
            class22.field225 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)I", line = 197)
    public static final int method43(int arg0) {
        if (arg0 != 2) {
            field73 = null;
        }
        if (class38.field464 == null) {
            return 0;
        } else if (class38.field464.field49 == null) {
            return class34.field436[class38.field464.field43 & 0xFF];
        } else {
            return class34.field436[class38.field464.field49[class20.field213] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 252)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class11.field132 != null) {
            class23.field239 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 279)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class11.field132 != null) {
            field71 = -1;
            class22.field225 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "(I)V", line = 299)
    public static final void method44(int arg0) {
        class6 var1 = class11.field132;
        synchronized (class11.field132) {
            if (arg0 != 2) {
                method45(-53, 99, null);
            }
            class10.field121 = class23.field239;
            field74 = field71;
            class20.field215 = class22.field225;
            class1.field24 = class38.field466;
            class35.field455 = class34.field438;
            class22.field232 = class20.field212;
            class38.field466 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 325)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(II[B)I", line = 334)
    public static final int method45(int arg0, int arg1, byte[] arg2) {
        if (arg0 < 65) {
            field79 = null;
        }
        return mapview.method157(false, arg2, 0, arg1);
    }
}
