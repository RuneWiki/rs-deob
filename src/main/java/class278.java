import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class278 extends class787 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "Lifa;")
    private class450 field3250 = new class450();

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "Lifa;")
    private class450 field3255 = new class450();

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "Z")
    private boolean field3257;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    private int field3254;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field3258;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "(B)V", line = 4)
    public final void method119(byte arg0) {
        if (arg0 > -8) {
            this.field3257 = true;
        }
        this.method1617(28509);
    }

    @OriginalMember(owner = "client!oca", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 16)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1614(var4, var3, 6, (byte) -5, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)Lgn;", line = 29)
    public final class730 method111(int arg0) {
        if (arg0 <= 47) {
            this.mouseExited(null);
        }
        return (class730) this.field3250.method2730(-31260);
    }

    @OriginalMember(owner = "client!oca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1613(arg0.getY(), arg0.getX(), 100);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)I", line = 46)
    public final int method117(boolean arg0) {
        return arg0 ? this.field3252 : -107;
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)Z", line = 56)
    public final boolean method113(byte arg0) {
        if (arg0 != -41) {
            this.field3252 = 61;
        }
        return (this.field3249 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 66)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1613(arg0.getY(), arg0.getX(), 100);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Z", line = 73)
    public final boolean method110(int arg0) {
        if (arg0 == 10997) {
            return (this.field3249 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V", line = 83)
    private final void method1613(int arg0, int arg1, int arg2) {
        this.field3254 = arg1;
        int var4 = -69 / ((41 - arg2) / 51);
        this.field3253 = arg0;
        if (this.field3257) {
            this.method1614(0, arg0, -1, (byte) -5, arg1);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIBI)V", line = 100)
    private final void method1614(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -5) {
            return;
        }
        class469 var6 = new class469();
        var6.field6553 = arg1;
        var6.field6555 = arg2;
        var6.field6551 = arg4;
        var6.field6554 = class349.method2069(true);
        var6.field6552 = arg0;
        this.field3255.method2732(var6, 21939);
    }

    @OriginalMember(owner = "client!oca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 118)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1615(arg0, (byte) -106);
        if ((this.field3256 & var2) == 0) {
            var2 = this.field3256;
        }
        if ((var2 & 0x1) != 0) {
            this.method1614(arg0.getClickCount(), arg0.getY(), 3, (byte) -5, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1614(arg0.getClickCount(), arg0.getY(), 5, (byte) -5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1614(arg0.getClickCount(), arg0.getY(), 4, (byte) -5, arg0.getX());
        }
        this.field3256 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 144)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1615(arg0, (byte) -104);
        if (var2 == 1) {
            this.method1614(arg0.getClickCount(), arg0.getY(), 0, (byte) -5, arg0.getX());
        } else if (var2 == 4) {
            this.method1614(arg0.getClickCount(), arg0.getY(), 2, (byte) -5, arg0.getX());
        } else if (var2 == 2) {
            this.method1614(arg0.getClickCount(), arg0.getY(), 1, (byte) -5, arg0.getX());
        }
        this.field3256 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 167)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1613(arg0.getY(), arg0.getX(), 122);
    }

    @OriginalMember(owner = "client!oca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 177)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V", line = 187)
    public final synchronized void method121(byte arg0) {
        this.field3249 = this.field3256;
        this.field3251 = this.field3254;
        if (arg0 != 121) {
            this.field3257 = false;
        }
        this.field3252 = this.field3253;
        class450 var2 = this.field3250;
        this.field3250 = this.field3255;
        this.field3255 = var2;
        this.field3255.method2729(arg0 ^ 0xFFFFFFA9);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 208)
    private final int method1615(MouseEvent arg0, byte arg1) {
        if (arg1 > -101) {
            this.method1615(null, (byte) 48);
        }
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 235)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1613(arg0.getY(), arg0.getX(), 124);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)Z", line = 242)
    public final boolean method112(byte arg0) {
        if (arg0 <= 117) {
            return true;
        } else {
            return (this.field3249 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 252)
    private final void method1616(int arg0, Component arg1) {
        if (arg0 != 0) {
            this.field3255 = null;
        }
        this.method1617(28509);
        this.field3258 = arg1;
        this.field3258.addMouseListener(this);
        this.field3258.addMouseMotionListener(this);
        this.field3258.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)I", line = 266)
    public final int method109(int arg0) {
        if (arg0 < 120) {
            this.method113((byte) -28);
        }
        return this.field3251;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class278(Component arg0, boolean arg1) {
        this.method1616(0, arg0);
        this.field3257 = arg1;
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V", line = 280)
    private final void method1617(int arg0) {
        if (this.field3258 == null) {
            return;
        }
        this.field3258.removeMouseWheelListener(this);
        this.field3258.removeMouseMotionListener(this);
        this.field3258.removeMouseListener(this);
        this.field3251 = this.field3252 = this.field3249 = 0;
        this.field3258 = null;
        if (arg0 != 28509) {
            this.field3252 = 16;
        }
        this.field3255 = null;
        this.field3254 = this.field3253 = this.field3256 = 0;
        this.field3250 = null;
    }
}
