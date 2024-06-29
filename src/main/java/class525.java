import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class525 extends class435 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lada;")
    private class164 field7491 = new class164();

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lada;")
    private class164 field7494 = new class164();

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
    private boolean field7498;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    private int field7490;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    private int field7492;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    private int field7493;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    private int field7495;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    private int field7496;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    private int field7497;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field7499;

    @OriginalMember(owner = "client!sf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3080(arg0.getY(), 34, arg0.getX());
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public final synchronized void method2691(int arg0) {
        this.field7492 = this.field7495;
        this.field7490 = this.field7497;
        this.field7493 = this.field7496;
        class164 var2 = this.field7491;
        this.field7491 = this.field7494;
        this.field7494 = var2;
        this.field7494.method1200(50);
        if (arg0 != 9231) {
            this.field7492 = -101;
        }
    }

    @OriginalMember(owner = "client!sf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3077(var4, var3, (byte) 71, var2, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    private final void method3076(byte arg0) {
        if (this.field7499 == null) {
            return;
        }
        this.field7499.removeMouseWheelListener(this);
        this.field7499.removeMouseMotionListener(this);
        this.field7499.removeMouseListener(this);
        this.field7496 = this.field7495 = this.field7497 = 0;
        this.field7491 = null;
        this.field7499 = null;
        if (arg0 == -3) {
            this.field7493 = this.field7492 = this.field7490 = 0;
            this.field7494 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3078(arg0, 1);
        if ((this.field7497 & var2) == 0) {
            var2 = this.field7497;
        }
        if ((var2 & 0x1) != 0) {
            this.method3077(arg0.getClickCount(), arg0.getY(), (byte) -98, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method3077(arg0.getClickCount(), arg0.getY(), (byte) -70, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method3077(arg0.getClickCount(), arg0.getY(), (byte) -96, arg0.getX(), 4);
        }
        this.field7497 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBII)V")
    private final void method3077(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class549 var6 = new class549();
        int var7 = -19 % ((arg2 + 4) / 61);
        var6.field7849 = arg3;
        var6.field7847 = arg4;
        var6.field7851 = arg1;
        var6.field7850 = class524.method3075(18);
        var6.field7848 = arg0;
        this.field7494.method1203(var6, (byte) 116);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
    public final boolean method2695(byte arg0) {
        if (arg0 == -116) {
            return (this.field7490 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Z")
    public final boolean method2692(int arg0) {
        if (arg0 == 0) {
            return (this.field7490 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method3078(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            if (arg1 != 1) {
                this.field7496 = 81;
            }
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3080(arg0.getY(), 85, arg0.getX());
    }

    @OriginalMember(owner = "client!sf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3080(arg0.getY(), 100, arg0.getX());
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method3079(int arg0, Component arg1) {
        if (arg0 <= 85) {
            this.field7494 = null;
        }
        this.method3076((byte) -3);
        this.field7499 = arg1;
        this.field7499.addMouseListener(this);
        this.field7499.addMouseMotionListener(this);
        this.field7499.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!sf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3078(arg0, 1);
        if (var2 == 1) {
            this.method3077(arg0.getClickCount(), arg0.getY(), (byte) 88, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method3077(arg0.getClickCount(), arg0.getY(), (byte) -96, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method3077(arg0.getClickCount(), arg0.getY(), (byte) -73, arg0.getX(), 1);
        }
        this.field7497 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I")
    public final int method2697(int arg0) {
        if (arg0 != 4212) {
            this.mousePressed(null);
        }
        return this.field7493;
    }

    @OriginalMember(owner = "client!sf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3080(arg0.getY(), 41, arg0.getX());
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lwi;")
    public final class467 method2699(boolean arg0) {
        return arg0 ? (class467) null : (class467) this.field7491.method1198((byte) 124);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    private final void method3080(int arg0, int arg1, int arg2) {
        if (arg1 < 25) {
            this.mouseWheelMoved(null);
        }
        this.field7495 = arg0;
        this.field7496 = arg2;
        if (this.field7498) {
            this.method3077(0, arg0, (byte) -120, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Z")
    public final boolean method2690(int arg0) {
        if (arg0 == 27621) {
            return (this.field7490 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
    public final int method2698(int arg0) {
        if (arg0 != 0) {
            this.field7496 = -43;
        }
        return this.field7492;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public final void method2696(int arg0) {
        this.method3076((byte) -3);
        if (arg0 != 16384) {
            this.method2698(30);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class525(Component arg0, boolean arg1) {
        this.method3079(120, arg0);
        this.field7498 = arg1;
    }
}
