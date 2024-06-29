import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class493 extends class29 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lmfa;")
    private class562 field7146 = new class562();

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lmfa;")
    private class562 field7150 = new class562();

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
    private boolean field7153;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    private int field7145;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    private int field7147;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    private int field7148;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field7149;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field7151;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field7152;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field7154;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I")
    public final int method162(int arg0) {
        return arg0 == -26561 ? this.field7148 : 20;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    private final void method2838(int arg0) {
        if (this.field7154 == null) {
            return;
        }
        this.field7154.removeMouseWheelListener(this);
        this.field7154.removeMouseMotionListener(this);
        this.field7154.removeMouseListener(this);
        this.field7150 = null;
        this.field7146 = null;
        if (arg0 < 94) {
            this.method2840((byte) -123, null);
        }
        this.field7149 = this.field7151 = this.field7152 = 0;
        this.field7148 = this.field7145 = this.field7147 = 0;
        this.field7154 = null;
    }

    @OriginalMember(owner = "client!ac", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)Z")
    public final boolean method160(boolean arg0) {
        if (arg0) {
            this.mouseReleased(null);
        }
        return (this.field7147 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public final synchronized void method163(byte arg0) {
        this.field7148 = this.field7149;
        this.field7145 = this.field7151;
        this.field7147 = this.field7152;
        class562 var2 = this.field7146;
        this.field7146 = this.field7150;
        if (arg0 <= 32) {
            this.method158(9);
        }
        this.field7150 = var2;
        this.field7150.method3170((byte) 92);
    }

    @OriginalMember(owner = "client!ac", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2842(arg0, 8901);
        if (var2 == 1) {
            this.method2839(arg0.getX(), 0, 0, arg0.getY(), -83);
        } else if (var2 == 4) {
            this.method2839(arg0.getX(), 2, 0, arg0.getY(), -66);
        } else if (var2 == 2) {
            this.method2839(arg0.getX(), 1, 0, arg0.getY(), -88);
        }
        this.field7152 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
    public final boolean method158(int arg0) {
        if (arg0 == -7948) {
            return (this.field7147 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2841(arg0.getX(), arg0.getY(), -121);
    }

    @OriginalMember(owner = "client!ac", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2839(var2, 6, var4, var3, -86);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    private final void method2839(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -28) {
            this.method160(true);
        }
        class143 var6 = new class143();
        var6.field1610 = arg1;
        var6.field1611 = arg0;
        var6.field1614 = arg3;
        var6.field1612 = class641.method3604(false);
        var6.field1613 = arg2;
        this.field7150.method3164(var6, 256);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I")
    public final int method161(int arg0) {
        return arg0 == 31285 ? this.field7145 : -65;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
    public final boolean method156(int arg0) {
        if (arg0 == 17289) {
            return (this.field7147 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Lve;")
    public final class460 method154(boolean arg0) {
        if (!arg0) {
            this.field7150 = null;
        }
        return (class460) this.field7146.method3171(768);
    }

    @OriginalMember(owner = "client!ac", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2841(arg0.getX(), arg0.getY(), -103);
    }

    @OriginalMember(owner = "client!ac", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2841(arg0.getX(), arg0.getY(), -113);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2840(byte arg0, Component arg1) {
        this.method2838(120);
        this.field7154 = arg1;
        this.field7154.addMouseListener(this);
        this.field7154.addMouseMotionListener(this);
        if (arg0 == -32) {
            this.field7154.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    private final void method2841(int arg0, int arg1, int arg2) {
        this.field7151 = arg1;
        if (arg2 > -97) {
            this.field7148 = -116;
        }
        this.field7149 = arg0;
        if (this.field7153) {
            this.method2839(arg0, -1, 0, arg1, -57);
        }
    }

    @OriginalMember(owner = "client!ac", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2841(arg0.getX(), arg0.getY(), -112);
    }

    @OriginalMember(owner = "client!ac", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2842(arg0, 8901);
        if ((var2 & this.field7152) == 0) {
            var2 = this.field7152;
        }
        if ((var2 & 0x1) != 0) {
            this.method2839(arg0.getX(), 3, 0, arg0.getY(), -38);
        }
        if ((var2 & 0x4) != 0) {
            this.method2839(arg0.getX(), 5, 0, arg0.getY(), -120);
        }
        if ((var2 & 0x2) != 0) {
            this.method2839(arg0.getX(), 4, 0, arg0.getY(), -93);
        }
        this.field7152 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method2842(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            if (arg1 != 8901) {
                this.method154(true);
            }
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        this.method2838(111);
        if (arg0 > -9) {
            this.method2840((byte) 72, null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class493(Component arg0, boolean arg1) {
        this.method2840((byte) -32, arg0);
        this.field7153 = arg1;
    }
}
