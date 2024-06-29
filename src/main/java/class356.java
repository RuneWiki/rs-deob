import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class356 extends class325 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lwo;")
    private class445 field4748 = new class445();

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "Lwo;")
    private class445 field4752 = new class445();

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Z")
    private boolean field4755;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    private int field4746;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    private int field4749;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    private int field4750;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    private int field4751;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    private int field4753;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4754;

    @OriginalMember(owner = "client!vn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2099(100, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(B)V", line = 12)
    private final void method2097(byte arg0) {
        if (this.field4754 == null) {
            return;
        }
        this.field4754.removeMouseWheelListener(this);
        this.field4754.removeMouseMotionListener(this);
        this.field4754.removeMouseListener(this);
        this.field4748 = null;
        this.field4754 = null;
        if (arg0 == -100) {
            this.field4751 = this.field4750 = this.field4753 = 0;
            this.field4752 = null;
            this.field4749 = this.field4747 = this.field4746 = 0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 36)
    public final synchronized void method1888(int arg0) {
        this.field4749 = this.field4751;
        this.field4747 = this.field4750;
        this.field4746 = this.field4753;
        class445 var2 = this.field4748;
        this.field4748 = this.field4752;
        this.field4752 = var2;
        if (arg0 > -99) {
            this.field4751 = 22;
        }
        this.field4752.method2512(-11558);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)I", line = 61)
    public final int method1893(byte arg0) {
        return arg0 < 39 ? 42 : this.field4747;
    }

    @OriginalMember(owner = "client!vn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 71)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2099(-119, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V", line = 78)
    public final void method1895(int arg0) {
        if (arg0 != -20895) {
            this.method1888(-1);
        }
        this.method2097((byte) -100);
    }

    @OriginalMember(owner = "client!vn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 88)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I", line = 98)
    private final int method2098(boolean arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else if (arg0) {
            return 120;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z", line = 124)
    public final boolean method1887(byte arg0) {
        if (arg0 != 69) {
            this.mouseEntered(null);
        }
        return (this.field4746 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 135)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2100(var3, 6, var2, (byte) -115, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class356(Component arg0, boolean arg1) {
        this.method2101(-52, arg0);
        this.field4755 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 154)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2099(125, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V", line = 164)
    private final void method2099(int arg0, int arg1, int arg2) {
        this.field4750 = arg2;
        this.field4751 = arg1;
        if (this.field4755) {
            this.method2100(arg2, -1, arg1, (byte) -115, 0);
        }
        int var4 = -98 % ((arg0 - 43) / 39);
    }

    @OriginalMember(owner = "client!vn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 179)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2098(false, arg0);
        if ((this.field4753 & var2) == 0) {
            var2 = this.field4753;
        }
        if ((var2 & 0x1) != 0) {
            this.method2100(arg0.getY(), 3, arg0.getX(), (byte) -115, arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2100(arg0.getY(), 5, arg0.getX(), (byte) -115, arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2100(arg0.getY(), 4, arg0.getX(), (byte) -115, arg0.getClickCount());
        }
        this.field4753 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 205)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2099(84, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z", line = 212)
    public final boolean method1891(int arg0) {
        if (arg0 != 8) {
            this.field4748 = null;
        }
        return (this.field4746 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIBI)V", line = 224)
    private final void method2100(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class84 var6 = new class84();
        var6.field1012 = arg0;
        if (arg3 != -115) {
            this.method1891(-9);
        }
        var6.field1011 = arg1;
        var6.field1010 = arg2;
        var6.field1009 = class529.method2982((byte) -69);
        var6.field1008 = arg4;
        this.field4752.method2507(var6, (byte) -123);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)Z", line = 240)
    public final boolean method1894(byte arg0) {
        if (arg0 <= 18) {
            this.method1887((byte) 12);
        }
        return (this.field4746 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)I", line = 250)
    public final int method1890(int arg0) {
        if (arg0 != 16777215) {
            this.mouseReleased(null);
        }
        return this.field4749;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Lll;", line = 260)
    public final class294 method1886(boolean arg0) {
        if (!arg0) {
            this.method2098(false, null);
        }
        return (class294) this.field4748.method2502((byte) -119);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 270)
    private final void method2101(int arg0, Component arg1) {
        this.method2097((byte) -100);
        this.field4754 = arg1;
        int var3 = -23 / ((10 - arg0) / 40);
        this.field4754.addMouseListener(this);
        this.field4754.addMouseMotionListener(this);
        this.field4754.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!vn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 284)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2098(false, arg0);
        if (var2 == 1) {
            this.method2100(arg0.getY(), 0, arg0.getX(), (byte) -115, arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2100(arg0.getY(), 2, arg0.getX(), (byte) -115, arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2100(arg0.getY(), 1, arg0.getX(), (byte) -115, arg0.getClickCount());
        }
        this.field4753 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
