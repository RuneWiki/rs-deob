import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class441 extends class233 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Lnt;")
    private class220 field6148 = new class220();

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Lnt;")
    private class220 field6155 = new class220();

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Z")
    private boolean field6157;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    private int field6149;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    private int field6150;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    private int field6152;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    private int field6153;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    private int field6154;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field6156;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 4)
    public final void method1591(byte arg0) {
        this.method2649(3);
        if (arg0 != 2) {
            this.field6151 = -102;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V", line = 16)
    private final void method2647(int arg0, int arg1, int arg2) {
        this.field6152 = arg0;
        this.field6154 = arg2;
        if (this.field6157) {
            this.method2648(arg2, arg0, -1, 0, (byte) -80);
        }
        if (arg1 != -1) {
            this.mousePressed(null);
        }
    }

    @OriginalMember(owner = "client!bn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 31)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2648(var2, var3, 6, var4, (byte) -80);
        arg0.consume();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIB)V", line = 45)
    private final void method2648(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class629 var6 = new class629();
        if (arg4 != -80) {
            this.field6154 = -68;
        }
        var6.field9034 = arg2;
        var6.field9031 = arg1;
        var6.field9030 = arg0;
        var6.field9033 = class742.method4128(arg4 ^ 0xFFFFFFB1);
        var6.field9032 = arg3;
        this.field6155.method1526(var6, -63);
    }

    @OriginalMember(owner = "client!bn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 62)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 71)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2647(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!bn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 79)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2650(false, arg0);
        if (var2 == 1) {
            this.method2648(arg0.getX(), arg0.getY(), 0, arg0.getClickCount(), (byte) -80);
        } else if (var2 == 4) {
            this.method2648(arg0.getX(), arg0.getY(), 2, arg0.getClickCount(), (byte) -80);
        } else if (var2 == 2) {
            this.method2648(arg0.getX(), arg0.getY(), 1, arg0.getClickCount(), (byte) -80);
        }
        this.field6153 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V", line = 101)
    private final void method2649(int arg0) {
        if (this.field6156 == null) {
            return;
        }
        if (arg0 != 3) {
            this.field6152 = -112;
        }
        this.field6156.removeMouseWheelListener(this);
        this.field6156.removeMouseMotionListener(this);
        this.field6156.removeMouseListener(this);
        this.field6156 = null;
        this.field6155 = null;
        this.field6148 = null;
        this.field6150 = this.field6151 = this.field6149 = 0;
        this.field6154 = this.field6152 = this.field6153 = 0;
    }

    @OriginalMember(owner = "client!bn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 124)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2647(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!bn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 132)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2650(false, arg0);
        if ((var2 & this.field6153) == 0) {
            var2 = this.field6153;
        }
        if ((var2 & 0x1) != 0) {
            this.method2648(arg0.getX(), arg0.getY(), 3, arg0.getClickCount(), (byte) -80);
        }
        if ((var2 & 0x4) != 0) {
            this.method2648(arg0.getX(), arg0.getY(), 5, arg0.getClickCount(), (byte) -80);
        }
        if ((var2 & 0x2) != 0) {
            this.method2648(arg0.getX(), arg0.getY(), 4, arg0.getClickCount(), (byte) -80);
        }
        this.field6153 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)Llga;", line = 156)
    public final class709 method1590(int arg0) {
        return arg0 == 260610 ? (class709) this.field6148.method1521(124) : (class709) null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z", line = 167)
    public final boolean method1587(int arg0) {
        int var2 = -124 / ((arg0 - 81) / 37);
        return (this.field6149 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I", line = 181)
    private final int method2650(boolean arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            if (arg0) {
                this.method1588(59);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Z", line = 207)
    public final boolean method1589(int arg0) {
        if (arg0 != 8) {
            this.field6148 = null;
        }
        return (this.field6149 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)I", line = 217)
    public final int method1597(int arg0) {
        return arg0 <= 110 ? 86 : this.field6150;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 228)
    public final synchronized void method1588(int arg0) {
        this.field6150 = this.field6154;
        this.field6151 = this.field6152;
        this.field6149 = this.field6153;
        class220 var2 = this.field6148;
        this.field6148 = this.field6155;
        int var3 = -123 % ((-arg0 - 45) / 49);
        this.field6155 = var2;
        this.field6155.method1530((byte) 102);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 247)
    private final void method2651(Component arg0, int arg1) {
        this.method2649(3);
        this.field6156 = arg0;
        this.field6156.addMouseListener(this);
        this.field6156.addMouseMotionListener(this);
        this.field6156.addMouseWheelListener(this);
        if (arg1 != -27305) {
            this.field6156 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)I", line = 261)
    public final int method1592(boolean arg0) {
        return arg0 ? this.field6151 : -85;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 307)
    public class441(Component arg0, boolean arg1) {
        this.method2651(arg0, -27305);
        this.field6157 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 278)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2647(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!bn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 286)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2647(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)Z", line = 299)
    public final boolean method1596(byte arg0) {
        int var2 = 122 / ((-arg0 - 5) / 41);
        return (this.field6149 & 0x2) != 0;
    }
}
