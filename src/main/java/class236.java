import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class236 extends class32 {

    @OriginalMember(owner = "client!d", name = "N", descriptor = "[B")
    public byte[] field4357;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lqk;")
    public static class207 field4350 = class24.method212(255, "Memory after cleanup=");

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "[I")
    public static int[] field4360 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lqk;")
    public static class207 field4359 = class24.method212(255, ":");

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Lhk;")
    public static class124 field4353;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "[Luh;")
    public static class100[] field4356;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "[[[I")
    public static int[][][] field4351;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 24) {
            field4360 = null;
        }
        field4352++;
        class90 var5 = class221.method1575(4, arg0, 1651481952);
        var5.method648((byte) -113);
        var5.field1613 = arg1;
        var5.field1612 = arg2;
        var5.field1621 = arg3;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    public static void method1683(int arg0) {
        field4359 = null;
        field4353 = null;
        field4350 = null;
        if (arg0 != -1713103390) {
            field4356 = null;
        }
        field4351 = null;
        field4360 = null;
        field4356 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I")
    public static final int method1684(int arg0, int arg1) {
        field4354++;
        return arg0 == 1015038407 ? arg1 >>> 7 : -93;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field4355++;
        int var9 = arg3 - arg0;
        int var10 = arg2 * arg2;
        int var11 = arg2 - arg0;
        int var12 = 0;
        int var13 = arg3 * arg3;
        int var14 = arg2;
        int var15 = var11 * var11;
        int var16 = var10 << 1;
        int var17 = var9 * var9;
        if (arg4 <= 117) {
            return;
        }
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = arg2 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var21) * var13 + var16;
        int var24 = (1 - var22) * var17 + var19;
        int var25 = var10 - ((var21 - 1) * var18);
        int var26 = var17 << 2;
        int var27 = var10 << 2;
        int var28 = var15 - (var22 - 1) * var20;
        int var29 = var13 << 2;
        int var30 = var16 * 3;
        int var31 = (var21 - 3) * var18;
        int var32 = var15 << 2;
        int var33 = (var22 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var27;
        int var36 = (arg2 - 1) * var29;
        int var37 = var32;
        if (arg6 >= class204.field3580 && arg6 <= class204.field3602) {
            int[] var38 = class15.field238[arg6];
            int var39 = class21.method123(arg1 - arg3, -15466, class124.field2158, class88.field1599);
            int var40 = class21.method123(arg1 + arg3, -15466, class124.field2158, class88.field1599);
            int var41 = class21.method123(arg1 - var9, -15466, class124.field2158, class88.field1599);
            int var42 = class21.method123(arg1 + var9, -15466, class124.field2158, class88.field1599);
            class215.method1544(var39, var41, var38, arg7, -60);
            class215.method1544(var41, var42, var38, arg5, 89);
            class215.method1544(var42, var40, var38, arg7, -28);
        }
        int var43 = (var11 - 1) * var26;
        while (var14 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var25 += var35;
                    var8++;
                    var35 += var27;
                    var30 += var27;
                }
            }
            if (var25 < 0) {
                var8++;
                var23 += var30;
                var25 += var35;
                var30 += var27;
                var35 += var27;
            }
            var23 += -var36;
            var36 -= var29;
            var25 += -var31;
            boolean var44 = var11 >= var14;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var28 += var37;
                        var12++;
                        var24 += var34;
                        var34 += var32;
                        var37 += var32;
                    }
                }
                if (var28 < 0) {
                    var12++;
                    var28 += var37;
                    var24 += var34;
                    var34 += var32;
                    var37 += var32;
                }
                var24 += -var43;
                var43 -= var26;
                var28 += -var33;
                var33 -= var26;
            }
            var31 -= var29;
            var14--;
            int var45 = arg6 - var14;
            int var46 = arg6 + var14;
            if (class204.field3580 <= var46 && var45 <= class204.field3602) {
                int var47 = class21.method123(arg1 + var8, -15466, class124.field2158, class88.field1599);
                int var48 = class21.method123(arg1 - var8, -15466, class124.field2158, class88.field1599);
                if (var44) {
                    int var49 = class21.method123(arg1 + var12, -15466, class124.field2158, class88.field1599);
                    int var50 = class21.method123(arg1 - var12, -15466, class124.field2158, class88.field1599);
                    if (var45 >= class204.field3580) {
                        int[] var51 = class15.field238[var45];
                        class215.method1544(var48, var50, var51, arg7, 77);
                        class215.method1544(var50, var49, var51, arg5, -122);
                        class215.method1544(var49, var47, var51, arg7, -1);
                    }
                    if (class204.field3602 >= var46) {
                        int[] var52 = class15.field238[var46];
                        class215.method1544(var48, var50, var52, arg7, 126);
                        class215.method1544(var50, var49, var52, arg5, 89);
                        class215.method1544(var49, var47, var52, arg7, 79);
                    }
                } else {
                    if (var45 >= class204.field3580) {
                        class215.method1544(var48, var47, class15.field238[var45], arg7, 78);
                    }
                    if (class204.field3602 >= var46) {
                        class215.method1544(var48, var47, class15.field238[var46], arg7, 123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIII)V")
    public static final void method1686(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4358++;
        if (arg5 < 76) {
            return;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        class156.field2754 = (short) arg3;
        if (arg1 < 1) {
            arg1 = 1;
        }
        class177.field3190 = (short) arg1;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "([B)V")
    public class236(byte[] arg0) {
        this.field4357 = arg0;
    }
}
