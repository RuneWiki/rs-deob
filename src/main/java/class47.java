import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class47 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[I")
    public static int[] field786;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[I")
    public static int[] field791;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
    public static int[] field793;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method286(arg0, arg1, arg2, arg4, arg5);
        method286(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method302(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method302(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    private static final void method282(int arg0, int arg1, int arg2) {
        if (arg0 >= field792 && arg1 >= field788 && arg0 < field789 && arg1 < field785) {
            field786[field790 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIIII)V")
    public static final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field792) {
            arg2 -= field792 - arg0;
            arg0 = field792;
        }
        if (arg1 < field788) {
            arg3 -= field788 - arg1;
            arg1 = field788;
        }
        if (arg0 + arg2 > field789) {
            arg2 = field789 - arg0;
        }
        if (arg1 + arg3 > field785) {
            arg3 = field785 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field790 - arg2;
        int var9 = field790 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field786[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field786[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IIIIII)V")
    public static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class223.method1436();
        int var18 = arg1 - class223.method1442();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class223.method1434(var19, var20, var21);
        class223.method1441(var23, var24, var25, var19, var20, var21, arg4);
        class223.method1434(var19, var21, var22);
        class223.method1441(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
    private static final void method285(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method282(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field788) {
            var4 = field788;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field785) {
            var5 = field785;
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
            if (var21 < field792) {
                var21 = field792;
            }
            int var22 = arg0 + var8;
            if (var22 > field789) {
                var22 = field789;
            }
            int var23 = field790 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field786[var23++] = arg3;
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
            if (var17 < field792) {
                var17 = field792;
            }
            int var18 = arg0 + var12;
            if (var18 > field789 - 1) {
                var18 = field789 - 1;
            }
            int var19 = field790 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field786[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
    private static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field788 || arg1 >= field785) {
            return;
        }
        if (arg0 < field792) {
            arg2 -= field792 - arg0;
            arg0 = field792;
        }
        if (arg0 + arg2 > field789) {
            arg2 = field789 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field790 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field786[var9] >> 16 & 0xFF) * var5;
            int var12 = (field786[var9] >> 8 & 0xFF) * var5;
            int var13 = (field786[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field786[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public static final void method287() {
        int var0 = 0;
        int var1 = field790 * field787 - 7;
        while (var0 < var1) {
            field786[var0++] = 0;
            field786[var0++] = 0;
            field786[var0++] = 0;
            field786[var0++] = 0;
            field786[var0++] = 0;
            field786[var0++] = 0;
            field786[var0++] = 0;
            field786[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field786[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIII)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method294(arg0, arg1, var5 + 1, arg4);
            } else {
                method294(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field792) {
                    var8 += (field792 - arg0) * var10;
                    arg0 = field792;
                }
                if (var11 >= field789) {
                    var11 = field789 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field788 && var12 < field785) {
                        field786[field790 * var12 + arg0] = arg4;
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
                if (arg1 < field788) {
                    var14 += (field788 - arg1) * var16;
                    arg1 = field788;
                }
                if (var17 >= field785) {
                    var17 = field785 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field792 && var18 < field789) {
                        field786[field790 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method304(arg0, arg1, var6 + 1, arg4);
        } else {
            method304(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([I[I)V")
    public static final void method289(int[] arg0, int[] arg1) {
        if (field785 - field788 != arg0.length || field785 - field788 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field793 = arg0;
        field791 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[I[I)V")
    public static final void method290(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field790 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field786[var7++] = arg2;
            }
            var5 += field790;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([III)V")
    public static final void method291(int[] arg0, int arg1, int arg2) {
        field786 = arg0;
        field790 = arg1;
        field787 = arg2;
        method297(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
    public static final void method292() {
        field793 = null;
        field791 = null;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
    public static final void method293() {
        field792 = 0;
        field788 = 0;
        field789 = field790;
        field785 = field787;
        method292();
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIII)V")
    public static final void method294(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field788 || arg1 >= field785) {
            return;
        }
        if (arg0 < field792) {
            arg2 -= field792 - arg0;
            arg0 = field792;
        }
        if (arg0 + arg2 > field789) {
            arg2 = field789 - arg0;
        }
        int var4 = field790 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field786[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IIII)V")
    public static final void method295(int arg0, int arg1, int arg2, int arg3) {
        if (field792 < arg0) {
            field792 = arg0;
        }
        if (field788 < arg1) {
            field788 = arg1;
        }
        if (field789 > arg2) {
            field789 = arg2;
        }
        if (field785 > arg3) {
            field785 = arg3;
        }
        method292();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([I)V")
    public static final void method296(int[] arg0) {
        arg0[0] = field792;
        arg0[1] = field788;
        arg0[2] = field789;
        arg0[3] = field785;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(IIII)V")
    public static final void method297(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field790) {
            arg2 = field790;
        }
        if (arg3 > field787) {
            arg3 = field787;
        }
        field792 = arg0;
        field788 = arg1;
        field789 = arg2;
        field785 = arg3;
        method292();
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IIIII)V")
    public static final void method298(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method294(arg0, arg1, arg2, arg4);
        method294(arg0, arg1 + arg3 - 1, arg2, arg4);
        method304(arg0, arg1, arg3, arg4);
        method304(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(IIIII)V")
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field792) {
            arg2 -= field792 - arg0;
            arg0 = field792;
        }
        if (arg1 < field788) {
            arg3 -= field788 - arg1;
            arg1 = field788;
        }
        if (arg0 + arg2 > field789) {
            arg2 = field789 - arg0;
        }
        if (arg1 + arg3 > field785) {
            arg3 = field785 - arg1;
        }
        int var5 = field790 - arg2;
        int var6 = field790 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field786[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()V")
    public static void method300() {
        field786 = null;
        field793 = null;
        field791 = null;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(IIIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method285(arg0, arg1, arg2, arg3);
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
        if (var9 < field788) {
            var9 = field788;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field785) {
            var10 = field785;
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
            if (var30 < field792) {
                var30 = field792;
            }
            int var31 = arg0 + var13;
            if (var31 > field789) {
                var31 = field789;
            }
            int var32 = field790 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field786[var32] >> 16 & 0xFF) * var5;
                int var35 = (field786[var32] >> 8 & 0xFF) * var5;
                int var36 = (field786[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field786[var32++] = var37;
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
            if (var22 < field792) {
                var22 = field792;
            }
            int var23 = arg0 + var17;
            if (var23 > field789 - 1) {
                var23 = field789 - 1;
            }
            int var24 = field790 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field786[var24] >> 16 & 0xFF) * var5;
                int var27 = (field786[var24] >> 8 & 0xFF) * var5;
                int var28 = (field786[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field786[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(IIIII)V")
    private static final void method302(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field792 || arg0 >= field789) {
            return;
        }
        if (arg1 < field788) {
            arg2 -= field788 - arg1;
            arg1 = field788;
        }
        if (arg1 + arg2 > field785) {
            arg2 = field785 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field790 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field786[var9] >> 16 & 0xFF) * var5;
            int var12 = (field786[var9] >> 8 & 0xFF) * var5;
            int var13 = (field786[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field786[var9] = var14;
            var9 += field790;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "([I)V")
    public static final void method303(int[] arg0) {
        field792 = arg0[0];
        field788 = arg0[1];
        field789 = arg0[2];
        field785 = arg0[3];
        method292();
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(IIII)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field792 || arg0 >= field789) {
            return;
        }
        if (arg1 < field788) {
            arg2 -= field788 - arg1;
            arg1 = field788;
        }
        if (arg1 + arg2 > field785) {
            arg2 = field785 - arg1;
        }
        int var4 = field790 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field786[field790 * var5 + var4] = arg3;
        }
    }
}
