import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class325 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lbj;")
    public static class162 field4939 = new class162(75, 7);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2067(byte arg0) {
        field4939 = null;
        if (arg0 <= 75) {
            method2068(-91, -110, -105, 106, -103, 67, -5, -95);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4938++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg2 - arg0;
        int var12 = arg1 - arg0;
        int var13 = arg2 * arg2;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        if (arg4 > -26) {
            field4940 = 78;
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        if (class372.field5455 <= arg7 && arg7 <= class216.field3415) {
            int[] var38 = class316.field4797[arg7];
            int var39 = class73.method640(class43.field600, (byte) -112, class467.field6940, arg3 - arg2);
            int var40 = class73.method640(class43.field600, (byte) -72, class467.field6940, arg3 + arg2);
            int var41 = class73.method640(class43.field600, (byte) -116, class467.field6940, arg3 - var11);
            int var42 = class73.method640(class43.field600, (byte) -91, class467.field6940, arg3 + var11);
            class503.method3027(var39, (byte) 127, var41, arg5, var38);
            class503.method3027(var41, (byte) 127, var42, arg6, var38);
            class503.method3027(var42, (byte) 127, var40, arg5, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
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
                var25 += -var43;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (var46 >= class372.field5455 && class216.field3415 >= var45) {
                int var47 = class73.method640(class43.field600, (byte) -114, class467.field6940, arg3 + var8);
                int var48 = class73.method640(class43.field600, (byte) -85, class467.field6940, arg3 - var8);
                if (var44) {
                    int var49 = class73.method640(class43.field600, (byte) -114, class467.field6940, arg3 + var10);
                    int var50 = class73.method640(class43.field600, (byte) -71, class467.field6940, arg3 - var10);
                    if (class372.field5455 <= var45) {
                        int[] var51 = class316.field4797[var45];
                        class503.method3027(var48, (byte) 127, var50, arg5, var51);
                        class503.method3027(var50, (byte) 127, var49, arg6, var51);
                        class503.method3027(var49, (byte) 127, var47, arg5, var51);
                    }
                    if (var46 <= class216.field3415) {
                        int[] var52 = class316.field4797[var46];
                        class503.method3027(var48, (byte) 127, var50, arg5, var52);
                        class503.method3027(var50, (byte) 127, var49, arg6, var52);
                        class503.method3027(var49, (byte) 127, var47, arg5, var52);
                    }
                } else {
                    if (class372.field5455 <= var45) {
                        class503.method3027(var48, (byte) 127, var47, arg5, class316.field4797[var45]);
                    }
                    if (var46 <= class216.field3415) {
                        class503.method3027(var48, (byte) 127, var47, arg5, class316.field4797[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILqh;Lqh;)V")
    public static final void method2069(int arg0, int arg1, int arg2, class50 arg3, class50 arg4) {
        class234 var5 = class455.method2715(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3610 = arg3;
            var5.field3613 = arg4;
        }
    }
}
