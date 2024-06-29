import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class50 extends class157 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "Luh;")
    private class168 field1046 = new class168();

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "Luh;")
    private class168 field1048 = new class168();

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Z")
    private boolean field1052;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field1053;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method569(int arg0) {
        int var2 = -59 % ((arg0 + 38) / 48);
        return (this.field1047 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZ)V", line = 15)
    private final void method570(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class701 var6 = new class701();
        var6.field9477 = arg3;
        var6.field9480 = arg1;
        var6.field9481 = arg0;
        var6.field9478 = class554.method3190(-115);
        var6.field9479 = arg2;
        if (arg4) {
            this.mouseDragged(null);
        }
        this.field1048.method1273(var6, -20180);
    }

    @OriginalMember(owner = "client!aea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 32)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method575(arg0, -75);
        if ((var2 & this.field1050) == 0) {
            var2 = this.field1050;
        }
        if ((var2 & 0x1) != 0) {
            this.method570(arg0.getX(), 3, arg0.getClickCount(), arg0.getY(), false);
        }
        if ((var2 & 0x4) != 0) {
            this.method570(arg0.getX(), 5, arg0.getClickCount(), arg0.getY(), false);
        }
        if ((var2 & 0x2) != 0) {
            this.method570(arg0.getX(), 4, arg0.getClickCount(), arg0.getY(), false);
        }
        this.field1050 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)I", line = 58)
    public final int method571(byte arg0) {
        if (arg0 < 69) {
            this.method570(92, 34, 59, 2, false);
        }
        return this.field1044;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V", line = 69)
    private final void method572(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return;
        }
        this.field1049 = arg2;
        this.field1051 = arg0;
        if (this.field1052) {
            this.method570(arg0, -1, 0, arg2, false);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Z", line = 87)
    public final boolean method573(byte arg0) {
        if (arg0 <= 112) {
            return false;
        } else {
            return (this.field1047 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!aea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 98)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method575(arg0, -90);
        if (var2 == 1) {
            this.method570(arg0.getX(), 0, arg0.getClickCount(), arg0.getY(), false);
        } else if (var2 == 4) {
            this.method570(arg0.getX(), 2, arg0.getClickCount(), arg0.getY(), false);
        } else if (var2 == 2) {
            this.method570(arg0.getX(), 1, arg0.getClickCount(), arg0.getY(), false);
        }
        this.field1050 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)I", line = 120)
    public final int method574(boolean arg0) {
        return arg0 ? this.field1045 : 27;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 131)
    private final int method575(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            int var3 = -27 % ((57 - arg1) / 63);
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!aea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method572(arg0.getX(), -1, arg0.getY());
    }

    @OriginalMember(owner = "client!aea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)Z", line = 172)
    public final boolean method576(int arg0) {
        if (arg0 >= -67) {
            this.mouseMoved(null);
        }
        return (this.field1047 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)Lbu;", line = 182)
    public final class19 method577(int arg0) {
        if (arg0 != 0) {
            this.mouseReleased(null);
        }
        return (class19) this.field1046.method1271(8);
    }

    @OriginalMember(owner = "client!aea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 192)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method572(arg0.getX(), -1, arg0.getY());
    }

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "(I)V", line = 199)
    private final void method578(int arg0) {
        if (this.field1053 == null) {
            return;
        }
        int var2 = 11 % ((arg0 + 21) / 55);
        this.field1053.removeMouseWheelListener(this);
        this.field1053.removeMouseMotionListener(this);
        this.field1053.removeMouseListener(this);
        this.field1053 = null;
        this.field1051 = this.field1049 = this.field1050 = 0;
        this.field1045 = this.field1044 = this.field1047 = 0;
        this.field1046 = null;
        this.field1048 = null;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 222)
    public final synchronized void method579(int arg0) {
        this.field1044 = this.field1049;
        this.field1045 = this.field1051;
        this.field1047 = this.field1050;
        if (arg0 == 0) {
            class168 var2 = this.field1046;
            this.field1046 = this.field1048;
            this.field1048 = var2;
            this.field1048.method1270(127);
        }
    }

    @OriginalMember(owner = "client!aea", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 245)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method570(var2, 6, var4, var3, false);
        arg0.consume();
    }

    @OriginalMember(owner = "client!aea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 258)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method572(arg0.getX(), -1, arg0.getY());
    }

    @OriginalMember(owner = "client!aea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 267)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method572(arg0.getX(), -1, arg0.getY());
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 310)
    public class50(Component arg0, boolean arg1) {
        this.method581(0, arg0);
        this.field1052 = arg1;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V", line = 279)
    public final void method580(int arg0) {
        if (arg0 == 0) {
            this.method578(46);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 292)
    private final void method581(int arg0, Component arg1) {
        this.method578(arg0 ^ 0x6E);
        this.field1053 = arg1;
        if (arg0 != 0) {
            this.field1053 = null;
        }
        this.field1053.addMouseListener(this);
        this.field1053.addMouseMotionListener(this);
        this.field1053.addMouseWheelListener(this);
    }
}
