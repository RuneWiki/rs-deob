import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class256 extends class324 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lfea;")
    private class47 field3710 = new class47();

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lfea;")
    private class47 field3717 = new class47();

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
    private boolean field3718;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    private int field3711;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    private int field3712;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field3719;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 4)
    public final synchronized void method1606(int arg0) {
        this.field3713 = this.field3716;
        this.field3712 = this.field3714;
        this.field3711 = this.field3715;
        class47 var2 = this.field3710;
        this.field3710 = this.field3717;
        this.field3717 = var2;
        if (arg0 != -1) {
            this.mouseEntered(null);
        }
        this.field3717.method425(arg0 - 96);
    }

    @OriginalMember(owner = "client!uc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 25)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)I", line = 35)
    public final int method1607(byte arg0) {
        if (arg0 != -78) {
            this.method1610(false);
        }
        return this.field3712;
    }

    @OriginalMember(owner = "client!uc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 45)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1609(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 52)
    private final int method1608(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else if (arg1 >= -126) {
            return -34;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 79)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1608(arg0, -127);
        if (var2 == 1) {
            this.method1617(arg0.getY(), 0, (byte) -80, 0, arg0.getX());
        } else if (var2 == 4) {
            this.method1617(arg0.getY(), 2, (byte) -80, 0, arg0.getX());
        } else if (var2 == 2) {
            this.method1617(arg0.getY(), 1, (byte) -80, 0, arg0.getX());
        }
        this.field3715 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 104)
    private final void method1609(int arg0, int arg1, int arg2) {
        this.field3716 = arg1;
        if (arg2 != -1) {
            this.field3718 = true;
        }
        this.field3714 = arg0;
        if (this.field3718) {
            this.method1617(arg0, -1, (byte) -80, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V", line = 120)
    private final void method1610(boolean arg0) {
        if (this.field3719 == null) {
            return;
        }
        if (arg0) {
            this.method1615((byte) 57);
        }
        this.field3719.removeMouseWheelListener(this);
        this.field3719.removeMouseMotionListener(this);
        this.field3719.removeMouseListener(this);
        this.field3710 = null;
        this.field3717 = null;
        this.field3719 = null;
        this.field3713 = this.field3712 = this.field3711 = 0;
        this.field3716 = this.field3714 = this.field3715 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1609(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!uc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 151)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1609(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!uc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 160)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1617(var3, 6, (byte) -80, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z", line = 173)
    public final boolean method1611(int arg0) {
        if (arg0 == -1) {
            return (this.field3711 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Z", line = 183)
    public final boolean method1612(boolean arg0) {
        if (arg0) {
            this.method1609(-29, 57, 51);
        }
        return (this.field3711 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z", line = 193)
    public final boolean method1613(int arg0) {
        if (arg0 == -1) {
            return (this.field3711 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 203)
    public final int method1614(byte arg0) {
        if (arg0 != -46) {
            this.field3719 = null;
        }
        return this.field3713;
    }

    @OriginalMember(owner = "client!uc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 214)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1608(arg0, -128);
        if ((var2 & this.field3715) == 0) {
            var2 = this.field3715;
        }
        if ((var2 & 0x1) != 0) {
            this.method1617(arg0.getY(), 3, (byte) -80, 0, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1617(arg0.getY(), 5, (byte) -80, 0, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1617(arg0.getY(), 4, (byte) -80, 0, arg0.getX());
        }
        this.field3715 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 239)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1609(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 246)
    public final void method1615(byte arg0) {
        this.method1610(false);
        if (arg0 != -41) {
            this.method1616(null, 0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 260)
    private final void method1616(Component arg0, int arg1) {
        this.method1610(false);
        this.field3719 = arg0;
        this.field3719.addMouseListener(this);
        this.field3719.addMouseMotionListener(this);
        this.field3719.addMouseWheelListener(this);
        if (arg1 != 1) {
            this.field3719 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIBII)V", line = 274)
    private final void method1617(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -80) {
            return;
        }
        class500 var6 = new class500();
        var6.field7013 = arg0;
        var6.field7011 = arg1;
        var6.field7012 = arg4;
        var6.field7014 = class508.method2860(false);
        var6.field7015 = arg3;
        this.field3717.method414(var6, (byte) 79);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Lsda;", line = 292)
    public final class7 method1618(int arg0) {
        if (arg0 > -102) {
            this.field3711 = 31;
        }
        return (class7) this.field3710.method417((byte) 51);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 314)
    public class256(Component arg0, boolean arg1) {
        this.method1616(arg0, 1);
        this.field3718 = arg1;
    }
}
