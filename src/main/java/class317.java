import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class317 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field5229 = 0;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field5232 = 0;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field5234 = 0;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field5235 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public static int[] field5228;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[I")
    public static int[] field5230;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    public static int[] field5233;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method2266(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method2292(arg0, arg1, arg2, arg4);
        method2292(arg0, arg1 + arg3 - 1, arg2, arg4);
        method2293(arg0, arg1, arg3, arg4);
        method2293(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII[I[I)V", line = 13)
    private static final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field5232 - field5235 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg0 >= field5234 && arg0 < field5229) {
            if (arg1 < field5235) {
                arg2 -= field5235 - arg1;
                arg1 = field5235;
            }
            if (arg1 + arg2 > field5232) {
                arg2 = field5232 - arg1;
            }
            int var7 = 256 - arg4;
            int var8 = (arg3 >> 16 & 0xFF) * arg4;
            int var9 = (arg3 >> 8 & 0xFF) * arg4;
            int var10 = (arg3 & 0xFF) * arg4;
            int var11 = field5231 * arg1 + arg0;
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1 + var12 - field5235;
                if (arg0 - field5234 >= arg5[var13] && arg0 - field5234 < arg5[var13] + arg6[var13]) {
                    int var14 = (field5228[var11] >> 16 & 0xFF) * var7;
                    int var15 = (field5228[var11] >> 8 & 0xFF) * var7;
                    int var16 = (field5228[var11] & 0xFF) * var7;
                    int var17 = (var10 + var16 >> 8) + (var8 + var14 >> 8 << 16) + (var9 + var15 >> 8 << 8);
                    field5228[var11] = var17;
                }
                var11 += field5231;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII[I[I)V", line = 68)
    public static final void method2268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        if (field5232 - field5235 != arg6.length) {
            throw new IllegalStateException();
        }
        int var8 = arg2 - arg0;
        int var9 = arg3 - arg1;
        if (var9 == 0) {
            if (var8 >= 0) {
                method2275(arg0, arg1, var8, arg4, arg5, arg6, arg7);
            } else {
                method2275(arg0 + var8 + 1, arg1, -var8, arg4, arg5, arg6, arg7);
            }
        } else if (var8 != 0) {
            boolean var10 = false;
            if (var8 + var9 < 0) {
                arg0 += var8;
                var8 = -var8;
                arg1 += var9;
                var9 = -var9;
                var10 = true;
            }
            int var11 = 256 - arg5;
            int var12 = (arg4 >> 16 & 0xFF) * arg5;
            int var13 = (arg4 >> 8 & 0xFF) * arg5;
            int var14 = (arg4 & 0xFF) * arg5;
            if (var8 > var9) {
                int var15 = arg1 << 16;
                int var16 = var15 + 32768;
                int var17 = var9 << 16;
                int var18 = (int) Math.floor((double) var17 / (double) var8 + 0.5D);
                int var19 = arg0 + var8;
                if (var10) {
                    var16 += var18;
                    arg0++;
                }
                if (arg0 < field5234) {
                    var16 += (field5234 - arg0) * var18;
                    arg0 = field5234;
                }
                if (var19 >= field5229) {
                    var19 = field5229 - 1;
                }
                if (!var10) {
                    var19--;
                }
                while (arg0 <= var19) {
                    int var20 = var16 >> 16;
                    int var21 = var20 - field5235;
                    if (var20 >= field5235 && var20 < field5232 && arg0 - field5234 >= arg6[var21] && arg0 - field5234 < arg6[var21] + arg7[var21]) {
                        int var22 = field5231 * var20 + arg0;
                        int var23 = (field5228[var22] >> 16 & 0xFF) * var11;
                        int var24 = (field5228[var22] >> 8 & 0xFF) * var11;
                        int var25 = (field5228[var22] & 0xFF) * var11;
                        int var26 = (var14 + var25 >> 8) + (var12 + var23 >> 8 << 16) + (var13 + var24 >> 8 << 8);
                        field5228[var22] = var26;
                    }
                    var16 += var18;
                    arg0++;
                }
            } else {
                int var27 = arg0 << 16;
                int var28 = var27 + 32768;
                int var29 = var8 << 16;
                int var30 = (int) Math.floor((double) var29 / (double) var9 + 0.5D);
                int var31 = arg1 + var9;
                if (var10) {
                    var28 += var30;
                    arg1++;
                }
                if (arg1 < field5235) {
                    var28 += (field5235 - arg1) * var30;
                    arg1 = field5235;
                }
                if (var31 >= field5232) {
                    var31 = field5232 - 1;
                }
                if (!var10) {
                    var31--;
                }
                while (arg1 <= var31) {
                    int var32 = var28 >> 16;
                    int var33 = arg1 - field5235;
                    if (var32 >= field5234 && var32 < field5229 && var32 - field5234 >= arg6[var33] && var32 - field5234 < arg6[var33] + arg7[var33]) {
                        int var34 = field5231 * arg1 + var32;
                        int var35 = (field5228[var34] >> 16 & 0xFF) * var11;
                        int var36 = (field5228[var34] >> 8 & 0xFF) * var11;
                        int var37 = (field5228[var34] & 0xFF) * var11;
                        int var38 = (var14 + var37 >> 8) + (var12 + var35 >> 8 << 16) + (var13 + var36 >> 8 << 8);
                        field5228[var34] = var38;
                    }
                    var28 += var30;
                    arg1++;
                }
            }
        } else if (var9 >= 0) {
            method2267(arg0, arg1, var9, arg4, arg5, arg6, arg7);
        } else {
            method2267(arg0, arg1 + var9 + 1, -var9, arg4, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([I)V", line = 219)
    public static final void method2269(int[] arg0) {
        arg0[0] = field5234;
        arg0[1] = field5235;
        arg0[2] = field5229;
        arg0[3] = field5232;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V", line = 226)
    public static final void method2270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5234) {
            arg2 -= field5234 - arg0;
            arg0 = field5234;
        }
        if (arg1 < field5235) {
            arg3 -= field5235 - arg1;
            arg1 = field5235;
        }
        if (arg0 + arg2 > field5229) {
            arg2 = field5229 - arg0;
        }
        if (arg1 + arg3 > field5232) {
            arg3 = field5232 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field5231 - arg2;
        int var9 = field5231 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field5228[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field5228[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIII)V", line = 279)
    public static final void method2271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method2279(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field5235) {
            var9 = field5235;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field5232) {
            var10 = field5232;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < field5234) {
                var17 = field5234;
            }
            int var18 = arg0 + var13;
            if (var18 > field5229) {
                var18 = field5229;
            }
            int var19 = field5231 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field5228[var19] >> 16 & 0xFF) * var5;
                int var22 = (field5228[var19] >> 8 & 0xFF) * var5;
                int var23 = (field5228[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field5228[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field5234) {
                var30 = field5234;
            }
            int var31 = arg0 + var25;
            if (var31 > field5229 - 1) {
                var31 = field5229 - 1;
            }
            int var32 = field5231 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field5228[var32] >> 16 & 0xFF) * var5;
                int var35 = (field5228[var32] >> 8 & 0xFF) * var5;
                int var36 = (field5228[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field5228[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V", line = 418)
    public static final void method2272() {
        field5230 = null;
        field5233 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V", line = 422)
    public static final void method2273(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field5231) {
            arg2 = field5231;
        }
        if (arg3 > field5227) {
            arg3 = field5227;
        }
        field5234 = arg0;
        field5235 = arg1;
        field5229 = arg2;
        field5232 = arg3;
        method2272();
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIIII)V", line = 442)
    public static final void method2274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class272.method1928();
        int var18 = arg1 - class272.method1927();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class272.method1918(var19, var20, var21);
        class272.method1916(var23, var24, var25, var19, var20, var21, arg4);
        class272.method1918(var19, var21, var22);
        class272.method1916(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIII[I[I)V", line = 499)
    private static final void method2275(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field5232 - field5235 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg1 >= field5235 && arg1 < field5232) {
            int var7 = arg5[arg1 - field5235] + field5234;
            if (arg0 < var7) {
                arg2 -= var7 - arg0;
                arg0 = var7;
            }
            int var8 = arg5[arg1 - field5235] + field5234 + arg6[arg1 - field5235];
            if (arg0 + arg2 > var8) {
                arg2 = var8 - arg0;
            }
            int var9 = 256 - arg4;
            int var10 = (arg3 >> 16 & 0xFF) * arg4;
            int var11 = (arg3 >> 8 & 0xFF) * arg4;
            int var12 = (arg3 & 0xFF) * arg4;
            int var13 = field5231 * arg1 + arg0;
            for (int var14 = 0; var14 < arg2; var14++) {
                int var15 = (field5228[var13] >> 16 & 0xFF) * var9;
                int var16 = (field5228[var13] >> 8 & 0xFF) * var9;
                int var17 = (field5228[var13] & 0xFF) * var9;
                int var18 = (var12 + var17 >> 8) + (var10 + var15 >> 8 << 16) + (var11 + var16 >> 8 << 8);
                field5228[var13++] = var18;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V", line = 547)
    public static void method2276() {
        field5228 = null;
        field5230 = null;
        field5233 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIII)V", line = 552)
    public static final void method2277(int arg0, int arg1, int arg2, int arg3) {
        if (field5234 < arg0) {
            field5234 = arg0;
        }
        if (field5235 < arg1) {
            field5235 = arg1;
        }
        if (field5229 > arg2) {
            field5229 = arg2;
        }
        if (field5232 > arg3) {
            field5232 = arg3;
        }
        method2272();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([I[I)V", line = 567)
    public static final void method2278(int[] arg0, int[] arg1) {
        if (field5232 - field5235 != arg0.length || field5232 - field5235 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field5230 = arg0;
        field5233 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(IIII)V", line = 578)
    private static final void method2279(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method2281(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field5235) {
            var4 = field5235;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field5232) {
            var5 = field5232;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < field5234) {
                var12 = field5234;
            }
            int var13 = arg0 + var8;
            if (var13 > field5229) {
                var13 = field5229;
            }
            int var14 = field5231 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field5228[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field5234) {
                var21 = field5234;
            }
            int var22 = arg0 + var16;
            if (var22 > field5229 - 1) {
                var22 = field5229 - 1;
            }
            int var23 = field5231 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field5228[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([III)V", line = 685)
    public static final void method2280(int[] arg0, int arg1, int arg2) {
        field5228 = arg0;
        field5231 = arg1;
        field5227 = arg2;
        method2273(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V", line = 691)
    private static final void method2281(int arg0, int arg1, int arg2) {
        if (arg0 >= field5234 && arg1 >= field5235 && arg0 < field5229 && arg1 < field5232) {
            field5228[field5231 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(IIIII)V", line = 697)
    public static final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5234) {
            arg2 -= field5234 - arg0;
            arg0 = field5234;
        }
        if (arg1 < field5235) {
            arg3 -= field5235 - arg1;
            arg1 = field5235;
        }
        if (arg0 + arg2 > field5229) {
            arg2 = field5229 - arg0;
        }
        if (arg1 + arg3 > field5232) {
            arg3 = field5232 - arg1;
        }
        int var5 = field5231 - arg2;
        int var6 = field5231 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field5228[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "()V", line = 742)
    public static final void method2283() {
        int var0 = 0;
        int var1 = field5231 * field5227 - 7;
        while (var0 < var1) {
            field5228[var0++] = 0;
            field5228[var0++] = 0;
            field5228[var0++] = 0;
            field5228[var0++] = 0;
            field5228[var0++] = 0;
            field5228[var0++] = 0;
            field5228[var0++] = 0;
            field5228[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field5228[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(IIIII)V", line = 763)
    public static final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field5235 || arg1 >= field5232) {
            return;
        }
        if (arg0 < field5234) {
            arg2 -= field5234 - arg0;
            arg0 = field5234;
        }
        if (arg0 + arg2 > field5229) {
            arg2 = field5229 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field5231 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field5228[var9] >> 16 & 0xFF) * var5;
            int var12 = (field5228[var9] >> 8 & 0xFF) * var5;
            int var13 = (field5228[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field5228[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(IIIII)V", line = 804)
    private static final void method2285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5234 || arg0 >= field5229) {
            return;
        }
        if (arg1 < field5235) {
            arg2 -= field5235 - arg1;
            arg1 = field5235;
        }
        if (arg1 + arg2 > field5232) {
            arg2 = field5232 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field5231 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field5228[var9] >> 16 & 0xFF) * var5;
            int var12 = (field5228[var9] >> 8 & 0xFF) * var5;
            int var13 = (field5228[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field5228[var9] = var14;
            var9 += field5231;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(IIIIII)V", line = 848)
    public static final void method2286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method2284(arg0, arg1, arg2, arg4, arg5);
        method2284(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method2285(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method2285(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(IIIII)V", line = 858)
    public static final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method2292(arg0, arg1, var5 + 1, arg4);
            } else {
                method2292(arg0 + var5, arg1, 1 - var5, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field5234) {
                    var8 += (field5234 - arg0) * var10;
                    arg0 = field5234;
                }
                if (var11 >= field5229) {
                    var11 = field5229 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field5235 && var12 < field5232) {
                        field5228[field5231 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field5235) {
                    var14 += (field5235 - arg1) * var16;
                    arg1 = field5235;
                }
                if (var17 >= field5232) {
                    var17 = field5232 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5234 && var18 < field5229) {
                        field5228[field5231 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method2293(arg0, arg1, var6 + 1, arg4);
        } else {
            method2293(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(IIIIII)V", line = 974)
    public static final void method2288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 >= 0) {
                method2284(arg0, arg1, var6, arg4, arg5);
            } else {
                method2284(arg0 + var6 + 1, arg1, -var6, arg4, arg5);
            }
        } else if (var6 != 0) {
            boolean var8 = false;
            if (var6 + var7 < 0) {
                arg0 += var6;
                var6 = -var6;
                arg1 += var7;
                var7 = -var7;
                var8 = true;
            }
            int var9 = 256 - arg5;
            int var10 = (arg4 >> 16 & 0xFF) * arg5;
            int var11 = (arg4 >> 8 & 0xFF) * arg5;
            int var12 = (arg4 & 0xFF) * arg5;
            if (var6 > var7) {
                int var13 = arg1 << 16;
                int var14 = var13 + 32768;
                int var15 = var7 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg0 + var6;
                if (var8) {
                    var14 += var16;
                    arg0++;
                }
                if (arg0 < field5234) {
                    var14 += (field5234 - arg0) * var16;
                    arg0 = field5234;
                }
                if (var17 >= field5229) {
                    var17 = field5229 - 1;
                }
                if (!var8) {
                    var17--;
                }
                while (arg0 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5235 && var18 < field5232) {
                        int var19 = field5231 * var18 + arg0;
                        int var20 = (field5228[var19] >> 16 & 0xFF) * var9;
                        int var21 = (field5228[var19] >> 8 & 0xFF) * var9;
                        int var22 = (field5228[var19] & 0xFF) * var9;
                        int var23 = (var12 + var22 >> 8) + (var10 + var20 >> 8 << 16) + (var11 + var21 >> 8 << 8);
                        field5228[var19] = var23;
                    }
                    var14 += var16;
                    arg0++;
                }
            } else {
                int var24 = arg0 << 16;
                int var25 = var24 + 32768;
                int var26 = var6 << 16;
                int var27 = (int) Math.floor((double) var26 / (double) var7 + 0.5D);
                int var28 = arg1 + var7;
                if (var8) {
                    var25 += var27;
                    arg1++;
                }
                if (arg1 < field5235) {
                    var25 += (field5235 - arg1) * var27;
                    arg1 = field5235;
                }
                if (var28 >= field5232) {
                    var28 = field5232 - 1;
                }
                if (!var8) {
                    var28--;
                }
                while (arg1 <= var28) {
                    int var29 = var25 >> 16;
                    if (var29 >= field5234 && var29 < field5229) {
                        int var30 = field5231 * arg1 + var29;
                        int var31 = (field5228[var30] >> 16 & 0xFF) * var9;
                        int var32 = (field5228[var30] >> 8 & 0xFF) * var9;
                        int var33 = (field5228[var30] & 0xFF) * var9;
                        int var34 = (var12 + var33 >> 8) + (var10 + var31 >> 8 << 16) + (var11 + var32 >> 8 << 8);
                        field5228[var30] = var34;
                    }
                    var25 += var27;
                    arg1++;
                }
            }
        } else if (var7 >= 0) {
            method2285(arg0, arg1, var7, arg4, arg5);
        } else {
            method2285(arg0, arg1 + var7 + 1, -var7, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([I)V", line = 1119)
    public static final void method2289(int[] arg0) {
        field5234 = arg0[0];
        field5235 = arg0[1];
        field5229 = arg0[2];
        field5232 = arg0[3];
        method2272();
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "()V", line = 1127)
    public static final void method2290() {
        field5234 = 0;
        field5235 = 0;
        field5229 = field5231;
        field5232 = field5227;
        method2272();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III[I[I)V", line = 1140)
    public static final void method2291(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field5231 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field5228[var7++] = arg2;
            }
            var5 += field5231;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(IIII)V", line = 1159)
    public static final void method2292(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field5235 || arg1 >= field5232) {
            return;
        }
        if (arg0 < field5234) {
            arg2 -= field5234 - arg0;
            arg0 = field5234;
        }
        if (arg0 + arg2 > field5229) {
            arg2 = field5229 - arg0;
        }
        int var4 = field5231 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field5228[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(IIII)V", line = 1182)
    public static final void method2293(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5234 || arg0 >= field5229) {
            return;
        }
        if (arg1 < field5235) {
            arg2 -= field5235 - arg1;
            arg1 = field5235;
        }
        if (arg1 + arg2 > field5232) {
            arg2 = field5232 - arg1;
        }
        int var4 = field5231 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field5228[var4] = arg3;
            var5++;
            var4 += field5231;
        }
    }
}
