import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class464 extends class477 {

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public int field6341 = 0;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Ljj;")
    public static class398 field6339 = new class398(71, 18);

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lcb;")
    public static class318 field6340 = new class318(4, -1);

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Llp;")
    public static class270 field6343 = new class270(6, 0, 4, 2);

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILdga;)V", line = 6)
    private final void method2629(int arg0, int arg1, class138 arg2) {
        if (~arg1 == arg0) {
            this.field6341 = arg2.method922((byte) -120);
        }
        field6338++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 19)
    public static void method2630(int arg0) {
        if (arg0 < 77) {
            field6340 = null;
        }
        field6343 = null;
        field6340 = null;
        field6339 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILdga;)V", line = 31)
    public final void method2631(int arg0, class138 arg1) {
        field6342++;
        while (true) {
            int var3 = arg1.method957((byte) -92);
            if (var3 == 0) {
                if (arg0 <= 83) {
                    field6343 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2629(-3, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V", line = 52)
    public static final void method2632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6337++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg0 * arg0;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
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
        int var35 = 15 / ((-arg1 - 13) / 32);
        int var36 = var28;
        int var37 = (arg2 - 1) * var27;
        int var38 = var30;
        int var39 = (var12 - 1) * var29;
        int[] var40 = class319.field4673[arg4];
        class653.method3620(arg3 - var11, -arg0 + arg3, false, arg5, var40);
        class653.method3620(arg3 + var11, -var11 + arg3, false, arg6, var40);
        class653.method3620(arg0 + arg3, arg3 - -var11, false, arg5, var40);
        while (var9 > 0) {
            boolean var41 = var9 <= var12;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var38 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var38;
                    var10++;
                    var33 += var30;
                    var38 += var30;
                }
                var25 += -var39;
                var26 += -var34;
                var34 -= var29;
                var39 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var36;
                    var31 += var28;
                    var8++;
                    var36 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var36;
                var36 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var37;
            var37 -= var27;
            var9--;
            var32 -= var27;
            int var42 = arg4 - var9;
            int var43 = arg4 + var9;
            int var44 = arg3 + var8;
            int var45 = arg3 - var8;
            if (var41) {
                int var46 = arg3 + var10;
                int var47 = arg3 - var10;
                class653.method3620(var47, var45, false, arg5, class319.field4673[var42]);
                class653.method3620(var46, var47, false, arg6, class319.field4673[var42]);
                class653.method3620(var44, var46, false, arg5, class319.field4673[var42]);
                class653.method3620(var47, var45, false, arg5, class319.field4673[var43]);
                class653.method3620(var46, var47, false, arg6, class319.field4673[var43]);
                class653.method3620(var44, var46, false, arg5, class319.field4673[var43]);
            } else {
                class653.method3620(var44, var45, false, arg5, class319.field4673[var42]);
                class653.method3620(var44, var45, false, arg5, class319.field4673[var43]);
            }
        }
    }
}
