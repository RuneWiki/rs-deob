import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class236 {

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public int field3207 = 8;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public int field3211 = 16777215;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Lng;")
    public static class190 field3212 = new class190(64);

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "J")
    public static long field3218 = 0L;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field3214 = -1;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field3216 = -1;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "B")
    public static byte field3217;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "Lmq;")
    public static class295 field3213;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "Lvm;")
    public static class407 field3215;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
    public boolean field3199;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 4)
    public static void method1484(byte arg0) {
        field3215 = null;
        if (arg0 <= -64) {
            field3212 = null;
            field3213 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Leb;II)V", line = 20)
    public final void method1485(class371 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2429(arg1);
            if (var4 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field3200++;
                return;
            }
            this.method1487((byte) -98, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 43)
    public static final void method1486(int arg0) {
        field3209++;
        if (class227.field3044 != null) {
            return;
        }
        int var1 = class364.field5104;
        int var2 = class63.field985;
        int var3 = class33.field502 - var1 - class194.field2696;
        if (arg0 != -830) {
            field3217 = -42;
        }
        int var4 = class358.field5043 - class243.field3359 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class393.field5746 == null) {
                var5 = class204.field2772.field4888;
            } else {
                var5 = class393.field5746;
            }
            int var6 = 0;
            int var7 = 0;
            if (class393.field5746 == var5) {
                Insets var8 = class393.field5746.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class358.field5043);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class33.field502, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class33.field502 - var3, var7, var3, class358.field5043);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 - (var4 - class358.field5043), class33.field502, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BILeb;I)V", line = 111)
    private final void method1487(byte arg0, int arg1, class371 arg2, int arg3) {
        if (arg0 != -98) {
            return;
        }
        field3203++;
        if (arg1 == 1) {
            this.field3207 = arg2.method2403((byte) 73);
        } else if (arg1 == 2) {
            this.field3199 = true;
        } else if (arg1 == 3) {
            this.field3210 = arg2.method2378(-1);
            this.field3202 = arg2.method2378(-1);
            this.field3206 = arg2.method2378(-1);
        } else if (arg1 == 4) {
            this.field3204 = arg2.method2429(0);
        } else if (arg1 == 5) {
            this.field3208 = arg2.method2403((byte) 73);
        } else if (arg1 == 6) {
            this.field3211 = arg2.method2425(72);
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZZ)V", line = 159)
    public static final void method1488(byte arg0, boolean arg1, boolean arg2) {
        field3205++;
        int var3 = -88 % ((arg0 - 12) / 62);
        if (arg1) {
            class41.field614--;
            if (class41.field614 == 0) {
                class176.field2483 = null;
            }
        }
        if (!arg2) {
            return;
        }
        class154.field2170--;
        if (class154.field2170 == 0) {
            class293.field4057 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILrg;II)V", line = 195)
    public static final void method1489(int arg0, class383 arg1, int arg2, int arg3) {
        if (arg3 > -95) {
            field3213 = null;
        }
        field3201++;
        class249.field3453 = arg2;
        class196.field2706 = arg1;
        class221.field2917 = arg0;
    }
}
