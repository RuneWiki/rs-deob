import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class667 extends class104 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "Lro;")
    private class2 field9104 = new class2();

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "Lro;")
    private class2 field9108 = new class2();

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "Z")
    private boolean field9111;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    private int field9102;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    private int field9103;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    private int field9106;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
    private int field9107;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    private int field9109;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field9110;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)V", line = 4)
    public final synchronized void method778(int arg0) {
        this.field9105 = this.field9107;
        this.field9102 = this.field9109;
        this.field9103 = this.field9106;
        class2 var2 = this.field9104;
        this.field9104 = this.field9108;
        this.field9108 = var2;
        if (arg0 != -6928) {
            this.field9105 = 74;
        }
        this.field9108.method23(10);
    }

    @OriginalMember(owner = "client!aga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 26)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3681(arg0.getX(), arg0.getY(), (byte) -123);
    }

    @OriginalMember(owner = "client!aga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 34)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3682(var2, (byte) -118, 6, var4, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 47)
    private final int method3678(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg1 == 4) {
            return arg0.getButton() == 3 ? 4 : 0;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!aga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 75)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3678(arg0, 4);
        if (var2 == 1) {
            this.method3682(arg0.getX(), (byte) 105, 0, arg0.getClickCount(), arg0.getY());
        } else if (var2 == 4) {
            this.method3682(arg0.getX(), (byte) 57, 2, arg0.getClickCount(), arg0.getY());
        } else if (var2 == 2) {
            this.method3682(arg0.getX(), (byte) -110, 1, arg0.getClickCount(), arg0.getY());
        }
        this.field9109 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(B)I", line = 98)
    public final int method780(byte arg0) {
        return arg0 > -48 ? 64 : this.field9105;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)Lqg;", line = 110)
    public final class466 method773(byte arg0) {
        if (arg0 <= 125) {
            this.method777((byte) -109);
        }
        return (class466) this.field9104.method10(false);
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V", line = 120)
    private final void method3679(int arg0) {
        if (this.field9110 == null) {
            return;
        }
        this.field9110.removeMouseWheelListener(this);
        this.field9110.removeMouseMotionListener(this);
        this.field9110.removeMouseListener(this);
        this.field9108 = null;
        this.field9104 = null;
        if (arg0 == 32693) {
            this.field9107 = this.field9106 = this.field9109 = 0;
            this.field9105 = this.field9103 = this.field9102 = 0;
            this.field9110 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 145)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3678(arg0, 4);
        if ((var2 & this.field9109) == 0) {
            var2 = this.field9109;
        }
        if ((var2 & 0x1) != 0) {
            this.method3682(arg0.getX(), (byte) 22, 3, arg0.getClickCount(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method3682(arg0.getX(), (byte) 100, 5, arg0.getClickCount(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method3682(arg0.getX(), (byte) -108, 4, arg0.getClickCount(), arg0.getY());
        }
        this.field9109 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 170)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3681(arg0.getX(), arg0.getY(), (byte) -127);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 177)
    private final void method3680(Component arg0, int arg1) {
        if (arg1 != -12969) {
            this.field9107 = -106;
        }
        this.method3679(32693);
        this.field9110 = arg0;
        this.field9110.addMouseListener(this);
        this.field9110.addMouseMotionListener(this);
        this.field9110.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)Z", line = 191)
    public final boolean method777(byte arg0) {
        if (arg0 <= 49) {
            return true;
        } else {
            return (this.field9102 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!aga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 201)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3681(arg0.getX(), arg0.getY(), (byte) -125);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIB)V", line = 211)
    private final void method3681(int arg0, int arg1, byte arg2) {
        this.field9106 = arg1;
        this.field9107 = arg0;
        if (arg2 <= -111 && this.field9111) {
            this.method3682(arg0, (byte) 124, -1, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBIII)V", line = 226)
    private final void method3682(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class145 var6 = new class145();
        var6.field2299 = arg0;
        var6.field2302 = arg2;
        var6.field2298 = arg4;
        var6.field2301 = class375.method2193(116);
        int var7 = 3 / ((-arg1 - 45) / 56);
        var6.field2300 = arg3;
        this.field9108.method11(var6, -97);
    }

    @OriginalMember(owner = "client!aga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 241)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3681(arg0.getX(), arg0.getY(), (byte) -125);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 250)
    public final void method769(byte arg0) {
        int var2 = -119 / ((-arg0 - 18) / 38);
        this.method3679(32693);
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(Z)Z", line = 258)
    public final boolean method776(boolean arg0) {
        if (arg0) {
            this.method780((byte) 110);
        }
        return (this.field9102 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)Z", line = 270)
    public final boolean method774(boolean arg0) {
        if (arg0) {
            this.field9111 = true;
        }
        return (this.field9102 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I", line = 280)
    public final int method772(int arg0) {
        if (arg0 <= 38) {
            this.field9104 = null;
        }
        return this.field9103;
    }

    @OriginalMember(owner = "client!aga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 290)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 310)
    public class667(Component arg0, boolean arg1) {
        this.method3680(arg0, -12969);
        this.field9111 = arg1;
    }
}
