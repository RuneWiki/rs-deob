import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class144 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Z")
    public static boolean field2679 = true;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lej;")
    public static class48[] field2676;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[Lqb;")
    public static class56[] field2677;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrf;IIIIIIZ)V")
    public static final void method1097(class267 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4749.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4749[var9] - class108.field2050;
            int var23 = arg0.field4738[var9] - class79.field1526;
            int var24 = arg0.field4757[var9] - class88.field1673;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4748 != null) {
                class267.field4742[var9] = var25;
                class267.field4744[var9] = var28;
                class267.field4756[var9] = var29;
            }
            class267.field4751[var9] = (var25 << 9) / var29 + class178.field3239;
            class267.field4745[var9] = (var28 << 9) / var29 + class178.field3233;
        }
        class178.field3237 = 0;
        int var10 = arg0.field4752.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4752[var11];
            int var13 = arg0.field4747[var11];
            int var14 = arg0.field4739[var11];
            int var15 = class267.field4751[var12];
            int var16 = class267.field4751[var13];
            int var17 = class267.field4751[var14];
            int var18 = class267.field4745[var12];
            int var19 = class267.field4745[var13];
            int var20 = class267.field4745[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class196.field3566 && class268.method1848(class70.field1380 + class178.field3239, class178.field3233 + class170.field3113, var18, var19, var20, var15, var16, var17)) {
                    class26.field367 = arg5;
                    class220.field3959 = arg6;
                }
                if (!arg7) {
                    class178.field3242 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class178.field3238 || var16 > class178.field3238 || var17 > class178.field3238) {
                        class178.field3242 = true;
                    }
                    if (arg0.field4748 == null || arg0.field4748[var11] == -1) {
                        if (arg0.field4754[var11] != 12345678) {
                            class178.method1291(var18, var19, var20, var15, var16, var17, arg0.field4754[var11], arg0.field4737[var11], arg0.field4753[var11]);
                        }
                    } else if (!class9.field63) {
                        int var21 = class178.field3236.method772((byte) 2, arg0.field4748[var11]);
                        class178.method1291(var18, var19, var20, var15, var16, var17, class136.method1018(var21, arg0.field4754[var11]), class136.method1018(var21, arg0.field4737[var11]), class136.method1018(var21, arg0.field4753[var11]));
                    } else if (arg0.field4750) {
                        class178.method1295(var18, var19, var20, var15, var16, var17, arg0.field4754[var11], arg0.field4737[var11], arg0.field4753[var11], class267.field4742[0], class267.field4742[1], class267.field4742[3], class267.field4744[0], class267.field4744[1], class267.field4744[3], class267.field4756[0], class267.field4756[1], class267.field4756[3], arg0.field4748[var11]);
                    } else {
                        class178.method1295(var18, var19, var20, var15, var16, var17, arg0.field4754[var11], arg0.field4737[var11], arg0.field4753[var11], class267.field4742[var12], class267.field4742[var13], class267.field4742[var14], class267.field4744[var12], class267.field4744[var13], class267.field4744[var14], class267.field4756[var12], class267.field4756[var13], class267.field4756[var14], arg0.field4748[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method1098(boolean arg0) {
        field2676 = null;
        field2677 = null;
        if (!arg0) {
            method1098(true);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILnc;)Lqb;")
    public static final class56 method1099(int arg0, int arg1, class83 arg2) {
        field2678++;
        if (arg1 <= 25) {
            method1098(true);
        }
        return class240.method1702(-128, arg2, arg0) ? class164.method1219(-116) : null;
    }
}
