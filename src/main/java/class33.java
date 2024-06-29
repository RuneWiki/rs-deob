import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 extends class520 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Lor;")
    private class594 field475 = new class594();

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Lor;")
    private class594 field495 = new class594();

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Z")
    private boolean field496;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field497;

    @OriginalMember(owner = "client!ud", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field487++;
        int var2 = this.method461(arg0, (byte) -34);
        if (var2 == 1) {
            this.method457(0, 0, arg0.getY(), arg0.getClickCount(), arg0.getX());
        } else if (var2 == 4) {
            this.method457(0, 2, arg0.getY(), arg0.getClickCount(), arg0.getX());
        } else if (var2 == 2) {
            this.method457(0, 1, arg0.getY(), arg0.getClickCount(), arg0.getX());
        }
        this.field493 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 28)
    public final synchronized void method447(int arg0) {
        this.field489 = this.field493;
        if (arg0 <= 63) {
            this.method451(61);
        }
        field465++;
        this.field468 = this.field494;
        this.field479 = this.field492;
        class594 var2 = this.field475;
        this.field475 = this.field495;
        this.field495 = var2;
        this.field495.method3474(22090);
    }

    @OriginalMember(owner = "client!ud", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 50)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field478++;
        this.method455(3723, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lvfa;", line = 61)
    public final class623 method448(byte arg0) {
        if (arg0 == -21) {
            field491++;
            return (class623) this.field475.method3471(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)I", line = 76)
    public static final int method449(int arg0, int arg1) {
        field480++;
        return arg0 == arg1 ? -1 : class132.method1150(false, arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILpca;II)V", line = 88)
    public static final void method450(int arg0, class665 arg1, int arg2, int arg3) {
        field477++;
        if (arg3 > -123) {
            return;
        }
        if (class145.field2450) {
            class638 var4 = class340.field5505 == -1 ? null : class610.field8680.method3566(class340.field5505, -14724);
            if (client.method1955(arg1).method741(-115) && (class73.field918 & 0x20) != 0 && (var4 == null || arg1.method3824(class340.field5505, var4.field8960, 21774) != var4.field8960)) {
                class652.method3758(arg1.field9400, arg1.field9354, class523.field7609, class289.field4586 + " -> " + arg1.field9342, true, 5, false, false, 0L, arg1.field9380, class558.field8067);
                class289.field4587++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class373.method2457(var5, -109, arg1);
            if (var9 != null) {
                class652.method3758(arg1.field9400, arg1.field9354, var9, arg1.field9342, true, 1006, false, false, (long) (var5 + 1), arg1.field9380, class263.method1867((byte) 75, var5, arg1));
                class422.field6435++;
            }
        }
        String var6 = class67.method712(104, arg1);
        if (var6 != null) {
            class111.field1778++;
            class652.method3758(arg1.field9400, arg1.field9354, var6, arg1.field9342, true, 58, false, false, 0L, arg1.field9380, arg1.field9377);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class373.method2457(var7, 98, arg1);
            if (var8 != null) {
                class422.field6435++;
                class652.method3758(arg1.field9400, arg1.field9354, var8, arg1.field9342, true, 12, false, false, (long) (var7 + 1), arg1.field9380, class263.method1867((byte) 86, var7, arg1));
            }
        }
        if (!client.method1955(arg1).method739((byte) -48)) {
            return;
        }
        class682.field9568++;
        if (arg1.field9390 == null) {
            class652.method3758(arg1.field9400, arg1.field9354, class122.field1981.method1091(class135.field2206, 1), "", true, 57, false, false, 0L, arg1.field9380, -1);
        } else {
            class652.method3758(arg1.field9400, arg1.field9354, arg1.field9390, "", true, 57, false, false, 0L, arg1.field9380, -1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 160)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field482++;
        int var2 = this.method461(arg0, (byte) -34);
        if ((this.field493 & var2) == 0) {
            var2 = this.field493;
        }
        if ((var2 & 0x1) != 0) {
            this.method457(0, 3, arg0.getY(), arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method457(0, 5, arg0.getY(), arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method457(0, 4, arg0.getY(), arg0.getClickCount(), arg0.getX());
        }
        this.field493 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I", line = 189)
    public final int method451(int arg0) {
        if (arg0 != 1196) {
            this.field493 = -125;
        }
        field484++;
        return this.field479;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)I", line = 200)
    public static final int method452(int arg0) {
        field483++;
        if (arg0 != 2) {
            method449(-109, -55);
        }
        if (class476.field7061 == null) {
            return class129.field2120 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 217)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method455(3723, arg0.getX(), arg0.getY());
        field472++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 230)
    private final void method453(Component arg0, int arg1) {
        if (arg1 != 8) {
            method449(63, -18);
        }
        this.method456(arg1 + 108);
        field490++;
        this.field497 = arg0;
        this.field497.addMouseListener(this);
        this.field497.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)I", line = 248)
    public final int method454(int arg0) {
        field476++;
        int var2 = -85 % ((6 - arg0) / 36);
        return this.field468;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 258)
    private final void method455(int arg0, int arg1, int arg2) {
        this.field492 = arg1;
        if (arg0 != 3723) {
            this.field497 = null;
        }
        this.field494 = arg2;
        field485++;
        if (this.field496) {
            this.method457(0, -1, arg2, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)V", line = 277)
    private final void method456(int arg0) {
        field469++;
        int var2 = 82 % ((arg0 - 23) / 44);
        if (this.field497 == null) {
            return;
        }
        this.field497.removeMouseMotionListener(this);
        this.field497.removeMouseListener(this);
        this.field497 = null;
        this.field492 = this.field494 = this.field493 = 0;
        this.field479 = this.field468 = this.field489 = 0;
        this.field475 = null;
        this.field495 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V", line = 300)
    private final void method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field470++;
        class405 var6 = new class405();
        var6.field6247 = arg4;
        var6.field6244 = arg1;
        if (arg0 != 0) {
            this.method448((byte) 45);
        }
        var6.field6242 = arg2;
        var6.field6254 = arg3;
        var6.field6249 = class112.method1033(arg0 - 11752);
        this.field495.method3463((byte) -87, var6);
    }

    @OriginalMember(owner = "client!ud", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 318)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method455(3723, arg0.getX(), arg0.getY());
        field481++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 326)
    public final void method458(int arg0) {
        if (arg0 == -1846698589) {
            field486++;
            this.method456(arg0 + 1846698487);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Z", line = 337)
    public final boolean method459(int arg0) {
        field474++;
        if (arg0 < 93) {
            this.field492 = -128;
        }
        return (this.field489 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z", line = 349)
    public final boolean method460(byte arg0) {
        int var2 = -59 % ((-arg0 - 56) / 41);
        field488++;
        return (this.field489 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 360)
    private final int method461(MouseEvent arg0, byte arg1) {
        if (arg1 != -34) {
            return 77;
        }
        field467++;
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

    @OriginalMember(owner = "client!ud", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 397)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field473++;
        this.method455(3723, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ud", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 405)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field471++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Z", line = 420)
    public final boolean method462(int arg0) {
        field466++;
        int var2 = -80 / ((arg0 - 54) / 58);
        return (this.field489 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 444)
    public class33(Component arg0, boolean arg1) {
        this.method453(arg0, 8);
        this.field496 = arg1;
    }
}
