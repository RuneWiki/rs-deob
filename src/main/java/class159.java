import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class159 extends class474 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "Lgj;")
    private class593 field2504 = new class593();

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "Lgj;")
    private class593 field2507 = new class593();

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Z")
    private boolean field2511;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    private int field2506;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    private int field2509;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field2512;

    @OriginalMember(owner = "client!cda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1114(arg0, (byte) -43);
        if ((this.field2509 & var2) == 0) {
            var2 = this.field2509;
        }
        if ((var2 & 0x1) != 0) {
            this.method1111(arg0.getX(), 3, 100, arg0.getY(), 0);
        }
        if ((var2 & 0x4) != 0) {
            this.method1111(arg0.getX(), 5, 49, arg0.getY(), 0);
        }
        if ((var2 & 0x2) != 0) {
            this.method1111(arg0.getX(), 4, 26, arg0.getY(), 0);
        }
        this.field2509 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(B)Z")
    public final boolean method1103(byte arg0) {
        int var2 = -7 % ((arg0 + 47) / 48);
        return (this.field2506 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1115(arg0.getY(), 0, arg0.getX());
    }

    @OriginalMember(owner = "client!cda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1115(arg0.getY(), 0, arg0.getX());
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)V")
    public final synchronized void method1104(int arg0) {
        this.field2503 = this.field2510;
        this.field2506 = this.field2509;
        this.field2505 = this.field2508;
        class593 var2 = this.field2504;
        this.field2504 = this.field2507;
        this.field2507 = var2;
        int var3 = 77 % ((68 - arg0) / 51);
        this.field2507.method3255((byte) -112);
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)Z")
    public final boolean method1105(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            return (this.field2506 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!cda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1114(arg0, (byte) -43);
        if (var2 == 1) {
            this.method1111(arg0.getX(), 0, 107, arg0.getY(), 0);
        } else if (var2 == 4) {
            this.method1111(arg0.getX(), 2, 57, arg0.getY(), 0);
        } else if (var2 == 2) {
            this.method1111(arg0.getX(), 1, -90, arg0.getY(), 0);
        }
        this.field2509 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
    public final void method1106(int arg0) {
        if (arg0 == 30641) {
            this.method1112(25277);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Lhca;")
    public final class458 method1107(byte arg0) {
        return arg0 >= -67 ? (class458) null : (class458) this.field2504.method3262(-123);
    }

    @OriginalMember(owner = "client!cda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1115(arg0.getY(), 0, arg0.getX());
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method1108(Component arg0, byte arg1) {
        if (arg1 <= 113) {
            return;
        }
        this.method1112(25277);
        this.field2512 = arg0;
        this.field2512.addMouseListener(this);
        this.field2512.addMouseMotionListener(this);
        this.field2512.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!cda", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1111(var2, 6, -118, var3, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)Z")
    public final boolean method1109(int arg0) {
        if (arg0 == 27726) {
            return (this.field2506 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)I")
    public final int method1110(byte arg0) {
        return arg0 == 91 ? this.field2503 : 36;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIII)V")
    private final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class495 var6 = new class495();
        var6.field6652 = arg0;
        var6.field6653 = arg1;
        var6.field6656 = arg3;
        var6.field6655 = class681.method3802(-23600);
        var6.field6654 = arg4;
        this.field2507.method3265(var6, (byte) -110);
        int var7 = -86 / ((-arg2 - 33) / 50);
    }

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V")
    private final void method1112(int arg0) {
        if (this.field2512 == null) {
            return;
        }
        if (arg0 != 25277) {
            this.method1105(false);
        }
        this.field2512.removeMouseWheelListener(this);
        this.field2512.removeMouseMotionListener(this);
        this.field2512.removeMouseListener(this);
        this.field2503 = this.field2505 = this.field2506 = 0;
        this.field2507 = null;
        this.field2512 = null;
        this.field2504 = null;
        this.field2510 = this.field2508 = this.field2509 = 0;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
    public final int method1113(int arg0) {
        return arg0 == -6387 ? this.field2505 : -41;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method1114(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            if (arg1 != -43) {
                this.field2508 = 53;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
    private final void method1115(int arg0, int arg1, int arg2) {
        this.field2510 = arg2;
        this.field2508 = arg0;
        if (this.field2511) {
            this.method1111(arg2, -1, -127, arg0, 0);
        }
        if (arg1 != 0) {
            this.field2508 = -79;
        }
    }

    @OriginalMember(owner = "client!cda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1115(arg0.getY(), 0, arg0.getX());
    }

    @OriginalMember(owner = "client!cda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class159(Component arg0, boolean arg1) {
        this.method1108(arg0, (byte) 117);
        this.field2511 = arg1;
    }
}
