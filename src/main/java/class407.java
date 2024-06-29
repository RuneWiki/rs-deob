import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class407 extends class230 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "Lcf;")
    private class92 field5553 = new class92();

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "Lcf;")
    private class92 field5574 = new class92();

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "Z")
    private boolean field5580;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Lhf;")
    public static class445 field5563 = null;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "Lrc;")
    public static class108 field5552 = new class108(66, 3);

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    private int field5557;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
    private int field5569;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "I")
    private int field5573;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    private int field5575;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    private int field5578;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "Llm;")
    public static class26 field5577;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field5579;

    @OriginalMember(owner = "client!jt", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5554++;
        this.field5575 = -1;
        this.field5573 = -1;
    }

    @OriginalMember(owner = "client!jt", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2441(arg0, (byte) -126);
        field5560++;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lup;IIIII)V")
    public static final void method2434(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4700 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class221.field3191[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class87 var13 = class357.field4906[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field4700; var14++) {
                            if (arg0.field4699[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field4699[arg0.field4700++] = var13;
                        if (arg0.field4700 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field4700; var15 < 4; var15++) {
            arg0.field4699[var15] = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5548++;
        int var2 = this.method2436(arg0, (byte) -100);
        if (var2 == 1) {
            this.method2435(0, arg0.getX(), 0, arg0.getY());
        } else if (var2 == 4) {
            this.method2435(2, arg0.getX(), 0, arg0.getY());
        } else if (var2 == 2) {
            this.method2435(1, arg0.getX(), 0, arg0.getY());
        }
        this.field5578 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIII)V")
    private final void method2435(int arg0, int arg1, int arg2, int arg3) {
        field5555++;
        class122 var5 = new class122();
        var5.field1663 = arg0;
        var5.field1670 = arg1;
        var5.field1661 = arg3;
        if (arg2 != 0) {
            this.method2437((Component) null, 117);
        }
        var5.field1666 = class10.method51(arg2 ^ 0xFFFFF391);
        this.field5574.method766(var5, arg2 - 1);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public final synchronized void method1616(int arg0) {
        this.field5569 = this.field5578;
        this.field5557 = this.field5575;
        field5565++;
        this.field5561 = this.field5573;
        class92 var2 = this.field5553;
        if (arg0 != 9001) {
            this.field5573 = 107;
        }
        this.field5553 = this.field5574;
        this.field5574 = var2;
        this.field5574.method773(-1568);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method2436(MouseEvent arg0, byte arg1) {
        field5576++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        }
        if (arg1 > -97) {
            this.mouseReleased((MouseEvent) null);
        }
        if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2437(Component arg0, int arg1) {
        this.method2439(0);
        if (arg1 >= -9) {
            this.field5553 = null;
        }
        field5551++;
        this.field5579 = arg0;
        this.field5579.addMouseListener(this);
        this.field5579.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
    public static void method2438(byte arg0) {
        field5577 = null;
        field5552 = null;
        if (arg0 != -123) {
            method2440(-60, 95, -35, -6);
        }
        field5563 = null;
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(Z)V")
    public final void method1626(boolean arg0) {
        if (arg0) {
            this.field5573 = 40;
        }
        field5559++;
        this.method2439(0);
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
    private final void method2439(int arg0) {
        field5570++;
        if (this.field5579 == null) {
            return;
        }
        this.field5579.removeMouseListener(this);
        this.field5579.removeMouseMotionListener(this);
        this.field5579 = null;
        this.field5561 = this.field5557 = this.field5569 = arg0;
        this.field5573 = this.field5575 = this.field5578 = 0;
        this.field5553 = null;
        this.field5574 = null;
    }

    @OriginalMember(owner = "client!jt", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5550++;
        this.method2441(arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(IIII)I")
    public static final int method2440(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -16490) {
            field5552 = null;
        }
        field5571++;
        if (class340.field4692 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || (class36.field388 - 1) < var4 || (class68.field998 - 1) < var5) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class372.field5120[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class340.field4692[var6].method590(arg0, arg2);
    }

    @OriginalMember(owner = "client!jt", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5564++;
        int var2 = this.method2436(arg0, (byte) -118);
        if ((this.field5578 & var2) == 0) {
            var2 = this.field5578;
        }
        if ((var2 & 0x1) != 0) {
            this.method2435(3, arg0.getX(), 0, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2435(5, arg0.getX(), 0, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2435(4, arg0.getX(), 0, arg0.getY());
        }
        this.field5578 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jt", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5549++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)Z")
    public final boolean method1624(int arg0) {
        field5558++;
        if (arg0 == 44) {
            return (this.field5569 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)I")
    public final int method1625(byte arg0) {
        field5567++;
        if (arg0 >= -127) {
            this.field5553 = null;
        }
        return this.field5561;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)Z")
    public final boolean method1619(int arg0) {
        if (arg0 != 44) {
            this.mouseEntered((MouseEvent) null);
        }
        field5547++;
        return (this.field5569 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
    private final void method2441(MouseEvent arg0, byte arg1) {
        this.field5573 = arg0.getX();
        field5566++;
        this.field5575 = arg0.getY();
        if (arg1 != -126) {
            this.method1618(true);
        }
        if (this.field5580) {
            this.method2435(-1, arg0.getX(), 0, arg0.getY());
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(Z)Ljm;")
    public final class271 method1622(boolean arg0) {
        if (!arg0) {
            this.method2437((Component) null, -88);
        }
        field5562++;
        return (class271) this.field5553.method776((byte) 102);
    }

    @OriginalMember(owner = "client!jt", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5572++;
        this.method2441(arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
    public final int method1617(boolean arg0) {
        if (arg0) {
            this.method1624(104);
        }
        field5556++;
        return this.field5557;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class407(Component arg0, boolean arg1) {
        this.method2437(arg0, -105);
        this.field5580 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)Z")
    public final boolean method1618(boolean arg0) {
        if (!arg0) {
            this.field5579 = null;
        }
        field5568++;
        return (this.field5569 & 0x1) != 0;
    }
}
