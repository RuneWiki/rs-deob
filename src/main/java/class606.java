import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class606 extends class522 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "Low;")
    private class665 field8603 = new class665();

    @OriginalMember(owner = "client!aca", name = "L", descriptor = "Low;")
    private class665 field8621 = new class665();

    @OriginalMember(owner = "client!aca", name = "O", descriptor = "Z")
    private boolean field8624;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    private int field8598;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    private int field8599;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    private int field8602;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!aca", name = "C", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!aca", name = "D", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!aca", name = "H", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!aca", name = "I", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
    private int field8619;

    @OriginalMember(owner = "client!aca", name = "K", descriptor = "I")
    private int field8620;

    @OriginalMember(owner = "client!aca", name = "M", descriptor = "I")
    private int field8622;

    @OriginalMember(owner = "client!aca", name = "G", descriptor = "Ljba;")
    public static class158 field8616;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "Lrt;")
    public static class470 field8600;

    @OriginalMember(owner = "client!aca", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field8623;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "(I)I", line = 4)
    public final int method3065(int arg0) {
        field8617++;
        if (arg0 != -28062) {
            this.field8603 = null;
        }
        return this.field8598;
    }

    @OriginalMember(owner = "client!aca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 17)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3519(92, arg0.getY(), arg0.getX());
        field8601++;
    }

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "(I)V", line = 25)
    public static void method3514(int arg0) {
        field8616 = null;
        if (arg0 == -2) {
            field8600 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 38)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field8610++;
        int var2 = this.method3518(arg0, (byte) -34);
        if ((var2 & this.field8622) == 0) {
            var2 = this.field8622;
        }
        if ((var2 & 0x1) != 0) {
            this.method3516(arg0.getClickCount(), 3, arg0.getX(), true, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method3516(arg0.getClickCount(), 5, arg0.getX(), true, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method3516(arg0.getClickCount(), 4, arg0.getX(), true, arg0.getY());
        }
        this.field8622 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 66)
    private final void method3515(Component arg0, int arg1) {
        if (arg1 != 0) {
            this.field8598 = 5;
        }
        this.method3517(true);
        field8614++;
        this.field8623 = arg0;
        this.field8623.addMouseListener(this);
        this.field8623.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)Z", line = 84)
    public final boolean method3063(int arg0) {
        field8608++;
        if (arg0 == -1) {
            return (this.field8599 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIZI)V", line = 95)
    private final void method3516(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.method3515(null, -49);
        }
        field8595++;
        class297 var6 = new class297();
        var6.field4317 = arg2;
        var6.field4308 = arg4;
        var6.field4310 = arg1;
        var6.field4309 = arg0;
        var6.field4314 = class337.method2062(false);
        this.field8621.method3728((byte) 122, var6);
    }

    @OriginalMember(owner = "client!aca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 114)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field8592++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 127)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field8593++;
        this.method3519(106, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V", line = 135)
    private final void method3517(boolean arg0) {
        field8609++;
        if (this.field8623 == null) {
            return;
        }
        this.field8623.removeMouseMotionListener(this);
        this.field8623.removeMouseListener(this);
        this.field8623 = null;
        this.field8621 = null;
        this.field8620 = this.field8619 = this.field8622 = 0;
        if (!arg0) {
            this.mouseExited(null);
        }
        this.field8603 = null;
        this.field8598 = this.field8602 = this.field8599 = 0;
    }

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)Luaa;", line = 159)
    public final class453 method3069(int arg0) {
        if (arg0 == -1) {
            field8597++;
            return (class453) this.field8603.method3726(arg0 ^ 0xFFFFCE6C);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)Z", line = 173)
    public final boolean method3064(int arg0) {
        field8604++;
        int var2 = -124 / ((24 - arg0) / 32);
        return (this.field8599 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "(I)V", line = 183)
    public final synchronized void method3068(int arg0) {
        field8596++;
        this.field8598 = this.field8620;
        this.field8599 = this.field8622;
        if (arg0 != -1) {
            return;
        }
        this.field8602 = this.field8619;
        class665 var2 = this.field8603;
        this.field8603 = this.field8621;
        this.field8621 = var2;
        this.field8621.method3735(-4676);
    }

    @OriginalMember(owner = "client!aca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 206)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3519(94, arg0.getY(), arg0.getX());
        field8606++;
    }

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)I", line = 214)
    public final int method3066(int arg0) {
        if (arg0 == 72) {
            field8594++;
            return this.field8602;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)Z", line = 232)
    public final boolean method3070(byte arg0) {
        int var2 = -82 / ((29 - arg0) / 42);
        field8618++;
        return (this.field8599 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!aca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 243)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field8605++;
        int var2 = this.method3518(arg0, (byte) -34);
        if (var2 == 1) {
            this.method3516(arg0.getClickCount(), 0, arg0.getX(), true, arg0.getY());
        } else if (var2 == 4) {
            this.method3516(arg0.getClickCount(), 2, arg0.getX(), true, arg0.getY());
        } else if (var2 == 2) {
            this.method3516(arg0.getClickCount(), 1, arg0.getX(), true, arg0.getY());
        }
        this.field8622 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 268)
    private final int method3518(MouseEvent arg0, byte arg1) {
        if (arg1 != -34) {
            this.method3070((byte) -123);
        }
        field8613++;
        int var3 = arg0.getModifiers();
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

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)V", line = 304)
    private final void method3519(int arg0, int arg1, int arg2) {
        this.field8619 = arg1;
        field8612++;
        this.field8620 = arg2;
        if (arg0 > 90 && this.field8624) {
            this.method3516(0, -1, arg2, true, arg1);
        }
    }

    @OriginalMember(owner = "client!aca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 322)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3519(120, arg0.getY(), arg0.getX());
        field8615++;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V", line = 330)
    public final void method3062(int arg0) {
        this.method3517(true);
        field8607++;
        if (arg0 > -125) {
            field8616 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 355)
    public class606(Component arg0, boolean arg1) {
        this.method3515(arg0, 0);
        this.field8624 = arg1;
    }
}
