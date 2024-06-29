import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Lfc;")
    private class174 field320 = new class174(128);

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Loi;")
    private class53 field322;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "S")
    public static short field313 = 205;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "Z")
    public static boolean field318 = false;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[[S")
    public static short[][] field319 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "Lam;")
    public static class455 field317 = new class455();

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 8)
    public static void method165(boolean arg0) {
        field319 = null;
        field317 = null;
        if (!arg0) {
            field319 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 21)
    public static final void method166(byte arg0) {
        field321++;
        if (class258.field3835 != null) {
            return;
        }
        int var1 = class205.field2971;
        int var2 = -2 / ((arg0 + 35) / 49);
        int var3 = class226.field3256;
        int var4 = class47.field542 - var1 - class147.field1956;
        int var5 = class285.field4177 - class273.field4048 - var3;
        if (var1 <= 0 && var4 <= 0 && var3 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class81.field1052 == null) {
                var6 = class268.field3914.field2165;
            } else {
                var6 = class81.field1052;
            }
            int var7 = 0;
            int var8 = 0;
            if (class81.field1052 == var6) {
                Insets var9 = class81.field1052.getInsets();
                var8 = var9.top;
                var7 = var9.left;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
                var10.fillRect(var7, var8, var1, class285.field4177);
            }
            if (var3 > 0) {
                var10.fillRect(var7, var8, class47.field542, var3);
            }
            if (var4 > 0) {
                var10.fillRect(var7 + class47.field542 - var4, var8, var4, class285.field4177);
            }
            if (var5 > 0) {
                var10.fillRect(var7, var8 + class285.field4177 - var5, class47.field542, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIBII)I", line = 91)
    public static final int method167(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field315++;
        if (arg2 <= 109) {
            return 89;
        } else {
            int var5 = arg4 & 0xF;
            int var6 = var5 >= 8 ? arg3 : arg1;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg0) : arg3;
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z", line = 110)
    public static final boolean method168(int arg0, int arg1) {
        field316++;
        if (arg1 != 205) {
            method168(-5, 93);
        }
        if (arg0 == 30 || arg0 == 16 || arg0 == 48 || arg0 == 3 || arg0 == 22) {
            return true;
        } else {
            return arg0 == 46 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)Loa;", line = 129)
    public final class500 method169(int arg0, int arg1) {
        field314++;
        class174 var3 = this.field320;
        class500 var4;
        synchronized (this.field320) {
            var4 = (class500) this.field320.method1088((long) arg0, (byte) 94);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field322.method426(class389.method2258(arg0, -77), (byte) 9, class470.method2723(-20101, arg0));
        class500 var6 = new class500();
        if (var5 != null) {
            var6.method2904(new class403(var5), (byte) -89);
        }
        class174 var7 = this.field320;
        synchronized (this.field320) {
            this.field320.method1097(19627, var6, (long) arg0);
            if (arg1 != 21830) {
                this.method169(-59, -31);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZLfp;Lvl;ILza;Ljd;)V", line = 164)
    public static final void method170(int arg0, int arg1, boolean arg2, class216 arg3, class11 arg4, int arg5, class290 arg6, class156 arg7) {
        field323++;
        int var8 = arg3.field3127 - (arg0 / 2) - 5;
        int var9 = arg1 + 2;
        if (arg7.field2345 != 0) {
            arg6.method1794(arg0 + 10, var9, arg7.field2345, arg5 * arg4.method66() + arg1 + 1 - var9, 99, var8);
        }
        if (arg7.field2340 != 0) {
            arg6.method1795(var9, (byte) -77, arg0 + 10, -var9 + 1 + (arg1 - -(arg4.method66() * arg5)), arg7.field2340, var8);
        }
        int var10 = arg7.field2342;
        if (arg3.field3129 && arg7.field2347 != -1) {
            var10 = arg7.field2347;
        }
        int var11 = 0;
        if (!arg2) {
            field324 = -95;
        }
        while (var11 < arg5) {
            String var12 = class286.field4188[var11];
            if (var11 < (arg5 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg4.method61(arg6, var12, arg3.field3127, arg1, var10, true);
            arg1 += arg4.method66();
            var11++;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 219)
    public class26(class205 arg0, int arg1, class53 arg2) {
        this.field322 = arg2;
        if (this.field322 != null) {
            int var4 = this.field322.method434(26154) - 1;
            this.field322.method435(var4, 0);
        }
    }
}
