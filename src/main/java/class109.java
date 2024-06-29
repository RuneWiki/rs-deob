import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class109 extends class210 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Ltu;")
    private class7 field1495 = new class7();

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Ltu;")
    private class7 field1515 = new class7();

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Z")
    private boolean field1519;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lhb;")
    public static class250 field1501 = new class250(72, -1);

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
    public static int[] field1517 = new int[1];

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Lwt;")
    public static class16 field1514 = new class16(5000);

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field1518;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lab;")
    public final class228 method715(byte arg0) {
        int var2 = 55 % ((55 - arg0) / 33);
        field1496++;
        return (class228) this.field1495.method52((byte) -119);
    }

    @OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method725((byte) 79, arg0);
        field1509++;
    }

    @OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1488++;
        int var2 = this.method728(arg0, 86);
        if ((var2 & this.field1512) == 0) {
            var2 = this.field1512;
        }
        if ((var2 & 0x1) != 0) {
            this.method726(arg0.getX(), 3, (byte) -93, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method726(arg0.getX(), 5, (byte) -118, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method726(arg0.getX(), 4, (byte) -81, arg0.getY());
        }
        this.field1512 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1506++;
        this.method725((byte) 79, arg0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method716(String arg0, int arg1) {
        if (arg1 != 10) {
            field1501 = null;
        }
        field1511++;
        return class344.method2019(10, true, (byte) 52, arg0);
    }

    @OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field1498++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)I")
    public final int method717(byte arg0) {
        field1504++;
        return arg0 == 82 ? this.field1500 : -97;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)V")
    public final void method718(byte arg0) {
        if (arg0 != -111) {
            field1514 = null;
        }
        field1502++;
        this.method723(false);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V")
    public static void method719(byte arg0) {
        field1514 = null;
        field1501 = null;
        field1517 = null;
        int var1 = 85 % ((-arg0 - 11) / 52);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
    public final boolean method720(int arg0) {
        field1499++;
        int var2 = 79 / ((7 - arg0) / 42);
        return (this.field1510 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
    public final int method721(byte arg0) {
        field1490++;
        if (arg0 != 74) {
            this.method721((byte) 69);
        }
        return this.field1489;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method722(Component arg0, byte arg1) {
        if (arg1 != 78) {
            return;
        }
        field1493++;
        this.method723(false);
        this.field1518 = arg0;
        this.field1518.addMouseListener(this);
        this.field1518.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    private final void method723(boolean arg0) {
        field1507++;
        if (this.field1518 == null) {
            return;
        }
        this.field1518.removeMouseListener(this);
        this.field1518.removeMouseMotionListener(this);
        this.field1500 = this.field1489 = this.field1510 = 0;
        this.field1495 = null;
        if (!arg0) {
            this.field1518 = null;
            this.field1516 = this.field1513 = this.field1512 = 0;
            this.field1515 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final synchronized void method724(int arg0) {
        this.field1500 = this.field1516;
        if (arg0 != 2) {
            this.field1500 = 99;
        }
        field1494++;
        this.field1510 = this.field1512;
        this.field1489 = this.field1513;
        class7 var2 = this.field1495;
        this.field1495 = this.field1515;
        this.field1515 = var2;
        this.field1515.method47(0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
    private final void method725(byte arg0, MouseEvent arg1) {
        field1508++;
        this.field1516 = arg1.getX();
        this.field1513 = arg1.getY();
        if (arg0 != 79) {
            this.method727((byte) 84);
        }
        if (this.field1519) {
            this.method726(arg1.getX(), -1, (byte) -113, arg1.getY());
        }
    }

    @OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1485++;
        this.field1513 = -1;
        this.field1516 = -1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBI)V")
    private final void method726(int arg0, int arg1, byte arg2, int arg3) {
        field1487++;
        class431 var5 = new class431();
        var5.field5943 = arg1;
        var5.field5947 = arg3;
        var5.field5941 = arg0;
        if (arg2 >= -35) {
            this.field1515 = null;
        }
        var5.field5936 = class173.method1134(true);
        this.field1515.method42(var5, 0);
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)Z")
    public final boolean method727(byte arg0) {
        field1492++;
        if (arg0 > -52) {
            return false;
        } else {
            return (this.field1510 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method728(MouseEvent arg0, int arg1) {
        field1503++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        int var7 = 74 % ((10 - arg1) / 40);
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

    @OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method725((byte) 79, arg0);
        field1505++;
    }

    @OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1486++;
        int var2 = this.method728(arg0, -34);
        if (var2 == 1) {
            this.method726(arg0.getX(), 0, (byte) -71, arg0.getY());
        } else if (var2 == 4) {
            this.method726(arg0.getX(), 2, (byte) -71, arg0.getY());
        } else if (var2 == 2) {
            this.method726(arg0.getX(), 1, (byte) -44, arg0.getY());
        }
        this.field1512 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z")
    public final boolean method729(int arg0) {
        field1497++;
        if (arg0 < 114) {
            return true;
        } else {
            return (this.field1510 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class109(Component arg0, boolean arg1) {
        this.method722(arg0, (byte) 78);
        this.field1519 = arg1;
    }
}
