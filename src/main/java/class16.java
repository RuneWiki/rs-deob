import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Ll;")
    public static class22 field156 = class33.method229("Mace Shop", -54);

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Ll;")
    public static class22 field158 = class33.method229("Switch to ", -128);

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Ll;")
    public static class22 field161 = class33.method229("Amulet Shop", -92);

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "[J")
    public static long[] field163 = new long[32];

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Ll;")
    public static class22 field157 = class33.method229("Shield Shop", -61);

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "I")
    public static int field159 = -1;

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "[I")
    public static int[] field164 = new int[128];

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lja;")
    public static class19 field160;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "[I")
    public static int[] field162;

    @OriginalMember(owner = "mapview!ha", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 20)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class5.field36 != null) {
            class29.field406 = arg0.getX();
            class12.field131 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 40)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class5.field36 != null) {
            class29.field406 = arg0.getX();
            class12.field131 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 56)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class5.field36 != null) {
            class34.field466 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 77)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class5.field36 != null) {
            class29.field406 = -1;
            class12.field131 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 97)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 106)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class5.field36 != null) {
            class34.field466 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 122)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class5.field36 != null) {
            class29.field406 = arg0.getX();
            class12.field131 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 149)
    public static final Object method92(byte[] arg0, int arg1, boolean arg2) {
        int var3 = -125 / ((arg1 - 4) / 34);
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136) {
            try {
                class34 var4 = (class34) Class.forName("na").getDeclaredConstructor().newInstance();
                var4.method232(0, arg0);
                return var4;
            } catch (Throwable var6) {
            }
        }
        return arg2 ? class32.method223(0, arg0) : arg0;
    }

    @OriginalMember(owner = "mapview!ha", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 179)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class5.field36 != null) {
            class21.field204 = arg0.getX();
            class38.field506 = arg0.getY();
            if (arg0.isMetaDown()) {
                class34.field465 = 2;
                class34.field466 = 2;
            } else {
                class34.field465 = 1;
                class34.field466 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 212)
    public static void method93(int arg0) {
        field158 = null;
        field163 = null;
        field161 = null;
        field164 = null;
        field160 = null;
        if (arg0 > -54) {
            field163 = null;
        }
        field162 = null;
        field157 = null;
        field156 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B[B)V", line = 237)
    public static final void method94(byte arg0, byte[] arg1) {
        class38 var2 = new class38(arg1);
        var2.field498 = arg1.length - 2;
        class10.field82 = var2.method254(arg0 ^ 0x411756FE);
        class14.field147 = new int[class10.field82];
        class21.field209 = new int[class10.field82];
        class30.field425 = new byte[class10.field82][];
        class19.field196 = new int[class10.field82];
        class24.field235 = new int[class10.field82];
        var2.field498 = arg1.length - class10.field82 * 8 - 7;
        class33.field453 = var2.method254(-1092048568);
        class5.field48 = var2.method254(-1092048568);
        int var3 = (var2.method246(arg0 ^ 0x49) & 0xFF) + 1;
        for (int var4 = 0; var4 < class10.field82; var4++) {
            class24.field235[var4] = var2.method254(-1092048568);
        }
        for (int var5 = 0; var5 < class10.field82; var5++) {
            class14.field147[var5] = var2.method254(-1092048568);
        }
        for (int var6 = 0; var6 < class10.field82; var6++) {
            class19.field196[var6] = var2.method254(-1092048568);
        }
        for (int var7 = 0; var7 < class10.field82; var7++) {
            class21.field209[var7] = var2.method254(-1092048568);
        }
        var2.field498 = arg1.length - class10.field82 * 8 - (var3 + -1) * 3 - 7;
        class38.field501 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class38.field501[var8] = var2.method253((byte) 101);
            if (class38.field501[var8] == 0) {
                class38.field501[var8] = 1;
            }
        }
        var2.field498 = 0;
        for (int var9 = 0; var9 < class10.field82; var9++) {
            int var10 = class19.field196[var9];
            int var11 = class21.field209[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class30.field425[var9] = var13;
            int var14 = var2.method246(-1);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method251((byte) 126);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method251((byte) 105);
                    }
                }
            }
        }
        if (arg0 != -74) {
            field159 = -105;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([BZ)[B", line = 355)
    public static final byte[] method95(byte[] arg0, boolean arg1) {
        class38 var2 = new class38(arg0);
        int var3 = var2.method246(-1);
        int var4 = var2.method244(1918432520);
        if (arg1) {
            method95(null, true);
        }
        if (var4 < 0 || class21.field202 != 0 && var4 > class21.field202) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method248(37, 0, var5, var4);
            return var5;
        } else {
            int var6 = var2.method244(1918432520);
            if (var6 < 0 || class21.field202 != 0 && class21.field202 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class15.method90(var7, var6, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 425)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
