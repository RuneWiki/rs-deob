import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class276 extends class218 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lub;")
    private class18 field3475 = new class18();

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Lub;")
    private class18 field3493 = new class18();

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Z")
    private boolean field3495;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Lkg;")
    public static class179 field3474 = new class179(27, -1);

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Lkg;")
    public static class179 field3484 = new class179(63, 3);

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[I")
    public static int[] field3489 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    private int field3468;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field3490;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    private int field3494;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "Ljava/awt/Component;")
    private Component field3496;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
    public final boolean method1334(int arg0) {
        field3467++;
        if (arg0 != 5) {
            this.field3468 = -10;
        }
        return (this.field3468 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!df", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3462++;
        this.method1627((byte) 90, arg0);
    }

    @OriginalMember(owner = "client!df", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3466++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public final void method1343(byte arg0) {
        this.method1626(1);
        field3480++;
        if (arg0 < 22) {
            this.method1335(92);
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
    private final void method1626(int arg0) {
        field3473++;
        if (this.field3496 == null) {
            return;
        }
        this.field3496.removeMouseListener(this);
        this.field3496.removeMouseMotionListener(this);
        this.field3496 = null;
        this.field3492 = this.field3490 = this.field3494 = 0;
        this.field3493 = null;
        this.field3475 = null;
        if (arg0 != 1) {
            this.mousePressed(null);
        }
        this.field3477 = this.field3483 = this.field3468 = 0;
    }

    @OriginalMember(owner = "client!df", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3463++;
        int var2 = this.method1632(0, arg0);
        if (var2 == 1) {
            this.method1633(arg0.getX(), -31968, 0, arg0.getY());
        } else if (var2 == 4) {
            this.method1633(arg0.getX(), -31968, 2, arg0.getY());
        } else if (var2 == 2) {
            this.method1633(arg0.getX(), -31968, 1, arg0.getY());
        }
        this.field3494 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!df", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3460++;
        this.field3490 = -1;
        this.field3492 = -1;
    }

    @OriginalMember(owner = "client!df", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3464++;
        this.method1627((byte) 90, arg0);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
    public final int method1337(int arg0) {
        field3482++;
        if (arg0 != 69) {
            this.method1335(66);
        }
        return this.field3483;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
    private final void method1627(byte arg0, MouseEvent arg1) {
        field3469++;
        this.field3492 = arg1.getX();
        if (arg0 != 90) {
            field3487 = -14;
        }
        this.field3490 = arg1.getY();
        if (this.field3495) {
            this.method1633(arg1.getX(), arg0 - 32058, -1, arg1.getY());
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    public static void method1628(byte arg0) {
        if (arg0 != 33) {
            field3489 = null;
        }
        field3474 = null;
        field3489 = null;
        field3484 = null;
    }

    @OriginalMember(owner = "client!df", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3461++;
        int var2 = this.method1632(0, arg0);
        if ((this.field3494 & var2) == 0) {
            var2 = this.field3494;
        }
        if ((var2 & 0x1) != 0) {
            this.method1633(arg0.getX(), -31968, 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method1633(arg0.getX(), -31968, 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method1633(arg0.getX(), -31968, 4, arg0.getY());
        }
        this.field3494 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public final synchronized void method1340(byte arg0) {
        this.field3483 = this.field3490;
        this.field3468 = this.field3494;
        this.field3477 = this.field3492;
        field3470++;
        class18 var2 = this.field3475;
        this.field3475 = this.field3493;
        this.field3493 = var2;
        this.field3493.method154(7491);
        int var3 = -7 / ((49 - arg0) / 41);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhd;I)V")
    public static final void method1629(class523 arg0, int arg1) {
        field3471++;
        if (arg1 == -1 && arg0.field7632 == 5 && arg0.field7567 != -1) {
            class362.method2079(class33.field416, arg0, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Z")
    public final boolean method1335(int arg0) {
        int var2 = -61 / ((arg0 + 70) / 52);
        field3486++;
        return (this.field3468 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)I")
    public static final int method1630(int arg0, boolean arg1) {
        if (!arg1) {
            field3487 = 94;
        }
        field3485++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1631(int arg0, Component arg1) {
        if (arg0 != 0) {
            field3487 = 123;
        }
        field3478++;
        this.method1626(1);
        this.field3496 = arg1;
        this.field3496.addMouseListener(this);
        this.field3496.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!df", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3476++;
        this.method1627((byte) 90, arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public final int method1333(int arg0) {
        field3479++;
        if (arg0 != 7) {
            this.field3493 = null;
        }
        return this.field3477;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Z")
    public final boolean method1336(int arg0) {
        field3481++;
        if (arg0 != 7) {
            method1628((byte) 77);
        }
        return (this.field3468 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method1632(int arg0, MouseEvent arg1) {
        field3491++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != arg0;
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
    private final void method1633(int arg0, int arg1, int arg2, int arg3) {
        field3465++;
        class379 var5 = new class379();
        var5.field4987 = arg0;
        var5.field4995 = arg2;
        var5.field4980 = arg3;
        if (arg1 != -31968) {
            this.field3494 = 122;
        }
        var5.field4981 = class504.method3034((byte) -114);
        this.field3493.method163(var5, 0);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Lic;")
    public final class494 method1341(int arg0) {
        field3472++;
        if (arg0 <= 56) {
            field3489 = null;
        }
        return (class494) this.field3475.method158(-24557);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public static final int method1634(int arg0, int arg1) {
        int var2 = -24 % ((-arg1 - 37) / 34);
        field3458++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class276(Component arg0, boolean arg1) {
        this.method1631(0, arg0);
        this.field3495 = arg1;
    }
}
