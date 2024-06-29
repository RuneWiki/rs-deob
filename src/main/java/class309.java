import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class309 extends class666 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Lhga;")
    private class158 field4562 = new class158();

    @OriginalMember(owner = "client!on", name = "J", descriptor = "Lhga;")
    private class158 field4586 = new class158();

    @OriginalMember(owner = "client!on", name = "M", descriptor = "Z")
    private boolean field4589;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "J")
    public static long field4560 = 0L;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    private int field4582;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    private int field4585;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field4587;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[[[Z")
    public static boolean[][][] field4555;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
    public static final void method2016(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field4564++;
        int var1 = 0;
        if (class527.field7429.method1204((byte) 121, class90.field1654)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class527.field7429.field2656) {
            var1 |= 0x40;
        }
        class85.method854(var1, true);
        class237.field3521.method3518(var1, arg0 - 13460);
        class268.field3985.method250(var1, (byte) -121);
        class317.field4681.method804(var1, arg0 ^ 0xFFFFAA2F);
        class261.field3825.method1309(var1, 60);
        client.method1826((byte) 122, var1);
        class602.method3439(var1, 0);
        class6.method251(true, var1);
        class200.method1427((byte) 126, var1);
        class310.method2026((byte) 66);
    }

    @OriginalMember(owner = "client!on", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4569++;
        this.method2018(arg0.getX(), arg0.getY(), 32);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
    public final boolean method1924(int arg0) {
        if (arg0 < 22) {
            return true;
        } else {
            field4559++;
            return (this.field4582 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)I")
    public final int method1936(int arg0) {
        field4572++;
        return arg0 <= 124 ? -54 : this.field4579;
    }

    @OriginalMember(owner = "client!on", name = "h", descriptor = "(I)V")
    public static void method2017(int arg0) {
        field4555 = null;
        if (arg0 > -65) {
            method2016(-95);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)Lnm;")
    public final class441 method1933(byte arg0) {
        if (arg0 > -22) {
            this.method2023(106, null);
        }
        field4581++;
        return (class441) this.field4562.method1226(0);
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I")
    public final int method1931(int arg0) {
        field4578++;
        if (arg0 != -23081) {
            this.field4584 = -8;
        }
        return this.field4577;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
    private final void method2018(int arg0, int arg1, int arg2) {
        if (arg2 != 32) {
            return;
        }
        this.field4583 = arg0;
        field4574++;
        this.field4585 = arg1;
        if (this.field4589) {
            this.method2020(arg1, arg0, 0, -1, false);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public final void method1930(boolean arg0) {
        if (!arg0) {
            this.method2021((byte) 127);
            field4576++;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(III)I")
    public static final int method2019(int arg0, int arg1, int arg2) {
        field4561++;
        if (arg0 != 0) {
            field4560 = -70L;
        }
        return arg1 == 1 || arg1 == 3 ? class427.field6152[arg2 & 0x3] : class649.field9356[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
    public final synchronized void method1929(int arg0) {
        field4557++;
        if (arg0 != 97) {
            return;
        }
        this.field4577 = this.field4583;
        this.field4579 = this.field4585;
        this.field4582 = this.field4584;
        class158 var2 = this.field4562;
        this.field4562 = this.field4586;
        this.field4586 = var2;
        this.field4586.method1222((byte) -115);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIZ)V")
    private final void method2020(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4563++;
        class689 var6 = new class689();
        var6.field9745 = arg1;
        var6.field9744 = arg2;
        var6.field9742 = arg3;
        var6.field9743 = arg0;
        var6.field9741 = class525.method3074((byte) -101);
        this.field4586.method1229(var6, (byte) 120);
        if (arg4) {
            this.method1931(-106);
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(B)V")
    private final void method2021(byte arg0) {
        field4575++;
        if (this.field4587 == null) {
            return;
        }
        this.field4587.removeMouseMotionListener(this);
        this.field4587.removeMouseListener(this);
        this.field4577 = this.field4579 = this.field4582 = 0;
        this.field4583 = this.field4585 = this.field4584 = 0;
        this.field4562 = null;
        this.field4586 = null;
        if (arg0 >= 63) {
            this.field4587 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4566++;
        int var2 = this.method2023(-1, arg0);
        if (var2 == 1) {
            this.method2020(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0, false);
        } else if (var2 == 4) {
            this.method2020(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2, false);
        } else if (var2 == 2) {
            this.method2020(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1, false);
        }
        this.field4584 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!on", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4571++;
        int var2 = this.method2023(-1, arg0);
        if ((this.field4584 & var2) == 0) {
            var2 = this.field4584;
        }
        if ((var2 & 0x1) != 0) {
            this.method2020(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3, false);
        }
        if ((var2 & 0x4) != 0) {
            this.method2020(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5, false);
        }
        if ((var2 & 0x2) != 0) {
            this.method2020(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4, false);
        }
        this.field4584 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!on", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field4568++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2022(int arg0, Component arg1) {
        field4580++;
        int var3 = 65 / ((arg0 - 41) / 61);
        this.method2021((byte) 72);
        this.field4587 = arg1;
        this.field4587.addMouseListener(this);
        this.field4587.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)Z")
    public final boolean method1925(int arg0) {
        int var2 = -1 % ((arg0 + 50) / 45);
        field4588++;
        return (this.field4582 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!on", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2018(arg0.getX(), arg0.getY(), 32);
        field4565++;
    }

    @OriginalMember(owner = "client!on", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2018(arg0.getX(), arg0.getY(), 32);
        field4573++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Z")
    public final boolean method1934(byte arg0) {
        field4558++;
        if (arg0 != -40) {
            this.field4587 = null;
        }
        return (this.field4582 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!on", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2018(arg0.getX(), arg0.getY(), 32);
        field4567++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2023(int arg0, MouseEvent arg1) {
        field4570++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = ~(var3 & 0x4) != arg0;
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

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class309(Component arg0, boolean arg1) {
        this.method2022(-75, arg0);
        this.field4589 = arg1;
    }
}
