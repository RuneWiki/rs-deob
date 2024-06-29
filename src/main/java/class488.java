import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class488 extends class330 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lui;")
    private class193 field6814 = new class193();

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lui;")
    private class193 field6818 = new class193();

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Z")
    private boolean field6821;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    private int field6812;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    private int field6813;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    private int field6815;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    private int field6816;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    private int field6817;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    private int field6819;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field6820;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 4)
    private final void method2825(Component arg0, int arg1) {
        this.method2826(-12166);
        if (arg1 != 0) {
            this.field6817 = -96;
        }
        this.field6820 = arg0;
        this.field6820.addMouseListener(this);
        this.field6820.addMouseMotionListener(this);
        this.field6820.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!fe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 31)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2827(true, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2829(arg0, (byte) -31);
        if ((this.field6819 & var2) == 0) {
            var2 = this.field6819;
        }
        if ((var2 & 0x1) != 0) {
            this.method2828(arg0.getX(), 3, 0, arg0.getY(), 4);
        }
        if ((var2 & 0x4) != 0) {
            this.method2828(arg0.getX(), 5, 0, arg0.getY(), 4);
        }
        if ((var2 & 0x2) != 0) {
            this.method2828(arg0.getX(), 4, 0, arg0.getY(), 4);
        }
        this.field6819 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Z", line = 64)
    public final boolean method176(int arg0) {
        if (arg0 >= -57) {
            this.field6812 = 122;
        }
        return (this.field6812 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V", line = 74)
    private final void method2826(int arg0) {
        if (this.field6820 == null || arg0 != -12166) {
            return;
        }
        this.field6820.removeMouseWheelListener(this);
        this.field6820.removeMouseMotionListener(this);
        this.field6820.removeMouseListener(this);
        this.field6815 = this.field6813 = this.field6812 = 0;
        this.field6818 = null;
        this.field6814 = null;
        this.field6816 = this.field6817 = this.field6819 = 0;
        this.field6820 = null;
    }

    @OriginalMember(owner = "client!fe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 97)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2827(true, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)V", line = 104)
    private final void method2827(boolean arg0, int arg1, int arg2) {
        this.field6817 = arg2;
        if (!arg0) {
            this.field6820 = null;
        }
        this.field6816 = arg1;
        if (this.field6821) {
            this.method2828(arg1, -1, 0, arg2, 4);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I", line = 122)
    public final int method169(int arg0) {
        int var2 = 38 / ((-arg0 - 29) / 45);
        return this.field6813;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V", line = 132)
    private final void method2828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class212 var6 = new class212();
        var6.field2584 = arg1;
        var6.field2583 = arg3;
        if (arg4 != 4) {
            this.mousePressed(null);
        }
        var6.field2580 = arg0;
        var6.field2581 = class190.method1030(false);
        var6.field2582 = arg2;
        this.field6818.method1040(var6, arg4 - 120);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Z", line = 148)
    public final boolean method175(int arg0) {
        if (arg0 == 20) {
            return (this.field6812 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 159)
    private final int method2829(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg1 != -31) {
            return -55;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 186)
    public final void method174(int arg0) {
        this.method2826(-12166);
        if (arg0 > -98) {
            this.method2825(null, -87);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Z", line = 196)
    public final boolean method166(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            return (this.field6812 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I", line = 206)
    public final int method167(int arg0) {
        return arg0 == 64 ? this.field6815 : -59;
    }

    @OriginalMember(owner = "client!fe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 217)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2827(true, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 225)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2829(arg0, (byte) -31);
        if (var2 == 1) {
            this.method2828(arg0.getX(), 0, 0, arg0.getY(), 4);
        } else if (var2 == 4) {
            this.method2828(arg0.getX(), 2, 0, arg0.getY(), 4);
        } else if (var2 == 2) {
            this.method2828(arg0.getX(), 1, 0, arg0.getY(), 4);
        }
        this.field6819 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 247)
    public final synchronized void method168(byte arg0) {
        this.field6815 = this.field6816;
        this.field6813 = this.field6817;
        if (arg0 >= -11) {
            this.mouseDragged(null);
        }
        this.field6812 = this.field6819;
        class193 var2 = this.field6814;
        this.field6814 = this.field6818;
        this.field6818 = var2;
        this.field6818.method1048(-7730);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)Luf;", line = 270)
    public final class379 method178(byte arg0) {
        if (arg0 < 2) {
            this.field6812 = 91;
        }
        return (class379) this.field6814.method1054((byte) -105);
    }

    @OriginalMember(owner = "client!fe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 280)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2827(true, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!fe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 289)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2828(var2, 6, var4, var3, 4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 312)
    public class488(Component arg0, boolean arg1) {
        this.method2825(arg0, 0);
        this.field6821 = arg1;
    }
}
