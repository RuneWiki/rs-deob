import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class127 extends class647 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "Leea;")
    private class114 field1565 = new class114();

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Leea;")
    private class114 field1571 = new class114();

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "Z")
    private boolean field1574;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field1573;

    @OriginalMember(owner = "client!ct", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method786(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 12)
    private final int method776(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else {
            if (arg1 < 106) {
                this.field1565 = null;
            }
            return arg0.getButton() == 3 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)I", line = 39)
    public final int method777(byte arg0) {
        int var2 = 93 % ((arg0 + 3) / 41);
        return this.field1566;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)I", line = 47)
    public final int method778(int arg0) {
        return arg0 == 6 ? this.field1567 : 48;
    }

    @OriginalMember(owner = "client!ct", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 59)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method776(arg0, 119);
        if ((var2 & this.field1570) == 0) {
            var2 = this.field1570;
        }
        if ((var2 & 0x1) != 0) {
            this.method783(arg0.getX(), arg0.getY(), 0, 15125, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method783(arg0.getX(), arg0.getY(), 0, 15125, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method783(arg0.getX(), arg0.getY(), 0, 15125, 4);
        }
        this.field1570 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ct", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 85)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method776(arg0, 125);
        if (var2 == 1) {
            this.method783(arg0.getX(), arg0.getY(), 0, 15125, 0);
        } else if (var2 == 4) {
            this.method783(arg0.getX(), arg0.getY(), 0, 15125, 2);
        } else if (var2 == 2) {
            this.method783(arg0.getX(), arg0.getY(), 0, 15125, 1);
        }
        this.field1570 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ct", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 108)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method786(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V", line = 115)
    public final synchronized void method779(int arg0) {
        this.field1566 = this.field1569;
        this.field1567 = this.field1572;
        this.field1568 = this.field1570;
        if (arg0 >= -58) {
            this.method781(1);
        }
        class114 var2 = this.field1565;
        this.field1565 = this.field1571;
        this.field1571 = var2;
        this.field1571.method718(-112);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lhl;", line = 136)
    public final class458 method780(boolean arg0) {
        return arg0 ? (class458) null : (class458) this.field1565.method714(true);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z", line = 146)
    public final boolean method781(int arg0) {
        if (arg0 <= 118) {
            this.mouseDragged(null);
        }
        return (this.field1568 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Z", line = 157)
    public final boolean method782(byte arg0) {
        if (arg0 == -5) {
            return (this.field1568 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 167)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V", line = 178)
    private final void method783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class43 var6 = new class43();
        var6.field461 = arg4;
        var6.field462 = arg1;
        var6.field460 = arg0;
        var6.field463 = class84.method550((byte) -84);
        var6.field464 = arg2;
        if (arg3 == 15125) {
            this.field1571.method706(var6, true);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 194)
    private final void method784(int arg0, Component arg1) {
        this.method788(14579);
        this.field1573 = arg1;
        this.field1573.addMouseListener(this);
        this.field1573.addMouseMotionListener(this);
        if (arg0 != -1) {
            this.method785(86);
        }
        this.field1573.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ct", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 210)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method783(var2, var3, var4, 15125, 6);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ct", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 224)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method786(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)Z", line = 231)
    public final boolean method785(int arg0) {
        if (arg0 < 50) {
            return false;
        } else {
            return (this.field1568 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 241)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method786(arg0.getY(), arg0.getX(), -1);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(III)V", line = 249)
    private final void method786(int arg0, int arg1, int arg2) {
        this.field1572 = arg1;
        if (arg2 != -1) {
            this.method785(65);
        }
        this.field1569 = arg0;
        if (this.field1574) {
            this.method783(arg1, arg0, 0, arg2 ^ 0xFFFFC4EA, -1);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 266)
    public final void method787(int arg0) {
        if (arg0 != 6) {
            this.method786(112, 18, -116);
        }
        this.method788(14579);
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 311)
    public class127(Component arg0, boolean arg1) {
        this.method784(-1, arg0);
        this.field1574 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V", line = 280)
    private final void method788(int arg0) {
        if (this.field1573 == null) {
            return;
        }
        this.field1573.removeMouseWheelListener(this);
        this.field1573.removeMouseMotionListener(this);
        this.field1573.removeMouseListener(this);
        this.field1567 = this.field1566 = this.field1568 = 0;
        this.field1565 = null;
        this.field1573 = null;
        if (arg0 != 14579) {
            this.field1569 = -24;
        }
        this.field1571 = null;
        this.field1572 = this.field1569 = this.field1570 = 0;
    }
}
