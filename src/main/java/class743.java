import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class743 extends class720 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "Lat;")
    private class398 field10929 = new class398();

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "Lat;")
    private class398 field10931 = new class398();

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "Z")
    private boolean field10934;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    private int field10926;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    private int field10927;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
    private int field10928;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
    private int field10930;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    private int field10932;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    private int field10933;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field10935;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)I", line = 4)
    public final int method5048(boolean arg0) {
        return arg0 ? this.field10928 : -69;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)V", line = 14)
    private final void method5409(int arg0, int arg1, int arg2) {
        this.field10930 = arg1;
        if (arg0 != 2) {
            this.mouseEntered(null);
        }
        this.field10933 = arg2;
        if (this.field10934) {
            this.method5412(arg1, -1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 30)
    private final void method5410(int arg0, Component arg1) {
        this.method5413(arg0);
        this.field10935 = arg1;
        this.field10935.addMouseListener(this);
        this.field10935.addMouseMotionListener(this);
        this.field10935.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!lga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method5409(2, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!lga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 52)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method5409(2, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 59)
    private final int method5411(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        } else if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            if (arg1 >= -22) {
                this.field10933 = 116;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)V", line = 87)
    public final synchronized void method5047(int arg0) {
        this.field10926 = this.field10933;
        this.field10928 = this.field10930;
        this.field10927 = this.field10932;
        class398 var2 = this.field10929;
        if (arg0 == 0) {
            this.field10929 = this.field10931;
            this.field10931 = var2;
            this.field10931.method3224(false);
        }
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)Lva;", line = 108)
    public final class524 method5050(int arg0) {
        return arg0 == 0 ? (class524) this.field10929.method3219(-18) : (class524) null;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V", line = 118)
    public final void method5044(int arg0) {
        this.method5413(arg0 + arg0);
    }

    @OriginalMember(owner = "client!lga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 126)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method5412(var3, 6, 0, var4, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Z", line = 139)
    public final boolean method5042(byte arg0) {
        if (arg0 <= 83) {
            return false;
        } else {
            return (this.field10927 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(Z)Z", line = 149)
    public final boolean method5040(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return (this.field10927 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!lga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 159)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)Z", line = 169)
    public final boolean method5054(byte arg0) {
        if (arg0 == -72) {
            return (this.field10927 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method5409(2, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIII)V", line = 188)
    private final void method5412(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class577 var6 = new class577();
        var6.field8314 = arg4;
        var6.field8312 = arg1;
        var6.field8313 = arg0;
        var6.field8311 = class712.method5167(-2334);
        var6.field8315 = arg3;
        this.field10931.method3220(var6, arg2);
    }

    @OriginalMember(owner = "client!lga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 202)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method5411(arg0, (byte) -89);
        if (var2 == 1) {
            this.method5412(arg0.getY(), 0, 0, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 4) {
            this.method5412(arg0.getY(), 2, 0, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 2) {
            this.method5412(arg0.getY(), 1, 0, arg0.getClickCount(), arg0.getX());
        }
        this.field10932 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 226)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method5411(arg0, (byte) -55);
        if ((this.field10932 & var2) == 0) {
            var2 = this.field10932;
        }
        if ((var2 & 0x1) != 0) {
            this.method5412(arg0.getY(), 3, 0, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method5412(arg0.getY(), 5, 0, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method5412(arg0.getY(), 4, 0, arg0.getClickCount(), arg0.getX());
        }
        this.field10932 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "(I)V", line = 251)
    private final void method5413(int arg0) {
        if (this.field10935 == null) {
            return;
        }
        this.field10935.removeMouseWheelListener(this);
        this.field10935.removeMouseMotionListener(this);
        this.field10935.removeMouseListener(this);
        this.field10935 = null;
        this.field10933 = this.field10930 = this.field10932 = arg0;
        this.field10926 = this.field10928 = this.field10927 = 0;
        this.field10931 = null;
        this.field10929 = null;
    }

    @OriginalMember(owner = "client!lga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 274)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method5409(2, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "(I)I", line = 281)
    public final int method5051(int arg0) {
        if (arg0 != 0) {
            this.method5044(-20);
        }
        return this.field10926;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 302)
    public class743(Component arg0, boolean arg1) {
        this.method5410(0, arg0);
        this.field10934 = arg1;
    }
}
