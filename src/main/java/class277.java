import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class277 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lok;")
    private static class146 field4750 = class235.method1724(-12908, "Loaded input handler");

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lok;")
    public static class146 field4756 = class235.method1724(-12908, "<col=80ff00>");

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lok;")
    public static class146 field4757 = field4750;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field4760 = 5063219;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lgj;")
    public static class224 field4751 = new class224(5000);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lma;")
    public static class280 field4758;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[[[B")
    public static byte[][][] field4762;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 26)
    public static void method2013(byte arg0) {
        field4758 = null;
        if (arg0 > -104) {
            return;
        }
        field4756 = null;
        field4757 = null;
        field4750 = null;
        field4751 = null;
        field4762 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2014(int arg0) {
        class294.field4992 = 0;
        int var1 = (class102.field1639.field5409 >> 7) + class15.field300;
        int var2 = (class102.field1639.field5380 >> 7) + class201.field3357;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class294.field4992 = 1;
        }
        field4752++;
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class294.field4992 = 1;
        }
        if (arg0 < 84) {
            field4758 = (class280) null;
        }
        if (class294.field4992 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class294.field4992 = 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BI)[B", line = 78)
    public static final byte[] method2015(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        field4759++;
        byte[] var3 = new byte[var2];
        class244.method1768(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIZ)V", line = 89)
    public static final void method2016(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class236.field3937 = class33.field639 * arg3 / arg2;
        class306.field5228 = -1;
        class138.field2299 = -1;
        class148.field2508 = class118.field1916 * arg1 / arg0;
        class95.method649((byte) -124);
        field4754++;
        if (!arg4) {
            field4756 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[[F[[FI[[FIIIILhi;II[[IBBZ)V", line = 122)
    public static final void method2017(int arg0, float[][] arg1, float[][] arg2, int arg3, float[][] arg4, int arg5, int arg6, int arg7, int arg8, class286 arg9, int arg10, int arg11, int[][] arg12, byte arg13, byte arg14, boolean arg15) {
        int var16 = (arg6 << 8) + 255;
        if (arg8 != -15428) {
            field4750 = (class146) null;
        }
        field4763++;
        int var17 = (arg5 << 8) + 255;
        int var18 = (arg10 << 8) + 255;
        int var19 = (arg11 << 8) + 255;
        int[] var20 = class18.field361[arg13];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class235.method1722(var16, arg1, var17, false, var19, arg0, var18, var20[var23 + var23], arg8 + 15429, arg14, (int[][]) null, var20[var23 + var23 + 1], 0.0F, arg2, arg9, arg3, arg12, arg4);
        }
        if (arg15) {
            if (arg13 == 1) {
                var21 = new int[6];
                int var25 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 64, 1, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var26 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, 1, arg14, (int[][]) null, 64, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[0] = var26;
                var21[2] = var22[2];
                var21[5] = var22[2];
                var21[1] = var25;
                var21[3] = var25;
                var21[4] = var22[0];
            } else if (arg13 == 2) {
                var21 = new int[6];
                int var27 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, arg8 ^ 0xFFFFC3BD, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var28 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 64, 1, arg14, (int[][]) null, 0, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[2] = var27;
                var21[0] = var22[0];
                var21[5] = var22[0];
                var21[1] = var28;
                var21[4] = var22[1];
                var21[3] = var27;
            } else if (arg13 == 3) {
                var21 = new int[6];
                int var29 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 0, 1, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var30 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 64, 1, arg14, (int[][]) null, 0, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[3] = var29;
                var21[0] = var22[2];
                var21[2] = var29;
                var21[5] = var22[2];
                var21[1] = var22[1];
                var21[4] = var30;
            } else if (arg13 == 4) {
                int var43 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 0, 1, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21 = new int[] { var22[3], var43, var22[0] };
            } else if (arg13 == 5) {
                int var42 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, arg8 + 15429, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21 = new int[] { var22[2], var42, var22[3] };
            } else if (arg13 == 6) {
                int var31 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, 1, arg14, (int[][]) null, 0, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var32 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, 1, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21 = new int[] { var22[3], var31, var32, var32, var22[0], var22[3] };
            } else if (arg13 == 7) {
                var21 = new int[6];
                int var33 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 0, 1, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var34 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, 1, arg14, (int[][]) null, 0, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[3] = var33;
                var21[0] = var22[1];
                var21[1] = var34;
                var21[2] = var33;
                var21[5] = var22[1];
                var21[4] = var22[2];
            } else if (arg13 == 8) {
                var21 = new int[3];
                int var41 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 0, arg8 + 15429, arg14, (int[][]) null, 0, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[2] = var22[4];
                var21[1] = var41;
                var21[0] = var22[3];
            } else if (arg13 == 9) {
                var21 = new int[15];
                int var35 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, 1, arg14, (int[][]) null, 64, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var36 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 96, arg8 ^ 0xFFFFC3BD, arg14, (int[][]) null, 32, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var37 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 64, 1, arg14, (int[][]) null, 0, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[6] = var36;
                var21[12] = var36;
                var21[9] = var36;
                var21[1] = var35;
                var21[14] = var37;
                var21[3] = var36;
                var21[5] = var22[3];
                var21[2] = var22[4];
                var21[7] = var22[3];
                var21[4] = var22[4];
                var21[10] = var22[2];
                var21[0] = var36;
                var21[13] = var22[1];
                var21[8] = var22[2];
                var21[11] = var22[1];
            } else if (arg13 == 10) {
                var21 = new int[9];
                int var38 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 0, 1, arg14, (int[][]) null, 128, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21[4] = var38;
                var21[0] = var22[2];
                var21[2] = var22[3];
                var21[8] = var22[0];
                var21[7] = var38;
                var21[3] = var22[3];
                var21[6] = var22[4];
                var21[5] = var22[4];
                var21[1] = var38;
            } else if (arg13 == 11) {
                int var39 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 0, 1, arg14, (int[][]) null, 64, 0.0F, arg2, arg9, arg3, arg12, arg4);
                int var40 = class235.method1722(var16, arg1, var17, true, var19, arg0, var18, 128, 1, arg14, (int[][]) null, 64, 0.0F, arg2, arg9, arg3, arg12, arg4);
                var21 = new int[] { var22[3], var39, var22[0], var22[3], var22[2], var39, var22[2], var40, var39, var22[2], var22[1], var40 };
            }
        }
        arg9.method2054(arg7, arg0, arg3, var22, var21, false);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lqm;", line = 410)
    public static final class226 method2018(int arg0, int arg1) {
        field4753++;
        if (arg0 < 67) {
            field4764 = -7;
        }
        class226 var2 = (class226) class264.field4498.method1511((long) arg1, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class75.field1224.method92(0, 0, arg1 & 0x7FFF);
        } else {
            var3 = class313.field5329.method92(0, 0, arg1);
        }
        class226 var4 = new class226();
        if (var3 != null) {
            var4.method1672((byte) -77, new class47(var3));
        }
        if (arg1 >= 32768) {
            var4.method1673(64);
        }
        class264.field4498.method1509((long) arg1, 74, var4);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Loh;I)V", line = 443)
    public static final void method2019(class15 arg0, int arg1) {
        field4755++;
        int var2 = 118 / ((arg1) / 48);
        class169.field2865 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 455)
    public static final void method2020(int arg0) {
        if (arg0 != 8) {
            method2015((byte[]) null, 101);
        }
        class168.field2833.method791(arg0 ^ 0x0);
        field4761++;
    }
}
