import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class396 extends class137 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lug;")
    private class392 field5969 = new class392();

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lug;")
    private class392 field5983 = new class392();

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Z")
    private boolean field5987;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Lpi;")
    public static class342 field5971 = new class342("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "[I")
    public static int[] field5975 = new int[6];

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Liv;")
    public static class64 field5973 = new class64(45, -1);

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    private int field5963;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    private int field5972;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    private int field5982;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    private int field5984;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    private int field5986;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field5988;

    @OriginalMember(owner = "client!kj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5970++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 14)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5968++;
        this.method2447(25846, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method1018(int arg0) {
        field5959++;
        if (arg0 >= -6) {
            this.field5972 = -28;
        }
        return (this.field5963 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Lji;", line = 38)
    public final class432 method1015(boolean arg0) {
        field5977++;
        return arg0 ? null : (class432) this.field5969.method2423(0);
    }

    @OriginalMember(owner = "client!kj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5985 = -1;
        field5966++;
        this.field5984 = -1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 61)
    public final void method1017(byte arg0) {
        field5956++;
        this.method2444((byte) 113);
        if (arg0 > -3) {
            method2445(29);
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z", line = 73)
    public final boolean method1026(int arg0) {
        field5961++;
        if (arg0 != 3553) {
            this.field5982 = 60;
        }
        return (this.field5963 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I", line = 86)
    private final int method2443(boolean arg0, MouseEvent arg1) {
        field5958++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        if (arg0) {
            this.field5969 = null;
        }
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

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V", line = 129)
    private final void method2444(byte arg0) {
        field5974++;
        if (this.field5988 == null) {
            return;
        }
        this.field5988.removeMouseListener(this);
        this.field5988.removeMouseMotionListener(this);
        if (arg0 != 113) {
            this.mouseExited(null);
        }
        this.field5988 = null;
        this.field5983 = null;
        this.field5969 = null;
        this.field5972 = this.field5982 = this.field5963 = 0;
        this.field5985 = this.field5984 = this.field5986 = 0;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 157)
    public static void method2445(int arg0) {
        field5975 = null;
        field5971 = null;
        field5973 = null;
        int var1 = -120 / (arg0 / 34);
    }

    @OriginalMember(owner = "client!kj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 169)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5960++;
        int var2 = this.method2443(false, arg0);
        if (var2 == 1) {
            this.method2448(arg0.getY(), 65, 0, arg0.getX());
        } else if (var2 == 4) {
            this.method2448(arg0.getY(), 52, 2, arg0.getX());
        } else if (var2 == 2) {
            this.method2448(arg0.getY(), 54, 1, arg0.getX());
        }
        this.field5986 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)I", line = 198)
    public final int method1019(byte arg0) {
        if (arg0 == 3) {
            field5980++;
            return this.field5982;
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!kj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 210)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2447(25846, arg0);
        field5978++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)I", line = 219)
    public final int method1024(boolean arg0) {
        field5981++;
        return arg0 ? this.field5972 : 53;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 230)
    private final void method2446(int arg0, Component arg1) {
        if (arg0 != 0) {
            this.method1018(-123);
        }
        field5976++;
        this.method2444((byte) 113);
        this.field5988 = arg1;
        this.field5988.addMouseListener(this);
        this.field5988.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 252)
    private final void method2447(int arg0, MouseEvent arg1) {
        field5979++;
        this.field5985 = arg1.getX();
        this.field5984 = arg1.getY();
        if (arg0 == 25846 && this.field5987) {
            this.method2448(arg1.getY(), 29, -1, arg1.getX());
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V", line = 274)
    public final synchronized void method1020(byte arg0) {
        this.field5982 = this.field5984;
        if (arg0 <= 19) {
            this.method1018(15);
        }
        field5962++;
        this.field5972 = this.field5985;
        this.field5963 = this.field5986;
        class392 var2 = this.field5969;
        this.field5969 = this.field5983;
        this.field5983 = var2;
        this.field5983.method2419((byte) 116);
    }

    @OriginalMember(owner = "client!kj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 298)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5957++;
        int var2 = this.method2443(false, arg0);
        if ((this.field5986 & var2) == 0) {
            var2 = this.field5986;
        }
        if ((var2 & 0x1) != 0) {
            this.method2448(arg0.getY(), 81, 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2448(arg0.getY(), 88, 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2448(arg0.getY(), 48, 4, arg0.getX());
        }
        this.field5986 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)Z", line = 334)
    public final boolean method1025(int arg0) {
        if (arg0 >= -57) {
            this.mousePressed(null);
        }
        field5964++;
        return (this.field5963 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 345)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2447(25846, arg0);
        field5965++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V", line = 358)
    private final void method2448(int arg0, int arg1, int arg2, int arg3) {
        field5967++;
        class343 var5 = new class343();
        var5.field5159 = arg0;
        if (arg1 > 16) {
            var5.field5163 = arg3;
            var5.field5160 = arg2;
            var5.field5169 = class211.method1419(12921);
            this.field5983.method2417(98, var5);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 387)
    public class396(Component arg0, boolean arg1) {
        this.method2446(0, arg0);
        this.field5987 = arg1;
    }
}
