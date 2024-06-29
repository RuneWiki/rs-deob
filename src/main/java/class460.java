import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class460 extends class404 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lmr;")
    private class611 field6546 = new class611();

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "Lmr;")
    private class611 field6549 = new class611();

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "Z")
    private boolean field6553;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field6530 = 0;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[I")
    public static int[] field6536 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field6529 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    private int field6525;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    private int field6526;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field6538;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    private int field6547;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    private int field6548;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    private int field6551;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lla;")
    public static class423 field6535;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field6552;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lrg;", line = 3)
    public final class553 method2456(byte arg0) {
        if (arg0 != -63) {
            field6536 = null;
        }
        field6542++;
        return (class553) this.field6546.method3563(arg0 ^ 0xFFFFFFC1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIZIIIII)V", line = 18)
    public static final void method2789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field6537++;
        if (!arg6 || !class416.method2507(arg5, -2113733296)) {
            return;
        }
        if (class313.field4239[arg5] == null) {
            client.method2722(class600.field8524[arg5], -1, arg10, arg9, arg11, arg1, arg8, arg7, arg4, arg0, arg3, arg2);
        } else {
            client.method2722(class313.field4239[arg5], -1, arg10, arg9, arg11, arg1, arg8, arg7, arg4, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)I", line = 37)
    public final int method2459(int arg0) {
        field6527++;
        if (arg0 != -32213) {
            this.method2456((byte) 0);
        }
        return this.field6538;
    }

    @OriginalMember(owner = "client!qe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 48)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6521++;
        int var2 = this.method2790(arg0, (byte) -73);
        if ((var2 & this.field6547) == 0) {
            var2 = this.field6547;
        }
        if ((var2 & 0x1) != 0) {
            this.method2792(arg0.getY(), 3, arg0.getClickCount(), false, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2792(arg0.getY(), 5, arg0.getClickCount(), false, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2792(arg0.getY(), 4, arg0.getClickCount(), false, arg0.getX());
        }
        this.field6547 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 75)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6533++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 86)
    private final int method2790(MouseEvent arg0, byte arg1) {
        field6539++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg1 > -14) {
            this.mouseClicked(null);
        }
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
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

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I", line = 127)
    public final int method2452(int arg0) {
        field6532++;
        if (arg0 > -70) {
            this.mouseReleased(null);
        }
        return this.field6525;
    }

    @OriginalMember(owner = "client!qe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field6541++;
        this.method2793(-31390, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V", line = 148)
    private final void method2791(int arg0) {
        if (arg0 > -34) {
            this.field6549 = null;
        }
        field6543++;
        if (this.field6552 == null) {
            return;
        }
        this.field6552.removeMouseMotionListener(this);
        this.field6552.removeMouseListener(this);
        this.field6546 = null;
        this.field6551 = this.field6548 = this.field6547 = 0;
        this.field6549 = null;
        this.field6552 = null;
        this.field6538 = this.field6525 = this.field6526 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZI)V", line = 170)
    private final void method2792(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6531++;
        if (arg3) {
            return;
        }
        class594 var6 = new class594();
        var6.field8438 = arg0;
        var6.field8440 = arg4;
        var6.field8439 = arg2;
        var6.field8448 = arg1;
        var6.field8441 = class465.method2818(255);
        this.field6549.method3559(var6, (byte) 12);
    }

    @OriginalMember(owner = "client!qe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 191)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6522++;
        int var2 = this.method2790(arg0, (byte) -48);
        if (var2 == 1) {
            this.method2792(arg0.getY(), 0, arg0.getClickCount(), false, arg0.getX());
        } else if (var2 == 4) {
            this.method2792(arg0.getY(), 2, arg0.getClickCount(), false, arg0.getX());
        } else if (var2 == 2) {
            this.method2792(arg0.getY(), 1, arg0.getClickCount(), false, arg0.getX());
        }
        this.field6547 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 218)
    private final void method2793(int arg0, int arg1, int arg2) {
        if (arg0 != -31390) {
            field6536 = null;
        }
        field6523++;
        this.field6548 = arg1;
        this.field6551 = arg2;
        if (this.field6553) {
            this.method2792(arg1, -1, 0, false, arg2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Z", line = 236)
    public final boolean method2454(int arg0) {
        field6524++;
        if (arg0 != -19704) {
            this.method2793(73, -69, -87);
        }
        return (this.field6526 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 252)
    public static void method2794(byte arg0) {
        field6536 = null;
        field6535 = null;
        if (arg0 <= 77) {
            method2794((byte) 49);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z", line = 268)
    public final boolean method2450(int arg0) {
        field6545++;
        int var2 = -114 % ((-arg0 - 13) / 49);
        return (this.field6526 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 280)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2793(-31390, arg0.getY(), arg0.getX());
        field6540++;
    }

    @OriginalMember(owner = "client!qe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 289)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2793(-31390, arg0.getY(), arg0.getX());
        field6520++;
    }

    @OriginalMember(owner = "client!qe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 297)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2793(-31390, arg0.getY(), arg0.getX());
        field6528++;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V", line = 305)
    public final void method2458(int arg0) {
        if (arg0 == 16291) {
            this.method2791(-93);
            field6534++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Z", line = 322)
    public final boolean method2457(int arg0) {
        field6544++;
        if (arg0 != -20117) {
            this.mousePressed(null);
        }
        return (this.field6526 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 336)
    private final void method2795(int arg0, Component arg1) {
        field6550++;
        if (arg0 > 2) {
            this.method2791(-35);
            this.field6552 = arg1;
            this.field6552.addMouseListener(this);
            this.field6552.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 389)
    public class460(Component arg0, boolean arg1) {
        this.method2795(23, arg0);
        this.field6553 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 361)
    public final synchronized void method2453(int arg0) {
        this.field6526 = this.field6547;
        this.field6538 = this.field6551;
        this.field6525 = this.field6548;
        field6519++;
        class611 var2 = this.field6546;
        this.field6546 = this.field6549;
        this.field6549 = var2;
        int var3 = -26 / ((arg0 - 85) / 41);
        this.field6549.method3553(0);
    }
}
