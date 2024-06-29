import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class356 extends class392 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lbu;")
    private class19 field4853 = new class19();

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lbu;")
    private class19 field4858 = new class19();

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
    private boolean field4860;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field4852;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    private int field4854;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    private int field4856;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    private int field4859;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4861;

    @OriginalMember(owner = "client!mf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 6)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2147(var4, 6, var3, (byte) -119, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBI)V", line = 19)
    private final void method2147(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -119) {
            this.method2148(-15, 88, (byte) -93);
        }
        class124 var6 = new class124();
        var6.field1731 = arg2;
        var6.field1728 = arg1;
        var6.field1729 = arg4;
        var6.field1727 = class598.method3538(true);
        var6.field1730 = arg0;
        this.field4858.method131(var6, arg3 + 119);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V", line = 37)
    private final void method2148(int arg0, int arg1, byte arg2) {
        this.field4856 = arg0;
        if (arg2 != 81) {
            this.mouseMoved(null);
        }
        this.field4859 = arg1;
        if (this.field4860) {
            this.method2147(0, -1, arg1, (byte) -119, arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I", line = 54)
    public final int method1594(int arg0) {
        if (arg0 != 2028208128) {
            this.mouseExited(null);
        }
        return this.field4855;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Z", line = 64)
    public final boolean method1597(byte arg0) {
        if (arg0 <= 75) {
            return true;
        } else {
            return (this.field4852 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 75)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z", line = 85)
    public final boolean method1589(int arg0) {
        if (arg0 != 27928) {
            this.method1596((byte) -128);
        }
        return (this.field4852 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 97)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2149(arg0, 2);
        if (var2 == 1) {
            this.method2147(0, 0, arg0.getY(), (byte) -119, arg0.getX());
        } else if (var2 == 4) {
            this.method2147(0, 2, arg0.getY(), (byte) -119, arg0.getX());
        } else if (var2 == 2) {
            this.method2147(0, 1, arg0.getY(), (byte) -119, arg0.getX());
        }
        this.field4857 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V", line = 119)
    public final void method1596(byte arg0) {
        if (arg0 <= 54) {
            this.method2148(-7, -48, (byte) -114);
        }
        this.method2150(-120);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Z", line = 130)
    public final boolean method1595(boolean arg0) {
        if (!arg0) {
            this.field4858 = null;
        }
        return (this.field4852 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!mf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2148(arg0.getX(), arg0.getY(), (byte) 81);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Lqw;", line = 147)
    public final class68 method1585(byte arg0) {
        if (arg0 != 14) {
            this.field4855 = -22;
        }
        return (class68) this.field4853.method128(936);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)I", line = 159)
    public final int method1587(byte arg0) {
        int var2 = 19 % ((-arg0 - 78) / 32);
        return this.field4854;
    }

    @OriginalMember(owner = "client!mf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 167)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2148(arg0.getX(), arg0.getY(), (byte) 81);
    }

    @OriginalMember(owner = "client!mf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 174)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2148(arg0.getX(), arg0.getY(), (byte) 81);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 181)
    public final synchronized void method1591(int arg0) {
        this.field4855 = this.field4859;
        this.field4854 = this.field4856;
        this.field4852 = this.field4857;
        if (arg0 == 1310982144) {
            class19 var2 = this.field4853;
            this.field4853 = this.field4858;
            this.field4858 = var2;
            this.field4858.method122((byte) 14);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 202)
    private final int method2149(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg1 == 2) {
            return arg0.getButton() == 3 ? 4 : 0;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 229)
    private final void method2150(int arg0) {
        if (this.field4861 == null) {
            return;
        }
        this.field4861.removeMouseWheelListener(this);
        this.field4861.removeMouseMotionListener(this);
        this.field4861.removeMouseListener(this);
        this.field4854 = this.field4855 = this.field4852 = 0;
        this.field4853 = null;
        this.field4858 = null;
        this.field4861 = null;
        this.field4856 = this.field4859 = this.field4857 = 0;
        int var2 = -11 / ((arg0 + 69) / 48);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 251)
    private final void method2151(Component arg0, byte arg1) {
        this.method2150(6);
        this.field4861 = arg0;
        if (arg1 == 70) {
            this.field4861.addMouseListener(this);
            this.field4861.addMouseMotionListener(this);
            this.field4861.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!mf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 266)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2149(arg0, 2);
        if ((var2 & this.field4857) == 0) {
            var2 = this.field4857;
        }
        if ((var2 & 0x1) != 0) {
            this.method2147(0, 3, arg0.getY(), (byte) -119, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2147(0, 5, arg0.getY(), (byte) -119, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2147(0, 4, arg0.getY(), (byte) -119, arg0.getX());
        }
        this.field4857 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 290)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2148(arg0.getX(), arg0.getY(), (byte) 81);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class356(Component arg0, boolean arg1) {
        this.method2151(arg0, (byte) 70);
        this.field4860 = arg1;
    }
}
