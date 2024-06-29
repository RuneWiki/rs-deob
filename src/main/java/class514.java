import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class514 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lhn;")
    private class509 field7472 = new class509(128);

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lfo;")
    private class361 field7478;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lwq;")
    public static class115 field7477 = new class115(6, 2);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3065(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7475++;
        if (class372.method2199(99, arg3)) {
            class60.method364(arg0, arg1, arg2, arg4, class339.field4491[arg3], (byte) -126);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZII)V")
    public static final void method3066(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field7479++;
        if (!arg2 && class126.field1634 == arg1 && class293.field3882 == arg3 && class253.field3369 == class210.field2808 || class319.field4256.method1738(0, class20.field183)) {
            return;
        }
        class126.field1634 = arg1;
        class293.field3882 = arg3;
        class253.field3369 = class210.field2808;
        if (class319.field4256.method1738(arg4, class20.field183)) {
            class253.field3369 = 0;
        }
        class57.method345(1, arg0);
        class31.method176(true, class225.field3028, class279.field3703.method1823(class374.field5072, (byte) -88), arg4 + 85);
        int var5 = class357.field4867;
        int var6 = class418.field6074;
        class357.field4867 = (class126.field1634 - (class308.field4128 >> 4)) * 8;
        class418.field6074 = (class293.field3882 - (class426.field6200 >> 4)) * 8;
        class200.field2662 = class416.method2574(class126.field1634 * 8, class293.field3882 * 8);
        class212.field2884 = null;
        int var7 = class357.field4867 - var5;
        int var8 = class418.field6074 - var6;
        if (arg0 == 10) {
            for (int var15 = 0; var15 < 32768; var15++) {
                class22 var23 = class339.field4484[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field1249[var24] -= var7;
                        var23.field1251[var24] -= var8;
                    }
                    var23.field3704 -= var7 * 128;
                    var23.field3694 -= var8 * 128;
                }
            }
        } else {
            class401.field5813 = 0;
            int var9 = class308.field4128 * 128 - 128;
            int var10 = (class426.field6200 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class22 var12 = class339.field4484[var11];
                if (var12 != null) {
                    var12.field3704 -= var7 * 128;
                    var12.field3694 -= var8 * 128;
                    if (var12.field3704 >= 0 && var9 >= var12.field3704 && var12.field3694 >= 0 && var12.field3694 <= var10) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field1249[var14] -= var7;
                            var12.field1251[var14] -= var8;
                            if (var12.field1249[var14] < 0 || class308.field4128 <= var12.field1249[var14] || var12.field1251[var14] < 0 || var12.field1251[var14] >= class426.field6200) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class337.field4465[class401.field5813++] = var11;
                        } else {
                            class339.field4484[var11].method124(true, null);
                            class339.field4484[var11] = null;
                        }
                    } else {
                        class339.field4484[var11].method124(true, null);
                        class339.field4484[var11] = null;
                    }
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class531 var21 = class29.field272[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1249[var22] -= var7;
                    var21.field1251[var22] -= var8;
                }
                var21.field3704 -= var7 * 128;
                var21.field3694 -= var8 * 128;
            }
        }
        class523[] var17 = class497.field7241;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class523 var20 = var17[var18];
            if (var20 != null) {
                var20.field7687 -= var8 * 128;
                var20.field7692 -= var7 * 128;
            }
        }
        class209.method1330(var8, var7, 0);
        for (class263 var19 = (class263) class366.field4995.method970(arg4 ^ 0xC); var19 != null; var19 = (class263) class366.field4995.method976((byte) 71)) {
            var19.field3534 -= var7;
            var19.field3527 -= var8;
            if (class116.field1512 != 3 && (var19.field3534 < 0 || var19.field3527 < 0 || var19.field3534 >= class308.field4128 || class426.field6200 <= var19.field3527)) {
                var19.method2674(true);
            }
        }
        if (class234.field3122 != 0) {
            class234.field3122 -= var7;
            class417.field6028 -= var8;
        }
        class273.method1661((byte) -77);
        if (arg0 != 10) {
            class139.field1857 -= var8 * 128;
            class527.field7740 -= var7;
            class168.field2177 -= var8;
            class95.field1149 -= var7;
            class15.field158 -= var8;
            class238.field3171 -= var7 * 128;
            if (Math.abs(var7) > class308.field4128 || Math.abs(var8) > class426.field6200) {
                class451.method2797((byte) 47);
            }
        } else if (class47.field491 == 4) {
            class200.field2665 -= var7 * 128;
            class412.field5886 -= var7 * 128;
            class492.field7214 -= var8 * 128;
            class299.field3936 -= var8 * 128;
        } else {
            class47.field491 = 1;
        }
        class126.method762((byte) 121);
        class212.method1356(-1);
        class65.field740.method984(false);
        class116.field1514.method984(false);
        class292.field3862.method283(28837);
        method3067((byte) -57);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    private static final void method3067(byte arg0) {
        field7474++;
        class519.field7654 = new class363(8);
        class81.field988 = 0;
        if (arg0 == -57) {
            for (class46 var1 = (class46) class508.field7360.method290(-1); var1 != null; var1 = (class46) class508.field7360.method284(arg0 ^ 0xFFFFD63B)) {
                var1.method264();
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)Llh;")
    public final class368 method3068(byte arg0, int arg1) {
        field7473++;
        class509 var3 = this.field7472;
        class368 var4;
        synchronized (this.field7472) {
            var4 = (class368) this.field7472.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7478.method2130(class502.method3010(-10806, arg1), class41.method242((byte) -44, arg1), -91);
        class368 var6 = new class368();
        if (var5 != null) {
            var6.method2186(new class396(var5), 104);
        }
        if (arg0 > -25) {
            return null;
        }
        class509 var7 = this.field7472;
        synchronized (this.field7472) {
            this.field7472.method3046((long) arg1, var6, 1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public static void method3069(int arg0) {
        field7477 = null;
        if (arg0 != 128) {
            method3069(-74);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class514(class104 arg0, int arg1, class361 arg2) {
        this.field7478 = arg2;
        if (this.field7478 != null) {
            int var4 = this.field7478.method2138(-1) - 1;
            this.field7478.method2136(-103, var4);
        }
    }
}
