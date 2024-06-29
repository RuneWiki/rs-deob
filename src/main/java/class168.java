import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class168 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lbe;")
    public static class283 field2816 = class153.method941(15, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[Lej;")
    public static class147[] field2815 = new class147[50];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lbe;")
    public static class283 field2812 = class153.method941(125, "hint_headicons");

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lbe;")
    private static class283 field2821 = class153.method941(126, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Lbe;")
    public static class283 field2818 = field2821;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
    public static boolean field2819;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Llg;I[[F[[F[IIILhf;[[F[[II)V", line = 5)
    public static final void method1062(class115 arg0, int arg1, float[][] arg2, float[][] arg3, int[] arg4, int arg5, int arg6, class189 arg7, float[][] arg8, int[][] arg9, int arg10) {
        field2822++;
        int[] var11 = new int[arg4.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg4[var12 + var12 + 1];
            int var14 = arg4[var12 + var12];
            if (arg10 == 1) {
                int var15 = var14;
                var14 = var13;
                var13 = 128 - var15;
            } else if (arg10 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg10 == 3) {
                int var16 = var14;
                var14 = 128 - var13;
                var13 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg8[arg5][arg6];
                var18 = arg2[arg5][arg6];
                var19 = arg3[arg5][arg6];
            } else if (var14 == 128 && var13 == 0) {
                var19 = arg3[arg5 + 1][arg6];
                var18 = arg2[arg5 + 1][arg6];
                var17 = arg8[arg5 + 1][arg6];
            } else if (var14 == 128 && var13 == 128) {
                var17 = arg8[arg5 + 1][arg6 + 1];
                var19 = arg3[arg5 + 1][arg6 + 1];
                var18 = arg2[arg5 + 1][arg6 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var19 = arg3[arg5][arg6 + 1];
                var17 = arg8[arg5][arg6 + 1];
                var18 = arg2[arg5][arg6 + 1];
            } else {
                float var20 = arg3[arg5][arg6];
                float var21 = (float) var14 / 128.0F;
                float var22 = arg8[arg5][arg6];
                float var23 = (float) var13 / 128.0F;
                float var24 = arg2[arg5][arg6 + 1];
                float var25 = (arg8[arg5 + 1][arg6] - var22) * var21 + var22;
                float var26 = arg8[arg5][arg6 + 1];
                float var27 = (arg8[arg5 + 1][arg6 + 1] - var26) * var21 + var26;
                var17 = (var27 - var25) * var23 + var25;
                float var28 = arg2[arg5][arg6];
                float var29 = (arg2[arg5 + 1][arg6] - var28) * var21 + var28;
                float var30 = arg3[arg5][arg6 + 1];
                float var31 = (arg3[arg5 + 1][arg6 + 1] - var30) * var21 + var30;
                float var32 = (arg2[arg5 + 1][arg6 + 1] - var24) * var21 + var24;
                float var33 = (arg3[arg5 + 1][arg6] - var20) * var21 + var20;
                var19 = (var31 - var33) * var23 + var33;
                var18 = (var32 - var29) * var23 + var29;
            }
            int var34 = (arg6 << 7) + var13;
            int var35 = (arg5 << 7) + var14;
            int var36 = method1067(arg6, var13, arg5, var14, 75, arg9);
            var11[var12] = arg7.method1233(arg0, var35, var36, var34, var18, var17, var19);
        }
        if (arg1 != 1165) {
            field2821 = (class283) null;
        }
        arg7.method1235(var11);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 123)
    public static void method1063(int arg0) {
        field2812 = null;
        field2821 = null;
        field2815 = null;
        if (arg0 != 9554) {
            field2816 = (class283) null;
        }
        field2818 = null;
        field2816 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[S[Lbe;)V", line = 137)
    public static final void method1064(int arg0, short[] arg1, class283[] arg2) {
        class69.method453(0, arg2.length - 1, arg2, arg1, true);
        field2820++;
        if (arg0 > -28) {
            method1065(-112, -17, -71, 11, (byte) -24, 83, true, 82, 47, 126, -50, -8);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIBIZIIIII)Z", line = 170)
    public static final boolean method1065(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class36.field528[var12][var13] = 0;
                class202.field3446[var12][var13] = 99999999;
            }
        }
        class36.field528[arg7][arg9] = 99;
        class202.field3446[arg7][arg9] = 0;
        int var14 = arg9;
        int var15 = arg7;
        field2823++;
        byte var16 = 0;
        int var17 = 0;
        class126.field2082[var16] = arg7;
        int var32 = var16 + 1;
        class298.field5046[var16] = arg9;
        if (arg4 != 10) {
            return true;
        }
        int[][] var18 = class180.field3102[class61.field850].field1765;
        boolean var19 = false;
        while (var32 != var17) {
            var14 = class298.field5046[var17];
            var15 = class126.field2082[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var15 && arg0 == var14) {
                var19 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class180.field3102[class61.field850].method699(var15, arg5 - 1, (byte) 25, arg11, var14, arg8, 1, arg0)) {
                    var19 = true;
                    break;
                }
                if (arg5 < 10 && class180.field3102[class61.field850].method687(arg5 - 1, 1, var14, var15, arg11, arg4 - 9, arg8, arg0)) {
                    var19 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && class180.field3102[class61.field850].method681(arg0, arg10, (byte) -115, arg3, arg11, arg2, var15, 1, var14)) {
                var19 = true;
                break;
            }
            int var20 = class202.field3446[var15][var14] + 1;
            if (var15 > 0 && class36.field528[var15 - 1][var14] == 0 && (var18[var15 - 1][var14] & 0x12C0108) == 0) {
                class126.field2082[var32] = var15 - 1;
                class298.field5046[var32] = var14;
                class36.field528[var15 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class202.field3446[var15 - 1][var14] = var20;
            }
            if (var15 < 103 && class36.field528[var15 + 1][var14] == 0 && (var18[var15 + 1][var14] & 0x12C0180) == 0) {
                class126.field2082[var32] = var15 + 1;
                class298.field5046[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var15 + 1][var14] = 8;
                class202.field3446[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class36.field528[var15][var14 - 1] == 0 && (var18[var15][var14 - 1] & 0x12C0102) == 0) {
                class126.field2082[var32] = var15;
                class298.field5046[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var15][var14 - 1] = 1;
                class202.field3446[var15][var14 - 1] = var20;
            }
            if (var14 < 103 && class36.field528[var15][var14 + 1] == 0 && (var18[var15][var14 + 1] & 0x12C0120) == 0) {
                class126.field2082[var32] = var15;
                class298.field5046[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var15][var14 + 1] = 4;
                class202.field3446[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class36.field528[var15 - 1][var14 - 1] == 0 && (var18[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var15 - 1][var14] & 0x12C0108) == 0 && (var18[var15][var14 - 1] & 0x12C0102) == 0) {
                class126.field2082[var32] = var15 - 1;
                class298.field5046[var32] = var14 - 1;
                class36.field528[var15 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class202.field3446[var15 - 1][var14 - 1] = var20;
            }
            if (var15 < 103 && var14 > 0 && class36.field528[var15 + 1][var14 - 1] == 0 && (var18[var15 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var15 + 1][var14] & 0x12C0180) == 0 && (var18[var15][var14 - 1] & 0x12C0102) == 0) {
                class126.field2082[var32] = var15 + 1;
                class298.field5046[var32] = var14 - 1;
                class36.field528[var15 + 1][var14 - 1] = 9;
                class202.field3446[var15 + 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && var14 < 103 && class36.field528[var15 - 1][var14 + 1] == 0 && (var18[var15 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var15 - 1][var14] & 0x12C0108) == 0 && (var18[var15][var14 + 1] & 0x12C0120) == 0) {
                class126.field2082[var32] = var15 - 1;
                class298.field5046[var32] = var14 + 1;
                class36.field528[var15 - 1][var14 + 1] = 6;
                class202.field3446[var15 - 1][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && var14 < 103 && class36.field528[var15 + 1][var14 + 1] == 0 && (var18[var15 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var15 + 1][var14] & 0x12C0180) == 0 && (var18[var15][var14 + 1] & 0x12C0120) == 0) {
                class126.field2082[var32] = var15 + 1;
                class298.field5046[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var15 + 1][var14 + 1] = 12;
                class202.field3446[var15 + 1][var14 + 1] = var20;
            }
        }
        class216.field3658 = 0;
        if (!var19) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= (arg11 + var23); var24++) {
                for (int var25 = arg0 - var23; var25 <= (arg0 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class202.field3446[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg11) {
                            var26 = arg11 - var24;
                        } else if (arg2 + arg11 - 1 < var24) {
                            var26 = 1 - arg11 - (arg2 - var24);
                        }
                        int var27 = 0;
                        if (arg0 > var25) {
                            var27 = arg0 - var25;
                        } else if ((arg0 + arg3 - 1) < var25) {
                            var27 = 1 - arg3 - (arg0 - var25);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class202.field3446[var24][var25]) {
                            var21 = var28;
                            var22 = class202.field3446[var24][var25];
                            var15 = var24;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg7 == var15 && arg9 == var14) {
                return false;
            }
            class216.field3658 = 1;
        }
        byte var29 = 0;
        class126.field2082[var29] = var15;
        int var33 = var29 + 1;
        class298.field5046[var29] = var14;
        int var30;
        int var31 = var30 = class36.field528[var15][var14];
        while (arg7 != var15 || arg9 != var14) {
            if (var30 != var31) {
                class126.field2082[var33] = var15;
                var30 = var31;
                class298.field5046[var33++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class36.field528[var15][var14];
        }
        if (var33 > 0) {
            class203.method1297(var33, (byte) -113, arg1);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V", line = 458)
    public static final void method1066(int arg0, Object[] arg1, int arg2, int arg3, int[] arg4) {
        field2814++;
        if (arg3 != -28950) {
            field2816 = (class283) null;
        }
        if (arg2 <= arg0) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg2) / 2;
        int var7 = arg4[var6];
        arg4[var6] = arg4[arg2];
        arg4[arg2] = var7;
        Object var8 = arg1[var6];
        arg1[var6] = arg1[arg2];
        arg1[arg2] = var8;
        for (int var9 = arg0; var9 < arg2; var9++) {
            if (arg4[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5] = var10;
                Object var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg4[arg2] = arg4[var5];
        arg4[var5] = var7;
        arg1[arg2] = arg1[var5];
        arg1[var5] = var8;
        method1066(arg0, arg1, var5 - 1, arg3, arg4);
        method1066(var5 + 1, arg1, arg2, -28950, arg4);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII[[I)I", line = 544)
    public static final int method1067(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5) {
        int var6 = (128 - arg3) * arg5[arg2][arg0 + 1] + arg5[arg2 + 1][arg0 + 1] * arg3 >> 7;
        if (arg4 < 44) {
            field2816 = (class283) null;
        }
        int var7 = (128 - arg3) * arg5[arg2][arg0] + arg5[arg2 + 1][arg0] * arg3 >> 7;
        field2817++;
        return (128 - arg1) * var7 + (arg1 * var6) >> 7;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[B", line = 568)
    public static final synchronized byte[] method1068(int arg0, int arg1) {
        field2813++;
        if (arg0 == 100 && class18.field219 > 0) {
            byte[] var2 = class281.field4734[--class18.field219];
            class281.field4734[class18.field219] = null;
            return var2;
        }
        if (arg1 != -28465) {
            method1067(64, 20, 13, -119, 62, (int[][]) ((int[][]) null));
        }
        if (arg0 == 5000 && class99.field1679 > 0) {
            byte[] var3 = class164.field2705[--class99.field1679];
            class164.field2705[class99.field1679] = null;
            return var3;
        } else if (arg0 == 30000 && class172.field2907 > 0) {
            byte[] var4 = class174.field3001[--class172.field2907];
            class174.field3001[class172.field2907] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
