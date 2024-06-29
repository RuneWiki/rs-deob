import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class426 extends class637 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Ltm;")
    private class412 field6070 = new class412();

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Ltm;")
    private class412 field6075 = new class412();

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Z")
    private boolean field6076;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    private int field6068;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    private int field6069;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    private int field6071;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    private int field6072;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    private int field6073;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    private int field6074;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field6077;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method768(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return (this.field6068 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)V", line = 16)
    public final synchronized void method767(int arg0) {
        this.field6071 = this.field6073;
        this.field6069 = this.field6072;
        this.field6068 = this.field6074;
        class412 var2 = this.field6070;
        if (arg0 != -3459) {
            this.field6075 = null;
        }
        this.field6070 = this.field6075;
        this.field6075 = var2;
        this.field6075.method2549(-98);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z", line = 37)
    public final boolean method771(int arg0) {
        if (arg0 != 0) {
            this.field6074 = 61;
        }
        return (this.field6068 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V", line = 48)
    private final void method2606(int arg0, int arg1, int arg2) {
        this.field6073 = arg0;
        this.field6072 = arg2;
        if (arg1 <= 30) {
            this.method767(-18);
        }
        if (this.field6076) {
            this.method2609(true, 0, -1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ns", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 66)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2607(4, arg0);
        if ((var2 & this.field6074) == 0) {
            var2 = this.field6074;
        }
        if ((var2 & 0x1) != 0) {
            this.method2609(true, arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2609(true, arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2609(true, arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
        }
        this.field6074 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ns", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 92)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2606(arg0.getY(), 108, arg0.getX());
    }

    @OriginalMember(owner = "client!ns", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Lqq;", line = 112)
    public final class504 method774(int arg0) {
        return arg0 == 0 ? (class504) this.field6070.method2543(-15114) : (class504) null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 123)
    private final int method2607(int arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else if (arg0 == 4) {
            return 0;
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!ns", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 150)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2607(4, arg0);
        if (var2 == 1) {
            this.method2609(true, arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method2609(true, arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method2609(true, arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
        }
        this.field6074 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 174)
    private final void method2608(Component arg0, byte arg1) {
        this.method2610(-11995);
        this.field6077 = arg0;
        this.field6077.addMouseListener(this);
        this.field6077.addMouseMotionListener(this);
        if (arg1 != 57) {
            this.method2610(12);
        }
        this.field6077.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ns", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 189)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2609(true, var4, 6, var3, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIIII)V", line = 203)
    private final void method2609(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class128 var6 = new class128();
        if (!arg0) {
            this.mouseExited(null);
        }
        var6.field1920 = arg4;
        var6.field1921 = arg2;
        var6.field1923 = arg3;
        var6.field1924 = class302.method1910(0);
        var6.field1922 = arg1;
        this.field6075.method2545(-127, var6);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)I", line = 219)
    public final int method778(int arg0) {
        return arg0 == 0 ? this.field6069 : 71;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)Z", line = 229)
    public final boolean method773(byte arg0) {
        if (arg0 < 10) {
            return false;
        } else {
            return (this.field6068 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)I", line = 240)
    public final int method777(byte arg0) {
        int var2 = 18 % ((-arg0 - 83) / 33);
        return this.field6071;
    }

    @OriginalMember(owner = "client!ns", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 248)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2606(arg0.getY(), 84, arg0.getX());
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 312)
    public class426(Component arg0, boolean arg1) {
        this.method2608(arg0, (byte) 57);
        this.field6076 = arg1;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V", line = 258)
    private final void method2610(int arg0) {
        if (this.field6077 == null) {
            return;
        }
        if (arg0 != -11995) {
            this.mouseReleased(null);
        }
        this.field6077.removeMouseWheelListener(this);
        this.field6077.removeMouseMotionListener(this);
        this.field6077.removeMouseListener(this);
        this.field6075 = null;
        this.field6072 = this.field6073 = this.field6074 = 0;
        this.field6070 = null;
        this.field6069 = this.field6071 = this.field6068 = 0;
        this.field6077 = null;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V", line = 281)
    public final void method775(int arg0) {
        this.method2610(-11995);
        if (arg0 != -24712) {
            this.method768(true);
        }
    }

    @OriginalMember(owner = "client!ns", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 291)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2606(arg0.getY(), 44, arg0.getX());
    }

    @OriginalMember(owner = "client!ns", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 298)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2606(arg0.getY(), 36, arg0.getX());
    }
}
