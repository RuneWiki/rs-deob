import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class203 extends class97 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[[I")
    public int[][] field4005;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
    public int[] field3999;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lea;")
    public static class38 field3996 = class9.method46((byte) 110, "::noclip");

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "[[S")
    public static short[][] field4002 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lea;")
    public static class38 field4006 = class9.method46((byte) 120, "<col=ffff00>");

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lea;")
    private static class38 field4001 = class9.method46((byte) 114, "FULL");

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lea;")
    public static class38 field3997 = field4001;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "Lef;")
    public static class43 field4007;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[Lk;")
    public static class89[] field4013;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILef;)Z")
    public static final boolean method1330(int arg0, class43 arg1) {
        field3998++;
        int var2 = arg1.field987;
        if (var2 == 205) {
            class106.field2396 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class138.field2883.method586(arg0 ^ 0xFFFFFFA5, var4 == 1, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class138.field2883.method582(var5, var6 == 1, (byte) -69);
        }
        if (arg0 != 3) {
            method1331(-94, -86, null, 18, -110, -126);
        }
        if (var2 == 324) {
            class138.field2883.method578((byte) 55, false);
        }
        if (var2 == 325) {
            class138.field2883.method578((byte) 55, true);
        }
        if (var2 == 326) {
            class111.field2483.method169(-1494101117, 27);
            class138.field2883.method579(class111.field2483, -1);
            class97.field2165++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILk;III)V")
    public static final void method1331(int arg0, int arg1, class89 arg2, int arg3, int arg4, int arg5) {
        field4011++;
        if (arg2 == null) {
            return;
        }
        int var6 = class114.field2534 + class205.field4028 & 0x7FF;
        int var7 = arg1 * arg1 + arg5 * arg5;
        if (var7 > 6400) {
            return;
        }
        int var8 = class93.field2091[var6];
        int var9 = class93.field2110[var6];
        int var10 = var9 * 256 / (class183.field3658 + 256);
        int var11 = var8 * 256 / (class183.field3658 + 256);
        if (arg3 != 94) {
            method1334(-50, -14, -60, 49, null, 113, 29, 103, 82, null);
        }
        int var12 = arg1 * var10 + arg5 * var11 >> 16;
        int var13 = arg5 * var10 - arg1 * var11 >> 16;
        if (var7 > 2500) {
            arg2.method735(class80.field1893, arg4 + var12 + 94 + 4 - arg2.field2047 / 2, arg0 - -83 + -(arg2.field2046 / 2) + -var13 + -4);
        } else {
            arg2.method755(arg4 + var12 + 94 + 4 - arg2.field2047 / 2, arg0 + 83 - (var13 + 4) + -(arg2.field2046 / 2));
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILef;BI)V")
    public static final void method1332(int arg0, class43 arg1, byte arg2, int arg3) {
        field4010++;
        if (arg2 != -69) {
            method1334(52, -14, -102, 81, null, -61, 74, -128, 117, null);
        }
        if (class45.field1094 != null || class169.field3482 || (arg1 == null || class158.method1143(-122, arg1) == null)) {
            return;
        }
        class45.field1094 = arg1;
        class179.field3625 = class158.method1143(arg2 ^ 0x38, arg1);
        class205.field4029 = false;
        class102.field2300 = arg0;
        class52.field1341 = 0;
        class99.field2217 = arg3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
    public static final boolean method1333(int arg0, int arg1) {
        field4009++;
        if (arg0 < 32) {
            return false;
        }
        int var2 = 26 / ((-arg1 - 49) / 46);
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIILfh;IIIILre;)V")
    public static final void method1334(int arg0, int arg1, int arg2, int arg3, class54 arg4, int arg5, int arg6, int arg7, int arg8, class157 arg9) {
        if (arg2 >= -114) {
            return;
        }
        field4003++;
        class106 var10 = class70.method553(arg7, 28067);
        int var11;
        int var12;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field2405;
            var11 = var10.field2393;
        } else {
            var11 = var10.field2405;
            var12 = var10.field2393;
        }
        int var13;
        int var14;
        if (arg8 + var12 > 104) {
            var13 = arg8;
            var14 = arg8 + 1;
        } else {
            var13 = (var12 >> 1) + arg8;
            var14 = (var12 + 1 >> 1) + arg8;
        }
        int var15 = (arg8 << 7) + (var12 << 6);
        int var16;
        int var17;
        if (arg6 + var11 <= 104) {
            var16 = (var11 >> 1) + arg6;
            var17 = (var11 + 1 >> 1) + arg6;
        } else {
            var17 = arg6 + 1;
            var16 = arg6;
        }
        int[][] var18 = class154.field3209[arg3];
        int var19 = var18[var13][var16] + var18[var13][var17] + var18[var14][var16] + var18[var14][var17] >> 2;
        int var20 = (arg6 << 7) + (var11 << 6);
        int var21 = (arg6 << 7) + (arg7 << 14) + arg8 + 1073741824;
        if (var10.field2388 == 0) {
            var21 += Integer.MIN_VALUE;
        }
        int var22 = (arg5 << 6) + arg1;
        if (var10.field2381 == 1) {
            var22 += 256;
        }
        if (arg1 == 22) {
            class52 var23;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var23 = var10.method858(arg5, var18, var15, var19, var20, true, 22);
            } else {
                var23 = new class112(arg7, 22, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1122(arg0, arg8, arg6, var19, var23, var21, var22);
            if (var10.field2402 == 1) {
                arg4.method399(26108, arg6, arg8);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class52 var46;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var46 = var10.method858(arg5, var18, var15, var19, var20, true, 10);
            } else {
                var46 = new class112(arg7, 10, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            if (var46 != null) {
                arg9.method1100(arg0, arg8, arg6, var19, var12, var11, var46, arg1 == 11 ? 256 : 0, var21, var22);
            }
            if (var10.field2402 != 0) {
                arg4.method400(arg6, var11, -1, var12, arg8, var10.field2362);
            }
        } else if (arg1 >= 12) {
            class52 var24;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var24 = var10.method858(arg5, var18, var15, var19, var20, true, arg1);
            } else {
                var24 = new class112(arg7, arg1, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1100(arg0, arg8, arg6, var19, 1, 1, var24, 0, var21, var22);
            if (var10.field2402 != 0) {
                arg4.method400(arg6, var11, -1, var12, arg8, var10.field2362);
            }
        } else if (arg1 == 0) {
            class52 var25;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var25 = var10.method858(arg5, var18, var15, var19, var20, true, 0);
            } else {
                var25 = new class112(arg7, 0, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1090(arg0, arg8, arg6, var19, var25, null, class114.field2533[arg5], 0, var21, var22);
            if (var10.field2402 != 0) {
                arg4.method394(arg6, (byte) -128, var10.field2362, arg1, arg8, arg5);
            }
        } else if (arg1 == 1) {
            class52 var26;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var26 = var10.method858(arg5, var18, var15, var19, var20, true, 1);
            } else {
                var26 = new class112(arg7, 1, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1090(arg0, arg8, arg6, var19, var26, null, class193.field3804[arg5], 0, var21, var22);
            if (var10.field2402 != 0) {
                arg4.method394(arg6, (byte) 50, var10.field2362, arg1, arg8, arg5);
            }
        } else if (arg1 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class52 var28;
            class52 var29;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var28 = var10.method858(arg5 + 4, var18, var15, var19, var20, true, 2);
                var29 = var10.method858(var27, var18, var15, var19, var20, true, 2);
            } else {
                var28 = new class112(arg7, 2, arg5 + 4, arg3, arg8, arg6, var10.field2392, true, null);
                var29 = new class112(arg7, 2, var27, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1090(arg0, arg8, arg6, var19, var28, var29, class114.field2533[arg5], class114.field2533[var27], var21, var22);
            if (var10.field2402 != 0) {
                arg4.method394(arg6, (byte) -109, var10.field2362, arg1, arg8, arg5);
            }
        } else if (arg1 == 3) {
            class52 var30;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var30 = var10.method858(arg5, var18, var15, var19, var20, true, 3);
            } else {
                var30 = new class112(arg7, 3, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1090(arg0, arg8, arg6, var19, var30, null, class193.field3804[arg5], 0, var21, var22);
            if (var10.field2402 != 0) {
                arg4.method394(arg6, (byte) 43, var10.field2362, arg1, arg8, arg5);
            }
        } else if (arg1 == 9) {
            class52 var31;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var31 = var10.method858(arg5, var18, var15, var19, var20, true, arg1);
            } else {
                var31 = new class112(arg7, arg1, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1100(arg0, arg8, arg6, var19, 1, 1, var31, 0, var21, var22);
            if (var10.field2402 != 0) {
                arg4.method400(arg6, var11, -1, var12, arg8, var10.field2362);
            }
        } else if (arg1 == 4) {
            class52 var32;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var32 = var10.method858(arg5, var18, var15, var19, var20, true, 4);
            } else {
                var32 = new class112(arg7, 4, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1098(arg0, arg8, arg6, var19, var32, null, class114.field2533[arg5], 0, 0, 0, var21, var22);
        } else if (arg1 == 5) {
            int var33 = arg9.method1127(arg0, arg8, arg6);
            int var34 = 16;
            if (var33 != 0) {
                var34 = class70.method553(var33 >> 14 & 0x7FFF, 28067).field2387;
            }
            class52 var35;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var35 = var10.method858(arg5, var18, var15, var19, var20, true, 4);
            } else {
                var35 = new class112(arg7, 4, arg5, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1098(arg0, arg8, arg6, var19, var35, null, class114.field2533[arg5], 0, class22.field466[arg5] * var34, class35.field748[arg5] * var34, var21, var22);
        } else if (arg1 == 6) {
            int var36 = 8;
            int var37 = arg9.method1127(arg0, arg8, arg6);
            if (var37 != 0) {
                var36 = class70.method553(var37 >> 14 & 0x7FFF, 28067).field2387 / 2;
            }
            class52 var38;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var38 = var10.method858(arg5 + 4, var18, var15, var19, var20, true, 4);
            } else {
                var38 = new class112(arg7, 4, arg5 + 4, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1098(arg0, arg8, arg6, var19, var38, null, 256, arg5, class115.field2539[arg5] * var36, class84.field1988[arg5] * var36, var21, var22);
        } else if (arg1 == 7) {
            int var39 = arg5 + 2 & 0x3;
            class52 var40;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var40 = var10.method858(var39 + 4, var18, var15, var19, var20, true, 4);
            } else {
                var40 = new class112(arg7, 4, var39 + 4, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1098(arg0, arg8, arg6, var19, var40, null, 256, var39, 0, 0, var21, var22);
        } else if (arg1 == 8) {
            int var41 = 8;
            int var42 = arg9.method1127(arg0, arg8, arg6);
            if (var42 != 0) {
                var41 = class70.method553(var42 >> 14 & 0x7FFF, 28067).field2387 / 2;
            }
            int var43 = arg5 + 2 & 0x3;
            class52 var44;
            class52 var45;
            if (var10.field2392 == -1 && var10.field2364 == null) {
                var44 = var10.method858(arg5 + 4, var18, var15, var19, var20, true, 4);
                var45 = var10.method858(var43 + 4, var18, var15, var19, var20, true, 4);
            } else {
                var44 = new class112(arg7, 4, arg5 + 4, arg3, arg8, arg6, var10.field2392, true, null);
                var45 = new class112(arg7, 4, var43 + 4, arg3, arg8, arg6, var10.field2392, true, null);
            }
            arg9.method1098(arg0, arg8, arg6, var19, var44, var45, 256, arg5, class115.field2539[arg5] * var41, class84.field1988[arg5] * var41, var21, var22);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1335(byte arg0) {
        field4002 = null;
        field4001 = null;
        field3996 = null;
        field4007 = null;
        field4013 = null;
        int var1 = -120 % ((51 - arg0) / 61);
        field4006 = null;
        field3997 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I[B)V")
    public class203(int arg0, byte[] arg1) {
        this.field4000 = arg0;
        class66 var3 = new class66(arg1);
        this.field4004 = var3.method509(117);
        this.field4005 = new int[this.field4004][];
        this.field3999 = new int[this.field4004];
        for (int var4 = 0; var4 < this.field4004; var4++) {
            this.field3999[var4] = var3.method509(116);
        }
        for (int var5 = 0; var5 < this.field4004; var5++) {
            this.field4005[var5] = new int[var3.method509(123)];
        }
        for (int var6 = 0; var6 < this.field4004; var6++) {
            for (int var7 = 0; var7 < this.field4005[var6].length; var7++) {
                this.field4005[var6][var7] = var3.method509(124);
            }
        }
    }
}
