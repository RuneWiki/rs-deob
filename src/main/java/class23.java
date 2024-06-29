import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[I")
    public static int[] field434;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    public static int[] field435;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field438;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
    private static final void method145(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method154(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field437) {
            var4 = field437;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field441) {
            var5 = field441;
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
            if (var21 < field436) {
                var21 = field436;
            }
            int var22 = arg0 + var8;
            if (var22 > field433) {
                var22 = field433;
            }
            int var23 = field440 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field435[var23++] = arg3;
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
            if (var17 < field436) {
                var17 = field436;
            }
            int var18 = arg0 + var12;
            if (var18 > field433 - 1) {
                var18 = field433 - 1;
            }
            int var19 = field440 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field435[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIII)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field436 || arg0 >= field433) {
            return;
        }
        if (arg1 < field437) {
            arg2 -= field437 - arg1;
            arg1 = field437;
        }
        if (arg1 + arg2 > field441) {
            arg2 = field441 - arg1;
        }
        int var4 = field440 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field435[field440 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([I[I)V")
    public static final void method147(int[] arg0, int[] arg1) {
        if (field441 - field437 != arg0.length || field441 - field437 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field438 = arg0;
        field434 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
    public static final void method148() {
        field436 = 0;
        field437 = 0;
        field433 = field440;
        field441 = field439;
        method153();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[I[I)V")
    public static final void method149(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field440 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field435[var7++] = arg2;
            }
            var5 += field440;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
    private static final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field436 || arg0 >= field433) {
            return;
        }
        if (arg1 < field437) {
            arg2 -= field437 - arg1;
            arg1 = field437;
        }
        if (arg1 + arg2 > field441) {
            arg2 = field441 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field440 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field435[var9] >> 16 & 0xFF) * var5;
            int var12 = (field435[var9] >> 8 & 0xFF) * var5;
            int var13 = (field435[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field435[var9] = var14;
            var9 += field440;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([I)V")
    public static final void method151(int[] arg0) {
        field436 = arg0[0];
        field437 = arg0[1];
        field433 = arg0[2];
        field441 = arg0[3];
        method153();
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIIII)V")
    public static final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method161(arg0, arg1, var5 + 1, arg4);
            } else {
                method161(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field436) {
                    var8 += (field436 - arg0) * var10;
                    arg0 = field436;
                }
                if (var11 >= field433) {
                    var11 = field433 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field437 && var12 < field441) {
                        field435[field440 * var12 + arg0] = arg4;
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
                if (arg1 < field437) {
                    var14 += (field437 - arg1) * var16;
                    arg1 = field437;
                }
                if (var17 >= field441) {
                    var17 = field441 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field436 && var18 < field433) {
                        field435[field440 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method146(arg0, arg1, var6 + 1, arg4);
        } else {
            method146(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V")
    public static final void method153() {
        field438 = null;
        field434 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    private static final void method154(int arg0, int arg1, int arg2) {
        if (arg0 >= field436 && arg1 >= field437 && arg0 < field433 && arg1 < field441) {
            field435[field440 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(IIIII)V")
    private static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field437 || arg1 >= field441) {
            return;
        }
        if (arg0 < field436) {
            arg2 -= field436 - arg0;
            arg0 = field436;
        }
        if (arg0 + arg2 > field433) {
            arg2 = field433 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field440 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field435[var9] >> 16 & 0xFF) * var5;
            int var12 = (field435[var9] >> 8 & 0xFF) * var5;
            int var13 = (field435[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field435[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method155(arg0, arg1, arg2, arg4, arg5);
        method155(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method150(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method150(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(IIII)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3) {
        if (field436 < arg0) {
            field436 = arg0;
        }
        if (field437 < arg1) {
            field437 = arg1;
        }
        if (field433 > arg2) {
            field433 = arg2;
        }
        if (field441 > arg3) {
            field441 = arg3;
        }
        method153();
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "([I)V")
    public static final void method158(int[] arg0) {
        arg0[0] = field436;
        arg0[1] = field437;
        arg0[2] = field433;
        arg0[3] = field441;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIIIII)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field436) {
            arg2 -= field436 - arg0;
            arg0 = field436;
        }
        if (arg1 < field437) {
            arg3 -= field437 - arg1;
            arg1 = field437;
        }
        if (arg0 + arg2 > field433) {
            arg2 = field433 - arg0;
        }
        if (arg1 + arg3 > field441) {
            arg3 = field441 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field440 - arg2;
        int var9 = field440 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field435[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field435[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()V")
    public static final void method160() {
        int var0 = 0;
        int var1 = field440 * field439 - 7;
        while (var0 < var1) {
            field435[var0++] = 0;
            field435[var0++] = 0;
            field435[var0++] = 0;
            field435[var0++] = 0;
            field435[var0++] = 0;
            field435[var0++] = 0;
            field435[var0++] = 0;
            field435[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field435[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(IIII)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field437 || arg1 >= field441) {
            return;
        }
        if (arg0 < field436) {
            arg2 -= field436 - arg0;
            arg0 = field436;
        }
        if (arg0 + arg2 > field433) {
            arg2 = field433 - arg0;
        }
        int var4 = field440 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field435[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(IIIIII)V")
    public static final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class257.method1800();
        int var18 = arg1 - class257.method1785();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class257.method1788(var19, var20, var21);
        class257.method1784(var23, var24, var25, var19, var20, var21, arg4);
        class257.method1788(var19, var21, var22);
        class257.method1784(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()V")
    public static void method163() {
        field435 = null;
        field438 = null;
        field434 = null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(IIII)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field440) {
            arg2 = field440;
        }
        if (arg3 > field439) {
            arg3 = field439;
        }
        field436 = arg0;
        field437 = arg1;
        field433 = arg2;
        field441 = arg3;
        method153();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V")
    public static final void method165(int[] arg0, int arg1, int arg2) {
        field435 = arg0;
        field440 = arg1;
        field439 = arg2;
        method164(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(IIIII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method161(arg0, arg1, arg2, arg4);
        method161(arg0, arg1 + arg3 - 1, arg2, arg4);
        method146(arg0, arg1, arg3, arg4);
        method146(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(IIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field436) {
            arg2 -= field436 - arg0;
            arg0 = field436;
        }
        if (arg1 < field437) {
            arg3 -= field437 - arg1;
            arg1 = field437;
        }
        if (arg0 + arg2 > field433) {
            arg2 = field433 - arg0;
        }
        if (arg1 + arg3 > field441) {
            arg3 = field441 - arg1;
        }
        int var5 = field440 - arg2;
        int var6 = field440 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field435[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(IIIII)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method145(arg0, arg1, arg2, arg3);
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
        if (var9 < field437) {
            var9 = field437;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field441) {
            var10 = field441;
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
            if (var30 < field436) {
                var30 = field436;
            }
            int var31 = arg0 + var13;
            if (var31 > field433) {
                var31 = field433;
            }
            int var32 = field440 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field435[var32] >> 16 & 0xFF) * var5;
                int var35 = (field435[var32] >> 8 & 0xFF) * var5;
                int var36 = (field435[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field435[var32++] = var37;
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
            if (var22 < field436) {
                var22 = field436;
            }
            int var23 = arg0 + var17;
            if (var23 > field433 - 1) {
                var23 = field433 - 1;
            }
            int var24 = field440 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field435[var24] >> 16 & 0xFF) * var5;
                int var27 = (field435[var24] >> 8 & 0xFF) * var5;
                int var28 = (field435[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field435[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }
}
