import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class491 extends class547 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Ldc;")
    private class302 field6976 = new class302();

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ldc;")
    private class302 field6981 = new class302();

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Z")
    private boolean field6983;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    private int field6975;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    private int field6977;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    private int field6978;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field6979;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    private int field6980;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field6982;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field6984;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)Lls;", line = 5)
    public final class147 method2346(boolean arg0) {
        return arg0 ? (class147) this.field6976.method1902(99) : (class147) null;
    }

    @OriginalMember(owner = "client!td", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 16)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2806(arg0.getX(), arg0.getY(), -92);
    }

    @OriginalMember(owner = "client!td", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 24)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 34)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2806(arg0.getX(), arg0.getY(), -68);
    }

    @OriginalMember(owner = "client!td", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 43)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2807(var3, 6, 2, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 55)
    public final synchronized void method2342(byte arg0) {
        this.field6978 = this.field6979;
        this.field6975 = this.field6982;
        this.field6977 = this.field6980;
        class302 var2 = this.field6976;
        this.field6976 = this.field6981;
        this.field6981 = var2;
        this.field6981.method1905(arg0 + 32);
        if (arg0 != -32) {
            this.field6978 = -63;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z", line = 76)
    public final boolean method2337(int arg0) {
        if (arg0 > -49) {
            this.mouseMoved(null);
        }
        return (this.field6975 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V", line = 87)
    private final void method2806(int arg0, int arg1, int arg2) {
        this.field6980 = arg1;
        int var4 = -14 % ((arg2 + 9) / 50);
        this.field6979 = arg0;
        if (this.field6983) {
            this.method2807(arg1, -1, 2, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V", line = 104)
    private final void method2807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 2) {
            this.field6977 = 40;
        }
        class84 var6 = new class84();
        var6.field1323 = arg1;
        var6.field1322 = arg4;
        var6.field1324 = arg0;
        var6.field1325 = class60.method371(false);
        var6.field1326 = arg3;
        this.field6981.method1909(var6, (byte) -81);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V", line = 121)
    public final void method2344(boolean arg0) {
        if (!arg0) {
            this.mouseDragged(null);
        }
        this.method2808((byte) 77);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I", line = 133)
    public final int method2338(byte arg0) {
        int var2 = 7 % ((-arg0 - 12) / 47);
        return this.field6977;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I", line = 141)
    public final int method2340(int arg0) {
        if (arg0 != 40960) {
            this.field6984 = null;
        }
        return this.field6978;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 151)
    private final void method2808(byte arg0) {
        if (this.field6984 == null) {
            return;
        }
        this.field6984.removeMouseWheelListener(this);
        int var2 = 118 / ((arg0 - 16) / 57);
        this.field6984.removeMouseMotionListener(this);
        this.field6984.removeMouseListener(this);
        this.field6976 = null;
        this.field6979 = this.field6980 = this.field6982 = 0;
        this.field6981 = null;
        this.field6984 = null;
        this.field6978 = this.field6977 = this.field6975 = 0;
    }

    @OriginalMember(owner = "client!td", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 174)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2809((byte) 82, arg0);
        if (var2 == 1) {
            this.method2807(arg0.getY(), 0, 2, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 4) {
            this.method2807(arg0.getY(), 2, 2, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 2) {
            this.method2807(arg0.getY(), 1, 2, arg0.getClickCount(), arg0.getX());
        }
        this.field6982 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 197)
    private final int method2809(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else {
            if (arg0 != 82) {
                this.field6983 = true;
            }
            return arg1.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 224)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2809((byte) 82, arg0);
        if ((this.field6982 & var2) == 0) {
            var2 = this.field6982;
        }
        if ((var2 & 0x1) != 0) {
            this.method2807(arg0.getY(), 3, 2, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2807(arg0.getY(), 5, 2, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2807(arg0.getY(), 4, 2, arg0.getClickCount(), arg0.getX());
        }
        this.field6982 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 249)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2806(arg0.getX(), arg0.getY(), -84);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Z", line = 256)
    public final boolean method2348(byte arg0) {
        if (arg0 == -69) {
            return (this.field6975 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 267)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2806(arg0.getX(), arg0.getY(), -85);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 274)
    private final void method2810(Component arg0, boolean arg1) {
        this.method2808((byte) -69);
        this.field6984 = arg0;
        this.field6984.addMouseListener(this);
        this.field6984.addMouseMotionListener(this);
        this.field6984.addMouseWheelListener(this);
        if (!arg1) {
            this.mouseDragged(null);
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Z", line = 289)
    public final boolean method2351(int arg0) {
        if (arg0 != 17452) {
            this.method2807(74, -30, -92, 78, 123);
        }
        return (this.field6975 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 310)
    public class491(Component arg0, boolean arg1) {
        this.method2810(arg0, true);
        this.field6983 = arg1;
    }
}
