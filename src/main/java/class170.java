import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class170 extends class8 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Lwo;")
    private class522 field2422 = new class522();

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Lwo;")
    private class522 field2430 = new class522();

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
    private boolean field2440;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "[I")
    public static int[] field2417 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Llh;")
    public static class365 field2403 = new class365(1);

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field2436;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    private int field2437;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field2439;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 7)
    private final void method1048(Component arg0, int arg1) {
        this.method1053((byte) 107);
        field2424++;
        this.field2439 = arg0;
        this.field2439.addMouseListener(this);
        if (arg1 == 36071) {
            this.field2439.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z", line = 23)
    public final boolean method52(int arg0) {
        if (arg0 != 0) {
            this.field2429 = -14;
        }
        field2410++;
        return (this.field2405 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Z", line = 34)
    public static final boolean method1049(int arg0, int arg1) {
        field2435++;
        class320 var2 = class210.method1272(arg1, (byte) -26);
        if (var2 == null) {
            return false;
        } else if (class397.field5519 == 3) {
            String var3 = "";
            if (class528.field7773 != class175.field2498) {
                var3 = ":" + (var2.field4428 + 7000);
            }
            String var4 = "";
            if (class41.field561 != null) {
                var4 = "/p=" + class41.field561;
            }
            String var5 = "http://" + var2.field4427 + var3 + "/l=" + class105.field1434 + "/a=" + class246.field3426 + var4 + "/j" + (class205.field2911 ? "1" : "0") + ",o" + (class44.field603 ? "1" : "0") + ",a2";
            try {
                if (arg0 != 16816) {
                    method1051(true, -19);
                }
                class407.field5639.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class223.field3140 = var2.field4428;
            class54.field751 = var2.field4427;
            if (class528.field7773 != class175.field2498) {
                class33.field472 = class223.field3140 + 40000;
                class325.field4460 = class223.field3140 + 50000;
                class85.field1172 = class33.field472;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 83)
    public final void method44(int arg0) {
        field2404++;
        this.method1053((byte) 115);
        int var2 = -109 % ((arg0 - 30) / 32);
    }

    @OriginalMember(owner = "client!uk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 93)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2428++;
        this.method1055(120, arg0);
    }

    @OriginalMember(owner = "client!uk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field2434++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lss;B)V", line = 112)
    public static final void method1050(class295 arg0, byte arg1) {
        field2412++;
        class295 var2 = class282.method1617(false, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class177.field2513;
            var3 = class351.field4795;
        } else {
            var3 = var2.field3960;
            var4 = var2.field4022;
        }
        class138.method893(var3, false, arg0, false, var4);
        class407.method2352(var4, var3, 0, arg0);
        int var5 = -21 % ((30 - arg1) / 35);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)I", line = 138)
    public final int method55(byte arg0) {
        if (arg0 >= -28) {
            this.method52(69);
        }
        field2418++;
        return this.field2423;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z", line = 150)
    public final boolean method45(byte arg0) {
        field2414++;
        if (arg0 != -49) {
            this.mouseClicked(null);
        }
        return (this.field2405 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V", line = 163)
    public static final void method1051(boolean arg0, int arg1) {
        if (!arg0) {
            field2417 = null;
        }
        field2427++;
        class163 var2 = class271.method1546(arg1, 10, arg0);
        var2.method1010(1504);
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V", line = 177)
    public static void method1052(int arg0) {
        if (arg0 != 5) {
            method1051(false, -73);
        }
        field2403 = null;
        field2417 = null;
    }

    @OriginalMember(owner = "client!uk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 193)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1055(-116, arg0);
        field2408++;
    }

    @OriginalMember(owner = "client!uk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 201)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2425++;
        int var2 = this.method1057(16, arg0);
        if (var2 == 1) {
            this.method1058(arg0.getX(), arg0.getY(), -6131, 0);
        } else if (var2 == 4) {
            this.method1058(arg0.getX(), arg0.getY(), -6131, 2);
        } else if (var2 == 2) {
            this.method1058(arg0.getX(), arg0.getY(), -6131, 1);
        }
        this.field2437 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V", line = 227)
    private final void method1053(byte arg0) {
        field2438++;
        if (this.field2439 == null) {
            return;
        }
        this.field2439.removeMouseListener(this);
        this.field2439.removeMouseMotionListener(this);
        if (arg0 < 87) {
            return;
        }
        this.field2429 = this.field2436 = this.field2437 = 0;
        this.field2430 = null;
        this.field2416 = this.field2423 = this.field2405 = 0;
        this.field2422 = null;
        this.field2439 = null;
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)I", line = 251)
    public final int method54(int arg0) {
        if (arg0 <= 31) {
            this.field2440 = false;
        }
        field2431++;
        return this.field2416;
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)Lgm;", line = 263)
    public static final class79 method1054(int arg0) {
        field2411++;
        if (arg0 != 4) {
            method1051(true, -75);
        }
        try {
            return (class79) Class.forName("pl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 289)
    private final void method1055(int arg0, MouseEvent arg1) {
        field2421++;
        this.field2429 = arg1.getX();
        this.field2436 = arg1.getY();
        int var3 = 88 / ((56 - arg0) / 46);
        if (this.field2440) {
            this.method1058(arg1.getX(), arg1.getY(), -6131, -1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Z", line = 307)
    public final boolean method46(int arg0) {
        if (arg0 != 0) {
            this.field2423 = -78;
        }
        field2409++;
        return (this.field2405 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 319)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2415++;
        this.method1055(124, arg0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIB)V", line = 330)
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2407++;
        if (arg4 != 49) {
            method1050(null, (byte) -118);
        }
        for (int var5 = 0; var5 < class196.field2829; var5++) {
            Rectangle var6 = class113.field1527[var5];
            if (arg3 < var6.x + var6.width && var6.x < arg0 + arg3 && var6.y + var6.height > arg2 && (arg1 + arg2) > var6.y) {
                class9.field83[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 354)
    public final synchronized void method53(int arg0) {
        field2433++;
        this.field2416 = this.field2429;
        this.field2423 = this.field2436;
        this.field2405 = this.field2437;
        class522 var2 = this.field2422;
        this.field2422 = this.field2430;
        int var3 = 31 / ((-arg0 - 3) / 45);
        this.field2430 = var2;
        this.field2430.method3076((byte) -89);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 503)
    public class170(Component arg0, boolean arg1) {
        this.method1048(arg0, 36071);
        this.field2440 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 380)
    private final int method1057(int arg0, MouseEvent arg1) {
        field2420++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & arg0) != 0;
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

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V", line = 419)
    private final void method1058(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -6131) {
            this.field2439 = null;
        }
        field2432++;
        class516 var5 = new class516();
        var5.field7571 = arg0;
        var5.field7567 = arg1;
        var5.field7576 = arg3;
        var5.field7564 = class333.method1850(-3562);
        this.field2430.method3070(var5, (byte) -120);
    }

    @OriginalMember(owner = "client!uk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 439)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field2429 = -1;
        field2413++;
        this.field2436 = -1;
    }

    @OriginalMember(owner = "client!uk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 450)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2419++;
        int var2 = this.method1057(16, arg0);
        if ((this.field2437 & var2) == 0) {
            var2 = this.field2437;
        }
        if ((var2 & 0x1) != 0) {
            this.method1058(arg0.getX(), arg0.getY(), -6131, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1058(arg0.getX(), arg0.getY(), -6131, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1058(arg0.getX(), arg0.getY(), -6131, 4);
        }
        this.field2437 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Llq;", line = 481)
    public final class386 method51(byte arg0) {
        field2426++;
        if (arg0 <= 114) {
            this.field2436 = 97;
        }
        return (class386) this.field2422.method3071((byte) -126);
    }
}
