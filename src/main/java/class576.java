import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class576 extends class779 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Lqw;")
    private class84 field7843 = new class84();

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "Lqw;")
    private class84 field7846 = new class84();

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "Z")
    private boolean field7849;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    private int field7841;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    private int field7842;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    private int field7844;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    private int field7845;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    private int field7847;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    private int field7848;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field7850;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public final void method1657(byte arg0) {
        int var2 = -93 / ((arg0 + 33) / 60);
        this.method3266(92);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)V")
    private final void method3265(int arg0, int arg1, int arg2) {
        this.field7848 = arg0;
        this.field7847 = arg1;
        if (arg2 == -14944 && this.field7849) {
            this.method3268(-1, 0, true, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cba", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cba", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3267((byte) -61, arg0);
        if ((var2 & this.field7845) == 0) {
            var2 = this.field7845;
        }
        if ((var2 & 0x1) != 0) {
            this.method3268(3, arg0.getClickCount(), true, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method3268(5, arg0.getClickCount(), true, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method3268(4, arg0.getClickCount(), true, arg0.getX(), arg0.getY());
        }
        this.field7845 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cba", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3265(arg0.getX(), arg0.getY(), -14944);
    }

    @OriginalMember(owner = "client!cba", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3265(arg0.getX(), arg0.getY(), -14944);
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)I")
    public final int method1663(byte arg0) {
        if (arg0 < 112) {
            this.field7849 = true;
        }
        return this.field7842;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
    public final int method1652(int arg0) {
        if (arg0 != 0) {
            this.method1661((byte) -26);
        }
        return this.field7841;
    }

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "(I)V")
    private final void method3266(int arg0) {
        if (this.field7850 == null) {
            return;
        }
        this.field7850.removeMouseWheelListener(this);
        if (arg0 < 64) {
            this.field7843 = null;
        }
        this.field7850.removeMouseMotionListener(this);
        this.field7850.removeMouseListener(this);
        this.field7843 = null;
        this.field7848 = this.field7847 = this.field7845 = 0;
        this.field7846 = null;
        this.field7841 = this.field7842 = this.field7844 = 0;
        this.field7850 = null;
    }

    @OriginalMember(owner = "client!cba", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3268(6, var4, true, var2, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)Z")
    public final boolean method1655(int arg0) {
        if (arg0 < 106) {
            this.mouseMoved(null);
        }
        return (this.field7844 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cba", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3265(arg0.getX(), arg0.getY(), -14944);
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Ltaa;")
    public final class428 method1653(int arg0) {
        if (arg0 != -7049) {
            this.field7846 = null;
        }
        return (class428) this.field7843.method687((byte) -117);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method3267(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else if (arg0 == -61) {
            return 0;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!cba", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3267((byte) -61, arg0);
        if (var2 == 1) {
            this.method3268(0, arg0.getClickCount(), true, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method3268(2, arg0.getClickCount(), true, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method3268(1, arg0.getClickCount(), true, arg0.getX(), arg0.getY());
        }
        this.field7845 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cba", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3265(arg0.getX(), arg0.getY(), -14944);
    }

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "(I)V")
    public final synchronized void method1658(int arg0) {
        this.field7841 = this.field7848;
        this.field7842 = this.field7847;
        this.field7844 = this.field7845;
        class84 var2 = this.field7843;
        this.field7843 = this.field7846;
        this.field7846 = var2;
        if (arg0 != 0) {
            this.field7841 = 80;
        }
        this.field7846.method690(20134);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZII)V")
    private final void method3268(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.field7849 = false;
        }
        class62 var6 = new class62();
        var6.field791 = arg4;
        var6.field792 = arg3;
        var6.field793 = arg0;
        var6.field794 = class401.method2440(false);
        var6.field790 = arg1;
        this.field7846.method689(var6, -7);
    }

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "(I)Z")
    public final boolean method1654(int arg0) {
        if (arg0 != 0) {
            this.field7849 = true;
        }
        return (this.field7844 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)Z")
    public final boolean method1661(byte arg0) {
        int var2 = -13 / ((88 - arg0) / 38);
        return (this.field7844 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method3269(Component arg0, byte arg1) {
        this.method3266(92);
        if (arg1 >= -30) {
            this.field7843 = null;
        }
        this.field7850 = arg0;
        this.field7850.addMouseListener(this);
        this.field7850.addMouseMotionListener(this);
        this.field7850.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class576(Component arg0, boolean arg1) {
        this.method3269(arg0, (byte) -91);
        this.field7849 = arg1;
    }
}
