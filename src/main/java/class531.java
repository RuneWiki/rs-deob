import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class531 extends class647 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "Leea;")
    private class114 field7681 = new class114();

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "Leea;")
    private class114 field7694 = new class114();

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Z")
    private boolean field7696;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field7692 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    private int field7682;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    private int field7687;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    private int field7689;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    private int field7690;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    private int field7691;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    private int field7693;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field7695;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method781(int arg0) {
        field7667++;
        if (arg0 < 118) {
            return false;
        } else {
            return (this.field7689 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 19)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7669++;
        int var2 = this.method3112(0, arg0);
        if (var2 == 1) {
            this.method3110(arg0.getX(), 0, 115, arg0.getY());
        } else if (var2 == 4) {
            this.method3110(arg0.getX(), 2, -100, arg0.getY());
        } else if (var2 == 2) {
            this.method3110(arg0.getX(), 1, 115, arg0.getY());
        }
        this.field7693 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I", line = 49)
    public final int method777(byte arg0) {
        int var2 = 69 % ((arg0 + 3) / 41);
        field7672++;
        return this.field7687;
    }

    @OriginalMember(owner = "client!ji", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 59)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field7666++;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 72)
    private final void method3109(int arg0) {
        if (arg0 != 15107) {
            this.field7690 = -119;
        }
        field7679++;
        if (this.field7695 == null) {
            return;
        }
        this.field7695.removeMouseMotionListener(this);
        this.field7695.removeMouseListener(this);
        this.field7681 = null;
        this.field7682 = this.field7687 = this.field7689 = 0;
        this.field7694 = null;
        this.field7695 = null;
        this.field7691 = this.field7690 = this.field7693 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 95)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field7671++;
        this.method3114((byte) -107, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V", line = 103)
    private final void method3110(int arg0, int arg1, int arg2, int arg3) {
        field7685++;
        class366 var5 = new class366();
        var5.field5536 = arg1;
        var5.field5531 = arg3;
        var5.field5535 = arg0;
        var5.field5533 = class84.method550((byte) -87);
        int var6 = -118 % ((arg2 - 80) / 35);
        this.field7694.method706(var5, true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 119)
    private final void method3111(int arg0, Component arg1) {
        field7684++;
        this.method3109(15107);
        this.field7695 = arg1;
        this.field7695.addMouseListener(this);
        this.field7695.addMouseMotionListener(this);
        if (arg0 < 44) {
            this.field7682 = 79;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Lhl;", line = 135)
    public final class458 method780(boolean arg0) {
        field7680++;
        if (arg0) {
            this.field7691 = -9;
        }
        return (class458) this.field7681.method714(true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 146)
    private final int method3112(int arg0, MouseEvent arg1) {
        field7664++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != arg0;
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

    @OriginalMember(owner = "client!ji", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 179)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field7670++;
        this.method3114((byte) -89, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ji", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 187)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7674++;
        int var2 = this.method3112(0, arg0);
        if ((var2 & this.field7693) == 0) {
            var2 = this.field7693;
        }
        if ((var2 & 0x1) != 0) {
            this.method3110(arg0.getX(), 3, 126, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method3110(arg0.getX(), 5, -48, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method3110(arg0.getX(), 4, 118, arg0.getY());
        }
        this.field7693 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Z", line = 215)
    public final boolean method785(int arg0) {
        if (arg0 < 50) {
            return false;
        } else {
            field7683++;
            return (this.field7689 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V", line = 228)
    public final synchronized void method779(int arg0) {
        this.field7687 = this.field7690;
        this.field7682 = this.field7691;
        field7665++;
        this.field7689 = this.field7693;
        class114 var2 = this.field7681;
        if (arg0 <= -58) {
            this.field7681 = this.field7694;
            this.field7694 = var2;
            this.field7694.method718(-114);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z", line = 252)
    public final boolean method782(byte arg0) {
        if (arg0 != -5) {
            this.method779(-10);
        }
        field7677++;
        return (this.field7689 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)Z", line = 263)
    public static final boolean method3113(int arg0, int arg1, int arg2) {
        field7676++;
        if (arg0 <= 92) {
            return false;
        } else {
            return (arg1 & 0x84080) != 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 275)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field7688++;
        this.method3114((byte) -73, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I", line = 283)
    public final int method778(int arg0) {
        field7675++;
        if (arg0 != 6) {
            this.field7695 = null;
        }
        return this.field7682;
    }

    @OriginalMember(owner = "client!ji", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 294)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7686++;
        this.method3114((byte) -79, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 355)
    public class531(Component arg0, boolean arg1) {
        this.method3111(78, arg0);
        this.field7696 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V", line = 322)
    private final void method3114(byte arg0, int arg1, int arg2) {
        if (arg0 >= -66) {
            this.mouseMoved(null);
        }
        this.field7691 = arg2;
        field7678++;
        this.field7690 = arg1;
        if (this.field7696) {
            this.method3110(arg2, -1, -78, arg1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 339)
    public final void method787(int arg0) {
        this.method3109(15107);
        field7673++;
        if (arg0 != 6) {
            this.field7687 = -113;
        }
    }
}
