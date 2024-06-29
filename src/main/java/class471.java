import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class471 extends class86 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "Lgw;")
    private class118 field6845 = new class118();

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "Lgw;")
    private class118 field6858 = new class118();

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "Z")
    private boolean field6862;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field6833 = 0;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "F")
    public static float field6847;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    private int field6846;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    private int field6852;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    private int field6853;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    private int field6859;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
    private int field6860;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    private int field6861;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Lba;")
    public static class269 field6835;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "Ljava/awt/Component;")
    private Component field6863;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "[I")
    public static int[] field6840;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "(I)[Lfh;")
    public static final class470[] method2788(int arg0) {
        field6828++;
        if (arg0 != 1) {
            method2789((byte) 75);
        }
        return new class470[] { class65.field1110, class181.field2674, class439.field6252 };
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)I")
    public final int method644(int arg0) {
        field6834++;
        if (arg0 != 101) {
            method2788(29);
        }
        return this.field6846;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V")
    public static void method2789(byte arg0) {
        field6835 = null;
        field6840 = null;
        int var1 = 61 / ((50 - arg0) / 41);
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)Lsm;")
    public final class191 method647(int arg0) {
        field6827++;
        int var2 = 118 % ((arg0 - 39) / 58);
        return (class191) this.field6845.method862(-122);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    public final synchronized void method646(byte arg0) {
        this.field6846 = this.field6859;
        this.field6852 = this.field6861;
        field6850++;
        this.field6853 = this.field6860;
        class118 var2 = this.field6845;
        this.field6845 = this.field6858;
        this.field6858 = var2;
        this.field6858.method861(-1);
        int var3 = 105 % ((arg0 + 18) / 41);
    }

    @OriginalMember(owner = "client!rs", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6855++;
        int var2 = this.method2793((byte) 103, arg0);
        if ((var2 & this.field6861) == 0) {
            var2 = this.field6861;
        }
        if ((var2 & 0x1) != 0) {
            this.method2791(-102, arg0.getY(), 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2791(-52, arg0.getY(), 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2791(-52, arg0.getY(), 4, arg0.getX());
        }
        this.field6861 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lqa;BLtf;)V")
    public static final void method2790(class167 arg0, byte arg1, class198 arg2) {
        if (arg1 >= -60) {
            return;
        }
        field6841++;
        boolean var3 = class58.field1052.method1651(arg2.field2916, arg2.field2992 ? class364.field5293.field7403 : null, arg2.field3031, arg2.field2910 | 0xFF000000, arg2.field2961, arg2.field2952, (byte) 121, arg0) == null;
        if (var3) {
            class14.field157.method866((byte) 10, new class484(arg2.field2952, arg2.field2961, arg2.field2916, arg2.field2910 | 0xFF000000, arg2.field3031, arg2.field2992));
            class284.method1832(-17067, arg2);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
    private final void method2791(int arg0, int arg1, int arg2, int arg3) {
        field6838++;
        class227 var5 = new class227();
        var5.field3427 = arg3;
        var5.field3419 = arg2;
        var5.field3415 = arg1;
        var5.field3420 = class165.method1188((byte) 26);
        this.field6858.method866((byte) 10, var5);
        if (arg0 >= -1) {
            this.field6860 = -32;
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)Z")
    public final boolean method642(int arg0) {
        field6830++;
        int var2 = 92 / ((arg0 - 18) / 48);
        return (this.field6852 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rs", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6826++;
        int var2 = this.method2793((byte) 103, arg0);
        if (var2 == 1) {
            this.method2791(-86, arg0.getY(), 0, arg0.getX());
        } else if (var2 == 4) {
            this.method2791(-6, arg0.getY(), 2, arg0.getX());
        } else if (var2 == 2) {
            this.method2791(-128, arg0.getY(), 1, arg0.getX());
        }
        this.field6861 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Z")
    public final boolean method643(int arg0) {
        field6836++;
        if (arg0 <= 22) {
            this.field6858 = null;
        }
        return (this.field6852 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rs", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field6848++;
        this.method2792(arg0, true);
    }

    @OriginalMember(owner = "client!rs", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field6859 = -1;
        this.field6860 = -1;
        field6844++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)V")
    private final void method2792(MouseEvent arg0, boolean arg1) {
        this.field6860 = arg0.getX();
        field6854++;
        this.field6859 = arg0.getY();
        if (!arg1) {
            this.method646((byte) 73);
        }
        if (this.field6862) {
            this.method2791(-112, arg0.getY(), -1, arg0.getX());
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)I")
    public final int method639(byte arg0) {
        field6837++;
        int var2 = 58 % ((arg0 + 30) / 48);
        return this.field6853;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
    public final boolean method637(int arg0) {
        int var2 = -37 / ((arg0 - 64) / 58);
        field6856++;
        return (this.field6852 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rs", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2792(arg0, true);
        field6831++;
    }

    @OriginalMember(owner = "client!rs", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6842++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method2793(byte arg0, MouseEvent arg1) {
        field6857++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        int var7 = 125 % ((arg0 + 47) / 49);
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

    @OriginalMember(owner = "client!rs", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field6843++;
        this.method2792(arg0, true);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    private final void method2794(boolean arg0) {
        field6832++;
        if (this.field6863 == null) {
            return;
        }
        this.field6863.removeMouseMotionListener(this);
        this.field6863.removeMouseListener(this);
        this.field6853 = this.field6846 = this.field6852 = 0;
        if (arg0) {
            this.method2791(28, -18, -65, -90);
        }
        this.field6845 = null;
        this.field6858 = null;
        this.field6863 = null;
        this.field6860 = this.field6859 = this.field6861 = 0;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
    public final void method641(int arg0) {
        this.method2794(false);
        if (arg0 == 14919) {
            field6849++;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2795(int arg0, Component arg1) {
        this.method2794(false);
        field6839++;
        this.field6863 = arg1;
        this.field6863.addMouseListener(this);
        if (arg0 == 0) {
            this.field6863.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class471(Component arg0, boolean arg1) {
        this.method2795(0, arg0);
        this.field6862 = arg1;
    }
}
