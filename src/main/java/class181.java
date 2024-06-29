import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class181 extends class545 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Lws;")
    private class333 field2128 = new class333();

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lws;")
    private class333 field2132 = new class333();

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "Z")
    private boolean field2134;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    private int field2125;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    private int field2126;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field2133;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)Z")
    public final boolean method1068(int arg0) {
        if (arg0 == 14057) {
            return (this.field2127 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ru", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method1073(arg0, (byte) 124);
        if ((var2 & this.field2130) == 0) {
            var2 = this.field2130;
        }
        if ((var2 & 0x1) != 0) {
            this.method1077(3, 0, (byte) 117, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method1077(5, 0, (byte) 117, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method1077(4, 0, (byte) 117, arg0.getX(), arg0.getY());
        }
        this.field2130 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
    public final synchronized void method1069(int arg0) {
        int var2 = -128 % ((arg0 - 72) / 52);
        this.field2127 = this.field2130;
        this.field2126 = this.field2129;
        this.field2125 = this.field2131;
        class333 var3 = this.field2128;
        this.field2128 = this.field2132;
        this.field2132 = var3;
        this.field2132.method1913((byte) 78);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public final void method1070(int arg0) {
        if (arg0 != -20355) {
            this.field2128 = null;
        }
        this.method1071(-104);
    }

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "(I)V")
    private final void method1071(int arg0) {
        if (this.field2133 == null) {
            return;
        }
        this.field2133.removeMouseWheelListener(this);
        this.field2133.removeMouseMotionListener(this);
        this.field2133.removeMouseListener(this);
        this.field2128 = null;
        int var2 = -115 % ((arg0 - 44) / 35);
        this.field2132 = null;
        this.field2126 = this.field2125 = this.field2127 = 0;
        this.field2129 = this.field2131 = this.field2130 = 0;
        this.field2133 = null;
    }

    @OriginalMember(owner = "client!ru", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ru", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method1077(6, var4, (byte) 117, var2, var3);
        arg0.consume();
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)Z")
    public final boolean method1072(int arg0) {
        if (arg0 != -51) {
            this.mouseReleased(null);
        }
        return (this.field2127 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ru", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method1073(arg0, (byte) 124);
        if (var2 == 1) {
            this.method1077(0, 0, (byte) 117, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method1077(2, 0, (byte) 117, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method1077(1, 0, (byte) 117, arg0.getX(), arg0.getY());
        }
        this.field2130 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ru", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1080(arg0.getX(), -22692, arg0.getY());
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method1073(MouseEvent arg0, byte arg1) {
        if (arg0.getButton() == 1) {
            return arg0.isMetaDown() ? 4 : 1;
        }
        int var3 = 122 % ((arg1 - 74) / 39);
        if (arg0.getButton() == 2) {
            return 2;
        } else if (arg0.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ru", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1080(arg0.getX(), -22692, arg0.getY());
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
    public final int method1074(byte arg0) {
        int var2 = -8 / ((65 - arg0) / 54);
        return this.field2126;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1075(int arg0, Component arg1) {
        if (arg0 != 0) {
            this.method1073(null, (byte) -10);
        }
        this.method1071(-37);
        this.field2133 = arg1;
        this.field2133.addMouseListener(this);
        this.field2133.addMouseMotionListener(this);
        this.field2133.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Z")
    public final boolean method1076(byte arg0) {
        if (arg0 >= -71) {
            this.method1073(null, (byte) -65);
        }
        return (this.field2127 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIBII)V")
    private final void method1077(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class172 var6 = new class172();
        var6.field2023 = arg0;
        var6.field2021 = arg3;
        var6.field2019 = arg4;
        var6.field2020 = class321.method1854(-75);
        if (arg2 != 117) {
            this.mouseEntered(null);
        }
        var6.field2022 = arg1;
        this.field2132.method1904(var6, arg2 ^ 0xFFFFFFD4);
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I")
    public final int method1078(byte arg0) {
        if (arg0 <= 111) {
            this.method1069(86);
        }
        return this.field2125;
    }

    @OriginalMember(owner = "client!ru", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1080(arg0.getX(), -22692, arg0.getY());
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Lwk;")
    public final class132 method1079(int arg0) {
        if (arg0 != 20193) {
            this.field2132 = null;
        }
        return (class132) this.field2128.method1906(arg0 ^ 0x4E80);
    }

    @OriginalMember(owner = "client!ru", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1080(arg0.getX(), -22692, arg0.getY());
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
    private final void method1080(int arg0, int arg1, int arg2) {
        if (arg1 != -22692) {
            this.field2129 = 106;
        }
        this.field2131 = arg2;
        this.field2129 = arg0;
        if (this.field2134) {
            this.method1077(-1, 0, (byte) 117, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class181(Component arg0, boolean arg1) {
        this.method1075(0, arg0);
        this.field2134 = arg1;
    }
}
