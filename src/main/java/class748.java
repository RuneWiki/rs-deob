import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class748 extends class597 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "Lok;")
    private class266 field10356 = new class266();

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "Lok;")
    private class266 field10359 = new class266();

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "Z")
    private boolean field10362;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    private int field10354;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    private int field10355;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    private int field10357;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    private int field10358;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    private int field10360;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    private int field10361;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field10363;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
    public final synchronized void method2655(byte arg0) {
        this.field10357 = this.field10361;
        this.field10355 = this.field10360;
        this.field10354 = this.field10358;
        class266 var2 = this.field10356;
        this.field10356 = this.field10359;
        if (arg0 < 52) {
            this.method2652(-68);
        }
        this.field10359 = var2;
        this.field10359.method1729((byte) 27);
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)I")
    public final int method2650(byte arg0) {
        if (arg0 > -37) {
            this.field10357 = -102;
        }
        return this.field10354;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIBII)V")
    private final void method4164(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class135 var6 = new class135();
        var6.field2039 = arg4;
        var6.field2040 = arg0;
        var6.field2036 = arg1;
        var6.field2037 = class459.method2731(124);
        var6.field2038 = arg3;
        this.field10359.method1727(var6, (byte) 103);
        if (arg2 != 106) {
            this.method4167(null, -35);
        }
    }

    @OriginalMember(owner = "client!dw", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method4166(-122, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
    public final void method2652(int arg0) {
        this.method4168((byte) -116);
        if (arg0 != -30663) {
            this.method2651(-105);
        }
    }

    @OriginalMember(owner = "client!dw", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method4166(111, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z")
    public final boolean method2653(byte arg0) {
        int var2 = -82 % ((arg0 - 28) / 37);
        return (this.field10355 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dw", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method4165(arg0, (byte) 68);
        if ((this.field10360 & var2) == 0) {
            var2 = this.field10360;
        }
        if ((var2 & 0x1) != 0) {
            this.method4164(3, arg0.getY(), (byte) 106, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method4164(5, arg0.getY(), (byte) 106, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method4164(4, arg0.getY(), (byte) 106, arg0.getClickCount(), arg0.getX());
        }
        this.field10360 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dw", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method4166(112, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)I")
    public final int method2646(int arg0) {
        if (arg0 != 9) {
            this.method2652(-111);
        }
        return this.field10357;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method4165(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        }
        if (arg1 != 68) {
            this.mouseClicked(null);
        }
        if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
    private final void method4166(int arg0, int arg1, int arg2) {
        this.field10358 = arg1;
        this.field10361 = arg2;
        int var4 = 70 % ((arg0 - 38) / 56);
        if (this.field10362) {
            this.method4164(-1, arg1, (byte) 106, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
    public final boolean method2647(int arg0) {
        if (arg0 <= 101) {
            this.mouseReleased(null);
        }
        return (this.field10355 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method4167(Component arg0, int arg1) {
        if (arg1 != -27065) {
            this.method2658(124);
        }
        this.method4168((byte) -116);
        this.field10363 = arg0;
        this.field10363.addMouseListener(this);
        this.field10363.addMouseMotionListener(this);
        this.field10363.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)V")
    private final void method4168(byte arg0) {
        if (this.field10363 == null) {
            return;
        }
        this.field10363.removeMouseWheelListener(this);
        this.field10363.removeMouseMotionListener(this);
        this.field10363.removeMouseListener(this);
        this.field10359 = null;
        if (arg0 == -116) {
            this.field10363 = null;
            this.field10361 = this.field10358 = this.field10360 = 0;
            this.field10356 = null;
            this.field10357 = this.field10354 = this.field10355 = 0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method4166(120, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)Z")
    public final boolean method2658(int arg0) {
        if (arg0 == -2) {
            return (this.field10355 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dw", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method4165(arg0, (byte) 68);
        if (var2 == 1) {
            this.method4164(0, arg0.getY(), (byte) 106, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 4) {
            this.method4164(2, arg0.getY(), (byte) 106, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 2) {
            this.method4164(1, arg0.getY(), (byte) 106, arg0.getClickCount(), arg0.getX());
        }
        this.field10360 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dw", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method4164(6, var3, (byte) 106, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!dw", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)Lrm;")
    public final class430 method2651(int arg0) {
        return arg0 == -2 ? (class430) this.field10356.method1736(0) : (class430) null;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class748(Component arg0, boolean arg1) {
        this.method4167(arg0, -27065);
        this.field10362 = arg1;
    }
}
