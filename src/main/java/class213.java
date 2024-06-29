import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class213 extends class706 {

    @OriginalMember(owner = "client!mr", name = "R", descriptor = "Lfl;")
    public static class103 field2745 = new class103(4, 1);

    @OriginalMember(owner = "client!mr", name = "V", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!mr", name = "W", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!mr", name = "P", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!mr", name = "Q", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!mr", name = "T", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!mr", name = "U", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!mr", name = "S", descriptor = "[[I")
    public static int[][] field2746;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILfd;)Ldp;", line = 5)
    public static final class446 method1367(int arg0, class418 arg1) {
        field2747++;
        if (arg0 < 118) {
            method1367(-4, null);
        }
        int var2 = arg1.method2393(-30727);
        return new class446(var2);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIIIIIII)V", line = 22)
    public static final void method1368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2743++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg3 - arg6;
        int var13 = arg1 * arg1;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        if (arg5 < 75) {
            field2746 = null;
        }
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (arg7 >= class165.field2061 && class99.field1309 >= arg7) {
            int[] var38 = field2746[arg7];
            int var39 = class650.method3574(class641.field8924, class265.field3552, arg2 - arg1, -70);
            int var40 = class650.method3574(class641.field8924, class265.field3552, arg1 + arg2, 119);
            int var41 = class650.method3574(class641.field8924, class265.field3552, arg2 - var11, -19);
            int var42 = class650.method3574(class641.field8924, class265.field3552, arg2 + var11, 110);
            class349.method2008(var41, (byte) 53, var38, var39, arg0);
            class349.method2008(var42, (byte) 9, var38, var41, arg4);
            class349.method2008(var40, (byte) 21, var38, var42, arg0);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
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
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class165.field2061 <= var46 && class99.field1309 >= var45) {
                int var47 = class650.method3574(class641.field8924, class265.field3552, arg2 + var8, 109);
                int var48 = class650.method3574(class641.field8924, class265.field3552, arg2 - var8, 126);
                if (var44) {
                    int var49 = class650.method3574(class641.field8924, class265.field3552, arg2 + var10, 7);
                    int var50 = class650.method3574(class641.field8924, class265.field3552, arg2 - var10, 108);
                    if (class165.field2061 <= var45) {
                        int[] var51 = field2746[var45];
                        class349.method2008(var50, (byte) 43, var51, var48, arg0);
                        class349.method2008(var49, (byte) 62, var51, var50, arg4);
                        class349.method2008(var47, (byte) 41, var51, var49, arg0);
                    }
                    if (var46 <= class99.field1309) {
                        int[] var52 = field2746[var46];
                        class349.method2008(var50, (byte) 125, var52, var48, arg0);
                        class349.method2008(var49, (byte) 58, var52, var50, arg4);
                        class349.method2008(var47, (byte) 122, var52, var49, arg0);
                    }
                } else {
                    if (var45 >= class165.field2061) {
                        class349.method2008(var47, (byte) 60, field2746[var45], var48, arg0);
                    }
                    if (var46 <= class99.field1309) {
                        class349.method2008(var47, (byte) 24, field2746[var46], var48, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V", line = 230)
    public static void method1369(int arg0) {
        if (arg0 == 1) {
            field2745 = null;
            field2746 = null;
        }
    }
}
