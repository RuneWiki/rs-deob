import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class303 extends class433 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Lnj;")
    private class317 field4759 = new class317();

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Lnj;")
    private class317 field4765 = new class317();

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Z")
    private boolean field4772;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field4748 = 0;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lj;")
    public static class235 field4752 = new class235("WIP", 2);

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "B")
    public static byte field4775;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    private int field4743;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    private int field4745;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    private int field4766;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    private int field4769;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field4774;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2035(Component arg0, int arg1) {
        field4763++;
        this.method2042((byte) 99);
        if (arg1 >= -97) {
            this.method2036(-63);
        }
        this.field4774 = arg0;
        this.field4774.addMouseListener(this);
        this.field4774.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!sf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2040(arg0, (byte) 55);
        field4767++;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z")
    public final boolean method2036(int arg0) {
        field4741++;
        if (arg0 == 20) {
            return (this.field4745 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public static void method2037(byte arg0) {
        field4752 = null;
        if (arg0 > -60) {
            field4775 = -72;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
    public final int method2038(int arg0) {
        if (arg0 != -49) {
            field4748 = 89;
        }
        field4740++;
        return this.field4762;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lhw;Z)Lvs;")
    public static final class368 method2039(class208 arg0, boolean arg1) {
        field4749++;
        if (arg1) {
            method2041(-92, 42, (byte) 92);
        }
        return new class368(arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1452(3), arg0.method1452(3), arg0.method1445(-123));
    }

    @OriginalMember(owner = "client!sf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4757++;
        int var2 = this.method2049(arg0, 25);
        if ((this.field4766 & var2) == 0) {
            var2 = this.field4766;
        }
        if ((var2 & 0x1) != 0) {
            this.method2045(arg0.getY(), 3, (byte) 113, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2045(arg0.getY(), 5, (byte) 110, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2045(arg0.getY(), 4, (byte) 110, arg0.getX());
        }
        this.field4766 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4753++;
        this.method2040(arg0, (byte) 24);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
    private final void method2040(MouseEvent arg0, byte arg1) {
        this.field4768 = arg0.getX();
        if (arg1 < 6) {
            return;
        }
        field4773++;
        this.field4769 = arg0.getY();
        if (this.field4772) {
            this.method2045(arg0.getY(), -1, (byte) 52, arg0.getX());
        }
    }

    @OriginalMember(owner = "client!sf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4744++;
        int var2 = this.method2049(arg0, 67);
        if (var2 == 1) {
            this.method2045(arg0.getY(), 0, (byte) 121, arg0.getX());
        } else if (var2 == 4) {
            this.method2045(arg0.getY(), 2, (byte) 125, arg0.getX());
        } else if (var2 == 2) {
            this.method2045(arg0.getY(), 1, (byte) 85, arg0.getX());
        }
        this.field4766 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field4769 = -1;
        this.field4768 = -1;
        field4742++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2041(int arg0, int arg1, byte arg2) {
        field4756++;
        if ((class416.field6309[1][arg1][arg0] & 0x2) == 0) {
            int var3 = -28 / ((11 - arg2) / 42);
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
    private final void method2042(byte arg0) {
        field4755++;
        if (this.field4774 == null) {
            return;
        }
        this.field4774.removeMouseMotionListener(this);
        this.field4774.removeMouseListener(this);
        this.field4762 = this.field4743 = this.field4745 = 0;
        this.field4768 = this.field4769 = this.field4766 = 0;
        this.field4759 = null;
        this.field4765 = null;
        this.field4774 = null;
        int var2 = 38 / ((-arg0 - 25) / 39);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I")
    public final int method2043(byte arg0) {
        field4754++;
        if (arg0 > -65) {
            this.field4769 = -48;
        }
        return this.field4743;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Z")
    public final boolean method2044(boolean arg0) {
        field4746++;
        if (arg0) {
            return (this.field4745 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBI)V")
    private final void method2045(int arg0, int arg1, byte arg2, int arg3) {
        field4751++;
        if (arg2 <= 44) {
            this.method2038(-74);
        }
        class373 var5 = new class373();
        var5.field5728 = arg3;
        var5.field5725 = arg1;
        var5.field5723 = arg0;
        var5.field5729 = class246.method1705((byte) 28);
        this.field4765.method2124(var5, (byte) 127);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z")
    public final boolean method2046(int arg0) {
        if (arg0 > -5) {
            this.mouseMoved(null);
        }
        field4758++;
        return (this.field4745 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Lic;")
    public final class32 method2047(byte arg0) {
        if (arg0 == 41) {
            field4770++;
            return (class32) this.field4759.method2127(-111);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method2048(int arg0) {
        this.method2042((byte) -77);
        field4761++;
        if (arg0 != 6) {
            field4771 = 8;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method2049(MouseEvent arg0, int arg1) {
        field4750++;
        int var3 = 103 % ((arg1 + 38) / 50);
        int var4 = arg0.getModifiers();
        boolean var5 = (var4 & 0x10) != 0;
        boolean var6 = (var4 & 0x8) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        if (var6 && (var5 || var7)) {
            var6 = false;
        }
        if (var5 && var7) {
            return 4;
        } else if (var5) {
            return 1;
        } else if (var6) {
            return 2;
        } else if (var7) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public final synchronized void method2050(int arg0) {
        this.field4743 = this.field4769;
        this.field4745 = this.field4766;
        field4760++;
        if (arg0 != 23747) {
            this.mouseMoved(null);
        }
        this.field4762 = this.field4768;
        class317 var2 = this.field4759;
        this.field4759 = this.field4765;
        this.field4765 = var2;
        this.field4765.method2120((byte) 27);
    }

    @OriginalMember(owner = "client!sf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2040(arg0, (byte) 8);
        field4764++;
    }

    @OriginalMember(owner = "client!sf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4747++;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class303(Component arg0, boolean arg1) {
        this.method2035(arg0, -118);
        this.field4772 = arg1;
    }
}
