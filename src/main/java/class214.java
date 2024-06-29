import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class214 extends class582 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lrk;")
    private class419 field3136 = new class419();

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Lrk;")
    private class419 field3141 = new class419();

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Z")
    private boolean field3143;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    private int field3137;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    private int field3142;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field3144;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 4)
    private final void method1382(Component arg0, boolean arg1) {
        this.method1386(-19278);
        this.field3144 = arg0;
        this.field3144.addMouseListener(this);
        this.field3144.addMouseMotionListener(this);
        this.field3144.addMouseWheelListener(this);
        if (!arg1) {
            this.field3140 = -18;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 18)
    private final int method1383(int arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            if (arg0 != -1) {
                this.method1382(null, false);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 46)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1384(1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!oi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 53)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1384(1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 62)
    private final void method1384(int arg0, int arg1, int arg2) {
        this.field3140 = arg1;
        if (arg0 != 1) {
            this.field3143 = false;
        }
        this.field3142 = arg2;
        if (this.field3143) {
            this.method1385(arg1, 0, -1, -14815, arg2);
        }
    }

    @OriginalMember(owner = "client!oi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 77)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1383(-1, arg0);
        if ((var2 & this.field3139) == 0) {
            var2 = this.field3139;
        }
        if ((var2 & 0x1) != 0) {
            this.method1385(arg0.getY(), 0, 3, -14815, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1385(arg0.getY(), 0, 5, -14815, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1385(arg0.getY(), 0, 4, -14815, arg0.getX());
        }
        this.field3139 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)Lwi;", line = 105)
    public final class497 method632(byte arg0) {
        return arg0 == 104 ? (class497) this.field3136.method2498((byte) 38) : (class497) null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V", line = 116)
    private final void method1385(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class7 var6 = new class7();
        var6.field60 = arg0;
        var6.field61 = arg2;
        var6.field64 = arg4;
        var6.field63 = class450.method2719((byte) -71);
        if (arg3 == -14815) {
            var6.field62 = arg1;
            this.field3141.method2492(var6, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!oi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 134)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1383(-1, arg0);
        if (var2 == 1) {
            this.method1385(arg0.getY(), 0, 0, -14815, arg0.getX());
        } else if (var2 == 4) {
            this.method1385(arg0.getY(), 0, 2, -14815, arg0.getX());
        } else if (var2 == 2) {
            this.method1385(arg0.getY(), 0, 1, -14815, arg0.getX());
        }
        this.field3139 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 158)
    public final synchronized void method641(int arg0) {
        this.field3138 = this.field3140;
        this.field3137 = this.field3142;
        this.field3135 = this.field3139;
        class419 var2 = this.field3136;
        this.field3136 = this.field3141;
        this.field3141 = var2;
        this.field3141.method2499(0);
        int var3 = -3 / ((arg0 + 5) / 33);
    }

    @OriginalMember(owner = "client!oi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 178)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 190)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1385(var3, var4, 6, -14815, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I", line = 202)
    public final int method635(int arg0) {
        return arg0 == -192 ? this.field3137 : -107;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)I", line = 212)
    public final int method633(byte arg0) {
        if (arg0 != 29) {
            this.method1383(48, null);
        }
        return this.field3138;
    }

    @OriginalMember(owner = "client!oi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 224)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1384(1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 232)
    private final void method1386(int arg0) {
        if (this.field3144 == null) {
            return;
        }
        this.field3144.removeMouseWheelListener(this);
        this.field3144.removeMouseMotionListener(this);
        this.field3144.removeMouseListener(this);
        this.field3144 = null;
        this.field3136 = null;
        this.field3137 = this.field3138 = this.field3135 = 0;
        if (arg0 == -19278) {
            this.field3142 = this.field3140 = this.field3139 = 0;
            this.field3141 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(B)Z", line = 255)
    public final boolean method645(byte arg0) {
        int var2 = -57 / ((arg0 + 31) / 50);
        return (this.field3135 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)Z", line = 263)
    public final boolean method634(int arg0) {
        if (arg0 <= 111) {
            this.method632((byte) 41);
        }
        return (this.field3135 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 273)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1384(1, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(B)V", line = 280)
    public final void method637(byte arg0) {
        this.method1386(-19278);
        if (arg0 != 90) {
            this.method641(-8);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class214(Component arg0, boolean arg1) {
        this.method1382(arg0, true);
        this.field3143 = arg1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z", line = 295)
    public final boolean method638(byte arg0) {
        int var2 = 92 % ((-arg0 - 28) / 39);
        return (this.field3135 & 0x4) != 0;
    }
}
