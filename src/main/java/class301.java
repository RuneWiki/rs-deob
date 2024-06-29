import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class301 extends class64 {

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field4718 = 0;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field4714 = 0;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Llb;")
    public static class211 field4717;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Llb;")
    public static class211 field4719;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Lna;")
    public static class26 field4715;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V", line = 5)
    public static void method2107(int arg0) {
        field4717 = null;
        field4719 = null;
        if (arg0 != 11808) {
            method2108(87, false, 110, -52, 15, -107, -103, -32);
        }
        field4715 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZIIIIII)V", line = 23)
    public static final void method2108(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4716++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        if (arg1) {
            method2107(100);
        }
        int var11 = arg7 * arg7;
        int var12 = arg7 - arg6;
        int var13 = arg2 - arg6;
        int var14 = arg2 * arg2;
        int var15 = var12 * var12;
        int var16 = var13 * var13;
        int var17 = var11 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var11 + var18;
        int var24 = var14 - (var21 - 1) * var17;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var14 << 2;
        int var28 = var11 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var27;
        int var34 = (var22 - 3) * var20;
        int var35 = var19 * 3;
        int var36 = (arg2 - 1) * var28;
        int var37 = var29;
        int var38 = (var13 - 1) * var30;
        if (arg0 >= class34.field432 && arg0 <= class75.field1064) {
            int[] var39 = class320.field4990[arg0];
            int var40 = class257.method1784((byte) 91, arg5 - arg7, class298.field4667, class327.field5072);
            int var41 = class257.method1784((byte) 91, arg5 + arg7, class298.field4667, class327.field5072);
            int var42 = class257.method1784((byte) 91, arg5 - var12, class298.field4667, class327.field5072);
            int var43 = class257.method1784((byte) 91, arg5 + var12, class298.field4667, class327.field5072);
            class138.method1047(arg3, var42, var40, 7, var39);
            class138.method1047(arg4, var43, var42, 7, var39);
            class138.method1047(arg3, var41, var43, 7, var39);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var31 += var27;
                    var24 += var33;
                    var33 += var27;
                }
            }
            boolean var44 = var13 >= var9;
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var24 += var33;
                var33 += var27;
                var31 += var27;
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var37;
                        var25 += var35;
                        var35 += var29;
                        var37 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var37;
                    var37 += var29;
                    var25 += var35;
                    var35 += var29;
                }
                var26 += -var34;
                var34 -= var30;
                var25 += -var38;
                var38 -= var30;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var28;
            var9--;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class34.field432 <= var46 && var45 <= class75.field1064) {
                int var47 = class257.method1784((byte) 91, arg5 + var8, class298.field4667, class327.field5072);
                int var48 = class257.method1784((byte) 91, arg5 - var8, class298.field4667, class327.field5072);
                if (var44) {
                    int var49 = class257.method1784((byte) 91, arg5 + var10, class298.field4667, class327.field5072);
                    int var50 = class257.method1784((byte) 91, arg5 - var10, class298.field4667, class327.field5072);
                    if (var45 >= class34.field432) {
                        int[] var51 = class320.field4990[var45];
                        class138.method1047(arg3, var50, var48, 7, var51);
                        class138.method1047(arg4, var49, var50, 7, var51);
                        class138.method1047(arg3, var47, var49, 7, var51);
                    }
                    if (var46 <= class75.field1064) {
                        int[] var52 = class320.field4990[var46];
                        class138.method1047(arg3, var50, var48, 7, var52);
                        class138.method1047(arg4, var49, var50, 7, var52);
                        class138.method1047(arg3, var47, var49, 7, var52);
                    }
                } else {
                    if (class34.field432 <= var45) {
                        class138.method1047(arg3, var47, var48, 7, class320.field4990[var45]);
                    }
                    if (class75.field1064 >= var46) {
                        class138.method1047(arg3, var47, var48, 7, class320.field4990[var46]);
                    }
                }
            }
            var32 -= var28;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V", line = 228)
    public static final void method2109(int arg0, boolean arg1) {
        if (arg1) {
            method2108(119, true, 2, 26, -63, 109, -79, -41);
        }
        field4720++;
        class126.field1997.method1429((byte) 127, arg0);
        class31.field397.method1429((byte) 127, arg0);
        class290.field4561.method1429((byte) 127, arg0);
        class170.field2534.method1429((byte) 127, arg0);
    }
}
