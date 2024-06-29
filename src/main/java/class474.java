import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class474 extends class424 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "Lwba;")
    private class46 field6766 = new class46();

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "Lwba;")
    private class46 field6770 = new class46();

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "Z")
    private boolean field6771;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    private int field6763;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    private int field6765;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    private int field6767;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    private int field6768;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
    private int field6769;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field6772;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)Z")
    public final boolean method2092(int arg0) {
        if (arg0 >= -123) {
            this.field6772 = null;
        }
        return (this.field6765 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2783(true, arg0);
        if ((this.field6769 & var2) == 0) {
            var2 = this.field6769;
        }
        if ((var2 & 0x1) != 0) {
            this.method2781(arg0.getY(), arg0.getClickCount(), 3, -1, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2781(arg0.getY(), arg0.getClickCount(), 5, -1, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2781(arg0.getY(), arg0.getClickCount(), 4, -1, arg0.getX());
        }
        this.field6769 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "(I)I")
    public final int method2090(int arg0) {
        if (arg0 != -7249) {
            this.method2080(62);
        }
        return this.field6763;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIII)V")
    private final void method2781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class144 var6 = new class144();
        var6.field2116 = arg2;
        var6.field2119 = arg0;
        var6.field2115 = arg4;
        var6.field2117 = class490.method2840(true);
        var6.field2118 = arg1;
        if (arg3 != -1) {
            this.field6771 = false;
        }
        this.field6770.method474(var6, 6);
    }

    @OriginalMember(owner = "client!nga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2783(true, arg0);
        if (var2 == 1) {
            this.method2781(arg0.getY(), arg0.getClickCount(), 0, -1, arg0.getX());
        } else if (var2 == 4) {
            this.method2781(arg0.getY(), arg0.getClickCount(), 2, -1, arg0.getX());
        } else if (var2 == 2) {
            this.method2781(arg0.getY(), arg0.getClickCount(), 1, -1, arg0.getX());
        }
        this.field6769 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2784((byte) 122, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
    public final synchronized void method2080(int arg0) {
        this.field6764 = this.field6767;
        this.field6763 = this.field6768;
        this.field6765 = this.field6769;
        class46 var2 = this.field6766;
        this.field6766 = this.field6770;
        this.field6770 = var2;
        if (arg0 <= -97) {
            this.field6770.method475(6);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method2782(Component arg0, boolean arg1) {
        this.method2785(126);
        this.field6772 = arg0;
        this.field6772.addMouseListener(this);
        this.field6772.addMouseMotionListener(this);
        if (arg1) {
            this.field6768 = -111;
        }
        this.field6772.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
    private final int method2783(boolean arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg0) {
            return arg1.getButton() == 3 ? 4 : 0;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)Z")
    public final boolean method2082(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return (this.field6765 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)Z")
    public final boolean method2084(byte arg0) {
        int var2 = 26 / ((54 - arg0) / 50);
        return (this.field6765 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BII)V")
    private final void method2784(byte arg0, int arg1, int arg2) {
        this.field6768 = arg1;
        if (arg0 == 122) {
            this.field6767 = arg2;
            if (this.field6771) {
                this.method2781(arg2, 0, -1, -1, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "(I)I")
    public final int method2093(int arg0) {
        return arg0 == 22302 ? this.field6764 : 16;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)Llp;")
    public final class356 method2095(int arg0) {
        if (arg0 < 54) {
            this.field6768 = 41;
        }
        return (class356) this.field6766.method483((byte) -113);
    }

    @OriginalMember(owner = "client!nga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2784((byte) 122, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2784((byte) 122, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(Z)V")
    public final void method2085(boolean arg0) {
        if (!arg0) {
            this.method2082(true);
        }
        this.method2785(123);
    }

    @OriginalMember(owner = "client!nga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2781(var3, var4, 6, -1, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "(I)V")
    private final void method2785(int arg0) {
        if (arg0 < 118 || this.field6772 == null) {
            return;
        }
        this.field6772.removeMouseWheelListener(this);
        this.field6772.removeMouseMotionListener(this);
        this.field6772.removeMouseListener(this);
        this.field6772 = null;
        this.field6763 = this.field6764 = this.field6765 = 0;
        this.field6766 = null;
        this.field6768 = this.field6767 = this.field6769 = 0;
        this.field6770 = null;
    }

    @OriginalMember(owner = "client!nga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2784((byte) 122, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class474(Component arg0, boolean arg1) {
        this.method2782(arg0, false);
        this.field6771 = arg1;
    }
}
