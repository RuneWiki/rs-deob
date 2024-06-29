import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class46 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field729 = -1;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[I")
    public static int[] field738 = new int[1000];

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lbd;")
    public static class162 field734 = class17.method142(0, ": ");

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Lbd;")
    public static class162 field736 = class17.method142(0, ")2");

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field737 = -1;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[Lgg;")
    public static class34[] field731;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[Z")
    public static boolean[] field730;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lib;IILjava/awt/Component;I)Lrb;", line = 4)
    public static final class66 method328(class28 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field728++;
        if (class306.field5146 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class66 var5 = (class66) Class.forName("th").getDeclaredConstructor().newInstance();
                var5.field1037 = new int[(class15.field233 ? 2 : 1) * 256];
                var5.field1060 = arg4;
                var5.method463(arg3);
                var5.field1061 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field1061 > 16384) {
                    var5.field1061 = 16384;
                }
                var5.method474(var5.field1061);
                if (class305.field5135 > 0 && class136.field2422 == null) {
                    class136.field2422 = new class187();
                    class136.field2422.field3223 = arg0;
                    arg0.method241((byte) -121, class136.field2422, class305.field5135);
                }
                if (class136.field2422 != null) {
                    if (class136.field2422.field3222[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class136.field2422.field3222[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                if (arg1 != 11) {
                    field734 = (class162) null;
                }
                try {
                    class192 var7 = new class192(arg0, arg2);
                    var7.field1037 = new int[(class15.field233 ? 2 : 1) * 256];
                    var7.field1060 = arg4;
                    var7.method463(arg3);
                    var7.field1061 = 16384;
                    var7.method474(var7.field1061);
                    if (class305.field5135 > 0 && class136.field2422 == null) {
                        class136.field2422 = new class187();
                        class136.field2422.field3223 = arg0;
                        arg0.method241((byte) -109, class136.field2422, class305.field5135);
                    }
                    if (class136.field2422 != null) {
                        if (class136.field2422.field3222[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class136.field2422.field3222[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class66();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 86)
    public static void method329(int arg0) {
        field730 = null;
        field738 = null;
        field736 = null;
        if (arg0 == 5846) {
            field731 = null;
            field734 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIILrk;JZ)V", line = 105)
    public static final void method330(int arg0, int arg1, int arg2, int arg3, class255 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class147 var8 = new class147();
        var8.field2659 = arg4;
        var8.field2665 = arg1 * 128 + 64;
        var8.field2661 = arg2 * 128 + 64;
        var8.field2658 = arg3;
        var8.field2656 = arg5;
        var8.field2666 = arg6;
        if (class288.field4856[arg0][arg1][arg2] == null) {
            class288.field4856[arg0][arg1][arg2] = new class225(arg0, arg1, arg2);
        }
        class288.field4856[arg0][arg1][arg2].field3763 = var8;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Ldh;", line = 127)
    public static final class177 method331(int arg0, int arg1, int arg2) {
        field735++;
        for (class177 var3 = (class177) class50.field800.method169(-122); var3 != null; var3 = (class177) class50.field800.method165((byte) -101)) {
            if (var3.field3040 && var3.method1343(arg1, 61, arg0)) {
                return var3;
            }
        }
        if (arg2 != 13862) {
            method330(-51, -108, -67, -44, (class255) null, -85L, true);
        }
        return null;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)Lvd;", line = 155)
    public static final class63 method332(int arg0, int arg1, int arg2) {
        field741++;
        class63 var3 = (class63) class81.field1408.method1672((long) arg0 << 32 | (long) arg1, 19760);
        if (arg2 != -12770) {
            method332(-125, -105, 11);
        }
        if (var3 == null) {
            var3 = new class63(arg0, arg1);
            class81.field1408.method1674(var3, false, var3.field2701);
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBIIII)V", line = 176)
    public static final void method333(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class112.field2028 <= arg3 && class82.field1426 >= arg5 && class303.field5106 <= arg4 && class298.field4989 >= arg0) {
            class58.method402(arg2, arg0, arg3, 67, arg5, arg4);
        } else {
            class27.method214(arg2, arg0, arg3, arg5, -20008, arg4);
        }
        int var6 = 38 / ((-arg1 - 55) / 54);
        field739++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIII)I", line = 193)
    public static final int method334(int arg0, int arg1, int arg2, int arg3) {
        field740++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg3;
        if (arg2 != -830811705) {
            method331(-86, 74, -112);
        }
        int var5 = ((-16711936 & arg0) >>> 7) * arg3 + (arg1 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        int var6 = (arg1 & 0xFF00FF) * var4 + ((arg0 & 0xFF00FF) * arg3) & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lda;Lda;I)V", line = 231)
    public static final void method335(class143 arg0, class143 arg1, int arg2) {
        if (arg2 == 9497) {
            class224.field3739 = arg0;
            class115.field2045 = arg1;
            field732++;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Lph;", line = 251)
    public static final class147 method336(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        return var3 == null || var3.field3763 == null ? null : var3.field3763;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI[[FIBLba;IZ[[II[[FI[[FIB)V", line = 265)
    public static final void method337(int arg0, byte arg1, int arg2, float[][] arg3, int arg4, byte arg5, class26 arg6, int arg7, boolean arg8, int[][] arg9, int arg10, float[][] arg11, int arg12, float[][] arg13, int arg14, byte arg15) {
        int var16 = (arg7 << 8) + 255;
        int var17 = (arg12 << 8) + 255;
        field733++;
        if (arg15 != -76) {
            field736 = (class162) null;
        }
        int var18 = (arg14 << 8) + 255;
        int[] var19 = class43.field710[arg1];
        int[] var20 = null;
        int var21 = (arg10 << 8) + 255;
        int[] var22 = new int[var19.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class265.method1817(arg3, arg5, arg11, var17, false, arg13, var19[var23 + var23 + 1], var19[var23 + var23], var16, arg0, false, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
        }
        if (arg8) {
            if (arg1 == 1) {
                var20 = new int[6];
                int var42 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 64, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                int var43 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 64, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[0] = var43;
                var20[3] = var42;
                var20[1] = var42;
                var20[2] = var22[2];
                var20[5] = var22[2];
                var20[4] = var22[0];
            } else if (arg1 == 2) {
                var20 = new int[6];
                int var25 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                int var26 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 0, 64, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[0] = var22[0];
                var20[1] = var26;
                var20[3] = var25;
                var20[5] = var22[0];
                var20[4] = var22[1];
                var20[2] = var25;
            } else if (arg1 == 3) {
                var20 = new int[6];
                int var40 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 0, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                int var41 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 0, 64, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[1] = var22[1];
                var20[3] = var40;
                var20[0] = var22[2];
                var20[2] = var40;
                var20[5] = var22[2];
                var20[4] = var41;
            } else if (arg1 == 4) {
                var20 = new int[3];
                int var39 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 0, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[1] = var39;
            } else if (arg1 == 5) {
                var20 = new int[3];
                int var38 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[1] = var38;
                var20[0] = var22[2];
                var20[2] = var22[3];
            } else if (arg1 == 6) {
                var20 = new int[6];
                int var27 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 0, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                int var28 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[0] = var22[3];
                var20[4] = var22[0];
                var20[3] = var28;
                var20[2] = var28;
                var20[5] = var22[3];
                var20[1] = var27;
            } else if (arg1 == 7) {
                int var29 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 0, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20 = new int[6];
                int var30 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 0, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[2] = var29;
                var20[0] = var22[1];
                var20[4] = var22[2];
                var20[1] = var30;
                var20[3] = var29;
                var20[5] = var22[1];
            } else if (arg1 == 8) {
                var20 = new int[3];
                int var31 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 0, 0, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[0] = var22[3];
                var20[2] = var22[4];
                var20[1] = var31;
            } else if (arg1 == 9) {
                int var35 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 64, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                int var36 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 32, 96, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20 = new int[15];
                int var37 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 0, 64, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[12] = var36;
                var20[1] = var35;
                var20[14] = var37;
                var20[6] = var36;
                var20[0] = var36;
                var20[3] = var36;
                var20[2] = var22[4];
                var20[9] = var36;
                var20[7] = var22[3];
                var20[11] = var22[1];
                var20[5] = var22[3];
                var20[13] = var22[1];
                var20[8] = var22[2];
                var20[10] = var22[2];
                var20[4] = var22[4];
            } else if (arg1 == 10) {
                var20 = new int[9];
                int var34 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 128, 0, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[4] = var34;
                var20[6] = var22[4];
                var20[5] = var22[4];
                var20[1] = var34;
                var20[7] = var34;
                var20[0] = var22[2];
                var20[8] = var22[0];
                var20[2] = var22[3];
                var20[3] = var22[3];
            } else if (arg1 == 11) {
                var20 = new int[12];
                int var32 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 64, 0, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                int var33 = class265.method1817(arg3, arg5, arg11, var17, false, arg13, 64, 128, var16, arg0, true, arg6, var18, arg4, var21, (int[][]) null, 0.0F, arg9);
                var20[1] = var32;
                var20[10] = var22[1];
                var20[8] = var32;
                var20[5] = var32;
                var20[7] = var33;
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[9] = var22[2];
                var20[4] = var22[2];
                var20[6] = var22[2];
                var20[11] = var33;
                var20[3] = var22[3];
            }
        }
        arg6.method209(arg2, arg0, arg4, var22, var20, false);
    }
}
