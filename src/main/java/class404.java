import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class404 extends class174 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "Ljia;")
    private class645 field5545 = new class645();

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "Ljia;")
    private class645 field5570 = new class645();

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "Z")
    private boolean field5573;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "[F")
    public static float[] field5548 = new float[16];

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "[F")
    public static float[] field5543 = new float[4];

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
    private int field5546;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!dda", name = "t", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
    private int field5557;

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "I")
    private int field5568;

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
    private int field5569;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
    private int field5571;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field5572;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
    public final boolean method1323(int arg0) {
        if (arg0 == 4) {
            field5562++;
            return (this.field5546 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5552++;
        this.method2411(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(III)V")
    private final void method2411(int arg0, int arg1, int arg2) {
        this.field5571 = arg2;
        field5549++;
        if (arg1 != -1) {
            this.field5545 = null;
        }
        this.field5568 = arg0;
        if (this.field5573) {
            this.method2413(8, 0, arg2, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2412(int arg0, Component arg1) {
        int var3 = -97 % ((7 - arg0) / 50);
        this.method2417(84);
        field5551++;
        this.field5572 = arg1;
        this.field5572.addMouseListener(this);
        this.field5572.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIII)V")
    private final void method2413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5540++;
        if (arg0 != 8) {
            return;
        }
        class738 var6 = new class738();
        var6.field10191 = arg3;
        var6.field10190 = arg2;
        var6.field10189 = arg1;
        var6.field10192 = arg4;
        var6.field10188 = class197.method1423(1);
        this.field5570.method3594((byte) 112, var6);
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V")
    public final void method1321(byte arg0) {
        field5542++;
        this.method2417(arg0 + 124);
        if (arg0 != -47) {
            this.method1323(30);
        }
    }

    @OriginalMember(owner = "client!dda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5564++;
        int var2 = this.method2418(arg0, false);
        if (var2 == 1) {
            this.method2413(8, arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
        } else if (var2 == 4) {
            this.method2413(8, arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
        } else if (var2 == 2) {
            this.method2413(8, arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
        }
        this.field5569 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2411(arg0.getY(), -1, arg0.getX());
        field5544++;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
    public final boolean method1317(int arg0) {
        if (arg0 != -117063712) {
            this.field5569 = -74;
        }
        field5567++;
        return (this.field5546 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5558++;
        this.method2411(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)Lhl;")
    public final class556 method1325(boolean arg0) {
        if (!arg0) {
            this.mouseExited(null);
        }
        field5560++;
        return (class556) this.field5545.method3584(23287);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIBI)V")
    public static final void method2414(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5565++;
        int var5 = class616.field8582;
        int var6 = class462.field6289;
        if (class618.field8597) {
            var5 += class146.method1175(-29909);
            var6 += class605.method3435((byte) -98);
        }
        if (arg3 != -11) {
            method2416(false);
        }
        if (class487.field6579 == 1) {
            class604 var7 = class761.field10487[class427.field5828 / 100];
            var7.method3430(var5 - 8, var6 - 8);
            class686.method3861(var5 - 8, var5 + -8 + var7.method224(), 22738, var6 - 8, var6 + -8 + var7.method218());
        }
        if (class487.field6579 == 2) {
            class604 var8 = class761.field10487[class427.field5828 / 100 + 4];
            var8.method3430(var5 - 8, var6 + -8);
            class686.method3861(var5 - 8, var8.method224() + var5 - 8, 22738, var6 - 8, var6 - 8 - -var8.method218());
        }
        class356.method2200(-103);
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(B)V")
    public static final void method2415(byte arg0) {
        field5563++;
        if (class630.field8751.field10241 && class97.field1526.field10374 != -1) {
            class682.method3844(111, class97.field1526.field10366, class97.field1526.field10374);
        }
        if (arg0 >= -79) {
            method2415((byte) -78);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I")
    public final int method1319(byte arg0) {
        if (arg0 != 126) {
            this.mouseReleased(null);
        }
        field5554++;
        return this.field5557;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(Z)V")
    public static void method2416(boolean arg0) {
        field5543 = null;
        field5548 = null;
        if (!arg0) {
            field5548 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public final synchronized void method1318(byte arg0) {
        this.field5555 = this.field5571;
        this.field5557 = this.field5568;
        this.field5546 = this.field5569;
        field5566++;
        class645 var2 = this.field5545;
        this.field5545 = this.field5570;
        this.field5570 = var2;
        this.field5570.method3590((byte) 45);
        if (arg0 >= -23) {
            method2415((byte) -5);
        }
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)V")
    private final void method2417(int arg0) {
        field5541++;
        if (arg0 < 59 || this.field5572 == null) {
            return;
        }
        this.field5572.removeMouseMotionListener(this);
        this.field5572.removeMouseListener(this);
        this.field5555 = this.field5557 = this.field5546 = 0;
        this.field5572 = null;
        this.field5571 = this.field5568 = this.field5569 = 0;
        this.field5545 = null;
        this.field5570 = null;
    }

    @OriginalMember(owner = "client!dda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5553++;
        int var2 = this.method2418(arg0, false);
        if ((this.field5569 & var2) == 0) {
            var2 = this.field5569;
        }
        if ((var2 & 0x1) != 0) {
            this.method2413(8, arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2413(8, arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2413(8, arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
        }
        this.field5569 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5550++;
        this.method2411(arg0.getY(), -1, arg0.getX());
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(B)I")
    public final int method1326(byte arg0) {
        field5556++;
        int var2 = -56 % ((62 - arg0) / 34);
        return this.field5555;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
    private final int method2418(MouseEvent arg0, boolean arg1) {
        field5561++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg1) {
            return 31;
        }
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

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)Z")
    public final boolean method1322(boolean arg0) {
        if (!arg0) {
            this.field5545 = null;
        }
        field5559++;
        return (this.field5546 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5547++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class404(Component arg0, boolean arg1) {
        this.method2412(102, arg0);
        this.field5573 = arg1;
    }
}
