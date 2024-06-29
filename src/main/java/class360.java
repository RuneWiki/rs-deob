import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class360 extends class284 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lfha;")
    private class522 field4596 = new class522();

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lfha;")
    private class522 field4600 = new class522();

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
    private boolean field4603;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field4597;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field4598;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field4604;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 5)
    public final void method807(int arg0) {
        this.method2031((byte) 94);
        if (arg0 > -2) {
            this.field4595 = -11;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIIII)V", line = 16)
    private final void method2028(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class255 var6 = new class255();
        var6.field3507 = arg2;
        var6.field3510 = arg3;
        var6.field3506 = arg4;
        if (arg0 == -115) {
            var6.field3508 = class224.method1457((byte) -62);
            var6.field3509 = arg1;
            this.field4600.method3116(arg0 + 29181, var6);
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 32)
    public final synchronized void method809(int arg0) {
        this.field4595 = this.field4599;
        this.field4598 = this.field4601;
        this.field4597 = this.field4602;
        class522 var2 = this.field4596;
        this.field4596 = this.field4600;
        this.field4600 = var2;
        int var3 = -27 / ((arg0 + 10) / 53);
        this.field4600.method3122(0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V", line = 52)
    private final void method2029(int arg0, int arg1, int arg2) {
        if (arg0 != 6272) {
            return;
        }
        this.field4601 = arg2;
        this.field4599 = arg1;
        if (this.field4603) {
            this.method2028((byte) -115, 0, -1, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 68)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2029(6272, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!uf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 76)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2030(arg0, (byte) 117);
        if ((this.field4602 & var2) == 0) {
            var2 = this.field4602;
        }
        if ((var2 & 0x1) != 0) {
            this.method2028((byte) -115, arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2028((byte) -115, arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2028((byte) -115, arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
        }
        this.field4602 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 102)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2029(6272, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z", line = 109)
    public final boolean method808(byte arg0) {
        if (arg0 != -65) {
            this.field4596 = null;
        }
        return (this.field4597 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 120)
    private final int method2030(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            if (arg1 < 52) {
                this.method802((byte) 87);
            }
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 146)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I", line = 157)
    public final int method805(int arg0) {
        if (arg0 != 0) {
            this.method805(89);
        }
        return this.field4595;
    }

    @OriginalMember(owner = "client!uf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 168)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2029(6272, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!uf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 176)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2030(arg0, (byte) 119);
        if (var2 == 1) {
            this.method2028((byte) -115, arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method2028((byte) -115, arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method2028((byte) -115, arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
        }
        this.field4602 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Lfi;", line = 201)
    public final class12 method802(byte arg0) {
        int var2 = 15 / ((arg0 + 59) / 41);
        return (class12) this.field4596.method3115(true);
    }

    @OriginalMember(owner = "client!uf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 209)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2029(6272, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)I", line = 216)
    public final int method806(int arg0) {
        if (arg0 != 0) {
            this.field4596 = null;
        }
        return this.field4598;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V", line = 228)
    private final void method2031(byte arg0) {
        if (this.field4604 == null) {
            return;
        }
        this.field4604.removeMouseWheelListener(this);
        this.field4604.removeMouseMotionListener(this);
        this.field4604.removeMouseListener(this);
        this.field4600 = null;
        if (arg0 <= 35) {
            this.mouseMoved(null);
        }
        this.field4596 = null;
        this.field4604 = null;
        this.field4599 = this.field4601 = this.field4602 = 0;
        this.field4595 = this.field4598 = this.field4597 = 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 251)
    private final void method2032(int arg0, Component arg1) {
        this.method2031((byte) 74);
        this.field4604 = arg1;
        this.field4604.addMouseListener(this);
        this.field4604.addMouseMotionListener(this);
        if (arg0 != 1984) {
            this.method802((byte) -29);
        }
        this.field4604.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Z", line = 265)
    public final boolean method815(int arg0) {
        if (arg0 > -121) {
            this.field4596 = null;
        }
        return (this.field4597 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 310)
    public class360(Component arg0, boolean arg1) {
        this.method2032(1984, arg0);
        this.field4603 = arg1;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z", line = 280)
    public final boolean method811(int arg0) {
        if (arg0 != -4943) {
            this.field4597 = 52;
        }
        return (this.field4597 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 295)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2028((byte) -115, var4, 6, var3, var2);
        arg0.consume();
    }
}
