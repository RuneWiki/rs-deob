import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class512 extends class239 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lgca;")
    private class227 field7029 = new class227();

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Lgca;")
    private class227 field7031 = new class227();

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
    private boolean field7035;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    private int field7026;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    private int field7027;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    private int field7028;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    private int field7030;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    private int field7032;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    private int field7033;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field7034;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 4)
    private final int method2934(int arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else {
            int var3 = 24 % ((arg0 + 64) / 37);
            return arg1.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)Z", line = 29)
    public final boolean method1496(byte arg0) {
        int var2 = 34 % ((-arg0 - 73) / 35);
        return (this.field7028 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I", line = 37)
    public final int method1499(int arg0) {
        return arg0 == 8 ? this.field7027 : -84;
    }

    @OriginalMember(owner = "client!nl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 48)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2934(-123, arg0);
        if ((var2 & this.field7032) == 0) {
            var2 = this.field7032;
        }
        if ((var2 & 0x1) != 0) {
            this.method2935(arg0.getY(), (byte) -113, arg0.getX(), 3, arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2935(arg0.getY(), (byte) -127, arg0.getX(), 5, arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2935(arg0.getY(), (byte) -114, arg0.getX(), 4, arg0.getClickCount());
        }
        this.field7032 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 73)
    public final void method1489(int arg0) {
        if (arg0 == 2) {
            this.method2938(arg0 - 101);
        }
    }

    @OriginalMember(owner = "client!nl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 83)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)Lbs;", line = 94)
    public final class639 method1492(byte arg0) {
        if (arg0 != -85) {
            this.method1501(78);
        }
        return (class639) this.field7029.method1442(-10011);
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V", line = 104)
    public final synchronized void method1494(byte arg0) {
        this.field7027 = this.field7033;
        this.field7028 = this.field7032;
        this.field7026 = this.field7030;
        class227 var2 = this.field7029;
        if (arg0 == -29) {
            this.field7029 = this.field7031;
            this.field7031 = var2;
            this.field7031.method1444(-27547);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBIII)V", line = 126)
    private final void method2935(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class144 var6 = new class144();
        var6.field2064 = arg2;
        var6.field2065 = arg3;
        var6.field2068 = arg0;
        var6.field2066 = class577.method3295((byte) 15);
        if (arg1 <= -111) {
            var6.field2067 = arg4;
            this.field7031.method1441(var6, 0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2936(arg0.getY(), arg0.getX(), false);
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)Z", line = 151)
    public final boolean method1501(int arg0) {
        if (arg0 <= 117) {
            this.field7027 = 111;
        }
        return (this.field7028 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZ)V", line = 161)
    private final void method2936(int arg0, int arg1, boolean arg2) {
        this.field7033 = arg1;
        if (arg2) {
            this.field7032 = -79;
        }
        this.field7030 = arg0;
        if (this.field7035) {
            this.method2935(arg0, (byte) -114, arg1, -1, 0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Z", line = 178)
    public final boolean method1490(int arg0) {
        if (arg0 != -3) {
            this.field7027 = 4;
        }
        return (this.field7028 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 189)
    private final void method2937(Component arg0, int arg1) {
        this.method2938(107);
        this.field7034 = arg0;
        this.field7034.addMouseListener(this);
        if (arg1 >= -97) {
            this.method2936(-21, -71, true);
        }
        this.field7034.addMouseMotionListener(this);
        this.field7034.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I", line = 203)
    public final int method1491(byte arg0) {
        if (arg0 < 101) {
            this.method1489(-38);
        }
        return this.field7026;
    }

    @OriginalMember(owner = "client!nl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 214)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2936(arg0.getY(), arg0.getX(), false);
    }

    @OriginalMember(owner = "client!nl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 221)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2936(arg0.getY(), arg0.getX(), false);
    }

    @OriginalMember(owner = "client!nl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 231)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2935(var3, (byte) -112, var2, 6, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!nl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 245)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2934(-120, arg0);
        if (var2 == 1) {
            this.method2935(arg0.getY(), (byte) -119, arg0.getX(), 0, arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2935(arg0.getY(), (byte) -126, arg0.getX(), 2, arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2935(arg0.getY(), (byte) -113, arg0.getX(), 1, arg0.getClickCount());
        }
        this.field7032 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V", line = 269)
    private final void method2938(int arg0) {
        if (this.field7034 == null) {
            return;
        }
        this.field7034.removeMouseWheelListener(this);
        this.field7034.removeMouseMotionListener(this);
        this.field7034.removeMouseListener(this);
        int var2 = 100 % ((36 - arg0) / 52);
        this.field7031 = null;
        this.field7034 = null;
        this.field7033 = this.field7030 = this.field7032 = 0;
        this.field7027 = this.field7026 = this.field7028 = 0;
        this.field7029 = null;
    }

    @OriginalMember(owner = "client!nl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 292)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2936(arg0.getY(), arg0.getX(), false);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class512(Component arg0, boolean arg1) {
        this.method2937(arg0, -98);
        this.field7035 = arg1;
    }
}
