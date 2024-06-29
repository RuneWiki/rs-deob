import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class172 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lof;")
    public static class266 field3011 = new class266();

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[I")
    public static int[] field3017 = new int[1000];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lcf;")
    public static class93 field3012 = class147.method1066("(U(Y", -48);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lcf;")
    public static class93 field3016 = class147.method1066("Choisir une option", -48);

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
    public static int[] field3014 = new int[25];

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3015 = 0;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field3017 = null;
        if (arg0 == 16) {
            field3014 = null;
            field3012 = null;
            field3011 = null;
            field3016 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lpc;IIIIIIZ)V")
    public static final void method1232(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field286.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field286[var9] - class166.field2931;
            int var23 = arg0.field276[var9] - class263.field4692;
            int var24 = arg0.field282[var9] - class272.field4825;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field275 != null) {
                class21.field278[var9] = var25;
                class21.field277[var9] = var28;
                class21.field265[var9] = var29;
            }
            class21.field280[var9] = (var25 << 9) / var29 + class179.field3161;
            class21.field279[var9] = (var28 << 9) / var29 + class179.field3162;
        }
        class179.field3151 = 0;
        int var10 = arg0.field283.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field283[var11];
            int var13 = arg0.field281[var11];
            int var14 = arg0.field267[var11];
            int var15 = class21.field280[var12];
            int var16 = class21.field280[var13];
            int var17 = class21.field280[var14];
            int var18 = class21.field279[var12];
            int var19 = class21.field279[var13];
            int var20 = class21.field279[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class198.field3599 && class223.method1550(class191.field3492 + class179.field3161, class248.field4478 + class179.field3162, var18, var19, var20, var15, var16, var17)) {
                    class78.field1458 = arg5;
                    class26.field336 = arg6;
                }
                if (!arg7) {
                    class179.field3150 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class179.field3164 || var16 > class179.field3164 || var17 > class179.field3164) {
                        class179.field3150 = true;
                    }
                    if (arg0.field275 == null || arg0.field275[var11] == -1) {
                        if (arg0.field269[var11] != 12345678) {
                            class179.method1300(var18, var19, var20, var15, var16, var17, arg0.field269[var11], arg0.field270[var11], arg0.field284[var11]);
                        }
                    } else if (!class119.field2117) {
                        int var21 = class179.field3156.method1416((byte) 108, arg0.field275[var11]);
                        class179.method1300(var18, var19, var20, var15, var16, var17, class137.method1002(var21, arg0.field269[var11]), class137.method1002(var21, arg0.field270[var11]), class137.method1002(var21, arg0.field284[var11]));
                    } else if (arg0.field266) {
                        class179.method1319(var18, var19, var20, var15, var16, var17, arg0.field269[var11], arg0.field270[var11], arg0.field284[var11], class21.field278[0], class21.field278[1], class21.field278[3], class21.field277[0], class21.field277[1], class21.field277[3], class21.field265[0], class21.field265[1], class21.field265[3], arg0.field275[var11]);
                    } else {
                        class179.method1319(var18, var19, var20, var15, var16, var17, arg0.field269[var11], arg0.field270[var11], arg0.field284[var11], class21.field278[var12], class21.field278[var13], class21.field278[var14], class21.field277[var12], class21.field277[var13], class21.field277[var14], class21.field265[var12], class21.field265[var13], class21.field265[var14], arg0.field275[var11]);
                    }
                }
            }
        }
    }
}
