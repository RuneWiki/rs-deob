import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class36 extends class686 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lfca;")
    private class661 field397 = new class661();

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lfca;")
    private class661 field401 = new class661();

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Z")
    private boolean field402;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field403;

    @OriginalMember(owner = "client!oc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method218((byte) -122, arg0);
        if ((var2 & this.field398) == 0) {
            var2 = this.field398;
        }
        if ((var2 & 0x1) != 0) {
            this.method215(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3, (byte) -74);
        }
        if ((var2 & 0x4) != 0) {
            this.method215(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5, (byte) -74);
        }
        if ((var2 & 0x2) != 0) {
            this.method215(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4, (byte) -74);
        }
        this.field398 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 28)
    private final void method207(byte arg0, Component arg1) {
        this.method209(4272);
        this.field403 = arg1;
        this.field403.addMouseListener(this);
        this.field403.addMouseMotionListener(this);
        if (arg0 != -122) {
            this.method214(-11);
        }
        this.field403.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)I", line = 42)
    public final int method208(int arg0) {
        if (arg0 >= -20) {
            this.field397 = null;
        }
        return this.field395;
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V", line = 53)
    private final void method209(int arg0) {
        if (this.field403 == null) {
            return;
        }
        this.field403.removeMouseWheelListener(this);
        this.field403.removeMouseMotionListener(this);
        if (arg0 != 4272) {
            this.mouseWheelMoved(null);
        }
        this.field403.removeMouseListener(this);
        this.field401 = null;
        this.field396 = this.field395 = this.field394 = 0;
        this.field400 = this.field399 = this.field398 = 0;
        this.field397 = null;
        this.field403 = null;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I", line = 75)
    public final int method210(int arg0) {
        return arg0 == 0 ? this.field396 : 117;
    }

    @OriginalMember(owner = "client!oc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 87)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method215(var3, var2, var4, 6, (byte) -74);
        arg0.consume();
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 99)
    public final synchronized void method211(byte arg0) {
        this.field394 = this.field398;
        this.field396 = this.field400;
        this.field395 = this.field399;
        class661 var2 = this.field397;
        this.field397 = this.field401;
        if (arg0 == -94) {
            this.field401 = var2;
            this.field401.method3594(48);
        }
    }

    @OriginalMember(owner = "client!oc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 120)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method216(arg0.getX(), 4729, arg0.getY());
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Z", line = 127)
    public final boolean method212(int arg0) {
        if (arg0 != 1) {
            this.method212(-31);
        }
        return (this.field394 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)Z", line = 139)
    public final boolean method213(int arg0) {
        if (arg0 == 1) {
            return (this.field394 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 149)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Z", line = 158)
    public final boolean method214(int arg0) {
        if (arg0 != 1929) {
            this.field400 = -64;
        }
        return (this.field394 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 169)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method216(arg0.getX(), 4729, arg0.getY());
    }

    @OriginalMember(owner = "client!oc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 176)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method216(arg0.getX(), 4729, arg0.getY());
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIB)V", line = 184)
    private final void method215(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class241 var6 = new class241();
        var6.field3333 = arg3;
        var6.field3329 = arg0;
        var6.field3332 = arg1;
        var6.field3330 = class502.method2786(-7114);
        var6.field3331 = arg2;
        this.field401.method3593(var6, 15);
        if (arg4 != -74) {
            this.field395 = -31;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 203)
    private final void method216(int arg0, int arg1, int arg2) {
        this.field399 = arg2;
        if (arg1 != 4729) {
            this.method214(-86);
        }
        this.field400 = arg0;
        if (this.field402) {
            this.method215(arg2, arg0, 0, -1, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 218)
    public final void method217(int arg0) {
        this.method209(arg0 ^ 0x1078);
        if (arg0 != 200) {
            this.field400 = -81;
        }
    }

    @OriginalMember(owner = "client!oc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 228)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method216(arg0.getX(), 4729, arg0.getY());
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 237)
    private final int method218(byte arg0, MouseEvent arg1) {
        if (arg0 >= -9) {
            this.field400 = 40;
        }
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 265)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method218((byte) -41, arg0);
        if (var2 == 1) {
            this.method215(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0, (byte) -74);
        } else if (var2 == 4) {
            this.method215(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2, (byte) -74);
        } else if (var2 == 2) {
            this.method215(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1, (byte) -74);
        }
        this.field398 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lvt;", line = 291)
    public final class793 method219(byte arg0) {
        int var2 = 54 % ((arg0 - 15) / 61);
        return (class793) this.field397.method3599(-59);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 310)
    public class36(Component arg0, boolean arg1) {
        this.method207((byte) -122, arg0);
        this.field402 = arg1;
    }
}
