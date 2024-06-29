import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class53 extends class134 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lef;")
    private class513 field580 = new class513();

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "Lef;")
    private class513 field582 = new class513();

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Z")
    private boolean field587;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field586;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)I", line = 4)
    public final int method391(byte arg0) {
        if (arg0 != 94) {
            this.method394(35);
        }
        return this.field579;
    }

    @OriginalMember(owner = "client!gp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 14)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method393(arg0.getY(), arg0.getX(), (byte) 36);
    }

    @OriginalMember(owner = "client!gp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)Z", line = 31)
    public final boolean method392(int arg0) {
        if (arg0 == 15) {
            return (this.field581 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 44)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method398(arg0, 120);
        if ((this.field585 & var2) == 0) {
            var2 = this.field585;
        }
        if ((var2 & 0x1) != 0) {
            this.method399(arg0.getClickCount(), 3, arg0.getY(), 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method399(arg0.getClickCount(), 3, arg0.getY(), 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method399(arg0.getClickCount(), 3, arg0.getY(), 4, arg0.getX());
        }
        this.field585 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gp", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 72)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method399(var4, 3, var3, 6, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!gp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 85)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method393(arg0.getY(), arg0.getX(), (byte) 60);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIB)V", line = 95)
    private final void method393(int arg0, int arg1, byte arg2) {
        this.field584 = arg0;
        this.field583 = arg1;
        int var4 = -108 / ((arg2 + 2) / 35);
        if (this.field587) {
            this.method399(0, 3, arg0, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)Z", line = 109)
    public final boolean method394(int arg0) {
        if (arg0 == 0) {
            return (this.field581 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 119)
    private final void method395(Component arg0, int arg1) {
        if (arg1 >= -91) {
            return;
        }
        this.method402(4);
        this.field586 = arg0;
        this.field586.addMouseListener(this);
        this.field586.addMouseMotionListener(this);
        this.field586.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Lbk;", line = 134)
    public final class394 method396(int arg0) {
        return arg0 == 15 ? (class394) this.field580.method3875(arg0 ^ 0xFFFFFF8F) : (class394) null;
    }

    @OriginalMember(owner = "client!gp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 144)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method393(arg0.getY(), arg0.getX(), (byte) 80);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z", line = 151)
    public final boolean method397(byte arg0) {
        if (arg0 != -75) {
            this.field587 = true;
        }
        return (this.field581 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 162)
    private final int method398(MouseEvent arg0, int arg1) {
        int var3 = -50 % ((12 - arg1) / 61);
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

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V", line = 187)
    private final void method399(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class789 var6 = new class789();
        var6.field11499 = arg3;
        if (arg1 != 3) {
            this.field582 = null;
        }
        var6.field11500 = arg2;
        var6.field11498 = arg4;
        var6.field11501 = class430.method3299(110);
        var6.field11502 = arg0;
        this.field582.method3868(73, var6);
    }

    @OriginalMember(owner = "client!gp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 204)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method398(arg0, -119);
        if (var2 == 1) {
            this.method399(arg0.getClickCount(), 3, arg0.getY(), 0, arg0.getX());
        } else if (var2 == 4) {
            this.method399(arg0.getClickCount(), 3, arg0.getY(), 2, arg0.getX());
        } else if (var2 == 2) {
            this.method399(arg0.getClickCount(), 3, arg0.getY(), 1, arg0.getX());
        }
        this.field585 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(B)V", line = 226)
    public final void method400(byte arg0) {
        if (arg0 != 56) {
            this.mouseExited(null);
        }
        this.method402(arg0 ^ 0x3C);
    }

    @OriginalMember(owner = "client!gp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 236)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method393(arg0.getY(), arg0.getX(), (byte) 121);
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I", line = 243)
    public final int method401(int arg0) {
        if (arg0 != 16428) {
            this.field587 = false;
        }
        return this.field578;
    }

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "(I)V", line = 253)
    private final void method402(int arg0) {
        if (this.field586 == null) {
            return;
        }
        this.field586.removeMouseWheelListener(this);
        this.field586.removeMouseMotionListener(this);
        this.field586.removeMouseListener(this);
        this.field578 = this.field579 = this.field581 = 0;
        this.field586 = null;
        this.field582 = null;
        this.field583 = this.field584 = this.field585 = 0;
        this.field580 = null;
        if (arg0 != 4) {
            this.mouseEntered(null);
        }
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)V", line = 276)
    public final synchronized void method403(int arg0) {
        this.field578 = this.field583;
        this.field579 = this.field584;
        this.field581 = this.field585;
        class513 var2 = this.field580;
        if (arg0 != 0) {
            this.method399(-14, -76, 32, 61, -86);
        }
        this.field580 = this.field582;
        this.field582 = var2;
        this.field582.method3879(arg0 ^ 0x67);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 310)
    public class53(Component arg0, boolean arg1) {
        this.method395(arg0, -115);
        this.field587 = arg1;
    }
}
