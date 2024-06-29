import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class446 extends class520 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "Lor;")
    private class594 field6756 = new class594();

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "Lor;")
    private class594 field6761 = new class594();

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "Z")
    private boolean field6763;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    private int field6754;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
    private int field6758;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "I")
    private int field6759;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
    private int field6760;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field6762;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BII)V")
    private final void method2803(byte arg0, int arg1, int arg2) {
        this.field6759 = arg2;
        this.field6760 = arg1;
        if (this.field6763) {
            this.method2804(-1, 66, arg2, 0, arg1);
        }
        if (arg0 != 68) {
            this.field6760 = -11;
        }
    }

    @OriginalMember(owner = "client!cga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2803((byte) 68, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIII)V")
    private final void method2804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class554 var6 = new class554();
        if (arg1 < 40) {
            return;
        }
        var6.field8022 = arg2;
        var6.field8023 = arg0;
        var6.field8020 = arg4;
        var6.field8019 = class112.method1033(-11752);
        var6.field8021 = arg3;
        this.field6761.method3463((byte) -87, var6);
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)I")
    public final int method451(int arg0) {
        if (arg0 != 1196) {
            this.field6758 = 118;
        }
        return this.field6755;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Lvfa;")
    public final class623 method448(byte arg0) {
        return arg0 == -21 ? (class623) this.field6756.method3471(0) : (class623) null;
    }

    @OriginalMember(owner = "client!cga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        this.method2806(15535);
        if (arg0 != -1846698589) {
            this.method454(12);
        }
    }

    @OriginalMember(owner = "client!cga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2805(0, arg0);
        if ((this.field6758 & var2) == 0) {
            var2 = this.field6758;
        }
        if ((var2 & 0x1) != 0) {
            this.method2804(3, 121, arg0.getX(), arg0.getClickCount(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2804(5, 49, arg0.getX(), arg0.getClickCount(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2804(4, 75, arg0.getX(), arg0.getClickCount(), arg0.getY());
        }
        this.field6758 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2805(int arg0, MouseEvent arg1) {
        if (arg0 != 0) {
            this.method460((byte) 14);
        }
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2803((byte) 68, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!cga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2805(0, arg0);
        if (var2 == 1) {
            this.method2804(0, 50, arg0.getX(), arg0.getClickCount(), arg0.getY());
        } else if (var2 == 4) {
            this.method2804(2, 59, arg0.getX(), arg0.getClickCount(), arg0.getY());
        } else if (var2 == 2) {
            this.method2804(1, 99, arg0.getX(), arg0.getClickCount(), arg0.getY());
        }
        this.field6758 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
    public final synchronized void method447(int arg0) {
        this.field6755 = this.field6759;
        this.field6757 = this.field6760;
        this.field6754 = this.field6758;
        class594 var2 = this.field6756;
        this.field6756 = this.field6761;
        this.field6761 = var2;
        if (arg0 > 63) {
            this.field6761.method3474(22090);
        }
    }

    @OriginalMember(owner = "client!cga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2804(6, 116, var2, var4, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        if (arg0 < 93) {
            this.method2803((byte) 55, 93, 42);
        }
        return (this.field6754 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)I")
    public final int method454(int arg0) {
        int var2 = -2 % ((arg0 - 6) / 36);
        return this.field6757;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)Z")
    public final boolean method460(byte arg0) {
        int var2 = 112 % ((arg0 + 56) / 41);
        return (this.field6754 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "(I)V")
    private final void method2806(int arg0) {
        if (this.field6762 == null) {
            return;
        }
        this.field6762.removeMouseWheelListener(this);
        this.field6762.removeMouseMotionListener(this);
        this.field6762.removeMouseListener(this);
        this.field6761 = null;
        if (arg0 != 15535) {
            this.method462(63);
        }
        this.field6762 = null;
        this.field6755 = this.field6757 = this.field6754 = 0;
        this.field6756 = null;
        this.field6759 = this.field6760 = this.field6758 = 0;
    }

    @OriginalMember(owner = "client!cga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2803((byte) 68, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!cga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2803((byte) 68, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)Z")
    public final boolean method462(int arg0) {
        int var2 = -11 % ((54 - arg0) / 58);
        return (this.field6754 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2807(Component arg0, int arg1) {
        this.method2806(15535);
        this.field6762 = arg0;
        this.field6762.addMouseListener(this);
        this.field6762.addMouseMotionListener(this);
        this.field6762.addMouseWheelListener(this);
        if (arg1 != 0) {
            this.field6757 = -68;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class446(Component arg0, boolean arg1) {
        this.method2807(arg0, 0);
        this.field6763 = arg1;
    }
}
