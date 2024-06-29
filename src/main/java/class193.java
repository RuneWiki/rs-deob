import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class193 extends class540 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lae;")
    private class40 field2399 = new class40();

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lae;")
    private class40 field2427 = new class40();

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Z")
    private boolean field2432;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lpk;")
    public static class104 field2404 = new class104("WTRC", 1);

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    private int field2421;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lpl;")
    public static class612 field2408;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field2433;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Z")
    public static boolean field2412;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V", line = 6)
    public static void method1162(byte arg0) {
        field2404 = null;
        field2408 = null;
        if (arg0 < 107) {
            field2412 = true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lew;", line = 18)
    public final class368 method942(boolean arg0) {
        field2402++;
        return arg0 ? (class368) this.field2399.method244(true) : null;
    }

    @OriginalMember(owner = "client!ia", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 31)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1165(arg0.getX(), arg0.getY(), -84);
        field2400++;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)Z", line = 42)
    public final boolean method945(int arg0) {
        field2407++;
        if (arg0 == -30249) {
            return (this.field2405 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 54)
    public final void method950(byte arg0) {
        this.method1166((byte) -47);
        if (arg0 == 118) {
            field2396++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 65)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2397++;
        int var2 = this.method1170(arg0, (byte) 85);
        if ((var2 & this.field2429) == 0) {
            var2 = this.field2429;
        }
        if ((var2 & 0x1) != 0) {
            this.method1164(arg0.getY(), (byte) 102, 3, arg0.getX(), arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method1164(arg0.getY(), (byte) 118, 5, arg0.getX(), arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method1164(arg0.getY(), (byte) 109, 4, arg0.getX(), arg0.getClickCount());
        }
        this.field2429 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 99)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1165(arg0.getX(), arg0.getY(), -81);
        field2398++;
    }

    @OriginalMember(owner = "client!ia", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 107)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1165(arg0.getX(), arg0.getY(), -109);
        field2424++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I", line = 117)
    public final int method941(int arg0) {
        if (arg0 <= 90) {
            this.method1169(null, -115);
        }
        field2401++;
        return this.field2419;
    }

    @OriginalMember(owner = "client!ia", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 129)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2422++;
        int var2 = this.method1170(arg0, (byte) 122);
        if (var2 == 1) {
            this.method1164(arg0.getY(), (byte) 106, 0, arg0.getX(), arg0.getClickCount());
        } else if (var2 == 4) {
            this.method1164(arg0.getY(), (byte) 67, 2, arg0.getX(), arg0.getClickCount());
        } else if (var2 == 2) {
            this.method1164(arg0.getY(), (byte) 122, 1, arg0.getX(), arg0.getClickCount());
        }
        this.field2429 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Lev;", line = 155)
    public static final class597 method1163(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1026;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V", line = 162)
    private final void method1164(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2425++;
        if (arg1 <= 51) {
            this.field2405 = 109;
        }
        class365 var6 = new class365();
        var6.field4644 = arg4;
        var6.field4645 = arg2;
        var6.field4647 = arg0;
        var6.field4640 = arg3;
        var6.field4634 = class571.method3150(98);
        this.field2427.method239(var6, (byte) 93);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V", line = 182)
    private final void method1165(int arg0, int arg1, int arg2) {
        if (arg2 >= -71) {
            return;
        }
        this.field2431 = arg1;
        field2417++;
        this.field2428 = arg0;
        if (this.field2432) {
            this.method1164(arg1, (byte) 67, -1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)V", line = 201)
    public final synchronized void method949(boolean arg0) {
        this.field2405 = this.field2429;
        field2411++;
        this.field2421 = this.field2428;
        this.field2419 = this.field2431;
        class40 var2 = this.field2399;
        this.field2399 = this.field2427;
        this.field2427 = var2;
        this.field2427.method247(2);
        if (arg0) {
            this.mouseEntered(null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 223)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2403++;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V", line = 235)
    private final void method1166(byte arg0) {
        field2415++;
        if (this.field2433 == null) {
            return;
        }
        this.field2433.removeMouseMotionListener(this);
        this.field2433.removeMouseListener(this);
        this.field2428 = this.field2431 = this.field2429 = 0;
        this.field2427 = null;
        this.field2421 = this.field2419 = this.field2405 = 0;
        this.field2433 = null;
        if (arg0 != -47) {
            this.method947(-55);
        }
        this.field2399 = null;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)I", line = 259)
    public static final int method1167(int arg0) {
        field2413++;
        if (class655.field9229 == null) {
            int var1 = -9 % ((arg0 + 63) / 46);
            return class195.field2454 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 276)
    public static final void method1168(int arg0, int arg1) {
        class330.field4217 = -1;
        class635.field8898 = arg0;
        field2418++;
        class330.field4217 = arg1;
        class28.method189(arg1 - 2487);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)I", line = 289)
    public final int method944(int arg0) {
        if (arg0 != 2000) {
            this.mouseEntered(null);
        }
        field2409++;
        return this.field2421;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Z", line = 301)
    public final boolean method947(int arg0) {
        field2420++;
        if (arg0 == 2000) {
            return (this.field2405 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 314)
    private final void method1169(Component arg0, int arg1) {
        this.method1166((byte) -47);
        field2410++;
        this.field2433 = arg0;
        this.field2433.addMouseListener(this);
        this.field2433.addMouseMotionListener(this);
        if (arg1 >= -36) {
            this.method941(3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)Z", line = 329)
    public final boolean method943(int arg0) {
        if (arg0 != 2000) {
            this.method1166((byte) -18);
        }
        field2414++;
        return (this.field2405 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 341)
    private final int method1170(MouseEvent arg0, byte arg1) {
        field2416++;
        int var3 = arg0.getModifiers();
        if (arg1 < 58) {
            return -61;
        }
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

    @OriginalMember(owner = "client!ia", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 380)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2423++;
        this.method1165(arg0.getX(), arg0.getY(), -86);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;)V", line = 388)
    public static final void method1171(int arg0, String arg1) {
        if (class329.field4194 == null) {
            class507.method2737(80);
        }
        field2406++;
        class500.field6597.setTime(new Date(class571.method3150(118)));
        if (arg0 != 4) {
            method1168(-100, -116);
        }
        int var2 = class500.field6597.get(11);
        int var3 = class500.field6597.get(12);
        int var4 = class500.field6597.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class475.method2512(-116, arg1, '\n');
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class542.field7250; var8 > 0; var8--) {
                class329.field4194[var8] = class329.field4194[var8 - 1];
            }
            class329.field4194[0] = var5 + ": " + var6[var7];
            if (class542.field7250 < (class329.field4194.length - 1)) {
                if (class684.field9604 > 0) {
                    class684.field9604++;
                }
                class542.field7250++;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 454)
    public class193(Component arg0, boolean arg1) {
        this.method1169(arg0, -96);
        this.field2432 = arg1;
    }
}
