import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class291 extends class174 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!vja", name = "h", descriptor = "Ljia;")
    private class645 field4005 = new class645();

    @OriginalMember(owner = "client!vja", name = "k", descriptor = "Ljia;")
    private class645 field4008 = new class645();

    @OriginalMember(owner = "client!vja", name = "p", descriptor = "Z")
    private boolean field4013;

    @OriginalMember(owner = "client!vja", name = "g", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!vja", name = "i", descriptor = "I")
    private int field4006;

    @OriginalMember(owner = "client!vja", name = "j", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!vja", name = "l", descriptor = "I")
    private int field4009;

    @OriginalMember(owner = "client!vja", name = "m", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!vja", name = "n", descriptor = "I")
    private int field4011;

    @OriginalMember(owner = "client!vja", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4012;

    @OriginalMember(owner = "client!vja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1854(arg0.getX(), (byte) -84, arg0.getY());
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(Z)Lhl;")
    public final class556 method1325(boolean arg0) {
        if (!arg0) {
            this.mouseMoved(null);
        }
        return (class556) this.field4005.method3584(23287);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)V")
    public final synchronized void method1318(byte arg0) {
        this.field4004 = this.field4010;
        if (arg0 > -23) {
            return;
        }
        this.field4007 = this.field4011;
        this.field4006 = this.field4009;
        class645 var2 = this.field4005;
        this.field4005 = this.field4008;
        this.field4008 = var2;
        this.field4008.method3590((byte) 7);
    }

    @OriginalMember(owner = "client!vja", name = "d", descriptor = "(B)I")
    public final int method1326(byte arg0) {
        int var2 = -11 / ((62 - arg0) / 34);
        return this.field4006;
    }

    @OriginalMember(owner = "client!vja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1851(arg0, false);
        if (var2 == 1) {
            this.method1852(0, arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method1852(2, arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method1852(1, arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
        }
        this.field4010 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
    private final int method1851(MouseEvent arg0, boolean arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            if (arg1) {
                this.mouseExited(null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "(B)V")
    public final void method1321(byte arg0) {
        this.method1855(-89);
        if (arg0 != -47) {
            this.field4006 = -121;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIII)V")
    private final void method1852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class477 var6 = new class477();
        var6.field6452 = arg0;
        var6.field6449 = arg4;
        var6.field6450 = arg3;
        var6.field6451 = class197.method1423(1);
        var6.field6453 = arg1;
        this.field4008.method3594((byte) -103, var6);
        if (arg2 != 0) {
            this.method1851(null, false);
        }
    }

    @OriginalMember(owner = "client!vja", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1852(6, var4, 0, var2, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!vja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1854(arg0.getX(), (byte) -84, arg0.getY());
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)Z")
    public final boolean method1323(int arg0) {
        if (arg0 != 4) {
            this.method1322(false);
        }
        return (this.field4004 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1853(int arg0, Component arg1) {
        this.method1855(52);
        this.field4012 = arg1;
        if (arg0 != 6) {
            this.field4006 = -12;
        }
        this.field4012.addMouseListener(this);
        this.field4012.addMouseMotionListener(this);
        this.field4012.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IBI)V")
    private final void method1854(int arg0, byte arg1, int arg2) {
        this.field4009 = arg0;
        this.field4011 = arg2;
        if (arg1 != -84) {
            this.mousePressed(null);
        }
        if (this.field4013) {
            this.method1852(-1, 0, 0, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1854(arg0.getX(), (byte) -84, arg0.getY());
    }

    @OriginalMember(owner = "client!vja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1854(arg0.getX(), (byte) -84, arg0.getY());
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Z)Z")
    public final boolean method1322(boolean arg0) {
        if (!arg0) {
            this.field4008 = null;
        }
        return (this.field4004 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(B)I")
    public final int method1319(byte arg0) {
        if (arg0 != 126) {
            this.field4010 = -116;
        }
        return this.field4007;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)Z")
    public final boolean method1317(int arg0) {
        if (arg0 == -117063712) {
            return (this.field4004 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vja", name = "d", descriptor = "(I)V")
    private final void method1855(int arg0) {
        if (this.field4012 == null) {
            return;
        }
        this.field4012.removeMouseWheelListener(this);
        this.field4012.removeMouseMotionListener(this);
        this.field4012.removeMouseListener(this);
        this.field4012 = null;
        this.field4006 = this.field4007 = this.field4004 = 0;
        int var2 = -120 % ((18 - arg0) / 34);
        this.field4005 = null;
        this.field4008 = null;
        this.field4009 = this.field4011 = this.field4010 = 0;
    }

    @OriginalMember(owner = "client!vja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1851(arg0, false);
        if ((this.field4010 & var2) == 0) {
            var2 = this.field4010;
        }
        if ((var2 & 0x1) != 0) {
            this.method1852(3, arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method1852(5, arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method1852(4, arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
        }
        this.field4010 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class291(Component arg0, boolean arg1) {
        this.method1853(6, arg0);
        this.field4013 = arg1;
    }
}
