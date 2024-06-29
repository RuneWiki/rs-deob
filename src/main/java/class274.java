import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class274 extends class551 {

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Ljm;")
    public class267 field4047;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field4045 = 4;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lqa;Lse;IIIII)V")
    public static final void method1730(class167 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class487.field7383 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class331.field4909) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class366.field5271 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class415 var15 = class526.field7777[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class235.field3455[var12].method1319(var13, var14) + class235.field3455[var12].method1319(var13 + 1, var14) + class235.field3455[var12].method1319(var13, var14 + 1) + class235.field3455[var12].method1319(var13 + 1, var14 + 1)) / 4 - (class235.field3455[arg2].method1319(arg3, arg4) + class235.field3455[arg2].method1319(arg3 + 1, arg4) + class235.field3455[arg2].method1319(arg3, arg4 + 1) + class235.field3455[arg2].method1319(arg3 + 1, arg4 + 1)) / 4;
                                    class578 var17 = var15.field5987;
                                    class578 var18 = var15.field5978;
                                    if (var17 != null && var17.method167(true)) {
                                        arg1.method160((var14 - arg4) * class177.field2692 + (1 - arg6) * class605.field8913, arg0, -4, var16, var7, var17, (var13 - arg3) * class177.field2692 + (1 - arg5) * class605.field8913);
                                    }
                                    if (var18 != null && var18.method167(true)) {
                                        arg1.method160((var14 - arg4) * class177.field2692 + (1 - arg6) * class605.field8913, arg0, -4, var16, var7, var18, (var13 - arg3) * class177.field2692 + (1 - arg5) * class605.field8913);
                                    }
                                    for (class639 var19 = var15.field5981; var19 != null; var19 = var19.field9291) {
                                        class237 var20 = var19.field9288;
                                        if (var20 != null && var20.method167(true) && (var20.field3469 == var13 || var8 == var13) && (var20.field3472 == var14 || var10 == var14)) {
                                            int var21 = var20.field3459 + 1 - var20.field3469;
                                            int var22 = var20.field3462 + 1 - var20.field3472;
                                            arg1.method160((var20.field3472 - arg4) * class177.field2692 + (var22 - arg6) * class605.field8913, arg0, -4, var16, var7, var20, (var20.field3469 - arg3) * class177.field2692 + (var21 - arg5) * class605.field8913);
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

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)V")
    public static final void method1731(boolean arg0, boolean arg1) {
        class122.field1577++;
        class165.method1046(-3466, class30.field307);
        field4046++;
        if (!arg0) {
            return;
        }
        for (class184 var2 = (class184) class600.field8865.method1331(-1925); var2 != null; var2 = (class184) class600.field8865.method1340((byte) -124)) {
            if (!var2.method2994(112)) {
                var2 = (class184) class600.field8865.method1331(-1925);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2795 == 0) {
                class587.method3424(544, true, var2, arg1);
            }
        }
        if (class135.field1798 != null) {
            class619.method3586(47, class135.field1798);
            class135.field1798 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljm;)V")
    public class274(class267 arg0) {
        this.field4047 = arg0;
    }
}
