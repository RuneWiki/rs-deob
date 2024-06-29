import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class160 extends class474 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "Lgj;")
    private class593 field2537 = new class593();

    @OriginalMember(owner = "client!tca", name = "A", descriptor = "Lgj;")
    private class593 field2538 = new class593();

    @OriginalMember(owner = "client!tca", name = "F", descriptor = "Z")
    private boolean field2543;

    @OriginalMember(owner = "client!tca", name = "y", descriptor = "Llj;")
    public static class570 field2536 = new class570(9, 0, 4, 1);

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    private int field2518;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
    private int field2539;

    @OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!tca", name = "D", descriptor = "I")
    private int field2541;

    @OriginalMember(owner = "client!tca", name = "E", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!tca", name = "G", descriptor = "Ljava/awt/Component;")
    private Component field2544;

    @OriginalMember(owner = "client!tca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2525++;
        this.method1116(-1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)Z", line = 17)
    public final boolean method1105(boolean arg0) {
        field2517++;
        if (arg0) {
            this.field2522 = -81;
        }
        return (this.field2531 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V", line = 28)
    private final void method1116(int arg0, int arg1, int arg2) {
        this.field2540 = arg2;
        if (arg0 != -1) {
            return;
        }
        field2529++;
        this.field2539 = arg1;
        if (this.field2543) {
            this.method1121(arg2, -1, arg1, true);
        }
    }

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)V", line = 47)
    public final synchronized void method1104(int arg0) {
        this.field2531 = this.field2541;
        this.field2518 = this.field2540;
        this.field2522 = this.field2539;
        field2532++;
        class593 var2 = this.field2537;
        this.field2537 = this.field2538;
        this.field2538 = var2;
        this.field2538.method3255((byte) -75);
        int var3 = -80 / ((arg0 - 68) / 51);
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(Z)V", line = 70)
    public static void method1117(boolean arg0) {
        if (!arg0) {
            field2536 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 81)
    private final void method1118(Component arg0, int arg1) {
        if (arg1 != 4) {
            this.field2540 = -124;
        }
        field2527++;
        this.method1120(0);
        this.field2544 = arg0;
        this.field2544.addMouseListener(this);
        this.field2544.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Lhca;", line = 95)
    public final class458 method1107(byte arg0) {
        field2533++;
        return arg0 > -67 ? null : (class458) this.field2537.method3262(-123);
    }

    @OriginalMember(owner = "client!tca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 108)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1116(-1, arg0.getY(), arg0.getX());
        field2528++;
    }

    @OriginalMember(owner = "client!tca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 116)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2520++;
        int var2 = this.method1119((byte) 68, arg0);
        if ((var2 & this.field2541) == 0) {
            var2 = this.field2541;
        }
        if ((var2 & 0x1) != 0) {
            this.method1121(arg0.getX(), 3, arg0.getY(), true);
        }
        if ((var2 & 0x4) != 0) {
            this.method1121(arg0.getX(), 5, arg0.getY(), true);
        }
        if ((var2 & 0x2) != 0) {
            this.method1121(arg0.getX(), 4, arg0.getY(), true);
        }
        this.field2541 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)Z", line = 145)
    public final boolean method1103(byte arg0) {
        int var2 = -39 % ((arg0 + 47) / 48);
        field2513++;
        return (this.field2531 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 155)
    public final void method1106(int arg0) {
        this.method1120(0);
        field2534++;
        if (arg0 != 30641) {
            this.method1104(67);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)I", line = 166)
    public final int method1113(int arg0) {
        if (arg0 != -6387) {
            this.method1106(123);
        }
        field2524++;
        return this.field2522;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)I", line = 179)
    public final int method1110(byte arg0) {
        field2523++;
        return arg0 == 91 ? this.field2518 : -96;
    }

    @OriginalMember(owner = "client!tca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 194)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field2521++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 205)
    private final int method1119(byte arg0, MouseEvent arg1) {
        field2526++;
        int var3 = arg1.getModifiers();
        if (arg0 <= 47) {
            return -18;
        }
        boolean var4 = (var3 & 0x10) != 0;
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

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Z", line = 247)
    public final boolean method1109(int arg0) {
        field2515++;
        if (arg0 == 27726) {
            return (this.field2531 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 258)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1116(-1, arg0.getY(), arg0.getX());
        field2535++;
    }

    @OriginalMember(owner = "client!tca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 266)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1116(-1, arg0.getY(), arg0.getX());
        field2516++;
    }

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)V", line = 276)
    private final void method1120(int arg0) {
        field2519++;
        if (this.field2544 == null) {
            return;
        }
        this.field2544.removeMouseMotionListener(this);
        this.field2544.removeMouseListener(this);
        this.field2538 = null;
        this.field2518 = this.field2522 = this.field2531 = 0;
        this.field2544 = null;
        this.field2537 = null;
        this.field2540 = this.field2539 = this.field2541 = arg0;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIZ)V", line = 295)
    private final void method1121(int arg0, int arg1, int arg2, boolean arg3) {
        field2514++;
        class271 var5 = new class271();
        var5.field3777 = arg1;
        if (arg3) {
            var5.field3774 = arg0;
            var5.field3772 = arg2;
            var5.field3771 = class681.method3802(-23600);
            this.field2538.method3265(var5, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!tca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 312)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2530++;
        int var2 = this.method1119((byte) 104, arg0);
        if (var2 == 1) {
            this.method1121(arg0.getX(), 0, arg0.getY(), true);
        } else if (var2 == 4) {
            this.method1121(arg0.getX(), 2, arg0.getY(), true);
        } else if (var2 == 2) {
            this.method1121(arg0.getX(), 1, arg0.getY(), true);
        }
        this.field2541 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 353)
    public class160(Component arg0, boolean arg1) {
        this.method1118(arg0, 4);
        this.field2543 = arg1;
    }
}
