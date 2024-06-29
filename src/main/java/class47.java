import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class47 extends class566 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "Lgk;")
    private class616 field488 = new class616();

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "Lgk;")
    private class616 field492 = new class616();

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "Z")
    private boolean field495;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field496;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 5)
    public final void method243(int arg0) {
        if (arg0 != 0) {
            this.method252(83);
        }
        this.method255((byte) -13);
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V", line = 16)
    public final synchronized void method244(int arg0) {
        this.field489 = this.field491;
        this.field490 = this.field494;
        if (arg0 != 0) {
            this.mouseDragged(null);
        }
        this.field487 = this.field493;
        class616 var2 = this.field488;
        this.field488 = this.field492;
        this.field492 = var2;
        this.field492.method3438(16);
    }

    @OriginalMember(owner = "client!fea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 37)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method251(arg0.getY(), true, arg0.getX());
    }

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)Z", line = 44)
    public final boolean method245(int arg0) {
        if (arg0 != 20822) {
            this.field494 = -93;
        }
        return (this.field490 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 64)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method247((byte) -98, arg0);
        if (var2 == 1) {
            this.method254(0, arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
        } else if (var2 == 4) {
            this.method254(2, arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
        } else if (var2 == 2) {
            this.method254(1, arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
        }
        this.field494 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 87)
    private final void method246(int arg0, Component arg1) {
        this.method255((byte) -13);
        this.field496 = arg1;
        this.field496.addMouseListener(this);
        this.field496.addMouseMotionListener(this);
        this.field496.addMouseWheelListener(this);
        if (arg0 != 5016) {
            this.field488 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 101)
    private final int method247(byte arg0, MouseEvent arg1) {
        if (arg0 > -14) {
            return 7;
        } else if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "(I)Z", line = 127)
    public final boolean method248(int arg0) {
        if (arg0 <= 122) {
            this.field492 = null;
        }
        return (this.field490 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)Laaa;", line = 138)
    public final class103 method249(int arg0) {
        if (arg0 <= 69) {
            this.field487 = -27;
        }
        return (class103) this.field488.method3440((byte) -40);
    }

    @OriginalMember(owner = "client!fea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 148)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method251(arg0.getY(), true, arg0.getX());
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)Z", line = 158)
    public final boolean method250(int arg0) {
        int var2 = -95 / ((arg0 + 19) / 59);
        return (this.field490 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZI)V", line = 170)
    private final void method251(int arg0, boolean arg1, int arg2) {
        this.field491 = arg2;
        if (!arg1) {
            this.field491 = 52;
        }
        this.field493 = arg0;
        if (this.field495) {
            this.method254(-1, arg2, arg0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!fea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 184)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method251(arg0.getY(), true, arg0.getX());
    }

    @OriginalMember(owner = "client!fea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 192)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method251(arg0.getY(), true, arg0.getX());
    }

    @OriginalMember(owner = "client!fea", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 201)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method254(6, var2, var3, 0, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)I", line = 213)
    public final int method252(int arg0) {
        if (arg0 != 7) {
            this.field492 = null;
        }
        return this.field487;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)I", line = 223)
    public final int method253(boolean arg0) {
        if (!arg0) {
            this.field496 = null;
        }
        return this.field489;
    }

    @OriginalMember(owner = "client!fea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 234)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method247((byte) -30, arg0);
        if ((var2 & this.field494) == 0) {
            var2 = this.field494;
        }
        if ((var2 & 0x1) != 0) {
            this.method254(3, arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method254(5, arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method254(4, arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
        }
        this.field494 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIII)V", line = 263)
    private final void method254(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class37 var6 = new class37();
        var6.field377 = arg1;
        var6.field379 = arg2;
        var6.field376 = arg0;
        var6.field380 = class557.method3157(-122);
        var6.field378 = arg4;
        if (arg3 == 0) {
            this.field492.method3425(var6, false);
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 313)
    public class47(Component arg0, boolean arg1) {
        this.method246(5016, arg0);
        this.field495 = arg1;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V", line = 286)
    private final void method255(byte arg0) {
        if (this.field496 == null) {
            return;
        }
        this.field496.removeMouseWheelListener(this);
        this.field496.removeMouseMotionListener(this);
        if (arg0 != -13) {
            this.field490 = 9;
        }
        this.field496.removeMouseListener(this);
        this.field489 = this.field487 = this.field490 = 0;
        this.field491 = this.field493 = this.field494 = 0;
        this.field488 = null;
        this.field492 = null;
        this.field496 = null;
    }
}
