import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class391 extends class543 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "Lqia;")
    private class547 field5469 = new class547();

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "Lqia;")
    private class547 field5470 = new class547();

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "Z")
    private boolean field5475;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    private int field5467;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    private int field5468;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    private int field5471;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    private int field5472;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    private int field5473;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field5474;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method2327(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else {
            if (arg0 != 109) {
                this.method2329(65);
            }
            return arg1.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V")
    public final void method2328(byte arg0) {
        this.method2329(-23940);
        if (arg0 > -43) {
            this.field5471 = 72;
        }
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
    private final void method2329(int arg0) {
        if (this.field5474 == null) {
            return;
        }
        this.field5474.removeMouseWheelListener(this);
        this.field5474.removeMouseMotionListener(this);
        this.field5474.removeMouseListener(this);
        this.field5469 = null;
        this.field5470 = null;
        this.field5474 = null;
        this.field5468 = this.field5467 = this.field5466 = 0;
        this.field5473 = this.field5472 = this.field5471 = 0;
        if (arg0 != -23940) {
            this.field5474 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
    public final boolean method2330(int arg0) {
        if (arg0 == 0) {
            return (this.field5466 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V")
    public final synchronized void method2331(byte arg0) {
        this.field5466 = this.field5471;
        this.field5467 = this.field5472;
        this.field5468 = this.field5473;
        class547 var2 = this.field5469;
        this.field5469 = this.field5470;
        this.field5470 = var2;
        this.field5470.method3114(true);
        if (arg0 < 5) {
            this.mousePressed(null);
        }
    }

    @OriginalMember(owner = "client!dda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2327((byte) 109, arg0);
        if ((var2 & this.field5471) == 0) {
            var2 = this.field5471;
        }
        if ((var2 & 0x1) != 0) {
            this.method2335(arg0.getClickCount(), arg0.getY(), 3, (byte) 77, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2335(arg0.getClickCount(), arg0.getY(), 5, (byte) 85, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2335(arg0.getClickCount(), arg0.getY(), 4, (byte) 118, arg0.getX());
        }
        this.field5471 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2327((byte) 109, arg0);
        if (var2 == 1) {
            this.method2335(arg0.getClickCount(), arg0.getY(), 0, (byte) 65, arg0.getX());
        } else if (var2 == 4) {
            this.method2335(arg0.getClickCount(), arg0.getY(), 2, (byte) 60, arg0.getX());
        } else if (var2 == 2) {
            this.method2335(arg0.getClickCount(), arg0.getY(), 1, (byte) 90, arg0.getX());
        }
        this.field5471 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIB)V")
    private final void method2332(int arg0, int arg1, byte arg2) {
        this.field5473 = arg1;
        this.field5472 = arg0;
        if (arg2 != -3) {
            this.mouseExited(null);
        }
        if (this.field5475) {
            this.method2335(0, arg0, -1, (byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!dda", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2335(var4, var3, 6, (byte) 104, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!dda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2332(arg0.getY(), arg0.getX(), (byte) -3);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)Luk;")
    public final class283 method2333(boolean arg0) {
        if (arg0) {
            this.field5466 = -24;
        }
        return (class283) this.field5469.method3115(1210318848);
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)Z")
    public final boolean method2334(int arg0) {
        if (arg0 == 0) {
            return (this.field5466 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIBI)V")
    private final void method2335(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class532 var6 = new class532();
        var6.field7484 = arg4;
        if (arg3 <= 46) {
            this.field5471 = -58;
        }
        var6.field7485 = arg2;
        var6.field7486 = arg1;
        var6.field7482 = class97.method654((byte) 90);
        var6.field7483 = arg0;
        this.field5470.method3110(var6, 1);
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(B)I")
    public final int method2336(byte arg0) {
        if (arg0 <= 2) {
            this.method2329(41);
        }
        return this.field5467;
    }

    @OriginalMember(owner = "client!dda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2332(arg0.getY(), arg0.getX(), (byte) -3);
    }

    @OriginalMember(owner = "client!dda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2332(arg0.getY(), arg0.getX(), (byte) -3);
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)I")
    public final int method2337(int arg0) {
        return arg0 >= -108 ? -32 : this.field5468;
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(B)Z")
    public final boolean method2338(byte arg0) {
        if (arg0 != 92) {
            this.mouseEntered(null);
        }
        return (this.field5466 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method2339(Component arg0, boolean arg1) {
        this.method2329(-23940);
        if (!arg1) {
            this.field5468 = 81;
        }
        this.field5474 = arg0;
        this.field5474.addMouseListener(this);
        this.field5474.addMouseMotionListener(this);
        this.field5474.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!dda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2332(arg0.getY(), arg0.getX(), (byte) -3);
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class391(Component arg0, boolean arg1) {
        this.method2339(arg0, true);
        this.field5475 = arg1;
    }
}
