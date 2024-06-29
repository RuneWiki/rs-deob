import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 extends class14 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Lsu;")
    private class192 field435 = new class192();

    @OriginalMember(owner = "client!be", name = "L", descriptor = "Lsu;")
    private class192 field446 = new class192();

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Z")
    private boolean field447;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
    public static int[] field420 = new int[1];

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field448;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[I")
    public static int[] field433;

    @OriginalMember(owner = "client!be", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field418++;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Z")
    public final boolean method71(int arg0) {
        if (arg0 < 101) {
            return false;
        } else {
            field419++;
            return (this.field421 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field441++;
        this.method166(119, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Lqea;")
    public final class113 method72(int arg0) {
        field430++;
        return arg0 == -49 ? (class113) this.field435.method1272(0) : null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Z")
    public final boolean method65(byte arg0) {
        if (arg0 < 2) {
            this.method65((byte) -112);
        }
        field434++;
        return (this.field421 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
    public static final void method161(int arg0, byte arg1) {
        if (class86.field1181 == 1) {
            class678.field9556 = arg0;
        } else if (class86.field1181 == 2 || class86.field1181 == 3) {
            class448.field6268 = arg0;
        }
        if (arg1 != -82) {
            field422 = 115;
        }
        field426++;
    }

    @OriginalMember(owner = "client!be", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field428++;
        int var2 = this.method167(arg0, -80);
        if ((var2 & this.field443) == 0) {
            var2 = this.field443;
        }
        if ((var2 & 0x1) != 0) {
            this.method165((byte) -63, arg0.getY(), arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method165((byte) -26, arg0.getY(), arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method165((byte) -123, arg0.getY(), arg0.getX(), 4);
        }
        this.field443 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field425++;
        this.method166(61, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!be", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field439++;
        int var2 = this.method167(arg0, -85);
        if (var2 == 1) {
            this.method165((byte) -68, arg0.getY(), arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method165((byte) -74, arg0.getY(), arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method165((byte) -99, arg0.getY(), arg0.getX(), 1);
        }
        this.field443 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        field442++;
        return arg0 == 74 ? this.field429 : 120;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method162(byte arg0, Component arg1) {
        if (arg0 != -33) {
            this.method167(null, 41);
        }
        this.method164((byte) 127);
        field440++;
        this.field448 = arg1;
        this.field448.addMouseListener(this);
        this.field448.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
    public static void method163(byte arg0) {
        field420 = null;
        if (arg0 != -77) {
            method163((byte) 124);
        }
        field433 = null;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
    public final int method70(byte arg0) {
        field415++;
        int var2 = -89 / ((37 - arg0) / 45);
        return this.field436;
    }

    @OriginalMember(owner = "client!be", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method166(40, arg0.getX(), arg0.getY());
        field423++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
    public final boolean method63(byte arg0) {
        int var2 = 50 / ((68 - arg0) / 55);
        field416++;
        return (this.field421 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(B)V")
    private final void method164(byte arg0) {
        field437++;
        if (this.field448 == null) {
            return;
        }
        this.field448.removeMouseMotionListener(this);
        this.field448.removeMouseListener(this);
        this.field435 = null;
        this.field446 = null;
        this.field448 = null;
        if (arg0 >= 105) {
            this.field436 = this.field429 = this.field421 = 0;
            this.field444 = this.field445 = this.field443 = 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public final synchronized void method62(int arg0) {
        int var2 = -45 / ((arg0 + 32) / 51);
        this.field421 = this.field443;
        field427++;
        this.field436 = this.field444;
        this.field429 = this.field445;
        class192 var3 = this.field435;
        this.field435 = this.field446;
        this.field446 = var3;
        this.field446.method1269((byte) 127);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BIII)V")
    private final void method165(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -19) {
            return;
        }
        field424++;
        class263 var5 = new class263();
        var5.field3725 = arg1;
        var5.field3724 = arg2;
        var5.field3726 = arg3;
        var5.field3727 = class680.method3756(-39);
        this.field446.method1273(var5, (byte) 122);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public final void method73(byte arg0) {
        this.method164((byte) 119);
        field417++;
        if (arg0 != -25) {
            this.mousePressed(null);
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field432++;
        this.method166(92, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    private final void method166(int arg0, int arg1, int arg2) {
        this.field445 = arg2;
        if (arg0 <= 17) {
            this.method166(-106, -76, 34);
        }
        field438++;
        this.field444 = arg1;
        if (this.field447) {
            this.method165((byte) -106, arg2, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method167(MouseEvent arg0, int arg1) {
        field431++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        int var7 = 58 / ((arg1 - 2) / 40);
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

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class35(Component arg0, boolean arg1) {
        this.method162((byte) -33, arg0);
        this.field447 = arg1;
    }
}
