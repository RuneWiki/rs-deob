import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class787 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Lifa;")
    private class450 field88 = new class450();

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lifa;")
    private class450 field91 = new class450();

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Z")
    private boolean field95;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "D")
    public static double field72;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Lha;")
    public static class66 field80;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Ljava/awt/Component;")
    private Component field96;

    @OriginalMember(owner = "client!ie", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field66++;
        int var2 = this.method108((byte) 74, arg0);
        if ((this.field94 & var2) == 0) {
            var2 = this.field94;
        }
        if ((var2 & 0x1) != 0) {
            this.method114(arg0.getClickCount(), arg0.getX(), arg0.getY(), -1, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method114(arg0.getClickCount(), arg0.getX(), arg0.getY(), -1, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method114(arg0.getClickCount(), arg0.getX(), arg0.getY(), -1, 4);
        }
        this.field94 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method108(byte arg0, MouseEvent arg1) {
        if (arg0 != 74) {
            return 119;
        }
        field68++;
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
            return 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
    public final int method109(int arg0) {
        if (arg0 < 120) {
            this.field93 = -120;
        }
        field64++;
        return this.field81;
    }

    @OriginalMember(owner = "client!ie", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field85++;
        this.method118((byte) -99, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
    public final boolean method110(int arg0) {
        if (arg0 != 10997) {
            this.method110(38);
        }
        field89++;
        return (this.field67 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lgn;")
    public final class730 method111(int arg0) {
        if (arg0 < 47) {
            this.method113((byte) 23);
        }
        field83++;
        return (class730) this.field88.method2730(-31260);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
    public final boolean method112(byte arg0) {
        field71++;
        if (arg0 <= 117) {
            return false;
        } else {
            return (this.field67 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method118((byte) -53, arg0.getY(), arg0.getX());
        field74++;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        field90++;
        if (arg0 == -41) {
            return (this.field67 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
    private final void method114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field79++;
        class326 var6 = new class326();
        var6.field4033 = arg2;
        if (arg3 != -1) {
            this.method111(85);
        }
        var6.field4043 = arg0;
        var6.field4035 = arg1;
        var6.field4037 = arg4;
        var6.field4041 = class349.method2069(true);
        this.field91.method2732(var6, arg3 + 21940);
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static void method115(int arg0) {
        if (arg0 == 7990) {
            field80 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    private final void method116(int arg0) {
        field84++;
        if (this.field96 == null) {
            return;
        }
        this.field96.removeMouseMotionListener(this);
        this.field96.removeMouseListener(this);
        this.field96 = null;
        this.field88 = null;
        this.field91 = null;
        this.field81 = this.field78 = this.field67 = 0;
        this.field93 = this.field92 = this.field94 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field82++;
        int var2 = this.method108((byte) 74, arg0);
        if (var2 == 1) {
            this.method114(arg0.getClickCount(), arg0.getX(), arg0.getY(), -1, 0);
        } else if (var2 == 4) {
            this.method114(arg0.getClickCount(), arg0.getX(), arg0.getY(), -1, 2);
        } else if (var2 == 2) {
            this.method114(arg0.getClickCount(), arg0.getX(), arg0.getY(), -1, 1);
        }
        this.field94 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method118((byte) 50, arg0.getY(), arg0.getX());
        field65++;
    }

    @OriginalMember(owner = "client!ie", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field87++;
    }

    @OriginalMember(owner = "client!ie", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field69++;
        this.method118((byte) 102, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
    public final int method117(boolean arg0) {
        field76++;
        if (!arg0) {
            this.method112((byte) 24);
        }
        return this.field78;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)V")
    private final void method118(byte arg0, int arg1, int arg2) {
        this.field92 = arg1;
        int var4 = 49 / ((-arg0 - 7) / 42);
        this.field93 = arg2;
        field86++;
        if (this.field95) {
            this.method114(0, arg2, arg1, -1, -1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)V")
    public final void method119(byte arg0) {
        this.method116(0);
        if (arg0 >= -8) {
            this.method116(-14);
        }
        field77++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method120(Component arg0, int arg1) {
        if (arg1 != 2338) {
            this.mouseClicked(null);
        }
        field73++;
        this.method116(0);
        this.field96 = arg0;
        this.field96.addMouseListener(this);
        this.field96.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public final synchronized void method121(byte arg0) {
        field75++;
        this.field67 = this.field94;
        this.field78 = this.field92;
        this.field81 = this.field93;
        class450 var2 = this.field88;
        if (arg0 != 121) {
            method115(71);
        }
        this.field88 = this.field91;
        this.field91 = var2;
        this.field91.method2729(-48);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class6(Component arg0, boolean arg1) {
        this.method120(arg0, 2338);
        this.field95 = arg1;
    }
}
