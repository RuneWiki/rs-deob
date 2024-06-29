import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Lj;")
    public static class17 field83 = class30.method190(-126, "Apothecary");

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Lj;")
    public static class17 field86 = class30.method190(-88, "world");

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lj;")
    public static class17 field82 = class30.method190(-91, "Find");

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Lj;")
    public static class17 field81 = class30.method190(-107, "Prev page");

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "I")
    public static volatile int field87 = -1;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "Lj;")
    public static class17 field88 = class30.method190(-113, "POH Portal");

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Lj;")
    public static class17 field89 = class30.method190(-123, "Slayer Master");

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "[[[[B")
    public static byte[][][][] field84 = new byte[5][][][];

    @OriginalMember(owner = "mapview!aa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class28.field367 != null) {
            class13.field237 = arg0.getX();
            field87 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 23)
    public static void method25(byte arg0) {
        field84 = null;
        field89 = null;
        if (arg0 <= 93) {
            return;
        }
        field88 = null;
        field86 = null;
        field82 = null;
        field83 = null;
        field81 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IZIB)Lj;", line = 51)
    public static final class17 method26(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        for (int var5 = arg2 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg1) {
            var6 = var4 + 1;
        }
        if (arg3 <= 86) {
            field85 = -90;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            arg2 /= arg0;
        }
        class17 var10 = new class17();
        var10.field263 = var7;
        var10.field268 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!aa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 130)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 133)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class28.field367 != null) {
            class33.field412 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class28.field367 != null) {
            class23.field302 = arg0.getX();
            class13.field235 = arg0.getY();
            if (arg0.isMetaDown()) {
                class16.field251 = 2;
                class33.field412 = 2;
            } else {
                class16.field251 = 1;
                class33.field412 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 203)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class28.field367 != null) {
            class33.field412 = 0;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 217)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 226)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class28.field367 != null) {
            class13.field237 = -1;
            field87 = -1;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Lj;Ljava/awt/Color;II)V", line = 246)
    public static final void method27(class17 arg0, Color arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class33.field411.getGraphics();
            if (class33.field419 == null) {
                class33.field419 = new Font("Helvetica", 1, 13);
                class32.field402 = class33.field411.getFontMetrics(class33.field419);
            }
            if (class28.field369) {
                class28.field369 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class1.field77, class23.field306);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class6.field124 == null) {
                    class6.field124 = class33.field411.createImage(304, 34);
                }
                Graphics var5 = class6.field124.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                if (arg2 >= -15) {
                    field89 = null;
                }
                var5.setFont(class33.field419);
                var5.setColor(Color.white);
                arg0.method113(var5, (304 - arg0.method124(116, class32.field402)) / 2, 22, (byte) -117);
                var4.drawImage(class6.field124, class1.field77 / 2 - 152, class23.field306 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = class1.field77 / 2 - 152;
                int var8 = class23.field306 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class33.field419);
                var4.setColor(Color.white);
                arg0.method113(var4, (304 - arg0.method124(-39, class32.field402)) / 2 + var7, var8 - -22, (byte) -120);
            }
        } catch (Exception var11) {
            class33.field411.repaint();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 317)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class28.field367 != null) {
            class13.field237 = arg0.getX();
            field87 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 337)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class28.field367 != null) {
            class13.field237 = arg0.getX();
            field87 = arg0.getY();
        }
    }
}
