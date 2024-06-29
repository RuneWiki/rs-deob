import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class33 {

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "Ldu;")
    public static class360 field501 = new class360(512);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)I", line = 4)
    public static final int method276(int arg0) {
        field498++;
        if (arg0 >= -90) {
            method276(-108);
        }
        return 16;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 15)
    public static final String method277(String arg0, int arg1) {
        if (arg1 != -1) {
            method277(null, -71);
        }
        field497++;
        String var2 = class485.method2741((byte) -104, class353.method2111(arg1 - 16336, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V", line = 36)
    public static void method278(int arg0) {
        field501 = null;
        if (arg0 != 16) {
            field501 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIIII)V", line = 47)
    public static final void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field500++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg0 - arg3;
        int var12 = arg1 - arg3;
        int var13 = arg0 * arg0;
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
        if (arg7 != -8930) {
            field501 = null;
        }
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class690.field9616[arg6];
        class717.method4012(arg2, -95, arg5 - arg0, var39, arg5 - var11);
        class717.method4012(arg4, -76, arg5 - var11, var39, arg5 + var11);
        class717.method4012(arg2, -123, arg5 + var11, var39, arg0 + arg5);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
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
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg6 - var9;
            int var42 = arg6 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var10;
                int var46 = arg5 - var10;
                class717.method4012(arg2, -53, var44, class690.field9616[var41], var46);
                class717.method4012(arg4, -65, var46, class690.field9616[var41], var45);
                class717.method4012(arg2, -87, var45, class690.field9616[var41], var43);
                class717.method4012(arg2, -52, var44, class690.field9616[var42], var46);
                class717.method4012(arg4, -54, var46, class690.field9616[var42], var45);
                class717.method4012(arg2, -125, var45, class690.field9616[var42], var43);
            } else {
                class717.method4012(arg2, arg7 + 8882, var44, class690.field9616[var41], var43);
                class717.method4012(arg2, -105, var44, class690.field9616[var42], var43);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)Z", line = 218)
    public static final boolean method280(int arg0, boolean arg1) {
        if (!arg1) {
            field501 = null;
        }
        field499++;
        return arg0 == 0 || arg0 == 2;
    }
}
