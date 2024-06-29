import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class581 extends class725 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lfh;")
    private class653 field8117 = new class653();

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lfh;")
    private class653 field8121 = new class653();

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Z")
    private boolean field8126;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    private int field8118;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    private int field8119;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    private int field8120;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    private int field8122;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    private int field8123;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    private int field8124;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field8125;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V", line = 5)
    public final void method1117(int arg0) {
        this.method3307(arg0 + arg0);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 13)
    public final synchronized void method1111(int arg0) {
        this.field8118 = this.field8124;
        this.field8120 = this.field8122;
        this.field8119 = this.field8123;
        class653 var2 = this.field8117;
        this.field8117 = this.field8121;
        if (arg0 < -94) {
            this.field8121 = var2;
            this.field8121.method3668(0);
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V", line = 33)
    private final void method3307(int arg0) {
        if (this.field8125 == null) {
            return;
        }
        this.field8125.removeMouseWheelListener(this);
        if (arg0 != 4) {
            this.method1115(41);
        }
        this.field8125.removeMouseMotionListener(this);
        this.field8125.removeMouseListener(this);
        this.field8125 = null;
        this.field8123 = this.field8122 = this.field8124 = 0;
        this.field8119 = this.field8120 = this.field8118 = 0;
        this.field8121 = null;
        this.field8117 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 56)
    private final void method3308(byte arg0, Component arg1) {
        this.method3307(4);
        if (arg0 >= -40) {
            this.mouseWheelMoved(null);
        }
        this.field8125 = arg1;
        this.field8125.addMouseListener(this);
        this.field8125.addMouseMotionListener(this);
        this.field8125.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!v", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3310(4, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I", line = 77)
    public final int method1118(byte arg0) {
        if (arg0 <= 121) {
            this.field8118 = 12;
        }
        return this.field8119;
    }

    @OriginalMember(owner = "client!v", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 88)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3310(4, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V", line = 96)
    private final void method3309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class219 var6 = new class219();
        var6.field2946 = arg4;
        if (arg1 != 1) {
            this.method1118((byte) 41);
        }
        var6.field2950 = arg3;
        var6.field2948 = arg2;
        var6.field2947 = class446.method2525(500);
        var6.field2949 = arg0;
        this.field8121.method3671(var6, false);
    }

    @OriginalMember(owner = "client!v", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 112)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3310(4, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Z", line = 119)
    public final boolean method1109(boolean arg0) {
        if (arg0) {
            this.method1113((byte) 24);
        }
        return (this.field8118 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Z", line = 130)
    public final boolean method1113(byte arg0) {
        if (arg0 != 65) {
            this.mousePressed(null);
        }
        return (this.field8118 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I", line = 140)
    public final int method1115(int arg0) {
        return arg0 == 4 ? this.field8120 : -93;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lcia;", line = 152)
    public final class614 method1114(int arg0) {
        if (arg0 != -28128) {
            this.method1115(116);
        }
        return (class614) this.field8117.method3665(23290);
    }

    @OriginalMember(owner = "client!v", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3311(arg0, -10278);
        if ((var2 & this.field8124) == 0) {
            var2 = this.field8124;
        }
        if ((var2 & 0x1) != 0) {
            this.method3309(arg0.getClickCount(), 1, arg0.getX(), 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method3309(arg0.getClickCount(), 1, arg0.getX(), 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method3309(arg0.getClickCount(), 1, arg0.getX(), 4, arg0.getY());
        }
        this.field8124 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V", line = 189)
    private final void method3310(int arg0, int arg1, int arg2) {
        if (arg0 != 4) {
            return;
        }
        this.field8122 = arg1;
        this.field8123 = arg2;
        if (this.field8126) {
            this.method3309(0, arg0 ^ 0x5, arg2, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 206)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3310(4, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 213)
    private final int method3311(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            if (arg1 != -10278) {
                this.field8120 = -6;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z", line = 239)
    public final boolean method1119(int arg0) {
        if (arg0 != -23098) {
            this.mousePressed(null);
        }
        return (this.field8118 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!v", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 249)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!v", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 260)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3309(var4, 1, var2, 6, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!v", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 275)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3311(arg0, -10278);
        if (var2 == 1) {
            this.method3309(arg0.getClickCount(), 1, arg0.getX(), 0, arg0.getY());
        } else if (var2 == 4) {
            this.method3309(arg0.getClickCount(), 1, arg0.getX(), 2, arg0.getY());
        } else if (var2 == 2) {
            this.method3309(arg0.getClickCount(), 1, arg0.getX(), 1, arg0.getY());
        }
        this.field8124 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 309)
    public class581(Component arg0, boolean arg1) {
        this.method3308((byte) -69, arg0);
        this.field8126 = arg1;
    }
}
