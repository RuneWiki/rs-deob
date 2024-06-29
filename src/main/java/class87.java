import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class87 extends class268 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lko;")
    private class348 field1441 = new class348();

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Lko;")
    private class348 field1469 = new class348();

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Z")
    private boolean field1471;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Llh;")
    public static class364 field1449 = new class364(5);

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lvp;")
    public static class123 field1468 = new class123(74, 3);

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1472;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "F")
    public static float field1462;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lak;")
    public static class231 field1473;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field1470;

    static {
        new class180(" days.", " Tage.", " jours.", " dias.");
        field1472 = "";
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Llf;", line = 5)
    public final class157 method704(int arg0) {
        field1442++;
        if (arg0 <= 15) {
            this.method709(40);
        }
        return (class157) this.field1441.method2254(-8);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z", line = 20)
    public final boolean method705(int arg0) {
        field1438++;
        if (arg0 != -3129) {
            field1468 = null;
        }
        return (this.field1455 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 31)
    private final void method706(MouseEvent arg0, int arg1) {
        if (arg1 != -1) {
            this.field1464 = 101;
        }
        field1459++;
        this.field1466 = arg0.getX();
        this.field1465 = arg0.getY();
        if (this.field1471) {
            this.method710(arg0.getY(), -1, arg0.getX(), (byte) 71);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V", line = 50)
    public static void method707(boolean arg0) {
        if (arg0) {
            field1449 = null;
            field1473 = null;
            field1468 = null;
            field1472 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V", line = 66)
    public final synchronized void method708(int arg0) {
        this.field1443 = this.field1465;
        if (arg0 != 2) {
            this.method717((byte) 90);
        }
        field1458++;
        this.field1439 = this.field1466;
        this.field1455 = this.field1464;
        class348 var2 = this.field1441;
        this.field1441 = this.field1469;
        this.field1469 = var2;
        this.field1469.method2264(arg0 ^ 0x5C);
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 90)
    private final void method709(int arg0) {
        field1451++;
        if (this.field1470 == null) {
            return;
        }
        this.field1470.removeMouseListener(this);
        if (arg0 != 5) {
            this.method715(-1);
        }
        this.field1470.removeMouseMotionListener(this);
        this.field1469 = null;
        this.field1441 = null;
        this.field1466 = this.field1465 = this.field1464 = 0;
        this.field1439 = this.field1443 = this.field1455 = 0;
        this.field1470 = null;
    }

    @OriginalMember(owner = "client!mc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 115)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1463++;
        this.method706(arg0, -1);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIB)V", line = 123)
    private final void method710(int arg0, int arg1, int arg2, byte arg3) {
        field1445++;
        int var5 = 43 / ((arg3 + 1) / 62);
        class152 var6 = new class152();
        var6.field2327 = arg2;
        var6.field2331 = arg1;
        var6.field2333 = arg0;
        var6.field2332 = class464.method2773((byte) 103);
        this.field1469.method2270(0, var6);
    }

    @OriginalMember(owner = "client!mc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 141)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1467++;
        int var2 = this.method716(arg0, 0);
        if (var2 == 1) {
            this.method710(arg0.getY(), 0, arg0.getX(), (byte) 111);
        } else if (var2 == 4) {
            this.method710(arg0.getY(), 2, arg0.getX(), (byte) -69);
        } else if (var2 == 2) {
            this.method710(arg0.getY(), 1, arg0.getX(), (byte) -92);
        }
        this.field1464 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Z", line = 165)
    public final boolean method711(byte arg0) {
        field1450++;
        if (arg0 <= 124) {
            return false;
        } else {
            return (this.field1455 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 177)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1457++;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I", line = 191)
    public final int method712(int arg0) {
        field1461++;
        if (arg0 != -31039) {
            this.method706(null, 62);
        }
        return this.field1443;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I", line = 204)
    public final int method713(int arg0) {
        if (arg0 < 57) {
            this.field1465 = -57;
        }
        field1440++;
        return this.field1439;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 215)
    private final void method714(byte arg0, Component arg1) {
        if (arg0 < 77) {
            return;
        }
        this.method709(5);
        field1454++;
        this.field1470 = arg1;
        this.field1470.addMouseListener(this);
        this.field1470.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!mc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 232)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field1466 = -1;
        field1452++;
        this.field1465 = -1;
    }

    @OriginalMember(owner = "client!mc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 245)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1444++;
        int var2 = this.method716(arg0, 0);
        if ((this.field1464 & var2) == 0) {
            var2 = this.field1464;
        }
        if ((var2 & 0x1) != 0) {
            this.method710(arg0.getY(), 3, arg0.getX(), (byte) -90);
        }
        if ((var2 & 0x4) != 0) {
            this.method710(arg0.getY(), 5, arg0.getX(), (byte) 84);
        }
        if ((var2 & 0x2) != 0) {
            this.method710(arg0.getY(), 4, arg0.getX(), (byte) 110);
        }
        this.field1464 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 274)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method706(arg0, -1);
        field1448++;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 367)
    public class87(Component arg0, boolean arg1) {
        this.method714((byte) 100, arg0);
        this.field1471 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Z", line = 296)
    public final boolean method715(int arg0) {
        if (arg0 != 4) {
            this.mouseReleased(null);
        }
        field1446++;
        return (this.field1455 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 307)
    private final int method716(MouseEvent arg0, int arg1) {
        field1453++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != arg1;
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

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 341)
    public final void method717(byte arg0) {
        this.method709(5);
        int var2 = -63 / ((-arg0 - 23) / 62);
        field1447++;
    }

    @OriginalMember(owner = "client!mc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 352)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method706(arg0, -1);
        field1456++;
    }
}
