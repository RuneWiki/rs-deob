import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class252 extends class779 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "Lqw;")
    private class84 field3684 = new class84();

    @OriginalMember(owner = "client!tea", name = "G", descriptor = "Lqw;")
    private class84 field3708 = new class84();

    @OriginalMember(owner = "client!tea", name = "I", descriptor = "Z")
    private boolean field3710;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "[I")
    public static int[] field3683 = new int[8];

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    private int field3693;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!tea", name = "C", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
    private int field3707;

    @OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!tea", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field3711;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)I")
    public final int method1652(int arg0) {
        field3701++;
        return arg0 == 0 ? this.field3702 : 24;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)Ltaa;")
    public final class428 method1653(int arg0) {
        if (arg0 == -7049) {
            field3703++;
            return (class428) this.field3684.method687((byte) -72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1665(arg0.getX(), arg0.getY(), 84);
        field3699++;
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)Z")
    public final boolean method1654(int arg0) {
        if (arg0 == 0) {
            field3681++;
            return (this.field3696 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)Z")
    public final boolean method1655(int arg0) {
        field3688++;
        if (arg0 <= 106) {
            this.field3693 = 110;
        }
        return (this.field3696 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method1656(Component arg0, boolean arg1) {
        field3694++;
        if (!arg1) {
            this.method1662(-116);
            this.field3711 = arg0;
            this.field3711.addMouseListener(this);
            this.field3711.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public final void method1657(byte arg0) {
        int var2 = -18 % ((-arg0 - 33) / 60);
        field3695++;
        this.method1662(30);
    }

    @OriginalMember(owner = "client!tea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1665(arg0.getX(), arg0.getY(), 56);
        field3682++;
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)V")
    public final synchronized void method1658(int arg0) {
        field3686++;
        this.field3693 = this.field3709;
        this.field3702 = this.field3706;
        this.field3696 = this.field3707;
        if (arg0 != 0) {
            this.method1662(-96);
        }
        class84 var2 = this.field3684;
        this.field3684 = this.field3708;
        this.field3708 = var2;
        this.field3708.method690(20134);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IBIII)V")
    private final void method1659(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = -3 / ((arg1 + 23) / 62);
        field3685++;
        class502 var7 = new class502();
        var7.field7068 = arg0;
        var7.field7058 = arg4;
        var7.field7056 = arg3;
        var7.field7069 = arg2;
        var7.field7067 = class401.method2440(false);
        this.field3708.method689(var7, 126);
    }

    @OriginalMember(owner = "client!tea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3692++;
        int var2 = this.method1664(arg0, true);
        if ((var2 & this.field3707) == 0) {
            var2 = this.field3707;
        }
        if ((var2 & 0x1) != 0) {
            this.method1659(arg0.getClickCount(), (byte) 70, 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1659(arg0.getClickCount(), (byte) -88, 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1659(arg0.getClickCount(), (byte) 108, 4, arg0.getY(), arg0.getX());
        }
        this.field3707 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "(I)V")
    public static void method1660(int arg0) {
        if (arg0 != -28933) {
            field3683 = null;
        }
        field3683 = null;
    }

    @OriginalMember(owner = "client!tea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3704++;
        this.method1665(arg0.getX(), arg0.getY(), 109);
    }

    @OriginalMember(owner = "client!tea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3687++;
        this.method1665(arg0.getX(), arg0.getY(), 103);
    }

    @OriginalMember(owner = "client!tea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3697++;
        int var2 = this.method1664(arg0, true);
        if (var2 == 1) {
            this.method1659(arg0.getClickCount(), (byte) 40, 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method1659(arg0.getClickCount(), (byte) 92, 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method1659(arg0.getClickCount(), (byte) -95, 1, arg0.getY(), arg0.getX());
        }
        this.field3707 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)Z")
    public final boolean method1661(byte arg0) {
        field3700++;
        int var2 = -69 % ((88 - arg0) / 38);
        return (this.field3696 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "(I)V")
    private final void method1662(int arg0) {
        field3690++;
        if (this.field3711 == null) {
            return;
        }
        this.field3711.removeMouseMotionListener(this);
        this.field3711.removeMouseListener(this);
        int var2 = 53 % ((-arg0 - 26) / 49);
        this.field3684 = null;
        this.field3708 = null;
        this.field3702 = this.field3693 = this.field3696 = 0;
        this.field3711 = null;
        this.field3706 = this.field3709 = this.field3707 = 0;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)I")
    public final int method1663(byte arg0) {
        field3698++;
        if (arg0 < 112) {
            this.field3711 = null;
        }
        return this.field3693;
    }

    @OriginalMember(owner = "client!tea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field3691++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
    private final int method1664(MouseEvent arg0, boolean arg1) {
        field3689++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        }
        if (!arg1) {
            this.field3693 = 29;
        }
        if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V")
    private final void method1665(int arg0, int arg1, int arg2) {
        if (arg2 < 42) {
            this.field3696 = -103;
        }
        field3705++;
        this.field3706 = arg0;
        this.field3709 = arg1;
        if (this.field3710) {
            this.method1659(0, (byte) 78, -1, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class252(Component arg0, boolean arg1) {
        this.method1656(arg0, false);
        this.field3710 = arg1;
    }
}
