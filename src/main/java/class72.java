import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class72 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
    public static int[] field1171;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public static int[] field1174;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    public static int[] field1177;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)V")
    public static final void method557(int[] arg0, int arg1, int arg2) {
        field1174 = arg0;
        field1173 = arg1;
        field1175 = arg2;
        method567(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III[I[I)V")
    public static final void method558(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1173 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1174[var7++] = arg2;
            }
            var5 += field1173;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public static final void method559() {
        int var0 = 0;
        int var1 = field1175 * field1173 - 7;
        while (var0 < var1) {
            field1174[var0++] = 0;
            field1174[var0++] = 0;
            field1174[var0++] = 0;
            field1174[var0++] = 0;
            field1174[var0++] = 0;
            field1174[var0++] = 0;
            field1174[var0++] = 0;
            field1174[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1174[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method563(arg0, arg1, arg2, arg3);
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
        if (var9 < field1176) {
            var9 = field1176;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field1178) {
            var10 = field1178;
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
            int var30 = arg0 + 1 - var13;
            if (var30 < field1172) {
                var30 = field1172;
            }
            int var31 = arg0 + var13;
            if (var31 > field1179) {
                var31 = field1179;
            }
            int var32 = field1173 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field1174[var32] >> 16 & 0xFF) * var5;
                int var35 = (field1174[var32] >> 8 & 0xFF) * var5;
                int var36 = (field1174[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field1174[var32++] = var37;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var17 = arg2;
        int var18 = -var14;
        int var19 = var18 * var18 + var12;
        int var20 = var19 - arg2;
        int var21 = var19 - var18;
        while (var11 < var10) {
            while (var21 > var12 && var20 > var12) {
                var21 -= var17-- + var17;
                var20 -= var17 + var17;
            }
            int var22 = arg0 - var17;
            if (var22 < field1172) {
                var22 = field1172;
            }
            int var23 = arg0 + var17;
            if (var23 > field1179 - 1) {
                var23 = field1179 - 1;
            }
            int var24 = field1173 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field1174[var24] >> 16 & 0xFF) * var5;
                int var27 = (field1174[var24] >> 8 & 0xFF) * var5;
                int var28 = (field1174[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field1174[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V")
    public static final void method561() {
        field1172 = 0;
        field1176 = 0;
        field1179 = field1173;
        field1178 = field1175;
        method575();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([I)V")
    public static final void method562(int[] arg0) {
        field1172 = arg0[0];
        field1176 = arg0[1];
        field1179 = arg0[2];
        field1178 = arg0[3];
        method575();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)V")
    private static final void method563(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method566(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field1176) {
            var4 = field1176;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field1178) {
            var5 = field1178;
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
            int var21 = arg0 + 1 - var8;
            if (var21 < field1172) {
                var21 = field1172;
            }
            int var22 = arg0 + var8;
            if (var22 > field1179) {
                var22 = field1179;
            }
            int var23 = field1173 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field1174[var23++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var12 = arg2;
        int var13 = var6 - arg1;
        int var14 = var13 * var13 + var7;
        int var15 = var14 - arg2;
        int var16 = var14 - var13;
        while (var6 < var5) {
            while (var16 > var7 && var15 > var7) {
                var16 -= var12-- + var12;
                var15 -= var12 + var12;
            }
            int var17 = arg0 - var12;
            if (var17 < field1172) {
                var17 = field1172;
            }
            int var18 = arg0 + var12;
            if (var18 > field1179 - 1) {
                var18 = field1179 - 1;
            }
            int var19 = field1173 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field1174[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IIIII)V")
    public static final void method564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method572(arg0, arg1, arg2, arg4);
        method572(arg0, arg1 + arg3 - 1, arg2, arg4);
        method579(arg0, arg1, arg3, arg4);
        method579(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class119.method835();
        int var18 = arg1 - class119.method843();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class119.method838(var19, var20, var21);
        class119.method844(var23, var24, var25, var19, var20, var21, arg4);
        class119.method838(var19, var21, var22);
        class119.method844(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    private static final void method566(int arg0, int arg1, int arg2) {
        if (arg0 >= field1172 && arg1 >= field1176 && arg0 < field1179 && arg1 < field1178) {
            field1174[field1173 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IIII)V")
    public static final void method567(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1173) {
            arg2 = field1173;
        }
        if (arg3 > field1175) {
            arg3 = field1175;
        }
        field1172 = arg0;
        field1176 = arg1;
        field1179 = arg2;
        field1178 = arg3;
        method575();
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(IIIII)V")
    public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method572(arg0, arg1, var5 + 1, arg4);
            } else {
                method572(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1172) {
                    var8 += (field1172 - arg0) * var10;
                    arg0 = field1172;
                }
                if (var11 >= field1179) {
                    var11 = field1179 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1176 && var12 < field1178) {
                        field1174[field1173 * var12 + arg0] = arg4;
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
                if (arg1 < field1176) {
                    var14 += (field1176 - arg1) * var16;
                    arg1 = field1176;
                }
                if (var17 >= field1178) {
                    var17 = field1178 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1172 && var18 < field1179) {
                        field1174[field1173 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method579(arg0, arg1, var6 + 1, arg4);
        } else {
            method579(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(IIIII)V")
    private static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1176 || arg1 >= field1178) {
            return;
        }
        if (arg0 < field1172) {
            arg2 -= field1172 - arg0;
            arg0 = field1172;
        }
        if (arg0 + arg2 > field1179) {
            arg2 = field1179 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1173 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1174[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1174[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1174[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1174[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(IIII)V")
    public static final void method570(int arg0, int arg1, int arg2, int arg3) {
        if (field1172 < arg0) {
            field1172 = arg0;
        }
        if (field1176 < arg1) {
            field1176 = arg1;
        }
        if (field1179 > arg2) {
            field1179 = arg2;
        }
        if (field1178 > arg3) {
            field1178 = arg3;
        }
        method575();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([I[I)V")
    public static final void method571(int[] arg0, int[] arg1) {
        if (field1178 - field1176 != arg0.length || field1178 - field1176 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field1177 = arg0;
        field1171 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(IIII)V")
    public static final void method572(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1176 || arg1 >= field1178) {
            return;
        }
        if (arg0 < field1172) {
            arg2 -= field1172 - arg0;
            arg0 = field1172;
        }
        if (arg0 + arg2 > field1179) {
            arg2 = field1179 - arg0;
        }
        int var4 = field1173 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1174[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IIIIII)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1172) {
            arg2 -= field1172 - arg0;
            arg0 = field1172;
        }
        if (arg1 < field1176) {
            arg3 -= field1176 - arg1;
            arg1 = field1176;
        }
        if (arg0 + arg2 > field1179) {
            arg2 = field1179 - arg0;
        }
        if (arg1 + arg3 > field1178) {
            arg3 = field1178 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1173 - arg2;
        int var9 = field1173 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1174[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1174[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
    public static void method574() {
        field1174 = null;
        field1177 = null;
        field1171 = null;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()V")
    public static final void method575() {
        field1177 = null;
        field1171 = null;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(IIIII)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1172) {
            arg2 -= field1172 - arg0;
            arg0 = field1172;
        }
        if (arg1 < field1176) {
            arg3 -= field1176 - arg1;
            arg1 = field1176;
        }
        if (arg0 + arg2 > field1179) {
            arg2 = field1179 - arg0;
        }
        if (arg1 + arg3 > field1178) {
            arg3 = field1178 - arg1;
        }
        int var5 = field1173 - arg2;
        int var6 = field1173 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1174[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(IIIIII)V")
    public static final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method569(arg0, arg1, arg2, arg4, arg5);
        method569(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method578(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method578(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(IIIII)V")
    private static final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1172 || arg0 >= field1179) {
            return;
        }
        if (arg1 < field1176) {
            arg2 -= field1176 - arg1;
            arg1 = field1176;
        }
        if (arg1 + arg2 > field1178) {
            arg2 = field1178 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1173 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1174[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1174[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1174[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1174[var9] = var14;
            var9 += field1173;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(IIII)V")
    public static final void method579(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1172 || arg0 >= field1179) {
            return;
        }
        if (arg1 < field1176) {
            arg2 -= field1176 - arg1;
            arg1 = field1176;
        }
        if (arg1 + arg2 > field1178) {
            arg2 = field1178 - arg1;
        }
        int var4 = field1173 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field1174[var4] = arg3;
            var5++;
            var4 += field1173;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([I)V")
    public static final void method580(int[] arg0) {
        arg0[0] = field1172;
        arg0[1] = field1176;
        arg0[2] = field1179;
        arg0[3] = field1178;
    }
}
