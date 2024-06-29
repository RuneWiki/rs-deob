import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class130 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field2184 = -1;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lqe;")
    public static class468 field2186;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lda;")
    public static class60 field2182;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLda;Loea;Ljava/lang/String;ILha;)V", line = 4)
    public static final void method1074(boolean arg0, class60 arg1, class597 arg2, String arg3, int arg4, class59 arg5) {
        if (arg4 != 2) {
            field2182 = null;
        }
        field2183++;
        boolean var6 = !class67.field1270 || class753.method4202(true);
        if (!var6) {
            return;
        }
        if (class67.field1270 && var6) {
            class597 var7 = class276.field3876;
            class60 var8 = arg5.method216(var7, class729.field9866, true);
            int var9 = var7.method3393(arg3, false, 250, null);
            int var10 = var7.method3391(null, arg4 ^ 0x2, var7.field8159, 250, arg3);
            int var11 = class54.field1102.field3784;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var10;
            int var14 = var12 * 2 + var9;
            if (class537.field7421 > var13) {
                var13 = class537.field7421;
            }
            if (var14 < class591.field8074) {
                var14 = class591.field8074;
            }
            int var15 = class471.field6601.method892(class478.field6661, var14, (byte) -107) + class316.field4372;
            int var16 = class518.field7206.method1644(class22.field488, var13, 1595) + class615.field8404;
            if (class241.field3529) {
                var15 += class146.method1163((byte) -124);
                var16 += class313.method2035(false);
            }
            arg5.method356(class724.field9810, false).method1622(class230.field3327.field3784 + var15, class230.field3327.field3778 + var16, var14 - (class230.field3327.field3784 * 2), -(class230.field3327.field3778 * 2) + var13, 1, 0, 0);
            arg5.method356(class230.field3327, true).method2925(var15, var16);
            class230.field3327.method1777();
            arg5.method356(class230.field3327, true).method2925(var14 + var15 - var11, var16);
            class230.field3327.method1773();
            arg5.method356(class230.field3327, true).method2925(var15 + var14 - var11, var16 - -var13 + -var11);
            class230.field3327.method1777();
            arg5.method356(class230.field3327, true).method2925(var15, var16 + var13 - var11);
            class230.field3327.method1773();
            arg5.method356(class54.field1102, true).method2923(var15, class230.field3327.field3778 + var16, var11, var13 - (class230.field3327.field3778 * 2));
            class54.field1102.method1779();
            arg5.method356(class54.field1102, true).method2923(class230.field3327.field3784 + var15, var16, var14 - (class230.field3327.field3784 * 2), var11);
            class54.field1102.method1779();
            arg5.method356(class54.field1102, true).method2923(var15 + var14 - var11, class230.field3327.field3778 + var16, var11, var13 - (class230.field3327.field3778 * 2));
            class54.field1102.method1779();
            arg5.method356(class54.field1102, true).method2923(class230.field3327.field3784 + var15, -var11 + var16 - -var13, var14 - (class230.field3327.field3784 * 2), var11);
            class54.field1102.method1779();
            var8.method646(null, 0, -1, null, class612.field8369 | 0xFF000000, 1, var13 - (var12 * 2), null, var12 + var16, 0, 0, var14 - (var12 * 2), var12 + var15, false, 1, arg3);
            class633.method3613(var15, var14, var16, arg4 ^ 0x2, var13);
        } else {
            int var17 = arg2.method3393(arg3, false, 250, null);
            int var18 = arg2.method3396(null, 1, arg3, 250) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg5.method217(var20 - var19, -var19 + var21, var17 + var19 + var19, var19 - -var19 + var18, -16777216, 0);
            arg5.method288(var20 - var19, -var19 + var21, var17 + var19 + var19, var19 + var19 + var18, -1, 0);
            arg1.method646(null, 0, -1, null, -1, 1, var18, null, var21, 0, 0, var17, var20, false, 1, arg3);
            class633.method3613(var20 - var19, var17 + var19 - -var19, var21 - var19, arg4 + -2, var18 + var19 + var19);
        }
        if (!arg0) {
            return;
        }
        try {
            if (class241.field3529) {
                class91.method848(arg4 + 79);
            } else {
                arg5.method627((byte) 118);
            }
        } catch (class721 var22) {
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 103)
    public static void method1075(int arg0) {
        field2186 = null;
        if (arg0 != 4) {
            field2184 = 96;
        }
        field2182 = null;
    }
}
