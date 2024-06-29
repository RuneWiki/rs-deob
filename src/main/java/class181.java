import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class181 extends class287 {

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lmh;")
    public class128 field3176;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3173 = 100;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Lmh;")
    public static class128 field3178 = class22.method156(126, "ul");

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lmh;")
    public static class128 field3169 = class22.method156(122, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lqe;")
    public static class177 field3175;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "[I")
    public static int[] field3170;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3179++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg6 - arg2;
        int var12 = arg4 * arg4;
        int var13 = arg4 - arg2;
        int var14 = var13 * var13;
        int var15 = var11 * var11;
        int var16 = var12 << 1;
        int var17 = arg6 * arg6;
        int var18 = var17 << 1;
        int var19 = var15 << 1;
        int var20 = var14 << 1;
        int var21 = var11 << 1;
        int var22 = arg6 << 1;
        int var23 = (1 - var22) * var12 + var18;
        int var24 = (1 - var21) * var14 + var19;
        int var25 = var17 - ((var22 - 1) * var16);
        int var26 = var12 << 2;
        int var27 = var15 - ((arg0 + var21) * var20);
        int var28 = var17 << 2;
        int var29 = var15 << 2;
        int var30 = (var22 - 3) * var16;
        int var31 = var14 << 2;
        int var32 = var19 * 3;
        int var33 = (var21 - 3) * var20;
        int var34 = var18 * 3;
        int var35 = (arg6 - 1) * var26;
        if (class70.field1315 <= arg1 && arg1 <= field3173) {
            int[] var36 = class219.field3850[arg1];
            int var37 = class7.method59(class43.field875, arg3 - arg4, class193.field3335, ~arg0);
            int var38 = class7.method59(class43.field875, arg3 + arg4, class193.field3335, 0);
            int var39 = class7.method59(class43.field875, arg3 - var13, class193.field3335, ~arg0);
            int var40 = class7.method59(class43.field875, arg3 + var13, class193.field3335, 0);
            class314.method2138(var39, true, arg7, var36, var37);
            class314.method2138(var40, true, arg5, var36, var39);
            class314.method2138(var38, true, arg7, var36, var40);
        }
        int var41 = (var11 - 1) * var31;
        int var42 = var28;
        int var43 = var29;
        while (var9 > 0) {
            boolean var44 = var11 >= var9;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var27 += var43;
                        var24 += var32;
                        var43 += var29;
                        var32 += var29;
                    }
                }
                if (var27 < 0) {
                    var24 += var32;
                    var27 += var43;
                    var10++;
                    var43 += var29;
                    var32 += var29;
                }
                var27 += -var33;
                var33 -= var31;
                var24 += -var41;
                var41 -= var31;
            }
            var9--;
            int var45 = arg1 + var9;
            int var46 = arg1 - var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var34;
                    var34 += var28;
                    var25 += var42;
                    var42 += var28;
                    var8++;
                }
            }
            if (var25 < 0) {
                var25 += var42;
                var8++;
                var42 += var28;
                var23 += var34;
                var34 += var28;
            }
            var23 += -var35;
            var25 += -var30;
            var35 -= var26;
            var30 -= var26;
            if (var45 >= class70.field1315 && var46 <= field3173) {
                int var47 = class7.method59(class43.field875, arg3 + var8, class193.field3335, ~arg0);
                int var48 = class7.method59(class43.field875, arg3 - var8, class193.field3335, 0);
                if (var44) {
                    int var49 = class7.method59(class43.field875, arg3 + var10, class193.field3335, 0);
                    int var50 = class7.method59(class43.field875, arg3 - var10, class193.field3335, 0);
                    if (class70.field1315 <= var46) {
                        int[] var51 = class219.field3850[var46];
                        class314.method2138(var50, true, arg7, var51, var48);
                        class314.method2138(var49, true, arg5, var51, var50);
                        class314.method2138(var47, true, arg7, var51, var49);
                    }
                    if (var45 <= field3173) {
                        int[] var52 = class219.field3850[var45];
                        class314.method2138(var50, true, arg7, var52, var48);
                        class314.method2138(var49, true, arg5, var52, var50);
                        class314.method2138(var47, true, arg7, var52, var49);
                    }
                } else {
                    if (class70.field1315 <= var46) {
                        class314.method2138(var47, true, arg7, class219.field3850[var46], var48);
                    }
                    if (var45 <= field3173) {
                        class314.method2138(var47, true, arg7, class219.field3850[var45], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V", line = 226)
    public static void method1236(byte arg0) {
        field3175 = null;
        field3169 = null;
        field3178 = null;
        if (arg0 < 92) {
            method1237(85, 97);
        }
        field3170 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 250)
    public class181() {
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 254)
    public static final void method1237(int arg0, int arg1) {
        field3177++;
        if (arg0 == -1 || !class133.method890(false, arg0)) {
            return;
        }
        class10[] var2 = class200.field3508[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class10 var4 = var2[var3];
            if (var4.field302 != null) {
                class102 var5 = new class102();
                var5.field1743 = var4.field302;
                var5.field1738 = var4;
                class147.method983(var5, true, 2000000);
            }
        }
        int var6 = 36 % ((arg1 + 72) / 34);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lmh;I)V", line = 294)
    public class181(class128 arg0, int arg1) {
        this.field3176 = arg0;
    }
}
