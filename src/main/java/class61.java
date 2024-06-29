import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class61 extends class199 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!in", name = "v", descriptor = "Loe;")
    private class137 field739 = new class137();

    @OriginalMember(owner = "client!in", name = "K", descriptor = "Loe;")
    private class137 field754 = new class137();

    @OriginalMember(owner = "client!in", name = "M", descriptor = "Z")
    private boolean field756;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Lak;")
    public static class234 field724 = new class234("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "[I")
    public static int[] field741 = new int[14];

    @OriginalMember(owner = "client!in", name = "k", descriptor = "[I")
    public static int[] field728 = new int[1];

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field757;

    @OriginalMember(owner = "client!in", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field740++;
        this.method538(arg0, (byte) -83);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)Lbh;", line = 11)
    public final class28 method529(byte arg0) {
        int var2 = -110 % ((arg0 - 49) / 32);
        field733++;
        return (class28) this.field739.method1001(-16153);
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(B)V", line = 23)
    public static void method530(byte arg0) {
        field741 = null;
        field728 = null;
        field724 = null;
        int var1 = -104 % ((arg0 + 35) / 32);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(Z)Z", line = 35)
    public final boolean method531(boolean arg0) {
        if (arg0) {
            field741 = null;
        }
        field727++;
        return (this.field731 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 46)
    private final int method532(MouseEvent arg0, int arg1) {
        field730++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (arg1 & var3) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(Z)V", line = 83)
    private final void method533(boolean arg0) {
        field738++;
        if (this.field757 == null) {
            return;
        }
        this.field757.removeMouseListener(this);
        this.field757.removeMouseMotionListener(this);
        if (!arg0) {
            return;
        }
        this.field757 = null;
        this.field743 = this.field749 = this.field731 = 0;
        this.field755 = this.field752 = this.field751 = 0;
        this.field739 = null;
        this.field754 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)V", line = 108)
    private final void method534(int arg0, int arg1, int arg2, int arg3) {
        field725++;
        class133 var5 = new class133();
        var5.field2040 = arg0;
        var5.field2037 = arg2;
        var5.field2042 = arg3;
        var5.field2032 = class493.method2937(-109);
        if (arg1 > -94) {
            this.field755 = -82;
        }
        this.field754.method994(var5, -3610);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 125)
    private final void method535(Component arg0, boolean arg1) {
        this.method533(arg1);
        field746++;
        this.field757 = arg0;
        this.field757.addMouseListener(this);
        this.field757.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(B)Z", line = 136)
    public final boolean method536(byte arg0) {
        field744++;
        if (arg0 <= 43) {
            this.field757 = null;
        }
        return (this.field731 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!in", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 151)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field736++;
        this.method538(arg0, (byte) -100);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 161)
    public final void method537(byte arg0) {
        field750++;
        if (arg0 <= 125) {
            field724 = null;
        }
        this.method533(true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V", line = 172)
    private final void method538(MouseEvent arg0, byte arg1) {
        field737++;
        this.field755 = arg0.getX();
        this.field752 = arg0.getY();
        int var3 = 17 / ((-arg1 - 17) / 34);
        if (this.field756) {
            this.method534(-1, -125, arg0.getY(), arg0.getX());
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(B)V", line = 197)
    public static final void method539(byte arg0) {
        if (class60.field716 == null || class333.field4972 == null) {
            class60.field716 = new int[256];
            class333.field4972 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class60.field716[var1] = (int) (Math.sin(var2) * 4096.0D);
                class333.field4972[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field735++;
        if (arg0 < 66) {
            method530((byte) -9);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Z", line = 231)
    public final boolean method540(int arg0) {
        if (arg0 < 77) {
            this.mouseReleased(null);
        }
        field723++;
        return (this.field731 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!in", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 246)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field742++;
        this.method538(arg0, (byte) -93);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V", line = 256)
    public final synchronized void method541(byte arg0) {
        if (arg0 < 108) {
            this.field755 = -122;
        }
        field732++;
        this.field743 = this.field755;
        this.field731 = this.field751;
        this.field749 = this.field752;
        class137 var2 = this.field739;
        this.field739 = this.field754;
        this.field754 = var2;
        this.field754.method993(125);
    }

    @OriginalMember(owner = "client!in", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 278)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field729++;
        int var2 = this.method532(arg0, 4);
        if ((this.field751 & var2) == 0) {
            var2 = this.field751;
        }
        if ((var2 & 0x1) != 0) {
            this.method534(3, -127, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method534(5, -95, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method534(4, -116, arg0.getY(), arg0.getX());
        }
        this.field751 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)I", line = 315)
    public final int method542(boolean arg0) {
        if (arg0) {
            method530((byte) 97);
        }
        field734++;
        return this.field743;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)I", line = 327)
    public final int method543(boolean arg0) {
        field748++;
        return arg0 ? this.field749 : -11;
    }

    @OriginalMember(owner = "client!in", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 338)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field745++;
    }

    @OriginalMember(owner = "client!in", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 348)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field747++;
        int var2 = this.method532(arg0, 4);
        if (var2 == 1) {
            this.method534(0, -128, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method534(2, -106, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method534(1, -101, arg0.getY(), arg0.getX());
        }
        this.field751 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 399)
    public class61(Component arg0, boolean arg1) {
        this.method535(arg0, true);
        this.field756 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 387)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field755 = -1;
        field753++;
        this.field752 = -1;
    }
}
