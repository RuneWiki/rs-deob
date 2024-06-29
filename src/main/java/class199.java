import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class199 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "B")
    public byte field2703;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "B")
    public byte field2698;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lcw;")
    public class511 field2697;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "S")
    public short field2696;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ltt;")
    public static class338 field2700 = new class338(20, 3);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[Z")
    public static boolean[] field2701 = new boolean[200];

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "J")
    public static long field2702 = 0L;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)V", line = 8)
    public static final void method1281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2699++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg1 - arg3;
        int var13 = arg7 * arg7;
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
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (arg0 + var12) * var29;
        int[] var39 = class315.field4224[arg2];
        class285.method1691(arg5 - var11, var39, -7, arg5 - arg7, arg6);
        class285.method1691(arg5 + var11, var39, -7, arg5 - var11, arg4);
        class285.method1691(arg5 + arg7, var39, -7, arg5 + var11, arg6);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var10;
                int var46 = arg5 - var10;
                class285.method1691(var46, class315.field4224[var41], -7, var44, arg6);
                class285.method1691(var45, class315.field4224[var41], -7, var46, arg4);
                class285.method1691(var43, class315.field4224[var41], -7, var45, arg6);
                class285.method1691(var46, class315.field4224[var42], -7, var44, arg6);
                class285.method1691(var45, class315.field4224[var42], -7, var46, arg4);
                class285.method1691(var43, class315.field4224[var42], -7, var45, arg6);
            } else {
                class285.method1691(var43, class315.field4224[var41], arg0 ^ 0x6, var44, arg6);
                class285.method1691(var43, class315.field4224[var42], -7, var44, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 176)
    public static void method1282(int arg0) {
        if (arg0 <= 12) {
            method1281(17, -7, 14, -28, -106, -31, -12, 95);
        }
        field2700 = null;
        field2701 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lcw;III)V", line = 199)
    public class199(class511 arg0, int arg1, int arg2, int arg3) {
        this.field2703 = (byte) arg2;
        this.field2698 = (byte) arg3;
        this.field2697 = arg0;
        this.field2696 = (short) arg1;
    }
}
