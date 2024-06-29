import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class450 extends class91 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "Lkn;")
    private class442 field6438 = new class442();

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "Lkn;")
    private class442 field6454 = new class442();

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "Z")
    private boolean field6460;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field6434 = 0;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field6440 = 0;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "Lub;")
    public static class15 field6447 = new class15(8);

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "Z")
    public static boolean field6455 = false;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "[I")
    public static int[] field6453 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    private int field6422;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    private int field6424;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    private int field6457;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    private int field6458;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "Ljava/awt/Component;")
    private Component field6459;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "[I")
    public static int[] field6456;

    @OriginalMember(owner = "client!lr", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2799(87, arg0);
        field6433++;
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)Z", line = 11)
    public final boolean method542(int arg0) {
        field6428++;
        if (arg0 != 7) {
            this.method537(-54);
        }
        return (this.field6443 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lr", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 22)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2799(66, arg0);
        field6437++;
    }

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "(I)Z", line = 32)
    public final boolean method546(int arg0) {
        if (arg0 == 2) {
            field6425++;
            return (this.field6443 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 46)
    public final void method533(int arg0) {
        this.method2801(arg0 - 44);
        if (arg0 != 3) {
            field6447 = null;
        }
        field6442++;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V", line = 58)
    public final synchronized void method535(int arg0) {
        this.field6443 = this.field6457;
        this.field6424 = this.field6458;
        this.field6422 = this.field6452;
        if (arg0 != -28461) {
            return;
        }
        field6448++;
        class442 var2 = this.field6438;
        this.field6438 = this.field6454;
        this.field6454 = var2;
        this.field6454.method2755(0);
    }

    @OriginalMember(owner = "client!lr", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 84)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2799(-118, arg0);
        field6449++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZII)V", line = 92)
    public static final void method2798(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6429++;
        class276 var5 = class264.method1816((byte) -128, arg4, 4);
        var5.method1876((byte) -125);
        var5.field3986 = arg3;
        if (arg2) {
            field6434 = 15;
        }
        var5.field3985 = arg1;
        var5.field3984 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)Z", line = 109)
    public final boolean method537(int arg0) {
        int var2 = -121 % ((-arg0 - 36) / 58);
        field6427++;
        return (this.field6443 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!lr", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 119)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6423++;
        this.field6457 |= arg0.getModifiers();
        byte var2 = -1;
        if ((arg0.getModifiers() & 0x8) != 0) {
            var2 = 1;
        } else if ((arg0.getModifiers() & 0x4) != 0) {
            var2 = 2;
        } else if ((arg0.getModifiers() & 0x10) != 0) {
            var2 = 0;
        }
        if (var2 != -1) {
            this.method2806(var2, arg0.getX(), 123, arg0.getY());
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lr", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 150)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field6458 = -1;
        this.field6452 = -1;
        field6441++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 163)
    private final void method2799(int arg0, MouseEvent arg1) {
        this.field6452 = arg1.getX();
        field6426++;
        int var3 = -71 / ((arg0 - 9) / 50);
        this.field6458 = arg1.getY();
        if (this.field6460) {
            this.method2806(-1, arg1.getX(), -113, arg1.getY());
        }
    }

    @OriginalMember(owner = "client!lr", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 182)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6439++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)I", line = 194)
    public static final int method2800(int arg0, int arg1, int arg2) {
        field6446++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + arg2) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FEF9C0) >> 19;
    }

    @OriginalMember(owner = "client!lr", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 208)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6435++;
        this.field6457 &= ~arg0.getModifiers();
        byte var2 = -1;
        if ((arg0.getModifiers() & 0x8) != 0) {
            var2 = 4;
        } else if ((arg0.getModifiers() & 0x4) != 0) {
            var2 = 5;
        } else if ((arg0.getModifiers() & 0x10) != 0) {
            var2 = 3;
        }
        if (var2 != -1) {
            this.method2806(var2, arg0.getX(), -67, arg0.getY());
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "(I)V", line = 239)
    private final void method2801(int arg0) {
        field6436++;
        if (this.field6459 == null) {
            return;
        }
        this.field6459.removeMouseListener(this);
        this.field6459.removeMouseMotionListener(this);
        this.field6452 = this.field6458 = this.field6457 = 0;
        this.field6459 = null;
        this.field6422 = this.field6424 = this.field6443 = 0;
        this.field6454 = null;
        if (arg0 > -11) {
            this.field6422 = 9;
        }
        this.field6438 = null;
    }

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)I", line = 263)
    public final int method543(int arg0) {
        field6431++;
        if (arg0 != 7) {
            field6440 = 116;
        }
        return this.field6424;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)I", line = 276)
    public final int method536(int arg0) {
        field6430++;
        return arg0 == 0 ? this.field6422 : 52;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)Lmh;", line = 292)
    public final class378 method539(int arg0) {
        field6432++;
        if (arg0 != -6346) {
            field6447 = null;
        }
        return (class378) this.field6438.method2748(-112);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 307)
    public static final Object method2802(byte[] arg0, boolean arg1, int arg2) {
        field6450++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != 0) {
            field6440 = 92;
        }
        if (arg0.length > 136 && !class289.field4211) {
            try {
                class119 var3 = (class119) Class.forName("ho").getDeclaredConstructor().newInstance();
                var3.method481(78, arg0);
                return var3;
            } catch (Throwable var4) {
                class289.field4211 = true;
            }
        }
        return arg1 ? class229.method1593(arg0, (byte) -28) : arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLkb;)V", line = 340)
    public static final void method2803(byte arg0, class412 arg1) {
        if (arg0 >= -118) {
            field6440 = -24;
        }
        if (arg1.field5900 != null) {
            arg1.field5900.field4021 = 0;
        }
        arg1.field5901 = false;
        field6451++;
        for (class412 var2 = arg1.method725(); var2 != null; var2 = arg1.method727()) {
            method2803((byte) -124, var2);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 362)
    private final void method2804(Component arg0, boolean arg1) {
        this.method2801(-68);
        field6445++;
        if (!arg1) {
            this.method542(26);
        }
        this.field6459 = arg0;
        this.field6459.addMouseListener(this);
        this.field6459.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "(I)V", line = 376)
    public static void method2805(int arg0) {
        int var1 = -1 / ((arg0 + 36) / 54);
        field6447 = null;
        field6456 = null;
        field6453 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V", line = 392)
    private final void method2806(int arg0, int arg1, int arg2, int arg3) {
        field6444++;
        class80 var5 = new class80();
        var5.field1042 = arg0;
        var5.field1043 = arg1;
        var5.field1036 = arg3;
        var5.field1040 = class18.method107(-16145);
        int var6 = 66 % ((26 - arg2) / 61);
        this.field6454.method2756(48, var5);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 436)
    public class450(Component arg0, boolean arg1) {
        this.method2804(arg0, true);
        this.field6460 = arg1;
    }
}
