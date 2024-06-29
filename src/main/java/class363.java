import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class363 extends class448 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lps;")
    private class63 field5580 = new class63();

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Lps;")
    private class63 field5583 = new class63();

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Z")
    private boolean field5586;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    private int field5578;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    private int field5579;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    private int field5581;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    private int field5582;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    private int field5584;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    private int field5585;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field5587;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 4)
    private final void method2315(byte arg0) {
        if (this.field5587 == null) {
            return;
        }
        this.field5587.removeMouseWheelListener(this);
        this.field5587.removeMouseMotionListener(this);
        this.field5587.removeMouseListener(this);
        this.field5581 = this.field5579 = this.field5578 = 0;
        this.field5580 = null;
        this.field5584 = this.field5585 = this.field5582 = 0;
        this.field5583 = null;
        this.field5587 = null;
        if (arg0 != 79) {
            this.field5583 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 29)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2324(2, arg0);
        if (var2 == 1) {
            this.method2316(arg0.getX(), arg0.getY(), false, 0, 0);
        } else if (var2 == 4) {
            this.method2316(arg0.getX(), arg0.getY(), false, 2, 0);
        } else if (var2 == 2) {
            this.method2316(arg0.getX(), arg0.getY(), false, 1, 0);
        }
        this.field5582 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 54)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2316(var2, var3, false, 6, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZII)V", line = 68)
    private final void method2316(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class237 var6 = new class237();
        var6.field3348 = arg0;
        if (arg2) {
            return;
        }
        var6.field3347 = arg1;
        var6.field3346 = arg3;
        var6.field3349 = class58.method427((byte) -19);
        var6.field3345 = arg4;
        this.field5583.method453((byte) 102, var6);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 87)
    private final void method2317(Component arg0, byte arg1) {
        this.method2315((byte) 79);
        if (arg1 < -82) {
            this.field5587 = arg0;
            this.field5587.addMouseListener(this);
            this.field5587.addMouseMotionListener(this);
            this.field5587.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!dn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2320(arg0, 81);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V", line = 108)
    public final void method2318(int arg0) {
        this.method2315((byte) 79);
        if (arg0 != 101) {
            this.field5580 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 119)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5585 = -1;
        this.field5584 = -1;
    }

    @OriginalMember(owner = "client!dn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 129)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2320(arg0, -113);
    }

    @OriginalMember(owner = "client!dn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 137)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2324(2, arg0);
        if ((this.field5582 & var2) == 0) {
            var2 = this.field5582;
        }
        if ((var2 & 0x1) != 0) {
            this.method2316(arg0.getX(), arg0.getY(), false, 3, 0);
        }
        if ((var2 & 0x4) != 0) {
            this.method2316(arg0.getX(), arg0.getY(), false, 5, 0);
        }
        if ((var2 & 0x2) != 0) {
            this.method2316(arg0.getX(), arg0.getY(), false, 4, 0);
        }
        this.field5582 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Loq;", line = 165)
    public final class245 method2319(byte arg0) {
        int var2 = -60 % ((arg0 - 83) / 41);
        return (class245) this.field5580.method447(8);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 173)
    private final void method2320(MouseEvent arg0, int arg1) {
        this.field5584 = arg0.getX();
        this.field5585 = arg0.getY();
        int var3 = -75 % ((-arg1 - 46) / 42);
        if (this.field5586) {
            this.method2316(arg0.getX(), arg0.getY(), false, -1, 0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V", line = 190)
    public final synchronized void method2321(int arg0) {
        if (arg0 != 69) {
            this.field5586 = true;
        }
        this.field5579 = this.field5585;
        this.field5581 = this.field5584;
        this.field5578 = this.field5582;
        class63 var2 = this.field5580;
        this.field5580 = this.field5583;
        this.field5583 = var2;
        this.field5583.method450((byte) 73);
    }

    @OriginalMember(owner = "client!dn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 211)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z", line = 221)
    public final boolean method2322(int arg0) {
        if (arg0 != -28950) {
            this.field5586 = true;
        }
        return (this.field5578 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I", line = 231)
    public final int method2323(byte arg0) {
        return arg0 >= -82 ? -73 : this.field5581;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 244)
    private final int method2324(int arg0, MouseEvent arg1) {
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (arg0 != 2) {
            return 122;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I", line = 279)
    public final int method2325(int arg0) {
        int var2 = -24 % ((-arg0 - 38) / 51);
        return this.field5579;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z", line = 287)
    public final boolean method2326(byte arg0) {
        if (arg0 != -51) {
            this.mousePressed(null);
        }
        return (this.field5578 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Z", line = 297)
    public final boolean method2327(int arg0) {
        if (arg0 == -32309) {
            return (this.field5578 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 307)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2320(arg0, -102);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 326)
    public class363(Component arg0, boolean arg1) {
        this.method2317(arg0, (byte) -101);
        this.field5586 = arg1;
    }
}
