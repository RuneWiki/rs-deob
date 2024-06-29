import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class567 extends class233 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lmba;")
    private class646 field7852 = new class646();

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lmba;")
    private class646 field7855 = new class646();

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Z")
    private boolean field7858;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    private int field7849;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    private int field7850;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    private int field7851;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    private int field7853;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    private int field7854;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    private int field7856;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field7857;

    @OriginalMember(owner = "client!fa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3324(var2, 6, var3, var4, (byte) 126);
        arg0.consume();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method3322(Component arg0, byte arg1) {
        this.method3325(7195);
        this.field7857 = arg0;
        this.field7857.addMouseListener(this);
        this.field7857.addMouseMotionListener(this);
        this.field7857.addMouseWheelListener(this);
        if (arg1 != -69) {
            this.field7857 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3323(arg0, -1506);
        if (var2 == 1) {
            this.method3324(arg0.getX(), 0, arg0.getY(), arg0.getClickCount(), (byte) 126);
        } else if (var2 == 4) {
            this.method3324(arg0.getX(), 2, arg0.getY(), arg0.getClickCount(), (byte) 127);
        } else if (var2 == 2) {
            this.method3324(arg0.getX(), 1, arg0.getY(), arg0.getClickCount(), (byte) 126);
        }
        this.field7853 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
    public final int method1553(byte arg0) {
        return arg0 <= 59 ? -73 : this.field7850;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lq;")
    public final class674 method1552(boolean arg0) {
        return arg0 ? (class674) this.field7852.method3623(0) : (class674) null;
    }

    @OriginalMember(owner = "client!fa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3326(arg0.getY(), arg0.getX(), 87);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method3323(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            if (arg1 != -1506) {
                this.method1559(true);
            }
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3326(arg0.getY(), arg0.getX(), 125);
    }

    @OriginalMember(owner = "client!fa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3326(arg0.getY(), arg0.getX(), 105);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public final synchronized void method1554(byte arg0) {
        this.field7849 = this.field7853;
        this.field7850 = this.field7854;
        this.field7851 = this.field7856;
        class646 var2 = this.field7852;
        this.field7852 = this.field7855;
        this.field7855 = var2;
        int var3 = 109 / ((-arg0 - 14) / 48);
        this.field7855.method3615((byte) -44);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIB)V")
    private final void method3324(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class410 var6 = new class410();
        var6.field5853 = arg1;
        var6.field5852 = arg0;
        var6.field5851 = arg2;
        if (arg4 < 125) {
            this.method3323(null, 67);
        }
        var6.field5854 = class97.method664((byte) -50);
        var6.field5850 = arg3;
        this.field7855.method3610(9289, var6);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)Z")
    public final boolean method1560(boolean arg0) {
        if (!arg0) {
            this.field7858 = false;
        }
        return (this.field7849 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public final void method1551(int arg0) {
        if (arg0 < 96) {
            this.method1554((byte) 37);
        }
        this.method3325(7195);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
    public final boolean method1555(int arg0) {
        if (arg0 != -25195) {
            this.method1556(-98);
        }
        return (this.field7849 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    private final void method3325(int arg0) {
        if (this.field7857 == null) {
            return;
        }
        this.field7857.removeMouseWheelListener(this);
        this.field7857.removeMouseMotionListener(this);
        this.field7857.removeMouseListener(this);
        this.field7855 = null;
        this.field7857 = null;
        if (arg0 != 7195) {
            this.mousePressed(null);
        }
        this.field7850 = this.field7851 = this.field7849 = 0;
        this.field7854 = this.field7856 = this.field7853 = 0;
        this.field7852 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    private final void method3326(int arg0, int arg1, int arg2) {
        if (arg2 < 71) {
            return;
        }
        this.field7856 = arg0;
        this.field7854 = arg1;
        if (this.field7858) {
            this.method3324(arg1, -1, arg0, 0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)Z")
    public final boolean method1559(boolean arg0) {
        if (arg0) {
            return (this.field7849 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3323(arg0, -1506);
        if ((this.field7853 & var2) == 0) {
            var2 = this.field7853;
        }
        if ((var2 & 0x1) != 0) {
            this.method3324(arg0.getX(), 3, arg0.getY(), arg0.getClickCount(), (byte) 127);
        }
        if ((var2 & 0x4) != 0) {
            this.method3324(arg0.getX(), 5, arg0.getY(), arg0.getClickCount(), (byte) 127);
        }
        if ((var2 & 0x2) != 0) {
            this.method3324(arg0.getX(), 4, arg0.getY(), arg0.getClickCount(), (byte) 127);
        }
        this.field7853 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)I")
    public final int method1556(int arg0) {
        if (arg0 != 20) {
            this.field7850 = 37;
        }
        return this.field7851;
    }

    @OriginalMember(owner = "client!fa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3326(arg0.getY(), arg0.getX(), 124);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class567(Component arg0, boolean arg1) {
        this.method3322(arg0, (byte) -69);
        this.field7858 = arg1;
    }
}
