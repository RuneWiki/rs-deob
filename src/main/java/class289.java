import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class289 extends class666 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "Lhga;")
    private class158 field4342 = new class158();

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "Lhga;")
    private class158 field4343 = new class158();

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "Z")
    private boolean field4347;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field4348;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Z")
    public final boolean method1924(int arg0) {
        if (arg0 < 22) {
            return false;
        } else {
            return (this.field4341 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)Z")
    public final boolean method1925(int arg0) {
        int var2 = -43 / ((arg0 + 50) / 45);
        return (this.field4341 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)V")
    private final void method1926(int arg0, int arg1, byte arg2) {
        this.field4345 = arg1;
        this.field4346 = arg0;
        if (arg2 > -29) {
            this.field4341 = -96;
        }
        if (this.field4347) {
            this.method1935(0, 0, -1, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!iw", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1926(arg0.getY(), arg0.getX(), (byte) -76);
    }

    @OriginalMember(owner = "client!iw", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1932(arg0, 1);
        if (var2 == 1) {
            this.method1935(arg0.getClickCount(), 0, 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method1935(arg0.getClickCount(), 0, 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method1935(arg0.getClickCount(), 0, 1, arg0.getY(), arg0.getX());
        }
        this.field4344 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "(I)V")
    private final void method1927(int arg0) {
        if (this.field4348 == null) {
            return;
        }
        this.field4348.removeMouseWheelListener(this);
        if (arg0 != -14835) {
            this.field4347 = true;
        }
        this.field4348.removeMouseMotionListener(this);
        this.field4348.removeMouseListener(this);
        this.field4345 = this.field4346 = this.field4344 = 0;
        this.field4343 = null;
        this.field4340 = this.field4339 = this.field4341 = 0;
        this.field4342 = null;
        this.field4348 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method1928(byte arg0, Component arg1) {
        if (arg0 < 22) {
            this.field4342 = null;
        }
        this.method1927(-14835);
        this.field4348 = arg1;
        this.field4348.addMouseListener(this);
        this.field4348.addMouseMotionListener(this);
        this.field4348.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!iw", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)V")
    public final synchronized void method1929(int arg0) {
        this.field4340 = this.field4345;
        this.field4341 = this.field4344;
        this.field4339 = this.field4346;
        if (arg0 != 97) {
            this.method1928((byte) 46, null);
        }
        class158 var2 = this.field4342;
        this.field4342 = this.field4343;
        this.field4343 = var2;
        this.field4343.method1222((byte) -86);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
    public final void method1930(boolean arg0) {
        if (!arg0) {
            this.method1927(-14835);
        }
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)I")
    public final int method1931(int arg0) {
        if (arg0 != -23081) {
            this.mouseEntered(null);
        }
        return this.field4340;
    }

    @OriginalMember(owner = "client!iw", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1926(arg0.getY(), arg0.getX(), (byte) -78);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method1932(MouseEvent arg0, int arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            if (arg1 != 1) {
                this.method1929(40);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!iw", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1926(arg0.getY(), arg0.getX(), (byte) -61);
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)Lnm;")
    public final class441 method1933(byte arg0) {
        if (arg0 >= -22) {
            this.mouseClicked(null);
        }
        return (class441) this.field4342.method1226(0);
    }

    @OriginalMember(owner = "client!iw", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1926(arg0.getY(), arg0.getX(), (byte) -56);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)Z")
    public final boolean method1934(byte arg0) {
        if (arg0 != -40) {
            this.field4345 = 118;
        }
        return (this.field4341 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIII)V")
    private final void method1935(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class128 var6 = new class128();
        var6.field2328 = arg4;
        var6.field2327 = arg2;
        if (arg1 != 0) {
            this.method1931(-10);
        }
        var6.field2330 = arg3;
        var6.field2326 = class525.method3074((byte) -101);
        var6.field2329 = arg0;
        this.field4343.method1229(var6, (byte) 120);
    }

    @OriginalMember(owner = "client!iw", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1935(var4, 0, 6, var3, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)I")
    public final int method1936(int arg0) {
        if (arg0 <= 124) {
            this.mouseMoved(null);
        }
        return this.field4339;
    }

    @OriginalMember(owner = "client!iw", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1932(arg0, 1);
        if ((this.field4344 & var2) == 0) {
            var2 = this.field4344;
        }
        if ((var2 & 0x1) != 0) {
            this.method1935(arg0.getClickCount(), 0, 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1935(arg0.getClickCount(), 0, 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1935(arg0.getClickCount(), 0, 4, arg0.getY(), arg0.getX());
        }
        this.field4344 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class289(Component arg0, boolean arg1) {
        this.method1928((byte) 40, arg0);
        this.field4347 = arg1;
    }
}
