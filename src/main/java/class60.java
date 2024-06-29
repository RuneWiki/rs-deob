import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class60 {

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public static int[] field928;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
    public static int[] field929;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    public static int[] field932;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V", line = 3)
    private static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field936 || arg0 >= field935) {
            return;
        }
        if (arg1 < field934) {
            arg2 -= field934 - arg1;
            arg1 = field934;
        }
        if (arg1 + arg2 > field931) {
            arg2 = field931 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field933 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field928[var9] >> 16 & 0xFF) * var5;
            int var12 = (field928[var9] >> 8 & 0xFF) * var5;
            int var13 = (field928[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field928[var9] = var14;
            var9 += field933;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 46)
    private static final void method587(int arg0, int arg1, int arg2) {
        if (arg0 >= field936 && arg1 >= field934 && arg0 < field935 && arg1 < field931) {
            field928[field933 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([I)V", line = 59)
    public static final void method588(int[] arg0) {
        arg0[0] = field936;
        arg0[1] = field934;
        arg0[2] = field935;
        arg0[3] = field931;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V", line = 65)
    public static final void method589(int arg0, int arg1, int arg2, int arg3) {
        if (field936 < arg0) {
            field936 = arg0;
        }
        if (field934 < arg1) {
            field934 = arg1;
        }
        if (field935 > arg2) {
            field935 = arg2;
        }
        if (field931 > arg3) {
            field931 = arg3;
        }
        method593();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([I)V", line = 81)
    public static final void method590(int[] arg0) {
        field936 = arg0[0];
        field934 = arg0[1];
        field935 = arg0[2];
        field931 = arg0[3];
        method593();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V", line = 90)
    public static final void method591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 >= 0) {
                method600(arg0, arg1, var6, arg4, arg5);
            } else {
                method600(arg0 + var6 + 1, arg1, -var6, arg4, arg5);
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
                if (arg0 < field936) {
                    var14 += (field936 - arg0) * var16;
                    arg0 = field936;
                }
                if (var17 >= field935) {
                    var17 = field935 - 1;
                }
                if (!var8) {
                    var17--;
                }
                while (arg0 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field934 && var18 < field931) {
                        int var19 = field933 * var18 + arg0;
                        int var20 = (field928[var19] >> 16 & 0xFF) * var9;
                        int var21 = (field928[var19] >> 8 & 0xFF) * var9;
                        int var22 = (field928[var19] & 0xFF) * var9;
                        int var23 = (var12 + var22 >> 8) + (var10 + var20 >> 8 << 16) + (var11 + var21 >> 8 << 8);
                        field928[var19] = var23;
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
                if (arg1 < field934) {
                    var25 += (field934 - arg1) * var27;
                    arg1 = field934;
                }
                if (var28 >= field931) {
                    var28 = field931 - 1;
                }
                if (!var8) {
                    var28--;
                }
                while (arg1 <= var28) {
                    int var29 = var25 >> 16;
                    if (var29 >= field936 && var29 < field935) {
                        int var30 = field933 * arg1 + var29;
                        int var31 = (field928[var30] >> 16 & 0xFF) * var9;
                        int var32 = (field928[var30] >> 8 & 0xFF) * var9;
                        int var33 = (field928[var30] & 0xFF) * var9;
                        int var34 = (var12 + var33 >> 8) + (var10 + var31 >> 8 << 16) + (var11 + var32 >> 8 << 8);
                        field928[var30] = var34;
                    }
                    var25 += var27;
                    arg1++;
                }
            }
        } else if (var7 >= 0) {
            method586(arg0, arg1, var7, arg4, arg5);
        } else {
            method586(arg0, arg1 + var7 + 1, -var7, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V", line = 235)
    public static final void method592() {
        int var0 = 0;
        int var1 = field933 * field930 - 7;
        while (var0 < var1) {
            field928[var0++] = 0;
            field928[var0++] = 0;
            field928[var0++] = 0;
            field928[var0++] = 0;
            field928[var0++] = 0;
            field928[var0++] = 0;
            field928[var0++] = 0;
            field928[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field928[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()V", line = 258)
    public static final void method593() {
        field932 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIII)V", line = 262)
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method600(arg0, arg1, arg2, arg4, arg5);
        method600(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method586(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method586(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([III)V", line = 273)
    public static final void method595(int[] arg0, int arg1, int arg2) {
        field928 = arg0;
        field933 = arg1;
        field930 = arg2;
        method598(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII[I[I)V", line = 281)
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        if (field931 - field934 != arg6.length) {
            throw new IllegalStateException();
        }
        int var8 = arg2 - arg0;
        int var9 = arg3 - arg1;
        if (var9 == 0) {
            if (var8 >= 0) {
                method603(arg0, arg1, var8, arg4, arg5, arg6, arg7);
            } else {
                method603(arg0 + var8 + 1, arg1, -var8, arg4, arg5, arg6, arg7);
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
                if (arg0 < field936) {
                    var16 += (field936 - arg0) * var18;
                    arg0 = field936;
                }
                if (var19 >= field935) {
                    var19 = field935 - 1;
                }
                if (!var10) {
                    var19--;
                }
                while (arg0 <= var19) {
                    int var20 = var16 >> 16;
                    int var21 = var20 - field934;
                    if (var20 >= field934 && var20 < field931 && arg0 - field936 >= arg6[var21] && arg0 - field936 < arg6[var21] + arg7[var21]) {
                        int var22 = field933 * var20 + arg0;
                        int var23 = (field928[var22] >> 16 & 0xFF) * var11;
                        int var24 = (field928[var22] >> 8 & 0xFF) * var11;
                        int var25 = (field928[var22] & 0xFF) * var11;
                        int var26 = (var14 + var25 >> 8) + (var12 + var23 >> 8 << 16) + (var13 + var24 >> 8 << 8);
                        field928[var22] = var26;
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
                if (arg1 < field934) {
                    var28 += (field934 - arg1) * var30;
                    arg1 = field934;
                }
                if (var31 >= field931) {
                    var31 = field931 - 1;
                }
                if (!var10) {
                    var31--;
                }
                while (arg1 <= var31) {
                    int var32 = var28 >> 16;
                    int var33 = arg1 - field934;
                    if (var32 >= field936 && var32 < field935 && var32 - field936 >= arg6[var33] && var32 - field936 < arg6[var33] + arg7[var33]) {
                        int var34 = field933 * arg1 + var32;
                        int var35 = (field928[var34] >> 16 & 0xFF) * var11;
                        int var36 = (field928[var34] >> 8 & 0xFF) * var11;
                        int var37 = (field928[var34] & 0xFF) * var11;
                        int var38 = (var14 + var37 >> 8) + (var12 + var35 >> 8 << 16) + (var13 + var36 >> 8 << 8);
                        field928[var34] = var38;
                    }
                    var28 += var30;
                    arg1++;
                }
            }
        } else if (var9 >= 0) {
            method608(arg0, arg1, var9, arg4, arg5, arg6, arg7);
        } else {
            method608(arg0, arg1 + var9 + 1, -var9, arg4, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()V", line = 439)
    public static void method597() {
        field928 = null;
        field932 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIII)V", line = 444)
    public static final void method598(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field933) {
            arg2 = field933;
        }
        if (arg3 > field930) {
            arg3 = field930;
        }
        field936 = arg0;
        field934 = arg1;
        field935 = arg2;
        field931 = arg3;
        method593();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIII)V", line = 463)
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method613(arg0, arg1, arg2, arg3);
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
        if (var9 < field934) {
            var9 = field934;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field931) {
            var10 = field931;
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
            if (var17 < field936) {
                var17 = field936;
            }
            int var18 = arg0 + var13;
            if (var18 > field935) {
                var18 = field935;
            }
            int var19 = field933 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field928[var19] >> 16 & 0xFF) * var5;
                int var22 = (field928[var19] >> 8 & 0xFF) * var5;
                int var23 = (field928[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field928[var19++] = var24;
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
            if (var30 < field936) {
                var30 = field936;
            }
            int var31 = arg0 + var25;
            if (var31 > field935 - 1) {
                var31 = field935 - 1;
            }
            int var32 = field933 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field928[var32] >> 16 & 0xFF) * var5;
                int var35 = (field928[var32] >> 8 & 0xFF) * var5;
                int var36 = (field928[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field928[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIIII)V", line = 600)
    public static final void method600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field934 || arg1 >= field931) {
            return;
        }
        if (arg0 < field936) {
            arg2 -= field936 - arg0;
            arg0 = field936;
        }
        if (arg0 + arg2 > field935) {
            arg2 = field935 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field933 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field928[var9] >> 16 & 0xFF) * var5;
            int var12 = (field928[var9] >> 8 & 0xFF) * var5;
            int var13 = (field928[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field928[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIIIII)V", line = 643)
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field936) {
            arg2 -= field936 - arg0;
            arg0 = field936;
        }
        if (arg1 < field934) {
            arg3 -= field934 - arg1;
            arg1 = field934;
        }
        if (arg0 + arg2 > field935) {
            arg2 = field935 - arg0;
        }
        if (arg1 + arg3 > field931) {
            arg3 = field931 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field933 - arg2;
        int var9 = field933 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field928[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field928[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIII)V", line = 691)
    public static final void method602(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field936 || arg0 >= field935) {
            return;
        }
        if (arg1 < field934) {
            arg2 -= field934 - arg1;
            arg1 = field934;
        }
        if (arg1 + arg2 > field931) {
            arg2 = field931 - arg1;
        }
        int var4 = field933 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field928[var4] = arg3;
            var5++;
            var4 += field933;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII[I[I)V", line = 720)
    private static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field931 - field934 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg1 >= field934 && arg1 < field931) {
            int var7 = arg5[arg1 - field934] + field936;
            if (arg0 < var7) {
                arg2 -= var7 - arg0;
                arg0 = var7;
            }
            int var8 = arg5[arg1 - field934] + field936 + arg6[arg1 - field934];
            if (arg0 + arg2 > var8) {
                arg2 = var8 - arg0;
            }
            int var9 = 256 - arg4;
            int var10 = (arg3 >> 16 & 0xFF) * arg4;
            int var11 = (arg3 >> 8 & 0xFF) * arg4;
            int var12 = (arg3 & 0xFF) * arg4;
            int var13 = field933 * arg1 + arg0;
            for (int var14 = 0; var14 < arg2; var14++) {
                int var15 = (field928[var13] >> 16 & 0xFF) * var9;
                int var16 = (field928[var13] >> 8 & 0xFF) * var9;
                int var17 = (field928[var13] & 0xFF) * var9;
                int var18 = (var12 + var17 >> 8) + (var10 + var15 >> 8 << 16) + (var11 + var16 >> 8 << 8);
                field928[var13++] = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(IIIII)V", line = 773)
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method609(arg0, arg1, arg2, arg4);
        method609(arg0, arg1 + arg3 - 1, arg2, arg4);
        method602(arg0, arg1, arg3, arg4);
        method602(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[I)V", line = 779)
    public static final void method605(int[] arg0, int[] arg1) {
        if (field931 - field934 != arg0.length || field931 - field934 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field932 = arg0;
        field929 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(IIIIII)V", line = 792)
    public static final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class107.method919();
        int var18 = arg1 - class107.method939();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class107.method922(var19, var20, var21);
        class107.method924(var23, var24, var25, var19, var20, var21, arg4);
        class107.method922(var19, var21, var22);
        class107.method924(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()V", line = 849)
    public static final void method607() {
        field936 = 0;
        field934 = 0;
        field935 = field933;
        field931 = field930;
        method593();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIII[I[I)V", line = 856)
    private static final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field931 - field934 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg0 >= field936 && arg0 < field935) {
            if (arg1 < field934) {
                arg2 -= field934 - arg1;
                arg1 = field934;
            }
            if (arg1 + arg2 > field931) {
                arg2 = field931 - arg1;
            }
            int var7 = 256 - arg4;
            int var8 = (arg3 >> 16 & 0xFF) * arg4;
            int var9 = (arg3 >> 8 & 0xFF) * arg4;
            int var10 = (arg3 & 0xFF) * arg4;
            int var11 = field933 * arg1 + arg0;
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1 + var12 - field934;
                if (arg0 - field936 >= arg5[var13] && arg0 - field936 < arg5[var13] + arg6[var13]) {
                    int var14 = (field928[var11] >> 16 & 0xFF) * var7;
                    int var15 = (field928[var11] >> 8 & 0xFF) * var7;
                    int var16 = (field928[var11] & 0xFF) * var7;
                    int var17 = (var10 + var16 >> 8) + (var8 + var14 >> 8 << 16) + (var9 + var15 >> 8 << 8);
                    field928[var11] = var17;
                }
                var11 += field933;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(IIII)V", line = 908)
    public static final void method609(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field934 || arg1 >= field931) {
            return;
        }
        if (arg0 < field936) {
            arg2 -= field936 - arg0;
            arg0 = field936;
        }
        if (arg0 + arg2 > field935) {
            arg2 = field935 - arg0;
        }
        int var4 = field933 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field928[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(IIIII)V", line = 934)
    public static final void method610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method609(arg0, arg1, var5 + 1, arg4);
            } else {
                method609(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field936) {
                    var8 += (field936 - arg0) * var10;
                    arg0 = field936;
                }
                if (var11 >= field935) {
                    var11 = field935 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field934 && var12 < field931) {
                        field928[field933 * var12 + arg0] = arg4;
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
                if (arg1 < field934) {
                    var14 += (field934 - arg1) * var16;
                    arg1 = field934;
                }
                if (var17 >= field931) {
                    var17 = field931 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field936 && var18 < field935) {
                        field928[field933 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method602(arg0, arg1, var6 + 1, arg4);
        } else {
            method602(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(IIIII)V", line = 1025)
    public static final void method611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field936) {
            arg2 -= field936 - arg0;
            arg0 = field936;
        }
        if (arg1 < field934) {
            arg3 -= field934 - arg1;
            arg1 = field934;
        }
        if (arg0 + arg2 > field935) {
            arg2 = field935 - arg0;
        }
        if (arg1 + arg3 > field931) {
            arg3 = field931 - arg1;
        }
        int var5 = field933 - arg2;
        int var6 = field933 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field928[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[I[I)V", line = 1068)
    public static final void method612(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field933 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field928[var7++] = arg2;
            }
            var5 += field933;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(IIII)V", line = 1099)
    private static final void method613(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method587(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field934) {
            var4 = field934;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field931) {
            var5 = field931;
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
            if (var12 < field936) {
                var12 = field936;
            }
            int var13 = arg0 + var8;
            if (var13 > field935) {
                var13 = field935;
            }
            int var14 = field933 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field928[var14++] = arg3;
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
            if (var21 < field936) {
                var21 = field936;
            }
            int var22 = arg0 + var16;
            if (var22 > field935 - 1) {
                var22 = field935 - 1;
            }
            int var23 = field933 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field928[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }
}
