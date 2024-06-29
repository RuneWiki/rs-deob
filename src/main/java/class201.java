import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class201 {

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Lfh;")
    public static class567 field2689 = new class567();

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "[[I")
    public static int[][] field2691 = new int[6][];

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 11)
    public static void method1273(int arg0) {
        field2691 = null;
        if (arg0 < 96) {
            field2691 = null;
        }
        field2689 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIIII)V", line = 25)
    public static final void method1274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2690++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg7 - arg2;
        int var12 = arg3 - arg2;
        int var13 = arg7 * arg7;
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
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        if (arg5 != 1560382433) {
            return;
        }
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (arg0 >= class418.field6298 && class461.field6877 >= arg0) {
            int[] var38 = class402.field6087[arg0];
            int var39 = class132.method818((byte) -93, arg1 - arg7, class113.field1385, class4.field43);
            int var40 = class132.method818((byte) -93, arg1 + arg7, class113.field1385, class4.field43);
            int var41 = class132.method818((byte) -93, arg1 - var11, class113.field1385, class4.field43);
            int var42 = class132.method818((byte) -93, arg1 + var11, class113.field1385, class4.field43);
            class645.method3675(96, var38, arg4, var39, var41);
            class645.method3675(116, var38, arg6, var41, var42);
            class645.method3675(arg5 ^ 0x5D018B87, var38, arg4, var42, var40);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
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
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class418.field6298 <= var46 && class461.field6877 >= var45) {
                int var47 = class132.method818((byte) -93, arg1 + var8, class113.field1385, class4.field43);
                int var48 = class132.method818((byte) -93, arg1 - var8, class113.field1385, class4.field43);
                if (var44) {
                    int var49 = class132.method818((byte) -93, arg1 + var10, class113.field1385, class4.field43);
                    int var50 = class132.method818((byte) -93, arg1 - var10, class113.field1385, class4.field43);
                    if (var45 >= class418.field6298) {
                        int[] var51 = class402.field6087[var45];
                        class645.method3675(118, var51, arg4, var48, var50);
                        class645.method3675(94, var51, arg6, var50, var49);
                        class645.method3675(127, var51, arg4, var49, var47);
                    }
                    if (class461.field6877 >= var46) {
                        int[] var52 = class402.field6087[var46];
                        class645.method3675(121, var52, arg4, var48, var50);
                        class645.method3675(89, var52, arg6, var50, var49);
                        class645.method3675(arg5 - 1560382330, var52, arg4, var49, var47);
                    }
                } else {
                    if (var45 >= class418.field6298) {
                        class645.method3675(121, class402.field6087[var45], arg4, var48, var47);
                    }
                    if (var46 <= class461.field6877) {
                        class645.method3675(arg5 - 1560382320, class402.field6087[var46], arg4, var48, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ)I", line = 230)
    public static final int method1275(int arg0, boolean arg1) {
        field2693++;
        return arg1 ? arg0 >>> 8 : 35;
    }
}
