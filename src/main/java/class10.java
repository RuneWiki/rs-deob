import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class10 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lki;")
    public static class498 field148 = new class498(8192);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
    public static int[] field149 = new int[256];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public static boolean field151 = false;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "F")
    public static float field152;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field150++;
        int var8 = arg0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg5 - arg3;
        int var13 = arg4 * arg4;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class417.field6057 <= arg2 && class224.field3193 >= arg2) {
            int[] var39 = class437.field6400[arg2];
            int var40 = class46.method425(true, arg1 - arg4, class76.field1021, class424.field6204);
            int var41 = class46.method425(true, arg1 + arg4, class76.field1021, class424.field6204);
            int var42 = class46.method425(true, arg1 - var11, class76.field1021, class424.field6204);
            int var43 = class46.method425(true, arg1 + var11, class76.field1021, class424.field6204);
            class210.method1300(var40, var39, (byte) 77, var42, arg6);
            class210.method1300(var42, var39, (byte) 115, var43, arg7);
            class210.method1300(var43, var39, (byte) 104, var41, arg6);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
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
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (var46 >= class417.field6057 && var45 <= class224.field3193) {
                int var47 = class46.method425(true, arg1 + var8, class76.field1021, class424.field6204);
                int var48 = class46.method425(true, arg1 - var8, class76.field1021, class424.field6204);
                if (var44) {
                    int var49 = class46.method425(true, arg1 + var10, class76.field1021, class424.field6204);
                    int var50 = class46.method425(true, arg1 - var10, class76.field1021, class424.field6204);
                    if (class417.field6057 <= var45) {
                        int[] var51 = class437.field6400[var45];
                        class210.method1300(var48, var51, (byte) 110, var50, arg6);
                        class210.method1300(var50, var51, (byte) 111, var49, arg7);
                        class210.method1300(var49, var51, (byte) 125, var47, arg6);
                    }
                    if (var46 <= class224.field3193) {
                        int[] var52 = class437.field6400[var46];
                        class210.method1300(var48, var52, (byte) 78, var50, arg6);
                        class210.method1300(var50, var52, (byte) 117, var49, arg7);
                        class210.method1300(var49, var52, (byte) 73, var47, arg6);
                    }
                } else {
                    if (class417.field6057 <= var45) {
                        class210.method1300(var48, class437.field6400[var45], (byte) 75, var47, arg6);
                    }
                    if (var46 <= class224.field3193) {
                        class210.method1300(var48, class437.field6400[var46], (byte) 98, var47, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method46(int arg0) {
        if (arg0 != -26340) {
            method46(31);
        }
        field148 = null;
        field149 = null;
    }
}
