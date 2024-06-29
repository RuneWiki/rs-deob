import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class6 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Lfr;")
    public static class497 field59;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
    public static void method26(boolean arg0) {
        if (!arg0) {
            field57 = -66;
        }
        field59 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lya;Lqj;IIIII)V")
    public static final void method27(class11 arg0, class419 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class349.field5377 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class445.field6562) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class167.field2473 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class306 var15 = class236.field3305[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class249.field3405[var12].method707(var13, var14) + class249.field3405[var12].method707(var13 + 1, var14) + class249.field3405[var12].method707(var13, var14 + 1) + class249.field3405[var12].method707(var13 + 1, var14 + 1)) / 4 - (class249.field3405[arg2].method707(arg3, arg4) + class249.field3405[arg2].method707(arg3 + 1, arg4) + class249.field3405[arg2].method707(arg3, arg4 + 1) + class249.field3405[arg2].method707(arg3 + 1, arg4 + 1)) / 4;
                                    class512 var17 = var15.field4596;
                                    class512 var18 = var15.field4582;
                                    if (var17 != null && var17.method230(-22611)) {
                                        arg1.method224(arg0, var16, (var13 - arg3) * class324.field5060 + (1 - arg5) * class280.field4230, (var14 - arg4) * class324.field5060 + (1 - arg6) * class280.field4230, var17, -73, var7);
                                    }
                                    if (var18 != null && var18.method230(-22611)) {
                                        arg1.method224(arg0, var16, (var13 - arg3) * class324.field5060 + (1 - arg5) * class280.field4230, (var14 - arg4) * class324.field5060 + (1 - arg6) * class280.field4230, var18, -79, var7);
                                    }
                                    for (class17 var19 = var15.field4589; var19 != null; var19 = var19.field281) {
                                        class522 var20 = var19.field279;
                                        if (var20 != null && var20.method230(-22611) && (var20.field7687 == var13 || var8 == var13) && (var20.field7676 == var14 || var10 == var14)) {
                                            int var21 = var20.field7683 + 1 - var20.field7687;
                                            int var22 = var20.field7673 + 1 - var20.field7676;
                                            arg1.method224(arg0, var16, (var20.field7687 - arg3) * class324.field5060 + (var21 - arg5) * class280.field4230, (var20.field7676 - arg4) * class324.field5060 + (var22 - arg6) * class280.field4230, var20, -64, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }
}
