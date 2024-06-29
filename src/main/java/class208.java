import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class208 implements class147 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3299 = "glow1:";

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3302 = "glow3:";

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lca;")
    public static class139 field3298;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static final void method1452() {
        for (int var0 = 0; var0 < class18.field217; var0++) {
            class179 var1 = class151.field2343[var0];
            class124.method870(var1);
            class151.field2343[var0] = null;
        }
        class18.field217 = 0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1453(byte arg0) {
        if (arg0 <= 13) {
            method1454((class2) null, 29, -24, 127, 91, 25);
        }
        field3298 = null;
        field3299 = null;
        field3302 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
    public final String method1029(long arg0, int arg1, int arg2, int[] arg3) {
        field3301++;
        if (arg1 == 0) {
            class234 var6 = class309.method2065(arg3[0], 27029);
            return var6.method1585(true, (int) arg0);
        } else if (arg1 == 1 || arg1 == 10) {
            class115 var7 = class81.method562((int) arg0, -20358);
            return var7.field1799;
        } else if (arg1 == arg2 || arg1 == 7 || arg1 == 11) {
            return class309.method2065(arg3[0], 27029).method1585(true, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lqk;IIIII)V")
    public static final void method1454(class2 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class183.field3013 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class96.field1548) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class59.field972 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class151 var14 = class218.field3584[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class267.field4304[var11][var12 + 1][var13] + class267.field4304[var11][var12][var13] + class267.field4304[var11][var12][var13 + 1] + class267.field4304[var11][var12 + 1][var13 + 1]) / 4 - (class267.field4304[arg1][arg2 + 1][arg3] + class267.field4304[arg1][arg2][arg3] + class267.field4304[arg1][arg2][arg3 + 1] + class267.field4304[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class209 var16 = var14.field2352;
                                    if (var16 != null) {
                                        if (var16.field3305.method11()) {
                                            arg0.method16(var16.field3305, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3316 != null && var16.field3316.method11()) {
                                            arg0.method16(var16.field3316, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2357; var17++) {
                                        class179 var18 = var14.field2347[var17];
                                        if (var18 != null && var18.field2932.method11() && (var18.field2931 == var12 || var7 == var12) && (var18.field2915 == var13 || var9 == var13)) {
                                            int var19 = var18.field2918 + 1 - var18.field2931;
                                            int var20 = var18.field2925 + 1 - var18.field2915;
                                            arg0.method16(var18.field2932, (var18.field2931 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2915 - arg3) * 128 + (var20 - arg5) * 64, var6);
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
