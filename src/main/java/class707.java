import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class707 extends class404 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lmr;")
    private class611 field9948 = new class611();

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lmr;")
    private class611 field9951 = new class611();

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
    private boolean field9956;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    private int field9947;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    private int field9949;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field9950;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    private int field9952;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private int field9953;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    private int field9954;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field9955;

    @OriginalMember(owner = "client!kl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 13)
    private final void method3958(Component arg0, int arg1) {
        this.method3961(arg1 ^ arg1);
        this.field9955 = arg0;
        this.field9955.addMouseListener(this);
        this.field9955.addMouseMotionListener(this);
        this.field9955.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V", line = 24)
    public final void method2458(int arg0) {
        this.method3961(0);
        if (arg0 != 16291) {
            this.field9951 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z", line = 36)
    public final boolean method2450(int arg0) {
        int var2 = 81 / ((arg0 + 13) / 49);
        return (this.field9949 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)I", line = 44)
    public final int method2452(int arg0) {
        return arg0 > -70 ? -44 : this.field9947;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)I", line = 55)
    public final int method2459(int arg0) {
        return arg0 == -32213 ? this.field9950 : 75;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 65)
    private final int method3959(int arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        }
        if (arg0 < 86) {
            this.field9948 = null;
        }
        if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIB)V", line = 94)
    private final void method3960(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class103 var6 = new class103();
        var6.field1462 = arg3;
        var6.field1465 = arg0;
        var6.field1461 = arg2;
        var6.field1464 = class465.method2818(arg4 + 138);
        if (arg4 == 117) {
            var6.field1463 = arg1;
            this.field9951.method3559(var6, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Z", line = 110)
    public final boolean method2454(int arg0) {
        if (arg0 != -19704) {
            this.field9955 = null;
        }
        return (this.field9949 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 120)
    public final synchronized void method2453(int arg0) {
        this.field9949 = this.field9954;
        this.field9947 = this.field9953;
        this.field9950 = this.field9952;
        class611 var2 = this.field9948;
        this.field9948 = this.field9951;
        this.field9951 = var2;
        int var3 = -97 / ((arg0 - 85) / 41);
        this.field9951.method3553(0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Lrg;", line = 141)
    public final class553 method2456(byte arg0) {
        return arg0 == -63 ? (class553) this.field9948.method3563(0) : (class553) null;
    }

    @OriginalMember(owner = "client!kl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 151)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3962(false, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!kl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 159)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3959(122, arg0);
        if ((var2 & this.field9954) == 0) {
            var2 = this.field9954;
        }
        if ((var2 & 0x1) != 0) {
            this.method3960(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3, (byte) 117);
        }
        if ((var2 & 0x4) != 0) {
            this.method3960(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5, (byte) 117);
        }
        if ((var2 & 0x2) != 0) {
            this.method3960(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4, (byte) 117);
        }
        this.field9954 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 186)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3960(var3, var4, var2, 6, (byte) 117);
        arg0.consume();
    }

    @OriginalMember(owner = "client!kl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 199)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3959(109, arg0);
        if (var2 == 1) {
            this.method3960(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0, (byte) 117);
        } else if (var2 == 4) {
            this.method3960(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2, (byte) 117);
        } else if (var2 == 2) {
            this.method3960(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1, (byte) 117);
        }
        this.field9954 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "(I)V", line = 225)
    private final void method3961(int arg0) {
        if (this.field9955 == null) {
            return;
        }
        this.field9955.removeMouseWheelListener(this);
        this.field9955.removeMouseMotionListener(this);
        this.field9955.removeMouseListener(this);
        this.field9950 = this.field9947 = this.field9949 = 0;
        this.field9951 = null;
        this.field9952 = this.field9953 = this.field9954 = arg0;
        this.field9948 = null;
        this.field9955 = null;
    }

    @OriginalMember(owner = "client!kl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 244)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3962(false, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!kl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 251)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3962(false, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!kl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 258)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3962(false, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZII)V", line = 265)
    private final void method3962(boolean arg0, int arg1, int arg2) {
        this.field9952 = arg2;
        if (!arg0) {
            this.field9953 = arg1;
            if (this.field9956) {
                this.method3960(arg1, 0, arg2, -1, (byte) 117);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z", line = 283)
    public final boolean method2457(int arg0) {
        if (arg0 == -20117) {
            return (this.field9949 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 305)
    public class707(Component arg0, boolean arg1) {
        this.method3958(arg0, 4);
        this.field9956 = arg1;
    }
}
