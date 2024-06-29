import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class387 extends class486 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "Lki;")
    private class364 field4960 = new class364();

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "Lki;")
    private class364 field4964 = new class364();

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "Z")
    private boolean field4968;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    private int field4959;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
    private int field4961;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    private int field4962;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    private int field4966;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field4967;

    @OriginalMember(owner = "client!sba", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2212(0, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)Z", line = 12)
    public final boolean method2205(int arg0) {
        if (arg0 == 64) {
            return (this.field4959 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sba", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2212(0, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sba", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 32)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2212(0, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sba", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 40)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2210((byte) -93, arg0);
        if ((this.field4965 & var2) == 0) {
            var2 = this.field4965;
        }
        if ((var2 & 0x1) != 0) {
            this.method2207((byte) 74, arg0.getX(), 3, arg0.getY(), 0);
        }
        if ((var2 & 0x4) != 0) {
            this.method2207((byte) 74, arg0.getX(), 5, arg0.getY(), 0);
        }
        if ((var2 & 0x2) != 0) {
            this.method2207((byte) 74, arg0.getX(), 4, arg0.getY(), 0);
        }
        this.field4965 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(B)V", line = 64)
    private final void method2206(byte arg0) {
        if (this.field4967 == null) {
            return;
        }
        this.field4967.removeMouseWheelListener(this);
        this.field4967.removeMouseMotionListener(this);
        this.field4967.removeMouseListener(this);
        this.field4963 = this.field4966 = this.field4965 = 0;
        this.field4960 = null;
        this.field4964 = null;
        this.field4961 = this.field4962 = this.field4959 = 0;
        int var2 = 54 / ((arg0 + 16) / 36);
        this.field4967 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BIIII)V", line = 88)
    private final void method2207(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 74) {
            this.mouseDragged(null);
        }
        class42 var6 = new class42();
        var6.field591 = arg3;
        var6.field590 = arg1;
        var6.field589 = arg2;
        var6.field588 = class584.method3191(1);
        var6.field592 = arg4;
        this.field4964.method2087(var6, 115);
    }

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)I", line = 105)
    public final int method2208(int arg0) {
        return arg0 == 30114 ? this.field4962 : 104;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V", line = 115)
    public final void method2209(boolean arg0) {
        if (!arg0) {
            this.mouseMoved(null);
        }
        this.method2206((byte) 97);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 125)
    private final int method2210(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        }
        int var3 = 125 / ((arg0 - 30) / 54);
        if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "(I)Lpc;", line = 151)
    public final class252 method2211(int arg0) {
        return arg0 == 3813864 ? (class252) this.field4960.method2092((byte) 92) : (class252) null;
    }

    @OriginalMember(owner = "client!sba", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 161)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2212(0, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V", line = 170)
    private final void method2212(int arg0, int arg1, int arg2) {
        this.field4963 = arg1;
        this.field4966 = arg2;
        if (arg0 != 0) {
            this.mousePressed(null);
        }
        if (this.field4968) {
            this.method2207((byte) 74, arg1, -1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V", line = 186)
    public final synchronized void method2213(int arg0) {
        this.field4962 = this.field4966;
        this.field4959 = this.field4965;
        this.field4961 = this.field4963;
        class364 var2 = this.field4960;
        this.field4960 = this.field4964;
        this.field4964 = var2;
        this.field4964.method2085((byte) 9);
        int var3 = -114 / ((1 - arg0) / 40);
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)I", line = 205)
    public final int method2214(int arg0) {
        if (arg0 != -2703) {
            this.field4962 = -120;
        }
        return this.field4961;
    }

    @OriginalMember(owner = "client!sba", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 216)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Z", line = 225)
    public final boolean method2215(int arg0) {
        if (arg0 == 64) {
            return (this.field4959 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)Z", line = 237)
    public final boolean method2216(byte arg0) {
        int var2 = 103 % ((arg0 + 49) / 49);
        return (this.field4959 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 308)
    public class387(Component arg0, boolean arg1) {
        this.method2217(-121, arg0);
        this.field4968 = arg1;
    }

    @OriginalMember(owner = "client!sba", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 252)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2207((byte) 74, var2, 6, var3, var4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 265)
    private final void method2217(int arg0, Component arg1) {
        this.method2206((byte) -59);
        this.field4967 = arg1;
        this.field4967.addMouseListener(this);
        this.field4967.addMouseMotionListener(this);
        if (arg0 > -100) {
            this.field4967 = null;
        }
        this.field4967.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!sba", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 281)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2210((byte) -100, arg0);
        if (var2 == 1) {
            this.method2207((byte) 74, arg0.getX(), 0, arg0.getY(), 0);
        } else if (var2 == 4) {
            this.method2207((byte) 74, arg0.getX(), 2, arg0.getY(), 0);
        } else if (var2 == 2) {
            this.method2207((byte) 74, arg0.getX(), 1, arg0.getY(), 0);
        }
        this.field4965 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
