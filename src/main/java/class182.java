import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class182 extends class346 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lrh;")
    private class59 field2253 = new class59();

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Lrh;")
    private class59 field2260 = new class59();

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Z")
    private boolean field2262;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    private int field2258;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field2261;

    @OriginalMember(owner = "client!hn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1181((byte) -93, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!hn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1181((byte) -93, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BII)V")
    private final void method1181(byte arg0, int arg1, int arg2) {
        this.field2257 = arg1;
        if (arg0 == -93) {
            this.field2258 = arg2;
            if (this.field2262) {
                this.method1184(arg2, 0, arg0 ^ 0x7B, arg1, -1);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Z")
    public final boolean method258(int arg0) {
        if (arg0 == -7) {
            return (this.field2255 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1183(arg0, -113);
        if (var2 == 1) {
            this.method1184(arg0.getY(), 0, -78, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method1184(arg0.getY(), 0, -114, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method1184(arg0.getY(), 0, -122, arg0.getX(), 1);
        }
        this.field2259 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
    private final void method1182(int arg0) {
        if (this.field2261 == null) {
            return;
        }
        this.field2261.removeMouseWheelListener(this);
        this.field2261.removeMouseMotionListener(this);
        this.field2261.removeMouseListener(this);
        this.field2254 = this.field2256 = this.field2255 = 0;
        this.field2260 = null;
        this.field2257 = this.field2258 = this.field2259 = arg0;
        this.field2253 = null;
        this.field2261 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method1183(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            int var3 = -72 % ((arg1 + 36) / 33);
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        if (arg0 >= -22) {
            this.method266(-126);
        }
        return (this.field2255 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
    private final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class196 var6 = new class196();
        var6.field2595 = arg0;
        var6.field2594 = arg4;
        var6.field2593 = arg3;
        var6.field2597 = class669.method3713(0);
        if (arg2 <= -22) {
            var6.field2596 = arg1;
            this.field2260.method378(var6, 31316);
        }
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)Lbv;")
    public final class8 method271(int arg0) {
        if (arg0 != -22792) {
            this.field2257 = 15;
        }
        return (class8) this.field2253.method368(120);
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)Z")
    public final boolean method273(int arg0) {
        if (arg0 > -17) {
            this.field2261 = null;
        }
        return (this.field2255 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1183(arg0, 65);
        if ((this.field2259 & var2) == 0) {
            var2 = this.field2259;
        }
        if ((var2 & 0x1) != 0) {
            this.method1184(arg0.getY(), 0, -61, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1184(arg0.getY(), 0, -87, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1184(arg0.getY(), 0, -74, arg0.getX(), 4);
        }
        this.field2259 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1181((byte) -93, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
    public final int method269(byte arg0) {
        return arg0 == -25 ? this.field2256 : -56;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public final synchronized void method262(int arg0) {
        if (arg0 >= -124) {
            this.method274(44);
        }
        this.field2254 = this.field2257;
        this.field2256 = this.field2258;
        this.field2255 = this.field2259;
        class59 var2 = this.field2253;
        this.field2253 = this.field2260;
        this.field2260 = var2;
        this.field2260.method365(-1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1185(int arg0, Component arg1) {
        this.method1182(arg0);
        this.field2261 = arg1;
        this.field2261.addMouseListener(this);
        this.field2261.addMouseMotionListener(this);
        this.field2261.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!hn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1184(var3, var4, -61, var2, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!hn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1181((byte) -93, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
    public final void method274(int arg0) {
        this.method1182(0);
        if (arg0 != -4) {
            this.field2262 = false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
    public final int method268(byte arg0) {
        if (arg0 > -79) {
            this.field2260 = null;
        }
        return this.field2254;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class182(Component arg0, boolean arg1) {
        this.method1185(0, arg0);
        this.field2262 = arg1;
    }
}
