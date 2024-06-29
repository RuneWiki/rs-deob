import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class268 {

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "C")
    public char field3880;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "Lpja;")
    public static class171 field3884;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIII)I")
    public static final int method1746(int arg0, int arg1, int arg2, int arg3) {
        field3887++;
        int var4 = arg3 / arg1;
        int var5 = arg1 - 1 & arg3;
        if (arg2 != 904) {
            return -89;
        }
        int var6 = arg0 / arg1;
        int var7 = arg0 & arg1 - 1;
        int var8 = class408.method2496(var6, -124, var4);
        int var9 = class408.method2496(var6, -128, var4 + 1);
        int var10 = class408.method2496(var6 + 1, arg2 ^ 0xFFFFFC1C, var4);
        int var11 = class408.method2496(var6 + 1, -91, var4 + 1);
        int var12 = class285.method1882(-1065, var9, var5, var8, arg1);
        int var13 = class285.method1882(-1065, var11, var5, var10, arg1);
        return class285.method1882(-1065, var13, var7, var12, arg1);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lgga;IB)V")
    private final void method1747(class511 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3880 = class395.method2438(arg0.method3030(arg2 ^ 0x653E), -128);
        } else if (arg1 == 2) {
            this.field3883 = arg0.method3002(-1);
            this.field3888 = arg0.method3013(105);
            this.field3890 = arg0.method3013(-105);
        }
        field3881++;
        if (arg2 != -66) {
            method1750(-100);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lgga;I)V")
    public final void method1748(class511 arg0, int arg1) {
        field3885++;
        if (arg1 != -1) {
            field3884 = null;
        }
        while (true) {
            int var3 = arg0.method3013(79);
            if (var3 == 0) {
                return;
            }
            this.method1747(arg0, var3, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3882++;
        int var6 = class436.method2621(arg3, class474.field6576, class727.field10060, 512);
        int var7 = class436.method2621(arg1, class474.field6576, class727.field10060, 512);
        int var8 = class436.method2621(arg0, class627.field8783, class177.field2236, 512);
        int var9 = class436.method2621(arg5, class627.field8783, class177.field2236, 512);
        for (int var10 = var6; var10 <= var7; var10++) {
            class128.method883(arg4, var8, var9, class705.field9804[var10], 7);
        }
        if (arg2 <= 70) {
            field3884 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public static void method1750(int arg0) {
        field3884 = null;
        if (arg0 != -1) {
            field3886 = -98;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "()V")
    public static final void method1751() {
        byte var0 = 10;
        byte var1 = 30;
        if (class275.field3979 == 0 || class221.field3032 == null) {
            return;
        }
        class139.field1781.method160(class446.field6255);
        for (int var2 = 0; var2 < class362.field5227.length; var2++) {
            class139.field1781.method2811(class718.field9947[var2] + class362.field5227[var2], class446.field6255[1], (byte) 125, class446.field6255[3] - class446.field6255[1], -256);
        }
        for (int var3 = 0; var3 < class197.field2782; var3++) {
            class532 var11 = class356.field5133[var3];
            class139.field1781.method196(var11.field7325[0], var11.field7322[0], var11.field7318[0], class489.field6730);
            class139.field1781.method196(var11.field7325[1], var11.field7322[1], var11.field7318[1], class484.field6702);
            class139.field1781.method196(var11.field7325[2], var11.field7322[2], var11.field7318[2], class601.field8411);
            class139.field1781.method196(var11.field7325[3], var11.field7322[3], var11.field7318[3], class267.field3877);
            if (class489.field6730[2] != -1 && class484.field6702[2] != -1 && class601.field8411[2] != -1 && class267.field3877[2] != -1) {
                int var12 = -65536;
                if (var11.field7319 == 4) {
                    var12 = -16776961;
                }
                class139.field1781.method2813(class484.field6702[0], class489.field6730[0], false, var12, class484.field6702[1], class489.field6730[1]);
                class139.field1781.method2813(class601.field8411[0], class484.field6702[0], false, var12, class601.field8411[1], class484.field6702[1]);
                class139.field1781.method2813(class267.field3877[0], class601.field8411[0], false, var12, class267.field3877[1], class601.field8411[1]);
                class139.field1781.method2813(class489.field6730[0], class267.field3877[0], false, var12, class489.field6730[1], class267.field3877[1]);
                class139.field1781.method2813(class601.field8411[0], class489.field6730[0], false, var12, class601.field8411[1], class489.field6730[1]);
            }
        }
        class221.field3032.method2653(var1 + 45, 111, -256, -16777216, var0, "Dynamic: " + class586.field8275 + "/" + 5000);
        class221.field3032.method2653(var1 + 60, 112, -256, -16777216, var0, "Total Opaque Onscreen: " + class74.field827 + "/" + 10000);
        class221.field3032.method2653(var1 + 75, 85, -256, -16777216, var0, "Total Trans Onscreen: " + class565.field7980 + "/" + 5000);
        class221.field3032.method2653(var1 + 90, 123, -256, -16777216, var0, "Occluders: " + (class752.field10378 + class293.field4304) + " Active: " + class197.field2782);
        class221.field3032.method2653(var1 + 105, 120, -256, -16777216, var0, "Occluded: Ground:" + class109.field1316 + " Walls: " + class759.field10431 + " CPs: " + class329.field4619 + " Pixels: " + class380.field5448);
        class221.field3032.method2653(var1 + 120, 123, -256, -16777216, var0, "Occlude Calc Took: " + class555.field7686 / 1000L + "us");
        if (class275.field3979 != 2 || class130.field1683 == null) {
            return;
        }
        for (int var4 = 0; var4 < class130.field1683.length; var4++) {
            float var6 = (float) class130.field1683[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class130.field1683[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class318 var5 = class139.field1781.method2815(class130.field1683, (byte) -39, class516.field7079, class258.field3793, class516.field7079, 0);
        var5.method746(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IZII)I")
    public static final int method1752(int arg0, boolean arg1, int arg2, int arg3) {
        field3879++;
        if (arg1) {
            method1752(55, false, 91, 100);
        }
        if (arg0 == arg2) {
            return arg0;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * var4 + (arg2 & 0x7F) * arg3 >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg2 & 0x380) * arg3 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg3 >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZI)V")
    public static final void method1753(boolean arg0, int arg1) {
        class457.field6394 = arg1;
        field3889++;
        class160.field2064 = 100;
        if (!arg0) {
            class202.field2840 = 3;
            class95.field1108 = -1;
        }
    }
}
