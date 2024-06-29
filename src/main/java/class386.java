import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class386 extends class233 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!kda", name = "A", descriptor = "Lnt;")
    private class220 field5406 = new class220();

    @OriginalMember(owner = "client!kda", name = "M", descriptor = "Lnt;")
    private class220 field5418 = new class220();

    @OriginalMember(owner = "client!kda", name = "P", descriptor = "Z")
    private boolean field5421;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field5387 = -1;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "Z")
    public static boolean field5394 = false;

    @OriginalMember(owner = "client!kda", name = "F", descriptor = "Z")
    public static boolean field5411 = false;

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
    public static int field5410 = 0;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    private int field5396;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!kda", name = "B", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!kda", name = "C", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!kda", name = "G", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!kda", name = "H", descriptor = "I")
    private int field5413;

    @OriginalMember(owner = "client!kda", name = "I", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!kda", name = "J", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!kda", name = "K", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!kda", name = "L", descriptor = "I")
    private int field5417;

    @OriginalMember(owner = "client!kda", name = "N", descriptor = "I")
    private int field5419;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "Lqe;")
    public static class465 field5398;

    @OriginalMember(owner = "client!kda", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field5420;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)I")
    public final int method1592(boolean arg0) {
        field5397++;
        if (!arg0) {
            this.method1590(-37);
        }
        return this.field5409;
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Z")
    public final boolean method1589(int arg0) {
        if (arg0 == 8) {
            field5386++;
            return (this.field5396 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)Llga;")
    public final class709 method1590(int arg0) {
        if (arg0 == 260610) {
            field5412++;
            return (class709) this.field5406.method1521(123);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5389++;
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(B)V")
    private final void method2411(byte arg0) {
        field5390++;
        if (this.field5420 == null) {
            return;
        }
        if (arg0 != 81) {
            field5387 = 99;
        }
        this.field5420.removeMouseMotionListener(this);
        this.field5420.removeMouseListener(this);
        this.field5413 = this.field5417 = this.field5419 = 0;
        this.field5418 = null;
        this.field5420 = null;
        this.field5385 = this.field5409 = this.field5396 = 0;
        this.field5406 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
    public final void method1591(byte arg0) {
        this.method2411((byte) 81);
        field5403++;
        if (arg0 != 2) {
            this.method1596((byte) -26);
        }
    }

    @OriginalMember(owner = "client!kda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2413((byte) -83, arg0.getX(), arg0.getY());
        field5400++;
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(B)Z")
    public final boolean method1596(byte arg0) {
        int var2 = 42 % ((-arg0 - 5) / 41);
        field5402++;
        return (this.field5396 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5415++;
        int var2 = this.method2415(arg0, 4);
        if ((var2 & this.field5419) == 0) {
            var2 = this.field5419;
        }
        if ((var2 & 0x1) != 0) {
            this.method2416(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2416(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2416(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), 4);
        }
        this.field5419 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
    public final boolean method1587(int arg0) {
        int var2 = 63 % ((81 - arg0) / 37);
        field5408++;
        return (this.field5396 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "(I)V")
    public static void method2412(int arg0) {
        field5398 = null;
        int var1 = 43 % ((arg0 - 35) / 42);
    }

    @OriginalMember(owner = "client!kda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2413((byte) -83, arg0.getX(), arg0.getY());
        field5407++;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BII)V")
    private final void method2413(byte arg0, int arg1, int arg2) {
        field5404++;
        this.field5413 = arg1;
        this.field5417 = arg2;
        if (arg0 != -83) {
            this.field5421 = true;
        }
        if (this.field5421) {
            this.method2416(arg2, 2, 0, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public final synchronized void method1588(int arg0) {
        this.field5385 = this.field5413;
        this.field5396 = this.field5419;
        field5399++;
        this.field5409 = this.field5417;
        class220 var2 = this.field5406;
        this.field5406 = this.field5418;
        this.field5418 = var2;
        this.field5418.method1530((byte) 106);
        int var3 = 24 / ((arg0 + 45) / 49);
    }

    @OriginalMember(owner = "client!kda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2413((byte) -83, arg0.getX(), arg0.getY());
        field5414++;
    }

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "(I)I")
    public final int method1597(int arg0) {
        if (arg0 < 110) {
            return 14;
        } else {
            field5391++;
            return this.field5385;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2414(byte arg0, Component arg1) {
        field5416++;
        if (arg0 >= -83) {
            field5405 = -67;
        }
        this.method2411((byte) 81);
        this.field5420 = arg1;
        this.field5420.addMouseListener(this);
        this.field5420.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!kda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5392++;
        int var2 = this.method2415(arg0, 4);
        if (var2 == 1) {
            this.method2416(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method2416(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method2416(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), 1);
        }
        this.field5419 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method2415(MouseEvent arg0, int arg1) {
        field5393++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & arg1) != 0;
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

    @OriginalMember(owner = "client!kda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field5401++;
        this.method2413((byte) -83, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIII)V")
    private final void method2416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5388++;
        class309 var6 = new class309();
        var6.field4360 = arg2;
        var6.field4368 = arg0;
        if (arg1 != 2) {
            this.mouseReleased(null);
        }
        var6.field4373 = arg4;
        var6.field4364 = arg3;
        var6.field4374 = class742.method4128(1);
        this.field5418.method1526(var6, 117);
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class386(Component arg0, boolean arg1) {
        this.method2414((byte) -88, arg0);
        this.field5421 = arg1;
    }
}
