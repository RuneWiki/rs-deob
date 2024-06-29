import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class461 extends class325 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Lwo;")
    private class445 field6048 = new class445();

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Lwo;")
    private class445 field6054 = new class445();

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Z")
    private boolean field6061;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Lfn;")
    public static class286 field6037 = new class286();

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field6057 = -1;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private int field6045;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    private int field6049;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    private int field6051;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    private int field6052;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    private int field6056;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    private int field6059;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field6060;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIZI)V")
    private final void method2576(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6044++;
        class180 var6 = new class180();
        if (!arg3) {
            this.mouseReleased(null);
        }
        var6.field2526 = arg0;
        var6.field2530 = arg4;
        var6.field2528 = arg2;
        var6.field2520 = arg1;
        var6.field2523 = class529.method2982((byte) -69);
        this.field6054.method2507(var6, (byte) -128);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
    public final int method1890(int arg0) {
        if (arg0 == 16777215) {
            field6028++;
            return this.field6051;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILjava/lang/String;Lga;)Loca;")
    public static final class592 method2577(boolean arg0, int arg1, String arg2, class332 arg3) {
        field6030++;
        int var4 = arg3.method1959(5743, arg2);
        if (var4 == -1) {
            return new class592(0);
        }
        int[] var5 = arg3.method1954(arg1, var4);
        class592 var6 = new class592(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field8161) {
                class157 var9 = new class157(arg3.method1938(var5[var8++], var4, arg1 - 17));
                int var10 = var9.method908(false);
                int var11 = var9.method963(-118);
                int var12 = var9.method930(255);
                if (!arg0 && var12 == 1) {
                    var6.field8161--;
                } else {
                    var6.field8156[var7] = var10;
                    var6.field8163[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6033++;
        int var2 = this.method2582(-10788, arg0);
        if (var2 == 1) {
            this.method2576(arg0.getClickCount(), arg0.getX(), 0, true, arg0.getY());
        } else if (var2 == 4) {
            this.method2576(arg0.getClickCount(), arg0.getX(), 2, true, arg0.getY());
        } else if (var2 == 2) {
            this.method2576(arg0.getClickCount(), arg0.getX(), 1, true, arg0.getY());
        }
        this.field6056 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([SII)[S")
    public static final short[] method2578(short[] arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field6037 = null;
        }
        field6047++;
        short[] var3 = new short[arg2];
        class2.method11(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
    public static void method2579(int arg0) {
        if (arg0 != -334) {
            field6037 = null;
        }
        field6037 = null;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)I")
    public final int method1893(byte arg0) {
        field6029++;
        return arg0 <= 39 ? -100 : this.field6045;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
    private final void method2580(byte arg0, int arg1, int arg2) {
        field6041++;
        this.field6052 = arg2;
        if (arg0 <= -31) {
            this.field6059 = arg1;
            if (this.field6061) {
                this.method2576(0, arg1, -1, true, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)Z")
    public final boolean method1894(byte arg0) {
        field6050++;
        if (arg0 < 18) {
            return false;
        } else {
            return (this.field6049 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field6034++;
        this.method2580((byte) -126, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    public final void method1895(int arg0) {
        field6035++;
        if (arg0 == -20895) {
            this.method2584(1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method2581(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field6032++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class535.field7354 + ((class17.field219 - class535.field7354) * var8 / 100);
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg5 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class240.field3176[var11] * -var10 >> 14;
            var15 = class240.field3177[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class240.field3176[var12] * var15 >> 14;
            var15 = class240.field3177[var12] * var15 >> 14;
        }
        class148.field1986 = arg3 - var14;
        class558.field7615 = arg5;
        class604.field8440 = arg1;
        class82.field946 = arg6 - var13;
        class147.field1980 = arg0 - var15;
        if (arg4 != 103) {
            method2577(false, 111, null, null);
        }
        class660.field9416 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2582(int arg0, MouseEvent arg1) {
        field6043++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (arg0 != -10788) {
            return -78;
        }
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

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final synchronized void method1888(int arg0) {
        this.field6045 = this.field6052;
        field6031++;
        this.field6049 = this.field6056;
        this.field6051 = this.field6059;
        class445 var2 = this.field6048;
        this.field6048 = this.field6054;
        if (arg0 > -99) {
            this.field6061 = true;
        }
        this.field6054 = var2;
        this.field6054.method2512(-11558);
    }

    @OriginalMember(owner = "client!pi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6058++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Z")
    public final boolean method1891(int arg0) {
        field6046++;
        if (arg0 != 8) {
            this.mouseClicked(null);
        }
        return (this.field6049 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!pi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field6027++;
        this.method2580((byte) -112, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!pi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6036++;
        int var2 = this.method2582(-10788, arg0);
        if ((this.field6056 & var2) == 0) {
            var2 = this.field6056;
        }
        if ((var2 & 0x1) != 0) {
            this.method2576(arg0.getClickCount(), arg0.getX(), 3, true, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2576(arg0.getClickCount(), arg0.getX(), 5, true, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2576(arg0.getClickCount(), arg0.getX(), 4, true, arg0.getY());
        }
        this.field6056 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2580((byte) -67, arg0.getX(), arg0.getY());
        field6038++;
    }

    @OriginalMember(owner = "client!pi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2580((byte) -68, arg0.getX(), arg0.getY());
        field6042++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2583(Component arg0, int arg1) {
        field6040++;
        this.method2584(1);
        int var3 = 112 % ((arg1 - 20) / 48);
        this.field6060 = arg0;
        this.field6060.addMouseListener(this);
        this.field6060.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
    private final void method2584(int arg0) {
        field6039++;
        if (this.field6060 == null) {
            return;
        }
        this.field6060.removeMouseMotionListener(this);
        this.field6060.removeMouseListener(this);
        this.field6051 = this.field6045 = this.field6049 = 0;
        this.field6060 = null;
        this.field6048 = null;
        this.field6054 = null;
        this.field6059 = this.field6052 = this.field6056 = 0;
        if (arg0 != 1) {
            this.method2582(-27, null);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Z")
    public final boolean method1887(byte arg0) {
        if (arg0 == 69) {
            field6053++;
            return (this.field6049 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)Lll;")
    public final class294 method1886(boolean arg0) {
        field6055++;
        if (!arg0) {
            this.method2582(102, null);
        }
        return (class294) this.field6048.method2502((byte) 51);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class461(Component arg0, boolean arg1) {
        this.method2583(arg0, 110);
        this.field6061 = arg1;
    }
}
