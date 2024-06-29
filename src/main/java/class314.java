import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class314 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field4666 = 0;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field4670 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lth;")
    public static class57 field4673 = new class57(50);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lph;")
    public static class361 field4665;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([BB)V", line = 4)
    public static final void method2192(byte[] arg0, byte arg1) {
        field4667++;
        class190 var2 = new class190(arg0);
        var2.field2776 = arg0.length - 2;
        class220.field3285 = var2.method1317((byte) 91);
        class160.field2319 = new int[class220.field3285];
        class59.field871 = new int[class220.field3285];
        class225.field3385 = new byte[class220.field3285][];
        class30.field421 = new boolean[class220.field3285];
        class225.field3397 = new int[class220.field3285];
        class41.field605 = new byte[class220.field3285][];
        class199.field2896 = new int[class220.field3285];
        var2.field2776 = arg0.length - class220.field3285 * 8 - 7;
        class255.field3816 = var2.method1317((byte) 83);
        class22.field336 = var2.method1317((byte) 78);
        int var3 = (var2.method1319(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class220.field3285; var4++) {
            class199.field2896[var4] = var2.method1317((byte) 31);
        }
        for (int var5 = 0; var5 < class220.field3285; var5++) {
            class160.field2319[var5] = var2.method1317((byte) 102);
        }
        for (int var6 = 0; var6 < class220.field3285; var6++) {
            class59.field871[var6] = var2.method1317((byte) 108);
        }
        for (int var7 = 0; var7 < class220.field3285; var7++) {
            class225.field3397[var7] = var2.method1317((byte) 93);
        }
        var2.field2776 = arg0.length + 3 - (var3 * 3) - (class220.field3285 * 8) - 7;
        class206.field3015 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class206.field3015[var8] = var2.method1312(93);
            if (class206.field3015[var8] == 0) {
                class206.field3015[var8] = 1;
            }
        }
        var2.field2776 = 0;
        for (int var9 = 0; var9 < class220.field3285; var9++) {
            int var10 = class59.field871[var9];
            int var11 = class225.field3397[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class225.field3385[var9] = var15;
            class41.field605[var9] = var13;
            int var16 = var2.method1319(255);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var15[var22] = var2.method1322(9813);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method1322(9813);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label89: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label89;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var13[var10 * var20 + var19] = var2.method1322(9813);
                                var14 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var15[var10 * var18 + var17] = var2.method1322(9813);
                    }
                    var17++;
                }
            }
            class30.field421[var9] = var14;
        }
        int var25 = 76 / ((-arg1 - 24) / 49);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILqm;BII)V", line = 171)
    public static final void method2193(int arg0, class228 arg1, byte arg2, int arg3, int arg4) {
        field4669++;
        if (class1.field55 == arg1 || class264.field4043 >= 400) {
            return;
        }
        int var5 = -66 % ((-arg2 - 8) / 41);
        String var12;
        if (arg1.field3441 == 0) {
            boolean var6 = true;
            if (class1.field55.field3466 != -1 && arg1.field3466 != -1) {
                int var7 = class1.field55.field3466 < arg1.field3466 ? class1.field55.field3466 : arg1.field3466;
                int var8 = class1.field55.field3459 - arg1.field3459;
                if (var8 < 0) {
                    var8 = -var8;
                }
                int var9 = arg1.field3459 >= class1.field55.field3459 ? arg1.field3459 : class1.field55.field3459;
                int var10 = var9 * 10 / 100 + var7 + 5;
                if (var8 > var10) {
                    var6 = false;
                }
            }
            String var11 = class164.field2335 == 1 ? class103.field1485 : class49.field730;
            if (arg1.field3436 <= arg1.field3459) {
                var12 = arg1.method1703(-111, true) + (var6 ? class286.method2066(class1.field55.field3459, true, arg1.field3459) : "<col=ffffff>") + " (" + var11 + arg1.field3459 + ")";
            } else {
                var12 = arg1.method1703(90, true) + (var6 ? class286.method2066(class1.field55.field3459, true, arg1.field3459) : "<col=ffffff>") + " (" + var11 + arg1.field3459 + "+" + (arg1.field3436 - arg1.field3459) + ")";
            }
        } else {
            var12 = arg1.method1703(67, true) + " (" + class318.field4789 + arg1.field3441 + ")";
        }
        if (class239.field3562 == 1) {
            class261.method1920((short) 36, class357.field5471, class15.field231, arg3, class333.field5176 + " -> <col=ffffff>" + var12, -2, arg4, (long) arg0);
            class307.field4589++;
        } else if (!class273.field4150) {
            for (int var13 = 7; var13 >= 0; var13--) {
                if (class247.field3661[var13] != null) {
                    class298.field4459++;
                    boolean var14 = false;
                    short var15 = 0;
                    if (class164.field2335 == 0 && class247.field3661[var13].equalsIgnoreCase(class74.field1084)) {
                        if (arg1.field3459 > class1.field55.field3459) {
                            var15 = 2000;
                        }
                        if (class1.field55.field3431 != 0 && arg1.field3431 != 0) {
                            if (class1.field55.field3431 == arg1.field3431) {
                                var15 = 2000;
                            } else {
                                var15 = 0;
                            }
                        }
                    } else if (class299.field4472[var13]) {
                        var15 = 2000;
                    }
                    short var16 = class267.field4072[var13];
                    short var17 = (short) (var15 + var16);
                    class261.method1920(var17, class247.field3661[var13], class227.field3416[var13], arg3, "<col=ffffff>" + var12, -2, arg4, (long) arg0);
                }
            }
        } else if ((class49.field728 & 0x8) != 0) {
            class81.field1157++;
            class261.method1920((short) 48, class247.field3655, class33.field475, arg3, class31.field449 + " -> <col=ffffff>" + var12, -2, arg4, (long) arg0);
        }
        for (int var18 = 0; var18 < class264.field4043; var18++) {
            if (class216.field3186[var18] == 14) {
                class281.field4267[var18] = "<col=ffffff>" + var12;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 345)
    public static final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class172 var20 = new class172(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class302.field4502[var21][arg1][arg2] == null) {
                    class302.field4502[var21][arg1][arg2] = new class167(var21, arg1, arg2);
                }
            }
            class302.field4502[arg0][arg1][arg2].field2394 = var20;
        } else if (arg3 == 1) {
            class172 var22 = new class172(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class302.field4502[var23][arg1][arg2] == null) {
                    class302.field4502[var23][arg1][arg2] = new class167(var23, arg1, arg2);
                }
            }
            class302.field4502[arg0][arg1][arg2].field2394 = var22;
        } else {
            class100 var24 = new class100(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class302.field4502[var25][arg1][arg2] == null) {
                    class302.field4502[var25][arg1][arg2] = new class167(var25, arg1, arg2);
                }
            }
            class302.field4502[arg0][arg1][arg2].field2415 = var24;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 422)
    public static void method2195(byte arg0) {
        field4665 = null;
        if (arg0 < -73) {
            field4673 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V", line = 442)
    public static final void method2196(int arg0, int arg1, int arg2, long[] arg3, Object[] arg4) {
        field4668++;
        if (arg1 <= 44 || arg2 <= arg0) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg2) / 2;
        long var7 = arg3[var6];
        arg3[var6] = arg3[arg2];
        arg3[arg2] = var7;
        Object var9 = arg4[var6];
        arg4[var6] = arg4[arg2];
        arg4[arg2] = var9;
        for (int var10 = arg0; var10 < arg2; var10++) {
            if ((long) (var10 & 0x1) + var7 > arg3[var10]) {
                long var11 = arg3[var10];
                arg3[var10] = arg3[var5];
                arg3[var5] = var11;
                Object var13 = arg4[var10];
                arg4[var10] = arg4[var5];
                arg4[var5++] = var13;
            }
        }
        arg3[arg2] = arg3[var5];
        arg3[var5] = var7;
        arg4[arg2] = arg4[var5];
        arg4[var5] = var9;
        method2196(arg0, 127, var5 - 1, arg3, arg4);
        method2196(var5 + 1, 118, arg2, arg3, arg4);
    }
}
