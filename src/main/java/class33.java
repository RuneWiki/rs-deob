import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 extends class577 {

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "Lfba;")
    public static class27 field432 = new class27(20, 8);

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "Lbu;")
    public static class21 field435 = new class21(91, 2);

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!mca", name = "A", descriptor = "[Ljd;")
    public static class241[] field447;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        field446++;
        if (arg0 > -72) {
            field447 = null;
        }
        return (this.field441 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)I")
    public final int method267(byte arg0) {
        field444++;
        return arg0 < 112 ? -80 : class447.method2665(-29242421, this.field441);
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(B)Z")
    public final boolean method268(byte arg0) {
        if (arg0 != 60) {
            method275(-110, -37, -98);
        }
        field436++;
        return (this.field441 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
    public static void method269(int arg0) {
        field435 = null;
        field447 = null;
        if (arg0 > -36) {
            field432 = null;
        }
        field432 = null;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
    public static final void method270(int arg0) {
        field445++;
        if (class161.field2561 != null) {
            return;
        }
        int var1 = class270.field3918;
        int var2 = class423.field5786;
        int var3 = class179.field2787 - class428.field5825 - var1;
        int var4 = class63.field759 - class714.field9895 - var2;
        if (arg0 >= var1 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class384.field5278 != null) {
                var5 = class384.field5278;
            } else if (class319.field4527 == null) {
                var5 = class742.field10293;
            } else {
                var5 = class319.field4527;
            }
            int var6 = 0;
            int var7 = 0;
            if (class384.field5278 == var5) {
                Insets var8 = class384.field5278.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class63.field759);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class179.field2787, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class179.field2787 + var6 - var3, var7, var3, class63.field759);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class63.field759 + var7 - var4, class179.field2787, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)I")
    public final int method271(int arg0) {
        if (arg0 != 1745399410) {
            this.method266(-34);
        }
        field439++;
        return this.field441 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIZI)V")
    public static final void method272(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field438++;
        if (class763.field10520 != 1) {
            return;
        }
        int var5 = arg0 / class103.field1192;
        int var6 = arg4 / class103.field1192;
        int var7 = arg1 / class373.field5148;
        int var8 = arg2 / class373.field5148;
        if (class703.field9803 <= var5 || var6 < 0 || var7 >= class422.field5771 || var8 < 0) {
            return;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class703.field9803 <= var6) {
            var6 = class703.field9803 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var8 >= class422.field5771) {
            var8 = class422.field5771 - 1;
        }
        int var9 = var7;
        if (arg3) {
            return;
        }
        while (var8 >= var9) {
            int var10 = class37.method290(class793.field10902 + var9, class422.field5771, -1365732769) * class703.field9803;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class37.method290(class725.field10028 + var11, class703.field9803, -1365732769);
                class641.field8975[var12] = class601.field8432;
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
    public static final void method273(boolean arg0) {
        if (arg0) {
            class767.field10562 = class356.field5006;
            class208.field3219 = class774.field10642;
        } else {
            class767.field10562 = class385.field5312;
            class208.field3219 = class411.field5572;
        }
        class562.field7990 = class767.field10562.length;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;I)Lha;")
    public static final class65 method274(int arg0, Canvas arg1, int arg2, class160 arg3, int arg4) {
        int var5 = -15 / ((-arg0 - 22) / 33);
        field443++;
        return new class609(arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)I")
    public static final int method275(int arg0, int arg1, int arg2) {
        field434++;
        if (arg0 != 9627) {
            field435 = null;
        }
        byte var3;
        if (arg2 > 20000) {
            class563.method3322((byte) 40);
            var3 = 4;
        } else if (arg2 > 10000) {
            class424.method2567(0);
            var3 = 3;
        } else if (arg2 > 5000) {
            var3 = 2;
            class474.method2821(arg0 ^ 0x25EA);
        } else {
            var3 = 1;
            class142.method1016(53, true);
        }
        if (class21.field353.field10098.method1588(-105) != arg1) {
            class21.field353.method4080(true, class21.field353.field10076, arg1);
            class9.method61(arg1, false, (byte) -40);
        }
        class580.method3397((byte) 13);
        return var3;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(II)V")
    public class33(int arg0, int arg1) {
        this.field441 = arg0;
        this.field442 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        field440++;
        if (arg1 == 0) {
            return (this.field441 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        field433++;
        if (arg0 != 323119221) {
            this.field441 = -121;
        }
        return ((this.field441 & 0x202EC8) >> 21) != 0;
    }
}
