import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class774 extends class723 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Lga;")
    private class420 field10664 = new class420();

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "Lga;")
    private class420 field10669 = new class420();

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Z")
    private boolean field10672;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    private int field10663;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    private int field10665;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    private int field10666;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    private int field10667;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    private int field10668;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    private int field10670;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field10671;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)I", line = 4)
    public final int method3201(byte arg0) {
        return arg0 <= 13 ? 63 : this.field10665;
    }

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "(I)V", line = 14)
    private final void method4244(int arg0) {
        if (this.field10671 == null) {
            return;
        }
        this.field10671.removeMouseWheelListener(this);
        this.field10671.removeMouseMotionListener(this);
        this.field10671.removeMouseListener(this);
        this.field10665 = this.field10666 = this.field10663 = 0;
        this.field10669 = null;
        this.field10664 = null;
        this.field10668 = this.field10667 = this.field10670 = 0;
        int var2 = -11 / ((33 - arg0) / 52);
        this.field10671 = null;
    }

    @OriginalMember(owner = "client!wo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 36)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method4248(var3, var4, -5217, 6, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!wo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method4247(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!wo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 57)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method4245(arg0, -124);
        if ((this.field10670 & var2) == 0) {
            var2 = this.field10670;
        }
        if ((var2 & 0x1) != 0) {
            this.method4248(arg0.getY(), arg0.getClickCount(), -5217, 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method4248(arg0.getY(), arg0.getClickCount(), -5217, 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method4248(arg0.getY(), arg0.getClickCount(), -5217, 4, arg0.getX());
        }
        this.field10670 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 85)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method4245(arg0, -115);
        if (var2 == 1) {
            this.method4248(arg0.getY(), arg0.getClickCount(), -5217, 0, arg0.getX());
        } else if (var2 == 4) {
            this.method4248(arg0.getY(), arg0.getClickCount(), -5217, 2, arg0.getX());
        } else if (var2 == 2) {
            this.method4248(arg0.getY(), arg0.getClickCount(), -5217, 1, arg0.getX());
        }
        this.field10670 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 108)
    private final int method4245(MouseEvent arg0, int arg1) {
        if (arg1 >= -112) {
            this.mousePressed(null);
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

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Z", line = 135)
    public final boolean method3195(int arg0) {
        if (arg0 != -1) {
            this.method3209(37);
        }
        return (this.field10663 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 145)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method4247(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 152)
    private final void method4246(Component arg0, byte arg1) {
        this.method4244(-19);
        if (arg1 != -98) {
            this.mouseMoved(null);
        }
        this.field10671 = arg0;
        this.field10671.addMouseListener(this);
        this.field10671.addMouseMotionListener(this);
        this.field10671.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!wo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 167)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method4247(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!wo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 175)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V", line = 184)
    private final void method4247(int arg0, int arg1, int arg2) {
        this.field10667 = arg2;
        if (arg0 == -1) {
            this.field10668 = arg1;
            if (this.field10672) {
                this.method4248(arg2, 0, -5217, -1, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V", line = 201)
    private final void method4248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class344 var6 = new class344();
        var6.field5076 = arg0;
        var6.field5075 = arg3;
        if (arg2 != -5217) {
            this.method3205((byte) -83);
        }
        var6.field5074 = arg4;
        var6.field5072 = class109.method731(arg2 ^ 0xFFFFEB92);
        var6.field5073 = arg1;
        this.field10669.method2510(var6, false);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 217)
    public final void method3196(int arg0) {
        if (arg0 == 19939) {
            this.method4244(arg0 - 20045);
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z", line = 227)
    public final boolean method3203(int arg0) {
        if (arg0 != -1) {
            this.method4244(-3);
        }
        return (this.field10663 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 238)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method4247(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I", line = 248)
    public final int method3197(byte arg0) {
        return arg0 >= -121 ? 74 : this.field10666;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V", line = 258)
    public final synchronized void method3205(byte arg0) {
        this.field10666 = this.field10667;
        this.field10663 = this.field10670;
        this.field10665 = this.field10668;
        class420 var2 = this.field10664;
        this.field10664 = this.field10669;
        this.field10669 = var2;
        int var3 = -15 % ((arg0 - 23) / 33);
        this.field10669.method2503(10);
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)Lik;", line = 279)
    public final class218 method3209(int arg0) {
        return arg0 == 13606 ? (class218) this.field10664.method2507(-97) : (class218) null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 312)
    public class774(Component arg0, boolean arg1) {
        this.method4246(arg0, (byte) -98);
        this.field10672 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Z", line = 295)
    public final boolean method3199(int arg0) {
        if (arg0 == -1) {
            return (this.field10663 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
