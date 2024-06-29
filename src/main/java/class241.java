import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class241 extends class334 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lpu;")
    private class411 field4155 = new class411();

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Lpu;")
    private class411 field4161 = new class411();

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "Z")
    private boolean field4167;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "[Lcm;")
    public static class452[] field4163 = new class452[50];

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "Lfr;")
    public static class231 field4158 = new class231(5);

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    private int field4147;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field4168;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)V", line = 3)
    public static void method1645(int arg0) {
        if (arg0 == 18751) {
            field4163 = null;
            field4158 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Z", line = 17)
    public final boolean method1646(byte arg0) {
        if (arg0 != 6) {
            this.method1654(43, -5, -92, -84);
        }
        field4148++;
        return (this.field4147 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lvb;", line = 28)
    public final class272 method1647(int arg0) {
        field4166++;
        return arg0 == 8 ? (class272) this.field4155.method2539(0) : null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I", line = 39)
    private final int method1648(MouseEvent arg0, boolean arg1) {
        field4144++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg1) {
            return -40;
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

    @OriginalMember(owner = "client!fk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 78)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field4135++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 89)
    public static final void method1649(int arg0, int arg1) {
        field4143++;
        if (class468.method2782(arg0, arg1 ^ 0x617A)) {
            class194.method1297(-20896, class508.field7389[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z", line = 101)
    public static final boolean method1650(int arg0, int arg1, int arg2) {
        field4136++;
        int var3 = -101 % ((82 - arg2) / 40);
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z", line = 120)
    public final boolean method1651(byte arg0) {
        int var2 = -72 / ((42 - arg0) / 61);
        field4137++;
        return (this.field4147 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 132)
    public final void method1652(int arg0) {
        this.method1656((byte) -26);
        field4164++;
        if (arg0 != 27241) {
            this.field4147 = -57;
        }
    }

    @OriginalMember(owner = "client!fk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4138++;
        int var2 = this.method1648(arg0, false);
        if ((this.field4165 & var2) == 0) {
            var2 = this.field4165;
        }
        if ((var2 & 0x1) != 0) {
            this.method1654(arg0.getX(), arg0.getY(), -67, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1654(arg0.getX(), arg0.getY(), -119, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1654(arg0.getX(), arg0.getY(), -87, 4);
        }
        this.field4165 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 173)
    private final void method1653(byte arg0, Component arg1) {
        field4141++;
        this.method1656((byte) -107);
        this.field4168 = arg1;
        if (arg0 >= -43) {
            this.method1651((byte) -13);
        }
        this.field4168.addMouseListener(this);
        this.field4168.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V", line = 187)
    private final void method1654(int arg0, int arg1, int arg2, int arg3) {
        field4146++;
        class55 var5 = new class55();
        var5.field886 = arg0;
        var5.field883 = arg1;
        var5.field891 = arg3;
        if (arg2 < -31) {
            var5.field890 = class19.method91((byte) 108);
            this.field4161.method2541(0, var5);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I", line = 204)
    public final int method1655(int arg0) {
        if (arg0 >= -96) {
            this.field4147 = 39;
        }
        field4142++;
        return this.field4153;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)V", line = 216)
    private final void method1656(byte arg0) {
        field4154++;
        if (this.field4168 == null) {
            return;
        }
        this.field4168.removeMouseListener(this);
        this.field4168.removeMouseMotionListener(this);
        if (arg0 >= -2) {
            this.mouseClicked(null);
        }
        this.field4160 = this.field4162 = this.field4165 = 0;
        this.field4161 = null;
        this.field4155 = null;
        this.field4168 = null;
        this.field4151 = this.field4153 = this.field4147 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 240)
    public final synchronized void method1657(byte arg0) {
        this.field4151 = this.field4160;
        this.field4147 = this.field4165;
        if (arg0 != 50) {
            this.field4165 = 27;
        }
        field4159++;
        this.field4153 = this.field4162;
        class411 var2 = this.field4155;
        this.field4155 = this.field4161;
        this.field4161 = var2;
        this.field4161.method2543(7655);
    }

    @OriginalMember(owner = "client!fk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 262)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1662(-123, arg0);
        field4152++;
    }

    @OriginalMember(owner = "client!fk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 271)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1662(-114, arg0);
        field4149++;
    }

    @OriginalMember(owner = "client!fk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 279)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4145++;
        this.field4162 = -1;
        this.field4160 = -1;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)Z", line = 291)
    public final boolean method1658(byte arg0) {
        if (arg0 >= -100) {
            this.mouseClicked(null);
        }
        field4133++;
        return (this.field4147 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 303)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1662(-114, arg0);
        field4140++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 315)
    public static final boolean method1659(String arg0, int arg1) {
        field4150++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class139.field2317; var2++) {
            if (arg0.equalsIgnoreCase(class485.field7122[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class302.field4850.field2652);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)I", line = 344)
    public final int method1660(int arg0) {
        if (arg0 != 2766) {
            field4158 = null;
        }
        field4132++;
        return this.field4151;
    }

    @OriginalMember(owner = "client!fk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 356)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4139++;
        int var2 = this.method1648(arg0, false);
        if (var2 == 1) {
            this.method1654(arg0.getX(), arg0.getY(), -98, 0);
        } else if (var2 == 4) {
            this.method1654(arg0.getX(), arg0.getY(), -98, 2);
        } else if (var2 == 2) {
            this.method1654(arg0.getX(), arg0.getY(), -64, 1);
        }
        this.field4165 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 457)
    public class241(Component arg0, boolean arg1) {
        this.method1653((byte) -89, arg0);
        this.field4167 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;", line = 393)
    public static final String[] method1661(char arg0, int arg1, String arg2) {
        field4134++;
        if (arg1 != -20326) {
            return null;
        }
        int var3 = class337.method2124(arg2, arg0, arg1 ^ 0xFFFFB0C7);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 428)
    private final void method1662(int arg0, MouseEvent arg1) {
        field4157++;
        this.field4160 = arg1.getX();
        this.field4162 = arg1.getY();
        int var3 = -84 / ((-arg0 - 32) / 37);
        if (this.field4167) {
            this.method1654(arg1.getX(), arg1.getY(), -104, -1);
        }
    }
}
