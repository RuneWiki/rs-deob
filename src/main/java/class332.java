import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class332 extends class215 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "Lnv;")
    private class44 field5013 = new class44();

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Lnv;")
    private class44 field5018 = new class44();

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "Z")
    private boolean field5020;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    private int field5012;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    private int field5014;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    private int field5016;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field5019;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lbq;", line = 4)
    public final class345 method1473(int arg0) {
        if (arg0 != -23330) {
            this.field5020 = true;
        }
        return (class345) this.field5013.method298(arg0 + 23226);
    }

    @OriginalMember(owner = "client!wo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 15)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2170((byte) -120, arg0);
    }

    @OriginalMember(owner = "client!wo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 24)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2170((byte) -70, arg0);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V", line = 31)
    private final void method2167(byte arg0) {
        if (this.field5019 == null) {
            return;
        }
        this.field5019.removeMouseWheelListener(this);
        this.field5019.removeMouseMotionListener(this);
        this.field5019.removeMouseListener(this);
        this.field5011 = this.field5012 = this.field5014 = 0;
        this.field5017 = this.field5015 = this.field5016 = 0;
        if (arg0 != -79) {
            this.mouseReleased(null);
        }
        this.field5018 = null;
        this.field5019 = null;
        this.field5013 = null;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Z", line = 53)
    public final boolean method1480(int arg0) {
        if (arg0 > -16) {
            return false;
        } else {
            return (this.field5014 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 66)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2171(var3, -38, var4, var2, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!wo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 78)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 88)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2170((byte) -110, arg0);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V", line = 95)
    public final synchronized void method1483(byte arg0) {
        this.field5012 = this.field5015;
        this.field5014 = this.field5016;
        if (arg0 > -1) {
            this.method1473(-47);
        }
        this.field5011 = this.field5017;
        class44 var2 = this.field5013;
        this.field5013 = this.field5018;
        this.field5018 = var2;
        this.field5018.method291(false);
    }

    @OriginalMember(owner = "client!wo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 118)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2168(arg0, true);
        if (var2 == 1) {
            this.method2171(arg0.getY(), -81, 0, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method2171(arg0.getY(), -34, 0, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method2171(arg0.getY(), -102, 0, arg0.getX(), 1);
        }
        this.field5016 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2168(arg0, true);
        if ((this.field5016 & var2) == 0) {
            var2 = this.field5016;
        }
        if ((var2 & 0x1) != 0) {
            this.method2171(arg0.getY(), -119, 0, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2171(arg0.getY(), -100, 0, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2171(arg0.getY(), -128, 0, arg0.getX(), 4);
        }
        this.field5016 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I", line = 171)
    private final int method2168(MouseEvent arg0, boolean arg1) {
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (!arg1) {
            this.field5014 = 120;
        }
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 205)
    private final void method2169(Component arg0, int arg1) {
        this.method2167((byte) -79);
        this.field5019 = arg0;
        this.field5019.addMouseListener(this);
        this.field5019.addMouseMotionListener(this);
        this.field5019.addMouseWheelListener(this);
        if (arg1 > -28) {
            this.mouseExited(null);
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Z", line = 219)
    public final boolean method1479(int arg0) {
        if (arg0 != 0) {
            this.method1485(-63);
        }
        return (this.field5014 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V", line = 229)
    private final void method2170(byte arg0, MouseEvent arg1) {
        this.field5017 = arg1.getX();
        if (arg0 >= -41) {
            this.field5018 = null;
        }
        this.field5015 = arg1.getY();
        if (this.field5020) {
            this.method2171(arg1.getY(), -67, 0, arg1.getX(), -1);
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V", line = 249)
    public final void method1481(int arg0) {
        if (arg0 == -10462) {
            this.method2167((byte) -79);
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 327)
    public class332(Component arg0, boolean arg1) {
        this.method2169(arg0, -63);
        this.field5020 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V", line = 265)
    private final void method2171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class494 var6 = new class494();
        var6.field7204 = arg3;
        var6.field7203 = arg4;
        if (arg1 > -12) {
            this.field5014 = -109;
        }
        var6.field7205 = arg0;
        var6.field7206 = class375.method2397((byte) -75);
        var6.field7202 = arg2;
        this.field5018.method292((byte) 121, var6);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I", line = 282)
    public final int method1475(byte arg0) {
        int var2 = 61 % ((-arg0 - 56) / 51);
        return this.field5011;
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)I", line = 290)
    public final int method1484(int arg0) {
        if (arg0 != -22647) {
            this.field5016 = -14;
        }
        return this.field5012;
    }

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)Z", line = 300)
    public final boolean method1485(int arg0) {
        if (arg0 >= -118) {
            this.mouseClicked(null);
        }
        return (this.field5014 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 310)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5015 = -1;
        this.field5017 = -1;
    }
}
