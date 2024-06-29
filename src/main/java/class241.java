import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class241 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
    public static boolean field3300 = false;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lvv;IIIII)V")
    public static final void method1502(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class107.field1493 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class335.field4511) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class643.field8878 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class390 var14 = class295.field4051[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class409.field5812[var11].method332(var13, 1, var12) + class409.field5812[var11].method332(var13, 1, var12 + 1) + class409.field5812[var11].method332(var13 + 1, 1, var12) + class409.field5812[var11].method332(var13 + 1, 1, var12 + 1)) / 4 - (class409.field5812[arg1].method332(arg3, 1, arg2) + class409.field5812[arg1].method332(arg3, 1, arg2 + 1) + class409.field5812[arg1].method332(arg3 + 1, 1, arg2) + class409.field5812[arg1].method332(arg3 + 1, 1, arg2 + 1)) / 4;
                                    class201 var16 = var14.field5525;
                                    class201 var17 = var14.field5529;
                                    if (var16 != null && var16.method215(124)) {
                                        arg0.method223(var16, var15, (var13 - arg3) * class631.field8750 + (1 - arg5) * class265.field3586, var6, class401.field5619, (var12 - arg2) * class631.field8750 + (1 - arg4) * class265.field3586, 0);
                                    }
                                    if (var17 != null && var17.method215(66)) {
                                        arg0.method223(var17, var15, (var13 - arg3) * class631.field8750 + (1 - arg5) * class265.field3586, var6, class401.field5619, (var12 - arg2) * class631.field8750 + (1 - arg4) * class265.field3586, 0);
                                    }
                                    for (class467 var18 = var14.field5536; var18 != null; var18 = var18.field6421) {
                                        class210 var19 = var18.field6419;
                                        if (var19 != null && var19.method215(94) && (var19.field2972 == var12 || var7 == var12) && (var19.field2963 == var13 || var9 == var13)) {
                                            int var20 = var19.field2973 + 1 - var19.field2972;
                                            int var21 = var19.field2969 + 1 - var19.field2963;
                                            arg0.method223(var19, var15, (var19.field2963 - arg3) * class631.field8750 + (var21 - arg5) * class265.field3586, var6, class401.field5619, (var19.field2972 - arg2) * class631.field8750 + (var20 - arg4) * class265.field3586, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
