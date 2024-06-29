import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class143 extends class86 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lgw;")
    private class118 field2200 = new class118();

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lgw;")
    private class118 field2201 = new class118();

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Z")
    private boolean field2205;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    private int field2197;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    private int field2198;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    private int field2199;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    private int field2202;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    private int field2203;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field2204;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field2206;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)Lsm;")
    public final class191 method647(int arg0) {
        int var2 = 60 / ((arg0 - 39) / 58);
        return (class191) this.field2200.method862(-93);
    }

    @OriginalMember(owner = "client!ik", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1034(arg0, 4);
        if (var2 == 1) {
            this.method1031(arg0.getX(), 0, 0, arg0.getY(), 4);
        } else if (var2 == 4) {
            this.method1031(arg0.getX(), 2, 0, arg0.getY(), 4);
        } else if (var2 == 2) {
            this.method1031(arg0.getX(), 1, 0, arg0.getY(), 4);
        }
        this.field2204 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1031(var2, 6, var4, var3, 4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ik", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1033(4, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1033(4, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V")
    private final void method1030(int arg0) {
        if (this.field2206 == null) {
            return;
        }
        this.field2206.removeMouseWheelListener(this);
        this.field2206.removeMouseMotionListener(this);
        this.field2206.removeMouseListener(this);
        this.field2199 = this.field2197 = this.field2198 = 0;
        this.field2201 = null;
        this.field2206 = null;
        this.field2200 = null;
        this.field2203 = this.field2202 = this.field2204 = 0;
        if (arg0 != 3) {
            this.method1034(null, -5);
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Z")
    public final boolean method642(int arg0) {
        int var2 = 30 / ((arg0 - 18) / 48);
        return (this.field2198 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public final synchronized void method646(byte arg0) {
        this.field2199 = this.field2203;
        this.field2197 = this.field2202;
        this.field2198 = this.field2204;
        class118 var2 = this.field2200;
        this.field2200 = this.field2201;
        this.field2201 = var2;
        int var3 = -99 / ((-arg0 - 18) / 41);
        this.field2201.method861(-1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
    public final int method639(byte arg0) {
        int var2 = -33 % ((arg0 + 30) / 48);
        return this.field2199;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z")
    public final boolean method637(int arg0) {
        int var2 = -74 % ((arg0 - 64) / 58);
        return (this.field2198 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)Z")
    public final boolean method643(int arg0) {
        if (arg0 < 22) {
            this.field2201 = null;
        }
        return (this.field2198 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public final void method641(int arg0) {
        this.method1030(3);
        if (arg0 != 14919) {
            this.field2198 = -119;
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1034(arg0, 4);
        if ((var2 & this.field2204) == 0) {
            var2 = this.field2204;
        }
        if ((var2 & 0x1) != 0) {
            this.method1031(arg0.getX(), 3, 0, arg0.getY(), 4);
        }
        if ((var2 & 0x4) != 0) {
            this.method1031(arg0.getX(), 5, 0, arg0.getY(), 4);
        }
        if ((var2 & 0x2) != 0) {
            this.method1031(arg0.getX(), 4, 0, arg0.getY(), 4);
        }
        this.field2204 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1033(4, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    private final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class542 var6 = new class542();
        var6.field7963 = arg0;
        var6.field7965 = arg1;
        if (arg4 != 4) {
            this.method643(20);
        }
        var6.field7962 = arg3;
        var6.field7964 = class165.method1188((byte) 26);
        var6.field7961 = arg2;
        this.field2201.method866((byte) 10, var6);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method1032(Component arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        this.method1030(3);
        this.field2206 = arg0;
        this.field2206.addMouseListener(this);
        this.field2206.addMouseMotionListener(this);
        this.field2206.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
    private final void method1033(int arg0, MouseEvent arg1) {
        this.field2203 = arg1.getX();
        this.field2202 = arg1.getY();
        if (arg0 == 4 && this.field2205) {
            this.method1031(arg1.getX(), -1, 0, arg1.getY(), 4);
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)I")
    public final int method644(int arg0) {
        if (arg0 != 101) {
            this.field2204 = -16;
        }
        return this.field2197;
    }

    @OriginalMember(owner = "client!ik", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field2202 = -1;
        this.field2203 = -1;
    }

    @OriginalMember(owner = "client!ik", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method1034(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        }
        if (arg1 != 4) {
            this.mouseDragged(null);
        }
        if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class143(Component arg0, boolean arg1) {
        this.method1032(arg0, true);
        this.field2205 = arg1;
    }
}
