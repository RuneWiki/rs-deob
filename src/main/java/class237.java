import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class237 extends class188 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Lam;")
    private class455 field3444 = new class455();

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "Lam;")
    private class455 field3449 = new class455();

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "Z")
    private boolean field3453;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    private int field3447;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field3452;

    @OriginalMember(owner = "client!rq", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public final synchronized void method1198(int arg0) {
        this.field3447 = this.field3450;
        this.field3445 = this.field3448;
        this.field3446 = this.field3451;
        class455 var2 = this.field3444;
        this.field3444 = this.field3449;
        this.field3449 = var2;
        if (arg0 != 3544) {
            this.method1459(-47);
        }
        this.field3449.method2656(89);
    }

    @OriginalMember(owner = "client!rq", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field3450 = -1;
        this.field3448 = -1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)I")
    public final int method1192(boolean arg0) {
        return arg0 ? this.field3445 : 87;
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)V")
    private final void method1459(int arg0) {
        if (this.field3452 == null) {
            return;
        }
        this.field3452.removeMouseWheelListener(this);
        this.field3452.removeMouseMotionListener(this);
        this.field3452.removeMouseListener(this);
        int var2 = -58 / ((arg0 - 60) / 48);
        this.field3449 = null;
        this.field3452 = null;
        this.field3445 = this.field3447 = this.field3446 = 0;
        this.field3448 = this.field3450 = this.field3451 = 0;
        this.field3444 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
    private final void method1460(MouseEvent arg0, int arg1) {
        if (arg1 != -12127) {
            return;
        }
        this.field3448 = arg0.getX();
        this.field3450 = arg0.getY();
        if (this.field3453) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, -1);
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)Z")
    public final boolean method1201(byte arg0) {
        if (arg0 != -85) {
            this.method1201((byte) -4);
        }
        return (this.field3446 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
    public final int method1194(int arg0) {
        if (arg0 != 36) {
            this.method1459(123);
        }
        return this.field3447;
    }

    @OriginalMember(owner = "client!rq", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1460(arg0, -12127);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method1461(MouseEvent arg0, int arg1) {
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        }
        if (arg1 > -73) {
            this.method1196(-36);
        }
        if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rq", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1461(arg0, -96);
        if (var2 == 1) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, 0);
        } else if (var2 == 4) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, 2);
        } else if (var2 == 2) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, 1);
        }
        this.field3451 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rq", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1462(var2, var4, var3, false, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method1193(byte arg0) {
        if (arg0 != -7) {
            this.field3453 = false;
        }
        this.method1459(arg0 + 126);
    }

    @OriginalMember(owner = "client!rq", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1461(arg0, -100);
        if ((var2 & this.field3451) == 0) {
            var2 = this.field3451;
        }
        if ((var2 & 0x1) != 0) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1462(arg0.getX(), 0, arg0.getY(), false, 4);
        }
        this.field3451 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Lke;")
    public final class432 method1196(int arg0) {
        if (arg0 != 100) {
            this.mouseReleased(null);
        }
        return (class432) this.field3444.method2654(-1);
    }

    @OriginalMember(owner = "client!rq", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1460(arg0, -12127);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIZI)V")
    private final void method1462(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class173 var6 = new class173();
        var6.field2500 = arg4;
        var6.field2502 = arg0;
        var6.field2499 = arg2;
        var6.field2503 = class465.method2699((byte) 14);
        if (arg3) {
            this.field3444 = null;
        }
        var6.field2501 = arg1;
        this.field3449.method2657(8492, var6);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method1463(Component arg0, byte arg1) {
        this.method1459(arg1 - 15);
        this.field3452 = arg0;
        this.field3452.addMouseListener(this);
        this.field3452.addMouseMotionListener(this);
        if (arg1 == -15) {
            this.field3452.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!rq", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1460(arg0, -12127);
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)Z")
    public final boolean method1199(int arg0) {
        if (arg0 == 14795) {
            return (this.field3446 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)Z")
    public final boolean method1197(byte arg0) {
        int var2 = 4 / ((arg0 + 53) / 59);
        return (this.field3446 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class237(Component arg0, boolean arg1) {
        this.method1463(arg0, (byte) -15);
        this.field3453 = arg1;
    }
}
