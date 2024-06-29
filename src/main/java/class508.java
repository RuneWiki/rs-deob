import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class508 extends class202 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "Lwl;")
    private class280 field7056 = new class280();

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "Lwl;")
    private class280 field7076 = new class280();

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "Z")
    private boolean field7079;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "Lcu;")
    public static class145 field7066 = new class145(31, 0);

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    private int field7047;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    private int field7050;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    private int field7071;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    private int field7073;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    private int field7074;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    private int field7077;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "Ljava/awt/Component;")
    private Component field7078;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "[La;")
    public static class435[] field7059;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V", line = 4)
    public final synchronized void method1296(byte arg0) {
        field7060++;
        this.field7071 = this.field7073;
        this.field7050 = this.field7074;
        this.field7047 = this.field7077;
        class280 var2 = this.field7056;
        this.field7056 = this.field7076;
        this.field7076 = var2;
        if (arg0 <= 37) {
            method2901((byte) 31);
        }
        this.field7076.method1670((byte) -104);
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(B)V", line = 26)
    public static void method2901(byte arg0) {
        if (arg0 == -124) {
            field7066 = null;
            field7059 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I", line = 40)
    private final int method2902(MouseEvent arg0, boolean arg1) {
        field7070++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (!arg1) {
            this.method1298(60);
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

    @OriginalMember(owner = "client!cp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 76)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7067++;
        this.method2905(arg0, (byte) -94);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z", line = 85)
    public final boolean method1292(int arg0) {
        if (arg0 != -18949) {
            this.mouseMoved(null);
        }
        field7063++;
        return (this.field7071 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 96)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7052++;
        int var2 = this.method2902(arg0, true);
        if ((var2 & this.field7073) == 0) {
            var2 = this.field7073;
        }
        if ((var2 & 0x1) != 0) {
            this.method2904(arg0.getX(), 16998, 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2904(arg0.getX(), 16998, 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2904(arg0.getX(), 16998, 4, arg0.getY());
        }
        this.field7073 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 125)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field7064++;
        this.method2905(arg0, (byte) -94);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Z", line = 133)
    public final boolean method1293(byte arg0) {
        field7065++;
        if (arg0 < 64) {
            return true;
        } else {
            return (this.field7071 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!cp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 144)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field7069++;
        this.field7074 = -1;
        this.field7077 = -1;
    }

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "(B)V", line = 156)
    private final void method2903(byte arg0) {
        field7072++;
        if (this.field7078 == null) {
            return;
        }
        this.field7078.removeMouseListener(this);
        this.field7078.removeMouseMotionListener(this);
        this.field7074 = this.field7077 = this.field7073 = 0;
        this.field7076 = null;
        if (arg0 >= -34) {
            this.method2904(108, 117, -81, -23);
        }
        this.field7056 = null;
        this.field7078 = null;
        this.field7050 = this.field7047 = this.field7071 = 0;
    }

    @OriginalMember(owner = "client!cp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 178)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field7053++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V", line = 189)
    private final void method2904(int arg0, int arg1, int arg2, int arg3) {
        field7075++;
        class33 var5 = new class33();
        var5.field533 = arg2;
        var5.field536 = arg3;
        var5.field532 = arg0;
        var5.field544 = class498.method2854(-128);
        this.field7076.method1666((byte) 97, var5);
        if (arg1 != 16998) {
            this.field7056 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)Z", line = 209)
    public final boolean method1294(byte arg0) {
        field7068++;
        if (arg0 != -28) {
            this.field7079 = false;
        }
        return (this.field7071 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V", line = 229)
    private final void method2905(MouseEvent arg0, byte arg1) {
        this.field7074 = arg0.getX();
        if (arg1 != -94) {
            this.field7074 = -81;
        }
        field7057++;
        this.field7077 = arg0.getY();
        if (this.field7079) {
            this.method2904(arg0.getX(), 16998, -1, arg0.getY());
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)I", line = 249)
    public final int method1297(boolean arg0) {
        field7054++;
        if (!arg0) {
            this.mouseReleased(null);
        }
        return this.field7047;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V", line = 260)
    public final void method1299(int arg0) {
        field7049++;
        if (arg0 != 0) {
            this.field7073 = 22;
        }
        this.method2903((byte) -112);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 276)
    private final void method2906(Component arg0, int arg1) {
        this.method2903((byte) -41);
        field7062++;
        this.field7078 = arg0;
        this.field7078.addMouseListener(this);
        this.field7078.addMouseMotionListener(this);
        if (arg1 != 30000) {
            this.field7078 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Llb;", line = 290)
    public final class378 method1298(int arg0) {
        if (arg0 != 0) {
            this.method2902(null, false);
        }
        field7051++;
        return (class378) this.field7056.method1662((byte) 100);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 366)
    public class508(Component arg0, boolean arg1) {
        this.method2906(arg0, 30000);
        this.field7079 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 314)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7058++;
        int var2 = this.method2902(arg0, true);
        if (var2 == 1) {
            this.method2904(arg0.getX(), 16998, 0, arg0.getY());
        } else if (var2 == 4) {
            this.method2904(arg0.getX(), 16998, 2, arg0.getY());
        } else if (var2 == 2) {
            this.method2904(arg0.getX(), 16998, 1, arg0.getY());
        }
        this.field7073 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 340)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field7048++;
        this.method2905(arg0, (byte) -94);
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)I", line = 348)
    public final int method1302(int arg0) {
        field7061++;
        return arg0 == -4362 ? this.field7050 : 86;
    }
}
