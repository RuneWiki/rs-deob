import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class61 extends class98 {

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "[B")
    public byte[] field786;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "Lrl;")
    public static class672 field787 = new class672(22, 7);

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "Ldp;")
    public static class3 field789;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 4)
    public static void method678(int arg0) {
        if (arg0 < 90) {
            method679(7, 122, -125, -104, -86, -33, -82, -34);
        }
        field789 = null;
        field787 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V", line = 14)
    public class61(byte[] arg0) {
        this.field786 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)V", line = 28)
    public static final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field788++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg4 - arg5;
        int var12 = arg6 - arg5;
        int var13 = arg4 * arg4;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        if (arg2 != 25798) {
            field787 = null;
        }
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        if (arg1 >= class545.field7931 && arg1 <= class585.field8331) {
            int[] var38 = class39.field527[arg1];
            int var39 = class160.method1320(0, arg0 - arg4, class576.field8218, class340.field5510);
            int var40 = class160.method1320(0, arg0 + arg4, class576.field8218, class340.field5510);
            int var41 = class160.method1320(0, arg0 - var11, class576.field8218, class340.field5510);
            int var42 = class160.method1320(arg2 - 25798, arg0 - -var11, class576.field8218, class340.field5510);
            class367.method2427(3803, arg3, var41, var38, var39);
            class367.method2427(3803, arg7, var42, var38, var41);
            class367.method2427(3803, arg3, var40, var38, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
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
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (class545.field7931 <= var46 && class585.field8331 >= var45) {
                int var47 = class160.method1320(0, arg0 + var8, class576.field8218, class340.field5510);
                int var48 = class160.method1320(0, arg0 - var8, class576.field8218, class340.field5510);
                if (var44) {
                    int var49 = class160.method1320(0, arg0 + var10, class576.field8218, class340.field5510);
                    int var50 = class160.method1320(0, arg0 - var10, class576.field8218, class340.field5510);
                    if (class545.field7931 <= var45) {
                        int[] var51 = class39.field527[var45];
                        class367.method2427(3803, arg3, var50, var51, var48);
                        class367.method2427(3803, arg7, var49, var51, var50);
                        class367.method2427(3803, arg3, var47, var51, var49);
                    }
                    if (var46 <= class585.field8331) {
                        int[] var52 = class39.field527[var46];
                        class367.method2427(arg2 - 21995, arg3, var50, var52, var48);
                        class367.method2427(3803, arg7, var49, var52, var50);
                        class367.method2427(3803, arg3, var47, var52, var49);
                    }
                } else {
                    if (var45 >= class545.field7931) {
                        class367.method2427(3803, arg3, var47, class39.field527[var45], var48);
                    }
                    if (class585.field8331 >= var46) {
                        class367.method2427(arg2 ^ 0x6A1D, arg3, var47, class39.field527[var46], var48);
                    }
                }
            }
        }
    }
}
