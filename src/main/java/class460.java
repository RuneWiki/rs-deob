import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class460 extends class45 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Lv;")
    private class165 field6435 = new class165();

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "Lv;")
    private class165 field6438 = new class165();

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "Z")
    private boolean field6440;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    private int field6432;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    private int field6437;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    private int field6439;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field6441;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)Z")
    public final boolean method353(byte arg0) {
        if (arg0 >= -42) {
            this.mouseDragged(null);
        }
        return (this.field6432 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!maa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method2772((byte) 77, arg0);
        if (var2 == 1) {
            this.method2770(arg0.getClickCount(), 0, arg0.getX(), arg0.getY(), 4);
        } else if (var2 == 4) {
            this.method2770(arg0.getClickCount(), 2, arg0.getX(), arg0.getY(), 4);
        } else if (var2 == 2) {
            this.method2770(arg0.getClickCount(), 1, arg0.getX(), arg0.getY(), 4);
        }
        this.field6439 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)I")
    public final int method354(byte arg0) {
        return arg0 == -20 ? this.field6434 : 53;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2768(byte arg0, Component arg1) {
        this.method2771(-64);
        this.field6441 = arg1;
        this.field6441.addMouseListener(this);
        int var3 = -126 / ((-arg0 - 78) / 47);
        this.field6441.addMouseMotionListener(this);
        this.field6441.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Z")
    public final boolean method352(byte arg0) {
        if (arg0 > -34) {
            this.field6441 = null;
        }
        return (this.field6432 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!maa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2769((byte) -64, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!maa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2769((byte) -64, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!maa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method2770(var4, 6, var2, var3, 4);
        arg0.consume();
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)I")
    public final int method351(int arg0) {
        return arg0 == -25269 ? this.field6433 : 60;
    }

    @OriginalMember(owner = "client!maa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BII)V")
    private final void method2769(byte arg0, int arg1, int arg2) {
        this.field6436 = arg1;
        this.field6437 = arg2;
        if (arg0 == -64 && this.field6440) {
            this.method2770(0, -1, arg2, arg1, arg0 + 68);
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 == 0) {
            this.method2771(111);
        }
    }

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "(I)Lpea;")
    public final class620 method359(int arg0) {
        if (arg0 != 0) {
            this.mouseReleased(null);
        }
        return (class620) this.field6435.method1034(20791);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIII)V")
    private final void method2770(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class242 var6 = new class242();
        var6.field3592 = arg3;
        var6.field3593 = arg1;
        var6.field3594 = arg2;
        var6.field3595 = class683.method3903((byte) 4);
        var6.field3591 = arg0;
        if (arg4 != 4) {
            this.method2772((byte) -111, null);
        }
        this.field6438.method1039(var6, 0);
    }

    @OriginalMember(owner = "client!maa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2769((byte) -64, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "(I)V")
    private final void method2771(int arg0) {
        if (this.field6441 == null) {
            return;
        }
        this.field6441.removeMouseWheelListener(this);
        this.field6441.removeMouseMotionListener(this);
        this.field6441.removeMouseListener(this);
        this.field6435 = null;
        this.field6434 = this.field6433 = this.field6432 = 0;
        this.field6437 = this.field6436 = this.field6439 = 0;
        this.field6441 = null;
        this.field6438 = null;
        int var2 = -104 / ((-arg0 - 7) / 34);
    }

    @OriginalMember(owner = "client!maa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method2772((byte) 51, arg0);
        if ((this.field6439 & var2) == 0) {
            var2 = this.field6439;
        }
        if ((var2 & 0x1) != 0) {
            this.method2770(arg0.getClickCount(), 3, arg0.getX(), arg0.getY(), 4);
        }
        if ((var2 & 0x4) != 0) {
            this.method2770(arg0.getClickCount(), 5, arg0.getX(), arg0.getY(), 4);
        }
        if ((var2 & 0x2) != 0) {
            this.method2770(arg0.getClickCount(), 4, arg0.getX(), arg0.getY(), 4);
        }
        this.field6439 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(B)V")
    public final synchronized void method360(byte arg0) {
        this.field6434 = this.field6437;
        this.field6432 = this.field6439;
        this.field6433 = this.field6436;
        class165 var2 = this.field6435;
        int var3 = 113 / ((8 - arg0) / 34);
        this.field6435 = this.field6438;
        this.field6438 = var2;
        this.field6438.method1046((byte) 126);
    }

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "(B)Z")
    public final boolean method358(byte arg0) {
        if (arg0 != -70) {
            this.method2769((byte) -23, -24, 59);
        }
        return (this.field6432 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!maa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2769((byte) -64, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method2772(byte arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        }
        if (arg0 < 37) {
            this.mouseWheelMoved(null);
        }
        if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class460(Component arg0, boolean arg1) {
        this.method2768((byte) -2, arg0);
        this.field6440 = arg1;
    }
}
