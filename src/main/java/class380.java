import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class380 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Luv;")
    public static class3 field5314 = new class3(19, 7);

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "[I")
    public static int[] field5315 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "F")
    public static float field5316;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)Lvh;")
    public static final class249 method2313(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        return var3 == null || var3.field7891 == null ? null : var3.field7891;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static void method2314(int arg0) {
        field5315 = null;
        field5314 = null;
        if (arg0 != -29821) {
            method2315(null, null, -13, 35, 109, 67, -96);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lqa;Llb;IIIII)V")
    public static final void method2315(class167 arg0, class239 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class183.field2341 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class260.field3211) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class541.field7566 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class563 var15 = class199.field2605[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class501.field6947[var12].method1031(var13, var14) + class501.field6947[var12].method1031(var13 + 1, var14) + class501.field6947[var12].method1031(var13, var14 + 1) + class501.field6947[var12].method1031(var13 + 1, var14 + 1)) / 4 - (class501.field6947[arg2].method1031(arg3, arg4) + class501.field6947[arg2].method1031(arg3 + 1, arg4) + class501.field6947[arg2].method1031(arg3, arg4 + 1) + class501.field6947[arg2].method1031(arg3 + 1, arg4 + 1)) / 4;
                                    class8 var17 = var15.field7896;
                                    class8 var18 = var15.field7884;
                                    if (var17 != null && var17.method64(-1)) {
                                        arg1.method54((var14 - arg4) * class456.field6523 + (1 - arg6) * class337.field4699, 122, var16, arg0, (var13 - arg3) * class456.field6523 + (1 - arg5) * class337.field4699, var7, var17);
                                    }
                                    if (var18 != null && var18.method64(-1)) {
                                        arg1.method54((var14 - arg4) * class456.field6523 + (1 - arg6) * class337.field4699, 101, var16, arg0, (var13 - arg3) * class456.field6523 + (1 - arg5) * class337.field4699, var7, var18);
                                    }
                                    for (class15 var19 = var15.field7894; var19 != null; var19 = var19.field158) {
                                        class450 var20 = var19.field161;
                                        if (var20 != null && var20.method64(-1) && (var20.field6361 == var13 || var8 == var13) && (var20.field6359 == var14 || var10 == var14)) {
                                            int var21 = var20.field6357 + 1 - var20.field6361;
                                            int var22 = var20.field6367 + 1 - var20.field6359;
                                            arg1.method54((var20.field6359 - arg4) * class456.field6523 + (var22 - arg6) * class337.field4699, 94, var16, arg0, (var20.field6361 - arg3) * class456.field6523 + (var21 - arg5) * class337.field4699, var7, var20);
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

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lkr;I)V")
    public static final void method2316(class329 arg0, int arg1) {
        class592.field8551 = arg0;
        field5313++;
        if (arg1 != 14282) {
            method2315(null, null, -21, 4, 39, 112, -87);
        }
    }
}
