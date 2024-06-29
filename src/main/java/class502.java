import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class502 extends class435 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "Lada;")
    private class164 field7141 = new class164();

    @OriginalMember(owner = "client!eaa", name = "L", descriptor = "Lada;")
    private class164 field7154 = new class164();

    @OriginalMember(owner = "client!eaa", name = "P", descriptor = "Z")
    private boolean field7158;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lqe;")
    public static class469 field7139 = new class469(96, -2);

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    public static int field7146 = 0;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    private int field7129;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
    private int field7151;

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
    private int field7153;

    @OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
    private int field7155;

    @OriginalMember(owner = "client!eaa", name = "N", descriptor = "I")
    private int field7156;

    @OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
    private int field7157;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "Lha;")
    public static class60 field7152;

    @OriginalMember(owner = "client!eaa", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field7159;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "[[B")
    public static byte[][] field7147;

    @OriginalMember(owner = "client!eaa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field7130++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eaa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7134++;
        this.method2982(arg0.getX(), arg0.getY(), 0);
    }

    @OriginalMember(owner = "client!eaa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field7143++;
        this.method2982(arg0.getX(), arg0.getY(), 0);
    }

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)I")
    public final int method2698(int arg0) {
        field7124++;
        return arg0 == 0 ? this.field7153 : -2;
    }

    @OriginalMember(owner = "client!eaa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2982(arg0.getX(), arg0.getY(), 0);
        field7148++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)Lwi;")
    public final class467 method2699(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field7138++;
            return (class467) this.field7141.method1198((byte) 73);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)Z")
    public final boolean method2692(int arg0) {
        field7145++;
        if (arg0 == 0) {
            return (this.field7151 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
    private final void method2982(int arg0, int arg1, int arg2) {
        this.field7156 = arg0;
        field7133++;
        this.field7157 = arg1;
        if (this.field7158) {
            this.method2986(arg1, (byte) 18, -1, arg0, 0);
        }
        if (arg2 != 0) {
            field7139 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7137++;
        int var2 = this.method2984(arg0, (byte) 69);
        if (var2 == 1) {
            this.method2986(arg0.getY(), (byte) 18, 0, arg0.getX(), arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2986(arg0.getY(), (byte) 18, 2, arg0.getX(), arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2986(arg0.getY(), (byte) 18, 1, arg0.getX(), arg0.getClickCount());
        }
        this.field7155 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "(I)V")
    public static void method2983(int arg0) {
        field7147 = null;
        field7139 = null;
        if (arg0 >= -3) {
            method2985((byte) -72, -67, 110, 51);
        }
        field7152 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)I")
    public final int method2697(int arg0) {
        field7128++;
        return arg0 == 4212 ? this.field7129 : 120;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method2984(MouseEvent arg0, byte arg1) {
        field7126++;
        if (arg1 != 69) {
            this.field7158 = false;
        }
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
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

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Z")
    public final boolean method2690(int arg0) {
        field7144++;
        if (arg0 == 27621) {
            return (this.field7151 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIII)V")
    public static final void method2985(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        field7136++;
        class418.field6261 = var5;
        if (arg0 != 76) {
            field7152 = null;
        }
        class255.field3659 = var4;
        if (class264.field3784 == 2) {
            class120.field1650 = var5;
            class253.field3649 = var6;
            class660.field9234 = var4;
        }
        class378.method2444(false);
        class504.field7168 = true;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBIII)V")
    private final void method2986(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7127++;
        class281 var6 = new class281();
        var6.field3980 = arg4;
        var6.field3975 = arg0;
        var6.field3971 = arg2;
        var6.field3969 = arg3;
        if (arg1 != 18) {
            this.mousePressed(null);
        }
        var6.field3974 = class524.method3075(arg1);
        this.field7154.method1203(var6, (byte) -79);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
    public final synchronized void method2691(int arg0) {
        this.field7153 = this.field7157;
        this.field7151 = this.field7155;
        field7140++;
        this.field7129 = this.field7156;
        class164 var2 = this.field7141;
        this.field7141 = this.field7154;
        this.field7154 = var2;
        if (arg0 == 9231) {
            this.field7154.method1200(arg0 ^ 0x244D);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7142++;
        int var2 = this.method2984(arg0, (byte) 69);
        if ((var2 & this.field7155) == 0) {
            var2 = this.field7155;
        }
        if ((var2 & 0x1) != 0) {
            this.method2986(arg0.getY(), (byte) 18, 3, arg0.getX(), arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2986(arg0.getY(), (byte) 18, 5, arg0.getX(), arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2986(arg0.getY(), (byte) 18, 4, arg0.getX(), arg0.getClickCount());
        }
        this.field7155 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
    public final void method2696(int arg0) {
        this.method2988(-1819);
        if (arg0 != 16384) {
            this.method2982(44, 68, 66);
        }
        field7125++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2987(Component arg0, int arg1) {
        this.method2988(-1819);
        if (arg1 != 5) {
            this.field7151 = 60;
        }
        field7149++;
        this.field7159 = arg0;
        this.field7159.addMouseListener(this);
        this.field7159.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!eaa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2982(arg0.getX(), arg0.getY(), 0);
        field7132++;
    }

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "(I)V")
    private final void method2988(int arg0) {
        if (arg0 != -1819) {
            this.method2691(-100);
        }
        field7150++;
        if (this.field7159 == null) {
            return;
        }
        this.field7159.removeMouseMotionListener(this);
        this.field7159.removeMouseListener(this);
        this.field7141 = null;
        this.field7129 = this.field7153 = this.field7151 = 0;
        this.field7156 = this.field7157 = this.field7155 = 0;
        this.field7154 = null;
        this.field7159 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)Z")
    public final boolean method2695(byte arg0) {
        if (arg0 != -116) {
            this.field7157 = 83;
        }
        field7135++;
        return (this.field7151 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class502(Component arg0, boolean arg1) {
        this.method2987(arg0, 5);
        this.field7158 = arg1;
    }
}
