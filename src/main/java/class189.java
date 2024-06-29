import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class189 extends class104 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Lro;")
    private class2 field2832 = new class2();

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "Lro;")
    private class2 field2861 = new class2();

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "Z")
    private boolean field2863;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "[F")
    public static float[] field2851 = new float[2];

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "[I")
    public static int[] field2853 = new int[2048];

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
    private int field2858;

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field2862;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "[I")
    public static int[] field2848;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method1290(byte arg0, MouseEvent arg1) {
        field2844++;
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
            int var7 = 46 % ((arg0 - 76) / 45);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ov", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2855++;
        this.method1295(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ov", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2846++;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)Z")
    public final boolean method774(boolean arg0) {
        if (arg0) {
            this.field2863 = true;
        }
        field2842++;
        return (this.field2854 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
    public final synchronized void method778(int arg0) {
        field2852++;
        this.field2854 = this.field2858;
        this.field2840 = this.field2856;
        if (arg0 != -6928) {
            return;
        }
        this.field2847 = this.field2860;
        class2 var2 = this.field2832;
        this.field2832 = this.field2861;
        this.field2861 = var2;
        this.field2861.method23(10);
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V")
    private final void method1291(int arg0) {
        field2836++;
        if (this.field2862 == null) {
            return;
        }
        this.field2862.removeMouseMotionListener(this);
        this.field2862.removeMouseListener(this);
        this.field2832 = null;
        this.field2862 = null;
        this.field2856 = this.field2860 = this.field2858 = arg0;
        this.field2861 = null;
        this.field2840 = this.field2847 = this.field2854 = 0;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)Z")
    public final boolean method776(boolean arg0) {
        if (arg0) {
            this.method1291(88);
        }
        field2849++;
        return (this.field2854 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ov", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2841++;
        int var2 = this.method1290((byte) 121, arg0);
        if ((this.field2858 & var2) == 0) {
            var2 = this.field2858;
        }
        if ((var2 & 0x1) != 0) {
            this.method1292(arg0.getY(), 3, arg0.getX(), arg0.getClickCount(), false);
        }
        if ((var2 & 0x4) != 0) {
            this.method1292(arg0.getY(), 5, arg0.getX(), arg0.getClickCount(), false);
        }
        if ((var2 & 0x2) != 0) {
            this.method1292(arg0.getY(), 4, arg0.getX(), arg0.getClickCount(), false);
        }
        this.field2858 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ov", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2850++;
        int var2 = this.method1290((byte) 123, arg0);
        if (var2 == 1) {
            this.method1292(arg0.getY(), 0, arg0.getX(), arg0.getClickCount(), false);
        } else if (var2 == 4) {
            this.method1292(arg0.getY(), 2, arg0.getX(), arg0.getClickCount(), false);
        } else if (var2 == 2) {
            this.method1292(arg0.getY(), 1, arg0.getX(), arg0.getClickCount(), false);
        }
        this.field2858 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIZ)V")
    private final void method1292(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2845++;
        class291 var6 = new class291();
        var6.field4159 = arg2;
        var6.field4153 = arg1;
        var6.field4154 = arg3;
        var6.field4152 = arg0;
        if (arg4) {
            this.field2863 = true;
        }
        var6.field4149 = class375.method2193(116);
        this.field2861.method11(var6, -125);
    }

    @OriginalMember(owner = "client!ov", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1295(-1, arg0.getX(), arg0.getY());
        field2835++;
    }

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field2851 = null;
        field2848 = null;
        if (arg0 != -27364) {
            field2851 = null;
        }
        field2853 = null;
    }

    @OriginalMember(owner = "client!ov", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2838++;
        this.method1295(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)Lqg;")
    public final class466 method773(byte arg0) {
        field2857++;
        if (arg0 <= 125) {
            this.field2856 = 120;
        }
        return (class466) this.field2832.method10(false);
    }

    @OriginalMember(owner = "client!ov", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2837++;
        this.method1295(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(B)I")
    public final int method780(byte arg0) {
        field2834++;
        if (arg0 >= -48) {
            this.field2862 = null;
        }
        return this.field2840;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)Z")
    public final boolean method777(byte arg0) {
        field2839++;
        if (arg0 < 49) {
            this.mouseDragged(null);
        }
        return (this.field2854 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1294(int arg0, Component arg1) {
        this.method1291(0);
        field2833++;
        this.field2862 = arg1;
        if (arg0 >= -20) {
            this.mouseDragged(null);
        }
        this.field2862.addMouseListener(this);
        this.field2862.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
    private final void method1295(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.method780((byte) 5);
        }
        this.field2860 = arg2;
        field2831++;
        this.field2856 = arg1;
        if (this.field2863) {
            this.method1292(arg2, -1, arg1, 0, false);
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)I")
    public final int method772(int arg0) {
        field2843++;
        return arg0 < 38 ? -86 : this.field2847;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public final void method769(byte arg0) {
        field2859++;
        this.method1291(0);
        int var2 = 38 % ((-arg0 - 18) / 38);
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class189(Component arg0, boolean arg1) {
        this.method1294(-48, arg0);
        this.field2863 = arg1;
    }
}
