import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class436 extends class14 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lsu;")
    private class192 field6149 = new class192();

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lsu;")
    private class192 field6154 = new class192();

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Z")
    private boolean field6158;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    private int field6150;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    private int field6152;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    private int field6153;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    private int field6156;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field6157;

    @OriginalMember(owner = "client!gk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2503(-1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBIII)V", line = 11)
    private final void method2501(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 27) {
            return;
        }
        class241 var6 = new class241();
        var6.field3457 = arg2;
        var6.field3459 = arg3;
        var6.field3458 = arg0;
        var6.field3456 = class680.method3756(-54);
        var6.field3455 = arg4;
        this.field6154.method1273(var6, (byte) 122);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 28)
    public final synchronized void method62(int arg0) {
        this.field6151 = this.field6156;
        this.field6150 = this.field6153;
        this.field6152 = this.field6155;
        class192 var2 = this.field6149;
        int var3 = -117 % ((arg0 + 32) / 51);
        this.field6149 = this.field6154;
        this.field6154 = var2;
        this.field6154.method1269((byte) 114);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I", line = 48)
    public final int method66(int arg0) {
        return arg0 == 74 ? this.field6151 : 91;
    }

    @OriginalMember(owner = "client!gk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 58)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2503(-1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 65)
    private final void method2502(Component arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        this.method2505(0);
        this.field6157 = arg0;
        this.field6157.addMouseListener(this);
        this.field6157.addMouseMotionListener(this);
        this.field6157.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 83)
    private final void method2503(int arg0, int arg1, int arg2) {
        this.field6156 = arg1;
        this.field6155 = arg2;
        if (arg0 != -1) {
            this.method72(-67);
        }
        if (this.field6158) {
            this.method2501(arg1, (byte) 60, -1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 100)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2504(arg0, -1);
        if (var2 == 1) {
            this.method2501(arg0.getY(), (byte) 40, 0, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method2501(arg0.getY(), (byte) 44, 2, arg0.getX(), 0);
        } else if (var2 == 2) {
            this.method2501(arg0.getY(), (byte) 54, 1, arg0.getX(), 0);
        }
        this.field6153 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 123)
    private final int method2504(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            if (arg1 != -1) {
                this.field6151 = 80;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)Lqea;", line = 149)
    public final class113 method72(int arg0) {
        if (arg0 != -49) {
            this.field6154 = null;
        }
        return (class113) this.field6149.method1272(0);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)I", line = 161)
    public final int method70(byte arg0) {
        int var2 = -94 % ((arg0 - 37) / 45);
        return this.field6152;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)Z", line = 169)
    public final boolean method65(byte arg0) {
        if (arg0 <= 2) {
            return true;
        } else {
            return (this.field6150 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 180)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2501(var3, (byte) 51, 6, var2, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!gk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 194)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z", line = 204)
    public final boolean method63(byte arg0) {
        int var2 = -72 / ((arg0 - 68) / 55);
        return (this.field6150 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2503(-1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!gk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 219)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2503(-1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!gk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 230)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2504(arg0, -1);
        if ((var2 & this.field6153) == 0) {
            var2 = this.field6153;
        }
        if ((var2 & 0x1) != 0) {
            this.method2501(arg0.getY(), (byte) 28, 3, arg0.getX(), 0);
        }
        if ((var2 & 0x4) != 0) {
            this.method2501(arg0.getY(), (byte) 48, 5, arg0.getX(), 0);
        }
        if ((var2 & 0x2) != 0) {
            this.method2501(arg0.getY(), (byte) 100, 4, arg0.getX(), 0);
        }
        this.field6153 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V", line = 257)
    private final void method2505(int arg0) {
        if (this.field6157 == null) {
            return;
        }
        this.field6157.removeMouseWheelListener(this);
        this.field6157.removeMouseMotionListener(this);
        this.field6157.removeMouseListener(this);
        this.field6157 = null;
        this.field6152 = this.field6151 = this.field6150 = 0;
        this.field6155 = this.field6156 = this.field6153 = arg0;
        this.field6154 = null;
        this.field6149 = null;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V", line = 276)
    public final void method73(byte arg0) {
        this.method2505(0);
        if (arg0 != -25) {
            this.method2503(50, -76, 18);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 307)
    public class436(Component arg0, boolean arg1) {
        this.method2502(arg0, true);
        this.field6158 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)Z", line = 293)
    public final boolean method71(int arg0) {
        if (arg0 < 101) {
            this.mouseClicked(null);
        }
        return (this.field6150 & 0x4) != 0;
    }
}
