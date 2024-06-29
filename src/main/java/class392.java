import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class392 {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field5397 = 0;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field5398 = 0;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method2408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5404++;
        int var6 = class211.method1255(class224.field2571, arg4, false, class578.field8182);
        int var7 = class211.method1255(class224.field2571, arg2, false, class578.field8182);
        int var8 = class211.method1255(class338.field4355, arg3, false, class744.field10385);
        if (arg0 == 2) {
            int var9 = class211.method1255(class338.field4355, arg1, false, class744.field10385);
            for (int var10 = var6; var10 <= var7; var10++) {
                class223.method1297(class408.field5585[var10], -7, var8, arg5, var9);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljb;IIII)Z", line = 32)
    public static final boolean method2409(class492 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5399++;
        if (!class114.field1198 || !class396.field5425) {
            return false;
        } else if (class542.field7803 < 100) {
            return false;
        } else if (!class240.method1414(30633, arg2, arg1, arg4)) {
            return false;
        } else if (arg3 <= 114) {
            return true;
        } else {
            int var5 = arg2 << class748.field10430;
            int var6 = arg1 << class748.field10430;
            int var7 = class504.field7120[arg4].method1671(arg1, arg2, (byte) -69) - 1;
            int var8 = arg0.method985(4) + var7;
            if (arg0.field6996 == 1) {
                if (!class320.method1913(var8, var5, var5, var8, class559.field7987 + var6, var6, var7, var6, (byte) -17, var5)) {
                    return false;
                } else if (class320.method1913(var8, var5, var5, var7, class559.field7987 + var6, class559.field7987 + var6, var7, var6, (byte) -17, var5)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 == 2) {
                if (!class320.method1913(var8, class559.field7987 + var5, var5, var8, class559.field7987 + var6, class559.field7987 + var6, var7, class559.field7987 + var6, (byte) -17, var5)) {
                    return false;
                } else if (class320.method1913(var7, class559.field7987 + var5, var5, var8, class559.field7987 + var6, class559.field7987 + var6, var7, class559.field7987 + var6, (byte) -17, var5 + class559.field7987)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 == 4) {
                if (!class320.method1913(var8, var5 + class559.field7987, class559.field7987 + var5, var8, class559.field7987 + var6, var6, var7, var6, (byte) -17, var5 + class559.field7987)) {
                    return false;
                } else if (class320.method1913(var8, class559.field7987 + var5, class559.field7987 + var5, var7, class559.field7987 + var6, class559.field7987 + var6, var7, var6, (byte) -17, class559.field7987 + var5)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 == 8) {
                if (!class320.method1913(var8, class559.field7987 + var5, var5, var8, var6, var6, var7, var6, (byte) -17, var5)) {
                    return false;
                } else if (class320.method1913(var7, class559.field7987 + var5, var5, var8, var6, var6, var7, var6, (byte) -17, class559.field7987 + var5)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 == 16) {
                if (class316.method1885(var8, class598.field8523, class598.field8523 + var6, var5, 38, var7, class598.field8523)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 == 32) {
                if (class316.method1885(var8, class598.field8523, var6 + class598.field8523, class598.field8523 + var5, 81, var7, class598.field8523)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 == 64) {
                if (class316.method1885(var8, class598.field8523, var6, class598.field8523 + var5, 111, var7, class598.field8523)) {
                    class540.field7779++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field6996 != 128) {
                return true;
            } else if (class316.method1885(var8, class598.field8523, var6, var5, 127, var7, class598.field8523)) {
                class540.field7779++;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIILcaa;IIII)Z", line = 155)
    public static final boolean method2410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class302 arg6, int arg7, int arg8, int arg9, int arg10) {
        field5400++;
        int var11 = arg10;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        int var16 = arg0 - var14;
        class652.field9308[var13][var14] = 99;
        class180.field2121[var13][var14] = 0;
        byte var17 = 0;
        if (arg1 != -127) {
            return true;
        }
        class98.field1030[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class523.field7459[var10001] = arg0;
        int[][] var19 = arg6.field3770;
        while (var26 != var18) {
            var11 = class98.field1030[var18];
            var12 = class523.field7459[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg6.field3759;
            int var23 = var12 - arg6.field3761;
            if (arg9 == -4) {
                if (arg4 == var11 && arg8 == var12) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class377.method2303(var12, 2, 2, arg2, arg4, arg1 ^ 0xFFFFFF85, arg8, var11, arg5)) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg6.method1807((byte) 88, arg8, var11, arg2, var12, arg4, arg5, arg3, 2, 2)) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg6.method1805(arg8, var11, (byte) 52, arg5, arg4, var12, 2, arg2, arg3)) {
                    class237.field2826 = var12;
                    class215.field2500 = var11;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg6.method1819(var12, arg4, arg1 + 2883975, arg8, var11, arg7, arg9, 2)) {
                    class237.field2826 = var12;
                    class215.field2500 = var11;
                    return true;
                }
            } else if (arg6.method1817(arg9, var12, 2, 128, arg7, var11, arg8, arg4)) {
                class237.field2826 = var12;
                class215.field2500 = var11;
                return true;
            }
            int var25 = class180.field2121[var20][var21] + 1;
            if (var20 > 0 && class652.field9308[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class98.field1030[var26] = var11 - 1;
                class523.field7459[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var20 - 1][var21] = 2;
                class180.field2121[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class652.field9308[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class98.field1030[var26] = var11 + 1;
                class523.field7459[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var20 + 1][var21] = 8;
                class180.field2121[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class652.field9308[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class98.field1030[var26] = var11;
                class523.field7459[var26] = var12 - 1;
                class652.field9308[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class652.field9308[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class98.field1030[var26] = var11;
                class523.field7459[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var20][var21 + 1] = 4;
                class180.field2121[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class652.field9308[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class98.field1030[var26] = var11 - 1;
                class523.field7459[var26] = var12 - 1;
                class652.field9308[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class652.field9308[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class98.field1030[var26] = var11 + 1;
                class523.field7459[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var20 + 1][var21 - 1] = 9;
                class180.field2121[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class652.field9308[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class98.field1030[var26] = var11 - 1;
                class523.field7459[var26] = var12 + 1;
                class652.field9308[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class652.field9308[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class98.field1030[var26] = var11 + 1;
                class523.field7459[var26] = var12 + 1;
                class652.field9308[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var20 + 1][var21 + 1] = var25;
            }
        }
        class237.field2826 = var12;
        class215.field2500 = var11;
        return false;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIILrc;Lm;Lha;Laia;II)V", line = 515)
    public static final void method2411(int arg0, int arg1, int arg2, class536 arg3, class191 arg4, class58 arg5, class228 arg6, int arg7, int arg8) {
        field5401++;
        int var9 = arg7 - (arg2 / 2) - 5;
        int var10 = arg8 + 2;
        if (arg6.field2636 != 0) {
            arg5.method410(arg6.field2636, var9, (arg8 + (arg0 * arg3.method3147())) + 1 - var10, -52, var10, arg2 + 10);
        }
        if (arg6.field2618 != 0) {
            arg5.method371(var9, var10, arg6.field2618, arg3.method3147() * arg0 + arg8 + 1 - var10, arg1 + -12242, arg2 + 10);
        }
        int var11 = arg6.field2631;
        if (arg4.field2255 && arg6.field2622 != -1) {
            var11 = arg6.field2622;
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            String var13 = class747.field10416[var12];
            if ((arg0 - 1) > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg3.method3146(arg5, var13, arg7, arg8, var11, true);
            arg8 += arg3.method3147();
        }
        if (arg1 != 12243) {
            method2410(113, 29, 109, 22, 73, -73, null, 118, -45, 5, 114);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)V", line = 560)
    public static final void method2412(int arg0, int arg1, int arg2, int arg3) {
        class691 var4 = class638.field9170[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class577 var5 = var4.field9731;
        class577 var6 = var4.field9735;
        if (var5 != null) {
            var5.field8155 = (short) (var5.field8155 * arg3 / (0x10 << class748.field10430 - 7));
            var5.field8149 = (short) (var5.field8149 * arg3 / (0x10 << class748.field10430 - 7));
        }
        if (var6 != null) {
            var6.field8155 = (short) (var6.field8155 * arg3 / (0x10 << class748.field10430 - 7));
            var6.field8149 = (short) (var6.field8149 * arg3 / (0x10 << class748.field10430 - 7));
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIILd;Ljava/awt/Canvas;)Lha;", line = 588)
    public static final class58 method2413(int arg0, int arg1, int arg2, class150 arg3, Canvas arg4) {
        if (arg0 == 0) {
            field5402++;
            return new class749(arg4, arg3, arg2, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([JBII[I)V", line = 602)
    public static final void method2414(long[] arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg3; var11++) {
                if (arg0[var11] < var7 + ((long) (var10 & var11))) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method2414(arg0, (byte) -59, arg2, var6 - 1, arg4);
            method2414(arg0, (byte) -59, var6 + 1, arg3, arg4);
        }
        field5403++;
        if (arg1 != -59) {
            field5398 = -20;
        }
    }
}
