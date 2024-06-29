import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class73 extends class330 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lbv;")
    private class568 field1003 = new class568();

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lbv;")
    private class568 field1010 = new class568();

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Z")
    private boolean field1011;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field1012;

    @OriginalMember(owner = "client!vf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method427(arg0.getX(), (byte) -81, arg0.getY());
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
    private final void method427(int arg0, byte arg1, int arg2) {
        this.field1007 = arg0;
        this.field1009 = arg2;
        if (this.field1011) {
            this.method428(arg2, -68, -1, 0, arg0);
        }
        if (arg1 >= -57) {
            this.mouseDragged(null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method427(arg0.getX(), (byte) -126, arg0.getY());
    }

    @OriginalMember(owner = "client!vf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method430((byte) 30, arg0);
        if ((this.field1008 & var2) == 0) {
            var2 = this.field1008;
        }
        if ((var2 & 0x1) != 0) {
            this.method428(arg0.getY(), -69, 3, 0, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method428(arg0.getY(), -124, 5, 0, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method428(arg0.getY(), -112, 4, 0, arg0.getX());
        }
        this.field1008 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    private final void method428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class122 var6 = new class122();
        var6.field1532 = arg4;
        var6.field1535 = arg2;
        var6.field1534 = arg0;
        var6.field1533 = class348.method2175(-119);
        var6.field1531 = arg3;
        if (arg1 <= -63) {
            this.field1010.method3181(var6, true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public final void method89(boolean arg0) {
        if (!arg0) {
            this.field1009 = -85;
        }
        this.method431(66);
    }

    @OriginalMember(owner = "client!vf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method427(arg0.getX(), (byte) -74, arg0.getY());
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)Z")
    public final boolean method98(boolean arg0) {
        if (!arg0) {
            this.field1004 = 26;
        }
        return (this.field1005 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method429(int arg0, Component arg1) {
        this.method431(arg0 ^ 0x10);
        if (arg0 != 0) {
            this.field1004 = -61;
        }
        this.field1012 = arg1;
        this.field1012.addMouseListener(this);
        this.field1012.addMouseMotionListener(this);
        this.field1012.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lsda;")
    public final class7 method88(int arg0) {
        if (arg0 != 14211) {
            this.method88(58);
        }
        return (class7) this.field1003.method3184(-5295);
    }

    @OriginalMember(owner = "client!vf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method430((byte) -96, arg0);
        if (var2 == 1) {
            this.method428(arg0.getY(), -91, 0, 0, arg0.getX());
        } else if (var2 == 4) {
            this.method428(arg0.getY(), -80, 2, 0, arg0.getX());
        } else if (var2 == 2) {
            this.method428(arg0.getY(), -102, 1, 0, arg0.getX());
        }
        this.field1008 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
    public final int method100(byte arg0) {
        if (arg0 > -41) {
            this.method429(94, null);
        }
        return this.field1004;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        if (arg0 != 15997) {
            this.field1008 = -20;
        }
        return (this.field1005 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method430(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        }
        int var3 = -70 % ((73 - arg0) / 36);
        if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    private final void method431(int arg0) {
        if (this.field1012 == null) {
            return;
        }
        this.field1012.removeMouseWheelListener(this);
        this.field1012.removeMouseMotionListener(this);
        this.field1012.removeMouseListener(this);
        this.field1003 = null;
        this.field1004 = this.field1006 = this.field1005 = 0;
        this.field1007 = this.field1009 = this.field1008 = 0;
        this.field1010 = null;
        this.field1012 = null;
        if (arg0 <= 1) {
            this.method90(-88);
        }
    }

    @OriginalMember(owner = "client!vf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method428(var3, -88, 6, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public final synchronized void method99(int arg0) {
        this.field1006 = this.field1009;
        this.field1005 = this.field1008;
        this.field1004 = this.field1007;
        int var2 = -115 / ((arg0 - 12) / 58);
        class568 var3 = this.field1003;
        this.field1003 = this.field1010;
        this.field1010 = var3;
        this.field1010.method3178(-8299);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Z")
    public final boolean method90(int arg0) {
        if (arg0 != 16) {
            this.method90(-124);
        }
        return (this.field1005 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
    public final int method92(int arg0) {
        return arg0 == 8 ? this.field1006 : -106;
    }

    @OriginalMember(owner = "client!vf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method427(arg0.getX(), (byte) -75, arg0.getY());
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class73(Component arg0, boolean arg1) {
        this.method429(0, arg0);
        this.field1011 = arg1;
    }
}
