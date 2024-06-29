import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class172 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "[Lfu;")
    public class354[] field2051 = new class354[100];

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "[Lod;")
    public class463[] field2056 = new class463[8];

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "[I")
    public int[] field2057 = new int[100];

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "[I")
    public int[] field2059 = new int[3];

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "F")
    public static float field2052;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Lrd;")
    public static class305 field2060;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Lqq;")
    public static class434 field2055;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field2058;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method1016(boolean arg0) {
        if (arg0) {
            field2060 = null;
        }
        field2060 = null;
        field2055 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
    public static final int method1017(int arg0, int arg1) {
        return class425.field5651 == null ? 0 : class425.field5651[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Loa;Lfl;IIIII)V")
    public static final void method1018(class635 arg0, class673 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class337.field4416 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class181.field2222) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class272.field3451 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class287 var15 = class97.field1074[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class628.field8912[var12].method253(var13, var14) + class628.field8912[var12].method253(var13 + 1, var14) + class628.field8912[var12].method253(var13, var14 + 1) + class628.field8912[var12].method253(var13 + 1, var14 + 1)) / 4 - (class628.field8912[arg2].method253(arg3, arg4) + class628.field8912[arg2].method253(arg3 + 1, arg4) + class628.field8912[arg2].method253(arg3, arg4 + 1) + class628.field8912[arg2].method253(arg3 + 1, arg4 + 1)) / 4;
                                    class244 var17 = var15.field3697;
                                    class244 var18 = var15.field3690;
                                    if (var17 != null && var17.method449((byte) -126)) {
                                        arg1.method453(var7, var16, false, (var14 - arg4) * class463.field6445 + (1 - arg6) * class389.field5194, (var13 - arg3) * class463.field6445 + (1 - arg5) * class389.field5194, var17, arg0);
                                    }
                                    if (var18 != null && var18.method449((byte) -126)) {
                                        arg1.method453(var7, var16, false, (var14 - arg4) * class463.field6445 + (1 - arg6) * class389.field5194, (var13 - arg3) * class463.field6445 + (1 - arg5) * class389.field5194, var18, arg0);
                                    }
                                    for (class60 var19 = var15.field3680; var19 != null; var19 = var19.field623) {
                                        class354 var20 = var19.field625;
                                        if (var20 != null && var20.method449((byte) -126) && (var20.field4642 == var13 || var8 == var13) && (var20.field4648 == var14 || var10 == var14)) {
                                            int var21 = var20.field4645 + 1 - var20.field4642;
                                            int var22 = var20.field4639 + 1 - var20.field4648;
                                            arg1.method453(var7, var16, false, (var20.field4648 - arg4) * class463.field6445 + (var22 - arg6) * class389.field5194, (var20.field4642 - arg3) * class463.field6445 + (var21 - arg5) * class389.field5194, var20, arg0);
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
