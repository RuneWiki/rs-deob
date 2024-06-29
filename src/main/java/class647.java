import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class647 extends class383 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lau;")
    private class692 field9174 = new class692();

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lau;")
    private class692 field9178 = new class692();

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Z")
    private boolean field9179;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field9171;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    private int field9173;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    private int field9175;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    private int field9176;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    private int field9177;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field9180;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 4)
    private final void method3629(Component arg0, byte arg1) {
        if (arg1 >= -10) {
            return;
        }
        this.method3630((byte) -117);
        this.field9180 = arg0;
        this.field9180.addMouseListener(this);
        this.field9180.addMouseMotionListener(this);
        this.field9180.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!jl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 20)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3632(arg0.getY(), (byte) 97, arg0.getX());
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V", line = 28)
    private final void method3630(byte arg0) {
        if (this.field9180 == null) {
            return;
        }
        this.field9180.removeMouseWheelListener(this);
        this.field9180.removeMouseMotionListener(this);
        this.field9180.removeMouseListener(this);
        this.field9174 = null;
        this.field9180 = null;
        this.field9178 = null;
        if (arg0 >= -87) {
            this.mouseWheelMoved(null);
        }
        this.field9171 = this.field9173 = this.field9172 = 0;
        this.field9177 = this.field9176 = this.field9175 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Z", line = 50)
    public final boolean method316(int arg0) {
        if (arg0 != 26007) {
            this.mouseDragged(null);
        }
        return (this.field9172 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)Z", line = 60)
    public final boolean method322(int arg0) {
        if (arg0 == 32) {
            return (this.field9172 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIB)V", line = 73)
    private final void method3631(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class317 var6 = new class317();
        var6.field4382 = arg0;
        var6.field4384 = arg3;
        var6.field4381 = arg1;
        var6.field4383 = class254.method1619(true);
        var6.field4385 = arg2;
        int var7 = -23 / ((26 - arg4) / 43);
        this.field9178.method3904(var6, 0);
    }

    @OriginalMember(owner = "client!jl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 90)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3631(var3, 6, var4, var2, (byte) 82);
        arg0.consume();
    }

    @OriginalMember(owner = "client!jl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 103)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3633(arg0, 59);
        if ((var2 & this.field9175) == 0) {
            var2 = this.field9175;
        }
        if ((var2 & 0x1) != 0) {
            this.method3631(arg0.getY(), 3, arg0.getClickCount(), arg0.getX(), (byte) 79);
        }
        if ((var2 & 0x4) != 0) {
            this.method3631(arg0.getY(), 5, arg0.getClickCount(), arg0.getX(), (byte) -52);
        }
        if ((var2 & 0x2) != 0) {
            this.method3631(arg0.getY(), 4, arg0.getClickCount(), arg0.getX(), (byte) 75);
        }
        this.field9175 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 128)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3632(arg0.getY(), (byte) 97, arg0.getX());
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V", line = 135)
    public final synchronized void method312(int arg0) {
        this.field9171 = this.field9177;
        this.field9172 = this.field9175;
        this.field9173 = this.field9176;
        class692 var2 = this.field9174;
        this.field9174 = this.field9178;
        this.field9178 = var2;
        if (arg0 != 0) {
            this.method3630((byte) -104);
        }
        this.field9178.method3896(3);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I", line = 156)
    public final int method310(boolean arg0) {
        if (arg0) {
            this.method309((byte) 55);
        }
        return this.field9171;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBI)V", line = 166)
    private final void method3632(int arg0, byte arg1, int arg2) {
        this.field9177 = arg2;
        if (arg1 != 97) {
            this.mouseExited(null);
        }
        this.field9176 = arg0;
        if (this.field9179) {
            this.method3631(arg0, -1, 0, arg2, (byte) -49);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 182)
    public final void method314(byte arg0) {
        this.method3630((byte) -126);
        if (arg0 < 59) {
            this.field9179 = false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 193)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)I", line = 204)
    public final int method321(int arg0) {
        if (arg0 < 105) {
            this.field9180 = null;
        }
        return this.field9173;
    }

    @OriginalMember(owner = "client!jl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 214)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3632(arg0.getY(), (byte) 97, arg0.getX());
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)Lrl;", line = 221)
    public final class634 method313(byte arg0) {
        if (arg0 != -73) {
            this.method322(-118);
        }
        return (class634) this.field9174.method3906(arg0 + 73);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)Z", line = 231)
    public final boolean method309(byte arg0) {
        if (arg0 <= 20) {
            this.mousePressed(null);
        }
        return (this.field9172 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 242)
    private final int method3633(MouseEvent arg0, int arg1) {
        int var3 = -70 / ((-arg1 - 52) / 37);
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

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class647(Component arg0, boolean arg1) {
        this.method3629(arg0, (byte) -11);
        this.field9179 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 272)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3633(arg0, 99);
        if (var2 == 1) {
            this.method3631(arg0.getY(), 0, arg0.getClickCount(), arg0.getX(), (byte) -35);
        } else if (var2 == 4) {
            this.method3631(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), (byte) -85);
        } else if (var2 == 2) {
            this.method3631(arg0.getY(), 1, arg0.getClickCount(), arg0.getX(), (byte) 102);
        }
        this.field9175 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 297)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3632(arg0.getY(), (byte) 97, arg0.getX());
    }
}
