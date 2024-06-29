import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class572 extends class651 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Ltg;")
    private class605 field8094 = new class605();

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "Ltg;")
    private class605 field8099 = new class605();

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Z")
    private boolean field8101;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    private int field8093;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    private int field8095;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    private int field8096;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    private int field8097;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    private int field8098;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field8102;

    @OriginalMember(owner = "client!gt", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3319(arg0.getY(), 30, arg0.getX());
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIIII)V")
    private final void method3315(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class633 var6 = new class633();
        if (arg0 != -33) {
            this.method2915(17);
        }
        var6.field8883 = arg2;
        var6.field8884 = arg3;
        var6.field8885 = arg4;
        var6.field8886 = class18.method109(-11121);
        var6.field8887 = arg1;
        this.field8099.method3472(106, var6);
    }

    @OriginalMember(owner = "client!gt", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3316(arg0, false);
        if ((var2 & this.field8100) == 0) {
            var2 = this.field8100;
        }
        if ((var2 & 0x1) != 0) {
            this.method3315((byte) -33, arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method3315((byte) -33, arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method3315((byte) -33, arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
        }
        this.field8100 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gt", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3316(arg0, false);
        if (var2 == 1) {
            this.method3315((byte) -33, arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
        } else if (var2 == 4) {
            this.method3315((byte) -33, arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
        } else if (var2 == 2) {
            this.method3315((byte) -33, arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
        }
        this.field8100 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(B)V")
    public final synchronized void method2930(byte arg0) {
        this.field8095 = this.field8097;
        this.field8096 = this.field8098;
        this.field8093 = this.field8100;
        class605 var2 = this.field8094;
        this.field8094 = this.field8099;
        this.field8099 = var2;
        this.field8099.method3465(0);
        int var3 = -52 / ((arg0 + 29) / 44);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Z")
    public final boolean method2929(byte arg0) {
        if (arg0 > -113) {
            this.field8101 = true;
        }
        return (this.field8093 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method2916(int arg0) {
        this.method3317(3);
        if (arg0 != 24462) {
            this.method2922((byte) 120);
        }
    }

    @OriginalMember(owner = "client!gt", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3319(arg0.getY(), 46, arg0.getX());
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
    private final int method3316(MouseEvent arg0, boolean arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            if (arg1) {
                this.method2929((byte) -85);
            }
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!gt", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3319(arg0.getY(), 115, arg0.getX());
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V")
    private final void method3317(int arg0) {
        if (this.field8102 == null) {
            return;
        }
        this.field8102.removeMouseWheelListener(this);
        this.field8102.removeMouseMotionListener(this);
        this.field8102.removeMouseListener(this);
        this.field8102 = null;
        if (arg0 != 3) {
            this.method3316(null, true);
        }
        this.field8099 = null;
        this.field8094 = null;
        this.field8098 = this.field8097 = this.field8100 = 0;
        this.field8096 = this.field8095 = this.field8093 = 0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    private final void method3318(boolean arg0, Component arg1) {
        if (!arg0) {
            this.field8094 = null;
        }
        this.method3317(3);
        this.field8102 = arg1;
        this.field8102.addMouseListener(this);
        this.field8102.addMouseMotionListener(this);
        this.field8102.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)V")
    private final void method3319(int arg0, int arg1, int arg2) {
        this.field8097 = arg0;
        this.field8098 = arg2;
        if (arg1 <= 9) {
            this.method2929((byte) -111);
        }
        if (this.field8101) {
            this.method3315((byte) -33, 0, arg2, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Z")
    public final boolean method2922(byte arg0) {
        if (arg0 >= -3) {
            return false;
        } else {
            return (this.field8093 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Z")
    public final boolean method2918(int arg0) {
        if (arg0 != -16656) {
            this.field8096 = -77;
        }
        return (this.field8093 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)I")
    public final int method2921(byte arg0) {
        int var2 = -121 % ((arg0 + 71) / 52);
        return this.field8095;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
    public final int method2915(int arg0) {
        if (arg0 != -8463) {
            this.method3318(false, null);
        }
        return this.field8096;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Lck;")
    public final class703 method2925(byte arg0) {
        return arg0 <= 24 ? (class703) null : (class703) this.field8094.method3466(0);
    }

    @OriginalMember(owner = "client!gt", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3315((byte) -33, var4, var2, 6, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!gt", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3319(arg0.getY(), 57, arg0.getX());
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class572(Component arg0, boolean arg1) {
        this.method3318(true, arg0);
        this.field8101 = arg1;
    }
}
