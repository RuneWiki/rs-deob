import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class126 extends class284 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lfha;")
    private class522 field1729 = new class522();

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Lfha;")
    private class522 field1737 = new class522();

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "Z")
    private boolean field1740;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Lpf;")
    public static class728 field1734 = new class728();

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Lkea;")
    public static class77 field1742 = new class77(3);

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field1744 = -1;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    private int field1727;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Lha;")
    public static class545 field1741;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "Ljava/awt/Component;")
    private Component field1743;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    private final void method801(int arg0, int arg1, int arg2) {
        if (arg0 != 5733) {
            this.field1718 = 118;
        }
        this.field1736 = arg2;
        this.field1735 = arg1;
        field1720++;
        if (this.field1740) {
            this.method816(arg1, -1, 0, arg0 ^ 0x1665, arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lfi;")
    public final class12 method802(byte arg0) {
        int var2 = 112 % ((-arg0 - 59) / 41);
        field1715++;
        return (class12) this.field1729.method3115(true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
    private final int method803(MouseEvent arg0, boolean arg1) {
        field1710++;
        int var3 = arg0.getModifiers();
        if (arg1) {
            return 109;
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

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    private final void method804(int arg0) {
        field1722++;
        if (this.field1743 == null) {
            return;
        }
        this.field1743.removeMouseMotionListener(this);
        this.field1743.removeMouseListener(this);
        this.field1718 = this.field1707 = this.field1727 = arg0;
        this.field1737 = null;
        this.field1729 = null;
        this.field1743 = null;
        this.field1735 = this.field1736 = this.field1739 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
    public final int method805(int arg0) {
        if (arg0 == 0) {
            field1711++;
            return this.field1718;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I")
    public final int method806(int arg0) {
        if (arg0 == 0) {
            field1725++;
            return this.field1707;
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method807(int arg0) {
        if (arg0 > -2) {
            field1734 = null;
        }
        field1733++;
        this.method804(0);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
    public final boolean method808(byte arg0) {
        if (arg0 != -65) {
            field1734 = null;
        }
        field1728++;
        return (this.field1727 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1709++;
        int var2 = this.method803(arg0, false);
        if ((this.field1739 & var2) == 0) {
            var2 = this.field1739;
        }
        if ((var2 & 0x1) != 0) {
            this.method816(arg0.getX(), 3, arg0.getClickCount(), 0, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method816(arg0.getX(), 5, arg0.getClickCount(), 0, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method816(arg0.getX(), 4, arg0.getClickCount(), 0, arg0.getY());
        }
        this.field1739 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1723++;
        int var2 = this.method803(arg0, false);
        if (var2 == 1) {
            this.method816(arg0.getX(), 0, arg0.getClickCount(), 0, arg0.getY());
        } else if (var2 == 4) {
            this.method816(arg0.getX(), 2, arg0.getClickCount(), 0, arg0.getY());
        } else if (var2 == 2) {
            this.method816(arg0.getX(), 1, arg0.getClickCount(), 0, arg0.getY());
        }
        this.field1739 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public final synchronized void method809(int arg0) {
        field1714++;
        this.field1727 = this.field1739;
        this.field1718 = this.field1735;
        this.field1707 = this.field1736;
        class522 var2 = this.field1729;
        this.field1729 = this.field1737;
        this.field1737 = var2;
        this.field1737.method3122(0);
        int var3 = -86 % ((arg0 + 10) / 53);
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)I")
    public static final int method810(int arg0) {
        if (arg0 != 4) {
            method810(8);
        }
        field1721++;
        return class515.field7188;
    }

    @OriginalMember(owner = "client!uc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method801(5733, arg0.getX(), arg0.getY());
        field1712++;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
    public final boolean method811(int arg0) {
        if (arg0 == -4943) {
            field1713++;
            return (this.field1727 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1738++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method812(Component arg0, int arg1) {
        this.method804(0);
        field1732++;
        this.field1743 = arg0;
        this.field1743.addMouseListener(this);
        this.field1743.addMouseMotionListener(this);
        if (arg1 >= -60) {
            this.method806(36);
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method801(5733, arg0.getX(), arg0.getY());
        field1724++;
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)V")
    public static void method813(int arg0) {
        field1742 = null;
        field1741 = null;
        field1734 = null;
        if (arg0 >= -52) {
            field1741 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method801(5733, arg0.getX(), arg0.getY());
        field1730++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII)Lbi;")
    public static final class118 method814(boolean arg0, int arg1, int arg2) {
        field1731++;
        class118 var3 = (class118) class593.field8546.method1381(arg0, (long) arg2 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class118(arg2, arg1);
            class593.field8546.method1387(var3, var3.field7166, (byte) -115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z")
    public final boolean method815(int arg0) {
        if (arg0 > -121) {
            field1741 = null;
        }
        field1719++;
        return (this.field1727 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    private final void method816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field1717 = -125;
        }
        field1716++;
        class404 var6 = new class404();
        var6.field5611 = arg0;
        var6.field5617 = arg4;
        var6.field5612 = arg2;
        var6.field5603 = arg1;
        var6.field5607 = class224.method1457((byte) -62);
        this.field1737.method3116(29066, var6);
    }

    @OriginalMember(owner = "client!uc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method801(5733, arg0.getX(), arg0.getY());
        field1726++;
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
    public static final void method817(int arg0) {
        field1708++;
        if (arg0 != -1) {
            return;
        }
        if (class213.field3004 == 3) {
            class647.method3754(4, true);
        } else if (class213.field3004 == 7) {
            class647.method3754(8, true);
        } else if (class213.field3004 == 10) {
            class647.method3754(11, true);
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class126(Component arg0, boolean arg1) {
        this.method812(arg0, -96);
        this.field1740 = arg1;
    }
}
