import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class269 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field3932 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lls;")
    public static class99 field3934;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3931++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg1 - arg2;
        if (arg0 != 7385) {
            return;
        }
        int var12 = arg4 - arg2;
        int var13 = arg1 * arg1;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class444.field6338 <= arg7 && class151.field2091 >= arg7) {
            int[] var39 = class373.field5141[arg7];
            int var40 = class67.method630(0, arg6 - arg1, class103.field1457, class295.field4153);
            int var41 = class67.method630(arg0 - 7385, arg1 + arg6, class103.field1457, class295.field4153);
            int var42 = class67.method630(0, arg6 - var11, class103.field1457, class295.field4153);
            int var43 = class67.method630(0, arg6 + var11, class103.field1457, class295.field4153);
            class61.method558(var42, -10647, var39, var40, arg5);
            class61.method558(var43, -10647, var39, var42, arg3);
            class61.method558(var41, -10647, var39, var43, arg5);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class444.field6338 <= var46 && var45 <= class151.field2091) {
                int var47 = class67.method630(arg0 - 7385, arg6 + var8, class103.field1457, class295.field4153);
                int var48 = class67.method630(0, arg6 - var8, class103.field1457, class295.field4153);
                if (var44) {
                    int var49 = class67.method630(0, arg6 + var10, class103.field1457, class295.field4153);
                    int var50 = class67.method630(arg0 - 7385, -var10 + arg6, class103.field1457, class295.field4153);
                    if (var45 >= class444.field6338) {
                        int[] var51 = class373.field5141[var45];
                        class61.method558(var50, -10647, var51, var48, arg5);
                        class61.method558(var49, -10647, var51, var50, arg3);
                        class61.method558(var47, arg0 - 18032, var51, var49, arg5);
                    }
                    if (var46 <= class151.field2091) {
                        int[] var52 = class373.field5141[var46];
                        class61.method558(var50, -10647, var52, var48, arg5);
                        class61.method558(var49, arg0 - 18032, var52, var50, arg3);
                        class61.method558(var47, arg0 ^ 0xFFFFCAB0, var52, var49, arg5);
                    }
                } else {
                    if (class444.field6338 <= var45) {
                        class61.method558(var47, -10647, class373.field5141[var45], var48, arg5);
                    }
                    if (class151.field2091 >= var46) {
                        class61.method558(var47, -10647, class373.field5141[var46], var48, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V", line = 213)
    public static void method1823(boolean arg0) {
        field3934 = null;
        if (!arg0) {
            field3932 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lmq;")
    public abstract class46 method1819(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1820(byte arg0, int arg1);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public abstract void method1821(int arg0);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public abstract void method1824(int arg0);
}
