import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class762 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field10472;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
    public int[] field10468;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[I")
    public int[] field10469;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lwl;")
    public static class148 field10470 = new class148();

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method4204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10471++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = arg5;
        int var11 = arg2 - arg1;
        int var12 = arg6 - arg1;
        int var13 = arg2 * arg2;
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
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class705.field9804[arg7];
        class128.method883(arg3, arg0 - arg2, -var11 + arg0, var39, 7);
        class128.method883(arg4, arg0 - var11, arg0 + var11, var39, 7);
        class128.method883(arg3, arg0 + var11, arg0 + arg2, var39, arg5 ^ 0x7);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
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
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg7 - var9;
            int var42 = arg7 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class128.method883(arg3, var44, var46, class705.field9804[var41], 7);
                class128.method883(arg4, var46, var45, class705.field9804[var41], 7);
                class128.method883(arg3, var45, var43, class705.field9804[var41], 7);
                class128.method883(arg3, var44, var46, class705.field9804[var42], arg5 ^ 0x7);
                class128.method883(arg4, var46, var45, class705.field9804[var42], arg5 ^ 0x7);
                class128.method883(arg3, var45, var43, class705.field9804[var42], 7);
            } else {
                class128.method883(arg3, var44, var43, class705.field9804[var41], arg5 ^ 0x7);
                class128.method883(arg3, var44, var43, class705.field9804[var42], 7);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 181)
    public static void method4205(byte arg0) {
        field10470 = null;
        int var1 = -43 / ((-arg0 - 72) / 43);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 192)
    public class762(int arg0) {
        this.field10472 = arg0;
        this.field10468 = new int[this.field10472];
        this.field10469 = new int[this.field10472];
    }
}
