import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class269 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4123 = "";

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
    public static boolean field4120 = false;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILmd;IJIIII)Z", line = 10)
    public static final boolean method1890(int arg0, int arg1, int arg2, int arg3, class233 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class327.method2229(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Lwi;", line = 18)
    public static final class198 method1891(int arg0) {
        field4125++;
        if (arg0 != 1265832496) {
            method1892((byte) -56);
        }
        try {
            return (class198) Class.forName("mh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class325();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 36)
    public static void method1892(byte arg0) {
        field4123 = null;
        if (arg0 > -119) {
            method1896(-84, 51, (byte) -93, 110, 41, 124, 14, -17);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lmd;IIIII)V", line = 50)
    public static final void method1893(class233 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class183.field2743 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class311.field4734) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class191.field2844 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class221 var14 = class158.field2367[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class294.field4502[var11][var12 + 1][var13] + class294.field4502[var11][var12][var13] + class294.field4502[var11][var12][var13 + 1] + class294.field4502[var11][var12 + 1][var13 + 1]) / 4 - (class294.field4502[arg1][arg2 + 1][arg3] + class294.field4502[arg1][arg2][arg3] + class294.field4502[arg1][arg2][arg3 + 1] + class294.field4502[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class163 var16 = var14.field3370;
                                    if (var16 != null) {
                                        if (var16.field2451.method564()) {
                                            arg0.method558(var16.field2451, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2452 != null && var16.field2452.method564()) {
                                            arg0.method558(var16.field2452, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3374; var17++) {
                                        class311 var18 = var14.field3354[var17];
                                        if (var18 != null && var18.field4728.method564() && (var18.field4724 == var12 || var7 == var12) && (var18.field4735 == var13 || var9 == var13)) {
                                            int var19 = var18.field4722 + 1 - var18.field4724;
                                            int var20 = var18.field4726 + 1 - var18.field4735;
                                            arg0.method558(var18.field4728, (var18.field4724 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4735 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 147)
    public static final void method1894(byte arg0, Component arg1) {
        arg1.addMouseListener(class186.field2779);
        arg1.addMouseMotionListener(class186.field2779);
        arg1.addFocusListener(class186.field2779);
        field4121++;
        int var2 = -28 / ((-arg0 - 7) / 37);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILv;II)V", line = 166)
    public static final void method1895(int arg0, int arg1, int arg2, class252 arg3, int arg4, int arg5) {
        field4124++;
        if (arg3.field3755 == -1 && arg3.field3759 == null) {
            return;
        }
        int var6 = 0;
        if (arg5 > arg3.field3760) {
            var6 += arg5 - arg3.field3760;
        } else if (arg3.field3764 > arg5) {
            var6 += arg3.field3764 - arg5;
        }
        if (arg3.field3766 < arg2) {
            var6 += arg2 - arg3.field3766;
        } else if (arg3.field3762 > arg2) {
            var6 += arg3.field3762 - arg2;
        }
        if (arg3.field3758 == 0 || (var6 - 64) > arg3.field3758 || class272.field4183 == 0 || arg3.field3772 != arg0) {
            if (arg3.field3776 != null) {
                class72.field936.method2230(arg3.field3776);
                arg3.field3776 = null;
            }
            if (arg3.field3777 != null) {
                class72.field936.method2230(arg3.field3777);
                arg3.field3777 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg3.field3758 - var6) * class272.field4183 / arg3.field3758;
        if (arg3.field3776 != null) {
            arg3.field3776.method1517(var7);
        } else if (arg3.field3755 >= 0) {
            class65 var8 = class65.method431(class113.field1744, arg3.field3755, 0);
            if (var8 != null) {
                class220 var9 = var8.method432().method1547(class185.field2766);
                class219 var10 = class219.method1515(var9, 100, var7);
                var10.method1533(-1);
                class72.field936.method2234(var10);
                arg3.field3776 = var10;
            }
        }
        if (arg1 <= 101) {
            return;
        }
        if (arg3.field3777 != null) {
            arg3.field3777.method1517(var7);
            if (!arg3.field3777.method716((byte) 82)) {
                arg3.field3777 = null;
            }
        } else if (arg3.field3759 != null && (arg3.field3775 -= arg4) <= 0) {
            int var11 = (int) (Math.random() * (double) arg3.field3759.length);
            class65 var12 = class65.method431(class113.field1744, arg3.field3759[var11], 0);
            if (var12 != null) {
                class220 var13 = var12.method432().method1547(class185.field2766);
                class219 var14 = class219.method1515(var13, 100, var7);
                var14.method1533(0);
                class72.field936.method2234(var14);
                arg3.field3775 = arg3.field3754 + (int) (Math.random() * (double) (arg3.field3761 - arg3.field3754));
                arg3.field3777 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBIIIII)V", line = 287)
    public static final void method1896(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4122++;
        if (arg7 < 128 || arg5 < 128 || arg7 > 13056 || arg5 > 13056) {
            class160.field2398 = -1;
            class159.field2385 = -1;
            return;
        }
        int var8 = class74.method473(arg5, arg7, 64, class180.field2697) - arg1;
        int var9 = class148.field2239[class160.field2392];
        int var10 = arg7 - class302.field4612;
        int var11 = var8 - class287.field4338;
        int var12 = class148.field2229[class160.field2392];
        int var13 = arg5 - class203.field3052;
        int var14 = class148.field2239[class84.field1249];
        int var15 = class148.field2229[class84.field1249];
        int var16 = var10 * var15 + var13 * var14 >> 16;
        int var17 = var13 * var15 - (var10 * var14) >> 16;
        if (arg2 != -75) {
            return;
        }
        int var19 = var11 * var12 - (var9 * var17) >> 16;
        int var20 = var9 * var11 + (var12 * var17) >> 16;
        if (var20 < 50) {
            class159.field2385 = -1;
            class160.field2398 = -1;
        } else if (class117.field1817) {
            int var22 = arg6 * 512 >> 8;
            class160.field2398 = var16 * var22 / var20 + arg3;
            int var23 = arg4 * 512 >> 8;
            class159.field2385 = var19 * var23 / var20 + arg0;
        } else {
            class159.field2385 = (var19 << 9) / var20 + arg0;
            class160.field2398 = arg3 + ((var16 << 9) / var20);
        }
    }
}
