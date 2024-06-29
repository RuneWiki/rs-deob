import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class323 extends class70 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "Lkba;")
    private class108 field4330 = new class108();

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "Lkba;")
    private class108 field4337 = new class108();

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "Z")
    private boolean field4339;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    private int field4331;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    private int field4332;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4338;

    @OriginalMember(owner = "client!fda", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1928(var4, (byte) -127, var2, 6, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!fda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1930(arg0, 2);
        if (var2 == 1) {
            this.method1928(arg0.getClickCount(), (byte) -127, arg0.getX(), 0, arg0.getY());
        } else if (var2 == 4) {
            this.method1928(arg0.getClickCount(), (byte) -107, arg0.getX(), 2, arg0.getY());
        } else if (var2 == 2) {
            this.method1928(arg0.getClickCount(), (byte) -113, arg0.getX(), 1, arg0.getY());
        }
        this.field4336 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "(B)Z")
    public final boolean method524(byte arg0) {
        if (arg0 != -19) {
            this.field4339 = true;
        }
        return (this.field4333 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1930(arg0, 2);
        if ((var2 & this.field4336) == 0) {
            var2 = this.field4336;
        }
        if ((var2 & 0x1) != 0) {
            this.method1928(arg0.getClickCount(), (byte) -111, arg0.getX(), 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method1928(arg0.getClickCount(), (byte) -114, arg0.getX(), 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method1928(arg0.getClickCount(), (byte) -127, arg0.getX(), 4, arg0.getY());
        }
        this.field4336 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "(B)V")
    public final synchronized void method530(byte arg0) {
        this.field4333 = this.field4336;
        this.field4331 = this.field4335;
        this.field4332 = this.field4334;
        class108 var2 = this.field4330;
        this.field4330 = this.field4337;
        this.field4337 = var2;
        if (arg0 < 103) {
            this.field4334 = -46;
        }
        this.field4337.method728((byte) 47);
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)Z")
    public final boolean method526(int arg0) {
        if (arg0 != 1) {
            this.mouseReleased(null);
        }
        return (this.field4333 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(B)I")
    public final int method521(byte arg0) {
        if (arg0 < 24) {
            this.method1929(null, (byte) -4);
        }
        return this.field4331;
    }

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "(I)V")
    public final void method529(int arg0) {
        this.method1931(-87);
        if (arg0 >= -110) {
            this.field4339 = true;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lhfa;")
    public final class314 method522(int arg0) {
        if (arg0 != 600) {
            this.field4334 = -94;
        }
        return (class314) this.field4330.method727(arg0 ^ 0x1B06);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IBIII)V")
    private final void method1928(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class349 var6 = new class349();
        var6.field4633 = arg4;
        var6.field4634 = arg3;
        var6.field4635 = arg2;
        var6.field4636 = class538.method2963(-47);
        var6.field4632 = arg0;
        this.field4337.method725(var6, -20911);
        if (arg1 > -106) {
            this.field4331 = -78;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method1929(Component arg0, byte arg1) {
        this.method1931(arg1 - 153);
        this.field4338 = arg0;
        if (arg1 != 88) {
            this.field4337 = null;
        }
        this.field4338.addMouseListener(this);
        this.field4338.addMouseMotionListener(this);
        this.field4338.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!fda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1932(-11571, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1932(-11571, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1932(-11571, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1932(-11571, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method1930(MouseEvent arg0, int arg1) {
        if (arg1 != 2) {
            return 56;
        } else if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "(I)V")
    private final void method1931(int arg0) {
        if (this.field4338 == null) {
            return;
        }
        this.field4338.removeMouseWheelListener(this);
        this.field4338.removeMouseMotionListener(this);
        this.field4338.removeMouseListener(this);
        this.field4337 = null;
        this.field4334 = this.field4335 = this.field4336 = 0;
        int var2 = 107 / ((43 - arg0) / 39);
        this.field4332 = this.field4331 = this.field4333 = 0;
        this.field4338 = null;
        this.field4330 = null;
    }

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "(I)I")
    public final int method528(int arg0) {
        if (arg0 <= 4) {
            this.field4331 = 117;
        }
        return this.field4332;
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(III)V")
    private final void method1932(int arg0, int arg1, int arg2) {
        this.field4335 = arg2;
        this.field4334 = arg1;
        if (arg0 != -11571) {
            this.field4332 = 31;
        }
        if (this.field4339) {
            this.method1928(0, (byte) -125, arg1, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z")
    public final boolean method520(byte arg0) {
        int var2 = -116 / ((72 - arg0) / 35);
        return (this.field4333 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class323(Component arg0, boolean arg1) {
        this.method1929(arg0, (byte) 88);
        this.field4339 = arg1;
    }
}
