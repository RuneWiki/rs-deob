import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class551 extends class723 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lga;")
    private class420 field7848 = new class420();

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lga;")
    private class420 field7854 = new class420();

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Z")
    private boolean field7858;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "[[S")
    private static short[][] field7846 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[[S")
    private static short[][] field7823 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "[[S")
    private static short[][] field7834 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[[[S")
    public static short[][][] field7838 = new short[][][] { field7823, field7834, field7846 };

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lga;")
    public static class420 field7826 = new class420();

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "[I")
    public static int[] field7856 = new int[1000];

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    private int field7827;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    private int field7835;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    private int field7839;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    private int field7852;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    private int field7853;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    private int field7855;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field7857;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z", line = 9)
    public final boolean method3195(int arg0) {
        field7822++;
        if (arg0 != -1) {
            this.method3196(-59);
        }
        return (this.field7835 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field7844++;
        this.method3200(true, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 33)
    public final void method3196(int arg0) {
        field7847++;
        this.method3202(8384);
        if (arg0 != 19939) {
            this.mouseDragged(null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I", line = 46)
    public final int method3197(byte arg0) {
        field7849++;
        return arg0 >= -121 ? -54 : this.field7827;
    }

    @OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 57)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field7840++;
    }

    @OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 71)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7843++;
        int var2 = this.method3198((byte) 125, arg0);
        if ((var2 & this.field7855) == 0) {
            var2 = this.field7855;
        }
        if ((var2 & 0x1) != 0) {
            this.method3208(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3, (byte) 38);
        }
        if ((var2 & 0x4) != 0) {
            this.method3208(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5, (byte) -110);
        }
        if ((var2 & 0x2) != 0) {
            this.method3208(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4, (byte) -111);
        }
        this.field7855 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 104)
    private final int method3198(byte arg0, MouseEvent arg1) {
        field7829++;
        int var3 = arg1.getModifiers();
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
            if (arg0 <= 81) {
                this.field7852 = -114;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Z", line = 142)
    public final boolean method3199(int arg0) {
        if (arg0 != -1) {
            this.method3201((byte) -9);
        }
        field7825++;
        return (this.field7835 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7842++;
        this.method3200(true, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZII)V", line = 165)
    private final void method3200(boolean arg0, int arg1, int arg2) {
        field7830++;
        this.field7853 = arg2;
        this.field7852 = arg1;
        if (!arg0) {
            this.field7827 = -8;
        }
        if (this.field7858) {
            this.method3208(arg1, 0, arg2, -1, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 182)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field7850++;
        this.method3200(true, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 190)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3200(true, arg0.getY(), arg0.getX());
        field7833++;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I", line = 201)
    public final int method3201(byte arg0) {
        field7841++;
        return arg0 < 13 ? 35 : this.field7839;
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)V", line = 212)
    private final void method3202(int arg0) {
        field7832++;
        if (this.field7857 == null) {
            return;
        }
        this.field7857.removeMouseMotionListener(this);
        this.field7857.removeMouseListener(this);
        this.field7853 = this.field7852 = this.field7855 = 0;
        this.field7848 = null;
        this.field7839 = this.field7827 = this.field7835 = 0;
        if (arg0 != 8384) {
            field7826 = null;
        }
        this.field7857 = null;
        this.field7854 = null;
    }

    @OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 238)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7837++;
        int var2 = this.method3198((byte) 91, arg0);
        if (var2 == 1) {
            this.method3208(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0, (byte) -116);
        } else if (var2 == 4) {
            this.method3208(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2, (byte) -115);
        } else if (var2 == 2) {
            this.method3208(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1, (byte) 39);
        }
        this.field7855 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z", line = 264)
    public final boolean method3203(int arg0) {
        if (arg0 != -1) {
            this.field7852 = -106;
        }
        field7828++;
        return (this.field7835 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 282)
    private final void method3204(Component arg0, int arg1) {
        if (arg1 != 4760) {
            this.method3195(-116);
        }
        field7836++;
        this.method3202(8384);
        this.field7857 = arg0;
        this.field7857.addMouseListener(this);
        this.field7857.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 303)
    public final synchronized void method3205(byte arg0) {
        this.field7835 = this.field7855;
        this.field7827 = this.field7852;
        this.field7839 = this.field7853;
        field7831++;
        class420 var2 = this.field7848;
        this.field7848 = this.field7854;
        this.field7854 = var2;
        int var3 = -87 % ((23 - arg0) / 33);
        this.field7854.method2503(10);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 324)
    public static final void method3206(String arg0, int arg1) {
        field7824++;
        class731 var2 = class744.method4154((byte) 116);
        var2.field10211.method851((byte) -2, class17.field291.field8702);
        var2.field10211.method860(0, (byte) 114);
        int var3 = var2.field10211.field1521;
        var2.field10211.method860(644, (byte) 116);
        int[] var4 = class757.method4182(31035, var2);
        int var5 = var2.field10211.field1521;
        var2.field10211.method880(true, arg0);
        var2.field10211.method851((byte) -2, class526.field7494);
        var2.field10211.field1521 += arg1;
        var2.field10211.method887(var4, var5, 115, var2.field10211.field1521);
        var2.field10211.method844(var2.field10211.field1521 - var3, -1816748120);
        class533.method3088(var2, 0);
        class789.field10835 = 0;
        class715.field10078 = -3;
        class284.field4365 = 1;
        class207.field3027 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V", line = 353)
    public static void method3207(byte arg0) {
        field7856 = null;
        if (arg0 > -109) {
            method3206(null, 22);
        }
        field7823 = null;
        field7838 = null;
        field7846 = null;
        field7826 = null;
        field7834 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIB)V", line = 370)
    private final void method3208(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7851++;
        class311 var6 = new class311();
        var6.field4627 = arg0;
        var6.field4623 = arg3;
        var6.field4622 = arg2;
        var6.field4621 = arg1;
        var6.field4619 = class109.method731(107);
        this.field7854.method2510(var6, false);
        int var7 = 98 % ((arg4 + 54) / 55);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 417)
    public class551(Component arg0, boolean arg1) {
        this.method3204(arg0, 4760);
        this.field7858 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Lik;", line = 393)
    public final class218 method3209(int arg0) {
        field7845++;
        return arg0 == 13606 ? (class218) this.field7848.method2507(-104) : null;
    }
}
