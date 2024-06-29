import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class587 extends class498 {

    @OriginalMember(owner = "client!via", name = "m", descriptor = "I")
    private int field8301;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    private int field8307;

    @OriginalMember(owner = "client!via", name = "l", descriptor = "I")
    private int field8300;

    @OriginalMember(owner = "client!via", name = "p", descriptor = "I")
    private int field8304;

    @OriginalMember(owner = "client!via", name = "w", descriptor = "Lke;")
    public static class622 field8311 = new class622(126, -2);

    @OriginalMember(owner = "client!via", name = "x", descriptor = "Ljo;")
    public static class351 field8312 = new class351(55, 2);

    @OriginalMember(owner = "client!via", name = "y", descriptor = "I")
    public static int field8313 = 0;

    @OriginalMember(owner = "client!via", name = "k", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!via", name = "n", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!via", name = "o", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "Lcb;")
    public static class544 field8308;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
    public static void method3402(int arg0) {
        field8312 = null;
        field8311 = null;
        field8308 = null;
        if (arg0 != -3) {
            method3405(-75, -65, false, (String) null, -79);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(BII[I[J)V")
    public static final void method3403(byte arg0, int arg1, int arg2, int[] arg3, long[] arg4) {
        if (arg0 != 16) {
            field8312 = null;
        }
        ++field8306;
        if (~arg1 < ~arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = ~var7 != Long.MIN_VALUE ? 1 : 0;
            for (int var11 = arg2; ~var11 > ~arg1; ++var11) {
                if (~(var7 - -((long) (var10 & var11))) < ~arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method3403((byte) 16, var6 + -1, arg2, arg3, arg4);
            method3403((byte) 16, arg1, var6 + 1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(III)V")
    public final void method160(int arg0, int arg1, int arg2) {
        ++field8299;
        if (arg0 != -1) {
            field8308 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II)I")
    public static final int method3404(int arg0, int arg1) {
        ++field8309;
        if (arg1 >= -46) {
            method3405(-19, 117, true, (String) null, 27);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
    public static final void method3405(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
        ++field8302;
        class176 var5 = class333.method2152(!arg2, arg0, arg4);
        if (var5 != null) {
            if (var5.field2529 != null) {
                class140 var6 = new class140();
                var6.field1800 = arg1;
                var6.field1802 = var5;
                var6.field1808 = var5.field2529;
                var6.field1811 = arg3;
                class353.method2219(var6);
            }
            if (~class757.field10456 == -11) {
                if (client.method2049(var5).method3749(arg1 + -1, -105)) {
                    if (~arg1 == -2) {
                        ++class579.field8181;
                        class731 var7 = class155.method1222(260, class758.field10459, class237.field3417);
                        class304.method2007(arg4, var5.field2540, arg2, var7, arg0);
                        class533.method3088(var7, 0);
                    }
                    if (~arg1 == -3) {
                        ++class231.field3355;
                        class731 var8 = class155.method1222(260, class175.field2487, class237.field3417);
                        class304.method2007(arg4, var5.field2540, true, var8, arg0);
                        class533.method3088(var8, 0);
                    }
                    if (~arg1 == -4) {
                        ++class662.field9296;
                        class731 var9 = class155.method1222(260, class485.field6878, class237.field3417);
                        class304.method2007(arg4, var5.field2540, true, var9, arg0);
                        class533.method3088(var9, 0);
                    }
                    if (~arg1 == -5) {
                        ++class754.field10435;
                        class731 var10 = class155.method1222(260, class173.field2453, class237.field3417);
                        class304.method2007(arg4, var5.field2540, arg2, var10, arg0);
                        class533.method3088(var10, 0);
                    }
                    if (arg1 == 5) {
                        ++class649.field9137;
                        class731 var11 = class155.method1222(260, class278.field3870, class237.field3417);
                        class304.method2007(arg4, var5.field2540, true, var11, arg0);
                        class533.method3088(var11, 0);
                    }
                    if (~arg1 == -7) {
                        ++class114.field1445;
                        class731 var12 = class155.method1222(260, class424.field5980, class237.field3417);
                        class304.method2007(arg4, var5.field2540, true, var12, arg0);
                        class533.method3088(var12, 0);
                    }
                    if (arg2) {
                        if (~arg1 == -8) {
                            ++class296.field4464;
                            class731 var13 = class155.method1222(260, class557.field7916, class237.field3417);
                            class304.method2007(arg4, var5.field2540, true, var13, arg0);
                            class533.method3088(var13, 0);
                        }
                        if (~arg1 == -9) {
                            ++class234.field3388;
                            class731 var14 = class155.method1222(260, class74.field1000, class237.field3417);
                            class304.method2007(arg4, var5.field2540, true, var14, arg0);
                            class533.method3088(var14, 0);
                        }
                        if (~arg1 == -10) {
                            ++class243.field3483;
                            class731 var15 = class155.method1222(260, class472.field6726, class237.field3417);
                            class304.method2007(arg4, var5.field2540, true, var15, arg0);
                            class533.method3088(var15, 0);
                        }
                        if (~arg1 == -11) {
                            ++class687.field9735;
                            class731 var16 = class155.method1222(260, class55.field759, class237.field3417);
                            class304.method2007(arg4, var5.field2540, true, var16, arg0);
                            class533.method3088(var16, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(III)V")
    public final void method159(int arg0, int arg1, int arg2) {
        if (arg2 >= -37) {
            field8308 = null;
        }
        ++field8303;
        int var4 = this.field8307 * arg0 >> 12;
        int var5 = this.field8300 * arg0 >> 12;
        int var6 = this.field8304 * arg1 >> 12;
        int var7 = this.field8301 * arg1 >> 12;
        class259.method1705(var4, var5, var7, true, var6, super.field7081);
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(IIIIII)V")
    public class587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field8301 = arg3;
        this.field8307 = arg0;
        this.field8300 = arg2;
        this.field8304 = arg1;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(BII)V")
    public final void method157(byte arg0, int arg1, int arg2) {
        int var4 = -67 % ((arg0 - 53) / 49);
        ++field8310;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
    public static final void method3406(byte arg0) {
        if (class27.field395.field8334 && ~class603.field8489.field6989 != 0) {
            class330.method2131((byte) -114, class603.field8489.field6989, class603.field8489.field6987);
        }
        if (arg0 == -43) {
            ++field8305;
        }
    }
}
