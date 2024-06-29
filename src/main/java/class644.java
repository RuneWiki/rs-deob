import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class644 extends class522 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "Low;")
    private class665 field9153 = new class665();

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "Low;")
    private class665 field9159 = new class665();

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "Z")
    private boolean field9161;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
    private int field9154;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
    private int field9155;

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "I")
    private int field9156;

    @OriginalMember(owner = "client!oia", name = "l", descriptor = "I")
    private int field9157;

    @OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
    private int field9158;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    private int field9160;

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field9162;

    @OriginalMember(owner = "client!oia", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3649(arg0.getY(), 2, arg0.getX());
    }

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "(I)Luaa;", line = 13)
    public final class453 method3069(int arg0) {
        if (arg0 != -1) {
            this.field9157 = -28;
        }
        return (class453) this.field9153.method3726(12691);
    }

    @OriginalMember(owner = "client!oia", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 24)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3651(arg0, (byte) -50);
        if (var2 == 1) {
            this.method3653(4, arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method3653(4, arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method3653(4, arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
        }
        this.field9157 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method3063(int arg0) {
        if (arg0 == -1) {
            return (this.field9156 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)V", line = 59)
    private final void method3649(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            return;
        }
        this.field9158 = arg2;
        this.field9160 = arg0;
        if (this.field9161) {
            this.method3653(arg1 ^ 0x6, 0, -1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V", line = 75)
    public final void method3062(int arg0) {
        this.method3652((byte) -128);
        if (arg0 >= -125) {
            this.method3650(-59, null);
        }
    }

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "(I)I", line = 85)
    public final int method3066(int arg0) {
        if (arg0 != 72) {
            this.method3066(73);
        }
        return this.field9155;
    }

    @OriginalMember(owner = "client!oia", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 96)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3653(4, var4, 6, var3, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 110)
    private final void method3650(int arg0, Component arg1) {
        this.method3652((byte) -102);
        this.field9162 = arg1;
        this.field9162.addMouseListener(this);
        this.field9162.addMouseMotionListener(this);
        if (arg0 != -15059) {
            this.method3065(-50);
        }
        this.field9162.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "(I)I", line = 125)
    public final int method3065(int arg0) {
        return arg0 == -28062 ? this.field9154 : -51;
    }

    @OriginalMember(owner = "client!oia", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 135)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3649(arg0.getY(), 2, arg0.getX());
    }

    @OriginalMember(owner = "client!oia", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(I)Z", line = 153)
    public final boolean method3064(int arg0) {
        int var2 = -10 % ((arg0 - 24) / 32);
        return (this.field9156 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 161)
    private final int method3651(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg1 != -50) {
            return -105;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "(I)V", line = 188)
    public final synchronized void method3068(int arg0) {
        this.field9156 = this.field9157;
        this.field9155 = this.field9160;
        this.field9154 = this.field9158;
        class665 var2 = this.field9153;
        if (arg0 != -1) {
            this.field9158 = 61;
        }
        this.field9153 = this.field9159;
        this.field9159 = var2;
        this.field9159.method3735(-4676);
    }

    @OriginalMember(owner = "client!oia", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 209)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3649(arg0.getY(), 2, arg0.getX());
    }

    @OriginalMember(owner = "client!oia", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 217)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3651(arg0, (byte) -50);
        if ((this.field9157 & var2) == 0) {
            var2 = this.field9157;
        }
        if ((var2 & 0x1) != 0) {
            this.method3653(4, arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method3653(4, arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method3653(4, arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
        }
        this.field9157 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oia", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 242)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3649(arg0.getY(), 2, arg0.getX());
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Z", line = 250)
    public final boolean method3070(byte arg0) {
        int var2 = -68 / ((29 - arg0) / 42);
        return (this.field9156 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V", line = 259)
    private final void method3652(byte arg0) {
        if (this.field9162 == null) {
            return;
        }
        this.field9162.removeMouseWheelListener(this);
        this.field9162.removeMouseMotionListener(this);
        if (arg0 >= -66) {
            this.field9159 = null;
        }
        this.field9162.removeMouseListener(this);
        this.field9154 = this.field9155 = this.field9156 = 0;
        this.field9153 = null;
        this.field9162 = null;
        this.field9158 = this.field9160 = this.field9157 = 0;
        this.field9159 = null;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIII)V", line = 283)
    private final void method3653(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class612 var6 = new class612();
        var6.field8698 = arg4;
        var6.field8696 = arg2;
        var6.field8695 = arg3;
        var6.field8699 = class337.method2062(false);
        var6.field8697 = arg1;
        this.field9159.method3728((byte) 101, var6);
        if (arg0 != 4) {
            this.method3653(-20, -101, -93, 101, -52);
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class644(Component arg0, boolean arg1) {
        this.method3650(-15059, arg0);
        this.field9161 = arg1;
    }
}
