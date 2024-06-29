import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class359 extends class372 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Ldm;")
    private class46 field4828 = new class46();

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Ldm;")
    private class46 field4835 = new class46();

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Z")
    private boolean field4837;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    private int field4829;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    private int field4830;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    private int field4833;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4836;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    private final void method2145(int arg0) {
        if (this.field4836 == null) {
            return;
        }
        this.field4836.removeMouseWheelListener(this);
        this.field4836.removeMouseMotionListener(this);
        this.field4836.removeMouseListener(this);
        this.field4835 = null;
        if (arg0 != 20537) {
            this.field4837 = true;
        }
        this.field4834 = this.field4832 = this.field4833 = 0;
        this.field4828 = null;
        this.field4836 = null;
        this.field4831 = this.field4830 = this.field4829 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2148((byte) 11, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public final synchronized void method2146(byte arg0) {
        this.field4829 = this.field4833;
        this.field4830 = this.field4832;
        this.field4831 = this.field4834;
        class46 var2 = this.field4828;
        this.field4828 = this.field4835;
        this.field4835 = var2;
        if (arg0 < -1) {
            this.field4835.method465(true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method2147(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else if (arg1 == -11102) {
            return 0;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
    private final void method2148(byte arg0, int arg1, int arg2) {
        this.field4834 = arg2;
        this.field4832 = arg1;
        if (arg0 != 11) {
            this.field4830 = -5;
        }
        if (this.field4837) {
            this.method2154(arg1, arg2, 0, 90, -1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2147(arg0, -11102);
        if (var2 == 1) {
            this.method2154(arg0.getY(), arg0.getX(), 0, 82, 0);
        } else if (var2 == 4) {
            this.method2154(arg0.getY(), arg0.getX(), 0, 37, 2);
        } else if (var2 == 2) {
            this.method2154(arg0.getY(), arg0.getX(), 0, -85, 1);
        }
        this.field4833 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2148((byte) 11, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method2149(Component arg0, byte arg1) {
        this.method2145(20537);
        if (arg1 == 99) {
            this.field4836 = arg0;
            this.field4836.addMouseListener(this);
            this.field4836.addMouseMotionListener(this);
            this.field4836.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Z")
    public final boolean method2150(int arg0) {
        if (arg0 != 6244) {
            this.field4833 = 67;
        }
        return (this.field4829 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Z")
    public final boolean method2151(byte arg0) {
        if (arg0 < 33) {
            this.method2157((byte) 70);
        }
        return (this.field4829 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
    public final int method2152(int arg0) {
        if (arg0 != 0) {
            this.field4830 = -21;
        }
        return this.field4830;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
    public final int method2153(byte arg0) {
        int var2 = -125 % ((arg0 - 25) / 52);
        return this.field4831;
    }

    @OriginalMember(owner = "client!ad", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
    private final void method2154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 44 % ((-arg3 - 31) / 41);
        class59 var7 = new class59();
        var7.field1060 = arg4;
        var7.field1061 = arg0;
        var7.field1059 = arg1;
        var7.field1062 = class488.method2835(30160);
        var7.field1063 = arg2;
        this.field4835.method463(var7, -100);
    }

    @OriginalMember(owner = "client!ad", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2154(var3, var2, var4, 88, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
    public final boolean method2155(boolean arg0) {
        if (arg0) {
            this.method2154(-32, -91, 95, -125, 94);
        }
        return (this.field4829 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2147(arg0, -11102);
        if ((var2 & this.field4833) == 0) {
            var2 = this.field4833;
        }
        if ((var2 & 0x1) != 0) {
            this.method2154(arg0.getY(), arg0.getX(), 0, 104, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2154(arg0.getY(), arg0.getX(), 0, 18, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2154(arg0.getY(), arg0.getX(), 0, 25, 4);
        }
        this.field4833 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2148((byte) 11, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)Lbh;")
    public final class32 method2156(byte arg0) {
        if (arg0 > -108) {
            this.field4831 = 34;
        }
        return (class32) this.field4828.method459(3553);
    }

    @OriginalMember(owner = "client!ad", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2148((byte) 11, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method2157(byte arg0) {
        this.method2145(20537);
        if (arg0 >= -21) {
            this.field4834 = -63;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class359(Component arg0, boolean arg1) {
        this.method2149(arg0, (byte) 99);
        this.field4837 = arg1;
    }
}
