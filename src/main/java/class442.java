import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class442 extends class391 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!os", name = "i", descriptor = "Lbg;")
    private class464 field6296 = new class464();

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Lbg;")
    private class464 field6300 = new class464();

    @OriginalMember(owner = "client!os", name = "p", descriptor = "Z")
    private boolean field6303;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    private int field6295;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    private int field6297;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    private int field6298;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    private int field6299;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    private int field6301;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    private int field6302;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field6304;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)Les;", line = 4)
    public final class382 method1097(int arg0) {
        if (arg0 != -3) {
            this.mouseMoved(null);
        }
        return (class382) this.field6296.method2762((byte) -16);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V", line = 15)
    private final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class284 var6 = new class284();
        var6.field4032 = arg2;
        var6.field4031 = arg0;
        var6.field4030 = arg3;
        var6.field4029 = class479.method2864((byte) -58);
        if (arg1 == 4062) {
            var6.field4033 = arg4;
            this.field6300.method2770((byte) -13, var6);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I", line = 32)
    private final int method2663(MouseEvent arg0, boolean arg1) {
        if (arg1) {
            this.mouseClicked(null);
        }
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!os", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 60)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2663(arg0, false);
        if ((var2 & this.field6301) == 0) {
            var2 = this.field6301;
        }
        if ((var2 & 0x1) != 0) {
            this.method2662(arg0.getY(), 4062, 3, arg0.getX(), arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2662(arg0.getY(), 4062, 5, arg0.getX(), arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2662(arg0.getY(), 4062, 4, arg0.getX(), arg0.getClickCount());
        }
        this.field6301 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 86)
    private final void method2664(int arg0, Component arg1) {
        this.method2666(0);
        this.field6304 = arg1;
        if (arg0 == 3) {
            this.field6304.addMouseListener(this);
            this.field6304.addMouseMotionListener(this);
            this.field6304.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!os", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2665(arg0.getX(), arg0.getY(), -12617);
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)Z", line = 108)
    public final boolean method1091(int arg0) {
        if (arg0 != -1) {
            this.mouseReleased(null);
        }
        return (this.field6298 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!os", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 122)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2662(var3, 4062, 6, var2, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!os", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 134)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2665(arg0.getX(), arg0.getY(), -12617);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z", line = 141)
    public final boolean method1090(byte arg0) {
        if (arg0 != 46) {
            this.method1094(-72);
        }
        return (this.field6298 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!os", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 151)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V", line = 160)
    private final void method2665(int arg0, int arg1, int arg2) {
        this.field6299 = arg1;
        if (arg2 != -12617) {
            this.method1097(121);
        }
        this.field6302 = arg0;
        if (this.field6303) {
            this.method2662(arg1, 4062, -1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!os", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2663(arg0, false);
        if (var2 == 1) {
            this.method2662(arg0.getY(), 4062, 0, arg0.getX(), arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2662(arg0.getY(), 4062, 2, arg0.getX(), arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2662(arg0.getY(), 4062, 1, arg0.getX(), arg0.getClickCount());
        }
        this.field6301 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 203)
    public final synchronized void method1092(int arg0) {
        if (arg0 != 0) {
            this.method2665(-103, 10, 113);
        }
        this.field6298 = this.field6301;
        this.field6295 = this.field6299;
        this.field6297 = this.field6302;
        class464 var2 = this.field6296;
        this.field6296 = this.field6300;
        this.field6300 = var2;
        this.field6300.method2767((byte) -19);
    }

    @OriginalMember(owner = "client!os", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 224)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2665(arg0.getX(), arg0.getY(), -12617);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)I", line = 231)
    public final int method1089(byte arg0) {
        if (arg0 != -63) {
            this.method2663(null, true);
        }
        return this.field6295;
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "(I)V", line = 241)
    private final void method2666(int arg0) {
        if (this.field6304 == null) {
            return;
        }
        this.field6304.removeMouseWheelListener(this);
        this.field6304.removeMouseMotionListener(this);
        this.field6304.removeMouseListener(this);
        this.field6300 = null;
        this.field6297 = this.field6295 = this.field6298 = 0;
        this.field6302 = this.field6299 = this.field6301 = arg0;
        this.field6304 = null;
        this.field6296 = null;
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(I)I", line = 261)
    public final int method1094(int arg0) {
        if (arg0 >= -69) {
            this.mouseExited(null);
        }
        return this.field6297;
    }

    @OriginalMember(owner = "client!os", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 271)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2665(arg0.getX(), arg0.getY(), -12617);
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V", line = 278)
    public final void method1096(int arg0) {
        this.method2666(0);
        if (arg0 != -1) {
            this.mouseReleased(null);
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)Z", line = 289)
    public final boolean method1098(int arg0) {
        if (arg0 != 0) {
            this.field6304 = null;
        }
        return (this.field6298 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class442(Component arg0, boolean arg1) {
        this.method2664(3, arg0);
        this.field6303 = arg1;
    }
}
