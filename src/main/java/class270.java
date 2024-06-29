import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class270 {

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Ltl;")
    public static class531 field3766 = new class531("LOCAL", 4);

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "F")
    public static float field3769;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
    public static int[] field3765;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "[[Z")
    public static boolean[][] field3764;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static final void method1755(byte arg0) {
        field3768++;
        if (class43.field817) {
            return;
        }
        class601.method3547(12453, class317.field4302);
        if (class118.field1941 != null) {
            class601.method3547(12453, class118.field1941);
        }
        int var1 = 27 % ((arg0 - 5) / 36);
        class43.field817 = true;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
    public static final int method1756(int arg0, int arg1) {
        return class590.field8423 == null ? 0 : class590.field8423[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILiaa;IIIB)V")
    public static final void method1757(int arg0, class421 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3763++;
        if (arg1.field5915 == -1 && arg1.field5921 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field5913 < arg4) {
            var6 += arg4 - arg1.field5913;
        } else if (arg4 < arg1.field5914) {
            var6 += arg1.field5914 - arg4;
        }
        int var7 = class491.field6875.field3354 * arg1.field5908 >> 8;
        if (arg2 > arg1.field5922) {
            var6 += arg2 - arg1.field5922;
        } else if (arg2 < arg1.field5906) {
            var6 += arg1.field5906 - arg2;
        }
        if (arg1.field5916 == 0 || var6 - 64 > arg1.field5916 || class491.field6875.field3354 == 0 || arg1.field5909 != arg3) {
            if (arg1.field5904 != null) {
                class204.field2869.method2731(arg1.field5904);
                arg1.field5904 = null;
            }
            if (arg1.field5903 != null) {
                class204.field2869.method2731(arg1.field5903);
                arg1.field5903 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field5916 - var6) * var7 / arg1.field5916;
        if (arg5 != 55) {
            method1758((byte) -64, -20, null);
        }
        if (arg1.field5904 != null) {
            arg1.field5904.method1695(var8);
        } else if (arg1.field5915 >= 0) {
            class544 var9 = class544.method3109(class603.field8707, arg1.field5915, 0);
            if (var9 != null) {
                class514 var10 = var9.method3108().method2975(class217.field3080);
                class260 var11 = class260.method1686(var10, 100, var8);
                var11.method1696(-1);
                class204.field2869.method2733(var11);
                arg1.field5904 = var11;
            }
        }
        if (arg1.field5903 != null) {
            arg1.field5903.method1695(var8);
            if (!arg1.field5903.method1120(arg5 ^ 0x37)) {
                arg1.field5903 = null;
            }
        } else if (arg1.field5921 != null && (arg1.field5923 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field5921.length);
            class544 var13 = class544.method3109(class603.field8707, arg1.field5921[var12], 0);
            if (var13 != null) {
                class514 var14 = var13.method3108().method2975(class217.field3080);
                class260 var15 = class260.method1686(var14, 100, var8);
                var15.method1696(0);
                class204.field2869.method2733(var15);
                arg1.field5923 = arg1.field5919 + ((int) ((double) (arg1.field5924 - arg1.field5919) * Math.random()));
                arg1.field5903 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BILmc;)I")
    public static final int method1758(byte arg0, int arg1, class114 arg2) {
        field3767++;
        if (arg0 > -70) {
            return -24;
        } else if (!client.method1534(arg2).method2894(arg1, (byte) 92) && arg2.field1821 == null) {
            return -1;
        } else if (arg2.field1756 == null || arg1 >= arg2.field1756.length) {
            return -1;
        } else {
            return arg2.field1756[arg1];
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1759(String arg0, int arg1) {
        field3770++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        if (arg1 != -8863) {
            method1758((byte) 91, -100, null);
        }
        String var2 = class366.method2198(arg0, -126);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class367.field4989; var3++) {
            String var4 = class474.field6677[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class366.method2198(var4, arg1 ^ 0x22E1);
            if (var5 != null && var5.equals(var2)) {
                class367.field4989--;
                for (int var6 = var3; var6 < class367.field4989; var6++) {
                    class474.field6677[var6] = class474.field6677[var6 + 1];
                    class326.field4381[var6] = class326.field4381[var6 + 1];
                    class345.field4645[var6] = class345.field4645[var6 + 1];
                    class165.field2376[var6] = class165.field2376[var6 + 1];
                    class210.field2963[var6] = class210.field2963[var6 + 1];
                    class254.field3519[var6] = class254.field3519[var6 + 1];
                }
                class426.field6055++;
                class633.field9257 = class81.field1324;
                class351.method2108(class215.field3054, -10511);
                class479.field6754.method108((byte) -128, class452.method2655(111, arg0));
                class479.field6754.method74(arg0, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public static void method1760(int arg0) {
        field3766 = null;
        if (arg0 == 0) {
            field3765 = null;
            field3764 = null;
        }
    }
}
