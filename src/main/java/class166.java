import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class166 extends class540 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lae;")
    private class40 field2177 = new class40();

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lae;")
    private class40 field2184 = new class40();

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Z")
    private boolean field2186;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field2179;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    private int field2180;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field2182;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private int field2183;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field2185;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
    public final int method941(int arg0) {
        return arg0 < 90 ? 54 : this.field2179;
    }

    @OriginalMember(owner = "client!pe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method948(arg0, -81);
        if ((var2 & this.field2181) == 0) {
            var2 = this.field2181;
        }
        if ((var2 & 0x1) != 0) {
            this.method953(arg0.getClickCount(), 3, 25112, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method953(arg0.getClickCount(), 5, 25112, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method953(arg0.getClickCount(), 4, 25112, arg0.getX(), arg0.getY());
        }
        this.field2181 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method946(arg0.getX(), arg0.getY(), true);
    }

    @OriginalMember(owner = "client!pe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lew;")
    public final class368 method942(boolean arg0) {
        return arg0 ? (class368) this.field2177.method244(arg0) : (class368) null;
    }

    @OriginalMember(owner = "client!pe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method946(arg0.getX(), arg0.getY(), true);
    }

    @OriginalMember(owner = "client!pe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method946(arg0.getX(), arg0.getY(), true);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
    public final boolean method943(int arg0) {
        if (arg0 != 2000) {
            this.method947(34);
        }
        return (this.field2180 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
    public final int method944(int arg0) {
        return arg0 == 2000 ? this.field2178 : -88;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Z")
    public final boolean method945(int arg0) {
        if (arg0 == -30249) {
            return (this.field2180 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method946(arg0.getX(), arg0.getY(), true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
    private final void method946(int arg0, int arg1, boolean arg2) {
        this.field2183 = arg1;
        if (arg2) {
            this.field2182 = arg0;
            if (this.field2186) {
                this.method953(0, -1, 25112, arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)Z")
    public final boolean method947(int arg0) {
        if (arg0 != 2000) {
            this.field2180 = 2;
        }
        return (this.field2180 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method953(var4, 6, 25112, var2, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method948(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            int var3 = -4 % ((38 - arg1) / 38);
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
    public final synchronized void method949(boolean arg0) {
        this.field2179 = this.field2183;
        this.field2180 = this.field2181;
        this.field2178 = this.field2182;
        if (arg0) {
            this.mouseClicked(null);
        }
        class40 var2 = this.field2177;
        this.field2177 = this.field2184;
        this.field2184 = var2;
        this.field2184.method247(2);
    }

    @OriginalMember(owner = "client!pe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method948(arg0, -57);
        if (var2 == 1) {
            this.method953(arg0.getClickCount(), 0, 25112, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method953(arg0.getClickCount(), 2, 25112, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method953(arg0.getClickCount(), 1, 25112, arg0.getX(), arg0.getY());
        }
        this.field2181 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public final void method950(byte arg0) {
        this.method952((byte) 13);
        if (arg0 != 118) {
            this.field2184 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method951(Component arg0, byte arg1) {
        this.method952((byte) 13);
        this.field2185 = arg0;
        if (arg1 > 85) {
            this.field2185.addMouseListener(this);
            this.field2185.addMouseMotionListener(this);
            this.field2185.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    private final void method952(byte arg0) {
        if (arg0 != 13) {
            this.method948(null, -14);
        }
        if (this.field2185 == null) {
            return;
        }
        this.field2185.removeMouseWheelListener(this);
        this.field2185.removeMouseMotionListener(this);
        this.field2185.removeMouseListener(this);
        this.field2185 = null;
        this.field2178 = this.field2179 = this.field2180 = 0;
        this.field2184 = null;
        this.field2182 = this.field2183 = this.field2181 = 0;
        this.field2177 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    private final void method953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class73 var6 = new class73();
        var6.field999 = arg3;
        var6.field997 = arg4;
        var6.field998 = arg1;
        var6.field996 = class571.method3150(arg2 ^ 0x6274);
        var6.field995 = arg0;
        if (arg2 == 25112) {
            this.field2184.method239(var6, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class166(Component arg0, boolean arg1) {
        this.method951(arg0, (byte) 124);
        this.field2186 = arg1;
    }
}
