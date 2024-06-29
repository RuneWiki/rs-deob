import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class154 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    public static boolean field2293 = false;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2300 = " is already on your friend list.";

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ldl;")
    public static class123 field2292;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field2291;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public static int[] field2295;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1020(String arg0, int arg1) {
        field2297++;
        if (arg1 < 4) {
            method1025((class219) null, 118, -22, 40, -30, 83);
        }
        String var2 = class75.method510(-8950, class162.method1116(arg0, (byte) 87));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)I")
    public static final int method1021(boolean arg0, int arg1) {
        field2290++;
        if (!arg0) {
            field2292 = null;
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1022(int arg0) {
        field2291 = null;
        field2292 = null;
        field2300 = null;
        field2295 = null;
        if (arg0 != -1) {
            method1025((class219) null, -49, 38, 69, 112, -51);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
    public static final void method1023(int arg0, int arg1) {
        field2299++;
        int var2 = 60 / ((51 - arg0) / 52);
        class287 var3 = class261.method1786(arg1, false, 7);
        var3.method1912((byte) 115);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method1024(int arg0) {
        field2298++;
        int var1 = class57.field808;
        int var2 = class240.field3852;
        int var3 = class25.field345;
        int var4 = class106.field1641;
        if (class239.field3812 == null || class92.field1434 == null) {
            if (class237.field3802.method806(126, class158.field2434) && class237.field3802.method806(123, class201.field3153)) {
                class239.field3812 = class85.method592(true, class237.field3802, class158.field2434, 0);
                class92.field1434 = class85.method592(true, class237.field3802, class201.field3153, 0);
            } else {
                class127.method860(var1, var2, var4, 20, class279.field4426, 256 - class279.field4429);
            }
        }
        if (class239.field3812 != null && class92.field1434 != null) {
            int var5 = var4 / class239.field3812.field3712;
            for (int var6 = 0; var6 < var5; var6++) {
                class239.field3812.method71(var1 + (class239.field3812.field3712 * var6), var2);
            }
            class92.field1434.method71(var1, var2);
            class92.field1434.method93(var4 + var1 - class92.field1434.field3712, var2);
        }
        class232.field3734.method1325(class86.field1366, var1 + 3, var2 - -14, class86.field1357, -1);
        class127.method860(var1, var2 + 20, var4, var3 - 20, class279.field4426, 256 - class279.field4429);
        int var7 = class31.field416;
        int var8 = class141.field2074;
        for (int var9 = arg0; var9 < class245.field3920; var9++) {
            int var17 = (class245.field3920 - var9 - 1) * 15 + var2 + 35;
            if (var1 < var7 && var7 < var1 + var4 && (var17 - 13) < var8 && (var17 + 3) > var8) {
                class127.method860(var1, var17 - 13, var4, 16, class173.field2716, 256 - class206.field3222);
            }
        }
        if ((class181.field2869 == null || class149.field2221 == null || class50.field682 == null) && class237.field3802.method806(arg0 + 61, class182.field2888) && class237.field3802.method806(arg0 ^ 0x54, class212.field3317) && class237.field3802.method806(113, class249.field3997)) {
            class181.field2869 = class85.method592(true, class237.field3802, class182.field2888, 0);
            class149.field2221 = class85.method592(true, class237.field3802, class212.field3317, 0);
            class50.field682 = class85.method592(true, class237.field3802, class249.field3997, 0);
        }
        if (class181.field2869 != null && class149.field2221 != null && class50.field682 != null) {
            int var10 = var4 / class181.field2869.field3712;
            for (int var11 = 0; var11 < var10; var11++) {
                class181.field2869.method71(var1 + (class181.field2869.field3712 * var11), -class181.field2869.field3713 + var3 + var2);
            }
            int var12 = (var3 - 20) / class149.field2221.field3713;
            for (int var13 = 0; var13 < var12; var13++) {
                class149.field2221.method71(var1, class149.field2221.field3713 * var13 + var2 + 20);
                class149.field2221.method93(var1 + var4 - class149.field2221.field3712, class149.field2221.field3713 * var13 + var2 - -20);
            }
            class50.field682.method71(var1, var2 + var3 - class50.field682.field3713);
            class50.field682.method93(var1 - (class50.field682.field3712 - var4), -class50.field682.field3713 + var3 + var2);
        }
        for (int var14 = 0; var14 < class245.field3920; var14++) {
            int var15 = (class245.field3920 - var14 - 1) * 15 + var2 + 35;
            int var16 = class86.field1357;
            if (var7 > var1 && var1 + var4 > var7 && var8 > var15 - 13 && var8 < var15 + 3) {
                var16 = class69.field968;
            }
            class232.field3734.method1325(class102.method674(-19736, var14), var1 + 3, var15, var16, 0);
        }
        class79.method532(class57.field808, class106.field1641, class240.field3852, class25.field345, 2);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lhi;IIIII)V")
    public static final void method1025(class219 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class194.field3046 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class158.field2433) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class54.field749 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class49 var14 = class90.field1382[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class200.field3128[var11][var12 + 1][var13] + class200.field3128[var11][var12][var13] + class200.field3128[var11][var12][var13 + 1] + class200.field3128[var11][var12 + 1][var13 + 1]) / 4 - (class200.field3128[arg1][arg2 + 1][arg3] + class200.field3128[arg1][arg2][arg3] + class200.field3128[arg1][arg2][arg3 + 1] + class200.field3128[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class69 var16 = var14.field627;
                                    if (var16 != null) {
                                        if (var16.field963.method1089()) {
                                            arg0.method1080(var16.field963, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field965 != null && var16.field965.method1089()) {
                                            arg0.method1080(var16.field965, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field639; var17++) {
                                        class284 var18 = var14.field643[var17];
                                        if (var18 != null && var18.field4500.method1089() && (var18.field4494 == var12 || var7 == var12) && (var18.field4498 == var13 || var9 == var13)) {
                                            int var19 = var18.field4504 + 1 - var18.field4494;
                                            int var20 = var18.field4510 + 1 - var18.field4498;
                                            arg0.method1080(var18.field4500, (var18.field4494 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4498 - arg3) * 128 + (var20 - arg5) * 64, var6);
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
