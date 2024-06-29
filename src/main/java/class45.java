import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class45 {

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[J")
    public static long[] field705 = new long[32];

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    public static boolean field701 = false;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lpf;")
    public static class17 field703 = new class17(4);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Laj;")
    public static class151 field704;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Laj;")
    public static class151 field707;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient;")
    public static client field702;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method276(boolean arg0, char arg1, String arg2) {
        field700++;
        if (arg0) {
            return null;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = class303.method2062(true, arg1, arg2);
        String[] var6 = new String[var5 + 1];
        for (int var7 = 0; var7 < var5; var7++) {
            int var8;
            for (var8 = var4; arg2.charAt(var8) != arg1; var8++) {
            }
            var6[var3++] = arg2.substring(var4, var8);
            var4 = var8 + 1;
        }
        var6[var5] = arg2.substring(var4);
        return var6;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lt;IIIIIIZ)V")
    public static final void method277(class52 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field886.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field886[var9] - class118.field1987;
            int var23 = arg0.field887[var9] - class28.field481;
            int var24 = arg0.field875[var9] - class84.field1398;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field872 != null) {
                class52.field880[var9] = var25;
                class52.field891[var9] = var28;
                class52.field881[var9] = var29;
            }
            class52.field885[var9] = (var25 << 9) / var29 + class128.field2132;
            class52.field874[var9] = (var28 << 9) / var29 + class128.field2137;
        }
        class128.field2126 = 0;
        int var10 = arg0.field888.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field888[var11];
            int var13 = arg0.field884[var11];
            int var14 = arg0.field871[var11];
            int var15 = class52.field885[var12];
            int var16 = class52.field885[var13];
            int var17 = class52.field885[var14];
            int var18 = class52.field874[var12];
            int var19 = class52.field874[var13];
            int var20 = class52.field874[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class80.field1345 && class179.method1306(class307.field4963 + class128.field2132, class295.field4845 + class128.field2137, var18, var19, var20, var15, var16, var17)) {
                    class97.field1571 = arg5;
                    class100.field1587 = arg6;
                }
                if (!arg7) {
                    class128.field2141 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class128.field2135 || var16 > class128.field2135 || var17 > class128.field2135) {
                        class128.field2141 = true;
                    }
                    if (arg0.field872 == null || arg0.field872[var11] == -1) {
                        if (arg0.field882[var11] != 12345678) {
                            class128.method953(var18, var19, var20, var15, var16, var17, arg0.field882[var11], arg0.field889[var11], arg0.field879[var11]);
                        }
                    } else if (!class190.field3044) {
                        int var21 = class128.field2136.method703(2213, arg0.field872[var11]);
                        class128.method953(var18, var19, var20, var15, var16, var17, class143.method1058(var21, arg0.field882[var11]), class143.method1058(var21, arg0.field889[var11]), class143.method1058(var21, arg0.field879[var11]));
                    } else if (arg0.field873) {
                        class128.method959(var18, var19, var20, var15, var16, var17, arg0.field882[var11], arg0.field889[var11], arg0.field879[var11], class52.field880[0], class52.field880[1], class52.field880[3], class52.field891[0], class52.field891[1], class52.field891[3], class52.field881[0], class52.field881[1], class52.field881[3], arg0.field872[var11]);
                    } else {
                        class128.method959(var18, var19, var20, var15, var16, var17, arg0.field882[var11], arg0.field889[var11], arg0.field879[var11], class52.field880[var12], class52.field880[var13], class52.field880[var14], class52.field891[var12], class52.field891[var13], class52.field891[var14], class52.field881[var12], class52.field881[var13], class52.field881[var14], arg0.field872[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method278(int arg0) {
        int var1 = -122 % ((-arg0 - 25) / 50);
        field705 = null;
        field707 = null;
        field703 = null;
        field704 = null;
        field702 = null;
    }
}
