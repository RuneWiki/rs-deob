import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class367 extends class433 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lnj;")
    private class317 field5665 = new class317();

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lnj;")
    private class317 field5669 = new class317();

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
    private boolean field5671;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    private int field5662;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    private int field5663;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    private int field5664;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    private int field5666;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    private int field5667;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    private int field5668;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field5670;

    @OriginalMember(owner = "client!tc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2406(var3, -102, 6, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final void method2048(int arg0) {
        if (arg0 != 6) {
            this.field5669 = null;
        }
        this.method2407(25736);
    }

    @OriginalMember(owner = "client!tc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2403(0, arg0);
        if ((this.field5667 & var2) == 0) {
            var2 = this.field5667;
        }
        if ((var2 & 0x1) != 0) {
            this.method2406(arg0.getY(), -122, 3, 0, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2406(arg0.getY(), -106, 5, 0, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2406(arg0.getY(), -103, 4, 0, arg0.getX());
        }
        this.field5667 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2403(0, arg0);
        if (var2 == 1) {
            this.method2406(arg0.getY(), -124, 0, 0, arg0.getX());
        } else if (var2 == 4) {
            this.method2406(arg0.getY(), -106, 2, 0, arg0.getX());
        } else if (var2 == 2) {
            this.method2406(arg0.getY(), -124, 1, 0, arg0.getX());
        }
        this.field5667 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)I")
    public final int method2043(byte arg0) {
        return arg0 >= -65 ? -76 : this.field5664;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public final synchronized void method2050(int arg0) {
        this.field5663 = this.field5668;
        this.field5664 = this.field5666;
        this.field5662 = this.field5667;
        class317 var2 = this.field5665;
        this.field5665 = this.field5669;
        if (arg0 != 23747) {
            this.field5663 = -105;
        }
        this.field5669 = var2;
        this.field5669.method2120((byte) 27);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2403(int arg0, MouseEvent arg1) {
        if (arg0 != 0) {
            this.field5664 = 45;
        }
        if (arg1.getButton() == 1) {
            return 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2404(int arg0, Component arg1) {
        this.method2407(25736);
        this.field5670 = arg1;
        this.field5670.addMouseListener(this);
        if (arg0 == 2) {
            this.field5670.addMouseMotionListener(this);
            this.field5670.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2405(arg0, 126);
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)I")
    public final int method2038(int arg0) {
        return arg0 == -49 ? this.field5663 : 21;
    }

    @OriginalMember(owner = "client!tc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5668 = -1;
        this.field5666 = -1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Z")
    public final boolean method2046(int arg0) {
        if (arg0 >= -5) {
            this.field5666 = -17;
        }
        return (this.field5662 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Z")
    public final boolean method2044(boolean arg0) {
        if (!arg0) {
            this.method2036(55);
        }
        return (this.field5662 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2405(arg0, -32);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Lic;")
    public final class32 method2047(byte arg0) {
        return arg0 == 41 ? (class32) this.field5665.method2127(-115) : (class32) null;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Z")
    public final boolean method2036(int arg0) {
        if (arg0 == 20) {
            return (this.field5662 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
    private final void method2405(MouseEvent arg0, int arg1) {
        int var3 = 82 / ((48 - arg1) / 61);
        this.field5668 = arg0.getX();
        this.field5666 = arg0.getY();
        if (this.field5671) {
            this.method2406(arg0.getY(), -105, -1, 0, arg0.getX());
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2405(arg0, 116);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
    private final void method2406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class22 var6 = new class22();
        var6.field251 = arg4;
        var6.field253 = arg0;
        var6.field250 = arg2;
        if (arg1 >= -99) {
            this.field5663 = -126;
        }
        var6.field252 = class246.method1705((byte) 28);
        var6.field249 = arg3;
        this.field5669.method2124(var6, (byte) -126);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    private final void method2407(int arg0) {
        if (this.field5670 == null) {
            return;
        }
        this.field5670.removeMouseWheelListener(this);
        this.field5670.removeMouseMotionListener(this);
        this.field5670.removeMouseListener(this);
        this.field5668 = this.field5666 = this.field5667 = 0;
        this.field5669 = null;
        if (arg0 == 25736) {
            this.field5665 = null;
            this.field5663 = this.field5664 = this.field5662 = 0;
            this.field5670 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class367(Component arg0, boolean arg1) {
        this.method2404(2, arg0);
        this.field5671 = arg1;
    }
}
