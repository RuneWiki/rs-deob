import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class246 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field4031 = 0;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field4032 = 0;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field4038 = 0;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
    public static int[] field4033;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "[I")
    public static int[] field4036;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "[I")
    public static int[] field4037;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1902(arg0, arg1, arg2, arg4, arg5);
        method1902(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1893(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1893(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIII)V", line = 14)
    private static final void method1879(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1904(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4038) {
            var4 = field4038;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4039) {
            var5 = field4039;
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
            if (var12 < field4032) {
                var12 = field4032;
            }
            int var13 = arg0 + var8;
            if (var13 > field4031) {
                var13 = field4031;
            }
            int var14 = field4035 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field4036[var14++] = arg3;
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
            if (var21 < field4032) {
                var21 = field4032;
            }
            int var22 = arg0 + var16;
            if (var22 > field4031 - 1) {
                var22 = field4031 - 1;
            }
            int var23 = field4035 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field4036[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII[I[I)V", line = 120)
    private static final void method1880(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field4039 - field4038 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg1 >= field4038 && arg1 < field4039) {
            int var7 = arg5[arg1 - field4038] + field4032;
            if (arg0 < var7) {
                arg2 -= var7 - arg0;
                arg0 = var7;
            }
            int var8 = arg5[arg1 - field4038] + field4032 + arg6[arg1 - field4038];
            if (arg0 + arg2 > var8) {
                arg2 = var8 - arg0;
            }
            int var9 = 256 - arg4;
            int var10 = (arg3 >> 16 & 0xFF) * arg4;
            int var11 = (arg3 >> 8 & 0xFF) * arg4;
            int var12 = (arg3 & 0xFF) * arg4;
            int var13 = field4035 * arg1 + arg0;
            for (int var14 = 0; var14 < arg2; var14++) {
                int var15 = (field4036[var13] >> 16 & 0xFF) * var9;
                int var16 = (field4036[var13] >> 8 & 0xFF) * var9;
                int var17 = (field4036[var13] & 0xFF) * var9;
                int var18 = (var12 + var17 >> 8) + (var10 + var15 >> 8 << 16) + (var11 + var16 >> 8 << 8);
                field4036[var13++] = var18;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)V", line = 169)
    public static final void method1881(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1891(arg0, arg1, arg2, arg4);
        method1891(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1901(arg0, arg1, arg3, arg4);
        method1901(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()V", line = 176)
    public static final void method1882() {
        int var0 = 0;
        int var1 = field4035 * field4034 - 7;
        while (var0 < var1) {
            field4036[var0++] = 0;
            field4036[var0++] = 0;
            field4036[var0++] = 0;
            field4036[var0++] = 0;
            field4036[var0++] = 0;
            field4036[var0++] = 0;
            field4036[var0++] = 0;
            field4036[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field4036[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([I)V", line = 198)
    public static final void method1883(int[] arg0) {
        field4032 = arg0[0];
        field4038 = arg0[1];
        field4031 = arg0[2];
        field4039 = arg0[3];
        method1898();
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIII)V", line = 206)
    public static final void method1884(int arg0, int arg1, int arg2, int arg3) {
        if (field4032 < arg0) {
            field4032 = arg0;
        }
        if (field4038 < arg1) {
            field4038 = arg1;
        }
        if (field4031 > arg2) {
            field4031 = arg2;
        }
        if (field4039 > arg3) {
            field4039 = arg3;
        }
        method1898();
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIIII)V", line = 230)
    public static final void method1885(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4032) {
            arg2 -= field4032 - arg0;
            arg0 = field4032;
        }
        if (arg1 < field4038) {
            arg3 -= field4038 - arg1;
            arg1 = field4038;
        }
        if (arg0 + arg2 > field4031) {
            arg2 = field4031 - arg0;
        }
        if (arg1 + arg3 > field4039) {
            arg3 = field4039 - arg1;
        }
        int var5 = field4035 - arg2;
        int var6 = field4035 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4036[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "([I)V", line = 277)
    public static final void method1886(int[] arg0) {
        arg0[0] = field4032;
        arg0[1] = field4038;
        arg0[2] = field4031;
        arg0[3] = field4039;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V", line = 284)
    public static final void method1887() {
        field4032 = 0;
        field4038 = 0;
        field4031 = field4035;
        field4039 = field4034;
        method1898();
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIIII[I[I)V", line = 292)
    private static final void method1888(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field4039 - field4038 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg0 >= field4032 && arg0 < field4031) {
            if (arg1 < field4038) {
                arg2 -= field4038 - arg1;
                arg1 = field4038;
            }
            if (arg1 + arg2 > field4039) {
                arg2 = field4039 - arg1;
            }
            int var7 = 256 - arg4;
            int var8 = (arg3 >> 16 & 0xFF) * arg4;
            int var9 = (arg3 >> 8 & 0xFF) * arg4;
            int var10 = (arg3 & 0xFF) * arg4;
            int var11 = field4035 * arg1 + arg0;
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1 + var12 - field4038;
                if (arg0 - field4032 >= arg5[var13] && arg0 - field4032 < arg5[var13] + arg6[var13]) {
                    int var14 = (field4036[var11] >> 16 & 0xFF) * var7;
                    int var15 = (field4036[var11] >> 8 & 0xFF) * var7;
                    int var16 = (field4036[var11] & 0xFF) * var7;
                    int var17 = (var10 + var16 >> 8) + (var8 + var14 >> 8 << 16) + (var9 + var15 >> 8 << 8);
                    field4036[var11] = var17;
                }
                var11 += field4035;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(IIII)V", line = 344)
    public static final void method1889(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4035) {
            arg2 = field4035;
        }
        if (arg3 > field4034) {
            arg3 = field4034;
        }
        field4032 = arg0;
        field4038 = arg1;
        field4031 = arg2;
        field4039 = arg3;
        method1898();
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(IIIII)V", line = 363)
    public static final void method1890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1879(arg0, arg1, arg2, arg3);
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
        if (var9 < field4038) {
            var9 = field4038;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4039) {
            var10 = field4039;
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
            if (var17 < field4032) {
                var17 = field4032;
            }
            int var18 = arg0 + var13;
            if (var18 > field4031) {
                var18 = field4031;
            }
            int var19 = field4035 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field4036[var19] >> 16 & 0xFF) * var5;
                int var22 = (field4036[var19] >> 8 & 0xFF) * var5;
                int var23 = (field4036[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field4036[var19++] = var24;
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
            if (var30 < field4032) {
                var30 = field4032;
            }
            int var31 = arg0 + var25;
            if (var31 > field4031 - 1) {
                var31 = field4031 - 1;
            }
            int var32 = field4035 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field4036[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4036[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4036[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4036[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(IIII)V", line = 496)
    public static final void method1891(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4038 || arg1 >= field4039) {
            return;
        }
        if (arg0 < field4032) {
            arg2 -= field4032 - arg0;
            arg0 = field4032;
        }
        if (arg0 + arg2 > field4031) {
            arg2 = field4031 - arg0;
        }
        int var4 = field4035 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4036[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIIIII)V", line = 523)
    public static final void method1892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 >= 0) {
                method1902(arg0, arg1, var6, arg4, arg5);
            } else {
                method1902(arg0 + var6 + 1, arg1, -var6, arg4, arg5);
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
                if (arg0 < field4032) {
                    var14 += (field4032 - arg0) * var16;
                    arg0 = field4032;
                }
                if (var17 >= field4031) {
                    var17 = field4031 - 1;
                }
                if (!var8) {
                    var17--;
                }
                while (arg0 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field4038 && var18 < field4039) {
                        int var19 = field4035 * var18 + arg0;
                        int var20 = (field4036[var19] >> 16 & 0xFF) * var9;
                        int var21 = (field4036[var19] >> 8 & 0xFF) * var9;
                        int var22 = (field4036[var19] & 0xFF) * var9;
                        int var23 = (var12 + var22 >> 8) + (var10 + var20 >> 8 << 16) + (var11 + var21 >> 8 << 8);
                        field4036[var19] = var23;
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
                if (arg1 < field4038) {
                    var25 += (field4038 - arg1) * var27;
                    arg1 = field4038;
                }
                if (var28 >= field4039) {
                    var28 = field4039 - 1;
                }
                if (!var8) {
                    var28--;
                }
                while (arg1 <= var28) {
                    int var29 = var25 >> 16;
                    if (var29 >= field4032 && var29 < field4031) {
                        int var30 = field4035 * arg1 + var29;
                        int var31 = (field4036[var30] >> 16 & 0xFF) * var9;
                        int var32 = (field4036[var30] >> 8 & 0xFF) * var9;
                        int var33 = (field4036[var30] & 0xFF) * var9;
                        int var34 = (var12 + var33 >> 8) + (var10 + var31 >> 8 << 16) + (var11 + var32 >> 8 << 8);
                        field4036[var30] = var34;
                    }
                    var25 += var27;
                    arg1++;
                }
            }
        } else if (var7 >= 0) {
            method1893(arg0, arg1, var7, arg4, arg5);
        } else {
            method1893(arg0, arg1 + var7 + 1, -var7, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(IIIII)V", line = 670)
    private static final void method1893(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4032 || arg0 >= field4031) {
            return;
        }
        if (arg1 < field4038) {
            arg2 -= field4038 - arg1;
            arg1 = field4038;
        }
        if (arg1 + arg2 > field4039) {
            arg2 = field4039 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4035 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4036[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4036[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4036[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4036[var9] = var14;
            var9 += field4035;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V", line = 712)
    public static final void method1894(int[] arg0, int arg1, int arg2) {
        field4036 = arg0;
        field4035 = arg1;
        field4034 = arg2;
        method1889(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I[I)V", line = 719)
    public static final void method1895(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field4035 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field4036[var7++] = arg2;
            }
            var5 += field4035;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIII[I[I)V", line = 738)
    public static final void method1896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        if (field4039 - field4038 != arg6.length) {
            throw new IllegalStateException();
        }
        int var8 = arg2 - arg0;
        int var9 = arg3 - arg1;
        if (var9 == 0) {
            if (var8 >= 0) {
                method1880(arg0, arg1, var8, arg4, arg5, arg6, arg7);
            } else {
                method1880(arg0 + var8 + 1, arg1, -var8, arg4, arg5, arg6, arg7);
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
                if (arg0 < field4032) {
                    var16 += (field4032 - arg0) * var18;
                    arg0 = field4032;
                }
                if (var19 >= field4031) {
                    var19 = field4031 - 1;
                }
                if (!var10) {
                    var19--;
                }
                while (arg0 <= var19) {
                    int var20 = var16 >> 16;
                    int var21 = var20 - field4038;
                    if (var20 >= field4038 && var20 < field4039 && arg0 - field4032 >= arg6[var21] && arg0 - field4032 < arg6[var21] + arg7[var21]) {
                        int var22 = field4035 * var20 + arg0;
                        int var23 = (field4036[var22] >> 16 & 0xFF) * var11;
                        int var24 = (field4036[var22] >> 8 & 0xFF) * var11;
                        int var25 = (field4036[var22] & 0xFF) * var11;
                        int var26 = (var14 + var25 >> 8) + (var12 + var23 >> 8 << 16) + (var13 + var24 >> 8 << 8);
                        field4036[var22] = var26;
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
                if (arg1 < field4038) {
                    var28 += (field4038 - arg1) * var30;
                    arg1 = field4038;
                }
                if (var31 >= field4039) {
                    var31 = field4039 - 1;
                }
                if (!var10) {
                    var31--;
                }
                while (arg1 <= var31) {
                    int var32 = var28 >> 16;
                    int var33 = arg1 - field4038;
                    if (var32 >= field4032 && var32 < field4031 && var32 - field4032 >= arg6[var33] && var32 - field4032 < arg6[var33] + arg7[var33]) {
                        int var34 = field4035 * arg1 + var32;
                        int var35 = (field4036[var34] >> 16 & 0xFF) * var11;
                        int var36 = (field4036[var34] >> 8 & 0xFF) * var11;
                        int var37 = (field4036[var34] & 0xFF) * var11;
                        int var38 = (var14 + var37 >> 8) + (var12 + var35 >> 8 << 16) + (var13 + var36 >> 8 << 8);
                        field4036[var34] = var38;
                    }
                    var28 += var30;
                    arg1++;
                }
            }
        } else if (var9 >= 0) {
            method1888(arg0, arg1, var9, arg4, arg5, arg6, arg7);
        } else {
            method1888(arg0, arg1 + var9 + 1, -var9, arg4, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(IIIII)V", line = 898)
    public static final void method1897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1891(arg0, arg1, var5 + 1, arg4);
            } else {
                method1891(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field4032) {
                    var8 += (field4032 - arg0) * var10;
                    arg0 = field4032;
                }
                if (var11 >= field4031) {
                    var11 = field4031 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field4038 && var12 < field4039) {
                        field4036[field4035 * var12 + arg0] = arg4;
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
                if (arg1 < field4038) {
                    var14 += (field4038 - arg1) * var16;
                    arg1 = field4038;
                }
                if (var17 >= field4039) {
                    var17 = field4039 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field4032 && var18 < field4031) {
                        field4036[field4035 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1901(arg0, arg1, var6 + 1, arg4);
        } else {
            method1901(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "()V", line = 993)
    public static final void method1898() {
        field4037 = null;
        field4033 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([I[I)V", line = 997)
    public static final void method1899(int[] arg0, int[] arg1) {
        if (field4039 - field4038 != arg0.length || field4039 - field4038 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field4037 = arg0;
        field4033 = arg1;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "()V", line = 1009)
    public static void method1900() {
        field4036 = null;
        field4037 = null;
        field4033 = null;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(IIII)V", line = 1017)
    public static final void method1901(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4032 || arg0 >= field4031) {
            return;
        }
        if (arg1 < field4038) {
            arg2 -= field4038 - arg1;
            arg1 = field4038;
        }
        if (arg1 + arg2 > field4039) {
            arg2 = field4039 - arg1;
        }
        int var4 = field4035 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field4036[var4] = arg3;
            var5++;
            var4 += field4035;
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(IIIII)V", line = 1041)
    public static final void method1902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field4038 || arg1 >= field4039) {
            return;
        }
        if (arg0 < field4032) {
            arg2 -= field4032 - arg0;
            arg0 = field4032;
        }
        if (arg0 + arg2 > field4031) {
            arg2 = field4031 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4035 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4036[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4036[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4036[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4036[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(IIIIII)V", line = 1083)
    public static final void method1903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class153.method1195();
        int var18 = arg1 - class153.method1193();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class153.method1197(var19, var20, var21);
        class153.method1187(var23, var24, var25, var19, var20, var21, arg4);
        class153.method1197(var19, var21, var22);
        class153.method1187(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V", line = 1150)
    private static final void method1904(int arg0, int arg1, int arg2) {
        if (arg0 >= field4032 && arg1 >= field4038 && arg0 < field4031 && arg1 < field4039) {
            field4036[field4035 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(IIIIII)V", line = 1157)
    public static final void method1905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field4032) {
            arg2 -= field4032 - arg0;
            arg0 = field4032;
        }
        if (arg1 < field4038) {
            arg3 -= field4038 - arg1;
            arg1 = field4038;
        }
        if (arg0 + arg2 > field4031) {
            arg2 = field4031 - arg0;
        }
        if (arg1 + arg3 > field4039) {
            arg3 = field4039 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field4035 - arg2;
        int var9 = field4035 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field4036[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field4036[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }
}
