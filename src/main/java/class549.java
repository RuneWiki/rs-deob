import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class549 extends class100 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Lbq;")
    private class289 field7877 = new class289();

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lbq;")
    private class289 field7881 = new class289();

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
    private boolean field7884;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    private int field7876;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    private int field7878;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    private int field7879;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    private int field7880;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    private int field7882;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field7885;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(Z)Z")
    public final boolean method698(boolean arg0) {
        if (!arg0) {
            this.field7879 = -16;
        }
        return (this.field7876 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3224((byte) 98, arg0);
        if ((var2 & this.field7882) == 0) {
            var2 = this.field7882;
        }
        if ((var2 & 0x1) != 0) {
            this.method3226(arg0.getClickCount(), true, arg0.getX(), arg0.getY(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method3226(arg0.getClickCount(), true, arg0.getX(), arg0.getY(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method3226(arg0.getClickCount(), true, arg0.getX(), arg0.getY(), 4);
        }
        this.field7882 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3224((byte) 92, arg0);
        if (var2 == 1) {
            this.method3226(arg0.getClickCount(), true, arg0.getX(), arg0.getY(), 0);
        } else if (var2 == 4) {
            this.method3226(arg0.getClickCount(), true, arg0.getX(), arg0.getY(), 2);
        } else if (var2 == 2) {
            this.method3226(arg0.getClickCount(), true, arg0.getX(), arg0.getY(), 1);
        }
        this.field7882 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3225(false, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3225(false, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public final synchronized void method701(int arg0) {
        this.field7879 = this.field7883;
        this.field7876 = this.field7882;
        this.field7878 = this.field7880;
        class289 var2 = this.field7877;
        this.field7877 = this.field7881;
        this.field7881 = var2;
        this.field7881.method1728(29632);
        if (arg0 != 6971) {
            this.method692(false);
        }
    }

    @OriginalMember(owner = "client!nl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3225(false, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)I")
    public final int method694(byte arg0) {
        int var2 = -29 / ((18 - arg0) / 62);
        return this.field7879;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method3222(Component arg0, boolean arg1) {
        this.method3223(-24826);
        this.field7885 = arg0;
        if (arg1) {
            this.method695(true);
        }
        this.field7885.addMouseListener(this);
        this.field7885.addMouseMotionListener(this);
        this.field7885.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    private final void method3223(int arg0) {
        if (this.field7885 == null) {
            return;
        }
        this.field7885.removeMouseWheelListener(this);
        this.field7885.removeMouseMotionListener(this);
        this.field7885.removeMouseListener(this);
        this.field7883 = this.field7880 = this.field7882 = 0;
        this.field7877 = null;
        this.field7885 = null;
        this.field7879 = this.field7878 = this.field7876 = 0;
        this.field7881 = null;
        if (arg0 != -24826) {
            this.field7882 = -124;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I")
    public final int method691(byte arg0) {
        if (arg0 >= -100) {
            this.field7883 = -3;
        }
        return this.field7878;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
    public final boolean method692(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return (this.field7876 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public final void method693(byte arg0) {
        this.method3223(-24826);
        if (arg0 <= 36) {
            this.method699((byte) 24);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method3224(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        }
        if (arg0 < 90) {
            this.method691((byte) -34);
        }
        if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)Lu;")
    public final class73 method695(boolean arg0) {
        if (arg0) {
            this.method698(false);
        }
        return (class73) this.field7877.method1729(662);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZII)V")
    private final void method3225(boolean arg0, int arg1, int arg2) {
        this.field7883 = arg1;
        if (arg0) {
            this.field7884 = true;
        }
        this.field7880 = arg2;
        if (this.field7884) {
            this.method3226(0, true, arg1, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3225(false, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3226(var4, true, var2, var3, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)Z")
    public final boolean method699(byte arg0) {
        if (arg0 <= 116) {
            this.mousePressed(null);
        }
        return (this.field7876 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZIII)V")
    private final void method3226(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class307 var6 = new class307();
        var6.field3821 = arg3;
        var6.field3824 = arg4;
        var6.field3825 = arg2;
        var6.field3823 = class652.method3700(-1);
        var6.field3822 = arg0;
        if (arg1) {
            this.field7881.method1721((byte) 119, var6);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class549(Component arg0, boolean arg1) {
        this.method3222(arg0, false);
        this.field7884 = arg1;
    }
}
