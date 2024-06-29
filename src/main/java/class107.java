import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Loc;")
    public static class151 field1892 = class137.method873(2, "logo");

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static volatile int field1895 = 0;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[[[B")
    public static byte[][][] field1891;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method641(byte arg0) {
        field1892 = null;
        if (arg0 != 122) {
            field1891 = null;
        }
        field1891 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method642(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1894++;
        int var8 = 0;
        int var9 = 0;
        if (arg2 > -65) {
            field1892 = null;
        }
        int var10 = arg6;
        int var11 = arg7 - arg0;
        int var12 = arg7 * arg7;
        int var13 = arg6 - arg0;
        int var14 = var11 * var11;
        int var15 = var13 * var13;
        int var16 = arg6 * arg6;
        int var17 = var16 << 1;
        int var18 = var15 << 1;
        int var19 = var12 << 1;
        int var20 = var14 << 1;
        int var21 = arg6 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var12 + var17;
        int var24 = var16 - (var21 - 1) * var19;
        int var25 = (1 - var22) * var14 + var18;
        int var26 = var14 << 2;
        int var27 = var12 << 2;
        int var28 = var15 - (var22 - 1) * var20;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var19;
        int var33 = var18 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = (arg6 - 1) * var27;
        int var36 = var29;
        int var37 = var30;
        int var38 = (var13 - 1) * var26;
        int[] var39 = class43.field887[arg4];
        class55.method380(arg5, 114, var39, arg1 - var11, -arg7 + arg1);
        class55.method380(arg3, 105, var39, arg1 + var11, -var11 + arg1);
        class55.method380(arg5, 106, var39, arg1 + arg7, arg1 + var11);
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var36;
                    var23 += var31;
                    var36 += var29;
                    var8++;
                    var31 += var29;
                }
            }
            if (var24 < 0) {
                var8++;
                var24 += var36;
                var23 += var31;
                var36 += var29;
                var31 += var29;
            }
            boolean var40 = var13 >= var10;
            var23 += -var35;
            int var41 = arg1 + var8;
            var10--;
            var35 -= var27;
            int var42 = arg4 + var10;
            int var43 = arg4 - var10;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var9++;
                        var28 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var28 < 0) {
                    var25 += var33;
                    var28 += var37;
                    var37 += var30;
                    var33 += var30;
                    var9++;
                }
                var28 += -var34;
                var34 -= var26;
                var25 += -var38;
                var38 -= var26;
            }
            int var44 = arg1 - var8;
            var24 += -var32;
            if (var40) {
                int var45 = arg1 - var9;
                int var46 = arg1 + var9;
                class55.method380(arg5, 122, class43.field887[var43], var45, var44);
                class55.method380(arg3, 120, class43.field887[var43], var46, var45);
                class55.method380(arg5, 115, class43.field887[var43], var41, var46);
                class55.method380(arg5, 117, class43.field887[var42], var45, var44);
                class55.method380(arg3, 106, class43.field887[var42], var46, var45);
                class55.method380(arg5, 125, class43.field887[var42], var41, var46);
            } else {
                class55.method380(arg5, 105, class43.field887[var43], var41, var44);
                class55.method380(arg5, 123, class43.field887[var42], var41, var44);
            }
            var32 -= var27;
        }
    }
}
