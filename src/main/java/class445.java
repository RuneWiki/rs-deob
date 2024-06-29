import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class445 extends class597 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "Lok;")
    private class266 field6069 = new class266();

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "Lok;")
    private class266 field6078 = new class266();

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "Z")
    private boolean field6082;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "I")
    public static int field6050 = 0;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "[I")
    public static int[] field6065 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field6071 = -1;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
    private int field6060;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    private int field6067;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
    private int field6073;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
    private int field6076;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "I")
    private int field6079;

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
    private int field6080;

    @OriginalMember(owner = "client!hea", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field6081;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 4)
    private final int method2645(int arg0, MouseEvent arg1) {
        field6068++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != arg0;
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

    @OriginalMember(owner = "client!hea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 38)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field6059++;
        this.method2656(arg0.getX(), arg0.getY(), (byte) 97);
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)I", line = 47)
    public final int method2646(int arg0) {
        if (arg0 == 9) {
            field6063++;
            return this.field6067;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!hea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 60)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2656(arg0.getX(), arg0.getY(), (byte) -120);
        field6077++;
    }

    @OriginalMember(owner = "client!hea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 69)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6064++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 79)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6066++;
        int var2 = this.method2645(0, arg0);
        if ((var2 & this.field6079) == 0) {
            var2 = this.field6079;
        }
        if ((var2 & 0x1) != 0) {
            this.method2659(arg0.getY(), 3, arg0.getX(), true, arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2659(arg0.getY(), 5, arg0.getX(), true, arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2659(arg0.getY(), 4, arg0.getX(), true, arg0.getClickCount());
        }
        this.field6079 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Z", line = 110)
    public final boolean method2647(int arg0) {
        field6049++;
        if (arg0 <= 101) {
            return true;
        } else {
            return (this.field6060 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V", line = 122)
    private final void method2648(int arg0) {
        field6051++;
        if (this.field6081 == null) {
            return;
        }
        this.field6081.removeMouseMotionListener(this);
        this.field6081.removeMouseListener(this);
        this.field6069 = null;
        this.field6081 = null;
        this.field6080 = this.field6076 = this.field6079 = 0;
        this.field6078 = null;
        this.field6067 = this.field6073 = this.field6060 = arg0;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 141)
    private final void method2649(Component arg0, int arg1) {
        field6054++;
        if (arg1 != 3) {
            this.mouseDragged(null);
        }
        this.method2648(0);
        this.field6081 = arg0;
        this.field6081.addMouseListener(this);
        this.field6081.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)I", line = 157)
    public final int method2650(byte arg0) {
        field6074++;
        return arg0 >= -37 ? -61 : this.field6073;
    }

    @OriginalMember(owner = "client!hea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 170)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field6053++;
        this.method2656(arg0.getX(), arg0.getY(), (byte) 81);
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)Lrm;", line = 181)
    public final class430 method2651(int arg0) {
        field6061++;
        return arg0 == -2 ? (class430) this.field6069.method1736(0) : null;
    }

    @OriginalMember(owner = "client!hea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 197)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2656(arg0.getX(), arg0.getY(), (byte) -127);
        field6052++;
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V", line = 206)
    public final void method2652(int arg0) {
        this.method2648(0);
        if (arg0 != -30663) {
            this.mouseDragged(null);
        }
        field6048++;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z", line = 217)
    public final boolean method2653(byte arg0) {
        field6056++;
        int var2 = -23 / ((arg0 - 28) / 37);
        return (this.field6060 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V", line = 232)
    public static void method2654(boolean arg0) {
        if (!arg0) {
            field6055 = 69;
        }
        field6065 = null;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V", line = 246)
    public final synchronized void method2655(byte arg0) {
        this.field6067 = this.field6080;
        this.field6073 = this.field6076;
        field6046++;
        this.field6060 = this.field6079;
        class266 var2 = this.field6069;
        this.field6069 = this.field6078;
        this.field6078 = var2;
        if (arg0 <= 52) {
            this.method2647(2);
        }
        this.field6078.method1729((byte) 41);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIB)V", line = 268)
    private final void method2656(int arg0, int arg1, byte arg2) {
        this.field6080 = arg0;
        field6058++;
        this.field6076 = arg1;
        int var4 = 95 % ((arg2 + 73) / 47);
        if (this.field6082) {
            this.method2659(arg1, -1, arg0, true, 0);
        }
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)V", line = 285)
    public static final void method2657(int arg0) {
        field6072++;
        int var1 = -94 / ((arg0 + 53) / 34);
        for (class244 var2 = (class244) class87.field961.method2243((byte) 100); var2 != null; var2 = (class244) class87.field961.method2248(-15690)) {
            if (var2.field3625.method1955((byte) -89)) {
                class13.method140(-257, var2.field3628);
            } else {
                var2.field3625.method4197((byte) 38);
                try {
                    var2.field3625.method1960(false);
                } catch (Exception var6) {
                    class678.method3848("TV: " + var2.field3628, var6, false);
                    class13.method140(-257, var2.field3628);
                }
                if (!var2.field3632 && !var2.field3630) {
                    class731 var4 = var2.field3625.method1959(1);
                    if (var4 != null) {
                        class352 var5 = var4.method4087(true);
                        if (var5 != null) {
                            var5.method2237((byte) -88, var2.field3629);
                            class184.field2828.method424(var5);
                            var2.field3632 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)Z", line = 343)
    public final boolean method2658(int arg0) {
        field6070++;
        if (arg0 != -2) {
            this.field6076 = 114;
        }
        return (this.field6060 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 356)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6047++;
        int var2 = this.method2645(0, arg0);
        if (var2 == 1) {
            this.method2659(arg0.getY(), 0, arg0.getX(), true, arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2659(arg0.getY(), 2, arg0.getX(), true, arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2659(arg0.getY(), 1, arg0.getX(), true, arg0.getClickCount());
        }
        this.field6079 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 416)
    public class445(Component arg0, boolean arg1) {
        this.method2649(arg0, 3);
        this.field6082 = arg1;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIZI)V", line = 392)
    private final void method2659(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6075++;
        class601 var6 = new class601();
        var6.field8427 = arg4;
        var6.field8426 = arg1;
        if (arg3) {
            var6.field8430 = arg0;
            var6.field8433 = arg2;
            var6.field8420 = class459.method2731(107);
            this.field6078.method1727(var6, (byte) 69);
        }
    }
}
