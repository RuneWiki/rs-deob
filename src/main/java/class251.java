import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class251 extends class392 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Lbu;")
    private class19 field3590 = new class19();

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "Lbu;")
    private class19 field3614 = new class19();

    @OriginalMember(owner = "client!mu", name = "K", descriptor = "Z")
    private boolean field3618;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Lh;")
    public static class572 field3601 = new class572("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    private int field3612;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "I")
    private int field3613;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!mu", name = "J", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "Ljava/awt/Component;")
    private Component field3616;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)Lqw;")
    public final class68 method1585(byte arg0) {
        field3588++;
        if (arg0 != 14) {
            this.mouseMoved(null);
        }
        return (class68) this.field3590.method128(936);
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(B)V")
    public static void method1586(byte arg0) {
        field3601 = null;
        if (arg0 != 54) {
            field3601 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)I")
    public final int method1587(byte arg0) {
        int var2 = 119 / ((arg0 + 78) / 32);
        field3592++;
        return this.field3608;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(IIII)V")
    private final void method1588(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 20) {
            return;
        }
        field3607++;
        class255 var5 = new class255();
        var5.field3668 = arg3;
        var5.field3672 = arg1;
        var5.field3667 = arg0;
        var5.field3670 = class598.method3538(true);
        this.field3614.method131(var5, 0);
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)Z")
    public final boolean method1589(int arg0) {
        if (arg0 != 27928) {
            this.method1595(false);
        }
        field3603++;
        return (this.field3610 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
    private final void method1590(int arg0, int arg1, int arg2) {
        this.field3615 = arg2;
        this.field3612 = arg0;
        if (arg1 >= 27) {
            field3597++;
            if (this.field3618) {
                this.method1588(arg0, -1, 122, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public final synchronized void method1591(int arg0) {
        this.field3608 = this.field3615;
        field3599++;
        if (arg0 != 1310982144) {
            return;
        }
        this.field3589 = this.field3612;
        this.field3610 = this.field3613;
        class19 var2 = this.field3590;
        this.field3590 = this.field3614;
        this.field3614 = var2;
        this.field3614.method122((byte) 14);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method1592(byte arg0, MouseEvent arg1) {
        field3611++;
        int var3 = arg1.getModifiers();
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
            int var7 = 61 / ((arg0 + 31) / 35);
            return 0;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method1593(Component arg0, byte arg1) {
        this.method1598((byte) -84);
        int var3 = 85 / ((-arg1 - 68) / 57);
        field3591++;
        this.field3616 = arg0;
        this.field3616.addMouseListener(this);
        this.field3616.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!mu", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3587++;
        int var2 = this.method1592((byte) 95, arg0);
        if ((this.field3613 & var2) == 0) {
            var2 = this.field3613;
        }
        if ((var2 & 0x1) != 0) {
            this.method1588(arg0.getY(), 3, 53, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1588(arg0.getY(), 5, 124, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1588(arg0.getY(), 4, 57, arg0.getX());
        }
        this.field3613 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
    public final int method1594(int arg0) {
        field3594++;
        if (arg0 != 2028208128) {
            this.field3612 = 91;
        }
        return this.field3589;
    }

    @OriginalMember(owner = "client!mu", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1590(arg0.getY(), 119, arg0.getX());
        field3606++;
    }

    @OriginalMember(owner = "client!mu", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field3600++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mu", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1590(arg0.getY(), 36, arg0.getX());
        field3595++;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)Z")
    public final boolean method1595(boolean arg0) {
        if (!arg0) {
            this.mousePressed(null);
        }
        field3605++;
        return (this.field3610 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1590(arg0.getY(), 78, arg0.getX());
        field3593++;
    }

    @OriginalMember(owner = "client!mu", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1590(arg0.getY(), 93, arg0.getX());
        field3604++;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
    public final void method1596(byte arg0) {
        this.method1598((byte) -112);
        if (arg0 < 54) {
            this.field3618 = true;
        }
        field3609++;
    }

    @OriginalMember(owner = "client!mu", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3596++;
        int var2 = this.method1592((byte) -94, arg0);
        if (var2 == 1) {
            this.method1588(arg0.getY(), 0, 81, arg0.getX());
        } else if (var2 == 4) {
            this.method1588(arg0.getY(), 2, 68, arg0.getX());
        } else if (var2 == 2) {
            this.method1588(arg0.getY(), 1, 27, arg0.getX());
        }
        this.field3613 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)Z")
    public final boolean method1597(byte arg0) {
        if (arg0 < 75) {
            this.mousePressed(null);
        }
        field3598++;
        return (this.field3610 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "(B)V")
    private final void method1598(byte arg0) {
        field3602++;
        if (this.field3616 == null) {
            return;
        }
        this.field3616.removeMouseMotionListener(this);
        this.field3616.removeMouseListener(this);
        this.field3615 = this.field3612 = this.field3613 = 0;
        this.field3616 = null;
        if (arg0 < -70) {
            this.field3608 = this.field3589 = this.field3610 = 0;
            this.field3614 = null;
            this.field3590 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class251(Component arg0, boolean arg1) {
        this.method1593(arg0, (byte) -127);
        this.field3618 = arg1;
    }
}
