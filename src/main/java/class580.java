import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class580 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Lui;")
    private class193 field8455;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lwda;")
    private class544 field8458;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "[I")
    public static int[] field8461;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8457++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg7 - arg0;
        int var12 = arg6 - arg0;
        int var13 = arg7 * arg7;
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
        int var26 = var16 - (arg4 + var22) * var20;
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
        if (arg2 >= class563.field8282 && arg2 <= class271.field3513) {
            int[] var39 = class328.field4287[arg2];
            int var40 = class536.method3056(class592.field8588, 122, arg3 - arg7, class470.field6589);
            int var41 = class536.method3056(class592.field8588, 126, arg3 + arg7, class470.field6589);
            int var42 = class536.method3056(class592.field8588, arg4 ^ 0xFFFFFF84, arg3 - var11, class470.field6589);
            int var43 = class536.method3056(class592.field8588, 119, arg3 + var11, class470.field6589);
            class62.method363(var42, -128, arg5, var39, var40);
            class62.method363(var43, -128, arg1, var39, var42);
            class62.method363(var41, -127, arg5, var39, var43);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
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
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (class563.field8282 <= var46 && var45 <= class271.field3513) {
                int var47 = class536.method3056(class592.field8588, arg4 ^ 0xFFFFFF87, arg3 + var8, class470.field6589);
                int var48 = class536.method3056(class592.field8588, arg4 ^ 0xFFFFFF8D, arg3 - var8, class470.field6589);
                if (var44) {
                    int var49 = class536.method3056(class592.field8588, 120, arg3 + var10, class470.field6589);
                    int var50 = class536.method3056(class592.field8588, 113, arg3 - var10, class470.field6589);
                    if (var45 >= class563.field8282) {
                        int[] var51 = class328.field4287[var45];
                        class62.method363(var50, -127, arg5, var51, var48);
                        class62.method363(var49, arg4 - 127, arg1, var51, var50);
                        class62.method363(var47, arg4 - 126, arg5, var51, var49);
                    }
                    if (var46 <= class271.field3513) {
                        int[] var52 = class328.field4287[var46];
                        class62.method363(var50, -128, arg5, var52, var48);
                        class62.method363(var49, -128, arg1, var52, var50);
                        class62.method363(var47, arg4 - 126, arg5, var52, var49);
                    }
                } else {
                    if (var45 >= class563.field8282) {
                        class62.method363(var47, arg4 - 126, arg5, class328.field4287[var45], var48);
                    }
                    if (class271.field3513 >= var46) {
                        class62.method363(var47, -127, arg5, class328.field4287[var46], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public static void method3380(int arg0) {
        field8461 = null;
        int var1 = -5 / ((2 - arg0) / 33);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Lwda;")
    public final class544 method3381(int arg0) {
        if (arg0 != -16796) {
            this.field8458 = null;
        }
        field8454++;
        class544 var2 = this.field8458;
        if (this.field8455.field2331 == var2) {
            this.field8458 = null;
            return null;
        } else {
            this.field8458 = var2.field7964;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Lwda;")
    public final class544 method3382(int arg0) {
        field8459++;
        class544 var2 = this.field8455.field2331.field7964;
        if (this.field8455.field2331 == var2) {
            this.field8458 = null;
            return null;
        } else {
            this.field8458 = var2.field7964;
            return arg0 == -19983 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lui;I)V")
    public final void method3383(class193 arg0, int arg1) {
        if (arg1 == 0) {
            this.field8455 = arg0;
            field8460++;
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
    public class580() {
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lui;)V")
    public class580(class193 arg0) {
        this.field8455 = arg0;
    }
}
