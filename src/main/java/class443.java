import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class443 extends class188 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lam;")
    private class455 field6191 = new class455();

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Lam;")
    private class455 field6221 = new class455();

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
    private boolean field6227;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Lkn;")
    public static class530 field6210 = new class530("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Ltn;")
    public static class60 field6219 = new class60(15, 2);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field6226 = 0;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lvo;")
    public static class32 field6224 = new class32("", 14);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private int field6203;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    private int field6215;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    private int field6218;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    private int field6222;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    private int field6223;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field6225;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2594(Component arg0, int arg1) {
        this.method2601(-2);
        field6192++;
        this.field6225 = arg0;
        this.field6225.addMouseListener(this);
        this.field6225.addMouseMotionListener(this);
        int var3 = 77 / ((61 - arg1) / 41);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2595(int arg0, MouseEvent arg1) {
        field6190++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (arg0 & var3) != 0;
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

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Z")
    public final boolean method1197(byte arg0) {
        field6206++;
        int var2 = 67 / ((-arg0 - 53) / 59);
        return (this.field6215 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6214++;
        int var2 = this.method2595(4, arg0);
        if (var2 == 1) {
            this.method2603(0, arg0.getX(), (byte) 62, arg0.getY());
        } else if (var2 == 4) {
            this.method2603(2, arg0.getX(), (byte) 62, arg0.getY());
        } else if (var2 == 2) {
            this.method2603(1, arg0.getX(), (byte) 62, arg0.getY());
        }
        this.field6223 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6198++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
    public static void method2596(byte arg0) {
        field6210 = null;
        field6224 = null;
        if (arg0 < 110) {
            field6226 = 9;
        }
        field6219 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLev;Lev;)V")
    public static final void method2597(byte arg0, class498 arg1, class498 arg2) {
        field6195++;
        if (arg1.field7056 != null) {
            arg1.method2891(121);
        }
        arg1.field7056 = arg2.field7056;
        arg1.field7055 = arg2;
        arg1.field7056.field7055 = arg1;
        if (arg0 < 0) {
            method2596((byte) 56);
        }
        arg1.field7055.field7056 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2598(arg0, -100);
        field6217++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I")
    public final int method1192(boolean arg0) {
        if (!arg0) {
            this.field6227 = true;
        }
        field6197++;
        return this.field6211;
    }

    @OriginalMember(owner = "client!wa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field6202++;
        this.method2598(arg0, -78);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Lke;")
    public final class432 method1196(int arg0) {
        field6208++;
        if (arg0 != 100) {
            this.mouseEntered(null);
        }
        return (class432) this.field6191.method2654(-1);
    }

    @OriginalMember(owner = "client!wa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2598(arg0, -121);
        field6188++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
    private final void method2598(MouseEvent arg0, int arg1) {
        this.field6218 = arg0.getX();
        field6189++;
        this.field6222 = arg0.getY();
        if (arg1 > -29) {
            this.method1199(-35);
        }
        if (this.field6227) {
            this.method2603(-1, arg0.getX(), (byte) 62, arg0.getY());
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BZ)Z")
    public static final boolean method2599(byte arg0, boolean arg1) {
        field6216++;
        int var2 = 100 % ((arg0 - 10) / 56);
        boolean var3 = class385.field5414.method327();
        if (arg1 == var3) {
            return true;
        }
        if (!arg1) {
            class385.field5414.method292();
        } else if (!class385.field5414.method372()) {
            arg1 = false;
        }
        if (arg1 == var3) {
            return false;
        } else {
            class4.field81.field1416 = arg1;
            class4.field81.method1784((byte) 124, class268.field3914);
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)I")
    public static final int method2600(int arg0, byte arg1, int arg2) {
        field6194++;
        int var3 = class204.method1307(arg0 - 1, arg2 + -1, (byte) -108) - (-class204.method1307(arg0 - 1, arg2 + 1, (byte) -56) - class204.method1307(arg0 + 1, arg2 + -1, (byte) -119) - class204.method1307(arg0 - -1, arg2 + 1, (byte) -115));
        int var4 = class204.method1307(arg0, arg2 - 1, (byte) -50) + class204.method1307(arg0, arg2 + 1, (byte) -42) + (class204.method1307(arg0 + -1, arg2, (byte) -60) - -class204.method1307(arg0 + 1, arg2, (byte) -89));
        if (arg1 <= 32) {
            field6210 = null;
        }
        int var5 = class204.method1307(arg0, arg2, (byte) -118);
        return var3 / 16 - (-(var4 / 8) - (var5 / 4));
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    private final void method2601(int arg0) {
        field6213++;
        if (this.field6225 == null) {
            return;
        }
        this.field6225.removeMouseMotionListener(this);
        this.field6225.removeMouseListener(this);
        this.field6218 = this.field6222 = this.field6223 = 0;
        this.field6211 = this.field6203 = this.field6215 = 0;
        this.field6221 = null;
        if (arg0 != -2) {
            this.field6223 = -38;
        }
        this.field6191 = null;
        this.field6225 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public final void method1193(byte arg0) {
        if (arg0 == -7) {
            this.method2601(arg0 ^ 0x7);
            field6201++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
    public final int method1194(int arg0) {
        if (arg0 != 36) {
            this.field6227 = true;
        }
        field6200++;
        return this.field6203;
    }

    @OriginalMember(owner = "client!wa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6199++;
        int var2 = this.method2595(4, arg0);
        if ((var2 & this.field6223) == 0) {
            var2 = this.field6223;
        }
        if ((var2 & 0x1) != 0) {
            this.method2603(3, arg0.getX(), (byte) 62, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2603(5, arg0.getX(), (byte) 62, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2603(4, arg0.getX(), (byte) 62, arg0.getY());
        }
        this.field6223 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public final synchronized void method1198(int arg0) {
        this.field6211 = this.field6218;
        this.field6215 = this.field6223;
        this.field6203 = this.field6222;
        field6212++;
        class455 var2 = this.field6191;
        this.field6191 = this.field6221;
        this.field6221 = var2;
        if (arg0 != 3544) {
            this.method1193((byte) 77);
        }
        this.field6221.method2656(58);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lnt;Ljava/lang/String;ZIZ)V")
    public static final void method2602(class151 arg0, String arg1, boolean arg2, int arg3, boolean arg4) {
        field6204++;
        if (arg2) {
            if (class151.field2159.startsWith("win") && class151.field2158 != 3) {
                String var5 = null;
                if (arg0.field2165 != null) {
                    var5 = arg0.field2165.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class370 var6 = class4.method33(0, arg0, arg1, true);
                    class113.field1533 = arg0;
                    class96.field1244 = arg1;
                    class462.field6458 = var6;
                    return;
                }
            }
            if (class151.field2159.startsWith("mac")) {
                String var7 = null;
                if (arg0.field2165 != null) {
                    var7 = arg0.field2165.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg4) {
                    class4.method33(1, arg0, arg1, true);
                    return;
                }
            }
            class4.method33(2, arg0, arg1, true);
        } else {
            class4.method33(3, arg0, arg1, true);
        }
        if (arg3 != 0) {
            field6220 = -104;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)Z")
    public final boolean method1201(byte arg0) {
        if (arg0 != -85) {
            this.field6211 = 53;
        }
        field6193++;
        return (this.field6215 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBI)V")
    private final void method2603(int arg0, int arg1, byte arg2, int arg3) {
        field6205++;
        class424 var5 = new class424();
        var5.field5973 = arg1;
        var5.field5971 = arg0;
        var5.field5974 = arg3;
        var5.field5972 = class465.method2699((byte) 14);
        this.field6221.method2657(8492, var5);
        if (arg2 != 62) {
            this.method2594(null, -118);
        }
    }

    @OriginalMember(owner = "client!wa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field6222 = -1;
        field6196++;
        this.field6218 = -1;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Z")
    public final boolean method1199(int arg0) {
        field6207++;
        if (arg0 != 14795) {
            this.method1201((byte) -110);
        }
        return (this.field6215 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class443(Component arg0, boolean arg1) {
        this.method2594(arg0, -118);
        this.field6227 = arg1;
    }
}
