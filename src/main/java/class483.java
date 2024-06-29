import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class483 extends class651 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "Ltg;")
    private class605 field6977 = new class605();

    @OriginalMember(owner = "client!wga", name = "K", descriptor = "Ltg;")
    private class605 field6983 = new class605();

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "Z")
    private boolean field6989;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "[I")
    public static int[] field6959 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "[I")
    public static int[] field6973 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    private int field6961;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "I")
    private int field6965;

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!wga", name = "v", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!wga", name = "w", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
    private int field6974;

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!wga", name = "I", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!wga", name = "J", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!wga", name = "L", descriptor = "I")
    private int field6984;

    @OriginalMember(owner = "client!wga", name = "M", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!wga", name = "N", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!wga", name = "O", descriptor = "I")
    private int field6987;

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "I")
    private int field6988;

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "Lit;")
    public static class34 field6963;

    @OriginalMember(owner = "client!wga", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field6990;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
    private final int method2914(boolean arg0, MouseEvent arg1) {
        field6964++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (!arg0) {
            this.field6965 = -53;
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

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)I")
    public final int method2915(int arg0) {
        field6978++;
        return arg0 == -8463 ? this.field6974 : 21;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public final void method2916(int arg0) {
        this.method2923(121);
        if (arg0 != 24462) {
            method2919(false);
        }
        field6971++;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)V")
    private final void method2917(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field6990 = null;
        }
        this.field6988 = arg2;
        field6972++;
        this.field6987 = arg1;
        if (this.field6989) {
            this.method2920(5211, arg2, -1, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)Z")
    public final boolean method2918(int arg0) {
        if (arg0 == -16656) {
            field6982++;
            return (this.field6961 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2917(0, arg0.getY(), arg0.getX());
        field6960++;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V")
    public static void method2919(boolean arg0) {
        field6963 = null;
        field6973 = null;
        if (!arg0) {
            method2928(44, true, (byte) 51, -106);
        }
        field6959 = null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIII)V")
    private final void method2920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 5211) {
            field6973 = null;
        }
        field6968++;
        class498 var6 = new class498();
        var6.field7222 = arg4;
        var6.field7214 = arg1;
        var6.field7218 = arg3;
        var6.field7224 = arg2;
        var6.field7220 = class18.method109(arg0 ^ 0xFFFFC0D4);
        this.field6983.method3472(99, var6);
    }

    @OriginalMember(owner = "client!wga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6958++;
        int var2 = this.method2914(true, arg0);
        if ((this.field6984 & var2) == 0) {
            var2 = this.field6984;
        }
        if ((var2 & 0x1) != 0) {
            this.method2920(5211, arg0.getX(), 3, arg0.getY(), arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2920(5211, arg0.getX(), 5, arg0.getY(), arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2920(5211, arg0.getX(), 4, arg0.getY(), arg0.getClickCount());
        }
        this.field6984 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(B)I")
    public final int method2921(byte arg0) {
        field6957++;
        int var2 = 68 / ((-arg0 - 71) / 52);
        return this.field6965;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Z")
    public final boolean method2922(byte arg0) {
        if (arg0 >= -3) {
            field6959 = null;
        }
        field6956++;
        return (this.field6961 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2917(0, arg0.getY(), arg0.getX());
        field6979++;
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)V")
    private final void method2923(int arg0) {
        field6981++;
        if (this.field6990 == null) {
            return;
        }
        this.field6990.removeMouseMotionListener(this);
        this.field6990.removeMouseListener(this);
        this.field6983 = null;
        this.field6988 = this.field6987 = this.field6984 = 0;
        if (arg0 <= 113) {
            this.method2920(47, 16, 93, 92, 94);
        }
        this.field6974 = this.field6965 = this.field6961 = 0;
        this.field6977 = null;
        this.field6990 = null;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(III)Z")
    public static final boolean method2924(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            field6986++;
            return (arg0 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field6975++;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)Lck;")
    public final class703 method2925(byte arg0) {
        if (arg0 < 24) {
            this.field6965 = 77;
        }
        field6967++;
        return (class703) this.field6977.method3466(0);
    }

    @OriginalMember(owner = "client!wga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6969++;
        int var2 = this.method2914(true, arg0);
        if (var2 == 1) {
            this.method2920(5211, arg0.getX(), 0, arg0.getY(), arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2920(5211, arg0.getX(), 2, arg0.getY(), arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2920(5211, arg0.getX(), 1, arg0.getY(), arg0.getClickCount());
        }
        this.field6984 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method2926(Component arg0, boolean arg1) {
        field6970++;
        this.method2923(117);
        this.field6990 = arg0;
        this.field6990.addMouseListener(this);
        this.field6990.addMouseMotionListener(this);
        if (!arg1) {
            field6973 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(I)Lwj;")
    public static final class118 method2927(int arg0) {
        if (arg0 != 4) {
            return null;
        }
        field6985++;
        class118 var1 = (class118) class718.field10075.method3772(true);
        if (var1 != null) {
            var1.method636((byte) 97);
            var1.method1507(1);
            return var1;
        }
        class118 var2;
        do {
            var2 = (class118) class696.field9872.method3772(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method938((byte) -50) > class18.method109(-11121)) {
                return null;
            }
            var2.method636((byte) 97);
            var2.method1507(1);
        } while ((var2.field3444 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZBI)Lla;")
    public static final class422 method2928(int arg0, boolean arg1, byte arg2, int arg3) {
        field6955++;
        if (arg2 > -28) {
            method2927(100);
        }
        class463 var4 = null;
        if (class404.field5988 != null) {
            var4 = new class463(arg3, class404.field5988, class169.field2933[arg3], 1000000);
        }
        class442.field6424[arg3] = class438.field6394.method2529((byte) -48, class493.field7148, var4, arg3);
        class442.field6424[arg3].method3587((byte) 66);
        return new class422(class442.field6424[arg3], arg1, arg0);
    }

    @OriginalMember(owner = "client!wga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field6962++;
        this.method2917(0, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!wga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2917(0, arg0.getY(), arg0.getX());
        field6980++;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)Z")
    public final boolean method2929(byte arg0) {
        field6976++;
        if (arg0 >= -113) {
            this.mouseClicked(null);
        }
        return (this.field6961 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(B)V")
    public final synchronized void method2930(byte arg0) {
        this.field6961 = this.field6984;
        field6966++;
        this.field6974 = this.field6988;
        this.field6965 = this.field6987;
        class605 var2 = this.field6977;
        this.field6977 = this.field6983;
        this.field6983 = var2;
        this.field6983.method3465(0);
        int var3 = 78 % ((arg0 + 29) / 44);
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class483(Component arg0, boolean arg1) {
        this.method2926(arg0, true);
        this.field6989 = arg1;
    }
}
