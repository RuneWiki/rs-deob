import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class416 extends class791 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Ltf;")
    private class524 field6000 = new class524();

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Ltf;")
    private class524 field6005 = new class524();

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
    private boolean field6007;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    private int field5999;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private int field6001;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    private int field6002;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    private int field6003;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    private int field6004;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field6006;

    @OriginalMember(owner = "client!ne", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3253(24215, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Z")
    public final boolean method2886(int arg0) {
        if (arg0 <= 80) {
            this.method2886(-31);
        }
        return (this.field5998 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3253(24215, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public final void method2888(byte arg0) {
        this.method3250((byte) 53);
        if (arg0 < 79) {
            this.field6002 = -38;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    private final void method3250(byte arg0) {
        if (this.field6006 == null) {
            return;
        }
        this.field6006.removeMouseWheelListener(this);
        this.field6006.removeMouseMotionListener(this);
        this.field6006.removeMouseListener(this);
        this.field6003 = this.field6002 = this.field6004 = 0;
        this.field6005 = null;
        this.field6006 = null;
        this.field5999 = this.field6001 = this.field5998 = 0;
        this.field6000 = null;
        if (arg0 > 26) {
            ;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)Z")
    public final boolean method2882(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return (this.field5998 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
    public final int method2881(byte arg0) {
        if (arg0 != 121) {
            this.field6002 = -71;
        }
        return this.field5999;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lvha;")
    public final class682 method2887(int arg0) {
        if (arg0 != 210) {
            this.mouseReleased(null);
        }
        return (class682) this.field6000.method3980(-27119);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method3251(byte arg0, Component arg1) {
        this.method3250((byte) 47);
        if (arg0 < 89) {
            this.mousePressed(null);
        }
        this.field6006 = arg1;
        this.field6006.addMouseListener(this);
        this.field6006.addMouseMotionListener(this);
        this.field6006.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ne", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3253(24215, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public final synchronized void method2877(byte arg0) {
        this.field5998 = this.field6004;
        this.field5999 = this.field6003;
        this.field6001 = this.field6002;
        class524 var2 = this.field6000;
        this.field6000 = this.field6005;
        if (arg0 != -35) {
            this.method2882(false);
        }
        this.field6005 = var2;
        this.field6005.method3982(-121);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method3252(int arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else {
            if (arg0 != 2) {
                this.field5998 = 64;
            }
            return arg1.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3252(2, arg0);
        if (var2 == 1) {
            this.method3254(127, arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 4) {
            this.method3254(124, arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 2) {
            this.method3254(-99, arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
        }
        this.field6004 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
    public final int method2879(int arg0) {
        if (arg0 != -237) {
            this.mousePressed(null);
        }
        return this.field6001;
    }

    @OriginalMember(owner = "client!ne", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3252(2, arg0);
        if ((var2 & this.field6004) == 0) {
            var2 = this.field6004;
        }
        if ((var2 & 0x1) != 0) {
            this.method3254(117, arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method3254(-45, arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method3254(-43, arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
        }
        this.field6004 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
    public final boolean method2874(int arg0) {
        if (arg0 != -756041375) {
            this.method2881((byte) -11);
        }
        return (this.field5998 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    private final void method3253(int arg0, int arg1, int arg2) {
        this.field6002 = arg2;
        this.field6003 = arg1;
        if (arg0 != 24215) {
            this.field6003 = 109;
        }
        if (this.field6007) {
            this.method3254(121, arg2, -1, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3253(24215, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    private final void method3254(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class120 var6 = new class120();
        var6.field1520 = arg2;
        var6.field1516 = arg1;
        var6.field1517 = arg4;
        var6.field1518 = class614.method4531(-60);
        int var7 = 123 / ((53 - arg0) / 61);
        var6.field1519 = arg3;
        this.field6005.method3984(var6, 0);
    }

    @OriginalMember(owner = "client!ne", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3254(-75, var3, 6, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class416(Component arg0, boolean arg1) {
        this.method3251((byte) 103, arg0);
        this.field6007 = arg1;
    }
}
