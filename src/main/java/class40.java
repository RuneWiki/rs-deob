import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class40 extends class445 {

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public volatile int field574 = -1;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Ljava/lang/String;")
    public volatile String field573;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field578 = -1;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lr;")
    public static class110 field577;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[Ljd;")
    public static class139[] field575;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static void method281(int arg0) {
        if (arg0 == -5386) {
            field577 = null;
            field575 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method282(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field571++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg7 - arg4;
        int var12 = arg6 - arg4;
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
        if (!arg0) {
            method281(-23);
        }
        if (arg1 >= class221.field2942 && arg1 <= class205.field2784) {
            int[] var39 = class102.field1472[arg1];
            int var40 = class309.method1706(class425.field5751, arg5 - arg7, 6798, class136.field1985);
            int var41 = class309.method1706(class425.field5751, arg5 + arg7, 6798, class136.field1985);
            int var42 = class309.method1706(class425.field5751, arg5 - var11, 6798, class136.field1985);
            int var43 = class309.method1706(class425.field5751, arg5 + var11, 6798, class136.field1985);
            class330.method1834(var42, var39, arg3, var40, 25084);
            class330.method1834(var43, var39, arg2, var42, 25084);
            class330.method1834(var41, var39, arg3, var43, 25084);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
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
                var34 -= var29;
                var38 -= var29;
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
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (class221.field2942 <= var46 && var45 <= class205.field2784) {
                int var47 = class309.method1706(class425.field5751, arg5 + var8, 6798, class136.field1985);
                int var48 = class309.method1706(class425.field5751, arg5 - var8, 6798, class136.field1985);
                if (var44) {
                    int var49 = class309.method1706(class425.field5751, arg5 + var10, 6798, class136.field1985);
                    int var50 = class309.method1706(class425.field5751, arg5 - var10, 6798, class136.field1985);
                    if (var45 >= class221.field2942) {
                        int[] var51 = class102.field1472[var45];
                        class330.method1834(var50, var51, arg3, var48, 25084);
                        class330.method1834(var49, var51, arg2, var50, 25084);
                        class330.method1834(var47, var51, arg3, var49, 25084);
                    }
                    if (class205.field2784 >= var46) {
                        int[] var52 = class102.field1472[var46];
                        class330.method1834(var50, var52, arg3, var48, 25084);
                        class330.method1834(var49, var52, arg2, var50, 25084);
                        class330.method1834(var47, var52, arg3, var49, 25084);
                    }
                } else {
                    if (class221.field2942 <= var45) {
                        class330.method1834(var47, class102.field1472[var45], arg3, var48, 25084);
                    }
                    if (var46 <= class205.field2784) {
                        class330.method1834(var47, class102.field1472[var46], arg3, var48, 25084);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class40(String arg0) {
        this.field573 = arg0;
    }
}
